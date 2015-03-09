(use 'clojure.xml)
(spit "hello.xml" (with-out-str (emit {:tag :parent :attrs {:value "Hello"} 
								:content[
	  								{:tag :child :attrs {:value "World"}}
	  								{:tag :child :attrs {:value "Clojure"}}
								]})))