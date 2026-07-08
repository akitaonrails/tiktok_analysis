package com.ss.android.ugc.aweme.impl;

import X.C01GW;
import X.C04U2;
import X.C052H;
import X.C0CLM;
import X.C0CN5;
import X.C0T5U;
import X.C0TKA;
import X.C0VY3;
import X.C104100aN;
import X.C1476920oXK;
import X.C1479130oat;
import X.C1505530pHT;
import X.C1513230pTt;
import X.C1513730pUh;
import X.C1513760pUk;
import X.C1514430pVp;
import X.C1602860roS;
import X.C1899620zX6;
import X.C19252910Tv;
import X.C19254610Um;
import X.C1BWL;
import X.C2162308dZ;
import X.C2187451AjH;
import X.C2222691Bz1;
import X.C2279641EKs;
import X.C452501pT;
import X.C581900Ms0;
import X.C584360Mvy;
import X.C818480W8w;
import X.C844470XAv;
import X.InterfaceC1513720pUg;
import X.RunnableC1513740pUi;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.IFeedStrategyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.utils.OHRPredictResultParams;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes24.dex */
public final class StrategyImpl implements IStrategyApi {
    public final C01GW LIZ = C452501pT.LIZIZ(new C04U2());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C052H());

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJIILL() {
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJJIZ() {
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LIZ() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LIZJ() {
        C1602860roS.LIZ.getClass();
        return C19254610Um.LIZIZ.LIZJ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJII() {
        return ((Number) this.LIZ.getValue()).intValue() == 1;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIIZ() {
        return C818480W8w.LJ("homepage_friends");
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIL() {
        C1602860roS c1602860roS = C1602860roS.LIZ;
        C1513730pUh c1513730pUh = new C1513730pUh();
        c1602860roS.getClass();
        return C1602860roS.LIZ(c1513730pUh);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIILIIL() {
        return !(((IFeedStrategyService) PluggableExtentionKt.pluggableSpi$default(IFeedStrategyService.class, false, false, false, 14, null)) != null ? r0.LIZ() : false);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final OHRPredictResultParams LJIILLIIL() {
        SmartOHRService smartOHRService = C1513230pTt.LIZ;
        InterfaceC1513720pUg interfaceC1513720pUgLIZIZ = C1513230pTt.LIZ.LIZIZ();
        if (interfaceC1513720pUgLIZIZ != null) {
            return new OHRPredictResultParams(interfaceC1513720pUgLIZIZ.LIZIZ(), interfaceC1513720pUgLIZIZ.LIZ(), interfaceC1513720pUgLIZIZ.LIZLLL(), interfaceC1513720pUgLIZIZ.LIZJ());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIZILJ() {
        return C818480W8w.LJ("homepage_follow");
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIJI() {
        return ((Boolean) C2279641EKs.LJII.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJIJJ() {
        SmartFeedPreloadService.Companion.getClass();
        return C1505530pHT.LIZ.obtainAiFastSlowPredict();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIL() {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
        if (iPerformanceOptAppDiffService != null) {
            return iPerformanceOptAppDiffService.LIZJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJ() {
        return C0CLM.LIZLLL == 1;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIFFI() {
        return ((Boolean) C2279641EKs.LJFF.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIIJ() {
        return ((Number) this.LIZ.getValue()).intValue() == 3;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJIIJI() {
        IFeedStrategyService iFeedStrategyService = (IFeedStrategyService) PluggableExtentionKt.pluggableSpi$default(IFeedStrategyService.class, false, false, false, 14, null);
        if (iFeedStrategyService != null) {
            return iFeedStrategyService.LIZIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int getAppId() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final Context getApplicationContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final long getUpdateVersionCode() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean isNewUser() {
        return ((Number) this.LIZ.getValue()).intValue() != 2;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LIZIZ() {
        return C0CN5.LJII();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJFF() {
        return C2187451AjH.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJI() {
        return ((CommentService) ServiceManager.get().getService(CommentService.class)).LJLJLJ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIIIZZ() {
        return C2162308dZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final String LJIIJ() {
        return C2222691Bz1.LIZ().toUpperCase(Locale.US);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJJI() {
        return C1476920oXK.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIII() {
        return C1899620zX6.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIIJZLJL() {
        return ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIIZI() {
        return C584360Mvy.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIL() {
        return ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).enableForcedLogin(false);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJJ() {
        return C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(482));
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final Application getApplication() {
        return C1BWL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int getAverageSpeedInKBps() {
        return C1479130oat.LJII();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int getBrightness() {
        return C1476920oXK.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean isFirstInstallAndFirstLaunch() {
        return C1514430pVp.LIZLLL().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean isLogin() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIJJI() {
        return C581900Ms0.LJI;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJII() {
        return C2187451AjH.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final String LJJIIZ() {
        return C2187451AjH.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJIL() {
        return C0TKA.LJI;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LIZLLL(long j) {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LIZJ(j);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJIJJLI(int i) {
        return C19252910Tv.LIZIZ.LIZLLL().LIZ().LJIIIIZZ(i);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJ(Function0<Boolean> function0) {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LIZ(function0);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJJIJIIJIL(int i) {
        return C19252910Tv.LIZIZ.LIZLLL().LIZ().LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJJIJL(Runnable runnable) {
        ((ExecutorService) C0T5U.LIZ.getValue()).execute(runnable);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJLIJ(Function0<Boolean> function0) {
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJFF() && C0TKA.LJI && function0 != null && function0.invoke().booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJIILJJIL(RunnableC1513740pUi runnableC1513740pUi, C1513760pUk c1513760pUk) {
        try {
            c1513760pUk.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            runnableC1513740pUi.run();
            C0VY3.LIZLLL(e, "executeMethodSafely", "ActivityDrawablePreload", "executeMethodSafely", "");
        }
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJIJ(String str, Function0<Unit> function0) {
        C0VY3.LIZIZ(str, function0);
    }
}
