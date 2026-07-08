package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class IntelligentPopupData {

    @C09CT("back_up_close_time_limit")
    public final int backupCloseTimeLimit;

    @C09CT("back_up_freq_control_enable")
    public final boolean backupFreqEnabled;

    @C09CT("back_up_show_up_after_3times_interval")
    public final int backupShowUpAfter3Interval;

    @C09CT("back_up_show_up_interval")
    public final int backupShowUpInterval;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fallback_freq_optimize_enable")
    public final boolean fallbackFreqOptimizeEnable;

    @C09CT("record_backup_show_up")
    public final boolean recordBackupShowUp;

    @C09CT("retry_init_pitaya_interval")
    public final int retryInitPitayaInterval;

    @C09CT("server_judge_type")
    public final int serverJudgeType;

    @C09CT("timeout_in_milliseconds")
    public final long timeoutInMs;

    @C09CT("try_init_pitaya_before_process")
    public final boolean tryInitPitayaBeforeProcess;

    public IntelligentPopupData() {
        this(false, false, 10, 0, 1000L, true, 4, 3, 7, false, false);
    }

    public IntelligentPopupData(boolean z, boolean z2, int i, int i2, long j, boolean z3, int i3, int i4, int i5, boolean z4, boolean z5) {
        this.enable = z;
        this.tryInitPitayaBeforeProcess = z2;
        this.retryInitPitayaInterval = i;
        this.serverJudgeType = i2;
        this.timeoutInMs = j;
        this.backupFreqEnabled = z3;
        this.backupShowUpInterval = i3;
        this.backupCloseTimeLimit = i4;
        this.backupShowUpAfter3Interval = i5;
        this.recordBackupShowUp = z4;
        this.fallbackFreqOptimizeEnable = z5;
    }
}
