package com.ss.android.ugc.aweme.legoImp.task.uitask;

import X.C07OX;
import X.C0CAU;
import X.C0CCZ;
import X.C0CD2;
import X.C0JAD;
import X.C0VU1;
import X.C0VZ0;
import X.C1220404q2;
import X.C1697600uHG;
import X.C1866440yfa;
import X.C282230B4j;
import X.C786410Ut5;
import X.C786640UtS;
import X.C799570VYd;
import X.EnumC1998307sD;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.legoimpl.InitAndInflaterTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.task.UltimateInflaterTask;
import com.ss.android.ugc.xtrace.IXtrace;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UIInitTask implements C0CCZ, InterfaceC799590VYf {
    public static final UIInitTask LL = new UIInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "UIInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C1866440yfa.LIZIZ.getValue()).booleanValue() ? 2 : 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int iLIZ;
        Method methodLIZIZ;
        IXtrace iXtrace;
        Method methodLIZIZ2;
        IXtrace iXtrace2;
        System.currentTimeMillis();
        if (context == null) {
            return;
        }
        if (!C0CAU.LIZ() && ((Boolean) C282230B4j.LIZ.getValue()).booleanValue()) {
            iLIZ = C786640UtS.LIZ();
        } else {
            iLIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (C07OX.LIZIZ()) {
            InitLegoInflate.LL.LIZ(context);
        }
        new TuxInitTask().run(context);
        if (((Boolean) C0CD2.LJJL.getValue()).booleanValue()) {
            ManufactureFix.LIZ.getClass();
            if (Intrinsics.LJFF(Build.MANUFACTURER, "Xiaomi")) {
                try {
                    IXtrace iXtrace3 = (IXtrace) PluggableExtentionKt.pluggableSpi$default(IXtrace.class, false, false, false, 14, null);
                    if (iXtrace3 != null && (methodLIZIZ = iXtrace3.LIZIZ(View.class, "getScreenAntiBurnEnabledNew", new Object[0])) != null) {
                        IXtrace iXtrace4 = (IXtrace) PluggableExtentionKt.pluggableSpi$default(IXtrace.class, false, false, false, 14, null);
                        if (iXtrace4 != null) {
                            iXtrace4.LIZ(EnumC1998307sD.MODE_REPLACE);
                        }
                        IXtrace iXtrace5 = (IXtrace) PluggableExtentionKt.pluggableSpi$default(IXtrace.class, false, false, false, 14, null);
                        if (iXtrace5 != null && Intrinsics.LJFF(iXtrace5.init(context), Boolean.TRUE) && (iXtrace = (IXtrace) PluggableExtentionKt.pluggableSpi$default(IXtrace.class, false, false, false, 14, null)) != null && (methodLIZIZ2 = iXtrace.LIZIZ(ManufactureFix.class, "getScreenAntiBurnEnabledNewProxy", View.class)) != null && (iXtrace2 = (IXtrace) PluggableExtentionKt.pluggableSpi$default(IXtrace.class, false, false, false, 14, null)) != null) {
                            iXtrace2.LJ(methodLIZIZ, methodLIZIZ2);
                        }
                    }
                } catch (NoSuchMethodException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        C0JAD.setIsOptOpen(((Boolean) C1220404q2.LIZ.getValue()).booleanValue());
        new InitAndInflaterTask().run(context);
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Rtj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UIInitTask@64e3.preloadLayoutOnWorkerThread$1");
                try {
                    if (((Boolean) C1251404v2.LIZIZ.getValue()).booleanValue()) {
                        C710340Rtg.LIZIZ("");
                    }
                    if (((Boolean) C1251404v2.LIZLLL.getValue()).booleanValue()) {
                        boolean z = C710360Rti.LIZ;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UIInitTask@64e3.preloadLayoutOnWorkerThread$1");
            }
        });
        new UltimateInflaterTask().run(context);
        if (((Boolean) C0CD2.LJJJLL.getValue()).booleanValue()) {
            Npth.addTag("initTuxTypeface", "start");
            C1697600uHG.LIZIZ(context);
            Npth.addTag("initTuxTypeface", "done");
        }
        C786640UtS.LIZIZ(iLIZ);
    }
}
