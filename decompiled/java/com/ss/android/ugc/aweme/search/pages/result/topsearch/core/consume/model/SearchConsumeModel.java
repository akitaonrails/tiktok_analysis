package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.consume.model;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class SearchConsumeModel {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("big_screen_play")
    public Boolean bigScreenPlay;

    @C09CT("click")
    public Boolean click;

    @C09CT("comment")
    public Boolean comment;

    @C09CT("doc_id_str")
    public final String docId;

    @C09CT("doc_type")
    public Integer docType;

    @C09CT("ec_consume_info")
    public EcConsumeInfo ecConsumeInfo;

    @C09CT("enter_music")
    public Boolean enterMusic;

    @C09CT("enter_user")
    public Boolean enterUser;

    @C09CT("favorite")
    public Boolean favorite;

    @C09CT("follow")
    public Boolean follow;

    @C09CT("is_inner")
    public Boolean isInner;

    @C09CT("is_outer")
    public Boolean isOuter;

    @C09CT("play_finish")
    public Boolean isPlayFinish;

    @C09CT("latest_consume_timestamp")
    public Long latestConsumeTimestamp;

    @C09CT("user_count")
    public Long liveUserCount;

    @C09CT("play_time_max")
    public Long playTimeMax;

    @C09CT("real_video_duration")
    public Long realVideoDuration;

    @C09CT("repin")
    public Boolean repin;

    @C09CT("search_keyword")
    public String searchKeyword;

    @C09CT("share")
    public Boolean share;

    @C09CT("video_total_play_time")
    public Long videoTotalPlayTime;

    public SearchConsumeModel(String str, Long l, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str2, Long l3, Long l4, EcConsumeInfo ecConsumeInfo, Long l5, Integer num, Boolean bool11, Boolean bool12) {
        this.docId = str;
        this.playTimeMax = l;
        this.videoTotalPlayTime = l2;
        this.repin = bool;
        this.comment = bool2;
        this.share = bool3;
        this.follow = bool4;
        this.favorite = bool5;
        this.enterMusic = bool6;
        this.enterUser = bool7;
        this.click = bool8;
        this.bigScreenPlay = bool9;
        this.isPlayFinish = bool10;
        this.searchKeyword = str2;
        this.realVideoDuration = l3;
        this.liveUserCount = l4;
        this.ecConsumeInfo = ecConsumeInfo;
        this.latestConsumeTimestamp = l5;
        this.docType = num;
        this.isInner = bool11;
        this.isOuter = bool12;
    }
}
