package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C0MY0;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItemCrop;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CutSameMediaItem implements Parcelable {
    public static final Parcelable.Creator<CutSameMediaItem> CREATOR = new Parcelable.Creator<CutSameMediaItem>() { // from class: X.0L8C
        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItem createFromParcel(Parcel parcel) {
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
            return new CutSameMediaItem(string, j, z, string2, z2, z3, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readFloat(), CutSameMediaItemCrop.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameMediaItem[] newArray(int i) {
            return new CutSameMediaItem[i];
        }
    };

    @C09CT("alignMode")
    public final String alignMode;

    @C09CT("cartoonType")
    public final int cartoonType;

    @C09CT("crop")
    public final CutSameMediaItemCrop crop;

    @C09CT("cropScale")
    public final float cropScale;

    @C09CT("duration")
    public final long duration;

    @C09CT("gamePlayAlgorithm")
    public final String gamePlayAlgorithm;

    @C09CT("height")
    public final int height;

    @C09CT("isMutable")
    public final boolean isMutable;

    @C09CT("isReverse")
    public final boolean isReverse;

    @C09CT("isSubVideo")
    public final boolean isSubVideo;

    @C09CT("materialId")
    public final String materialId;

    @C09CT("mediaSrc")
    public final String mediaSrc;

    @C09CT("source")
    @C0MY0
    public final String source;

    @C09CT("sourceStartTime")
    public final long sourceStartTime;

    @C09CT("targetEndTime")
    public final long targetEndTime;

    @C09CT("targetStartTime")
    public final long targetStartTime;

    @C09CT("type")
    public final String type;

    @C09CT("volume")
    public final float volume;

    @C09CT("width")
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameMediaItem)) {
            return false;
        }
        CutSameMediaItem cutSameMediaItem = (CutSameMediaItem) obj;
        return Intrinsics.LJFF(this.materialId, cutSameMediaItem.materialId) && this.targetStartTime == cutSameMediaItem.targetStartTime && this.isMutable == cutSameMediaItem.isMutable && Intrinsics.LJFF(this.alignMode, cutSameMediaItem.alignMode) && this.isSubVideo == cutSameMediaItem.isSubVideo && this.isReverse == cutSameMediaItem.isReverse && this.cartoonType == cutSameMediaItem.cartoonType && this.width == cutSameMediaItem.width && this.height == cutSameMediaItem.height && this.duration == cutSameMediaItem.duration && Intrinsics.LJFF(this.source, cutSameMediaItem.source) && this.sourceStartTime == cutSameMediaItem.sourceStartTime && Float.compare(this.cropScale, cutSameMediaItem.cropScale) == 0 && Intrinsics.LJFF(this.crop, cutSameMediaItem.crop) && Intrinsics.LJFF(this.type, cutSameMediaItem.type) && Intrinsics.LJFF(this.mediaSrc, cutSameMediaItem.mediaSrc) && Intrinsics.LJFF(this.gamePlayAlgorithm, cutSameMediaItem.gamePlayAlgorithm) && this.targetEndTime == cutSameMediaItem.targetEndTime && Float.compare(this.volume, cutSameMediaItem.volume) == 0;
    }

    public final String toString() {
        return "CutSameMediaItem(materialId=" + this.materialId + ", targetStartTime=" + this.targetStartTime + ", isMutable=" + this.isMutable + ", alignMode=" + this.alignMode + ", isSubVideo=" + this.isSubVideo + ", isReverse=" + this.isReverse + ", cartoonType=" + this.cartoonType + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", source=" + this.source + ", sourceStartTime=" + this.sourceStartTime + ", cropScale=" + this.cropScale + ", crop=" + this.crop + ", type=" + this.type + ", mediaSrc=" + this.mediaSrc + ", gamePlayAlgorithm=" + this.gamePlayAlgorithm + ", targetEndTime=" + this.targetEndTime + ", volume=" + this.volume + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.materialId);
        parcel.writeLong(this.targetStartTime);
        parcel.writeInt(this.isMutable ? 1 : 0);
        parcel.writeString(this.alignMode);
        parcel.writeInt(this.isSubVideo ? 1 : 0);
        parcel.writeInt(this.isReverse ? 1 : 0);
        parcel.writeInt(this.cartoonType);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeString(this.source);
        parcel.writeLong(this.sourceStartTime);
        parcel.writeFloat(this.cropScale);
        this.crop.writeToParcel(parcel, i);
        parcel.writeString(this.type);
        parcel.writeString(this.mediaSrc);
        parcel.writeString(this.gamePlayAlgorithm);
        parcel.writeLong(this.targetEndTime);
        parcel.writeFloat(this.volume);
    }

    public CutSameMediaItem() {
        this("", 0L, false, "", false, false, 0, 0, 0, 0L, "", 0L, 0.0f, new CutSameMediaItemCrop(0.0f, 0.0f, 0.0f, 0.0f), "", "", "", 0L, 0.0f);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.materialId.hashCode() * 31) + C786410Ut5.Y2(this.targetStartTime)) * 31) + C786410Ut5.Z2(this.isMutable)) * 31) + this.alignMode.hashCode()) * 31) + C786410Ut5.Z2(this.isSubVideo)) * 31) + C786410Ut5.Z2(this.isReverse)) * 31) + this.cartoonType) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Y2(this.duration)) * 31;
        String str = this.source;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.sourceStartTime)) * 31) + Float.floatToIntBits(this.cropScale)) * 31) + this.crop.hashCode()) * 31) + this.type.hashCode()) * 31) + this.mediaSrc.hashCode()) * 31;
        String str2 = this.gamePlayAlgorithm;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.targetEndTime)) * 31) + Float.floatToIntBits(this.volume);
    }

    public CutSameMediaItem(String str, long j, boolean z, String str2, boolean z2, boolean z3, int i, int i2, int i3, long j2, String str3, long j3, float f, CutSameMediaItemCrop cutSameMediaItemCrop, String str4, String str5, String str6, long j4, float f2) {
        this.materialId = str;
        this.targetStartTime = j;
        this.isMutable = z;
        this.alignMode = str2;
        this.isSubVideo = z2;
        this.isReverse = z3;
        this.cartoonType = i;
        this.width = i2;
        this.height = i3;
        this.duration = j2;
        this.source = str3;
        this.sourceStartTime = j3;
        this.cropScale = f;
        this.crop = cutSameMediaItemCrop;
        this.type = str4;
        this.mediaSrc = str5;
        this.gamePlayAlgorithm = str6;
        this.targetEndTime = j4;
        this.volume = f2;
    }
}
