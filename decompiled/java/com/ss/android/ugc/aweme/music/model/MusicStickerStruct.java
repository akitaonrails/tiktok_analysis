package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicStickerStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("artist_name")
    public String artistName;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("is_pgc")
    public Boolean isPGC;

    @C09CT("music_id")
    public String musicId;

    @C09CT("music_sticker_from")
    public String musicStickerFrom;

    @C09CT("sticker_style")
    public int stickerStyle;

    @C09CT("title")
    public String title;

    public static final class Companion {
    }

    public MusicStickerStruct() {
        this(null, null, null, null, null, 1, null);
    }

    public final MusicStickerStruct copy(String str, String str2, String str3, UrlModel urlModel, Boolean bool, int i, String str4) {
        return new MusicStickerStruct(str, str2, str3, urlModel, bool, i, str4);
    }

    public final Boolean isPGC() {
        return this.isPGC;
    }

    public MusicStickerStruct(String str, String str2, String str3, UrlModel urlModel, Boolean bool, int i, String str4) {
        this.musicId = str;
        this.artistName = str2;
        this.title = str3;
        this.cover = urlModel;
        this.isPGC = bool;
        this.stickerStyle = i;
        this.musicStickerFrom = str4;
    }
}
