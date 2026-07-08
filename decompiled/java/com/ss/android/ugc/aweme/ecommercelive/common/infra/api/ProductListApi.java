package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CS;
import X.C09CT;
import X.C0X52;
import X.C0X9S;
import X.C597720NcQ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleControl;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ProductPromotionInfo;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface ProductListApi {
    public static final C597720NcQ LIZ = C597720NcQ.LIZ;

    @InterfaceC1501160pAQ("{api_path}")
    C0X9S<BaseResponse<PopProductResp>> getIntroduceProductV2(@InterfaceC1501060pAG(encode = false, value = "api_path") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("pop_id") String str3, @InterfaceC1501070pAH("promotion_response_style") Integer num, @InterfaceC1501070pAH("traffic_source_list") String str4, @InterfaceC1501070pAH("user_type") Integer num2, @InterfaceC1501070pAH("time_tag") JSONObject jSONObject, @InterfaceC1501070pAH("use_new_promotion") int i, @InterfaceC1501070pAH("is_retry") boolean z, @InterfaceC1501070pAH("voucher_type_id") Long l, @InterfaceC1501070pAH("task_id") Long l2, @InterfaceC1501070pAH("task_type") Integer num3, @InterfaceC1501070pAH("pin_scene") int i2, @InterfaceC1501070pAH("live_voucher_type") Integer num4, @InterfaceC1501070pAH("creator_operation_unique_id") String str5, @InterfaceC1501070pAH("voucher_max_face_value") String str6);

    @InterfaceC1501170pAR("/aweme/v1/oec/live/more/action")
    Object getLiveMoreAction(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("traffic_source_list") String str2, @InterfaceC1501070pAH("trace_data") String str3, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetMoreActionResp>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/oec/content/creator/live/pin_card")
    C0X9S<BaseResponse<PopProductResp>> getPopFromBroadcast(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("kol_id") Long l, @InterfaceC1501070pAH("product_id") Long l2, @InterfaceC1501070pAH("voucher_type_id") Long l3, @InterfaceC1501070pAH("task_id") Long l4, @InterfaceC1501070pAH("task_type") Integer num, @InterfaceC1501070pAH("live_voucher_type") Integer num2, @InterfaceC1501070pAH("creator_operation_unique_id") String str, @InterfaceC1501070pAH("voucher_max_face_value") String str2);

    @InterfaceC1501160pAQ("{api_path}")
    Object getPopFromBroadcastV2(@InterfaceC1501060pAG(encode = false, value = "api_path") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("kol_id") Long l, @InterfaceC1501070pAH("product_id") Long l2, @InterfaceC1501070pAH("voucher_type_id") Long l3, @InterfaceC1501070pAH("task_id") Long l4, @InterfaceC1501070pAH("task_type") Integer num, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/product/pop/promotion")
    Object getPopPromotion(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("pop_id") String str2, @InterfaceC1501070pAH("promotion_response_style") Integer num, @InterfaceC1501070pAH("traffic_source_list") String str3, @InterfaceC1501070pAH("user_type") Integer num2, @InterfaceC1501070pAH("time_tag") JSONObject jSONObject, @InterfaceC1501070pAH("use_new_promotion") int i, @InterfaceC1501070pAH("is_retry") boolean z, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("{api_path}")
    Object getPopPromotionV2(@InterfaceC1501060pAG(encode = false, value = "api_path") String str, @InterfaceC1501070pAH("room_id") String str2, @InterfaceC1501070pAH("pop_id") String str3, @InterfaceC1501070pAH("promotion_response_style") Integer num, @InterfaceC1501070pAH("traffic_source_list") String str4, @InterfaceC1501070pAH("user_type") Integer num2, @InterfaceC1501070pAH("time_tag") JSONObject jSONObject, @InterfaceC1501070pAH("use_new_promotion") int i, @InterfaceC1501070pAH("is_retry") boolean z, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("{api_path}")
    Object getProductPromotionAndPriceV2(@InterfaceC1501060pAG(encode = false, value = "api_path") String str, @InterfaceC1485405rg GetProductPromotionAndPriceRequest getProductPromotionAndPriceRequest, InterfaceC1364105Vn<? super BaseResponse<GetProductPromotionAndPriceResponse>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/content/creator/live/voucher/pin")
    Object pinVoucherCard(@InterfaceC1485405rg PinVoucherRequest pinVoucherRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("{api_path}")
    Object queryPinV2(@InterfaceC1501060pAG(encode = false, value = "api_path") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("promotion_response_style") int i, @InterfaceC1501070pAH("traffic_source_list") String str2, @InterfaceC1501070pAH("user_type") Integer num, @InterfaceC1501070pAH("use_new_promotion") int i2, @InterfaceC1501070pAH("is_retry") boolean z, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("aweme/v1/oec/live/product/pop_refresh")
    Object refreshPinProduct(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("pop_id") String str2, @InterfaceC1501070pAH("promotion_response_style") Integer num, @InterfaceC1501070pAH("traffic_source_list") String str3, @InterfaceC1501070pAH("user_type") Integer num2, @InterfaceC1501070pAH("time_tag") JSONObject jSONObject, @InterfaceC1501070pAH("use_new_promotion") int i, @InterfaceC1501070pAH("is_retry") boolean z, InterfaceC1364105Vn<? super C0X52<BaseResponse<PopProductResp>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/affiliate/live/product/introduce")
    Object unpinCard(@InterfaceC1485405rg UnPinCardRequest unPinCardRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/affiliate/live/product_list/introduce")
    Object unpinCardList(@InterfaceC1485405rg UnPinCardListRequest unPinCardListRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    /* JADX INFO: loaded from: classes33.dex */
    public static final class GetProductPromotionAndPriceResponse {

        @C09CT("flash_sale_atmosphere_info")
        public final List<FlashSaleAtmosphereInfo> flashAtmosphereInfo;

        @C09CT("flash_sale_refresh_control")
        public final FlashSaleControl flashSaleRefreshControl;

        @C09CT("products")
        public final List<ProductPromotionInfo> products;

        @C09CT("promotion_style")
        @C09CS(StringJsonAdapterFactory.class)
        public final PromotionStyleConfig promotionStyleConfig;

        public GetProductPromotionAndPriceResponse(List<ProductPromotionInfo> list, List<FlashSaleAtmosphereInfo> list2, FlashSaleControl flashSaleControl, PromotionStyleConfig promotionStyleConfig) {
            this.products = list;
            this.flashAtmosphereInfo = list2;
            this.flashSaleRefreshControl = flashSaleControl;
            this.promotionStyleConfig = promotionStyleConfig;
        }
    }

    public static final class UnPinCardListRequest {

        @C09CT("cancel")
        public final Boolean cancel;

        @C09CT("kol_id")
        public final String kolId;

        @C09CT("operate_time")
        public final Long operateTime;

        @C09CT("room_id")
        public final String roomId;

        public UnPinCardListRequest(String str, Long l, Boolean bool, String str2) {
            this.roomId = str;
            this.operateTime = l;
            this.cancel = bool;
            this.kolId = str2;
        }
    }

    public static final class UnPinCardRequest {

        @C09CT("cancel")
        public final Boolean cancel;

        @C09CT("kol_id")
        public final String kolId;

        @C09CT("operate_time")
        public final Long operateTime;

        @C09CT("product_id")
        public final String productId;

        @C09CT("room_id")
        public final String roomId;

        public UnPinCardRequest(String str, String str2, Long l, Boolean bool, String str3) {
            this.roomId = str;
            this.productId = str2;
            this.operateTime = l;
            this.cancel = bool;
            this.kolId = str3;
        }
    }

    public static final class GetProductPromotionAndPriceRequest {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("is_retry")
        public final boolean isRetry;

        @C09CT("need_new_user_voucher")
        public final boolean needNewUserVoucher;

        @C09CT("product_ids")
        public final List<String> productIds;

        @C09CT("room_id")
        public final String roomId;

        @C09CT(Scene.SCENE_SERVICE)
        public final int scene;

        @C09CT("traffic_source_list")
        public final String trafficSourceList;

        @C09CT("use_new_promotion")
        public final int useNewPromotion;

        public GetProductPromotionAndPriceRequest(String str, String str2, String str3, boolean z, List<String> list, int i, int i2, boolean z2) {
            this.roomId = str;
            this.authorId = str2;
            this.trafficSourceList = str3;
            this.needNewUserVoucher = z;
            this.productIds = list;
            this.scene = i;
            this.useNewPromotion = i2;
            this.isRetry = z2;
        }
    }

    public static final class PinVoucherRequest {

        @C09CT("creator_operation_unique_id")
        public final String creatorOperationUniqueId;

        @C09CT("kol_id")
        public final Long kolId;

        @C09CT("live_voucher_type")
        public final Integer liveVoucherType;

        @C09CT("pin_action")
        public final Integer pinAction;

        @C09CT("room_id")
        public final Long roomId;

        @C09CT("task_id")
        public final Long taskId;

        @C09CT("task_type")
        public final Integer taskType;

        @C09CT("voucher_max_face_value")
        public final String voucherMaxFaceValue;

        @C09CT("voucher_type_id")
        public final Long voucherTypeId;

        public PinVoucherRequest(Long l, Long l2, Long l3, Long l4, Integer num, Integer num2, Integer num3, String str, String str2) {
            this.roomId = l;
            this.kolId = l2;
            this.voucherTypeId = l3;
            this.taskId = l4;
            this.taskType = num;
            this.pinAction = num2;
            this.liveVoucherType = num3;
            this.creatorOperationUniqueId = str;
            this.voucherMaxFaceValue = str2;
        }
    }
}
