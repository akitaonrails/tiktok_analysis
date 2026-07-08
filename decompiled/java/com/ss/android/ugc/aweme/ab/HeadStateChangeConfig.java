package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class HeadStateChangeConfig {

    @C09CT("fix_message_notify")
    public final boolean fixMessageNotify;

    @C09CT("fix_stream_data")
    public final boolean fixStreamData;

    @C09CT("live_head_hide")
    public final boolean headHide;

    @C09CT("live_head_show")
    public final boolean headShow;

    @C09CT("remove_animation_check")
    public final boolean removeAnimationCheck;

    @C09CT("remove_loop_check")
    public final boolean removeLoopCheck;

    public HeadStateChangeConfig() {
        this(false, false, false, false, false, false);
    }

    public HeadStateChangeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.fixStreamData = z;
        this.fixMessageNotify = z2;
        this.headShow = z3;
        this.headHide = z4;
        this.removeLoopCheck = z5;
        this.removeAnimationCheck = z6;
    }
}
