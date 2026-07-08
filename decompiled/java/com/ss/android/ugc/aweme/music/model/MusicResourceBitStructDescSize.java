package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicResourceBitStructDescSize implements Serializable {

    @C09CT("max_size")
    public final String maxSize;

    @C09CT("min_size")
    public final String minSize;

    public MusicResourceBitStructDescSize() {
        this("15", "12");
    }

    public MusicResourceBitStructDescSize(String str, String str2) {
        this.maxSize = str;
        this.minSize = str2;
    }
}
