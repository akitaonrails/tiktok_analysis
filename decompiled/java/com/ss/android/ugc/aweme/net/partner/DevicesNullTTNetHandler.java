package com.ss.android.ugc.aweme.net.partner;

import X.C0XLM;
import X.C0XM9;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class DevicesNullTTNetHandler implements NetworkPartner.RequestHandler {
    public static final DevicesNullTTNetHandler LIZ = new DevicesNullTTNetHandler();

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
        C0XLM c0xlm = c0xm9.LIZJ.LJI;
        String strLIZJ = c0xlm.LIZJ("device_id");
        if (strLIZJ == null || a0.LJJJIL(strLIZJ)) {
            c0xlm.LIZ.remove("device_id");
        }
    }
}
