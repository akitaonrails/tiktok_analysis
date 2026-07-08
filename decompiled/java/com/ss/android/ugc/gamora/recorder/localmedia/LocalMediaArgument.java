package com.ss.android.ugc.gamora.recorder.localmedia;

import X.C531120KsI;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalMediaArgument implements Parcelable {
    public final int chooseRequestCode;
    public final int chooseScene;
    public final int dmChatType;
    public final boolean enableMultiVideo;
    public final Bundle extraBundle;
    public final String hintText;
    public final boolean isFromGroupShot;
    public final int maxPhotoCount;
    public final int maxSelectableVideoDuration;
    public final int maxVideoCount;
    public final long minDuration;
    public final int minPhotoCount;
    public final int minSelectableVideoDuration;
    public final int minVideoCount;
    public final int requestCode;
    public final String sessionId;
    public final String shootWay;
    public final boolean shouldDisplayTnsNotice;
    public final int supportFlag;
    public final int tnsNoticeRes;
    public static final C531120KsI CREATOR = new Parcelable.Creator<LocalMediaArgument>() { // from class: X.0KsI
        @Override // android.os.Parcelable.Creator
        public final LocalMediaArgument createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i4 = parcel.readInt();
            long j = parcel.readLong();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 != null) {
                str = string2;
            }
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new LocalMediaArgument(i, i2, i3, z, i4, j, i5, i6, i7, i8, i9, i10, z2, i11, i12, string, str, z3, null, null, 786432);
        }

        @Override // android.os.Parcelable.Creator
        public final LocalMediaArgument[] newArray(int i) {
            return new LocalMediaArgument[i];
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
        if (!(obj instanceof LocalMediaArgument)) {
            return false;
        }
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
        return this.chooseRequestCode == localMediaArgument.chooseRequestCode && this.requestCode == localMediaArgument.requestCode && this.supportFlag == localMediaArgument.supportFlag && this.enableMultiVideo == localMediaArgument.enableMultiVideo && this.chooseScene == localMediaArgument.chooseScene && this.minDuration == localMediaArgument.minDuration && this.minPhotoCount == localMediaArgument.minPhotoCount && this.maxPhotoCount == localMediaArgument.maxPhotoCount && this.minVideoCount == localMediaArgument.minVideoCount && this.maxVideoCount == localMediaArgument.maxVideoCount && this.minSelectableVideoDuration == localMediaArgument.minSelectableVideoDuration && this.maxSelectableVideoDuration == localMediaArgument.maxSelectableVideoDuration && this.shouldDisplayTnsNotice == localMediaArgument.shouldDisplayTnsNotice && this.tnsNoticeRes == localMediaArgument.tnsNoticeRes && this.dmChatType == localMediaArgument.dmChatType && Intrinsics.LJFF(this.sessionId, localMediaArgument.sessionId) && Intrinsics.LJFF(this.hintText, localMediaArgument.hintText) && this.isFromGroupShot == localMediaArgument.isFromGroupShot && Intrinsics.LJFF(this.extraBundle, localMediaArgument.extraBundle) && Intrinsics.LJFF(this.shootWay, localMediaArgument.shootWay);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((((((((((((((((((this.chooseRequestCode * 31) + this.requestCode) * 31) + this.supportFlag) * 31) + C786410Ut5.Z2(this.enableMultiVideo)) * 31) + this.chooseScene) * 31) + C786410Ut5.Y2(this.minDuration)) * 31) + this.minPhotoCount) * 31) + this.maxPhotoCount) * 31) + this.minVideoCount) * 31) + this.maxVideoCount) * 31) + this.minSelectableVideoDuration) * 31) + this.maxSelectableVideoDuration) * 31) + C786410Ut5.Z2(this.shouldDisplayTnsNotice)) * 31) + this.tnsNoticeRes) * 31) + this.dmChatType) * 31) + this.sessionId.hashCode()) * 31) + this.hintText.hashCode()) * 31) + C786410Ut5.Z2(this.isFromGroupShot)) * 31;
        Bundle bundle = this.extraBundle;
        return ((iZ2 + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.shootWay.hashCode();
    }

    public final String toString() {
        return "LocalMediaArgument(chooseRequestCode=" + this.chooseRequestCode + ", requestCode=" + this.requestCode + ", supportFlag=" + this.supportFlag + ", enableMultiVideo=" + this.enableMultiVideo + ", chooseScene=" + this.chooseScene + ", minDuration=" + this.minDuration + ", minPhotoCount=" + this.minPhotoCount + ", maxPhotoCount=" + this.maxPhotoCount + ", minVideoCount=" + this.minVideoCount + ", maxVideoCount=" + this.maxVideoCount + ", minSelectableVideoDuration=" + this.minSelectableVideoDuration + ", maxSelectableVideoDuration=" + this.maxSelectableVideoDuration + ", shouldDisplayTnsNotice=" + this.shouldDisplayTnsNotice + ", tnsNoticeRes=" + this.tnsNoticeRes + ", dmChatType=" + this.dmChatType + ", sessionId=" + this.sessionId + ", hintText=" + this.hintText + ", isFromGroupShot=" + this.isFromGroupShot + ", extraBundle=" + this.extraBundle + ", shootWay=" + this.shootWay + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.chooseRequestCode);
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.supportFlag);
        parcel.writeByte(this.enableMultiVideo ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.chooseScene);
        parcel.writeLong(this.minDuration);
        parcel.writeInt(this.minPhotoCount);
        parcel.writeInt(this.maxPhotoCount);
        parcel.writeInt(this.minVideoCount);
        parcel.writeInt(this.maxVideoCount);
        parcel.writeInt(this.minSelectableVideoDuration);
        parcel.writeInt(this.maxSelectableVideoDuration);
        parcel.writeByte(this.shouldDisplayTnsNotice ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.tnsNoticeRes);
        parcel.writeInt(this.dmChatType);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.hintText);
        parcel.writeByte(this.isFromGroupShot ? (byte) 1 : (byte) 0);
        Bundle bundle = this.extraBundle;
        if (bundle != null) {
            parcel.writeBundle(bundle);
        }
    }

    public LocalMediaArgument(int i, int i2, int i3, boolean z, int i4, long j, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, int i11, int i12, String str, String str2, boolean z3, Bundle bundle, String str3, int i13) {
        int i14 = i7;
        Bundle bundle2 = bundle;
        String str4 = str2;
        int i15 = i11;
        boolean z4 = z2;
        int i16 = i10;
        String str5 = str;
        int i17 = i9;
        int i18 = (i13 & 128) != 0 ? 12 : i6;
        i14 = (i13 & 256) != 0 ? 1 : i14;
        int i19 = (i13 & 512) == 0 ? i8 : 12;
        i17 = (i13 & 1024) != 0 ? -1 : i17;
        i16 = (i13 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i16;
        z4 = (i13 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z4;
        i15 = (i13 & 8192) != 0 ? 0 : i15;
        int i20 = (i13 & 16384) == 0 ? i12 : -1;
        str5 = (32768 & i13) != 0 ? "" : str5;
        str4 = (65536 & i13) != 0 ? "" : str4;
        boolean z5 = (131072 & i13) == 0 ? z3 : false;
        bundle2 = (262144 & i13) != 0 ? null : bundle2;
        String str6 = (i13 & 524288) == 0 ? str3 : "";
        this.chooseRequestCode = i;
        this.requestCode = i2;
        this.supportFlag = i3;
        this.enableMultiVideo = z;
        this.chooseScene = i4;
        this.minDuration = j;
        this.minPhotoCount = i5;
        this.maxPhotoCount = i18;
        this.minVideoCount = i14;
        this.maxVideoCount = i19;
        this.minSelectableVideoDuration = i17;
        this.maxSelectableVideoDuration = i16;
        this.shouldDisplayTnsNotice = z4;
        this.tnsNoticeRes = i15;
        this.dmChatType = i20;
        this.sessionId = str5;
        this.hintText = str4;
        this.isFromGroupShot = z5;
        this.extraBundle = bundle2;
        this.shootWay = str6;
    }
}
