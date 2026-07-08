package com.ss.android.ugc.aweme.infosticker;

import X.C09CT;
import X.C1438340nX6;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes23.dex */
public final class InfoStickerCategoryParams implements Serializable, Parcelable {
    public static final C1438340nX6 CREATOR = new Parcelable.Creator<InfoStickerCategoryParams>() { // from class: X.0nX6
        @Override // android.os.Parcelable.Creator
        public final InfoStickerCategoryParams createFromParcel(Parcel parcel) {
            return new InfoStickerCategoryParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InfoStickerCategoryParams[] newArray(int i) {
            return new InfoStickerCategoryParams[i];
        }
    };

    @C09CT("info_sticker_category")
    public LinkedHashMap<String, String> infoStickerCategoryMap;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InfoStickerCategoryParams() {
        this.infoStickerCategoryMap = new LinkedHashMap<>();
    }

    public final LinkedHashMap<String, String> getInfoStickerCategoryMap() {
        return this.infoStickerCategoryMap;
    }

    public InfoStickerCategoryParams(Parcel parcel) {
        this();
        this.infoStickerCategoryMap = (LinkedHashMap) parcel.readSerializable();
    }

    public final void setInfoStickerCategoryMap(LinkedHashMap<String, String> linkedHashMap) {
        this.infoStickerCategoryMap = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.infoStickerCategoryMap);
    }
}
