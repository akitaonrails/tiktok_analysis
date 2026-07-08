package com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc;

import X.AnonymousClass1080;
import X.C098200Yq;
import X.C106V;
import X.C189200o6;
import X.C1913470ztR;
import X.C1913480ztS;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class TPSCPagesRouter implements IRouteAction {
    public static final C1913470ztR Companion = new Object() { // from class: X.0ztR
    };

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_tiktok_pns_privacy_setting_tpsc_TPSCPagesRouter_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    private final void logUrlHit(String str, Bundle bundle) {
        String string;
        Set<String> setKeySet;
        try {
            JSONObject jSONObject = new JSONObject();
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str2 : setKeySet) {
                    jSONObject.put(str2, String.valueOf(INVOKEVIRTUAL_com_ss_android_ugc_tiktok_pns_privacy_setting_tpsc_TPSCPagesRouter_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str2)));
                }
            }
            if (bundle == null || (string = bundle.getString("enter_from")) == null) {
                string = "";
            }
            Pair[] pairArr = new Pair[2];
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("schema", str);
            pairArr[1] = new Pair("enter_from", string);
            C1913480ztS.LIZ("pns_tpsc_page_schema_hit", C2097608Jq.LJIIIIZZ(pairArr), C2097908Jt.LIZJ(new Pair("param", C786410Ut5.J3(jSONObject))), 4);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) throws JSONException, AnonymousClass1080 {
        String string;
        logUrlHit(str, bundle);
        if (bundle == null || (((string = bundle.getString("target")) == null || !(!a0.LJJJIL(string))) && (string = bundle.getString("page_tag")) == null)) {
            return null;
        }
        C106V.LIZ.getClass();
        C106V.LIZJ().getClass();
        TPSCRenderManager.LJFF(context, string, bundle);
        return null;
    }
}
