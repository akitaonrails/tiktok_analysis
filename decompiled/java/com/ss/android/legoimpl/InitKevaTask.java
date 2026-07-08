package com.ss.android.legoimpl;

import X.C08Q0;
import X.C0BEC;
import X.C0CCZ;
import X.C0VZ0;
import X.C0X35;
import X.C1519870peb;
import X.C309700CCa;
import X.C557050Lt1;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS84S0000000_4;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class InitKevaTask implements C0CCZ {
    public static final C557050Lt1 LL = new C557050Lt1(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitKevaTask";
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
        synchronized (InitKevaTask.class) {
            try {
                if (LL.LIZ(false, true)) {
                    C0X35.LIZ("application_init_keva", false);
                    C1519870peb.LIZ(context);
                    C0X35.LJFF = true;
                    if (C0BEC.LIZIZ(context)) {
                        ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIJL(new ARunnableS84S0000000_4(3));
                    }
                    if (C08Q0.LJ(context, "memory_process_quit_startup", false)) {
                        C309700CCa.LIZ();
                    }
                    C0X35.LJIIJJI("application_init_keva", false);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LIZ(context);
    }
}
