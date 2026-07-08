package com.ss.android.ugc.aweme.services.video;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoModeExposureData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoExposureData implements Parcelable {
    public static final Parcelable.Creator<VideoExposureData> CREATOR = new Creator();
    public final AVUploadSaveModel avUploadSaveModel;
    public final String creationId;
    public final String draftPrimaryKey;
    public final String inputVideoFile;
    public final boolean isSaveLocal;
    public final String localFinalPath;
    public final String mainBusinessData;
    public final MusicBuzModel musicInfo;
    public final int origin;
    public final String outPutFile;
    public final String path;
    public final PhotoModeExposureData photoModeExposureData;
    public final String shootWay;
    public final float videoCoverStartTm;

    public static final class Creator implements Parcelable.Creator<VideoExposureData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoExposureData createFromParcel(Parcel parcel) {
            return new VideoExposureData(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (AVUploadSaveModel) parcel.readParcelable(VideoExposureData.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (MusicBuzModel) parcel.readParcelable(VideoExposureData.class.getClassLoader()), parcel.readInt() == 0 ? null : PhotoModeExposureData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoExposureData[] newArray(int i) {
            return new VideoExposureData[i];
        }
    }

    public final VideoExposureData copy(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8, MusicBuzModel musicBuzModel, PhotoModeExposureData photoModeExposureData) {
        return new VideoExposureData(str, f, str2, str3, str4, str5, z, str6, aVUploadSaveModel, i, str7, str8, musicBuzModel, photoModeExposureData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoExposureData)) {
            return false;
        }
        VideoExposureData videoExposureData = (VideoExposureData) obj;
        return Intrinsics.LJFF(this.path, videoExposureData.path) && Float.compare(this.videoCoverStartTm, videoExposureData.videoCoverStartTm) == 0 && Intrinsics.LJFF(this.mainBusinessData, videoExposureData.mainBusinessData) && Intrinsics.LJFF(this.outPutFile, videoExposureData.outPutFile) && Intrinsics.LJFF(this.inputVideoFile, videoExposureData.inputVideoFile) && Intrinsics.LJFF(this.creationId, videoExposureData.creationId) && this.isSaveLocal == videoExposureData.isSaveLocal && Intrinsics.LJFF(this.localFinalPath, videoExposureData.localFinalPath) && Intrinsics.LJFF(this.avUploadSaveModel, videoExposureData.avUploadSaveModel) && this.origin == videoExposureData.origin && Intrinsics.LJFF(this.draftPrimaryKey, videoExposureData.draftPrimaryKey) && Intrinsics.LJFF(this.shootWay, videoExposureData.shootWay) && Intrinsics.LJFF(this.musicInfo, videoExposureData.musicInfo) && Intrinsics.LJFF(this.photoModeExposureData, videoExposureData.photoModeExposureData);
    }

    public String toString() {
        return "VideoExposureData(path=" + this.path + ", videoCoverStartTm=" + this.videoCoverStartTm + ", mainBusinessData=" + this.mainBusinessData + ", outPutFile=" + this.outPutFile + ", inputVideoFile=" + this.inputVideoFile + ", creationId=" + this.creationId + ", isSaveLocal=" + this.isSaveLocal + ", localFinalPath=" + this.localFinalPath + ", avUploadSaveModel=" + this.avUploadSaveModel + ", origin=" + this.origin + ", draftPrimaryKey=" + this.draftPrimaryKey + ", shootWay=" + this.shootWay + ", musicInfo=" + this.musicInfo + ", photoModeExposureData=" + this.photoModeExposureData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeFloat(this.videoCoverStartTm);
        parcel.writeString(this.mainBusinessData);
        parcel.writeString(this.outPutFile);
        parcel.writeString(this.inputVideoFile);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.isSaveLocal ? 1 : 0);
        parcel.writeString(this.localFinalPath);
        parcel.writeParcelable(this.avUploadSaveModel, i);
        parcel.writeInt(this.origin);
        parcel.writeString(this.draftPrimaryKey);
        parcel.writeString(this.shootWay);
        parcel.writeParcelable(this.musicInfo, i);
        PhotoModeExposureData photoModeExposureData = this.photoModeExposureData;
        if (photoModeExposureData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoModeExposureData.writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + Float.floatToIntBits(this.videoCoverStartTm)) * 31;
        String str = this.mainBusinessData;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.outPutFile.hashCode()) * 31) + this.inputVideoFile.hashCode()) * 31) + this.creationId.hashCode()) * 31) + C786410Ut5.Z2(this.isSaveLocal)) * 31;
        String str2 = this.localFinalPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.avUploadSaveModel;
        int iHashCode4 = (((iHashCode3 + (aVUploadSaveModel == null ? 0 : aVUploadSaveModel.hashCode())) * 31) + this.origin) * 31;
        String str3 = this.draftPrimaryKey;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shootWay;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.musicInfo.hashCode()) * 31;
        PhotoModeExposureData photoModeExposureData = this.photoModeExposureData;
        return iHashCode6 + (photoModeExposureData != null ? photoModeExposureData.hashCode() : 0);
    }

    public final AVUploadSaveModel getAvUploadSaveModel() {
        return this.avUploadSaveModel;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getDraftPrimaryKey() {
        return this.draftPrimaryKey;
    }

    public final String getInputVideoFile() {
        return this.inputVideoFile;
    }

    public final String getLocalFinalPath() {
        return this.localFinalPath;
    }

    public final String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public final MusicBuzModel getMusicInfo() {
        return this.musicInfo;
    }

    public final int getOrigin() {
        return this.origin;
    }

    public final String getOutPutFile() {
        return this.outPutFile;
    }

    public final String getPath() {
        return this.path;
    }

    public final PhotoModeExposureData getPhotoModeExposureData() {
        return this.photoModeExposureData;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final float getVideoCoverStartTm() {
        return this.videoCoverStartTm;
    }

    public final boolean isSaveLocal() {
        return this.isSaveLocal;
    }

    public VideoExposureData(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8, MusicBuzModel musicBuzModel, PhotoModeExposureData photoModeExposureData) {
        this.path = str;
        this.videoCoverStartTm = f;
        this.mainBusinessData = str2;
        this.outPutFile = str3;
        this.inputVideoFile = str4;
        this.creationId = str5;
        this.isSaveLocal = z;
        this.localFinalPath = str6;
        this.avUploadSaveModel = aVUploadSaveModel;
        this.origin = i;
        this.draftPrimaryKey = str7;
        this.shootWay = str8;
        this.musicInfo = musicBuzModel;
        this.photoModeExposureData = photoModeExposureData;
    }
}
