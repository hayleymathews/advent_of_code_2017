"""
"""
from itertools import tee, izip_longest, islice


def captcha_1(num):
    num_str = str(num)
    prev_iter, curr_iter = tee((int(x) for x in num_str))
    first_val = next(curr_iter)
    return sum(curr_val for (prev_val, curr_val)
               in izip_longest(prev_iter, curr_iter, fillvalue=first_val)
               if curr_val == prev_val)


def captcha_2(num):
    num_str = str(num)
    num_len = len(num_str)/2
    prev_iter, curr_iter = tee((int(x) for x in num_str))
    next(islice(curr_iter, num_len - 1, None))
    return sum(curr_val + prev_val for (prev_val, curr_val)
               in zip(prev_iter, curr_iter)
               if curr_val == prev_val)
