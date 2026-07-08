package com.bytedance.android.livesdk.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes13.dex */
public interface StickerReportApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/event_report/")
    C11NZ<C470590Icr<Void>> reportEvent(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("event") int i, @InterfaceC1501050pAF("effect_id") String str, @InterfaceC1501050pAF("last_effect_id") String str2, @InterfaceC1501050pAF("resource_id") String str3, @InterfaceC1501050pAF("last_resource_id") String str4, @InterfaceC1501050pAF("event_scene") int i2, @InterfaceC1501050pAF("pre_finish_type") int i3, @InterfaceC1501050pAF("confirm_box_operation") int i4);
}
