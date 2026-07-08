package com.ss.android.ugc.aweme.ecommerce.network;

import X.C07WL;
import X.C080U;
import X.C0XM9;
import X.C1019103yf;
import X.C1499330p7T;
import X.C1507370pKR;
import X.C718040SEo;
import X.EnumC1014603xw;
import X.InterfaceC2027307wt;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomPbRequestHandler implements NetworkPartner.RequestHandler, InterfaceC2027307wt {
    public static final EcomPbRequestHandler LIZ = new EcomPbRequestHandler();

    @Override // X.InterfaceC2027307wt
    public final void LJ(Map<String, ? extends Object> map, Request request, String str, boolean z, Object obj, List<C080U> list, C07WL c07wl) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public static boolean LJIIL(C0XM9 c0xm9) {
        boolean z;
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        if (c0xm9.LIZJ.LJI.LIZJ("ec_native_prefetch_key") != null) {
            z = true;
        } else {
            z = false;
        }
        IEcomProtobufService iEcomProtobufService = C1507370pKR.LIZ;
        if (iEcomProtobufService == null) {
            return false;
        }
        boolean zLJFF = iEcomProtobufService.LJFF(strLIZ);
        if (z && zLJFF) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        IEcomProtobufService iEcomProtobufService = C1507370pKR.LIZ;
        if (iEcomProtobufService == null || !c0xm9.LJI) {
            return;
        }
        String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
        try {
            if ((!LJIIL(c0xm9) && !iEcomProtobufService.LIZLLL(c0xm9.LIZJ.LJFF.LIZ(), c0xm9.LIZJ.LJIIIIZZ)) || !iEcomProtobufService.LIZIZ(strLIZ)) {
                return;
            }
            c0xm9.LIZLLL.LIZ("x-ec-response-format", "protobuf");
            iEcomProtobufService.LJI(strLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR204, e, null);
        }
    }

    @Override // X.InterfaceC2027307wt
    public final boolean LIZIZ(String str, Request request, boolean z) {
        IEcomProtobufService iEcomProtobufService = C1507370pKR.LIZ;
        if (iEcomProtobufService == null) {
            return false;
        }
        if (!iEcomProtobufService.LJFF(str) && !iEcomProtobufService.LIZLLL(str, request.getUrl())) {
            return false;
        }
        return true;
    }
}
