package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.HashtagStickerExtraModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class HashtagStickerExtraModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<HashtagStickerExtraModel> CREATOR = new Parcelable.Creator<HashtagStickerExtraModel>() { // from class: X.0Mhh
        @Override // android.os.Parcelable.Creator
        public final HashtagStickerExtraModel createFromParcel(Parcel parcel) {
            return new HashtagStickerExtraModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HashtagStickerExtraModel[] newArray(int i) {
            return new HashtagStickerExtraModel[i];
        }
    };

    @C09CT("text")
    public String text;

    public HashtagStickerExtraModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public final String getText() {
        return this.text;
    }

    public HashtagStickerExtraModel(String str) {
        this.text = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
