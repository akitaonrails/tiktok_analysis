package com.bytedance.android.livesdk.impl.revenue.portal.model;

import X.C09CT;
import X.C963140bAe;
import X.InterfaceC2365009Om;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class EnvelopPortal4FEModelSender implements InterfaceC2365009Om {

    @C09CT("portal_infos")
    public List<EnvelopePortalMessage.PortalInfo> portalInfos = new ArrayList();

    @C09CT("time_diff")
    public long timeDiff = C963140bAe.LIZLLL;

    @C09CT("entrance")
    public String entrance = "";

    @C09CT("data_from")
    public String dataFrom = "";
}
