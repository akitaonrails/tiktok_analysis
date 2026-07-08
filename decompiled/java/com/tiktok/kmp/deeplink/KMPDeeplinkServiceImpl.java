package com.tiktok.kmp.deeplink;

import X.AbstractC219600t0;
import X.C0PEM;
import X.C10ZO;
import X.C10ZT;
import X.C10ZX;
import X.C10ZZ;
import X.C1501820pBU;
import X.C19266510Zb;
import X.C19266910Zf;
import X.C19267610Zm;
import X.C2097908Jt;
import X.C2296808zG;
import X.C23250099c;
import Y.AObjectS371S0100000_28;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS237S0300000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class KMPDeeplinkServiceImpl implements IKMPDeeplinkService {
    @Override // com.tiktok.kmp.deeplink.IKMPDeeplinkService
    public final void LIZJ() {
        C10ZO c10zo = C10ZO.LIZ;
    }

    @Override // com.tiktok.kmp.deeplink.IKMPDeeplinkService
    public final C10ZT LIZLLL() {
        return C10ZT.LIZ;
    }

    @Override // com.tiktok.kmp.deeplink.IKMPDeeplinkService
    public final void LIZ(C19266910Zf c19266910Zf) {
        C10ZZ.LIZ.getClass();
        C10ZZ.LIZ(c19266910Zf);
    }

    @Override // com.tiktok.kmp.deeplink.IKMPDeeplinkService
    public final void LJ(String str) {
        C10ZZ.LIZ.getClass();
        ((Map) C10ZZ.LIZIZ.getValue()).put(str, Long.valueOf(C19267610Zm.LIZ.now().toEpochMilliseconds()));
    }

    @Override // com.tiktok.kmp.deeplink.IKMPDeeplinkService
    public final void LIZIZ(long j, String str, boolean z) {
        C10ZZ.LIZ.getClass();
        C10ZZ.LIZ(new C19266910Zf(-10, j, str, "", "no error", z, false));
    }

    @Override // com.tiktok.kmp.deeplink.IKMPDeeplinkService
    public final void LJFF(String str, boolean z, AwS237S0300000_28 awS237S0300000_28) {
        C10ZZ.LIZ.getClass();
        AObjectS371S0100000_28 aObjectS371S0100000_28 = new AObjectS371S0100000_28(awS237S0300000_28, 1);
        String str2 = C19266510Zb.LIZ;
        final Map mapLIZJ = C2097908Jt.LIZJ(new Pair("url", str));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C10ZX(new C1501820pBU(str2, "/tiktok/linker/target/get/v1/", new AbstractC219600t0(mapLIZJ) { // from class: X.00sz
            public final Map<String, String> LIZ;

            @Override // X.AbstractC219600t0
            public final InterfaceC1498620p6K LIZIZ() {
                return null;
            }

            @Override // X.AbstractC219600t0
            public final Map<String, String> LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = mapLIZJ;
            }
        }), aObjectS371S0100000_28, str, z, null), 3);
    }
}
