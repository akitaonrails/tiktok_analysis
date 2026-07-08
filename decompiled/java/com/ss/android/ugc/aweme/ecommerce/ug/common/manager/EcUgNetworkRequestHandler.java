package com.ss.android.ugc.aweme.ecommerce.ug.common.manager;

import X.C0XLO;
import X.C0XM9;
import X.C1499330p7T;
import X.C1499870p8L;
import X.C1552540qVI;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.bean.EcUgApiAllowlistModel;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcUgNetworkRequestHandler implements NetworkPartner.RequestHandler {
    public static final EcUgNetworkRequestHandler LIZ = new EcUgNetworkRequestHandler();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        EcUgApiAllowlistModel ecUgApiAllowlistModel;
        C1552540qVI c1552540qVI = C1552540qVI.LIZ;
        C0XLO c0xlo = c0xm9.LIZJ;
        c1552540qVI.getClass();
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            ecUgApiAllowlistModel = C1499870p8L.LIZ;
            EcUgApiAllowlistModel ecUgApiAllowlistModel2 = (EcUgApiAllowlistModel) settingsManagerLIZLLL.LJIIIIZZ("ec_mall_ug_allowlist_api", EcUgApiAllowlistModel.class, ecUgApiAllowlistModel);
            if (ecUgApiAllowlistModel2 != null) {
                ecUgApiAllowlistModel = ecUgApiAllowlistModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecUgApiAllowlistModel = C1499870p8L.LIZ;
        }
        for (String str : ecUgApiAllowlistModel.api) {
            if (a0.LJJIIZI(c0xlo.LJIIIIZZ, str, false)) {
                if (str != null && c0xlo != null) {
                    C1552540qVI.LIZ.getClass();
                    Pair pairLIZIZ = C1552540qVI.LIZIZ();
                    c0xlo.LJI.LIZLLL((String) pairLIZIZ.getFirst(), (String) pairLIZIZ.getSecond());
                    return;
                }
                return;
            }
        }
    }
}
