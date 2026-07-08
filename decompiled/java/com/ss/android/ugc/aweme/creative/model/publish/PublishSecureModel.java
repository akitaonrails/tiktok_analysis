package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PublishSecureModel;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishSecureModel implements Parcelable {
    public static final Parcelable.Creator<PublishSecureModel> CREATOR = new Parcelable.Creator<PublishSecureModel>() { // from class: X.0nWv
        @Override // android.os.Parcelable.Creator
        public final PublishSecureModel createFromParcel(Parcel parcel) {
            return new PublishSecureModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishSecureModel[] newArray(int i) {
            return new PublishSecureModel[i];
        }
    };

    @C09CT("cover_md5")
    public String coverMD5;

    @C09CT("cover_secure_salt")
    public String coverSecureSalt;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.coverSecureSalt);
        parcel.writeString(this.coverMD5);
    }

    public PublishSecureModel() {
        this("", "");
    }

    public PublishSecureModel(String str, String str2) {
        this.coverSecureSalt = str;
        this.coverMD5 = str2;
    }
}
