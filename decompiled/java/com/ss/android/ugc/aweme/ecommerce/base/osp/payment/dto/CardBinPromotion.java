package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankMeta;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBinPromotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CardBinPromotion implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CardBinPromotion> CREATOR = new Parcelable.Creator<CardBinPromotion>() { // from class: X.02i9
        @Override // android.os.Parcelable.Creator
        public final CardBinPromotion createFromParcel(Parcel parcel) {
            BankMeta bankMetaCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                bankMetaCreateFromParcel = null;
            } else {
                bankMetaCreateFromParcel = BankMeta.CREATOR.createFromParcel(parcel);
            }
            return new CardBinPromotion(string, bankMetaCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CardBinPromotion[] newArray(int i) {
            return new CardBinPromotion[i];
        }
    };

    @C09CT("bank_meta")
    public BankMeta bankMeta;

    @C09CT("card_bin")
    public String cardBin;

    @C09CT("desc")
    public String desc;

    @C09CT("promotion_unique_key")
    public String promotionUniqueKey;

    @C09CT("desc_selected")
    public String selectedDesc;

    public CardBinPromotion() {
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
        if (!(obj instanceof CardBinPromotion)) {
            return false;
        }
        CardBinPromotion cardBinPromotion = (CardBinPromotion) obj;
        return Intrinsics.LJFF(this.cardBin, cardBinPromotion.cardBin) && Intrinsics.LJFF(this.bankMeta, cardBinPromotion.bankMeta) && Intrinsics.LJFF(this.desc, cardBinPromotion.desc) && Intrinsics.LJFF(this.selectedDesc, cardBinPromotion.selectedDesc) && Intrinsics.LJFF(this.promotionUniqueKey, cardBinPromotion.promotionUniqueKey);
    }

    public final int hashCode() {
        String str = this.cardBin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BankMeta bankMeta = this.bankMeta;
        int iHashCode2 = (iHashCode + (bankMeta == null ? 0 : bankMeta.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedDesc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionUniqueKey;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardBinPromotion(cardBin=");
        sbLIZ.append(this.cardBin);
        sbLIZ.append(", bankMeta=");
        sbLIZ.append(this.bankMeta);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", selectedDesc=");
        sbLIZ.append(this.selectedDesc);
        sbLIZ.append(", promotionUniqueKey=");
        sbLIZ.append(this.promotionUniqueKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardBin);
        BankMeta bankMeta = this.bankMeta;
        if (bankMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bankMeta.writeToParcel(parcel, i);
        }
        parcel.writeString(this.desc);
        parcel.writeString(this.selectedDesc);
        parcel.writeString(this.promotionUniqueKey);
    }

    public CardBinPromotion(String str, BankMeta bankMeta, String str2, String str3, String str4) {
        this.cardBin = str;
        this.bankMeta = bankMeta;
        this.desc = str2;
        this.selectedDesc = str3;
        this.promotionUniqueKey = str4;
    }
}
