package com.ss.android.ugc.aweme.legoImp;

import X.C04TD;
import X.C1BWL;
import X.C2389509Xx;
import android.content.Context;
import com.ss.android.common.util.INetWorkInject;

/* JADX INFO: loaded from: classes3.dex */
public final class NetWorkInjectImpl implements INetWorkInject {
    public static INetWorkInject LIZJ() {
        Object objLIZ = C04TD.LIZ(INetWorkInject.class, false);
        if (objLIZ != null) {
            return (INetWorkInject) objLIZ;
        }
        if (C04TD.L1 == null) {
            synchronized (INetWorkInject.class) {
                if (C04TD.L1 == null) {
                    C04TD.L1 = new NetWorkInjectImpl();
                }
            }
        }
        return C04TD.L1;
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final C2389509Xx LIZ() {
        return new C2389509Xx();
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final String LIZIZ() {
        return System.getProperty("http.agent");
    }

    @Override // com.ss.android.common.util.INetWorkInject
    public final Context getAppContext() {
        return C1BWL.LIZ();
    }
}
