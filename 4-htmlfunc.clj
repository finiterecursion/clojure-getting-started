(use 'clojure.xml)
(defn generate-page [filename title content]
(spit filename
  (with-out-str 
    (emit-element 
	  {:tag :html :content
	  	[{:tag :body :content
	  	  [{:tag :h1 :attrs {:style "color:red"} :content[title]} 
	  	   {:tag :div :attrs {:style "text-align:center"} :content[content]} ]}]}))))

(generate-page "about.html" "About Me" "There's nothing to say.")
(generate-page "contact.html" "Contact Me" "Here's my email and phone. Spam me.")
(generate-page "faq.html" "FAQ" "Why was six afraid of seven? It wasn't. Numbers are not sentient and thus incapable of feeling fear.")
(generate-page "index.html" "Index" "Welcome to my homepage")