package com.bytedance.android.livesdk.livesetting.clientai;

import X.C098200Yq;
import X.C13BV;
import X.C15438062q;
import X.C182200my;
import X.C189200o6;
import X.C2097608Jq;
import X.C2203071BKf;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("client_trigger_params")
public final class LiveClientTriggerParamsSettings {
    public static final LiveClientTriggerParamsSettings INSTANCE = new LiveClientTriggerParamsSettings();
    public static final Map<String, Map<String, Object>> DEFAULT = C2097608Jq.LJ();

    private final Map<String, Map<String, Object>> getParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Map<String, Object>> map = DEFAULT;
        Map<String, Map<String, Object>> map2 = (Map) settingsManager.getValueSafely("client_trigger_params", map);
        return map2 != null ? map2 : map;
    }

    public final Map<String, C182200my> getTriggerConfigs() {
        Object obj;
        Set<Map.Entry> setEntrySet;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it2 = INSTANCE.getParams().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object obj2 = ((Map) entry.getValue()).get("ab_params");
                List list = null;
                Map mapLJ = obj2 instanceof Map ? (Map) obj2 : null;
                Object obj3 = ((Map) entry.getValue()).get("trigger_configs");
                Map map = obj3 instanceof Map ? (Map) obj3 : null;
                if (map != null && (setEntrySet = map.entrySet()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
                    for (Map.Entry entry2 : setEntrySet) {
                        String str = (String) entry2.getKey();
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        Object obj4 = ((Map) entry2.getValue()).get("rule_name");
                        String str3 = obj4 instanceof String ? (String) obj4 : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Object obj5 = ((Map) entry2.getValue()).get("rules_pkg_name");
                        String str4 = obj5 instanceof String ? (String) obj5 : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        Object obj6 = ((Map) entry2.getValue()).get("enable_algo_package");
                        boolean z = false;
                        if (obj6 != null) {
                            if (obj6 instanceof Double) {
                                if (((Number) obj6).doubleValue() > 0.0d) {
                                    z = true;
                                }
                            } else if (obj6 instanceof Integer) {
                                if (((Number) obj6).intValue() > 0) {
                                    z = true;
                                }
                            } else if ((obj6 instanceof Float) && ((Number) obj6).floatValue() > 0.0f) {
                                z = true;
                            }
                        }
                        Object obj7 = ((Map) entry2.getValue()).get("algo_pkg_name");
                        String str5 = obj7 instanceof String ? (String) obj7 : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        Object obj8 = ((Map) entry2.getValue()).get("label");
                        String str6 = obj8 instanceof String ? (String) obj8 : null;
                        if (str6 != null) {
                            str2 = str6;
                        }
                        arrayList.add(new C2203071BKf(str, str3, str4, str5, str2, z));
                    }
                    list = arrayList;
                }
                Object key = entry.getKey();
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                linkedHashMap.put(key, new C182200my(list, mapLJ));
            }
            C189200o6.m2constructorimpl(linkedHashMap);
            obj = linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object objLJ = obj;
        if (thM5exceptionOrNullimpl != null) {
            objLJ = C2097608Jq.LJ();
        }
        return (Map) objLJ;
    }
}
