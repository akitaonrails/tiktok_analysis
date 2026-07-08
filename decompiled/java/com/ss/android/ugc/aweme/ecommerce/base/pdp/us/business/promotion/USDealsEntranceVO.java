package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion;

import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.USDealsEntranceVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class USDealsEntranceVO implements Parcelable, InterfaceC746802vq {

    @C09CT("action_text")
    public final ECRichText actionText;

    @C09CT("cards")
    public final List<PdpComponentCard> cardList;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("sub_title")
    public final ECRichText subTitle;

    @C09CT("title")
    public final ECRichText title;
    public static final Parcelable.Creator<USDealsEntranceVO> CREATOR = new Parcelable.Creator<USDealsEntranceVO>() { // from class: X.0vtS
        @Override // android.os.Parcelable.Creator
        public final USDealsEntranceVO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(USDealsEntranceVO.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(USDealsEntranceVO.class.getClassLoader());
            ECRichText eCRichText3 = (ECRichText) parcel.readParcelable(USDealsEntranceVO.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PdpComponentCard.CREATOR.createFromParcel(parcel));
                }
            }
            return new USDealsEntranceVO(eCRichText, eCRichText2, eCRichText3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final USDealsEntranceVO[] newArray(int i) {
            return new USDealsEntranceVO[i];
        }
    };
    public static final int $stable = 8;

    public USDealsEntranceVO() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof USDealsEntranceVO)) {
            return false;
        }
        USDealsEntranceVO uSDealsEntranceVO = (USDealsEntranceVO) obj;
        return Intrinsics.LJFF(this.title, uSDealsEntranceVO.title) && Intrinsics.LJFF(this.subTitle, uSDealsEntranceVO.subTitle) && Intrinsics.LJFF(this.actionText, uSDealsEntranceVO.actionText) && Intrinsics.LJFF(this.cardList, uSDealsEntranceVO.cardList) && Intrinsics.LJFF(this.daInfo, uSDealsEntranceVO.daInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.subTitle;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        ECRichText eCRichText3 = this.actionText;
        int iHashCode3 = (iHashCode2 + (eCRichText3 == null ? 0 : eCRichText3.hashCode())) * 31;
        List<PdpComponentCard> list = this.cardList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USDealsEntranceVO(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", actionText=");
        sbLIZ.append(this.actionText);
        sbLIZ.append(", cardList=");
        sbLIZ.append(this.cardList);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.subTitle, i);
        parcel.writeParcelable(this.actionText, i);
        List<PdpComponentCard> list = this.cardList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PdpComponentCard> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.daInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public USDealsEntranceVO(ECRichText eCRichText, ECRichText eCRichText2, ECRichText eCRichText3, List<PdpComponentCard> list, String str) {
        this.title = eCRichText;
        this.subTitle = eCRichText2;
        this.actionText = eCRichText3;
        this.cardList = list;
        this.daInfo = str;
    }
}
