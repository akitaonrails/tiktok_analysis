package com.ss.android.ugc.aweme.hangout.container.model;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetRandomMatchStateReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetRandomMatchStateResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.HangoutTabReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.HangoutTabResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendRoomsReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendRoomsResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.TopLiveRecommendRoomResp;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;

/* JADX INFO: loaded from: classes8.dex */
public interface IMultiTopLivePageApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/random_match_guest_cancel/")
    Object cancelRandomMatch(@InterfaceC1485405rg RandomMatchGuestCancelReq randomMatchGuestCancelReq, InterfaceC1364105Vn<? super C470590Icr<RandomMatchGuestCancelResp.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/feed/")
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> fetchPlayFeed(@InterfaceC1501070pAH("req_from") String str);

    @InterfaceC1501160pAQ("/webcast/feed/")
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> fetchPlayFeed(@InterfaceC1501070pAH("req_from") String str, @InterfaceC1501070pAH("mg_agg_id") String str2);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/hangout/tab/")
    Object getHangoutTab(@InterfaceC1485405rg HangoutTabReq hangoutTabReq, InterfaceC1364105Vn<? super C470590Icr<HangoutTabResp.ResponseData>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/top_live_recommend_room/")
    AbstractC19484711Kz<C470590Icr<TopLiveRecommendRoomResp.ResponseData>> getPushCardData();

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/get_random_match_state/")
    Object getRandomMatchState(@InterfaceC1485405rg GetRandomMatchStateReq getRandomMatchStateReq, InterfaceC1364105Vn<? super C470590Icr<GetRandomMatchStateResp>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/recommend_rooms/")
    Object getRecommendRooms(@InterfaceC1485405rg RecommendRoomsReq recommendRoomsReq, InterfaceC1364105Vn<? super C470590Icr<RecommendRoomsResp.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/feed/")
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> getRoomList(@InterfaceC1501070pAH("req_from") String str);

    @InterfaceC1501160pAQ("/webcast/feed/")
    @C09SO(EnumC1846380y9E.FEED)
    @InterfaceC1501320pAg(3)
    @InterfaceC1501290pAd(4)
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> getRoomListWithAggID(@InterfaceC1501070pAH("req_from") String str, @InterfaceC1501070pAH("mg_agg_id") String str2);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/recommend_ack/")
    Object recommendAck(@InterfaceC1485405rg RecommendAckReq recommendAckReq, InterfaceC1364105Vn<? super C470590Icr<RecommendAckResp.ResponseData>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/random_match_start/")
    Object startRandomMatch(@InterfaceC1485405rg RandomMatchStartReq randomMatchStartReq, InterfaceC1364105Vn<? super C470590Icr<RandomMatchStartResp.ResponseData>> interfaceC1364105Vn);
}
