package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ProductHighlightData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ProductHighlightData implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("module_items")
    public final List<IconLabelItem> items;

    @C09CT("popup")
    public final BasicPopUp popUp;

    @C09CT("module_title")
    public final ECRichText title;
    public static final Parcelable.Creator<ProductHighlightData> CREATOR = new Parcelable.Creator<ProductHighlightData>() { // from class: X.0mhC
        @Override // android.os.Parcelable.Creator
        public final ProductHighlightData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ProductHighlightData.class.getClassLoader());
            BasicPopUp basicPopUpCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(IconLabelItem.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                basicPopUpCreateFromParcel = BasicPopUp.CREATOR.createFromParcel(parcel);
            }
            return new ProductHighlightData(eCRichText, arrayList, string, basicPopUpCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductHighlightData[] newArray(int i) {
            return new ProductHighlightData[i];
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
        if (!(obj instanceof ProductHighlightData)) {
            return false;
        }
        ProductHighlightData productHighlightData = (ProductHighlightData) obj;
        return Intrinsics.LJFF(this.title, productHighlightData.title) && Intrinsics.LJFF(this.items, productHighlightData.items) && Intrinsics.LJFF(this.daInfo, productHighlightData.daInfo) && Intrinsics.LJFF(this.popUp, productHighlightData.popUp);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        List<IconLabelItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BasicPopUp basicPopUp = this.popUp;
        return iHashCode3 + (basicPopUp != null ? basicPopUp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductHighlightData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", popUp=");
        sbLIZ.append(this.popUp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        List<IconLabelItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<IconLabelItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
        BasicPopUp basicPopUp = this.popUp;
        if (basicPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicPopUp.writeToParcel(parcel, i);
        }
    }

    public ProductHighlightData(ECRichText eCRichText, List<IconLabelItem> list, String str, BasicPopUp basicPopUp) {
        this.title = eCRichText;
        this.items = list;
        this.daInfo = str;
        this.popUp = basicPopUp;
    }
}
