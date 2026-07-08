package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.RichSugInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class WordStruct implements Serializable {

    @C09CT("penetrate_info")
    public String penetrateInfo;

    @C09CT("promotion_info")
    public PromotionInfo promoteInfo;

    @C09CT("rich_sug_info")
    public RichSugInfo richSugInfo;

    @C09CT("word_record")
    public Word wordRecord;

    @C09CT("words_type")
    public String wordsType;

    @C09CT("word")
    public String word = "";

    @C09CT("word_id")
    public String wordId = "";

    @C09CT("info")
    public String info = "";

    public final boolean hasRecommendAction() {
        String str;
        RichSugInfo richSugInfo = this.richSugInfo;
        return (richSugInfo == null || (str = richSugInfo.sugReasonType) == null || str.length() <= 0) ? false : true;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getPenetrateInfo() {
        return this.penetrateInfo;
    }

    public final PromotionInfo getPromoteInfo() {
        return this.promoteInfo;
    }

    public final RichSugInfo getRichSugInfo() {
        return this.richSugInfo;
    }

    public final String getWord() {
        return this.word;
    }

    public final String getWordId() {
        return this.wordId;
    }

    public final Word getWordRecord() {
        return this.wordRecord;
    }

    public final String getWordsType() {
        return this.wordsType;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setPenetrateInfo(String str) {
        this.penetrateInfo = str;
    }

    public final void setPromoteInfo(PromotionInfo promotionInfo) {
        this.promoteInfo = promotionInfo;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordId(String str) {
        this.wordId = str;
    }

    public final void setWordsType(String str) {
        this.wordsType = str;
    }
}
