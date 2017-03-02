using System;

namespace RefactoringWorkshop.Dispensable.Comments
{
    public class Matcher
    {
        public bool Match(int[] expected, int[] actual, int clipLimit, int delta) {
            // Clip "too-large" values
            for (int i1 = 0; i1 < actual.Length; i1++) {
                if (actual[i1] > clipLimit) {
                    actual[i1] = clipLimit;
                }
            }

            // Check for length differences
            if (actual.Length != expected.Length) {
                return false;
            }

            // Check that each entry within expected +/- delta
            for (int i = 0; i < actual.Length; i++) {
                if (Math.Abs(expected[i] - actual[i]) > delta) {
                    return false;
                }
            }

            return true;
        }
    }
}