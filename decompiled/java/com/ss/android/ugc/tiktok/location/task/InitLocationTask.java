package com.ss.android.ugc.tiktok.location.task;

import X.C0BH8;
import X.C0CCZ;
import X.C0CN5;
import X.C0VZ0;
import X.C1150504el;
import X.C1BYV;
import X.C2344809Gs;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class InitLocationTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitLocationTask";
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
        return C0BH8.LIZ == 2 ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C0BH8.LIZ == 1) {
            C0CN5.LIZIZ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new Runnable() { // from class: X.1BYS
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InitLocationTask@350b.run$1");
                    try {
                        C1150504el.LIZ().LIZLLL("method_init_location_duration", false);
                        C2344809Gs.LJFF("InitLocationTask", "init location permission manager");
                        C1BYV.LIZ.LIZIZ();
                        C1150504el.LIZ().LJI("method_init_location_duration", false);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InitLocationTask@350b.run$1");
                }
            });
            return;
        }
        C1150504el.LIZ().LIZLLL("method_init_location_duration", false);
        C2344809Gs.LJFF("InitLocationTask", "init location permission manager");
        C1BYV.LIZ.LIZIZ();
        C1150504el.LIZ().LJI("method_init_location_duration", false);
    }
}
