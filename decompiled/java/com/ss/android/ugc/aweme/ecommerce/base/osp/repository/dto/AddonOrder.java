package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonOrder {

    @C09CT("notice")
    public AddonNotice addOnNotice;

    @C09CT("addon_display_product_id")
    public String addonDisplayProductId;

    @C09CT("addon_order_button")
    public AddonOrderButton addonOrderButton;

    @C09CT("addon_order_title")
    public ECRichText addonOrderTitle;

    @C09CT("addon_scene")
    public Integer addonScene;

    @C09CT("addon_sku_to_main_order")
    public Map<String, AddonSkuMainOrder> addonSkuToMainOrder;

    @C09CT("addon_title")
    public String addonTitle;

    @C09CT("addon_ui_config")
    public AddonUIConfig addonUiConfig;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("filtered_sku_list")
    public List<String> filterSku;

    @C09CT("is_selected")
    public Map<String, Boolean> isSelected;

    @C09CT("packed_skus")
    public List<PackedSku> packedSkus;

    @C09CT("recommend_scene")
    public String recommendScene;

    @C09CT("recommend_session_id")
    public String recommentSessionId;

    @C09CT("type")
    public Integer type;

    public AddonOrder() {
    }

    public final int LIZ() {
        Integer num = this.type;
        if (num != null && 11 == num.intValue()) {
            List<PackedSku> list = this.packedSkus;
            return (list == null || !(list.isEmpty() ^ true)) ? 0 : 1;
        }
        List<PackedSku> list2 = this.packedSkus;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    public AddonOrder(List<PackedSku> list, Map<String, Boolean> map, String str, Integer num, AddonNotice addonNotice, List<String> list2, String str2, ECRichText eCRichText, Map<String, AddonSkuMainOrder> map2, Integer num2, String str3, String str4, AddonUIConfig addonUIConfig, AddonOrderButton addonOrderButton, String str5) {
        this.packedSkus = list;
        this.isSelected = map;
        this.addonTitle = str;
        this.type = num;
        this.addOnNotice = addonNotice;
        this.filterSku = list2;
        this.daInfo = str2;
        this.addonOrderTitle = eCRichText;
        this.addonSkuToMainOrder = map2;
        this.addonScene = num2;
        this.recommendScene = str3;
        this.recommentSessionId = str4;
        this.addonUiConfig = addonUIConfig;
        this.addonOrderButton = addonOrderButton;
        this.addonDisplayProductId = str5;
    }
}
