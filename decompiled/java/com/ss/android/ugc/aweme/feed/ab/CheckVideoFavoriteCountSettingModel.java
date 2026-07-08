package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckVideoFavoriteCountSettingModel {

    @C09CT("digg_threshold")
    public final Integer diggThreshold;

    @C09CT("enable")
    public final Boolean enable;

    public CheckVideoFavoriteCountSettingModel() {
        this(Integer.MAX_VALUE, Boolean.FALSE);
    }

    public CheckVideoFavoriteCountSettingModel(Integer num, Boolean bool) {
        this.diggThreshold = num;
        this.enable = bool;
    }
}
