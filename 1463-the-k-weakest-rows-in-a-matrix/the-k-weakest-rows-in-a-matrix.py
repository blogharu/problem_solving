class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        return [i for _, i in sorted([(sum(row), i) for i, row in enumerate(mat)])[:k]]
        