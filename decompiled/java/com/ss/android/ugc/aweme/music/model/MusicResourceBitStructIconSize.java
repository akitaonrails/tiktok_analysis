package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicResourceBitStructIconSize implements Serializable {

    @C09CT("height")
    public final String height;

    @C09CT("width")
    public final String width;

    public MusicResourceBitStructIconSize() {
        this("28", "28");
    }

    public MusicResourceBitStructIconSize(String str, String str2) {
        this.width = str;
        this.height = str2;
    }
}
