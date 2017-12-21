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
        mixed-numbers   (interleave (first split-numbers)  (last split-numbers)]
    (->> mixed-numbers
         (partition 2)
         (filter #(= (first %) (second %)))
         (flatten)
         (reduce +))))
