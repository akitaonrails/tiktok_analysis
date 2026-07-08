package com.ss.android.ugc.aweme.ecommercebase.promotion.data;

import X.C09C2;
import X.C09CT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class PromotionInfo implements Serializable {

    @C09CT("EU_compliance_labels")
    public final List<PromotionLabel> euComplianceLabels;

    @C09CT("placement_labels")
    public final List<PlacementLabel> placementLabels;

    @C09CT("prelaunch_promotion_label")
    public final PromotionLabel prelaunchPromotionLabel;

    @C09CT("product_price")
    public final PromotionProductPrice productPrice;

    @C09CT("promotion_labels")
    public List<PromotionLabel> promotionLabels;

    @C09CT("promotion_labels_show_style")
    public Integer promotionLabelsShowStyle;

    @C09CT("promotion_stickers")
    public final List<PromotionSticker> promotionStickers;

    @C09CT("second_promotion_labels")
    public List<PromotionLabel> secondPromotionLabels;
    public transient PromotionStyleConfig styleConfig;

    public PromotionInfo() {
        this(null, null, 0, null, null, null, null, null);
    }

    public final PromotionInfo copy(List<PromotionLabel> list, List<PromotionLabel> list2, Integer num, List<PromotionSticker> list3, PromotionProductPrice promotionProductPrice, List<PlacementLabel> list4, PromotionLabel promotionLabel, List<PromotionLabel> list5) {
        return new PromotionInfo(list, list2, num, list3, promotionProductPrice, list4, promotionLabel, list5);
    }

    public final String getEventParamCampaignTypes() {
        StringBuilder sb = new StringBuilder();
        PromotionLabel promotionLabel = this.prelaunchPromotionLabel;
        if (promotionLabel != null) {
            sb.append(String.valueOf(promotionLabel.type));
            sb.append(",");
        }
        List<PromotionLabel> list = this.promotionLabels;
        if (list != null) {
            Iterator<PromotionLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().type);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.lastIndexOf(","), sb.length());
        }
        return sb.toString();
    }

    public final String getEventParamPromotionStatusLaunch() {
        StringBuilder sb = new StringBuilder();
        List<PromotionLabel> list = this.promotionLabels;
        if (list != null) {
            Iterator<PromotionLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(String.valueOf(it2.next().type));
                sb.append(",");
            }
        }
        List<PlacementLabel> list2 = this.placementLabels;
        if (list2 != null) {
            Iterator<PlacementLabel> it3 = list2.iterator();
            while (it3.hasNext()) {
                List<PromotionLabel> list3 = it3.next().placementLabelList;
                if (list3 != null) {
                    for (PromotionLabel promotionLabel : list3) {
                        Integer num = promotionLabel.status;
                        if (num != null && num.intValue() == 102) {
                            sb.append(String.valueOf(promotionLabel.type));
                            sb.append(",");
                        }
                    }
                }
            }
        }
        List<PromotionSticker> list4 = this.promotionStickers;
        if (list4 != null) {
            Iterator<PromotionSticker> it4 = list4.iterator();
            while (it4.hasNext()) {
                Integer num2 = it4.next().type;
                if (num2 != null) {
                    sb.append(String.valueOf(num2.intValue()));
                    sb.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.lastIndexOf(","), sb.length());
        }
        return sb.toString();
    }

    public final String getEventParamPromotionStatusPreHeat() {
        StringBuilder sb = new StringBuilder();
        PromotionLabel promotionLabel = this.prelaunchPromotionLabel;
        if (promotionLabel != null) {
            sb.append(String.valueOf(promotionLabel.type));
        }
        return sb.toString();
    }

    public final String getEventParamTitleLabel() {
        StringBuilder sb = new StringBuilder();
        List<PlacementLabel> list = this.placementLabels;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (PlacementLabel placementLabel : list) {
                Integer num = placementLabel.placement;
                if (num != null && num.intValue() == 2) {
                    arrayList.add(placementLabel);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List<PromotionLabel> list2 = ((PlacementLabel) it2.next()).placementLabelList;
                if (list2 != null) {
                    Iterator<PromotionLabel> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Integer.valueOf(it3.next().type).intValue();
                        sb.append("1,");
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.lastIndexOf(","), sb.length());
        }
        return sb.toString();
    }

    public final void setPromotionLabels(List<PromotionLabel> list) {
        this.promotionLabels = list;
    }

    public final void setPromotionLabelsShowStyle(Integer num) {
        this.promotionLabelsShowStyle = num;
    }

    public final void setSecondPromotionLabels(List<PromotionLabel> list) {
        this.secondPromotionLabels = list;
    }

    public final void setStyleConfig(PromotionStyleConfig promotionStyleConfig) {
        this.styleConfig = promotionStyleConfig;
    }

    public final String getEventParamProductPromotionTag(boolean z, boolean z2) {
        Map<String, Object> map;
        StringBuilder sb = new StringBuilder();
        Gson gsonLIZ = C09C2.LIZ();
        if (!z2) {
            List<PromotionLabel> list = this.promotionLabels;
            if (list != null) {
                Iterator<PromotionLabel> it2 = list.iterator();
                while (it2.hasNext()) {
                    Map<String, Object> map2 = it2.next().daInfo;
                    if (map2 != null) {
                        if (z) {
                            sb.append(GsonProtectorUtils.toJson(gsonLIZ, map2));
                        } else {
                            sb.append(map2.toString());
                        }
                        sb.append("|||");
                    }
                }
            }
            List<PromotionLabel> list2 = this.secondPromotionLabels;
            if (list2 != null) {
                Iterator<PromotionLabel> it3 = list2.iterator();
                while (it3.hasNext()) {
                    Map<String, Object> map3 = it3.next().daInfo;
                    if (map3 != null) {
                        if (z) {
                            sb.append(GsonProtectorUtils.toJson(gsonLIZ, map3));
                        } else {
                            sb.append(map3.toString());
                        }
                        sb.append("|||");
                    }
                }
            }
        }
        List<PlacementLabel> list3 = this.placementLabels;
        if (list3 != null) {
            Iterator<PlacementLabel> it4 = list3.iterator();
            while (it4.hasNext()) {
                List<PromotionLabel> list4 = it4.next().placementLabelList;
                if (list4 != null) {
                    Iterator<PromotionLabel> it5 = list4.iterator();
                    while (it5.hasNext()) {
                        Map<String, Object> map4 = it5.next().daInfo;
                        if (map4 != null) {
                            if (z) {
                                sb.append(GsonProtectorUtils.toJson(gsonLIZ, map4));
                            } else {
                                sb.append(map4.toString());
                            }
                            sb.append("|||");
                        }
                    }
                }
            }
        }
        List<PromotionSticker> list5 = this.promotionStickers;
        if (list5 != null) {
            Iterator<PromotionSticker> it6 = list5.iterator();
            while (it6.hasNext()) {
                HashMap<String, Object> map5 = it6.next().daInfo;
                if (map5 != null) {
                    if (z) {
                        sb.append(GsonProtectorUtils.toJson(gsonLIZ, map5));
                    } else {
                        sb.append(map5.toString());
                    }
                    sb.append("|||");
                }
            }
        }
        PromotionLabel promotionLabel = this.prelaunchPromotionLabel;
        if (promotionLabel != null && (map = promotionLabel.daInfo) != null) {
            if (z) {
                sb.append(GsonProtectorUtils.toJson(gsonLIZ, map));
            } else {
                sb.append(map.toString());
            }
            sb.append("|||");
        }
        if (sb.length() > 0 && sb.length() > 3) {
            sb.delete(sb.lastIndexOf("|||"), sb.length());
        }
        return sb.toString();
    }

    public final String mergeContentShowParams(String str, boolean z) {
        boolean z2;
        String eventParamProductPromotionTag = getEventParamProductPromotionTag(z, true);
        StringBuilder sb = new StringBuilder();
        if (eventParamProductPromotionTag.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            sb.append(eventParamProductPromotionTag);
            sb.append("|||");
        }
        if (str.length() > 0) {
            sb.append(str);
            sb.append("|||");
        }
        if (sb.length() > 0 && sb.length() > 3) {
            sb.delete(sb.lastIndexOf("|||"), sb.length());
        }
        return sb.toString();
    }

    public PromotionInfo(List<PromotionLabel> list, List<PromotionLabel> list2, Integer num, List<PromotionSticker> list3, PromotionProductPrice promotionProductPrice, List<PlacementLabel> list4, PromotionLabel promotionLabel, List<PromotionLabel> list5) {
        this.promotionLabels = list;
        this.secondPromotionLabels = list2;
        this.promotionLabelsShowStyle = num;
        this.promotionStickers = list3;
        this.productPrice = promotionProductPrice;
        this.placementLabels = list4;
        this.prelaunchPromotionLabel = promotionLabel;
        this.euComplianceLabels = list5;
    }
}
