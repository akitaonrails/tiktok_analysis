package com.ss.android.ugc.aweme.base.api;

import X.C0X9S;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.bean.MixRankSkylightRequest;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserResponse;
import com.ss.android.ugc.aweme.feed.module.StoryMuteResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;

/* JADX INFO: loaded from: classes25.dex */
public interface ISkylightApi {
    @InterfaceC1501200pAU("/aweme/v2/follow/feed/skylight")
    C0X9S<SkylightFollowingUserResponse> LIZ();

    @InterfaceC1501200pAU("/aweme/v1/following/interest/users/")
    C0X9S<FollowingInterestUsersResponse> LIZIZ(@InterfaceC1501120pAM("following_list_type") int i, @InterfaceC1501120pAM("last_display_time") long j, @InterfaceC1501120pAM("sky_light_type") int i2, @InterfaceC1501120pAM("is_non_personalized") int i3, @InterfaceC1501120pAM("need_ec_live_event") boolean z);

    @InterfaceC1501200pAU("/tiktok/story/maf/unmute")
    C0X9S<StoryMuteResponse> LIZJ(@InterfaceC1501120pAM("uid") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501200pAU("/tiktok/story/maf/mute")
    C0X9S<StoryMuteResponse> LIZLLL(@InterfaceC1501120pAM("uid") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501200pAU("/aweme/v1/following/interest/users/")
    C0X9S<FollowingInterestUsersResponse> LJ(@InterfaceC1501120pAM("following_list_type") int i, @InterfaceC1501120pAM("last_display_time") long j, @InterfaceC1501120pAM("sky_light_type") int i2, @InterfaceC1501120pAM("is_non_personalized") int i3, @InterfaceC1501120pAM("story_feed_pull_type") int i4, @InterfaceC1501120pAM("need_ec_live_event") boolean z);

    @InterfaceC1501170pAR("/tiktok/v1/skylight/feed")
    Object fetchMixRankSkylightData(@InterfaceC1485405rg MixRankSkylightRequest mixRankSkylightRequest, InterfaceC1364105Vn<? super MixRankSkylightResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/story/get_feed_by_page")
    Object getStorySkylightData(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") long j2, @InterfaceC1501070pAH("insert_stories") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) long j3, @InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("need_story_notes") int i2, @InterfaceC1501070pAH("muf_count") int i3, @InterfaceC1501070pAH("following_count") int i4, @InterfaceC1501070pAH("recent_viewed_ids") String str2, @InterfaceC1501070pAH("group_info") String str3, @InterfaceC1501070pAH("story_top_count_limit") Long l, @InterfaceC1501070pAH("highlight_top_count_limit") Long l2, @InterfaceC1501070pAH("user_story_package_count_limit") Long l3, @InterfaceC1501070pAH("page_control_token") String str4, @InterfaceC1501070pAH("maf_story_exit") int i5, @InterfaceC1501070pAH("client_control_params") String str5, InterfaceC1364105Vn<? super StoryGetFeedByPageResponse> interfaceC1364105Vn);
}
