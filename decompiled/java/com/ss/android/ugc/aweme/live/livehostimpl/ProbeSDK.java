package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C1724990uzR;
import com.bytedance.android.livesdkapi.host.IProbeSDK;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;

/* JADX INFO: loaded from: classes27.dex */
public final class ProbeSDK implements IProbeSDK {
    @Override // com.bytedance.android.livesdkapi.host.IProbeSDK
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IProbeSDK
    public final void setUpProbeSDK(String str, String str2, String str3) {
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null) {
            iProbeService.LJIIJ(new C1724990uzR(str, str2, str3));
        }
    }
}
