package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class HotSearchInfoStruct implements Serializable {

    @C09CT("ailab_extra")
    public String aiLabExtra;

    @C09CT("biz_extra")
    public String bizExtra;

    @C09CT("rec_extra")
    public String recExtra;

    @C09CT("sentence")
    public String sentence;

    public String getAiLabExtra() {
        return this.aiLabExtra;
    }

    public String getBizExtra() {
        return this.bizExtra;
    }

    public String getRecExtra() {
        return this.recExtra;
    }

    public String getSentence() {
        return this.sentence;
    }

    public void setAiLabExtra(String str) {
        this.aiLabExtra = str;
    }

    public void setBizExtra(String str) {
        this.bizExtra = str;
    }

    public void setRecExtra(String str) {
        this.recExtra = str;
    }

    public void setSentence(String str) {
        this.sentence = str;
    }
}
