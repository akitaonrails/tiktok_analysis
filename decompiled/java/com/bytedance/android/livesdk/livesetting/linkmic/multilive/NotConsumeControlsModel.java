package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class NotConsumeControlsModel {
    public static final TypeAdapter ADAPTER;

    @C09CT("not_consume_gap_day")
    public Integer notConsumeGapDay;

    @C09CT("not_consume_times")
    public Integer notConsumeTimes;

    static {
        NormalGson.singleton();
        ADAPTER = new NotConsumeControlsModel_OptTypeAdapter();
    }

    public NotConsumeControlsModel() {
        this(2, 5);
    }

    public NotConsumeControlsModel(Integer num, Integer num2) {
        this.notConsumeTimes = num;
        this.notConsumeGapDay = num2;
    }
}
