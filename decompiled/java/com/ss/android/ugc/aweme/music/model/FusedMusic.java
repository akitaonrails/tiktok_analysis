package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FusedMusic implements Serializable {

    @C09CT("end_time_in_ms")
    public long endTimeInMs;

    @C09CT("index")
    public int index;

    @C09CT("is_main_song")
    public boolean isMainSong;

    @C09CT("music_info")
    public Music music;

    @C09CT("play_start_time_in_ms")
    public long playStartTimeInMs;

    @C09CT("start_time_in_ms")
    public long startTimeInMs;

    @C09CT("volume")
    public Double volume;

    public FusedMusic() {
        this(-1, 0L, 0L, null, 0L, false, null);
    }

    public final boolean isMainSong() {
        return this.isMainSong;
    }

    public FusedMusic(int i, long j, long j2, Music music, long j3, boolean z, Double d) {
        this.index = i;
        this.startTimeInMs = j;
        this.endTimeInMs = j2;
        this.music = music;
        this.playStartTimeInMs = j3;
        this.isMainSong = z;
        this.volume = d;
    }
}
