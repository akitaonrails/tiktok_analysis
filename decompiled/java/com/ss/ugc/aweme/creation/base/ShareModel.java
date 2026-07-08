package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.ShareModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class ShareModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShareModel> CREATOR = new Parcelable.Creator<ShareModel>() { // from class: X.0MiF
        @Override // android.os.Parcelable.Creator
        public final ShareModel createFromParcel(Parcel parcel) {
            return new ShareModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareModel[] newArray(int i) {
            return new ShareModel[i];
        }
    };

    @C09CT("open_platform_key")
    public String openPlatformKey;

    @C09CT("open_platform_share_id")
    public String openPlatformShareId;

    public ShareModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.openPlatformShareId);
        parcel.writeString(this.openPlatformKey);
    }

    public final String getOpenPlatformKey() {
        return this.openPlatformKey;
    }

    public final String getOpenPlatformShareId() {
        return this.openPlatformShareId;
    }

    public final void setOpenPlatformKey(String str) {
        this.openPlatformKey = str;
    }

    public final void setOpenPlatformShareId(String str) {
        this.openPlatformShareId = str;
    }

    public ShareModel(String str, String str2) {
        this.openPlatformShareId = str;
        this.openPlatformKey = str2;
    }
}
