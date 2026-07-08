package com.ss.android.ugc.aweme.legoImp;

import X.C04TD;
import com.ss.android.ugc.aweme.login.ILoginProxy;
import com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginProxyImpl implements ILoginProxy {
    public static ILoginProxy LIZIZ() {
        Object objLIZ = C04TD.LIZ(ILoginProxy.class, false);
        if (objLIZ != null) {
            return (ILoginProxy) objLIZ;
        }
        if (C04TD.K1 == null) {
            synchronized (ILoginProxy.class) {
                if (C04TD.K1 == null) {
                    C04TD.K1 = new LoginProxyImpl();
                }
            }
        }
        return C04TD.K1;
    }

    @Override // com.ss.android.ugc.aweme.login.ILoginProxy
    public final I18nLoginActivityComponent LIZ() {
        return new I18nLoginActivityComponent();
    }
}
