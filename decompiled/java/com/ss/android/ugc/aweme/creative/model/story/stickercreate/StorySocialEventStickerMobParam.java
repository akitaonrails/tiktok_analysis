package com.ss.android.ugc.aweme.creative.model.story.stickercreate;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class StorySocialEventStickerMobParam implements Serializable, Parcelable {
    public static final Parcelable.Creator<StorySocialEventStickerMobParam> CREATOR = new Parcelable.Creator<StorySocialEventStickerMobParam>() { // from class: X.0nmb
        @Override // android.os.Parcelable.Creator
        public final StorySocialEventStickerMobParam createFromParcel(Parcel parcel) {
            return new StorySocialEventStickerMobParam(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StorySocialEventStickerMobParam[] newArray(int i) {
            return new StorySocialEventStickerMobParam[i];
        }
    };

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("shoot_way")
    public String shootWay;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
    }

    public StorySocialEventStickerMobParam() {
        this("", "", "");
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public StorySocialEventStickerMobParam(String str, String str2, String str3) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.enterMethod = str3;
    }
}
