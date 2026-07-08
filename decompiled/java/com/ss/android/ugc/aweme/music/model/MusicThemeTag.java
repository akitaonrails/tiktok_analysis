package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicThemeTag implements Serializable {

    @C09CT("tag_key")
    public final String key;

    @C09CT("tag_title")
    public final String name;

    public MusicThemeTag() {
        this(null, null);
    }

    public MusicThemeTag(String str, String str2) {
        this.key = str;
        this.name = str2;
    }
}
