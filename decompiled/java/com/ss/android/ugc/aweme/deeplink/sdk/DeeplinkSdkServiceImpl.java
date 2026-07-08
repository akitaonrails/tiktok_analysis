package com.ss.android.ugc.aweme.deeplink.sdk;

import X.C10YW;
import X.C1867450yhD;
import X.C19264710Yj;
import X.C1936607iG;
import X.C19EG;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class DeeplinkSdkServiceImpl implements IDeeplinkSdkService {
    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService
    public final void LIZJ() {
        C19264710Yj.LIZ = new C10YW() { // from class: X.08Dm
            @Override // X.C10YW
            public final void LIZIZ() {
            }

            @Override // X.C10YW
            public final void LIZJ() {
            }

            @Override // X.C10YW
            public final void LIZLLL() {
            }

            @Override // X.C10YW
            public final void LJ() {
            }

            @Override // X.C10YW
            public final void LIZ(String str, Map<String, Object> map) {
                if (map != null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            c2344009Gk.LJFF(key, (String) value);
                        } else if (value instanceof Long) {
                            c2344009Gk.LIZLLL(((Number) value).longValue(), key);
                        } else if (value instanceof Integer) {
                            c2344009Gk.LIZJ(((Number) value).intValue(), key);
                        } else if (value instanceof Double) {
                            c2344009Gk.LIZ(((Number) value).doubleValue(), key);
                        } else if (value instanceof Float) {
                            c2344009Gk.LIZIZ(((Number) value).floatValue(), key);
                        } else {
                            c2344009Gk.LJ(value, key);
                        }
                    }
                    C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService
    public final boolean LIZLLL() {
        return ((Boolean) C1936607iG.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService
    public final boolean LJ() {
        return ((Boolean) C1936607iG.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService
    public final void LIZ(String str) {
        C1867450yhD.LIZ.getClass();
        C1867450yhD.LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService
    public final boolean LJFF(C19EG c19eg) {
        return c19eg instanceof DeepLinkActivityV2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.app.Activity r18, android.content.Intent r19, boolean r20, X.C1962707mT r21) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.sdk.DeeplinkSdkServiceImpl.LIZIZ(android.app.Activity, android.content.Intent, boolean, X.07mT):void");
    }
}
