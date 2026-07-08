package com.bytedance.touchpoint.api.interfaces;

import X.C15O7;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.bytedance.touchpoint.api.model.AttributionBody;
import com.bytedance.touchpoint.api.model.AttributionResponse;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.touchpoint.api.model.InviteInfo;
import com.bytedance.touchpoint.api.model.PopupReportModel;
import com.bytedance.touchpoint.api.model.ReferralWidgetResponse;
import com.bytedance.touchpoint.api.model.TaskDoneBody;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.TaskEventResponse;
import com.bytedance.touchpoint.api.model.TaskInfo;
import com.bytedance.touchpoint.api.model.TouchPointsResponse;
import com.bytedance.touchpoint.api.model.TransformLinkResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface INetworkApi {
    @InterfaceC1501170pAR
    C15O7<String> confirmAgeGate(@InterfaceC2174708fZ String str);

    @InterfaceC1501170pAR("/tiktok/touchpoint/platform/touchpoint/report_media_source/v1/")
    ListenableFuture<AttributionResponse> confirmAttribution(@InterfaceC1485405rg AttributionBody attributionBody);

    @InterfaceC1501160pAQ("{endpoint}")
    ListenableFuture<String> dynamicGet(@InterfaceC1501060pAG(encode = false, value = "endpoint") String str, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501170pAR("{endpoint}")
    ListenableFuture<String> dynamicPost(@InterfaceC1501060pAG(encode = false, value = "endpoint") String str, @InterfaceC1485405rg Map<String, String> map);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/coin/client_task_done")
    ListenableFuture<TaskDoneReponse> getCoinTaskAwardByTaskId(@InterfaceC1501070pAH("task_key") String str, @InterfaceC1501070pAH("task_time") int i, @InterfaceC1501070pAH("watch_time") long j, @InterfaceC1501070pAH("with_pet") Integer num, @InterfaceC1485405rg TaskDoneBody taskDoneBody);

    @InterfaceC1501160pAQ("/tiktok/touchpoint/user/widget/launchplan/get")
    ListenableFuture<ReferralWidgetResponse> getReferralAppWidgetInfo();

    @InterfaceC1501170pAR("/luckycat/tiktokm/v1/task/done/{task_id}")
    ListenableFuture<TaskDoneReponse> getTaskAwardByTaskId(@InterfaceC1501060pAG("task_id") String str, @InterfaceC1501070pAH("task_time") int i);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/task/done/{task_id}")
    ListenableFuture<TaskDoneReponse> getTaskAwardByTaskIdWithNewPath(@InterfaceC1501060pAG("task_id") String str, @InterfaceC1501070pAH("task_time") int i);

    @InterfaceC1501160pAQ("/tiktok/touchpoint/user/launchplan/get/v1/")
    ListenableFuture<TouchPointsResponse> getTouchPoint(@InterfaceC1501070pAH("request_type") Integer num);

    @InterfaceC1501160pAQ("/tiktok/touchpoint/user/launchplan/get/v1/")
    ListenableFuture<TouchPointsResponse> getTouchPointById(@InterfaceC1501070pAH("touchpoint_id") int i, @InterfaceC1501070pAH("mentor_uid") String str, @InterfaceC1501070pAH("onboarded") String str2, @InterfaceC1501070pAH("installed") String str3);

    @InterfaceC1501160pAQ("/tiktok/touchpoint/user/launchplan/preview/v1/")
    ListenableFuture<String> getTouchPointPreview(@InterfaceC1501130pAN(encode = false) Map<String, String> map, @InterfaceC2175608fi Map<String, String> map2);

    @InterfaceC1501160pAQ("/tiktok/incentive/user/product_facade/data/get/v1/")
    ListenableFuture<TouchPointsResponse> getTouchPointWithNewPath(@InterfaceC1501070pAH("request_type") Integer num, @InterfaceC1501070pAH("crossday_delay_min") int i, @InterfaceC1501070pAH("touchpoint_ids") String str, @InterfaceC1501070pAH("prototype_list") String str2, @InterfaceC1501070pAH("action_list") String str3);

    @InterfaceC1501160pAQ("/tiktok/incentive/user/product_facade/data/get/v1/")
    ListenableFuture<TouchPointsResponse> getTouchPointWithTriggerCondition(@InterfaceC1501070pAH("request_type") Integer num, @InterfaceC1501070pAH("crossday_delay_min") int i, @InterfaceC1501070pAH("m2_condition") String str, @InterfaceC1501070pAH("timing") String str2, @InterfaceC1501070pAH("touchpoint_ids") String str3, @InterfaceC1501070pAH("prototype_list") String str4, @InterfaceC1501070pAH("action_list") String str5);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/ttn/task/done/post_invite_code")
    ListenableFuture<InviteCodeResponse> postInviterCode(@InterfaceC1501070pAH("inviter_code") String str);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/popup/click")
    C15O7<Object> postPopupEvent(@InterfaceC1485405rg PopupReportModel popupReportModel);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/diversion/report")
    ListenableFuture<Object> reportDiversion(@InterfaceC1485405rg HashMap<String, Object> map);

    @InterfaceC1501170pAR("/tiktok/incentive/user/product_facade/action/report/v1")
    ListenableFuture<TaskEventResponse> reportTaskEvent(@InterfaceC1485405rg TaskEventContent taskEventContent);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/coin/client_task_done")
    ListenableFuture<TaskDoneReponse> reportTaskInfo(@InterfaceC1501070pAH("task_key") String str, @InterfaceC1485405rg TaskInfo taskInfo);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/notification/action")
    ListenableFuture<TaskDoneReponse> requestOnNotificationAction(@InterfaceC1501070pAH("notification_id") String str, @InterfaceC1501070pAH("notification_action_type") int i, @InterfaceC1501070pAH("notification_classification") String str2, @InterfaceC1501070pAH("notification_material_id") String str3, @InterfaceC1501070pAH("notification_multi_show_count") int i2, @InterfaceC1501070pAH("notification_is_auto") Integer num, @InterfaceC1501070pAH("req_id") String str4);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/inapp_push/click ")
    C15O7<String> requestOnPopupClick(@InterfaceC1501070pAH("inapp_push_id") int i, @InterfaceC1501070pAH("inapp_push_click_type") int i2);

    @InterfaceC1501170pAR("/tiktok/touchpoint/platform/touchpoint/click/v1/")
    C15O7<String> requestTouchPointClick(@InterfaceC1501070pAH("touchpoint_id") int i, @InterfaceC1501070pAH("action") int i2, @InterfaceC1501070pAH("launch_plan_id") int i3);

    @InterfaceC1501170pAR("/tiktok/touchpoint/platform/touchpoint/show/v1/")
    C15O7<String> requestTouchPointShow(@InterfaceC1501070pAH("touchpoint_id") int i, @InterfaceC1501070pAH("launch_plan_id") int i2);

    @InterfaceC1501160pAQ("/tiktok/touchpoint/user/link/transform/v1")
    ListenableFuture<TransformLinkResponse> transformIncentiveLink(@InterfaceC1501070pAH("original_link") String str);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/inviter_code/update")
    C15O7<String> updateInviterCode(@InterfaceC1501070pAH("inviter_code") String str);

    @InterfaceC1501170pAR("/tiktok/incentive/v1/task/done/share_videos/support")
    ListenableFuture<InviteCodeResponse> uploadShareInviterCode(@InterfaceC1485405rg InviteInfo inviteInfo);
}
