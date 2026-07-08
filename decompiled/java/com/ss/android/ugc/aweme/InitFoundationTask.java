package com.ss.android.ugc.aweme;

import X.C0CCZ;
import X.C0VZ0;
import X.C19D2;
import X.C19DF;
import X.C19DP;
import X.C19DR;
import X.C21501019Cm;
import X.C21501619Cs;
import X.C726540Sei;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC21503119Dh;
import X.InterfaceC2214261BlQ;
import Y.AObjectS127S0000000_30;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.FoundationActivityViewModel;
import com.bytedance.ies.foundation.FoundationFragmentViewModel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.activity.IActivityCustomToastHelper;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.LanguageProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public final class InitFoundationTask implements C0CCZ {
    public final Function1<Activity, Unit> LL;
    public final Function1<Context, Context> LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitFoundationTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Application application;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if ((contextLIZ instanceof Application) && (application = (Application) contextLIZ) != null) {
            C21501019Cm c21501019Cm = new C21501019Cm();
            C19DF c19df = new C19DF();
            IActivityCustomToastHelper iActivityCustomToastHelper = new IActivityCustomToastHelper() { // from class: X.19DT
                @Override // com.bytedance.ies.foundation.activity.IActivityCustomToastHelper
                public final void showCustomToast(BaseActivity baseActivity, String str) {
                    C1389890mGx c1389890mGx = new C1389890mGx(baseActivity);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                }

                @Override // com.bytedance.ies.foundation.activity.IActivityCustomToastHelper
                public final void showCustomToast(BaseActivity baseActivity, int i, String str) {
                    C1389890mGx c1389890mGx = new C1389890mGx(baseActivity);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                }
            };
            BaseActivity.Companion.getClass();
            application.registerActivityLifecycleCallbacks(BaseActivity.callback);
            C19DP.LIZJ = iActivityCustomToastHelper;
            C19DP.LIZ = c21501019Cm;
            C19DP.LIZIZ = c19df;
            BaseActivity.viewModelClass = FoundationActivityViewModel.class;
            BaseFragment.LLILZ.getClass();
            BaseFragment.LLILZIL = FoundationFragmentViewModel.class;
        }
        C19DR c19dr = C19DR.LL;
        C19DR.LLILLJJLI = this.LL;
        C19DR.LLILLL = this.LLILLJJLI;
        BaseActivity.Companion.getClass();
        C726540Sei.LIZ(c19dr);
        C726540Sei.LIZ(new C19D2() { // from class: X.19DS
            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final Context LIZJ(Context context2) {
                if (!C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "reword_optimize_reword", true, false)) {
                    ((LanguageProvider) ServiceManager.get().getService(LanguageProvider.class)).LIZIZ(context2);
                }
                return context2;
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
                if (!C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "reword_optimize_reword", true, false)) {
                    ((LanguageProvider) ServiceManager.get().getService(LanguageProvider.class)).LIZ(baseActivity);
                }
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context2) {
                ((LanguageProvider) ServiceManager.get().getService(LanguageProvider.class)).LIZ(activity);
            }

            @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
                if (!C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "reword_optimize_reword", true, false)) {
                    ((LanguageProvider) ServiceManager.get().getService(LanguageProvider.class)).LIZ(baseActivity);
                }
                super.LJJIIZI(baseActivity, bundle);
            }

            @Override // X.C19DE, X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
                ((LanguageProvider) ServiceManager.get().getService(LanguageProvider.class)).LIZ(baseActivity);
            }
        });
        C726540Sei.LIZ(new InterfaceC21503119Dh() { // from class: X.0J9d
            @Override // X.InterfaceC21503119Dh
            public final Context LIZJ(Context context2) {
                return context2;
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJFF() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJIL(Activity activity, Context context2) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIFFI(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJII(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIII() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJL(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIL(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIZ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJI() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJIZL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJ() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJJL() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void finish() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                return false;
            }

            @Override // X.InterfaceC21503119Dh
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void onUserInteraction() {
            }

            @Override // X.InterfaceC21503119Dh
            public final void u1(int i, Intent intent) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJIIJI(BaseActivity baseActivity) {
                Activity activity;
                WeakReference<Activity> weakReference = C1389340mG4.LIZIZ;
                if (weakReference != null && (activity = weakReference.get()) != null && baseActivity.hashCode() == activity.hashCode()) {
                    return;
                }
                C1389340mG4.LIZIZ = new WeakReference<>(baseActivity);
                C1389340mG4.LIZJ = baseActivity.hashCode();
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJIJLIJ(BaseActivity baseActivity) {
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
                C1389340mG4.LIZ(baseActivity, null);
                C19252910Tv.LIZIZ.LIZ().onConfigurationChanged(baseActivity, configuration);
                Iterator it2 = ((ArrayList) C487280J9a.LIZ).iterator();
                while (it2.hasNext()) {
                    C487300J9c c487300J9c = (C487300J9c) it2.next();
                    InterfaceC487330J9f interfaceC487330J9f = c487300J9c.LIZIZ.get();
                    if (interfaceC487330J9f == null) {
                        it2.remove();
                    } else if (c487300J9c.LIZ == baseActivity.hashCode() || c487300J9c.LIZ < 0) {
                        try {
                            interfaceC487330J9f.onConfigurationChanged(baseActivity, configuration);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }

            @Override // X.InterfaceC21503119Dh
            public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
                C1389340mG4.LIZIZ = new WeakReference<>(baseActivity);
                C1389340mG4.LIZJ = baseActivity.hashCode();
                C19252910Tv.LIZIZ.LIZ().onActivityPreCreated(baseActivity, bundle);
            }
        });
        SAFExtensionKt.LJIJI(new InterfaceC2214261BlQ() { // from class: X.0mGT
            @Override // X.InterfaceC2214261BlQ
            public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                try {
                    Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                    if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                        C1389580mGS.LIZ.getClass();
                        C1389580mGS.LIZ(activityLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // X.InterfaceC2214261BlQ
            public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                try {
                    Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                    if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                        C1389580mGS.LIZ.getClass();
                        C1389580mGS.LIZ(activityLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
    }

    public InitFoundationTask(AObjectS127S0000000_30 aObjectS127S0000000_30, C21501619Cs c21501619Cs) {
        this.LL = aObjectS127S0000000_30;
        this.LLILLJJLI = c21501619Cs;
    }
}
