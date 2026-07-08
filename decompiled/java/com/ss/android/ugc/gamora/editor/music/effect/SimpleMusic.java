package com.ss.android.ugc.gamora.editor.music.effect;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleMusic {
    public static final int $stable = 8;

    @C09CT("music_info")
    public Music musicModel;

    public SimpleMusic() {
        this(null);
    }

    public SimpleMusic(Music music) {
        this.musicModel = music;
    }

    public final void setMusicModel(Music music) {
        this.musicModel = music;
    }
}
