package com.ss.android.ugc.aweme.cutsame;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class AuthorInfo implements Parcelable {

    @C09CT("avatar_thumb")
    public SimpleImage avatar;

    @C09CT("nickname")
    public String nickname;

    @C09CT("uid")
    public String uid;
    public static final Parcelable.Creator<AuthorInfo> CREATOR = new Parcelable.Creator<AuthorInfo>() { // from class: X.0mvk
        @Override // android.os.Parcelable.Creator
        public final AuthorInfo createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new AuthorInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorInfo[] newArray(int i) {
            return new AuthorInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
