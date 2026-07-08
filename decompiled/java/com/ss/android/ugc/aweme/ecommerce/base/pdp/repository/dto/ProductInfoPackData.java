package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductInfoPackData {

    @C09CT("ai_assistant")
    public final AiAssistant aiAssistant;

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("dynamic_page")
    public final DynamicPage dynamicPage;

    @C09CT("favorite")
    public final Favorite favorite;

    @C09CT("has_pay_method")
    public final Boolean hasPayMethod;

    @C09CT("has_shipping_address")
    public final Boolean hasShippingAddress;

    @C09CT("help_center_schema_url")
    public final String helpCenterSchemaUrl;

    @C09CT("log_id")
    public final String logId;

    @C09CT("popup")
    public final PopUp popUp;

    @C09CT("product_unavailable_info")
    public final ProductUnavailableInfo productUnavailableInfo;

    @C09CT("products")
    public final List<ProductPackStruct> productionInfoPack;

    @C09CT("recommendation_context")
    public final RecommendationContext recommendationContext;

    @C09CT("schema_info")
    public final DynamicSchema schemaInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfoPackData)) {
            return false;
        }
        ProductInfoPackData productInfoPackData = (ProductInfoPackData) obj;
        return Intrinsics.LJFF(this.productionInfoPack, productInfoPackData.productionInfoPack) && Intrinsics.LJFF(this.cartEntry, productInfoPackData.cartEntry) && Intrinsics.LJFF(this.popUp, productInfoPackData.popUp) && Intrinsics.LJFF(this.hasShippingAddress, productInfoPackData.hasShippingAddress) && Intrinsics.LJFF(this.hasPayMethod, productInfoPackData.hasPayMethod) && Intrinsics.LJFF(this.schemaInfo, productInfoPackData.schemaInfo) && Intrinsics.LJFF(this.productUnavailableInfo, productInfoPackData.productUnavailableInfo) && Intrinsics.LJFF(this.dynamicPage, productInfoPackData.dynamicPage) && Intrinsics.LJFF(this.logId, productInfoPackData.logId) && Intrinsics.LJFF(this.favorite, productInfoPackData.favorite) && Intrinsics.LJFF(this.helpCenterSchemaUrl, productInfoPackData.helpCenterSchemaUrl) && Intrinsics.LJFF(this.aiAssistant, productInfoPackData.aiAssistant) && Intrinsics.LJFF(this.recommendationContext, productInfoPackData.recommendationContext);
    }

    public ProductInfoPackData(List<ProductPackStruct> list, CartEntry cartEntry, PopUp popUp, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema, ProductUnavailableInfo productUnavailableInfo, DynamicPage dynamicPage, String str, Favorite favorite, String str2, AiAssistant aiAssistant, RecommendationContext recommendationContext) {
        this.productionInfoPack = list;
        this.cartEntry = cartEntry;
        this.popUp = popUp;
        this.hasShippingAddress = bool;
        this.hasPayMethod = bool2;
        this.schemaInfo = dynamicSchema;
        this.productUnavailableInfo = productUnavailableInfo;
        this.dynamicPage = dynamicPage;
        this.logId = str;
        this.favorite = favorite;
        this.helpCenterSchemaUrl = str2;
        this.aiAssistant = aiAssistant;
        this.recommendationContext = recommendationContext;
    }
}
