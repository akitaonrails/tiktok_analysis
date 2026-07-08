package com.ss.android.ugc.aweme.story.api;

import X.AbstractC19484711Kz;
import X.C0X9S;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.StoryGetStreaksInfoResponse;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.ss.android.ugc.aweme.story.archive.model.StoryArchiveList;
import com.ss.android.ugc.aweme.story.archive2.model.GetArchivedStoryIDsResponse;
import com.ss.android.ugc.aweme.story.archive2.model.GetAwemeDetailByIDResponse;
import com.ss.android.ugc.aweme.story.archive2.model.GetFirstStoryCreateTimeResponse;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import com.ss.android.ugc.aweme.story.archive2.model.HasOnThisDayResponse;
import com.ss.android.ugc.aweme.story.highlights.inbox.SkylightHighlightsAwemeResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAvailableAwemesResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightGetDetailResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAuthKeyResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCoverReportResponse;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import com.ss.android.ugc.aweme.story.model.StoryInteractionListResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewerListResponse;
import com.ss.android.ugc.aweme.story.model.SwitchToStoryResponse;
import com.ss.android.ugc.aweme.story.model.TiktokV1StoryGetSocialProofResponse;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.ss.android.ugc.aweme.story.reveal.TiktokV1StoryGetUserRevealStoriesResponse;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public interface IStoryApi {
    @InterfaceC1501160pAQ("/tiktok/v1/story/bullet/list")
    C11NZ<StoryBulletListResponse> fetchStoryBulletList(@InterfaceC1501070pAH("story_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("impression_user_ids") String str2);

    @InterfaceC1501160pAQ("/tiktok/v2/story/viewer/list")
    C0X9S<StoryViewerListResponse> fetchStoryViewerList(@InterfaceC1501070pAH("story_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("story_insert_viewer") String str2);

    @InterfaceC1501160pAQ("/tiktok/v1/story/interaction/list")
    C0X9S<StoryInteractionListResponse> fetchStoryViewerListAndBullet(@InterfaceC1501070pAH("story_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("story_insert_viewer") String str2, @InterfaceC1501070pAH("interaction_list_types") String str3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/archive/get_details")
    Object getArchivedStoryDetailByIDs(@InterfaceC1501050pAF("aweme_ids") String str, InterfaceC1364105Vn<? super GetAwemeDetailByIDResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/archive/get_ids")
    Object getArchivedStoryIDs(@InterfaceC1501050pAF("timestamp") long j, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super GetArchivedStoryIDsResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/archive/get_in_day")
    C11NZ<UserStoryResponse> getArchivedStoryInDay(@InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("cursor") long j, @InterfaceC1501050pAF("load_before") boolean z);

    @InterfaceC1501160pAQ("/tiktok/v1/story/archive/first_create_time")
    Object getFirstStoryCreateTime(InterfaceC1364105Vn<? super GetFirstStoryCreateTimeResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/story/highlight/multi_get_awemes")
    C11NZ<SkylightHighlightsAwemeResponse> getSkylightHighlightsList(@InterfaceC1501070pAH("aweme_ids") List<String> list);

    @InterfaceC1501160pAQ("/tiktok/story/get_social_proof/v1")
    Object getSocialProof(@InterfaceC1501070pAH("type") int i, InterfaceC1364105Vn<? super TiktokV1StoryGetSocialProofResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/story/archive/detail/v1")
    C11NZ<StoryArchDetailResponse> getStoryArchDetail();

    @InterfaceC1501160pAQ("/tiktok/story/archive/list/v1")
    C11NZ<StoryArchiveList> getStoryArchList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") long j2);

    @InterfaceC1501160pAQ("/tiktok/v1/story/on_this_day_info")
    Object getStoryOnThisDayInfo(InterfaceC1364105Vn<? super GetStoryOnThisDayInfoResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/story/get_streaks_info")
    C0X9S<StoryGetStreaksInfoResponse> getStreaksInfo(@InterfaceC1501070pAH("to_id") long j);

    @InterfaceC1501160pAQ("/tiktok/v1/story/get_user_reveal_stories")
    Object getUserRevealStories(@InterfaceC1501070pAH("aweme_type") int i, @InterfaceC1501070pAH("cursor") Long l, @InterfaceC1501070pAH("count") Integer num, @InterfaceC1501070pAH("load_before") Boolean bool, @InterfaceC1501070pAH("viewer_id") String str, InterfaceC1364105Vn<? super TiktokV1StoryGetUserRevealStoriesResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/story/get_user_stories")
    AbstractC19484711Kz<UserStoriesResponse> getUserStoriesSingle(@InterfaceC1501070pAH("author_ids") String str, @InterfaceC1501070pAH("start_view_stories") String str2, @InterfaceC1501070pAH("need_story_notes") int i, @InterfaceC1501070pAH("client_control_params") String str3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/get_user_stories")
    AbstractC19484711Kz<UserStoriesResponse> getUserStoriesSingleByPost(@InterfaceC1501050pAF("author_ids") String str, @InterfaceC1501050pAF("start_view_stories") String str2, @InterfaceC1501050pAF("need_story_notes") int i, @InterfaceC1501050pAF("client_control_params") String str3, @InterfaceC1501050pAF("recent_viewed_ids") String str4);

    @InterfaceC1501160pAQ("/tiktok/v1/story/get_user_story")
    C11NZ<UserStoryResponse> getUserStory(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("load_before") boolean z, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("source") int i2, @InterfaceC1501070pAH("client_control_params") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/get_user_story")
    C11NZ<UserStoryResponse> getUserStoryByPost(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("cursor") long j, @InterfaceC1501050pAF("load_before") boolean z, @InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("source") int i2, @InterfaceC1501050pAF("client_control_params") String str2, @InterfaceC1501050pAF("recent_viewed_ids") String str3);

    @InterfaceC1501160pAQ("/tiktok/v1/story/has_on_this_day")
    Object hasOnThisDay(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super HasOnThisDayResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/add_aweme")
    Object highlightAddAweme(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("aweme_id") String str2, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/available_awemes")
    Object highlightAvailableAwemes(@InterfaceC1501050pAF("cursor") Long l, @InterfaceC1501050pAF("collection_id") String str, InterfaceC1364105Vn<? super StoryHighlightAvailableAwemesResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/aweme_detail")
    Object highlightAwemeDetail(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("aweme_id") String str2, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) Integer num, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/cache")
    Object highlightCollectionCache(@InterfaceC1501050pAF("collection_ids") String str, InterfaceC1364105Vn<? super StoryHighlightsCollectionCacheResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/cover/report")
    Object highlightCoverReport(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("cover_uri") String str2, InterfaceC1364105Vn<? super StoryHighlightsCoverReportResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/create")
    Object highlightCreate(@InterfaceC1501050pAF("title") String str, @InterfaceC1501050pAF("collection_cover_uri") String str2, @InterfaceC1501050pAF("cover_aweme_id") String str3, @InterfaceC1501050pAF("cover_type") Integer num, @InterfaceC1501050pAF("aweme_ids") String str4, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/delete")
    Object highlightDelete(@InterfaceC1501050pAF("collection_id") String str, InterfaceC1364105Vn<? super StoryHighlightDeleteResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/get_awemes")
    Object highlightGetAwemes(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("cursor") Long l, @InterfaceC1501050pAF("load_before") boolean z, InterfaceC1364105Vn<? super UserStoryResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/get_awemes")
    C11NZ<UserStoryResponse> highlightGetAwemesObservable(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("cursor") Long l, @InterfaceC1501050pAF("load_before") boolean z);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/get_detail")
    Object highlightGetDetail(@InterfaceC1501050pAF("collection_id") String str, InterfaceC1364105Vn<? super StoryHighlightGetDetailResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/list_for_aweme")
    Object highlightListForAweme(@InterfaceC1501050pAF("aweme_id") String str, InterfaceC1364105Vn<? super StoryHighlightListForAwemeResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/onboarding/ack")
    Object highlightOnboardingAck(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/remove_aweme")
    Object highlightRemoveAweme(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("aweme_id") String str2, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/reorder")
    Object highlightReorder(@InterfaceC1501050pAF("collection_id_to_move") String str, @InterfaceC1501050pAF("new_preceding_collection_id") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/collection/update")
    Object highlightUpdate(@InterfaceC1501050pAF("collection_id") String str, @InterfaceC1501050pAF("title") String str2, @InterfaceC1501050pAF("collection_cover_uri") String str3, @InterfaceC1501050pAF("cover_aweme_id") String str4, @InterfaceC1501050pAF("cover_type") Integer num, @InterfaceC1501050pAF("aweme_ids") String str5, @InterfaceC1501050pAF("resume_aweme_id") String str6, InterfaceC1364105Vn<? super StoryHighlightCreateOrUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/story/highlight/upload/auth_key")
    Object highlightUploadAuthKey(InterfaceC1364105Vn<? super StoryHighlightsAuthKeyResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/commit/item/digg/")
    C0X9S<BaseResponse> likeFeed(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("type") int i);

    @InterfaceC1501160pAQ("/aweme/v1/multi/aweme/detail/")
    C11NZ<BatchDetailList> queryBatchAwemeRx(@InterfaceC1501070pAH("aweme_ids") String str, @InterfaceC1501070pAH("origin_type") String str2, @InterfaceC1501070pAH("push_params") String str3, @InterfaceC1501070pAH("story_req_source") int i);

    @InterfaceC1501170pAR("/tiktok/v1/story/guide_card/dislike")
    AbstractC19484711Kz<BaseResponse> reportGuideCardDislike();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/story/reveal/report/v1")
    Object reportStoryReveal(@InterfaceC1501050pAF("type") int i, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/story/view/report/v1")
    AbstractC19484711Kz<BaseResponse> reportStoryViewed(@InterfaceC1501050pAF("story_id") String str, @InterfaceC1501050pAF("author_id") String str2, @InterfaceC1501050pAF("unlocked") Integer num);

    @InterfaceC1501170pAR("/tiktok/story/interaction/report/v1")
    C0X9S<BaseResponse> reportUserInteraction(@InterfaceC1501070pAH("story_id") String str, @InterfaceC1501070pAH("interaction_type") int i, @InterfaceC1501070pAH("viewer_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/story/exchange")
    Object switchStoryToNormal(@InterfaceC1501050pAF("story_id") Long l, @InterfaceC1501050pAF("item_comment") Integer num, @InterfaceC1501050pAF("default_visible") Integer num2, InterfaceC1364105Vn<? super SwitchToStoryResponse> interfaceC1364105Vn);
}
