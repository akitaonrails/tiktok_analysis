package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropToolTip;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SalePropToolTip implements Parcelable {

    @C09CT("rich_text")
    public ECRichText richText;
    public static final Parcelable.Creator<SalePropToolTip> CREATOR = new Parcelable.Creator<SalePropToolTip>() { // from class: X.02lU
        @Override // android.os.Parcelable.Creator
        public final SalePropToolTip createFromParcel(Parcel parcel) {
            return new SalePropToolTip((ECRichText) parcel.readParcelable(SalePropToolTip.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SalePropToolTip[] newArray(int i) {
            return new SalePropToolTip[i];
        }
    };
    public static final int $stable = 8;

    public SalePropToolTip() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SalePropToolTip) && Intrinsics.LJFF(this.richText, ((SalePropToolTip) obj).richText);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.richText;
        if (eCRichText == null) {
            return 0;
        }
        return eCRichText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SalePropToolTip(richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.richText, i);
    }

    public SalePropToolTip(ECRichText eCRichText) {
        this.richText = eCRichText;
    }
}
