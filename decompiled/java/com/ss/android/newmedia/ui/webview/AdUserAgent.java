package com.ss.android.newmedia.ui.webview;

import X.C1388190mED;
import X.C1545860qKW;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C2222691Bz1;
import X.C786410Ut5;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.service.IAdUserAgent;
import com.ss.android.ugc.aweme.web.service.IAdUserAgentAppDiffProtocol;
import java.util.Locale;

/* JADX INFO: loaded from: classes24.dex */
public final class AdUserAgent implements IAdUserAgent {
    public String LIZ;
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.web.service.IAdUserAgent
    public final String LIZ(Context context, WebView webView, int i) {
        String strF3;
        String str;
        Activity activityLIZ;
        String strLIZIZ;
        if (!C2093608Ic.LJ(this.LIZ)) {
            str = this.LIZ;
        } else {
            try {
                strF3 = C786410Ut5.F3(context);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strF3 = null;
            }
            this.LIZ = strF3;
            if (C2093608Ic.LJ(strF3) && !this.LIZIZ && webView == null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                this.LIZIZ = true;
                try {
                    WebView webView2 = new WebView(activityLIZ);
                    this.LIZ = webView2.getSettings().getUserAgentString();
                    webView2.destroy();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            str = this.LIZ;
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        if (i == 2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            IAdUserAgentAppDiffProtocol.LIZ.getClass();
            IAdUserAgentAppDiffProtocol value = C1545860qKW.LIZIZ.getValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(' ');
            sbLIZ3.append("musical_ly");
            sbLIZ3.append('_');
            sbLIZ3.append(C2213981Bky.LIZIZ.LIZJ());
            sbLIZ2.append(value.LIZ(C2188811AlT.LIZIZ(sbLIZ3)));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (i == 1) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("");
            sbLIZ4.append(' ');
            sbLIZ4.append("musical_ly");
            sbLIZ4.append('_');
            C844470XAv.LIZ.getClass();
            sbLIZ4.append(C844470XAv.LIZJ());
            sbLIZ4.append(" JsSdk/1.0 NetType/");
            sbLIZ4.append(C786410Ut5.c3(C844470XAv.LIZ()).toUpperCase(Locale.ROOT));
            sbLIZ4.append(" Channel/");
            sbLIZ4.append(C844470XAv.LJIILL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            Locale localeLJII = ((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJII();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ2);
            sbLIZ5.append(" ByteLocale/");
            sbLIZ5.append(localeLJII.toLanguageTag());
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLIZIZ3);
            sbLIZ6.append(" Region/");
            sbLIZ6.append(C2222691Bz1.LIZIZ());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("");
            sbLIZ7.append(' ');
            sbLIZ7.append("musical_ly");
            sbLIZ7.append('_');
            C844470XAv.LIZ.getClass();
            sbLIZ7.append(C844470XAv.LIZJ());
            sbLIZ7.append(" JsSdk/1.0 NetType/");
            sbLIZ7.append(C786410Ut5.c3(C844470XAv.LIZ()).toUpperCase(Locale.ROOT));
            sbLIZ7.append(" Channel/");
            sbLIZ7.append(C844470XAv.LJIILL);
            sbLIZ7.append(" AppName/");
            sbLIZ7.append("musical_ly");
            sbLIZ7.append(" app_version/");
            sbLIZ7.append(C844470XAv.LIZJ());
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
            Locale localeLJII2 = ((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LJII();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(strLIZIZ4);
            sbLIZ8.append(" ByteLocale/");
            sbLIZ8.append(localeLJII2.toLanguageTag());
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ8);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ5);
            sbLIZ9.append(" ByteFullLocale/");
            sbLIZ9.append(((ICrossPlatformLegacyService) ServiceManager.get().getService(ICrossPlatformLegacyService.class)).LIZ());
            String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ9);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(strLIZIZ6);
            sbLIZ10.append(" Region/");
            sbLIZ10.append(C2222691Bz1.LIZIZ());
            String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ10);
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append(strLIZIZ7);
            sbLIZ11.append(" AppId/");
            sbLIZ11.append(1233);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
