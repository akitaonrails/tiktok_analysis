package com.ss.android.ugc.aweme.publicgroup.preview;

import X.C0Y6Q;
import X.C0Y8T;
import X.C0YH4;
import X.C0YHX;
import X.C0YM2;
import X.C0YPY;
import X.C0YSQ;
import X.C1229100i5c;
import X.C1441405ka;
import X.C23250099c;
import X.C23271099x;
import X.C865670Xxd;
import X.C875420YVw;
import X.InterfaceC865850Xxv;
import X.InterfaceC866310Xyf;
import X.InterfaceC876950Yaj;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.util.IPublicGroupPreviewUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PublicGroupPreviewUtil implements IPublicGroupPreviewUtil {
    @Override // com.ss.android.ugc.aweme.util.IPublicGroupPreviewUtil
    public final boolean LIZ(String str) {
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        InterfaceC866310Xyf interfaceC866310XyfLIZIZ;
        InterfaceC865850Xxv interfaceC865850XxvLJIIIZ;
        C0Y6Q c0y6qLIZIZ;
        if (str == null || str.length() == 0 || !C1229100i5c.LIZ.LJIIJJI(str)) {
            return false;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && c0y8tLIZ.isMember()) {
            return false;
        }
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ == null || (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null || (c0yh4LJIIL = c0yhxLIZ.LJIIL()) == null || (interfaceC866310XyfLIZIZ = c0yh4LJIIL.LIZIZ()) == null || (interfaceC865850XxvLJIIIZ = interfaceC866310XyfLIZIZ.LJIIIZ()) == null) {
            return false;
        }
        try {
            c0y6qLIZIZ = (C0Y6Q) C23250099c.LJ(C23271099x.INSTANCE, new C1441405ka(null, interfaceC865850XxvLJIIIZ, str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            c0y6qLIZIZ = C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
        }
        return Intrinsics.LJFF(c0y6qLIZIZ.LIZ, "1");
    }
}
