package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass0716;
import X.C0CCZ;
import X.C0CD2;
import X.C0CN5;
import X.C0VZ0;
import X.C0X35;
import X.C1BWL;
import X.C20688088o;
import X.C2162308dZ;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS84S0000000_4;
import Y.ARunnableS88S0000000_9;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.boot.BootFinishHandler;
import com.ss.android.ugc.aweme.dfopt.task.DFPerfTestTask;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import com.ss.android.ugc.aweme.legoImpl.task.ColdBootRejectStrategyV2;
import com.ss.android.ugc.aweme.legoImpl.task.XVVRejectStrategy;
import com.ss.android.ugc.aweme.lifecycle.task.LifecycleTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class MessageControllerTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MessageControllerTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C2162308dZ.LJI(context)) {
            return;
        }
        try {
            Application applicationLIZ = C1BWL.LIZ();
            if (AnonymousClass0716.LIZLLL() == 1) {
                C0X35.LJIJJ(applicationLIZ, new ARunnableS83S0000000_3(13));
            }
            if (Build.VERSION.SDK_INT >= 28 && ((Boolean) C0CD2.LIZIZ.getValue()).booleanValue()) {
                C0X35.LJIJJ(applicationLIZ, new ARunnableS103S0100000_3((Object) applicationLIZ, 40));
            }
            if (AnonymousClass0716.LIZ()) {
                C0X35.LJIIIIZZ(C786410Ut5.v2(), new ARunnableS83S0000000_3(14));
            }
            C0CN5.LIZIZ(2000L, new Runnable() { // from class: X.09ji
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MessageControllerTask@d094.run$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MessageControllerTask@d094.run$1");
                }

                public static void LIZ() throws Throwable {
                    ArrayList<String> arrayList;
                    if ((C2455309jj.LIZIZ() > 0 && C2455309jj.LIZ() > 0) || C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_job_keep_warm", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_self_kill_idle_min", true) > 0) {
                        new LifecycleTask().run(C1BWL.LIZ());
                    }
                    new DFPerfTestTask().run(C1BWL.LIZ());
                    if (C2456309jt.LIZIZ() || !C1906580ziK.LJI()) {
                        return;
                    }
                    Application applicationLIZ2 = C1BWL.LIZ();
                    List<String> listLJFF = C2455309jj.LJFF(C0C64.LJIILLIIL().LJJ(31744, "4540_lifecycle_disable_receiver_components", "", true));
                    Keva repo = Keva.getRepo("LifecycleReceiverDisable");
                    String string = repo.getString("disabled_components", "");
                    if (TextUtils.isEmpty(string)) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = new ArrayList();
                        for (String str : string.split(",")) {
                            String strTrim = str.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : arrayList) {
                        Iterator<String> it2 = listLJFF.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (str2.equals(it2.next())) {
                                    arrayList2.add(str2);
                                    break;
                                }
                            } else {
                                try {
                                    applicationLIZ2.getPackageManager().setComponentEnabledSetting(new ComponentName(applicationLIZ2, str2), 0, 1);
                                    break;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                    }
                    for (String str3 : listLJFF) {
                        try {
                            applicationLIZ2.getPackageManager().setComponentEnabledSetting(new ComponentName(applicationLIZ2, str3), 2, 1);
                            Iterator it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (str3.equals(it3.next())) {
                                        break;
                                    }
                                } else {
                                    arrayList2.add(str3);
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                    repo.storeString("disabled_components", arrayList2.isEmpty() ? "" : TextUtils.join(",", arrayList2));
                }
            });
            applicationLIZ.registerActivityLifecycleCallbacks(new C20688088o() { // from class: X.0W1e
                public boolean LL;
                public boolean LLILLJJLI;

                @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    boolean z;
                    if (!this.LLILLJJLI) {
                        this.LLILLJJLI = true;
                        if (C052Y.LIZ()) {
                            C0R50 c0r50 = C0R51.LIZ;
                            if (!c0r50.LIZIZ) {
                                View decorView = activity.getWindow().getDecorView();
                                C786410Ut5.y3(decorView.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC738800SyU(decorView, 2));
                                c0r50.LIZIZ = true;
                            }
                        }
                        if (((Boolean) C0CD2.LJJIIZ.getValue()).booleanValue() && !C2456309jt.LIZ()) {
                            BootFinishHandler.LL.init();
                        }
                        C0X35.LJIIIIZZ(C786410Ut5.v2(), new ARunnableS88S0000000_9(10));
                        if (C292340Bd2.LIZ == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C0CN5.LIZIZ(2000L, new ARunnableS84S0000000_4(7));
                        }
                        if (C2548509yl.LIZ != 0) {
                            C0CN5.LIZIZ(2000L, new ARunnableS104S0100000_4((Object) activity, 26));
                        }
                        if (((Boolean) C1250604uu.LIZIZ.getValue()).booleanValue() || C305230Bxp.LIZ()) {
                            activity.getWindow().getDecorView().getViewTreeObserver().addOnWindowAttachListener(new ViewTreeObserverOnWindowAttachListenerC1520010pep(activity));
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                    boolean z;
                    super.onActivityPreCreated(activity, bundle);
                    if (!this.LL) {
                        this.LL = true;
                        ColdBootPushStartupExperiment.NetworkPendingInterceptor networkPendingInterceptor = C815100VyG.LIZ;
                        if (networkPendingInterceptor.LLILLJJLI) {
                            for (Thread thread : (HashSet) networkPendingInterceptor.LL) {
                                if (thread != null) {
                                    thread.interrupt();
                                }
                            }
                        }
                        Intent intent = activity.getIntent();
                        if (intent != null && bundle != null) {
                            long j = C0BST.LIZ * 1000;
                            if (j > 0) {
                                long j2 = C1589220rSS.LIZIZ().getLong("lastEnterBgTime", 0L);
                                if (j2 > 0 && !((ArrayList) C07PL.LIZIZ.getValue()).contains(activity.getClass().getSimpleName()) && System.currentTimeMillis() - j2 > j) {
                                    Set<String> categories = intent.getCategories();
                                    if (categories != null && categories.size() == 1 && "android.intent.action.MAIN".equals(intent.getAction()) && categories.contains("android.intent.category.LAUNCHER")) {
                                        z = true;
                                    } else {
                                        z = false;
                                        ComponentName component = intent.getComponent();
                                        if (component != null && ("com.ss.android.ugc.aweme.splash.SplashActivity".equals(C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuAySZl0Z5LNfgmJ0FxSXN6+Onap5nUz8jNj96D1IrHItBb", null))) || "com.ss.android.ugc.aweme.main.MainActivity".equals(C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuAySZl0Z5LNfgmJ0FxSXN6+Onap5nUz8jNj96D1IrHItBb", null))))) {
                                            z = true;
                                        }
                                    }
                                    new WeakReference(activity);
                                    try {
                                        if (z) {
                                            bundle.clear();
                                        } else {
                                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//main");
                                            smartRouteBuildRoute.addFlags(268468224);
                                            smartRouteBuildRoute.open();
                                            String name = activity.getClass().getName();
                                            Set<String> set = C292720Bde.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("!");
                                            sbLIZ.append(name);
                                            if (!((HashSet) set).contains(C2188811AlT.LIZIZ(sbLIZ)) && (((HashSet) set).contains("*") || ((HashSet) set).contains(name))) {
                                                activity.finish();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        }
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(new ColdBootRejectStrategyV2());
                        c799890VZj.LIZ(new XVVRejectStrategy());
                        c799890VZj.LIZIZ();
                    }
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
