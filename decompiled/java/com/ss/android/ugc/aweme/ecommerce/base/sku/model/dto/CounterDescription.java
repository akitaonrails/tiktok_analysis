package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.CounterDescription;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CounterDescription implements Parcelable {

    @C09CT("rich_text")
    public ECRichText text;
    public static final Parcelable.Creator<CounterDescription> CREATOR = new Parcelable.Creator<CounterDescription>() { // from class: X.02mb
        @Override // android.os.Parcelable.Creator
        public final CounterDescription createFromParcel(Parcel parcel) {
            return new CounterDescription((ECRichText) parcel.readParcelable(CounterDescription.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CounterDescription[] newArray(int i) {
            return new CounterDescription[i];
        }
    };
    public static final int $stable = 8;

    public CounterDescription() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CounterDescription) && Intrinsics.LJFF(this.text, ((CounterDescription) obj).text);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        if (eCRichText == null) {
            return 0;
        }
        return eCRichText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CounterDescription(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
    }

    public CounterDescription(ECRichText eCRichText) {
        this.text = eCRichText;
    }
}
