package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpDaInfoMetaItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuHeaderTopLabelsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPanelHeaderTopLabelsDivider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuHeaderTopLabelsGroup implements Parcelable {

    @C09CT("da_info_meta")
    public final List<SeaPdpDaInfoMetaItem> daInfoMeta;

    @C09CT("divider")
    public final SkuPanelHeaderTopLabelsDivider divider;

    @C09CT("elements")
    public final List<SkuHeaderTopLabelItem> elements;
    public static final Parcelable.Creator<SkuHeaderTopLabelsGroup> CREATOR = new Parcelable.Creator<SkuHeaderTopLabelsGroup>() { // from class: X.045h
        @Override // android.os.Parcelable.Creator
        public final SkuHeaderTopLabelsGroup createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SkuPanelHeaderTopLabelsDivider skuPanelHeaderTopLabelsDividerCreateFromParcel;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SkuHeaderTopLabelItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                skuPanelHeaderTopLabelsDividerCreateFromParcel = null;
            } else {
                skuPanelHeaderTopLabelsDividerCreateFromParcel = SkuPanelHeaderTopLabelsDivider.CREATOR.createFromParcel(parcel);
            }
            SkuPanelHeaderTopLabelsDivider skuPanelHeaderTopLabelsDivider = skuPanelHeaderTopLabelsDividerCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SeaPdpDaInfoMetaItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new SkuHeaderTopLabelsGroup(arrayList, skuPanelHeaderTopLabelsDivider, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuHeaderTopLabelsGroup[] newArray(int i) {
            return new SkuHeaderTopLabelsGroup[i];
        }
    };
    public static final int $stable = 8;

    public SkuHeaderTopLabelsGroup() {
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
        if (!(obj instanceof SkuHeaderTopLabelsGroup)) {
            return false;
        }
        SkuHeaderTopLabelsGroup skuHeaderTopLabelsGroup = (SkuHeaderTopLabelsGroup) obj;
        return Intrinsics.LJFF(this.elements, skuHeaderTopLabelsGroup.elements) && Intrinsics.LJFF(this.divider, skuHeaderTopLabelsGroup.divider) && Intrinsics.LJFF(this.daInfoMeta, skuHeaderTopLabelsGroup.daInfoMeta);
    }

    public final int hashCode() {
        List<SkuHeaderTopLabelItem> list = this.elements;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        SkuPanelHeaderTopLabelsDivider skuPanelHeaderTopLabelsDivider = this.divider;
        int iHashCode2 = (iHashCode + (skuPanelHeaderTopLabelsDivider == null ? 0 : skuPanelHeaderTopLabelsDivider.hashCode())) * 31;
        List<SeaPdpDaInfoMetaItem> list2 = this.daInfoMeta;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuHeaderTopLabelsGroup(elements=");
        sbLIZ.append(this.elements);
        sbLIZ.append(", divider=");
        sbLIZ.append(this.divider);
        sbLIZ.append(", daInfoMeta=");
        sbLIZ.append(this.daInfoMeta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SkuHeaderTopLabelItem> list = this.elements;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SkuHeaderTopLabelItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SkuPanelHeaderTopLabelsDivider skuPanelHeaderTopLabelsDivider = this.divider;
        if (skuPanelHeaderTopLabelsDivider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuPanelHeaderTopLabelsDivider.writeToParcel(parcel, i);
        }
        List<SeaPdpDaInfoMetaItem> list2 = this.daInfoMeta;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<SeaPdpDaInfoMetaItem> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public SkuHeaderTopLabelsGroup(List<SkuHeaderTopLabelItem> list, SkuPanelHeaderTopLabelsDivider skuPanelHeaderTopLabelsDivider, List<SeaPdpDaInfoMetaItem> list2) {
        this.elements = list;
        this.divider = skuPanelHeaderTopLabelsDivider;
        this.daInfoMeta = list2;
    }
}
