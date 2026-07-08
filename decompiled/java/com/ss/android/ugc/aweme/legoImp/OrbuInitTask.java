package com.ss.android.ugc.aweme.legoImp;

import X.C0CCZ;
import X.C0VZ0;
import X.C2429209fW;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.EnumC847160XLe;
import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionInitTask;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class OrbuInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "OrbuInitTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0XLc
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("OrbuInitTask@d763.run$1");
                    try {
                        RegionInitTask.LL.run(context);
                        ISandboxService iSandboxServiceLIZ = C2429209fW.LIZ();
                        if (iSandboxServiceLIZ != null) {
                            iSandboxServiceLIZ.LIZIZ(EnumC847160XLe.COLD_BOOT);
                            iSandboxServiceLIZ.LIZ(context);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OrbuInitTask@d763.run$1");
                }
            });
            return;
        }
        RegionInitTask.LL.run(context);
        ISandboxService iSandboxServiceLIZ = C2429209fW.LIZ();
        if (iSandboxServiceLIZ == null) {
            return;
        }
        iSandboxServiceLIZ.LIZIZ(EnumC847160XLe.COLD_BOOT);
        iSandboxServiceLIZ.LIZ(context);
    }
}
