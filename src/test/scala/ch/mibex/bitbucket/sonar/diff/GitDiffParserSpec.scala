  private def readFile(path: String) =
    scala.io.Source.fromInputStream(getClass.getResourceAsStream(path)).mkString

      allDiffs must succeedOn(readFile("/diffs/2diffs-example.diff"))
      allDiffs must succeedOn(readFile("/diffs/5diffs-example.diff"))
      allDiffs must succeedOn(readFile("/diffs/u0085-char-issue.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-no-newline-at-eof.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong1.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong3.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#8-diff-wrong4.txt"))
      allDiffs must succeedOn(readFile("/diffs/github#10-no-index.txt"))
    
    "Github issue #10 carriage return issue" in {
      allDiffs must succeedOn(readFile("/diffs/diff_pr_153_ko.diff.txt"))
    }
    
      allDiffs must succeedOn(readFile("/diffs/failing-diff.txt")).withResult(
      allDiffs must succeedOn(readFile("/diffs/PR140.diff")).withResult(