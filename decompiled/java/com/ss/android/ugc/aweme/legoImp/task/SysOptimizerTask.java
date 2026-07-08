package com.ss.android.ugc.aweme.legoImp.task;

import X.C013C;
import X.C08RN;
import X.C09CT;
import X.C09JN;
import X.C0A1D;
import X.C0AM0;
import X.C0AM3;
import X.C0AM5;
import X.C0AM9;
import X.C0AMB;
import X.C0AMD;
import X.C0BSS;
import X.C0C64;
import X.C0CCZ;
import X.C0S78;
import X.C0VE5;
import X.C0VSJ;
import X.C0VU1;
import X.C0VY4;
import X.C0VYL;
import X.C0VZ0;
import X.C1150504el;
import X.C118300cf;
import X.C1519880pec;
import X.C1550190qRV;
import X.C1550200qRW;
import X.C1702420uP2;
import X.C1768700w7w;
import X.C1906580ziK;
import X.C1BWL;
import X.C1E21;
import X.C20684815ws;
import X.C2162308dZ;
import X.C2187451AjH;
import X.C2188421Akq;
import X.C2188441Aks;
import X.C2188451Akt;
import X.C2188461Aku;
import X.C2188561Al4;
import X.C2188671AlF;
import X.C2188811AlT;
import X.C2250201D5m;
import X.C2344009Gk;
import X.C2366709Pd;
import X.C2367709Pn;
import X.C238400w2;
import X.C2514009tC;
import X.C259800zU;
import X.C260110AHh;
import X.C291880BcI;
import X.C476250Ilz;
import X.C736480Suk;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C799570VYd;
import X.C799890VZj;
import X.C799900VZk;
import X.C801800Vco;
import X.C804080VgU;
import X.C804090VgV;
import X.C804120VgY;
import X.EnumC2188591Al7;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2188721AlK;
import X.InterfaceC2188831AlV;
import X.InterfaceC799590VYf;
import Y.AObjectS379S0100000_3;
import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.alignpage.AlignPageOpt;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.memrelief.gc.WeakRefMonitor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.ACodecGetPortFormatOptimizer;
import com.bytedance.sysoptimizer.Codec2ClientFix;
import com.bytedance.sysoptimizer.DetachCurrentThreadOpt;
import com.bytedance.sysoptimizer.EglCreateSurfaceFixer;
import com.bytedance.sysoptimizer.FindCatchBlockOpt;
import com.bytedance.sysoptimizer.GraphicsEnvOpt;
import com.bytedance.sysoptimizer.HeapGCOptimizer;
import com.bytedance.sysoptimizer.JemallocAllocatorOptimizer;
import com.bytedance.sysoptimizer.JemallocSettingResult;
import com.bytedance.sysoptimizer.JitDebugInfoOptimizer;
import com.bytedance.sysoptimizer.MaliMemOptimizer;
import com.bytedance.sysoptimizer.NativeAllocatorOptimizer;
import com.bytedance.sysoptimizer.ONativeCryptoCRLOptimizer;
import com.bytedance.sysoptimizer.PLogStack;
import com.bytedance.sysoptimizer.StackLeakChecker;
import com.bytedance.sysoptimizer.StackLeakItem;
import com.bytedance.sysoptimizer.SuspendAllOpt;
import com.bytedance.sysoptimizer.SuspendByPeerOpt;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.sysoptimizer.VMDebugDumpHprofOptimizer;
import com.bytedance.sysoptimizer.VivoPerfFrameInfoManagerImplOptimizer;
import com.bytedance.sysoptimizer.allocatorx.JemallocExtend;
import com.bytedance.sysoptimizer.anr.AnrListener;
import com.bytedance.sysoptimizer.anr.AnrManager;
import com.bytedance.sysoptimizer.anr.AnrMonitor;
import com.bytedance.sysoptimizer.anr.GetHeldByThreadOpt;
import com.bytedance.sysoptimizer.fd.ExpandFd;
import com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector;
import com.bytedance.sysoptimizer.perflock.PerfLockBooster;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.anrmonitor.GwpasanAction;
import com.ss.android.ugc.aweme.experiment.RegionSpaceShrinkParams;
import com.ss.android.ugc.aweme.experiment.WhenAnrDexReclaimPara;
import com.ss.android.ugc.aweme.experiment.anr.FrameworkPerfLockParams;
import com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.memory.MemReliefParameters;
import com.ss.android.ugc.aweme.memory.MemoryOptWhenAnrABParameters;
import im3.c;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class SysOptimizerTask implements C0CCZ, InterfaceC799590VYf {
    public Boolean LL;

    public static class ArtOatFileDumpParam {

        @C09CT("disable_oatfile_dump")
        public boolean disable_oatfile_dump = true;
    }

    public static class ArtOptimizerParam {

        @C09CT("optimize_sub_proc")
        public boolean optimize_sub_proc;

        @C09CT("optimizer_enable")
        public boolean optimizer_enable;
    }

    public static class JemallocExtendParams {

        @C09CT("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @C09CT("enable")
        public boolean enable;

        @C09CT("main_thread_extend")
        public boolean mainThreadExtend;

        @C09CT("render_thread_extend")
        public boolean renderThreadExtend;
    }

    public static class JemallocExtendParamsAutoFinal {

        @C09CT("arena_num")
        public int arenaNum = -1;

        @C09CT("decay_time")
        public int decayTime = -1;

        @C09CT("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @C09CT("enable")
        public boolean enable;
    }

    public static class JemallocExtendParamsEx {

        @C09CT("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @C09CT("enable")
        public boolean enable;

        @C09CT("max_thread_nums")
        public int maxThreadNums;
    }

    public static class JemallocExtendParamsSpecific {

        @C09CT("do_when_boot_finish")
        public boolean doWhenBootFinish;

        @C09CT("enable")
        public boolean enable;

        @C09CT("lib_name")
        public String libName;

        @C09CT("max_thread_nums")
        public int maxThreadNums;
    }

    public static class JemallocOptimizerParams {

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_purge")
        public boolean enable_purge;

        @C09CT("optimize_option")
        public int optimize_option = -1;
    }

    public static class MtkPvrOptimizerParam {

        @C09CT("always_catch_sigsegv")
        public boolean always_catch_sigsegv;

        @C09CT("enable_optimizer")
        public boolean enable_optimizer;

        @C09CT("target_devices")
        public String[] target_devices;
    }

    public static class RuntimeHeapExpansionParameters {

        @C09CT("expand_value_mb")
        public int expandBy;

        @C09CT("enable")
        public boolean isEnabled;

        @C09CT("do_remap")
        public boolean remap;

        @C09CT("run_before_boot_finished")
        public boolean runBeforeBootFinished;
    }

    public static class StackLeakCheckerParams {

        @C09CT("auto_fix_allowlist")
        public String auto_fix_list;

        @C09CT("enable_checker")
        public boolean enable_checker;

        @C09CT("report_threshold")
        public int report_threshold = 100;

        @C09CT("check_interval_mins")
        public int check_interval_mins = 100;
    }

    public static class VMShrinkerParam {

        @C09CT("shrink_enable")
        public boolean shrink_enable;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SysOptimizerTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    /* JADX INFO: loaded from: classes5.dex */
    public static class ExpandFdPara {

        @C09CT("enable")
        public boolean enable;

        @C09CT("expand_fd_set_target_list")
        public String expand_fd_set_target_list;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExpandFdPara{enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", expand_fd_set_target_list=");
            sbLIZ.append(this.expand_fd_set_target_list);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class JavaExtinguisherParam {

        @C09CT("enable")
        public boolean enable;

        @C09CT("mode")
        public int mode = -1;

        @C09CT("procNames")
        public List<String> procNames = new ArrayList();

        @C09CT("delayMillis")
        public long delayMillis = 3000;

        @C09CT("enableTest")
        public boolean enableTest = false;

        @C09CT("enableReport")
        public boolean enableReport = false;

        @C09CT("enableLogVerbosity")
        public boolean enableLogVerbosity = false;

        @C09CT("enableHiddenApi")
        public boolean enableHiddenApi = false;

        @C09CT("dumpArtMethodFindCatchBlockSuccess")
        public boolean dumpArtMethodFindCatchBlockSuccess = false;

        @C09CT("exceptions")
        public FindCatchBlockOpt.CatchException[] exceptions = new FindCatchBlockOpt.CatchException[0];

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JavaExtinguisherParam{enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", mode=");
            sbLIZ.append(this.mode);
            sbLIZ.append(", procNames=");
            sbLIZ.append(this.procNames);
            sbLIZ.append(", delayMillis=");
            sbLIZ.append(this.delayMillis);
            sbLIZ.append(", enableTest=");
            sbLIZ.append(this.enableTest);
            sbLIZ.append(", enableLogVerbosity=");
            sbLIZ.append(this.enableLogVerbosity);
            sbLIZ.append(", enableHiddenApi=");
            sbLIZ.append(this.enableHiddenApi);
            sbLIZ.append(", dumpArtMethodFindCatchBlockSuccess=");
            sbLIZ.append(this.dumpArtMethodFindCatchBlockSuccess);
            sbLIZ.append(", exceptions=");
            sbLIZ.append(Arrays.toString(this.exceptions));
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class LogStackPara {

        @C09CT("enable")
        public boolean enable;

        @C09CT("prio")
        public int prio = -1;

        @C09CT("tag")
        public String tag = "";

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LogStackPara{enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append("prio=");
            sbLIZ.append(this.prio);
            sbLIZ.append(",tag=");
            sbLIZ.append(this.tag);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public LogStackPara(SysOptimizerTask sysOptimizerTask) {
        }
    }

    public static class PageSizeMonitorPara16kb {

        @C09CT("addlog")
        public boolean addlog;

        @C09CT("crash")
        public boolean crash;

        @C09CT("enable")
        public boolean enable;

        @C09CT("exception")
        public boolean exception;

        @C09CT("fix")
        public boolean fix;

        @C09CT("is_16kb_report")
        public boolean is_16kb_report;

        @C09CT("is_only_16kb_check")
        public boolean is_only_16kb_check;

        @C09CT("test_mode")
        public int test_mode;

        @C09CT("upgrade")
        public boolean upgrade;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PageSizeMonitorPara16kb{enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(",is_16kb_report=");
            sbLIZ.append(this.is_16kb_report);
            sbLIZ.append(", upgrade=");
            sbLIZ.append(this.upgrade);
            sbLIZ.append(", is_only_16kb_check=");
            sbLIZ.append(this.is_only_16kb_check);
            sbLIZ.append(", addlog=");
            sbLIZ.append(this.addlog);
            sbLIZ.append(", crash=");
            sbLIZ.append(this.crash);
            sbLIZ.append(", exception=");
            sbLIZ.append(this.exception);
            sbLIZ.append(", fix=");
            sbLIZ.append(this.fix);
            sbLIZ.append(", test_mode=");
            sbLIZ.append(this.test_mode);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static class SysOptRuntimeHeapExpansionTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "SysOptimizerTask$SysOptRuntimeHeapExpansionTask";
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
            RuntimeHeapExpansionParameters runtimeHeapExpansionParameters = (RuntimeHeapExpansionParameters) C0C64.LJIILLIIL().LJJII(RuntimeHeapExpansionParameters.class, null, "tiktok_runtime_heap_expansion", true);
            if (runtimeHeapExpansionParameters == null) {
                runtimeHeapExpansionParameters = new RuntimeHeapExpansionParameters();
            }
            return runtimeHeapExpansionParameters.runBeforeBootFinished ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            int iLIZ = DeviceInfoUtils.LIZ();
            if (iLIZ >= 26 && iLIZ < 33 && Process.is64Bit()) {
                RuntimeHeapExpansionParameters runtimeHeapExpansionParameters = (RuntimeHeapExpansionParameters) C0C64.LJIILLIIL().LJJII(RuntimeHeapExpansionParameters.class, null, "tiktok_runtime_heap_expansion", true);
                if (runtimeHeapExpansionParameters == null) {
                    runtimeHeapExpansionParameters = new RuntimeHeapExpansionParameters();
                }
                if (runtimeHeapExpansionParameters.isEnabled) {
                    HeapGCOptimizer.heapExpand(context, runtimeHeapExpansionParameters.expandBy, runtimeHeapExpansionParameters.remap);
                }
            }
        }
    }

    public static void LJIIL() {
        int iIntValue = ((Number) C260110AHh.LIZ.getValue()).intValue();
        int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 100, 2, "launch_period_gc_block_priority", true);
        if (iIntValue == 0 || iLJIIZILJ < -20 || iLJIIZILJ > 20) {
            return;
        }
        JatoXL.setGCThreadPriorityWhenBlockGC(iIntValue, iLJIIZILJ);
    }

    public static void LJIIZILJ() {
        if (C2514009tC.LIZ) {
            try {
                Reflect reflectOn = Reflect.on("com.mediatek.view.ViewDebugManager");
                reflectOn.set("sInstance", reflectOn.create().get());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIJ() {
        if (C0BSS.LIZ) {
            try {
                Reflect.on("com.android.internal.policy.DecorView").set("sHasRelativeVolumeFeature", Boolean.FALSE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIJJLI() {
        int iLIZ;
        WhenAnrDexReclaimPara whenAnrDexReclaimPara = (WhenAnrDexReclaimPara) C2188451Akt.LIZ.getValue();
        if (whenAnrDexReclaimPara == null || !whenAnrDexReclaimPara.getEnable()) {
            return;
        }
        if (C2366709Pd.LIZ() <= 0 || ((iLIZ = DeviceInfoUtils.LIZ()) >= 24 && iLIZ <= C2366709Pd.LIZ())) {
            final int anrLevel = whenAnrDexReclaimPara.getAnrLevel();
            final int mULockAnrLevel = whenAnrDexReclaimPara.getMULockAnrLevel();
            final int reclaimPercent = whenAnrDexReclaimPara.getReclaimPercent();
            final int mLockPercent = whenAnrDexReclaimPara.getMLockPercent();
            if (whenAnrDexReclaimPara.getMUnlockInBg()) {
                C2187451AjH.LJIJ();
            }
            AnrManager.getInstance().registerListener(new AnrListener() { // from class: X.1Aje
                public boolean LIZ;

                @Override // com.bytedance.sysoptimizer.anr.AnrListener
                public final void onAnrChange(boolean z, int i) {
                    if (z) {
                        if (i >= anrLevel) {
                            int i2 = reclaimPercent;
                            if (i2 > 0) {
                                JatoXL.reclaimCodeItemV3(i2);
                            }
                            int i3 = mLockPercent;
                            if (i3 > 0) {
                                C2187451AjH.LJIIL(i3);
                                this.LIZ = true;
                                return;
                            }
                            return;
                        }
                        int i4 = mULockAnrLevel;
                        if (i >= i4 || i4 <= 0 || !this.LIZ) {
                            return;
                        }
                        C2187451AjH.LJIILJJIL(true);
                        this.LIZ = false;
                        return;
                    }
                    if (!this.LIZ || mULockAnrLevel < 0) {
                        return;
                    }
                    C2187451AjH.LJIILJJIL(true);
                    this.LIZ = false;
                }
            });
        }
    }

    public static void LJIL() {
        final WhenAnrDexReclaimPara whenAnrDexReclaimPara = (WhenAnrDexReclaimPara) C2188441Aks.LIZ.getValue();
        if (whenAnrDexReclaimPara == null || !whenAnrDexReclaimPara.getEnable()) {
            return;
        }
        final int anrLevel = whenAnrDexReclaimPara.getAnrLevel();
        final int mULockAnrLevel = whenAnrDexReclaimPara.getMULockAnrLevel();
        final int reclaimPercent = whenAnrDexReclaimPara.getReclaimPercent();
        final int mLockPercent = whenAnrDexReclaimPara.getMLockPercent();
        if (whenAnrDexReclaimPara.getMUnlockInBg()) {
            C2187451AjH.LJIJI();
        }
        AnrManager.getInstance().registerListener(new AnrListener() { // from class: X.1Ajf
            public boolean LIZ;

            @Override // com.bytedance.sysoptimizer.anr.AnrListener
            public final void onAnrChange(boolean z, int i) {
                if (z) {
                    if (i >= anrLevel) {
                        int i2 = reclaimPercent;
                        if (i2 > 0) {
                            JatoXL.reclaimCodeOdexV4(i2);
                        }
                        int i3 = mLockPercent;
                        if (i3 > 0) {
                            C2187451AjH.LJIILIIL(i3, whenAnrDexReclaimPara.getMlockMaxKb());
                            this.LIZ = true;
                            return;
                        }
                        return;
                    }
                    int i4 = mULockAnrLevel;
                    if (i >= i4 || i4 <= 0 || !this.LIZ) {
                        return;
                    }
                    C2187451AjH.LJIILL(true);
                    this.LIZ = false;
                    return;
                }
                if (!this.LIZ || mULockAnrLevel < 0) {
                    return;
                }
                C2187451AjH.LJIILL(true);
                this.LIZ = false;
            }
        });
    }

    public static void LJJIFFI() {
        if (((Boolean) C2188671AlF.LIZJ.getValue()).booleanValue()) {
            AnrManager.getInstance().registerListener(new AnrListener() { // from class: X.1Al6
                @Override // com.bytedance.sysoptimizer.anr.AnrListener
                public final void onAnrChange(boolean z, int i) {
                    int iLIZ;
                    C2188741AlM c2188741AlM;
                    C1768270w7F c1768270w7F = C2188631AlB.LIZ;
                    if (((Boolean) C2188671AlF.LIZLLL.getValue()).booleanValue()) {
                        C2188741AlM c2188741AlM2 = new C2188741AlM();
                        c2188741AlM2.LIZ = System.currentTimeMillis();
                        c2188741AlM2.LIZIZ = C2367709Pn.LJFF()[1];
                        long jLIZ = C1937207iM.LIZ("art.gc.blocking-gc-time", null);
                        c2188741AlM2.LIZJ = jLIZ;
                        if (z && (c2188741AlM = C2188631AlB.LIZIZ) != null) {
                            long j = (c2188741AlM2.LIZ - c2188741AlM.LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                            if (j > 1) {
                                MemoryOptWhenAnrABParameters memoryOptWhenAnrABParameters = C2188631AlB.LIZJ;
                                int i2 = memoryOptWhenAnrABParameters.majorFault;
                                if (i2 > 0) {
                                    long j2 = c2188741AlM2.LIZIZ;
                                    if (j2 > 0) {
                                        long j3 = c2188741AlM.LIZIZ;
                                        if (j3 > 0 && (j2 - j3) / j >= i2) {
                                            C476250Ilz.LIZ.LJ(C2188631AlB.LIZ);
                                            C2188631AlB.LIZIZ = c2188741AlM2;
                                            return;
                                        }
                                    }
                                }
                                int i3 = memoryOptWhenAnrABParameters.blockGcTime;
                                if (i3 > 0 && jLIZ > 0) {
                                    long j4 = c2188741AlM.LIZJ;
                                    if (j4 > 0 && (jLIZ - j4) / j >= i3) {
                                        C476250Ilz.LIZ.LJ(C2188631AlB.LIZ);
                                        C2188631AlB.LIZIZ = c2188741AlM2;
                                        return;
                                    }
                                }
                            }
                        }
                        C2188631AlB.LIZIZ = c2188741AlM2;
                    }
                    if (!z) {
                        return;
                    }
                    MemoryOptWhenAnrABParameters memoryOptWhenAnrABParameters2 = C2188631AlB.LIZJ;
                    if (memoryOptWhenAnrABParameters2.javaHeapRate > 0.0d) {
                        double dLIZJ = C2367709Pn.LIZJ();
                        if (dLIZJ > 0.0d && dLIZJ >= memoryOptWhenAnrABParameters2.javaHeapRate) {
                            C476250Ilz.LIZ.LJ(C2188631AlB.LIZ);
                            return;
                        }
                    }
                    if (memoryOptWhenAnrABParameters2.totalPss > 0 && (iLIZ = C08M9.LIZ(Debug.getPss(), false)) > 0 && iLIZ >= memoryOptWhenAnrABParameters2.totalPss) {
                        C476250Ilz.LIZ.LJ(C2188631AlB.LIZ);
                        return;
                    }
                    if (memoryOptWhenAnrABParameters2.availMem <= 0) {
                        return;
                    }
                    C844470XAv.LIZ.getClass();
                    int iLIZ2 = C08M9.LIZ(C2188571Al5.LIZ(C844470XAv.LIZ()), true);
                    if (iLIZ2 <= 0 || iLIZ2 > memoryOptWhenAnrABParameters2.availMem) {
                        return;
                    }
                    C476250Ilz.LIZ.LJ(C2188631AlB.LIZ);
                }
            });
        }
    }

    public static void LJJIIJ() {
        if (C1519880pec.LIZ) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(C1519880pec.LIZ), "keva_initialized_normally");
        C20684815ws.LJIILLIIL("keva_stability_event", c2344009Gk.LIZ);
    }

    public static void LJJJJLL() {
        int i = Build.VERSION.SDK_INT;
        if (i > 32 || i < 26) {
            return;
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "tiktok_weak_ref_unblock_opt", true);
        if (iLJIJ == 1) {
            JatoXL.weakRefUnblock();
        } else if (iLJIJ == 2) {
            LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.22
                @Override // X.InterfaceC800080Va2
                public final String key() {
                    return "SysOptimizerTask$22";
                }

                @Override // X.InterfaceC308150C6b
                public final void run(Context context) {
                    JatoXL.weakRefUnblock();
                }
            });
        }
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !((Boolean) C1E21.LIZLLL.getValue()).booleanValue();
    }

    public static void LJ() {
        int size = SysOptimizer.getLoadLibraryError().size();
        if (size <= 0) {
            return;
        }
        int i = 0;
        do {
            LJJII("load_so_exception", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "SysOptimizerTask Thread", (Throwable) ListProtector.get(SysOptimizer.getLoadLibraryError(), i));
            i++;
        } while (i < size);
    }

    public static void LJIILIIL() {
        long jLJIJJ = C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "launch_period_gc_suppress", 0L);
        if (jLJIJJ > 0) {
            C1702420uP2.LIZIZ(jLJIJJ, 8);
        }
    }

    public static void LJIILJJIL() {
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "enable_jit_block", true, false)) {
            C2187451AjH.LJIIIIZZ();
            C2187451AjH.LJJIFFI(C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "launch_period_jit_suppress", 0L));
        }
    }

    public static void LJIILL() {
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("BundleSizeTooLargeSwitch", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bundleCheckerEnabled: ");
        sbLIZ.append(zLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SysOptimizerTask", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            Application applicationLIZ = C1BWL.LIZ();
            final ArrayDeque arrayDeque = new ArrayDeque(3);
            applicationLIZ.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0Uqr
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
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    try {
                        if (arrayDeque.size() >= 3) {
                            arrayDeque.removeFirst();
                        }
                        arrayDeque.addLast(Pair.create(new WeakReference(bundle), activity.getClass().getName()));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.08GK
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    if (str != null) {
                        try {
                            if (str.contains("android.os.TransactionTooLargeException") || str.contains("android.os.DeadSystemException")) {
                                final StringBuilder sb = new StringBuilder();
                                for (Pair pair : arrayDeque) {
                                    Bundle bundle = (Bundle) ((WeakReference) pair.first).get();
                                    if (bundle != null) {
                                        int iLIZJ = C08H7.LIZJ(bundle);
                                        sb.append("Activity: ");
                                        sb.append((String) pair.second);
                                        sb.append(", Bundle size: ");
                                        sb.append(C08H7.LIZIZ(iLIZJ));
                                        sb.append('\n');
                                        C08H7.LIZ(bundle, sb, 4);
                                        sb.append('\n');
                                    }
                                }
                                Npth.addAttachLongUserData(new AttachUserData() { // from class: X.087u
                                    @Override // com.bytedance.crash.AttachUserData
                                    public final Map<? extends String, ? extends String> getUserData(CrashType crashType2) {
                                        HashMap map = new HashMap();
                                        map.put("BundleTooLarge", sb.toString());
                                        return map;
                                    }
                                }, CrashType.JAVA);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }, CrashType.JAVA);
        }
    }

    public static void LJIILLIIL() {
        if (Process.is64Bit()) {
        }
    }

    public static void LJIJJ() {
        try {
            SettingsManager.LIZLLL().getClass();
            VMShrinkerParam vMShrinkerParam = (VMShrinkerParam) SettingsManager.LJII("shrink_settings", VMShrinkerParam.class);
            if (vMShrinkerParam == null || !vMShrinkerParam.shrink_enable) {
                return;
            }
            Shrinker shrinker = Shrinker.getInstance();
            SettingsManager.LIZLLL().getClass();
            shrinker.doShrink(SettingsManager.LJ("shrink_threshold", 512));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJJI() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "anr_monitor_report_ab", true) > 0) {
            if (C0A1D.LIZ() > 0) {
                AnrMonitor.setPostMode(1);
            }
            AnrManager.getInstance().registerListener(new AnrListener() { // from class: X.0CGJ
                public long LIZ;

                @Override // com.bytedance.sysoptimizer.anr.AnrListener
                public final void onAnrChange(boolean z, int i) {
                    if (z) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("level", i);
                            long j = this.LIZ + 1;
                            this.LIZ = j;
                            jSONObject.put("count", j);
                            jSONObject.put("post_mode", C0A1D.LIZ());
                            jSONObject.put("from_cold_start", SystemClock.uptimeMillis() - C202094145s.LJII);
                            C20684815ws.LJIJ("anrew_report", jSONObject);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            });
        }
    }

    public static void LJJJJL() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, -1, "string_builder_opt_ab", true);
        if (iLJIJ == 1) {
            C2188811AlT.LIZ = new InterfaceC2188831AlV() { // from class: X.08Qu
                public final AtomicReference<StringBuilder>[] LIZ = new AtomicReference[32];
                public final AtomicInteger LIZIZ = new AtomicInteger(-1);

                @Override // X.InterfaceC2188831AlV
                public final StringBuilder get() {
                    int andDecrement = this.LIZIZ.getAndDecrement();
                    if (andDecrement >= 32) {
                        andDecrement = 31;
                    }
                    if (andDecrement >= 0) {
                        StringBuilder andSet = this.LIZ[andDecrement].getAndSet(null);
                        if (andSet != null) {
                            return andSet;
                        }
                    } else {
                        this.LIZIZ.set(-1);
                    }
                    return new StringBuilder();
                }

                {
                    int i = 0;
                    do {
                        this.LIZ[i] = new AtomicReference<>(null);
                        i++;
                    } while (i < 32);
                }

                @Override // X.InterfaceC2188831AlV
                public final String LIZ(StringBuilder sb) {
                    String string = sb.toString();
                    if (sb.length() > 4096) {
                        return string;
                    }
                    sb.setLength(0);
                    int iIncrementAndGet = this.LIZIZ.incrementAndGet();
                    if (iIncrementAndGet >= 32) {
                        this.LIZIZ.set(31);
                    } else if (iIncrementAndGet >= 0) {
                        this.LIZ[iIncrementAndGet].set(sb);
                        return string;
                    }
                    return string;
                }
            };
        } else if (iLJIJ == 2) {
            C2188811AlT.LIZ = new InterfaceC2188831AlV() { // from class: X.08Qv
                public final StringBuilder[] LIZ = new StringBuilder[32];
                public final Object LIZIZ = new Object();
                public int LIZJ = -1;

                @Override // X.InterfaceC2188831AlV
                public final StringBuilder get() {
                    StringBuilder sb;
                    synchronized (this.LIZIZ) {
                        try {
                            int i = this.LIZJ;
                            sb = null;
                            if (i >= 0 && i < 32) {
                                StringBuilder[] sbArr = this.LIZ;
                                StringBuilder sb2 = sbArr[i];
                                sbArr[i] = null;
                                this.LIZJ = i - 1;
                                sb = sb2;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return sb == null ? new StringBuilder() : sb;
                }

                @Override // X.InterfaceC2188831AlV
                public final String LIZ(StringBuilder sb) {
                    String string = sb.toString();
                    if (sb.length() > 4096) {
                        return string;
                    }
                    sb.setLength(0);
                    synchronized (this.LIZIZ) {
                        try {
                            int i = this.LIZJ + 1;
                            if (i < 32 && i >= 0) {
                                this.LIZJ = i;
                                this.LIZ[i] = sb;
                                return string;
                            }
                            return string;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            };
        }
    }

    public final void LJJJJI() {
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("window_manager_stack_guard", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("windowManagerGuardEnable: ");
        sbLIZ.append(zLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("SysOptimizerTask", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            AndroidNWindowManagerProtector.install(new AndroidNWindowManagerProtector.GuardListener() { // from class: X.1Akr
                @Override // com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector.GuardListener
                public final void onGuardFailed() {
                    this.LIZ.getClass();
                    SysOptimizerTask.LJJIII(false);
                }

                @Override // com.bytedance.sysoptimizer.java.AndroidNWindowManagerProtector.GuardListener
                public final void onGuardSuccess() {
                    this.LIZ.getClass();
                    SysOptimizerTask.LJJIII(true);
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes32.dex */
    public static abstract class BootFinishTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
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
            return EnumC799870VZh.BOOT_FINISH;
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class MainThreadTask implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
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
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class SysMemOptBootFinishTask implements C0CCZ {
        public final boolean LL;

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "SysOptimizerTask$SysMemOptBootFinishTask";
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
            return EnumC799870VZh.BOOT_FINISH;
        }

        public SysMemOptBootFinishTask(boolean z) {
            this.LL = z;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            if (!this.LL && !Process.is64Bit() && C0C64.LJIILLIIL().LJIIIZ(31744, "tt_webview_reserved_shrink_opt", true, false)) {
                JatoXL.shrinkWebviewNative();
            }
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "tiktok_graphic_extra_buffer_bf_opt", true);
            if (iLJIJ != 0) {
                NativeAllocatorOptimizer.doSetExtraGraphicBuffer(context, iLJIJ);
            }
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LJFF(BootFinishTask bootFinishTask) {
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(bootFinishTask);
        c799890VZj.LIZIZ();
    }

    public static void LJIIIIZZ(Context context) {
        String[] strArrSplit;
        try {
            SettingsManager.LIZLLL().getClass();
            StackLeakCheckerParams stackLeakCheckerParams = (StackLeakCheckerParams) SettingsManager.LJII("enable_stack_leak_checker", StackLeakCheckerParams.class);
            if (stackLeakCheckerParams == null || !stackLeakCheckerParams.enable_checker) {
                return;
            }
            StackLeakChecker.registerStackLeakListener(new StackLeakChecker.StackLeakListener() { // from class: X.0jXm
                @Override // com.bytedance.sysoptimizer.StackLeakChecker.StackLeakListener
                public final void onLeakReport(ArrayList<StackLeakItem> arrayList) {
                    for (StackLeakItem stackLeakItem : arrayList) {
                        Throwable th = new Throwable(stackLeakItem.getLeakItem());
                        th.setStackTrace(new StackTraceElement[]{new StackTraceElement("StackLeakSoName", stackLeakItem.getSoName(), stackLeakItem.getSoName(), stackLeakItem.getLeakCount())});
                        SysOptimizerTask.LJJII("stack_leak_info", "stackleak", "stackleak", "stackleak", "StackLeakChecker Thread", th);
                    }
                }
            });
            StackLeakChecker.setInterval(stackLeakCheckerParams.report_threshold, ((long) (stackLeakCheckerParams.check_interval_mins * 6)) * 10000000);
            String str = stackLeakCheckerParams.auto_fix_list;
            if (str != null && str.length() > 1) {
                strArrSplit = stackLeakCheckerParams.auto_fix_list.split(":");
            } else {
                strArrSplit = null;
            }
            StackLeakChecker.enableChecker(context, strArrSplit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIIIZ(final Context context) {
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "increase_thread_priority_when_anr", true, false)) {
            if (C0A1D.LIZ() > 0) {
                AnrMonitor.setPostMode(1);
            }
            AnrManager.getInstance().registerListener(new AnrListener() { // from class: X.0CGI
                @Override // com.bytedance.sysoptimizer.anr.AnrListener
                public final void onAnrChange(boolean z, int i) {
                    if (z) {
                        if (i == 1) {
                            Process.setThreadPriority(Process.myPid(), -20);
                        }
                        Context context2 = context;
                        int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 100, 2, "opt_held_by_lock_thread_priority", true);
                        if (iLJIIZILJ >= -20 && iLJIIZILJ <= 20) {
                            try {
                                C838180WuO.LIZ(iLJIIZILJ);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                GetHeldByThreadOpt.Init(context2);
                                C838180WuO.LIZ(iLJIIZILJ);
                                return;
                            }
                        }
                        return;
                    }
                    int iLJIIZILJ2 = C0C64.LJIILLIIL().LJIIZILJ(31744, 100, 2, "reset_increase_thread_priority_when_anr", true);
                    if (iLJIIZILJ2 >= -20 && iLJIIZILJ2 <= 20) {
                        Process.setThreadPriority(Process.myPid(), iLJIIZILJ2);
                    } else {
                        Process.setThreadPriority(Process.myPid(), -10);
                    }
                }
            });
        }
    }

    public static void LJIIJ(Context context) {
        if (!C2162308dZ.LJI(context)) {
            return;
        }
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        if (((Boolean) C0AMB.LIZ.getValue()).booleanValue()) {
            c2188561Al4.LJIIJ = true;
        }
        MemReliefParameters memReliefParameters = (MemReliefParameters) C0C64.LJIILLIIL().LJJII(MemReliefParameters.class, C2188461Aku.LIZ, "mem_relief_framework_v2", true);
        if (memReliefParameters != null && memReliefParameters.openTrimMemory) {
            c2188561Al4.LJIIIIZZ = true;
            int[] iArr = memReliefParameters.trimMemLevel;
            c2188561Al4.LJIIIZ = ((Number) C0AM9.LIZ.getValue()).intValue();
            if (iArr != null) {
                for (int i : iArr) {
                    ((ArrayList) c2188561Al4.LJIIJJI).add(Integer.valueOf(i));
                }
            }
        }
        int iIntValue = ((Number) C0AM5.LIZ.getValue()).intValue();
        if (iIntValue > 0) {
            c2188561Al4.getClass();
            C2188421Akq.LIZLLL = iIntValue;
        }
        int iIntValue2 = ((Number) C0AM3.LIZ.getValue()).intValue();
        if (iIntValue2 > 0) {
            if (iIntValue2 != 1) {
                if (iIntValue2 != 2) {
                    if (iIntValue2 == 3) {
                        EnumC2188591Al7 enumC2188591Al7 = EnumC2188591Al7.LESS_THAN_2G;
                        c2188561Al4.getClass();
                        C2188421Akq.LJ = enumC2188591Al7;
                    }
                } else {
                    EnumC2188591Al7 enumC2188591Al72 = EnumC2188591Al7.LESS_THAN_1_75G;
                    c2188561Al4.getClass();
                    C2188421Akq.LJ = enumC2188591Al72;
                }
            } else {
                EnumC2188591Al7 enumC2188591Al73 = EnumC2188591Al7.LESS_THAN_1G;
                c2188561Al4.getClass();
                C2188421Akq.LJ = enumC2188591Al73;
            }
        }
        long jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "notify_memory_change_limit_exp", true);
        long jLJIJJLI2 = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "manual_memory_change_limit_exp", true);
        if (jLJIJJLI > 0 || jLJIJJLI2 > 0) {
            c2188561Al4.getClass();
            if (jLJIJJLI > C2188421Akq.LIZ) {
                C2188421Akq.LIZ = jLJIJJLI;
            }
            if (jLJIJJLI2 > C2188421Akq.LIZIZ) {
                C2188421Akq.LIZIZ = jLJIJJLI2;
            }
        }
        double dLJIIL = C0C64.LJIILLIIL().LJIIL(0.0d, 31744, "clear_soft_ref_threshold_pct_threshold", true);
        double dLJIIL2 = C0C64.LJIILLIIL().LJIIL(0.0d, 31744, "mem_relief_java_heap_pct_threshold", true);
        double dLJIIL3 = C0C64.LJIILLIIL().LJIIL(0.0d, 31744, "critical_threshold_pct_threshold", true);
        c2188561Al4.getClass();
        if (dLJIIL > 0.0d && dLJIIL < 1.0d) {
            c2188561Al4.LIZLLL = false;
            c2188561Al4.LJ = dLJIIL;
        }
        if (dLJIIL2 >= 0.5d && dLJIIL2 <= 0.85d) {
            c2188561Al4.LIZLLL = true;
            c2188561Al4.LJFF = dLJIIL2;
            c2188561Al4.LJI = (long) (C2367709Pn.LJ() * dLJIIL2);
        }
        if (dLJIIL3 >= 0.8d && dLJIIL3 <= 0.99d && dLJIIL3 > dLJIIL2) {
            c2188561Al4.LJII = (long) (C2367709Pn.LJ() * dLJIIL3);
        }
        long jLJIJJLI3 = C0C64.LJIILLIIL().LJIJJLI(31744, 0L, "memrelief_get_dalvikused_limit", true);
        if (jLJIJJLI3 > 0) {
            C2188421Akq.LIZJ = jLJIJJLI3;
        }
        int iIntValue3 = ((Number) C0AM0.LIZ.getValue()).intValue();
        if (iIntValue3 >= 1 && iIntValue3 <= 3) {
            c2188561Al4.LIZJ = iIntValue3;
        }
        if (((Boolean) C0AMD.LIZ.getValue()).booleanValue()) {
            final C013C c013c = new C013C();
            final C238400w2 c238400w2 = new C238400w2();
            final C238400w2 c238400w22 = new C238400w2();
            final C238400w2 c238400w23 = new C238400w2();
            final C238400w2 c238400w24 = new C238400w2();
            final C238400w2 c238400w25 = new C238400w2();
            final C238400w2 c238400w26 = new C238400w2();
            final C118300cf c118300cf = new C118300cf();
            final C259800zU c259800zU = new C259800zU();
            C2188561Al4 c2188561Al42 = C476250Ilz.LIZ;
            InterfaceC2188721AlK interfaceC2188721AlK = new InterfaceC2188721AlK() { // from class: X.09Qj
                /* JADX WARN: Type inference failed for: r0v16, types: [T, X.09Qi, java.lang.Runnable] */
                @Override // X.InterfaceC2188721AlK
                public final void LIZ(C1768270w7F c1768270w7F, boolean z) {
                    try {
                        if (z) {
                            if (c118300cf.element >= 3) {
                                return;
                            }
                        } else if (!z) {
                            c013c.element = true;
                            c238400w26.element = System.currentTimeMillis();
                            return;
                        }
                        c118300cf.element++;
                        c013c.element = false;
                        c238400w25.element = System.currentTimeMillis();
                        c238400w2.element = C2367709Pn.LIZLLL();
                        c238400w23.element = C1937207iM.LIZ("art.gc.bytes-freed", null);
                        Runnable runnable = c259800zU.element;
                        if (runnable != null) {
                            WeakRefMonitor.removeGcWatcher(runnable);
                        }
                        final C259800zU<Runnable> c259800zU2 = c259800zU;
                        final C013C c013c2 = c013c;
                        final C238400w2 c238400w27 = c238400w24;
                        final C238400w2 c238400w28 = c238400w22;
                        final C238400w2 c238400w29 = c238400w23;
                        final C238400w2 c238400w210 = c238400w2;
                        final C238400w2 c238400w211 = c238400w26;
                        final C238400w2 c238400w212 = c238400w25;
                        final C118300cf c118300cf2 = c118300cf;
                        ?? r0 = new Runnable() { // from class: X.09Qi
                            public final void LIZ() throws JSONException {
                                if (c013c2.element) {
                                    c238400w27.element = C1937207iM.LIZ("art.gc.bytes-freed", null);
                                    c238400w28.element = C2367709Pn.LIZLLL();
                                    long j = 1024;
                                    long j2 = ((c238400w27.element - c238400w29.element) / j) / j;
                                    long j3 = ((c238400w210.element - c238400w28.element) / j) / j;
                                    long j4 = c238400w211.element - c238400w212.element;
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("freed", j2);
                                    jSONObject.put("size", j3);
                                    jSONObject.put("time", j4);
                                    jSONObject.put("index", c118300cf2.element);
                                    C793770VBv.LJII("memory_relief_clear", null, jSONObject, null);
                                    C259800zU<Runnable> c259800zU3 = c259800zU2;
                                    Runnable runnable2 = c259800zU3.element;
                                    if (runnable2 != null) {
                                        WeakRefMonitor.removeGcWatcher(runnable2);
                                        c259800zU3.element = null;
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("MemoryClearSizeMonitor@f60f.start$1$invoke$2");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("MemoryClearSizeMonitor@f60f.start$1$invoke$2");
                            }
                        };
                        c259800zU2.element = r0;
                        WeakRefMonitor.addGcWatcher(r0);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Runnable runnable2 = c259800zU.element;
                        if (runnable2 != null) {
                            WeakRefMonitor.removeGcWatcher(runnable2);
                        }
                    }
                }
            };
            c2188561Al42.getClass();
            C2188561Al4.LJIIIIZZ(interfaceC2188721AlK);
        }
        c2188561Al4.LIZIZ(C1BWL.LIZ());
        C2188561Al4 c2188561Al43 = C476250Ilz.LIZ;
        C1550200qRW c1550200qRW = C1550190qRV.LIZ;
        c2188561Al43.getClass();
        C2188561Al4.LJII(c1550200qRW);
        if (C1768700w7w.LIZJ > 0) {
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0w7x
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BackgroundCacheManager@a5dd.init$1");
                    if (((C606810Nr5) obj).LIZIZ) {
                        ScheduledFuture<?> scheduledFuture = C1768700w7w.LIZ;
                        if (scheduledFuture != null && !scheduledFuture.isDone() && !scheduledFuture.isCancelled()) {
                            scheduledFuture.cancel(true);
                        }
                        C1768700w7w.LIZ = null;
                        C1768700w7w.LIZ = C823050WQl.LJ().schedule(new Runnable() { // from class: X.0w7v
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("BackgroundCacheManager@a5dd.scheduleBackgroundTask$1");
                                try {
                                    C476250Ilz.LIZ.LJ(C1768700w7w.LIZIZ);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("BackgroundCacheManager@a5dd.scheduleBackgroundTask$1");
                            }
                        }, C1768700w7w.LIZJ, TimeUnit.MILLISECONDS);
                    } else {
                        ScheduledFuture<?> scheduledFuture2 = C1768700w7w.LIZ;
                        if (scheduledFuture2 != null && !scheduledFuture2.isDone() && !scheduledFuture2.isCancelled()) {
                            scheduledFuture2.cancel(true);
                        }
                        C1768700w7w.LIZ = null;
                    }
                    C1C7U.LIZIZ("BackgroundCacheManager@a5dd.init$1");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(android.content.Context r6) {
        /*
            r3 = 0
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "mtk_power_vr_optimizer"
            java.lang.Class<com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$MtkPvrOptimizerParam> r0 = com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.MtkPvrOptimizerParam.class
            r2.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r5 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L21
            com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask$MtkPvrOptimizerParam r5 = (com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.MtkPvrOptimizerParam) r5     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L28
            java.lang.String[] r0 = r5.target_devices     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L29
            int r1 = r0.length     // Catch: java.lang.Throwable -> L1f
            r0 = 0
        L1a:
            if (r0 >= r1) goto L29
            int r0 = r0 + 1
            goto L1a
        L1f:
            r0 = move-exception
            goto L23
        L21:
            r0 = move-exception
            r5 = 0
        L23:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r5 != 0) goto L29
        L28:
            return
        L29:
            boolean r0 = r5.enable_optimizer
            if (r0 == 0) goto L63
            java.lang.String[] r2 = r5.target_devices
            if (r2 == 0) goto L6f
            int r0 = r2.length
            if (r0 <= 0) goto L6f
            java.lang.String r1 = "all_devices"
            r0 = r2[r3]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6f
            java.lang.String[] r4 = r5.target_devices
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r2 = android.os.Build.MODEL
            if (r2 == 0) goto L61
            if (r3 == 0) goto L64
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L64
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
        L61:
            if (r3 != 0) goto L65
        L63:
            return
        L64:
            r3 = r2
        L65:
            java.util.List r0 = java.util.Arrays.asList(r4)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L63
        L6f:
            boolean r0 = r5.always_catch_sigsegv
            com.bytedance.sysoptimizer.MTK_PVR_Optimizer.setAlwaysCatchSIGSEGV(r0)
            com.bytedance.sysoptimizer.MTK_PVR_Optimizer.enable(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.LJIJI(android.content.Context):void");
    }

    public static void LJJ(final Context context) {
        final int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "when_anr_perflock_time", true);
        if (iLJIIZILJ > 0) {
            if (C0A1D.LIZ() > 0) {
                AnrMonitor.setPostMode(1);
            }
            AnrManager.getInstance().registerListener(new AnrListener() { // from class: X.1AkI
                public long LIZ;

                @Override // com.bytedance.sysoptimizer.anr.AnrListener
                public final void onAnrChange(boolean z, int i) {
                    if (z && iLJIIZILJ > 0 && System.currentTimeMillis() - this.LIZ > iLJIIZILJ) {
                        this.LIZ = System.currentTimeMillis();
                        FrameworkPerfLockParams frameworkPerfLockParams = (FrameworkPerfLockParams) C2188111AkL.LIZ.getValue();
                        if (frameworkPerfLockParams != null && frameworkPerfLockParams.enable) {
                            PerfLockBooster.boostByFrameworkPerfLock(context, frameworkPerfLockParams.type, frameworkPerfLockParams.perflockParmaString, iLJIIZILJ);
                        } else {
                            AnonymousClass0810.LIZ.LIZ(iLJIIZILJ, null);
                        }
                    }
                }
            });
        }
    }

    public static void LJJIII(final boolean z) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        final String name = C786410Ut5.u3().getName();
        C799570VYd.LJFF(false).execute(new Runnable() { // from class: X.08Tu
            public final void LIZ() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put("is_guard_success", "true");
                    } else {
                        jSONObject.put("is_guard_success", "false");
                    }
                    jSONObject.put("thread_name", name);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_time", jCurrentTimeMillis);
                    C793770VBv.LJII("wms_stackoverflow_guard", jSONObject, jSONObject2, null);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SysOptimizerTask@9bdb.reportResult2Slardar$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SysOptimizerTask@9bdb.reportResult2Slardar$1");
            }
        });
    }

    public static void LJJIIZ(Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tiktok_a_codec_get_port_format", true, false)) {
            ACodecGetPortFormatOptimizer.fixACodecGetPortFormat(context);
        }
    }

    public static void LJJIIZI(Context context) {
        RegionSpaceShrinkParams regionSpaceShrinkParams = (RegionSpaceShrinkParams) C0C64.LJIILLIIL().LJJII(RegionSpaceShrinkParams.class, null, "region_space_shrink_exp_v2", true);
        if (regionSpaceShrinkParams != null && regionSpaceShrinkParams.enable) {
            HeapGCOptimizer.VssConfig vssConfig = new HeapGCOptimizer.VssConfig();
            vssConfig.firstDelay = regionSpaceShrinkParams.firstDelay;
            vssConfig.periodOfCheck = regionSpaceShrinkParams.periodOfCheck;
            vssConfig.periodOfShrink = regionSpaceShrinkParams.periodOfShrink;
            vssConfig.periodOfLessMemoryUsage = regionSpaceShrinkParams.periodOfLessMemoryUsage;
            vssConfig.shrinkStep = regionSpaceShrinkParams.shrinkStep;
            vssConfig.lowerLimit = regionSpaceShrinkParams.lowerLimit;
            HeapGCOptimizer.optimizeRegionSpaceVSS(context, vssConfig);
        }
    }

    public static void LJJIJIIJI(final Context context) {
        try {
            C0S78.LIZJ(new Function0<Unit>() { // from class: X.08PM
                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    if (Build.VERSION.SDK_INT == 35 && Process.is64Bit() && C0C64.LJIILLIIL().LJIIIZ(31744, "codec2_client_fix", true, false)) {
                        Codec2ClientFix.start(context);
                    }
                    return Unit.LIZ;
                }
            }, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJJIJIIJIL(Context context) {
        try {
            C0S78.LIZJ(new AObjectS379S0100000_3(context, 1), true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJJIJIL(final Context context) {
        if (Build.VERSION.SDK_INT > 28 || !Process.is64Bit()) {
            return;
        }
        try {
            C0S78.LIZJ(new Function0<Unit>() { // from class: X.0C81
                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    SysOptimizerTask.ExpandFdPara expandFdPara;
                    try {
                        expandFdPara = (SysOptimizerTask.ExpandFdPara) C0C64.LJIILLIIL().LJJII(SysOptimizerTask.ExpandFdPara.class, null, "expand_fd_settings", true);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (expandFdPara == null || !expandFdPara.enable) {
                        return Unit.LIZ;
                    }
                    ExpandFd.apply(context, false, expandFdPara.expand_fd_set_target_list);
                    return Unit.LIZ;
                }
            }, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJJIJL(Context context) {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, -1, "detach_current_thread_crash_fix_ab2", true);
        if (((Number) C2250201D5m.LJIILLIIL.getValue()).intValue() > 0 || iLJIJ > 0) {
            DetachCurrentThreadOpt.fix(context);
        }
    }

    public static void LJJIJLIJ(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("egl_create_surface_crash_enable", false)) {
            return;
        }
        EglCreateSurfaceFixer.fixOsOP(context, 2);
    }

    public static void LJJIL(Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "hint_activity_launch_crash_fix_ab", true, false)) {
            GraphicsEnvOpt.fix(context);
        }
    }

    public static void LJJIZ(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("hprof_dump_data_opt", true)) {
            VMDebugDumpHprofOptimizer.fix(context);
        }
    }

    public static void LJJJ(Context context) {
        if (Build.VERSION.SDK_INT > 27 && ((Boolean) C291880BcI.LIZ.getValue()).booleanValue()) {
            JitDebugInfoOptimizer.install(context, false);
        }
    }

    public static void LJJJI(Context context) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("fix_NativeCrypto_d2i_X509_CRL_bio_crash", true)) {
            ONativeCryptoCRLOptimizer.fix(context);
        }
    }

    public static void LJJJIL(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            if (i <= 34) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "suspend_bypeer_opt", true, true)) {
                    SuspendByPeerOpt.start(context, false);
                }
                if (i < 31) {
                    return;
                }
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "suspend_all_opt", true, false)) {
                SuspendAllOpt.start(context);
            }
        }
    }

    public static void LJJJJ(Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tiktok_vivo_perf_anr_fix", true, false)) {
            VivoPerfFrameInfoManagerImplOptimizer.fix(context);
        }
    }

    public static void LJJJJIZL(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 27 && i <= 34 && Process.is64Bit()) {
            try {
                JavaExtinguisherParam javaExtinguisherParam = (JavaExtinguisherParam) C0C64.LJIILLIIL().LJJII(JavaExtinguisherParam.class, C0VE5.LIZ, "java_extinguisher_op", true);
                if (javaExtinguisherParam != null && javaExtinguisherParam.enable) {
                    String strLIZ = C2162308dZ.LIZ(context);
                    List<String> list = javaExtinguisherParam.procNames;
                    if (list != null && list.contains(strLIZ)) {
                        C786410Ut5.LJLIIL(javaExtinguisherParam.delayMillis, C799570VYd.LIZIZ(), new ARunnableS82S0200000_13(javaExtinguisherParam, context, 31));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJJJJJ(Context context) {
        try {
            LogStackPara logStackPara = (LogStackPara) C0C64.LJIILLIIL().LJJII(LogStackPara.class, null, "log_stack_4310", true);
            if (logStackPara != null && logStackPara.enable) {
                PLogStack.start(context, logStackPara.prio, logStackPara.tag);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJJJJJL(Context context) {
        int iLJIJ;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (Process.is64Bit()) {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, false);
                return;
            } else {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, true);
                return;
            }
        }
        if (i < 26 && (iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, -1, "opt_renderthread_glcheck_23_25", true)) != -1) {
            if (iLJIJ == 0) {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, false);
            } else {
                MaliMemOptimizer.enableMaliGLErrorSkip(context, true);
            }
            int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, -1, "opt_renderthread_eglGetError_23_25", true);
            if (iLJIJ2 != -1) {
                if (iLJIJ2 == 0) {
                    MaliMemOptimizer.enableMaliEGLErrorSkip(context, false);
                } else {
                    MaliMemOptimizer.enableMaliEGLErrorSkip(context, true);
                }
            }
        }
    }

    public static void LJJJJLI(Context context) {
        int i;
        String str;
        if (NativeAllocatorOptimizer.isJemallocAllocator(context)) {
            JemallocOptimizerParams jemallocOptimizerParams = (JemallocOptimizerParams) C0C64.LJIILLIIL().LJJII(JemallocOptimizerParams.class, null, "tiktok_jemalloc_settings", true);
            if (jemallocOptimizerParams != null && jemallocOptimizerParams.enable) {
                NativeAllocatorOptimizer.optimize(context, jemallocOptimizerParams.optimize_option);
            }
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, -1, "tiktok_jemalloc_decaytime_opt", true);
            if (iLJIJ > 0) {
                NativeAllocatorOptimizer.doJemallocDecayOpt(context, iLJIJ);
            }
            ArrayList<JemallocSettingResult> arrayList = new ArrayList();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "tiktok_jemalloc_thread_tcache_enabled", true, false)) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocThreadTcacheEnabled(context, true));
            }
            int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arena_decay_time", true);
            if (iLJIJ2 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaDecayTime(context, iLJIJ2));
            }
            String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "tiktok_jemalloc_arena_dss", "null", true);
            if (strLJJ != null && !strLJJ.equals("null")) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaDss(context, strLJJ));
            }
            int iLJIJ3 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arena_lg_dirty_mult", true);
            if (iLJIJ3 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaLgDirtyMult(context, iLJIJ3));
            }
            int iLJIJ4 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arena_dirty_decay_ms", true);
            if (iLJIJ4 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaDirtyDecayMs(context, iLJIJ4));
            }
            int iLJIJ5 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arena_muzzy_decay_ms", true);
            if (iLJIJ5 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaMuzzyDecayMs(context, iLJIJ5));
            }
            int iLJIJ6 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arena_retain_grow_limit", true);
            if (iLJIJ6 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenaRetainGrowLimit(context, iLJIJ6));
            }
            int iLJIJ7 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arenas_lg_dirty_mult", true);
            if (iLJIJ7 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasLgDirtyMult(context, iLJIJ7));
            }
            int iLJIJ8 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arenas_decay_time", true);
            if (iLJIJ8 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasDecayTime(context, iLJIJ8));
            }
            int iLJIJ9 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arenas_dirty_decay_ms", true);
            if (iLJIJ9 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasDirtyDecayMs(context, iLJIJ9));
            }
            int iLJIJ10 = C0C64.LJIILLIIL().LJIJ(31744, Integer.MIN_VALUE, "tiktok_jemalloc_arenas_muzzy_decay_ms", true);
            if (iLJIJ10 != Integer.MIN_VALUE) {
                arrayList.add(JemallocAllocatorOptimizer.doJemallocArenasMuzzyDecayMs(context, iLJIJ10));
            }
            for (JemallocSettingResult jemallocSettingResult : arrayList) {
                C736480Suk c736480Suk = new C736480Suk();
                c736480Suk.LIZ("option", jemallocSettingResult.optionName);
                c736480Suk.LIZ("origin_value", jemallocSettingResult.rawValue);
                c736480Suk.LIZ("setting_value", jemallocSettingResult.settingValue);
                c736480Suk.LIZ("result", String.valueOf(jemallocSettingResult.exitCode));
                C20684815ws.LJIJ("android_jemalloc_setting_result", c736480Suk.LIZIZ());
            }
            final JemallocExtendParams jemallocExtendParams = (JemallocExtendParams) C0C64.LJIILLIIL().LJJII(JemallocExtendParams.class, null, "tiktok_jemalloc_extend_settings", true);
            if (jemallocExtendParams != null && jemallocExtendParams.enable) {
                if (jemallocExtendParams.doWhenBootFinish) {
                    LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.13
                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "SysOptimizerTask$13";
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context2) {
                            if (jemallocExtendParams.mainThreadExtend) {
                                JemallocExtend.extendArena(context2);
                            }
                            if (jemallocExtendParams.renderThreadExtend) {
                                JemallocExtend.renderThreadExtendArena(context2);
                            }
                        }
                    });
                } else {
                    if (jemallocExtendParams.mainThreadExtend) {
                        MainThreadTask mainThreadTask = new MainThreadTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.14
                            @Override // X.InterfaceC800080Va2
                            public final String key() {
                                return "SysOptimizerTask$14";
                            }

                            @Override // X.InterfaceC308150C6b
                            public final void run(Context context2) {
                                JemallocExtend.extendArena(context2);
                            }
                        };
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(mainThreadTask);
                        c799890VZj.LIZIZ();
                    }
                    if (jemallocExtendParams.renderThreadExtend) {
                        JemallocExtend.renderThreadExtendArena(context);
                    }
                }
            }
            final JemallocExtendParamsEx jemallocExtendParamsEx = (JemallocExtendParamsEx) C0C64.LJIILLIIL().LJJII(JemallocExtendParamsEx.class, null, "tiktok_jemalloc_extend_ex_art", true);
            if (jemallocExtendParamsEx != null && jemallocExtendParamsEx.enable) {
                if (jemallocExtendParamsEx.doWhenBootFinish) {
                    LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.15
                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "SysOptimizerTask$15";
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context2) {
                            JemallocExtend.artThreadExtendArena(context2, jemallocExtendParamsEx.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.artThreadExtendArena(context, jemallocExtendParamsEx.maxThreadNums);
                }
            }
            final JemallocExtendParamsEx jemallocExtendParamsEx2 = (JemallocExtendParamsEx) C0C64.LJIILLIIL().LJJII(JemallocExtendParamsEx.class, null, "tiktok_jemalloc_extend_ex_player", true);
            if (jemallocExtendParamsEx2 != null && jemallocExtendParamsEx2.enable) {
                if (jemallocExtendParamsEx2.doWhenBootFinish) {
                    LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.16
                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "SysOptimizerTask$16";
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context2) {
                            JemallocExtend.playerExtendArena(context2, jemallocExtendParamsEx2.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.playerExtendArena(context, jemallocExtendParamsEx2.maxThreadNums);
                }
            }
            final JemallocExtendParamsEx jemallocExtendParamsEx3 = (JemallocExtendParamsEx) C0C64.LJIILLIIL().LJJII(JemallocExtendParamsEx.class, null, "tiktok_jemalloc_extend_ex_partial_libs", true);
            if (jemallocExtendParamsEx3 != null && jemallocExtendParamsEx3.enable) {
                if (jemallocExtendParamsEx3.doWhenBootFinish) {
                    LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.17
                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "SysOptimizerTask$17";
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context2) {
                            JemallocExtend.otherCoreLibsExtendArena(context2, jemallocExtendParamsEx3.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.otherCoreLibsExtendArena(context, jemallocExtendParamsEx3.maxThreadNums);
                }
            }
            final JemallocExtendParamsSpecific jemallocExtendParamsSpecific = (JemallocExtendParamsSpecific) C0C64.LJIILLIIL().LJJII(JemallocExtendParamsSpecific.class, null, "tiktok_jemalloc_extend_ex_specific", true);
            if (jemallocExtendParamsSpecific != null && jemallocExtendParamsSpecific.enable && (str = jemallocExtendParamsSpecific.libName) != null) {
                if (jemallocExtendParamsSpecific.doWhenBootFinish) {
                    LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.18
                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "SysOptimizerTask$18";
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context2) {
                            JemallocExtendParamsSpecific jemallocExtendParamsSpecific2 = jemallocExtendParamsSpecific;
                            JemallocExtend.extendArenaSpecific(context2, jemallocExtendParamsSpecific2.libName, jemallocExtendParamsSpecific2.maxThreadNums);
                        }
                    });
                } else {
                    JemallocExtend.extendArenaSpecific(context, str, jemallocExtendParamsSpecific.maxThreadNums);
                }
            }
            final JemallocExtendParamsAutoFinal jemallocExtendParamsAutoFinal = (JemallocExtendParamsAutoFinal) C0C64.LJIILLIIL().LJJII(JemallocExtendParamsAutoFinal.class, null, "tiktok_jemalloc_extend_auto_final", true);
            if (jemallocExtendParamsAutoFinal != null && jemallocExtendParamsAutoFinal.enable && (i = jemallocExtendParamsAutoFinal.arenaNum) > 0) {
                if (jemallocExtendParamsAutoFinal.doWhenBootFinish) {
                    LJFF(new BootFinishTask() { // from class: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.19
                        @Override // X.InterfaceC800080Va2
                        public final String key() {
                            return "SysOptimizerTask$19";
                        }

                        @Override // X.InterfaceC308150C6b
                        public final void run(Context context2) {
                            JemallocExtendParamsAutoFinal jemallocExtendParamsAutoFinal2 = jemallocExtendParamsAutoFinal;
                            JemallocExtend.extendMultiArenaToAuto(context2, jemallocExtendParamsAutoFinal2.arenaNum, jemallocExtendParamsAutoFinal2.decayTime);
                        }
                    });
                } else {
                    JemallocExtend.extendMultiArenaToAuto(context, i, jemallocExtendParamsAutoFinal.decayTime);
                }
            }
        }
        int iLJIJ11 = C0C64.LJIILLIIL().LJIJ(31744, 0, "tiktok_graphic_extra_buffer_opt", true);
        if (iLJIJ11 != 0) {
            NativeAllocatorOptimizer.doSetExtraGraphicBuffer(context, iLJIJ11);
        }
        int iLJIJ12 = C0C64.LJIILLIIL().LJIJ(31744, 0, "tiktok_hwui_purge_control_ab", true);
        if (iLJIJ12 != 0) {
            JemallocExtend.hwuiPurgeCtl(context, iLJIJ12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(final android.content.Context r22) {
        /*
            Method dump skipped, instruction units count: 2405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.SysOptimizerTask.run(android.content.Context):void");
    }

    public static void LJJIIJZLJL(Context context, GwpasanAction.GwpasanSceneConfig gwpasanSceneConfig) {
        ArrayList<String> arrayList;
        if (gwpasanSceneConfig.debug) {
            C804090VgV.LIZIZ().LIZ = true;
        }
        GwpasanAction.GwpasanSceneConfig gwpasanSceneConfig2 = GwpasanAction.LIZLLL;
        if (gwpasanSceneConfig2 != null && (arrayList = gwpasanSceneConfig2.sceneActivities) != null && arrayList.size() > 0) {
            C804120VgY c804120VgY = new C804120VgY();
            GwpasanAction.LJ = c804120VgY;
            c804120VgY.LIZ = GwpasanAction.LIZLLL.sceneActivities;
        }
        C804120VgY c804120VgY2 = GwpasanAction.LJ;
        if (c804120VgY2 != null) {
            if (GwpasanAction.LIZIZ == null) {
                GwpasanAction.LIZIZ = new GwpasanAction();
            }
            GwpasanAction gwpasanAction = GwpasanAction.LIZIZ;
            gwpasanAction.LIZ = c804120VgY2;
            C804090VgV.LIZIZ();
            C804090VgV.LIZ(gwpasanAction);
        }
        C804080VgU.LIZ(context);
    }

    public static void LJJIJ(Context context, PageSizeMonitorPara16kb pageSizeMonitorPara16kb) {
        if (Build.VERSION.SDK_INT >= 30 && Process.is64Bit()) {
            try {
                AlignPageOpt.start(context, pageSizeMonitorPara16kb.is_only_16kb_check, pageSizeMonitorPara16kb.addlog, pageSizeMonitorPara16kb.crash, pageSizeMonitorPara16kb.exception, false);
                int i = pageSizeMonitorPara16kb.test_mode;
                if (i > 0 && i <= 7) {
                    C0VSJ c0vsj = new C0VSJ(LIZ(context), "align_page_opt");
                    c0vsj.mkdirs();
                    AlignPageOpt.test(context, c0vsj.getAbsolutePath(), pageSizeMonitorPara16kb.test_mode);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJJII(String str, String str2, String str3, String str4, String str5, Throwable th) {
        StackTraceElement stackTraceElement = th.getStackTrace()[th.getStackTrace().length - 1];
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = C0VY4.LIZ;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement2 : stackTrace) {
            C0VY4.LIZIZ(stackTraceElement2, sb);
        }
        C801800Vco c801800VcoLJFF = C801800Vco.LJFF(stackTraceElement, sb.toString(), str2, str5, false, str3, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(th.toString());
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        C0VYL.LIZ(str, jSONArray, c801800VcoLJFF.LIZ);
        c801800VcoLJFF.LIZIZ(str4, "true");
        c.LIZ(c801800VcoLJFF);
    }
}
