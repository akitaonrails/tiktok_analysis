package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ContactDetail implements Parcelable {

    @C09CT("icon")
    public Icon icon;

    @C09CT("link")
    public String link;

    @C09CT("text")
    public String text;
    public static final Parcelable.Creator<ContactDetail> CREATOR = new Parcelable.Creator<ContactDetail>() { // from class: X.02ZS
        @Override // android.os.Parcelable.Creator
        public final ContactDetail createFromParcel(Parcel parcel) {
            return new ContactDetail(parcel.readString(), (Icon) parcel.readParcelable(ContactDetail.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactDetail[] newArray(int i) {
            return new ContactDetail[i];
        }
    };
    public static final int $stable = 8;

    public ContactDetail() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactDetail)) {
            return false;
        }
        ContactDetail contactDetail = (ContactDetail) obj;
        return Intrinsics.LJFF(this.link, contactDetail.link) && Intrinsics.LJFF(this.icon, contactDetail.icon) && Intrinsics.LJFF(this.text, contactDetail.text);
    }

    public final int hashCode() {
        String str = this.link;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.text;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactDetail(link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.text);
    }

    public ContactDetail(String str, Icon icon, String str2) {
        this.link = str;
        this.icon = icon;
        this.text = str2;
    }
}
