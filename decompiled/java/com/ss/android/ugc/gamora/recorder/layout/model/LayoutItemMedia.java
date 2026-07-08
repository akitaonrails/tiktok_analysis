package com.ss.android.ugc.gamora.recorder.layout.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LayoutItemMedia implements Parcelable {
    public final AIGCInfo aigcInfo;
    public final String filePath;
    public int layoutIndex;
    public int livePhotoIndex;
    public final LayoutMediaSource mediaSource;
    public final LayoutMediaType mediaType;
    public int photoIndex;
    public final TimeSpeedModelExtension shortVideoSegment;
    public int videoIndex;
    public static final Parcelable.Creator<LayoutItemMedia> CREATOR = new Parcelable.Creator<LayoutItemMedia>() { // from class: X.0L2h
        @Override // android.os.Parcelable.Creator
        public final LayoutItemMedia createFromParcel(Parcel parcel) {
            return new LayoutItemMedia((LayoutMediaType) parcel.readParcelable(LayoutItemMedia.class.getClassLoader()), (LayoutMediaSource) parcel.readParcelable(LayoutItemMedia.class.getClassLoader()), parcel.readString(), (TimeSpeedModelExtension) parcel.readParcelable(LayoutItemMedia.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (AIGCInfo) parcel.readParcelable(LayoutItemMedia.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LayoutItemMedia[] newArray(int i) {
            return new LayoutItemMedia[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutItemMedia)) {
            return false;
        }
        LayoutItemMedia layoutItemMedia = (LayoutItemMedia) obj;
        return this.mediaType == layoutItemMedia.mediaType && this.mediaSource == layoutItemMedia.mediaSource && Intrinsics.LJFF(this.filePath, layoutItemMedia.filePath) && Intrinsics.LJFF(this.shortVideoSegment, layoutItemMedia.shortVideoSegment) && this.layoutIndex == layoutItemMedia.layoutIndex && this.videoIndex == layoutItemMedia.videoIndex && this.photoIndex == layoutItemMedia.photoIndex && this.livePhotoIndex == layoutItemMedia.livePhotoIndex && Intrinsics.LJFF(this.aigcInfo, layoutItemMedia.aigcInfo);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.mediaType.hashCode() * 31) + this.mediaSource.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.shortVideoSegment.hashCode()) * 31) + this.layoutIndex) * 31) + this.videoIndex) * 31) + this.photoIndex) * 31) + this.livePhotoIndex) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        return iHashCode + (aIGCInfo == null ? 0 : aIGCInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutItemMedia(mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", mediaSource=");
        sbLIZ.append(this.mediaSource);
        sbLIZ.append(", filePath=");
        sbLIZ.append(this.filePath);
        sbLIZ.append(", shortVideoSegment=");
        sbLIZ.append(this.shortVideoSegment);
        sbLIZ.append(", layoutIndex=");
        sbLIZ.append(this.layoutIndex);
        sbLIZ.append(", videoIndex=");
        sbLIZ.append(this.videoIndex);
        sbLIZ.append(", photoIndex=");
        sbLIZ.append(this.photoIndex);
        sbLIZ.append(", livePhotoIndex=");
        sbLIZ.append(this.livePhotoIndex);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.aigcInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mediaType, i);
        parcel.writeParcelable(this.mediaSource, i);
        parcel.writeString(this.filePath);
        parcel.writeParcelable(this.shortVideoSegment, i);
        parcel.writeInt(this.layoutIndex);
        parcel.writeInt(this.videoIndex);
        parcel.writeInt(this.photoIndex);
        parcel.writeInt(this.livePhotoIndex);
        parcel.writeParcelable(this.aigcInfo, i);
    }

    public /* synthetic */ LayoutItemMedia(LayoutMediaType layoutMediaType, LayoutMediaSource layoutMediaSource, String str, TimeSpeedModelExtension timeSpeedModelExtension, int i, AIGCInfo aIGCInfo) {
        this(layoutMediaType, layoutMediaSource, str, timeSpeedModelExtension, i, -1, -1, -1, aIGCInfo);
    }

    public LayoutItemMedia(LayoutMediaType layoutMediaType, LayoutMediaSource layoutMediaSource, String str, TimeSpeedModelExtension timeSpeedModelExtension, int i, int i2, int i3, int i4, AIGCInfo aIGCInfo) {
        this.mediaType = layoutMediaType;
        this.mediaSource = layoutMediaSource;
        this.filePath = str;
        this.shortVideoSegment = timeSpeedModelExtension;
        this.layoutIndex = i;
        this.videoIndex = i2;
        this.photoIndex = i3;
        this.livePhotoIndex = i4;
        this.aigcInfo = aIGCInfo;
    }
}
