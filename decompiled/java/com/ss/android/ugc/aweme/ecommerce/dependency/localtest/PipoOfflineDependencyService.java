package com.ss.android.ugc.aweme.ecommerce.dependency.localtest;

import X.C04TD;
import X.C1435105jZ;
import X.InterfaceC1904907d9;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPipoOfflineService;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes3.dex */
public final class PipoOfflineDependencyService implements IPipoOfflineDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService
    public InterfaceC1904907d9 getNetworkInterceptor() {
        IPipoOfflineService iPipoOfflineService = (IPipoOfflineService) PluggableExtentionKt.pluggableSpi$default(IPipoOfflineService.class, false, false, false, 14, null);
        if (iPipoOfflineService != null) {
            iPipoOfflineService.getNetworkInterceptor();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService
    public void postPipoCashierShowWindowLaterEvent() {
        EventBus.LIZLLL().LJIILL(new C1435105jZ(null));
    }

    public static IPipoOfflineDependencyService createIPipoOfflineDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPipoOfflineDependencyService.class, z);
        if (objLIZ != null) {
            return (IPipoOfflineDependencyService) objLIZ;
        }
        if (C04TD.C == null) {
            synchronized (IPipoOfflineDependencyService.class) {
                if (C04TD.C == null) {
                    C04TD.C = new PipoOfflineDependencyService();
                }
            }
        }
        return C04TD.C;
    }
}
