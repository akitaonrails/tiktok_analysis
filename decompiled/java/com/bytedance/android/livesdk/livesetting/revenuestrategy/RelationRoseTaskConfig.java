package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RelationRoseTaskConfig {
    public static final TypeAdapter ADAPTER = new RelationRoseTaskConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("completed_check_period")
    public Long completedCheckPeriod;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_check_duration")
    public Long enableCheckDuration;

    public RelationRoseTaskConfig() {
        this(false, 180L, 30L);
    }

    public RelationRoseTaskConfig(boolean z, Long l, Long l2) {
        this.enable = z;
        this.enableCheckDuration = l;
        this.completedCheckPeriod = l2;
    }
}
