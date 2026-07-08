package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class IMChatToDetailSafConfig {

    @C09CT("anim_fade_in")
    public final boolean animFadeIn;

    @C09CT("anim_start_from")
    public final int animStartFrom;

    @C09CT("anim_type")
    public final int animType;

    @C09CT("defer_biz_logic")
    public final boolean deferBizLogic;

    @C09CT("enable_entries")
    public final int enableEntries;

    @C09CT("enter_anim_duration")
    public final long enterAnimDuration;

    @C09CT("enter_interpolator")
    public final int enterInterpolator;

    @C09CT("exit_anim")
    public final int exitAnim;

    @C09CT("exit_anim_duration")
    public final long exitAnimDuration;

    @C09CT("fragment_anim_share_video_only")
    public final boolean fragmentAnimShareVideoOnly;

    @C09CT("photo_mode_preload")
    public final boolean photoModePreload;

    @C09CT("saf_mode")
    public final int safMode;

    public IMChatToDetailSafConfig() {
        this(0, 0, 0, 0, false, 0, 0L, 0L, 0, false, false, false);
    }

    public IMChatToDetailSafConfig(int i, int i2, int i3, int i4, boolean z, int i5, long j, long j2, int i6, boolean z2, boolean z3, boolean z4) {
        this.enableEntries = i;
        this.safMode = i2;
        this.animType = i3;
        this.animStartFrom = i4;
        this.animFadeIn = z;
        this.exitAnim = i5;
        this.exitAnimDuration = j;
        this.enterAnimDuration = j2;
        this.enterInterpolator = i6;
        this.photoModePreload = z2;
        this.deferBizLogic = z3;
        this.fragmentAnimShareVideoOnly = z4;
    }
}
