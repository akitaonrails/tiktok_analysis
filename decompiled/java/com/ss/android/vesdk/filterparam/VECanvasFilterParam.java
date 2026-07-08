package com.ss.android.vesdk.filterparam;

import X.C08FF;
import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VECanvasFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VECanvasFilterParam> CREATOR = new C2325341G0m(33);
    public int color;
    public boolean enableAntialiasing;
    public int gradientBottomColor;
    public int gradientTopColor;
    public int height;
    public String imagePath;
    public int radius;
    public int sourceType;
    public int width;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VECanvasFilterParam() {
        this.filterName = "color_canvas";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.sourceType = SourceType.COLOR.ordinal();
        this.color = -16777216;
        this.radius = 0;
        this.imagePath = "";
        this.width = -1;
        this.height = -1;
        this.enableAntialiasing = false;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VECanvasFilterParam{sourceType=");
        sbLIZ.append(this.sourceType);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", imagePath='");
        sbLIZ.append(this.imagePath);
        sbLIZ.append('\'');
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", enableAntialiasing=");
        sbLIZ.append(this.enableAntialiasing);
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

    /* JADX INFO: loaded from: classes30.dex */
    public enum SourceType {
        COLOR,
        VIDEOFRAME,
        IMAGE,
        GRADIENT_COLOR;

        public static SourceType valueOf(String str) {
            return (SourceType) C08FF.LIZ(SourceType.class, str);
        }
    }

    public VECanvasFilterParam(Parcel parcel) {
        boolean z;
        super(parcel);
        this.sourceType = parcel.readInt();
        this.color = parcel.readInt();
        this.radius = parcel.readInt();
        this.imagePath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableAntialiasing = z;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.sourceType);
        parcel.writeInt(this.color);
        parcel.writeInt(this.radius);
        parcel.writeString(this.imagePath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.enableAntialiasing ? 1 : 0);
    }
}
