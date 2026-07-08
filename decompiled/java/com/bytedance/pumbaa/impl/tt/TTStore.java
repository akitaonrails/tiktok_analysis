package com.bytedance.pumbaa.impl.tt;

import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.base2.interfaces.IStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class TTStore implements IStore {
    public volatile Keva LIZ;

    public final void LIZIZ() {
        if (this.LIZ != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LIZ != null) {
                    return;
                }
                this.LIZ = Keva.getRepo("pumbaa_sdk");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IStore
    public final String getString() {
        String string;
        LIZIZ();
        Keva keva = this.LIZ;
        if (keva == null || (string = keva.getString("pumbaa_abnormal_timeout_state", null)) == null) {
            return null;
        }
        return string;
    }

    @Override // com.bytedance.pumbaa.base2.interfaces.IStore
    public final void LIZ(String str) {
        LIZIZ();
        Keva keva = this.LIZ;
        if (keva != null) {
            keva.storeString("pumbaa_abnormal_timeout_state", str);
        }
    }
}
