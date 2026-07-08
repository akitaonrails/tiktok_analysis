package com.ss.android.account.token;

import X.C0XFF;
import X.C1515120pWw;
import X.C838780WvM;
import com.bytedance.crash.Npth;
import com.ss.android.account.TTAccountInit;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class TTTokenUtils {
    public static void addTokenInterceptor() {
        C1515120pWw.LIZIZ(new TTTokenInterceptor());
        C0XFF.LIZ("TTTokenUtils", "call addTokenInterceptor");
    }

    public static String LIZ(String str) {
        String strLIZ = C838780WvM.LIZ(str, "TTTokenUtils");
        TTAccountInit.LIZ().getClass();
        if (strLIZ.isEmpty()) {
            HashMap map = new HashMap();
            map.put("use_case", "appending csrf token in header");
            map.put("api_endpoint", str);
            map.put("missing_param", "csrf_token");
            Npth.reportBizException("AccountApiRequestError", new Throwable(map.toString()), map.toString(), (Map<String, String>) map, true);
        }
        return strLIZ;
    }
}
