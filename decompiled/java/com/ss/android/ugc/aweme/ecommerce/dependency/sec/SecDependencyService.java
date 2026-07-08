package com.ss.android.ugc.aweme.ecommerce.dependency.sec;

import X.C04TD;
import X.C149A;
import X.C854103Vj;
import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;

/* JADX INFO: loaded from: classes3.dex */
public final class SecDependencyService implements ISecDependencyService {
    public void initService() {
    }

    public static ISecDependencyService createISecDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISecDependencyService.class, z);
        if (objLIZ != null) {
            return (ISecDependencyService) objLIZ;
        }
        if (C04TD.Q == null) {
            synchronized (ISecDependencyService.class) {
                if (C04TD.Q == null) {
                    C04TD.Q = new SecDependencyService();
                }
            }
        }
        return C04TD.Q;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService
    public void popCaptcha(Activity activity, int i, final C854103Vj c854103Vj) {
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptcha(activity, i, new C149A() { // from class: X.04UJ
            @Override // X.C149A
            public final void LIZ() {
                c854103Vj.getClass();
            }

            @Override // X.C149A
            public final void LIZJ() {
                c854103Vj.getClass();
            }

            @Override // X.C149A
            public final void LIZLLL() {
                c854103Vj.getClass();
            }

            @Override // X.C149A
            public final void LIZIZ(int i2, boolean z) {
                c854103Vj.LIZ(z);
            }
        });
    }
}
