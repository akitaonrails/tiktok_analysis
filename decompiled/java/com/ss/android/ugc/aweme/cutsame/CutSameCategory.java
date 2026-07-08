package com.ss.android.ugc.aweme.cutsame;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.CutSameCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CutSameCategory implements Parcelable {

    @C09CT("category_key")
    public final String categoryKey;

    @C09CT("category_name")
    public final String categoryName;

    @C09CT("clear_after_merge")
    public boolean clearAfterMerge;

    @C09CT("extra")
    public final String extra;

    @C09CT("category_is_default")
    public final boolean isDefault;

    @C09CT("url_prefix")
    public List<String> urlPrefix;
    public static final Parcelable.Creator<CutSameCategory> CREATOR = new Parcelable.Creator<CutSameCategory>() { // from class: X.0me8
        @Override // android.os.Parcelable.Creator
        public final CutSameCategory createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CutSameCategory(string, string2, z, string3, arrayListCreateStringArrayList, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameCategory[] newArray(int i) {
            return new CutSameCategory[i];
        }
    };
    public static final int $stable = 8;

    public CutSameCategory() {
        this("", "", false, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameCategory)) {
            return false;
        }
        CutSameCategory cutSameCategory = (CutSameCategory) obj;
        return Intrinsics.LJFF(this.categoryKey, cutSameCategory.categoryKey) && Intrinsics.LJFF(this.categoryName, cutSameCategory.categoryName) && this.isDefault == cutSameCategory.isDefault && Intrinsics.LJFF(this.extra, cutSameCategory.extra) && Intrinsics.LJFF(this.urlPrefix, cutSameCategory.urlPrefix) && this.clearAfterMerge == cutSameCategory.clearAfterMerge;
    }

    public final int hashCode() {
        int iHashCode = ((((this.categoryKey.hashCode() * 31) + this.categoryName.hashCode()) * 31) + C786410Ut5.Z2(this.isDefault)) * 31;
        String str = this.extra;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.urlPrefix;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.clearAfterMerge);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSameCategory(categoryKey=");
        sbLIZ.append(this.categoryKey);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.categoryName);
        sbLIZ.append(", isDefault=");
        sbLIZ.append(this.isDefault);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", urlPrefix=");
        sbLIZ.append(this.urlPrefix);
        sbLIZ.append(", clearAfterMerge=");
        sbLIZ.append(this.clearAfterMerge);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.categoryKey);
        parcel.writeString(this.categoryName);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeString(this.extra);
        parcel.writeStringList(this.urlPrefix);
        parcel.writeInt(this.clearAfterMerge ? 1 : 0);
    }

    public CutSameCategory(String str, String str2, boolean z, String str3, List<String> list, boolean z2) {
        this.categoryKey = str;
        this.categoryName = str2;
        this.isDefault = z;
        this.extra = str3;
        this.urlPrefix = list;
        this.clearAfterMerge = z2;
    }
}
