(ns primes.core
  (:gen-class))


(defn composite? [n]
  "Checks if a number n is a composite number."
  (if (= 0 (mod n 2))
    true
    (not (empty? (filter (fn [k] (= n k)) (for [i (range 3 (inc n))
                                                j (range 3 (inc n))]
                                            (* i j)))))))

(defn primes [n]
  "Generate all primes up to and including n."
  (cons 2 (remove composite? (range 3 (inc n)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (primes 100)))
