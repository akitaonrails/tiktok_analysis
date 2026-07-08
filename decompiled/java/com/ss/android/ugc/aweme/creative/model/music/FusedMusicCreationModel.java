package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FusedMusicCreationModel implements Serializable {

    @C040H
    @C09CT("end_time_in_ms")
    public final Integer endTime;

    @C040H
    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C040H
    @C09CT("index")
    public final Integer index;

    @C040H
    @C09CT("is_main_song")
    public final boolean isMainSong;

    @C040H
    @C09CT("play_start_time_in_ms")
    public final Integer playStartTime;

    @C040H
    @C09CT("start_time_in_ms")
    public final Integer startTime;

    @C040H
    @C09CT("volume")
    public final Double volume;

    public FusedMusicCreationModel() {
        this(null, null, null, null, null, false, null);
    }

    public final boolean isMainSong() {
        return this.isMainSong;
    }

    public FusedMusicCreationModel(Long l, Integer num, Integer num2, Integer num3, Integer num4, boolean z, Double d) {
        this.id = l;
        this.index = num;
        this.startTime = num2;
        this.endTime = num3;
        this.playStartTime = num4;
        this.isMainSong = z;
        this.volume = d;
    }
}
