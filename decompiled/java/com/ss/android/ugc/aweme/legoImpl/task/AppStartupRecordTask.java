package com.ss.android.ugc.aweme.legoImpl.task;

import X.AnonymousClass0716;
import X.C089N;
import X.C08TN;
import X.C0CCZ;
import X.C0CD2;
import X.C0NJH;
import X.C0T6X;
import X.C0T6Y;
import X.C0VZ0;
import X.C1033630d0L;
import X.C1150504el;
import X.C13WZ;
import X.C146C;
import X.C1562780qlo;
import X.C1906580ziK;
import X.C1913090zsp;
import X.C1BWL;
import X.C202094145s;
import X.C202098145w;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2456309jt;
import X.C285090BFj;
import X.C798360VTm;
import X.C807520Vm2;
import X.C815100VyG;
import X.C823050WQl;
import X.EnumC1609850rzj;
import X.EnumC20023013Wa;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.AfS164S0200000_30;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC20234614Fk
public final class AppStartupRecordTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppStartupRecordTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(1:80)|(6:70|3|73|4|77|5)|(7:6|(1:8)(1:89)|68|27|(2:31|(2:33|(2:34|(3:36|(2:38|(1:91)(1:(2:42|94)(1:93)))(2:43|(2:45|92)(1:95))|46)(1:90)))(1:50))(0)|51|52)|9|75|10|68|27|(0)(0)|51|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(new java.lang.String(r5, r2, r6 - r2)) * (1000 / android.system.Os.sysconf(android.system.OsConstants._SC_CLK_TCK));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a6: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:166), block:B:54:0x00a6 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[PHI: r1
      0x005d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:26:0x0051, B:30:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0 A[EDGE_INSN: B:90:0x00a0->B:50:0x00a0 BREAK  A[LOOP:1: B:34:0x006a->B:46:0x008a]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppStartupRecordTask() throws java.lang.Throwable {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "/proc/self/stat"
            r6 = 0
            r2 = 0
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> Lab
            r4.<init>(r5)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> Lab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            r3.<init>()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
        L1a:
            int r1 = r4.read(r2)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            r0 = -1
            if (r1 == r0) goto L2a
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            r0.<init>(r2, r6, r1)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            r3.append(r0)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            goto L1a
        L2a:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> La5
            r4.close()     // Catch: java.io.IOException -> L32
            goto L53
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L53
        L37:
            r0 = move-exception
            goto L42
        L39:
            r0 = move-exception
            r4 = r2
            goto L42
        L3c:
            r1 = move-exception
            r5 = r2
            goto La7
        L3f:
            r0 = move-exception
            r4 = r2
            r5 = r2
        L42:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = ""
            if (r4 == 0) goto L51
            r4.close()     // Catch: java.io.IOException -> L4d
            goto L51
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L51:
            if (r5 == 0) goto L5d
        L53:
            r5.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5b:
            if (r1 == 0) goto La0
        L5d:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La0
            char[] r5 = r1.toCharArray()
            r4 = 0
            r3 = 0
            r2 = 0
        L6a:
            int r0 = r5.length
            if (r6 >= r0) goto La0
            char r1 = r5[r6]
            r0 = 32
            if (r1 != r0) goto L85
            r0 = 20
            if (r4 != r0) goto L7e
            java.lang.String r4 = new java.lang.String
            int r6 = r6 - r2
            r4.<init>(r5, r2, r6)
            goto L8d
        L7e:
            if (r3 == 0) goto L8a
            int r4 = r4 + 1
            int r2 = r6 + 1
            goto L8a
        L85:
            r0 = 41
            if (r1 != r0) goto L8a
            r3 = 1
        L8a:
            int r6 = r6 + 1
            goto L6a
        L8d:
            int r0 = android.system.OsConstants._SC_CLK_TCK     // Catch: java.lang.Throwable -> L9c
            long r0 = android.system.Os.sysconf(r0)     // Catch: java.lang.Throwable -> L9c
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r4)     // Catch: java.lang.Throwable -> L9c
            long r0 = r0 * r2
            goto La2
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La0:
            r0 = -1
        La2:
            X.C202094145s.LIZIZ = r0
            return
        La5:
            r1 = move-exception
            r2 = r4
        La7:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> Lab
            goto Lad
        Lab:
            r1 = move-exception
            goto La7
        Lad:
            if (r2 == 0) goto Lb7
            r2.close()     // Catch: java.io.IOException -> Lb3
            goto Lb7
        Lb3:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb7:
            if (r5 == 0) goto Lc1
            r5.close()     // Catch: java.io.IOException -> Lbd
            throw r1
        Lbd:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lc1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImpl.task.AppStartupRecordTask.<init>():void");
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        boolean z;
        Application application;
        C1033630d0L.LIZIZ = SystemClock.elapsedRealtime();
        if (C1033630d0L.LIZ < 0) {
            C1033630d0L.LIZ = SystemClock.elapsedRealtime();
        }
        C1033630d0L.LIZJ = System.currentTimeMillis();
        C13WZ c13wz = C089N.LIZ;
        Application applicationLIZ = C1BWL.LIZ();
        boolean zBooleanValue = ((Boolean) C0CD2.LJL.getValue()).booleanValue();
        c13wz.LJFF = zBooleanValue;
        if (zBooleanValue && applicationLIZ != null) {
            c13wz.LJ = applicationLIZ;
            if (c13wz.LJIIIZ()) {
                c13wz.LJIIJJI(0);
                Intent intentLIZJ = C13WZ.LIZJ();
                if (intentLIZJ != null && intentLIZJ.getAction() != null && intentLIZJ.getComponent() != null) {
                    HashMap map = new HashMap();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(intentLIZJ.getAction());
                    sbLIZ.append("_");
                    sbLIZ.append(intentLIZJ.getComponent().getShortClassName());
                    map.put("launch_intent_action_component_combo", C2188811AlT.LIZIZ(sbLIZ));
                    c13wz.LJIILIIL(map);
                }
                C1906580ziK.LIZJ().LJIIJ().LJLLLLLL(new AfS164S0200000_30(c13wz, intentLIZJ, 0));
            }
        }
        if (C13WZ.LJI()) {
            c13wz.LJIILJJIL(EnumC20023013Wa.Launcher);
        } else if (C13WZ.LJII()) {
            c13wz.LJIILJJIL(EnumC20023013Wa.Push);
        } else if (C13WZ.LJFF()) {
            if (C13WZ.LJ()) {
                c13wz.LJIILJJIL(EnumC20023013Wa.ClickPushCold);
            } else {
                c13wz.LJIILJJIL(EnumC20023013Wa.Deeplink);
            }
        } else {
            c13wz.LJIILJJIL(EnumC20023013Wa.Other);
        }
        long j = C202094145s.LJIIIZ - C202094145s.LIZIZ;
        long j2 = C202094145s.LJII - C202094145s.LIZ;
        long j3 = C202094145s.LJIIJ - C202094145s.LJII;
        long j4 = C202094145s.LJIIL - C202094145s.LJIIJJI;
        long j5 = C202094145s.LJIILJJIL - C202094145s.LJIILIIL;
        long j6 = C202094145s.LJIILL - C202094145s.LJII;
        C08TN.LIZ().LJII(C202094145s.LJI, "app_main_thread_time");
        C08TN.LIZ().LJII(j, "app_launch_to_app_init");
        if (j2 > 0) {
            C08TN.LIZ().LJII(j2, "classloader_created_to_app_init");
        }
        C08TN.LIZ().LJII(j3, "app_init_duration");
        C2187451AjH.LJI = j;
        C1150504el.LIZ().LJ(C202094145s.LJI, "app_main_thread_time");
        C08TN.LIZ().LJII(j4, "app_attach_ensure_keva_duration");
        C08TN.LIZ().LJII(j5, "app_attach_launch_guard_duration");
        C08TN.LIZ().LJII(j6, "app_init_to_app_attach");
        C1150504el.LIZ().LJ(j, "app_launch_to_app_init");
        if (j2 > 0) {
            C1150504el.LIZ().LJ(j2, "classloader_created_to_app_init");
        }
        C1150504el.LIZ().LJ(j3, "app_init_duration");
        C1150504el.LIZ().LJ(j4, "app_attach_ensure_keva_duration");
        C1150504el.LIZ().LJ(j5, "app_attach_launch_guard_duration");
        C1150504el.LIZ().LJ(j6, "app_init_to_app_attach");
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1150504el.LIZ().LJIJJ = ((Boolean) C0CD2.LJJJLIIL.getValue()).booleanValue();
        C202098145w c202098145wLIZ = C08TN.LIZ();
        c202098145wLIZ.LJJIJIIJI = ((Boolean) AnonymousClass0716.LJJIII.getValue()).booleanValue();
        c202098145wLIZ.LJJIL = true;
        c202098145wLIZ.LJJIZ = true;
        c202098145wLIZ.LJJJ = true;
        c202098145wLIZ.LJJJJI = true;
        c202098145wLIZ.LJJJJIZL = true;
        c202098145wLIZ.LJJJJJ = true;
        c202098145wLIZ.LJJJJJL = true;
        c202098145wLIZ.LJJJJL = true;
        c202098145wLIZ.LJJLIIIJJI = Process.myTid();
        c202098145wLIZ.LJJLIIIJJIZ = new C798360VTm(true, new int[]{c202098145wLIZ.LJJLIIIJJI}, 22);
        C08TN.LIZ().LJJJI = C1562780qlo.LIZIZ();
        C08TN.LIZ().LJJJIL = C1562780qlo.LIZJ();
        C08TN.LIZ().LJJJJ = ((Boolean) C807520Vm2.LIZLLL.getValue()).booleanValue();
        C202098145w c202098145wLIZ2 = C08TN.LIZ();
        boolean z2 = C146C.LIZ;
        boolean z3 = C146C.LIZIZ;
        boolean z4 = C146C.LIZJ;
        c202098145wLIZ2.LJJIJIIJIL = z2;
        c202098145wLIZ2.LJJIJIL = z3;
        c202098145wLIZ2.LJJIJL = z4;
        C202098145w c202098145wLIZ3 = C08TN.LIZ();
        ((Number) AnonymousClass0716.LJJIIJZLJL.getValue()).longValue();
        c202098145wLIZ3.getClass();
        C08TN.LIZ().LJJJJLI = C2456309jt.LIZ();
        ColdBootPushStartupExperiment.NetworkPendingInterceptor networkPendingInterceptor = C815100VyG.LIZ;
        if (ColdBootPushStartupExperiment.LIZ().networkPendingInterceptor && (C2456309jt.LIZJ() || ColdBootPushStartupExperiment.LIZIZ())) {
            z = true;
        } else {
            z = false;
        }
        long j7 = ColdBootPushStartupExperiment.LIZ().networkPendingInterceptorInterval;
        networkPendingInterceptor.LLILLJJLI = z;
        networkPendingInterceptor.LLILLL = j7;
        if (!((Boolean) C285090BFj.LJJ.getValue()).booleanValue()) {
            C08TN.LIZ().LJ("nuj_perf_monitor", false);
            NujPerformanceTrackerV2.LIZ(C0NJH.LAUNCH2MAIN_DURATION);
            C08TN.LIZ().LJI("nuj_perf_monitor");
        }
        C08TN.LIZ().LJJJJL(EnumC1609850rzj.APPLICATION_ATTACH);
        C1150504el.LIZ().LIZLLL("feed_boot_to_feed_request", true);
        C1150504el.LIZ().LIZLLL("feed_cover_total", false);
        C1150504el.LIZ().LIZLLL("cold_boot_start_to_feed_ui", false);
        C1150504el.LIZ().LIZLLL("feed_boot_to_network", false);
        C1150504el.LIZ().LIZLLL("feed_boot_to_init_ttnet", false);
        C1150504el.LIZ().LIZLLL("feed_boot_to_init_ttnet_end", false);
        C1150504el.LIZ().LIZLLL("app_start_to_preload_first_request", false);
        C1150504el.LIZ().LIZLLL("app_start_to_get_did", false);
        C1150504el.LIZ().LIZLLL("cold_boot_start_to_prerender_end_nuj_scene", false);
        C1150504el.LIZ().LIZLLL("cold_boot_new_user_start_to_login", false);
        C1150504el.LIZ().LIZLLL("cold_boot_start_to_preload_main", false);
        C1150504el.LIZ().LIZLLL("cold_boot_start_to_feed_total_start", false);
        C1150504el.LIZ().LJJII = jCurrentTimeMillis;
        C1150504el.LIZ().LJJIII = SystemClock.elapsedRealtime();
        C1150504el.LIZ().LJ(jCurrentTimeMillis, "cold_boot_begin_time");
        C1150504el.LIZ().LJ(jCurrentThreadTimeMillis, "app_thread_to_start");
        C1913090zsp.LIZ.getClass();
        try {
            C1913090zsp.LIZIZ = SystemClock.uptimeMillis();
            C1913090zsp.LIZJ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if ((context instanceof Application) && (application = (Application) context) != null) {
            C0T6X c0t6x = new C0T6X();
            C0T6Y c0t6y = new C0T6Y() { // from class: X.145r
                @Override // X.C0T6Y
                public final void LIZ() {
                    C592890NNf.LIZIZ().LIZJ();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C0T6Y
                public final void LIZIZ(Activity activity, Map<String, Object> map2) {
                    if (activity instanceof C07KE) {
                        ((C07KE) activity).onDrawFirstFrame(map2);
                    }
                }
            };
            application.registerActivityLifecycleCallbacks(c0t6x);
            c0t6x.LL = c0t6y;
        }
        if (context != null) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.09Nn
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppStartupRecordTask@b54f.run$2");
                    try {
                        final Intent intentLIZ = C086T.LIZ();
                        Context context2 = context;
                        C1150504el.LIZ().LIZ = C086T.LIZ();
                        if (C08Q0.LJ(context2, "enable_process_start_event", false)) {
                            C0CN5.LIZIZ(15000L, new Runnable() { // from class: X.09Nm
                                public final void LIZ() {
                                    C2362309Nl c2362309Nl = C2362309Nl.LIZ;
                                    Intent intent = intentLIZ;
                                    c2362309Nl.getClass();
                                    if (intent != null) {
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("process", C2162308dZ.LIZ(C1BWL.LIZ()));
                                            String action = intent.getAction();
                                            if (!TextUtils.isEmpty(action)) {
                                                jSONObject.put("action", action);
                                            }
                                            ComponentName component = intent.getComponent();
                                            String shortClassName = component != null ? component.getShortClassName() : null;
                                            if (!TextUtils.isEmpty(shortClassName)) {
                                                jSONObject.put("component", shortClassName);
                                            }
                                            if (C2104108Md.LIZLLL(C1BWL.LIZ())) {
                                                AppLogNewUtils.onEventV3("process_start_reason_event", jSONObject);
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ2;
                                    C1C7U.LIZ("AppStartupRecordTask@b54f.run$2$1$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ2) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AppStartupRecordTask@b54f.run$2$1$1");
                                }
                            });
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppStartupRecordTask@b54f.run$2");
                }
            });
        }
    }
}
