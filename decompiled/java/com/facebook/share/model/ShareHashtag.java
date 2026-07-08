package com.facebook.share.model;

import X.C1D13;
import X.C2239361Cko;
import X.C2239371Ckp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareHashtag implements ShareModel {
    public final String hashtag;
    public static final C2239371Ckp Companion = new Object() { // from class: X.1Ckp
    };
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C1D13(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareHashtag(Parcel parcel) {
        this.hashtag = parcel.readString();
    }

    public ShareHashtag(C2239361Cko c2239361Cko) {
        this.hashtag = c2239361Cko.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hashtag);
    }
}
