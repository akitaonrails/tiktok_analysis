package com.ss.android.ugc.aweme.legoImp.task;

import X.C036E;
import X.C0C64;
import X.C0CCZ;
import X.C0CKL;
import X.C0VZ0;
import X.C1602860roS;
import X.C1866970ygR;
import X.C20237514Gn;
import X.C20237614Go;
import X.C20237714Gp;
import X.C2241008qG;
import X.C794240VDq;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AObjectS127S0000000_30;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.InitFoundationTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import java.lang.ref.WeakReference;
import java.util.List;
import jv6.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public final class TasksHolder {
    public static InitFoundationTask LIZ;
    public static C0CCZ LIZIZ;
    public static C0CCZ LIZJ;
    public static C0CCZ LIZLLL;

    /* JADX INFO: loaded from: classes31.dex */
    public static class AmeActivityResumeRun implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "TasksHolder$AmeActivityResumeRun";
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
            if (!((Boolean) C20237714Gp.LIZ.getValue()).booleanValue()) {
                C1602860roS c1602860roS = C1602860roS.LIZ;
                C1866970ygR c1866970ygR = new C1866970ygR();
                c1602860roS.getClass();
                if (!C1602860roS.LIZ(c1866970ygR)) {
                    return EnumC799870VZh.BOOT_FINISH;
                }
            }
            return EnumC799870VZh.MAIN;
        }

        public AmeActivityResumeRun(Activity activity) {
            new WeakReference(activity);
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "use_new_app_alert", true) == 0) {
                C844470XAv.LIZ.getClass();
                AppLog.activeUser(C844470XAv.LIZ());
            }
            C20237514Gn c20237514Gn = C20237514Gn.LIZIZ;
            c20237514Gn.getClass();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    for (int i = 0; i < c20237514Gn.LIZ.size(); i++) {
                        C20237614Go c20237614GoValueAt = c20237514Gn.LIZ.valueAt(i);
                        int iKeyAt = c20237514Gn.LIZ.keyAt(i);
                        if (c20237614GoValueAt != null && !c20237614GoValueAt.LIZ) {
                            if (c20237614GoValueAt.LIZJ == 3) {
                                c20237614GoValueAt.LIZ = true;
                                c20237614GoValueAt.LIZJ = 0;
                            } else if (System.currentTimeMillis() - c20237614GoValueAt.LIZIZ > (30000 >> r1)) {
                                c20237614GoValueAt.LIZJ++;
                                long jCurrentTimeMillis = System.currentTimeMillis() - c20237614GoValueAt.LIZIZ;
                                C2241008qG c2241008qG = new C2241008qG();
                                c2241008qG.LIZ.put("group_id", String.valueOf(iKeyAt));
                                c2241008qG.LIZ.put("fetch_url_retry_count", Integer.valueOf(c20237614GoValueAt.LIZJ));
                                c2241008qG.LIZ.put("time_interval", Long.valueOf(jCurrentTimeMillis));
                                C794240VDq.LIZJ("aweme_setting_retry_policy", c2241008qG.LJ());
                                c20237614GoValueAt.LIZLLL.LIZ();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static C0CCZ LIZ() {
        if (LIZIZ == null) {
            LIZIZ = C0CKL.LIZIZ.LIZ();
        }
        return LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.19Cs] */
    public static C0CCZ LIZIZ() {
        if (LIZ == null) {
            LIZ = new InitFoundationTask(new AObjectS127S0000000_30(1), new Function1() { // from class: X.19Cs
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Context contextCreateConfigurationContext = (Context) obj;
                    C21501719Ct.LIZ.getClass();
                    ICrashSdkApi iCrashSdkApi = C21501719Ct.LIZIZ;
                    if (iCrashSdkApi != null) {
                        iCrashSdkApi.LJIIZILJ(contextCreateConfigurationContext);
                    }
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
                    if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
                        contextCreateConfigurationContext = i18nServiceApi.LIZ().LIZJ(contextCreateConfigurationContext);
                    }
                    C20593115i5.LIZ.getClass();
                    C20595015iO.LIZ.getClass();
                    if (!C20595015iO.LIZJ() && contextCreateConfigurationContext != null && C1697630uHJ.LIZJ > 0.0f) {
                        float fLIZ = C1697630uHJ.LIZ();
                        float f = C1697630uHJ.LJ;
                        int i = (int) (f / fLIZ);
                        int i2 = (int) (C1697630uHJ.LJFF / fLIZ);
                        int i3 = (int) (C1697630uHJ.LIZLLL * (f / i));
                        Configuration configuration = new Configuration(contextCreateConfigurationContext.getResources().getConfiguration());
                        configuration.screenWidthDp = i;
                        configuration.screenHeightDp = i2;
                        configuration.smallestScreenWidthDp = i;
                        configuration.densityDpi = i3;
                        contextCreateConfigurationContext = contextCreateConfigurationContext.createConfigurationContext(configuration);
                    }
                    try {
                        a.LIZLLL(contextCreateConfigurationContext);
                        return contextCreateConfigurationContext;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return contextCreateConfigurationContext;
                    }
                }
            });
        }
        return LIZ;
    }
}
