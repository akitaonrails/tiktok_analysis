package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SpecificationLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SpecificationLink implements Parcelable {

    @C09CT("pop_up_message")
    public PopUpMessage popUpMsg;

    @C09CT("specification_link_type")
    public Integer specificationLinkType;

    @C09CT("url_list")
    public List<String> urlList;
    public static final Parcelable.Creator<SpecificationLink> CREATOR = new Parcelable.Creator<SpecificationLink>() { // from class: X.02kw
        @Override // android.os.Parcelable.Creator
        public final SpecificationLink createFromParcel(Parcel parcel) {
            PopUpMessage popUpMessageCreateFromParcel;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                popUpMessageCreateFromParcel = null;
            } else {
                popUpMessageCreateFromParcel = PopUpMessage.CREATOR.createFromParcel(parcel);
            }
            PopUpMessage popUpMessage = popUpMessageCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SpecificationLink(arrayListCreateStringArrayList, popUpMessage, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecificationLink[] newArray(int i) {
            return new SpecificationLink[i];
        }
    };
    public static final int $stable = 8;

    public SpecificationLink() {
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
        if (!(obj instanceof SpecificationLink)) {
            return false;
        }
        SpecificationLink specificationLink = (SpecificationLink) obj;
        return Intrinsics.LJFF(this.urlList, specificationLink.urlList) && Intrinsics.LJFF(this.popUpMsg, specificationLink.popUpMsg) && Intrinsics.LJFF(this.specificationLinkType, specificationLink.specificationLinkType);
    }

    public final int hashCode() {
        List<String> list = this.urlList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PopUpMessage popUpMessage = this.popUpMsg;
        int iHashCode2 = (iHashCode + (popUpMessage == null ? 0 : popUpMessage.hashCode())) * 31;
        Integer num = this.specificationLinkType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpecificationLink(urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", popUpMsg=");
        sbLIZ.append(this.popUpMsg);
        sbLIZ.append(", specificationLinkType=");
        sbLIZ.append(this.specificationLinkType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.urlList);
        PopUpMessage popUpMessage = this.popUpMsg;
        if (popUpMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpMessage.writeToParcel(parcel, i);
        }
        Integer num = this.specificationLinkType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public SpecificationLink(List<String> list, PopUpMessage popUpMessage, Integer num) {
        this.urlList = list;
        this.popUpMsg = popUpMessage;
        this.specificationLinkType = num;
    }
}
