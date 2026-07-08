package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.C2188811AlT;
import X.C792850V8h;
import X.C844470XAv;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URI;

/* JADX INFO: loaded from: classes14.dex */
public class UrlTransformInterceptorTTNet implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String str;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        String url = request.getUrl();
        String serviceType = request.getServiceType();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("debug_replace_http_to_https", true) && !TextUtils.isEmpty(url) && !url.contains("api.oston.io") && !url.contains("api.keepon.media") && !url.endsWith(".bemobi.com") && !url.contains(".ddt.telenor.io")) {
            if (SharePrefCache.inst().getUseHttps().LIZ().booleanValue() && !"vas_ad_track".equals(serviceType)) {
                if (!url.contains("https://") && !url.contains("http://")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(url);
                    url = C2188811AlT.LIZIZ(sbLIZ);
                } else if (url.contains("http://")) {
                    url = url.replace("http://", "https://");
                }
            }
            C0XLP c0xlpLJIIJ = C0XLQ.LJIIL(url).LJIIJ();
            C0XLQ c0xlqLIZLLL = c0xlpLJIIJ.LIZLLL();
            if (!url.contains("/passport/auth/login/") && !url.contains("/passport/auth/login_only/")) {
                if (url.contains("/service/settings/v2/") || url.contains("/service/settings/v3/")) {
                    url = LIZ(C844470XAv.LJIIIIZZ.LIZ, url);
                } else {
                    if (url.contains("push/get_service_addrs")) {
                        C0XLP c0xlpLJIIJ2 = c0xlqLIZLLL.LJIIJ();
                        c0xlpLJIIJ2.LJFF(C844470XAv.LJIIIIZZ.LIZ);
                        url = c0xlpLJIIJ2.LIZLLL().LJJ().toString();
                    }
                    if (url.contains("/service/settings/v2")) {
                        if (C792850V8h.LIZ()) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        c0xlpLJIIJ.LIZJ("googleServiceEnable", str);
                        url = c0xlpLJIIJ.LIZLLL().LJJ().toString();
                    }
                }
            } else if (!TextUtils.isEmpty(c0xlqLIZLLL.LJIILLIIL("access_token"))) {
                String strReplaceAll = c0xlqLIZLLL.LJIILLIIL("access_token").replaceAll(" ", "+");
                C0XLP c0xlpLJIIJ3 = c0xlqLIZLLL.LJIIJ();
                c0xlpLJIIJ3.LJIIIZ("access_token");
                c0xlpLJIIJ3.LIZJ("access_token", strReplaceAll);
                url = c0xlpLJIIJ3.LIZLLL().LJJ().toString();
            }
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ(url);
        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
    }

    public static String LIZ(String str, String str2) {
        if (str2.length() > 0 && str != null && str.length() > 0) {
            try {
                String host = URI.create(str2).getHost();
                if (host != null) {
                    str2 = str2.replace(host, str);
                    return str2;
                }
                return str2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str2;
    }
}
