package com.ss.ugc.android.editor.core.api.params;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EditMedia implements Parcelable {
    public static final Parcelable.Creator<EditMedia> CREATOR = new Parcelable.Creator<EditMedia>() { // from class: X.0EKD
        @Override // android.os.Parcelable.Creator
        public final EditMedia createFromParcel(Parcel parcel) {
            boolean z;
            Long lValueOf;
            Long lValueOf2;
            String string = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            AIGCInfo aIGCInfo = (AIGCInfo) parcel.readParcelable(EditMedia.class.getClassLoader());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            return new EditMedia(string, z, string2, string3, lValueOf, lValueOf2, aIGCInfo, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditMedia[] newArray(int i) {
            return new EditMedia[i];
        }
    };
    public final String absolutePath;
    public final AIGCInfo aigcInfo;
    public final Long clipEndTime;
    public final Long clipStartTime;
    public Boolean hasOriginAudio;
    public final boolean isVideo;
    public final String libraryId;
    public final String mimeType;
    public final String path;

    public final EditMedia copy(String str, boolean z, String str2, String str3, Long l, Long l2, AIGCInfo aIGCInfo, Boolean bool, String str4) {
        return new EditMedia(str, z, str2, str3, l, l2, aIGCInfo, bool, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMedia)) {
            return false;
        }
        EditMedia editMedia = (EditMedia) obj;
        return Intrinsics.LJFF(this.path, editMedia.path) && this.isVideo == editMedia.isVideo && Intrinsics.LJFF(this.absolutePath, editMedia.absolutePath) && Intrinsics.LJFF(this.libraryId, editMedia.libraryId) && Intrinsics.LJFF(this.clipStartTime, editMedia.clipStartTime) && Intrinsics.LJFF(this.clipEndTime, editMedia.clipEndTime) && Intrinsics.LJFF(this.aigcInfo, editMedia.aigcInfo) && Intrinsics.LJFF(this.hasOriginAudio, editMedia.hasOriginAudio) && Intrinsics.LJFF(this.mimeType, editMedia.mimeType);
    }

    public int hashCode() {
        int iHashCode = ((this.path.hashCode() * 31) + C786410Ut5.Z2(this.isVideo)) * 31;
        String str = this.absolutePath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.libraryId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.clipStartTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.clipEndTime;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        int iHashCode6 = (iHashCode5 + (aIGCInfo == null ? 0 : aIGCInfo.hashCode())) * 31;
        Boolean bool = this.hasOriginAudio;
        return ((iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 31) + this.mimeType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditMedia(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.isVideo);
        sbLIZ.append(", absolutePath=");
        sbLIZ.append(this.absolutePath);
        sbLIZ.append(", libraryId=");
        sbLIZ.append(this.libraryId);
        sbLIZ.append(", clipStartTime=");
        sbLIZ.append(this.clipStartTime);
        sbLIZ.append(", clipEndTime=");
        sbLIZ.append(this.clipEndTime);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.aigcInfo);
        sbLIZ.append(", hasOriginAudio=");
        sbLIZ.append(this.hasOriginAudio);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.mimeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.absolutePath);
        parcel.writeString(this.libraryId);
        Long l = this.clipStartTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.clipEndTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeParcelable(this.aigcInfo, i);
        Boolean bool = this.hasOriginAudio;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.mimeType);
    }

    public final String getAbsolutePath() {
        return this.absolutePath;
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final Long getClipEndTime() {
        return this.clipEndTime;
    }

    public final Long getClipStartTime() {
        return this.clipStartTime;
    }

    public final Boolean getHasOriginAudio() {
        return this.hasOriginAudio;
    }

    public final String getLibraryId() {
        return this.libraryId;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setHasOriginAudio(Boolean bool) {
        this.hasOriginAudio = bool;
    }

    public EditMedia(String str, boolean z, String str2, String str3, Long l, Long l2, AIGCInfo aIGCInfo, Boolean bool, String str4) {
        this.path = str;
        this.isVideo = z;
        this.absolutePath = str2;
        this.libraryId = str3;
        this.clipStartTime = l;
        this.clipEndTime = l2;
        this.aigcInfo = aIGCInfo;
        this.hasOriginAudio = bool;
        this.mimeType = str4;
    }
}
