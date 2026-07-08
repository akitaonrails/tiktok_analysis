package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class ShopOrderShareStructInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStructInfo> CREATOR = new C1864730ycp(12);
    public ShopOrderShareStruct LL;
    public String LLILLJJLI;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStructInfo() {
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.LL;
    }

    public String getTitle() {
        return this.LLILLJJLI;
    }

    public ShopOrderShareStructInfo(Parcel parcel) {
        this.LL = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.LLILLJJLI = parcel.readString();
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct) {
        this.LL = shopOrderShareStruct;
    }

    public void setTitle(String str) {
        this.LLILLJJLI = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.LL, i);
        parcel.writeString(this.LLILLJJLI);
    }
}
