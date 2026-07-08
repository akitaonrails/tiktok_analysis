package com.bytedance.android.livesdk.api.revenue.strategy.guide;

import X.C11NZ;
import X.C206400qs;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;

/* JADX INFO: loaded from: classes.dex */
public interface TriggerApi {
    public static final C206400qs LIZ = C206400qs.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/guide/trigger/")
    C11NZ<C470590Icr<GiftGuideTriggerResponse.Data>> guideTriggerRequest(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("biz_name") String str, @InterfaceC1501050pAF("trigger_type") String str2, @InterfaceC1501050pAF("watch_duration") long j2, @InterfaceC1501050pAF("client_log_id_string") String str3, @InterfaceC1501050pAF("client_trigger_feature") String str4, @InterfaceC1501050pAF("label") String str5, @InterfaceC1501050pAF("sub_trigger_name") String str6, @InterfaceC1501050pAF("anchor_trigger_biz_info") String str7);
}
