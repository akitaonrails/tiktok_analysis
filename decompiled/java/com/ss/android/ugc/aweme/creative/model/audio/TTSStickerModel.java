package com.ss.android.ugc.aweme.creative.model.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.TTSStickerModel;

/* JADX INFO: loaded from: classes23.dex */
public final class TTSStickerModel implements Parcelable {
    public static final Parcelable.Creator<TTSStickerModel> CREATOR = new Parcelable.Creator<TTSStickerModel>() { // from class: X.0nX8
        @Override // android.os.Parcelable.Creator
        public final TTSStickerModel createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new TTSStickerModel();
        }

        @Override // android.os.Parcelable.Creator
        public final TTSStickerModel[] newArray(int i) {
            return new TTSStickerModel[i];
        }
    };
    public boolean autoAddTTSStickerOnce;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
