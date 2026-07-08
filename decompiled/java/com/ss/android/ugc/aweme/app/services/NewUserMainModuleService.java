package com.ss.android.ugc.aweme.app.services;

import X.C01GW;
import X.C0CCZ;
import X.C0CO3;
import X.C452501pT;
import X.InterfaceC800130Va7;
import android.app.Activity;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.services.IMainOutBridgeService;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class NewUserMainModuleService implements INewUserMainModuleService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(46));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(186));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(187));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19EG LJII() {
        /*
            r10 = this;
            X.0sFk r0 = new java.lang.Object() { // from class: X.0sFk
                static {
                    /*
                        X.0sFk r0 = new X.0sFk
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0sFk) X.0sFk.LIZ X.0sFk
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1619780sFk.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1619780sFk.<init>():void");
                }
            }
            r0.getClass()
            android.app.Activity[] r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getActivityStack()
            r9 = 0
            X.089E r3 = new X.089E     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3f
        Lf:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L3f
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r2 instanceof X.C19EG     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto Lf
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r4 = com.ss.android.ugc.aweme.services.IMainService.class
            r5 = 0
            r8 = 14
            r6 = r5
            r7 = r5
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.services.IMainService r1 = (com.ss.android.ugc.aweme.services.IMainService) r1     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L39
            r0 = r2
            X.19EG r0 = (X.C19EG) r0     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.isMainActivity(r0)     // Catch: java.lang.Throwable -> L3f
            r0 = 1
            if (r1 != r0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto Lf
            X.19EG r2 = (X.C19EG) r2     // Catch: java.lang.Throwable -> L3f
            return r2
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            X.C189200o6.m5exceptionOrNullimpl(r0)
        L4e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.services.NewUserMainModuleService.LJII():X.19EG");
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> LJIIJ() {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null) {
            return iDeepLinkService.LJJLIIJ();
        }
        return null;
    }

    public final IRecommendFeedOutBridgeService LJIILJJIL() {
        return (IRecommendFeedOutBridgeService) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> getSplashActivityClass() {
        return ((IMainOutBridgeService) this.LIZIZ.getValue()).getSplashActivityClass();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LIZIZ() {
        LJIILJJIL().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LIZJ() {
        ContentLanguageGuideServiceImpl.LIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LIZLLL() {
        LJIILJJIL().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LJ() {
        LJIILJJIL().LJ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LJIIIIZZ() {
        LJIILJJIL().LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LJIIIZ() {
        LJIILJJIL().LJII();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final boolean LJIIJJI() {
        return ContentLanguageGuideServiceImpl.LIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void LIZ(boolean z) {
        LJIILJJIL().LIZ(z);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final InterfaceC800130Va7 LJI(boolean z) {
        return LJIILJJIL().LJI(z);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> LJIIL(String str) {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService != null) {
            return iDeepLinkService.LJLJJI(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final InterfaceC800130Va7 LJIILIIL(C0CO3 c0co3) {
        return new FetchComplianceSettingRequest(c0co3);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void setContentLanguage(String str) {
        ContentLanguageGuideServiceImpl.LIZ().setContentLanguage(str);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final C0CCZ LJFF(int i, int i2) {
        return LJIILJJIL().LJFF(i, i2);
    }
}
