package com.facebook.share.model;

import X.C1D13;
import X.C2239381Ckq;
import X.C2239401Cks;
import X.C2239431Ckv;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> {
    public final String contentDescription;
    public final String contentTitle;
    public final SharePhoto previewPhoto;
    public final ShareVideo video;
    public static final C2239431Ckv Companion = new Object() { // from class: X.1Ckv
    };
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new C1D13(25);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareVideoContent(Parcel parcel) {
        SharePhoto sharePhoto;
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        C2239381Ckq c2239381Ckq = new C2239381Ckq();
        SharePhoto sharePhoto2 = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        if (sharePhoto2 != null) {
            C786410Ut5.LJJIIJZLJL(c2239381Ckq.LIZ, sharePhoto2.params);
            c2239381Ckq.LIZJ = sharePhoto2.bitmap;
            c2239381Ckq.LIZLLL = sharePhoto2.imageUrl;
            c2239381Ckq.LJ = sharePhoto2.userGenerated;
            c2239381Ckq.LJFF = sharePhoto2.caption;
        }
        if (c2239381Ckq.LIZLLL == null && c2239381Ckq.LIZJ == null) {
            sharePhoto = null;
        } else {
            sharePhoto = new SharePhoto(c2239381Ckq);
        }
        this.previewPhoto = sharePhoto;
        C2239401Cks c2239401Cks = new C2239401Cks();
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            c2239401Cks.LIZJ = shareVideo.localUrl;
        }
        this.video = new ShareVideo(c2239401Cks);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.previewPhoto, 0);
        parcel.writeParcelable(this.video, 0);
    }
}
