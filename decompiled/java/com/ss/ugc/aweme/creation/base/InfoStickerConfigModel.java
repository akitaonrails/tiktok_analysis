package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.InfoStickerConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class InfoStickerConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<InfoStickerConfigModel> CREATOR = new Parcelable.Creator<InfoStickerConfigModel>() { // from class: X.0mg5
        @Override // android.os.Parcelable.Creator
        public final InfoStickerConfigModel createFromParcel(Parcel parcel) {
            return new InfoStickerConfigModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoStickerConfigModel[] newArray(int i) {
            return new InfoStickerConfigModel[i];
        }
    };

    @C09CT("effect_identifier")
    public String effectIdentifier;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectIdentifier);
    }

    public InfoStickerConfigModel() {
        this("");
    }

    public final String getEffectIdentifier() {
        return this.effectIdentifier;
    }

    public InfoStickerConfigModel(String str) {
        this.effectIdentifier = str;
    }

    public final void setEffectIdentifier(String str) {
        this.effectIdentifier = str;
    }
}
