package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class TimeInfo {

    @C09CT("animation_lottie_name")
    public String animationLottieName;

    @C09CT("loop_animation")
    public Boolean enableLoopAnimation;

    @C09CT("lottie_name")
    public String lottieName;

    @C09CT("timer_status")
    public String status;

    @C09CT("timer_launchplan_id")
    public Integer timerLaunchPlayId;

    public TimeInfo() {
        this(0, null, null, null, null);
    }

    public TimeInfo(Integer num, String str, String str2, String str3, Boolean bool) {
        this.timerLaunchPlayId = num;
        this.status = str;
        this.lottieName = str2;
        this.animationLottieName = str3;
        this.enableLoopAnimation = bool;
    }
}
