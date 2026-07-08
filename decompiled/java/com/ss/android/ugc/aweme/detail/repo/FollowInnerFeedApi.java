package com.ss.android.ugc.aweme.detail.repo;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface FollowInnerFeedApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/aweme/v2/follow/feed/inner_light")
    Object batchPreloadFollowInnerFeed(@InterfaceC1501100pAK("red_dot_state") Integer num, @InterfaceC1501100pAK("live_ids") Map<Long, Long> map, @InterfaceC1501100pAK("preload") int i, @InterfaceC1501100pAK("author_ids") String str, @InterfaceC1501100pAK("recent_read_item_ids") String str2, @InterfaceC1501100pAK("recent_unread_item_ids") String str3, InterfaceC1364105Vn<? super FollowInnerFeedPreloadResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v2/follow/feed/inner")
    Object getFollowInnerFeedList(@InterfaceC1501120pAM("cursor") String str, @InterfaceC1501120pAM("level") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("pull_type") Integer num, @InterfaceC1501120pAM("enter_time") Long l, @InterfaceC1501120pAM("refresh_index") Integer num2, @InterfaceC1501120pAM("filter_strategy") Integer num3, @InterfaceC1501120pAM("notice_is_display_live") Integer num4, @InterfaceC1501120pAM("aweme_id") Long l2, @InterfaceC1501120pAM("aweme_ids") String str2, @InterfaceC1501120pAM("feed_style") Integer num5, @InterfaceC1501120pAM("volume") String str3, @InterfaceC1501120pAM("preload") Integer num6, @InterfaceC1501120pAM("card_insert") String str4, @InterfaceC1501120pAM("client_cached_items") String str5, @InterfaceC1501120pAM("red_dot_state") Integer num7, @InterfaceC1501120pAM("recent_followed_uid") Long l3, @InterfaceC1501120pAM("type") Integer num8, @InterfaceC1501120pAM("author_id") String str6, @InterfaceC1501120pAM("session_read_item_ids") String str7, @InterfaceC1485405rg FollowFeedApiV2.FollowFeedPostBody followFeedPostBody, InterfaceC1364105Vn<? super FollowInnerFeedResponse> interfaceC1364105Vn);
}
