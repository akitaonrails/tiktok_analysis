package com.ss.android.ugc.aweme.story;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryDelayPublishData {

    @C09CT("delay_after_click_publish_ms")
    public final long delayAfterClickPublishMs;

    @C09CT("delay_after_publish_activity_destroy")
    public final long delayAfterPublishActivityDestoryMs;

    @C09CT("delay_after_resume_publish_ms")
    public final long delayAfterResumePublishMs;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_delay_publish_landing")
    public final boolean enableDelayPublishLanding;

    @C09CT("is_report_mem")
    public final boolean isReportMem;

    public StoryDelayPublishData() {
        this(false, false, 0L, 1500L, 0L, false);
    }

    public StoryDelayPublishData(boolean z, boolean z2, long j, long j2, long j3, boolean z3) {
        this.enable = z;
        this.enableDelayPublishLanding = z2;
        this.delayAfterPublishActivityDestoryMs = j;
        this.delayAfterClickPublishMs = j2;
        this.delayAfterResumePublishMs = j3;
        this.isReportMem = z3;
    }
}
