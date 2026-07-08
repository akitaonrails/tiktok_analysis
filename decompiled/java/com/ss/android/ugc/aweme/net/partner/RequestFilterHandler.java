package com.ss.android.ugc.aweme.net.partner;

import X.C0X52;
import X.C0XM9;
import X.C1498950p6r;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestFilterHandler implements NetworkPartner.Blocker {
    public static final RequestFilterHandler LIZ = new RequestFilterHandler();

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

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        c0xm9.LIZJ(RequestFilterHandler.class, this);
        C1498950p6r.LIZ.getClass();
        C1498950p6r.LIZ(c0xm9);
        return null;
    }
}
