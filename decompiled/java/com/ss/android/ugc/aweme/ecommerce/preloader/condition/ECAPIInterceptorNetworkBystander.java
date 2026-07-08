package com.ss.android.ugc.aweme.ecommerce.preloader.condition;

import X.C01GW;
import X.C0X52;
import X.C20475080j;
import X.C2127708Vf;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.InterfaceC2027307wt;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class ECAPIInterceptorNetworkBystander implements NetworkPartner.Bystander {
    public static final ECAPIInterceptorNetworkBystander LIZ = new ECAPIInterceptorNetworkBystander();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20475080j());
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(387));

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        Boolean boolValueOf;
        String strMimeType;
        if (c0x52 != null && c0x52.LIZJ() && !request.isResponseStreaming()) {
            String path = request.getPath();
            for (Object obj : (List) LIZIZ.getValue()) {
                if (((InterfaceC2027307wt) obj).LIZIZ(path, request, false)) {
                    if (obj != null) {
                        TypedInput typedInput = c0x52.LIZ.LJ;
                        if (typedInput != null && (strMimeType = typedInput.mimeType()) != null) {
                            boolValueOf = Boolean.valueOf(a0.LJJIIZI(strMimeType, "protobuf", false));
                        } else {
                            boolValueOf = null;
                        }
                        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                            return;
                        }
                        TypedInput typedInput2 = c0x52.LIZ.LJ;
                        if (typedInput2 instanceof TypedByteArray) {
                            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2127708Vf(c0x52, typedInput2, request, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
