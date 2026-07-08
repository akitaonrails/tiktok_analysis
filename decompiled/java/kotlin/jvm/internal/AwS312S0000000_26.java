package kotlin.jvm.internal;

import X.AnonymousClass0956;
import X.C09AY;
import X.C0R9E;
import X.C291001Au;
import X.C724240Sb0;
import X.EnumC1770140wAG;
import X.InterfaceC1740440vOM;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes27.dex */
public class AwS312S0000000_26 extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS312S0000000_26(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AwS312S0000000_26 awS312S0000000_26, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        InterfaceC1740440vOM interfaceC1740440vOM = ShopTabOverlayActivity.LLILLJJLI;
        if (interfaceC1740440vOM != null) {
            interfaceC1740440vOM.LIZ(str, zBooleanValue);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS312S0000000_26 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem r6 = (com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem) r6
            if (r7 == 0) goto L95
            r6.getClass()
            r2 = 0
            org.greenrobot.eventbus.EventBus r1 = org.greenrobot.eventbus.EventBus.LIZLLL()     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r1.LJIIJ(r6)     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1b
            r1.LJIJJ(r6)     // Catch: java.lang.Throwable -> L1d
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L1d
        L17:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L1d
            goto L29
        L1b:
            r0 = r2
            goto L17
        L1d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L29:
            X.19EG r5 = X.C724240Sb0.LIZ(r6)
            if (r5 == 0) goto L30
            goto L32
        L30:
            r0 = r2
            goto L60
        L32:
            X.0Hfk r4 = com.bytedance.hox.Hox.LLJILJIL     // Catch: java.lang.Throwable -> L64
            com.bytedance.hox.Hox r3 = r4.LIZ(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "page_profile"
            X.0wAc r0 = r6.LLLLIIIILLL     // Catch: java.lang.Throwable -> L64
            r3.wQ2(r1, r0)     // Catch: java.lang.Throwable -> L64
            com.bytedance.hox.Hox r1 = r4.LIZ(r5)     // Catch: java.lang.Throwable -> L64
            X.0wAd r0 = r6.LLLJL     // Catch: java.lang.Throwable -> L64
            r1.vQ2(r0)     // Catch: java.lang.Throwable -> L64
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r5)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L30
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = X.C0DMM.LIZ(r0)     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L30
            X.0wJr r0 = r6.LLLL     // Catch: java.lang.Throwable -> L64
            r1.UC1(r0)     // Catch: java.lang.Throwable -> L64
            X.0wJr r0 = r6.LLLLII     // Catch: java.lang.Throwable -> L64
            r1.ao(r0)     // Catch: java.lang.Throwable -> L64
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L64
        L60:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L64
            goto L70
        L64:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L70:
            java.util.Set<java.lang.Integer> r0 = com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFeedVideoGuideAssem.LLLLIL
            r0.clear()
            X.0wAK r0 = X.C1770180wAK.LIZ
            r0.getClass()
            X.C1770180wAK.LIZIZ = r2
            r0 = 1
            r6.LLLILZLLLI = r0
            r6.Up(r0)
            r0 = 0
            r6.LLLIZZ = r0
            r6.LLLJIL = r0
            r6.LLLJ = r0
            X.0wAQ r1 = new X.0wAQ
            r1.<init>(r6, r2)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r6, r2, r2, r1, r0)
            r6.LLLIIL = r0
        L95:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS312S0000000_26.invoke$1(kotlin.jvm.internal.AwS312S0000000_26, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS312S0000000_26 awS312S0000000_26, Object obj, Object obj2) {
        C0R9E c0r9e;
        EnumC1770140wAG enumC1770140wAG;
        EcSearchNoCartFeedVideoGuideAssem ecSearchNoCartFeedVideoGuideAssem = (EcSearchNoCartFeedVideoGuideAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0r9e = (C0R9E) c291001Au.LIZ) != null) {
            ((LinkedHashMap) ecSearchNoCartFeedVideoGuideAssem.LLLLIIL).clear();
            EcSearchNoCartFeedVideoGuideAssem.Vp(ecSearchNoCartFeedVideoGuideAssem);
            ecSearchNoCartFeedVideoGuideAssem.Tp(C724240Sb0.LIZ(ecSearchNoCartFeedVideoGuideAssem));
            ecSearchNoCartFeedVideoGuideAssem.LLLILZLLLI = false;
            ecSearchNoCartFeedVideoGuideAssem.Up(false);
            AnonymousClass0956 anonymousClass0956 = ecSearchNoCartFeedVideoGuideAssem.LLLIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            AnonymousClass0956 anonymousClass09562 = ecSearchNoCartFeedVideoGuideAssem.LLLIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            ecSearchNoCartFeedVideoGuideAssem.LLLIIL = null;
            ecSearchNoCartFeedVideoGuideAssem.LLLIL = null;
            if (c0r9e.LIZIZ) {
                enumC1770140wAG = EnumC1770140wAG.DRAW_UP;
            } else {
                enumC1770140wAG = EnumC1770140wAG.DRAW_DOWN;
            }
            ecSearchNoCartFeedVideoGuideAssem.Bp(enumC1770140wAG);
        }
        return Unit.LIZ;
    }
}
