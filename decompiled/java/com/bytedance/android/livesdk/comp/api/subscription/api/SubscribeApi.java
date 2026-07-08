package com.bytedance.android.livesdk.comp.api.subscription.api;

import X.C0X9S;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1294060jmO;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.wallet.base.subscribe.CreateGiftSubContractResult;
import com.bytedance.android.live.wallet.base.subscribe.GiftSubFriendsListData;
import com.bytedance.android.live.wallet.base.subscribe.SendSubscriptionPanelData;
import com.bytedance.android.livesdk.subscribe.model.GetSubTimerDetailResponse;
import com.bytedance.android.livesdk.subscribe.model.UpdateTimerResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.GetInvitationStatusResponse;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationListData;
import com.bytedance.android.livesdk.subscribe.model.paypal.PaypalBindingUrl;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import emotes.model.SubEmoteDetailResult;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult;
import webcast.api.room.PreviewTimeReportResponse;
import webcast.api.smb.CreateSMBCourseOrderRequest;
import webcast.api.smb.CreateSMBCourseOrderResponse;
import webcast.api.smb.GetSMBCourseDetailResponse;
import webcast.api.smb.GetSMBCourseOrderStatusResponse;
import webcast.api.sub.APPBAppLaunchNotificationResponse;
import webcast.api.sub.CancelContractResult;
import webcast.api.sub.EmotePollEligibilityResponse;
import webcast.api.sub.GetAnchorSubscriptionResponse;
import webcast.api.sub.GetModeratorPinInfoResponse;
import webcast.api.sub.GetRecommendsRequest;
import webcast.api.sub.GetRecommendsResponse;
import webcast.api.sub.GetSubOnlyLiveStatResponse;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.ImageConvertResponse;
import webcast.api.sub.LeadsEventReportRequest;
import webcast.api.sub.LeadsEventReportResponse;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.SpotlightResponse;
import webcast.api.sub.SubDoOptOutRequest;
import webcast.api.sub.SubDoOptOutResponse;
import webcast.api.sub.SubGiftBatchSendRequest;
import webcast.api.sub.SubGiftBatchSendResponse;
import webcast.api.sub.SubManagementResponse;
import webcast.api.sub.SubOptOutActivateResponse;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;
import webcast.api.sub.SubPriceChangeConfirmResponse;
import webcast.api.sub.SubUnPinResponse;
import webcast.api.sub.TemplateListData;
import webcast.api.sub.UpdateEmoteRequest;
import webcast.api.sub.UpdateEmoteResponse;
import webcast.api.sub.UpsellHomeResponse;
import webcast.api.sub.UserEmotesResponse;
import webcast.api.sub.UserEmotesUploadRequest;
import webcast.api.sub.UserEmotesUploadResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface SubscribeApi {
    @InterfaceC1501160pAQ("/webcast/sub/privilege/polling_timer_align/")
    C11NZ<C470590Icr<n>> alignSubathonTimer(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501170pAR("/webcast/sub/gift/batch_send/")
    C11NZ<C470590Icr<SubGiftBatchSendResponse>> batchSendSubGift(@InterfaceC1485405rg SubGiftBatchSendRequest subGiftBatchSendRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/contract/cancel/")
    C11NZ<C470590Icr<CancelContractResult>> cancelSubContract(@InterfaceC1501050pAF("to_uid") String str);

    @InterfaceC1501170pAR("/webcast/sub/contract/sub_price_change_confirm/")
    C11NZ<C470590Icr<SubPriceChangeConfirmResponse>> confirmPriceChange(@InterfaceC1485405rg SubPriceChangeConfirmRequest subPriceChangeConfirmRequest);

    @InterfaceC1501170pAR("/webcast/smb/course/order/create/")
    C11NZ<C470590Icr<CreateSMBCourseOrderResponse.Data>> createSMBCourseOrder(@InterfaceC1485405rg CreateSMBCourseOrderRequest createSMBCourseOrderRequest);

    C11NZ<C470590Icr<CreateGiftSubContractResult>> createSubGiftContract(@InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH("tpl_id") String str2, @InterfaceC1501070pAH("device_tz") String str3, @InterfaceC1501070pAH("room_id") String str4, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("order_source") int i2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/gift/contract_create/")
    C11NZ<C470590Icr<CreateGiftSubContractResult>> createSubGiftContract(@InterfaceC1501050pAF("to_uid") String str, @InterfaceC1501050pAF("tpl_id") String str2, @InterfaceC1501050pAF("device_tz") String str3, @InterfaceC1501050pAF("room_id") String str4, @InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("order_source") int i2, @InterfaceC1501050pAF("usd_price_amount_micros") long j, @InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501170pAR("/webcast/sub/anchor/opt_out/do_opt_out/")
    C11NZ<C470590Icr<SubDoOptOutResponse.Data>> doOptOutOfSubscription(@InterfaceC1485405rg SubDoOptOutRequest subDoOptOutRequest);

    @InterfaceC1501160pAQ("/webcast/sub/anchor/subscription/management")
    C11NZ<C470590Icr<GetAnchorSubscriptionResponse.Data>> getAnchorSubscriptionInfo(@InterfaceC1501070pAH("room_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/anchor/tools/management/")
    C11NZ<C470590Icr<SubManagementResponse.Data>> getAnchorSubscriptionManagement(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/emote_poll/eligibility/")
    C11NZ<C470590Icr<EmotePollEligibilityResponse.Data>> getEmotePollEligibility(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_emote_detail/")
    C11NZ<C470590Icr<SubEmoteDetailResult>> getEmotesDetail(@InterfaceC1501070pAH("for_anchor") boolean z, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("reward_condition") int i);

    @InterfaceC1501160pAQ("webcast/sub/invitation/get_invitation_status/")
    C11NZ<C470590Icr<GetInvitationStatusResponse>> getInvitationState(@InterfaceC1501070pAH("invitation_code") String str);

    @InterfaceC1501160pAQ("/webcast/sub/invitation/get_invitation_list/")
    C11NZ<C470590Icr<SubInvitationListData>> getInviterList(@InterfaceC1501070pAH("count") int i);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_moderator_pin_info/")
    C11NZ<C470590Icr<GetModeratorPinInfoResponse.Data>> getModeratorPinInfo(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/sub/pay/binding_url")
    C11NZ<C470590Icr<PaypalBindingUrl>> getPaypalBindingUrl(@InterfaceC1501070pAH("return_url") String str);

    @InterfaceC1501160pAQ("/webcast/api/money/payout_onboarding/v2/onboarding_detail/")
    C11NZ<C470590Icr<PayoutOnboardingDetailResult.Data>> getPeriodicPayoutOnboardingNew(@InterfaceC1501070pAH("business_line") String str);

    @InterfaceC1501170pAR("/webcast/sub/user/price_change_notification/appb_app_launch/")
    C11NZ<C470590Icr<APPBAppLaunchNotificationResponse.Data>> getPriceChangeNotification(@InterfaceC1501070pAH("BillingType") int i);

    @InterfaceC1501160pAQ("/webcast/smb/course/order/status/")
    C11NZ<C470590Icr<GetSMBCourseOrderStatusResponse.Data>> getSMBOrderStatus(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("contract_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/smb/preview/")
    C11NZ<C470590Icr<SMBPreviewResponse.ResponseData>> getServicePlusPreview(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") String str2);

    @InterfaceC1501160pAQ("/webcast/sub/smb/qualification/")
    C11NZ<C470590Icr<SMBOptInQualificationResponse.ResponseData>> getSmbQualification();

    @InterfaceC1501160pAQ("/webcast/sub/privilege/spotlight/")
    C11NZ<C470590Icr<SpotlightResponse.ResponseData>> getSpotlightInfo(@InterfaceC1501070pAH("anchor_id") long j);

    @InterfaceC1501160pAQ("/webcast/sub/gift/friends/list/")
    C11NZ<C470590Icr<GiftSubFriendsListData>> getSubGiftFriendList(@InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/gift/send_subscription_panel/")
    @InterfaceC1294060jmO
    C11NZ<C470590Icr<SendSubscriptionPanelData>> getSubGiftPanelData(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("selected_id") String str2, @InterfaceC1501070pAH("room_id") String str3, @InterfaceC1501070pAH("price_region") String str4);

    @InterfaceC1501160pAQ("/webcast/sub/gift/send_subscription_panel/")
    C11NZ<C470590Icr<SendSubscriptionPanelData>> getSubGiftPanelData(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("selected_id") String str2, @InterfaceC1501070pAH("room_id") String str3, @InterfaceC1501070pAH("version") String str4, @InterfaceC1501070pAH("price_region") String str5);

    @InterfaceC1501160pAQ("/webcast/sub/gift/get_recommends/")
    C11NZ<C470590Icr<GetRecommendsResponse.Data>> getSubGiftRecommendData(@InterfaceC1501130pAN Map<String, Object> map);

    @InterfaceC1501170pAR("/webcast/sub/gift/get_recommends/")
    C11NZ<C470590Icr<GetRecommendsResponse.Data>> getSubGiftRecommendDataNew(@InterfaceC1485405rg GetRecommendsRequest getRecommendsRequest);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_privilege_detail/")
    C11NZ<C470590Icr<n>> getSubPrivilegeDetail(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("benefit_scene") int i, @InterfaceC1501070pAH("is_new_page") boolean z, @InterfaceC1501070pAH("live_sub_only_tier") long j, @InterfaceC1501070pAH("price_region") String str3);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_privilege_detail/")
    C11NZ<C470590Icr<GetSubPrivilegeDetailResponse.Data>> getSubPrivilegeDetailSpecific(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("benefit_scene") int i, @InterfaceC1501070pAH("is_new_page") boolean z, @InterfaceC1501070pAH("live_sub_only_tier") long j, @InterfaceC1501070pAH("price_region") String str3);

    @InterfaceC1501160pAQ("/webcast/sub/contract/tpl_list/")
    C11NZ<C470590Icr<TemplateListData>> getSubTemplateList(@InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("channel_order_ids_str") String str2, @InterfaceC1501070pAH("currency_code") String str3, @InterfaceC1501070pAH("live_sub_only_tier") long j, @InterfaceC1501070pAH("live_sub_only_month") long j2, @InterfaceC1501070pAH("fetch_privilege") boolean z, @InterfaceC1501070pAH("price_region") String str4);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_timer_detail/")
    C11NZ<C470590Icr<GetSubTimerDetailResponse.Data>> getSubathonTimer(@InterfaceC1501070pAH("for_anchor") boolean z, @InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_info/")
    C11NZ<C470590Icr<n>> getSubscribeInfo(@InterfaceC1501070pAH("need_current_state") boolean z, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("need_entrance_data") boolean z2, @InterfaceC1501070pAH("source") String str2, @InterfaceC1501070pAH("from_onboarding_completed") int i);

    @InterfaceC1501160pAQ("/webcast/sub/upsell/home/")
    C11NZ<C470590Icr<UpsellHomeResponse.ResponseData>> getUpsellHomeDetail();

    @InterfaceC1501160pAQ("/webcast/sub/privilege/user_emote/emotes/")
    C11NZ<C470590Icr<UserEmotesResponse.ResponseData>> getUserEmote(@InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/user/info/")
    C11NZ<C470590Icr<SubscribeUserInfoResponse>> getUserInfo(@InterfaceC1501070pAH("anchor_id") String str, @InterfaceC1501070pAH("live_sub_only_month") long j, @InterfaceC1501070pAH("live_sub_only_tier") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501170pAR("/webcast/sub/leads/event/report/")
    C11NZ<C470590Icr<LeadsEventReportResponse.Data>> leadsEventReport(@InterfaceC1485405rg LeadsEventReportRequest leadsEventReportRequest);

    @InterfaceC1501160pAQ("/webcast/smb/course/detail/")
    C11NZ<C470590Icr<GetSMBCourseDetailResponse.Data>> loadCourseDetail(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("course_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("iap_country_code") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/anchor/pin/")
    C11NZ<C470590Icr<SubPinResponse>> pinExplainCard(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("pin_id") long j2, @InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("sec_anchor_id") String str);

    @InterfaceC1501170pAR("/webcast/sub/anchor/opt_out/reactivate/")
    C11NZ<C470590Icr<SubOptOutActivateResponse.Data>> reactivateSubscription(@InterfaceC1485405rg SubOptOutActivateResponse subOptOutActivateResponse);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/preview_time/report/")
    C11NZ<C470590Icr<PreviewTimeReportResponse.ResponseData>> reportSubscribePreviewTime(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("preview_time_ms") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/contract/renew_reminder/")
    C11NZ<C470590Icr<Unit>> setRenewReminder(@InterfaceC1501050pAF("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/anchor/live/statistic/")
    C11NZ<C470590Icr<GetSubOnlyLiveStatResponse.GetSubOnlyLiveStatData>> subAnchorLiveStatistic(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501160pAQ("/webcast/sub/image/convert/")
    C0X9S<C470590Icr<ImageConvertResponse.Data>> subImageConvert(@InterfaceC1501070pAH("uris") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/anchor/unpin/")
    C11NZ<C470590Icr<SubUnPinResponse>> unpinExplainCard(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("unpin_id") long j2, @InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("sec_anchor_id") String str);

    @InterfaceC1501170pAR("/webcast/sub/privilege/update_emote/")
    C11NZ<UpdateEmoteResponse> updateEmotes(@InterfaceC1485405rg UpdateEmoteRequest updateEmoteRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/invitation/update_invitee_status/")
    C11NZ<C470590Icr<Unit>> updateInviteeState(@InterfaceC1501050pAF("op_type") int i, @InterfaceC1501050pAF("invitation_code") String str);

    @InterfaceC1501170pAR("/webcast/sub/privilege/spotlight/update/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<SpotlightResponse.ResponseData>> updateSpotlight(@InterfaceC1485405rg Map<String, Object> map);

    @InterfaceC1501170pAR("/webcast/sub/privilege/update_timer/")
    C11NZ<C470590Icr<UpdateTimerResponse.Data>> updateSubathonTimerPosition(@InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("timer_id") long j, @InterfaceC1501070pAH("sticker_x") long j2, @InterfaceC1501070pAH("sticker_y") long j3, @InterfaceC1501070pAH("screen_w") long j4, @InterfaceC1501070pAH("screen_h") long j5, @InterfaceC1501070pAH("room_id") long j6);

    @InterfaceC1501170pAR("/webcast/sub/privilege/update_timer/")
    C11NZ<C470590Icr<UpdateTimerResponse.Data>> updateSubathonTimerStatus(@InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("timer_id") long j, @InterfaceC1501070pAH("op_type") int i2, @InterfaceC1501070pAH("room_id") long j2);

    @InterfaceC1501170pAR("/webcast/sub/privilege/user_emote/emotes_upload/")
    C11NZ<C470590Icr<UserEmotesUploadResponse.ResponseData>> uploadUserEmote(@InterfaceC1485405rg UserEmotesUploadRequest userEmotesUploadRequest);
}
