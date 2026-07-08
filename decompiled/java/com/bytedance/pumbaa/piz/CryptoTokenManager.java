package com.bytedance.pumbaa.piz;

import X.C08GR;
import X.C092I;
import X.C2440509hL;
import X.C839950WxF;
import com.bytedance.pumbaa.piz.api.ITokenManager;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoTokenManager implements ITokenManager {
    @Override // com.bytedance.pumbaa.piz.api.ITokenManager
    public final C2440509hL LIZ(String str) throws JSONException {
        C08GR.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = C839950WxF.LIZ.LIZ(str, false);
        if (strLIZ != null) {
            C092I.LIZJ(3, 3, System.currentTimeMillis() - jCurrentTimeMillis);
            return new C2440509hL(strLIZ, null);
        }
        C092I.LIZJ(5, 3, System.currentTimeMillis() - jCurrentTimeMillis);
        return null;
    }
}
