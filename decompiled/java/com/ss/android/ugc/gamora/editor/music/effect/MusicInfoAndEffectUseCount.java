package com.ss.android.ugc.gamora.editor.music.effect;

import X.C09CT;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: loaded from: classes26.dex */
public final class MusicInfoAndEffectUseCount {
    public static final int $stable = 8;

    @C09CT("music_id")
    public final Long musicId;

    @C09CT("music_info")
    public final Music musicInfo;

    @C09CT("effect_use_count")
    public final Long useCount;

    public MusicInfoAndEffectUseCount() {
        this(-1L, 0L, null);
    }

    public MusicInfoAndEffectUseCount(Long l, Long l2, Music music) {
        this.musicId = l;
        this.useCount = l2;
        this.musicInfo = music;
    }
}
