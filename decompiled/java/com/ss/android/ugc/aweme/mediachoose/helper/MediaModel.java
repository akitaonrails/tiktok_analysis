package com.ss.android.ugc.aweme.mediachoose.helper;

import X.C2188811AlT;
import X.C2400609au;
import X.C580950MqT;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class MediaModel implements Comparable<MediaModel>, Parcelable, Cloneable {
    public static final Parcelable.Creator<MediaModel> CREATOR = new C580950MqT(1);
    public AIGCInfo aigcInfo;
    public String albumClass;
    public Long createTimestamp;
    public long date;
    public long dateTaken;
    public long duration;
    public String encryptLatitude;
    public String encryptLongitude;
    public int endTime;
    public String extra;
    public String fileLocalUriPath;
    public String fileName;
    public long fileSize;
    public int fps;
    public int height;
    public String id;
    public boolean isFavorite;
    public String liveHighlightType;
    public String liveInfo;
    public LivePhotoInfo livePhotoInfo;
    public Uri localUri;
    public String mediaPickerAbsolutePath;
    public String mediaSource;
    public String mimeType;
    public long modify;
    public String onlineVideoUrl;
    public String originLocalUriPath;
    public String ownerPackageName;
    public String relativePath;
    public String slotId;
    public float speed;
    public int startTime;
    public int subType;
    public String thumbnail;
    public String thumbnailOnlineUrl;
    public int type;
    public String userName;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean LJI() {
        return this.subType == 3;
    }

    public final boolean LJII() {
        return this.subType == 4;
    }

    public final boolean LJIIIZ() {
        return this.subType == 2;
    }

    public final boolean LJIIJ() {
        return this.type == 1;
    }

    public final boolean LJIIJJI() {
        return this.type == 1 && this.subType == 1;
    }

    public final boolean LJIIL() {
        return this.subType == 5;
    }

    public final boolean LJIILJJIL() {
        return this.type == 4;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final MediaModel clone() {
        return (MediaModel) super.clone();
    }

    public final String LJFF() {
        if (LJIIL() && TextUtils.isEmpty(this.fileLocalUriPath)) {
            String str = C2400609au.LIZLLL.get(this.id);
            if (str == null) {
                str = "";
            }
            LJIILL(str);
        }
        return this.fileLocalUriPath;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaModel{id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", filePath='");
        sbLIZ.append(this.fileLocalUriPath);
        sbLIZ.append('\'');
        sbLIZ.append(", date=");
        sbLIZ.append(this.date);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", subType=");
        sbLIZ.append(this.subType);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.fileSize);
        sbLIZ.append(", mimeType='");
        sbLIZ.append(this.mimeType);
        sbLIZ.append('\'');
        sbLIZ.append(", thumbnail='");
        sbLIZ.append(this.thumbnail);
        sbLIZ.append('\'');
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", modify=");
        sbLIZ.append(this.modify);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", mediaSource=");
        sbLIZ.append(this.mediaSource);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", extra='");
        sbLIZ.append(this.extra);
        sbLIZ.append(", slotId='");
        sbLIZ.append(this.slotId);
        sbLIZ.append(", encryptLatitude='");
        sbLIZ.append(this.encryptLatitude);
        sbLIZ.append(", encryptLongitude='");
        sbLIZ.append(this.encryptLongitude);
        sbLIZ.append('\'');
        sbLIZ.append(", absolutePath='");
        sbLIZ.append(this.mediaPickerAbsolutePath);
        sbLIZ.append("'");
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MediaModel(Parcel parcel) {
        this.mimeType = "";
        this.speed = 1.0f;
        this.createTimestamp = 0L;
        this.aigcInfo = null;
        this.onlineVideoUrl = null;
        this.thumbnailOnlineUrl = null;
        this.liveHighlightType = null;
        this.livePhotoInfo = null;
        this.mediaPickerAbsolutePath = null;
        this.isFavorite = false;
        this.ownerPackageName = null;
        this.id = parcel.readString();
        this.fileLocalUriPath = parcel.readString();
        this.relativePath = parcel.readString();
        this.fileName = parcel.readString();
        this.albumClass = parcel.readString();
        this.date = parcel.readLong();
        this.modify = parcel.readLong();
        this.type = parcel.readInt();
        this.subType = parcel.readInt();
        this.duration = parcel.readLong();
        this.fileSize = parcel.readLong();
        this.mimeType = parcel.readString();
        this.thumbnail = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.fps = parcel.readInt();
        this.userName = parcel.readString();
        this.mediaSource = parcel.readString();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.extra = parcel.readString();
        this.slotId = parcel.readString();
        this.encryptLatitude = parcel.readString();
        this.encryptLongitude = parcel.readString();
        this.createTimestamp = Long.valueOf(parcel.readLong());
        this.aigcInfo = (AIGCInfo) parcel.readSerializable();
        this.originLocalUriPath = parcel.readString();
        this.livePhotoInfo = (LivePhotoInfo) parcel.readSerializable();
        this.mediaPickerAbsolutePath = parcel.readString();
        this.isFavorite = parcel.readInt() != 0;
        this.ownerPackageName = parcel.readString();
    }

    public final void LJIILL(String str) {
        this.fileLocalUriPath = str;
        if (this.originLocalUriPath == null) {
            this.originLocalUriPath = str;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(MediaModel mediaModel) {
        long j = this.date;
        long j2 = mediaModel.date;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaModel)) {
            return false;
        }
        return ((MediaModel) obj).id.equals(this.id);
    }

    public MediaModel(long j) {
        this.mimeType = "";
        this.speed = 1.0f;
        this.createTimestamp = 0L;
        this.aigcInfo = null;
        this.onlineVideoUrl = null;
        this.thumbnailOnlineUrl = null;
        this.liveHighlightType = null;
        this.livePhotoInfo = null;
        this.mediaPickerAbsolutePath = null;
        this.isFavorite = false;
        this.ownerPackageName = null;
        this.id = String.valueOf(j);
    }

    public MediaModel(String str) {
        this.mimeType = "";
        this.speed = 1.0f;
        this.createTimestamp = 0L;
        this.aigcInfo = null;
        this.onlineVideoUrl = null;
        this.thumbnailOnlineUrl = null;
        this.liveHighlightType = null;
        this.livePhotoInfo = null;
        this.mediaPickerAbsolutePath = null;
        this.isFavorite = false;
        this.ownerPackageName = null;
        this.id = str;
    }

    public MediaModel(String str, String str2) {
        this.mimeType = "";
        this.speed = 1.0f;
        this.createTimestamp = 0L;
        this.aigcInfo = null;
        this.onlineVideoUrl = null;
        this.thumbnailOnlineUrl = null;
        this.liveHighlightType = null;
        this.livePhotoInfo = null;
        this.mediaPickerAbsolutePath = null;
        this.isFavorite = false;
        this.ownerPackageName = null;
        this.id = str;
        this.mediaSource = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeString(this.relativePath);
        parcel.writeString(this.fileName);
        parcel.writeString(this.albumClass);
        parcel.writeLong(this.date);
        parcel.writeLong(this.modify);
        parcel.writeInt(this.type);
        parcel.writeInt(this.subType);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.fileSize);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.thumbnail);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.fps);
        parcel.writeString(this.userName);
        parcel.writeString(this.mediaSource);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeString(this.extra);
        parcel.writeString(this.slotId);
        parcel.writeString(this.encryptLatitude);
        parcel.writeString(this.encryptLongitude);
        parcel.writeLong(this.createTimestamp.longValue());
        parcel.writeSerializable(this.aigcInfo);
        parcel.writeString(this.originLocalUriPath);
        parcel.writeSerializable(this.livePhotoInfo);
        parcel.writeString(this.mediaPickerAbsolutePath);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.ownerPackageName);
    }
}
