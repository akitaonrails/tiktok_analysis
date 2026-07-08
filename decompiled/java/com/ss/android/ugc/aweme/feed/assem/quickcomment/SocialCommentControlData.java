package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialCommentControlData {

    @C09CT("social_commnet_last_show_timestamp")
    public long lastShowTimestamp;

    @C09CT("social_comment_appear_timestamp")
    public long socialCommentAppearTimestamp;

    @C09CT("social_comment_daily_appear_times")
    public int socialCommentDailyAppearTimes;

    @C09CT("social_comment_daily_first_appear_timestamp")
    public long socialCommentDailyFirstAppearTimestamp;

    @C09CT("social_comment_exit")
    public int socialCommentExitCount;

    @C09CT("social_comment_exit_timestamp")
    public long socialCommentExitTimestamp;

    @C09CT("social_comment_no_click")
    public int socialCommentNoClick;

    @C09CT("social_comment_unclicked_aweme_list")
    public List<String> socialCommentUnclickedAwemeList;

    public SocialCommentControlData() {
        this(0L, 0, 0L, 0, 0L, 0, new ArrayList(), 0L);
    }

    public SocialCommentControlData(long j, int i, long j2, int i2, long j3, int i3, List<String> list, long j4) {
        this.socialCommentDailyFirstAppearTimestamp = j;
        this.socialCommentDailyAppearTimes = i;
        this.socialCommentAppearTimestamp = j2;
        this.socialCommentNoClick = i2;
        this.socialCommentExitTimestamp = j3;
        this.socialCommentExitCount = i3;
        this.socialCommentUnclickedAwemeList = list;
        this.lastShowTimestamp = j4;
    }
}
