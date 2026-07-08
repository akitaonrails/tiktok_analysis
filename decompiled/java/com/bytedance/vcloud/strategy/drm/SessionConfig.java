package com.bytedance.vcloud.strategy.drm;

import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.drm.SessionConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SessionConfig {
    public static final Map<String, Integer> QUALITY_RANK;
    public static final Pattern STREAM_NAME_PATTERN = PatternProtector.compile("stream-\\d+");
    public final String gear;
    public final String licenseUrl;
    public final String minSecurityLevel;
    public final String pssh;
    public final String source;
    public final String streamName;

    static {
        HashMap map = new HashMap();
        map.put("ld", 0);
        map.put("sd", 1);
        map.put("hd", 2);
        map.put("hd_60", 3);
        map.put("uhd", 4);
        map.put("uhd_60", 5);
        map.put("origin", 6);
        QUALITY_RANK = Collections.unmodifiableMap(map);
    }

    public boolean isStrictRequired() {
        return "strict".equalsIgnoreCase(this.minSecurityLevel);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.streamName) || TextUtils.isEmpty(this.licenseUrl) || TextUtils.isEmpty(this.pssh) || TextUtils.isEmpty(this.minSecurityLevel)) ? false : true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionConfig{streamName=");
        sbLIZ.append(this.streamName);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", gear=");
        sbLIZ.append(this.gear);
        sbLIZ.append(", pssh=");
        sbLIZ.append(this.pssh);
        sbLIZ.append(", cacheKey=");
        sbLIZ.append(PsshUtils.cacheKeyOf(this.pssh));
        sbLIZ.append(", minSecurityLevel=");
        sbLIZ.append(this.minSecurityLevel);
        sbLIZ.append(", licenseUrl=");
        sbLIZ.append(this.licenseUrl);
        sbLIZ.append(", isValid=");
        sbLIZ.append(isValid());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<SessionConfig> parseAll(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gears");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                String str2 = null;
                String strOptString = jSONObject.optString("stream_name", null);
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = streamNameFromGearsCmaf(jSONObjectOptJSONObject);
                    if (TextUtils.isEmpty(strOptString)) {
                        return Collections.emptyList();
                    }
                }
                String strOptString2 = jSONObject.optString("default_gear", null);
                if (!TextUtils.isEmpty(strOptString2) && jSONObjectOptJSONObject.has(strOptString2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = strOptString2;
                }
                List<String> listSortGearNames = sortGearNames(jSONObjectOptJSONObject, str2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str3 : listSortGearNames) {
                    addFromGearSource(linkedHashMap, strOptString, jSONObjectOptJSONObject.optJSONObject(str3), str3, "main");
                }
                for (String str4 : listSortGearNames) {
                    addFromGearSource(linkedHashMap, strOptString, jSONObjectOptJSONObject.optJSONObject(str4), str4, "backup");
                }
                return new ArrayList(linkedHashMap.values());
            }
            return Collections.emptyList();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Collections.emptyList();
        }
    }

    public static int rankOf(String str) {
        Integer num = QUALITY_RANK.get(str);
        if (num == null) {
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }

    public static String streamNameFromGearsCmaf(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null) {
                String strStreamNameFromSourceCmaf = streamNameFromSourceCmaf(jSONObjectOptJSONObject.optJSONObject("main"));
                if (!TextUtils.isEmpty(strStreamNameFromSourceCmaf)) {
                    return strStreamNameFromSourceCmaf;
                }
                String strStreamNameFromSourceCmaf2 = streamNameFromSourceCmaf(jSONObjectOptJSONObject.optJSONObject("backup"));
                if (!TextUtils.isEmpty(strStreamNameFromSourceCmaf2)) {
                    return strStreamNameFromSourceCmaf2;
                }
            }
        }
        return null;
    }

    public static String streamNameFromSourceCmaf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("cmaf", null);
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        Matcher matcher = STREAM_NAME_PATTERN.matcher(strOptString);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group();
    }

    public static List<String> sortGearNames(JSONObject jSONObject, final String str) {
        final int iRankOf;
        ArrayList arrayList = new ArrayList(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        final boolean z = !TextUtils.isEmpty(str);
        if (z) {
            iRankOf = rankOf(str);
        } else {
            iRankOf = 2;
        }
        Collections.sort(arrayList, new Comparator() { // from class: X.0opD
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SessionConfig.lambda$sortGearNames$0(z, str, iRankOf, (String) obj, (String) obj2);
            }
        });
        return arrayList;
    }

    public static void addFromGearSource(Map<String, SessionConfig> map, String str, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str3)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("drm_license_urls")) == null) {
            return;
        }
        SessionConfig sessionConfig = new SessionConfig(str, str3, str2, jSONObjectOptJSONObject2.optString("widevine", null), jSONObjectOptJSONObject2.optString("pssh", null), jSONObjectOptJSONObject2.optString("minimum_security_level", null));
        if (sessionConfig.isValid() && !map.containsKey(sessionConfig.pssh)) {
            map.put(sessionConfig.pssh, sessionConfig);
        }
    }

    public static /* synthetic */ int lambda$sortGearNames$0(boolean z, String str, int i, String str2, String str3) {
        boolean zEquals;
        if (z && (zEquals = str2.equals(str)) != str3.equals(str)) {
            if (zEquals) {
                return -1;
            }
            return 1;
        }
        int iRankOf = rankOf(str2);
        int iRankOf2 = rankOf(str3);
        long j = i;
        long jAbs = Math.abs(((long) iRankOf) - j);
        long jAbs2 = Math.abs(((long) iRankOf2) - j);
        if (jAbs != jAbs2) {
            return Long.compare(jAbs, jAbs2);
        }
        if (iRankOf != iRankOf2) {
            return Integer.compare(iRankOf, iRankOf2);
        }
        return str2.compareTo(str3);
    }

    public SessionConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        this.streamName = str;
        this.source = str2;
        this.gear = str3;
        this.licenseUrl = str4;
        this.pssh = str5;
        this.minSecurityLevel = str6;
    }
}
