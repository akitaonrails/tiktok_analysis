package com.ss.android.statistic;

import X.C2188811AlT;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class StatisticLog {
    public Map<String, Object> info;
    public String name;
    public int sendChannels;

    public boolean sendApplogV2() {
        return 8 == (this.sendChannels & 8);
    }

    public boolean sendApplogV3() {
        return 16 == (this.sendChannels & 16);
    }

    public String toString() {
        Map<String, Object> map = this.info;
        String strLIZIZ = "";
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append("[key:");
                sbLIZ.append((Object) entry.getKey());
                sbLIZ.append(" value: ");
                sbLIZ.append(entry.getValue());
                sbLIZ.append(e3.f);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("event: ");
        sbLIZ2.append(this.name);
        sbLIZ2.append(" send channels: ");
        sbLIZ2.append(this.sendChannels);
        sbLIZ2.append(" info: ");
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public StatisticLog(String str, Map<String, Object> map, int i) {
        this.name = str;
        this.info = map;
        this.sendChannels = i;
    }
}
