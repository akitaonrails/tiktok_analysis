package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.sysoptimizer.NativeBitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.NativeBitmapParam;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class NativeBitmapTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NativeBitmapTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            NativeBitmapParam nativeBitmapParam = (NativeBitmapParam) C0C64.LJIILLIIL().LJJII(NativeBitmapParam.class, null, "tiktok_native_bitmap", true);
            if (nativeBitmapParam != null && nativeBitmapParam.enable) {
                NativeBitmap.enable(context, nativeBitmapParam.check_interval, nativeBitmapParam.utilization, nativeBitmapParam.max_heap_size);
            } else {
                NativeBitmap.enable(context, 30000L, 0.7d, 402653184L);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
