package com.ss.android.ugc.aweme.legoImp.task;

import X.C08Q0;
import X.C09JN;
import X.C0CCZ;
import X.C0VFZ;
import X.C0VZ0;
import X.C18KB;
import X.C18KG;
import X.C18ZN;
import X.C1906580ziK;
import X.C302820Btw;
import X.C813400VvW;
import X.C813440Vva;
import X.C814290Vwx;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS132S0100000_32;
import Y.AfS136S0000000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.sched.ProcTidFetcher;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.power.scene.SceneGenerator;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpComponentTracker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class RegisterLifecycle implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RegisterLifecycle";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    public static String LIZ(Activity activity) {
        Fragment fragmentLIZ = C813440Vva.LIZ(activity);
        if (fragmentLIZ != null) {
            return fragmentLIZ.toString();
        }
        return activity.toString();
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.1Aei
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if (!(activity instanceof MainActivity) && !(activity instanceof SplashActivity) && C616540OGe.LIZ()) {
                    String str = C2187451AjH.LJIIIZ;
                    LinkedList<String> linkedList = C2187451AjH.LJIIJ;
                    if (linkedList.size() > 0) {
                        C2187451AjH.LJIIIZ = linkedList.pop();
                    }
                    if (C1220604q4.LIZ()) {
                        Iterator it2 = ((CopyOnWriteArrayList) C2187451AjH.LJIIL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC2184631Aej) it2.next()).onFragmentChange(str, C2187451AjH.LJIIIZ, true);
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (((Number) C0ABG.LIZ.getValue()).intValue() == 1 && !(activity instanceof BaseActivity) && !(activity instanceof SparkActivity)) {
                    C827040WcQ.LIZ.getClass();
                    C827040WcQ.LIZ(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) throws JSONException {
                String str;
                if (((Number) C0ABG.LIZ.getValue()).intValue() == 1 && !(activity instanceof BaseActivity) && !(activity instanceof SparkActivity)) {
                    C827040WcQ.LIZ.getClass();
                    C01GW c01gw = C827040WcQ.LJ;
                    String name = (String) ((Map) c01gw.getValue()).get(C13LE.LIZ(activity.getClass()));
                    if (name == null) {
                        name = activity.getClass().getName();
                    }
                    if (!a0.LJJIIZI(name, "Activity", false) && !((Map) c01gw.getValue()).containsKey(C13LE.LIZ(activity.getClass()))) {
                        try {
                            Field declaredField = activity.getClass().getDeclaredField("_pnsPageId");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(activity);
                            if ((obj instanceof String) && (str = (String) obj) != null) {
                                String strLIZIZ = C1504880pGQ.LIZIZ(str);
                                if (strLIZIZ != null) {
                                    name = strLIZIZ;
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        ((Map) C827040WcQ.LJ.getValue()).put(C13LE.LIZ(activity.getClass()), name);
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("act", name);
                    C20684815ws.LJIJ("miss_act", jSONObject);
                    C827040WcQ.LIZ.getClass();
                    C827040WcQ.LIZIZ(activity);
                }
                C1514430pVp.LIZLLL().booleanValue();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                C0X35.LIZ("lifecycle_oncreate", false);
                if (C1702430uP3.LIZ && !(activity instanceof MainActivity) && !(activity instanceof SplashActivity)) {
                    C2187451AjH.LJFF(C1702430uP3.LJIIIIZZ * LSPassThroughRecordSizeConfig.DEFAULT);
                }
                boolean z = activity instanceof MainActivity;
                if (!z && !(activity instanceof SplashActivity)) {
                    int i = AnonymousClass0810.LIZ.LIZJ;
                    if (i == 2) {
                        if (C0N7U.LIZJ) {
                            C2187451AjH.LJIILLIIL(5000);
                        }
                    } else if (i == 3 && C309620CBs.LIZJ) {
                        C2187451AjH.LJIILLIIL(5000);
                    }
                    if (C616540OGe.LIZ()) {
                        String name = activity.getClass().getName();
                        int i2 = C2187451AjH.LIZ;
                        if (C1220604q4.LIZ()) {
                            Iterator it2 = ((CopyOnWriteArrayList) C2187451AjH.LJIIL).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC2184631Aej) it2.next()).onFragmentChange(C2187451AjH.LJIIIZ, name, true);
                            }
                        }
                        C2187451AjH.LJIIJ.push(C2187451AjH.LJIIIZ);
                        C2187451AjH.LJIIIZ = "";
                    }
                }
                C0X35.LIZ("lifecycle_oncreate_part_1", false);
                if (!z && !(activity instanceof SplashActivity)) {
                    if (((Boolean) C0ADJ.LIZ.getValue()).booleanValue() && ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).E5(activity)) {
                        C2187451AjH.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, false);
                    } else {
                        C2187451AjH.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, true);
                    }
                }
                C0X35.LJIIJJI("lifecycle_oncreate_part_1", false);
                C0X35.LIZ("lifecycle_oncreate_part_2", false);
                if (activity instanceof BaseActivity) {
                    C19FO c19fo = (C19FO) activity;
                    C0R1H.LIZIZ(c19fo, new AnalysisActivityComponent(c19fo));
                }
                C0X35.LJIIJJI("lifecycle_oncreate_part_2", false);
                if (activity instanceof C19EG) {
                    ((C19EG) activity).getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.18K8
                        @Override // X.AbstractC813200VvC
                        public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                            super.onFragmentResumed(fragmentManager, fragment);
                        }

                        @Override // X.AbstractC813200VvC
                        public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                            super.onFragmentStopped(fragmentManager, fragment);
                        }

                        @Override // X.AbstractC813200VvC
                        public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context2) {
                            super.onFragmentAttached(fragmentManager, fragment, context2);
                            if (fragment instanceof InterfaceC744180THc) {
                                new WeakReference(fragment);
                            }
                        }
                    }, true);
                }
                C0X35.LIZ("lifecycle_oncreate_part_3", false);
                C0X35.LJIIJJI("lifecycle_oncreate_part_3", false);
                C0X35.LJIIJJI("lifecycle_oncreate", false);
            }
        });
        C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new AfS136S0000000_13(0));
        application.registerActivityLifecycleCallbacks(C814290Vwx.LIZIZ.LJIJJ());
        if (!C302820Btw.LIZ()) {
            application.registerActivityLifecycleCallbacks(new C0VFZ());
        }
        final int iLIZIZ = C08Q0.LIZIZ(context, 0, "anr_main_and_render_thread_opt");
        if (1 <= iLIZIZ && iLIZIZ < 42) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(iLIZIZ) { // from class: X.0Vb0
                public static volatile boolean LLILZIL = true;
                public volatile int LL = -1;
                public final boolean LLILLJJLI;
                public final int LLILLL;
                public volatile int LLILZ;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void LIZ() {
                    try {
                        if (this.LLILLJJLI) {
                            JatoXL.setPriority(Process.myPid(), -20);
                        }
                        int i = this.LLILLL;
                        if (i <= 0 || i > 20) {
                            return;
                        }
                        int i2 = -i;
                        int i3 = ProcTidFetcher.LIZIZ;
                        if (i3 > 0) {
                            this.LL = i3;
                            Process.setThreadPriority(this.LL, i2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                {
                    boolean z;
                    if ((iLIZIZ & 1) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLILLJJLI = z;
                    this.LLILLL = iLIZIZ >> 1;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    if (LLILZIL) {
                        LLILZIL = false;
                        LIZ();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    synchronized (this) {
                        try {
                            this.LLILZ++;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    synchronized (this) {
                        try {
                            this.LLILZ--;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (!LLILZIL && this.LLILZ == 0) {
                        LLILZIL = true;
                        LIZ();
                    }
                }
            });
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0VFa
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(activity);
                sbLIZ.append(" onDestroyed");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LL.getClass();
                sbLIZ.append(RegisterLifecycle.LIZ(activity));
                sbLIZ.append(" onPaused");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LL.getClass();
                sbLIZ.append(RegisterLifecycle.LIZ(activity));
                sbLIZ.append(" onResumed");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", C2188811AlT.LIZIZ(sbLIZ));
                if (C302820Btw.LIZ()) {
                    SceneGenerator.LIZIZ().LJFF(activity.getClass().getName());
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LL.getClass();
                sbLIZ.append(RegisterLifecycle.LIZ(activity));
                sbLIZ.append(" onStarted");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LL.getClass();
                sbLIZ.append(RegisterLifecycle.LIZ(activity));
                sbLIZ.append(" onStopped");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                this.LL.getClass();
                sbLIZ.append(RegisterLifecycle.LIZ(activity));
                sbLIZ.append(" onCreated");
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("ActivityLifeCycleLog", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        ActivityStack.addAppBackGroundListener(new C18ZN() { // from class: X.18KH
            @Override // X.C18ZN
            public final void onAppBackground() {
                C0T6L.LIZLLL();
                C18KJ.LIZ.getClass();
                C18KS c18ks = C18KJ.LJ;
                c18ks.LIZ.removeCallbacksAndMessages(c18ks.LIZIZ);
                C18KG c18kg = C18KG.LIZ;
                c18kg.LIZJ().doLoop(AFwS278S0000000_32.get$arr$(158));
                C823050WQl.LJFF().submit(new ARunnableS132S0100000_32(c18kg.LIZJ(), 90));
            }

            @Override // X.C18ZN
            public final void onAppForeground() {
                C0T6L.LIZLLL();
                C18KJ.LIZ.getClass();
                C18KG.LIZ.LIZJ().doLoop(new C18KD());
                C823050WQl.LJFF().submit(C18KF.LL);
            }
        });
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.18K3
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                LIZ(activity, "onActivityDestroyed");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                LIZ(activity, "onActivityPaused");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPostDestroyed(Activity activity) {
                LIZ(activity, "onActivityPostDestroyed");
                C18KJ.LIZ.getClass();
                C18KJ.LIZIZ.remove(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (C2345409Gy.LIZ()) {
                    C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
                    return;
                }
                C18K9.LIZ.getClass();
                C18K9.LIZ(activity);
                LIZ(activity, "onActivityResumed");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                LIZ(activity, "onActivityStarted");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                LIZ(activity, "onActivityStopped");
            }

            public static void LIZ(Activity activity, String str) {
                new C18K4(activity, str);
                C0T6L.LIZLLL();
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityCreated(android.app.Activity r6, android.os.Bundle r7) {
                /*
                    r5 = this;
                    java.lang.String r4 = "fcp_page_id"
                    r1 = 0
                    if (r7 == 0) goto L9
                    java.lang.String r1 = r7.getString(r4)
                L9:
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1d
                    int r0 = r1.length()
                    if (r0 == 0) goto L1d
                    X.18KJ r0 = X.C18KJ.LIZ
                    r0.getClass()
                    java.util.WeakHashMap<java.lang.Object, java.lang.String> r0 = X.C18KJ.LIZIZ
                    r0.put(r6, r1)
                L1d:
                    if (r7 == 0) goto L24
                    java.lang.String r0 = ""
                    X.C786410Ut5.LJJJI(r4, r0, r7)
                L24:
                    java.lang.Boolean r0 = X.C18K5.LIZ
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 == 0) goto L32
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    X.C18K5.LIZ = r0
                L32:
                    java.lang.Boolean r0 = X.C18K5.LIZ
                    if (r0 != 0) goto L80
                    X.C18K5.LIZ = r1
                    if (r7 != 0) goto L66
                    java.lang.String r0 = "activity"
                    java.lang.Object r1 = X.C786410Ut5.F2(r6, r0)     // Catch: java.lang.Exception -> L68
                    boolean r0 = r1 instanceof android.app.ActivityManager     // Catch: java.lang.Exception -> L68
                    if (r0 == 0) goto L6c
                    android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Exception -> L68
                    if (r1 == 0) goto L6c
                    java.util.List r1 = r1.getAppTasks()     // Catch: java.lang.Exception -> L68
                    if (r1 == 0) goto L6c
                    int r0 = r1.size()     // Catch: java.lang.Exception -> L68
                    if (r0 <= 0) goto L6c
                    java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L68
                    android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0     // Catch: java.lang.Exception -> L68
                    if (r0 == 0) goto L6c
                    android.app.ActivityManager$RecentTaskInfo r0 = r0.getTaskInfo()     // Catch: java.lang.Exception -> L68
                    if (r0 == 0) goto L6c
                    int r0 = r0.numActivities     // Catch: java.lang.Exception -> L68
                    if (r0 <= r3) goto L6c
                L66:
                    r2 = 1
                    goto L6c
                L68:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L6c:
                    if (r2 == 0) goto L86
                    r0 = 171(0xab, float:2.4E-43)
                    kotlin.jvm.internal.AFwS278S0000000_32 r2 = kotlin.jvm.internal.AFwS278S0000000_32.get$arr$(r0)
                    java.util.concurrent.ExecutorService r1 = X.C823050WQl.LJFF()
                    X.18KE r0 = new X.18KE
                    r0.<init>()
                    r1.submit(r0)
                L80:
                    java.lang.String r0 = "onActivityCreated"
                    LIZ(r6, r0)
                    return
                L86:
                    X.18KQ r2 = new X.18KQ
                    r2.<init>()
                    java.util.concurrent.ExecutorService r1 = X.C823050WQl.LJFF()
                    X.18KE r0 = new X.18KE
                    r0.<init>()
                    r1.submit(r0)
                    goto L80
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C18K3.onActivityCreated(android.app.Activity, android.os.Bundle):void");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                C18KJ.LIZ.getClass();
                C786410Ut5.LJJJI("fcp_page_id", C18KJ.LIZIZ.get(activity), bundle);
                LIZ(activity, "onActivitySaveInstanceState");
            }
        });
        C18KG.LIZIZ = new C18KB() { // from class: X.18KA
            @Override // X.C18KB
            public final void LIZ(FcpComponentTracker fcpComponentTracker) {
                new AwS576S0100000_32(fcpComponentTracker, 755);
                C0T6L.LIZLLL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                for (Map.Entry<String, String> entry : fcpComponentTracker.getParams().entrySet()) {
                    c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                }
                C20684815ws.LJIILLIIL("core_fdmt_component_stay_time", c2344009Gk.LIZ);
            }
        };
        C813400VvW.LIZ.getClass();
        C1906580ziK.LIZJ().LJIIIZ().LJJLJLI(new C09JN() { // from class: X.0VvV
            /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.String r5 = "OutreachColdStartLifecycle@ff24.registerLifecycleCallback$createSubscriber$1"
                    X.C1C7U.LIZ(r5)
                    X.0VvZ r7 = (X.C813430VvZ) r7
                    X.0VvW r0 = X.C813400VvW.LIZ
                    r0.getClass()
                    X.0mCc r0 = r7.LIZ
                    android.app.Activity r4 = r0.LIZIZ()
                    boolean r0 = r4 instanceof android.app.Activity
                    if (r0 == 0) goto L6e
                    if (r4 == 0) goto L6e
                    android.os.Bundle r2 = r7.LIZIZ
                    java.lang.Boolean r0 = X.C813400VvW.LIZIZ
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 == 0) goto L28
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    X.C813400VvW.LIZIZ = r0
                L28:
                    java.lang.Boolean r0 = X.C813400VvW.LIZIZ
                    if (r0 != 0) goto L6e
                    X.C813400VvW.LIZIZ = r1
                    r3 = 1
                    if (r2 != 0) goto L6e
                    r2 = 0
                    java.lang.String r0 = "activity"
                    java.lang.Object r1 = X.C786410Ut5.F2(r4, r0)     // Catch: java.lang.Exception -> L61
                    boolean r0 = r1 instanceof android.app.ActivityManager     // Catch: java.lang.Exception -> L61
                    if (r0 == 0) goto L65
                    android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Exception -> L61
                    if (r1 == 0) goto L65
                    java.util.List r1 = r1.getAppTasks()     // Catch: java.lang.Exception -> L61
                    if (r1 == 0) goto L65
                    boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L61
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L65
                    java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L61
                    android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0     // Catch: java.lang.Exception -> L61
                    if (r0 == 0) goto L65
                    android.app.ActivityManager$RecentTaskInfo r0 = r0.getTaskInfo()     // Catch: java.lang.Exception -> L61
                    if (r0 == 0) goto L65
                    int r0 = r0.numActivities     // Catch: java.lang.Exception -> L61
                    if (r0 <= r3) goto L65
                    goto L6e
                L61:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L65:
                    r0 = 351(0x15f, float:4.92E-43)
                    kotlin.jvm.internal.AFwS200S0000000_13 r0 = kotlin.jvm.internal.AFwS200S0000000_13.get$arr$(r0)
                    X.C0S78.LIZJ(r0, r3)
                L6e:
                    X.C1C7U.LIZIZ(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C813390VvV.accept(java.lang.Object):void");
            }
        });
        C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0VvX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OutreachColdStartLifecycle@ff24.registerLifecycleCallback$backgroundSubscriber$1");
                if (((C606810Nr5) obj).LIZIZ) {
                    C813400VvW.LIZ.getClass();
                    IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) PluggableExtentionKt.pluggableSpi$default(IOutreachFrequency.class, false, false, false, 14, null);
                    if (iOutreachFrequency != null) {
                        iOutreachFrequency.LIZIZ();
                    }
                }
                C1C7U.LIZIZ("OutreachColdStartLifecycle@ff24.registerLifecycleCallback$backgroundSubscriber$1");
            }
        });
        C1906580ziK.LIZJ().LJIIIIZZ().LJJLJLI(new C09JN() { // from class: X.0VvY
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("OutreachColdStartLifecycle@ff24.registerLifecycleCallback$quitQppSubscriber$1");
                C813400VvW.LIZ.getClass();
                IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) PluggableExtentionKt.pluggableSpi$default(IOutreachFrequency.class, false, false, false, 14, null);
                if (iOutreachFrequency != null) {
                    iOutreachFrequency.release();
                }
                C1C7U.LIZIZ("OutreachColdStartLifecycle@ff24.registerLifecycleCallback$quitQppSubscriber$1");
            }
        });
        C1906580ziK.LIZJ().LJIIIZ().LJJLJLI(new C09JN() { // from class: X.0VvT
            /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.String r5 = "FcpComponentColdStartLifecycle@e1df.registerLifecycleCallback$createSubscriber$1"
                    X.C1C7U.LIZ(r5)
                    X.0VvZ r7 = (X.C813430VvZ) r7
                    X.0mCc r0 = r7.LIZ
                    android.app.Activity r4 = r0.LIZIZ()
                    boolean r0 = r4 instanceof android.app.Activity
                    if (r0 == 0) goto L69
                    if (r4 == 0) goto L69
                    android.os.Bundle r2 = r7.LIZIZ
                    java.lang.Boolean r0 = X.C813380VvU.LIZ
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 == 0) goto L23
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    X.C813380VvU.LIZ = r0
                L23:
                    java.lang.Boolean r0 = X.C813380VvU.LIZ
                    if (r0 != 0) goto L69
                    X.C813380VvU.LIZ = r1
                    r3 = 1
                    if (r2 != 0) goto L69
                    r2 = 0
                    java.lang.String r0 = "activity"
                    java.lang.Object r1 = X.C786410Ut5.F2(r4, r0)     // Catch: java.lang.Exception -> L5c
                    boolean r0 = r1 instanceof android.app.ActivityManager     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L60
                    android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Exception -> L5c
                    if (r1 == 0) goto L60
                    java.util.List r1 = r1.getAppTasks()     // Catch: java.lang.Exception -> L5c
                    if (r1 == 0) goto L60
                    boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L5c
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L60
                    java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Exception -> L5c
                    android.app.ActivityManager$AppTask r0 = (android.app.ActivityManager.AppTask) r0     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L60
                    android.app.ActivityManager$RecentTaskInfo r0 = r0.getTaskInfo()     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L60
                    int r0 = r0.numActivities     // Catch: java.lang.Exception -> L5c
                    if (r0 <= r3) goto L60
                    goto L69
                L5c:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L60:
                    r0 = 410(0x19a, float:5.75E-43)
                    kotlin.jvm.internal.AFwS200S0000000_13 r0 = kotlin.jvm.internal.AFwS200S0000000_13.get$arr$(r0)
                    X.C0S78.LIZJ(r0, r3)
                L69:
                    X.C1C7U.LIZIZ(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C813370VvT.accept(java.lang.Object):void");
            }
        });
        C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0VnC
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FcpComponentColdStartLifecycle@e1df.registerLifecycleCallback$backgroundSubscriber$1");
                if (((C606810Nr5) obj).LIZIZ) {
                    C20653815rs.LIZ.getClass();
                    C807940Vmi c807940VmiLIZIZ = C20653815rs.LIZIZ();
                    if (c807940VmiLIZIZ != null) {
                        C23250099c.LIZLLL(c807940VmiLIZIZ.LIZLLL, null, null, new C808070Vmv(c807940VmiLIZIZ, null), 3);
                    }
                }
                C1C7U.LIZIZ("FcpComponentColdStartLifecycle@e1df.registerLifecycleCallback$backgroundSubscriber$1");
            }
        });
        C1906580ziK.LIZJ().LJIIIIZZ().LJJLJLI(new C09JN() { // from class: X.0VnB
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FcpComponentColdStartLifecycle@e1df.registerLifecycleCallback$quitQppSubscriber$1");
                C20653815rs.LIZ.getClass();
                C807940Vmi c807940VmiLIZIZ = C20653815rs.LIZIZ();
                if (c807940VmiLIZIZ != null) {
                    c807940VmiLIZIZ.LJIIIZ = true;
                    AnonymousClass0956 anonymousClass0956 = c807940VmiLIZIZ.LJII;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C23250099c.LIZLLL(c807940VmiLIZIZ.LIZLLL, null, null, new C808110Vmz(c807940VmiLIZIZ, null), 3);
                }
                C1C7U.LIZIZ("FcpComponentColdStartLifecycle@e1df.registerLifecycleCallback$quitQppSubscriber$1");
            }
        });
    }
}
