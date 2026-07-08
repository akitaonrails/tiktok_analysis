package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "triones_layout_id_version_config")
public final class TrionesLayoutIdVersionConfig {
    public static final Map<String, Integer> DEFAULT;
    public static final TrionesLayoutIdVersionConfig INSTANCE = new TrionesLayoutIdVersionConfig();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("1019", 29);
        linkedHashMap.put("1011_seat_c1_21", 23);
        linkedHashMap.put("1012", 4);
        linkedHashMap.put("1013", 4);
        linkedHashMap.put("1014", 4);
        linkedHashMap.put("9004", 4);
        linkedHashMap.put("9005", 4);
        linkedHashMap.put("9006", 4);
        linkedHashMap.put("1011_seat_21", 22);
        linkedHashMap.put("1011_c1_21", 21);
        linkedHashMap.put("1011_21", 20);
        linkedHashMap.put("1011_seat_c1", 19);
        linkedHashMap.put("1013_seat_c1", 19);
        linkedHashMap.put("1011_c1", 18);
        linkedHashMap.put("1013_c1", 18);
        linkedHashMap.put("1011", 4);
        linkedHashMap.put("1012_C", 17);
        linkedHashMap.put("9004_C", 17);
        linkedHashMap.put("1011_A", 7);
        linkedHashMap.put("1002_C", 16);
        linkedHashMap.put("9001_C", 16);
        linkedHashMap.put("1011_seat", 12);
        linkedHashMap.put("1013_seat", 12);
        linkedHashMap.put("1011_seat_A", 13);
        linkedHashMap.put("1012_A", 7);
        linkedHashMap.put("9004_A", 7);
        linkedHashMap.put("1011_seat_B", 14);
        linkedHashMap.put("1012_B", 10);
        linkedHashMap.put("9004_B", 10);
        linkedHashMap.put("1011_B", 10);
        linkedHashMap.put("1001", 2);
        linkedHashMap.put("1002_B", 9);
        linkedHashMap.put("1005", 2);
        linkedHashMap.put("1006", 2);
        linkedHashMap.put("9001_B", 9);
        linkedHashMap.put("9002", 2);
        linkedHashMap.put("9003", 2);
        linkedHashMap.put("1002_A", 6);
        linkedHashMap.put("9001_A", 6);
        linkedHashMap.put("1002", 2);
        linkedHashMap.put("9001", 2);
        linkedHashMap.put("1015", 5);
        linkedHashMap.put("9007", 5);
        linkedHashMap.put("9008", 5);
        linkedHashMap.put("1016", 11);
        linkedHashMap.put("9010", 11);
        linkedHashMap.put("1017", 24);
        linkedHashMap.put("9013", 24);
        linkedHashMap.put("9020", 25);
        linkedHashMap.put("9021", 25);
        linkedHashMap.put("9022", 25);
        linkedHashMap.put("9020_seat", 26);
        linkedHashMap.put("9021_seat", 26);
        linkedHashMap.put("9022_seat", 26);
        linkedHashMap.put("9022_21", 27);
        linkedHashMap.put("9022_seat_21", 28);
        linkedHashMap.put("4001", 8);
        linkedHashMap.put("9009", 8);
        linkedHashMap.put("9011", 15);
        linkedHashMap.put("9012", 15);
        DEFAULT = linkedHashMap;
    }

    public final int getVersion(String str) {
        Map map;
        Integer num;
        if (str == null || (map = (Map) SettingsManager.INSTANCE.getValueSafely("triones_layout_id_version_config", DEFAULT)) == null || (num = (Integer) map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
