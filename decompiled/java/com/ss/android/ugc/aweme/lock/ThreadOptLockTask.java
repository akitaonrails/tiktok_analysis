package com.ss.android.ugc.aweme.lock;

import X.C01GW;
import X.C08PL;
import X.C0CCZ;
import X.C0VZ0;
import X.C2112108Pf;
import X.C2195508iv;
import X.C2195608iw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.otis.resource.lock.LockNative;
import com.bytedance.otis.resource.lock.PriorityNative;
import com.bytedance.otis.resource.util.OtisNativeHandler;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.sysoptimizer.SysOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadOptLockTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ThreadOptLockTask";
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
        boolean z;
        C01GW c01gw = C2195508iv.LIZ;
        boolean z2 = true;
        if ((((Number) c01gw.getValue()).intValue() & 16) == 16) {
            OtisNativeHandler.LIZ.setDebugger(true);
            PriorityNative.start();
        }
        if ((((Number) c01gw.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        int iIntValue = ((Number) C2195608iw.LIZ.getValue()).intValue();
        if (iIntValue > 0) {
            if (SysOptimizer.loadOptimizerLibrary(context)) {
                try {
                    C2112108Pf c2112108Pf = new C2112108Pf();
                    c2112108Pf.LIZ = C08PL.SHARED.value;
                    c2112108Pf.LIZIZ = true;
                    ShadowHook.init(c2112108Pf.LIZ());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if ((((Number) C2195608iw.LIZ.getValue()).intValue() & 4) == 4) {
                linkedHashSet.add("com.facebook.imagepipeline.cache.CountingMemoryCache");
            }
            OtisNativeHandler.LIZ.setDebugger(z);
            C01GW c01gw2 = C2195508iv.LIZ;
            int iIntValue2 = ((Number) c01gw2.getValue()).intValue();
            int i = iIntValue & 3;
            if ((((Number) c01gw2.getValue()).intValue() & 8) != 8) {
                z2 = false;
            }
            int i2 = iIntValue2 & 3;
            if (i >= 0) {
                if ((i & 2) == 2 && linkedHashSet.isEmpty()) {
                    return;
                }
                LockNative.start(i, (String[]) linkedHashSet.toArray(new String[0]), z2, z, i2);
            }
        }
    }
}
