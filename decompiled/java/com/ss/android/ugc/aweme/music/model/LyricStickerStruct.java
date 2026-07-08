package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LyricStickerStruct implements Serializable {

    @C09CT("music_id")
    public String musicId;

    @C09CT("sticker_style")
    public Integer stickerStyle;

    public LyricStickerStruct() {
        this(null, null);
    }

    public LyricStickerStruct(String str, Integer num) {
        this.musicId = str;
        this.stickerStyle = num;
    }
}
