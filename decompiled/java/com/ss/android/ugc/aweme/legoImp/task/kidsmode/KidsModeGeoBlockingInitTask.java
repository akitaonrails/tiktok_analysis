package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0CCZ;
import X.C0VZ0;
import X.C1515120pWw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.geoblocking.interceptor.GeoBlockInterceptor;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsModeGeoBlockingInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeGeoBlockingInitTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        GeoBlockInterceptor geoBlockInterceptorLIZ;
        IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
        if (iGeoBlockingService != null) {
            geoBlockInterceptorLIZ = iGeoBlockingService.LIZ();
        } else {
            geoBlockInterceptorLIZ = null;
        }
        C1515120pWw.LIZIZ(geoBlockInterceptorLIZ);
    }
}
