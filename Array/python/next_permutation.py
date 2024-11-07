from typing import *
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        T O(N) + S O(1)
        """
        def rev(arr , i , j):
            while i < j:
                arr[i] , arr[j] = arr[j] , arr[i]
                i += 1
                j -= 1
            return arr 
        idx = -1
        n = len(nums)
        for i in range(n - 2 , -1 , -1):
            if nums[i] < nums[i+1]:
                idx = i
                break
        if idx == -1 : 
            rev(nums , 0 , n - 1)
            return nums
        for i in range(n - 1 , idx , -1):
            if nums[i] > nums[idx]:
                nums[i] , nums[idx] = nums[idx] , nums[i]
                break
        return rev(nums , idx + 1 , n - 1)
