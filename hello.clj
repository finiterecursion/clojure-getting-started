(defn foo
  "I don't do a whole lot."
  [args]
  (println "Filename: " (first args) "\nArguments: " (rest args) "\nHello, world!"))

(foo *command-line-args*)
