package com.bytedance.android.livesdk.comp.impl.event.api;

import X.C1AL6;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventResponse;
import com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventReportPreviewResponse;
import com.bytedance.android.livesdk.comp.impl.event.api.model.LiveEventSubscribeResponse;

/* JADX INFO: loaded from: classes34.dex */
public interface LiveEventApi {
    public static final C1AL6 LIZ = C1AL6.LIZ;

    @InterfaceC1501160pAQ("/tiktok/event/get/v1")
    Object getEventDetail(@InterfaceC1501070pAH("event_id") String str, InterfaceC1364105Vn<? super EventDetailData> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/event/list/v1")
    Object getLiveEventList(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("query_type") int i, @InterfaceC1501070pAH("host_user_id") String str2, @InterfaceC1501070pAH("room_id") String str3, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") long j2, @InterfaceC1501070pAH("query_event_list_scene") Integer num, @InterfaceC1501070pAH("query_event_list_show_type") int i2, InterfaceC1364105Vn<? super LiveEventResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/event/subscribe/v1")
    Object registerEvent(@InterfaceC1501070pAH("event_id") String str, InterfaceC1364105Vn<? super LiveEventSubscribeResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/event/preview_info/report/v1")
    Object reportPreviewInfo(@InterfaceC1501070pAH("event_id") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("is_playing") boolean z, InterfaceC1364105Vn<? super LiveEventReportPreviewResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/event/unsubscribe/v1")
    Object unRegisterEvent(@InterfaceC1501070pAH("event_id") String str, InterfaceC1364105Vn<? super LiveEventSubscribeResponse> interfaceC1364105Vn);
}
