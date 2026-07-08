package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingServiceModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPShippingServiceModule implements Parcelable {

    @C09CT("description_list")
    public final List<LinkRichText> descriptionList;

    @C09CT("description_list_arrow")
    public final Icon descriptionListArrow;

    @C09CT("description_list_icon")
    public final Icon descriptionListIcon;

    @C09CT("lead_msg")
    public final LinkRichText leadMsg;

    @C09CT("title")
    public final String title;

    @C09CT("title_icon")
    public final Icon titleIcon;
    public static final Parcelable.Creator<PDPShippingServiceModule> CREATOR = new Parcelable.Creator<PDPShippingServiceModule>() { // from class: X.03KK
        @Override // android.os.Parcelable.Creator
        public final PDPShippingServiceModule createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            String string = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(PDPShippingServiceModule.class.getClassLoader());
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            return new PDPShippingServiceModule(string, icon, linkRichText, arrayList, (Icon) parcel.readParcelable(PDPShippingServiceModule.class.getClassLoader()), (Icon) parcel.readParcelable(PDPShippingServiceModule.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PDPShippingServiceModule[] newArray(int i) {
            return new PDPShippingServiceModule[i];
        }
    };
    public static final int $stable = 8;

    public PDPShippingServiceModule() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPShippingServiceModule)) {
            return false;
        }
        PDPShippingServiceModule pDPShippingServiceModule = (PDPShippingServiceModule) obj;
        return Intrinsics.LJFF(this.title, pDPShippingServiceModule.title) && Intrinsics.LJFF(this.titleIcon, pDPShippingServiceModule.titleIcon) && Intrinsics.LJFF(this.leadMsg, pDPShippingServiceModule.leadMsg) && Intrinsics.LJFF(this.descriptionList, pDPShippingServiceModule.descriptionList) && Intrinsics.LJFF(this.descriptionListIcon, pDPShippingServiceModule.descriptionListIcon) && Intrinsics.LJFF(this.descriptionListArrow, pDPShippingServiceModule.descriptionListArrow);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.titleIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        LinkRichText linkRichText = this.leadMsg;
        int iHashCode3 = (iHashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        List<LinkRichText> list = this.descriptionList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon2 = this.descriptionListIcon;
        int iHashCode5 = (iHashCode4 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        Icon icon3 = this.descriptionListArrow;
        return iHashCode5 + (icon3 != null ? icon3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPShippingServiceModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", titleIcon=");
        sbLIZ.append(this.titleIcon);
        sbLIZ.append(", leadMsg=");
        sbLIZ.append(this.leadMsg);
        sbLIZ.append(", descriptionList=");
        sbLIZ.append(this.descriptionList);
        sbLIZ.append(", descriptionListIcon=");
        sbLIZ.append(this.descriptionListIcon);
        sbLIZ.append(", descriptionListArrow=");
        sbLIZ.append(this.descriptionListArrow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.titleIcon, i);
        LinkRichText linkRichText = this.leadMsg;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
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
    }

    public PDPShippingServiceModule(String str, Icon icon, LinkRichText linkRichText, List<LinkRichText> list, Icon icon2, Icon icon3) {
        this.title = str;
        this.titleIcon = icon;
        this.leadMsg = linkRichText;
        this.descriptionList = list;
        this.descriptionListIcon = icon2;
        this.descriptionListArrow = icon3;
    }
}
