package com.ss.android.ugc.aweme.ecommerce.search;

import X.C04TD;
import X.C0QES;
import X.C1205704nf;
import X.C1507790pL7;
import X.C315220CXg;
import X.C675940QfI;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EComModelSearchDependencyService implements IEComModelSearchDependencyService {
    public static IEComModelSearchDependencyService LJ() {
        Object objLIZ = C04TD.LIZ(IEComModelSearchDependencyService.class, false);
        if (objLIZ != null) {
            return (IEComModelSearchDependencyService) objLIZ;
        }
        if (C04TD.W == null) {
            synchronized (IEComModelSearchDependencyService.class) {
                if (C04TD.W == null) {
                    C04TD.W = new EComModelSearchDependencyService();
                }
            }
        }
        return C04TD.W;
    }

    @Override // com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService
    public final Long LIZJ() {
        return C0QES.LIZ(C0QES.LIZ, null, true, 3);
    }

    @Override // com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService
    public final int getDeviceType() {
        return ((Number) C675940QfI.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService
    public final String LIZLLL() {
        IEcomSearchService iEcomSearchServiceLIZ = C315220CXg.LIZ();
        String paramByName = iEcomSearchServiceLIZ.getParamByName("ec_search_session_id");
        return paramByName == null ? iEcomSearchServiceLIZ.getParamByName("search_session_id") : paramByName;
    }

    @Override // com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService
    public final Object LIZ(AwS554S0100000_10 awS554S0100000_10, AFwS196S0000000_10 aFwS196S0000000_10) {
        if (C1205704nf.LIZ()) {
            return awS554S0100000_10.invoke();
        }
        aFwS196S0000000_10.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService
    public final void LIZIZ(String str, JSONObject jSONObject, String str2, PageFinder pageFinder) {
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LJ(str, jSONObject, str2, pageFinder);
    }
}
