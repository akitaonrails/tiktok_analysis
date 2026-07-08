package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C1698130uI7;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes26.dex */
public class FaceStickerCommerceBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerCommerceBean> CREATOR = new C1698130uI7(3);

    @C09CT("commerce_sticker_buy_text")
    public String commerceStickerBuyText;

    @C09CT("commerce_sticker_open_url")
    public String commerceStickerOpenUrl;

    @C09CT("commerce_sticker_type")
    public int commerceStickerType;

    @C09CT("commerce_sticker_web_url")
    public String commerceStickerWebUrl;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FaceStickerCommerceBean(Parcel parcel) {
        this.commerceStickerWebUrl = parcel.readString();
        this.commerceStickerOpenUrl = parcel.readString();
        this.commerceStickerBuyText = parcel.readString();
        this.commerceStickerType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.commerceStickerWebUrl);
        parcel.writeString(this.commerceStickerOpenUrl);
        parcel.writeString(this.commerceStickerBuyText);
        parcel.writeInt(this.commerceStickerType);
    }
}
