package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VasBadgeModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VasBadgeModule implements Parcelable {

    @C09CT("icon")
    public Icon icon;

    @C09CT("popup")
    public String popup;

    @C09CT("vas_name")
    public String vasName;
    public static final Parcelable.Creator<VasBadgeModule> CREATOR = new Parcelable.Creator<VasBadgeModule>() { // from class: X.02bI
        @Override // android.os.Parcelable.Creator
        public final VasBadgeModule createFromParcel(Parcel parcel) {
            return new VasBadgeModule((Icon) parcel.readParcelable(VasBadgeModule.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasBadgeModule[] newArray(int i) {
            return new VasBadgeModule[i];
        }
    };
    public static final int $stable = 8;

    public VasBadgeModule() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasBadgeModule)) {
            return false;
        }
        VasBadgeModule vasBadgeModule = (VasBadgeModule) obj;
        return Intrinsics.LJFF(this.icon, vasBadgeModule.icon) && Intrinsics.LJFF(this.vasName, vasBadgeModule.vasName) && Intrinsics.LJFF(this.popup, vasBadgeModule.popup);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.vasName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.popup;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VasBadgeModule(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", vasName=");
        sbLIZ.append(this.vasName);
        sbLIZ.append(", popup=");
        sbLIZ.append(this.popup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.vasName);
        parcel.writeString(this.popup);
    }

    public VasBadgeModule(Icon icon, String str, String str2) {
        this.icon = icon;
        this.vasName = str;
        this.popup = str2;
    }
}
