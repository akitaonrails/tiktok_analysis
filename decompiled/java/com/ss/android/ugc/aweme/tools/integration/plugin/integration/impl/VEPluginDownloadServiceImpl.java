package com.ss.android.ugc.aweme.tools.integration.plugin.integration.impl;

import X.AnonymousClass1403;
import X.AnonymousClass1405;
import X.C01GW;
import X.C0BE6;
import X.C202068144s;
import X.C452501pT;
import X.C844020X9c;
import X.InterfaceC842850X4p;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginDownloadService;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class VEPluginDownloadServiceImpl implements VEPluginDownloadService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(154));

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginDownloadService
    public final boolean LIZIZ() {
        return !((Boolean) C0BE6.LIZ.getValue()).booleanValue() && ((IPluginService) this.LIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_camera");
    }

    @Override // com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginDownloadService
    public final void LIZ(final AFwS194S0000000_8 aFwS194S0000000_8) {
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_camera";
        c844020X9c.LIZIZ = true;
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LJIIIZ = false;
        anonymousClass1403.LIZ = false;
        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zf
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str, boolean z) {
                if (((IPluginService) this.LIZ.LIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_camera")) {
                    C554740LpI c554740LpI = C554740LpI.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("download: onSuccess, packageName: ");
                    sbLIZ.append(str);
                    C201955140j.LIZLLL(c554740LpI, "VEPluginDownloadServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                    aFwS194S0000000_8.invoke();
                    return;
                }
                C201955140j.LIZLLL(C554740LpI.LIZIZ, "VEPluginDownloadServiceImpl", "downloaded but plugin is not found");
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str, boolean z) {
                C554740LpI c554740LpI = C554740LpI.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download: onFailed, isSilent: ");
                sbLIZ.append(z);
                sbLIZ.append(", reason: ");
                sbLIZ.append(i);
                C201955140j.LIZLLL(c554740LpI, "VEPluginDownloadServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        ((IPluginService) this.LIZ.getValue()).LJJI(new C202068144s(c844020X9c));
    }
}
