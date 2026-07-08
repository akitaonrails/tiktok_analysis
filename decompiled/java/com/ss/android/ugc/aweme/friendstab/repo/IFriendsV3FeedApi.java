package com.ss.android.ugc.aweme.friendstab.repo;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2177008fw;

/* JADX INFO: loaded from: classes25.dex */
public interface IFriendsV3FeedApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/friend/get_plain_text_detail")
    Object getFriendsTextDetail(@InterfaceC1501050pAF("aweme_ids") String str, @InterfaceC1501050pAF("comment_order") int i, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/friend/get_plain_text_list")
    Object getFriendsTextHistory(@InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("comment_order") int i2, @InterfaceC1501050pAF("feed_page_token") String str, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/friend/get_feed_by_waterfall")
    Object getFriendsV3Feeds(@InterfaceC1501050pAF("feed_page_token") String str, @InterfaceC1501050pAF("feed_page_token_up") String str2, @InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("pull_type") int i2, @InterfaceC1501050pAF("source") int i3, @InterfaceC1501050pAF("preload") int i4, @InterfaceC1501050pAF("preload_scene") String str3, @InterfaceC1501050pAF("last_refresh_time") Long l, @InterfaceC1501050pAF("max_display_comment_count") int i5, @InterfaceC1501050pAF("is_non_personalized") int i6, @InterfaceC1501050pAF("comment_order") int i7, @InterfaceC1501050pAF("aweme_ids") String str4, @InterfaceC2177008fw Object obj, @InterfaceC1501050pAF("red_dot_uid") String str5, @InterfaceC1501050pAF("red_dot_item_id") String str6, @InterfaceC1501050pAF("client_read_gids") String str7, @InterfaceC1501050pAF("client_read_gids_all") String str8, @InterfaceC1501050pAF("client_read_gids_notification") String str9, @InterfaceC1501050pAF("client_unread_gids") String str10, @InterfaceC1501050pAF("landing_strategy") Integer num, @InterfaceC1501050pAF("session_shown_maf_ids") String str11, @InterfaceC1501050pAF("order_type") int i8, @InterfaceC1501050pAF("need_story_reveal_promo_card") Boolean bool, @InterfaceC1501050pAF("scroll_level") Integer num2, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn);
}
