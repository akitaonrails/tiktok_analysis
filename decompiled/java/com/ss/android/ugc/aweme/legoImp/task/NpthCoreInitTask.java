package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC792220V5w;
import X.C08Q0;
import X.C0CCZ;
import X.C0VU0;
import X.C0VZ0;
import X.C0W1R;
import X.C0X35;
import X.C1519810peV;
import X.C1BMY;
import X.C2104108Md;
import X.C2162308dZ;
import X.C2203591BMf;
import X.C786410Ut5;
import X.C803490VfX;
import X.C803800Vg2;
import X.C823690WSx;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC803940VgG;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.looper.BlockMonitor;
import com.bytedance.crash.looper.FullMessageObserver;
import com.bytedance.crash.looper.MessageObserver;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public class NpthCoreInitTask implements C0CCZ {
    public static volatile Throwable LL;
    public static C1519810peV LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NpthCoreInitTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    public static void LIZ(Context context) {
        synchronized (C2203591BMf.class) {
            if (C2203591BMf.LIZ) {
                return;
            }
            if (C2104108Md.LIZLLL(context) || C2104108Md.LIZ(context).contains(":safemode")) {
                C1BMY c1bmyLIZIZ = C1BMY.LIZIZ();
                InterfaceC803940VgG interfaceC803940VgG = new InterfaceC803940VgG() { // from class: X.0Vfu
                };
                c1bmyLIZIZ.getClass();
                SafeModeActivity.LLILZ = interfaceC803940VgG;
                C1BMY.LIZIZ().LIZJ(context, C2104108Md.LIZLLL(context), new C823690WSx(C786410Ut5.N3(context)));
                C2203591BMf.LIZ(context);
            }
            C2203591BMf.LIZ = true;
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String str;
        C0X35.LIZ("npth_task_other", false);
        Npth.setApplication((Application) context);
        if (C2162308dZ.LIZ(context).contains("miniapp")) {
            return;
        }
        if (C08Q0.LJ(context, "pns_slardar_route_opt_enable_boot", false)) {
            Npth.setUseLocalDomain(true);
            Npth.setDomainName("https://mon-boot.tiktokv.com");
            Npth.setRequestHeaderProvider(new C0W1R(this));
        }
        String strLIZ = C2162308dZ.LIZ(context);
        BlockMonitor blockMonitor = null;
        if (!TextUtils.isEmpty(strLIZ) && strLIZ.contains("bm")) {
            str = "3902";
        } else {
            str = null;
        }
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("npth_init_anr_ahead", false)) {
            Npth.setInitAnrAhead(true);
        }
        Npth.setOpenNewAnrMonitor(true);
        if (C08Q0.LJ(context, "opt_npth_dump_stack", false)) {
            Npth.setFixDumpStack(true);
        }
        int iLIZIZ = C08Q0.LIZIZ(context, 0, "opt_apm_data_pipeline_cache_size");
        if (iLIZIZ != 0) {
            AbstractC792220V5w.LLIZ = false;
            AbstractC792220V5w.LLILZLL = iLIZIZ;
        }
        if (C08Q0.LJ(context, "optimize_npthsample", false)) {
            Npth.setMaxCacheSize(0);
            Npth.setQueueLimitSize(0);
        }
        if (C08Q0.LJ(context, "optimize_npthternimate_v3", false)) {
            Npth.setTerminateOpt(true);
            Npth.optProcessTrackDisk();
        }
        if (C08Q0.LJ(context, "optimize_npthinit", false)) {
            Npth.setNpthInitOptEnable(true);
        }
        if (C08Q0.LJ(context, "npth_open_looper_monitor", false)) {
            MessageRecorder.LJ(3);
        }
        if (C08Q0.LJ(context, "npth_open_leak_object", false)) {
            C803490VfX.LJI = true;
        }
        MessageRecorder.LJ(C08Q0.LIZIZ(context, 0, "npth_open_looper_mode_monitor"));
        if (C08Q0.LJ(context, "npth_open_block_monitor", false)) {
            synchronized (MessageRecorder.class) {
                if (!MessageRecorder.LIZJ) {
                    MessageRecorder.LIZJ = true;
                    MessageObserver messageObserver = MessageRecorder.LIZ;
                    if (messageObserver instanceof FullMessageObserver) {
                        FullMessageObserver fullMessageObserver = (FullMessageObserver) messageObserver;
                        if (fullMessageObserver.LLIZ == null) {
                            long jLJJJ = NativeBridge.LJJJ();
                            if (jLJJJ != 0) {
                                blockMonitor = new BlockMonitor(jLJJJ);
                            }
                            fullMessageObserver.LLIZ = blockMonitor;
                        }
                    }
                }
            }
        }
        if (C08Q0.LJ(context, "npth_async_dump", false)) {
            Npth.setDumpAnrAsync(true);
        }
        if (C08Q0.LJ(context, "anr_monitor_opt_ignore_anrinfo", false)) {
            C803490VfX.LIZ = true;
        }
        if (C08Q0.LJ(context, "optimize_anr_filter_low_memory", false)) {
            Npth.setANRImprovementOpt(true);
        }
        if (C08Q0.LJ(context, "optimize_oppo_crash_upload", false)) {
            C803490VfX.LJFF = true;
            C803490VfX.LJ = 4567;
        }
        C0X35.LJIIJJI("npth_task_other", false);
        C0X35.LIZ("npth_task_init", false);
        C844470XAv.LIZ.getClass();
        if (!C844470XAv.LJIJ) {
            Npth.init(context, new C0VU0(str), true, true, true);
        }
        C0X35.LJIIJJI("npth_task_init", false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && i <= 32 && !Process.is64Bit() && C08Q0.LJ(context, "npth_intercept_sigquit", false)) {
            NativeBridge.LJJJJLI(false);
        }
        ICrashSdkApi iCrashSdkApi = (ICrashSdkApi) PluggableExtentionKt.pluggableSpi(ICrashSdkApi.class);
        if (iCrashSdkApi != null) {
            iCrashSdkApi.LJIJI();
        }
        C0X35.LIZ("npth_task_safe", false);
        LIZ(context);
        C0X35.LJIIJJI("npth_task_safe", false);
        if (LL == null) {
            int i2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("event_bus_opt_v3", -1);
            if (i2 > 0) {
                C803800Vg2.LIZ = i2;
            }
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0WSt
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str2, Thread thread) {
                    if (C823670WSv.LJ()) {
                        C823670WSv.LIZIZ(C823670WSv.LIZ, str2, true);
                    }
                }
            }, CrashType.NATIVE);
            return;
        }
        throw new RuntimeException("before npth init crash catch", LL);
    }
}
