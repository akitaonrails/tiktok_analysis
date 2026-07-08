package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.PortraitAuthor;
import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PortraitAuthor implements Parcelable {
    public static final Parcelable.Creator<PortraitAuthor> CREATOR = new Parcelable.Creator<PortraitAuthor>() { // from class: X.0MXs
        @Override // android.os.Parcelable.Creator
        public final PortraitAuthor createFromParcel(Parcel parcel) {
            PortraitUrlModel portraitUrlModelCreateFromParcel;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                portraitUrlModelCreateFromParcel = null;
            } else {
                portraitUrlModelCreateFromParcel = PortraitUrlModel.CREATOR.createFromParcel(parcel);
            }
            PortraitUrlModel portraitUrlModel = portraitUrlModelCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new PortraitAuthor(portraitUrlModel, string, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PortraitAuthor[] newArray(int i) {
            return new PortraitAuthor[i];
        }
    };

    @C09CT("avatar")
    public final PortraitUrlModel avatar;

    @C09CT("name")
    public final String name;

    @C09CT("user_id")
    public final Long userId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortraitAuthor)) {
            return false;
        }
        PortraitAuthor portraitAuthor = (PortraitAuthor) obj;
        return Intrinsics.LJFF(this.avatar, portraitAuthor.avatar) && Intrinsics.LJFF(this.name, portraitAuthor.name) && Intrinsics.LJFF(this.userId, portraitAuthor.userId);
    }

    public final int hashCode() {
        PortraitUrlModel portraitUrlModel = this.avatar;
        int iHashCode = (portraitUrlModel == null ? 0 : portraitUrlModel.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.userId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitAuthor(avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PortraitUrlModel portraitUrlModel = this.avatar;
        if (portraitUrlModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            portraitUrlModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.name);
        Long l = this.userId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public PortraitAuthor(PortraitUrlModel portraitUrlModel, String str, Long l) {
        this.avatar = portraitUrlModel;
        this.name = str;
        this.userId = l;
    }
}
