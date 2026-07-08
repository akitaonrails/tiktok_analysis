package com.ss.android.ugc.aweme.series.feed.profile.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ShortDramaVideoItemModel {

    @C09CT("is_last_watched")
    public final Boolean isLastWatched;

    @C09CT("is_unlocked")
    public final Boolean isUnlocked;

    @C09CT("num_watched")
    public final Integer numWatched;

    @C09CT("seq_id")
    public final Integer seqId;

    @C09CT("video_id")
    public final Long videoId;

    public ShortDramaVideoItemModel() {
        this(0, 0, Boolean.FALSE, -1L, Boolean.FALSE);
    }

    public ShortDramaVideoItemModel(Integer num, Integer num2, Boolean bool, Long l, Boolean bool2) {
        this.numWatched = num;
        this.seqId = num2;
        this.isUnlocked = bool;
        this.videoId = l;
        this.isLastWatched = bool2;
    }
}
