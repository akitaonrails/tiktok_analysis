package com.ss.android.ugc.effectmanager.common.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkUtils {
    public static boolean isNetworkAvailable(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isNetworkAvailable: ");
            sbLIZ.append(e.toString());
            EPLog.e("NetworkUtils", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static <T> String toJson(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(e3.e);
        if (list != null && !list.isEmpty()) {
            for (T t : list) {
                sb.append("\"");
                sb.append(t.toString());
                sb.append("\",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(e3.f);
            return sb.toString();
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public static String buildRequestUrl(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (map.size() > 0) {
            sb.append("?");
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    if (i == 0) {
                        sb.append(key);
                        sb.append("=");
                        sb.append(value);
                    } else {
                        sb.append("&");
                        sb.append(key);
                        sb.append("=");
                        sb.append(value);
                    }
                }
                i++;
            }
        }
        return new String(sb);
    }

    public static String encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Encoding not supported: ");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static String filterUrl(String str, String str2) {
        Pattern patternCompile = PatternProtector.compile(".*(?=://)");
        Pattern patternCompile2 = PatternProtector.compile("(?<=://)([^/]*)");
        URI uriCreate = URI.create(str);
        return patternCompile2.matcher(patternCompile.matcher(str2).replaceFirst(uriCreate.getScheme())).replaceFirst(uriCreate.getHost());
    }
}
