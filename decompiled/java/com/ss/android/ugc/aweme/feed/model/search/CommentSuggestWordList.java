package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentSuggestWordList implements Serializable {

    @C09CT("feed_query_enable_videosug")
    public boolean feedQueryEnableVideoSug;

    @C09CT("suggest_words")
    public List<SuggestWordStruct> suggestWords;

    public final String jsonStringToServer() {
        Object scene;
        List<WordStruct> words;
        String word;
        List<SuggestWordStruct> list = this.suggestWords;
        boolean z = false;
        if (list != null && list.isEmpty()) {
            z = true;
        }
        if (z) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<SuggestWordStruct> list2 = this.suggestWords;
        if (list2 != null) {
            for (SuggestWordStruct suggestWordStruct : list2) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                if (suggestWordStruct != null && (words = suggestWordStruct.getWords()) != null) {
                    for (WordStruct wordStruct : words) {
                        JSONObject jSONObject3 = new JSONObject();
                        if (wordStruct == null || (word = wordStruct.getWord()) == null) {
                            word = "";
                        }
                        jSONObject3.put("word", word);
                        jSONArray2.put(jSONObject3);
                    }
                }
                jSONObject2.put("suggestWord", jSONArray2);
                if (suggestWordStruct == null || (scene = suggestWordStruct.getScene()) == null) {
                    scene = "";
                }
                jSONObject2.put(Scene.SCENE_SERVICE, scene);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("suggestWordsList", jSONArray);
        return C786410Ut5.J3(jSONObject);
    }

    public final boolean getFeedQueryEnableVideoSug() {
        return this.feedQueryEnableVideoSug;
    }

    public final List<SuggestWordStruct> getSuggestWords() {
        return this.suggestWords;
    }

    public final void setFeedQueryEnableVideoSug(boolean z) {
        this.feedQueryEnableVideoSug = z;
    }

    public final void setSuggestWords(List<SuggestWordStruct> list) {
        this.suggestWords = list;
    }
}
