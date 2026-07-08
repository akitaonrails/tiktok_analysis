package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedAdaptionRefactorSettingsConfig {

    @C09CT("enable_cal_sticker_in_main")
    public final boolean enable_cal_sticker_in_main;

    @C09CT("enable_container_offset_set_trans")
    public final boolean enable_container_offset_set_trans;

    @C09CT("enable_feed_async_adaption")
    public final boolean enable_feed_async_adaption;

    @C09CT("enable_first_cell_init_adaption")
    public final boolean enable_first_cell_init_adaption;

    @C09CT("enable_fix_screen_adaption")
    public final boolean enable_fix_screen_adaption;

    @C09CT("enable_fix_story_adaption")
    public final boolean enable_fix_story_adaption;

    @C09CT("enable_layout_change_deduplication")
    public final boolean enable_layout_change_deduplication;

    @C09CT("enable_log_string_opt")
    public final boolean enable_log_string_opt;

    @C09CT("enable_move_up_listener_out")
    public final boolean enable_move_up_listener_out;

    @C09CT("enable_trace_cover_view")
    public final boolean enable_trace_cover_view;

    @C09CT("threshold_story_adaption")
    public final float threshold_story_adaption;

    public FeedAdaptionRefactorSettingsConfig() {
        this(false, false, 0.2f, false, false, false, false, false, false, false, false);
    }

    public FeedAdaptionRefactorSettingsConfig(boolean z, boolean z2, float f, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.enable_fix_story_adaption = z;
        this.enable_fix_screen_adaption = z2;
        this.threshold_story_adaption = f;
        this.enable_move_up_listener_out = z3;
        this.enable_feed_async_adaption = z4;
        this.enable_cal_sticker_in_main = z5;
        this.enable_trace_cover_view = z6;
        this.enable_container_offset_set_trans = z7;
        this.enable_layout_change_deduplication = z8;
        this.enable_log_string_opt = z9;
        this.enable_first_cell_init_adaption = z10;
    }
}
