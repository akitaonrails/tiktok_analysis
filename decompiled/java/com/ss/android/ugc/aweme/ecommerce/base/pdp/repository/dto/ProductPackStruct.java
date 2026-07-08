package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1021703z5;
import X.C1022903zH;
import X.C1741890vQh;
import X.C748002w2;
import X.C786410Ut5;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.goda.model.dto.GodaProtocol;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AiAssistant;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BubbleSellingPoints;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ConvenientSubmitOrder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CouponPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceLayerData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DefaultSelection;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExchangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Favorite;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LazyLoadInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LockUpBadge;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LowerPricedRecommendations;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxCreatorModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NoticeMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupTrigger;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecipientInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SKUPanelBottomText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpMediaWindow;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.ProductSellingPoints;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SeaSkuPanelData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpCacheCleanerSettingModel;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductPackStruct implements InterfaceC111300bX, Parcelable {

    @C09CT("activity_info")
    public PickTag activityInfo;

    @C09CT("add_to_cart_button")
    public AddToCartButton addToCartButton;

    @C09CT("ai_assistant")
    public AiAssistant aiAssistant;

    @C09CT("announcements")
    public List<Announcement> announcements;

    @C09CT("product_base")
    public ProductBase baseInfo;

    @C09CT("bcm_standard_track")
    public BCMStandardTrack bcmStandardTrack;

    @C09CT("bill_info_server_params")
    public String billInfoParams;

    @C09CT("bill_scene_type")
    public Integer billSceneType;

    @C09CT("biz_type")
    public Integer bizType;

    @C09CT("block_page_info")
    public BlockPageInfo blockPageInfo;

    @C09CT("button_area")
    public PdpBottomArea bottomArea;

    @C09CT("bottom_nav_bar_style")
    public Integer bottomNavBarStyle;

    @C09CT("brand_info")
    public BrandInfo brandInfo;

    @C09CT("bricks")
    public List<BrickInfo> bricks;

    @C09CT("bubble_selling_points")
    public BubbleSellingPoints bubbleSellingPoints;

    @C09CT("bundle_brief")
    public BundleBrief bundleBrief;

    @C09CT("button_dynamic_data")
    public Map<String, String> buttonDynamicData;

    @C09CT("buy_button")
    public BuyButton buyButton;

    @C09CT("buy_button_interest_id")
    public String buyButtonInterestId;

    @C09CT("cart_entry")
    public CartEntry cartEntry;

    @C09CT("chain_key")
    public String chainKey;

    @C09CT("convenient_submit_order")
    public ConvenientSubmitOrder convenientSubmitOrder;

    @C09CT("coupons_and_promotions")
    public CouponPromotion couponPromotion;

    @C09CT("creator_videos")
    public List<Video> creatorVideos;

    @C09CT("cut_price_layer_data")
    public CutPriceLayerData cutPriceLayerData;

    @C09CT("da_info")
    public String daInfo;
    public Integer dataType;

    @C09CT("default_address_id")
    public String defaultAddressId;

    @C09CT("default_selection")
    public DefaultSelection defaultSelection;

    @C09CT("default_sku_id")
    public String defaultSkuId;

    @C09CT("entrance_bubble")
    public EntranceBubble entranceBubble;

    @C09CT("exception_ux")
    public ExceptionUX exceptionUX;

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("favorite")
    public Favorite favorite;

    @C09CT("save_status")
    public Integer favoriteStatus;

    @C09CT("flash_sale")
    public FlashSale flashSale;
    public Boolean fullResponse;

    @C09CT("global_waist_banner")
    public GlobalWaistBanner globalWaistBanner;

    @C09CT("goda_protocol")
    public GodaProtocol godaProtocol;
    public JSONObject godaProtocolJSON;

    @C09CT("goda_protocol_v2")
    public GodaV2Protocol<?> godaV2Protocol;

    @C09CT("has_pay_method")
    public Boolean hasPayMethod;

    @C09CT("has_shipping_address")
    public Boolean hasShippingAddress;

    @C09CT("header_slide_entrance")
    public HeaderSlideEntrance headerSlideEntrance;

    @C09CT("help_center_schema_url")
    public String helpCenterSchemaUrl;

    @C09CT("hybrid_extra")
    public String hybridExtra;

    @C09CT("insurance_lynx_info")
    public LynxInfo insuranceLynxInfo;
    public Boolean isBatchDataForGodaV2;

    @C09CT("is_platform_product")
    public Boolean isPlatformProductLink;

    @C09CT("lazy_load_info")
    public LazyLoadInfo lazyLoadInfo;

    @C09CT("_preprocess_image_monitor")
    public boolean localPreprocessImageMonitor;

    @C09CT("local_size_sale_prop")
    public StandardSaleProps localSizeSaleProp;

    @C09CT("lock_up_badge")
    public LockUpBadge lockUpBadge;

    @C09CT("lock_up_static_selling_point")
    public String lockUpStaticSellingPoint;

    @C09CT("logistic")
    public LogisticDTO logistic;

    @C09CT("lower_priced_similar_recommendations")
    public LowerPricedRecommendations lowerPricedRecommendation;

    @C09CT("lynx_creator_module")
    public LynxCreatorModule lynxCreatorModule;

    @C09CT("marketing_config")
    public MarketingConfig marketingConfig;

    @C09CT("media_window")
    public SeaPdpMediaWindow mediaWindow;

    @C09CT("model_card")
    public ModelCard modelCard;

    @C09CT("next_request_scene")
    public List<NextRequestScene> nextRequestScenes;

    @C09CT("notice_msg")
    public NoticeMessage noticeMessage;

    @C09CT("ocp_context")
    public OneClickPayContext ocpContext;

    @C09CT("page_biz_list")
    public List<BizParserInfo> pageBizList;

    @C09CT("page_expression_type")
    public Integer pageExpressionType;

    @C09CT("pdp_logistic_module")
    public PDPLogisticModule pdpLogisticModule;

    @C09CT("pdp_payment_module")
    public PdpPaymentModule pdpPaymentModule;

    @C09CT("pdp_product_measurement_module")
    public PdpProductMeasurementModule pdpProductMeasurementModule;

    @C09CT("pop_up")
    public PopUp popUp;

    @C09CT("pop_up_triggers")
    public List<PopupTrigger> popupTriggers;

    @C09CT("preorder_info_undecided_sku")
    public PreOrderInfo preOrderInfo;

    @C09CT("product_banner_labels")
    public List<ProductBannerLabel> productBannerLabel;

    @C09CT("product_id")
    public String productId;

    @C09CT("product_interlink")
    public ProductInterlinkModuleVO productInterlink;

    @C09CT("product_logo")
    public List<ProductLogo> productLogos;

    @C09CT("recommendation_context")
    public RecommendationContext productRecommendContext;

    @C09CT("product_selling_points")
    public ProductSellingPoints productSellingPoints;

    @C09CT("product_unavailable_info")
    public ProductUnavailableInfo productUnavailableInfo;

    @C09CT("promotion_discount")
    public List<PromotionDiscount> promotionDiscounts;

    @C09CT("promotion_entrance")
    public PromotionEntrance promotionEntrance;

    @C09CT("promotion_label_info")
    public PromotionLabelVO promotionLabels;

    @C09CT("promotion_logos")
    public List<PromotionLogo> promotionLogos;

    @C09CT("promotion_reform")
    public Boolean promotionReform;

    @C09CT("promotion_view")
    public com.bytedance.android.livesdk.model.message.ext.PromotionView promotionView;

    @C09CT("promotion_waist")
    public PromotionWaist promotionWaist;

    @C09CT("purchase_limit")
    public PurchaseLimit purchaseLimit;

    @C09CT("purchase_method_info")
    public PurchaseMethodInfo purchaseMethodInfo;

    @C09CT("rank_info")
    public RankInfo rankInfo;

    @C09CT("recipient_info")
    public RecipientInfo recipientInfo;

    @C09CT("return_policy")
    public UserRight returnPolicy;

    @C09CT("product_detail_review")
    public ProductDetailReview review;

    @C09CT("sale_props")
    public List<SaleProp> saleProps;

    @C09CT("schema_info")
    public DynamicSchema schemaInfo;

    @C09CT("cci_payment_module")
    public SEACCIPaymentModule seaCciPaymentModule;

    @C09CT("sea_core_biz_da_info")
    public String seaCoreBizDaInfo;

    @C09CT("self_operated_slogan")
    public SelfOperatedSloganInfo selfOperatedSloganInfo;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("seller")
    public SellerInfo sellerInfo;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("shipping")
    public PdpShipping shipping;

    @C09CT("shop_review_entry")
    public ShopReviewEntry shopReview;

    @C09CT("skc_info")
    public SkcInfo skcInfo;

    @C09CT("sku_common_config")
    public SkuCommonConfig skuCommonConfig;

    @C09CT("sku_panel_bottom_text")
    public SKUPanelBottomText skuPanelBottomText;

    @C09CT("sku_panel_data")
    public SeaSkuPanelData skuPanelData;

    @C09CT("sku_panel_open")
    public Boolean skuPanelOpen;

    @C09CT("sku_panel_promotion_waist")
    public PromotionWaist skuPanelPromotionWaist;

    @C09CT("sku_panel_reminder")
    public ExchangeInfo skuPanelReminder;

    @C09CT("sku_panel_waist_banner")
    public SeaSkuPanelWaistBanner skuPanelWaistBanner;

    @C09CT("sku_style")
    public Integer skuStyle;

    @C09CT("skus")
    public List<SkuItem> skus;

    @C09CT("static_selling_points")
    public List<StaticSellingPoint> staticSellingPoints;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("tabs")
    public List<Tab> tabs;

    @C09CT("template")
    public Integer template;

    @C09CT("try_on")
    public TryOnData tryOnData;

    @C09CT("unavailable_info")
    public ProductUnavailableInfo unavailableInfo;

    @C09CT("user_right")
    public UserRight userRight;

    @C09CT("voucher_info")
    public com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo voucherInfo;

    @C09CT("warehouse_tag")
    public WarehouseTag warehouseTag;

    @C09CT("with_coupon")
    public Boolean withCoupon;
    public static final C1022903zH Companion = new Object() { // from class: X.03zH
    };
    public static final Parcelable.Creator<ProductPackStruct> CREATOR = new Parcelable.Creator<ProductPackStruct>() { // from class: X.03T2
        @Override // android.os.Parcelable.Creator
        public final ProductPackStruct createFromParcel(Parcel parcel) {
            Integer numValueOf;
            SellerInfo sellerInfoCreateFromParcel;
            SelfOperatedSloganInfo selfOperatedSloganInfoCreateFromParcel;
            ProductBase productBaseCreateFromParcel;
            ArrayList arrayList;
            StandardSaleProps standardSalePropsCreateFromParcel;
            PromotionLabelVO promotionLabelVOCreateFromParcel;
            ArrayList arrayList2;
            SkcInfo skcInfoCreateFromParcel;
            ArrayList arrayList3;
            UserRight userRightCreateFromParcel;
            LogisticDTO logisticDTOCreateFromParcel;
            VoucherInfo voucherInfoCreateFromParcel;
            ModelCard modelCardCreateFromParcel;
            ProductDetailReview productDetailReviewCreateFromParcel;
            ShopReviewEntry shopReviewEntryCreateFromParcel;
            FlashSale flashSaleCreateFromParcel;
            ArrayList arrayList4;
            AddToCartButton addToCartButtonCreateFromParcel;
            PickTag pickTagCreateFromParcel;
            ArrayList arrayList5;
            ArrayList arrayList6;
            PopUp popUpCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            DynamicSchema dynamicSchemaCreateFromParcel;
            LinkedHashMap linkedHashMap;
            BuyButton buyButtonCreateFromParcel;
            ProductUnavailableInfo productUnavailableInfoCreateFromParcel;
            ShareInfo shareInfoCreateFromParcel;
            ArrayList arrayList7;
            RankInfo rankInfoCreateFromParcel;
            PreOrderInfo preOrderInfoCreateFromParcel;
            PromotionEntrance promotionEntranceCreateFromParcel;
            Integer numValueOf2;
            MarketingConfig marketingConfigCreateFromParcel;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ProductUnavailableInfo productUnavailableInfoCreateFromParcel2;
            Integer numValueOf3;
            BlockPageInfo blockPageInfoCreateFromParcel;
            ArrayList arrayList11;
            SKUPanelBottomText sKUPanelBottomTextCreateFromParcel;
            SkuCommonConfig skuCommonConfigCreateFromParcel;
            PDPLogisticModule pDPLogisticModuleCreateFromParcel;
            PdpPaymentModule pdpPaymentModuleCreateFromParcel;
            SEACCIPaymentModule sEACCIPaymentModuleCreateFromParcel;
            UserRight userRightCreateFromParcel2;
            WarehouseTag warehouseTagCreateFromParcel;
            boolean z3;
            Boolean boolValueOf3;
            boolean z4;
            Boolean boolValueOf4;
            Integer numValueOf4;
            Integer numValueOf5;
            BundleBrief bundleBriefCreateFromParcel;
            LazyLoadInfo lazyLoadInfoCreateFromParcel;
            PdpShipping pdpShippingCreateFromParcel;
            Integer numValueOf6;
            Integer numValueOf7;
            Integer numValueOf8;
            Favorite favoriteCreateFromParcel;
            GlobalWaistBanner globalWaistBannerCreateFromParcel;
            PromotionWaist promotionWaistCreateFromParcel;
            SeaSkuPanelWaistBanner seaSkuPanelWaistBannerCreateFromParcel;
            PromotionWaist promotionWaistCreateFromParcel2;
            SeaSkuPanelData seaSkuPanelDataCreateFromParcel;
            CouponPromotion couponPromotionCreateFromParcel;
            LowerPricedRecommendations lowerPricedRecommendationsCreateFromParcel;
            PdpBottomArea pdpBottomAreaCreateFromParcel;
            PurchaseLimit purchaseLimitCreateFromParcel;
            ConvenientSubmitOrder convenientSubmitOrderCreateFromParcel;
            ArrayList arrayList12;
            BrandInfo brandInfoCreateFromParcel;
            HeaderSlideEntrance headerSlideEntranceCreateFromParcel;
            NoticeMessage noticeMessageCreateFromParcel;
            DefaultSelection defaultSelectionCreateFromParcel;
            ArrayList arrayList13;
            ArrayList arrayList14;
            LockUpBadge lockUpBadgeCreateFromParcel;
            boolean z5;
            PdpProductMeasurementModule pdpProductMeasurementModuleCreateFromParcel;
            LynxCreatorModule lynxCreatorModuleCreateFromParcel;
            boolean z6;
            Boolean boolValueOf5;
            EntranceBubble entranceBubbleCreateFromParcel;
            BubbleSellingPoints bubbleSellingPointsCreateFromParcel;
            ExchangeInfo exchangeInfoCreateFromParcel;
            BCMStandardTrack bCMStandardTrackCreateFromParcel;
            PurchaseMethodInfo purchaseMethodInfoCreateFromParcel;
            ProductInterlinkModuleVO productInterlinkModuleVOCreateFromParcel;
            ProductSellingPoints productSellingPointsCreateFromParcel;
            TryOnData tryOnDataCreateFromParcel;
            AiAssistant aiAssistantCreateFromParcel;
            LynxInfo lynxInfoCreateFromParcel;
            RecommendationContext recommendationContextCreateFromParcel;
            boolean z7;
            Boolean boolValueOf6;
            LinkedHashMap linkedHashMap2;
            CutPriceLayerData cutPriceLayerDataCreateFromParcel;
            SeaPdpMediaWindow seaPdpMediaWindowCreateFromParcel;
            RecipientInfo recipientInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                sellerInfoCreateFromParcel = null;
            } else {
                sellerInfoCreateFromParcel = SellerInfo.CREATOR.createFromParcel(parcel);
            }
            SellerInfo sellerInfo = sellerInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                selfOperatedSloganInfoCreateFromParcel = null;
            } else {
                selfOperatedSloganInfoCreateFromParcel = SelfOperatedSloganInfo.CREATOR.createFromParcel(parcel);
            }
            SelfOperatedSloganInfo selfOperatedSloganInfo = selfOperatedSloganInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                productBaseCreateFromParcel = null;
            } else {
                productBaseCreateFromParcel = ProductBase.CREATOR.createFromParcel(parcel);
            }
            ProductBase productBase = productBaseCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Video.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                standardSalePropsCreateFromParcel = null;
            } else {
                standardSalePropsCreateFromParcel = StandardSaleProps.CREATOR.createFromParcel(parcel);
            }
            StandardSaleProps standardSaleProps = standardSalePropsCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionLabelVOCreateFromParcel = null;
            } else {
                promotionLabelVOCreateFromParcel = PromotionLabelVO.CREATOR.createFromParcel(parcel);
            }
            PromotionLabelVO promotionLabelVO = promotionLabelVOCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SaleProp.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                skcInfoCreateFromParcel = null;
            } else {
                skcInfoCreateFromParcel = SkcInfo.CREATOR.createFromParcel(parcel);
            }
            SkcInfo skcInfo = skcInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(SkuItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                userRightCreateFromParcel = null;
            } else {
                userRightCreateFromParcel = UserRight.CREATOR.createFromParcel(parcel);
            }
            UserRight userRight = userRightCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticDTOCreateFromParcel = null;
            } else {
                logisticDTOCreateFromParcel = LogisticDTO.CREATOR.createFromParcel(parcel);
            }
            LogisticDTO logisticDTO = logisticDTOCreateFromParcel;
            if (parcel.readInt() == 0) {
                voucherInfoCreateFromParcel = null;
            } else {
                voucherInfoCreateFromParcel = VoucherInfo.CREATOR.createFromParcel(parcel);
            }
            VoucherInfo voucherInfo = voucherInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                modelCardCreateFromParcel = null;
            } else {
                modelCardCreateFromParcel = ModelCard.CREATOR.createFromParcel(parcel);
            }
            ModelCard modelCard = modelCardCreateFromParcel;
            if (parcel.readInt() == 0) {
                productDetailReviewCreateFromParcel = null;
            } else {
                productDetailReviewCreateFromParcel = ProductDetailReview.CREATOR.createFromParcel(parcel);
            }
            ProductDetailReview productDetailReview = productDetailReviewCreateFromParcel;
            if (parcel.readInt() == 0) {
                shopReviewEntryCreateFromParcel = null;
            } else {
                shopReviewEntryCreateFromParcel = ShopReviewEntry.CREATOR.createFromParcel(parcel);
            }
            ShopReviewEntry shopReviewEntry = shopReviewEntryCreateFromParcel;
            if (parcel.readInt() == 0) {
                flashSaleCreateFromParcel = null;
            } else {
                flashSaleCreateFromParcel = FlashSale.CREATOR.createFromParcel(parcel);
            }
            FlashSale flashSale = flashSaleCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(ProductBannerLabel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                addToCartButtonCreateFromParcel = null;
            } else {
                addToCartButtonCreateFromParcel = AddToCartButton.CREATOR.createFromParcel(parcel);
            }
            AddToCartButton addToCartButton = addToCartButtonCreateFromParcel;
            CartEntry cartEntry = (CartEntry) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
            if (parcel.readInt() == 0) {
                pickTagCreateFromParcel = null;
            } else {
                pickTagCreateFromParcel = PickTag.CREATOR.createFromParcel(parcel);
            }
            PickTag pickTag = pickTagCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i9 = parcel.readInt();
                arrayList5 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList5.add(PromotionLogo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i11 = parcel.readInt();
                arrayList6 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList6.add(ProductLogo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                popUpCreateFromParcel = null;
            } else {
                popUpCreateFromParcel = PopUp.CREATOR.createFromParcel(parcel);
            }
            PopUp popUp = popUpCreateFromParcel;
            String string2 = parcel.readString();
            PromotionView promotionView = (PromotionView) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
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
                dynamicSchemaCreateFromParcel = null;
            } else {
                dynamicSchemaCreateFromParcel = DynamicSchema.CREATOR.createFromParcel(parcel);
            }
            DynamicSchema dynamicSchema = dynamicSchemaCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                buyButtonCreateFromParcel = null;
            } else {
                buyButtonCreateFromParcel = BuyButton.CREATOR.createFromParcel(parcel);
            }
            BuyButton buyButton = buyButtonCreateFromParcel;
            if (parcel.readInt() == 0) {
                productUnavailableInfoCreateFromParcel = null;
            } else {
                productUnavailableInfoCreateFromParcel = ProductUnavailableInfo.CREATOR.createFromParcel(parcel);
            }
            ProductUnavailableInfo productUnavailableInfo = productUnavailableInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                shareInfoCreateFromParcel = null;
            } else {
                shareInfoCreateFromParcel = ShareInfo.CREATOR.createFromParcel(parcel);
            }
            ShareInfo shareInfo = shareInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList7 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList7.add(StaticSellingPoint.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                rankInfoCreateFromParcel = null;
            } else {
                rankInfoCreateFromParcel = RankInfo.CREATOR.createFromParcel(parcel);
            }
            RankInfo rankInfo = rankInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                preOrderInfoCreateFromParcel = null;
            } else {
                preOrderInfoCreateFromParcel = PreOrderInfo.CREATOR.createFromParcel(parcel);
            }
            PreOrderInfo preOrderInfo = preOrderInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionEntranceCreateFromParcel = null;
            } else {
                promotionEntranceCreateFromParcel = PromotionEntrance.CREATOR.createFromParcel(parcel);
            }
            PromotionEntrance promotionEntrance = promotionEntranceCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                marketingConfigCreateFromParcel = null;
            } else {
                marketingConfigCreateFromParcel = MarketingConfig.CREATOR.createFromParcel(parcel);
            }
            MarketingConfig marketingConfig = marketingConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList8 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList8.add(PromotionDiscount.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int i19 = parcel.readInt();
                arrayList9 = new ArrayList(i19);
                for (int i20 = 0; i20 != i19; i20++) {
                    arrayList9.add(BrickInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int i21 = parcel.readInt();
                arrayList10 = new ArrayList(i21);
                for (int i22 = 0; i22 != i21; i22++) {
                    arrayList10.add(Tab.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                productUnavailableInfoCreateFromParcel2 = null;
            } else {
                productUnavailableInfoCreateFromParcel2 = ProductUnavailableInfo.CREATOR.createFromParcel(parcel);
            }
            ProductUnavailableInfo productUnavailableInfo2 = productUnavailableInfoCreateFromParcel2;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                blockPageInfoCreateFromParcel = null;
            } else {
                blockPageInfoCreateFromParcel = BlockPageInfo.CREATOR.createFromParcel(parcel);
            }
            BlockPageInfo blockPageInfo = blockPageInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int i23 = parcel.readInt();
                arrayList11 = new ArrayList(i23);
                for (int i24 = 0; i24 != i23; i24++) {
                    arrayList11.add(Announcement.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                sKUPanelBottomTextCreateFromParcel = null;
            } else {
                sKUPanelBottomTextCreateFromParcel = SKUPanelBottomText.CREATOR.createFromParcel(parcel);
            }
            SKUPanelBottomText sKUPanelBottomText = sKUPanelBottomTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                skuCommonConfigCreateFromParcel = null;
            } else {
                skuCommonConfigCreateFromParcel = SkuCommonConfig.CREATOR.createFromParcel(parcel);
            }
            SkuCommonConfig skuCommonConfig = skuCommonConfigCreateFromParcel;
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                pDPLogisticModuleCreateFromParcel = null;
            } else {
                pDPLogisticModuleCreateFromParcel = PDPLogisticModule.CREATOR.createFromParcel(parcel);
            }
            PDPLogisticModule pDPLogisticModule = pDPLogisticModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                pdpPaymentModuleCreateFromParcel = null;
            } else {
                pdpPaymentModuleCreateFromParcel = PdpPaymentModule.CREATOR.createFromParcel(parcel);
            }
            PdpPaymentModule pdpPaymentModule = pdpPaymentModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                sEACCIPaymentModuleCreateFromParcel = null;
            } else {
                sEACCIPaymentModuleCreateFromParcel = SEACCIPaymentModule.CREATOR.createFromParcel(parcel);
            }
            SEACCIPaymentModule sEACCIPaymentModule = sEACCIPaymentModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                userRightCreateFromParcel2 = null;
            } else {
                userRightCreateFromParcel2 = UserRight.CREATOR.createFromParcel(parcel);
            }
            UserRight userRight2 = userRightCreateFromParcel2;
            if (parcel.readInt() == 0) {
                warehouseTagCreateFromParcel = null;
            } else {
                warehouseTagCreateFromParcel = WarehouseTag.CREATOR.createFromParcel(parcel);
            }
            WarehouseTag warehouseTag = warehouseTagCreateFromParcel;
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
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf4 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                bundleBriefCreateFromParcel = null;
            } else {
                bundleBriefCreateFromParcel = BundleBrief.CREATOR.createFromParcel(parcel);
            }
            BundleBrief bundleBrief = bundleBriefCreateFromParcel;
            if (parcel.readInt() == 0) {
                lazyLoadInfoCreateFromParcel = null;
            } else {
                lazyLoadInfoCreateFromParcel = LazyLoadInfo.CREATOR.createFromParcel(parcel);
            }
            LazyLoadInfo lazyLoadInfo = lazyLoadInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                pdpShippingCreateFromParcel = null;
            } else {
                pdpShippingCreateFromParcel = PdpShipping.CREATOR.createFromParcel(parcel);
            }
            PdpShipping pdpShipping = pdpShippingCreateFromParcel;
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf8 = null;
            } else {
                numValueOf8 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                favoriteCreateFromParcel = null;
            } else {
                favoriteCreateFromParcel = Favorite.CREATOR.createFromParcel(parcel);
            }
            Favorite favorite = favoriteCreateFromParcel;
            if (parcel.readInt() == 0) {
                globalWaistBannerCreateFromParcel = null;
            } else {
                globalWaistBannerCreateFromParcel = GlobalWaistBanner.CREATOR.createFromParcel(parcel);
            }
            GlobalWaistBanner globalWaistBanner = globalWaistBannerCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionWaistCreateFromParcel = null;
            } else {
                promotionWaistCreateFromParcel = PromotionWaist.CREATOR.createFromParcel(parcel);
            }
            PromotionWaist promotionWaist = promotionWaistCreateFromParcel;
            if (parcel.readInt() == 0) {
                seaSkuPanelWaistBannerCreateFromParcel = null;
            } else {
                seaSkuPanelWaistBannerCreateFromParcel = SeaSkuPanelWaistBanner.CREATOR.createFromParcel(parcel);
            }
            SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = seaSkuPanelWaistBannerCreateFromParcel;
            if (parcel.readInt() == 0) {
                promotionWaistCreateFromParcel2 = null;
            } else {
                promotionWaistCreateFromParcel2 = PromotionWaist.CREATOR.createFromParcel(parcel);
            }
            PromotionWaist promotionWaist2 = promotionWaistCreateFromParcel2;
            if (parcel.readInt() == 0) {
                seaSkuPanelDataCreateFromParcel = null;
            } else {
                seaSkuPanelDataCreateFromParcel = SeaSkuPanelData.CREATOR.createFromParcel(parcel);
            }
            SeaSkuPanelData seaSkuPanelData = seaSkuPanelDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                couponPromotionCreateFromParcel = null;
            } else {
                couponPromotionCreateFromParcel = CouponPromotion.CREATOR.createFromParcel(parcel);
            }
            CouponPromotion couponPromotion = couponPromotionCreateFromParcel;
            if (parcel.readInt() == 0) {
                lowerPricedRecommendationsCreateFromParcel = null;
            } else {
                lowerPricedRecommendationsCreateFromParcel = LowerPricedRecommendations.CREATOR.createFromParcel(parcel);
            }
            LowerPricedRecommendations lowerPricedRecommendations = lowerPricedRecommendationsCreateFromParcel;
            if (parcel.readInt() == 0) {
                pdpBottomAreaCreateFromParcel = null;
            } else {
                pdpBottomAreaCreateFromParcel = PdpBottomArea.CREATOR.createFromParcel(parcel);
            }
            PdpBottomArea pdpBottomArea = pdpBottomAreaCreateFromParcel;
            if (parcel.readInt() == 0) {
                purchaseLimitCreateFromParcel = null;
            } else {
                purchaseLimitCreateFromParcel = PurchaseLimit.CREATOR.createFromParcel(parcel);
            }
            PurchaseLimit purchaseLimit = purchaseLimitCreateFromParcel;
            if (parcel.readInt() == 0) {
                convenientSubmitOrderCreateFromParcel = null;
            } else {
                convenientSubmitOrderCreateFromParcel = ConvenientSubmitOrder.CREATOR.createFromParcel(parcel);
            }
            ConvenientSubmitOrder convenientSubmitOrder = convenientSubmitOrderCreateFromParcel;
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int i25 = parcel.readInt();
                arrayList12 = new ArrayList(i25);
                for (int i26 = 0; i26 != i25; i26++) {
                    arrayList12.add(BizParserInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                brandInfoCreateFromParcel = null;
            } else {
                brandInfoCreateFromParcel = BrandInfo.CREATOR.createFromParcel(parcel);
            }
            BrandInfo brandInfo = brandInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                headerSlideEntranceCreateFromParcel = null;
            } else {
                headerSlideEntranceCreateFromParcel = HeaderSlideEntrance.CREATOR.createFromParcel(parcel);
            }
            HeaderSlideEntrance headerSlideEntrance = headerSlideEntranceCreateFromParcel;
            if (parcel.readInt() == 0) {
                noticeMessageCreateFromParcel = null;
            } else {
                noticeMessageCreateFromParcel = NoticeMessage.CREATOR.createFromParcel(parcel);
            }
            NoticeMessage noticeMessage = noticeMessageCreateFromParcel;
            if (parcel.readInt() == 0) {
                defaultSelectionCreateFromParcel = null;
            } else {
                defaultSelectionCreateFromParcel = DefaultSelection.CREATOR.createFromParcel(parcel);
            }
            DefaultSelection defaultSelection = defaultSelectionCreateFromParcel;
            String string8 = parcel.readString();
            OneClickPayContext oneClickPayContext = (OneClickPayContext) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int i27 = parcel.readInt();
                arrayList13 = new ArrayList(i27);
                for (int i28 = 0; i28 != i27; i28++) {
                    arrayList13.add(PopupTrigger.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList14 = null;
            } else {
                int i29 = parcel.readInt();
                arrayList14 = new ArrayList(i29);
                for (int i30 = 0; i30 != i29; i30++) {
                    arrayList14.add(NextRequestScene.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                lockUpBadgeCreateFromParcel = null;
            } else {
                lockUpBadgeCreateFromParcel = LockUpBadge.CREATOR.createFromParcel(parcel);
            }
            LockUpBadge lockUpBadge = lockUpBadgeCreateFromParcel;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() == 0) {
                pdpProductMeasurementModuleCreateFromParcel = null;
            } else {
                pdpProductMeasurementModuleCreateFromParcel = PdpProductMeasurementModule.CREATOR.createFromParcel(parcel);
            }
            PdpProductMeasurementModule pdpProductMeasurementModule = pdpProductMeasurementModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                lynxCreatorModuleCreateFromParcel = null;
            } else {
                lynxCreatorModuleCreateFromParcel = LynxCreatorModule.CREATOR.createFromParcel(parcel);
            }
            LynxCreatorModule lynxCreatorModule = lynxCreatorModuleCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolValueOf5 = Boolean.valueOf(z6);
            }
            if (parcel.readInt() == 0) {
                entranceBubbleCreateFromParcel = null;
            } else {
                entranceBubbleCreateFromParcel = EntranceBubble.CREATOR.createFromParcel(parcel);
            }
            EntranceBubble entranceBubble = entranceBubbleCreateFromParcel;
            if (parcel.readInt() == 0) {
                bubbleSellingPointsCreateFromParcel = null;
            } else {
                bubbleSellingPointsCreateFromParcel = BubbleSellingPoints.CREATOR.createFromParcel(parcel);
            }
            BubbleSellingPoints bubbleSellingPoints = bubbleSellingPointsCreateFromParcel;
            if (parcel.readInt() == 0) {
                exchangeInfoCreateFromParcel = null;
            } else {
                exchangeInfoCreateFromParcel = ExchangeInfo.CREATOR.createFromParcel(parcel);
            }
            ExchangeInfo exchangeInfo = exchangeInfoCreateFromParcel;
            String string9 = parcel.readString();
            GodaProtocol godaProtocol = (GodaProtocol) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
            ExceptionUX exceptionUX = (ExceptionUX) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                bCMStandardTrackCreateFromParcel = null;
            } else {
                bCMStandardTrackCreateFromParcel = BCMStandardTrack.CREATOR.createFromParcel(parcel);
            }
            BCMStandardTrack bCMStandardTrack = bCMStandardTrackCreateFromParcel;
            if (parcel.readInt() == 0) {
                purchaseMethodInfoCreateFromParcel = null;
            } else {
                purchaseMethodInfoCreateFromParcel = PurchaseMethodInfo.CREATOR.createFromParcel(parcel);
            }
            PurchaseMethodInfo purchaseMethodInfo = purchaseMethodInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                productInterlinkModuleVOCreateFromParcel = null;
            } else {
                productInterlinkModuleVOCreateFromParcel = ProductInterlinkModuleVO.CREATOR.createFromParcel(parcel);
            }
            ProductInterlinkModuleVO productInterlinkModuleVO = productInterlinkModuleVOCreateFromParcel;
            if (parcel.readInt() == 0) {
                productSellingPointsCreateFromParcel = null;
            } else {
                productSellingPointsCreateFromParcel = ProductSellingPoints.CREATOR.createFromParcel(parcel);
            }
            ProductSellingPoints productSellingPoints = productSellingPointsCreateFromParcel;
            if (parcel.readInt() == 0) {
                tryOnDataCreateFromParcel = null;
            } else {
                tryOnDataCreateFromParcel = TryOnData.CREATOR.createFromParcel(parcel);
            }
            TryOnData tryOnData = tryOnDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                aiAssistantCreateFromParcel = null;
            } else {
                aiAssistantCreateFromParcel = AiAssistant.CREATOR.createFromParcel(parcel);
            }
            AiAssistant aiAssistant = aiAssistantCreateFromParcel;
            if (parcel.readInt() == 0) {
                lynxInfoCreateFromParcel = null;
            } else {
                lynxInfoCreateFromParcel = LynxInfo.CREATOR.createFromParcel(parcel);
            }
            LynxInfo lynxInfo = lynxInfoCreateFromParcel;
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                recommendationContextCreateFromParcel = null;
            } else {
                recommendationContextCreateFromParcel = RecommendationContext.CREATOR.createFromParcel(parcel);
            }
            RecommendationContext recommendationContext = recommendationContextCreateFromParcel;
            GodaV2Protocol godaV2Protocol = (GodaV2Protocol) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolValueOf6 = Boolean.valueOf(z7);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i31 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i31);
                for (int i32 = 0; i32 != i31; i32++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                cutPriceLayerDataCreateFromParcel = null;
            } else {
                cutPriceLayerDataCreateFromParcel = CutPriceLayerData.CREATOR.createFromParcel(parcel);
            }
            CutPriceLayerData cutPriceLayerData = cutPriceLayerDataCreateFromParcel;
            if (parcel.readInt() == 0) {
                seaPdpMediaWindowCreateFromParcel = null;
            } else {
                seaPdpMediaWindowCreateFromParcel = SeaPdpMediaWindow.CREATOR.createFromParcel(parcel);
            }
            SeaPdpMediaWindow seaPdpMediaWindow = seaPdpMediaWindowCreateFromParcel;
            if (parcel.readInt() == 0) {
                recipientInfoCreateFromParcel = null;
            } else {
                recipientInfoCreateFromParcel = RecipientInfo.CREATOR.createFromParcel(parcel);
            }
            return new ProductPackStruct(string, numValueOf, sellerInfo, selfOperatedSloganInfo, productBase, arrayList, standardSaleProps, promotionLabelVO, arrayList2, skcInfo, arrayList3, userRight, logisticDTO, voucherInfo, modelCard, productDetailReview, shopReviewEntry, flashSale, arrayList4, addToCartButton, cartEntry, pickTag, arrayList5, arrayList6, popUp, string2, promotionView, boolValueOf, boolValueOf2, dynamicSchema, linkedHashMap, buyButton, productUnavailableInfo, shareInfo, arrayList7, string3, rankInfo, preOrderInfo, promotionEntrance, numValueOf2, marketingConfig, arrayList8, arrayList9, arrayList10, productUnavailableInfo2, string4, numValueOf3, blockPageInfo, arrayList11, sKUPanelBottomText, skuCommonConfig, string5, pDPLogisticModule, pdpPaymentModule, sEACCIPaymentModule, userRight2, warehouseTag, boolValueOf3, boolValueOf4, numValueOf4, numValueOf5, bundleBrief, lazyLoadInfo, pdpShipping, string6, numValueOf6, numValueOf7, numValueOf8, favorite, globalWaistBanner, promotionWaist, seaSkuPanelWaistBanner, promotionWaist2, seaSkuPanelData, couponPromotion, lowerPricedRecommendations, pdpBottomArea, purchaseLimit, convenientSubmitOrder, string7, arrayList12, brandInfo, headerSlideEntrance, noticeMessage, defaultSelection, string8, oneClickPayContext, arrayList13, arrayList14, lockUpBadge, z5, pdpProductMeasurementModule, lynxCreatorModule, boolValueOf5, entranceBubble, bubbleSellingPoints, exchangeInfo, string9, godaProtocol, exceptionUX, string10, bCMStandardTrack, purchaseMethodInfo, productInterlinkModuleVO, productSellingPoints, tryOnData, aiAssistant, lynxInfo, string11, recommendationContext, godaV2Protocol, string12, boolValueOf6, linkedHashMap2, cutPriceLayerData, seaPdpMediaWindow, recipientInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPackStruct[] newArray(int i) {
            return new ProductPackStruct[i];
        }
    };
    public static final int $stable = 8;
    public static final Integer[] ALL_STATUS = {2, 1, 3, 4, 5};

    public ProductPackStruct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPackStruct)) {
            return false;
        }
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        return Intrinsics.LJFF(this.productId, productPackStruct.productId) && Intrinsics.LJFF(this.status, productPackStruct.status) && Intrinsics.LJFF(this.sellerInfo, productPackStruct.sellerInfo) && Intrinsics.LJFF(this.selfOperatedSloganInfo, productPackStruct.selfOperatedSloganInfo) && Intrinsics.LJFF(this.baseInfo, productPackStruct.baseInfo) && Intrinsics.LJFF(this.creatorVideos, productPackStruct.creatorVideos) && Intrinsics.LJFF(this.localSizeSaleProp, productPackStruct.localSizeSaleProp) && Intrinsics.LJFF(this.promotionLabels, productPackStruct.promotionLabels) && Intrinsics.LJFF(this.saleProps, productPackStruct.saleProps) && Intrinsics.LJFF(this.skcInfo, productPackStruct.skcInfo) && Intrinsics.LJFF(this.skus, productPackStruct.skus) && Intrinsics.LJFF(this.userRight, productPackStruct.userRight) && Intrinsics.LJFF(this.logistic, productPackStruct.logistic) && Intrinsics.LJFF(this.voucherInfo, productPackStruct.voucherInfo) && Intrinsics.LJFF(this.modelCard, productPackStruct.modelCard) && Intrinsics.LJFF(this.review, productPackStruct.review) && Intrinsics.LJFF(this.shopReview, productPackStruct.shopReview) && Intrinsics.LJFF(this.flashSale, productPackStruct.flashSale) && Intrinsics.LJFF(this.productBannerLabel, productPackStruct.productBannerLabel) && Intrinsics.LJFF(this.addToCartButton, productPackStruct.addToCartButton) && Intrinsics.LJFF(this.cartEntry, productPackStruct.cartEntry) && Intrinsics.LJFF(this.activityInfo, productPackStruct.activityInfo) && Intrinsics.LJFF(this.promotionLogos, productPackStruct.promotionLogos) && Intrinsics.LJFF(this.productLogos, productPackStruct.productLogos) && Intrinsics.LJFF(this.popUp, productPackStruct.popUp) && Intrinsics.LJFF(this.chainKey, productPackStruct.chainKey) && Intrinsics.LJFF(this.promotionView, productPackStruct.promotionView) && Intrinsics.LJFF(this.hasShippingAddress, productPackStruct.hasShippingAddress) && Intrinsics.LJFF(this.hasPayMethod, productPackStruct.hasPayMethod) && Intrinsics.LJFF(this.schemaInfo, productPackStruct.schemaInfo) && Intrinsics.LJFF(this.extra, productPackStruct.extra) && Intrinsics.LJFF(this.buyButton, productPackStruct.buyButton) && Intrinsics.LJFF(this.productUnavailableInfo, productPackStruct.productUnavailableInfo) && Intrinsics.LJFF(this.shareInfo, productPackStruct.shareInfo) && Intrinsics.LJFF(this.staticSellingPoints, productPackStruct.staticSellingPoints) && Intrinsics.LJFF(this.lockUpStaticSellingPoint, productPackStruct.lockUpStaticSellingPoint) && Intrinsics.LJFF(this.rankInfo, productPackStruct.rankInfo) && Intrinsics.LJFF(this.preOrderInfo, productPackStruct.preOrderInfo) && Intrinsics.LJFF(this.promotionEntrance, productPackStruct.promotionEntrance) && Intrinsics.LJFF(this.template, productPackStruct.template) && Intrinsics.LJFF(this.marketingConfig, productPackStruct.marketingConfig) && Intrinsics.LJFF(this.promotionDiscounts, productPackStruct.promotionDiscounts) && Intrinsics.LJFF(this.bricks, productPackStruct.bricks) && Intrinsics.LJFF(this.tabs, productPackStruct.tabs) && Intrinsics.LJFF(this.unavailableInfo, productPackStruct.unavailableInfo) && Intrinsics.LJFF(this.defaultAddressId, productPackStruct.defaultAddressId) && Intrinsics.LJFF(this.favoriteStatus, productPackStruct.favoriteStatus) && Intrinsics.LJFF(this.blockPageInfo, productPackStruct.blockPageInfo) && Intrinsics.LJFF(this.announcements, productPackStruct.announcements) && Intrinsics.LJFF(this.skuPanelBottomText, productPackStruct.skuPanelBottomText) && Intrinsics.LJFF(this.skuCommonConfig, productPackStruct.skuCommonConfig) && Intrinsics.LJFF(this.daInfo, productPackStruct.daInfo) && Intrinsics.LJFF(this.pdpLogisticModule, productPackStruct.pdpLogisticModule) && Intrinsics.LJFF(this.pdpPaymentModule, productPackStruct.pdpPaymentModule) && Intrinsics.LJFF(this.seaCciPaymentModule, productPackStruct.seaCciPaymentModule) && Intrinsics.LJFF(this.returnPolicy, productPackStruct.returnPolicy) && Intrinsics.LJFF(this.warehouseTag, productPackStruct.warehouseTag) && Intrinsics.LJFF(this.withCoupon, productPackStruct.withCoupon) && Intrinsics.LJFF(this.promotionReform, productPackStruct.promotionReform) && Intrinsics.LJFF(this.skuStyle, productPackStruct.skuStyle) && Intrinsics.LJFF(this.pageExpressionType, productPackStruct.pageExpressionType) && Intrinsics.LJFF(this.bundleBrief, productPackStruct.bundleBrief) && Intrinsics.LJFF(this.lazyLoadInfo, productPackStruct.lazyLoadInfo) && Intrinsics.LJFF(this.shipping, productPackStruct.shipping) && Intrinsics.LJFF(this.billInfoParams, productPackStruct.billInfoParams) && Intrinsics.LJFF(this.billSceneType, productPackStruct.billSceneType) && Intrinsics.LJFF(this.bottomNavBarStyle, productPackStruct.bottomNavBarStyle) && Intrinsics.LJFF(this.bizType, productPackStruct.bizType) && Intrinsics.LJFF(this.favorite, productPackStruct.favorite) && Intrinsics.LJFF(this.globalWaistBanner, productPackStruct.globalWaistBanner) && Intrinsics.LJFF(this.promotionWaist, productPackStruct.promotionWaist) && Intrinsics.LJFF(this.skuPanelWaistBanner, productPackStruct.skuPanelWaistBanner) && Intrinsics.LJFF(this.skuPanelPromotionWaist, productPackStruct.skuPanelPromotionWaist) && Intrinsics.LJFF(this.skuPanelData, productPackStruct.skuPanelData) && Intrinsics.LJFF(this.couponPromotion, productPackStruct.couponPromotion) && Intrinsics.LJFF(this.lowerPricedRecommendation, productPackStruct.lowerPricedRecommendation) && Intrinsics.LJFF(this.bottomArea, productPackStruct.bottomArea) && Intrinsics.LJFF(this.purchaseLimit, productPackStruct.purchaseLimit) && Intrinsics.LJFF(this.convenientSubmitOrder, productPackStruct.convenientSubmitOrder) && Intrinsics.LJFF(this.sellerId, productPackStruct.sellerId) && Intrinsics.LJFF(this.pageBizList, productPackStruct.pageBizList) && Intrinsics.LJFF(this.brandInfo, productPackStruct.brandInfo) && Intrinsics.LJFF(this.headerSlideEntrance, productPackStruct.headerSlideEntrance) && Intrinsics.LJFF(this.noticeMessage, productPackStruct.noticeMessage) && Intrinsics.LJFF(this.defaultSelection, productPackStruct.defaultSelection) && Intrinsics.LJFF(this.helpCenterSchemaUrl, productPackStruct.helpCenterSchemaUrl) && Intrinsics.LJFF(this.ocpContext, productPackStruct.ocpContext) && Intrinsics.LJFF(this.popupTriggers, productPackStruct.popupTriggers) && Intrinsics.LJFF(this.nextRequestScenes, productPackStruct.nextRequestScenes) && Intrinsics.LJFF(this.lockUpBadge, productPackStruct.lockUpBadge) && this.localPreprocessImageMonitor == productPackStruct.localPreprocessImageMonitor && Intrinsics.LJFF(this.pdpProductMeasurementModule, productPackStruct.pdpProductMeasurementModule) && Intrinsics.LJFF(this.lynxCreatorModule, productPackStruct.lynxCreatorModule) && Intrinsics.LJFF(this.isPlatformProductLink, productPackStruct.isPlatformProductLink) && Intrinsics.LJFF(this.entranceBubble, productPackStruct.entranceBubble) && Intrinsics.LJFF(this.bubbleSellingPoints, productPackStruct.bubbleSellingPoints) && Intrinsics.LJFF(this.skuPanelReminder, productPackStruct.skuPanelReminder) && Intrinsics.LJFF(this.defaultSkuId, productPackStruct.defaultSkuId) && Intrinsics.LJFF(this.godaProtocol, productPackStruct.godaProtocol) && Intrinsics.LJFF(this.exceptionUX, productPackStruct.exceptionUX) && Intrinsics.LJFF(this.hybridExtra, productPackStruct.hybridExtra) && Intrinsics.LJFF(this.bcmStandardTrack, productPackStruct.bcmStandardTrack) && Intrinsics.LJFF(this.purchaseMethodInfo, productPackStruct.purchaseMethodInfo) && Intrinsics.LJFF(this.productInterlink, productPackStruct.productInterlink) && Intrinsics.LJFF(this.productSellingPoints, productPackStruct.productSellingPoints) && Intrinsics.LJFF(this.tryOnData, productPackStruct.tryOnData) && Intrinsics.LJFF(this.aiAssistant, productPackStruct.aiAssistant) && Intrinsics.LJFF(this.insuranceLynxInfo, productPackStruct.insuranceLynxInfo) && Intrinsics.LJFF(this.seaCoreBizDaInfo, productPackStruct.seaCoreBizDaInfo) && Intrinsics.LJFF(this.productRecommendContext, productPackStruct.productRecommendContext) && Intrinsics.LJFF(this.godaV2Protocol, productPackStruct.godaV2Protocol) && Intrinsics.LJFF(this.buyButtonInterestId, productPackStruct.buyButtonInterestId) && Intrinsics.LJFF(this.skuPanelOpen, productPackStruct.skuPanelOpen) && Intrinsics.LJFF(this.buttonDynamicData, productPackStruct.buttonDynamicData) && Intrinsics.LJFF(this.cutPriceLayerData, productPackStruct.cutPriceLayerData) && Intrinsics.LJFF(this.mediaWindow, productPackStruct.mediaWindow) && Intrinsics.LJFF(this.recipientInfo, productPackStruct.recipientInfo);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        SellerInfo sellerInfo = this.sellerInfo;
        int iHashCode3 = (iHashCode2 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        SelfOperatedSloganInfo selfOperatedSloganInfo = this.selfOperatedSloganInfo;
        int iHashCode4 = (iHashCode3 + (selfOperatedSloganInfo == null ? 0 : selfOperatedSloganInfo.hashCode())) * 31;
        ProductBase productBase = this.baseInfo;
        int iHashCode5 = (iHashCode4 + (productBase == null ? 0 : productBase.hashCode())) * 31;
        List<Video> list = this.creatorVideos;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        StandardSaleProps standardSaleProps = this.localSizeSaleProp;
        int iHashCode7 = (iHashCode6 + (standardSaleProps == null ? 0 : standardSaleProps.hashCode())) * 31;
        PromotionLabelVO promotionLabelVO = this.promotionLabels;
        int iHashCode8 = (iHashCode7 + (promotionLabelVO == null ? 0 : promotionLabelVO.hashCode())) * 31;
        List<SaleProp> list2 = this.saleProps;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkcInfo skcInfo = this.skcInfo;
        int iHashCode10 = (iHashCode9 + (skcInfo == null ? 0 : skcInfo.hashCode())) * 31;
        List<SkuItem> list3 = this.skus;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        UserRight userRight = this.userRight;
        int iHashCode12 = (iHashCode11 + (userRight == null ? 0 : userRight.hashCode())) * 31;
        LogisticDTO logisticDTO = this.logistic;
        int iHashCode13 = (iHashCode12 + (logisticDTO == null ? 0 : logisticDTO.hashCode())) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo voucherInfo = this.voucherInfo;
        int iHashCode14 = (iHashCode13 + (voucherInfo == null ? 0 : voucherInfo.hashCode())) * 31;
        ModelCard modelCard = this.modelCard;
        int iHashCode15 = (iHashCode14 + (modelCard == null ? 0 : modelCard.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.review;
        int iHashCode16 = (iHashCode15 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        ShopReviewEntry shopReviewEntry = this.shopReview;
        int iHashCode17 = (iHashCode16 + (shopReviewEntry == null ? 0 : shopReviewEntry.hashCode())) * 31;
        FlashSale flashSale = this.flashSale;
        int iHashCode18 = (iHashCode17 + (flashSale == null ? 0 : flashSale.hashCode())) * 31;
        List<ProductBannerLabel> list4 = this.productBannerLabel;
        int iHashCode19 = (iHashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        int iHashCode20 = (iHashCode19 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        CartEntry cartEntry = this.cartEntry;
        int iHashCode21 = (iHashCode20 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        PickTag pickTag = this.activityInfo;
        int iHashCode22 = (iHashCode21 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list5 = this.promotionLogos;
        int iHashCode23 = (iHashCode22 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ProductLogo> list6 = this.productLogos;
        int iHashCode24 = (iHashCode23 + (list6 == null ? 0 : list6.hashCode())) * 31;
        PopUp popUp = this.popUp;
        int iHashCode25 = (iHashCode24 + (popUp == null ? 0 : popUp.hashCode())) * 31;
        String str2 = this.chainKey;
        int iHashCode26 = (iHashCode25 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.bytedance.android.livesdk.model.message.ext.PromotionView promotionView = this.promotionView;
        int iHashCode27 = (iHashCode26 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        Boolean bool = this.hasShippingAddress;
        int iHashCode28 = (iHashCode27 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasPayMethod;
        int iHashCode29 = (iHashCode28 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DynamicSchema dynamicSchema = this.schemaInfo;
        int iHashCode30 = (iHashCode29 + (dynamicSchema == null ? 0 : dynamicSchema.hashCode())) * 31;
        Map<String, String> map = this.extra;
        int iHashCode31 = (iHashCode30 + (map == null ? 0 : map.hashCode())) * 31;
        BuyButton buyButton = this.buyButton;
        int iHashCode32 = (iHashCode31 + (buyButton == null ? 0 : buyButton.hashCode())) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.productUnavailableInfo;
        int iHashCode33 = (iHashCode32 + (productUnavailableInfo == null ? 0 : productUnavailableInfo.hashCode())) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int iHashCode34 = (iHashCode33 + (shareInfo == null ? 0 : shareInfo.hashCode())) * 31;
        List<StaticSellingPoint> list7 = this.staticSellingPoints;
        int iHashCode35 = (iHashCode34 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str3 = this.lockUpStaticSellingPoint;
        int iHashCode36 = (iHashCode35 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RankInfo rankInfo = this.rankInfo;
        int iHashCode37 = (iHashCode36 + (rankInfo == null ? 0 : rankInfo.hashCode())) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        int iHashCode38 = (iHashCode37 + (preOrderInfo == null ? 0 : preOrderInfo.hashCode())) * 31;
        PromotionEntrance promotionEntrance = this.promotionEntrance;
        int iHashCode39 = (iHashCode38 + (promotionEntrance == null ? 0 : promotionEntrance.hashCode())) * 31;
        Integer num2 = this.template;
        int iHashCode40 = (iHashCode39 + (num2 == null ? 0 : num2.hashCode())) * 31;
        MarketingConfig marketingConfig = this.marketingConfig;
        int iHashCode41 = (iHashCode40 + (marketingConfig == null ? 0 : marketingConfig.hashCode())) * 31;
        List<PromotionDiscount> list8 = this.promotionDiscounts;
        int iHashCode42 = (iHashCode41 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<BrickInfo> list9 = this.bricks;
        int iHashCode43 = (iHashCode42 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<Tab> list10 = this.tabs;
        int iHashCode44 = (iHashCode43 + (list10 == null ? 0 : list10.hashCode())) * 31;
        ProductUnavailableInfo productUnavailableInfo2 = this.unavailableInfo;
        int iHashCode45 = (iHashCode44 + (productUnavailableInfo2 == null ? 0 : productUnavailableInfo2.hashCode())) * 31;
        String str4 = this.defaultAddressId;
        int iHashCode46 = (iHashCode45 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.favoriteStatus;
        int iHashCode47 = (iHashCode46 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BlockPageInfo blockPageInfo = this.blockPageInfo;
        int iHashCode48 = (iHashCode47 + (blockPageInfo == null ? 0 : blockPageInfo.hashCode())) * 31;
        List<Announcement> list11 = this.announcements;
        int iHashCode49 = (iHashCode48 + (list11 == null ? 0 : list11.hashCode())) * 31;
        SKUPanelBottomText sKUPanelBottomText = this.skuPanelBottomText;
        int iHashCode50 = (iHashCode49 + (sKUPanelBottomText == null ? 0 : sKUPanelBottomText.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        int iHashCode51 = (iHashCode50 + (skuCommonConfig == null ? 0 : skuCommonConfig.hashCode())) * 31;
        String str5 = this.daInfo;
        int iHashCode52 = (iHashCode51 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        int iHashCode53 = (iHashCode52 + (pDPLogisticModule == null ? 0 : pDPLogisticModule.hashCode())) * 31;
        PdpPaymentModule pdpPaymentModule = this.pdpPaymentModule;
        int iHashCode54 = (iHashCode53 + (pdpPaymentModule == null ? 0 : pdpPaymentModule.hashCode())) * 31;
        SEACCIPaymentModule sEACCIPaymentModule = this.seaCciPaymentModule;
        int iHashCode55 = (iHashCode54 + (sEACCIPaymentModule == null ? 0 : sEACCIPaymentModule.hashCode())) * 31;
        UserRight userRight2 = this.returnPolicy;
        int iHashCode56 = (iHashCode55 + (userRight2 == null ? 0 : userRight2.hashCode())) * 31;
        WarehouseTag warehouseTag = this.warehouseTag;
        int iHashCode57 = (iHashCode56 + (warehouseTag == null ? 0 : warehouseTag.hashCode())) * 31;
        Boolean bool3 = this.withCoupon;
        int iHashCode58 = (iHashCode57 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.promotionReform;
        int iHashCode59 = (iHashCode58 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num4 = this.skuStyle;
        int iHashCode60 = (iHashCode59 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.pageExpressionType;
        int iHashCode61 = (iHashCode60 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BundleBrief bundleBrief = this.bundleBrief;
        int iHashCode62 = (iHashCode61 + (bundleBrief == null ? 0 : bundleBrief.hashCode())) * 31;
        LazyLoadInfo lazyLoadInfo = this.lazyLoadInfo;
        int iHashCode63 = (iHashCode62 + (lazyLoadInfo == null ? 0 : lazyLoadInfo.hashCode())) * 31;
        PdpShipping pdpShipping = this.shipping;
        int iHashCode64 = (iHashCode63 + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        String str6 = this.billInfoParams;
        int iHashCode65 = (iHashCode64 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num6 = this.billSceneType;
        int iHashCode66 = (iHashCode65 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.bottomNavBarStyle;
        int iHashCode67 = (iHashCode66 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.bizType;
        int iHashCode68 = (iHashCode67 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Favorite favorite = this.favorite;
        int iHashCode69 = (iHashCode68 + (favorite == null ? 0 : favorite.hashCode())) * 31;
        GlobalWaistBanner globalWaistBanner = this.globalWaistBanner;
        int iHashCode70 = (iHashCode69 + (globalWaistBanner == null ? 0 : globalWaistBanner.hashCode())) * 31;
        PromotionWaist promotionWaist = this.promotionWaist;
        int iHashCode71 = (iHashCode70 + (promotionWaist == null ? 0 : promotionWaist.hashCode())) * 31;
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = this.skuPanelWaistBanner;
        int iHashCode72 = (iHashCode71 + (seaSkuPanelWaistBanner == null ? 0 : seaSkuPanelWaistBanner.hashCode())) * 31;
        PromotionWaist promotionWaist2 = this.skuPanelPromotionWaist;
        int iHashCode73 = (iHashCode72 + (promotionWaist2 == null ? 0 : promotionWaist2.hashCode())) * 31;
        SeaSkuPanelData seaSkuPanelData = this.skuPanelData;
        int iHashCode74 = (iHashCode73 + (seaSkuPanelData == null ? 0 : seaSkuPanelData.hashCode())) * 31;
        CouponPromotion couponPromotion = this.couponPromotion;
        int iHashCode75 = (iHashCode74 + (couponPromotion == null ? 0 : couponPromotion.hashCode())) * 31;
        LowerPricedRecommendations lowerPricedRecommendations = this.lowerPricedRecommendation;
        int iHashCode76 = (iHashCode75 + (lowerPricedRecommendations == null ? 0 : lowerPricedRecommendations.hashCode())) * 31;
        PdpBottomArea pdpBottomArea = this.bottomArea;
        int iHashCode77 = (iHashCode76 + (pdpBottomArea == null ? 0 : pdpBottomArea.hashCode())) * 31;
        PurchaseLimit purchaseLimit = this.purchaseLimit;
        int iHashCode78 = (iHashCode77 + (purchaseLimit == null ? 0 : purchaseLimit.hashCode())) * 31;
        ConvenientSubmitOrder convenientSubmitOrder = this.convenientSubmitOrder;
        int iHashCode79 = (iHashCode78 + (convenientSubmitOrder == null ? 0 : convenientSubmitOrder.hashCode())) * 31;
        String str7 = this.sellerId;
        int iHashCode80 = (iHashCode79 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<BizParserInfo> list12 = this.pageBizList;
        int iHashCode81 = (iHashCode80 + (list12 == null ? 0 : list12.hashCode())) * 31;
        BrandInfo brandInfo = this.brandInfo;
        int iHashCode82 = (iHashCode81 + (brandInfo == null ? 0 : brandInfo.hashCode())) * 31;
        HeaderSlideEntrance headerSlideEntrance = this.headerSlideEntrance;
        int iHashCode83 = (iHashCode82 + (headerSlideEntrance == null ? 0 : headerSlideEntrance.hashCode())) * 31;
        NoticeMessage noticeMessage = this.noticeMessage;
        int iHashCode84 = (iHashCode83 + (noticeMessage == null ? 0 : noticeMessage.hashCode())) * 31;
        DefaultSelection defaultSelection = this.defaultSelection;
        int iHashCode85 = (iHashCode84 + (defaultSelection == null ? 0 : defaultSelection.hashCode())) * 31;
        String str8 = this.helpCenterSchemaUrl;
        int iHashCode86 = (iHashCode85 + (str8 == null ? 0 : str8.hashCode())) * 31;
        OneClickPayContext oneClickPayContext = this.ocpContext;
        int iHashCode87 = (iHashCode86 + (oneClickPayContext == null ? 0 : oneClickPayContext.hashCode())) * 31;
        List<PopupTrigger> list13 = this.popupTriggers;
        int iHashCode88 = (iHashCode87 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<NextRequestScene> list14 = this.nextRequestScenes;
        int iHashCode89 = (iHashCode88 + (list14 == null ? 0 : list14.hashCode())) * 31;
        LockUpBadge lockUpBadge = this.lockUpBadge;
        int iHashCode90 = (((iHashCode89 + (lockUpBadge == null ? 0 : lockUpBadge.hashCode())) * 31) + C786410Ut5.Z2(this.localPreprocessImageMonitor)) * 31;
        PdpProductMeasurementModule pdpProductMeasurementModule = this.pdpProductMeasurementModule;
        int iHashCode91 = (iHashCode90 + (pdpProductMeasurementModule == null ? 0 : pdpProductMeasurementModule.hashCode())) * 31;
        LynxCreatorModule lynxCreatorModule = this.lynxCreatorModule;
        int iHashCode92 = (iHashCode91 + (lynxCreatorModule == null ? 0 : lynxCreatorModule.hashCode())) * 31;
        Boolean bool5 = this.isPlatformProductLink;
        int iHashCode93 = (iHashCode92 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        EntranceBubble entranceBubble = this.entranceBubble;
        int iHashCode94 = (iHashCode93 + (entranceBubble == null ? 0 : entranceBubble.hashCode())) * 31;
        BubbleSellingPoints bubbleSellingPoints = this.bubbleSellingPoints;
        int iHashCode95 = (iHashCode94 + (bubbleSellingPoints == null ? 0 : bubbleSellingPoints.hashCode())) * 31;
        ExchangeInfo exchangeInfo = this.skuPanelReminder;
        int iHashCode96 = (iHashCode95 + (exchangeInfo == null ? 0 : exchangeInfo.hashCode())) * 31;
        String str9 = this.defaultSkuId;
        int iHashCode97 = (iHashCode96 + (str9 == null ? 0 : str9.hashCode())) * 31;
        GodaProtocol godaProtocol = this.godaProtocol;
        int iHashCode98 = (iHashCode97 + (godaProtocol == null ? 0 : godaProtocol.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int iHashCode99 = (iHashCode98 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        String str10 = this.hybridExtra;
        int iHashCode100 = (iHashCode99 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        int iHashCode101 = (iHashCode100 + (bCMStandardTrack == null ? 0 : bCMStandardTrack.hashCode())) * 31;
        PurchaseMethodInfo purchaseMethodInfo = this.purchaseMethodInfo;
        int iHashCode102 = (iHashCode101 + (purchaseMethodInfo == null ? 0 : purchaseMethodInfo.hashCode())) * 31;
        ProductInterlinkModuleVO productInterlinkModuleVO = this.productInterlink;
        int iHashCode103 = (iHashCode102 + (productInterlinkModuleVO == null ? 0 : productInterlinkModuleVO.hashCode())) * 31;
        ProductSellingPoints productSellingPoints = this.productSellingPoints;
        int iHashCode104 = (iHashCode103 + (productSellingPoints == null ? 0 : productSellingPoints.hashCode())) * 31;
        TryOnData tryOnData = this.tryOnData;
        int iHashCode105 = (iHashCode104 + (tryOnData == null ? 0 : tryOnData.hashCode())) * 31;
        AiAssistant aiAssistant = this.aiAssistant;
        int iHashCode106 = (iHashCode105 + (aiAssistant == null ? 0 : aiAssistant.hashCode())) * 31;
        LynxInfo lynxInfo = this.insuranceLynxInfo;
        int iHashCode107 = (iHashCode106 + (lynxInfo == null ? 0 : lynxInfo.hashCode())) * 31;
        String str11 = this.seaCoreBizDaInfo;
        int iHashCode108 = (iHashCode107 + (str11 == null ? 0 : str11.hashCode())) * 31;
        RecommendationContext recommendationContext = this.productRecommendContext;
        int iHashCode109 = (iHashCode108 + (recommendationContext == null ? 0 : recommendationContext.hashCode())) * 31;
        GodaV2Protocol<?> godaV2Protocol = this.godaV2Protocol;
        int iHashCode110 = (iHashCode109 + (godaV2Protocol == null ? 0 : godaV2Protocol.hashCode())) * 31;
        String str12 = this.buyButtonInterestId;
        int iHashCode111 = (iHashCode110 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool6 = this.skuPanelOpen;
        int iHashCode112 = (iHashCode111 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Map<String, String> map2 = this.buttonDynamicData;
        int iHashCode113 = (iHashCode112 + (map2 == null ? 0 : map2.hashCode())) * 31;
        CutPriceLayerData cutPriceLayerData = this.cutPriceLayerData;
        int iHashCode114 = (iHashCode113 + (cutPriceLayerData == null ? 0 : cutPriceLayerData.hashCode())) * 31;
        SeaPdpMediaWindow seaPdpMediaWindow = this.mediaWindow;
        int iHashCode115 = (iHashCode114 + (seaPdpMediaWindow == null ? 0 : seaPdpMediaWindow.hashCode())) * 31;
        RecipientInfo recipientInfo = this.recipientInfo;
        return iHashCode115 + (recipientInfo != null ? recipientInfo.hashCode() : 0);
    }

    public final String toString() {
        return "ProductPackStruct(productId=" + this.productId + ", status=" + this.status + ", sellerInfo=" + this.sellerInfo + ", selfOperatedSloganInfo=" + this.selfOperatedSloganInfo + ", baseInfo=" + this.baseInfo + ", creatorVideos=" + this.creatorVideos + ", localSizeSaleProp=" + this.localSizeSaleProp + ", promotionLabels=" + this.promotionLabels + ", saleProps=" + this.saleProps + ", skcInfo=" + this.skcInfo + ", skus=" + this.skus + ", userRight=" + this.userRight + ", logistic=" + this.logistic + ", voucherInfo=" + this.voucherInfo + ", modelCard=" + this.modelCard + ", review=" + this.review + ", shopReview=" + this.shopReview + ", flashSale=" + this.flashSale + ", productBannerLabel=" + this.productBannerLabel + ", addToCartButton=" + this.addToCartButton + ", cartEntry=" + this.cartEntry + ", activityInfo=" + this.activityInfo + ", promotionLogos=" + this.promotionLogos + ", productLogos=" + this.productLogos + ", popUp=" + this.popUp + ", chainKey=" + this.chainKey + ", promotionView=" + this.promotionView + ", hasShippingAddress=" + this.hasShippingAddress + ", hasPayMethod=" + this.hasPayMethod + ", schemaInfo=" + this.schemaInfo + ", extra=" + this.extra + ", buyButton=" + this.buyButton + ", productUnavailableInfo=" + this.productUnavailableInfo + ", shareInfo=" + this.shareInfo + ", staticSellingPoints=" + this.staticSellingPoints + ", lockUpStaticSellingPoint=" + this.lockUpStaticSellingPoint + ", rankInfo=" + this.rankInfo + ", preOrderInfo=" + this.preOrderInfo + ", promotionEntrance=" + this.promotionEntrance + ", template=" + this.template + ", marketingConfig=" + this.marketingConfig + ", promotionDiscounts=" + this.promotionDiscounts + ", bricks=" + this.bricks + ", tabs=" + this.tabs + ", unavailableInfo=" + this.unavailableInfo + ", defaultAddressId=" + this.defaultAddressId + ", favoriteStatus=" + this.favoriteStatus + ", blockPageInfo=" + this.blockPageInfo + ", announcements=" + this.announcements + ", skuPanelBottomText=" + this.skuPanelBottomText + ", skuCommonConfig=" + this.skuCommonConfig + ", daInfo=" + this.daInfo + ", pdpLogisticModule=" + this.pdpLogisticModule + ", pdpPaymentModule=" + this.pdpPaymentModule + ", seaCciPaymentModule=" + this.seaCciPaymentModule + ", returnPolicy=" + this.returnPolicy + ", warehouseTag=" + this.warehouseTag + ", withCoupon=" + this.withCoupon + ", promotionReform=" + this.promotionReform + ", skuStyle=" + this.skuStyle + ", pageExpressionType=" + this.pageExpressionType + ", bundleBrief=" + this.bundleBrief + ", lazyLoadInfo=" + this.lazyLoadInfo + ", shipping=" + this.shipping + ", billInfoParams=" + this.billInfoParams + ", billSceneType=" + this.billSceneType + ", bottomNavBarStyle=" + this.bottomNavBarStyle + ", bizType=" + this.bizType + ", favorite=" + this.favorite + ", globalWaistBanner=" + this.globalWaistBanner + ", promotionWaist=" + this.promotionWaist + ", skuPanelWaistBanner=" + this.skuPanelWaistBanner + ", skuPanelPromotionWaist=" + this.skuPanelPromotionWaist + ", skuPanelData=" + this.skuPanelData + ", couponPromotion=" + this.couponPromotion + ", lowerPricedRecommendation=" + this.lowerPricedRecommendation + ", bottomArea=" + this.bottomArea + ", purchaseLimit=" + this.purchaseLimit + ", convenientSubmitOrder=" + this.convenientSubmitOrder + ", sellerId=" + this.sellerId + ", pageBizList=" + this.pageBizList + ", brandInfo=" + this.brandInfo + ", headerSlideEntrance=" + this.headerSlideEntrance + ", noticeMessage=" + this.noticeMessage + ", defaultSelection=" + this.defaultSelection + ", helpCenterSchemaUrl=" + this.helpCenterSchemaUrl + ", ocpContext=" + this.ocpContext + ", popupTriggers=" + this.popupTriggers + ", nextRequestScenes=" + this.nextRequestScenes + ", lockUpBadge=" + this.lockUpBadge + ", localPreprocessImageMonitor=" + this.localPreprocessImageMonitor + ", pdpProductMeasurementModule=" + this.pdpProductMeasurementModule + ", lynxCreatorModule=" + this.lynxCreatorModule + ", isPlatformProductLink=" + this.isPlatformProductLink + ", entranceBubble=" + this.entranceBubble + ", bubbleSellingPoints=" + this.bubbleSellingPoints + ", skuPanelReminder=" + this.skuPanelReminder + ", defaultSkuId=" + this.defaultSkuId + ", godaProtocol=" + this.godaProtocol + ", exceptionUX=" + this.exceptionUX + ", hybridExtra=" + this.hybridExtra + ", bcmStandardTrack=" + this.bcmStandardTrack + ", purchaseMethodInfo=" + this.purchaseMethodInfo + ", productInterlink=" + this.productInterlink + ", productSellingPoints=" + this.productSellingPoints + ", tryOnData=" + this.tryOnData + ", aiAssistant=" + this.aiAssistant + ", insuranceLynxInfo=" + this.insuranceLynxInfo + ", seaCoreBizDaInfo=" + this.seaCoreBizDaInfo + ", productRecommendContext=" + this.productRecommendContext + ", godaV2Protocol=" + this.godaV2Protocol + ", buyButtonInterestId=" + this.buyButtonInterestId + ", skuPanelOpen=" + this.skuPanelOpen + ", buttonDynamicData=" + this.buttonDynamicData + ", cutPriceLayerData=" + this.cutPriceLayerData + ", mediaWindow=" + this.mediaWindow + ", recipientInfo=" + this.recipientInfo + ')';
    }

    public final String LIZIZ() {
        Integer num;
        FlashSale flashSale = this.flashSale;
        if (flashSale == null || (num = flashSale.status) == null) {
            return null;
        }
        if (num.intValue() == 1) {
            return "warm_up";
        }
        if (num.intValue() == 2) {
            return "on_sale";
        }
        return null;
    }

    public final Map<String, Object> LIZLLL() {
        HashMap<String, Object> mapLJIIJ;
        String str;
        String str2;
        SkuItem skuItem;
        SkuSupply skuSupply;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.LJFF(this.isPlatformProductLink, Boolean.TRUE)) {
            String str4 = this.productId;
            if (str4 != null) {
                linkedHashMap.put("platform_product_id", str4);
            }
            List<SkuItem> list = this.skus;
            if (list != null && (skuItem = (SkuItem) ListProtector.get(list, 0)) != null && (skuSupply = skuItem.skuSupply) != null && (str3 = skuSupply.productId) != null) {
                linkedHashMap.put("seller_product_id", str3);
            }
            SellerInfo sellerInfo = this.sellerInfo;
            if (sellerInfo != null && (str2 = sellerInfo.platformSellerId) != null) {
                linkedHashMap.put("seller_id", str2);
                linkedHashMap.put("platform_seller_id", str2);
                linkedHashMap.put("shop_id", str2);
                linkedHashMap.put("platform_shop_id", str2);
            }
            SellerInfo sellerInfo2 = this.sellerInfo;
            if (sellerInfo2 != null && (str = sellerInfo2.sellerId) != null) {
                linkedHashMap.put("seller_seller_id", str);
                linkedHashMap.put("seller_shop_id", str);
            }
            String str5 = this.daInfo;
            if (str5 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str5)) != null) {
                linkedHashMap.putAll(mapLJIIJ);
            }
        }
        return linkedHashMap;
    }

    public final boolean LJFF() {
        List<SkuItem> list = this.skus;
        return list != null && list.size() == 1;
    }

    public final boolean LJII() {
        String str;
        SkcInfo skcInfo = this.skcInfo;
        return !(skcInfo == null || (str = skcInfo.skcPropertyId) == null || str.length() == 0);
    }

    public final ProductPackStruct LJIIIZ() {
        ShareInfo shareInfo;
        EcPdpCacheCleanerSettingModel ecPdpCacheCleanerSettingModel = (EcPdpCacheCleanerSettingModel) C1021703z5.LIZIZ.getValue();
        Boolean bool = ecPdpCacheCleanerSettingModel.popupTriggers;
        Boolean bool2 = Boolean.TRUE;
        List<PopupTrigger> list = Intrinsics.LJFF(bool, bool2) ? null : this.popupTriggers;
        EntranceBubble entranceBubble = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.entranceBubble, bool2) ? null : this.entranceBubble;
        BubbleSellingPoints bubbleSellingPoints = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.bubbleSellingPoints, bool2) ? null : this.bubbleSellingPoints;
        ExceptionUX exceptionUX = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.exceptionUX, bool2) ? null : this.exceptionUX;
        PromotionWaist promotionWaist = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.promotionWaist, bool2) ? null : this.promotionWaist;
        GlobalWaistBanner globalWaistBanner = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.globalWaistBanner, bool2) ? null : this.globalWaistBanner;
        BCMStandardTrack bCMStandardTrack = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.bcmStandardTrack, bool2) ? null : this.bcmStandardTrack;
        ProductSellingPoints productSellingPoints = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.productSellingPoints, bool2) ? this.productSellingPoints != null ? new ProductSellingPoints(null, null) : null : this.productSellingPoints;
        TryOnData tryOnData = Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.tryOnData, bool2) ? null : this.tryOnData;
        if (Intrinsics.LJFF(ecPdpCacheCleanerSettingModel.shareButtonBenefit, bool2)) {
            ShareInfo shareInfo2 = this.shareInfo;
            shareInfo = shareInfo2 != null ? new ShareInfo(shareInfo2.canShare, shareInfo2.deepLink, shareInfo2.cover, shareInfo2.shareScene, shareInfo2.formattedTargetPrice, shareInfo2.shareCampaignId, null) : null;
        } else {
            shareInfo = this.shareInfo;
        }
        return LIZ(this, null, null, null, null, null, null, shareInfo, null, null, null, null, null, null, globalWaistBanner, promotionWaist, null, null, list, entranceBubble, bubbleSellingPoints, exceptionUX, bCMStandardTrack, productSellingPoints, tryOnData, -1, -3, 1065353119, 2096343);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo LIZJ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L17
            java.lang.Integer r2 = r13.purchaseMethod
            X.045l r0 = X.EnumC10415045l.SUBSCRIBE
            int r1 = r0.getValue()
            if (r2 == 0) goto L17
            int r0 = r2.intValue()
            if (r0 != r1) goto L17
            r0 = 1
        L13:
            r6 = 0
            if (r0 != 0) goto L19
            return r6
        L17:
            r0 = 0
            goto L13
        L19:
            java.lang.String r4 = r13.periodText
            if (r4 != 0) goto L1e
            return r6
        L1e:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo r0 = r12.purchaseMethodInfo
            if (r0 == 0) goto L88
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem> r0 = r0.itemList
            if (r0 == 0) goto L88
            java.util.Iterator r5 = r0.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem) r0
            java.lang.Integer r2 = r0.purchaseMethodType
            X.045l r0 = X.EnumC10415045l.SUBSCRIBE
            int r1 = r0.getValue()
            if (r2 == 0) goto L2a
            int r0 = r2.intValue()
            if (r0 != r1) goto L2a
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem r3 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem) r3
            if (r3 == 0) goto L88
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SubscribePeriodInfo r0 = r3.periodInfo
            if (r0 == 0) goto L88
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo> r0 = r0.periodInfoList
            if (r0 == 0) goto L88
            java.util.Iterator r2 = r0.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo) r0
            java.lang.String r0 = r0.periodText
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L57
        L6c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo) r1
            if (r1 == 0) goto L88
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo
            r4 = 0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo r3 = com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo.LIZ(r1, r0)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L84:
            r1 = r6
            goto L6c
        L86:
            r3 = r6
            goto L47
        L88:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo LJ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L17
            java.lang.Integer r2 = r8.purchaseMethod
            X.045l r0 = X.EnumC10415045l.SUBSCRIBE
            int r1 = r0.getValue()
            if (r2 == 0) goto L17
            int r0 = r2.intValue()
            if (r0 != r1) goto L17
            r0 = 1
        L13:
            r6 = 0
            if (r0 != 0) goto L19
            return r6
        L17:
            r0 = 0
            goto L13
        L19:
            java.lang.String r4 = r8.periodText
            if (r4 != 0) goto L1e
            return r6
        L1e:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodInfo r0 = r7.purchaseMethodInfo
            if (r0 == 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem> r0 = r0.itemList
            if (r0 == 0) goto L7b
            java.util.Iterator r5 = r0.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem) r0
            java.lang.Integer r2 = r0.purchaseMethodType
            X.045l r0 = X.EnumC10415045l.SUBSCRIBE
            int r1 = r0.getValue()
            if (r2 == 0) goto L2a
            int r0 = r2.intValue()
            if (r0 != r1) goto L2a
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem r3 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseMethodItem) r3
            if (r3 == 0) goto L7b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SubscribePeriodInfo r0 = r3.periodInfo
            if (r0 == 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo> r0 = r0.periodInfoList
            if (r0 == 0) goto L7b
            java.util.Iterator r2 = r0.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo) r0
            java.lang.String r0 = r0.periodText
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L57
        L6c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo) r1
            if (r1 == 0) goto L7b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo.LIZ(r1, r0)
            return r0
        L77:
            r1 = r6
            goto L6c
        L79:
            r3 = r6
            goto L47
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct.LJ(com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo");
    }

    public final boolean LJIIIIZZ(Integer num) {
        List<SkuItem> list;
        if (num == null) {
            num = this.bizType;
        }
        if (!C748002w2.LIZ(num) || (list = this.skus) == null || list.isEmpty() || ((SkuItem) ListProtector.get(this.skus, 0)).originalImage == null) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        SellerInfo sellerInfo = this.sellerInfo;
        if (sellerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerInfo.writeToParcel(parcel, i);
        }
        SelfOperatedSloganInfo selfOperatedSloganInfo = this.selfOperatedSloganInfo;
        if (selfOperatedSloganInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selfOperatedSloganInfo.writeToParcel(parcel, i);
        }
        ProductBase productBase = this.baseInfo;
        if (productBase == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productBase.writeToParcel(parcel, i);
        }
        List<Video> list = this.creatorVideos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Video> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        StandardSaleProps standardSaleProps = this.localSizeSaleProp;
        if (standardSaleProps == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            standardSaleProps.writeToParcel(parcel, i);
        }
        PromotionLabelVO promotionLabelVO = this.promotionLabels;
        if (promotionLabelVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionLabelVO.writeToParcel(parcel, i);
        }
        List<SaleProp> list2 = this.saleProps;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SaleProp> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        SkcInfo skcInfo = this.skcInfo;
        if (skcInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skcInfo.writeToParcel(parcel, i);
        }
        List<SkuItem> list3 = this.skus;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<SkuItem> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        UserRight userRight = this.userRight;
        if (userRight == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userRight.writeToParcel(parcel, i);
        }
        LogisticDTO logisticDTO = this.logistic;
        if (logisticDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticDTO.writeToParcel(parcel, i);
        }
        com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo voucherInfo = this.voucherInfo;
        if (voucherInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voucherInfo.writeToParcel(parcel, i);
        }
        ModelCard modelCard = this.modelCard;
        if (modelCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            modelCard.writeToParcel(parcel, i);
        }
        ProductDetailReview productDetailReview = this.review;
        if (productDetailReview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productDetailReview.writeToParcel(parcel, i);
        }
        ShopReviewEntry shopReviewEntry = this.shopReview;
        if (shopReviewEntry == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopReviewEntry.writeToParcel(parcel, i);
        }
        FlashSale flashSale = this.flashSale;
        if (flashSale == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flashSale.writeToParcel(parcel, i);
        }
        List<ProductBannerLabel> list4 = this.productBannerLabel;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<ProductBannerLabel> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        AddToCartButton addToCartButton = this.addToCartButton;
        if (addToCartButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addToCartButton.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.cartEntry, i);
        PickTag pickTag = this.activityInfo;
        if (pickTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pickTag.writeToParcel(parcel, i);
        }
        List<PromotionLogo> list5 = this.promotionLogos;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            Iterator<PromotionLogo> it6 = list5.iterator();
            while (it6.hasNext()) {
                it6.next().writeToParcel(parcel, i);
            }
        }
        List<ProductLogo> list6 = this.productLogos;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<ProductLogo> it7 = list6.iterator();
            while (it7.hasNext()) {
                it7.next().writeToParcel(parcel, i);
            }
        }
        PopUp popUp = this.popUp;
        if (popUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUp.writeToParcel(parcel, i);
        }
        parcel.writeString(this.chainKey);
        parcel.writeParcelable(this.promotionView, i);
        Boolean bool = this.hasShippingAddress;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hasPayMethod;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        DynamicSchema dynamicSchema = this.schemaInfo;
        if (dynamicSchema == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicSchema.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.extra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        BuyButton buyButton = this.buyButton;
        if (buyButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyButton.writeToParcel(parcel, i);
        }
        ProductUnavailableInfo productUnavailableInfo = this.productUnavailableInfo;
        if (productUnavailableInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productUnavailableInfo.writeToParcel(parcel, i);
        }
        ShareInfo shareInfo = this.shareInfo;
        if (shareInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareInfo.writeToParcel(parcel, i);
        }
        List<StaticSellingPoint> list7 = this.staticSellingPoints;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list7.size());
            Iterator<StaticSellingPoint> it8 = list7.iterator();
            while (it8.hasNext()) {
                it8.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.lockUpStaticSellingPoint);
        RankInfo rankInfo = this.rankInfo;
        if (rankInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rankInfo.writeToParcel(parcel, i);
        }
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        if (preOrderInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preOrderInfo.writeToParcel(parcel, i);
        }
        PromotionEntrance promotionEntrance = this.promotionEntrance;
        if (promotionEntrance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionEntrance.writeToParcel(parcel, i);
        }
        Integer num2 = this.template;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        MarketingConfig marketingConfig = this.marketingConfig;
        if (marketingConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketingConfig.writeToParcel(parcel, i);
        }
        List<PromotionDiscount> list8 = this.promotionDiscounts;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list8.size());
            Iterator<PromotionDiscount> it9 = list8.iterator();
            while (it9.hasNext()) {
                it9.next().writeToParcel(parcel, i);
            }
        }
        List<BrickInfo> list9 = this.bricks;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list9.size());
            Iterator<BrickInfo> it10 = list9.iterator();
            while (it10.hasNext()) {
                it10.next().writeToParcel(parcel, i);
            }
        }
        List<Tab> list10 = this.tabs;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list10.size());
            Iterator<Tab> it11 = list10.iterator();
            while (it11.hasNext()) {
                it11.next().writeToParcel(parcel, i);
            }
        }
        ProductUnavailableInfo productUnavailableInfo2 = this.unavailableInfo;
        if (productUnavailableInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productUnavailableInfo2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultAddressId);
        Integer num3 = this.favoriteStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        BlockPageInfo blockPageInfo = this.blockPageInfo;
        if (blockPageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockPageInfo.writeToParcel(parcel, i);
        }
        List<Announcement> list11 = this.announcements;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list11.size());
            Iterator<Announcement> it12 = list11.iterator();
            while (it12.hasNext()) {
                it12.next().writeToParcel(parcel, i);
            }
        }
        SKUPanelBottomText sKUPanelBottomText = this.skuPanelBottomText;
        if (sKUPanelBottomText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sKUPanelBottomText.writeToParcel(parcel, i);
        }
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        if (skuCommonConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuCommonConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        if (pDPLogisticModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pDPLogisticModule.writeToParcel(parcel, i);
        }
        PdpPaymentModule pdpPaymentModule = this.pdpPaymentModule;
        if (pdpPaymentModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpPaymentModule.writeToParcel(parcel, i);
        }
        SEACCIPaymentModule sEACCIPaymentModule = this.seaCciPaymentModule;
        if (sEACCIPaymentModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sEACCIPaymentModule.writeToParcel(parcel, i);
        }
        UserRight userRight2 = this.returnPolicy;
        if (userRight2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userRight2.writeToParcel(parcel, i);
        }
        WarehouseTag warehouseTag = this.warehouseTag;
        if (warehouseTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            warehouseTag.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.withCoupon;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.promotionReform;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num4 = this.skuStyle;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.pageExpressionType;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        BundleBrief bundleBrief = this.bundleBrief;
        if (bundleBrief == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundleBrief.writeToParcel(parcel, i);
        }
        LazyLoadInfo lazyLoadInfo = this.lazyLoadInfo;
        if (lazyLoadInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lazyLoadInfo.writeToParcel(parcel, i);
        }
        PdpShipping pdpShipping = this.shipping;
        if (pdpShipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpShipping.writeToParcel(parcel, i);
        }
        parcel.writeString(this.billInfoParams);
        Integer num6 = this.billSceneType;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.bottomNavBarStyle;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.bizType;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Favorite favorite = this.favorite;
        if (favorite == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favorite.writeToParcel(parcel, i);
        }
        GlobalWaistBanner globalWaistBanner = this.globalWaistBanner;
        if (globalWaistBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            globalWaistBanner.writeToParcel(parcel, i);
        }
        PromotionWaist promotionWaist = this.promotionWaist;
        if (promotionWaist == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionWaist.writeToParcel(parcel, i);
        }
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = this.skuPanelWaistBanner;
        if (seaSkuPanelWaistBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaSkuPanelWaistBanner.writeToParcel(parcel, i);
        }
        PromotionWaist promotionWaist2 = this.skuPanelPromotionWaist;
        if (promotionWaist2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionWaist2.writeToParcel(parcel, i);
        }
        SeaSkuPanelData seaSkuPanelData = this.skuPanelData;
        if (seaSkuPanelData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaSkuPanelData.writeToParcel(parcel, i);
        }
        CouponPromotion couponPromotion = this.couponPromotion;
        if (couponPromotion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            couponPromotion.writeToParcel(parcel, i);
        }
        LowerPricedRecommendations lowerPricedRecommendations = this.lowerPricedRecommendation;
        if (lowerPricedRecommendations == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lowerPricedRecommendations.writeToParcel(parcel, i);
        }
        PdpBottomArea pdpBottomArea = this.bottomArea;
        if (pdpBottomArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpBottomArea.writeToParcel(parcel, i);
        }
        PurchaseLimit purchaseLimit = this.purchaseLimit;
        if (purchaseLimit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            purchaseLimit.writeToParcel(parcel, i);
        }
        ConvenientSubmitOrder convenientSubmitOrder = this.convenientSubmitOrder;
        if (convenientSubmitOrder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(convenientSubmitOrder.schema);
        }
        parcel.writeString(this.sellerId);
        List<BizParserInfo> list12 = this.pageBizList;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list12.size());
            Iterator<BizParserInfo> it13 = list12.iterator();
            while (it13.hasNext()) {
                it13.next().writeToParcel(parcel, i);
            }
        }
        BrandInfo brandInfo = this.brandInfo;
        if (brandInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            brandInfo.writeToParcel(parcel, i);
        }
        HeaderSlideEntrance headerSlideEntrance = this.headerSlideEntrance;
        if (headerSlideEntrance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            headerSlideEntrance.writeToParcel(parcel, i);
        }
        NoticeMessage noticeMessage = this.noticeMessage;
        if (noticeMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noticeMessage.writeToParcel(parcel, i);
        }
        DefaultSelection defaultSelection = this.defaultSelection;
        if (defaultSelection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultSelection.writeToParcel(parcel, i);
        }
        parcel.writeString(this.helpCenterSchemaUrl);
        parcel.writeSerializable(this.ocpContext);
        List<PopupTrigger> list13 = this.popupTriggers;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list13.size());
            Iterator<PopupTrigger> it14 = list13.iterator();
            while (it14.hasNext()) {
                it14.next().writeToParcel(parcel, i);
            }
        }
        List<NextRequestScene> list14 = this.nextRequestScenes;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list14.size());
            Iterator<NextRequestScene> it15 = list14.iterator();
            while (it15.hasNext()) {
                it15.next().writeToParcel(parcel, i);
            }
        }
        LockUpBadge lockUpBadge = this.lockUpBadge;
        if (lockUpBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lockUpBadge.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.localPreprocessImageMonitor ? 1 : 0);
        PdpProductMeasurementModule pdpProductMeasurementModule = this.pdpProductMeasurementModule;
        if (pdpProductMeasurementModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpProductMeasurementModule.writeToParcel(parcel, i);
        }
        LynxCreatorModule lynxCreatorModule = this.lynxCreatorModule;
        if (lynxCreatorModule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lynxCreatorModule.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.isPlatformProductLink;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        EntranceBubble entranceBubble = this.entranceBubble;
        if (entranceBubble == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entranceBubble.writeToParcel(parcel, i);
        }
        BubbleSellingPoints bubbleSellingPoints = this.bubbleSellingPoints;
        if (bubbleSellingPoints == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bubbleSellingPoints.writeToParcel(parcel, i);
        }
        ExchangeInfo exchangeInfo = this.skuPanelReminder;
        if (exchangeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exchangeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.defaultSkuId);
        parcel.writeParcelable(this.godaProtocol, i);
        parcel.writeParcelable(this.exceptionUX, i);
        parcel.writeString(this.hybridExtra);
        BCMStandardTrack bCMStandardTrack = this.bcmStandardTrack;
        if (bCMStandardTrack == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bCMStandardTrack.writeToParcel(parcel, i);
        }
        PurchaseMethodInfo purchaseMethodInfo = this.purchaseMethodInfo;
        if (purchaseMethodInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            purchaseMethodInfo.writeToParcel(parcel, i);
        }
        ProductInterlinkModuleVO productInterlinkModuleVO = this.productInterlink;
        if (productInterlinkModuleVO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productInterlinkModuleVO.writeToParcel(parcel, i);
        }
        ProductSellingPoints productSellingPoints = this.productSellingPoints;
        if (productSellingPoints == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productSellingPoints.writeToParcel(parcel, i);
        }
        TryOnData tryOnData = this.tryOnData;
        if (tryOnData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tryOnData.writeToParcel(parcel, i);
        }
        AiAssistant aiAssistant = this.aiAssistant;
        if (aiAssistant == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aiAssistant.writeToParcel(parcel, i);
        }
        LynxInfo lynxInfo = this.insuranceLynxInfo;
        if (lynxInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lynxInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.seaCoreBizDaInfo);
        RecommendationContext recommendationContext = this.productRecommendContext;
        if (recommendationContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recommendationContext.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.godaV2Protocol, i);
        parcel.writeString(this.buyButtonInterestId);
        Boolean bool6 = this.skuPanelOpen;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Map<String, String> map2 = this.buttonDynamicData;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        CutPriceLayerData cutPriceLayerData = this.cutPriceLayerData;
        if (cutPriceLayerData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cutPriceLayerData.writeToParcel(parcel, i);
        }
        SeaPdpMediaWindow seaPdpMediaWindow = this.mediaWindow;
        if (seaPdpMediaWindow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seaPdpMediaWindow.writeToParcel(parcel, i);
        }
        RecipientInfo recipientInfo = this.recipientInfo;
        if (recipientInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recipientInfo.writeToParcel(parcel, i);
        }
    }

    public static ProductPackStruct LIZ(ProductPackStruct productPackStruct, SellerInfo sellerInfo, PromotionLabelVO promotionLabelVO, List list, List list2, FlashSale flashSale, AddToCartButton addToCartButton, ShareInfo shareInfo, List list3, List list4, Integer num, PDPLogisticModule pDPLogisticModule, PdpPaymentModule pdpPaymentModule, SEACCIPaymentModule sEACCIPaymentModule, GlobalWaistBanner globalWaistBanner, PromotionWaist promotionWaist, SeaSkuPanelData seaSkuPanelData, CouponPromotion couponPromotion, List list5, EntranceBubble entranceBubble, BubbleSellingPoints bubbleSellingPoints, ExceptionUX exceptionUX, BCMStandardTrack bCMStandardTrack, ProductSellingPoints productSellingPoints, TryOnData tryOnData, int i, int i2, int i3, int i4) {
        String str;
        Integer num2;
        SelfOperatedSloganInfo selfOperatedSloganInfo;
        ProductBase productBase;
        List<Video> list6;
        StandardSaleProps standardSaleProps;
        SkcInfo skcInfo;
        UserRight userRight;
        LogisticDTO logisticDTO;
        com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo voucherInfo;
        ModelCard modelCard;
        ProductDetailReview productDetailReview;
        ShopReviewEntry shopReviewEntry;
        List<ProductBannerLabel> list7;
        CartEntry cartEntry;
        PickTag pickTag;
        List<PromotionLogo> list8;
        List<ProductLogo> list9;
        PopUp popUp;
        String str2;
        com.bytedance.android.livesdk.model.message.ext.PromotionView promotionView;
        Boolean bool;
        Boolean bool2;
        DynamicSchema dynamicSchema;
        Map<String, String> map;
        BuyButton buyButton;
        ProductUnavailableInfo productUnavailableInfo;
        List<StaticSellingPoint> list10;
        String str3;
        RankInfo rankInfo;
        PreOrderInfo preOrderInfo;
        PromotionEntrance promotionEntrance;
        Integer num3;
        MarketingConfig marketingConfig;
        List<Tab> list11;
        ProductUnavailableInfo productUnavailableInfo2;
        String str4;
        int i5;
        BlockPageInfo blockPageInfo;
        List<Announcement> list12;
        int i6;
        SKUPanelBottomText sKUPanelBottomText;
        int i7;
        SkuCommonConfig skuCommonConfig;
        int i8;
        String str5;
        int i9;
        UserRight userRight2;
        int i10;
        WarehouseTag warehouseTag;
        int i11;
        Boolean bool3;
        int i12;
        Boolean bool4;
        Integer num4;
        Integer num5;
        BundleBrief bundleBrief;
        LazyLoadInfo lazyLoadInfo;
        PdpShipping pdpShipping;
        String str6;
        Integer num6;
        Integer num7;
        Integer num8;
        Favorite favorite;
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner;
        PromotionWaist promotionWaist2;
        LowerPricedRecommendations lowerPricedRecommendations;
        PdpBottomArea pdpBottomArea;
        PurchaseLimit purchaseLimit;
        ConvenientSubmitOrder convenientSubmitOrder;
        int i13;
        String str7;
        List<BizParserInfo> list13;
        int i14;
        BrandInfo brandInfo;
        int i15;
        HeaderSlideEntrance headerSlideEntrance;
        int i16;
        NoticeMessage noticeMessage;
        int i17;
        DefaultSelection defaultSelection;
        int i18;
        String str8;
        int i19;
        OneClickPayContext oneClickPayContext;
        int i20;
        List<NextRequestScene> list14;
        int i21;
        LockUpBadge lockUpBadge;
        boolean z;
        PdpProductMeasurementModule pdpProductMeasurementModule;
        LynxCreatorModule lynxCreatorModule;
        Boolean bool5;
        ExchangeInfo exchangeInfo;
        String str9;
        GodaProtocol godaProtocol;
        String str10;
        PurchaseMethodInfo purchaseMethodInfo;
        ProductInterlinkModuleVO productInterlinkModuleVO;
        AiAssistant aiAssistant;
        LynxInfo lynxInfo;
        String str11;
        RecommendationContext recommendationContext;
        GodaV2Protocol<?> godaV2Protocol;
        String str12;
        Boolean bool6;
        int i22;
        Map<String, String> map2;
        int i23;
        CutPriceLayerData cutPriceLayerData;
        int i24;
        SeaPdpMediaWindow seaPdpMediaWindow;
        RecipientInfo recipientInfo;
        TryOnData tryOnData2 = tryOnData;
        ProductSellingPoints productSellingPoints2 = productSellingPoints;
        BCMStandardTrack bCMStandardTrack2 = bCMStandardTrack;
        ExceptionUX exceptionUX2 = exceptionUX;
        BubbleSellingPoints bubbleSellingPoints2 = bubbleSellingPoints;
        List list15 = list3;
        PromotionWaist promotionWaist3 = promotionWaist;
        EntranceBubble entranceBubble2 = entranceBubble;
        PDPLogisticModule pDPLogisticModule2 = pDPLogisticModule;
        SEACCIPaymentModule sEACCIPaymentModule2 = sEACCIPaymentModule;
        ShareInfo shareInfo2 = shareInfo;
        List list16 = list4;
        SellerInfo sellerInfo2 = sellerInfo;
        FlashSale flashSale2 = flashSale;
        List list17 = list2;
        List list18 = list;
        AddToCartButton addToCartButton2 = addToCartButton;
        Integer num9 = num;
        List list19 = list5;
        CouponPromotion couponPromotion2 = couponPromotion;
        PromotionLabelVO promotionLabelVO2 = promotionLabelVO;
        SeaSkuPanelData seaSkuPanelData2 = seaSkuPanelData;
        PdpPaymentModule pdpPaymentModule2 = pdpPaymentModule;
        GlobalWaistBanner globalWaistBanner2 = globalWaistBanner;
        if ((i & 1) != 0) {
            str = productPackStruct.productId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            num2 = productPackStruct.status;
        } else {
            num2 = null;
        }
        if ((i & 4) != 0) {
            sellerInfo2 = productPackStruct.sellerInfo;
        }
        if ((i & 8) != 0) {
            selfOperatedSloganInfo = productPackStruct.selfOperatedSloganInfo;
        } else {
            selfOperatedSloganInfo = null;
        }
        if ((i & 16) != 0) {
            productBase = productPackStruct.baseInfo;
        } else {
            productBase = null;
        }
        if ((i & 32) != 0) {
            list6 = productPackStruct.creatorVideos;
        } else {
            list6 = null;
        }
        if ((i & 64) != 0) {
            standardSaleProps = productPackStruct.localSizeSaleProp;
        } else {
            standardSaleProps = null;
        }
        if ((i & 128) != 0) {
            promotionLabelVO2 = productPackStruct.promotionLabels;
        }
        if ((i & 256) != 0) {
            list18 = productPackStruct.saleProps;
        }
        if ((i & 512) != 0) {
            skcInfo = productPackStruct.skcInfo;
        } else {
            skcInfo = null;
        }
        if ((i & 1024) != 0) {
            list17 = productPackStruct.skus;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            userRight = productPackStruct.userRight;
        } else {
            userRight = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            logisticDTO = productPackStruct.logistic;
        } else {
            logisticDTO = null;
        }
        if ((i & 8192) != 0) {
            voucherInfo = productPackStruct.voucherInfo;
        } else {
            voucherInfo = null;
        }
        if ((i & 16384) != 0) {
            modelCard = productPackStruct.modelCard;
        } else {
            modelCard = null;
        }
        if ((i & 32768) != 0) {
            productDetailReview = productPackStruct.review;
        } else {
            productDetailReview = null;
        }
        if ((65536 & i) != 0) {
            shopReviewEntry = productPackStruct.shopReview;
        } else {
            shopReviewEntry = null;
        }
        if ((i & 131072) != 0) {
            flashSale2 = productPackStruct.flashSale;
        }
        if ((262144 & i) != 0) {
            list7 = productPackStruct.productBannerLabel;
        } else {
            list7 = null;
        }
        if ((524288 & i) != 0) {
            addToCartButton2 = productPackStruct.addToCartButton;
        }
        if ((1048576 & i) != 0) {
            cartEntry = productPackStruct.cartEntry;
        } else {
            cartEntry = null;
        }
        if ((2097152 & i) != 0) {
            pickTag = productPackStruct.activityInfo;
        } else {
            pickTag = null;
        }
        if ((4194304 & i) != 0) {
            list8 = productPackStruct.promotionLogos;
        } else {
            list8 = null;
        }
        if ((8388608 & i) != 0) {
            list9 = productPackStruct.productLogos;
        } else {
            list9 = null;
        }
        if ((16777216 & i) != 0) {
            popUp = productPackStruct.popUp;
        } else {
            popUp = null;
        }
        if ((33554432 & i) != 0) {
            str2 = productPackStruct.chainKey;
        } else {
            str2 = null;
        }
        if ((67108864 & i) != 0) {
            promotionView = productPackStruct.promotionView;
        } else {
            promotionView = null;
        }
        if ((134217728 & i) != 0) {
            bool = productPackStruct.hasShippingAddress;
        } else {
            bool = null;
        }
        if ((268435456 & i) != 0) {
            bool2 = productPackStruct.hasPayMethod;
        } else {
            bool2 = null;
        }
        if ((536870912 & i) != 0) {
            dynamicSchema = productPackStruct.schemaInfo;
        } else {
            dynamicSchema = null;
        }
        if ((1073741824 & i) != 0) {
            map = productPackStruct.extra;
        } else {
            map = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            buyButton = productPackStruct.buyButton;
        } else {
            buyButton = null;
        }
        if ((i2 & 1) != 0) {
            productUnavailableInfo = productPackStruct.productUnavailableInfo;
        } else {
            productUnavailableInfo = null;
        }
        if ((i2 & 2) != 0) {
            shareInfo2 = productPackStruct.shareInfo;
        }
        if ((i2 & 4) != 0) {
            list10 = productPackStruct.staticSellingPoints;
        } else {
            list10 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = productPackStruct.lockUpStaticSellingPoint;
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            rankInfo = productPackStruct.rankInfo;
        } else {
            rankInfo = null;
        }
        if ((i2 & 32) != 0) {
            preOrderInfo = productPackStruct.preOrderInfo;
        } else {
            preOrderInfo = null;
        }
        if ((i2 & 64) != 0) {
            promotionEntrance = productPackStruct.promotionEntrance;
        } else {
            promotionEntrance = null;
        }
        if ((i2 & 128) != 0) {
            num3 = productPackStruct.template;
        } else {
            num3 = null;
        }
        if ((i2 & 256) != 0) {
            marketingConfig = productPackStruct.marketingConfig;
        } else {
            marketingConfig = null;
        }
        if ((i2 & 512) != 0) {
            list15 = productPackStruct.promotionDiscounts;
        }
        if ((i2 & 1024) != 0) {
            list16 = productPackStruct.bricks;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list11 = productPackStruct.tabs;
        } else {
            list11 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            productUnavailableInfo2 = productPackStruct.unavailableInfo;
        } else {
            productUnavailableInfo2 = null;
        }
        if ((i2 & 8192) != 0) {
            str4 = productPackStruct.defaultAddressId;
        } else {
            str4 = null;
        }
        if ((i2 & 16384) != 0) {
            num9 = productPackStruct.favoriteStatus;
        }
        if ((i2 & 32768) != 0) {
            blockPageInfo = productPackStruct.blockPageInfo;
            i5 = 65536;
        } else {
            i5 = 65536;
            blockPageInfo = null;
        }
        if ((i5 & i2) != 0) {
            list12 = productPackStruct.announcements;
        } else {
            list12 = null;
        }
        if ((i2 & 131072) != 0) {
            sKUPanelBottomText = productPackStruct.skuPanelBottomText;
            i6 = 262144;
        } else {
            i6 = 262144;
            sKUPanelBottomText = null;
        }
        if ((i6 & i2) != 0) {
            skuCommonConfig = productPackStruct.skuCommonConfig;
            i7 = 524288;
        } else {
            i7 = 524288;
            skuCommonConfig = null;
        }
        if ((i7 & i2) != 0) {
            str5 = productPackStruct.daInfo;
            i8 = 1048576;
        } else {
            i8 = 1048576;
            str5 = null;
        }
        if ((i8 & i2) != 0) {
            pDPLogisticModule2 = productPackStruct.pdpLogisticModule;
        }
        if ((2097152 & i2) != 0) {
            pdpPaymentModule2 = productPackStruct.pdpPaymentModule;
        }
        if ((4194304 & i2) != 0) {
            sEACCIPaymentModule2 = productPackStruct.seaCciPaymentModule;
        }
        if ((8388608 & i2) != 0) {
            userRight2 = productPackStruct.returnPolicy;
            i9 = 16777216;
        } else {
            i9 = 16777216;
            userRight2 = null;
        }
        if ((i9 & i2) != 0) {
            warehouseTag = productPackStruct.warehouseTag;
            i10 = 33554432;
        } else {
            i10 = 33554432;
            warehouseTag = null;
        }
        if ((i10 & i2) != 0) {
            bool3 = productPackStruct.withCoupon;
            i11 = 67108864;
        } else {
            i11 = 67108864;
            bool3 = null;
        }
        if ((i11 & i2) != 0) {
            bool4 = productPackStruct.promotionReform;
            i12 = 134217728;
        } else {
            i12 = 134217728;
            bool4 = null;
        }
        if ((i12 & i2) != 0) {
            num4 = productPackStruct.skuStyle;
        } else {
            num4 = null;
        }
        if ((268435456 & i2) != 0) {
            num5 = productPackStruct.pageExpressionType;
        } else {
            num5 = null;
        }
        if ((536870912 & i2) != 0) {
            bundleBrief = productPackStruct.bundleBrief;
        } else {
            bundleBrief = null;
        }
        if ((1073741824 & i2) != 0) {
            lazyLoadInfo = productPackStruct.lazyLoadInfo;
        } else {
            lazyLoadInfo = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            pdpShipping = productPackStruct.shipping;
        } else {
            pdpShipping = null;
        }
        if ((i3 & 1) != 0) {
            str6 = productPackStruct.billInfoParams;
        } else {
            str6 = null;
        }
        if ((i3 & 2) != 0) {
            num6 = productPackStruct.billSceneType;
        } else {
            num6 = null;
        }
        if ((i3 & 4) != 0) {
            num7 = productPackStruct.bottomNavBarStyle;
        } else {
            num7 = null;
        }
        if ((i3 & 8) != 0) {
            num8 = productPackStruct.bizType;
        } else {
            num8 = null;
        }
        if ((i3 & 16) != 0) {
            favorite = productPackStruct.favorite;
        } else {
            favorite = null;
        }
        if ((i3 & 32) != 0) {
            globalWaistBanner2 = productPackStruct.globalWaistBanner;
        }
        if ((i3 & 64) != 0) {
            promotionWaist3 = productPackStruct.promotionWaist;
        }
        if ((i3 & 128) != 0) {
            seaSkuPanelWaistBanner = productPackStruct.skuPanelWaistBanner;
        } else {
            seaSkuPanelWaistBanner = null;
        }
        if ((i3 & 256) != 0) {
            promotionWaist2 = productPackStruct.skuPanelPromotionWaist;
        } else {
            promotionWaist2 = null;
        }
        if ((i3 & 512) != 0) {
            seaSkuPanelData2 = productPackStruct.skuPanelData;
        }
        if ((i3 & 1024) != 0) {
            couponPromotion2 = productPackStruct.couponPromotion;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            lowerPricedRecommendations = productPackStruct.lowerPricedRecommendation;
        } else {
            lowerPricedRecommendations = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            pdpBottomArea = productPackStruct.bottomArea;
        } else {
            pdpBottomArea = null;
        }
        if ((i3 & 8192) != 0) {
            purchaseLimit = productPackStruct.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        if ((i3 & 16384) != 0) {
            convenientSubmitOrder = productPackStruct.convenientSubmitOrder;
        } else {
            convenientSubmitOrder = null;
        }
        if ((i3 & 32768) != 0) {
            str7 = productPackStruct.sellerId;
            i13 = 65536;
        } else {
            i13 = 65536;
            str7 = null;
        }
        if ((i13 & i3) != 0) {
            list13 = productPackStruct.pageBizList;
        } else {
            list13 = null;
        }
        if ((i3 & 131072) != 0) {
            brandInfo = productPackStruct.brandInfo;
            i14 = 262144;
        } else {
            i14 = 262144;
            brandInfo = null;
        }
        if ((i14 & i3) != 0) {
            headerSlideEntrance = productPackStruct.headerSlideEntrance;
            i15 = 524288;
        } else {
            i15 = 524288;
            headerSlideEntrance = null;
        }
        if ((i15 & i3) != 0) {
            noticeMessage = productPackStruct.noticeMessage;
            i16 = 1048576;
        } else {
            i16 = 1048576;
            noticeMessage = null;
        }
        if ((i16 & i3) != 0) {
            defaultSelection = productPackStruct.defaultSelection;
            i17 = 2097152;
        } else {
            i17 = 2097152;
            defaultSelection = null;
        }
        if ((i17 & i3) != 0) {
            str8 = productPackStruct.helpCenterSchemaUrl;
            i18 = 4194304;
        } else {
            i18 = 4194304;
            str8 = null;
        }
        if ((i18 & i3) != 0) {
            oneClickPayContext = productPackStruct.ocpContext;
            i19 = 8388608;
        } else {
            i19 = 8388608;
            oneClickPayContext = null;
        }
        if ((i19 & i3) != 0) {
            list19 = productPackStruct.popupTriggers;
        }
        if ((16777216 & i3) != 0) {
            list14 = productPackStruct.nextRequestScenes;
            i20 = 33554432;
        } else {
            i20 = 33554432;
            list14 = null;
        }
        if ((i20 & i3) != 0) {
            lockUpBadge = productPackStruct.lockUpBadge;
            i21 = 67108864;
        } else {
            i21 = 67108864;
            lockUpBadge = null;
        }
        if ((i21 & i3) != 0) {
            z = productPackStruct.localPreprocessImageMonitor;
        } else {
            z = false;
        }
        if ((134217728 & i3) != 0) {
            pdpProductMeasurementModule = productPackStruct.pdpProductMeasurementModule;
        } else {
            pdpProductMeasurementModule = null;
        }
        if ((268435456 & i3) != 0) {
            lynxCreatorModule = productPackStruct.lynxCreatorModule;
        } else {
            lynxCreatorModule = null;
        }
        if ((536870912 & i3) != 0) {
            bool5 = productPackStruct.isPlatformProductLink;
        } else {
            bool5 = null;
        }
        if ((1073741824 & i3) != 0) {
            entranceBubble2 = productPackStruct.entranceBubble;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            bubbleSellingPoints2 = productPackStruct.bubbleSellingPoints;
        }
        if ((i4 & 1) != 0) {
            exchangeInfo = productPackStruct.skuPanelReminder;
        } else {
            exchangeInfo = null;
        }
        if ((i4 & 2) != 0) {
            str9 = productPackStruct.defaultSkuId;
        } else {
            str9 = null;
        }
        if ((i4 & 4) != 0) {
            godaProtocol = productPackStruct.godaProtocol;
        } else {
            godaProtocol = null;
        }
        if ((i4 & 8) != 0) {
            exceptionUX2 = productPackStruct.exceptionUX;
        }
        if ((i4 & 16) != 0) {
            str10 = productPackStruct.hybridExtra;
        } else {
            str10 = null;
        }
        if ((i4 & 32) != 0) {
            bCMStandardTrack2 = productPackStruct.bcmStandardTrack;
        }
        if ((i4 & 64) != 0) {
            purchaseMethodInfo = productPackStruct.purchaseMethodInfo;
        } else {
            purchaseMethodInfo = null;
        }
        if ((i4 & 128) != 0) {
            productInterlinkModuleVO = productPackStruct.productInterlink;
        } else {
            productInterlinkModuleVO = null;
        }
        if ((i4 & 256) != 0) {
            productSellingPoints2 = productPackStruct.productSellingPoints;
        }
        if ((i4 & 512) != 0) {
            tryOnData2 = productPackStruct.tryOnData;
        }
        if ((i4 & 1024) != 0) {
            aiAssistant = productPackStruct.aiAssistant;
        } else {
            aiAssistant = null;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            lynxInfo = productPackStruct.insuranceLynxInfo;
        } else {
            lynxInfo = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = productPackStruct.seaCoreBizDaInfo;
        } else {
            str11 = null;
        }
        if ((i4 & 8192) != 0) {
            recommendationContext = productPackStruct.productRecommendContext;
        } else {
            recommendationContext = null;
        }
        if ((i4 & 16384) != 0) {
            godaV2Protocol = productPackStruct.godaV2Protocol;
        } else {
            godaV2Protocol = null;
        }
        if ((32768 & i4) != 0) {
            str12 = productPackStruct.buyButtonInterestId;
        } else {
            str12 = null;
        }
        if ((65536 & i4) != 0) {
            bool6 = productPackStruct.skuPanelOpen;
        } else {
            bool6 = null;
        }
        if ((i4 & 131072) != 0) {
            map2 = productPackStruct.buttonDynamicData;
            i22 = 262144;
        } else {
            i22 = 262144;
            map2 = null;
        }
        if ((i22 & i4) != 0) {
            cutPriceLayerData = productPackStruct.cutPriceLayerData;
            i23 = 524288;
        } else {
            i23 = 524288;
            cutPriceLayerData = null;
        }
        if ((i23 & i4) != 0) {
            seaPdpMediaWindow = productPackStruct.mediaWindow;
            i24 = 1048576;
        } else {
            i24 = 1048576;
            seaPdpMediaWindow = null;
        }
        if ((i4 & i24) != 0) {
            recipientInfo = productPackStruct.recipientInfo;
        } else {
            recipientInfo = null;
        }
        productPackStruct.getClass();
        return new ProductPackStruct(str, num2, sellerInfo2, selfOperatedSloganInfo, productBase, list6, standardSaleProps, promotionLabelVO2, list18, skcInfo, list17, userRight, logisticDTO, voucherInfo, modelCard, productDetailReview, shopReviewEntry, flashSale2, list7, addToCartButton2, cartEntry, pickTag, list8, list9, popUp, str2, promotionView, bool, bool2, dynamicSchema, map, buyButton, productUnavailableInfo, shareInfo2, list10, str3, rankInfo, preOrderInfo, promotionEntrance, num3, marketingConfig, list15, list16, list11, productUnavailableInfo2, str4, num9, blockPageInfo, list12, sKUPanelBottomText, skuCommonConfig, str5, pDPLogisticModule2, pdpPaymentModule2, sEACCIPaymentModule2, userRight2, warehouseTag, bool3, bool4, num4, num5, bundleBrief, lazyLoadInfo, pdpShipping, str6, num6, num7, num8, favorite, globalWaistBanner2, promotionWaist3, seaSkuPanelWaistBanner, promotionWaist2, seaSkuPanelData2, couponPromotion2, lowerPricedRecommendations, pdpBottomArea, purchaseLimit, convenientSubmitOrder, str7, list13, brandInfo, headerSlideEntrance, noticeMessage, defaultSelection, str8, oneClickPayContext, list19, list14, lockUpBadge, z, pdpProductMeasurementModule, lynxCreatorModule, bool5, entranceBubble2, bubbleSellingPoints2, exchangeInfo, str9, godaProtocol, exceptionUX2, str10, bCMStandardTrack2, purchaseMethodInfo, productInterlinkModuleVO, productSellingPoints2, tryOnData2, aiAssistant, lynxInfo, str11, recommendationContext, godaV2Protocol, str12, bool6, map2, cutPriceLayerData, seaPdpMediaWindow, recipientInfo);
    }

    public ProductPackStruct(String str, Integer num, SellerInfo sellerInfo, SelfOperatedSloganInfo selfOperatedSloganInfo, ProductBase productBase, List<Video> list, StandardSaleProps standardSaleProps, PromotionLabelVO promotionLabelVO, List<SaleProp> list2, SkcInfo skcInfo, List<SkuItem> list3, UserRight userRight, LogisticDTO logisticDTO, com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo voucherInfo, ModelCard modelCard, ProductDetailReview productDetailReview, ShopReviewEntry shopReviewEntry, FlashSale flashSale, List<ProductBannerLabel> list4, AddToCartButton addToCartButton, CartEntry cartEntry, PickTag pickTag, List<PromotionLogo> list5, List<ProductLogo> list6, PopUp popUp, String str2, com.bytedance.android.livesdk.model.message.ext.PromotionView promotionView, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema, Map<String, String> map, BuyButton buyButton, ProductUnavailableInfo productUnavailableInfo, ShareInfo shareInfo, List<StaticSellingPoint> list7, String str3, RankInfo rankInfo, PreOrderInfo preOrderInfo, PromotionEntrance promotionEntrance, Integer num2, MarketingConfig marketingConfig, List<PromotionDiscount> list8, List<BrickInfo> list9, List<Tab> list10, ProductUnavailableInfo productUnavailableInfo2, String str4, Integer num3, BlockPageInfo blockPageInfo, List<Announcement> list11, SKUPanelBottomText sKUPanelBottomText, SkuCommonConfig skuCommonConfig, String str5, PDPLogisticModule pDPLogisticModule, PdpPaymentModule pdpPaymentModule, SEACCIPaymentModule sEACCIPaymentModule, UserRight userRight2, WarehouseTag warehouseTag, Boolean bool3, Boolean bool4, Integer num4, Integer num5, BundleBrief bundleBrief, LazyLoadInfo lazyLoadInfo, PdpShipping pdpShipping, String str6, Integer num6, Integer num7, Integer num8, Favorite favorite, GlobalWaistBanner globalWaistBanner, PromotionWaist promotionWaist, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner, PromotionWaist promotionWaist2, SeaSkuPanelData seaSkuPanelData, CouponPromotion couponPromotion, LowerPricedRecommendations lowerPricedRecommendations, PdpBottomArea pdpBottomArea, PurchaseLimit purchaseLimit, ConvenientSubmitOrder convenientSubmitOrder, String str7, List<BizParserInfo> list12, BrandInfo brandInfo, HeaderSlideEntrance headerSlideEntrance, NoticeMessage noticeMessage, DefaultSelection defaultSelection, String str8, OneClickPayContext oneClickPayContext, List<PopupTrigger> list13, List<NextRequestScene> list14, LockUpBadge lockUpBadge, boolean z, PdpProductMeasurementModule pdpProductMeasurementModule, LynxCreatorModule lynxCreatorModule, Boolean bool5, EntranceBubble entranceBubble, BubbleSellingPoints bubbleSellingPoints, ExchangeInfo exchangeInfo, String str9, GodaProtocol godaProtocol, ExceptionUX exceptionUX, String str10, BCMStandardTrack bCMStandardTrack, PurchaseMethodInfo purchaseMethodInfo, ProductInterlinkModuleVO productInterlinkModuleVO, ProductSellingPoints productSellingPoints, TryOnData tryOnData, AiAssistant aiAssistant, LynxInfo lynxInfo, String str11, RecommendationContext recommendationContext, GodaV2Protocol<?> godaV2Protocol, String str12, Boolean bool6, Map<String, String> map2, CutPriceLayerData cutPriceLayerData, SeaPdpMediaWindow seaPdpMediaWindow, RecipientInfo recipientInfo) {
        this.productId = str;
        this.status = num;
        this.sellerInfo = sellerInfo;
        this.selfOperatedSloganInfo = selfOperatedSloganInfo;
        this.baseInfo = productBase;
        this.creatorVideos = list;
        this.localSizeSaleProp = standardSaleProps;
        this.promotionLabels = promotionLabelVO;
        this.saleProps = list2;
        this.skcInfo = skcInfo;
        this.skus = list3;
        this.userRight = userRight;
        this.logistic = logisticDTO;
        this.voucherInfo = voucherInfo;
        this.modelCard = modelCard;
        this.review = productDetailReview;
        this.shopReview = shopReviewEntry;
        this.flashSale = flashSale;
        this.productBannerLabel = list4;
        this.addToCartButton = addToCartButton;
        this.cartEntry = cartEntry;
        this.activityInfo = pickTag;
        this.promotionLogos = list5;
        this.productLogos = list6;
        this.popUp = popUp;
        this.chainKey = str2;
        this.promotionView = promotionView;
        this.hasShippingAddress = bool;
        this.hasPayMethod = bool2;
        this.schemaInfo = dynamicSchema;
        this.extra = map;
        this.buyButton = buyButton;
        this.productUnavailableInfo = productUnavailableInfo;
        this.shareInfo = shareInfo;
        this.staticSellingPoints = list7;
        this.lockUpStaticSellingPoint = str3;
        this.rankInfo = rankInfo;
        this.preOrderInfo = preOrderInfo;
        this.promotionEntrance = promotionEntrance;
        this.template = num2;
        this.marketingConfig = marketingConfig;
        this.promotionDiscounts = list8;
        this.bricks = list9;
        this.tabs = list10;
        this.unavailableInfo = productUnavailableInfo2;
        this.defaultAddressId = str4;
        this.favoriteStatus = num3;
        this.blockPageInfo = blockPageInfo;
        this.announcements = list11;
        this.skuPanelBottomText = sKUPanelBottomText;
        this.skuCommonConfig = skuCommonConfig;
        this.daInfo = str5;
        this.pdpLogisticModule = pDPLogisticModule;
        this.pdpPaymentModule = pdpPaymentModule;
        this.seaCciPaymentModule = sEACCIPaymentModule;
        this.returnPolicy = userRight2;
        this.warehouseTag = warehouseTag;
        this.withCoupon = bool3;
        this.promotionReform = bool4;
        this.skuStyle = num4;
        this.pageExpressionType = num5;
        this.bundleBrief = bundleBrief;
        this.lazyLoadInfo = lazyLoadInfo;
        this.shipping = pdpShipping;
        this.billInfoParams = str6;
        this.billSceneType = num6;
        this.bottomNavBarStyle = num7;
        this.bizType = num8;
        this.favorite = favorite;
        this.globalWaistBanner = globalWaistBanner;
        this.promotionWaist = promotionWaist;
        this.skuPanelWaistBanner = seaSkuPanelWaistBanner;
        this.skuPanelPromotionWaist = promotionWaist2;
        this.skuPanelData = seaSkuPanelData;
        this.couponPromotion = couponPromotion;
        this.lowerPricedRecommendation = lowerPricedRecommendations;
        this.bottomArea = pdpBottomArea;
        this.purchaseLimit = purchaseLimit;
        this.convenientSubmitOrder = convenientSubmitOrder;
        this.sellerId = str7;
        this.pageBizList = list12;
        this.brandInfo = brandInfo;
        this.headerSlideEntrance = headerSlideEntrance;
        this.noticeMessage = noticeMessage;
        this.defaultSelection = defaultSelection;
        this.helpCenterSchemaUrl = str8;
        this.ocpContext = oneClickPayContext;
        this.popupTriggers = list13;
        this.nextRequestScenes = list14;
        this.lockUpBadge = lockUpBadge;
        this.localPreprocessImageMonitor = z;
        this.pdpProductMeasurementModule = pdpProductMeasurementModule;
        this.lynxCreatorModule = lynxCreatorModule;
        this.isPlatformProductLink = bool5;
        this.entranceBubble = entranceBubble;
        this.bubbleSellingPoints = bubbleSellingPoints;
        this.skuPanelReminder = exchangeInfo;
        this.defaultSkuId = str9;
        this.godaProtocol = godaProtocol;
        this.exceptionUX = exceptionUX;
        this.hybridExtra = str10;
        this.bcmStandardTrack = bCMStandardTrack;
        this.purchaseMethodInfo = purchaseMethodInfo;
        this.productInterlink = productInterlinkModuleVO;
        this.productSellingPoints = productSellingPoints;
        this.tryOnData = tryOnData;
        this.aiAssistant = aiAssistant;
        this.insuranceLynxInfo = lynxInfo;
        this.seaCoreBizDaInfo = str11;
        this.productRecommendContext = recommendationContext;
        this.godaV2Protocol = godaV2Protocol;
        this.buyButtonInterestId = str12;
        this.skuPanelOpen = bool6;
        this.buttonDynamicData = map2;
        this.cutPriceLayerData = cutPriceLayerData;
        this.mediaWindow = seaPdpMediaWindow;
        this.recipientInfo = recipientInfo;
    }
}
