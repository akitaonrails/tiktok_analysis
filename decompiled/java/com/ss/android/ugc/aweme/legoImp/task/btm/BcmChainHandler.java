package com.ss.android.ugc.aweme.legoImp.task.btm;

import X.AbstractC842530X3j;
import X.AnonymousClass0934;
import X.C080U;
import X.C0XM9;
import X.C0XMA;
import X.C0XMH;
import X.C1499330p7T;
import X.C1499480p7i;
import X.C1499530p7n;
import X.C1499570p7r;
import X.C718040SEo;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.ies.ugc.statisticlogger.btm.BackupConfigData;
import com.bytedance.ies.ugc.statisticlogger.btm.MonitorItem;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1294060jmO
public final class BcmChainHandler implements NetworkPartner.RequestHandler {
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
        TypedOutput c0xmh;
        JSONObject jSONObjectLIZLLL;
        String strJ3;
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        C0XMA c0xma = c0xm9.LJ;
        AbstractC842530X3j abstractC842530X3j = c0xma.LIZJ;
        if (abstractC842530X3j != null) {
            c0xmh = new C0XMH(abstractC842530X3j);
        } else {
            c0xmh = c0xma.LIZIZ;
        }
        C080U c080u = null;
        try {
            if (((BackupConfigData) C1499530p7n.LIZIZ.getValue()).f46switch == 1) {
                C1499480p7i c1499480p7iLJ = C1499570p7r.LJ(strLIZ);
                MonitorItem monitorItem = c1499480p7iLJ.LIZ;
                if (monitorItem != null || c1499480p7iLJ.LIZIZ) {
                    C0XMH c0xmhLIZIZ = C1499570p7r.LIZIZ(strLIZ, c0xmh, monitorItem);
                    if (c1499480p7iLJ.LIZIZ && (jSONObjectLIZLLL = C1499570p7r.LIZLLL()) != null && (strJ3 = C786410Ut5.J3(jSONObjectLIZLLL)) != null) {
                        try {
                            String strLIZ2 = AnonymousClass0934.LIZ(strJ3);
                            if (strLIZ2 != null && strLIZ2.length() != 0) {
                                c080u = new C080U("Compressed-Bcm-Chain", strLIZ2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    Pair pair = new Pair(c0xmhLIZIZ, c080u);
                    TypedOutput typedOutput = (TypedOutput) pair.getFirst();
                    if (typedOutput != null) {
                        C0XMA c0xma2 = c0xm9.LJ;
                        c0xma2.LIZ(typedOutput, c0xma2.LIZ);
                    }
                    C080U c080u2 = (C080U) pair.getSecond();
                    if (c080u2 != null) {
                        c0xm9.LIZLLL.LIZ(c080u2.LIZ, c080u2.LIZIZ);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
