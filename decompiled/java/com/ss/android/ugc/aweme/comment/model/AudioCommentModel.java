package com.ss.android.ugc.aweme.comment.model;

import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AudioCommentModel implements Parcelable {
    public static final Parcelable.Creator<AudioCommentModel> CREATOR = new Creator();
    public final String audioFilePath;
    public final String audioFormat;
    public final String audioId;
    public final long fileSize;
    public final long totalDurationMillis;
    public String vid;
    public String videoModelStr;
    public CommentAudioModel videoModelStruct;
    public final List<Float> waveformData;

    public static final class Creator implements Parcelable.Creator<AudioCommentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AudioCommentModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            return new AudioCommentModel(string, j, arrayList, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (CommentAudioModel) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AudioCommentModel[] newArray(int i) {
            return new AudioCommentModel[i];
        }
    }

    public final AudioCommentModel copy(String str, long j, List<Float> list, String str2, long j2, String str3, String str4, String str5, CommentAudioModel commentAudioModel) {
        return new AudioCommentModel(str, j, list, str2, j2, str3, str4, str5, commentAudioModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCommentModel)) {
            return false;
        }
        AudioCommentModel audioCommentModel = (AudioCommentModel) obj;
        return Intrinsics.LJFF(this.audioFilePath, audioCommentModel.audioFilePath) && this.totalDurationMillis == audioCommentModel.totalDurationMillis && Intrinsics.LJFF(this.waveformData, audioCommentModel.waveformData) && Intrinsics.LJFF(this.audioId, audioCommentModel.audioId) && this.fileSize == audioCommentModel.fileSize && Intrinsics.LJFF(this.audioFormat, audioCommentModel.audioFormat) && Intrinsics.LJFF(this.vid, audioCommentModel.vid) && Intrinsics.LJFF(this.videoModelStr, audioCommentModel.videoModelStr) && Intrinsics.LJFF(this.videoModelStruct, audioCommentModel.videoModelStruct);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.audioFilePath.hashCode() * 31) + C786410Ut5.Y2(this.totalDurationMillis)) * 31) + this.waveformData.hashCode()) * 31) + this.audioId.hashCode()) * 31) + C786410Ut5.Y2(this.fileSize)) * 31) + this.audioFormat.hashCode()) * 31;
        String str = this.vid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoModelStr;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommentAudioModel commentAudioModel = this.videoModelStruct;
        return iHashCode3 + (commentAudioModel != null ? commentAudioModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioCommentModel(audioFilePath=");
        sbLIZ.append(this.audioFilePath);
        sbLIZ.append(", totalDurationMillis=");
        sbLIZ.append(this.totalDurationMillis);
        sbLIZ.append(", waveformData=");
        sbLIZ.append(this.waveformData);
        sbLIZ.append(", audioId=");
        sbLIZ.append(this.audioId);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.fileSize);
        sbLIZ.append(", audioFormat=");
        sbLIZ.append(this.audioFormat);
        sbLIZ.append(", vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(", videoModelStr=");
        sbLIZ.append(this.videoModelStr);
        sbLIZ.append(", videoModelStruct=");
        sbLIZ.append(this.videoModelStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioFilePath);
        parcel.writeLong(this.totalDurationMillis);
        List<Float> list = this.waveformData;
        parcel.writeInt(list.size());
        Iterator<Float> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeFloat(it2.next().floatValue());
        }
        parcel.writeString(this.audioId);
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.audioFormat);
        parcel.writeString(this.vid);
        parcel.writeString(this.videoModelStr);
        parcel.writeSerializable(this.videoModelStruct);
    }

    public final String getAudioFilePath() {
        return this.audioFilePath;
    }

    public final String getAudioFormat() {
        return this.audioFormat;
    }

    public final String getAudioId() {
        return this.audioId;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getTotalDurationMillis() {
        return this.totalDurationMillis;
    }

    public final String getVid() {
        return this.vid;
    }

    public final String getVideoModelStr() {
        return this.videoModelStr;
    }

    public final CommentAudioModel getVideoModelStruct() {
        return this.videoModelStruct;
    }

    public final List<Float> getWaveformData() {
        return this.waveformData;
    }

    public final void setVid(String str) {
        this.vid = str;
    }

    public final void setVideoModelStr(String str) {
        this.videoModelStr = str;
    }

    public final void setVideoModelStruct(CommentAudioModel commentAudioModel) {
        this.videoModelStruct = commentAudioModel;
    }

    public AudioCommentModel(String str, long j, List<Float> list, String str2, long j2, String str3, String str4, String str5, CommentAudioModel commentAudioModel) {
        this.audioFilePath = str;
        this.totalDurationMillis = j;
        this.waveformData = list;
        this.audioId = str2;
        this.fileSize = j2;
        this.audioFormat = str3;
        this.vid = str4;
        this.videoModelStr = str5;
        this.videoModelStruct = commentAudioModel;
    }

    public AudioCommentModel(String str, long j, List list, String str2, long j2, String str3, String str4, String str5, CommentAudioModel commentAudioModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? String.valueOf(System.currentTimeMillis()) : str2, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? "aac" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? commentAudioModel : null);
    }
}
