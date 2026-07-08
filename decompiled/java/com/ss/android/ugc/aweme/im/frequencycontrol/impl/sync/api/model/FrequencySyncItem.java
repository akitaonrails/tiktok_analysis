package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencySyncItem implements Serializable {

    @C09CT("fc_data")
    public final List<FrequencyData> fcData;

    @C09CT("frequency_type")
    public final Integer frequencyType;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public FrequencySyncItem() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencySyncItem)) {
            return false;
        }
        FrequencySyncItem frequencySyncItem = (FrequencySyncItem) obj;
        return Intrinsics.LJFF(this.scene, frequencySyncItem.scene) && Intrinsics.LJFF(this.frequencyType, frequencySyncItem.frequencyType) && Intrinsics.LJFF(this.fcData, frequencySyncItem.fcData);
    }

    public int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.frequencyType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<FrequencyData> list = this.fcData;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencySyncItem(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", frequencyType=");
        sbLIZ.append(this.frequencyType);
        sbLIZ.append(", fcData=");
        sbLIZ.append(this.fcData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencySyncItem(String str, Integer num, List<FrequencyData> list) {
        this.scene = str;
        this.frequencyType = num;
        this.fcData = list;
    }
}
