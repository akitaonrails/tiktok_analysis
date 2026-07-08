package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExchangeInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ExchangeInfo implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("description")
    public final ECRichText description;

    @C09CT("leading_icon")
    public final Icon leadingIcon;
    public static final Parcelable.Creator<ExchangeInfo> CREATOR = new Parcelable.Creator<ExchangeInfo>() { // from class: X.03zM
        @Override // android.os.Parcelable.Creator
        public final ExchangeInfo createFromParcel(Parcel parcel) {
            return new ExchangeInfo((Icon) parcel.readParcelable(ExchangeInfo.class.getClassLoader()), (ECRichText) parcel.readParcelable(ExchangeInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExchangeInfo[] newArray(int i) {
            return new ExchangeInfo[i];
        }
    };
    public static final int $stable = 8;

    public ExchangeInfo() {
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
        if (!(obj instanceof ExchangeInfo)) {
            return false;
        }
        ExchangeInfo exchangeInfo = (ExchangeInfo) obj;
        return Intrinsics.LJFF(this.leadingIcon, exchangeInfo.leadingIcon) && Intrinsics.LJFF(this.description, exchangeInfo.description) && Intrinsics.LJFF(this.daInfo, exchangeInfo.daInfo);
    }

    public final int hashCode() {
        Icon icon = this.leadingIcon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.description;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExchangeInfo(leadingIcon=");
        sbLIZ.append(this.leadingIcon);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.leadingIcon, i);
        parcel.writeParcelable(this.description, i);
        parcel.writeString(this.daInfo);
    }

    public ExchangeInfo(Icon icon, ECRichText eCRichText, String str) {
        this.leadingIcon = icon;
        this.description = eCRichText;
        this.daInfo = str;
    }
}
