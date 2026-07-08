package com.ss.android.ugc.aweme.feed.model;

import X.C2188811AlT;
import X.C7740030o;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: loaded from: classes32.dex */
public final class InsertItemParamsKt {
    public static final String concatStringsWithComma(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(',');
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return str2;
    }

    public static final String getPushInsertItems(String str, String str2, String str3, String str4) {
        return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new InsertItemParams[]{new InsertItemParams(concatStringsWithComma(str, str2), new InfoParams(new SurveyInfo("push", new PushParams(str3, str4))))});
    }
}
