package com.ss.android.ugc.aweme.relation.auth.api.partner;

import X.C0XM9;
import X.C1493620oyG;
import X.C1494160oz8;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class ContactRequestPartner implements NetworkPartner.RequestHandler {
    public final long LIZ = 30000;
    public final long LIZIZ = 30000;
    public final long LIZJ = 30000;
    public final long LIZLLL = 90000;

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
        if (!Intrinsics.LJFF(c0xm9.LIZJ.LJFF.LIZ(), "/aweme/v1/upload/hashcontacts/")) {
            return;
        }
        Object c1493620oyG = c0xm9.LJIIIIZZ;
        if (c1493620oyG == null) {
            c1493620oyG = new C1493620oyG();
            c0xm9.LJIIIIZZ = c1493620oyG;
        }
        if ((c1493620oyG instanceof C1494160oz8) && (c1494160oz8 = (C1494160oz8) c1493620oyG) != null) {
            c1494160oz8.LJFF = this.LIZ;
            c1494160oz8.LJII = this.LIZIZ;
            c1494160oz8.LJI = this.LIZJ;
            c1494160oz8.LJIIIIZZ = this.LIZLLL;
        }
    }
}
