package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.callroom.api.model.CallUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CallUser implements Parcelable {
    public static final Parcelable.Creator<CallUser> CREATOR = new Parcelable.Creator<CallUser>() { // from class: X.0ivQ
        @Override // android.os.Parcelable.Creator
        public final CallUser createFromParcel(Parcel parcel) {
            return new CallUser((UrlModel) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallUser[] newArray(int i) {
            return new CallUser[i];
        }
    };
    public final UrlModel avatar;
    public final String displayName;
    public final String relationTag;
    public final String userId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallUser)) {
            return false;
        }
        CallUser callUser = (CallUser) obj;
        return Intrinsics.LJFF(this.avatar, callUser.avatar) && Intrinsics.LJFF(this.userId, callUser.userId) && Intrinsics.LJFF(this.displayName, callUser.displayName) && Intrinsics.LJFF(this.relationTag, callUser.relationTag);
    }

    public final int hashCode() {
        UrlModel urlModel = this.avatar;
        return ((((((urlModel == null ? 0 : urlModel.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.relationTag.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallUser(avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.displayName);
        sbLIZ.append(", relationTag=");
        sbLIZ.append(this.relationTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.avatar);
        parcel.writeString(this.userId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.relationTag);
    }

    public /* synthetic */ CallUser(String str, String str2) {
        this(null, str, str2, "");
    }

    public CallUser(UrlModel urlModel, String str, String str2, String str3) {
        this.avatar = urlModel;
        this.userId = str;
        this.displayName = str2;
        this.relationTag = str3;
    }
}
