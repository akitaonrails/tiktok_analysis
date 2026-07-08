package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.typed;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC12986056i;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTypeEnum;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TypedFrequencySceneConfig implements Serializable {

    @C09CT("frequency_type")
    public final ImFrequencyTypeEnum frequencyType;

    @C09CT("report_interval")
    public final Long reportInterval;

    @C09CT(Scene.SCENE_SERVICE)
    public final EnumC12986056i scene;

    @C09CT("units")
    public final List<TypedFrequencyUnit> units;

    @C09CT("version")
    public final Integer version;

    public TypedFrequencySceneConfig() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypedFrequencySceneConfig)) {
            return false;
        }
        TypedFrequencySceneConfig typedFrequencySceneConfig = (TypedFrequencySceneConfig) obj;
        return this.scene == typedFrequencySceneConfig.scene && Intrinsics.LJFF(this.version, typedFrequencySceneConfig.version) && this.frequencyType == typedFrequencySceneConfig.frequencyType && Intrinsics.LJFF(this.reportInterval, typedFrequencySceneConfig.reportInterval) && Intrinsics.LJFF(this.units, typedFrequencySceneConfig.units);
    }

    public int hashCode() {
        EnumC12986056i enumC12986056i = this.scene;
        int iHashCode = (enumC12986056i == null ? 0 : enumC12986056i.hashCode()) * 31;
        Integer num = this.version;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ImFrequencyTypeEnum imFrequencyTypeEnum = this.frequencyType;
        int iHashCode3 = (iHashCode2 + (imFrequencyTypeEnum == null ? 0 : imFrequencyTypeEnum.hashCode())) * 31;
        Long l = this.reportInterval;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<TypedFrequencyUnit> list = this.units;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypedFrequencySceneConfig(scene=");
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

    public TypedFrequencySceneConfig(EnumC12986056i enumC12986056i, Integer num, ImFrequencyTypeEnum imFrequencyTypeEnum, Long l, List<TypedFrequencyUnit> list) {
        this.scene = enumC12986056i;
        this.version = num;
        this.frequencyType = imFrequencyTypeEnum;
        this.reportInterval = l;
        this.units = list;
    }
}
