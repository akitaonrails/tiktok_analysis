package com.bytedance.effectcreatormobile.ckeapi.api;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.AutoGenIconConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AutoGenIconConfig implements Parcelable {
    public static final Parcelable.Creator<AutoGenIconConfig> CREATOR = new Parcelable.Creator<AutoGenIconConfig>() { // from class: X.0NRP
        @Override // android.os.Parcelable.Creator
        public final AutoGenIconConfig createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new AutoGenIconConfig(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoGenIconConfig[] newArray(int i) {
            return new AutoGenIconConfig[i];
        }
    };

    @C09CT("get_frame_delay_count_config")
    public final Map<String, Integer> getFrameDelayCountConfig;

    public AutoGenIconConfig() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoGenIconConfig) && Intrinsics.LJFF(this.getFrameDelayCountConfig, ((AutoGenIconConfig) obj).getFrameDelayCountConfig);
    }

    public final int hashCode() {
        return this.getFrameDelayCountConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoGenIconConfig(getFrameDelayCountConfig=");
        sbLIZ.append(this.getFrameDelayCountConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, Integer> map = this.getFrameDelayCountConfig;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().intValue());
        }
    }

    public AutoGenIconConfig(Map<String, Integer> map) {
        this.getFrameDelayCountConfig = map;
    }

    public AutoGenIconConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("Distortion", 8), new Pair("Liquify", 8), new Pair("Makeup", 5), new Pair("ame_3d_accessories", 12), new Pair("ame_gan", 12), new Pair("ame_gan_face_fusion", 15)) : map);
    }
}
