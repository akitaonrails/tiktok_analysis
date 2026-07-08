package com.ss.android.ugc.aweme.creative.model.forward;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class ForwardMusic implements Serializable {

    @C09CT("musicId")
    public final String musicId;

    @C09CT("music_volume")
    public final float musicVolume;

    @C09CT("origin_music")
    public final Music originMusic;

    public ForwardMusic() {
        this(null, 1.0f, null);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final float getMusicVolume() {
        return this.musicVolume;
    }

    public final Music getOriginMusic() {
        return this.originMusic;
    }

    public ForwardMusic(String str, float f, Music music) {
        this.musicId = str;
        this.musicVolume = f;
        this.originMusic = music;
    }
}
