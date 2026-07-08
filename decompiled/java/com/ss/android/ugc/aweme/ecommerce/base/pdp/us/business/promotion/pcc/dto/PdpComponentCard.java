package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAreas;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PromotionCardConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpComponentCard implements Parcelable {

    @C09CT("action")
    public final PdpComponentAction action;

    @C09CT("areas")
    public final PdpComponentAreas areas;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("style")
    public final PromotionCardConfig cardConfig;

    @C09CT("card_type")
    public final Integer cardType;

    @C09CT("da_info")
    public final String daInfo;
    public static final Parcelable.Creator<PdpComponentCard> CREATOR = new Parcelable.Creator<PdpComponentCard>() { // from class: X.0vtT
        @Override // android.os.Parcelable.Creator
        public final PdpComponentCard createFromParcel(Parcel parcel) {
            Integer numValueOf;
            PdpComponentAreas pdpComponentAreasCreateFromParcel;
            PdpComponentAction pdpComponentActionCreateFromParcel;
            Integer numValueOf2;
            PromotionCardConfig promotionCardConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                pdpComponentAreasCreateFromParcel = null;
            } else {
                pdpComponentAreasCreateFromParcel = PdpComponentAreas.CREATOR.createFromParcel(parcel);
            }
            PdpComponentAreas pdpComponentAreas = pdpComponentAreasCreateFromParcel;
            if (parcel.readInt() == 0) {
                pdpComponentActionCreateFromParcel = null;
            } else {
                pdpComponentActionCreateFromParcel = PdpComponentAction.CREATOR.createFromParcel(parcel);
            }
            PdpComponentAction pdpComponentAction = pdpComponentActionCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                promotionCardConfigCreateFromParcel = PromotionCardConfig.CREATOR.createFromParcel(parcel);
            }
            return new PdpComponentCard(numValueOf, pdpComponentAreas, pdpComponentAction, numValueOf2, string, promotionCardConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpComponentCard[] newArray(int i) {
            return new PdpComponentCard[i];
        }
    };
    public static final int $stable = 8;

    public PdpComponentCard() {
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
        if (!(obj instanceof PdpComponentCard)) {
            return false;
        }
        PdpComponentCard pdpComponentCard = (PdpComponentCard) obj;
        return Intrinsics.LJFF(this.cardType, pdpComponentCard.cardType) && Intrinsics.LJFF(this.areas, pdpComponentCard.areas) && Intrinsics.LJFF(this.action, pdpComponentCard.action) && Intrinsics.LJFF(this.bizType, pdpComponentCard.bizType) && Intrinsics.LJFF(this.daInfo, pdpComponentCard.daInfo) && Intrinsics.LJFF(this.cardConfig, pdpComponentCard.cardConfig);
    }

    public final int hashCode() {
        Integer num = this.cardType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PdpComponentAreas pdpComponentAreas = this.areas;
        int iHashCode2 = (iHashCode + (pdpComponentAreas == null ? 0 : pdpComponentAreas.hashCode())) * 31;
        PdpComponentAction pdpComponentAction = this.action;
        int iHashCode3 = (iHashCode2 + (pdpComponentAction == null ? 0 : pdpComponentAction.hashCode())) * 31;
        Integer num2 = this.bizType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        PromotionCardConfig promotionCardConfig = this.cardConfig;
        return iHashCode5 + (promotionCardConfig != null ? promotionCardConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpComponentCard(cardType=");
        sbLIZ.append(this.cardType);
        sbLIZ.append(", areas=");
        sbLIZ.append(this.areas);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", cardConfig=");
        sbLIZ.append(this.cardConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.cardType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        PdpComponentAreas pdpComponentAreas = this.areas;
        if (pdpComponentAreas == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpComponentAreas.writeToParcel(parcel, i);
        }
        PdpComponentAction pdpComponentAction = this.action;
        if (pdpComponentAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpComponentAction.writeToParcel(parcel, i);
        }
        Integer num2 = this.bizType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.daInfo);
        PromotionCardConfig promotionCardConfig = this.cardConfig;
        if (promotionCardConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionCardConfig.writeToParcel(parcel, i);
        }
    }

    public PdpComponentCard(Integer num, PdpComponentAreas pdpComponentAreas, PdpComponentAction pdpComponentAction, Integer num2, String str, PromotionCardConfig promotionCardConfig) {
        this.cardType = num;
        this.areas = pdpComponentAreas;
        this.action = pdpComponentAction;
        this.bizType = num2;
        this.daInfo = str;
        this.cardConfig = promotionCardConfig;
    }
}
