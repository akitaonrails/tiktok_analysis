package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicResourceBitStructMargin implements Serializable {

    @C09CT("end")
    public final String end;

    @C09CT("middle")
    public final String middle;

    @C09CT("start")
    public final String start;

    public MusicResourceBitStructMargin() {
        this(CardStruct.IStatusCode.DEFAULT, "8", "12");
    }

    public MusicResourceBitStructMargin(String str, String str2, String str3) {
        this.start = str;
        this.middle = str2;
        this.end = str3;
    }
}
