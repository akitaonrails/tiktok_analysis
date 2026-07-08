package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C09FQ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordStickerSegmentInfo implements Parcelable, Serializable {

    @C09CT("is_use_voice_recognize_sticker")
    public boolean isUseVoiceRecognizeSticker;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RecordStickerSegmentInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecordStickerSegmentInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordStickerSegmentInfo createFromParcel(Parcel parcel) {
            return new RecordStickerSegmentInfo(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordStickerSegmentInfo[] newArray(int i) {
            return new RecordStickerSegmentInfo[i];
        }
    }

    public RecordStickerSegmentInfo() {
        this(false);
    }

    public static final byte[] bundleToBytes(Bundle bundle) {
        return Companion.bundleToBytes(bundle);
    }

    public static final Bundle bytesToBundle(byte[] bArr) {
        return Companion.bytesToBundle(bArr);
    }

    public static final void register(C09FQ c09fq) {
        Companion.register(c09fq);
    }

    public final RecordStickerSegmentInfo copy(boolean z) {
        return new RecordStickerSegmentInfo(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecordStickerSegmentInfo) && this.isUseVoiceRecognizeSticker == ((RecordStickerSegmentInfo) obj).isUseVoiceRecognizeSticker;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.isUseVoiceRecognizeSticker);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordStickerSegmentInfo(isUseVoiceRecognizeSticker=");
        sbLIZ.append(this.isUseVoiceRecognizeSticker);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isUseVoiceRecognizeSticker ? 1 : 0);
    }

    public final boolean isUseVoiceRecognizeSticker() {
        return this.isUseVoiceRecognizeSticker;
    }

    public static final class Companion {
        public final byte[] bundleToBytes(Bundle bundle) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeBundle(bundle);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        }

        public final Bundle bytesToBundle(byte[] bArr) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(RecordStickerSegmentInfo.class.getClassLoader());
            parcelObtain.recycle();
            return bundle;
        }

        public final void register(C09FQ c09fq) {
            c09fq.LIZ(RecordStickerSegmentInfo.class, "extra_key_record_sticker_info");
        }
    }

    public RecordStickerSegmentInfo(boolean z) {
        this.isUseVoiceRecognizeSticker = z;
    }

    public final void setUseVoiceRecognizeSticker(boolean z) {
        this.isUseVoiceRecognizeSticker = z;
    }
}
