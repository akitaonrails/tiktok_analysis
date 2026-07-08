package com.ss.android.ugc.aweme.legoImp;

import X.C04TD;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.EcomArchServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomArchService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EcommerceLazyInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "EcommerceLazyInitTask";
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
        IEcomArchService iEcomArchService;
        ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).onBootFinish();
        Object objLIZ = C04TD.LIZ(IEcomArchService.class, false);
        if (objLIZ != null) {
            iEcomArchService = (IEcomArchService) objLIZ;
        } else {
            if (C04TD.f106Y == null) {
                synchronized (IEcomArchService.class) {
                    if (C04TD.f106Y == null) {
                        C04TD.f106Y = new EcomArchServiceImpl();
                    }
                }
            }
            iEcomArchService = C04TD.f106Y;
        }
        iEcomArchService.onBootFinish();
    }
}
