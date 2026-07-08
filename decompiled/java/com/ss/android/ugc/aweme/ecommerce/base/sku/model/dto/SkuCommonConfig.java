package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC706902pP;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PdpPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonText;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuUnavailableInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCommonConfig implements InterfaceC706902pP, Parcelable {

    @C09CT("pdp_button_area_id")
    public String bottomAreaId;

    @C09CT("default_unselected_quantity")
    public Integer defaultUnselectedQuantity;

    @C09CT("is_quantity_editable")
    public Boolean isQuantityEditable;

    @C09CT("is_quantity_hidden")
    public Boolean isQuantityHidden;

    @C09CT("is_sku_panel_gallery_find_similar_hidden")
    public Boolean isSkuPanelGalleryFindSimilarHidden;

    @C09CT("is_with_default_sku")
    public Boolean isWithDefaultSku;

    @C09CT("pdp_promotion_items")
    public Map<String, PdpPromotion> pdpPromotionItems;

    @C09CT("sale_prop_unavailable_info_id")
    public Integer salePropUnavailableInfoId;

    @C09CT("sku_common_texts")
    public List<SkuCommonText> skuCommonTexts;

    @C09CT("unavailable_info_list")
    public List<SkuUnavailableInfo> skuUnavailableInfoList;
    public static final Parcelable.Creator<SkuCommonConfig> CREATOR = new Parcelable.Creator<SkuCommonConfig>() { // from class: X.02c2
        @Override // android.os.Parcelable.Creator
        public final SkuCommonConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList2;
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Integer numValueOf2;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4 = false;
            Boolean boolValueOf4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SkuCommonText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), PdpPromotion.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(SkuUnavailableInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            return new SkuCommonConfig(arrayList, linkedHashMap, arrayList2, numValueOf, boolValueOf, string, boolValueOf2, numValueOf2, boolValueOf3, boolValueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuCommonConfig[] newArray(int i) {
            return new SkuCommonConfig[i];
        }
    };
    public static final int $stable = 8;

    public SkuCommonConfig() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuCommonConfig)) {
            return false;
        }
        SkuCommonConfig skuCommonConfig = (SkuCommonConfig) obj;
        return Intrinsics.LJFF(this.skuCommonTexts, skuCommonConfig.skuCommonTexts) && Intrinsics.LJFF(this.pdpPromotionItems, skuCommonConfig.pdpPromotionItems) && Intrinsics.LJFF(this.skuUnavailableInfoList, skuCommonConfig.skuUnavailableInfoList) && Intrinsics.LJFF(this.salePropUnavailableInfoId, skuCommonConfig.salePropUnavailableInfoId) && Intrinsics.LJFF(this.isWithDefaultSku, skuCommonConfig.isWithDefaultSku) && Intrinsics.LJFF(this.bottomAreaId, skuCommonConfig.bottomAreaId) && Intrinsics.LJFF(this.isQuantityEditable, skuCommonConfig.isQuantityEditable) && Intrinsics.LJFF(this.defaultUnselectedQuantity, skuCommonConfig.defaultUnselectedQuantity) && Intrinsics.LJFF(this.isQuantityHidden, skuCommonConfig.isQuantityHidden) && Intrinsics.LJFF(this.isSkuPanelGalleryFindSimilarHidden, skuCommonConfig.isSkuPanelGalleryFindSimilarHidden);
    }

    public final int hashCode() {
        List<SkuCommonText> list = this.skuCommonTexts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, PdpPromotion> map = this.pdpPromotionItems;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<SkuUnavailableInfo> list2 = this.skuUnavailableInfoList;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.salePropUnavailableInfoId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isWithDefaultSku;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.bottomAreaId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isQuantityEditable;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.defaultUnselectedQuantity;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.isQuantityHidden;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isSkuPanelGalleryFindSimilarHidden;
        return iHashCode9 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuCommonConfig(skuCommonTexts=");
        sbLIZ.append(this.skuCommonTexts);
        sbLIZ.append(", pdpPromotionItems=");
        sbLIZ.append(this.pdpPromotionItems);
        sbLIZ.append(", skuUnavailableInfoList=");
        sbLIZ.append(this.skuUnavailableInfoList);
        sbLIZ.append(", salePropUnavailableInfoId=");
        sbLIZ.append(this.salePropUnavailableInfoId);
        sbLIZ.append(", isWithDefaultSku=");
        sbLIZ.append(this.isWithDefaultSku);
        sbLIZ.append(", bottomAreaId=");
        sbLIZ.append(this.bottomAreaId);
        sbLIZ.append(", isQuantityEditable=");
        sbLIZ.append(this.isQuantityEditable);
        sbLIZ.append(", defaultUnselectedQuantity=");
        sbLIZ.append(this.defaultUnselectedQuantity);
        sbLIZ.append(", isQuantityHidden=");
        sbLIZ.append(this.isQuantityHidden);
        sbLIZ.append(", isSkuPanelGalleryFindSimilarHidden=");
        sbLIZ.append(this.isSkuPanelGalleryFindSimilarHidden);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SkuCommonText> list = this.skuCommonTexts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SkuCommonText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Map<String, PdpPromotion> map = this.pdpPromotionItems;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, PdpPromotion> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        List<SkuUnavailableInfo> list2 = this.skuUnavailableInfoList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SkuUnavailableInfo> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.salePropUnavailableInfoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isWithDefaultSku;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.bottomAreaId);
        Boolean bool2 = this.isQuantityEditable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.defaultUnselectedQuantity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool3 = this.isQuantityHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isSkuPanelGalleryFindSimilarHidden;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    @Override // X.InterfaceC706902pP
    public final Integer LIZ() {
        return this.defaultUnselectedQuantity;
    }

    public final ProductUnavailableInfo LIZIZ(int i) {
        List<SkuUnavailableInfo> list = this.skuUnavailableInfoList;
        if (list != null) {
            for (SkuUnavailableInfo skuUnavailableInfo : list) {
                Integer num = skuUnavailableInfo.pageStatus;
                if (num != null && num.intValue() == i) {
                    return skuUnavailableInfo.unavailableInfo;
                }
            }
            return null;
        }
        return null;
    }

    public SkuCommonConfig(List<SkuCommonText> list, Map<String, PdpPromotion> map, List<SkuUnavailableInfo> list2, Integer num, Boolean bool, String str, Boolean bool2, Integer num2, Boolean bool3, Boolean bool4) {
        this.skuCommonTexts = list;
        this.pdpPromotionItems = map;
        this.skuUnavailableInfoList = list2;
        this.salePropUnavailableInfoId = num;
        this.isWithDefaultSku = bool;
        this.bottomAreaId = str;
        this.isQuantityEditable = bool2;
        this.defaultUnselectedQuantity = num2;
        this.isQuantityHidden = bool3;
        this.isSkuPanelGalleryFindSimilarHidden = bool4;
    }
}
