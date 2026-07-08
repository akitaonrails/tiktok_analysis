package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C043I;
import X.C043P;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeeMore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpBottomAreaElem implements Parcelable {

    @C09CT("buttons")
    public final List<PdpButton> buttons;

    @C09CT("ocp_notice")
    public final String ocpNotice;

    @C09CT("see_more")
    public final SeeMore seeMore;

    @C09CT("status_notice")
    public final LinkRichText statusNotice;

    @C09CT("status_sub_notice")
    public final LinkRichText statusSubNotice;

    @C09CT("user_trust_model")
    public final LinkRichText userTrustLinkText;
    public static final Parcelable.Creator<PdpBottomAreaElem> CREATOR = new Parcelable.Creator<PdpBottomAreaElem>() { // from class: X.043K
        @Override // android.os.Parcelable.Creator
        public final PdpBottomAreaElem createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            LinkRichText linkRichTextCreateFromParcel2;
            ArrayList arrayList;
            SeeMore seeMoreCreateFromParcel;
            LinkRichText linkRichTextCreateFromParcel3 = null;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText = linkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel2 = null;
            } else {
                linkRichTextCreateFromParcel2 = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            LinkRichText linkRichText2 = linkRichTextCreateFromParcel2;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PdpButton.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                seeMoreCreateFromParcel = null;
            } else {
                seeMoreCreateFromParcel = SeeMore.CREATOR.createFromParcel(parcel);
            }
            SeeMore seeMore = seeMoreCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                linkRichTextCreateFromParcel3 = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new PdpBottomAreaElem(linkRichText, linkRichText2, arrayList, seeMore, string, linkRichTextCreateFromParcel3);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpBottomAreaElem[] newArray(int i) {
            return new PdpBottomAreaElem[i];
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
        if (!(obj instanceof PdpBottomAreaElem)) {
            return false;
        }
        PdpBottomAreaElem pdpBottomAreaElem = (PdpBottomAreaElem) obj;
        return Intrinsics.LJFF(this.statusNotice, pdpBottomAreaElem.statusNotice) && Intrinsics.LJFF(this.statusSubNotice, pdpBottomAreaElem.statusSubNotice) && Intrinsics.LJFF(this.buttons, pdpBottomAreaElem.buttons) && Intrinsics.LJFF(this.seeMore, pdpBottomAreaElem.seeMore) && Intrinsics.LJFF(this.ocpNotice, pdpBottomAreaElem.ocpNotice) && Intrinsics.LJFF(this.userTrustLinkText, pdpBottomAreaElem.userTrustLinkText);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.statusNotice;
        int iHashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        LinkRichText linkRichText2 = this.statusSubNotice;
        int iHashCode2 = (iHashCode + (linkRichText2 == null ? 0 : linkRichText2.hashCode())) * 31;
        List<PdpButton> list = this.buttons;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SeeMore seeMore = this.seeMore;
        int iHashCode4 = (iHashCode3 + (seeMore == null ? 0 : seeMore.hashCode())) * 31;
        String str = this.ocpNotice;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        LinkRichText linkRichText3 = this.userTrustLinkText;
        return iHashCode5 + (linkRichText3 != null ? linkRichText3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBottomAreaElem(statusNotice=");
        sbLIZ.append(this.statusNotice);
        sbLIZ.append(", statusSubNotice=");
        sbLIZ.append(this.statusSubNotice);
        sbLIZ.append(", buttons=");
        sbLIZ.append(this.buttons);
        sbLIZ.append(", seeMore=");
        sbLIZ.append(this.seeMore);
        sbLIZ.append(", ocpNotice=");
        sbLIZ.append(this.ocpNotice);
        sbLIZ.append(", userTrustLinkText=");
        sbLIZ.append(this.userTrustLinkText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkRichText linkRichText = this.statusNotice;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        LinkRichText linkRichText2 = this.statusSubNotice;
        if (linkRichText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText2.writeToParcel(parcel, i);
        }
        List<PdpButton> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PdpButton> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SeeMore seeMore = this.seeMore;
        if (seeMore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seeMore.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ocpNotice);
        LinkRichText linkRichText3 = this.userTrustLinkText;
        if (linkRichText3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText3.writeToParcel(parcel, i);
        }
    }

    public final PdpBottomAreaElem LIZJ() {
        List<PdpButton> list = this.buttons;
        if (list == null || list.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<PdpButton> it2 = this.buttons.iterator();
        while (it2.hasNext()) {
            arrayList.add(PdpButton.LIZ(it2.next(), null, Integer.valueOf(C043P.DISABLE.getValue()), null, 959));
        }
        return LIZ(this, arrayList, null, 59);
    }

    public final PdpBottomAreaElem LIZIZ(String str) {
        List<PdpButton> list = this.buttons;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PdpButton pdpButton : this.buttons) {
                Integer num = pdpButton.buttonAction;
                int value = C043I.ADD_TO_CART.getValue();
                if (num != null && num.intValue() == value) {
                    arrayList.add(PdpButton.LIZ(pdpButton, str, null, null, 1015));
                } else {
                    arrayList.add(pdpButton);
                }
            }
            return LIZ(this, arrayList, null, 59);
        }
        return this;
    }

    public static PdpBottomAreaElem LIZ(PdpBottomAreaElem pdpBottomAreaElem, List list, SeeMore seeMore, int i) {
        LinkRichText linkRichText;
        LinkRichText linkRichText2;
        String str;
        SeeMore seeMore2 = seeMore;
        List list2 = list;
        LinkRichText linkRichText3 = null;
        if ((i & 1) != 0) {
            linkRichText = pdpBottomAreaElem.statusNotice;
        } else {
            linkRichText = null;
        }
        if ((i & 2) != 0) {
            linkRichText2 = pdpBottomAreaElem.statusSubNotice;
        } else {
            linkRichText2 = null;
        }
        if ((i & 4) != 0) {
            list2 = pdpBottomAreaElem.buttons;
        }
        if ((i & 8) != 0) {
            seeMore2 = pdpBottomAreaElem.seeMore;
        }
        if ((i & 16) != 0) {
            str = pdpBottomAreaElem.ocpNotice;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            linkRichText3 = pdpBottomAreaElem.userTrustLinkText;
        }
        pdpBottomAreaElem.getClass();
        return new PdpBottomAreaElem(linkRichText, linkRichText2, list2, seeMore2, str, linkRichText3);
    }

    public PdpBottomAreaElem(LinkRichText linkRichText, LinkRichText linkRichText2, List<PdpButton> list, SeeMore seeMore, String str, LinkRichText linkRichText3) {
        this.statusNotice = linkRichText;
        this.statusSubNotice = linkRichText2;
        this.buttons = list;
        this.seeMore = seeMore;
        this.ocpNotice = str;
        this.userTrustLinkText = linkRichText3;
    }
}
