package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes19.dex */
public final class UniqueCardParams {
    public static final TypeAdapter ADAPTER = new UniqueCardParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("check_linked_user_interval")
    public long checkLinkedUserInterval;

    @C09CT("check_link_mic_room_interval")
    public long checkLinkmicRoomInterval;

    @C09CT("check_sei_area_interval")
    public long checkSeiAreaInterval;

    @C09CT("check_sei_area_percent")
    public float checkSeiAreaPercent;

    @C09CT("first_frame_hide_delay")
    public long firstFrameHideDelay;

    @C09CT("radio_mode_enable")
    public boolean radioModeEnable;

    @C09CT("update_volume_interval")
    public long updateVolumeInterval;

    public UniqueCardParams() {
        this(300L, 10000L, 0.52f, Mp4ScreenVideoLoadTimeout.CONTROL, 200L, true, 2000L);
    }

    public UniqueCardParams(long j, long j2, float f, long j3, long j4, boolean z, long j5) {
        this.checkLinkmicRoomInterval = j;
        this.checkSeiAreaInterval = j2;
        this.checkSeiAreaPercent = f;
        this.checkLinkedUserInterval = j3;
        this.updateVolumeInterval = j4;
        this.radioModeEnable = z;
        this.firstFrameHideDelay = j5;
    }
}
