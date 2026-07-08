package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TextStickerInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class TextStickerInfo implements Parcelable {
    public static final Parcelable.Creator<TextStickerInfo> CREATOR = new Parcelable.Creator<TextStickerInfo>() { // from class: X.0MQY
        @Override // android.os.Parcelable.Creator
        public final TextStickerInfo createFromParcel(Parcel parcel) {
            return new TextStickerInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerInfo[] newArray(int i) {
            return new TextStickerInfo[i];
        }
    };

    @C09CT("text_str")
    public String textStr;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textStr);
    }

    public TextStickerInfo() {
        this("");
    }

    public TextStickerInfo(String str) {
        this.textStr = str;
    }
}
