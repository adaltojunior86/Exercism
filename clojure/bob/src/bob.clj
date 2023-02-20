(ns bob
  (:require [clojure.string :as string]))

(defn is-yell-at-him
  [text]
  (re-matches #"^(?=.*[A-Z])[^a-z]+" text))

(defn is-asking
  [text]
  (string/ends-with? (string/trim text) "?"))

(defn asking-and-yelling-at-him
  [text]
  (and (is-asking text) (is-yell-at-him text)))

(defn response-for [text] ;; <- arglist goes here
  ;; your code goes here
  (cond
    (asking-and-yelling-at-him text) "Calm down, I know what I'm doing!"
    (is-asking text) "Sure."
    (is-yell-at-him text) "Whoa, chill out!"
    (string/blank? text) "Fine. Be that way!"
    :else "Whatever."))
