package com.bytedance.android.livesdk.message.proto;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CppTaskInfo {

    @C09CT("current_live_days")
    public long currentLiveDays;

    @C09CT("current_live_duration")
    public long currentLiveDuration;

    @C09CT("last_live_days")
    public long lastLiveDays;

    @C09CT("last_live_duration")
    public long lastLiveDuration;

    @C09CT("live_days_threshold")
    public long liveDaysThreshold;

    @C09CT("live_duration_threshold")
    public long liveDurationThreshold;

    @C09CT("show_cpp_v2_model")
    public boolean showCppV2Model;

    @C09CT("task_status")
    public int taskStatus;
}
