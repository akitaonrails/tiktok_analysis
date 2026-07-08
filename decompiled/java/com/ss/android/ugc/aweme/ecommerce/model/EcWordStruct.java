package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class EcWordStruct implements Serializable {

    @C09CT("word")
    public String word = "";

    @C09CT("word_id")
    public String wordId = "";

    @C09CT("info")
    public String info = "";

    public final String getInfo() {
        return this.info;
    }

    public final String getWord() {
        return this.word;
    }

    public final String getWordId() {
        return this.wordId;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordId(String str) {
        this.wordId = str;
    }
}
