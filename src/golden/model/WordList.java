package golden.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;


public class WordList {
    private Integer wordId;

    private Object sentence;

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

    public Object getSentence() {//先将对象转换为string，再转为jsonarray，实现返回前端的json中此变量类型为数组
    	JSONArray object = JSON.parseArray((String) sentence);
        return object;
    }

    public void setSentence(Object sentence) {
        this.sentence = sentence;
    }
}