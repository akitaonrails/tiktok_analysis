package com.facebook.share.model;

import X.C08FU;
import X.C1D13;
import X.C2207001BZi;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public final Uri fallbackUrl;
    public final boolean isMessengerExtensionURL;
    public final boolean shouldHideWebviewShareButton;
    public final Uri url;
    public final C08FU webviewHeightRatio;
    public static final C2207001BZi Companion = new Object() { // from class: X.1BZi
    };
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C1D13(20);

    public ShareMessengerURLActionButton(Parcel parcel) {
        boolean z;
        super(parcel);
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isMessengerExtensionURL = z;
        this.fallbackUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webviewHeightRatio = (C08FU) parcel.readSerializable();
        this.shouldHideWebviewShareButton = parcel.readByte() != 0;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.url, 0);
        parcel.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.fallbackUrl, 0);
        parcel.writeSerializable(this.webviewHeightRatio);
        parcel.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
    }
}
