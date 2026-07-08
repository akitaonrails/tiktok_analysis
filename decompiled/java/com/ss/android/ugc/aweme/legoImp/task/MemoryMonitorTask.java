package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C0W9W;
import X.C2080808De;
import X.C2162308dZ;
import X.C2407009bw;
import X.C803080Ves;
import X.C807760VmQ;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.EnumC807780VmS;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.hyper.Hyper;
import com.ss.android.ugc.aweme.legoImp.task.MemoryCollector;
import com.ss.android.ugc.aweme.memory.GMTManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class MemoryMonitorTask implements C0CCZ {
    public EnumC807780VmS LL = EnumC807780VmS.LOCALTEST_MODE;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MemoryMonitorTask";
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

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        final MemoryCollector.MemoryCollectorParams memoryCollectorParams;
        C2407009bw.LIZ();
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
            this.LL = EnumC807780VmS.LOCALTEST_MODE;
        } else {
            this.LL = EnumC807780VmS.ONLINE_MODE;
        }
        if (C2162308dZ.LJI(context) && (memoryCollectorParams = (MemoryCollector.MemoryCollectorParams) C0C64.LJIILLIIL().LJJII(MemoryCollector.MemoryCollectorParams.class, null, "tt_memory_monitor_settings", true)) != null && memoryCollectorParams.enable) {
            new PthreadTimer("MemoryCollector").schedule(new C0W9W() { // from class: X.0VTh
                /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0275  */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
                /* JADX WARN: Type inference failed for: r1v4 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 770
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C798310VTh.LIZ():void");
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("MemoryCollector@747c.startMemoryReportIfNeed$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        LIZ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("MemoryCollector@747c.startMemoryReportIfNeed$1");
                }
            }, ((long) memoryCollectorParams.startReportMin) * 60 * 1000, ((long) memoryCollectorParams.intervalInMin) * 60 * 1000);
        }
        if (this.LL == EnumC807780VmS.ONLINE_MODE) {
            if (C807760VmQ.LIZIZ()) {
                return;
            }
            if (GMTManager.LIZ()) {
                try {
                    GMTManager.GMTSettingParams gMTSettingParams = (GMTManager.GMTSettingParams) SettingsManager.LIZLLL().LJIIIIZZ("gmt_settings", GMTManager.GMTSettingParams.class, null);
                    if (gMTSettingParams != null && gMTSettingParams.enable_on_release) {
                        int i = gMTSettingParams.gmt_config;
                        int i2 = gMTSettingParams.gmt_dump_threshold;
                        int i3 = gMTSettingParams.gmt_record_threshold;
                        GraphicMMTPlugin graphicMMTPluginLIZJ = GraphicMMTPlugin.LIZJ();
                        graphicMMTPluginLIZJ.LIZLLL(i);
                        graphicMMTPluginLIZJ.LJFF(C803080Ves.LIZ(context), "graphic");
                        graphicMMTPluginLIZJ.LJ(i2, i3);
                        graphicMMTPluginLIZJ.LJI();
                        C844470XAv.LIZ.getClass();
                        if (!C844470XAv.LJIJ) {
                            graphicMMTPluginLIZJ.LIZ(context);
                        }
                        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0VmO
                            @Override // com.bytedance.crash.ICrashCallback
                            public final void onCrash(CrashType crashType, String str, Thread thread) {
                                GraphicMMTPlugin.LIZJ().LIZIZ();
                            }
                        }, CrashType.JAVA);
                        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0VmP
                            @Override // com.bytedance.crash.ICrashCallback
                            public final void onCrash(CrashType crashType, String str, Thread thread) {
                                GraphicMMTPlugin.LIZJ().LIZIZ();
                            }
                        }, CrashType.NATIVE);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
        }
        try {
            if (this.LL == EnumC807780VmS.LOCALTEST_MODE) {
                if (C807760VmQ.LIZIZ() && C807760VmQ.LIZ()) {
                    C807760VmQ.LIZJ(context);
                    return;
                }
                if (C2080808De.LIZIZ()) {
                    try {
                        Hyper.init(C2080808De.LIZJ(), C2080808De.LIZ());
                        return;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                if (GMTManager.LIZ()) {
                    GMTManager.LIZIZ(context);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
