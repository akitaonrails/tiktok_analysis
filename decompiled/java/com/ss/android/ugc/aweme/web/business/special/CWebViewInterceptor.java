package com.ss.android.ugc.aweme.web.business.special;

import X.C01GW;
import X.C080U;
import X.C0WZX;
import X.C0X52;
import X.C0X8N;
import X.C0X9S;
import X.C1022820ciu;
import X.C1035880d3y;
import X.C123100dR;
import X.C1AF0;
import X.C2184171Adz;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import X.C839620Wwi;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC837580WtQ;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class CWebViewInterceptor {
    public static String LIZ;
    public static String LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(288));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(289));

    public interface Api {
        @InterfaceC1501160pAQ
        @InterfaceC1501310pAf({"x-tt-dataflow-id: 671088642"})
        C0X9S<String> getResponse(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);
    }

    @C0X8N
    public interface ApiV2 {
        @InterfaceC1501160pAQ("https://securepubads.g.doubleclick.net/{path}")
        @InterfaceC837580WtQ(671088642)
        C0X9S<String> getResponse(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC2175608fi Map<String, String> map);
    }

    public static String LIZ(String str) {
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            if (!a0.LJJIIZI(lowerCase, "js", false) && !a0.LJJIIZI(lowerCase, "application/javascript", false) && !a0.LJJIIZI(lowerCase, "javascript", false)) {
                String str2 = "text/css";
                if (!u.LJIIZILJ(lowerCase, "text/css", false) && !u.LJIIZILJ(lowerCase, "css", false)) {
                    str2 = "text/html";
                    if (!a0.LJJIIZI(lowerCase, "text/html", false) && !a0.LJJIIZI(lowerCase, "html", false)) {
                        if (a0.LJJIIZI(lowerCase, "image", false)) {
                            int iLJJJ = a0.LJJJ(lowerCase, ";", 0, false, 6);
                            if (iLJJJ >= 0) {
                                return lowerCase.substring(0, iLJJJ);
                            }
                            return lowerCase;
                        }
                        if (!a0.LJJIIZI(lowerCase, "jpeg", false) && !a0.LJJIIZI(lowerCase, "jpg", false)) {
                            if (a0.LJJIIZI(lowerCase, "png", false)) {
                                return "image/png";
                            }
                            if (a0.LJJIIZI(lowerCase, "gif", false)) {
                                return "image/gif";
                            }
                            if (a0.LJJIIZI(lowerCase, "woff", false)) {
                                return "font/woff";
                            }
                            if (a0.LJJIIZI(lowerCase, "svg", false)) {
                                return "image/svg+xml";
                            }
                            if (a0.LJJIIZI(lowerCase, ".ttf", false)) {
                                return "font/ttf";
                            }
                            int iLJJJ2 = a0.LJJJ(lowerCase, ";", 0, false, 6);
                            if (iLJJJ2 < 0) {
                                return lowerCase;
                            }
                            return lowerCase.substring(0, iLJJJ2);
                        }
                        return "image/jpeg";
                    }
                }
                return str2;
            }
            return "application/x-javascript";
        }
        return null;
    }

    public static final void LIZJ(C1035880d3y c1035880d3y) {
        String creativeIdStr;
        String logExtra;
        LIZIZ = LIZ;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
            creativeIdStr = "";
        }
        AwemeRawAd awemeRawAd2 = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("landing_ad", "adx_ad_load_success", creativeIdStr, logExtra, null);
        c1022820ciuLJ.LIZIZ(LIZ, "web_url");
        c1022820ciuLJ.LJII();
    }

    public static WebResourceResponse LIZIZ(WebResourceRequest webResourceRequest, C1035880d3y c1035880d3y) throws Throwable {
        C0X52<String> c0x52Execute;
        String str;
        if (webResourceRequest.getUrl() == null) {
            return null;
        }
        String string = webResourceRequest.getUrl().toString();
        if (a0.LJJIIZI(string, "https://securepubads.g.doubleclick.net/gampad/ads", false)) {
            boolean zLIZ = true;
            try {
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("modify_xrw", true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
                if (zLIZ) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String value = null;
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        if (Intrinsics.LJFF(entry.getKey(), "origin")) {
                            value = entry.getValue();
                        }
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), string, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKOgC3C222WArnBoRcpM7dxMxsp7Ac0Si0Fkhgk=", null));
                    if (strLLIZ != null && C123100dR.LIZ(strLLIZ)) {
                        linkedHashMap.put("cookie", strLLIZ);
                    }
                    if (!C839620Wwi.LIZIZ) {
                        c0x52Execute = ((Api) LIZJ.getValue()).getResponse(u.LJJIFFI(a0.LJLIIIL(string).toString(), "https://securepubads.g.doubleclick.net/", "", false), linkedHashMap).execute();
                    } else {
                        c0x52Execute = ((ApiV2) LIZLLL.getValue()).getResponse(u.LJJIFFI(a0.LJLIIIL(string).toString(), "https://securepubads.g.doubleclick.net/", "", false), linkedHashMap).execute();
                    }
                    if (c0x52Execute.LIZJ()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                            linkedHashMap2.put(c080u.LIZ, c080u.LIZIZ);
                        }
                        String strLIZ = LIZ((String) linkedHashMap2.get("content-type"));
                        String str2 = (String) linkedHashMap2.get("content-encoding");
                        if (str2 == null) {
                            str2 = "utf-8";
                        }
                        WebResourceResponse webResourceResponse = new WebResourceResponse(strLIZ, str2, c0x52Execute.LIZ.LJ.in());
                        String str3 = value;
                        if (str3 != null) {
                            linkedHashMap2.put("Access-Control-Allow-Credentials", "true");
                            linkedHashMap2.put("Access-Control-Allow-Origin", str3);
                        }
                        String str4 = LIZ;
                        if (str4 != null && ((str = LIZIZ) == null || !Intrinsics.LJFF(str, str4))) {
                            LIZJ(c1035880d3y);
                        }
                        webResourceResponse.setResponseHeaders(linkedHashMap2);
                        return webResourceResponse;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
