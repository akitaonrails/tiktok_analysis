package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicPromoTagInfo implements Serializable {

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("show_music_title")
    public Boolean showMusicTitle;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public Integer type;

    public MusicPromoTagInfo() {
        this(0, null, null, null);
    }

    public MusicPromoTagInfo(Integer num, String str, Boolean bool, String str2) {
        this.type = num;
        this.text = str;
        this.showMusicTitle = bool;
        this.schemaUrl = str2;
    }
}
