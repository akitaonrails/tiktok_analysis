package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC846040XGw;
import X.C0XH0;
import X.C846060XGy;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AgeAppealServiceImpl implements AgeAppealService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService
    public final void LIZ(String str, final Function1<? super String, Unit> function1) {
        final Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("app_id", String.valueOf(1233));
        HashMap map = new HashMap();
        ((C0XH0) C0XH0.LIZLLL()).LIZIZ("/passport/user/appeal_ticket/", map, new AbstractC846040XGw<C846060XGy>() { // from class: X.0dwB
            @Override // X.AbstractC846040XGw
            public final void LIZ(C0XGA c0xga) {
                String strOptString;
                JSONObject jSONObject;
                C846060XGy c846060XGy = (C846060XGy) c0xga;
                if (c846060XGy != null && (jSONObject = c846060XGy.LJIILJJIL) != null) {
                    strOptString = jSONObject.optString("verify_ticket");
                } else {
                    strOptString = null;
                }
                if (C123100dR.LIZ(strOptString)) {
                    Function1<String, Unit> function12 = function1;
                    Uri.Builder builder = builderAppendQueryParameter;
                    if (strOptString == null) {
                        strOptString = "";
                    }
                    function12.invoke(builder.appendQueryParameter("verify_ticket", strOptString).toString());
                    return;
                }
                function1.invoke(builderAppendQueryParameter.toString());
            }
        });
    }
}
