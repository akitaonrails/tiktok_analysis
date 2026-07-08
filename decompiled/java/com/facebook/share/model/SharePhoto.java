package com.facebook.share.model;

import X.C1D13;
import X.C2239381Ckq;
import X.C2239411Ckt;
import X.EnumC2207061BZo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, C2239381Ckq> {
    public final Bitmap bitmap;
    public final String caption;
    public final Uri imageUrl;
    public final EnumC2207061BZo mediaType;
    public final boolean userGenerated;
    public static final C2239411Ckt Companion = new Object() { // from class: X.1Ckt
    };
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C1D13(21);

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SharePhoto(Parcel parcel) {
        boolean z;
        super(parcel);
        this.mediaType = EnumC2207061BZo.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.userGenerated = z;
        this.caption = parcel.readString();
    }

    public SharePhoto(C2239381Ckq c2239381Ckq) {
        super(c2239381Ckq);
        this.mediaType = EnumC2207061BZo.PHOTO;
        this.bitmap = c2239381Ckq.LIZJ;
        this.imageUrl = c2239381Ckq.LIZLLL;
        this.userGenerated = c2239381Ckq.LJ;
        this.caption = c2239381Ckq.LJFF;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        parcel.writeString(this.caption);
    }
}
