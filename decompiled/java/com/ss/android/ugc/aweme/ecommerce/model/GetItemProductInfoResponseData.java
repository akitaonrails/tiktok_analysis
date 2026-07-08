package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CS;
import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class GetItemProductInfoResponseData {
    public transient long LIZ;

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("multi_panel_common_voucher")
    public final List<PanelVoucherInfo> commonVoucher;

    @C09CT("contain_multi_panel_resp")
    public final Boolean containMultiPanelResp;

    @C09CT("video_expansion_voucher")
    public final PanelExpansionVoucher expansionVoucher;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("multi_anchor_ymal_schema")
    public final MultiAnchorYmalSchema multiAnchorYmalSchema;

    @C09CT("products")
    public final List<AnchorProductInfo> products;

    @C09CT("promotion_resource")
    public final PromotionResource promotionResource;

    @C09CT("promotion_style")
    @C09CS(StringJsonAdapterFactory.class)
    public final PromotionStyleConfig promotionStyleConfig;

    @C09CT("server_time")
    public final long serverTime;

    public static GetItemProductInfoResponseData LIZ(GetItemProductInfoResponseData getItemProductInfoResponseData, List list, int i) {
        List<AnchorProductInfo> list2;
        CartEntry cartEntry;
        Boolean bool;
        Boolean bool2;
        long j;
        PromotionResource promotionResource;
        MultiAnchorYmalSchema multiAnchorYmalSchema;
        Map<String, String> map;
        PanelExpansionVoucher panelExpansionVoucher;
        List list3 = list;
        PromotionStyleConfig promotionStyleConfig = null;
        if ((i & 1) != 0) {
            list2 = getItemProductInfoResponseData.products;
        } else {
            list2 = null;
        }
        if ((i & 2) != 0) {
            cartEntry = getItemProductInfoResponseData.cartEntry;
        } else {
            cartEntry = null;
        }
        if ((i & 4) != 0) {
            bool = getItemProductInfoResponseData.isNewUser;
        } else {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = getItemProductInfoResponseData.containMultiPanelResp;
        } else {
            bool2 = null;
        }
        long j2 = 0;
        if ((i & 16) != 0) {
            j = getItemProductInfoResponseData.serverTime;
        } else {
            j = 0;
        }
        if ((i & 32) != 0) {
            j2 = getItemProductInfoResponseData.LIZ;
        }
        if ((i & 64) != 0) {
            list3 = getItemProductInfoResponseData.commonVoucher;
        }
        if ((i & 128) != 0) {
            promotionResource = getItemProductInfoResponseData.promotionResource;
        } else {
            promotionResource = null;
        }
        if ((i & 256) != 0) {
            multiAnchorYmalSchema = getItemProductInfoResponseData.multiAnchorYmalSchema;
        } else {
            multiAnchorYmalSchema = null;
        }
        if ((i & 512) != 0) {
            map = getItemProductInfoResponseData.extra;
        } else {
            map = null;
        }
        if ((i & 1024) != 0) {
            panelExpansionVoucher = getItemProductInfoResponseData.expansionVoucher;
        } else {
            panelExpansionVoucher = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            promotionStyleConfig = getItemProductInfoResponseData.promotionStyleConfig;
        }
        return new GetItemProductInfoResponseData(list2, cartEntry, bool, bool2, j, j2, list3, promotionResource, multiAnchorYmalSchema, map, panelExpansionVoucher, promotionStyleConfig);
    }

    public GetItemProductInfoResponseData(List<AnchorProductInfo> list, CartEntry cartEntry, Boolean bool, Boolean bool2, long j, long j2, List<PanelVoucherInfo> list2, PromotionResource promotionResource, MultiAnchorYmalSchema multiAnchorYmalSchema, Map<String, String> map, PanelExpansionVoucher panelExpansionVoucher, PromotionStyleConfig promotionStyleConfig) {
        this.products = list;
        this.cartEntry = cartEntry;
        this.isNewUser = bool;
        this.containMultiPanelResp = bool2;
        this.serverTime = j;
        this.LIZ = j2;
        this.commonVoucher = list2;
        this.promotionResource = promotionResource;
        this.multiAnchorYmalSchema = multiAnchorYmalSchema;
        this.extra = map;
        this.expansionVoucher = panelExpansionVoucher;
        this.promotionStyleConfig = promotionStyleConfig;
    }
}
