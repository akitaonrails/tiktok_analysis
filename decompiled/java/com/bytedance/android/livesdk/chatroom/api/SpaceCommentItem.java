package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceCommentItem {

    @C09CT("anchor_commented")
    public boolean anchorCommented;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("anchor_liked")
    public boolean anchorLiked;

    @C09CT("comment_id")
    public long commentId;

    @C09CT("comment_type")
    public int commentType;

    @C09CT("create_time_sec")
    public long createTimeSec;

    @C09CT("like_count")
    public long likeCount;

    @C09CT("post_id")
    public long postId;

    @C09CT("post_type")
    public int postType;

    @C09CT("reply_comment_info")
    public SpaceCommentItem replyCommentInfo;

    @C09CT("reply_count")
    public long replyCount;

    @C09CT("reply_to_reply_info")
    public SpaceCommentItem replyToReplyInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_info")
    public User userInfo;

    @C09CT("user_liked")
    public boolean userLiked;

    @C09CT("text")
    public String text = "";

    @C09CT("emote_list")
    public List<EmoteWithIndex> emoteList = new ArrayList();

    @C09CT("at_list")
    public List<AtWithIndex> atList = new ArrayList();

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();
}
