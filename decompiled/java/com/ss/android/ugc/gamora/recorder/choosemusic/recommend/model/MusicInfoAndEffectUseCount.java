package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes26.dex */
public final class MusicInfoAndEffectUseCount {

    @C09CT("music_id")
    public final long musicId;

    @C09CT("music_info")
    public final Music musicInfo;

    @C09CT("effect_use_count")
    public final long useCount;

    public MusicInfoAndEffectUseCount(long j, long j2, Music music) {
        this.musicId = j;
        this.useCount = j2;
        this.musicInfo = music;
    }
}
