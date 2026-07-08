package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes26.dex */
public final class SimpleMusic {

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
