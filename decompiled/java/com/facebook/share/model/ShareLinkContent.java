package com.facebook.share.model;

import X.C1D13;
import X.C2239471Ckz;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public final String quote;
    public static final C2239471Ckz Companion = new Object() { // from class: X.1Ckz
    };
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C1D13(18);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.quote = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.quote);
    }
}
