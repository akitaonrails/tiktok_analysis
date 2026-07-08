package com.ss.android.ugc.aweme.net.partner;

import X.C0C64;
import X.C0XDN;
import X.C0XLM;
import X.C0XM9;
import X.C1499330p7T;
import X.C292740Bdg;
import X.C718040SEo;
import X.C827010WcN;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonParamsTTNetHandler implements NetworkPartner.RequestHandler {
    public static final CommonParamsTTNetHandler LIZ = new CommonParamsTTNetHandler();

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
        if (!c0xm9.LIZIZ) {
            return;
        }
        int iLIZ = C827010WcN.LIZ();
        if ((iLIZ == 2 || iLIZ == 3) && !C827010WcN.LIZ) {
            ((ReentrantLock) C827010WcN.LIZIZ).lock();
            while (!C827010WcN.LIZ) {
                try {
                    C827010WcN.LIZJ.await(1000L, TimeUnit.MILLISECONDS);
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
            }
            ((ReentrantLock) C827010WcN.LIZIZ).unlock();
        }
        C0XLM c0xlm = c0xm9.LIZJ.LJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0XDN.LIZJ(linkedHashMap, true);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c0xlm.LJ((String) entry.getKey(), (String) entry.getValue());
        }
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        Regex regex = C292740Bdg.LIZ;
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "aweme_request_hpack_optimization_v2", "", true);
        if (!Intrinsics.LJFF(strLJJ, C292740Bdg.LIZ.getPattern())) {
            C292740Bdg.LIZ = new Regex(strLJJ);
        }
        if (C292740Bdg.LIZ.matches(strLIZ)) {
            c0xm9.LIZLLL.LIZLLL("force_tt_hpack_optimization", "true");
        }
    }
}
