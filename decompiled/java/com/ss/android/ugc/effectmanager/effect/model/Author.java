package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Author implements Serializable, Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new Creator();

    @C09CT("avatar")
    public final Avatar avatar;

    @C09CT("name")
    public final String name;

    @C09CT("source")
    public final Long source;

    @C09CT("uid")
    public final String uid;

    public static final class Creator implements Parcelable.Creator<Author> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Author createFromParcel(Parcel parcel) {
            return new Author(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Avatar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Author[] newArray(int i) {
            return new Author[i];
        }
    }

    public final Author copy(String str, String str2, Avatar avatar, Long l) {
        return new Author(str, str2, avatar, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return Intrinsics.LJFF(this.uid, author.uid) && Intrinsics.LJFF(this.name, author.name) && Intrinsics.LJFF(this.avatar, author.avatar) && Intrinsics.LJFF(this.source, author.source);
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Avatar avatar = this.avatar;
        int iHashCode3 = (iHashCode2 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        Long l = this.source;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Author(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.name);
        Avatar avatar = this.avatar;
        if (avatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatar.writeToParcel(parcel, i);
        }
        Long l = this.source;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getSource() {
        return this.source;
    }

    public final String getUid() {
        return this.uid;
    }

    public Author(String str, String str2, Avatar avatar, Long l) {
        this.uid = str;
        this.name = str2;
        this.avatar = avatar;
        this.source = l;
    }
}
