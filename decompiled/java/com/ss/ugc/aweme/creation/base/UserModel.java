package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.UserModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class UserModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<UserModel> CREATOR = new Parcelable.Creator<UserModel>() { // from class: X.0MhV
        @Override // android.os.Parcelable.Creator
        public final UserModel createFromParcel(Parcel parcel) {
            return new UserModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserModel[] newArray(int i) {
            return new UserModel[i];
        }
    };

    @C09CT("nickname")
    public String nickname;

    @C09CT("user_id")
    public String userId;

    public UserModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.nickname);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public UserModel(String str, String str2) {
        this.userId = str;
        this.nickname = str2;
    }
}
