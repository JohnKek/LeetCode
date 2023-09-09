package median;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Integer> stream = Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed()).sorted().toList();
            if ((nums1.length + nums2.length) % 2 != 0) {
                return (double) stream.get(((nums1.length + nums2.length) / 2));
            } else
                return (double) (stream.get(((nums1.length + nums2.length) / 2)) + stream.get(((nums1.length + nums2.length) / 2) - 1)) / 2;


        }
    }

