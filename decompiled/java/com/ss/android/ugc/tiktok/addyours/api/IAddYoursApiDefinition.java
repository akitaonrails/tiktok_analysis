package com.ss.android.ugc.tiktok.addyours.api;

import X.C0X9S;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursDetailResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursInvitablesResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp;

/* JADX INFO: loaded from: classes10.dex */
public interface IAddYoursApiDefinition {
    @InterfaceC1501160pAQ("/tiktok/v1/addyours/profile/topics")
    C0X9S<HubFeedResponse> fetchHubFeed(@InterfaceC1501070pAH("viewed_user_id") long j, @InterfaceC1501070pAH("request_type") int i, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("load_type") int i2, @InterfaceC1501070pAH("count") int i3);

    @InterfaceC1501160pAQ("/tiktok/v1/addyours/invitables")
    Object getInvitables(@InterfaceC1501070pAH("topic_id") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("count") int i, InterfaceC1364105Vn<? super AddYoursInvitablesResp> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/detail")
    C0X9S<AddYoursDetailResp> getTopicDetail(@InterfaceC1501070pAH("topic_id") long j, @InterfaceC1501070pAH("from_question") boolean z, @InterfaceC1501070pAH("load_type") int i, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("enter_from") int i3, @InterfaceC1501070pAH("suggest_invitables_count") int i4, @InterfaceC1501070pAH("viewed_user_id") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/addyours/notice/videos")
    C0X9S<AddYoursNoticeVideosResp> getTopicParticipants(@InterfaceC1501070pAH("topic_id") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("pass_through") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/sticker")
    Object getTopicSticker(@InterfaceC1501070pAH("topic_id") Long l, @InterfaceC1501070pAH("text") String str, InterfaceC1364105Vn<? super AddYoursTopicStickerResp> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/addyours/invite")
    Object invite(@InterfaceC1501050pAF("invitees") String str, @InterfaceC1501050pAF("topic_id") long j, @InterfaceC1501050pAF("item_id") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/addyours/topic/collect")
    Object markCollectedStatus(@InterfaceC1501050pAF("topic_id") long j, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
