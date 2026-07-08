package com.ss.android.ugc.cut_ui;

import X.C0L89;
import X.C0VSJ;
import X.C786410Ut5;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.cut_ui.ItemCrop;
import com.ss.android.ugc.cut_ui.MediaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaItem implements Parcelable {
    public final String alignMode;
    public final int cartoonType;
    public final ItemCrop crop;
    public final float cropScale;
    public final long duration;
    public final String gamePlayAlgorithm;
    public final int height;
    public final boolean isMutable;
    public final boolean isReverse;
    public final boolean isSubVideo;
    public final String materialId;
    public final String mediaSrcPath;
    public final String source;
    public final long sourceStartTime;
    public final float speed;
    public final long targetEndTime;
    public final long targetStartTime;
    public final String type;
    public final float volume;
    public final int width;
    public static final C0L89 Companion = new Object() { // from class: X.0L89
    };
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: X.0L86
        @Override // android.os.Parcelable.Creator
        public final MediaItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
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
            return new MediaItem(string, j, j2, z, string2, z2, z3, parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readFloat(), ItemCrop.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaItem[] newArray(int i) {
            return new MediaItem[i];
        }
    };

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
        return Intrinsics.LJFF(this.materialId, mediaItem.materialId) && this.targetStartTime == mediaItem.targetStartTime && this.targetEndTime == mediaItem.targetEndTime && this.isMutable == mediaItem.isMutable && Intrinsics.LJFF(this.alignMode, mediaItem.alignMode) && this.isSubVideo == mediaItem.isSubVideo && this.isReverse == mediaItem.isReverse && this.cartoonType == mediaItem.cartoonType && Intrinsics.LJFF(this.gamePlayAlgorithm, mediaItem.gamePlayAlgorithm) && Float.compare(this.volume, mediaItem.volume) == 0 && this.width == mediaItem.width && this.height == mediaItem.height && this.duration == mediaItem.duration && Intrinsics.LJFF(this.source, mediaItem.source) && this.sourceStartTime == mediaItem.sourceStartTime && Float.compare(this.cropScale, mediaItem.cropScale) == 0 && Intrinsics.LJFF(this.crop, mediaItem.crop) && Intrinsics.LJFF(this.type, mediaItem.type) && Intrinsics.LJFF(this.mediaSrcPath, mediaItem.mediaSrcPath) && Float.compare(this.speed, mediaItem.speed) == 0;
    }

    public final String toString() {
        return "MediaItem(materialId=" + this.materialId + ", targetStartTime=" + this.targetStartTime + ", targetEndTime=" + this.targetEndTime + ", isMutable=" + this.isMutable + ", alignMode=" + this.alignMode + ", isSubVideo=" + this.isSubVideo + ", isReverse=" + this.isReverse + ", cartoonType=" + this.cartoonType + ", gamePlayAlgorithm=" + this.gamePlayAlgorithm + ", volume=" + this.volume + ", width=" + this.width + ", height=" + this.height + ", duration=" + this.duration + ", source=" + this.source + ", sourceStartTime=" + this.sourceStartTime + ", cropScale=" + this.cropScale + ", crop=" + this.crop + ", type=" + this.type + ", mediaSrcPath=" + this.mediaSrcPath + ", speed=" + this.speed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.materialId);
        parcel.writeLong(this.targetStartTime);
        parcel.writeLong(this.targetEndTime);
        parcel.writeInt(this.isMutable ? 1 : 0);
        parcel.writeString(this.alignMode);
        parcel.writeInt(this.isSubVideo ? 1 : 0);
        parcel.writeInt(this.isReverse ? 1 : 0);
        parcel.writeInt(this.cartoonType);
        parcel.writeString(this.gamePlayAlgorithm);
        parcel.writeFloat(this.volume);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeString(this.source);
        parcel.writeLong(this.sourceStartTime);
        parcel.writeFloat(this.cropScale);
        this.crop.writeToParcel(parcel, i);
        parcel.writeString(this.type);
        parcel.writeString(this.mediaSrcPath);
        parcel.writeFloat(this.speed);
    }

    public final Uri LIZIZ() {
        if (URLUtil.isValidUrl(this.source)) {
            return UriProtector.parse(this.source);
        }
        C0VSJ c0vsj = new C0VSJ(this.source);
        return (c0vsj.exists() && c0vsj.isFile()) ? Uri.fromFile(c0vsj) : Uri.EMPTY;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.materialId.hashCode() * 31) + C786410Ut5.Y2(this.targetStartTime)) * 31) + C786410Ut5.Y2(this.targetEndTime)) * 31) + C786410Ut5.Z2(this.isMutable)) * 31) + this.alignMode.hashCode()) * 31) + C786410Ut5.Z2(this.isSubVideo)) * 31) + C786410Ut5.Z2(this.isReverse)) * 31) + this.cartoonType) * 31) + this.gamePlayAlgorithm.hashCode()) * 31) + Float.floatToIntBits(this.volume)) * 31) + this.width) * 31) + this.height) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.source.hashCode()) * 31) + C786410Ut5.Y2(this.sourceStartTime)) * 31) + Float.floatToIntBits(this.cropScale)) * 31) + this.crop.hashCode()) * 31) + this.type.hashCode()) * 31) + this.mediaSrcPath.hashCode()) * 31) + Float.floatToIntBits(this.speed);
    }

    public static MediaItem LIZ(MediaItem mediaItem, String str, long j, long j2, boolean z, float f, int i, int i2, long j3, String str2, long j4, float f2, ItemCrop itemCrop, String str3, String str4, float f3, int i3) {
        boolean z2;
        String str5;
        boolean z3;
        float f4 = f3;
        String str6 = str4;
        String str7 = str3;
        long j5 = j4;
        String str8 = str2;
        ItemCrop itemCrop2 = itemCrop;
        int i4 = i2;
        long j6 = j2;
        float f5 = f2;
        int i5 = i;
        long j7 = j3;
        float f6 = f;
        boolean z4 = z;
        long j8 = j;
        String str9 = str;
        if ((i3 & 1) != 0) {
            str9 = mediaItem.materialId;
        }
        if ((i3 & 2) != 0) {
            j8 = mediaItem.targetStartTime;
        }
        if ((i3 & 4) != 0) {
            j6 = mediaItem.targetEndTime;
        }
        int i6 = 0;
        if ((i3 & 8) != 0) {
            z2 = mediaItem.isMutable;
        } else {
            z2 = false;
        }
        String str10 = null;
        if ((i3 & 16) != 0) {
            str5 = mediaItem.alignMode;
        } else {
            str5 = null;
        }
        if ((i3 & 32) != 0) {
            z3 = mediaItem.isSubVideo;
        } else {
            z3 = false;
        }
        if ((i3 & 64) != 0) {
            z4 = mediaItem.isReverse;
        }
        if ((i3 & 128) != 0) {
            i6 = mediaItem.cartoonType;
        }
        if ((i3 & 256) != 0) {
            str10 = mediaItem.gamePlayAlgorithm;
        }
        if ((i3 & 512) != 0) {
            f6 = mediaItem.volume;
        }
        if ((i3 & 1024) != 0) {
            i5 = mediaItem.width;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i4 = mediaItem.height;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            j7 = mediaItem.duration;
        }
        if ((i3 & 8192) != 0) {
            str8 = mediaItem.source;
        }
        if ((i3 & 16384) != 0) {
            j5 = mediaItem.sourceStartTime;
        }
        if ((32768 & i3) != 0) {
            f5 = mediaItem.cropScale;
        }
        if ((65536 & i3) != 0) {
            itemCrop2 = mediaItem.crop;
        }
        if ((131072 & i3) != 0) {
            str7 = mediaItem.type;
        }
        if ((262144 & i3) != 0) {
            str6 = mediaItem.mediaSrcPath;
        }
        if ((i3 & 524288) != 0) {
            f4 = mediaItem.speed;
        }
        mediaItem.getClass();
        return new MediaItem(str9, j8, j6, z2, str5, z3, z4, i6, str10, f6, i5, i4, j7, str8, j5, f5, itemCrop2, str7, str6, f4);
    }

    public MediaItem(String str, long j, long j2, boolean z, String str2, boolean z2, boolean z3, int i, String str3, float f, int i2, int i3, long j3, String str4, long j4, float f2, ItemCrop itemCrop, String str5, String str6, float f3) {
        this.materialId = str;
        this.targetStartTime = j;
        this.targetEndTime = j2;
        this.isMutable = z;
        this.alignMode = str2;
        this.isSubVideo = z2;
        this.isReverse = z3;
        this.cartoonType = i;
        this.gamePlayAlgorithm = str3;
        this.volume = f;
        this.width = i2;
        this.height = i3;
        this.duration = j3;
        this.source = str4;
        this.sourceStartTime = j4;
        this.cropScale = f2;
        this.crop = itemCrop;
        this.type = str5;
        this.mediaSrcPath = str6;
        this.speed = f3;
    }

    public /* synthetic */ MediaItem(String str, long j, long j2, boolean z, String str2, boolean z2, boolean z3, int i, String str3, float f, int i2, int i3, long j3, String str4, long j4, float f2, ItemCrop itemCrop, String str5, String str6, float f3, int i4) {
        this(str, j, j2, z, (i4 & 16) != 0 ? "" : str2, z2, z3, i, (i4 & 256) != 0 ? "" : str3, f, i2, i3, j3, (i4 & 8192) != 0 ? "" : str4, j4, f2, itemCrop, (131072 & i4) != 0 ? "" : str5, (262144 & i4) == 0 ? str6 : "", (i4 & 524288) != 0 ? 1.0f : f3);
    }
}
