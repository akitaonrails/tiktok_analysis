package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes36.dex */
public class VEVideoCropFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoCropFilterParam> CREATOR = new C2325341G0m(53);
    public float[] cropNodesCoord;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoCropFilterParam() {
        this.cropNodesCoord = new float[]{-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f};
        this.filterName = "crop filter";
        this.filterType = 19;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoCropFilterParam{cropNodesCoord=");
        sbLIZ.append(Arrays.toString(this.cropNodesCoord));
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEVideoCropFilterParam(Parcel parcel) {
        super(parcel);
        this.cropNodesCoord = new float[]{-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f};
        this.cropNodesCoord = parcel.createFloatArray();
    }

    public VEVideoCropFilterParam(float[] fArr) {
        this();
        if (fArr != null) {
            this.cropNodesCoord = fArr;
        }
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloatArray(this.cropNodesCoord);
    }
}
