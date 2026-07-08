package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.sub.CommentActionRequest;
import webcast.api.sub.CommentActionResponse;
import webcast.api.sub.CommentDeleteResponse;
import webcast.api.sub.CommentPageResponse;
import webcast.api.sub.CommentSendReq;
import webcast.api.sub.CommentSendResp;
import webcast.api.sub.HomePageResponse;
import webcast.api.sub.PollUserListResponse;
import webcast.api.sub.PollVoteResponse;
import webcast.api.sub.PostActionRequest;
import webcast.api.sub.PostActionResponse;
import webcast.api.sub.PostCreateReq;
import webcast.api.sub.PostCreateResp;
import webcast.api.sub.PostDeleteResponse;
import webcast.api.sub.PostDetailResponse;
import webcast.api.sub.PostPageResponse;
import webcast.api.sub.PostPinActionResponse;
import webcast.api.sub.SettingsResponse;
import webcast.api.sub.SpaceActivityListResponse;
import webcast.api.sub.SpaceJoinResponse;
import webcast.api.sub.SpaceMembersResponse;
import webcast.api.sub.SpaceQuitResponse;
import webcast.api.sub.TopicResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface SubOnlySpaceApi {
    @InterfaceC1501170pAR("/webcast/sub/space/comment/action/")
    C11NZ<C470590Icr<CommentActionResponse>> commentAction(@InterfaceC1485405rg CommentActionRequest commentActionRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/space/comment/delete/")
    C11NZ<C470590Icr<CommentDeleteResponse>> deleteComment(@InterfaceC1501050pAF("post_id") long j, @InterfaceC1501050pAF("comment_id") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/space/post/delete/")
    C11NZ<C470590Icr<PostDeleteResponse.ResponseData>> deletePost(@InterfaceC1501050pAF("post_id") long j);

    @InterfaceC1501160pAQ("/webcast/sub/space/comment/page/")
    C11NZ<C470590Icr<CommentPageResponse.ResponseData>> getCommentPages(@InterfaceC1501070pAH("post_id") long j, @InterfaceC1501070pAH("offset") long j2, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("comment_type") int i, @InterfaceC1501070pAH("comment_id") long j3);

    @InterfaceC1501160pAQ("/webcast/sub/space/poll/user_list/")
    C11NZ<C470590Icr<PollUserListResponse.ResponseData>> getPollUserList(@InterfaceC1501070pAH("post_id") long j, @InterfaceC1501070pAH("poll_id") long j2, @InterfaceC1501070pAH("option_id") long j3, @InterfaceC1501070pAH("offset") long j4);

    @InterfaceC1501160pAQ("/webcast/sub/space/post/detail/")
    C11NZ<C470590Icr<PostDetailResponse.ResponseData>> getPostDetail(@InterfaceC1501070pAH("post_id") long j, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("comment_id") long j2, @InterfaceC1501070pAH("comment_type") int i);

    @InterfaceC1501160pAQ("/webcast/sub/space/post/page/")
    C11NZ<C470590Icr<PostPageResponse.ResponseData>> getPostPage(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("last_active_time_sec") long j2);

    @InterfaceC1501160pAQ("/webcast/sub/space/homepage/")
    C11NZ<C470590Icr<HomePageResponse.ResponseData>> getSpaceHome(@InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/space/members/")
    C11NZ<C470590Icr<SpaceMembersResponse.ResponseData>> getSpaceMembers(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("offset") long j);

    @InterfaceC1501160pAQ("/webcast/sub/space/settings/")
    C11NZ<C470590Icr<SettingsResponse.ResponseData>> getSpaceSettings();

    @InterfaceC1501160pAQ("/webcast/sub/space/topics/")
    C11NZ<C470590Icr<TopicResponse.ResponseData>> getSpaceTopics();

    @InterfaceC1501160pAQ("/webcast/sub/space/activity/list/")
    C11NZ<C470590Icr<SpaceActivityListResponse.ResponseData>> getSubSpaceActivityList(@InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/space/join/")
    C11NZ<C470590Icr<SpaceJoinResponse>> joinSpace(@InterfaceC1501050pAF("sec_anchor_id") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/space/poll/vote/")
    C11NZ<C470590Icr<PollVoteResponse.ResponseData>> pollVote(@InterfaceC1501050pAF("post_id") long j, @InterfaceC1501050pAF("poll_id") long j2, @InterfaceC1501050pAF("option_id") long j3);

    @InterfaceC1501170pAR("/webcast/sub/space/post/action/")
    C11NZ<C470590Icr<PostActionResponse>> postAction(@InterfaceC1485405rg PostActionRequest postActionRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/space/post/pin_action/")
    C11NZ<C470590Icr<PostPinActionResponse.ResponseData>> postPinAction(@InterfaceC1501050pAF("post_id") long j, @InterfaceC1501050pAF("action_type") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/space/quit/")
    C11NZ<C470590Icr<SpaceQuitResponse>> quitSpace(@InterfaceC1501050pAF("sec_anchor_id") String str);

    @InterfaceC1501170pAR("/webcast/sub/space/comment/send/")
    C11NZ<C470590Icr<CommentSendResp.ResponseData>> sendComment(@InterfaceC1485405rg CommentSendReq commentSendReq);

    @InterfaceC1501170pAR("/webcast/sub/space/post/create/")
    C11NZ<C470590Icr<PostCreateResp.ResponseData>> sendPost(@InterfaceC1485405rg PostCreateReq postCreateReq);
}
