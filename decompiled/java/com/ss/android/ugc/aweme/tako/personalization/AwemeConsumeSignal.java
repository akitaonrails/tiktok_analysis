package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class AwemeConsumeSignal {

    @C09CT("gid")
    public final String awemeId;

    @C09CT("aweme_type")
    public final Integer awemeType;

    @C09CT("duration")
    public final Long duration;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("is_liked")
    public final Boolean isLiked;

    @C09CT("is_play_finished")
    public final Boolean isPlayFinish;

    @C09CT("is_shared")
    public final Boolean isShared;

    @C09CT("latest_consume_timestamp")
    public final Long latestConsumeTimestamp;

    @C09CT("play_end_index")
    public Long playEndIndex;

    @C09CT("play_end_time")
    public Long playEndTime;

    @C09CT("play_time_max")
    public final Long playTimeMax;

    @C09CT("play_time_total")
    public final Long playTimeTotal;

    @C09CT("post_comment")
    public final Boolean postComment;

    @C09CT("query")
    public final String query;

    @C09CT("source")
    public final String source;

    @C09CT("watch_comment")
    public final Boolean watchComment;

    public AwemeConsumeSignal() {
        this("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public AwemeConsumeSignal(String str, Integer num, Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l2, Long l3, Long l4, Boolean bool6, String str2, String str3, Long l5, Long l6) {
        this.awemeId = str;
        this.awemeType = num;
        this.latestConsumeTimestamp = l;
        this.isLiked = bool;
        this.isCollected = bool2;
        this.isShared = bool3;
        this.watchComment = bool4;
        this.postComment = bool5;
        this.playTimeTotal = l2;
        this.playTimeMax = l3;
        this.duration = l4;
        this.isPlayFinish = bool6;
        this.query = str2;
        this.source = str3;
        this.playEndTime = l5;
        this.playEndIndex = l6;
    }
}
