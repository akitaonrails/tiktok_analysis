package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerCoverExtraData;

/* JADX INFO: loaded from: classes28.dex */
public final class TextStickerCoverExtraData implements Parcelable {
    public final boolean isPortrait;
    public static final Parcelable.Creator<TextStickerCoverExtraData> CREATOR = new Parcelable.Creator<TextStickerCoverExtraData>() { // from class: X.0wOR
        @Override // android.os.Parcelable.Creator
        public final TextStickerCoverExtraData createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TextStickerCoverExtraData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerCoverExtraData[] newArray(int i) {
            return new TextStickerCoverExtraData[i];
        }
    };
    public static final int $stable = 8;

    public TextStickerCoverExtraData() {
        this(true);
    }

    public final TextStickerCoverExtraData copy(boolean z) {
        return new TextStickerCoverExtraData(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextStickerCoverExtraData) && this.isPortrait == ((TextStickerCoverExtraData) obj).isPortrait;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.isPortrait);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStickerCoverExtraData(isPortrait=");
        sbLIZ.append(this.isPortrait);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isPortrait ? 1 : 0);
    }

    public final boolean isPortrait() {
        return this.isPortrait;
    }

    public TextStickerCoverExtraData(boolean z) {
        this.isPortrait = z;
    }
}
