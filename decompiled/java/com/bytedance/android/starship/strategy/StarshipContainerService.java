package com.bytedance.android.starship.strategy;

import X.C1306760k6s;
import X.EnumC1306750k6r;
import X.InterfaceC1306890k75;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipContainerService implements IStarshipContainerService {
    public final ConcurrentHashMap<String, InterfaceC1306890k75> LIZ = new ConcurrentHashMap<>();

    @Override // com.bytedance.android.starship.strategy.IStarshipContainerService
    public final InterfaceC1306890k75 LIZ(EnumC1306750k6r enumC1306750k6r) {
        InterfaceC1306890k75 interfaceC1306890k75 = this.LIZ.get(enumC1306750k6r.getValue());
        if (interfaceC1306890k75 != null) {
            return interfaceC1306890k75;
        }
        synchronized (this.LIZ) {
            try {
                InterfaceC1306890k75 interfaceC1306890k752 = this.LIZ.get(enumC1306750k6r.getValue());
                if (interfaceC1306890k752 != null) {
                    return interfaceC1306890k752;
                }
                C1306760k6s c1306760k6s = new C1306760k6s(enumC1306750k6r);
                this.LIZ.put(enumC1306750k6r.getValue(), c1306760k6s);
                return c1306760k6s;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
