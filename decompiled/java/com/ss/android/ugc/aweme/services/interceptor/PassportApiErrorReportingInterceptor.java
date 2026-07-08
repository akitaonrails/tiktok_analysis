package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.crash.Npth;
import com.bytedance.retrofit2.client.Request;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class PassportApiErrorReportingInterceptor implements IInterceptor {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    public Map<String, String> tryToIntercept(String str, Request request, String str2, int i, Map<String, String> map) {
        if (i != 0 && PassportApiErrorReportingAllowlistSettings.getValue().allowedErrorList.contains(String.valueOf(i))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("error_code", String.valueOf(i));
            if (str != null) {
                int iLJJJ = a0.LJJJ(str, "/passport", 0, false, 6);
                int iLJJJ2 = a0.LJJJ(str, "?", 0, false, 6);
                if (iLJJJ >= 0 && iLJJJ <= str.length() && iLJJJ2 >= 0 && iLJJJ2 <= str.length() && iLJJJ < iLJJJ2) {
                    linkedHashMap.put("api_endpoint", str.substring(iLJJJ, iLJJJ2));
                } else {
                    linkedHashMap.put("full_url", str);
                }
            }
            String string = linkedHashMap.toString();
            Npth.reportBizException("PassportApiError", new Throwable(string), string, (Map<String, String>) linkedHashMap, true);
        }
        return new LinkedHashMap();
    }
}
