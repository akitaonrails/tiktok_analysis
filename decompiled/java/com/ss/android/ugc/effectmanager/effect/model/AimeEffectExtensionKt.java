package com.ss.android.ugc.effectmanager.effect.model;

import X.C13LP;
import X.C2188811AlT;
import android.text.TextUtils;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AimeEffectExtensionKt {
    public static final String getCoverUrl(Effect effect) {
        String strLJJZZIII;
        String extra = effect.getExtra();
        if (extra != null && !TextUtils.isEmpty(extra)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList());
            String strOptString = null;
            if (str != null) {
                strLJJZZIII = a0.LJJZZIII('/', str, str);
            } else {
                strLJJZZIII = null;
            }
            sbLIZ.append(strLJJZZIII);
            sbLIZ.append('/');
            JSONObject extraJsonObject = effect.getExtraJsonObject();
            if (extraJsonObject != null) {
                strOptString = extraJsonObject.optString("coveruri");
            }
            sbLIZ.append(strOptString);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }
}
