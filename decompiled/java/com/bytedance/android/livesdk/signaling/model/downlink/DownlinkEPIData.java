package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class DownlinkEPIData extends BaseDownlinkData {

    @C09CT("decisions")
    public final Map<String, String> decisions;

    @C09CT("features")
    public final EPIFeatureData features;

    @C09CT("new_duration")
    public long newDuration;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("upload_switch")
    public boolean f41switch;

    @C09CT("ts")
    public final long ts;

    public final DownlinkEPIData copy(long j, String str, EPIFeatureData ePIFeatureData, Map<String, String> map, boolean z, long j2) {
        return new DownlinkEPIData(j, str, ePIFeatureData, map, z, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownlinkEPIData)) {
            return false;
        }
        DownlinkEPIData downlinkEPIData = (DownlinkEPIData) obj;
        return this.ts == downlinkEPIData.ts && Intrinsics.LJFF(this.scene, downlinkEPIData.scene) && Intrinsics.LJFF(this.features, downlinkEPIData.features) && Intrinsics.LJFF(this.decisions, downlinkEPIData.decisions) && this.f41switch == downlinkEPIData.f41switch && this.newDuration == downlinkEPIData.newDuration;
    }

    public int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.ts) * 31) + this.scene.hashCode()) * 31;
        EPIFeatureData ePIFeatureData = this.features;
        int iHashCode = (iY2 + (ePIFeatureData == null ? 0 : ePIFeatureData.hashCode())) * 31;
        Map<String, String> map = this.decisions;
        return ((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.f41switch)) * 31) + C786410Ut5.Y2(this.newDuration);
    }

    public String toString() {
        Map<String, Float> map;
        Map<String, Long> map2;
        Map<String, String> map3;
        StringBuilder sb = new StringBuilder();
        EPIFeatureData ePIFeatureData = this.features;
        if (ePIFeatureData != null && (map3 = ePIFeatureData.stringFeature) != null) {
            for (Map.Entry<String, String> entry : map3.entrySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(entry.getKey());
                sbLIZ.append(" = ");
                sbLIZ.append(entry.getValue());
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        EPIFeatureData ePIFeatureData2 = this.features;
        if (ePIFeatureData2 != null && (map2 = ePIFeatureData2.intFeature) != null) {
            for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(entry2.getKey());
                sbLIZ2.append(" = ");
                sbLIZ2.append(entry2.getValue().longValue());
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        EPIFeatureData ePIFeatureData3 = this.features;
        if (ePIFeatureData3 != null && (map = ePIFeatureData3.floatFeature) != null) {
            for (Map.Entry<String, Float> entry3 : map.entrySet()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(entry3.getKey());
                sbLIZ3.append(" = ");
                sbLIZ3.append(entry3.getValue().floatValue());
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("DownlinkEPIData(ts=");
        sbLIZ4.append(this.ts);
        sbLIZ4.append(", scene=");
        sbLIZ4.append(this.scene);
        sbLIZ4.append(", features=");
        sbLIZ4.append((Object) sb);
        sbLIZ4.append(", decisions=");
        sbLIZ4.append(this.decisions);
        sbLIZ4.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public final Map<String, String> getDecisions() {
        return this.decisions;
    }

    public final EPIFeatureData getFeatures() {
        return this.features;
    }

    public final long getNewDuration() {
        return this.newDuration;
    }

    public final String getScene() {
        return this.scene;
    }

    public final boolean getSwitch() {
        return this.f41switch;
    }

    public final long getTs() {
        return this.ts;
    }

    public final void setNewDuration(long j) {
        this.newDuration = j;
    }

    public final void setSwitch(boolean z) {
        this.f41switch = z;
    }

    public DownlinkEPIData(long j, String str, EPIFeatureData ePIFeatureData, Map<String, String> map, boolean z, long j2) {
        this.ts = j;
        this.scene = str;
        this.features = ePIFeatureData;
        this.decisions = map;
        this.f41switch = z;
        this.newDuration = j2;
    }
}
