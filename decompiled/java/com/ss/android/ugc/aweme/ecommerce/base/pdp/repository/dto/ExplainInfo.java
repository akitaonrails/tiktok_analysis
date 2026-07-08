package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExplainInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ExplainInfo implements Parcelable {

    @C09CT("desc")
    public final String desc;

    @C09CT("icon")
    public final Icon icon;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<ExplainInfo> CREATOR = new Parcelable.Creator<ExplainInfo>() { // from class: X.0vbh
        @Override // android.os.Parcelable.Creator
        public final ExplainInfo createFromParcel(Parcel parcel) {
            return new ExplainInfo((Icon) parcel.readParcelable(ExplainInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExplainInfo[] newArray(int i) {
            return new ExplainInfo[i];
        }
    };
    public static final int $stable = 8;

    public ExplainInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExplainInfo)) {
            return false;
        }
        ExplainInfo explainInfo = (ExplainInfo) obj;
        return Intrinsics.LJFF(this.icon, explainInfo.icon) && Intrinsics.LJFF(this.title, explainInfo.title) && Intrinsics.LJFF(this.desc, explainInfo.desc);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExplainInfo(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
    }

    public ExplainInfo(Icon icon, String str, String str2) {
        this.icon = icon;
        this.title = str;
        this.desc = str2;
    }
}
