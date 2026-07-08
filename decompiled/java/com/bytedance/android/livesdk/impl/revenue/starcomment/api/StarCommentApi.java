package com.bytedance.android.livesdk.impl.revenue.starcomment.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import tikcast.api.star_comment.StarCommentDeleteResponse;
import tikcast.api.star_comment.StarCommentGetQueueResponse;
import tikcast.api.star_comment.StarCommentPurchasePageResponse;
import tikcast.api.star_comment.StarCommentPurchaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface StarCommentApi {
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/delete/")
    C11NZ<C470590Icr<StarCommentDeleteResponse.Data>> deleteStarComment(@InterfaceC1501070pAH("star_comment_msg_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("client_cur_msg_start_time_ms") long j, @InterfaceC1501070pAH("current_version") int i, @InterfaceC1501070pAH("role") int i2, @InterfaceC1501070pAH("need_ban") boolean z);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/delete/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    C11NZ<C470590Icr<StarCommentDeleteResponse.Data>> deleteStarCommentWithParameter(@InterfaceC1501070pAH("star_comment_msg_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("client_cur_msg_start_time_ms") long j, @InterfaceC1501070pAH("current_version") int i, @InterfaceC1501070pAH("role") int i2, @InterfaceC1501070pAH("need_ban") boolean z);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/purchase_page/")
    C11NZ<C470590Icr<StarCommentPurchasePageResponse.Data>> getPurchasePage(@InterfaceC1501070pAH("request_type") int i, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("room_user_count") long j, @InterfaceC1501070pAH("coins") long j2, @InterfaceC1501070pAH("current_version") long j3);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/purchase_page/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    C11NZ<C470590Icr<StarCommentPurchasePageResponse.Data>> getPurchasePageWithParameter(@InterfaceC1501070pAH("request_type") int i, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("room_user_count") long j, @InterfaceC1501070pAH("coins") long j2, @InterfaceC1501070pAH("current_version") long j3);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/get_queue/")
    C11NZ<C470590Icr<StarCommentGetQueueResponse.Data>> getStarCommentQueue(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("current_version") int i2, @InterfaceC1501070pAH("client_cur_msg_start_time_ms") long j, @InterfaceC1501070pAH("client_reserve") String str3);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/get_queue/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    C11NZ<C470590Icr<StarCommentGetQueueResponse.Data>> getStarCommentQueueWithParameter(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("role") int i, @InterfaceC1501070pAH("current_version") int i2, @InterfaceC1501070pAH("client_cur_msg_start_time_ms") long j, @InterfaceC1501070pAH("client_reserve") String str3);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/purchase/")
    C11NZ<BaseResponse<StarCommentPurchaseResponse.Data, GiftSendResponse.GiftExtra>> purchaseComment(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("room_user_count") long j, @InterfaceC1501070pAH("content") String str3, @InterfaceC1501070pAH("option") int i, @InterfaceC1501070pAH("coins") long j2, @InterfaceC1501070pAH("current_score") long j3, @InterfaceC1501070pAH("current_version") int i2, @InterfaceC1501070pAH("client_cur_msg_start_time_ms") long j4, @InterfaceC1501070pAH("ug_exchange") int i3, @InterfaceC1501070pAH("enter_from") String str4);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR("/webcast/privilege/star_comment/purchase/")
    @InterfaceC1501310pAf({"privilege-arch-version: 1"})
    C11NZ<BaseResponse<StarCommentPurchaseResponse.Data, GiftSendResponse.GiftExtra>> purchaseCommentWithParameter(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("room_user_count") long j, @InterfaceC1501070pAH("content") String str3, @InterfaceC1501070pAH("option") int i, @InterfaceC1501070pAH("coins") long j2, @InterfaceC1501070pAH("current_score") long j3, @InterfaceC1501070pAH("current_version") int i2, @InterfaceC1501070pAH("client_cur_msg_start_time_ms") long j4, @InterfaceC1501070pAH("ug_exchange") int i3, @InterfaceC1501070pAH("enter_from") String str4, @InterfaceC1501070pAH("emotes_with_index") String str5);
}
