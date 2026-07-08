package com.ss.android.ugc.aweme.im.common.api;

import X.AbstractC19483511Kn;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501330pAh;
import X.InterfaceC1501350pAj;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.common.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.common.model.BatchStrangerUnlimitRequestBody;
import com.ss.android.ugc.aweme.im.common.model.BatchStrangerUnlimitResponse;
import com.ss.android.ugc.aweme.im.common.model.ChatInviteAcceptResponse;
import com.ss.android.ugc.aweme.im.common.model.ChatInviteShareResponse;
import com.ss.android.ugc.aweme.im.common.model.CreateGroupChatEntryResponse;
import com.ss.android.ugc.aweme.im.common.model.ExposureBody;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutDataRequestBody;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutDataResponse;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutPopupResponse;
import com.ss.android.ugc.aweme.im.common.model.ImChatNoticeModel;
import com.ss.android.ugc.aweme.im.common.model.InboxEntranceUpdateResponse;
import com.ss.android.ugc.aweme.im.common.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.common.model.PublicResourceRequest;
import com.ss.android.ugc.aweme.im.common.model.PublicResourceResponse;
import com.ss.android.ugc.aweme.im.common.model.ShareStateResponse;
import com.ss.android.ugc.aweme.im.common.model.TiktokV1ImInboxDataGetRequest;
import com.ss.android.ugc.aweme.im.common.model.TiktokV1ImInboxDataGetResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface TikTokImApi {
    @InterfaceC1501240pAY("im/chat_invite/accept/")
    @InterfaceC1501300pAe
    Object acceptChatInvite(@InterfaceC1501050pAF("long_url") String str, @InterfaceC1501050pAF("user_id") long j, InterfaceC1364105Vn<? super ChatInviteAcceptResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/group/invite/accept/")
    @InterfaceC1501300pAe
    Object acceptInviteCard(@InterfaceC1501050pAF("invite_id") String str, InterfaceC1364105Vn<? super AcceptInviteCardResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/chat/notice/ack/")
    @InterfaceC1501300pAe
    Object acknowledgeNoticeRead(@InterfaceC1501050pAF("notice_code") String str, @InterfaceC1501050pAF("source_type") String str2, @InterfaceC1501050pAF("operation_code") int i, @InterfaceC1501050pAF("conversation_id") String str3, @InterfaceC1501050pAF("payload") String str4, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("im/chat/stranger/batch/unlimit")
    Object batchPostChatStrangeUnlimit(@InterfaceC1485405rg BatchStrangerUnlimitRequestBody batchStrangerUnlimitRequestBody, InterfaceC1364105Vn<? super BatchStrangerUnlimitResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/message/expose")
    @InterfaceC1501300pAe
    Object batchReportMsgHasSeen(@InterfaceC1501050pAF("server_message_ids") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/chat/rec/exposure")
    Object exposureCreateGroupChatEntry(@InterfaceC1485405rg ExposureBody exposureBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("im/chat/notice/")
    Object getChatNotice(@InterfaceC1501120pAM("need_graduation_banner_check") boolean z, @InterfaceC1501120pAM("to_user_id") String str, @InterfaceC1501120pAM("sec_to_user_id") String str2, @InterfaceC1501120pAM("conversation_id") String str3, @InterfaceC1501120pAM("entrance_type") int i, @InterfaceC1501120pAM("source_type") String str4, @InterfaceC1501120pAM("unread_count") int i2, @InterfaceC1501120pAM("push_status") int i3, @InterfaceC1501120pAM("has_chat_history") boolean z2, @InterfaceC1501120pAM("app_status") int i4, @InterfaceC1501120pAM("has_ack_activity_status") boolean z3, @InterfaceC1501120pAM("is_recommended_chat") boolean z4, @InterfaceC1501120pAM("top_n_unread_count") int i5, @InterfaceC1501120pAM("inbox_mode") int i6, @InterfaceC1501120pAM("notice_extra") String str5, @InterfaceC1501120pAM("b2c_from_user_tag") String str6, InterfaceC1364105Vn<? super ImChatNoticeModel> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/comment/status/batch_get/v1")
    AbstractC19483511Kn<Object> getCommentStatusBatch(@InterfaceC1501120pAM("cids") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/im/group/chat/rec/info")
    Object getCreateGroupChatEntry(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super CreateGroupChatEntryResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/group/layout/popup")
    @InterfaceC1501300pAe
    Object getFanGroupRemovedPopup(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("conv_short_id") long j, InterfaceC1364105Vn<? super GroupLayoutPopupResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/group/invite/share/")
    @InterfaceC1501300pAe
    Object getGroupInviteInfo(@InterfaceC1501050pAF("conversation_short_id") String str, @InterfaceC1501050pAF("invite_channel") int i, @InterfaceC1501050pAF("reset_link") boolean z, InterfaceC1364105Vn<? super GroupInviteInfoModel> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/group/layout/qrcode")
    Object getGroupLayout(@InterfaceC1501350pAj("Content-Type") String str, @InterfaceC1485405rg GroupLayoutDataRequestBody groupLayoutDataRequestBody, InterfaceC1364105Vn<? super GroupLayoutDataResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/group/invite/verify/")
    @InterfaceC1501300pAe
    Object getInviteCardDetailInner(@InterfaceC1501050pAF("invite_id") String str, InterfaceC1364105Vn<? super InviteCardDetailInnerResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("im/spotlight/multi_relation/")
    Object getSharePermissionForTTNContent(@InterfaceC1501120pAM("sec_to_user_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, InterfaceC1364105Vn<? super ShareStateResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/inbox/entrance_update")
    @InterfaceC1501300pAe
    Object inboxEntranceUpdate(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i, @InterfaceC1501050pAF("operation") int i2, InterfaceC1364105Vn<? super InboxEntranceUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/chat/stranger/unlimit")
    @InterfaceC1501300pAe
    Object postChatStrangeUnlimit(@InterfaceC1501050pAF("to_user_id") long j, @InterfaceC1501050pAF("conversation_id") String str, @InterfaceC1501050pAF("set_category") Integer num, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("videos/detail/")
    @InterfaceC1501300pAe
    Object queryAwemeList(@InterfaceC1501050pAF("aweme_ids") String str, @InterfaceC1501050pAF("origin_type") String str2, @InterfaceC1501050pAF("request_source") int i, InterfaceC1364105Vn<? super AwemeDetailList> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/public/resource/refresh")
    C11NZ<PublicResourceResponse> refreshPublicResources(@InterfaceC1485405rg PublicResourceRequest publicResourceRequest);

    @InterfaceC1501160pAQ("im/reboot/misc/")
    Object reportInhouseLogin(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/chat_invite/share/")
    @InterfaceC1501300pAe
    Object shareChatInvite(@InterfaceC1501050pAF("user_id") long j, @InterfaceC1501050pAF("extra") String str, InterfaceC1364105Vn<? super ChatInviteShareResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/im/media_message/unmask")
    Object unmask(@InterfaceC1501120pAM("inbox_type") int i, @InterfaceC1501120pAM("conversation_type") int i2, @InterfaceC1501120pAM("conversation_id") String str, @InterfaceC1501120pAM("conversation_short_id") long j, @InterfaceC1501120pAM("selected_server_message_id") long j2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i3, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("im/inbox_data/get/")
    Object updateConversationProperties(@InterfaceC1485405rg TiktokV1ImInboxDataGetRequest tiktokV1ImInboxDataGetRequest, InterfaceC1364105Vn<? super TiktokV1ImInboxDataGetResponse> interfaceC1364105Vn);
}
