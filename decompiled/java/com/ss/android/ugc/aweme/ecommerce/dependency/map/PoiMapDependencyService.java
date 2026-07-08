package com.ss.android.ugc.aweme.ecommerce.dependency.map;

import X.C03UB;
import X.C04TD;
import X.C1180740gpc;
import X.C1203050hPb;
import X.InterfaceC1176690gj5;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapDependencyService implements IPoiMapDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService
    public boolean googleServiceEnable() {
        return ((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).googleServiceEnable();
    }

    public static IPoiMapDependencyService createIPoiMapDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IPoiMapDependencyService.class, z);
        if (objLIZ != null) {
            return (IPoiMapDependencyService) objLIZ;
        }
        if (C04TD.F == null) {
            synchronized (IPoiMapDependencyService.class) {
                if (C04TD.F == null) {
                    C04TD.F = new PoiMapDependencyService();
                }
            }
        }
        return C04TD.F;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService
    public C03UB getIMapManager(C1203050hPb c1203050hPb) {
        C1180740gpc.LIZ.getClass();
        final InterfaceC1176690gj5 iMapManager = C1180740gpc.LIZ().getIMapManager(c1203050hPb);
        return new C03UB() { // from class: X.0hMd
            @Override // X.C03UB
            public final Fragment LIZIZ() {
                return iMapManager.LIZIZ();
            }

            @Override // X.C03UB
            public final void X(Function1<? super InterfaceC1747020vYy, Unit> function1) {
                iMapManager.X(new AwS597S0100000_18(function1, (Function1<? super InterfaceC1747020vYy, Unit>) 69));
            }

            @Override // X.C03UB
            public final View LIZ(Context context, LifecycleOwner lifecycleOwner) {
                return iMapManager.LIZ(context, lifecycleOwner);
            }
        };
    }
}
