package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes11.dex */
public class MusicSearchCorrectInfo extends MusicModel {
    public static final long serialVersionUID = 1;

    @C09CT("corrected_query")
    public String correctedKeyword;

    @C09CT("correct_level")
    public int correctedLevel;

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }
}
