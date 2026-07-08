package com.ss.android.legoimpl;

import X.C08Q0;
import X.C0CCZ;
import X.C0VZ0;
import X.C0W87;
import X.C0X35;
import X.C1BWL;
import X.C20250514Ln;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes35.dex */
public class InitRewordTask implements C0CCZ {
    public static final AtomicBoolean LL = new AtomicBoolean(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitRewordTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return C08Q0.LIZIZ(C1BWL.LIZ(), 0, "optimize_i18n") == 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    public static void LIZ(Context context) {
        synchronized (InitRewordTask.class) {
            try {
                if (LL.compareAndSet(false, true)) {
                    C0X35.LIZ("application_initbefore_part1_updatelocal", false);
                    IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
                    if (iUnKnownOwnershipBusinessOuterService != null) {
                        iUnKnownOwnershipBusinessOuterService.LJJIIJ(context);
                    }
                    C20250514Ln.LIZ.getClass();
                    C20250514Ln.LIZIZ(context);
                    C0W87.LIZ.getClass();
                    C0W87.LIZ(context);
                    C0X35.LJIIJJI("application_initbefore_part1_updatelocal", false);
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
