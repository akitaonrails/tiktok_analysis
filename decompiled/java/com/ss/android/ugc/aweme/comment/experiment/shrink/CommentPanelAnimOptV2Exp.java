package com.ss.android.ugc.aweme.comment.experiment.shrink;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPanelAnimOptV2Exp {
    public static final CommentPanelAnimConfig LIZ = new CommentPanelAnimConfig(0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(107));

    public static final class CommentPanelAnimConfig {

        @C09CT("comment_panel_close_anim_duration")
        public final int closeAnimDuration;

        @C09CT("enable_new_anim_interpolator")
        public final int enableNewInterpolator;

        @C09CT("comment_panel_open_anim_duration")
        public final int openAnimDuration;

        public CommentPanelAnimConfig() {
            this(0, 0, 0);
        }

        public CommentPanelAnimConfig(int i, int i2, int i3) {
            this.openAnimDuration = i;
            this.closeAnimDuration = i2;
            this.enableNewInterpolator = i3;
        }
    }
}
