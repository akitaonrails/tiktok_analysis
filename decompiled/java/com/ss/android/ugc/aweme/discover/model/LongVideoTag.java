package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class LongVideoTag implements Serializable {

    @C09CT("tag_word")
    public String tagWord = "";

    @C09CT("tag_bg_img")
    public String tagBgImg = "";

    @C09CT("tag_word_color")
    public String tagWordColor = "";

    public final String getTagBgImg() {
        return this.tagBgImg;
    }

    public final String getTagWord() {
        return this.tagWord;
    }

    public final String getTagWordColor() {
        return this.tagWordColor;
    }

    public final void setTagBgImg(String str) {
        this.tagBgImg = str;
    }

    public final void setTagWord(String str) {
        this.tagWord = str;
    }

    public final void setTagWordColor(String str) {
        this.tagWordColor = str;
    }
}
