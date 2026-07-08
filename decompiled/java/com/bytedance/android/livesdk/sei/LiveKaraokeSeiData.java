package com.bytedance.android.livesdk.sei;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveKaraokeSeiData {

    @C09CT("lyric_status")
    public final Integer lyricStatus;

    @C09CT("tt_ntp")
    public final Integer ntp;

    @C09CT("play_progress")
    public final Long playProgress;

    @C09CT("play_status")
    public final Integer playStatus;

    @C09CT("room_id")
    public final Long roomId;

    @C09CT("singer_id")
    public final Long singerUid;

    @C09CT("song_id")
    public final Long songId;

    @C09CT("ts")
    public final Long timestamp;

    public LiveKaraokeSeiData() {
        this(null, null, null, null, null, null, null, null);
    }

    public LiveKaraokeSeiData(Long l, Long l2, Integer num, Integer num2, Long l3, Long l4, Long l5, Integer num3) {
        this.singerUid = l;
        this.roomId = l2;
        this.playStatus = num;
        this.lyricStatus = num2;
        this.songId = l3;
        this.playProgress = l4;
        this.timestamp = l5;
        this.ntp = num3;
    }
}
