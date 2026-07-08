package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils;

import X.InterfaceC1763090vyt;
import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultCommonUtilsDependencyService implements ICommonUtilsDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService
    public boolean openRouterWithParam(Activity activity, String str, Bundle bundle) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService
    public InterfaceC1763090vyt getConfigurationChangedManager() {
        return new InterfaceC1763090vyt() { // from class: X.0ydF
            @Override // X.InterfaceC1763090vyt
            public final void LIZ(C19EG c19eg, InterfaceC1766040w3e interfaceC1766040w3e) {
            }

            @Override // X.InterfaceC1763090vyt
            public final void LIZIZ(InterfaceC1766040w3e interfaceC1766040w3e) {
            }
        };
    }
}
