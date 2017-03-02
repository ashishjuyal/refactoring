using NUnit.Framework;
using RefactoringWorkshop.Dispensable.Comments;

namespace Test.Dispensable.Comments
{
    public class MatcherTest
    {
        [Test]
        public void test_match() {
            var matcher = new Matcher();

            var expected = new [] {10, 50, 30, 98};
            var clipLimit = 100;
            const int delta = 5;

            var actual = new[] {12, 55, 25, 110};

            Assert.True(matcher.Match(expected, actual, clipLimit, delta));

            actual = new [] {10, 60, 30, 98};
            Assert.True(!matcher.Match(expected, actual, clipLimit, delta));

            actual = new [] {10, 50, 30};
            Assert.True(!matcher.Match(expected, actual, clipLimit, delta));
        }

    }
}