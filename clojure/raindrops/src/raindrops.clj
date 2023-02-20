(ns raindrops)

(defn parseIfNecessary [message, value]
  (if (empty? message) (str value) message))

(defn isMultipleOfThree [value]
  (if (= (mod value 3) 0) "Pling" ""))

(defn isMultipleOfFive [message, value]
  (if (= (mod value 5) 0) (str message "Plang") message))

(defn isMultipleOfSeven [message, value]
  (if (= (mod value 7) 0) (str message "Plong") message))

(defn convert
  [value]
  (-> (isMultipleOfThree value)
      (isMultipleOfFive value)
      (isMultipleOfSeven value)
      (parseIfNecessary value)))
