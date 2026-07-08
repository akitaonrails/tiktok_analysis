package com.ss.android.ugc.aweme.impl;

import X.C04TD;
import X.C07OX;
import X.C1544660qIa;
import X.C1BR0;
import X.C1BR1;
import X.C1BRH;
import X.C1BRK;
import com.bytedance.ies.web.jsbridge2.IJsBridge2Config;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;

/* JADX INFO: loaded from: classes35.dex */
public class JsBridge2ConfigImpl implements IJsBridge2Config {
    public static IJsBridge2Config LIZLLL() {
        Object objLIZ = C04TD.LIZ(IJsBridge2Config.class, false);
        return objLIZ != null ? (IJsBridge2Config) objLIZ : new JsBridge2ConfigImpl();
    }

    @Override // com.bytedance.ies.web.jsbridge2.IJsBridge2Config
    public final C1BRK LIZ() {
        if (C07OX.LIZJ()) {
            return new C1544660qIa();
        }
        return null;
    }

    @Override // com.bytedance.ies.web.jsbridge2.IJsBridge2Config
    public final C1BRH LIZIZ() {
        if (C07OX.LIZJ()) {
            return new C1BR1();
        }
        return null;
    }

    @Override // com.bytedance.ies.web.jsbridge2.IJsBridge2Config
    public final C1BR0 LIZJ() {
        if (C07OX.LIZJ()) {
            return new JsBridge2PermissionConfigurator();
        }
        return null;
    }
}
