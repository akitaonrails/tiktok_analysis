package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.CommentDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetUserInteractionSummaryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor")
        public User anchor;

        @C09CT("comment_count")
        public long commentCount;

        @C09CT("ecom_live_user_stats")
        public EcomLiveUserStats ecomLiveUserStats;

        @C09CT("follow_time")
        public long followTime;

        @C09CT("like_count")
        public long likeCount;

        @C09CT("share_count")
        public long shareCount;

        @C09CT("summary_type")
        public int summaryType;

        @C09CT("user")
        public User user;

        @C09CT("watch_duration")
        public long watchDuration;

        @C09CT("summary")
        public String summary = "";

        @C09CT("comment_list")
        public List<CommentDetail> commentList = new ArrayList();
    }
}
