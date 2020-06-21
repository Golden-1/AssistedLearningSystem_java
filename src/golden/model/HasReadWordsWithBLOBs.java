package golden.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class HasReadWordsWithBLOBs extends HasReadWords {
    private String words;

    private String readWordList;

    public Object getWords() {//java类间调用传jsonobject或者jsonarray似乎会报错，以后有机会看看原因
        JSONArray object =JSON.parseArray(words);
        return object;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getReadWordList() {
        return readWordList;
    }

    public void setReadWordList(String readWordList) {
        this.readWordList = readWordList;
    }
}