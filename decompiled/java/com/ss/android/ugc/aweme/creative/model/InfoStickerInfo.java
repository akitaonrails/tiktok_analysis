package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.InfoStickerInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class InfoStickerInfo implements Parcelable {
    public static final Parcelable.Creator<InfoStickerInfo> CREATOR = new Parcelable.Creator<InfoStickerInfo>() { // from class: X.0MQX
        @Override // android.os.Parcelable.Creator
        public final InfoStickerInfo createFromParcel(Parcel parcel) {
            return new InfoStickerInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoStickerInfo[] newArray(int i) {
            return new InfoStickerInfo[i];
        }
    };

    @C09CT("effect_id")
    public String effectId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectId);
    }

    public InfoStickerInfo() {
        this("");
    }

    public InfoStickerInfo(String str) {
        this.effectId = str;
    }
}
