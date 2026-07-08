package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencySceneConfig implements Serializable {

    @C09CT("frequency_type")
    public final Integer frequencyType;

    @C09CT("report_interval")
    public final Long reportInterval;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("units")
    public final List<RawServerFrequencyUnit> units;

    @C09CT("version")
    public final Integer version;

    public FrequencySceneConfig() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencySceneConfig)) {
            return false;
        }
        FrequencySceneConfig frequencySceneConfig = (FrequencySceneConfig) obj;
        return Intrinsics.LJFF(this.scene, frequencySceneConfig.scene) && Intrinsics.LJFF(this.version, frequencySceneConfig.version) && Intrinsics.LJFF(this.frequencyType, frequencySceneConfig.frequencyType) && Intrinsics.LJFF(this.reportInterval, frequencySceneConfig.reportInterval) && Intrinsics.LJFF(this.units, frequencySceneConfig.units);
    }

    public int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.frequencyType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.reportInterval;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<RawServerFrequencyUnit> list = this.units;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencySceneConfig(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", frequencyType=");
        sbLIZ.append(this.frequencyType);
        sbLIZ.append(", reportInterval=");
        sbLIZ.append(this.reportInterval);
        sbLIZ.append(", units=");
        sbLIZ.append(this.units);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencySceneConfig(String str, Integer num, Integer num2, Long l, List<RawServerFrequencyUnit> list) {
        this.scene = str;
        this.version = num;
        this.frequencyType = num2;
        this.reportInterval = l;
        this.units = list;
    }
}
