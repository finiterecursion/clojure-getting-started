(defn foo
  "I don't do a whole lot."
  [args]
  (spit "hello.txt" (with-out-str (println
				  			"Filename: " 
				  			(first args) 
				  			"\nArguments: " 
				  			(rest args) 
				  			"\nHello, World!"
  						))
  )
 )

(foo *command-line-args*)
