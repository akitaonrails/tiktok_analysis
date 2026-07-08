package com.ss.android.ugc.aweme.appsflyer;

import X.C0PEM;
import X.C0WVN;
import X.C10US;
import X.C10UV;
import X.C10UW;
import X.C19260410Ws;
import X.C2296808zG;
import X.C23250099c;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.utils.OnBoardingStrategyData;

/* JADX INFO: loaded from: classes29.dex */
public final class AppsflyerImpl implements IAppsflyerApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void LIZ() {
        C10US c10us = C10UW.LIZ.LIZLLL;
        if (c10us != null) {
            c10us.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final String LIZIZ() {
        C10UV.LIZ.getClass();
        OnBoardingStrategyData onBoardingStrategyData = C10UV.LIZJ;
        if (onBoardingStrategyData != null) {
            return onBoardingStrategyData.defaultUrl;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final String LIZJ() {
        C19260410Ws.LIZ.getClass();
        return C19260410Ws.LIZIZ.getString("preinstall_channel", "");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void LIZLLL() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0WVN(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final String LJ() {
        C10UV.LIZ.getClass();
        return C10UV.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final String LJFF() {
        C10UV.LIZ.getClass();
        return C10UV.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final String LJI() {
        C19260410Ws.LIZ.getClass();
        return C19260410Ws.LIZIZ.getString("preinstall_campaign", "");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final boolean LJII() {
        C19260410Ws.LIZ.getClass();
        return C19260410Ws.LJIIJ || !C19260410Ws.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final String LJIIIIZZ() {
        C10UV.LIZ.getClass();
        OnBoardingStrategyData onBoardingStrategyData = C10UV.LIZJ;
        if (onBoardingStrategyData != null) {
            return onBoardingStrategyData.ecommUrl;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    public final void LJIIIZ() {
        C19260410Ws.LIZ.getClass();
        C19260410Ws.LJIIJJI = true;
        C19260410Ws.LJIILIIL();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:61|(2:55|10)|(3:65|11|(1:13))|59|27|41|(1:43)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIJ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl.LJIIJ():java.lang.String");
    }
}
