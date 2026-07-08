package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelUiStyleModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionLabelVO implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("placement_labels")
    public List<PlacementLabel> placementLabels;

    @C09CT("promotion_labels")
    public List<PromotionLabel> promotionLabels;

    @C09CT("ui_style")
    public PromotionLabelUiStyleModel uiStyle;
    public static final Parcelable.Creator<PromotionLabelVO> CREATOR = new Parcelable.Creator<PromotionLabelVO>() { // from class: X.02p5
        @Override // android.os.Parcelable.Creator
        public final PromotionLabelVO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            PromotionLabelUiStyleModel promotionLabelUiStyleModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() != 0) {
                promotionLabelUiStyleModelCreateFromParcel = PromotionLabelUiStyleModel.CREATOR.createFromParcel(parcel);
            }
            return new PromotionLabelVO(arrayList, arrayList2, promotionLabelUiStyleModelCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionLabelVO[] newArray(int i) {
            return new PromotionLabelVO[i];
        }
    };
    public static final int $stable = 8;

    public PromotionLabelVO() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLabelVO)) {
            return false;
        }
        PromotionLabelVO promotionLabelVO = (PromotionLabelVO) obj;
        return Intrinsics.LJFF(this.promotionLabels, promotionLabelVO.promotionLabels) && Intrinsics.LJFF(this.placementLabels, promotionLabelVO.placementLabels) && Intrinsics.LJFF(this.uiStyle, promotionLabelVO.uiStyle) && Intrinsics.LJFF(this.daInfo, promotionLabelVO.daInfo);
    }

    public final int hashCode() {
        List<PromotionLabel> list = this.promotionLabels;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PlacementLabel> list2 = this.placementLabels;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        PromotionLabelUiStyleModel promotionLabelUiStyleModel = this.uiStyle;
        int iHashCode3 = (iHashCode2 + (promotionLabelUiStyleModel == null ? 0 : promotionLabelUiStyleModel.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionLabelVO(promotionLabels=");
        sbLIZ.append(this.promotionLabels);
        sbLIZ.append(", placementLabels=");
        sbLIZ.append(this.placementLabels);
        sbLIZ.append(", uiStyle=");
        sbLIZ.append(this.uiStyle);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PromotionLabel> list = this.promotionLabels;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromotionLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        List<PlacementLabel> list2 = this.placementLabels;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PlacementLabel> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeSerializable(it3.next());
            }
        }
        PromotionLabelUiStyleModel promotionLabelUiStyleModel = this.uiStyle;
        if (promotionLabelUiStyleModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionLabelUiStyleModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public PromotionLabelVO(List<PromotionLabel> list, List<PlacementLabel> list2, PromotionLabelUiStyleModel promotionLabelUiStyleModel, String str) {
        this.promotionLabels = list;
        this.placementLabels = list2;
        this.uiStyle = promotionLabelUiStyleModel;
        this.daInfo = str;
    }
}
