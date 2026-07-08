package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TakoSugWordList implements Serializable {

    @C09CT("ext_pass")
    public String extPass;

    @C09CT("word")
    public String word;

    public TakoSugWordList() {
        this("", "");
    }

    public final void setExtPass(String str) {
        this.extPass = str;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public TakoSugWordList(String str, String str2) {
        this.word = str;
        this.extPass = str2;
    }
}
