package com.bytedance.android.livesdk.impl.revenue.strategy.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.guide.model.TaskActionResponse;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.guide.model.TaskReportResponse;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes18.dex */
public interface IncentiveApi {
    @InterfaceC1501160pAQ("/webcast/task/info/")
    C11NZ<C470590Icr<TaskInfoResponse.Data>> getTaskInfo(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("scene_type") int i, @InterfaceC1501070pAH("task_period") int i2, @InterfaceC1501070pAH("daily_watch_duration") long j, @InterfaceC1501070pAH("enter_from_merge") String str2, @InterfaceC1501070pAH("enter_from") String str3, @InterfaceC1501070pAH("request_page") String str4, @InterfaceC1501070pAH("task_type") int i3, @InterfaceC1501070pAH("currency") String str5, @InterfaceC1501070pAH("ab_config") String str6, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("extra_params") String str7);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/guide/report/")
    C11NZ<C470590Icr<Object>> reportGuide(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("guide_type") String str, @InterfaceC1501050pAF("report_type") int i, @InterfaceC1501050pAF("target_id") String str2, @InterfaceC1501050pAF("gift_id") String str3, @InterfaceC1501050pAF("period_id") String str4);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/task/action/")
    C11NZ<C470590Icr<TaskActionResponse.Data>> taskAction(@InterfaceC1501050pAF("room_id") String str, @InterfaceC1501050pAF("target_id") String str2, @InterfaceC1501050pAF("extra") String str3, @InterfaceC1501050pAF("action_name") String str4, @InterfaceC1501050pAF("action_target_type") int i, @InterfaceC1501050pAF("action_channel") int i2, @InterfaceC1501050pAF("gift_id") Long l, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501050pAF("task_biz_type") Integer num2, @InterfaceC1501050pAF("anchor_id") Long l2, @InterfaceC1501050pAF("target_amount") Long l3, @InterfaceC1501050pAF("order_id") String str5);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/task/report/")
    C11NZ<C470590Icr<TaskReportResponse.Data>> taskReport(@InterfaceC1501050pAF("room_id") String str, @InterfaceC1501050pAF("task_id") String str2, @InterfaceC1501050pAF("report_type") int i, @InterfaceC1501050pAF("watch_live_seconds") long j, @InterfaceC1501050pAF("enter_from_merge") String str3, @InterfaceC1501050pAF("enter_method") String str4, @InterfaceC1501050pAF("current_room_watch_seconds") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/task/report/")
    Object taskReport(@InterfaceC1501050pAF("room_id") String str, @InterfaceC1501050pAF("task_id") String str2, @InterfaceC1501050pAF("report_type") int i, @InterfaceC1501050pAF("watch_live_seconds") long j, InterfaceC1364105Vn<? super C470590Icr<TaskReportResponse.Data>> interfaceC1364105Vn);
}
