(ns assignment2.core
  (:gen-class))

(use '[clojure.string :only [index-of]])

(defn read-map-from-file
  "Takes a file name and reads in a map. Returns a newly created state with a zero length path"
  [file]
  
  {:map (-> file slurp clojure.string/split-lines) :path []}
  )
(read-map-from-file "/home/sam/Documents/temp/map1")

(defn print-state
  "Takes a state and prints it to the screen"
  [state]
  (loop [remaining (:map state)]
    (if (empty? remaining)
      nil
      (do (println(first remaining))
      (recur (rest remaining)))
      )
    )
  )

(print-state (read-map-from-file "/home/sam/Documents/temp/map1"))
(defn position
  "Takes state and returns the corrdinates of the ship on the map"
  [state]
  )

(defn start
  "Takes a state and returns the coordinates of starting port marked on map"
  [state]
  (loop [remaining (:map state)
         index-x 0
         ]
    (if (.contains(first remaining) "S")
      [(index-of (first remaining) "S") index-x]
      (recur (rest remaining)
             (inc index-x)))))


(start (read-map-from-file "/home/sam/Documents/temp/map1"))


(defn goal
  "Takes a state and returns returns the coordinates of the destination port marked on the map"
  [state]
  (loop [remaining (:map state)
         index-x 0
         ]
    (if (.contains(first remaining) "G")
      [(index-of (first remaining) "G") index-x]
      (recur (rest remaining)
           (inc index-x))))
  )


(goal (read-map-from-file "/home/sam/Documents/temp/map1"))

(defn cost
  "Takes a state and returns the cost of the state(length of the path)"
  [state]
  )

(defn heuristic
  "Takes a state and computes its heurstic vaule using  the Euclidean distance metric "
  [state]
  )

(defn expand
  "Takes a state and returns a list of new states obtainined by extending the length of the givens states path by one in all vail
  directions "
  [])


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
