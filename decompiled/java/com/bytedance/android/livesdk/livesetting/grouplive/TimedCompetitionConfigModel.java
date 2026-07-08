package com.bytedance.android.livesdk.livesetting.grouplive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TimedCompetitionConfigModel {
    public static final TypeAdapter ADAPTER;

    @C09CT("check_result_delay_sec")
    public int checkResultDisplaySec;

    @C09CT("check_result_retry_count")
    public int checkResultRetryCount;

    @C09CT("check_result_retry_interval")
    public int checkResultRetryInterval;

    @C09CT("result_display_sec")
    public int resultDisplaySec;

    static {
        NormalGson.singleton();
        ADAPTER = new TimedCompetitionConfigModel_OptTypeAdapter();
    }

    public TimedCompetitionConfigModel() {
        this(10, 2, 5, 2);
    }

    public TimedCompetitionConfigModel(int i, int i2, int i3, int i4) {
        this.resultDisplaySec = i;
        this.checkResultDisplaySec = i2;
        this.checkResultRetryCount = i3;
        this.checkResultRetryInterval = i4;
    }
}
