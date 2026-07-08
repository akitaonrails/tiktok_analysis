package com.bytedance.android.livesdk.impl.revenue.portal.request;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.envelope.PortalListResponse;

/* JADX INFO: loaded from: classes.dex */
public interface PortalApi {
    @InterfaceC1501160pAQ("/webcast/portal/list/")
    @C09SO(EnumC1846380y9E.GIFT)
    AbstractC19484711Kz<C470590Icr<PortalListResponse.ResponseData>> getPortalList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2);
}
