package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;
import X.C0C64;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2201421BDw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.ss.android.ugc.IResourceChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes35.dex */
public class ResCheckerTask implements C0CCZ, InterfaceC799590VYf {
    public static volatile boolean LL;
    public static volatile boolean LLILLJJLI;
    public static volatile boolean LLILLL;
    public static volatile boolean LLILZ;

    public static class JavaResMonitorParams {

        @C09CT("event_enabled")
        public boolean event_enabled;

        @C09CT("periodic_enabled")
        public boolean periodic_enabled;

        @C09CT("interval_ms")
        public int interval_ms = LSPassThroughRecordSizeConfig.DEFAULT;

        @C09CT("collection_mode_main")
        public String collection_mode_main = "async";

        @C09CT("collection_mode_other")
        public String collection_mode_other = "sync";

        @C09CT("write_mode")
        public String write_mode = "async";

        @C09CT("objectCountBuiltins")
        public String objectCountBuiltins = "all";

        @C09CT("objectCountCustom")
        public String objectCountCustom = "";

        @C09CT("collectors")
        public Collectors collectors = new Collectors();

        @C09CT("events")
        public Events events = new Events();

        public static class Collectors {

            @C09CT("AppMemory")
            public boolean AppMemory = true;

            @C09CT("DeviceMemory")
            public boolean DeviceMemory = true;

            @C09CT("Bitmap")
            public boolean Bitmap = true;

            @C09CT("ObjectCount")
            public boolean ObjectCount = true;

            @C09CT("NativeAlloc")
            public boolean NativeAlloc = true;

            @C09CT("Fps")
            public boolean Fps = true;

            @C09CT("Cpu")
            public boolean Cpu = true;

            @C09CT("Io")
            public boolean Io = true;

            @C09CT("Traffic")
            public boolean Traffic = true;

            @C09CT("Netstat")
            public boolean Netstat = true;

            @C09CT("Gc")
            public boolean Gc = true;
        }

        /* JADX INFO: loaded from: classes33.dex */
        public static class Events {

            @C09CT("Activity")
            public boolean Activity = true;

            @C09CT("Fragment")
            public boolean Fragment = true;

            @C09CT("Scene")
            public boolean Scene = true;

            @C09CT("BackgroundSwitch")
            public boolean BackgroundSwitch = true;

            @C09CT("Gc")
            public boolean Gc = true;
        }
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ResCheckerTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static class LibMemMonitorParams {

        @C09CT("bytehook_enable")
        public boolean bytehook_enable;

        @C09CT("debug_log")
        public boolean debug_log;

        @C09CT("delayS")
        public int delayS;

        @C09CT("dump_stack_on_interval")
        public boolean dump_stack_on_interval;

        @C09CT("dynamic_configs")
        public h dynamic_configs;

        @C09CT("gpu_mode")
        public int gpu_mode;

        @C09CT("gpu_threshold")
        public int gpu_threshold;

        @C09CT("gpu_track_libs")
        public String gpu_track_libs;

        @C09CT("hook_libc")
        public boolean hook_libc;

        @C09CT("intervalInS")
        public int intervalInS;

        @C09CT("other_libs")
        public String other_libs;

        @C09CT("port")
        public int port;

        @C09CT("probability")
        public int probability;

        @C09CT("pss_lock_mode")
        public int pss_lock_mode;

        @C09CT("pss_mode")
        public int pss_mode;

        @C09CT("pss_shard_spin_count")
        public int pss_shard_spin_count;

        @C09CT("pss_threshold")
        public int pss_threshold;

        @C09CT("pss_track_libs")
        public String pss_track_libs;

        @C09CT("report")
        public boolean report;

        @C09CT("stack_mode")
        public int stack_mode;

        @C09CT("thread_enable")
        public boolean thread_enable;

        @C09CT("thread_stack_enable")
        public boolean thread_stack_enable;

        @C09CT("dump_size")
        public long dump_size = 900000000;

        @C09CT("dump_top_num")
        public int dump_top_num = 10;

        @C09CT("pss_malloc_sample_rate")
        public int pss_malloc_sample_rate = 1;

        @C09CT("thread_stack_report_threshold")
        public int thread_stack_report_threshold = 100;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LibMemMonitorParams{bytehook_enable=");
            sbLIZ.append(this.bytehook_enable);
            sbLIZ.append(", debug_log=");
            sbLIZ.append(this.debug_log);
            sbLIZ.append(", delayS=");
            sbLIZ.append(this.delayS);
            sbLIZ.append(", intervalInS=");
            sbLIZ.append(this.intervalInS);
            sbLIZ.append(", port=");
            sbLIZ.append(this.port);
            sbLIZ.append(", probability=");
            sbLIZ.append(this.probability);
            sbLIZ.append(", report=");
            sbLIZ.append(this.report);
            sbLIZ.append(", stack_mode=");
            sbLIZ.append(this.stack_mode);
            sbLIZ.append(", dump_size=");
            sbLIZ.append(this.dump_size);
            sbLIZ.append(", dump_top_num=");
            sbLIZ.append(this.dump_top_num);
            sbLIZ.append(", dump_stack_on_interval=");
            sbLIZ.append(this.dump_stack_on_interval);
            sbLIZ.append(", pss_mode=");
            sbLIZ.append(this.pss_mode);
            sbLIZ.append(", pss_threshold=");
            sbLIZ.append(this.pss_threshold);
            sbLIZ.append(", hook_libc=");
            sbLIZ.append(this.hook_libc);
            sbLIZ.append(", pss_track_libs=");
            sbLIZ.append(this.pss_track_libs);
            sbLIZ.append(", other_libs=");
            sbLIZ.append(this.other_libs);
            sbLIZ.append(", pss_malloc_sample_rate=");
            sbLIZ.append(this.pss_malloc_sample_rate);
            sbLIZ.append(", pss_shard_spin_count=");
            sbLIZ.append(this.pss_shard_spin_count);
            sbLIZ.append(", pss_lock_mode=");
            sbLIZ.append(this.pss_lock_mode);
            sbLIZ.append(", gpu_mode=");
            sbLIZ.append(this.gpu_mode);
            sbLIZ.append(", gpu_threshold=");
            sbLIZ.append(this.gpu_threshold);
            sbLIZ.append(", gpu_track_libs=");
            sbLIZ.append(this.gpu_track_libs);
            sbLIZ.append(", thread_enable= ");
            sbLIZ.append(this.thread_enable);
            sbLIZ.append(", thread_stack_enable=");
            sbLIZ.append(this.thread_stack_enable);
            sbLIZ.append(", thread_stack_report_threshold=");
            sbLIZ.append(this.thread_stack_report_threshold);
            sbLIZ.append(", dynamic_configs=");
            sbLIZ.append(this.dynamic_configs);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
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

    public static void LIZ(Context context) {
        try {
            Class<?> cls = Class.forName("jv6.a");
            cls.getDeclaredMethod("install", Context.class).invoke(cls, context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            System.err.println(th);
        }
    }

    public static boolean LJ(Context context) {
        int i;
        LIZ(context);
        LibMemMonitorParams libMemMonitorParams = (LibMemMonitorParams) C0C64.LJIILLIIL().LJJII(LibMemMonitorParams.class, null, "tt_lib_memory_monitor_settings", true);
        if (libMemMonitorParams == null) {
            libMemMonitorParams = new LibMemMonitorParams();
        }
        if (libMemMonitorParams.debug_log) {
            ((IResourceChecker) PluggableExtentionKt.pluggableSpi(IResourceChecker.class)).LJIIL(context);
        }
        if (Build.VERSION.SDK_INT < 24 || !C2162308dZ.LJI(context) || (i = libMemMonitorParams.probability) <= 0 || (i < 100 && ThreadLocalRandom.current().nextInt(100) >= i)) {
            return false;
        }
        if (libMemMonitorParams.pss_mode == 0 && libMemMonitorParams.gpu_mode == 0 && libMemMonitorParams.dynamic_configs == null) {
            return false;
        }
        try {
            return C2201421BDw.LIZ(context, libMemMonitorParams);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r1.event_enabled != false) goto L80;
     */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.ResCheckerTask.run(android.content.Context):void");
    }
}
