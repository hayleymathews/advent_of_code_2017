"""
"""
from itertools import combinations


def make_rows(num_str):
    return [[int(val) for val in row.split('\t')]
            for row in num_str.split('\n')[1:]]


def checksum_1(num_str):
    return sum(max(row) - min(row) for row in make_rows(num_str))


def checksum_2(num_str):
    return (sum(b//a for row in make_rows(num_str)
                for a, b in combinations(sorted(row), 2) if b % a == 0))
