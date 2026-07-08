package com.ss.android.ugc.aweme.legoImp.task;

import X.C04T7;
import X.C04TV;
import X.C08BO;
import X.C09UZ;
import X.C0CCZ;
import X.C0VU1;
import X.C0VYO;
import X.C0VZ0;
import X.C1E21;
import X.C2162308dZ;
import X.C2344809Gs;
import X.C827700WdU;
import X.C827710WdV;
import X.C827830Wdh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public class NpthExtentTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NpthExtentTask";
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
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.087d] */
    public static void LIZ(final Context context) {
        if (!C1E21.LIZIZ()) {
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0WdQ
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType, String str, Thread thread) {
                    Context context2 = context;
                    if (str != null) {
                        ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LIZIZ(context2, str);
                    }
                }
            }, CrashType.ALL);
        }
        ICrashCallback iCrashCallback = new ICrashCallback() { // from class: X.08aA
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("type", crashType.getName());
                C20684815ws.LJIILLIIL("app_crash", c2344009Gk.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("app_crash ");
                sbLIZ.append(crashType.getName());
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        CrashType crashType = CrashType.ALL;
        Npth.registerCrashCallback(iCrashCallback, crashType);
        C2344809Gs.LJ("NpthTask");
        Thread.setDefaultUncaughtExceptionHandler(new C08BO(Thread.getDefaultUncaughtExceptionHandler()));
        ConfigManager configManager = Npth.getConfigManager();
        LauncherServiceImpl.LIZLLL().isDebug();
        configManager.setDebugMode(false);
        Npth.addAttachUserData(new C827830Wdh(context, new AttachUserData() { // from class: X.087d
            @Override // com.bytedance.crash.AttachUserData
            public final Map<? extends String, ? extends String> getUserData(CrashType crashType2) {
                return null;
            }
        }), crashType);
        if (!C1E21.LIZIZ()) {
            final ICrashReportService iCrashReportServiceProvideErrorReporter = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter();
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0WdT
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType2, String str, Thread thread) {
                    iCrashReportServiceProvideErrorReporter.report(2);
                }
            }, CrashType.NATIVE);
            Npth.registerCrashCallback(new ICrashCallback() { // from class: X.0WdS
                @Override // com.bytedance.crash.ICrashCallback
                public final void onCrash(CrashType crashType2, String str, Thread thread) {
                    ICrashReportService iCrashReportService = iCrashReportServiceProvideErrorReporter;
                    if (str != null && str.contains("OutOfMemoryError")) {
                        iCrashReportService.report(1);
                    } else {
                        iCrashReportService.report(3);
                    }
                }
            }, CrashType.JAVA);
            new AddInstalledModulesInfoTask().run(context);
            final C04T7 c04t7 = new C04T7();
            C09UZ.LIZ(new Runnable() { // from class: X.0WdO
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveVersionInfoTask@c83e.run$1");
                    try {
                        final C04T7 c04t72 = c04t7;
                        Npth.addAttachUserData(new AttachUserData() { // from class: X.0WdP
                            @Override // com.bytedance.crash.AttachUserData
                            public final Map<? extends String, ? extends String> getUserData(CrashType crashType2) {
                                Object value = c04t72.LIZ.getValue();
                                if (value == null) {
                                    value = "";
                                }
                                return C2097908Jt.LIZJ(new Pair("live_sdk_version", value));
                            }
                        }, CrashType.ALL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveVersionInfoTask@c83e.run$1");
                }
            });
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter().addCrashCustomTagListener(new ICrashCustomTagListener() { // from class: X.0WdR
                @Override // com.ss.android.ugc.aweme.services.performance.ICrashCustomTagListener
                public final void setCustomTag(String str, String str2) {
                    HashMap map = new HashMap();
                    map.put(str, str2);
                    Npth.addTags(map);
                }
            });
        }
        C04TV.LIZIZ.LIZ();
        Npth.customActivityName(new C0VYO());
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C2162308dZ.LIZ(context).contains("miniapp")) {
            return;
        }
        C827710WdV.LIZ.getClass();
        ReentrantLock reentrantLock = C827700WdU.LIZ;
        reentrantLock.lock();
        try {
            LIZ(context);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C827710WdV.LIZ.getClass();
            C827700WdU.LIZ.unlock();
            throw th;
        }
    }
}
