package com.ss.android.ugc.aweme.tools.mvtemplate.preview;

import X.C0L88;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mvtheme.MvItemCrop;
import com.ss.android.ugc.aweme.tools.mvtemplate.preview.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaItem implements Parcelable {
    public final String alignMode;
    public final MvItemCrop crop;
    public final float cropScale;
    public final long duration;
    public final int height;
    public final boolean isMutable;
    public final boolean isReverse;
    public final boolean isSubVideo;
    public final String materialId;
    public final String mediaSrcPath;
    public final String source;
    public final long sourceStartTime;
    public final long targetStartTime;
    public final String type;
    public final int width;
    public static final C0L88 Companion = new Object() { // from class: X.0L88
    };
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: X.0L85
        @Override // android.os.Parcelable.Creator
        public final MediaItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new MediaItem(string, j, z, string2, z2, z3, parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readFloat(), (MvItemCrop) parcel.readParcelable(MediaItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaItem[] newArray(int i) {
            return new MediaItem[i];
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
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Intrinsics.LJFF(this.materialId, mediaItem.materialId) && this.targetStartTime == mediaItem.targetStartTime && this.isMutable == mediaItem.isMutable && Intrinsics.LJFF(this.alignMode, mediaItem.alignMode) && this.isSubVideo == mediaItem.isSubVideo && this.isReverse == mediaItem.isReverse && this.width == mediaItem.width && this.height == mediaItem.height && this.duration == mediaItem.duration && Intrinsics.LJFF(this.source, mediaItem.source) && this.sourceStartTime == mediaItem.sourceStartTime && Float.compare(this.cropScale, mediaItem.cropScale) == 0 && Intrinsics.LJFF(this.crop, mediaItem.crop) && Intrinsics.LJFF(this.type, mediaItem.type) && Intrinsics.LJFF(this.mediaSrcPath, mediaItem.mediaSrcPath);
    }

    public final String toString() {
        return "MediaItem(materialId=" + this.materialId + ", targetStartTime=" + this.targetStartTime + ", isMutable=" + this.isMutable + ", alignMode=" + this.alignMode + ", isSubVideo=" + this.isSubVideo + ", isReverse=" + this.isReverse + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", source=" + this.source + ", sourceStartTime=" + this.sourceStartTime + ", cropScale=" + this.cropScale + ", crop=" + this.crop + ", type=" + this.type + ", mediaSrcPath=" + this.mediaSrcPath + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.materialId);
        parcel.writeLong(this.targetStartTime);
        parcel.writeInt(this.isMutable ? 1 : 0);
        parcel.writeString(this.alignMode);
        parcel.writeInt(this.isSubVideo ? 1 : 0);
        parcel.writeInt(this.isReverse ? 1 : 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeString(this.source);
        parcel.writeLong(this.sourceStartTime);
        parcel.writeFloat(this.cropScale);
        parcel.writeParcelable(this.crop, i);
        parcel.writeString(this.type);
        parcel.writeString(this.mediaSrcPath);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((this.materialId.hashCode() * 31) + C786410Ut5.Y2(this.targetStartTime)) * 31) + C786410Ut5.Z2(this.isMutable)) * 31) + this.alignMode.hashCode()) * 31) + C786410Ut5.Z2(this.isSubVideo)) * 31) + C786410Ut5.Z2(this.isReverse)) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.source.hashCode()) * 31) + C786410Ut5.Y2(this.sourceStartTime)) * 31) + Float.floatToIntBits(this.cropScale)) * 31) + this.crop.hashCode()) * 31) + this.type.hashCode()) * 31) + this.mediaSrcPath.hashCode();
    }

    public MediaItem(String str, long j, boolean z, String str2, boolean z2, boolean z3, int i, int i2, long j2, String str3, long j3, float f, MvItemCrop mvItemCrop, String str4, String str5) {
        this.materialId = str;
        this.targetStartTime = j;
        this.isMutable = z;
        this.alignMode = str2;
        this.isSubVideo = z2;
        this.isReverse = z3;
        this.width = i;
        this.height = i2;
        this.duration = j2;
        this.source = str3;
        this.sourceStartTime = j3;
        this.cropScale = f;
        this.crop = mvItemCrop;
        this.type = str4;
        this.mediaSrcPath = str5;
    }
}
