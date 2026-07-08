package com.facebook.share.model;

import X.C1D13;
import X.C2239401Cks;
import X.C2239421Cku;
import X.EnumC2207061BZo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, C2239401Cks> {
    public final Uri localUrl;
    public final EnumC2207061BZo mediaType;
    public static final C2239421Cku Companion = new Object() { // from class: X.1Cku
    };
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C1D13(24);

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareVideo(Parcel parcel) {
        super(parcel);
        this.mediaType = EnumC2207061BZo.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public ShareVideo(C2239401Cks c2239401Cks) {
        super(c2239401Cks);
        this.mediaType = EnumC2207061BZo.VIDEO;
        this.localUrl = c2239401Cks.LIZJ;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
        parcel.writeParcelable(this.localUrl, 0);
    }
}
