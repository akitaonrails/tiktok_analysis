package com.ss.android.ugc.aweme.utils;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class BoolParams implements Serializable {

    @C09CT("is_ads")
    public Integer is_ads;

    @C09CT("is_disliked")
    public Integer is_disliked;

    @C09CT("is_ecom")
    public Integer is_ecom;

    @C09CT("is_entered_profile")
    public Integer is_enter_profile;

    @C09CT("is_favorited")
    public Integer is_favorite;

    @C09CT("is_finished")
    public Integer is_finished;

    @C09CT("is_followed")
    public Integer is_followed;

    @C09CT("is_liked")
    public Integer is_like;

    @C09CT("is_reported")
    public Integer is_reported;

    @C09CT("is_shared")
    public Integer is_share;

    public BoolParams() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final Integer is_ads() {
        return this.is_ads;
    }

    public final Integer is_disliked() {
        return this.is_disliked;
    }

    public final Integer is_ecom() {
        return this.is_ecom;
    }

    public final Integer is_enter_profile() {
        return this.is_enter_profile;
    }

    public final Integer is_favorite() {
        return this.is_favorite;
    }

    public final Integer is_finished() {
        return this.is_finished;
    }

    public final Integer is_followed() {
        return this.is_followed;
    }

    public final Integer is_like() {
        return this.is_like;
    }

    public final Integer is_reported() {
        return this.is_reported;
    }

    public final Integer is_share() {
        return this.is_share;
    }

    public final void set_ads(Integer num) {
        this.is_ads = num;
    }

    public final void set_disliked(Integer num) {
        this.is_disliked = num;
    }

    public final void set_ecom(Integer num) {
        this.is_ecom = num;
    }

    public final void set_enter_profile(Integer num) {
        this.is_enter_profile = num;
    }

    public final void set_favorite(Integer num) {
        this.is_favorite = num;
    }

    public final void set_finished(Integer num) {
        this.is_finished = num;
    }

    public final void set_followed(Integer num) {
        this.is_followed = num;
    }

    public final void set_like(Integer num) {
        this.is_like = num;
    }

    public final void set_reported(Integer num) {
        this.is_reported = num;
    }

    public final void set_share(Integer num) {
        this.is_share = num;
    }

    public BoolParams(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.is_ecom = num;
        this.is_ads = num2;
        this.is_finished = num3;
        this.is_followed = num4;
        this.is_enter_profile = num5;
        this.is_like = num6;
        this.is_favorite = num7;
        this.is_share = num8;
        this.is_disliked = num9;
        this.is_reported = num10;
    }
}
