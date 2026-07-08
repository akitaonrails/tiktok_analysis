package com.ss.android.ugc.aweme.creative.model.platform;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.platform.OpenPlatformModel;

/* JADX INFO: loaded from: classes23.dex */
public final class OpenPlatformModel implements Parcelable {
    public static final Parcelable.Creator<OpenPlatformModel> CREATOR = new Parcelable.Creator<OpenPlatformModel>() { // from class: X.0nWt
        @Override // android.os.Parcelable.Creator
        public final OpenPlatformModel createFromParcel(Parcel parcel) {
            return new OpenPlatformModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OpenPlatformModel[] newArray(int i) {
            return new OpenPlatformModel[i];
        }
    };

    @C040H
    public String clientId;

    @C09CT("open_platform_client_key")
    public String openPlatformClientKey;

    @C09CT("open_platform_extra")
    public String openPlatformExtra;

    @C040H
    public String shareId;

    public OpenPlatformModel() {
        this(null, null, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.openPlatformExtra);
        parcel.writeString(this.openPlatformClientKey);
        parcel.writeString(this.shareId);
        parcel.writeString(this.clientId);
    }

    public OpenPlatformModel(String str, String str2, String str3, String str4) {
        this.openPlatformExtra = str;
        this.openPlatformClientKey = str2;
        this.shareId = str3;
        this.clientId = str4;
    }
}
