package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExposeUserRight implements Parcelable {

    @C09CT("icon")
    public Icon icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("name")
    public String name;

    @C09CT("name_en")
    public String nameEn;
    public static final Parcelable.Creator<ExposeUserRight> CREATOR = new Parcelable.Creator<ExposeUserRight>() { // from class: X.02ZO
        @Override // android.os.Parcelable.Creator
        public final ExposeUserRight createFromParcel(Parcel parcel) {
            return new ExposeUserRight(parcel.readString(), parcel.readString(), (Icon) parcel.readParcelable(ExposeUserRight.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExposeUserRight[] newArray(int i) {
            return new ExposeUserRight[i];
        }
    };
    public static final int $stable = 8;

    public ExposeUserRight() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposeUserRight)) {
            return false;
        }
        ExposeUserRight exposeUserRight = (ExposeUserRight) obj;
        return Intrinsics.LJFF(this.name, exposeUserRight.name) && Intrinsics.LJFF(this.nameEn, exposeUserRight.nameEn) && Intrinsics.LJFF(this.icon, exposeUserRight.icon) && Intrinsics.LJFF(this.id, exposeUserRight.id);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameEn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str3 = this.id;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposeUserRight(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", nameEn=");
        sbLIZ.append(this.nameEn);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.nameEn);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.id);
    }

    public ExposeUserRight(String str, String str2, Icon icon, String str3) {
        this.name = str;
        this.nameEn = str2;
        this.icon = icon;
        this.id = str3;
    }
}
