package com.bytedance.android.livesdk.signaling.model.uplink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.signaling.model.BaseUplinkData;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class UplinkEPIData extends BaseUplinkData {

    @C09CT("features")
    public final Map<String, String> features;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public final UplinkEPIData copy(String str, Map<String, String> map) {
        return new UplinkEPIData(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UplinkEPIData)) {
            return false;
        }
        UplinkEPIData uplinkEPIData = (UplinkEPIData) obj;
        return Intrinsics.LJFF(this.scene, uplinkEPIData.scene) && Intrinsics.LJFF(this.features, uplinkEPIData.features);
    }

    public int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.features;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UplinkEPIData(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", features=");
        sbLIZ.append(this.features);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, String> getFeatures() {
        return this.features;
    }

    public final String getScene() {
        return this.scene;
    }

    public UplinkEPIData(String str, Map<String, String> map) {
        this.scene = str;
        this.features = map;
    }
}
