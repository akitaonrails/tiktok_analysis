package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.repository.api;

import X.C040I;
import X.C09CT;
import X.C1750250veB;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GenPageLinkChainKeyData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GenPageLinkChainKeyRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface SeaShareApi {
    public static final C1750250veB LIZ = C1750250veB.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/pdp/share_link/get")
    Object LIZ(@C040I GetPDPShareLinkRequest getPDPShareLinkRequest, InterfaceC1364105Vn<? super Response<PDPShareLinkResponseData>> interfaceC1364105Vn);

    public static final class CutPriceShareLinkData {

        @C09CT("cut_price_share_link_data_for_fe")
        public final Map<String, Object> dataForFE;

        @C09CT("schema")
        public final String schema;

        @C09CT("track_params_key_list")
        public final List<String> trackParamsKeyList;

        public CutPriceShareLinkData() {
            this(null, null, null);
        }

        public CutPriceShareLinkData(String str, Map<String, ? extends Object> map, List<String> list) {
            this.schema = str;
            this.dataForFE = map;
            this.trackParamsKeyList = list;
        }
    }

    public static final class GetPDPShareLinkRequest {

        @C09CT("creator_share_link_params")
        public final GenPageLinkChainKeyRequest creatorShareLinkParams;

        @C09CT("product_meta")
        public final PDPShareLinkProductMeta productMeta;

        @C09CT(Scene.SCENE_SERVICE)
        public final Integer shareLinkScene;

        public GetPDPShareLinkRequest() {
            this(null, null, null);
        }

        public GetPDPShareLinkRequest(Integer num, PDPShareLinkProductMeta pDPShareLinkProductMeta, GenPageLinkChainKeyRequest genPageLinkChainKeyRequest) {
            this.shareLinkScene = num;
            this.productMeta = pDPShareLinkProductMeta;
            this.creatorShareLinkParams = genPageLinkChainKeyRequest;
        }
    }

    public static final class PDPShareLinkProductMeta {

        @C09CT("formatted_target_price")
        public final String formatTargetPrice;

        @C09CT("product_id")
        public final String productId;

        @C09CT("product_image")
        public final String productImage;

        public PDPShareLinkProductMeta() {
            this(null, null, null);
        }

        public PDPShareLinkProductMeta(String str, String str2, String str3) {
            this.productId = str;
            this.productImage = str2;
            this.formatTargetPrice = str3;
        }
    }

    public static final class PDPShareLinkResponseData {

        @C09CT("creator_share_link_data")
        public final GenPageLinkChainKeyData creatorShareLinkData;

        @C09CT("cut_price_share_link_data")
        public final CutPriceShareLinkData cutPriceShareLinkData;

        @C09CT("share_link_type")
        public final Integer shareLinkType;

        public PDPShareLinkResponseData() {
            this(null, null, null);
        }

        public PDPShareLinkResponseData(Integer num, GenPageLinkChainKeyData genPageLinkChainKeyData, CutPriceShareLinkData cutPriceShareLinkData) {
            this.shareLinkType = num;
            this.creatorShareLinkData = genPageLinkChainKeyData;
            this.cutPriceShareLinkData = cutPriceShareLinkData;
        }
    }
}
