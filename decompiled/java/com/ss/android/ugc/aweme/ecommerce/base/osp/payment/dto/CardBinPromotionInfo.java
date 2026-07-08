package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBinPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBinPromotionInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CardBinPromotionInfo implements Parcelable, Serializable {

    @C09CT("card_bin_promos")
    public List<CardBinPromotion> cardBinPromos;
    public static final Parcelable.Creator<CardBinPromotionInfo> CREATOR = new Parcelable.Creator<CardBinPromotionInfo>() { // from class: X.02iB
        @Override // android.os.Parcelable.Creator
        public final CardBinPromotionInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CardBinPromotion.CREATOR.createFromParcel(parcel));
                }
            }
            return new CardBinPromotionInfo(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CardBinPromotionInfo[] newArray(int i) {
            return new CardBinPromotionInfo[i];
        }
    };
    public static final int $stable = 8;

    public CardBinPromotionInfo() {
        this(null);
    }

    public final CardBinPromotionInfo copy(List<CardBinPromotion> list) {
        return new CardBinPromotionInfo(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardBinPromotionInfo) && Intrinsics.LJFF(this.cardBinPromos, ((CardBinPromotionInfo) obj).cardBinPromos);
    }

    public int hashCode() {
        List<CardBinPromotion> list = this.cardBinPromos;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardBinPromotionInfo(cardBinPromos=");
        sbLIZ.append(this.cardBinPromos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CardBinPromotion> list = this.cardBinPromos;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CardBinPromotion> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final List<CardBinPromotion> getCardBinPromos() {
        return this.cardBinPromos;
    }

    public CardBinPromotionInfo(List<CardBinPromotion> list) {
        this.cardBinPromos = list;
    }
}
