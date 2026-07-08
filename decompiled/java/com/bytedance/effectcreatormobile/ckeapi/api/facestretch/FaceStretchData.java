package com.bytedance.effectcreatormobile.ckeapi.api.facestretch;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FaceStretchData {

    @C09CT("current_value")
    public final List<Double> currentValue;

    @C09CT("face_stretch_res_type")
    public final String faceStretchResType;

    @C09CT("icon_file")
    public final String iconPath;

    @C09CT("identifier")
    public final String identifier;

    @C09CT("timestamp")
    public final String timestamp;

    public FaceStretchData() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceStretchData)) {
            return false;
        }
        FaceStretchData faceStretchData = (FaceStretchData) obj;
        return Intrinsics.LJFF(this.faceStretchResType, faceStretchData.faceStretchResType) && Intrinsics.LJFF(this.timestamp, faceStretchData.timestamp) && Intrinsics.LJFF(this.currentValue, faceStretchData.currentValue) && Intrinsics.LJFF(this.iconPath, faceStretchData.iconPath) && Intrinsics.LJFF(this.identifier, faceStretchData.identifier);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceStretchData(faceStretchResType=");
        sbLIZ.append(this.faceStretchResType);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", currentValue=");
        sbLIZ.append(this.currentValue);
        sbLIZ.append(", iconPath=");
        sbLIZ.append(this.iconPath);
        sbLIZ.append(", identifier=");
        sbLIZ.append(this.identifier);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FaceStretchData(String str, String str2, List<Double> list, String str3, String str4) {
        this.faceStretchResType = str;
        this.timestamp = str2;
        this.currentValue = list;
        this.iconPath = str3;
        this.identifier = str4;
    }

    public FaceStretchData(String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
