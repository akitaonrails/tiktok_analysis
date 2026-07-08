package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkmicCountdownTimerPlayModeData {
    public static final TypeAdapter ADAPTER = new LinkmicCountdownTimerPlayModeData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_count_down_service")
    public boolean enableCountdownService;

    @C09CT("end_countdown_down_req_backup_delay_time")
    public long endCountdownReqBackupDelayTime;

    @C09CT("enlarge_im_backup_delay_time")
    public long enlargeImBackupDelayTime;

    @C09CT("max_custom_count_down_duration")
    public long maxCustomCountDownDuration;

    public LinkmicCountdownTimerPlayModeData() {
        this(true, 3L, 3L, 60L);
    }

    public LinkmicCountdownTimerPlayModeData(boolean z, long j, long j2, long j3) {
        this.enableCountdownService = z;
        this.enlargeImBackupDelayTime = j;
        this.endCountdownReqBackupDelayTime = j2;
        this.maxCustomCountDownDuration = j3;
    }
}
