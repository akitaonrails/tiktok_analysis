package com.facebook.share.model;

import android.os.Parcel;

/* JADX INFO: loaded from: classes35.dex */
public abstract class ShareMessengerActionButton implements ShareModel {
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton(Parcel parcel) {
        this.title = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }
}
