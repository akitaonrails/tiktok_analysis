package com.ss.android.vesdk.filterparam;

import X.C08FF;
import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEVideoTransformFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoTransformFilterParam> CREATOR = new C2325341G0m(57);
    public float alpha;
    public long animComboEndTime;
    public String animComboPath;
    public long animComboStartTime;
    public int animEndTime;
    public long animInEndTime;
    public String animInPath;
    public long animInStartTime;
    public String animJsonParam;
    public long animOutEndTime;
    public String animOutPath;
    public long animOutStartTime;
    public String animPath;
    public int animStartTime;
    public String blendModePath;
    public int borderColor;
    public int borderWidth;
    public float degree;
    public boolean disableInsideScale;
    public int mirror;
    public float scaleFactor;
    public float transX;
    public float transY;
    public int transformType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoTransformFilterParam() {
        this.animInPath = "";
        this.animOutPath = "";
        this.animComboPath = "";
        this.filterName = "canvas blend";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.scaleFactor = 1.0f;
        this.alpha = 1.0f;
        this.animPath = "";
        this.blendModePath = "";
        this.animJsonParam = "";
        this.transformType = paramType.UPDATE_VIDEO_TRANSFORM.ordinal();
        this.borderColor = -1;
        this.borderWidth = 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoTransformFilterParam{scaleFactor=");
        sbLIZ.append(this.scaleFactor);
        sbLIZ.append(", disableInsideScale=");
        sbLIZ.append(this.disableInsideScale);
        sbLIZ.append(", degree=");
        sbLIZ.append(this.degree);
        sbLIZ.append(", transX=");
        sbLIZ.append(this.transX);
        sbLIZ.append(", transY=");
        sbLIZ.append(this.transY);
        sbLIZ.append(", mirror=");
        sbLIZ.append(this.mirror);
        sbLIZ.append(", blendModePath='");
        sbLIZ.append(this.blendModePath);
        sbLIZ.append('\'');
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", animPath='");
        sbLIZ.append(this.animPath);
        sbLIZ.append('\'');
        sbLIZ.append(", animStartTime=");
        sbLIZ.append(this.animStartTime);
        sbLIZ.append(", animEndTime=");
        sbLIZ.append(this.animEndTime);
        sbLIZ.append(", animInPath='");
        sbLIZ.append(this.animInPath);
        sbLIZ.append('\'');
        sbLIZ.append(", animInStartTime='");
        sbLIZ.append(this.animInStartTime);
        sbLIZ.append('\'');
        sbLIZ.append(", animInEndTime='");
        sbLIZ.append(this.animInEndTime);
        sbLIZ.append('\'');
        sbLIZ.append(", animOutPath='");
        sbLIZ.append(this.animOutPath);
        sbLIZ.append('\'');
        sbLIZ.append(", animOutStartTime='");
        sbLIZ.append(this.animOutStartTime);
        sbLIZ.append('\'');
        sbLIZ.append(", animOutEndTime='");
        sbLIZ.append(this.animOutEndTime);
        sbLIZ.append('\'');
        sbLIZ.append(", animComboPath='");
        sbLIZ.append(this.animComboPath);
        sbLIZ.append('\'');
        sbLIZ.append(", animComboStartTime='");
        sbLIZ.append(this.animComboStartTime);
        sbLIZ.append('\'');
        sbLIZ.append(", animComboEndTime='");
        sbLIZ.append(this.animComboEndTime);
        sbLIZ.append('\'');
        sbLIZ.append(", animJsonParam=");
        sbLIZ.append(this.animJsonParam);
        sbLIZ.append(", transformType=");
        sbLIZ.append(this.transformType);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('\'');
        sbLIZ.append(", borderColor =");
        sbLIZ.append(this.borderColor);
        sbLIZ.append('\'');
        sbLIZ.append(", borderWidth =");
        sbLIZ.append(this.borderWidth);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public enum paramType {
        UPDATE_VIDEO_TRANSFORM,
        UPDATE_VIDEO_ANIMATION,
        UPDATE_VIDEO_ANIMATION_AND_ANIMATION,
        UPDATE_VIDEO_ANIMATION_NEW;

        public static paramType valueOf(String str) {
            return (paramType) C08FF.LIZ(paramType.class, str);
        }
    }

    public VEVideoTransformFilterParam(Parcel parcel) {
        boolean z;
        super(parcel);
        this.animInPath = "";
        this.animOutPath = "";
        this.animComboPath = "";
        this.scaleFactor = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.disableInsideScale = z;
        this.degree = parcel.readFloat();
        this.transX = parcel.readFloat();
        this.transY = parcel.readFloat();
        this.mirror = parcel.readInt();
        this.blendModePath = parcel.readString();
        this.alpha = parcel.readFloat();
        this.animPath = parcel.readString();
        this.animStartTime = parcel.readInt();
        this.animEndTime = parcel.readInt();
        this.animJsonParam = parcel.readString();
        this.transformType = parcel.readInt();
        this.borderColor = parcel.readInt();
        this.borderWidth = parcel.readInt();
        this.animInPath = parcel.readString();
        this.animInStartTime = parcel.readLong();
        this.animInEndTime = parcel.readLong();
        this.animOutPath = parcel.readString();
        this.animOutStartTime = parcel.readLong();
        this.animOutEndTime = parcel.readLong();
        this.animComboPath = parcel.readString();
        this.animComboStartTime = parcel.readLong();
        this.animComboEndTime = parcel.readLong();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.scaleFactor);
        parcel.writeByte(this.disableInsideScale ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.degree);
        parcel.writeFloat(this.transX);
        parcel.writeFloat(this.transY);
        parcel.writeInt(this.mirror);
        parcel.writeString(this.blendModePath);
        parcel.writeFloat(this.alpha);
        parcel.writeString(this.animPath);
        parcel.writeInt(this.animStartTime);
        parcel.writeInt(this.animEndTime);
        parcel.writeString(this.animJsonParam);
        parcel.writeInt(this.transformType);
        parcel.writeInt(this.borderColor);
        parcel.writeInt(this.borderWidth);
        parcel.writeString(this.animInPath);
        parcel.writeLong(this.animInStartTime);
        parcel.writeLong(this.animInEndTime);
        parcel.writeString(this.animOutPath);
        parcel.writeLong(this.animOutStartTime);
        parcel.writeLong(this.animOutEndTime);
        parcel.writeString(this.animComboPath);
        parcel.writeLong(this.animComboStartTime);
        parcel.writeLong(this.animComboEndTime);
    }
}
