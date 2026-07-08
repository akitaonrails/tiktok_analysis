package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C0XM9;
import X.C1493620oyG;
import X.C1494160oz8;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;

/* JADX INFO: loaded from: classes24.dex */
public final class ForceAlternativeNetworkRequestHandler implements NetworkPartner.RequestHandler {
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
        C1494160oz8 c1494160oz8;
        Object c1493620oyG = c0xm9.LJIIIIZZ;
        if (c1493620oyG == null) {
            c1493620oyG = new C1493620oyG();
            c0xm9.LJIIIIZZ = c1493620oyG;
        }
        if ((c1493620oyG instanceof C1494160oz8) && (c1494160oz8 = (C1494160oz8) c1493620oyG) != null) {
            c1494160oz8.LJIILJJIL = c1494160oz8.LJIILJJIL | 268435456 | 536870912;
        }
    }
}
