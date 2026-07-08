package com.ss.android.ugc.aweme.net.partner;

import X.C0CD2;
import X.C0XLH;
import X.C0XM9;
import X.C1499330p7T;
import X.C2097608Jq;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class GlobalRetryHandler implements NetworkPartner.ExceptionHandler {
    public final int LIZ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public GlobalRetryHandler(int i) {
        this.LIZ = i;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ExceptionHandler
    public final boolean LJIIIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T, Throwable th, int i, boolean z) {
        if (!z && i >= this.LIZ) {
            return false;
        }
        if (!C0CD2.LIZLLL()) {
            return true;
        }
        C0XLH.LIZ(c0xm9, C2097608Jq.LJIIJ(new Pair("r", String.valueOf(i + 1))), true);
        return true;
    }
}
