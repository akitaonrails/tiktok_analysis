package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicyModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingPolicySection;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingPolicyModule implements Parcelable {

    @C09CT("entry_text")
    public final ECRichText entryText;

    @C09CT("sections")
    public final List<ShippingPolicySection> sections;

    @C09CT("title")
    public final String title;
    public static final Parcelable.Creator<ShippingPolicyModule> CREATOR = new Parcelable.Creator<ShippingPolicyModule>() { // from class: X.03ph
        @Override // android.os.Parcelable.Creator
        public final ShippingPolicyModule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ShippingPolicyModule.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ShippingPolicySection.CREATOR.createFromParcel(parcel));
                }
            }
            return new ShippingPolicyModule(eCRichText, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingPolicyModule[] newArray(int i) {
            return new ShippingPolicyModule[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingPolicyModule)) {
            return false;
        }
        ShippingPolicyModule shippingPolicyModule = (ShippingPolicyModule) obj;
        return Intrinsics.LJFF(this.entryText, shippingPolicyModule.entryText) && Intrinsics.LJFF(this.title, shippingPolicyModule.title) && Intrinsics.LJFF(this.sections, shippingPolicyModule.sections);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.entryText;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ShippingPolicySection> list = this.sections;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingPolicyModule(entryText=");
        sbLIZ.append(this.entryText);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", sections=");
        sbLIZ.append(this.sections);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.entryText, i);
        parcel.writeString(this.title);
        List<ShippingPolicySection> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ShippingPolicySection> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public ShippingPolicyModule(ECRichText eCRichText, String str, List<ShippingPolicySection> list) {
        this.entryText = eCRichText;
        this.title = str;
        this.sections = list;
    }
}
