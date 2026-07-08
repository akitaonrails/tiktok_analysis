package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AffiliateLabel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AffiliateLabel implements Parcelable {

    @C09CT("icon")
    public final Icon icon;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<AffiliateLabel> CREATOR = new Parcelable.Creator<AffiliateLabel>() { // from class: X.02tQ
        @Override // android.os.Parcelable.Creator
        public final AffiliateLabel createFromParcel(Parcel parcel) {
            return new AffiliateLabel((Icon) parcel.readParcelable(AffiliateLabel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AffiliateLabel[] newArray(int i) {
            return new AffiliateLabel[i];
        }
    };
    public static final int $stable = 8;

    public AffiliateLabel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AffiliateLabel)) {
            return false;
        }
        AffiliateLabel affiliateLabel = (AffiliateLabel) obj;
        return Intrinsics.LJFF(this.icon, affiliateLabel.icon) && Intrinsics.LJFF(this.title, affiliateLabel.title);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AffiliateLabel(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.title);
    }

    public AffiliateLabel(Icon icon, String str) {
        this.icon = icon;
        this.title = str;
    }
}
