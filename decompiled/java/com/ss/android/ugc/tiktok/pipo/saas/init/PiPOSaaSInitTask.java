package com.ss.android.ugc.tiktok.pipo.saas.init;

import X.C0CCZ;
import X.C0VZ0;
import X.C20102813lC;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pipo.saas.core.init.IPipoBusinessInitService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class PiPOSaaSInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PiPOSaaSInitTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        synchronized (C20102813lC.LIZ) {
            if (C20102813lC.LIZIZ) {
                return;
            }
            Iterator it2 = ServiceManager.get().getServices(IPipoBusinessInitService.class).iterator();
            while (it2.hasNext()) {
                ((IPipoBusinessInitService) it2.next()).init();
            }
            C20102813lC.LIZIZ = true;
        }
    }
}
