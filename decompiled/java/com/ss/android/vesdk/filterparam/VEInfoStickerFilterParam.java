package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes36.dex */
public class VEInfoStickerFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEInfoStickerFilterParam> CREATOR = new C2325341G0m(43);
    public float alpha;
    public VEStickerAnimationParam animationParam;
    public float degree;
    public int endTime;
    public boolean flipX;
    public boolean flipY;
    public int layer;
    public float offsetX;
    public float offsetY;
    public String[] param;
    public String resPath;
    public float scale;
    public int startTime;
    public String templateParam;
    public boolean useRichText;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static class VEStickerAnimationParam implements Parcelable {
        public static final Parcelable.Creator<VEStickerAnimationParam> CREATOR = new C2325341G0m(42);
        public String animPropertyKey;
        public String animPropertyVal;
        public int inDuration;
        public String inPath;
        public boolean loop;
        public int loopDuration;
        public int loopEnd;
        public String loopPath;
        public int loopStart;
        public int outDuration;
        public String outPath;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public VEStickerAnimationParam() {
            this.loopPath = "";
            this.inPath = "";
            this.outPath = "";
            this.animPropertyKey = "";
            this.animPropertyVal = "";
        }

        public VEStickerAnimationParam(Parcel parcel) {
            boolean z;
            this.loopPath = "";
            this.inPath = "";
            this.outPath = "";
            this.animPropertyKey = "";
            this.animPropertyVal = "";
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.loop = z;
            this.loopPath = parcel.readString();
            this.loopDuration = parcel.readInt();
            this.loopStart = parcel.readInt();
            this.loopEnd = parcel.readInt();
            this.inPath = parcel.readString();
            this.inDuration = parcel.readInt();
            this.outPath = parcel.readString();
            this.outDuration = parcel.readInt();
            this.animPropertyKey = parcel.readString();
            this.animPropertyVal = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.loop ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loopPath);
            parcel.writeInt(this.loopDuration);
            parcel.writeInt(this.loopStart);
            parcel.writeInt(this.loopEnd);
            parcel.writeString(this.inPath);
            parcel.writeInt(this.inDuration);
            parcel.writeString(this.outPath);
            parcel.writeInt(this.outDuration);
            parcel.writeString(this.animPropertyKey);
            parcel.writeString(this.animPropertyVal);
        }
    }

    public VEInfoStickerFilterParam() {
        this.scale = 1.0f;
        this.alpha = 1.0f;
        this.filterName = "info sticker";
        this.filterType = 9;
        this.filterDurationType = 1;
        this.resPath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEInfoStickerFilterParam{resPath='");
        sbLIZ.append(this.resPath);
        sbLIZ.append('\'');
        sbLIZ.append(", param=");
        sbLIZ.append(Arrays.toString(this.param));
        sbLIZ.append(", useRichText=");
        sbLIZ.append(this.useRichText);
        sbLIZ.append(", offsetX=");
        sbLIZ.append(this.offsetX);
        sbLIZ.append(", offsetY=");
        sbLIZ.append(this.offsetY);
        sbLIZ.append(", degree=");
        sbLIZ.append(this.degree);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", layer=");
        sbLIZ.append(this.layer);
        sbLIZ.append(", flipX=");
        sbLIZ.append(this.flipX);
        sbLIZ.append(", flipY=");
        sbLIZ.append(this.flipY);
        sbLIZ.append(", animationParam=");
        sbLIZ.append(this.animationParam);
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

    public VEInfoStickerFilterParam(Parcel parcel) {
        boolean z;
        boolean z2;
        super(parcel);
        this.resPath = "";
        this.scale = 1.0f;
        this.alpha = 1.0f;
        this.resPath = parcel.readString();
        this.param = parcel.createStringArray();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useRichText = z;
        this.offsetX = parcel.readFloat();
        this.offsetY = parcel.readFloat();
        this.degree = parcel.readFloat();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.scale = parcel.readFloat();
        this.alpha = parcel.readFloat();
        this.layer = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.flipX = z2;
        this.flipY = parcel.readByte() != 0;
        this.animationParam = (VEStickerAnimationParam) parcel.readParcelable(VEStickerAnimationParam.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeStringArray(this.param);
        parcel.writeByte(this.useRichText ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeFloat(this.degree);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.alpha);
        parcel.writeInt(this.layer);
        parcel.writeByte(this.flipX ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.flipY ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.animationParam, i);
    }
}
