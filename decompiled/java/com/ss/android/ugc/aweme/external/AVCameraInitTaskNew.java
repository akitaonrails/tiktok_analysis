package com.ss.android.ugc.aweme.external;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.C104100aN;
import X.C1449450np1;
import X.C201955140j;
import X.C201967140v;
import X.C2428309fN;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC20234614Fk
public final class AVCameraInitTaskNew implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AVCameraInitTaskNew";
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
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "av_camera_task_downgrade", true, false) ? EnumC799870VZh.APP_BACKGROUND : C104100aN.LIZ().LJJIJ(new C2428309fN()) ? EnumC799870VZh.APP_BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C201955140j.LIZLLL(C201967140v.LIZIZ, "PreloadVESo", "execute AVCameraInitTaskNew");
        C1449450np1.LIZ.LIZ(SystemClock.uptimeMillis(), "camera_init_task_new_start");
        AVCameraInitTask.LL.LIZ(context);
    }
}
