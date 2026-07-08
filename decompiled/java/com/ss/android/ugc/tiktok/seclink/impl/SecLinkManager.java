package com.ss.android.ugc.tiktok.seclink.impl;

import X.C080U;
import X.C09S4;
import X.C0X9S;
import X.C1697810uHb;
import X.C1B2O;
import X.C1B2R;
import X.C1B2S;
import X.C1B2Y;
import X.C1EAV;
import X.C2198391B2f;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2198421B2i;
import X.InterfaceC2373709Rv;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkLocalConfig;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkSwitchSettings;
import com.zhiliaoapp.musically.R;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SecLinkManager {
    public static final SecLinkManager LIZ = new SecLinkManager();
    public static final Map<View, C1B2O> LIZIZ = new ConcurrentHashMap();

    /* JADX INFO: loaded from: classes4.dex */
    public interface SecLinkDataApi {
        @InterfaceC1501170pAR
        C0X9S<String> executePost(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
    }

    static {
        SecLinkLocalConfig secLinkLocalConfig;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String strValueOf = String.valueOf(C844470XAv.LJIIJ);
        C09S4.LIZ.getClass();
        ISettingService iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class);
        String language = iSettingService.getLanguage(iSettingService.getCurrentI18nItem(C844470XAv.LIZ()).getLocale());
        String strLIZ = C09S4.LIZ();
        if (contextLIZ == null) {
            throw new RuntimeException("context can not be null.");
        }
        if (TextUtils.isEmpty(strValueOf)) {
            throw new RuntimeException("aid can not be empty.");
        }
        if (TextUtils.isEmpty(strLIZ)) {
            throw new RuntimeException("host can not be empty.");
        }
        C1B2S.LIZ = C786410Ut5.N3(contextLIZ);
        C1B2R c1b2r = new C1B2R();
        C1B2S.LIZIZ = c1b2r;
        c1b2r.LIZ = strValueOf;
        c1b2r.LIZIZ = language;
        if (!TextUtils.isEmpty(strLIZ) && strLIZ.length() > 0 && strLIZ.endsWith("/")) {
            strLIZ = strLIZ.substring(0, strLIZ.length() - 1);
        }
        c1b2r.LIZJ = strLIZ;
        C1B2S.LIZJ = true;
        if (SecLinkSwitchSettings.LIZ().enable) {
            C1B2S.LIZIZ.LJ = SecLinkSwitchSettings.LIZ().timeout;
            SecLinkLocalConfig secLinkLocalConfig2 = C1EAV.LIZ;
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                secLinkLocalConfig = C1EAV.LIZ;
                SecLinkLocalConfig secLinkLocalConfig3 = (SecLinkLocalConfig) settingsManagerLIZLLL.LJIIIIZZ("seclink_white_list_config", SecLinkLocalConfig.class, secLinkLocalConfig);
                if (secLinkLocalConfig3 != null) {
                    secLinkLocalConfig = secLinkLocalConfig3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                secLinkLocalConfig = C1EAV.LIZ;
            }
            List<String> list = secLinkLocalConfig.whiteList;
            C1B2R c1b2r2 = C1B2S.LIZIZ;
            if (c1b2r2.LIZLLL == null) {
                c1b2r2.LIZLLL = new ArrayList();
            }
            ((ArrayList) c1b2r2.LIZLLL).addAll(list);
        } else {
            String[] strArr = {"tiktokcdn.com", "tiktokv.com", "tiktok.com"};
            if (strArr.length != 0) {
                List listLJIIJJI = C1697810uHb.LJIIJJI(Arrays.copyOf(strArr, strArr.length));
                C1B2R c1b2r3 = C1B2S.LIZIZ;
                if (c1b2r3.LIZLLL == null) {
                    c1b2r3.LIZLLL = new ArrayList();
                }
                ((ArrayList) c1b2r3.LIZLLL).addAll(listLJIIJJI);
            }
        }
        C2198391B2f.LJFF = new InterfaceC2373709Rv() { // from class: X.09S3
            @Override // X.InterfaceC2373709Rv
            public final String LIZ(String str, JSONObject jSONObject) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                C09S4.LIZ.getClass();
                SecLinkManager.SecLinkDataApi secLinkDataApi = (SecLinkManager.SecLinkDataApi) C1515120pWw.LJIIIZ(SecLinkManager.SecLinkDataApi.class, C09S4.LIZ());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C080U("Content-Type", "application/json"));
                return secLinkDataApi.executePost(str, new TypedByteArray(null, C786410Ut5.J3(jSONObject).getBytes(Charset.forName("UTF-8")), new String[0]), arrayList).execute().LIZIZ;
            }

            @Override // X.InterfaceC2373709Rv
            public final void LIZIZ(String str, JSONObject jSONObject, C2198381B2e c2198381B2e) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C09S4.LIZ.getClass();
                SecLinkManager.SecLinkDataApi secLinkDataApi = (SecLinkManager.SecLinkDataApi) C1515120pWw.LJIIIZ(SecLinkManager.SecLinkDataApi.class, C09S4.LIZ());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C080U("Content-Type", "application/json"));
                secLinkDataApi.executePost(str, new TypedByteArray(null, C786410Ut5.J3(jSONObject).getBytes(Charset.forName("UTF-8")), new String[0]), arrayList).enqueue(new C2501609rC(c2198381B2e, 4));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r6, java.lang.String r7) {
        /*
            com.ss.android.ugc.aweme.local_test.LocalTestApi r0 = X.C19273110af.LIZ()
            r5 = 1
            if (r0 == 0) goto L88
            boolean r0 = r0.seclinkEnable()
            if (r0 != r5) goto L88
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L87
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L87
            X.1B2R r0 = X.C1B2S.LIZIZ
            if (r0 != 0) goto L1e
            return r6
        L1e:
            boolean r0 = X.C1B2T.LJFF(r6)
            if (r0 == 0) goto L25
            return r6
        L25:
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)
            java.lang.String r2 = r4.getHost()
            X.1B2R r0 = X.C1B2S.LIZIZ
            java.util.List<java.lang.String> r1 = r0.LIZLLL
            java.lang.String r3 = ""
            if (r1 == 0) goto L54
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r5 = r5 ^ r0
            if (r5 == 0) goto L54
            if (r2 != 0) goto L42
            r2 = r3
        L42:
            boolean r0 = X.C1942007j8.LIZIZ(r2, r1)
            if (r0 == 0) goto L54
            java.lang.String r1 = "https"
            java.lang.String r0 = r4.getScheme()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L87
        L54:
            r0 = -1
            java.lang.String r6 = X.C1B2T.LIZIZ(r0, r6, r7)
            boolean r0 = X.C1B2T.LJFF(r6)
            if (r0 == 0) goto L87
            X.01Ck r2 = X.C295101Cj.LIZ(r4)
            if (r2 == 0) goto L7d
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r2.LIZ
            r1.append(r0)
            java.lang.String r0 = r2.LIZIZ
            if (r0 != 0) goto L73
            r0 = r3
        L73:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 == 0) goto L7d
            r3 = r0
        L7d:
            X.0WVj r1 = new X.0WVj
            r0 = 10002(0x2712, float:1.4016E-41)
            r1.<init>(r0, r3)
            X.C822610WOt.LIZ(r1)
        L87:
            return r6
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager.LIZ(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void LIZIZ(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.1B2P
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                SecLinkManager.LIZ.getClass();
                ((ConcurrentHashMap) SecLinkManager.LIZIZ).remove(view);
            }
        });
        C1B2Y c1b2y = new C1B2Y(webView, str);
        c1b2y.LJI = new InterfaceC2198421B2i() { // from class: X.1B2Q
            @Override // X.InterfaceC2198421B2i
            public final void LIZ(C1B2U c1b2u) {
                C295201Ck c295201CkLIZ;
                if (c1b2u.LIZ && c1b2u.LIZJ) {
                    String str2 = c1b2u.LJ;
                    if (str2 != null) {
                        try {
                            c295201CkLIZ = C295101Cj.LIZ(UriProtector.parse(str2));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                            c295201CkLIZ = null;
                        }
                    } else {
                        c295201CkLIZ = null;
                    }
                    String str3 = "";
                    if (c295201CkLIZ != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c295201CkLIZ.LIZ);
                        String str4 = c295201CkLIZ.LIZIZ;
                        if (str4 == null) {
                            str4 = "";
                        }
                        sbLIZ.append(str4);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (strLIZIZ != null) {
                            str3 = strLIZIZ;
                        }
                    }
                    C822610WOt.LIZ(new C824330WVj(10002, str3));
                }
            }
        };
        c1b2y.LJII();
        webView.setTag(R.id.web_client_seclink_scene, str);
        ((ConcurrentHashMap) LIZIZ).put(webView, c1b2y);
    }
}
