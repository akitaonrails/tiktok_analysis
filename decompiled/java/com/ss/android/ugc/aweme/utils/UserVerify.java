package com.ss.android.ugc.aweme.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.UserVerify;

/* JADX INFO: loaded from: classes7.dex */
public final class UserVerify implements Parcelable {
    public static final Parcelable.Creator<UserVerify> CREATOR = new Parcelable.Creator<UserVerify>() { // from class: X.0HX5
        @Override // android.os.Parcelable.Creator
        public final UserVerify createFromParcel(Parcel parcel) {
            Integer numValueOf;
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new UserVerify(urlModel, string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final UserVerify[] newArray(int i) {
            return new UserVerify[i];
        }
    };
    public final UrlModel avatarThumb;
    public final String customVerify;
    public final String enterpriseVerifyReason;
    public final Integer verificationType;

    public UserVerify() {
        this(null, null, null, -1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeSerializable(this.avatarThumb);
        parcel.writeString(this.customVerify);
        parcel.writeString(this.enterpriseVerifyReason);
        Integer num = this.verificationType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Integer getVerificationType() {
        return this.verificationType;
    }

    public UserVerify(UrlModel urlModel, String str, String str2, Integer num) {
        this.avatarThumb = urlModel;
        this.customVerify = str;
        this.enterpriseVerifyReason = str2;
        this.verificationType = num;
    }
}
