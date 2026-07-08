package com.ss.android.newmedia.ad;

import X.C04TD;
import X.C0A6K;
import X.C1039700dA8;
import X.C1489110oqz;
import X.C1545710qKH;
import X.C2214201BlK;
import android.app.Activity;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class WebAdUserAgentServiceImpl implements IWebAdUserAgentService {
    public String LIZ = "";
    public String LIZIZ = "";

    public static IWebAdUserAgentService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IWebAdUserAgentService.class, false);
        if (objLIZ != null) {
            return (IWebAdUserAgentService) objLIZ;
        }
        if (C04TD.LJJLIIIJ == null) {
            synchronized (IWebAdUserAgentService.class) {
                if (C04TD.LJJLIIIJ == null) {
                    C04TD.LJJLIIIJ = new WebAdUserAgentServiceImpl();
                }
            }
        }
        return C04TD.LJJLIIIJ;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IWebAdUserAgentService
    public final Map<String, String> LIZ(WebView webView, String str, boolean z) {
        String strLIZ;
        Activity activityLJFF = C2214201BlK.LJFF();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (activityLJFF != null) {
            if (((Boolean) C0A6K.LIZ.getValue()).booleanValue() && (!a0.LJJJIL(this.LIZ))) {
                strLIZ = this.LIZ;
            } else {
                C1545710qKH.LIZ.getClass();
                strLIZ = C1545710qKH.LIZIZ(activityLJFF, webView);
                this.LIZ = strLIZ;
            }
        } else if (((Boolean) C0A6K.LIZ.getValue()).booleanValue() && (!a0.LJJJIL(this.LIZIZ))) {
            strLIZ = this.LIZIZ;
        } else {
            strLIZ = C1489110oqz.LIZ("other");
            this.LIZIZ = strLIZ;
        }
        C1039700dA8.LIZ.getClass();
        linkedHashMap.put("User-Agent", C1039700dA8.LIZLLL(strLIZ, z));
        C1039700dA8.LIZ(str, linkedHashMap);
        return linkedHashMap;
    }
}
