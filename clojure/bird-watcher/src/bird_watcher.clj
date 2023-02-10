(ns bird-watcher)

(def last-week [0 2 5 3 7 8 4])
(def odd-pattern [1 0 1 0 1 0 1])
(defn chek-busy-day [value]
  (>= value 5))

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (assoc birds (- (count birds) 1) (+ (today birds) 1)))

(defn day-without-birds? [birds]
  (if (some zero? birds) true false))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
  (count (filter chek-busy-day birds)))

(defn odd-week? [birds]
  (if (= birds odd-pattern) true false))
