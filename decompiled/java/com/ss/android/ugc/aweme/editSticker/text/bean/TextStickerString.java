package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;

/* JADX INFO: loaded from: classes30.dex */
public final class TextStickerString implements Parcelable {
    public static final Parcelable.Creator<TextStickerString> CREATOR = new Parcelable.Creator<TextStickerString>() { // from class: X.11y7
        @Override // android.os.Parcelable.Creator
        public final TextStickerString createFromParcel(Parcel parcel) {
            return new TextStickerString(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerString[] newArray(int i) {
            return new TextStickerString[i];
        }
    };
    public final String str;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.str);
    }

    public final String getStr() {
        return this.str;
    }

    public TextStickerString(String str) {
        this.str = str;
    }
}
