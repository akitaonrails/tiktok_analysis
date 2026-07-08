package com.ss.android.ugc.aweme.spark.business;

import X.AbstractC1968807nS;
import X.C1054730dYN;
import X.C19881612qc;
import X.C20684815ws;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsSparkShareBusiness extends C1054730dYN {
    public List<Object> LIZIZ;
    public WebSharePackage LIZJ;
    public final List<String> LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public final InJavaScriptLocalObj LJII;

    public abstract void LIZJ();

    public final class InJavaScriptLocalObj {
        public InJavaScriptLocalObj() {
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0219  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void showSource(java.lang.String r20, java.lang.String r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 541
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.spark.business.AbsSparkShareBusiness.InJavaScriptLocalObj.showSource(java.lang.String, java.lang.String):void");
        }
    }

    public AbsSparkShareBusiness(AbstractC1968807nS abstractC1968807nS) {
        super(abstractC1968807nS);
        this.LIZLLL = C19881612qc.LIZIZ("copylink", "qrcode", "browser", "refresh");
        this.LJII = new InJavaScriptLocalObj();
    }

    public final void LIZIZ(String str) {
        String str2;
        String str3;
        WebSharePackage webSharePackage;
        String str4;
        HashMap map = new HashMap();
        map.put("enter_from", "h5_page");
        map.put("platform", str);
        Map<String, String> params = this.LIZ.getParams();
        String str5 = "";
        if (params == null || (str2 = params.get("enter_from")) == null) {
            str2 = "";
        }
        map.put("previous_page", str2);
        map.put("group_id", "");
        String str6 = null;
        if (TextUtils.isEmpty(null)) {
            str3 = "";
        } else {
            str3 = "article";
        }
        map.put("webview_type", str3);
        WebSharePackage webSharePackage2 = this.LIZJ;
        if (webSharePackage2 != null) {
            str6 = webSharePackage2.url;
        }
        if (!TextUtils.isEmpty(str6) ? !((webSharePackage = this.LIZJ) == null || (str4 = webSharePackage.url) == null) : (str4 = this.LJ) != null) {
            str5 = str4;
        }
        map.put("url", str5);
        C20684815ws.LJIILLIIL("h5_share", map);
    }

    public static String LIZ(String str, JSONObject jSONObject) {
        String strOptString;
        if (jSONObject == null || (strOptString = jSONObject.optString(str)) == null || TextUtils.equals(strOptString, "null")) {
            return null;
        }
        return strOptString;
    }
}
