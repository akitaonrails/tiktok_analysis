package com.ss.android.ugc.aweme.bullet.business;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1039190d9J;
import X.C1377230lwX;
import X.C1701940uOG;
import X.C19881612qc;
import X.C20684815ws;
import X.C786410Ut5;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsShareBusiness extends BulletBusinessService.Business {
    public List<Object> LIZIZ;
    public WebSharePackage LIZJ;
    public final List<String> LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;

    public abstract void LIZJ();

    public final class InJavaScriptLocalObj {
        public InJavaScriptLocalObj() {
        }

        @JavascriptInterface
        public final void showSource(String str, String str2) throws Throwable {
            JSONObject jSONObject;
            String string;
            JSONObject jSONObject2;
            String str3;
            Collection collection;
            WebSharePackage webSharePackage;
            Bundle bundle;
            String str4 = null;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/bullet/business/AbsShareBusiness$InJavaScriptLocalObj", "showSource", this, new Object[]{str, str2}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDcUDdoWi2ijsTPmrn5x9CKS+rcXFujn9X", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                if (obj != null) {
                    str = (String) obj;
                }
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    str2 = (String) obj2;
                }
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject = new JSONObject(str2);
                    try {
                        string = JSONObjectProtectorUtils.getString(jSONObject, "source");
                    } catch (JSONException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        string = null;
                    }
                } else {
                    string = null;
                    jSONObject = null;
                }
            } catch (JSONException e2) {
                e = e2;
                jSONObject = null;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("title", str);
                jSONObject3.put("container", "bullet");
                if (string == null) {
                    string = "web";
                }
                jSONObject3.put("invoke_source", string);
                jSONObject3.put("trigger", "abs_share_business_jsb");
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            AbsShareBusiness.this.LIZ.getClass();
            AbsShareBusiness absShareBusiness = AbsShareBusiness.this;
            absShareBusiness.getClass();
            C1377230lwX c1377230lwX = WebSharePackage.Companion;
            Context context = GlobalContext.getContext();
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject;
            }
            String str5 = absShareBusiness.LJ;
            if (str5 == null) {
                str5 = "";
            }
            c1377230lwX.getClass();
            absShareBusiness.LIZJ = C1377230lwX.LIZLLL(context, str, jSONObject2, str5, "");
            String strLIZ = AbsShareBusiness.LIZ("qrcode", jSONObject);
            AbsShareBusiness.LIZ("sharetips", jSONObject);
            absShareBusiness.LIZIZ = (List) GsonProtectorUtils.fromJson(new Gson(), AbsShareBusiness.LIZ("aweme:shareChannels", jSONObject), new TypeToken<List<Object>>() { // from class: X.04Yw
            }.getType());
            if (TextUtils.isEmpty(strLIZ) || (!TextUtils.equals("1", strLIZ) && !TextUtils.equals(strLIZ, "true"))) {
                ((ArrayList) absShareBusiness.LIZLLL).remove("qrcode");
            }
            String strLIZ2 = AbsShareBusiness.LIZ("innerUrl", jSONObject);
            absShareBusiness.LJI = strLIZ2;
            WebSharePackage webSharePackage2 = absShareBusiness.LIZJ;
            if (webSharePackage2 != null) {
                str3 = webSharePackage2.url;
            } else {
                str3 = null;
            }
            if (!TextUtils.isEmpty(strLIZ2)) {
                str3 = absShareBusiness.LJI;
            } else if (!TextUtils.isEmpty(absShareBusiness.LJ)) {
                str3 = absShareBusiness.LJ;
            }
            WebSharePackage webSharePackage3 = absShareBusiness.LIZJ;
            if (webSharePackage3 != null) {
                str4 = webSharePackage3.url;
            }
            if (!TextUtils.equals(str3, str4) && (webSharePackage = absShareBusiness.LIZJ) != null && (bundle = webSharePackage.extras) != null) {
                C786410Ut5.LJJJI("url_for_im_share", str3, bundle);
            }
            String strLIZ3 = AbsShareBusiness.LIZ("shareitems", jSONObject);
            if (strLIZ3 != null && (collection = (Collection) GsonProtectorUtils.fromJson(new Gson(), strLIZ3, new TypeToken<List<? extends String>>() { // from class: X.04XU
            }.getType())) != null) {
                ((ArrayList) absShareBusiness.LIZLLL).clear();
                ((ArrayList) absShareBusiness.LIZLLL).addAll(collection);
            }
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS116S0100000_16(absShareBusiness, 155));
        }
    }

    public AbsShareBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
        this.LIZLLL = C19881612qc.LIZIZ("copylink", "qrcode", "browser", "refresh");
        new InJavaScriptLocalObj();
    }

    public final void LIZIZ(String str) {
        String str2;
        HashMap map = new HashMap();
        map.put("enter_from", "h5_page");
        map.put("platform", str);
        String str3 = "";
        map.put("previous_page", "");
        map.put("group_id", "");
        String str4 = null;
        if (TextUtils.isEmpty(null)) {
            str2 = "";
        } else {
            str2 = "article";
        }
        map.put("webview_type", str2);
        WebSharePackage webSharePackage = this.LIZJ;
        if (webSharePackage != null) {
            str4 = webSharePackage.url;
        }
        if (TextUtils.isEmpty(str4)) {
            String str5 = this.LJ;
            if (str5 != null) {
                str3 = str5;
            }
        } else {
            str3 = this.LIZJ.url;
        }
        map.put("url", str3);
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
