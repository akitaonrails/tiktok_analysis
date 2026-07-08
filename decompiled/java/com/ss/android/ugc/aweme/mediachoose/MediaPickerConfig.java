package com.ss.android.ugc.aweme.mediachoose;

import X.C13BV;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.mediachoose.MediaPickerConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MediaPickerConfig implements Parcelable {
    public final int chooseScene;
    public final String durationError;
    public final boolean enableMultiMedia;
    public final String formatError;
    public final List<String> formats;
    public final boolean hideSelectedMediaBar;
    public final String hintText;
    public final String maxCountError;
    public final double maxDurationSec;
    public final int maxSelectCount;
    public final long maxSizeBytes;
    public final double minDurationSec;
    public final int minSelectCount;
    public final boolean previewNextPopsPreview;
    public final String selectedMediaHandler;
    public final String sizeError;
    public final int supportFlag;
    public final String sureBtnText;
    public static final Parcelable.Creator<MediaPickerConfig> CREATOR = new Parcelable.Creator<MediaPickerConfig>() { // from class: X.0Kj7
        @Override // android.os.Parcelable.Creator
        public final MediaPickerConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            return new MediaPickerConfig(i, i2, i3, i4, z, string, string2, string3, z2, z3, parcel.createStringArrayList(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPickerConfig[] newArray(int i) {
            return new MediaPickerConfig[i];
        }
    };
    public static final int $stable = 8;

    public MediaPickerConfig() {
        this(null, null, null, null, 0L, null, 0.0d, 0.0d, null, null, 262143);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerConfig)) {
            return false;
        }
        MediaPickerConfig mediaPickerConfig = (MediaPickerConfig) obj;
        return this.supportFlag == mediaPickerConfig.supportFlag && this.chooseScene == mediaPickerConfig.chooseScene && this.maxSelectCount == mediaPickerConfig.maxSelectCount && this.minSelectCount == mediaPickerConfig.minSelectCount && this.enableMultiMedia == mediaPickerConfig.enableMultiMedia && Intrinsics.LJFF(this.selectedMediaHandler, mediaPickerConfig.selectedMediaHandler) && Intrinsics.LJFF(this.hintText, mediaPickerConfig.hintText) && Intrinsics.LJFF(this.sureBtnText, mediaPickerConfig.sureBtnText) && this.previewNextPopsPreview == mediaPickerConfig.previewNextPopsPreview && this.hideSelectedMediaBar == mediaPickerConfig.hideSelectedMediaBar && Intrinsics.LJFF(this.formats, mediaPickerConfig.formats) && Intrinsics.LJFF(this.formatError, mediaPickerConfig.formatError) && this.maxSizeBytes == mediaPickerConfig.maxSizeBytes && Intrinsics.LJFF(this.sizeError, mediaPickerConfig.sizeError) && Double.compare(this.minDurationSec, mediaPickerConfig.minDurationSec) == 0 && Double.compare(this.maxDurationSec, mediaPickerConfig.maxDurationSec) == 0 && Intrinsics.LJFF(this.durationError, mediaPickerConfig.durationError) && Intrinsics.LJFF(this.maxCountError, mediaPickerConfig.maxCountError);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((this.supportFlag * 31) + this.chooseScene) * 31) + this.maxSelectCount) * 31) + this.minSelectCount) * 31) + C786410Ut5.Z2(this.enableMultiMedia)) * 31) + this.selectedMediaHandler.hashCode()) * 31;
        String str = this.hintText;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sureBtnText;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.previewNextPopsPreview)) * 31) + C786410Ut5.Z2(this.hideSelectedMediaBar)) * 31) + this.formats.hashCode()) * 31;
        String str3 = this.formatError;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Y2(this.maxSizeBytes)) * 31;
        String str4 = this.sizeError;
        int iHashCode4 = (((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.X2(this.minDurationSec)) * 31) + C786410Ut5.X2(this.maxDurationSec)) * 31;
        String str5 = this.durationError;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxCountError;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "MediaPickerConfig(supportFlag=" + this.supportFlag + ", chooseScene=" + this.chooseScene + ", maxSelectCount=" + this.maxSelectCount + ", minSelectCount=" + this.minSelectCount + ", enableMultiMedia=" + this.enableMultiMedia + ", selectedMediaHandler=" + this.selectedMediaHandler + ", hintText=" + this.hintText + ", sureBtnText=" + this.sureBtnText + ", previewNextPopsPreview=" + this.previewNextPopsPreview + ", hideSelectedMediaBar=" + this.hideSelectedMediaBar + ", formats=" + this.formats + ", formatError=" + this.formatError + ", maxSizeBytes=" + this.maxSizeBytes + ", sizeError=" + this.sizeError + ", minDurationSec=" + this.minDurationSec + ", maxDurationSec=" + this.maxDurationSec + ", durationError=" + this.durationError + ", maxCountError=" + this.maxCountError + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportFlag);
        parcel.writeInt(this.chooseScene);
        parcel.writeInt(this.maxSelectCount);
        parcel.writeInt(this.minSelectCount);
        parcel.writeInt(this.enableMultiMedia ? 1 : 0);
        parcel.writeString(this.selectedMediaHandler);
        parcel.writeString(this.hintText);
        parcel.writeString(this.sureBtnText);
        parcel.writeInt(this.previewNextPopsPreview ? 1 : 0);
        parcel.writeInt(this.hideSelectedMediaBar ? 1 : 0);
        parcel.writeStringList(this.formats);
        parcel.writeString(this.formatError);
        parcel.writeLong(this.maxSizeBytes);
        parcel.writeString(this.sizeError);
        parcel.writeDouble(this.minDurationSec);
        parcel.writeDouble(this.maxDurationSec);
        parcel.writeString(this.durationError);
        parcel.writeString(this.maxCountError);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaPickerConfig(String str, String str2, List list, String str3, long j, String str4, double d, double d2, String str5, String str6, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str7;
        boolean z;
        boolean z2;
        double d3 = d2;
        String str8 = str4;
        long j2 = j;
        String str9 = str3;
        double d4 = d;
        String str10 = str2;
        List list2 = list;
        String str11 = str5;
        String str12 = str;
        if ((i & 1) != 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i3 = 64;
        } else {
            i3 = 0;
        }
        if ((i & 4) != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if ((i & 8) != 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if ((i & 32) != 0) {
            str7 = "IMPORT_THEN_BACK";
        } else {
            str7 = null;
        }
        str12 = (i & 64) != 0 ? null : str12;
        str10 = (i & 128) != 0 ? null : str10;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 512) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(i2, i3, i4, i5, false, str7, str12, str10, z, z2, (i & 1024) != 0 ? C13BV.INSTANCE : list2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str9, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1L : j2, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? -1.0d : d4, (32768 & i) != 0 ? -1.0d : d3, (65536 & i) != 0 ? null : str11, (i & 131072) == 0 ? str6 : null);
    }

    public MediaPickerConfig(int i, int i2, int i3, int i4, boolean z, String str, String str2, String str3, boolean z2, boolean z3, List<String> list, String str4, long j, String str5, double d, double d2, String str6, String str7) {
        this.supportFlag = i;
        this.chooseScene = i2;
        this.maxSelectCount = i3;
        this.minSelectCount = i4;
        this.enableMultiMedia = z;
        this.selectedMediaHandler = str;
        this.hintText = str2;
        this.sureBtnText = str3;
        this.previewNextPopsPreview = z2;
        this.hideSelectedMediaBar = z3;
        this.formats = list;
        this.formatError = str4;
        this.maxSizeBytes = j;
        this.sizeError = str5;
        this.minDurationSec = d;
        this.maxDurationSec = d2;
        this.durationError = str6;
        this.maxCountError = str7;
    }
}
