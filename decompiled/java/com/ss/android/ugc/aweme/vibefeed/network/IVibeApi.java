package com.ss.android.ugc.aweme.vibefeed.network;

import X.C629310OmH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.vibefeed.model.SummaryPageResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeConfigResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedAcceptResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedCloseResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedItemListResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedStatusResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeReachResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public interface IVibeApi {
    public static final C629310OmH LIZ = C629310OmH.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/accept_invite")
    Object acceptInvite(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("inviter_user_id") String str2, @InterfaceC1501050pAF("mutual_feed_scene") int i, @InterfaceC1501050pAF("conversation_short_id") String str3, InterfaceC1364105Vn<? super VibeFeedAcceptResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/close")
    Object closeVibeFeed(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("mutual_feed_scene") int i, @InterfaceC1501050pAF("conversation_short_id") String str3, InterfaceC1364105Vn<? super VibeFeedCloseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/check/feed_status")
    Object fetchFeedStatus(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("item_ids") String str3, @InterfaceC1501050pAF("mutual_feed_scene") int i, @InterfaceC1501050pAF("conversation_short_id") String str4, InterfaceC1364105Vn<? super VibeFeedStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v2/mutual_feed/get_config")
    Object getVibeConfig(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("to_user_id") String str2, @InterfaceC1501070pAH("mutual_feed_scene") int i, @InterfaceC1501070pAH("conversation_short_id") String str3, InterfaceC1364105Vn<? super VibeConfigResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/item_list")
    Object getVibeFeedItemList(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("insert_item_ids") String str3, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("need_like_status") boolean z, @InterfaceC1501050pAF("need_visited_status") boolean z2, @InterfaceC1501050pAF("feed_id_for_viewed_gid_list") String str4, @InterfaceC1501050pAF("mutual_feed_scene") int i2, @InterfaceC1501050pAF("conversation_short_id") String str5, @InterfaceC1501050pAF("next_cursor") String str6, @InterfaceC1501050pAF("page_size") int i3, @InterfaceC1501050pAF("sort_order") int i4, InterfaceC1364105Vn<? super VibeFeedItemListResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/summary_page")
    Object getVibeFeedSummary(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("need_history_stats") boolean z, @InterfaceC1501050pAF("need_like_stats") boolean z2, @InterfaceC1501050pAF("co_liked_video_next_page_count") int i, @InterfaceC1501050pAF("co_liked_video_prev_page_count") int i2, @InterfaceC1501050pAF("feed_id") String str3, @InterfaceC1501050pAF("need_skip_feed_id") boolean z3, @InterfaceC1501050pAF("mutual_feed_scene") int i3, @InterfaceC1501050pAF("conversation_short_id") String str4, @InterfaceC1501050pAF("limit") int i4, @InterfaceC1501050pAF("offset") int i5, @InterfaceC1501050pAF("limit_current_feed") boolean z4, InterfaceC1364105Vn<? super SummaryPageResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/send_invite")
    Object sendInvite(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("mutual_feed_scene") int i, @InterfaceC1501050pAF("conversation_short_id") String str3, InterfaceC1364105Vn<? super VibeFeedInviteResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/submit/stats")
    Object submitVibeStats(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("stats_delta_list") String str3, @InterfaceC1501050pAF("visited_item_ids") String str4, @InterfaceC1501050pAF("mutual_feed_scene") int i, @InterfaceC1501050pAF("conversation_short_id") String str5, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v2/mutual_feed/reach")
    Object vibeConsumeReach(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF("to_user_id") String str2, @InterfaceC1501050pAF("feed_id") String str3, @InterfaceC1501050pAF("message_info") String str4, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("mutual_feed_scene") int i2, @InterfaceC1501050pAF("conversation_short_id") String str5, InterfaceC1364105Vn<? super VibeReachResponse> interfaceC1364105Vn);
}
