package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SpacePost {

    @C09CT("active_time_sec")
    public long activeTimeSec;

    @C09CT("category")
    public SpaceTopicCategory category;

    @C09CT("comment_count")
    public long commentCount;

    @C09CT("create_time_sec")
    public long createTimeSec;

    @C09CT("is_pinned")
    public boolean isPinned;

    @C09CT("like_count")
    public long likeCount;

    @C09CT("poll_info")
    public SpacePoll pollInfo;

    @C09CT("post_id")
    public long postId;

    @C09CT("post_status")
    public int postStatus;

    @C09CT("post_type")
    public int postType;

    @C09CT("preview_mode")
    public boolean previewMode;

    @C09CT("refer_id")
    public long referId;

    @C09CT("sub_only_videos_brief_info")
    public SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;

    @C09CT("update_time_sec")
    public long updateTimeSec;

    @C09CT("user_liked")
    public boolean userLiked;

    @C09CT("post_id_str")
    public String postIdStr = "";

    @C09CT("text")
    public String text = "";

    @C09CT("comment_list")
    public List<SpaceCommentItem> commentList = new ArrayList();

    @C09CT("video_jump_url")
    public String videoJumpUrl = "";

    @C09CT("preview_text_indicator")
    public String previewTextIndicator = "";
}
