package com.bytedance.android.livesdk.comp.impl.performance;

import X.C01GW;
import X.C08ME;
import X.C0N45;
import X.C0VGM;
import X.C0WPA;
import X.C0WPX;
import X.C0WTO;
import X.C0WTW;
import X.C1100750ekb;
import X.C1100770ekd;
import X.C1101060el6;
import X.C1101200elK;
import X.C1101500elo;
import X.C1162900gMq;
import X.C2183961Ade;
import X.C2184001Adi;
import X.C2184261Ae8;
import X.C404401hi;
import X.C405001ho;
import X.C786410Ut5;
import X.C814690Vxb;
import X.C827750WdZ;
import X.C838410Wul;
import X.EnumC1153470g7d;
import X.InterfaceC1100960ekw;
import X.InterfaceC1100980eky;
import X.InterfaceC1101080el8;
import X.InterfaceC463490IFn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.bytest.collector.BytestPerfCollectorManager;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostCpuInfoFetchExp;
import com.bytedance.android.livesdk.livesetting.performance.LiveThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveThreadPoolOptSetting;
import com.bytedance.android.livesdk.performance.LiveHostBroadcastRunnableBlockSetting;
import com.bytedance.android.livesdk.performance.LiveHostPreviewRunnableBlockSetting;
import com.bytedance.android.livesdk.performance.LiveJatoSetting;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.android.livesdk.performance.RealtimePerfScoreSettings;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class PerformanceService implements IPerformanceService, InterfaceC463490IFn {
    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1162900gMq Au2() {
        return new C1162900gMq();
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C404401hi Bs0() {
        C01GW<C404401hi> c01gw = C404401hi.LJFF;
        return C405001ho.LIZ();
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void Cl1() {
        if (C08ME.LIZJ) {
            return;
        }
        try {
            C08ME.LIZIZ(LiveThreadOptSetting.INSTANCE.getSlowDownPriority());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C08ME.LIZIZ(12);
        }
    }

    @Override // X.InterfaceC463490IFn
    public final void LIZ() {
        C2183961Ade.LIZ.LIZJ();
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void QE1() {
        Set<String> set = C08ME.LIZ;
        if (JatoXL.isInited() && C08ME.LIZJ) {
            C08ME.LIZJ = false;
            ArrayList arrayList = (ArrayList) C08ME.LIZ();
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                JatoXL.resetPriority(iIntValue);
                CpusetManager.resetCoreBind(iIntValue);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void Qk1() {
        for (Map.Entry entry : ((LinkedHashMap) C0WTW.LJIIJJI).entrySet()) {
            entry.getKey();
            C0WPX c0wpx = (C0WPX) entry.getValue();
            synchronized (c0wpx.LLILLJJLI) {
                try {
                    c0wpx.LLILLL = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final PerformanceManagerImpl Rs() {
        return PerformanceManagerImpl.LLLLLZL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void Sc1() {
        for (Map.Entry entry : ((LinkedHashMap) C0WTW.LJIIJJI).entrySet()) {
            entry.getKey();
            C0WPX c0wpx = (C0WPX) entry.getValue();
            synchronized (c0wpx.LLILLJJLI) {
                try {
                    c0wpx.LLILLL = false;
                    c0wpx.LLILLJJLI.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void VJ1() {
        C2183961Ade c2183961Ade = C2183961Ade.LIZ;
        if (LiveHostBroadcastRunnableBlockSetting.isEnable()) {
            C2184261Ae8 c2184261Ae8 = C2184261Ae8.LIZ;
            EnumC1153470g7d enumC1153470g7d = EnumC1153470g7d.BROADCAST;
            List<String> blockList = LiveHostBroadcastRunnableBlockSetting.getBlockList();
            long blockTimeInMills = LiveHostBroadcastRunnableBlockSetting.getBlockTimeInMills();
            c2184261Ae8.getClass();
            C2184261Ae8.LIZIZ(enumC1153470g7d, blockList, blockTimeInMills);
        }
        if (LiveJatoSetting.isEnable() && LiveJatoSetting.isLivePageEnable()) {
            c2183961Ade.LIZIZ("live_page");
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void YX0() {
        C0WPA c0wpa;
        C0WPA c0wpa2;
        C0WPA c0wpa3;
        C0WTW.LIZ.getClass();
        if (!C0WTW.LJIIIZ().enableRoomEnterStrategy || C0WTW.LJIILJJIL) {
            return;
        }
        C827750WdZ.LIZ("LiveThreadManager", "Preparing for room entering - adjusting thread pools");
        LiveThreadPoolOptSetting.ThreadPoolOptConfig threadPoolOptConfigLJIIIZ = C0WTW.LJIIIZ();
        int i = threadPoolOptConfigLJIIIZ.roomEnterDefaultCoreSize;
        int i2 = threadPoolOptConfigLJIIIZ.roomEnterDefaultMaxSize;
        ExecutorService executorService = ((C0WTO) C0WTW.LJ.getValue()).LL;
        if ((executorService instanceof C0WPA) && (c0wpa3 = (C0WPA) executorService) != null) {
            c0wpa3.LIZ(i, i2);
        }
        int i3 = threadPoolOptConfigLJIIIZ.roomEnterIoCoreSize;
        int i4 = threadPoolOptConfigLJIIIZ.roomEnterIoMaxSize;
        ExecutorService executorService2 = C0WTW.LJIIIIZZ().LL;
        if ((executorService2 instanceof C0WPA) && (c0wpa2 = (C0WPA) executorService2) != null) {
            c0wpa2.LIZ(i3, i4);
        }
        int i5 = threadPoolOptConfigLJIIIZ.highPriorityCoreSize;
        int i6 = threadPoolOptConfigLJIIIZ.highPriorityMaxSize;
        ExecutorService executorService3 = ((C0WTO) C0WTW.LJII.getValue()).LL;
        if ((executorService3 instanceof C0WPA) && (c0wpa = (C0WPA) executorService3) != null) {
            c0wpa.LIZ(i5, i6);
        }
        C0WTW.LJIILJJIL = true;
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void cX() {
        C0WTW.LIZ.getClass();
        if (C0WTW.LJIIIZ().enableRoomEnterStrategy && C0WTW.LJIILJJIL) {
            C827750WdZ.LIZ("LiveThreadManager", "Room entering completed - adjusting thread pool based on current load");
            C0WTW.LJFF();
            C0WTW.LJIILJJIL = false;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void ib0() {
        C2184261Ae8 c2184261Ae8 = C2184261Ae8.LIZ;
        EnumC1153470g7d enumC1153470g7d = EnumC1153470g7d.PREVIEW;
        c2184261Ae8.getClass();
        C2184261Ae8.LIZ(enumC1153470g7d);
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void pa1() {
        C2184261Ae8 c2184261Ae8 = C2184261Ae8.LIZ;
        EnumC1153470g7d enumC1153470g7d = EnumC1153470g7d.BROADCAST;
        c2184261Ae8.getClass();
        C2184261Ae8.LIZ(enumC1153470g7d);
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void w81() {
        C2183961Ade c2183961Ade = C2183961Ade.LIZ;
        if (LiveHostPreviewRunnableBlockSetting.isEnable()) {
            C2184261Ae8 c2184261Ae8 = C2184261Ae8.LIZ;
            EnumC1153470g7d enumC1153470g7d = EnumC1153470g7d.PREVIEW;
            List<String> blockList = LiveHostPreviewRunnableBlockSetting.getBlockList();
            long blockTimeInMills = LiveHostPreviewRunnableBlockSetting.getBlockTimeInMills();
            c2184261Ae8.getClass();
            C2184261Ae8.LIZIZ(enumC1153470g7d, blockList, blockTimeInMills);
        }
        if (LiveJatoSetting.isEnable() && LiveJatoSetting.isLivePreviewPageEnable()) {
            c2183961Ade.LIZIZ("live_preview");
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C2184001Adi wC() {
        return new C2184001Adi();
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1100770ekd xC1() {
        return C1100770ekd.LIZ.getValue();
    }

    @Override // X.InterfaceC463490IFn
    public final void LIZIZ() {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C2183961Ade.LIZ("first_frame");
        } else {
            C786410Ut5.LJJZZIII(C2183961Ade.LIZIZ, C0N45.LL);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1100750ekb jM() {
        return C1101060el6.LJIJI;
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C0VGM Gr0(long j) {
        return new C0VGM(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0elK] */
    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1101200elK R61(long j) {
        return new InterfaceC1100960ekw(j) { // from class: X.0elK
            public final long LIZ;
            public final Set<Function1<Double, Unit>> LIZIZ = new LinkedHashSet();
            public HashMap<String, Double> LIZJ = new HashMap<>();
            public long LIZLLL;

            @Override // X.InterfaceC1101140elE
            public final synchronized void LJI() {
                if (this.LIZIZ.isEmpty()) {
                    return;
                }
                double dLIZ = LIZ();
                Iterator<Function1<Double, Unit>> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(Double.valueOf(dLIZ));
                }
            }

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1101140elE
            public final void destroy() {
                this.LIZIZ.clear();
            }

            @Override // X.InterfaceC1100820eki
            public final double LIZ() {
                LIZLLL();
                if (RealtimePerfScoreSettings.INSTANCE.useOtisCpuSpeed() && LiveHostCpuInfoFetchExp.INSTANCE.isEnable()) {
                    Double d = this.LIZJ.get("cpu_speed_otis");
                    if (d != null) {
                        return d.doubleValue();
                    }
                    return 0.0d;
                }
                Double d2 = this.LIZJ.get("cpu_speed");
                if (d2 != null) {
                    return d2.doubleValue();
                }
                return 0.0d;
            }

            @Override // X.InterfaceC1100820eki
            public final double LIZJ() {
                int iLJ = C1305320k4Y.LJ(C497740JfY.LJII());
                if (iLJ != -999) {
                    return LIZ() / ((double) iLJ);
                }
                return 0.0d;
            }

            public final void LIZLLL() {
                if (SystemClock.elapsedRealtime() - this.LIZLLL < this.LIZ) {
                    return;
                }
                this.LIZJ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getCpuRate();
                this.LIZLLL = SystemClock.elapsedRealtime();
            }

            @Override // X.InterfaceC1100820eki
            public final double getCpuRate() {
                Double d;
                LIZLLL();
                if (RealtimePerfScoreSettings.INSTANCE.useOtisCpuRate() && LiveHostCpuInfoFetchExp.INSTANCE.isEnable() && (d = this.LIZJ.get("cpu_rate_otis")) != null) {
                    return d.doubleValue();
                }
                return 0.0d;
            }

            {
                this.LIZ = j;
            }

            @Override // X.InterfaceC1100820eki
            public final synchronized void LIZIZ(C1090250eTf c1090250eTf) {
                this.LIZIZ.add(c1090250eTf);
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1101060el6 V91(InterfaceC1101080el8 interfaceC1101080el8) {
        return new C1101060el6(interfaceC1101080el8);
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C2184001Adi ch2(String str) {
        if (str != null) {
            return new C2184001Adi(Collections.singleton(str));
        }
        return new C2184001Adi();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0jjS] */
    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final void dn0(Context context) {
        Context context2 = BytestPerfCollectorManager.LIZ;
        BytestPerfCollectorManager.LIZJ = new CopyOnWriteArraySet<>();
        BytestPerfCollectorManager.LIZIZ = new BroadcastReceiver() { // from class: X.0jjS
            public static void LIZ(Intent intent) {
                List listLJJLIIIJILLIZJL;
                CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet;
                if (!Intrinsics.LJFF(intent.getAction(), "BYTEST_PERF_BROADCAST")) {
                    return;
                }
                boolean booleanExtra = intent.getBooleanExtra("start", false);
                String stringExtra = null;
                try {
                    stringExtra = intent.getStringExtra("collectors");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Context context3 = BytestPerfCollectorManager.LIZ;
                BytestPerfCollectorManager.LJ = intent.getLongExtra("collect_interval", 3000L);
                BytestPerfCollectorManager.LJFF = intent.getLongExtra("dump_interval", 15000L);
                if (booleanExtra) {
                    BytestPerfCollectorManager.LIZIZ(true);
                    if (stringExtra != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(stringExtra, new String[]{","}, 0, 6)) != null && (r4 = listLJJLIIIJILLIZJL.iterator()) != null) {
                        for (Object obj : listLJJLIIIJILLIZJL) {
                            C1286690jaV c1286690jaV = new InterfaceC1292250jjT() { // from class: X.0jaV
                                @Override // X.InterfaceC1292250jjT
                                public final String name() {
                                    return "power";
                                }

                                static {
                                    C1300340jwW c1300340jwW = C476230Ilx.LIZ;
                                }

                                @Override // X.InterfaceC1292250jjT
                                public final JSONObject LIZ() throws JSONException {
                                    JSONObject jSONObject = new JSONObject();
                                    Map<String, String> mapFI = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).fI(C497740JfY.LJII());
                                    jSONObject.put("thor_galvanic_now", mapFI.get("thor_galvanic_now"));
                                    jSONObject.put("thor_galvanic_avg", mapFI.get("thor_galvanic_avg"));
                                    C1300340jwW c1300340jwW = C476230Ilx.LIZ;
                                    jSONObject.put("thermal_value", String.valueOf(c1300340jwW.LJFF));
                                    jSONObject.put("battery_level", c1300340jwW.LJ());
                                    jSONObject.put("battery_value", (c1300340jwW.LJ() <= 0 || c1300340jwW.LJI() <= 0) ? "-999" : String.valueOf(((double) c1300340jwW.LJ()) / ((double) c1300340jwW.LJI())));
                                    return jSONObject;
                                }
                            };
                            if (Intrinsics.LJFF(obj, "power")) {
                                CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet2 = BytestPerfCollectorManager.LIZJ;
                                if (copyOnWriteArraySet2 != null) {
                                    copyOnWriteArraySet2.add(c1286690jaV);
                                }
                            } else {
                                C1284060jWG c1284060jWG = new InterfaceC1292250jjT() { // from class: X.0jWG
                                    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(83));

                                    @Override // X.InterfaceC1292250jjT
                                    public final String name() {
                                        return "cpu";
                                    }

                                    @Override // X.InterfaceC1292250jjT
                                    public final JSONObject LIZ() throws JSONException {
                                        JSONObject jSONObject = new JSONObject();
                                        HashMap<String, Double> cpuRate = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getCpuRate();
                                        jSONObject.put("cpu_speed", cpuRate.get("cpu_speed"));
                                        jSONObject.put("cpu_cores", ((Number) LIZIZ.getValue()).intValue());
                                        jSONObject.put("cpu_total", cpuRate.get("cpu_rate"));
                                        return jSONObject;
                                    }
                                };
                                if (Intrinsics.LJFF(obj, "cpu")) {
                                    CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet3 = BytestPerfCollectorManager.LIZJ;
                                    if (copyOnWriteArraySet3 != null) {
                                        copyOnWriteArraySet3.add(c1284060jWG);
                                    }
                                } else {
                                    C1284070jWH c1284070jWH = new InterfaceC1292250jjT() { // from class: X.0jWH
                                        @Override // X.InterfaceC1292250jjT
                                        public final String name() {
                                            return "memory";
                                        }

                                        @Override // X.InterfaceC1292250jjT
                                        public final JSONObject LIZ() throws JSONException {
                                            HashMap<String, Long> memory = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getMemory();
                                            Long l = memory.get("mem_pss_total");
                                            Long l2 = memory.get("mem_app_allocate");
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("pss_app_usage", l);
                                            if (l2 != null && l != null && l2.longValue() > 0) {
                                                jSONObject.put("memory_usage_rate_android", Float.valueOf((l.longValue() * 1.0f) / l2.longValue()));
                                            }
                                            return jSONObject;
                                        }
                                    };
                                    if (Intrinsics.LJFF(obj, "memory")) {
                                        CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet4 = BytestPerfCollectorManager.LIZJ;
                                        if (copyOnWriteArraySet4 != null) {
                                            copyOnWriteArraySet4.add(c1284070jWH);
                                        }
                                    } else {
                                        C1281980jSu c1281980jSu = new InterfaceC1292250jjT() { // from class: X.0jSu
                                            @Override // X.InterfaceC1292250jjT
                                            public final String name() {
                                                return "livefps";
                                            }

                                            @Override // X.InterfaceC1292250jjT
                                            public final JSONObject LIZ() throws JSONException {
                                                JSONObject jSONObject = new JSONObject();
                                                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                                                c1276840jKc.getClass();
                                                Map<String, String> map = C1276840jKc.LJIIL;
                                                jSONObject.put("encode_fps", ((LinkedHashMap) map).get("encode_fps"));
                                                c1276840jKc.getClass();
                                                jSONObject.put("in_cap_fps", ((LinkedHashMap) map).get("in_cap_fps"));
                                                c1276840jKc.getClass();
                                                jSONObject.put("out_cap_fps", ((LinkedHashMap) map).get("out_cap_fps"));
                                                c1276840jKc.getClass();
                                                jSONObject.put("preview_fps", ((LinkedHashMap) map).get("preview_fps"));
                                                c1276840jKc.getClass();
                                                jSONObject.put("push_fps", ((LinkedHashMap) map).get("push_fps"));
                                                c1276840jKc.getClass();
                                                jSONObject.put("bitrate", ((LinkedHashMap) map).get("bitrate"));
                                                return jSONObject;
                                            }
                                        };
                                        if (Intrinsics.LJFF(obj, "livefps")) {
                                            CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet5 = BytestPerfCollectorManager.LIZJ;
                                            if (copyOnWriteArraySet5 != null) {
                                                copyOnWriteArraySet5.add(c1281980jSu);
                                            }
                                        } else {
                                            C1281990jSv c1281990jSv = new InterfaceC1292250jjT() { // from class: X.0jSv
                                                @Override // X.InterfaceC1292250jjT
                                                public final String name() {
                                                    return "remote_user_info";
                                                }

                                                @Override // X.InterfaceC1292250jjT
                                                public final JSONObject LIZ() throws JSONException {
                                                    JSONObject jSONObject = new JSONObject();
                                                    C1276840jKc.LIZ.getClass();
                                                    jSONObject.put("remote_user_info", ((LinkedHashMap) C1276840jKc.LJIIL).get("remote_user_info"));
                                                    return jSONObject;
                                                }
                                            };
                                            if (Intrinsics.LJFF(obj, "remote_user_info")) {
                                                CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet6 = BytestPerfCollectorManager.LIZJ;
                                                if (copyOnWriteArraySet6 != null) {
                                                    copyOnWriteArraySet6.add(c1281990jSv);
                                                }
                                            } else {
                                                C1286720jaY c1286720jaY = new InterfaceC1292250jjT() { // from class: X.0jaY
                                                    @Override // X.InterfaceC1292250jjT
                                                    public final String name() {
                                                        return "gpu";
                                                    }

                                                    @Override // X.InterfaceC1292250jjT
                                                    public final JSONObject LIZ() throws JSONException {
                                                        JSONObject jSONObject = new JSONObject();
                                                        jSONObject.put("gpu_usage_android_new", ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).Sb2());
                                                        return jSONObject;
                                                    }
                                                };
                                                if (Intrinsics.LJFF(obj, "gpu")) {
                                                    CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet7 = BytestPerfCollectorManager.LIZJ;
                                                    if (copyOnWriteArraySet7 != null) {
                                                        copyOnWriteArraySet7.add(c1286720jaY);
                                                    }
                                                } else {
                                                    C1163670gO5 c1163670gO5 = C1163670gO5.LIZ;
                                                    if (Intrinsics.LJFF(obj, "fps") && (copyOnWriteArraySet = BytestPerfCollectorManager.LIZJ) != null) {
                                                        copyOnWriteArraySet.add(c1163670gO5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    CopyOnWriteArraySet<InterfaceC1292250jjT> copyOnWriteArraySet8 = BytestPerfCollectorManager.LIZJ;
                    if (copyOnWriteArraySet8 != null && copyOnWriteArraySet8.contains(C1163670gO5.LIZ)) {
                        C1163670gO5.LIZJ = true;
                    }
                    HandlerThread handlerThread = new HandlerThread("bytest-thread");
                    handlerThread.start();
                    BytestPerfCollectorManager.TestHandler testHandler = new BytestPerfCollectorManager.TestHandler(C786410Ut5.W2(handlerThread));
                    BytestPerfCollectorManager.LJII = testHandler;
                    C786410Ut5.LJLJJI(1001, BytestPerfCollectorManager.LJ, testHandler);
                    BytestPerfCollectorManager.TestHandler testHandler2 = BytestPerfCollectorManager.LJII;
                    if (testHandler2 != null) {
                        C786410Ut5.LJLJJI(1002, BytestPerfCollectorManager.LJFF, testHandler2);
                    }
                    BytestPerfCollectorManager.LJI = handlerThread;
                    return;
                }
                BytestPerfCollectorManager.LIZIZ(false);
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context3, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        BytestPerfCollectorManager.LIZ = context;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("BYTEST_PERF_BROADCAST");
        try {
            C838410Wul.LJFF(context, BytestPerfCollectorManager.LIZIZ, intentFilter, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Vxb] */
    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C814690Vxb jk1(long j) {
        return new InterfaceC1100980eky(j) { // from class: X.0Vxb
            public final long LIZ;
            public final Set<Function1<Long, Unit>> LIZIZ = new LinkedHashSet();
            public Map<String, Long> LIZJ = new LinkedHashMap();
            public long LIZLLL;

            @Override // X.InterfaceC1101140elE
            public final synchronized void LJI() {
                if (this.LIZIZ.isEmpty()) {
                    return;
                }
                long jLIZIZ = LIZIZ();
                Iterator<Function1<Long, Unit>> it2 = this.LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(Long.valueOf(jLIZIZ));
                }
            }

            @Override // X.InterfaceC1101140elE
            public final synchronized void destroy() {
                this.LIZIZ.clear();
            }

            @Override // X.InterfaceC1101140elE
            public final void start() {
            }

            @Override // X.InterfaceC1101140elE
            public final void stop() {
            }

            @Override // X.InterfaceC1090200eTa
            public final long LIZ() {
                LJII();
                Long l = this.LIZJ.get("mem_java_total");
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            }

            @Override // X.InterfaceC1090200eTa
            public final long LIZIZ() {
                LJII();
                Long l = this.LIZJ.get("mem_java_used");
                if (l != null) {
                    return l.longValue();
                }
                return -1L;
            }

            @Override // X.InterfaceC1090200eTa
            public final float LIZJ() {
                LJII();
                Long l = this.LIZJ.get("mem_app_allocate");
                long jLongValue = l != null ? l.longValue() : -999L;
                Long l2 = this.LIZJ.get("mem_pss_total");
                long jLongValue2 = l2 != null ? l2.longValue() : -999L;
                if (jLongValue == -999 || jLongValue2 == -999) {
                    return -999.0f;
                }
                return (float) (jLongValue2 / jLongValue);
            }

            @Override // X.InterfaceC1090200eTa
            public final float LJFF() {
                LJII();
                Long l = this.LIZJ.get("mem_java_max");
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (this.LIZJ.get("mem_java_used") != null) {
                        return r0.longValue() / jLongValue;
                    }
                }
                return -1.0f;
            }

            public final void LJII() {
                if (SystemClock.elapsedRealtime() - this.LIZLLL < this.LIZ) {
                    return;
                }
                this.LIZJ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getMemory();
                this.LIZLLL = SystemClock.elapsedRealtime();
            }

            {
                this.LIZ = j;
            }

            @Override // X.InterfaceC1090200eTa
            public final void LIZLLL(C1090190eTZ c1090190eTZ) {
                this.LIZIZ.add(c1090190eTZ);
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1100750ekb ny0(String str) {
        return (C1100750ekb) ((ConcurrentHashMap) C1101060el6.LJIJJ).get(str);
    }

    @Override // com.bytedance.android.livesdk.comp.api.performance.IPerformanceService
    public final C1101500elo pI0(long j) {
        return new C1101500elo(j);
    }
}
