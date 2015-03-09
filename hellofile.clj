(defn foo
  "I don't do a whole lot."
  [args]
  (spit "hellofile.txt" (with-out-str (println
				  			"Filename: " 
				  			(first args) 
				  			"\nArguments: " 
				  			(rest args) 
				  			"\nHello, World!"
  						))
  )
 )

(foo *command-line-args*)
