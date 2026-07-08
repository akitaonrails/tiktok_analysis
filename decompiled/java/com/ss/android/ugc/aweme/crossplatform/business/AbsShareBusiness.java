package com.ss.android.ugc.aweme.crossplatform.business;

import X.C0XI4;
import X.C1041550dD7;
import X.C1041660dDI;
import X.C123100dR;
import X.C131800eq;
import X.C1968907nT;
import X.C19881612qc;
import X.C20684815ws;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsShareBusiness extends BusinessService.Business {
    public WebSharePackage LIZLLL;
    public final List<String> LJ;
    public List<Object> LJFF;
    public final String LJI;
    public String LJII;
    public InJavaScriptLocalObj LJIIIIZZ;

    public void LIZJ() {
    }

    public final class InJavaScriptLocalObj {
        public InJavaScriptLocalObj() {
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void showSource(java.lang.String r14, java.lang.String r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.InJavaScriptLocalObj.showSource(java.lang.String, java.lang.String):void");
        }
    }

    public AbsShareBusiness(C1968907nT c1968907nT) {
        String host;
        super(c1968907nT);
        this.LJ = C19881612qc.LIZIZ("copylink", "qrcode", "browser", "refresh");
        C1041660dDI c1041660dDI = this.LIZIZ;
        String strLJFF = c1041660dDI.LIZ.LIZIZ;
        if (strLJFF == null) {
            strLJFF = null;
        } else if (c1041660dDI.LIZIZ.LL != 0 && C123100dR.LIZ(strLJFF)) {
            C0XI4 c0xi4 = new C0XI4(strLJFF);
            C1041550dD7 c1041550dD7 = this.LIZIZ.LIZIZ;
            String str = c1041550dD7.LLLLLJLJLL;
            if (c1041550dD7.LLLLLL == 1 && C123100dR.LIZ(str) && !a0.LJJIIZI(strLJFF, "ttclid=", false) && (host = UriProtector.parse(strLJFF).getHost()) != null && host.length() != 0) {
                Iterator<String> it2 = C131800eq.LIZ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (PatternProtector.compile(it2.next()).matcher(host).matches()) {
                            break;
                        }
                    } else {
                        c0xi4.LJ("ttclid", str);
                        break;
                    }
                }
            }
            strLJFF = c0xi4.LJFF();
        }
        this.LJI = strLJFF;
    }

    public final void LIZIZ(String str) {
        String str2;
        String str3;
        HashMap map = new HashMap();
        map.put("enter_from", "h5_page");
        map.put("platform", str);
        map.put("previous_page", this.LIZIZ.LIZ.LJ);
        String str4 = "";
        if (TextUtils.isEmpty(this.LIZIZ.LIZ.LIZLLL)) {
            str2 = "";
        } else {
            str2 = this.LIZIZ.LIZ.LIZLLL;
        }
        map.put("group_id", str2);
        if (!TextUtils.isEmpty(this.LIZIZ.LIZ.LIZLLL)) {
            str4 = "article";
        }
        map.put("webview_type", str4);
        WebSharePackage webSharePackage = this.LIZLLL;
        if (webSharePackage != null && !TextUtils.isEmpty(webSharePackage.url)) {
            str3 = this.LIZLLL.url;
        } else {
            str3 = this.LJI;
        }
        map.put("url", str3);
        C20684815ws.LJIILLIIL("h5_share", map);
    }

    public static String LIZ(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || TextUtils.equals(strOptString, "null")) {
            return null;
        }
        return strOptString;
    }
}
