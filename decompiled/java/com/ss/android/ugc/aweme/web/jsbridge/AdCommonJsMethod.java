package com.ss.android.ugc.aweme.web.jsbridge;

import X.C0T4N;
import X.C1019110ccv;
import X.C1019830ce5;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1022820ciu;
import X.C1440005kM;
import X.C2184171Adz;
import X.C2201701BEy;
import X.C2203531BLz;
import X.C2344809Gs;
import X.C988850bq7;
import X.InterfaceC1041760dDS;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCommonJsMethod extends BaseCommonJavaMethod {
    public final WeakReference<Context> LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AdCommonJsMethod(C2203531BLz c2203531BLz, WeakReference weakReference) {
        super(c2203531BLz.LIZJ);
        this.LLILLL = weakReference;
        IESJsBridge iESJsBridge = c2203531BLz.LIZJ;
        if (iESJsBridge != null && !TextUtils.isEmpty("sendAdLog")) {
            ((HashMap) iESJsBridge.LIZLLL).put("sendAdLog", this);
        }
        c2203531BLz.LIZIZ("sendAdLog", this);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        AwemeRawAd awemeRawAd;
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("func");
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (Intrinsics.LJFF(strOptString, "sendAdLog")) {
            try {
                String strOptString2 = jSONObject.optString("tag");
                String strOptString3 = jSONObject.optString("label");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extParam");
                boolean zOptBoolean = jSONObject.optBoolean("has_ad_info", false);
                boolean zOptBoolean2 = jSONObject.optBoolean("is_live", false);
                if (zOptBoolean) {
                    String strOptString4 = jSONObject.optString("creative_id");
                    String strOptString5 = jSONObject.optString("log_extra");
                    String strOptString6 = jSONObject.optString("group_id");
                    if (TextUtils.isEmpty(strOptString4)) {
                        if (interfaceC1041760dDS != null) {
                            interfaceC1041760dDS.LIZ(-1, "empty creativeId");
                        }
                    } else {
                        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                        c1020020ceOLIZ.LIZ = strOptString2;
                        c1020020ceOLIZ.LIZIZ = strOptString3;
                        c1020020ceOLIZ.LIZJ = strOptString4;
                        c1020020ceOLIZ.LJIIIIZZ(strOptString5);
                        c1020020ceOLIZ.LIZLLL = strOptString6;
                        c1020020ceOLIZ.LJI(jSONObjectOptJSONObject);
                        c1020020ceOLIZ.LJIIJ(this.LLILLL.get());
                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strOptString2, strOptString3, strOptString4, strOptString5, strOptString6);
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                c1022820ciuLJ.LIZJ(jSONObjectOptJSONObject.opt(next), next);
                            }
                        }
                        c1022820ciuLJ.LJIIIIZZ();
                        if (interfaceC1041760dDS != null) {
                            interfaceC1041760dDS.onSuccess(null);
                        }
                    }
                } else if (strOptString2.length() > 0 && strOptString3.length() > 0 && zOptBoolean2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt = jSONObjectOptJSONObject.opt(next2);
                            if (objOpt != null) {
                                linkedHashMap.put(next2, objOpt);
                            }
                        }
                    }
                    C1019110ccv.LIZIZ.LJIJ(strOptString2, strOptString3, linkedHashMap);
                } else if (strOptString2.length() > 0 && strOptString3.length() > 0 && c1019830ce5LIZ != null) {
                    C1020020ceO c1020020ceOLIZ2 = C1020030ceP.LIZ();
                    c1020020ceOLIZ2.LIZ = strOptString2;
                    c1020020ceOLIZ2.LIZIZ = strOptString3;
                    c1020020ceOLIZ2.LIZLLL(Long.valueOf(c1019830ce5LIZ.LIZ));
                    c1020020ceOLIZ2.LJIIIIZZ(c1019830ce5LIZ.LIZIZ);
                    c1020020ceOLIZ2.LJII(Long.valueOf(c1019830ce5LIZ.LIZJ));
                    c1020020ceOLIZ2.LJI(jSONObjectOptJSONObject);
                    c1020020ceOLIZ2.LJIIJ(this.LLILLL.get());
                    C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ(strOptString2, strOptString3, String.valueOf(c1019830ce5LIZ.LIZ), c1019830ce5LIZ.LIZIZ, String.valueOf(c1019830ce5LIZ.LIZJ));
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys3 = jSONObjectOptJSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            c1022820ciuLJ2.LIZJ(jSONObjectOptJSONObject.opt(next3), next3);
                        }
                    }
                    c1022820ciuLJ2.LJIIIIZZ();
                    if (Intrinsics.LJFF(strOptString2, "draw_ad") && Intrinsics.LJFF(strOptString3, "click")) {
                        Aweme aweme = c1019830ce5LIZ.LJIIL;
                        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                            Long creativeId = awemeRawAd.getCreativeId();
                            String logExtra = awemeRawAd.getLogExtra();
                            new AwS630S0100000_16(c1019830ce5LIZ, 67);
                            c2201701BEy.getClass();
                            C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
                        }
                        JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject, "refer");
                    }
                    if (interfaceC1041760dDS != null) {
                        interfaceC1041760dDS.onSuccess(null);
                    }
                } else if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(-1, "empty tag or label");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(-1, "unknown error");
                }
            }
        }
        C1440005kM.LIZ(new C0T4N(strOptString, jSONObject));
    }
}
