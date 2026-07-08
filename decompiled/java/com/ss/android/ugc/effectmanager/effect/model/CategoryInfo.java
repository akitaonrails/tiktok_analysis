package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CategoryInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<CategoryInfo> CREATOR = new Creator();

    @C09CT("category_key")
    public final String category_key;

    @C09CT("category_name")
    public final String category_name;

    @C09CT("extra")
    public final String extra;

    @C09CT("icon_url")
    public final String icon_url;

    @C09CT("is_default")
    public final boolean is_default;

    public static final class Creator implements Parcelable.Creator<CategoryInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryInfo createFromParcel(Parcel parcel) {
            return new CategoryInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryInfo[] newArray(int i) {
            return new CategoryInfo[i];
        }
    }

    public final CategoryInfo copy(String str, String str2, String str3, boolean z, String str4) {
        return new CategoryInfo(str, str2, str3, z, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        CategoryInfo categoryInfo = (CategoryInfo) obj;
        return Intrinsics.LJFF(this.category_key, categoryInfo.category_key) && Intrinsics.LJFF(this.category_name, categoryInfo.category_name) && Intrinsics.LJFF(this.icon_url, categoryInfo.icon_url) && this.is_default == categoryInfo.is_default && Intrinsics.LJFF(this.extra, categoryInfo.extra);
    }

    public int hashCode() {
        int iHashCode = ((((((this.category_key.hashCode() * 31) + this.category_name.hashCode()) * 31) + this.icon_url.hashCode()) * 31) + C786410Ut5.Z2(this.is_default)) * 31;
        String str = this.extra;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryInfo(category_key=");
        sbLIZ.append(this.category_key);
        sbLIZ.append(", category_name=");
        sbLIZ.append(this.category_name);
        sbLIZ.append(", icon_url=");
        sbLIZ.append(this.icon_url);
        sbLIZ.append(", is_default=");
        sbLIZ.append(this.is_default);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.category_key);
        parcel.writeString(this.category_name);
        parcel.writeString(this.icon_url);
        parcel.writeInt(this.is_default ? 1 : 0);
        parcel.writeString(this.extra);
    }

    public final String getCategory_key() {
        return this.category_key;
    }

    public final String getCategory_name() {
        return this.category_name;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final boolean is_default() {
        return this.is_default;
    }

    public CategoryInfo(String str, String str2, String str3, boolean z, String str4) {
        this.category_key = str;
        this.category_name = str2;
        this.icon_url = str3;
        this.is_default = z;
        this.extra = str4;
    }
}
