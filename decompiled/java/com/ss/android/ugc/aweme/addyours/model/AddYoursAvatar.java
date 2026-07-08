package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddYoursAvatar implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursAvatar> CREATOR = new Parcelable.Creator<AddYoursAvatar>() { // from class: X.02ng
        @Override // android.os.Parcelable.Creator
        public final AddYoursAvatar createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AddYoursAvatar(lValueOf, (UrlModel) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursAvatar[] newArray(int i) {
            return new AddYoursAvatar[i];
        }
    };

    @C09CT("uid")
    public Long uid;

    @C09CT("user_avatar")
    public UrlModel userAvatar;

    @C09CT("user_nickname")
    public String userNickname;

    public AddYoursAvatar() {
        this(null, null, null);
    }

    public final AddYoursAvatar copy(Long l, UrlModel urlModel, String str) {
        return new AddYoursAvatar(l, urlModel, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursAvatar)) {
            return false;
        }
        AddYoursAvatar addYoursAvatar = (AddYoursAvatar) obj;
        return Intrinsics.LJFF(this.uid, addYoursAvatar.uid) && Intrinsics.LJFF(this.userAvatar, addYoursAvatar.userAvatar) && Intrinsics.LJFF(this.userNickname, addYoursAvatar.userNickname);
    }

    public int hashCode() {
        Long l = this.uid;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        UrlModel urlModel = this.userAvatar;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.userNickname;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursAvatar(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", userAvatar=");
        sbLIZ.append(this.userAvatar);
        sbLIZ.append(", userNickname=");
        sbLIZ.append(this.userNickname);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.uid;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeSerializable(this.userAvatar);
        parcel.writeString(this.userNickname);
    }

    public final Long getUid() {
        return this.uid;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    public AddYoursAvatar(Long l, UrlModel urlModel, String str) {
        this.uid = l;
        this.userAvatar = urlModel;
        this.userNickname = str;
    }
}
