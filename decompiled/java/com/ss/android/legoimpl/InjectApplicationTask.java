package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0CQU;
import X.C0VU1;
import X.C0VZ0;
import X.C0X35;
import X.C0X4M;
import X.C1BWV;
import X.C1BWW;
import X.C1BWX;
import X.C1BWZ;
import X.C2354709Kn;
import X.C2405409bg;
import X.C844470XAv;
import X.C848140XOy;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20234614Fk
public class InjectApplicationTask implements C0CCZ, InterfaceC799590VYf {
    public final C1BWW LL;
    public final AppBuildConfig LLILLJJLI;
    public final Application LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InjectApplicationTask";
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

    public InjectApplicationTask() {
        C1BWX c1bwx = C848140XOy.LIZ;
        this.LL = c1bwx.LIZIZ;
        this.LLILLL = c1bwx.LIZJ;
        this.LLILLJJLI = c1bwx.LIZ;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LIZ(this.LLILLL, this.LLILLJJLI, this.LL);
    }

    public static void LIZ(Application application, AppBuildConfig appBuildConfig, C1BWW c1bww) {
        synchronized (InjectApplicationTask.class) {
            try {
                if (!C0X35.LJIIL("cold_boot_injectApplication")) {
                    return;
                }
                application.getClass();
                C2354709Kn.LIZ = application;
                C0X35.LIZ("application_injectapplication_appcontextmanageriniter", false);
                C1BWZ.LIZ.getClass();
                C1BWZ.LIZ(application, appBuildConfig);
                C0X35.LJIIJJI("application_injectapplication_appcontextmanageriniter", false);
                appBuildConfig.LJIIL();
                C2405409bg.LIZ = "disabled";
                C0CQU c0cqu = C844470XAv.LJIIIIZZ;
                c0cqu.LIZ = "api-va.tiktokv.com";
                c0cqu.LIZJ = "ichannel-va.tiktokv.com";
                c0cqu.LIZIZ = "api-va.tiktokv.com";
                c0cqu.LIZLLL = "widget-va.tiktokv.com";
                C0X4M.LIZ();
                C1BWV.LIZ(application);
                AppLog.setSwitchToBdtracker(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
