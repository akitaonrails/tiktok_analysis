package com.ss.android.ugc.aweme.share.business.config;

import X.C0T6L;
import X.C1362230lYL;
import X.C1371960lo2;
import X.C1379120lza;
import X.C1389340mG4;
import X.C19252910Tv;
import X.C2277621ECy;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC1369700lkO;
import X.EnumC1369720lkQ;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longpress.LongPressComponent;
import com.ss.android.ugc.aweme.longpress.LongPressComponentStyleConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.jvm.internal.AwS105S1000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeImShareBarProtocol extends TTCustomSharePanelBarProtocol {
    public final AwemeSharePackage LL;
    public final Aweme LLILLJJLI;
    public final C1362230lYL LLILLL;
    public final EnumC1369720lkQ LLILZ;
    public final EnumC1369700lkO LLILZIL;

    @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public final EnumC1369720lkQ Mq1() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public final EnumC1369700lkO nz() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
    public final C1362230lYL zA1() {
        return this.LLILLL;
    }

    public AwemeImShareBarProtocol(BaseSharePackage baseSharePackage) {
        AwemeSharePackage awemeSharePackage;
        Aweme awemeLJJIFFI;
        LongPressComponentStyleConfig longPressComponentStyleConfig;
        String str;
        LongPressComponentStyleConfig longPressComponentStyleConfig2;
        String str2;
        C1362230lYL c1362230lYL = null;
        if (baseSharePackage instanceof AwemeSharePackage) {
            awemeSharePackage = (AwemeSharePackage) baseSharePackage;
        } else {
            awemeSharePackage = null;
        }
        this.LL = awemeSharePackage;
        if (awemeSharePackage != null) {
            Bundle bundle = awemeSharePackage.extras;
            if (bundle != null) {
                bundle.getString("panel_source");
            }
            awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        } else {
            awemeLJJIFFI = null;
        }
        this.LLILLJJLI = awemeLJJIFFI;
        String str3 = "";
        String string = baseSharePackage.extras.getString("enter_from", "");
        String string2 = baseSharePackage.extras.getString("enter_method", "normal_share");
        String string3 = baseSharePackage.extras.getString("panel_source", "share_panel");
        C1379120lza.LIZ.getClass();
        if (C1379120lza.LIZIZ(string3) && C1379120lza.LIZLLL(awemeSharePackage, string)) {
            LongPressComponent longPressComponentLIZIZ = C1371960lo2.LIZIZ();
            if (longPressComponentLIZIZ != null && (longPressComponentStyleConfig2 = longPressComponentLIZIZ.styleConfig) != null && (str2 = longPressComponentStyleConfig2.style) != null) {
                str3 = str2;
            }
            new AwS105S1000000_21(str3, 0);
            C0T6L.LIZLLL();
            this.LLILLL = LIZ(str3, true);
            this.LLILZ = EnumC1369720lkQ.HORIZONTAL;
            this.LLILZIL = EnumC1369700lkO.TOP;
            return;
        }
        if (Intrinsics.LJFF(string2, "share_panel") && C1379120lza.LIZLLL(awemeSharePackage, string)) {
            LongPressComponent longPressComponentLIZIZ2 = C1371960lo2.LIZIZ();
            if (longPressComponentLIZIZ2 != null && (longPressComponentStyleConfig = longPressComponentLIZIZ2.styleConfig) != null && (str = longPressComponentStyleConfig.style) != null) {
                str3 = str;
            }
            new AwS105S1000000_21(str3, 1);
            C0T6L.LIZLLL();
            this.LLILLL = LIZ(str3, false);
            this.LLILZ = EnumC1369720lkQ.VERTICAL;
            this.LLILZIL = EnumC1369700lkO.BOTTOM;
            return;
        }
        if (Intrinsics.LJFF(string2, "share_panel")) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIILLIIL().LJFF()) {
                if (!c19252910Tv.LIZLLL().LJIILLIIL().LJIIIIZZ() && !c19252910Tv.LIZLLL().LJIILLIIL().LJII()) {
                    if (c19252910Tv.LIZLLL().LJIILLIIL().LJIIIZ(null) || c19252910Tv.LIZLLL().LJIILLIIL().LJI(null)) {
                        c1362230lYL = new C1362230lYL();
                        c1362230lYL.LIZ = true;
                        c1362230lYL.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92));
                        c1362230lYL.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        c1362230lYL.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        c1362230lYL.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
                        c1362230lYL.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                        c1362230lYL.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    }
                } else {
                    c1362230lYL = new C1362230lYL();
                    c1362230lYL.LIZ = false;
                    c1362230lYL.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
                    c1362230lYL.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c1362230lYL.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c1362230lYL.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
                    c1362230lYL.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    c1362230lYL.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                this.LLILLL = c1362230lYL;
                this.LLILZ = EnumC1369720lkQ.VERTICAL;
                this.LLILZIL = EnumC1369700lkO.BOTTOM;
                return;
            }
        }
        this.LLILLL = null;
        this.LLILZ = EnumC1369720lkQ.VERTICAL;
        this.LLILZIL = EnumC1369700lkO.BOTTOM;
    }

    public static C1362230lYL LIZ(String str, boolean z) {
        boolean z2;
        if (C1389340mG4.LJ() < 360) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z2 || Intrinsics.LJFF(str, "im_avatar_48")) && z) {
            C1362230lYL c1362230lYL = new C1362230lYL();
            c1362230lYL.LIZ = false;
            c1362230lYL.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
            c1362230lYL.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c1362230lYL.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c1362230lYL.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            c1362230lYL.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c1362230lYL.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c1362230lYL.LJIILJJIL = false;
            return c1362230lYL;
        }
        if (Intrinsics.LJFF(str, "im_avatar_56") && z) {
            C1362230lYL c1362230lYL2 = new C1362230lYL();
            c1362230lYL2.LIZ = true;
            c1362230lYL2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(92));
            c1362230lYL2.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c1362230lYL2.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c1362230lYL2.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c1362230lYL2.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            c1362230lYL2.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c1362230lYL2.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c1362230lYL2.LJIILJJIL = false;
            return c1362230lYL2;
        }
        if (((Boolean) C2277621ECy.LIZIZ.getValue()).booleanValue()) {
            C1362230lYL c1362230lYL3 = new C1362230lYL();
            c1362230lYL3.LIZ = false;
            c1362230lYL3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
            c1362230lYL3.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
            c1362230lYL3.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c1362230lYL3.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
            c1362230lYL3.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
            c1362230lYL3.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c1362230lYL3.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c1362230lYL3.LJIILJJIL = false;
            return c1362230lYL3;
        }
        return null;
    }
}
