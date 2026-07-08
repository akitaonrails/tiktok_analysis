package com.ss.android.vesdk;

import X.C1864730ycp;
import X.EnumC1464490oDH;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEEditor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes28.dex */
public class VEEditorModel implements Parcelable {
    public static final Parcelable.Creator<VEEditorModel> CREATOR = new C1864730ycp(16);
    public int audioEffectFilterIndex;
    public String[] audioPaths;
    public int backgroundColor;
    public int colorFilterIndex;
    public float colorFilterIntensity;
    public String colorFilterLeftPath;
    public float colorFilterPosition;
    public String colorFilterRightPath;
    public int effectHDRFilterIndex;
    public int hostTrackIndex;
    public int inPoint;
    public int mLensHDRFilterIndex;
    public int masterTrackIndex;
    public String modelDir;
    public String outputFile;
    public int outputPoint;
    public String projectXML;
    public boolean reverseDone;
    public boolean separateAV;
    public String[] transitions;
    public boolean useColorFilterResIntensity;
    public int videoBackgroundColor;
    public VEEditor.VIDEO_GRAVITY videoGravity;
    public EnumC1464490oDH videoOutRes;
    public String[] videoPaths;
    public VEEditor.VIDEO_SCALETYPE videoScaleType;
    public String watermarkFile;
    public double watermarkHeight;
    public double watermarkOffsetX;
    public double watermarkOffsetY;
    public double watermarkWidth;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "{\"projectXML\":\"" + this.projectXML + "\",\"inPoint\":" + this.inPoint + ",\"outputPoint\":" + this.outputPoint + ",\"reverseDone\":" + this.reverseDone + ",\"videoOutRes\":" + this.videoOutRes + ",\"separateAV\":" + this.separateAV + ",\"masterTrackIndex\":" + this.masterTrackIndex + ",\"hostTrackIndex\":" + this.hostTrackIndex + ",\"audioEffectFilterIndex\":" + this.audioEffectFilterIndex + ",\"modelDir\":\"" + this.modelDir + "\",\"colorFilterIndex\":" + this.colorFilterIndex + ",\"effectHDRFilterIndex\":" + this.effectHDRFilterIndex + ",\"mLensHDRFilterIndex\":" + this.mLensHDRFilterIndex + ",\"videoPaths\":" + Arrays.toString(this.videoPaths) + ",\"audioPaths\":" + Arrays.toString(this.audioPaths) + ",\"transitions\":" + Arrays.toString(this.transitions) + ",\"backgroundColor\":" + this.backgroundColor + ",\"videoBackgroundColor\":" + this.videoBackgroundColor + ",\"outputFile\":\"" + this.outputFile + "\",\"watermarkFile\":\"" + this.watermarkFile + "\",\"watermarkWidth\":" + this.watermarkWidth + ",\"watermarkHeight\":" + this.watermarkHeight + ",\"watermarkOffsetX\":" + this.watermarkOffsetX + ",\"watermarkOffsetY\":" + this.watermarkOffsetY + ",\"colorFilterLeftPath\":\"" + this.colorFilterLeftPath + "\",\"colorFilterRightPath\":\"" + this.colorFilterRightPath + "\",\"colorFilterPosition\":" + this.colorFilterPosition + ",\"colorFilterIntensity\":" + this.colorFilterIntensity + ",\"useColorFilterResIntensity\":" + this.useColorFilterResIntensity + ",\"videoGravity\":" + this.videoGravity + ",\"videoScaleType\":" + this.videoScaleType + '}';
    }

    public VEEditorModel() {
    }

    public VEEditorModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.projectXML = parcel.readString();
        this.inPoint = parcel.readInt();
        this.outputPoint = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.reverseDone = z;
        this.videoOutRes = EnumC1464490oDH.values()[parcel.readInt()];
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.separateAV = z2;
        this.masterTrackIndex = parcel.readInt();
        this.hostTrackIndex = parcel.readInt();
        this.audioEffectFilterIndex = parcel.readInt();
        this.modelDir = parcel.readString();
        this.colorFilterIndex = parcel.readInt();
        this.effectHDRFilterIndex = parcel.readInt();
        this.mLensHDRFilterIndex = parcel.readInt();
        int i = parcel.readInt();
        if (i != -1) {
            String[] strArr = new String[i];
            this.videoPaths = strArr;
            parcel.readStringArray(strArr);
        } else {
            this.videoPaths = null;
        }
        int i2 = parcel.readInt();
        if (i2 != -1) {
            String[] strArr2 = new String[i2];
            this.audioPaths = strArr2;
            parcel.readStringArray(strArr2);
        } else {
            this.audioPaths = null;
        }
        int i3 = parcel.readInt();
        if (i3 != -1) {
            String[] strArr3 = new String[i3];
            this.transitions = strArr3;
            parcel.readStringArray(strArr3);
        } else {
            this.transitions = null;
        }
        this.backgroundColor = parcel.readInt();
        this.outputFile = parcel.readString();
        this.watermarkFile = parcel.readString();
        this.watermarkWidth = parcel.readDouble();
        this.watermarkHeight = parcel.readDouble();
        this.watermarkOffsetX = parcel.readDouble();
        this.watermarkOffsetY = parcel.readDouble();
        this.colorFilterLeftPath = parcel.readString();
        this.colorFilterRightPath = parcel.readString();
        this.colorFilterPosition = parcel.readFloat();
        this.colorFilterIntensity = parcel.readFloat();
        this.useColorFilterResIntensity = parcel.readInt() == 1;
        this.videoGravity = VEEditor.VIDEO_GRAVITY.values()[parcel.readInt()];
        this.videoScaleType = VEEditor.VIDEO_SCALETYPE.values()[parcel.readInt()];
        this.videoBackgroundColor = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.projectXML);
        parcel.writeInt(this.inPoint);
        parcel.writeInt(this.outputPoint);
        parcel.writeInt(this.reverseDone ? 1 : 0);
        parcel.writeInt(this.videoOutRes.ordinal());
        parcel.writeInt(this.separateAV ? 1 : 0);
        parcel.writeInt(this.masterTrackIndex);
        parcel.writeInt(this.hostTrackIndex);
        parcel.writeInt(this.audioEffectFilterIndex);
        parcel.writeString(this.modelDir);
        parcel.writeInt(this.colorFilterIndex);
        parcel.writeInt(this.effectHDRFilterIndex);
        parcel.writeInt(this.mLensHDRFilterIndex);
        String[] strArr = this.videoPaths;
        if (strArr != null) {
            parcel.writeInt(strArr.length);
            parcel.writeStringArray(this.videoPaths);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr2 = this.audioPaths;
        if (strArr2 != null) {
            parcel.writeInt(strArr2.length);
            parcel.writeStringArray(this.audioPaths);
        } else {
            parcel.writeInt(-1);
        }
        String[] strArr3 = this.transitions;
        if (strArr3 != null) {
            parcel.writeInt(strArr3.length);
            parcel.writeStringArray(this.transitions);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeInt(this.backgroundColor);
        parcel.writeString(this.outputFile);
        parcel.writeString(this.watermarkFile);
        parcel.writeDouble(this.watermarkWidth);
        parcel.writeDouble(this.watermarkHeight);
        parcel.writeDouble(this.watermarkOffsetX);
        parcel.writeDouble(this.watermarkOffsetY);
        parcel.writeString(this.colorFilterLeftPath);
        parcel.writeString(this.colorFilterRightPath);
        parcel.writeFloat(this.colorFilterPosition);
        parcel.writeFloat(this.colorFilterIntensity);
        parcel.writeInt(this.useColorFilterResIntensity ? 1 : 0);
        parcel.writeInt(this.videoGravity.ordinal());
        parcel.writeInt(this.videoScaleType.ordinal());
        parcel.writeInt(this.videoBackgroundColor);
    }
}
