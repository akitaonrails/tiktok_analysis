package com.ss.android.ugc.aweme.experiment.consumption;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedConsumeParamsWithRequestConfig {

    @C09CT("enable_author_id")
    public final boolean enable_author_id;

    @C09CT("enable_day_view_time")
    public final boolean enable_day_view_time;

    @C09CT("enable_duration")
    public final boolean enable_duration;

    @C09CT("enable_is_click_comment")
    public final boolean enable_is_click_comment;

    @C09CT("enable_is_commentted")
    public final boolean enable_is_commentted;

    @C09CT("enable_is_disliked")
    public final boolean enable_is_disliked;

    @C09CT("enable_is_enter_music")
    public final boolean enable_is_enter_music;

    @C09CT("enable_is_enter_profile")
    public final boolean enable_is_enter_profile;

    @C09CT("enable_is_favorited")
    public final boolean enable_is_favorited;

    @C09CT("enable_is_finished")
    public final boolean enable_is_finished;

    @C09CT("enable_is_followed")
    public final boolean enable_is_followed;

    @C09CT("enable_is_liked")
    public final boolean enable_is_liked;

    @C09CT("enable_is_reported")
    public final boolean enable_is_reported;

    @C09CT("enable_is_shared")
    public final boolean enable_is_shared;

    @C09CT("enable_vv")
    public final boolean enable_vv;

    @C09CT("params_size")
    public final int params_size;

    @C09CT("refactor_get_value")
    public final boolean refactor_get_value;

    public FeedConsumeParamsWithRequestConfig() {
        this(16, true, true, true, false, true, true, true, true, true, true, true, true, true, true, true, true);
    }

    public FeedConsumeParamsWithRequestConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.params_size = i;
        this.enable_duration = z;
        this.enable_vv = z2;
        this.enable_day_view_time = z3;
        this.enable_author_id = z4;
        this.enable_is_finished = z5;
        this.enable_is_followed = z6;
        this.enable_is_enter_profile = z7;
        this.enable_is_liked = z8;
        this.enable_is_favorited = z9;
        this.enable_is_shared = z10;
        this.enable_is_disliked = z11;
        this.enable_is_reported = z12;
        this.refactor_get_value = z13;
        this.enable_is_commentted = z14;
        this.enable_is_click_comment = z15;
        this.enable_is_enter_music = z16;
    }
}
