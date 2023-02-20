(ns interest-is-interesting)

(defn interest-rate
  "TODO: add docstring"
  [balance]
  (cond
    (>= balance 5000.000000M) 2.475
    (>= balance 1000.000000M) 1.621
    (< balance 0.0000M) -3.213
    (< balance 1000.000000M) 0.5))

(defn calculate-interest
  [balance]
  (* balance (bigdec (/ (interest-rate balance) 100))))

(defn annual-balance-update
  "TODO: add docstring"
  [balance]
  (if (pos? balance)
    (+ balance (calculate-interest balance))
    (- balance (calculate-interest balance))))

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage]
  (if (neg? balance)
    0
    (int (* 2 balance (/ tax-free-percentage 100)))))