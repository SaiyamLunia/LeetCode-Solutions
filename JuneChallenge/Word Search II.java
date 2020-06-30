class Solution {
   class Trie {
		Trie array[] = new Trie[26];
		String word = null; // the word current trie corresponds to
	}
	
	int array[][] = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	
	public List<String> findWords(char[][] board, String[] words) {
		List<String> resultList = new ArrayList<String>();
		Trie trie = new Trie();
		for(int i = 0; i < words.length; i++)  // traverse words in dictionary to build a trie
			build(words[i], trie);
		for(int i = 0 ; i < board.length; i++)
			for(int j = 0; j < board[0].length; j++)
				dfs(board, i, j, resultList, trie);
		return resultList;
	}

	public void build(String word, Trie trie) {
		char wordArray[] = word.toCharArray();
		for(int i = 0; i < wordArray.length; i++) {
			if( trie.array[wordArray[i] - 'a'] == null )
				trie.array[wordArray[i] - 'a'] = new Trie();
			trie = trie.array[wordArray[i] - 'a'];
		}
		trie.word = word;
	}

	public void dfs(char[][] board, int r, int c, List<String> resultList, Trie trie) {
		if( trie.word != null ) {
			resultList.add(trie.word);
			trie.word = null; // remove duplicate element
		}
		if( r >= 0 && c >= 0 && r < board.length && c < board[0].length && 
				board[r][c] != '1' && trie.array[board[r][c] - 'a'] != null ) {
			char s = board[r][c];
			board[r][c] = '1';
			for(int i = 0; i < array.length; i++)
				dfs(board, r + array[i][0], c + array[i][1], resultList, trie.array[s - 'a']);
			board[r][c] = s;
		}
	}
}