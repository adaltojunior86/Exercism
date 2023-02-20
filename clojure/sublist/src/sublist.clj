(ns sublist
  (:require [clojure.string :as string]))

(defn isSuperlist [list1 list2]
  (string/includes?  (clojure.string/join ", " list1) (string/join ", " list2)))

(defn isSublist [list1 list2]
  (string/includes? (clojure.string/join ", " list2) (string/join ", " list1)))

(defn classify [list1 list2] ;; <- arglist goes here
  (cond
    (= list1 list2) :equal
    (isSuperlist list1 list2) :superlist
    (isSublist list1 list2) :sublist
    :else :unequal))
