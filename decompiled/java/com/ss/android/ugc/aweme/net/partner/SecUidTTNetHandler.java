package com.ss.android.ugc.aweme.net.partner;

import X.C089E;
import X.C0W75;
import X.C0XLM;
import X.C0XM9;
import X.C123100dR;
import X.C1499330p7T;
import X.C2188811AlT;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class SecUidTTNetHandler implements NetworkPartner.RequestHandler {
    public static final SecUidTTNetHandler LIZ = new SecUidTTNetHandler();

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
        String strLIZ;
        String strLIZIZ;
        C0W75 c0w75LIZ = C0W75.LIZ();
        c0w75LIZ.getClass();
        if (C0W75.LIZJ()) {
            strLIZ = c0xm9.LIZJ.LJFF.LIZ();
            try {
                C0W75.LJFF(strLIZ, false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            strLIZ = null;
        }
        C0XLM c0xlm = c0xm9.LIZJ.LJI;
        C089E c089e = new C089E(C0W75.LIZIZ);
        while (c089e.hasNext()) {
            String str = (String) c089e.next();
            String strLIZJ = c0xlm.LIZJ(str);
            if (strLIZJ != null && !a0.LJJJIL(strLIZJ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sec_");
                sbLIZ.append(str);
                if (!C123100dR.LIZ(c0xlm.LIZJ(C2188811AlT.LIZIZ(sbLIZ))) && (strLIZIZ = c0w75LIZ.LIZIZ(strLIZJ)) != null && !a0.LJJJIL(strLIZIZ)) {
                    if (strLIZ == null) {
                        strLIZ = c0xm9.LIZJ.LJFF.LIZ();
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("sec_");
                    sbLIZ2.append(str);
                    c0xlm.LJ(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
                }
            }
        }
    }
}
