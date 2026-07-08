package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubWaveInfoCommon {

    @C09CT("end_time")
    public long endTime;

    @C09CT("start_time")
    public long startTime;

    @C09CT("sub_wave_settings")
    public AnchorSubWaveCurrentSettings subWaveSettings;

    @C09CT("total_sub_count")
    public long totalSubCount;

    @C09CT("wave_open_record_id")
    public long waveOpenRecordId;

    @C09CT("wave_status")
    public int waveStatus;

    @C09CT("wave_sub_count")
    public long waveSubCount;

    @C09CT("wave_target_sub_count")
    public long waveTargetSubCount;

    @C09CT("thanks_list")
    public List<SubWaveSubscriberInfo> thanksList = new ArrayList();

    @C09CT("sub_wave_strikes")
    public List<SubWaveStrikeInfo> subWaveStrikes = new ArrayList();
}
