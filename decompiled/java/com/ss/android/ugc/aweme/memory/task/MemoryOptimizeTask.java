package com.ss.android.ugc.aweme.memory.task;

import X.C013C;
import X.C01CK;
import X.C01CV;
import X.C01CX;
import X.C08AX;
import X.C08CX;
import X.C08K8;
import X.C08Q0;
import X.C098200Yq;
import X.C09PB;
import X.C09PH;
import X.C09PI;
import X.C09PJ;
import X.C09PK;
import X.C09PL;
import X.C09PM;
import X.C09PN;
import X.C09PO;
import X.C09PP;
import X.C09PR;
import X.C09PY;
import X.C09Q0;
import X.C09Q6;
import X.C09QC;
import X.C0CCZ;
import X.C0VZ0;
import X.C13DA;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1954807lC;
import X.C1BAC;
import X.C1BWL;
import X.C2187451AjH;
import X.C2188561Al4;
import X.C2188811AlT;
import X.C2365909Ov;
import X.C2366009Ow;
import X.C2366309Oz;
import X.C2366509Pb;
import X.C2366709Pd;
import X.C2366809Pe;
import X.C2367109Ph;
import X.C2368509Pv;
import X.C276440AsU;
import X.C304720Bx0;
import X.C476250Ilz;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC2366109Ox;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC19372610qi;
import X.InterfaceC2188721AlK;
import X.InterfaceC2366409Pa;
import X.InterfaceC802370Vdj;
import Y.ARunnableS133S0100000_33;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.LruCache;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.GCOptionOpt;
import com.bytedance.common.jato.boost.MalloptOptimizer;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.memrelief.pressure.MemoryPressureWatcher;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.queuemonitor.QueueMonitorRegistry;
import com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper;
import com.bytedance.tt.reliability.queuemonitor.api.Reporter;
import com.bytedance.tt.reliability.queuemonitor.model.QueueMonitorBaseConfig;
import com.bytedance.tt.reliability.queuemonitor.model.QueueType;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.IResourceChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.experiment.NativeMemDexReclaimPara;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.ResCheckerTask;
import com.ss.android.ugc.aweme.memory.ab.MemoryManualCleanParameters;
import com.ss.android.ugc.aweme.memory.profiler.core.MemoryDumpReceiver;
import com.ss.android.ugc.aweme.memory.profiler.core.SocketBridge;
import com.ss.android.ugc.aweme.memory.profiler.strategy.BitmapRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.DetailMemoryRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.DiagnoseRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.FpsRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.GCRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.LiteMemoryRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.LynxRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.NativeAllocationRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.ObjectRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.PageDumpRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.ThreadRegistry;
import com.ss.android.ugc.aweme.memory.profiler.strategy.ToolRegistry;
import com.ss.android.ugc.aweme.memory.task.MemoryOptimizeTask;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.task.gc.GCCallbackReporterTask;
import com.ss.android.ugc.aweme.task.resaltas.ResAltasConfig;
import com.ss.android.ugc.aweme.task.resaltas.ResAltasInitTask;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryOptimizeTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MemoryOptimizeTask";
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

    public static void LIZ() {
        MemoryDumpReceiver.Companion.register(C1BWL.LIZ());
        SocketBridge socketBridge = SocketBridge.INSTANCE;
        socketBridge.registerHandler(1, ObjectRegistry.INSTANCE);
        ToolRegistry toolRegistry = ToolRegistry.INSTANCE;
        toolRegistry.attach(C1BWL.LIZ());
        socketBridge.registerHandler(2, toolRegistry);
        PageRegistry pageRegistry = PageRegistry.INSTANCE;
        pageRegistry.attach(C1BWL.LIZ());
        socketBridge.registerHandler(3, pageRegistry);
        socketBridge.registerHandler(4, LynxRegistry.INSTANCE);
        socketBridge.registerHandler(5, BitmapRegistry.INSTANCE);
        socketBridge.registerHandler(6, NativeAllocationRegistry.INSTANCE);
        FpsRegistry fpsRegistry = FpsRegistry.INSTANCE;
        fpsRegistry.attach(C1BWL.LIZ());
        socketBridge.registerHandler(7, fpsRegistry);
        LiteMemoryRegistry liteMemoryRegistry = LiteMemoryRegistry.INSTANCE;
        liteMemoryRegistry.attach(C1BWL.LIZ());
        socketBridge.registerHandler(8, liteMemoryRegistry);
        GCRegistry gCRegistry = GCRegistry.INSTANCE;
        gCRegistry.attach();
        socketBridge.registerHandler(9, gCRegistry);
        socketBridge.registerHandler(10, ThreadRegistry.INSTANCE);
        socketBridge.registerHandler(11, DiagnoseRegistry.INSTANCE);
        socketBridge.registerHandler(12, DetailMemoryRegistry.INSTANCE);
        socketBridge.registerHandler(13, PageDumpRegistry.INSTANCE);
        Application applicationLIZ = C1BWL.LIZ();
        C844470XAv.LIZ.getClass();
        socketBridge.start(applicationLIZ, null, C844470XAv.LJFF());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:13:0x0042, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x0058, B:22:0x005c, B:23:0x0063, B:25:0x0067, B:27:0x006b, B:28:0x006f, B:36:0x0086, B:38:0x008a, B:40:0x008e, B:42:0x0092, B:43:0x0096, B:44:0x00a6, B:46:0x00aa, B:48:0x00ae, B:49:0x00b2, B:51:0x00b6, B:55:0x00c1, B:57:0x00c5, B:62:0x00ce, B:63:0x00d2), top: B:112:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:13:0x0042, B:15:0x004a, B:17:0x0050, B:18:0x0054, B:20:0x0058, B:22:0x005c, B:23:0x0063, B:25:0x0067, B:27:0x006b, B:28:0x006f, B:36:0x0086, B:38:0x008a, B:40:0x008e, B:42:0x0092, B:43:0x0096, B:44:0x00a6, B:46:0x00aa, B:48:0x00ae, B:49:0x00b2, B:51:0x00b6, B:55:0x00c1, B:57:0x00c5, B:62:0x00ce, B:63:0x00d2), top: B:112:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[PHI: r13
      0x00cc: PHI (r13v3 int) = (r13v2 int), (r13v6 int) binds: [B:50:0x00b4, B:59:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ() {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.memory.task.MemoryOptimizeTask.LJ():void");
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) throws Throwable {
        int iLIZ;
        Context context2;
        ResAltasConfig resAltasConfig;
        String name;
        AttachUserData attachUserData;
        if (C08Q0.LIZIZ(context, 0, "fix_librarian_empty_apks") == 2 || ((Boolean) C276440AsU.LIZIZ.getValue()).booleanValue()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.08Cj
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MemoryOptimizeTask@4ed3.run$1");
                    try {
                        Librarian.LIZIZ();
                        System.out.println((Object) "librarian eagerInit background");
                    } finally {
                        try {
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("MemoryOptimizeTask@4ed3.run$1");
                }
            });
        }
        final MemoryManualCleanParameters memoryManualCleanParameters = (MemoryManualCleanParameters) C2367109Ph.LIZIZ.getValue();
        if (memoryManualCleanParameters.enable) {
            final long jMax = Math.max(memoryManualCleanParameters.delayStop, Mp4ScreenVideoLoadTimeout.CONTROL);
            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
            InterfaceC2188721AlK interfaceC2188721AlK = new InterfaceC2188721AlK() { // from class: X.1Al8
                @Override // X.InterfaceC2188721AlK
                public final void LIZ(C1768270w7F c1768270w7F, boolean z) {
                    EnumC21267218Ko enumC21267218Ko;
                    ScheduledExecutorService scheduledExecutorService;
                    if (z && c1768270w7F.LIZIZ == C09QO.LOW_BIZ_MANUAL && (enumC21267218Ko = c1768270w7F.LIZJ) != EnumC21267218Ko.GLOBAL && enumC21267218Ko != EnumC21267218Ko.GLOBAL_ENTER_BACKGROUND && enumC21267218Ko != EnumC21267218Ko.ANR) {
                        try {
                            GCOptionOpt gCOptionOptLIZLLL = GCOptionOpt.LIZLLL();
                            MemoryManualCleanParameters memoryManualCleanParameters2 = memoryManualCleanParameters;
                            gCOptionOptLIZLLL.LIZJ(memoryManualCleanParameters2.softRefBytes, memoryManualCleanParameters2.adjGCBytes, memoryManualCleanParameters2.softRef, memoryManualCleanParameters2.adjGC);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        synchronized (C20100213km.class) {
                            if (C20100213km.LIZJ == null) {
                                C20100213km.LIZJ = C786410Ut5.g4(1, new ThreadFactoryC20100313kn("MemRelief_Scheduled"));
                            }
                            scheduledExecutorService = C20100213km.LIZJ;
                        }
                        scheduledExecutorService.schedule(new ARunnableS133S0100000_33(memoryManualCleanParameters, 70), jMax, TimeUnit.MILLISECONDS);
                    }
                }
            };
            c2188561Al4.getClass();
            C2188561Al4.LJIIIIZZ(interfaceC2188721AlK);
        }
        try {
            if (C304720Bx0.LIZ) {
                C1BWL.LIZ().registerActivityLifecycleCallbacks(C304720Bx0.LIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C823050WQl.LJ().schedule(new Runnable() { // from class: X.08Ci
            public final void LIZ() {
                if (C08Q0.LIZIZ(context, 0, "fix_librarian_empty_apks") == 3 || ((Boolean) C276440AsU.LIZJ.getValue()).booleanValue()) {
                    C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.08Ch
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MemoryOptimizeTask@4ed3.run$4$1");
                            try {
                                Librarian.LIZIZ();
                                System.out.println((Object) "librarian eagerInit bootfinish");
                            } finally {
                                try {
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                            }
                            C1C7U.LIZIZ("MemoryOptimizeTask@4ed3.run$4$1");
                        }
                    });
                }
                try {
                    C1603760rpu.LIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    C08K0.LIZ();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                try {
                    C08B8.LIZ();
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
                try {
                    this.getClass();
                    MemoryOptimizeTask.LJ();
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                }
                try {
                    C089J.LIZ();
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                }
                try {
                    C09Q0.LIZIZ();
                } catch (Throwable th7) {
                    TryCatchGuardChecker.doCheck(th7);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MemoryOptimizeTask@4ed3.run$4");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MemoryOptimizeTask@4ed3.run$4");
            }
        }, 30000L, TimeUnit.MILLISECONDS);
        try {
            C09Q0.LIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (((Boolean) C09PB.LIZ.getValue()).booleanValue() || ((Boolean) C09PO.LIZ.getValue()).booleanValue()) {
            try {
                LIZ();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        C2366309Oz.LIZ.getClass();
        final int iIntValue = ((Number) C09PL.LIZ.getValue()).intValue();
        if (iIntValue > 0) {
            Npth.registerPreCrashCallback(new InterfaceC802370Vdj() { // from class: X.15mP
                @Override // X.InterfaceC802370Vdj
                public final void LIZ() {
                    C19EG c19eg;
                    MainActivityScope mainActivityScopeLIZJ;
                    HomeTabAbility homeTabAbilityLIZ;
                    Activity activityLIZIZ;
                    Object obj;
                    try {
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        Activity activityLIZ = null;
                        String string = (abstractC1387200mCcLJ == null || (obj = abstractC1387200mCcLJ.LIZ) == null) ? null : obj.getClass().toString();
                        if (string == null || string.length() == 0) {
                            Npth.addTag("top_page_class", "empty");
                        } else {
                            Npth.addTag("top_page_class", string);
                        }
                        if (iIntValue == 1) {
                            AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                            if (abstractC1387200mCcLJ2 != null && (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) != null) {
                                activityLIZ = C06MM.LIZ(activityLIZIZ);
                            }
                            if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            String strCt0 = homeTabAbilityLIZ.Ct0();
                            String strZj2 = homeTabAbilityLIZ.Zj2();
                            if (strCt0 != null && strCt0.length() != 0) {
                                Npth.addTag("main_top_tab_name", strCt0);
                            }
                            if (strZj2 == null || strZj2.length() == 0) {
                                return;
                            }
                            Npth.addTag("main_bottom_tab_name", strZj2);
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                }
            }, CrashType.JAVA);
        }
        if (((Boolean) C09PK.LIZ.getValue()).booleanValue()) {
            if (!((Boolean) C2368509Pv.LIZIZ.getValue()).booleanValue()) {
                C09PY c09py = new InterfaceC2366409Pa() { // from class: X.09PY
                    @Override // X.InterfaceC2366409Pa
                    public final void LIZ() {
                    }
                };
                synchronized (C2366009Ow.class) {
                    if (!C2366009Ow.LIZIZ) {
                        C2366009Ow.LIZIZ = true;
                        C2366009Ow.LIZLLL = c09py;
                        C2366009Ow.LJ = Thread.getDefaultUncaughtExceptionHandler();
                        Thread.setDefaultUncaughtExceptionHandler(C2366009Ow.LIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("init listener:");
                        sbLIZ.append(true);
                        sbLIZ.append(" previous:");
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C2366009Ow.LJ;
                        if (uncaughtExceptionHandler != null) {
                            name = uncaughtExceptionHandler.getClass().getName();
                        } else {
                            name = null;
                        }
                        sbLIZ.append(name);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                if (((Number) C09PN.LIZ.getValue()).intValue() > 0) {
                    HashMap map = new HashMap();
                    C13DA c13da = new C13DA();
                    EnumC2366109Ox enumC2366109Ox = EnumC2366109Ox.OOM_JAVA;
                    C2365909Ov c2365909Ov = C2365909Ov.LJFF;
                    C01CK c01ck = C01CK.LJFF;
                    c13da.put(enumC2366109Ox, C1697810uHb.LJIIJJI(c2365909Ov, c01ck));
                    if (Process.is64Bit()) {
                        c13da.put(EnumC2366109Ox.OOM_FRESCO, C1697810uHb.LJIIJJI(c2365909Ov, C01CV.LJFF, c01ck));
                    }
                    c13da.put(EnumC2366109Ox.OOM_OTHERS, Collections.singletonList(C01CV.LJFF));
                    for (Map.Entry entry : c13da.build().entrySet()) {
                        Object key = entry.getKey();
                        for (Object obj : (List) entry.getValue()) {
                            Object linkedHashSet = map.get(obj);
                            if (linkedHashSet == null) {
                                linkedHashSet = new LinkedHashSet();
                                map.put(obj, linkedHashSet);
                            }
                            ((Set) linkedHashSet).add(key);
                        }
                    }
                    final List<C08K8> listLIZ = C2366309Oz.LIZ();
                    for (final C08K8 c08k8 : listLIZ) {
                        Set<? extends EnumC2366109Ox> set = (Set) map.get(c08k8);
                        if (set == null) {
                            set = C08CX.INSTANCE;
                        }
                        if (c08k8.LIZJ.compareAndSet(false, true)) {
                            c08k8.LJ = set;
                            c08k8.LJ();
                            int i = C01CX.LIZ[c08k8.LIZLLL().ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    attachUserData = new AttachUserData() { // from class: X.08K9
                                        @Override // com.bytedance.crash.AttachUserData
                                        public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                            Object c098200Yq;
                                            if (c08k8.LJ.contains(C2366009Ow.LIZJ)) {
                                                try {
                                                    c098200Yq = c08k8.LIZ();
                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                } catch (Throwable th4) {
                                                    TryCatchGuardChecker.doCheck(th4);
                                                    c098200Yq = new C098200Yq(th4);
                                                    C189200o6.m2constructorimpl(c098200Yq);
                                                }
                                                Map mapLJ = C2097608Jq.LJ();
                                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                                    c098200Yq = mapLJ;
                                                }
                                                return (Map) c098200Yq;
                                            }
                                            return C2097608Jq.LJ();
                                        }
                                    };
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                attachUserData = new AttachUserData() { // from class: X.08K7
                                    @Override // com.bytedance.crash.AttachUserData
                                    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        return c08k8.LIZ;
                                    }
                                };
                            }
                            Npth.addAttachUserData(attachUserData, CrashType.JAVA);
                        }
                    }
                    Npth.registerPreCrashCallback(new InterfaceC802370Vdj() { // from class: X.07PF
                        @Override // X.InterfaceC802370Vdj
                        public final void LIZ() {
                            Iterator<C08K8> it2 = listLIZ.iterator();
                            while (it2.hasNext()) {
                                try {
                                    it2.next().LJFF();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                                }
                            }
                        }
                    }, CrashType.JAVA);
                }
            }
        } else if (((Boolean) C09PM.LIZ.getValue()).booleanValue() && ((Number) C09PN.LIZ.getValue()).intValue() > 0) {
            final List<C08K8> listLIZ2 = C2366309Oz.LIZ();
            if (!listLIZ2.isEmpty()) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ2, 10));
                Iterator it2 = listLIZ2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C08K8) it2.next()).LIZIZ());
                }
                for (final C08K8 c08k82 : listLIZ2) {
                    try {
                        if (c08k82.LIZLLL.compareAndSet(false, true)) {
                            c08k82.LJ();
                            Npth.addAttachUserData(new AttachUserData() { // from class: X.08KA
                                @Override // com.bytedance.crash.AttachUserData
                                public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    return c08k82.LIZIZ;
                                }
                            }, CrashType.ALL);
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        C189200o6.m2constructorimpl(new C098200Yq(th4));
                    }
                }
                Npth.registerPreCrashCallback(new InterfaceC802370Vdj() { // from class: X.08K6
                    @Override // X.InterfaceC802370Vdj
                    public final void LIZ() {
                        Object c098200Yq;
                        Object c098200Yq2;
                        C2366309Oz.LIZ.getClass();
                        try {
                            c098200Yq = MemoryPressureWatcher.getInstance().getJavaMemoryLevel();
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th5) {
                            TryCatchGuardChecker.doCheck(th5);
                            c098200Yq = new C098200Yq(th5);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        C09Q3 c09q3 = (C09Q3) c098200Yq;
                        try {
                            c098200Yq2 = MemoryPressureWatcher.getInstance().getNativeMemoryLevel();
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th6) {
                            TryCatchGuardChecker.doCheck(th6);
                            c098200Yq2 = new C098200Yq(th6);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        C09Q3 c09q32 = (C09Q3) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
                        int iOrdinal = C09Q3.HIGH.ordinal();
                        if ((c09q3 != null ? c09q3.ordinal() : -1) < iOrdinal) {
                            if ((c09q32 != null ? c09q32.ordinal() : -1) < iOrdinal) {
                                return;
                            }
                        }
                        Iterator<C08K8> it3 = listLIZ2.iterator();
                        while (it3.hasNext()) {
                            try {
                                it3.next().LJI();
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th7) {
                                TryCatchGuardChecker.doCheck(th7);
                                C189200o6.m2constructorimpl(new C098200Yq(th7));
                            }
                        }
                    }
                }, CrashType.ALL);
            }
        }
        if (C2366809Pe.LIZ() == 1) {
            C2187451AjH.LJIL();
        }
        final int iIntValue2 = ((Number) C09PP.LIZ.getValue()).intValue();
        if (iIntValue2 > 0) {
            Npth.registerPreCrashCallback(new InterfaceC802370Vdj() { // from class: X.15mQ
                @Override // X.InterfaceC802370Vdj
                public final void LIZ() {
                    C19EG c19eg;
                    MainActivityScope mainActivityScopeLIZJ;
                    HomeTabAbility homeTabAbilityLIZ;
                    Activity activityLIZIZ;
                    Object obj2;
                    try {
                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                        Activity activityLIZ = null;
                        String string = (abstractC1387200mCcLJ == null || (obj2 = abstractC1387200mCcLJ.LIZ) == null) ? null : obj2.getClass().toString();
                        if (string == null || string.length() == 0) {
                            Npth.addTag("top_page_class", "empty");
                        } else {
                            Npth.addTag("top_page_class", string);
                        }
                        if (iIntValue2 == 1) {
                            AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                            if (abstractC1387200mCcLJ2 != null && (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) != null) {
                                activityLIZ = C06MM.LIZ(activityLIZIZ);
                            }
                            if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
                                return;
                            }
                            String strCt0 = homeTabAbilityLIZ.Ct0();
                            String strZj2 = homeTabAbilityLIZ.Zj2();
                            if (strCt0 != null && strCt0.length() != 0) {
                                Npth.addTag("main_top_tab_name", strCt0);
                            }
                            if (strZj2 == null || strZj2.length() == 0) {
                                return;
                            }
                            Npth.addTag("main_bottom_tab_name", strZj2);
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                }
            }, CrashType.ANR);
        }
        if (C09PR.LIZ == 0) {
            new GCCallbackReporterTask().run(context);
        }
        new ResAltasInitTask().run(context);
        InterfaceC19372610qi interfaceC19372610qi = new InterfaceC19372610qi() { // from class: X.1BDv
            @Override // X.InterfaceC19372610qi
            public final String LIZJ() {
                if (!ResCheckerTask.LLILLL) {
                    return null;
                }
                try {
                    return ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LIZJ();
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    return null;
                }
            }

            @Override // X.InterfaceC19372610qi
            public final boolean LIZLLL() {
                synchronized (ResCheckerTask.class) {
                    boolean zLJIIIIZZ = false;
                    if (!ResCheckerTask.LLILLL) {
                        return false;
                    }
                    try {
                        zLJIIIIZZ = ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJIIIIZZ();
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                    ResCheckerTask.LLILZ = true;
                    return zLJIIIIZZ;
                }
            }

            @Override // X.InterfaceC19372610qi
            public final boolean LIZ(boolean z) {
                synchronized (ResCheckerTask.class) {
                    if (!ResCheckerTask.LLILZ && !ResCheckerTask.LL) {
                        if (ResCheckerTask.LLILLL) {
                            try {
                                return ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LIZ(z);
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                                return false;
                            }
                        }
                        return false;
                    }
                    return false;
                }
            }

            @Override // X.InterfaceC19372610qi
            public final boolean LIZIZ(Context context3, boolean z) {
                synchronized (ResCheckerTask.class) {
                    if (ResCheckerTask.LLILZ || ResCheckerTask.LL) {
                        return false;
                    }
                    if (ResCheckerTask.LLILLJJLI) {
                        if (!ResCheckerTask.LLILLL) {
                            return false;
                        }
                        return ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LIZ(z);
                    }
                    ResCheckerTask.LLILLJJLI = true;
                    if (C08Q0.LIZIZ(context3, 0, "coldboot_nativelib_report_port") != 0) {
                        return false;
                    }
                    ResCheckerTask.LLILLL = ResCheckerTask.LJ(context3);
                    if (!ResCheckerTask.LLILLL) {
                        return false;
                    }
                    try {
                        return ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LIZ(z);
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        return false;
                    }
                }
            }
        };
        if (C1BAC.LJIJJ && (context2 = C1BAC.LJIIZILJ) != null && (resAltasConfig = C1BAC.LJIILLIIL) != null && C1BAC.LJII == null) {
            C1BAC.LJ(context2, resAltasConfig, interfaceC19372610qi);
        }
        C1BAC.LJIL = new C08AX() { // from class: X.09Pu
            @Override // X.C08AX
            public final List<String> LIZ() {
                try {
                    LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
                    String strLJIJJ = C1478160oZK.LIZ().LJIJJ();
                    return strLJIJJ == null || strLJIJJ.length() == 0 ? C13BV.INSTANCE : Collections.singletonList(strLJIJJ);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    return C13BV.INSTANCE;
                }
            }
        };
        if (((Number) C2366509Pb.LIZ.getValue()).longValue() > 0) {
            final NativeMemDexReclaimPara nativeMemDexReclaimPara = (NativeMemDexReclaimPara) C09PJ.LIZ.getValue();
            final C013C c013c = new C013C();
            if (nativeMemDexReclaimPara != null && nativeMemDexReclaimPara.getEnableWhen() == 1) {
                c013c.element = true;
            }
            if (c013c.element && nativeMemDexReclaimPara != null && nativeMemDexReclaimPara.getMUnlockInBg()) {
                C2187451AjH.LJIJI();
            }
            final NativeMemDexReclaimPara nativeMemDexReclaimPara2 = (NativeMemDexReclaimPara) C09PI.LIZ.getValue();
            final C013C c013c2 = new C013C();
            if (nativeMemDexReclaimPara2 != null && nativeMemDexReclaimPara2.getEnableWhen() == 1) {
                c013c2.element = true;
            }
            if (c013c2.element && C2366709Pd.LIZ() > 0 && ((iLIZ = DeviceInfoUtils.LIZ()) < 24 || iLIZ > C2366709Pd.LIZ())) {
                c013c2.element = false;
            }
            if (c013c.element) {
                c013c2.element = false;
            }
            if (c013c2.element && nativeMemDexReclaimPara2 != null && nativeMemDexReclaimPara2.getMUnlockInBg()) {
                C2187451AjH.LJIJ();
            }
            LinkedList<Double> linkedList = C09Q6.LIZ;
            C09Q6.LIZLLL = new C09QC() { // from class: X.1Ajd
                @Override // X.C09QC
                public final void LIZ(double d) {
                    if (((Number) C0AGW.LIZ.getValue()).intValue() > 0 && d >= ((Number) r1.getValue()).intValue()) {
                        MalloptOptimizer.LIZ();
                    }
                    NativeMemDexReclaimPara nativeMemDexReclaimPara3 = nativeMemDexReclaimPara2;
                    if (nativeMemDexReclaimPara3 != null && nativeMemDexReclaimPara3.getEnableWhen() > 0 && c013c2.element && (((Number) C0ADX.LIZ.getValue()).intValue() <= 0 || C0CN5.LJII())) {
                        if (nativeMemDexReclaimPara2.getMlockMemoryLevel() > 0 && nativeMemDexReclaimPara2.getMlockMemoryLevel() >= d && d > 0.0d) {
                            C2187451AjH.LJIIL(nativeMemDexReclaimPara2.getMlockPercent());
                        }
                        if (nativeMemDexReclaimPara2.getMUnlockMemoryLevel() > 0 && nativeMemDexReclaimPara2.getMUnlockMemoryLevel() <= d) {
                            C2187451AjH.LJIILJJIL(false);
                        }
                        if (nativeMemDexReclaimPara2.getReclaimLevel() > 0 && nativeMemDexReclaimPara2.getReclaimLevel() <= d && nativeMemDexReclaimPara2.getReclaimPercent() > 0) {
                            JatoXL.reclaimCodeItemV3(nativeMemDexReclaimPara2.getReclaimPercent());
                        }
                    }
                    NativeMemDexReclaimPara nativeMemDexReclaimPara4 = nativeMemDexReclaimPara;
                    if (nativeMemDexReclaimPara4 != null && nativeMemDexReclaimPara4.getEnableWhen() > 0 && c013c.element) {
                        if (((Number) C0ADX.LIZ.getValue()).intValue() <= 0 || C0CN5.LJII()) {
                            if (nativeMemDexReclaimPara.getMlockMemoryLevel() > 0 && nativeMemDexReclaimPara.getMlockMemoryLevel() >= d && d > 0.0d) {
                                C2187451AjH.LJIILIIL(nativeMemDexReclaimPara.getMlockPercent(), nativeMemDexReclaimPara.getMlockMaxKb());
                            }
                            if (nativeMemDexReclaimPara.getMUnlockMemoryLevel() > 0 && nativeMemDexReclaimPara.getMUnlockMemoryLevel() <= d) {
                                C2187451AjH.LJIILL(false);
                            }
                            if (nativeMemDexReclaimPara.getReclaimLevel() > 0 && nativeMemDexReclaimPara.getReclaimLevel() <= d && nativeMemDexReclaimPara.getReclaimPercent() > 0) {
                                JatoXL.reclaimCodeOdexV4(nativeMemDexReclaimPara.getReclaimPercent());
                            }
                        }
                    }
                }
            };
        }
        if (((Number) C09PH.LIZ.getValue()).intValue() > 0) {
            QueueMonitorBaseConfig queueMonitorBaseConfig = (QueueMonitorBaseConfig) SettingsManager.LIZLLL().LJIIIIZZ("queue_monitor_config", QueueMonitorBaseConfig.class, null);
            if (queueMonitorBaseConfig == null) {
                queueMonitorBaseConfig = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MemoryOptimizeTask.initQueueMonitorIfNeeded, config: ");
            sbLIZ2.append(queueMonitorBaseConfig);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("QueueMonitor", C2188811AlT.LIZIZ(sbLIZ2));
            if (queueMonitorBaseConfig != null && queueMonitorBaseConfig.monitorConfig.id.length() > 0) {
                QueueMonitorRegistry.INSTANCE.init(true, queueMonitorBaseConfig, new Reporter() { // from class: X.08Kh
                    @Override // com.bytedance.tt.reliability.queuemonitor.api.Reporter
                    public final void reportEvent(String str, JSONObject jSONObject) {
                        C20684815ws.LJIJ(str, jSONObject);
                        C793770VBv.LJII(str, null, jSONObject, null);
                    }
                }, new MonitorHelper() { // from class: X.08Kd
                    @Override // com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper
                    public final Map<String, Object> appendCommonParams(Handler handler) {
                        return C2097608Jq.LJ();
                    }

                    @Override // com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper
                    public final String buildGroupTag(Handler handler) {
                        String str;
                        if (Intrinsics.LJFF(handler.getLooper().getThread(), Looper.getMainLooper().getThread())) {
                            str = "ui_thread_handler";
                        } else {
                            str = "bg_thread_handler";
                        }
                        String name2 = handler.getLooper().getThread().getName();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str);
                        sbLIZ3.append('_');
                        sbLIZ3.append(name2);
                        return C2188811AlT.LIZIZ(sbLIZ3);
                    }

                    @Override // com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper
                    public final Map<String, Object> appendCommonParams(ThreadPoolExecutor threadPoolExecutor) {
                        return C2097608Jq.LJ();
                    }

                    @Override // com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper
                    public final String buildGroupTag(ThreadPoolExecutor threadPoolExecutor) {
                        String str;
                        String string;
                        C0WQX c0wqx;
                        if (C823050WQl.LJII(threadPoolExecutor)) {
                            str = "common_thread_pool";
                        } else {
                            str = "business_thread_pool";
                        }
                        if (!(threadPoolExecutor instanceof C0WPM) || (c0wqx = ((C0WPM) threadPoolExecutor).LL) == null || (string = c0wqx.toString()) == null) {
                            string = "unkonwn_type";
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(string);
                        sbLIZ3.append('_');
                        sbLIZ3.append(str);
                        return C2188811AlT.LIZIZ(sbLIZ3);
                    }

                    @Override // com.bytedance.tt.reliability.queuemonitor.api.MonitorHelper
                    public final boolean filterCallerKeyPoint(QueueType queueType, StackTraceElement stackTraceElement) {
                        if (queueType == QueueType.MESSAGE_QUEUE) {
                            if (!a0.LJJIIZI(stackTraceElement.getClassName(), "MessageQueueHook", false) && !a0.LJJIIZI(stackTraceElement.getMethodName(), "MessageQueueHook", false)) {
                                return false;
                            }
                            return true;
                        }
                        if (queueType != QueueType.THREAD_POOL) {
                            return false;
                        }
                        return a0.LJJIIZI(stackTraceElement.getClassName(), "com.ss.android.ugc.bytex.pthread", false);
                    }
                });
            }
        }
    }
}
