package com.bytedance.android.livesdk.comp.api.pcs.data.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC820680WHi;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisFormRequest;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisFormResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisInteractiveDataRequest;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisVerifyDataResponse;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.TetrisVerifyInteractiveRequest;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import kotlin.Unit;
import webcast.api.smb.CommentIdentificationReq;
import webcast.api.smb.CommentIdentificationResp;
import webcast.api.smb.CreateSMBCourseOrderRequest;
import webcast.api.smb.CreateSMBCourseOrderResponse;
import webcast.api.smb.GetSMBCourseDetailResponse;
import webcast.api.smb.GetSMBCourseOrderStatusResponse;
import webcast.api.smb.GetSMBOptInProgressResponse;
import webcast.api.smb.ListSMBCourseVideosRequest;
import webcast.api.smb.ListSMBCourseVideosResponse;
import webcast.api.smb.ReportHighIntentUserReq;
import webcast.api.smb.ReportHighIntentUserResp;
import webcast.api.smb.SMBBannerInfoResponse;
import webcast.api.smb.SMBBookingEventResponse;
import webcast.api.smb.SMBBookingEventStatusUpdateRequest;
import webcast.api.smb.SMBBookingEventStatusUpdateResponse;
import webcast.api.smb.SMBFormDetailResponse;
import webcast.api.smb.SMBThirdPartyLinkGetBySkuResponse;
import webcast.api.smb.TriggerAIDMRequest;
import webcast.api.smb.TriggerAIDMResponse;
import webcast.api.sub.LeadsEventReportRequest;
import webcast.api.sub.LeadsEventReportResponse;
import webcast.api.sub.SMBBasicInfoEditRequest;
import webcast.api.sub.SMBMyServicePlusResponse;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SMBOptInRequest;
import webcast.api.sub.SMBOptInResponse;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.SMBServiceOptFormRequest;
import webcast.api.sub.SMBServiceSwitchInfoResponse;
import webcast.api.sub.SMBSetupInfoResponse;
import webcast.api.sub.SubQueueActionRequest;
import webcast.api.sub.SubQueueActionResponse;
import webcast.api.sub.SubQueueInfoResponse;
import webcast.api.sub.SubUnPinResponse;
import webcast.api.sub.UpdateDMStatusRequest;
import webcast.api.sub.UpdateDMStatusResponse;
import webcast.api.sub.UpdateSMBSetupInfoRequest;
import webcast.api.sub.UpdateSMBSetupInfoResponse;
import webcast.api.sub.UpsellHomeResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface PcsApi {
    @InterfaceC1501170pAR("/webcast/smb/course/order/create/")
    Object createSMBCourseOrderSuspend(@InterfaceC1485405rg CreateSMBCourseOrderRequest createSMBCourseOrderRequest, InterfaceC1364105Vn<? super C470590Icr<CreateSMBCourseOrderResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/sub/queue/action")
    C11NZ<C470590Icr<SubQueueActionResponse.ResponseData>> doSubQueueAction(@InterfaceC1485405rg SubQueueActionRequest subQueueActionRequest);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/live_center/task/event_report/")
    C11NZ<C470590Icr<Unit>> finishSmbTask(@InterfaceC1501050pAF("event_type") int i);

    @InterfaceC1501160pAQ("/webcast/smb/booking/event/")
    Object getCalendlyBookingInfo(@InterfaceC1501070pAH("event_id") String str, @InterfaceC1501070pAH("sku_id") long j, @InterfaceC1501070pAH("sec_anchor_id") String str2, @InterfaceC1501070pAH("room_id") long j2, InterfaceC1364105Vn<? super C470590Icr<SMBBookingEventResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/smb/efficiency/comment_identification/")
    C11NZ<C470590Icr<CommentIdentificationResp.ResponseData>> getHighIntentCommentIdentification(@InterfaceC1485405rg CommentIdentificationReq commentIdentificationReq);

    @InterfaceC1501170pAR
    C11NZ<C470590Icr<TetrisVerifyDataResponse>> getInteractiveData(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TetrisInteractiveDataRequest tetrisInteractiveDataRequest);

    @InterfaceC1501160pAQ("/webcast/sub/smb/my_service_plus/")
    C11NZ<C470590Icr<SMBMyServicePlusResponse.ResponseData>> getMyServicePlusInfo(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/smb/form/detail/")
    C11NZ<C470590Icr<SMBFormDetailResponse.ResponseData>> getSMBFormDetail(@InterfaceC1501070pAH("form_id") long j, @InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/upsell/one_stop_shop_setup/info/")
    C11NZ<C470590Icr<SMBSetupInfoResponse.ResponseData>> getSMBOneStopSetupState(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("need_setup_data") boolean z);

    @InterfaceC1501160pAQ("/webcast/smb/course/order/status/")
    Object getSMBOrderStatusSuspend(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("contract_id") String str, InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseOrderStatusResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/sub/smb/preview/")
    C11NZ<C470590Icr<SMBPreviewResponse.ResponseData>> getServicePlusPreview(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("room_id") String str2);

    @InterfaceC1501160pAQ("/webcast/sub/smb/service_switch_info/")
    Object getServiceSwitchInfo(@InterfaceC1501070pAH("skip_industry_selection") boolean z, InterfaceC1364105Vn<? super C470590Icr<SMBServiceSwitchInfoResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/smb/banner/info/")
    C11NZ<C470590Icr<SMBBannerInfoResponse.ResponseData>> getSmbBannerInfo();

    @InterfaceC1501160pAQ("/webcast/smb/opt_in/progress/")
    Object getSmbOptInProgress(InterfaceC1364105Vn<? super C470590Icr<GetSMBOptInProgressResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/sub/smb/qualification/")
    C11NZ<C470590Icr<SMBOptInQualificationResponse.ResponseData>> getSmbQualification();

    @InterfaceC1501160pAQ("/webcast/sub/queue/info/")
    C11NZ<C470590Icr<SubQueueInfoResponse.ResponseData>> getSubQueueInfo(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("queue_id") String str2, @InterfaceC1501070pAH("room_id") String str3, @InterfaceC1501070pAH("with_member") boolean z);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/get_sub_info/")
    C11NZ<C470590Icr<n>> getSubscribeInfo(@InterfaceC1501070pAH("need_current_state") boolean z, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("need_entrance_data") boolean z2, @InterfaceC1501070pAH("source") String str2, @InterfaceC1501070pAH("from_onboarding_completed") int i);

    @InterfaceC1501160pAQ("/webcast/smb/third_party_link/get_by_sku/")
    Object getThirdPartyLinkBySku(@InterfaceC1501070pAH("sku_id") long j, @InterfaceC1501070pAH("sec_anchor_id") String str, InterfaceC1364105Vn<? super C470590Icr<SMBThirdPartyLinkGetBySkuResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/sub/upsell/home/")
    C11NZ<C470590Icr<UpsellHomeResponse.ResponseData>> getUpsellHomeDetail();

    @InterfaceC1501170pAR("/webcast/sub/leads/event/report/")
    C11NZ<C470590Icr<LeadsEventReportResponse.Data>> leadsEventReport(@InterfaceC1485405rg LeadsEventReportRequest leadsEventReportRequest);

    @InterfaceC1501160pAQ("/webcast/smb/course/detail/")
    C11NZ<C470590Icr<GetSMBCourseDetailResponse.Data>> loadCourseDetail(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("course_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("iap_country_code") String str);

    @InterfaceC1501160pAQ("/webcast/smb/course/detail/")
    Object loadCourseDetailSuspend(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("course_id") long j2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("iap_country_code") String str, InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseDetailResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/smb/course/video/list/")
    Object loadCourseVideos(@InterfaceC1485405rg ListSMBCourseVideosRequest listSMBCourseVideosRequest, InterfaceC1364105Vn<? super C470590Icr<ListSMBCourseVideosResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/smb/efficiency/report_high_intent_user/")
    C11NZ<C470590Icr<ReportHighIntentUserResp.ResponseData>> postHighIntentUserData(@InterfaceC1485405rg ReportHighIntentUserReq reportHighIntentUserReq);

    @InterfaceC1501170pAR("/webcast/sub/smb/basic_info/edit/")
    Object requestBasicInfoEdit(@InterfaceC1485405rg SMBBasicInfoEditRequest sMBBasicInfoEditRequest, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/sub/smb/service_opt/form/")
    Object requestServiceOptForm(@InterfaceC1485405rg SMBServiceOptFormRequest sMBServiceOptFormRequest, InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/sub/smb/opt_in/")
    Object requestSmbOptIn(@InterfaceC1485405rg SMBOptInRequest sMBOptInRequest, InterfaceC1364105Vn<? super C470590Icr<SMBOptInResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR
    C11NZ<TetrisFormResponse> submitTetrisForm(@InterfaceC820680WHi boolean z, @InterfaceC2174708fZ String str, @InterfaceC1485405rg TetrisFormRequest tetrisFormRequest);

    @InterfaceC1501170pAR("/webcast/sub/smb/ai_dm/trigger/")
    Object triggerAIDM(@InterfaceC1485405rg TriggerAIDMRequest triggerAIDMRequest, InterfaceC1364105Vn<? super C470590Icr<TriggerAIDMResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/anchor/unpin/")
    C11NZ<C470590Icr<SubUnPinResponse>> unpinExplainCard(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("unpin_id") long j2, @InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("sec_anchor_id") String str);

    @InterfaceC1501170pAR("/webcast/smb/booking/status_update/")
    Object updateCalendlyDmConfirmStatus(@InterfaceC1485405rg SMBBookingEventStatusUpdateRequest sMBBookingEventStatusUpdateRequest, InterfaceC1364105Vn<? super C470590Icr<SMBBookingEventStatusUpdateResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/sub/upsell/update_dm_status/")
    Object updateDMStatus(@InterfaceC1485405rg UpdateDMStatusRequest updateDMStatusRequest, InterfaceC1364105Vn<? super C470590Icr<UpdateDMStatusResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/sub/upsell/one_stop_shop_setup/update/")
    C11NZ<C470590Icr<UpdateSMBSetupInfoResponse.ResponseData>> updateSMBOneStopSetupState(@InterfaceC1485405rg UpdateSMBSetupInfoRequest updateSMBSetupInfoRequest);

    @InterfaceC1501170pAR
    C11NZ<C470590Icr<Object>> verifyInteractive(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TetrisVerifyInteractiveRequest tetrisVerifyInteractiveRequest);
}
