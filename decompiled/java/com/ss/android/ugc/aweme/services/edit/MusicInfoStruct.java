package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes6.dex */
public final class MusicInfoStruct {

    @C09CT("music_end_time_in_ms")
    public final Integer musicEndTimeInMs;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_is_main_song")
    public final Boolean musicIsMainSong;

    @C09CT("music_play_start_time_in_ms")
    public final Integer musicPlayStartTimeInMs;

    @C09CT("music_position_index")
    public Integer musicPositionIndex;

    @C09CT("music_start_time_in_ms")
    public final Integer musicStartTimeInMs;

    @C09CT("music_url")
    public final String musicUrl;

    @C09CT("music_volume")
    public final Double musicVolume;

    public MusicInfoStruct() {
        this(null, null, null, null, null, null, null, null);
    }

    public final void setMusicPositionIndex(Integer num) {
        this.musicPositionIndex = num;
    }

    public MusicInfoStruct(String str, String str2, Integer num, Double d, Integer num2, Integer num3, Integer num4, Boolean bool) {
        this.musicId = str;
        this.musicUrl = str2;
        this.musicPositionIndex = num;
        this.musicVolume = d;
        this.musicStartTimeInMs = num2;
        this.musicEndTimeInMs = num3;
        this.musicPlayStartTimeInMs = num4;
        this.musicIsMainSong = bool;
    }
}
