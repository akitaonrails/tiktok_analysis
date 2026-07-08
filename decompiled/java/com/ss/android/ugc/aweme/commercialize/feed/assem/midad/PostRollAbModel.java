package com.ss.android.ugc.aweme.commercialize.feed.assem.midad;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class PostRollAbModel {

    @C09CT("feed_filter_bugfix")
    public final boolean feed_filter_bugfix;

    @C09CT("fix_progress_ui_problem")
    public final boolean fix_progress_ui_problem;

    @C09CT("progress_listener_optimization")
    public final boolean listener_optimization;

    @C09CT("enable_long_video_countdown_opti")
    public final boolean post_roll_countdown_ui_optimization;

    @C09CT("enable_hide_post_roll_ad_skip")
    public final boolean post_roll_hide_skip_button;

    @C09CT("enable_long_video_reshow_opti")
    public final boolean post_roll_rewind_optimization;

    @C09CT("enable_unselect_optimization")
    public final boolean post_roll_unselect_optimization;

    @C09CT("replace_api_bugfix")
    public final boolean replace_bugfix;

    @C09CT("replace_delay_ms")
    public final long replace_delay_ms;

    public PostRollAbModel() {
        this(false, false, false, false, 0L, false, false, false, false);
    }

    public PostRollAbModel(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.post_roll_rewind_optimization = z;
        this.post_roll_countdown_ui_optimization = z2;
        this.post_roll_hide_skip_button = z3;
        this.post_roll_unselect_optimization = z4;
        this.replace_delay_ms = j;
        this.fix_progress_ui_problem = z5;
        this.replace_bugfix = z6;
        this.feed_filter_bugfix = z7;
        this.listener_optimization = z8;
    }
}
