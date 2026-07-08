package com.ss.android.ugc.aweme.ecommerce.dependency.apm;

import X.AbstractC794590VEz;
import X.C04TD;
import X.C0VG0;
import X.C793770VBv;
import X.C794670VFh;
import X.C794740VFo;
import X.C794780VFs;
import X.C794790VFt;
import X.C794830VFx;
import X.C794850VFz;
import X.EnumC794690VFj;
import X.EnumC794730VFn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class ApmDependencyService implements IApmDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public String newNetworkTraceparent() {
        try {
            AbstractC794590VEz abstractC794590VEzLIZ = C0VG0.LIZ != null ? C794670VFh.LIZ("test", EnumC794690VFj.BATCH, EnumC794730VFn.PARALLEL_WRAPPER_MODE, false, new C794780VFs(C0VG0.LIZ), null) : C794670VFh.LIZ("test", EnumC794690VFj.BATCH, EnumC794730VFn.PARALLEL_WRAPPER_MODE, false, new C794790VFt(C794830VFx.LIZIZ()), null);
            if (abstractC794590VEzLIZ != null) {
                abstractC794590VEzLIZ.start();
            }
            if (abstractC794590VEzLIZ == null) {
                return "";
            }
            C794740VFo c794740VFoLIZJ = abstractC794590VEzLIZ.LIZJ();
            String strLIZIZ = c794740VFoLIZJ.LIZIZ();
            c794740VFoLIZJ.LJI();
            return strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public String newTrackingTraceparent() {
        String strLIZIZ;
        try {
            AbstractC794590VEz abstractC794590VEzLIZ = C794670VFh.LIZ("ec_event_tracking", EnumC794690VFj.BATCH, EnumC794730VFn.PARALLEL_WRAPPER_MODE, false, C794850VFz.LIZ, null);
            if (abstractC794590VEzLIZ != null) {
                abstractC794590VEzLIZ.start();
            }
            if (abstractC794590VEzLIZ != null) {
                C794740VFo c794740VFoLIZJ = abstractC794590VEzLIZ.LIZJ();
                strLIZIZ = c794740VFoLIZJ.LIZIZ();
                c794740VFoLIZJ.LJI();
            } else {
                strLIZIZ = "";
            }
            C0VG0.LIZ = strLIZIZ;
            return strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static IApmDependencyService createIApmDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IApmDependencyService.class, z);
        if (objLIZ != null) {
            return (IApmDependencyService) objLIZ;
        }
        if (C04TD.LLZZJLIL == null) {
            synchronized (IApmDependencyService.class) {
                if (C04TD.LLZZJLIL == null) {
                    C04TD.LLZZJLIL = new ApmDependencyService();
                }
            }
        }
        return C04TD.LLZZJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C793770VBv.LJIIJJI(str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }
}
