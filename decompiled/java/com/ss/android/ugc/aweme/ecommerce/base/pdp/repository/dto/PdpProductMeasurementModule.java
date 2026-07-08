package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpProductMeasurementModule implements Parcelable {

    @C09CT("color_sale_prop_id")
    public final String colorSalePropId;

    @C09CT("see_more_text")
    public final LinkRichText seeMoreText;

    @C09CT("size_sale_prop_id")
    public final String sizeSalePropId;

    @C09CT("specs")
    public final List<Specification> specs;
    public static final Parcelable.Creator<PdpProductMeasurementModule> CREATOR = new Parcelable.Creator<PdpProductMeasurementModule>() { // from class: X.02qL
        @Override // android.os.Parcelable.Creator
        public final PdpProductMeasurementModule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            LinkRichText linkRichTextCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Specification.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new PdpProductMeasurementModule(string, string2, arrayList, linkRichTextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpProductMeasurementModule[] newArray(int i) {
            return new PdpProductMeasurementModule[i];
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
        if (!(obj instanceof PdpProductMeasurementModule)) {
            return false;
        }
        PdpProductMeasurementModule pdpProductMeasurementModule = (PdpProductMeasurementModule) obj;
        return Intrinsics.LJFF(this.colorSalePropId, pdpProductMeasurementModule.colorSalePropId) && Intrinsics.LJFF(this.sizeSalePropId, pdpProductMeasurementModule.sizeSalePropId) && Intrinsics.LJFF(this.specs, pdpProductMeasurementModule.specs) && Intrinsics.LJFF(this.seeMoreText, pdpProductMeasurementModule.seeMoreText);
    }

    public final int hashCode() {
        String str = this.colorSalePropId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sizeSalePropId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Specification> list = this.specs;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LinkRichText linkRichText = this.seeMoreText;
        return iHashCode3 + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpProductMeasurementModule(colorSalePropId=");
        sbLIZ.append(this.colorSalePropId);
        sbLIZ.append(", sizeSalePropId=");
        sbLIZ.append(this.sizeSalePropId);
        sbLIZ.append(", specs=");
        sbLIZ.append(this.specs);
        sbLIZ.append(", seeMoreText=");
        sbLIZ.append(this.seeMoreText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.colorSalePropId);
        parcel.writeString(this.sizeSalePropId);
        List<Specification> list = this.specs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Specification> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        LinkRichText linkRichText = this.seeMoreText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
    }

    public PdpProductMeasurementModule(String str, String str2, List<Specification> list, LinkRichText linkRichText) {
        this.colorSalePropId = str;
        this.sizeSalePropId = str2;
        this.specs = list;
        this.seeMoreText = linkRichText;
    }
}
