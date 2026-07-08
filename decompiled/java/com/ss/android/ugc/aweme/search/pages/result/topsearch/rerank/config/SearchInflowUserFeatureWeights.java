package com.ss.android.ugc.aweme.search.pages.result.topsearch.rerank.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInflowUserFeatureWeights {

    @C09CT("comment_weight")
    public final double commentWeight;

    @C09CT("enter_music_weight")
    public final double enterMusicWeight;

    @C09CT("enter_user_weight")
    public final double enterUserWeight;

    @C09CT("favourite_weight")
    public final double favouriteWeight;

    @C09CT("finish_weight")
    public final double finishWeight;

    @C09CT("like_weight")
    public final double likeWeight;

    @C09CT("play_time_weight")
    public final double playTimeWeight;

    @C09CT("share_weight")
    public final double shareWeight;

    public SearchInflowUserFeatureWeights() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
    }

    public SearchInflowUserFeatureWeights(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.playTimeWeight = d;
        this.likeWeight = d2;
        this.shareWeight = d3;
        this.favouriteWeight = d4;
        this.commentWeight = d5;
        this.enterUserWeight = d6;
        this.enterMusicWeight = d7;
        this.finishWeight = d8;
    }
}
