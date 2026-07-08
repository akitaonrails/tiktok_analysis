package com.facebook.share.internal;

import X.C1D13;
import X.C2239461Cky;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public final String link;
    public final String linkCaption;
    public final String linkDescription;
    public final String linkName;
    public final String mediaSource;
    public final String picture;
    public final String toId;
    public static final C2239461Cky Companion = new Object() { // from class: X.1Cky
    };
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new C1D13(14);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.toId);
        parcel.writeString(this.link);
        parcel.writeString(this.linkName);
        parcel.writeString(this.linkCaption);
        parcel.writeString(this.linkDescription);
        parcel.writeString(this.picture);
        parcel.writeString(this.mediaSource);
    }
}
