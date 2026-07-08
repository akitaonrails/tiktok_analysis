package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPAppendix;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModuleMeta;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ToastData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPShippingModule implements Parcelable {

    @C09CT("appendix_list")
    public final List<PDPAppendix> appendixList;

    @C09CT("description_list")
    public final List<LinkRichText> descriptionList;

    @C09CT("description_list_arrow")
    public final Icon descriptionListArrow;

    @C09CT("description_list_icon")
    public final Icon descriptionListIcon;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("meta")
    public final PDPShippingModuleMeta meta;

    @C09CT("toast")
    public final ToastData toast;
    public static final Parcelable.Creator<PDPShippingModule> CREATOR = new Parcelable.Creator<PDPShippingModule>() { // from class: X.03KH
        @Override // android.os.Parcelable.Creator
        public final PDPShippingModule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            PDPShippingModuleMeta pDPShippingModuleMetaCreateFromParcel;
            ToastData toastDataCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            Icon icon = (Icon) parcel.readParcelable(PDPShippingModule.class.getClassLoader());
            Icon icon2 = (Icon) parcel.readParcelable(PDPShippingModule.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(PDPAppendix.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                pDPShippingModuleMetaCreateFromParcel = null;
            } else {
                pDPShippingModuleMetaCreateFromParcel = PDPShippingModuleMeta.CREATOR.createFromParcel(parcel);
            }
            PDPShippingModuleMeta pDPShippingModuleMeta = pDPShippingModuleMetaCreateFromParcel;
            if (parcel.readInt() != 0) {
                toastDataCreateFromParcel = ToastData.CREATOR.createFromParcel(parcel);
            }
            return new PDPShippingModule(arrayList, icon, icon2, arrayList2, pDPShippingModuleMeta, toastDataCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPShippingModule[] newArray(int i) {
            return new PDPShippingModule[i];
        }
    };
    public static final int $stable = 8;

    public PDPShippingModule() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPShippingModule)) {
            return false;
        }
        PDPShippingModule pDPShippingModule = (PDPShippingModule) obj;
        return Intrinsics.LJFF(this.descriptionList, pDPShippingModule.descriptionList) && Intrinsics.LJFF(this.descriptionListIcon, pDPShippingModule.descriptionListIcon) && Intrinsics.LJFF(this.descriptionListArrow, pDPShippingModule.descriptionListArrow) && Intrinsics.LJFF(this.appendixList, pDPShippingModule.appendixList) && Intrinsics.LJFF(this.meta, pDPShippingModule.meta) && Intrinsics.LJFF(this.toast, pDPShippingModule.toast) && Intrinsics.LJFF(this.jumpSchema, pDPShippingModule.jumpSchema);
    }

    public final int hashCode() {
        List<LinkRichText> list = this.descriptionList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Icon icon = this.descriptionListIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.descriptionListArrow;
        int iHashCode3 = (iHashCode2 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        List<PDPAppendix> list2 = this.appendixList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PDPShippingModuleMeta pDPShippingModuleMeta = this.meta;
        int iHashCode5 = (iHashCode4 + (pDPShippingModuleMeta == null ? 0 : pDPShippingModuleMeta.hashCode())) * 31;
        ToastData toastData = this.toast;
        int iHashCode6 = (iHashCode5 + (toastData == null ? 0 : toastData.hashCode())) * 31;
        String str = this.jumpSchema;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPShippingModule(descriptionList=");
        sbLIZ.append(this.descriptionList);
        sbLIZ.append(", descriptionListIcon=");
        sbLIZ.append(this.descriptionListIcon);
        sbLIZ.append(", descriptionListArrow=");
        sbLIZ.append(this.descriptionListArrow);
        sbLIZ.append(", appendixList=");
        sbLIZ.append(this.appendixList);
        sbLIZ.append(", meta=");
        sbLIZ.append(this.meta);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.toast);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LinkRichText> list = this.descriptionList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LinkRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.descriptionListIcon, i);
        parcel.writeParcelable(this.descriptionListArrow, i);
        List<PDPAppendix> list2 = this.appendixList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PDPAppendix> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        PDPShippingModuleMeta pDPShippingModuleMeta = this.meta;
        if (pDPShippingModuleMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPShippingModuleMeta.writeToParcel(parcel, i);
        }
        ToastData toastData = this.toast;
        if (toastData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toastData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.jumpSchema);
    }

    public PDPShippingModule(List<LinkRichText> list, Icon icon, Icon icon2, List<PDPAppendix> list2, PDPShippingModuleMeta pDPShippingModuleMeta, ToastData toastData, String str) {
        this.descriptionList = list;
        this.descriptionListIcon = icon;
        this.descriptionListArrow = icon2;
        this.appendixList = list2;
        this.meta = pDPShippingModuleMeta;
        this.toast = toastData;
        this.jumpSchema = str;
    }
}
