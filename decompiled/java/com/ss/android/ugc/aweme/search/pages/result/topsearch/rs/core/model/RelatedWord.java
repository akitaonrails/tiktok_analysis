package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class RelatedWord {

    @C09CT("related_word_bg_img")
    public final String backgroundImageUrl;

    @C09CT("item_cover_list")
    public final List<UrlModel> itemCoverImageUrl;

    @C09CT("penetrate_info")
    public final String penetrateInfo;

    @C09CT("related_word")
    public final String text;

    @C09CT("word_record")
    public final Word wordRecord;

    @C09CT("word_type")
    public final String wordType;

    public RelatedWord() {
        this("", null, "", "", null, null);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedWord(String str, Word word, String str2, String str3, String str4, List<? extends UrlModel> list) {
        this.text = str;
        this.wordRecord = word;
        this.backgroundImageUrl = str2;
        this.wordType = str3;
        this.penetrateInfo = str4;
        this.itemCoverImageUrl = list;
    }
}
