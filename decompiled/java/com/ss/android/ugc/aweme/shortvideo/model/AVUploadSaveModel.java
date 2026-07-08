package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AVUploadSaveModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AVUploadSaveModel> CREATOR = new Parcelable.Creator<AVUploadSaveModel>() { // from class: com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AVUploadSaveModel createFromParcel(Parcel parcel) {
            return new AVUploadSaveModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AVUploadSaveModel[] newArray(int i) {
            return new AVUploadSaveModel[i];
        }
    };

    @C09CT("enable_silent_enhancement")
    public boolean enableSilentEnhancement;

    @C09CT("image_mode_cover_path")
    public String imageModeCoverPath;

    @C09CT("image_mode_cover_path_no_watermark")
    public String imageModeCoverPathNoWatermark;

    @C09CT("image_mode_local_paths")
    public List<String> imageModeLocalPaths;

    @C09CT("is_ai_water_mark")
    public boolean isAIWaterMark;

    @C09CT("is_save_local")
    public boolean isSaveLocal;

    @C09CT("is_water_mark")
    public boolean isWaterMark;

    @C09CT("local_final_path")
    public String mLocalFinalPath;

    @C09CT("local_silent_share_path")
    public String mLocalSilentSharePath;

    @C09CT("local_temp_path")
    public String mLocalTempPath;

    @C09CT("save_to_album")
    public boolean mSaveToAlbum;

    @C09CT("save_private_path")
    public boolean mSaveToAppPathInsteadOfAlbum;

    @C09CT("save_type")
    public int mSaveType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSaveLocal() {
        return this.isSaveLocal || this.mSaveToAlbum;
    }

    public boolean isSaveLocalWithWaterMark() {
        if (this.isSaveLocal || this.mSaveToAlbum) {
            return this.isWaterMark || this.isAIWaterMark;
        }
        return false;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVUploadSaveModel{isWaterMark=");
        sbLIZ.append(this.isWaterMark);
        sbLIZ.append(", isSaveLocal=");
        sbLIZ.append(this.isSaveLocal);
        sbLIZ.append(", mLocalTempPath='");
        sbLIZ.append(this.mLocalTempPath);
        sbLIZ.append('\'');
        sbLIZ.append(", mLocalFinalPath='");
        sbLIZ.append(this.mLocalFinalPath);
        sbLIZ.append('\'');
        sbLIZ.append(", mLocalSilentSharePath='");
        sbLIZ.append(this.mLocalSilentSharePath);
        sbLIZ.append('\'');
        sbLIZ.append(", mSaveType=");
        sbLIZ.append(this.mSaveType);
        sbLIZ.append(", mSaveToAlbum=");
        sbLIZ.append(this.mSaveToAlbum);
        sbLIZ.append(", mSaveToAppPathInsteadOfAlbum=");
        sbLIZ.append(this.mSaveToAppPathInsteadOfAlbum);
        sbLIZ.append(", enableSilentEnhancement=");
        sbLIZ.append(this.enableSilentEnhancement);
        sbLIZ.append(", imageModeLocalPaths=");
        sbLIZ.append(this.imageModeLocalPaths);
        sbLIZ.append(", imageModeCoverPath='");
        sbLIZ.append(this.imageModeCoverPath);
        sbLIZ.append('\'');
        sbLIZ.append(", imageModeCoverPathNoWatermark='");
        sbLIZ.append(this.imageModeCoverPathNoWatermark);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AVUploadSaveModel() {
    }

    public String getImageModeCoverPath() {
        return this.imageModeCoverPath;
    }

    public String getImageModeCoverPathNoWatermark() {
        return this.imageModeCoverPathNoWatermark;
    }

    public List<String> getImageModeLocalPaths() {
        return this.imageModeLocalPaths;
    }

    public String getLocalFinalPath() {
        return this.mLocalFinalPath;
    }

    public String getLocalSilentSharePath() {
        return this.mLocalSilentSharePath;
    }

    public String getLocalTempPath() {
        return this.mLocalTempPath;
    }

    public boolean getSaveToAlbum() {
        return this.mSaveToAlbum;
    }

    public int getSaveType() {
        return this.mSaveType;
    }

    public boolean isAIWaterMark() {
        return this.isAIWaterMark;
    }

    public boolean isSaveToAppPathInsteadOfAlbum() {
        return this.mSaveToAppPathInsteadOfAlbum;
    }

    public boolean isWaterMark() {
        return this.isWaterMark;
    }

    public AVUploadSaveModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isWaterMark = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isSaveLocal = z2;
        this.mLocalTempPath = parcel.readString();
        this.mSaveType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mSaveToAlbum = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mSaveToAppPathInsteadOfAlbum = z4;
        this.enableSilentEnhancement = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.imageModeLocalPaths = arrayList;
        parcel.readStringList(arrayList);
        this.imageModeCoverPath = parcel.readString();
    }

    public void setAIWaterMark(boolean z) {
        this.isAIWaterMark = z;
    }

    public void setEnableSilentEnhancement(boolean z) {
        this.enableSilentEnhancement = z;
    }

    public void setImageModeCoverPath(String str) {
        this.imageModeCoverPath = str;
    }

    public void setImageModeCoverPathNoWatermark(String str) {
        this.imageModeCoverPathNoWatermark = str;
    }

    public void setImageModeLocalPaths(List<String> list) {
        this.imageModeLocalPaths = list;
    }

    public void setLocalFinalPath(String str) {
        this.mLocalFinalPath = str;
    }

    public void setLocalSilentSharePath(String str) {
        this.mLocalSilentSharePath = str;
    }

    public void setLocalTempPath(String str) {
        this.mLocalTempPath = str;
    }

    public void setSaveLocal(boolean z) {
        this.isSaveLocal = z;
    }

    public void setSaveToAlbum(boolean z) {
        this.mSaveToAlbum = z;
    }

    public void setSaveToAppPathInsteadOfAlbum(boolean z) {
        this.mSaveToAppPathInsteadOfAlbum = z;
    }

    public void setSaveType(int i) {
        this.mSaveType = i;
    }

    public void setWaterMark(boolean z) {
        this.isWaterMark = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isWaterMark ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSaveLocal ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mLocalTempPath);
        parcel.writeInt(this.mSaveType);
        parcel.writeByte(this.mSaveToAlbum ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mSaveToAppPathInsteadOfAlbum ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableSilentEnhancement ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.imageModeLocalPaths);
        parcel.writeString(this.imageModeCoverPath);
    }
}
