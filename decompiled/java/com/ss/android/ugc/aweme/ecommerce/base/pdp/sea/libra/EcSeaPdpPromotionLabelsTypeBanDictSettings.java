package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcSeaPdpPromotionLabelsTypeBanDictSettings {
    public static final EcSeaPdpPromotionLabelsTypeBanDictModel LIZ = new EcSeaPdpPromotionLabelsTypeBanDictModel(null, null, null, 7, null);

    public static final EcSeaPdpPromotionLabelsTypeBanDictModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSeaPdpPromotionLabelsTypeBanDictModel ecSeaPdpPromotionLabelsTypeBanDictModel = LIZ;
        EcSeaPdpPromotionLabelsTypeBanDictModel ecSeaPdpPromotionLabelsTypeBanDictModel2 = (EcSeaPdpPromotionLabelsTypeBanDictModel) settingsManagerLIZLLL.LJIIIIZZ("ec_sea_pdp_promotion_labels_type_ban_dict", EcSeaPdpPromotionLabelsTypeBanDictModel.class, ecSeaPdpPromotionLabelsTypeBanDictModel);
        return ecSeaPdpPromotionLabelsTypeBanDictModel2 != null ? ecSeaPdpPromotionLabelsTypeBanDictModel2 : ecSeaPdpPromotionLabelsTypeBanDictModel;
    }

    public static final class EcSeaPdpPromotionLabelsTypeBanDictModel {
        public static final int $stable = 8;

        @C09CT("one_step_order_submit")
        public final List<Integer> oneStepOrderSubmitBanList;

        @C09CT("product_detail")
        public final List<Integer> productDetailBanList;

        @C09CT("sku")
        public final List<Integer> skuBanList;

        public EcSeaPdpPromotionLabelsTypeBanDictModel() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcSeaPdpPromotionLabelsTypeBanDictModel)) {
                return false;
            }
            EcSeaPdpPromotionLabelsTypeBanDictModel ecSeaPdpPromotionLabelsTypeBanDictModel = (EcSeaPdpPromotionLabelsTypeBanDictModel) obj;
            return Intrinsics.LJFF(this.productDetailBanList, ecSeaPdpPromotionLabelsTypeBanDictModel.productDetailBanList) && Intrinsics.LJFF(this.skuBanList, ecSeaPdpPromotionLabelsTypeBanDictModel.skuBanList) && Intrinsics.LJFF(this.oneStepOrderSubmitBanList, ecSeaPdpPromotionLabelsTypeBanDictModel.oneStepOrderSubmitBanList);
        }

        public int hashCode() {
            return (((this.productDetailBanList.hashCode() * 31) + this.skuBanList.hashCode()) * 31) + this.oneStepOrderSubmitBanList.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcSeaPdpPromotionLabelsTypeBanDictModel(productDetailBanList=");
            sbLIZ.append(this.productDetailBanList);
            sbLIZ.append(", skuBanList=");
            sbLIZ.append(this.skuBanList);
            sbLIZ.append(", oneStepOrderSubmitBanList=");
            sbLIZ.append(this.oneStepOrderSubmitBanList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcSeaPdpPromotionLabelsTypeBanDictModel(List<Integer> list, List<Integer> list2, List<Integer> list3) {
            this.productDetailBanList = list;
            this.skuBanList = list2;
            this.oneStepOrderSubmitBanList = list3;
        }

        public EcSeaPdpPromotionLabelsTypeBanDictModel(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList(8) : list, (i & 2) != 0 ? C1697810uHb.LJIIJJI(29, 74, 161, 162) : list2, (i & 4) != 0 ? Collections.singletonList(8) : list3);
        }
    }
}
