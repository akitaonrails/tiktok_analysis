package com.ss.android.ugc.aweme.ecommerce.ug.landing;

import X.AnonymousClass0956;
import X.C05H2;
import X.C1314905Cp;
import X.C23250099c;
import X.C817503Hh;
import X.EnumC1521205xS;
import com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class LandMallProtocol implements DefaultBottomTabProtocol {
    public static final C05H2 LL = new C05H2();
    public static Boolean LLILLJJLI;
    public static boolean LLILLL;
    public static String LLILZ;
    public static long LLILZIL;
    public static AnonymousClass0956 LLILZLL;

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final String gZ1() {
        return "SHOP_MALL";
    }

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final void op1() {
        if (LLILLJJLI != null) {
            return;
        }
        LLILLJJLI = Boolean.FALSE;
        if (EcMallDefaultLandingShopTabAB.LIZIZ.enable) {
            C05H2.LIZLLL("not normal cold launch", false);
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1314905Cp(false, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    public final EnumC1521205xS priority() {
        return EnumC1521205xS.SHOP;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019c  */
    @Override // com.ss.android.ugc.aweme.homepage.DefaultBottomTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Wf0(android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol.Wf0(android.content.Context):boolean");
    }
}
