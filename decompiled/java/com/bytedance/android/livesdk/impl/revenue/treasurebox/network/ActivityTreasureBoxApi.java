package com.bytedance.android.livesdk.impl.revenue.treasurebox.network;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import webcast.api.envelope.RevenuePermissionResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface ActivityTreasureBoxApi {
    @InterfaceC1501160pAQ("/webcast/envelope/list/")
    AbstractC19484711Kz<C470590Icr<RedEnvelopeListResponse>> getRedEnvelopList(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2);

    @InterfaceC1501170pAR("/webcast/envelope/list/")
    AbstractC19484711Kz<C470590Icr<RedEnvelopeListResponse>> getRedEnvelopListV2(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("sec_anchor_id") String str2);

    @InterfaceC1501170pAR("/webcast/revenue/permission/")
    AbstractC19484711Kz<C470590Icr<RevenuePermissionResponse.ResponseData>> getRedEnvelopePermission(@InterfaceC1501070pAH("need_bizs") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("sec_anchor_id") String str);
}
