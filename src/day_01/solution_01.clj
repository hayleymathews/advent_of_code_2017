;;


(defn captcha-1 [numbers]
  (let [first-val   (first numbers)]
    (->> numbers
         (partition 2 1 [first-val])
         (filter #(= (first %) (second %)))
         (map first)
         (reduce +))))

(defn captcha-2 [numbers]
  (let [split-numbers   (split-at (/ (count numbers) 2) numbers)
        front-half      (first split-numbers)
        back-half       (last split-numbers)
        mixed-numbers   (interleave front-half back-half)]
    (->> mixed-numbers
         (partition 2)
         (filter #(= (first %) (second %)))
         (flatten)
         (reduce +))))
