package com.ss.android.ugc.aweme.ecommerce.network;

import X.C054G;
import X.C0X52;
import X.C0XM9;
import X.C0XS7;
import X.C13LP;
import X.C1499330p7T;
import X.C1499750p89;
import X.C1499760p8A;
import X.C1507500pKe;
import X.C1507520pKg;
import X.C1507550pKj;
import X.C1507590pKn;
import X.C1697810uHb;
import X.C2126308Ur;
import X.C2296808zG;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.network.config.EcLynxNetReuseConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcLynxNetReuseHandler implements NetworkPartner.Blocker, NetworkPartner.RequestHandler, NetworkPartner.ResponseHandler {
    public static final C054G LIZJ = C2296808zG.LIZ(C2126308Ur.LIZLLL);
    public static final C1507520pKg LIZLLL = new C1507520pKg();
    public static final ECAPIInterceptorNetworkHandler LJ = new ECAPIInterceptorNetworkHandler(true);
    public final C1507520pKg LIZ = LIZLLL;
    public final ECAPIInterceptorNetworkHandler LIZIZ = LJ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public static C1507590pKn LIZIZ(C0XM9 c0xm9) {
        C1507500pKe c1507500pKeLIZ;
        String strLJJLIIIJ;
        if (!c0xm9.LJI) {
            return null;
        }
        EcLynxNetReuseConfig ecLynxNetReuseConfig = EcLynxNetReuseConfig.LIZ;
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        ecLynxNetReuseConfig.getClass();
        if (!EcLynxNetReuseConfig.LIZLLL.contains(strLIZ) || (c1507500pKeLIZ = EcLynxNetReuseConfig.LIZ(ecLynxNetReuseConfig, c0xm9.LIZJ.LJFF.LIZ(), c0xm9.LIZJ.LJI)) == null) {
            return null;
        }
        String strLIZ2 = c0xm9.LIZJ.LJFF.LIZ();
        String str = c1507500pKeLIZ.LIZJ;
        String strLIZJ = c0xm9.LIZJ.LJI.LIZJ("ec_lynx_net_reuse_key");
        if (strLIZJ == null || !(!a0.LJJJIL(strLIZJ)) || (strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strLIZ2, str, strLIZJ), "_", null, null, 0, null, null, 62)) == null) {
            return null;
        }
        return new C1507590pKn(strLJJLIIIJ, c1507500pKeLIZ);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        C1507590pKn c1507590pKn;
        long jLongValue;
        Object objLIZ = c1499330p7T.LIZ(this);
        if ((objLIZ instanceof C1507590pKn) && (c1507590pKn = (C1507590pKn) objLIZ) != null && c0xs7.LIZIZ()) {
            C1507520pKg c1507520pKg = this.LIZ;
            String str = c1507590pKn.LIZ;
            C0X52<?> c0x52LIZ = c0xs7.LIZ();
            Long lValueOf = Long.valueOf(c1507590pKn.LIZIZ.LIZ.timeout);
            c1507520pKg.getClass();
            if (str != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 10000;
                }
                c1507520pKg.LIZ.LIZJ(str, new C1507550pKj(c0x52LIZ, jCurrentTimeMillis + jLongValue));
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        C1507590pKn c1507590pKnLIZIZ = LIZIZ(c0xm9);
        if (c1507590pKnLIZIZ == null) {
            return null;
        }
        C1507520pKg c1507520pKg = this.LIZ;
        String str = c1507590pKnLIZIZ.LIZ;
        c1507520pKg.getClass();
        if (str != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1507550pKj c1507550pKjLIZIZ = c1507520pKg.LIZ.LIZIZ(str);
            if (c1507550pKjLIZIZ != null) {
                if (jCurrentTimeMillis <= c1507550pKjLIZIZ.LIZIZ) {
                    C0X52<?> c0x52 = c1507550pKjLIZIZ.LIZ;
                    if (c0x52 != null) {
                        C0XS7<?> c0xs7 = new C0XS7<>(c0x52);
                        c0xs7.LJ.LIZLLL("tts-net-hit-reuse", "1");
                        c0xs7.LJ.LIZLLL("ec_lynx_net_reuse_key", c1507590pKnLIZIZ.LIZ);
                        ECAPIInterceptorNetworkHandler eCAPIInterceptorNetworkHandler = this.LIZIZ;
                        eCAPIInterceptorNetworkHandler.LJIIIIZZ(c0xm9, c1499330p7T);
                        eCAPIInterceptorNetworkHandler.LIZ(c0xs7, c1499330p7T);
                        c0xm9.LIZJ(C1499750p89.class, new C1499750p89());
                        c0xm9.LIZJ(C1499760p8A.class, new C1499760p8A());
                        return c0xs7.LIZ();
                    }
                } else {
                    c1507520pKg.LIZ.LIZLLL(str);
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        C1507590pKn c1507590pKnLIZIZ = LIZIZ(c0xm9);
        if (c1507590pKnLIZIZ == null) {
            return;
        }
        c1499330p7T.LIZIZ(this, c1507590pKnLIZIZ);
    }
}
