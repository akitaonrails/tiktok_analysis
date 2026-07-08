package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C0X35;
import X.C1BWX;
import X.C1BWY;
import X.C848140XOy;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20234614Fk
public class AppMonitorTask implements C0CCZ {
    public final AppBuildConfig LL;
    public final Application LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppMonitorTask";
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

    public AppMonitorTask() {
        C1BWX c1bwx = C848140XOy.LIZ;
        this.LLILLJJLI = c1bwx.LIZJ;
        this.LL = c1bwx.LIZ;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Application application = this.LLILLJJLI;
        AppBuildConfig appBuildConfig = this.LL;
        synchronized (AppMonitorTask.class) {
            try {
                if (!C0X35.LJIIL("cold_boot_initAppMonitor")) {
                    return;
                }
                C1BWY.LIZ.getClass();
                C1BWY.LIZ(application, appBuildConfig);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
