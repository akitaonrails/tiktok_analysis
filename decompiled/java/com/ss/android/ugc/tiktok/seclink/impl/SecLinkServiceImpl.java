package com.ss.android.ugc.tiktok.seclink.impl;

import X.C1B2O;
import X.C1B2T;
import X.C2190311Ant;
import X.C2273401Dyc;
import X.C793770VBv;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkConfig;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkConfigItem;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecLinkSwitchSettings;
import com.ss.android.ugc.tiktok.seclink.impl.settings.SecureLinkConfigSettings;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SecLinkServiceImpl implements ISecLinkService {
    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LIZ() {
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String LJIIJJI() {
        SecLinkManager.LIZ.getClass();
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("opt_seclink_default", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (zLIZ) {
            String str = C2273401Dyc.LIZLLL;
            return Intrinsics.LJFF(str, "us") ? "https://www.tiktoklinksafety.us/link//" : Intrinsics.LJFF(str, "eu") ? "https://www.tiktoklinksafety.eu/link//" : "https://www.tiktoklinksafety.com/link//";
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SecureLinkConfigSettings.SecureLinkConfigModel secureLinkConfigModel = SecureLinkConfigSettings.LIZ;
        SecureLinkConfigSettings.SecureLinkConfigModel secureLinkConfigModel2 = (SecureLinkConfigSettings.SecureLinkConfigModel) settingsManagerLIZLLL.LJIIIIZZ("secure_link_config", SecureLinkConfigSettings.SecureLinkConfigModel.class, secureLinkConfigModel);
        if (secureLinkConfigModel2 != null) {
            secureLinkConfigModel = secureLinkConfigModel2;
        }
        String str2 = secureLinkConfigModel.secure_link_base_url;
        return str2 == null ? "https://www.tiktok.com/link//" : str2;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final void LJ() {
        SecLinkSwitchSettings.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean LIZJ(WebView webView) {
        SecLinkManager.LIZ.getClass();
        C1B2O c1b2o = (C1B2O) ((ConcurrentHashMap) SecLinkManager.LIZIZ).get(webView);
        if (c1b2o != null) {
            return c1b2o.canGoBack();
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final boolean goBack(WebView webView) {
        SecLinkManager.LIZ.getClass();
        C1B2O c1b2o = (C1B2O) ((ConcurrentHashMap) SecLinkManager.LIZIZ).get(webView);
        if (c1b2o != null) {
            return c1b2o.LIZJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final String LIZIZ(String str, String str2) {
        SecLinkManager.LIZ.getClass();
        return SecLinkManager.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    public final Boolean LIZLLL(WebView webView, String str) {
        SecLinkConfig secLinkConfig;
        Boolean boolValueOf;
        boolean z;
        String next;
        boolean z2;
        SecLinkConfigItem next2;
        boolean zLJFF;
        SecLinkManager.LIZ.getClass();
        if (str == null) {
            return Boolean.FALSE;
        }
        if (!C1B2T.LIZLLL(str, "http")) {
            return Boolean.FALSE;
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            secLinkConfig = C2190311Ant.LIZ;
            SecLinkConfig secLinkConfig2 = (SecLinkConfig) settingsManagerLIZLLL.LJIIIIZZ("seclink_config", SecLinkConfig.class, secLinkConfig);
            if (secLinkConfig2 != null) {
                secLinkConfig = secLinkConfig2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            secLinkConfig = C2190311Ant.LIZ;
        }
        List<SecLinkConfigItem> list = secLinkConfig.blockList;
        boolean z3 = false;
        if (list != null) {
            Iterator<SecLinkConfigItem> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    SecLinkConfigItem secLinkConfigItem = next2;
                    int i = secLinkConfigItem.type;
                    if (i == TypeEnum.START_WITH.getType()) {
                        zLJFF = u.LJJIIJZLJL(str, secLinkConfigItem.pattern, false);
                    } else if (i == TypeEnum.CONTAINS.getType()) {
                        zLJFF = a0.LJJIIZI(str, secLinkConfigItem.pattern, false);
                    } else if (i == TypeEnum.REGEX_MATCHES.getType()) {
                        zLJFF = new Regex(secLinkConfigItem.pattern).matches(str);
                    } else if (i == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                        zLJFF = new Regex(secLinkConfigItem.pattern).containsMatchIn(str);
                    } else if (i == TypeEnum.EQUAL.getType()) {
                        zLJFF = Intrinsics.LJFF(secLinkConfigItem.pattern, str);
                    } else {
                        zLJFF = false;
                    }
                    if (zLJFF) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (next2 != null) {
                SecLinkManager.LIZ.getClass();
                SecLinkManager.LIZIZ(webView, "common");
            }
        }
        C1B2O c1b2o = (C1B2O) ((ConcurrentHashMap) SecLinkManager.LIZIZ).get(webView);
        if (c1b2o != null) {
            String url = webView.getUrl();
            if (webView instanceof WebKitView) {
                boolValueOf = Boolean.valueOf(((WebKitView) webView).LJLLJ());
            } else {
                boolValueOf = null;
            }
            SecLinkSwitchSettings.SeclinkSwitch seclinkSwitchLIZ = SecLinkSwitchSettings.LIZ();
            seclinkSwitchLIZ.getClass();
            if (url != null && url.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && seclinkSwitchLIZ.enable) {
                Iterator<String> it3 = seclinkSwitchLIZ.white_list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        String str2 = next;
                        if (url != null && a0.LJJIIZI(url, str2, false)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                String str3 = next;
                if (str3 == null || str3.length() == 0) {
                    z3 = true;
                }
            }
            if (z3 && Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                boolean zLIZIZ = c1b2o.LIZIZ(str);
                SecLinkManager.LIZ.getClass();
                JSONObject jSONObject = new JSONObject();
                if (!(!C1B2T.LIZLLL(str, "http"))) {
                    try {
                        jSONObject.put("host", UriProtector.parse(str).getHost());
                        jSONObject.put("url", str);
                        if (url != null) {
                            jSONObject.put("origin_hos", UriProtector.parse(url).getHost());
                            jSONObject.put("origin_url", url);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C793770VBv.LJII("monitor_seclink_first_jump", jSONObject, null, null);
                }
                return Boolean.valueOf(zLIZIZ);
            }
            c1b2o.LIZ(str);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // com.ss.android.ugc.tiktok.seclink.ISecLinkService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String onLoadUrl(android.webkit.WebView r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl.onLoadUrl(android.webkit.WebView, java.lang.String):java.lang.String");
    }
}
