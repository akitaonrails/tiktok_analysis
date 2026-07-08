package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C0XM9;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;

/* JADX INFO: loaded from: classes12.dex */
public final class PdpHighPriorityNetworkPartner implements NetworkPartner.RequestHandler {
    public static final PdpHighPriorityNetworkPartner LIZ = new PdpHighPriorityNetworkPartner();

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
        c0xm9.LJFF = 4;
    }
}
