package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class Word implements Serializable {

    @C09CT("word")
    public final String word;

    @C09CT("word_id")
    public final String wordId;

    public Word() {
        this(null, null);
    }

    public Word(String str, String str2) {
        this.word = str;
        this.wordId = str2;
    }
}
