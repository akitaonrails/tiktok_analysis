package com.ss.android.ugc.aweme.net.partner;

import X.C0XM9;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class EffectsCompressHandler implements NetworkPartner.RequestHandler {
    public static final EffectsCompressHandler LIZ = new EffectsCompressHandler();

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
        if (Intrinsics.LJFF(c0xm9.LIZJ.LJFF.LIZ(), "/webcast/assets/effects/")) {
            c0xm9.LIZLLL.LIZLLL("accept-encoding", "no_comp");
        }
    }
}
