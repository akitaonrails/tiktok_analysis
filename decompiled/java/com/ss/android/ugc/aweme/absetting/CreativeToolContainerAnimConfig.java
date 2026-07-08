package com.ss.android.ugc.aweme.absetting;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class CreativeToolContainerAnimConfig {

    @C09CT("enable_enter_anim")
    public boolean enableEnterAnim;

    @C09CT("enable_exit_anim")
    public boolean enableExitAnim;

    @C09CT("enable_fake_enter_anim")
    public boolean enableFakeEnterAnim;

    @C09CT("enable_fake_exit_anim")
    public boolean enableFakeExitAnim;

    @C09CT("enter_duration")
    public long enterDuration;

    @C09CT("exit_duration")
    public long exitDuration;

    @C09CT("fake_enter_duration")
    public long fakeEnterDuration;

    @C09CT("fake_exit_duration")
    public long fakeExitDuration;

    @C09CT("transition_type")
    public int transitionType;

    public CreativeToolContainerAnimConfig() {
        this(true, true, -1L, -1L, false, false, -1L, -1L, -1);
    }

    public CreativeToolContainerAnimConfig(boolean z, boolean z2, long j, long j2, boolean z3, boolean z4, long j3, long j4, int i) {
        this.enableEnterAnim = z;
        this.enableExitAnim = z2;
        this.enterDuration = j;
        this.exitDuration = j2;
        this.enableFakeEnterAnim = z3;
        this.enableFakeExitAnim = z4;
        this.fakeEnterDuration = j3;
        this.fakeExitDuration = j4;
        this.transitionType = i;
    }
}
