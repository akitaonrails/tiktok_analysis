package com.ss.android.ugc.aweme.global.config.settings;

import X.C2194051Atv;
import X.C2194081Aty;
import X.InterfaceC2194071Atx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public final class SettingsManagerProxy {
    public final C2194051Atv settingManager;

    public Gson getGson() {
        return this.settingManager.LIZLLL;
    }

    public void notifySettingsChange() {
        this.settingManager.LIZ();
    }

    public SettingsManagerProxy() {
        this.settingManager = new C2194051Atv();
    }

    public static SettingsManagerProxy inst() {
        return C2194081Aty.LIZ;
    }

    public void removeSettingsWatcher(InterfaceC2194071Atx interfaceC2194071Atx) {
        C2194051Atv c2194051Atv = this.settingManager;
        synchronized (c2194051Atv.LIZ) {
            try {
                c2194051Atv.LIZIZ.remove(interfaceC2194071Atx);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void registerSettingsWatcher(final InterfaceC2194071Atx interfaceC2194071Atx, boolean z) {
        C2194051Atv c2194051Atv = this.settingManager;
        synchronized (c2194051Atv.LIZ) {
            try {
                CopyOnWriteArrayList<InterfaceC2194071Atx> copyOnWriteArrayList = c2194051Atv.LIZIZ;
                if (z) {
                    interfaceC2194071Atx = new InterfaceC2194071Atx(interfaceC2194071Atx) { // from class: X.1Atw
                        public final InterfaceC2194071Atx LL;

                        {
                            this.LL = interfaceC2194071Atx;
                        }

                        @Override // X.InterfaceC2194071Atx
                        public final void LIZ(IESSettingsProxy iESSettingsProxy) {
                            InterfaceC2194071Atx interfaceC2194071Atx2 = this.LL;
                            if (interfaceC2194071Atx2 != null) {
                                interfaceC2194071Atx2.LIZ(iESSettingsProxy);
                            }
                        }
                    };
                }
                copyOnWriteArrayList.add(interfaceC2194071Atx);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
