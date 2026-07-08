package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashTrackConfig {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("params")
    public final Map<String, String> params;

    @C09CT("track_name")
    public final String trackName;

    public SlashTrackConfig() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashTrackConfig)) {
            return false;
        }
        SlashTrackConfig slashTrackConfig = (SlashTrackConfig) obj;
        return Intrinsics.LJFF(this.eventName, slashTrackConfig.eventName) && Intrinsics.LJFF(this.params, slashTrackConfig.params) && Intrinsics.LJFF(this.trackName, slashTrackConfig.trackName);
    }

    public final int hashCode() {
        String str = this.eventName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.params;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.trackName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashTrackConfig(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", trackName=");
        sbLIZ.append(this.trackName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashTrackConfig(String str, Map<String, String> map, String str2) {
        this.eventName = str;
        this.params = map;
        this.trackName = str2;
    }
}
