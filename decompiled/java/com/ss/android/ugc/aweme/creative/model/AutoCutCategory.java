package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutCategory implements Parcelable {
    public static final Parcelable.Creator<AutoCutCategory> CREATOR = new Parcelable.Creator<AutoCutCategory>() { // from class: X.0me6
        @Override // android.os.Parcelable.Creator
        public final AutoCutCategory createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AutoCutCategory(string, string2, z, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutCategory[] newArray(int i) {
            return new AutoCutCategory[i];
        }
    };

    @C09CT("autocut_category_key")
    public final String categoryKey;

    @C09CT("autocut_category_name")
    public final String categoryName;

    @C09CT("extra")
    public final String extra;

    @C09CT("autocut_category_is_default")
    public final boolean isDefault;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;

    public AutoCutCategory() {
        this(null, null, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutCategory)) {
            return false;
        }
        AutoCutCategory autoCutCategory = (AutoCutCategory) obj;
        return Intrinsics.LJFF(this.categoryKey, autoCutCategory.categoryKey) && Intrinsics.LJFF(this.categoryName, autoCutCategory.categoryName) && this.isDefault == autoCutCategory.isDefault && Intrinsics.LJFF(this.extra, autoCutCategory.extra) && Intrinsics.LJFF(this.urlPrefix, autoCutCategory.urlPrefix);
    }

    public final int hashCode() {
        String str = this.categoryKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryName;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.isDefault)) * 31;
        String str3 = this.extra;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.urlPrefix;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutCategory(categoryKey=");
        sbLIZ.append(this.categoryKey);
        sbLIZ.append(", categoryName=");
        sbLIZ.append(this.categoryName);
        sbLIZ.append(", isDefault=");
        sbLIZ.append(this.isDefault);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", urlPrefix=");
        sbLIZ.append(this.urlPrefix);
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
    }

    public AutoCutCategory(String str, String str2, boolean z, String str3, List<String> list) {
        this.categoryKey = str;
        this.categoryName = str2;
        this.isDefault = z;
        this.extra = str3;
        this.urlPrefix = list;
    }
}
