package com.ss.android.ugc.aweme.boot.downgrade;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class DowngradeAbilityModel {

    @C09CT("avoid_trigger_in_slide")
    public final boolean avoidTriggerInSlide;

    @C09CT("disable_activity_api_call")
    public final boolean disableActivityApiCall;

    @C09CT("enable_after_destroy")
    public final boolean enableAfterDestroy;

    @C09CT("enable_all_log")
    public final boolean enableAllLog;

    @C09CT("enable_separate_timeout")
    public final boolean enableSeparateTimeout;

    @C09CT("enable_slide_scene")
    public final boolean enableSlideScene;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    @C09CT("first_video_trigger_timeout")
    public final long firstVideoTriggerTimeout;

    @C09CT("fix_timeout_bug")
    public final boolean fixTimeoutBug;

    @C09CT("high_main_thread_segmentation_time")
    public final long highPriorityMainThreadSegmentationTime;

    @C09CT("high_work_thread_interval")
    public final long highPriorityWorkThreadExecuteInterval;

    @C09CT("initial_worker_normal_delay")
    public final long initialWorkerNormalDelay;

    @C09CT("normal_main_thread_interval")
    public final long normalPriorityMainThreadExecuteInterval;

    @C09CT("normal_work_thread_interval")
    public final long normalPriorityWorkThreadExecuteInterval;

    @C09CT("scroll_end_trigger_timeout")
    public final long scrollEndTriggerTimeout;

    @C09CT("ui_first_frame_trigger_timeout")
    public final long uiFirstFrameTriggerTimeout;

    public DowngradeAbilityModel() {
        this(true, 15000L, 200L, 3000L, 0L, 0L, 0L, 0L, false, true, false, true, false, true, 0L, true);
    }

    public DowngradeAbilityModel(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j8, boolean z8) {
        this.enableStrategy = z;
        this.firstVideoTriggerTimeout = j;
        this.uiFirstFrameTriggerTimeout = j2;
        this.scrollEndTriggerTimeout = j3;
        this.normalPriorityWorkThreadExecuteInterval = j4;
        this.normalPriorityMainThreadExecuteInterval = j5;
        this.highPriorityMainThreadSegmentationTime = j6;
        this.highPriorityWorkThreadExecuteInterval = j7;
        this.enableAfterDestroy = z2;
        this.enableSlideScene = z3;
        this.enableAllLog = z4;
        this.disableActivityApiCall = z5;
        this.avoidTriggerInSlide = z6;
        this.enableSeparateTimeout = z7;
        this.initialWorkerNormalDelay = j8;
        this.fixTimeoutBug = z8;
    }
}
