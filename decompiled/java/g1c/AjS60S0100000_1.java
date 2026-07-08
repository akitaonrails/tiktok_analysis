package g1c;

import X.AbstractC7925037r;
import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0378;
import X.AnonymousClass0411;
import X.C03BB;
import X.C03DY;
import X.C03FA;
import X.C03LU;
import X.C03LW;
import X.C03O0;
import X.C03O1;
import X.C03WD;
import X.C03WH;
import X.C03WI;
import X.C03WJ;
import X.C03Z4;
import X.C03Z5;
import X.C03Z6;
import X.C03ZB;
import X.C03ZC;
import X.C048L;
import X.C049Y;
import X.C04GD;
import X.C04GO;
import X.C04GW;
import X.C04H0;
import X.C04H1;
import X.C09HN;
import X.C0PEM;
import X.C1006103wZ;
import X.C1007603wo;
import X.C1018703yb;
import X.C1026103zn;
import X.C1026803zu;
import X.C10463047h;
import X.C10516049i;
import X.C10526049s;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1056204Bc;
import X.C1070804Gs;
import X.C1073204Hq;
import X.C1077704Jj;
import X.C118300cf;
import X.C123100dR;
import X.C1323720kYE;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C23250099c;
import X.C23271099x;
import X.C2327809Ae;
import X.C259800zU;
import X.C343970De7;
import X.C452501pT;
import X.C497820Jfg;
import X.C703302op;
import X.C719102rN;
import X.C724240Sb0;
import X.C736702uD;
import X.C770702zh;
import X.C786410Ut5;
import X.C814703Gf;
import X.C817603Hi;
import X.C873003b6;
import X.C876303bd;
import X.C882503cd;
import X.C882703cf;
import X.C888303dZ;
import X.C890103dr;
import X.C895003ee;
import X.C899503fN;
import X.C903203fy;
import X.C919503ib;
import X.C927003jo;
import X.C927303jr;
import X.C939603lq;
import X.C939703lr;
import X.C948503nH;
import X.C951303nj;
import X.C955503oP;
import X.C958103op;
import X.C960603pE;
import X.C997203v8;
import X.C999003vQ;
import X.EnumC818803Hu;
import X.EnumC865603Zu;
import X.EnumC884003cs;
import X.EnumC966703qD;
import X.InterfaceC1071404Gy;
import X.InterfaceC1071504Gz;
import X.InterfaceC1364105Vn;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC975703rf;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddAddressBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.strategy.AddressListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.ZipCodePickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.SeaPudoFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionPaymentCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionTaxRouteCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.MiniOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.right.UserRightsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.MXAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.address.SeaOneStepAddressAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.productinfo.SeaOneStepProductInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.sellingpoint.SeaOneStepTopOutSideAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.summary.SeaOneStepSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentEnableVnBalanceSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.balance.BalanceDetailFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCSaveCardRetentionHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.USSameShippingAddressElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PopupInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TitleTips;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.summary.PaymentSummaryPanelDialog;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.SparkNavigationFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.RecommendPaymentInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.ShopMessageEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier.USSaveElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bnpl.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.deals.SeaPdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion.SeaPdpPromotionEntranceInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion.SeaPdpPromotionForUSHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.SeaPdpReviewHeadViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.skc.SeaPdpSkcVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SizeGuideFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.modelcard.USPdpSizeGuideViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight.SpotlightVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight.SpotlightVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuBodyReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header.SeaSkuPanelTopOutsideWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECLatamOspFlowOpt;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addaddress.UsAddAddressVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.UsEmptyAddressVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticdistrict.USLogisticSelectByDistrictVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipto.USShipToBarVH;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AjS60S0100000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            case 37:
                LIZ$37(this, view);
                break;
            case 38:
                LIZ$38(this, view);
                break;
            case 39:
                LIZ$39(this, view);
                break;
            case 40:
                LIZ$40(this, view);
                break;
            case 41:
                LIZ$41(this, view);
                break;
            case 42:
                LIZ$42(this, view);
                break;
            case 43:
                LIZ$43(this, view);
                break;
            case 44:
                LIZ$44(this, view);
                break;
            case 45:
                LIZ$45(this, view);
                break;
            case 46:
                LIZ$46(this, view);
                break;
            case 47:
                LIZ$47(this, view);
                break;
            case 48:
                LIZ$48(this, view);
                break;
            case 49:
                LIZ$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                LIZ$50(this, view);
                break;
            case 51:
                LIZ$51(this, view);
                break;
            case 52:
                LIZ$52(this, view);
                break;
            case 53:
                LIZ$53(this, view);
                break;
            case 54:
                LIZ$54(this, view);
                break;
            case 55:
                LIZ$55(this, view);
                break;
            case 56:
                LIZ$56(this, view);
                break;
            case 57:
                LIZ$57(this, view);
                break;
            case 58:
                LIZ$58(this, view);
                break;
            case 59:
                LIZ$59(this, view);
                break;
            case 60:
                LIZ$60(this, view);
                break;
            case 61:
                LIZ$61(this, view);
                break;
            case BaseNotice.CREATOR /* 62 */:
                LIZ$62(this, view);
                break;
            case 63:
                LIZ$63(this, view);
                break;
            case 64:
                LIZ$64(this, view);
                break;
            case 65:
                LIZ$65(this, view);
                break;
            case 66:
                LIZ$66(this, view);
                break;
            case 67:
                LIZ$67(this, view);
                break;
            case 68:
                LIZ$68(this, view);
                break;
            case 69:
                LIZ$69(this, view);
                break;
            case 70:
                LIZ$70(this, view);
                break;
            case 71:
                LIZ$71(this, view);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                LIZ$72(this, view);
                break;
            case 73:
                LIZ$73(this, view);
                break;
            case 74:
                LIZ$74(this, view);
                break;
            case 75:
                LIZ$75(this, view);
                break;
            case 76:
                LIZ$76(this, view);
                break;
            case 77:
                LIZ$77(this, view);
                break;
            case 78:
                LIZ$78(this, view);
                break;
            case 79:
                LIZ$79(this, view);
                break;
            case 80:
                LIZ$80(this, view);
                break;
            case 81:
                LIZ$81(this, view);
                break;
            case 82:
                LIZ$82(this, view);
                break;
            case 83:
                LIZ$83(this, view);
                break;
            case 84:
                LIZ$84(this, view);
                break;
            case 85:
                LIZ$85(this, view);
                break;
            case 86:
                LIZ$86(this, view);
                break;
            case 87:
                LIZ$87(this, view);
                break;
            case 88:
                LIZ$88(this, view);
                break;
            case 89:
                LIZ$89(this, view);
                break;
            case 90:
                LIZ$90(this, view);
                break;
            case 91:
                LIZ$91(this, view);
                break;
            case 92:
                LIZ$92(this, view);
                break;
            case 93:
                LIZ$93(this, view);
                break;
            case 94:
                LIZ$94(this, view);
                break;
            case 95:
                LIZ$95(this, view);
                break;
            case 96:
                LIZ$96(this, view);
                break;
            case 97:
                LIZ$97(this, view);
                break;
            case 98:
                LIZ$98(this, view);
                break;
            case 99:
                LIZ$99(this, view);
                break;
            case 100:
                LIZ$100(this, view);
                break;
            case 101:
                LIZ$101(this, view);
                break;
            case 102:
                LIZ$102(this, view);
                break;
            case 103:
                LIZ$103(this, view);
                break;
            case 104:
                LIZ$104(this, view);
                break;
            case 105:
                LIZ$105(this, view);
                break;
            case 106:
                LIZ$106(this, view);
                break;
            case 107:
                LIZ$107(this, view);
                break;
            case 108:
                LIZ$108(this, view);
                break;
            case 109:
                LIZ$109(this, view);
                break;
            case 110:
                LIZ$110(this, view);
                break;
            case 111:
                LIZ$111(this, view);
                break;
            case 112:
                LIZ$112(this, view);
                break;
            case 113:
                LIZ$113(this, view);
                break;
            case 114:
                LIZ$114(this, view);
                break;
            case 115:
                LIZ$115(this, view);
                break;
            case 116:
                LIZ$116(this, view);
                break;
            case 117:
                LIZ$117(this, view);
                break;
            case 118:
                LIZ$118(this, view);
                break;
            case 119:
                LIZ$119(this, view);
                break;
            case 120:
                LIZ$120(this, view);
                break;
            case 121:
                LIZ$121(this, view);
                break;
            case 122:
                LIZ$122(this, view);
                break;
            case 123:
                LIZ$123(this, view);
                break;
            case 124:
                LIZ$124(this, view);
                break;
            case 125:
                LIZ$125(this, view);
                break;
            case 126:
                LIZ$126(this, view);
                break;
            case 127:
                LIZ$127(this, view);
                break;
            case 128:
                LIZ$128(this, view);
                break;
            case 129:
                LIZ$129(this, view);
                break;
            case 130:
                LIZ$130(this, view);
                break;
            case 131:
                LIZ$131(this, view);
                break;
            case 132:
                LIZ$132(this, view);
                break;
            case 133:
                LIZ$133(this, view);
                break;
            case 134:
                LIZ$134(this, view);
                break;
            case 135:
                LIZ$135(this, view);
                break;
            case 136:
                LIZ$136(this, view);
                break;
            case 137:
                LIZ$137(this, view);
                break;
            case 138:
                LIZ$138(this, view);
                break;
            case 139:
                LIZ$139(this, view);
                break;
            case 140:
                LIZ$140(this, view);
                break;
            case 141:
                LIZ$141(this, view);
                break;
            case 142:
                LIZ$142(this, view);
                break;
            case 143:
                LIZ$143(this, view);
                break;
            case 144:
                LIZ$144(this, view);
                break;
            case 145:
                LIZ$145(this, view);
                break;
            case 146:
                LIZ$146(this, view);
                break;
            case 147:
                LIZ$147(this, view);
                break;
            case 148:
                LIZ$148(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS60S0100000_1(kotlin.jvm.functions.Function0 r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 1: goto Le;
                case 9: goto Le;
                case 26: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 700(0x2bc, double:3.46E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 300(0x12c, double:1.48E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS60S0100000_1.<init>(kotlin.jvm.functions.Function0, int):void");
    }

    public static final void LIZ$0(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ShipToBarHolder shipToBarHolder = (ShipToBarHolder) ajS60S0100000_1.l0;
            shipToBarHolder.withState((JediViewModel) shipToBarHolder.LLJILJILJ.getValue(), new AwS580S0100000_1((ShipToBarHolder) ajS60S0100000_1.l0, 6));
        }
    }

    public static final void LIZ$1(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$10(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0<Unit> function0;
        if (view != null && (function0 = ((C03BB) ajS60S0100000_1.l0).LLILLJJLI) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$100(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$101(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C939703lr c939703lr = (C939703lr) ajS60S0100000_1.l0;
            c939703lr.LLJILJILJ.invoke(c939703lr);
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            c118300cf2.element = ((C939703lr) ajS60S0100000_1.l0).LLILZIL;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "able_click";
            C939703lr c939703lr2 = (C939703lr) ajS60S0100000_1.l0;
            int i = c939703lr2.LLILZIL;
            if (i < c939703lr2.LLILZLL.LIZIZ) {
                c939703lr2.LLJIJIL.invoke(Integer.valueOf(i + 1), ((C939703lr) ajS60S0100000_1.l0).LLIZ);
                C939703lr c939703lr3 = (C939703lr) ajS60S0100000_1.l0;
                int i2 = c939703lr3.LLILZIL + 1;
                c118300cf.element = i2;
                c939703lr3.setQuantity(i2);
            } else {
                c939703lr2.LIZ("add_num");
                c118300cf.element = ((C939703lr) ajS60S0100000_1.l0).LLILZIL;
                c259800zU.element = "unable_click";
            }
            C1748720vbi.LIZIZ((C939703lr) ajS60S0100000_1.l0, new C049Y(), new AwS100S0400000_1((C939703lr) ajS60S0100000_1.l0, (C939703lr) c118300cf2, c118300cf, (C118300cf) c259800zU, (C259800zU<String>) 25));
        }
    }

    public static final void LIZ$102(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C939703lr c939703lr = (C939703lr) ajS60S0100000_1.l0;
            c939703lr.LLJILJILJ.invoke(c939703lr);
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            C939703lr c939703lr2 = (C939703lr) ajS60S0100000_1.l0;
            int i = c939703lr2.LLILZIL;
            c118300cf2.element = i;
            if (i > c939703lr2.LLILZLL.LIZ) {
                c939703lr2.LLJIJIL.invoke(Integer.valueOf(i - 1), ((C939703lr) ajS60S0100000_1.l0).LLIZ);
                C939703lr c939703lr3 = (C939703lr) ajS60S0100000_1.l0;
                int i2 = c939703lr3.LLILZIL - 1;
                c118300cf.element = i2;
                c939703lr3.setQuantity(i2);
            } else {
                c939703lr2.LIZIZ("minus_num");
                c118300cf.element = ((C939703lr) ajS60S0100000_1.l0).LLILZIL;
            }
            C1748720vbi.LIZIZ((C939703lr) ajS60S0100000_1.l0, new C049Y(), new AwS210S0300000_1((C939703lr) ajS60S0100000_1.l0, c118300cf2, c118300cf, 82));
            ((C939703lr) ajS60S0100000_1.l0).LLILZIL = c118300cf.element;
        }
    }

    public static final void LIZ$103(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C939603lq c939603lq = (C939603lq) ajS60S0100000_1.l0;
            c939603lq.LLJILLL.invoke(c939603lq);
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            c118300cf2.element = ((C939603lq) ajS60S0100000_1.l0).LLILZLL;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "able_click";
            C939603lq c939603lq2 = (C939603lq) ajS60S0100000_1.l0;
            int i = c939603lq2.LLILZLL;
            if (i < c939603lq2.LLIZ.LIZIZ) {
                c939603lq2.LLJILJIL.invoke(Integer.valueOf(i + 1), ((C939603lq) ajS60S0100000_1.l0).LLIZLLLIL);
                C939603lq c939603lq3 = (C939603lq) ajS60S0100000_1.l0;
                int i2 = c939603lq3.LLILZLL + 1;
                c118300cf.element = i2;
                c939603lq3.setQuantity(i2);
            } else {
                c939603lq2.LIZ("add_num");
                c118300cf.element = ((C939603lq) ajS60S0100000_1.l0).LLILZLL;
                c259800zU.element = "unable_click";
            }
            C1748720vbi.LIZIZ((C939603lq) ajS60S0100000_1.l0, new C049Y(), new AwS100S0400000_1((C939603lq) ajS60S0100000_1.l0, (C939603lq) c118300cf2, c118300cf, (C118300cf) c259800zU, (C259800zU<String>) 26));
        }
    }

    public static final void LIZ$104(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C939603lq c939603lq = (C939603lq) ajS60S0100000_1.l0;
            c939603lq.LLJILLL.invoke(c939603lq);
            C118300cf c118300cf = new C118300cf();
            C118300cf c118300cf2 = new C118300cf();
            c118300cf2.element = ((C939603lq) ajS60S0100000_1.l0).LLILZLL;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "able_click";
            C939603lq c939603lq2 = (C939603lq) ajS60S0100000_1.l0;
            int i = c939603lq2.LLILZLL;
            if (i > c939603lq2.LLIZ.LIZ) {
                c939603lq2.LLJILJIL.invoke(Integer.valueOf(i - 1), ((C939603lq) ajS60S0100000_1.l0).LLIZLLLIL);
                C939603lq c939603lq3 = (C939603lq) ajS60S0100000_1.l0;
                int i2 = c939603lq3.LLILZLL - 1;
                c118300cf.element = i2;
                c939603lq3.setQuantity(i2);
            } else {
                c939603lq2.LIZIZ("minus_num");
                c118300cf.element = ((C939603lq) ajS60S0100000_1.l0).LLILZLL;
                c259800zU.element = "unable_click";
            }
            C1748720vbi.LIZIZ((C939603lq) ajS60S0100000_1.l0, new C049Y(), new AwS100S0400000_1((C939603lq) ajS60S0100000_1.l0, (C939603lq) c118300cf2, c118300cf, (C118300cf) c259800zU, (C259800zU<String>) 27));
            ((C939603lq) ajS60S0100000_1.l0).LLILZLL = c118300cf.element;
        }
    }

    public static final void LIZ$105(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C197039127h c197039127h = ((AddressListAssem) ajS60S0100000_1.l0).LLJJIJIIJIL;
            if (c197039127h == null) {
                c197039127h = null;
            }
            if (c197039127h.isEnabled()) {
                AddressListAssem addressListAssem = (AddressListAssem) ajS60S0100000_1.l0;
                addressListAssem.withState(addressListAssem.Go(), new AwS580S0100000_1((AddressListAssem) ajS60S0100000_1.l0, 773));
            }
        }
    }

    public static final void LIZ$106(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$107(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function1<Boolean, Unit> summaryHandler;
        int i;
        if (view != null && (summaryHandler = ((DirectCheckoutBottomWidget) ajS60S0100000_1.l0).getSummaryHandler()) != null) {
            summaryHandler.invoke(Boolean.valueOf(!((DirectCheckoutBottomWidget) ajS60S0100000_1.l0).getUpDownIconExpand()));
            DirectCheckoutBottomWidget directCheckoutBottomWidget = (DirectCheckoutBottomWidget) ajS60S0100000_1.l0;
            boolean z = !directCheckoutBottomWidget.getUpDownIconExpand();
            directCheckoutBottomWidget.LLIZ = z;
            if (z) {
                i = R.raw.icon_chevron_down_thin;
            } else {
                i = R.raw.icon_chevron_up_thin;
            }
            TuxIconView upDownIconView = directCheckoutBottomWidget.getUpDownIconView();
            if (upDownIconView != null) {
                upDownIconView.setIconRes(i);
            }
        }
    }

    public static final void LIZ$108(AjS60S0100000_1 ajS60S0100000_1, View view) {
        FragmentManager supportFragmentManager;
        CreditInfo creditInfoLJIJJLI;
        PaymentMethodsData paymentMethodsData;
        String str;
        double dDoubleValue;
        PaymentMethodsData paymentMethodsData2;
        C03WH paymentLogger;
        if (view != null) {
            PaymentMethod paymentMethod = ((h) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod != null && (paymentLogger = ((h) ajS60S0100000_1.l0).getPaymentLogger()) != null) {
                paymentLogger.LJI(paymentMethod);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((h) ajS60S0100000_1.l0).getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                BalanceDetailFragment balanceDetailFragment = new BalanceDetailFragment();
                PaymentViewModel paymentViewModel = ((h) ajS60S0100000_1.l0).getPaymentViewModel();
                PopupInfo popupInfo = null;
                if (paymentViewModel == null || (paymentMethodsData2 = paymentViewModel.LLJJIJIL) == null || (creditInfoLJIJJLI = paymentMethodsData2.creditInfo) == null) {
                    PaymentViewModel paymentViewModel2 = ((h) ajS60S0100000_1.l0).getPaymentViewModel();
                    if (paymentViewModel2 != null && (paymentMethodsData = paymentViewModel2.LLJJIJIL) != null) {
                        PaymentMethod paymentMethod2 = ((h) ajS60S0100000_1.l0).getPaymentMethod();
                        if (paymentMethod2 != null) {
                            str = paymentMethod2.id;
                        } else {
                            str = null;
                        }
                        creditInfoLJIJJLI = paymentMethodsData.LJIJJLI(str);
                    } else {
                        creditInfoLJIJJLI = null;
                    }
                }
                balanceDetailFragment.LLIZLLLIL = creditInfoLJIJJLI;
                balanceDetailFragment.LLJ = true;
                PaymentMethod paymentMethod3 = ((h) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod3 != null) {
                    popupInfo = paymentMethod3.popupInfo;
                }
                balanceDetailFragment.LLJI = popupInfo;
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = balanceDetailFragment;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJIIIIZZ(1);
                double dLIZ = C497820Jfg.LIZ(((h) ajS60S0100000_1.l0).getContext());
                Double d = PipoPaymentEnableVnBalanceSettings.LIZ().sheetHeight;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.6d;
                }
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = (int) (dLIZ * dDoubleValue);
                tuxSheet2.show(supportFragmentManager, "BalanceDetailFragment");
            }
        }
    }

    public static final void LIZ$109(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJ((View) ajS60S0100000_1.l0, C343970De7.LIZ);
        }
    }

    public static final void LIZ$11(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$110(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        C03WH c03wh;
        String strLJJIIZ;
        BindInfo bindInfo;
        if (view != null) {
            PaymentMethod paymentMethod = ((h) ajS60S0100000_1.l0).getPaymentMethod();
            String str2 = null;
            if (paymentMethod != null && (bindInfo = paymentMethod.bindInfo) != null) {
                str = bindInfo.buttonText;
            } else {
                str = null;
            }
            if (!C770702zh.LIZ(str)) {
                h hVar = (h) ajS60S0100000_1.l0;
                boolean z = !hVar.getSwitchChecked();
                if ((hVar.getSwitchButtonFromXml().getVisibility() == 0 || hVar.getSwitchButtonTokoFromXml().getVisibility() == 0) && (c03wh = hVar.LLJLL) != null) {
                    PaymentMethod paymentMethod2 = hVar.LLLIIII;
                    if (paymentMethod2 != null) {
                        strLJJIIZ = paymentMethod2.LJJIIZ();
                    } else {
                        strLJJIIZ = null;
                    }
                    c03wh.LJJ(hVar.LLLIIII, strLJJIIZ, z);
                }
                Function1<String, Unit> onCheckedListener = ((h) ajS60S0100000_1.l0).getOnCheckedListener();
                PaymentMethod paymentMethod3 = ((h) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod3 != null) {
                    str2 = paymentMethod3.id;
                }
                onCheckedListener.invoke(str2);
            }
        }
    }

    public static final void LIZ$111(AjS60S0100000_1 ajS60S0100000_1, View view) {
        DialogContent dialogContent;
        String str;
        PaymentViewModel paymentViewModel;
        C817603Hi c817603Hi;
        PaymentMethod paymentMethod;
        ExceptionUX exceptionUX;
        String strLJJIIZ;
        Object obj;
        Availability availability;
        ExceptionUX exceptionUX2;
        if (view != null) {
            PaymentMethod paymentMethod2 = ((h) ajS60S0100000_1.l0).getPaymentMethod();
            String strLIZJ = null;
            if (paymentMethod2 != null && (exceptionUX2 = paymentMethod2.exceptionUX) != null) {
                dialogContent = exceptionUX2.dialogContent;
            } else {
                dialogContent = null;
            }
            h hVar = (h) ajS60S0100000_1.l0;
            PaymentMethod paymentMethod3 = hVar.LLLIIII;
            if (paymentMethod3 != null && (availability = paymentMethod3.availability) != null) {
                str = availability.statusCode;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "24") && (paymentMethod = hVar.LLLIIII) != null && (exceptionUX = paymentMethod.exceptionUX) != null && exceptionUX.dialogContent != null && dialogContent != null) {
                PaymentViewModel paymentViewModel2 = ((h) ajS60S0100000_1.l0).getPaymentViewModel();
                if (paymentViewModel2 != null) {
                    paymentViewModel2.setState(new AwS367S0200000_1(dialogContent, (DialogContent) new AwS545S0100000_1((h) ajS60S0100000_1.l0, 1669), (Function0<Unit>) 101));
                }
                PaymentMethod paymentMethod4 = ((h) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod4 != null) {
                    strLJJIIZ = paymentMethod4.LJJIIZ();
                } else {
                    strLJJIIZ = null;
                }
                HashMap<String, Object> trackParams = ((h) ajS60S0100000_1.l0).getTrackParams();
                if (trackParams != null) {
                    obj = trackParams.get("previous_page");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    strLIZJ = (String) obj;
                }
                C03WD.LJ("account_security_guarantee", strLJJIIZ, null, null, strLIZJ, null, null, 108);
                return;
            }
            PaymentMethod paymentMethod5 = ((h) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod5 == null || (paymentViewModel = ((h) ajS60S0100000_1.l0).getPaymentViewModel()) == null) {
                return;
            }
            Context context = ((h) ajS60S0100000_1.l0).getContext();
            C03WH paymentLogger = ((h) ajS60S0100000_1.l0).getPaymentLogger();
            HashMap<String, Object> trackParams2 = ((h) ajS60S0100000_1.l0).getTrackParams();
            PaymentViewModel paymentViewModel3 = ((h) ajS60S0100000_1.l0).getPaymentViewModel();
            if (paymentViewModel3 != null && (c817603Hi = paymentViewModel3.LLJJLIIIJLLLLLLLZ) != null) {
                strLIZJ = c817603Hi.LIZJ("c97860.d39979", null);
            }
            paymentViewModel.GR2(paymentMethod5, context, paymentLogger, trackParams2, strLIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$112(g1c.AjS60S0100000_1 r16, android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS60S0100000_1.LIZ$112(g1c.AjS60S0100000_1, android.view.View):void");
    }

    public static final void LIZ$113(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1073204Hq.LIZIZ(((PdpShopReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL, view, "shop_review_entrance", "shop_review_entrance", 2, null, ((PdpShopReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ(), null, 208);
        }
    }

    public static final void LIZ$114(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1073204Hq.LIZIZ(((PdpShopReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL, view, "shop_review_entrance", "other", 2, null, ((PdpShopReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ(), null, 208);
        }
    }

    public static final void LIZ$115(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1073204Hq.LIZIZ(((PdpShopReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL, view, "shop_review_entrance", "other", 2, null, ((PdpShopReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ(), null, 208);
        }
    }

    public static final void LIZ$116(AjS60S0100000_1 ajS60S0100000_1, View view) {
        View.OnClickListener onClickListener;
        if (view != null && (onClickListener = (View.OnClickListener) ajS60S0100000_1.l0) != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void LIZ$117(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((AbstractC7925037r) ajS60S0100000_1.l0).getClickListener$ecommerce_transaction_release().invoke("other");
        }
    }

    public static final void LIZ$118(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((C03DY) ajS60S0100000_1.l0).getClickListener$ecommerce_transaction_release().invoke("view_more_protections");
        }
    }

    public static final void LIZ$119(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((C03DY) ajS60S0100000_1.l0).getClickListener$ecommerce_transaction_release().invoke("view_more_protections");
        }
    }

    public static final void LIZ$12(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$120(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null && !((SeaOneStepAddressAssem) ajS60S0100000_1.l0).op()) {
            if (((SeaOneStepAddressAssem) ajS60S0100000_1.l0).kp().LLJILJIL) {
                ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).kp().EQ2(false);
                return;
            }
            Context context = ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).getContext();
            if (context != null) {
                SeaOneStepAddressAssem seaOneStepAddressAssem = (SeaOneStepAddressAssem) ajS60S0100000_1.l0;
                seaOneStepAddressAssem.sp(context, 0, seaOneStepAddressAssem.LLJJIJIL, seaOneStepAddressAssem.LLJJIJIIJIL);
            }
            ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).up();
        }
    }

    public static final void LIZ$121(AjS60S0100000_1 ajS60S0100000_1, View view) {
        View view2;
        if (view != null && !((SeaOneStepAddressAssem) ajS60S0100000_1.l0).op()) {
            if (((SeaOneStepAddressAssem) ajS60S0100000_1.l0).kp().LLJILJIL) {
                ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).kp().EQ2(false);
                return;
            }
            AssemVMLazy assemVMLazy = ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SeaOneStepAddressAssem.LLJJJ;
            OspAddressViewModel ospAddressViewModel = (OspAddressViewModel) assemVMLazy.getValue();
            Fragment fragmentLJI = C724240Sb0.LJI((SeaOneStepAddressAssem) ajS60S0100000_1.l0);
            if (fragmentLJI != null) {
                view2 = fragmentLJI.getView();
            } else {
                view2 = null;
            }
            OspAddressViewModel.wQ2(ospAddressViewModel, view2, null, null, ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).mp(), EnumC818803Hu.ADD_ADDRESS_CLICK_ADD.getValue(), null, Boolean.TRUE, 38);
            ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).up();
        }
    }

    public static final void LIZ$122(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        String str2;
        if (view != null) {
            ((USSameShippingAddressElementViewHolder) ajS60S0100000_1.l0).L5().setChecked(!((USSameShippingAddressElementViewHolder) ajS60S0100000_1.l0).L5().isChecked());
            AssemVMLazy assemVMLazy = ((USSameShippingAddressElementViewHolder) ajS60S0100000_1.l0).LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USSameShippingAddressElementViewHolder.LLILZ;
            ((CCDCAddCardViewModel) assemVMLazy.getValue()).aR2(((USSameShippingAddressElementViewHolder) ajS60S0100000_1.l0).L5().isChecked());
            if (((USSameShippingAddressElementViewHolder) ajS60S0100000_1.l0).L5().isChecked()) {
                str = "select";
            } else {
                str = "cancel";
            }
            C890103dr c890103dr = C890103dr.LIZ;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("button_type", str);
            if (((USSameShippingAddressElementViewHolder) ajS60S0100000_1.l0).L5().isChecked()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "1";
            }
            pairArr[1] = new Pair("button_status", str2);
            C890103dr.LJFF(c890103dr, "use_shipping_address", C2097608Jq.LJI(pairArr), null, null, null, null, null, 124);
        }
    }

    public static final void LIZ$123(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C03WH c03wh = ((RecommendPaymentInfoViewHolder) ajS60S0100000_1.l0).f6().LLJI;
            if (c03wh != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(c03wh.LIZ);
                linkedHashMap.put("module_name", "payment_method");
                C03WH.LJJII("tiktokec_module_click", linkedHashMap);
            }
            PaymentViewModel paymentViewModelF6 = ((RecommendPaymentInfoViewHolder) ajS60S0100000_1.l0).f6();
            Context context = ((RecommendPaymentInfoViewHolder) ajS60S0100000_1.l0).itemView.getContext();
            paymentViewModelF6.getClass();
            paymentViewModelF6.withState(new AwS367S0200000_1(paymentViewModelF6, context, 110));
        }
    }

    public static final void LIZ$124(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Object obj;
        String string;
        String str;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (view != null) {
            SpotlightVH spotlightVH = (SpotlightVH) ajS60S0100000_1.l0;
            SpotlightVO spotlightVOX5 = spotlightVH.X5();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) spotlightVH.LLJJJIL.getValue()).LLJI;
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.remove("page_name");
            linkedHashMap.put("previous_page", "product_detail");
            IPdpStarter.PdpEnterParam pdpEnterParam2 = ((PdpViewModel) spotlightVH.LLJJJIL.getValue()).LLJI;
            if (pdpEnterParam2 == null || (map = pdpEnterParam2.trackParams) == null || (obj = map.get("source_page_type")) == null) {
                obj = "unknown";
            }
            linkedHashMap.put("show_window_source", obj);
            SelfOperatedSloganInfo selfOperatedSloganInfo = spotlightVOX5.selfOperatedSloganInfo;
            if (selfOperatedSloganInfo != null && (str = selfOperatedSloganInfo.schema) != null) {
                string = C919503ib.LIZJ(str, C2097608Jq.LJIIIIZZ(new Pair("enter_from", ((PdpViewModel) spotlightVH.LLJJJIL.getValue()).HR2()), new Pair("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap)))).build().toString();
            } else {
                string = null;
            }
            SmartRouter.buildRoute(spotlightVH.itemView.getContext(), string).open();
            C1748720vbi.LIZLLL(spotlightVH.c6(), new C10516049i(), AFwS228S0000000_1.get$arr$(766));
        }
    }

    public static final void LIZ$125(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null && ((SeaOneStepProductInfoAssem) ajS60S0100000_1.l0).hp().LLJILJIL) {
            ((SeaOneStepProductInfoAssem) ajS60S0100000_1.l0).hp().EQ2(false);
        }
    }

    public static final void LIZ$126(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$127(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SeaShopProfileVH) ajS60S0100000_1.l0).C6("benefit_bar", "pdp_shop_benefit_bar_mall");
        }
    }

    public static final void LIZ$128(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SeaShopProfileVH) ajS60S0100000_1.l0).C6("benefit_bar", "pdp_shop_benefit_bar_star");
        }
    }

    public static final void LIZ$129(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaShopProfileVH seaShopProfileVH = (SeaShopProfileVH) ajS60S0100000_1.l0;
            int i = SeaShopProfileVH.LLLFFI;
            seaShopProfileVH.C6("head", "showcase_detail");
        }
    }

    public static final void LIZ$13(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$130(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaShopProfileVH seaShopProfileVH = (SeaShopProfileVH) ajS60S0100000_1.l0;
            int i = SeaShopProfileVH.LLLFFI;
            seaShopProfileVH.C6("visit", "showcase_detail");
        }
    }

    public static final void LIZ$131(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Activity activity;
        if (view != null) {
            Context context = ((UsAddAddressVH) ajS60S0100000_1.l0).itemView.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                ((InterfaceC975703rf) ((UsAddAddressVH) ajS60S0100000_1.l0).LLJILLL.getValue()).e81(activity, C1748730vbj.LIZ(view), "c7035.d1458", null);
            }
        }
    }

    public static final void LIZ$132(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function1<? super String, Unit> function1;
        if (view != null && (function1 = ((C951303nj) ajS60S0100000_1.l0).LLJI) != null) {
            function1.invoke("head");
        }
    }

    public static final void LIZ$133(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function1<? super String, Unit> function1;
        if (view != null && (function1 = ((C951303nj) ajS60S0100000_1.l0).LLJI) != null) {
            function1.invoke("visit");
        }
    }

    public static final void LIZ$134(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZIZ(((UsSkuVH) ajS60S0100000_1.l0).LLJJIJIL, new C049Y(), new AwS580S0100000_1((UsSkuVH) ajS60S0100000_1.l0, 922));
            PdpViewModel.iS2(((UsSkuVH) ajS60S0100000_1.l0).e6(), ((UsSkuVH) ajS60S0100000_1.l0).LLJJIJIL.getView(), 0, new C1077704Jj((UsSkuVH) ajS60S0100000_1.l0, 13), true, null, null, false, null, null, 1008);
        }
    }

    public static final void LIZ$135(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Activity activity;
        int size;
        int iIntValue;
        Integer num;
        List<ReachableAddress> list;
        if (view != null) {
            Context context = ((com.ss.android.ugc.aweme.ecommerce.us.logistic.module.UsAddAddressVH) ajS60S0100000_1.l0).itemView.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
                if (interfaceC1748810vbrLIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLIZ, new C049Y(), AFwS228S0000000_1.get$arr$(856));
                }
                DeliveryData deliveryData = ((AddressSelectViewModel) ((com.ss.android.ugc.aweme.ecommerce.us.logistic.module.UsAddAddressVH) ajS60S0100000_1.l0).LLJILJIL.getValue()).LLIZ;
                if (deliveryData != null && (list = deliveryData.addresses) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                DeliveryData deliveryData2 = ((AddressSelectViewModel) ((com.ss.android.ugc.aweme.ecommerce.us.logistic.module.UsAddAddressVH) ajS60S0100000_1.l0).LLJILJIL.getValue()).LLIZ;
                if (deliveryData2 != null && (num = deliveryData2.addressThreshold) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 20;
                }
                if (size >= iIntValue) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIJ(activity.getString(2131832690));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                AddressSelectViewModel.iR2((AddressSelectViewModel) ((com.ss.android.ugc.aweme.ecommerce.us.logistic.module.UsAddAddressVH) ajS60S0100000_1.l0).LLJILJIL.getValue(), activity, C1748730vbj.LIZ(view), null, 56);
            }
        }
    }

    public static final void LIZ$136(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (interfaceC1748810vbrLIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLIZ, new C049Y(), AFwS228S0000000_1.get$arr$(858));
            }
            AddressSelectViewModel.iR2((AddressSelectViewModel) ((UsEmptyAddressVH) ajS60S0100000_1.l0).LLJILJIL.getValue(), ((UsEmptyAddressVH) ajS60S0100000_1.l0).itemView.getContext(), C1748730vbj.LIZ(view), null, 56);
        }
    }

    public static final void LIZ$137(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaSkuPanelViewModel seaSkuPanelViewModelLJII = ((SeaSkuPanelTopOutsideWidget) ajS60S0100000_1.l0).LJII();
            seaSkuPanelViewModelLJII.getClass();
            seaSkuPanelViewModelLJII.LJJJZ(AFwS228S0000000_1.get$arr$(358));
        }
    }

    public static final void LIZ$138(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            AddressSelectFragment addressSelectFragment = (AddressSelectFragment) ajS60S0100000_1.l0;
            addressSelectFragment.withState(addressSelectFragment.WR(), new AwS580S0100000_1((AddressSelectFragment) ajS60S0100000_1.l0, 963));
        }
    }

    public static final void LIZ$139(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((AddressSelectFragment) ajS60S0100000_1.l0).UR().nR2(EnumC966703qD.PUSH_AREA_PAGE, ((AddressSelectFragment) ajS60S0100000_1.l0).WR().LLJJIII.LIZJ("c3002.d0892", null));
            Set<String> set = C03FA.LIZ;
            ((AddressSelectFragment) ajS60S0100000_1.l0).getClass();
            C03FA.LIZLLL("select_location", "next", null, null, null, null, "choose_your_location", null);
        }
    }

    public static final void LIZ$14(AjS60S0100000_1 ajS60S0100000_1, View view) {
        TuxSheet tuxSheet;
        if (view != null && (tuxSheet = ((ZipCodePickerDialogFragment) ajS60S0100000_1.l0).LLILZLL) != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void LIZ$140(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            AddressSelectFragment addressSelectFragment = (AddressSelectFragment) ajS60S0100000_1.l0;
            addressSelectFragment.withState(addressSelectFragment.WR(), new AwS580S0100000_1((AddressSelectFragment) ajS60S0100000_1.l0, 965));
        }
    }

    public static final void LIZ$141(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1054004Ag c1054004Ag = ((PdpHeadNavBarWidget) ajS60S0100000_1.l0).LJIJI().LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                C1054004Ag.LJIILIIL(c1054004Ag, "close", null, null, null, 30);
            }
            PdpViewModel pdpViewModelLJIJI = ((PdpHeadNavBarWidget) ajS60S0100000_1.l0).LJIJI();
            pdpViewModelLJIJI.getClass();
            pdpViewModelLJIJI.setStateImmediate(new AwS16S0001000_1(0, 26));
            AnonymousClass0378.LIZ().LIZ("ec_back_from_review", "{}");
        }
    }

    public static final void LIZ$142(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            Set<String> set = C03FA.LIZ;
            C03FA.LJII("tiktokec_button_click", null, null, C03FA.LIZIZ("save_pickup_point", ((SeaPudoFragment) ajS60S0100000_1.l0).bS().sR2()), null, false, 54);
            SeaPudoFragment seaPudoFragment = (SeaPudoFragment) ajS60S0100000_1.l0;
            seaPudoFragment.withState(seaPudoFragment.bS(), new AwS580S0100000_1((SeaPudoFragment) ajS60S0100000_1.l0, LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    public static final void LIZ$143(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            DeliveryPanelViewModel deliveryPanelViewModelDS = ((LogisticSelectFragment) ajS60S0100000_1.l0).dS();
            deliveryPanelViewModelDS.getClass();
            deliveryPanelViewModelDS.withState(new AwS580S0100000_1(deliveryPanelViewModelDS, 376));
            LogisticSelectFragment logisticSelectFragment = (LogisticSelectFragment) ajS60S0100000_1.l0;
            logisticSelectFragment.withState(logisticSelectFragment.dS(), new AwS580S0100000_1((LogisticSelectFragment) ajS60S0100000_1.l0, 998));
            Set<String> set = C03FA.LIZ;
            C03FA.LJFF(((LogisticSelectFragment) ajS60S0100000_1.l0).dS().LLJILJIL, "confirm", null, 4);
        }
    }

    public static final void LIZ$144(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZIZ((CombinedSkuOrderSubmitFragment) ajS60S0100000_1.l0, new C049Y(), AFwS228S0000000_1.get$arr$(910));
            ((CombinedSkuOrderSubmitFragment) ajS60S0100000_1.l0).VR().LLJZ = "return";
            if (!((CombinedSkuOrderSubmitFragment) ajS60S0100000_1.l0).WR()) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF((CombinedSkuOrderSubmitFragment) ajS60S0100000_1.l0, C343970De7.LIZ);
            }
        }
    }

    public static final void LIZ$145(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            if (((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0).aS().LLJILJIL) {
                ((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0).aS().EQ2(false);
            } else if (((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0).bS().getState().LLILZLL) {
                ((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0).bS().jT2();
            } else {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0, C343970De7.LIZ);
            }
        }
    }

    public static final void LIZ$146(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null && ((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0).aS().LLJILJIL) {
            ((SeaOneStepOrderSubmitFragment) ajS60S0100000_1.l0).aS().EQ2(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$147(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        if (view != null) {
            USLogisticSelectByDistrictVH uSLogisticSelectByDistrictVH = (USLogisticSelectByDistrictVH) ajS60S0100000_1.l0;
            uSLogisticSelectByDistrictVH.getClass();
            C259800zU c259800zU = new C259800zU();
            DeliveryPanelStarter.EnterParam enterParam = uSLogisticSelectByDistrictVH.X5().LLILZIL;
            T tLJ = 0;
            Integer numValueOf = null;
            if (enterParam != null) {
                str = enterParam.productId;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                DeliveryPanelStarter.EnterParam enterParam2 = uSLogisticSelectByDistrictVH.X5().LLILZIL;
                if (enterParam2 != null) {
                    str2 = enterParam2.productId;
                } else {
                    str2 = null;
                }
                DeliveryPanelStarter.EnterParam enterParam3 = uSLogisticSelectByDistrictVH.X5().LLILZIL;
                if (enterParam3 != null) {
                    str3 = enterParam3.skuId;
                } else {
                    str3 = null;
                }
                DeliveryPanelStarter.EnterParam enterParam4 = uSLogisticSelectByDistrictVH.X5().LLILZIL;
                if (enterParam4 != null) {
                    numValueOf = Integer.valueOf(enterParam4.quantity);
                }
                DeliveryPanelStarter.EnterParam enterParam5 = uSLogisticSelectByDistrictVH.X5().LLILZIL;
                if (enterParam5 == null || (str4 = enterParam5.selectedDeliveryTypeId) == null) {
                    str4 = "";
                }
                tLJ = C1697810uHb.LJ(new OrderSKUDTO(str2, str3, numValueOf, null, 0, null, null, null, null, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
            }
            c259800zU.element = tLJ;
            uSLogisticSelectByDistrictVH.withState(uSLogisticSelectByDistrictVH.X5(), new AwS367S0200000_1(uSLogisticSelectByDistrictVH, (USLogisticSelectByDistrictVH) c259800zU, (C259800zU<ArrayList<OrderSKUDTO>>) 382));
        }
    }

    public static final void LIZ$148(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((PdpPaymentModuleViewHolder) ajS60S0100000_1.l0).e6();
            C1748720vbi.LIZLLL(((PdpPaymentModuleViewHolder) ajS60S0100000_1.l0).itemView, new C10516049i(), new AwS580S0100000_1((PdpPaymentModuleViewHolder) ajS60S0100000_1.l0, 1118));
            C1748720vbi.LIZLLL(((PdpPaymentModuleViewHolder) ajS60S0100000_1.l0).itemView, new C048L(), new AwS580S0100000_1((PdpPaymentModuleViewHolder) ajS60S0100000_1.l0, 1119));
        }
    }

    public static final void LIZ$15(AjS60S0100000_1 ajS60S0100000_1, View view) {
        MiniOspBottomWidget miniOspBottomWidget;
        View viewLJJIJL;
        if (view != null && (viewLJJIJL = (miniOspBottomWidget = (MiniOspBottomWidget) ajS60S0100000_1.l0).LJJIJL()) != null) {
            miniOspBottomWidget.withState(miniOspBottomWidget.kp(), new AwS367S0200000_1(miniOspBottomWidget, viewLJJIJL, 254));
        }
    }

    public static final void LIZ$16(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            PaymentInfoCell2 paymentInfoCell2 = (PaymentInfoCell2) ajS60S0100000_1.l0;
            PaymentInfoCell2.W5(paymentInfoCell2, paymentInfoCell2.itemView.getContext(), view, false, 12);
            C03O0.LJJJLZIJ(C03O0.LIZ, "add_new_payment", ((PaymentInfoCell2) ajS60S0100000_1.l0).V5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1047804);
        }
    }

    public static final void LIZ$17(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null && !((SeaOneStepAddressAssem) ajS60S0100000_1.l0).op()) {
            if (((SeaOneStepAddressAssem) ajS60S0100000_1.l0).kp().LLJILJIL) {
                ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).kp().EQ2(false);
                return;
            }
            Context context = ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).getContext();
            if (context != null) {
                SeaOneStepAddressAssem seaOneStepAddressAssem = (SeaOneStepAddressAssem) ajS60S0100000_1.l0;
                seaOneStepAddressAssem.sp(context, 1, seaOneStepAddressAssem.LLJJIJIL, seaOneStepAddressAssem.LLJJIJIIJIL);
            }
            ((SeaOneStepAddressAssem) ajS60S0100000_1.l0).up();
        }
    }

    public static final void LIZ$18(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null && ((SeaOneStepProductInfoAssem) ajS60S0100000_1.l0).hp().LLJILJIL) {
            ((SeaOneStepProductInfoAssem) ajS60S0100000_1.l0).hp().EQ2(false);
        }
    }

    public static final void LIZ$19(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SeaOneStepTopOutSideAssem) ajS60S0100000_1.l0).B6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1054104Ah c1054104Ah = ((SeaPdpCouponsViewHolder) ajS60S0100000_1.l0).e6().LLJLIL;
            if (c1054104Ah != null) {
                c1054104Ah.LJIJ(((C736702uD) ((SeaPdpCouponsViewHolder) ajS60S0100000_1.l0).LLILLJJLI).LJ);
            }
            SeaPdpCouponsViewHolder seaPdpCouponsViewHolder = (SeaPdpCouponsViewHolder) ajS60S0100000_1.l0;
            seaPdpCouponsViewHolder.e6().LLLLLJIL.LIZJ(seaPdpCouponsViewHolder.itemView.getContext(), ((C736702uD) seaPdpCouponsViewHolder.LLILLJJLI).LIZJ, null, "discounts_module");
        }
    }

    public static final void LIZ$20(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SeaOneStepSummaryFragment) ajS60S0100000_1.l0).VR().jT2();
            C03O0.LJJJJLL(C03O0.LIZ, "close", null, ((SeaOneStepSummaryFragment) ajS60S0100000_1.l0).VR().hi1(false), "order_summary", null, null, null, null, null, null, null, null, null, "order_submit", null, null, null, null, null, null, null, null, ((SeaOneStepSummaryFragment) ajS60S0100000_1.l0).VR().LLLZLZ.LIZ("c35430.d0"), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -537001998, 8388607);
        }
    }

    public static final void LIZ$21(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            USPaymentInfoCell uSPaymentInfoCell = (USPaymentInfoCell) ajS60S0100000_1.l0;
            C1748720vbi.LIZLLL(uSPaymentInfoCell.itemView, new C049Y(), new AwS580S0100000_1(uSPaymentInfoCell, 492));
            USPaymentInfoCell uSPaymentInfoCell2 = (USPaymentInfoCell) ajS60S0100000_1.l0;
            uSPaymentInfoCell2.W5(uSPaymentInfoCell2.itemView.getContext());
            C03O0.LJJJLZIJ(C03O0.LIZ, "view_all_payment", ((USPaymentInfoCell) ajS60S0100000_1.l0).T5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, null, ((USPaymentInfoCell) ajS60S0100000_1.l0).T5().LR2(), ((USPaymentInfoCell) ajS60S0100000_1.l0).T5().LLLILZLLLI, 262140);
            List<String> list = ((USPaymentInfoCell) ajS60S0100000_1.l0).T5().LLLIIL;
            if (list != null) {
                ((ArrayList) list).add("view_all_payments");
            }
        }
    }

    public static final void LIZ$22(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(view, new C049Y(), AFwS228S0000000_1.get$arr$(121));
            ((USHalfPageOrderSummaryFragment) ajS60S0100000_1.l0).gS().LLZLLIL = "";
            C03LU c03lu = ((USHalfPageOrderSummaryFragment) ajS60S0100000_1.l0).gS().LLLL;
            if (c03lu != null && !((USHalfPageOrderSummaryFragment) ajS60S0100000_1.l0).gS().LLLZ) {
                c03lu.LIZ(C03LW.COMBINED_SKU_SUMMARY);
            }
            ((USHalfPageOrderSummaryFragment) ajS60S0100000_1.l0).LLILLJJLI.invoke();
        }
    }

    public static final void LIZ$23(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$24(AjS60S0100000_1 ajS60S0100000_1, View view) {
        int i;
        EnumC865603Zu enumC865603Zu;
        UserTrustItem userTrustItem;
        String str;
        if (view != null) {
            Bundle bundle = new Bundle();
            PaymentMethodsData paymentMethodsData = ((PaymentFragment) ajS60S0100000_1.l0).LLJJJJLIIL.paymentData;
            if (paymentMethodsData != null && (userTrustItem = paymentMethodsData.securePayment) != null && (str = userTrustItem.title) != null) {
                C786410Ut5.LJJJI("title", str, bundle);
            }
            if (((PaymentFragment) ajS60S0100000_1.l0).yS().LLILZLL == null) {
                i = 0;
            } else {
                i = 1;
            }
            bundle.putInt("with_delivery_info", i);
            C960603pE.LJFF(bundle, view, null);
            C19EG activity = ((PaymentFragment) ajS60S0100000_1.l0).getActivity();
            if (activity != null) {
                boolean z = ((PaymentFragment) ajS60S0100000_1.l0).LLJJJJLIIL.LJ;
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                EnterParams enterParams = ((PaymentFragment) ajS60S0100000_1.l0).LLJJJJLIIL;
                PaymentMethodsData paymentMethodsData2 = enterParams.paymentData;
                HashMap<String, Object> map = enterParams.trackParams;
                if (enterParams.LJ) {
                    enumC865603Zu = EnumC865603Zu.HEIGHT_73;
                } else {
                    enumC865603Zu = EnumC865603Zu.HEIGHT_90;
                }
                C882503cd.LIZ(supportFragmentManager, bundle, paymentMethodsData2, map, enumC865603Zu, z, !z);
            }
        }
    }

    public static final void LIZ$25(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((PaymentFragment) ajS60S0100000_1.l0).aS().performClick();
        }
    }

    public static final void LIZ$26(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$27(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            PaymentViewModel paymentViewModelYS = ((PaymentFragment) ajS60S0100000_1.l0).yS();
            paymentViewModelYS.getClass();
            paymentViewModelYS.setState(AFwS228S0000000_1.get$arr$(212));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$28(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        if (view != null) {
            SeaPdpPromotionEntranceInfoViewHolder seaPdpPromotionEntranceInfoViewHolder = (SeaPdpPromotionEntranceInfoViewHolder) ajS60S0100000_1.l0;
            Integer num = ((C04GD) seaPdpPromotionEntranceInfoViewHolder.LLILLJJLI).LIZ;
            if (num != null && num.intValue() == 6) {
                str = "promotion";
            } else {
                str = "unKnown";
            }
            C1748720vbi.LIZLLL(seaPdpPromotionEntranceInfoViewHolder.itemView, new C10516049i(), new AwS86S1200000_1(seaPdpPromotionEntranceInfoViewHolder, view, str, 25));
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("trackParams", C2097608Jq.LJI(new Pair("entrance_info", ((SeaPdpViewModel) ((SeaPdpPromotionEntranceInfoViewHolder) ajS60S0100000_1.l0).LLJJJ.getValue()).PR2()), new Pair("previous_page", "product_detail"), new Pair("product_id", ((SeaPdpViewModel) ((SeaPdpPromotionEntranceInfoViewHolder) ajS60S0100000_1.l0).LLJJJ.getValue()).getProductId()))));
            C04GO c04go = ((SeaPdpViewModel) ((SeaPdpPromotionEntranceInfoViewHolder) ajS60S0100000_1.l0).LLJJJ.getValue()).LLLLLJIL;
            SeaPdpPromotionEntranceInfoViewHolder seaPdpPromotionEntranceInfoViewHolder2 = (SeaPdpPromotionEntranceInfoViewHolder) ajS60S0100000_1.l0;
            Context context = seaPdpPromotionEntranceInfoViewHolder2.LLJJIJIL;
            String str2 = ((C04GD) seaPdpPromotionEntranceInfoViewHolder2.LLILLJJLI).LIZIZ;
            c04go.getClass();
            if (str2 != null) {
                C919503ib.LIZIZ(context, str2, mapLIZJ, false).open();
            }
        }
    }

    public static final void LIZ$29(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaPdpViewModel seaPdpViewModelC6 = ((SeaPdpSkcVH) ajS60S0100000_1.l0).c6();
            SeaPdpSkcVH seaPdpSkcVH = (SeaPdpSkcVH) ajS60S0100000_1.l0;
            SeaPdpViewModel.sS2(seaPdpViewModelC6, seaPdpSkcVH.itemView, 0, new C1077704Jj(seaPdpSkcVH, 3), true, null, null, false, false, null, null, null, null, null, null, null, 32752);
            C1748720vbi.LIZLLL(((SeaPdpSkcVH) ajS60S0100000_1.l0).LLJJJIL, new C049Y(), AFwS228S0000000_1.get$arr$(327));
        }
    }

    public static final void LIZ$3(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((C03ZB) ajS60S0100000_1.l0).getOnViewMoreInstallmentPlansClickListener().invoke();
        }
    }

    public static final void LIZ$30(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SkuBodyReusedAssem) ajS60S0100000_1.l0).getViewModel().SQ2(((SkuBodyReusedAssem) ajS60S0100000_1.l0).tp());
        }
    }

    public static final void LIZ$31(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL((LinearLayout) ajS60S0100000_1.l0, new C10516049i(), AFwS228S0000000_1.get$arr$(350));
        }
    }

    public static final void LIZ$32(AjS60S0100000_1 ajS60S0100000_1, View view) {
        SeaSkuPanelFragment seaSkuPanelFragment;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil;
        Object objH2;
        InputMethodManager inputMethodManager;
        if (view != null && (keyBoardVisibilityUtil = (seaSkuPanelFragment = (SeaSkuPanelFragment) ajS60S0100000_1.l0).LLJJJIL) != null) {
            if (keyBoardVisibilityUtil.LLILZ) {
                Context context = seaSkuPanelFragment.getContext();
                IBinder windowToken = null;
                if (context != null) {
                    objH2 = C786410Ut5.H2(context, "input_method");
                } else {
                    objH2 = null;
                }
                if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                    View view2 = ((SeaSkuPanelFragment) ajS60S0100000_1.l0).getView();
                    if (view2 != null) {
                        windowToken = view2.getWindowToken();
                    }
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                    IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                    if (iEventCenter != null) {
                        iEventCenter.LIZ("ec_sku_panel_keyboard_show", C1741890vQh.LJIIIIZZ(new SkuPanelStarter.SkuKeyboardVisibilityParams(false, 0)));
                        return;
                    }
                    return;
                }
                return;
            }
            seaSkuPanelFragment.dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$33(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaSkuPanelViewModel seaSkuPanelViewModelLJII = ((SeaSkuPanelTopOutsideWidget) ajS60S0100000_1.l0).LJII();
            seaSkuPanelViewModelLJII.getClass();
            seaSkuPanelViewModelLJII.LJJJZ(AFwS228S0000000_1.get$arr$(358));
        }
    }

    public static final void LIZ$34(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C939703lr c939703lr;
        C719102rN c719102rN;
        SkuCardStyleInfo skuCardStyleInfo;
        String str;
        if (view != null && (c719102rN = (c939703lr = (C939703lr) ajS60S0100000_1.l0).LLJJI) != null && (skuCardStyleInfo = c719102rN.LLJJJIL) != null && (str = skuCardStyleInfo.editBundleQuantityToast) != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(c939703lr);
            c1389880mGw.LJIIIZ(str);
            c1389880mGw.LJIIJ();
        }
    }

    public static final void LIZ$35(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C939603lq c939603lq;
        C719102rN c719102rN;
        SkuCardStyleInfo skuCardStyleInfo;
        String str;
        if (view != null && (c719102rN = (c939603lq = (C939603lq) ajS60S0100000_1.l0).LLJJIII) != null && (skuCardStyleInfo = c719102rN.LLJJJIL) != null && (str = skuCardStyleInfo.editBundleQuantityToast) != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(c939603lq);
            c1389880mGw.LJIIIZ(str);
            c1389880mGw.LJIIJ();
        }
    }

    public static final void LIZ$36(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C04H0 c04h0;
        if (view != null && (c04h0 = ((C1070804Gs) ajS60S0100000_1.l0).LLJ) != null) {
            c04h0.LIZ();
        }
    }

    public static final void LIZ$37(AjS60S0100000_1 ajS60S0100000_1, View view) {
        ProductPackStruct productPackStruct;
        SellerInfo sellerInfo;
        Object obj;
        Map<String, Object> map;
        Map<String, Object> map2;
        if (view != null && (productPackStruct = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().LLJIJIL) != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
            String str = sellerInfo.shopLink;
            if (str != null && !a0.LJJJIL(str)) {
                SeaPdpViewModel seaPdpViewModelLJIIIIZZ = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ();
                Context context = view.getContext();
                Float fLJIIIIZZ = null;
                String strLJII = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().LLLLL.LJII("c3256.d5700", sellerInfo.shopLink, null);
                String str2 = sellerInfo.sellerId;
                String str3 = sellerInfo.rating;
                if (str3 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str3);
                }
                SeaPdpViewModel.ZR2(seaPdpViewModelLJIIIIZZ, context, strLJII, str2, fLJIIIIZZ, "shop_icon", null, ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().Tg2(), null, null, null, null, null, null, null, null, "c3256.d5700", null, 982912);
                if (((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().jS2()) {
                    AnonymousClass0378.LIZ().LIZ("ec_seller_shop_icon_click", "{}");
                    return;
                }
                return;
            }
            String str4 = sellerInfo.link;
            if (str4 == null || a0.LJJJIL(str4)) {
                return;
            }
            String str5 = sellerInfo.link;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("enter_from", ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().NR2());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().LLIZ;
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.remove("page_name");
            linkedHashMap.put("previous_page", "product_detail");
            IPdpStarter.PdpEnterParam pdpEnterParam2 = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().LLIZ;
            if (pdpEnterParam2 == null || (map = pdpEnterParam2.trackParams) == null || (obj = map.get("source_page_type")) == null) {
                obj = "unknown";
            }
            linkedHashMap.put("show_window_source", obj);
            pairArr[1] = new Pair("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap));
            SmartRouter.buildRoute(view.getContext(), C919503ib.LIZJ(str5, C2097608Jq.LJIIIIZZ(pairArr)).build().toString()).open();
            C1054104Ah c1054104Ah = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah != null) {
                C1054104Ah.LJJI(c1054104Ah, "show_window", null, null, null, null, 30);
            }
            C1054104Ah c1054104Ah2 = ((SeaPdpBottomNavBarWidgetNew) ajS60S0100000_1.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah2 == null) {
                return;
            }
            c1054104Ah2.LJIILIIL = true;
        }
    }

    public static final void LIZ$38(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaPdpViewModel seaPdpViewModelLJIL = ((SeaPdpHeadNavBarWidget) ajS60S0100000_1.l0).LJIL();
            seaPdpViewModelLJIL.getClass();
            seaPdpViewModelLJIL.setStateImmediate(new AwS16S0001000_1(0, 23));
            AnonymousClass0378.LIZ().LIZ("ec_back_from_review", "{}");
        }
    }

    public static final void LIZ$39(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            USShipToBarVH uSShipToBarVH = (USShipToBarVH) ajS60S0100000_1.l0;
            uSShipToBarVH.withState((JediViewModel) uSShipToBarVH.LLJJIJI.getValue(), new AwS580S0100000_1((USShipToBarVH) ajS60S0100000_1.l0, 373));
        }
    }

    public static final void LIZ$4(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((C03ZB) ajS60S0100000_1.l0).getOnViewMoreSubPaymentsClickListener().invoke();
        }
    }

    public static final void LIZ$40(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "add"), new Pair("button_type", "shipping_address"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
            ((AuctionAddressCell) ajS60S0100000_1.l0).N5().BQ2(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$41(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        String str;
        TitleTips titleTips;
        if (view != null && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
            C1026103zn c1026103zn = (C1026103zn) ((AuctionPaymentCell) ajS60S0100000_1.l0).getItem();
            if (c1026103zn == null || (titleTips = c1026103zn.LLIZ) == null || (str = titleTips.explanationUrl) == null) {
                str = "";
            }
            sparkNavigationFragment.LLILLL = str;
            sparkNavigationFragment.LLILZIL = true;
            sparkNavigationFragment.LLILZ = view.getContext().getString(2131821576);
            sparkNavigationFragment.LLILZLL = false;
            C882703cf.LIZ(supportFragmentManager, sparkNavigationFragment, null, null, true, 12);
        }
    }

    public static final void LIZ$42(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "add"), new Pair("button_type", "payment_method"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
            ((AuctionPaymentCell) ajS60S0100000_1.l0).N5().BQ2(null);
        }
    }

    public static final void LIZ$43(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "arrow"), new Pair("button_type", "rfc_curp_info"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
            AssemVMLazy assemVMLazy = ((AuctionTaxRouteCell) ajS60S0100000_1.l0).LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AuctionTaxRouteCell.LLJJIII;
            ((AuctionAddressPayVM) assemVMLazy.getValue()).AQ2(C1388190mED.LIZIZ(view.getContext()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static final void LIZ$44(AjS60S0100000_1 ajS60S0100000_1, View view) {
        ?? r0;
        if (view != null && (r0 = ((C997203v8) ajS60S0100000_1.l0).LLILZLL) != 0) {
            r0.invoke(view);
        }
    }

    public static final void LIZ$45(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SkuPanelAssem) ajS60S0100000_1.l0).Ho().smoothScrollToPosition(0);
        }
    }

    public static final void LIZ$46(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaUserRightHolder seaUserRightHolder = (SeaUserRightHolder) ajS60S0100000_1.l0;
            String strLIZLLL = C960603pE.LIZLLL(view);
            seaUserRightHolder.getClass();
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
            C948503nH.LJIIIIZZ(seaUserRightHolder.LLJJIJIL, new C955503oP(seaUserRightHolder, C452501pT.LIZIZ(new AwS270S0300000_26(seaUserRightHolder, c19719912DlLIZ, c19719912DlLIZ, 116)), strLIZLLL, null));
        }
    }

    public static final void LIZ$47(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((SizeGuideFragment) ajS60S0100000_1.l0, C343970De7.LIZ);
        }
    }

    public static final void LIZ$48(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function1) ajS60S0100000_1.l0).invoke(Boolean.TRUE);
        }
    }

    public static final void LIZ$49(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function1) ajS60S0100000_1.l0).invoke(Boolean.valueOf(ECLatamOspFlowOpt.LJFF()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$5(g1c.AjS60S0100000_1 r7, android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS60S0100000_1.LIZ$5(g1c.AjS60S0100000_1, android.view.View):void");
    }

    public static final void LIZ$50(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function1) ajS60S0100000_1.l0).invoke(Boolean.valueOf(ECLatamOspFlowOpt.LJFF()));
        }
    }

    public static final void LIZ$51(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ATMCardViewModel aTMCardViewModelHo = ((ATMCardAssem) ajS60S0100000_1.l0).Ho();
            View viewFindViewById = null;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aTMCardViewModelHo), null, null, new C895003ee(aTMCardViewModelHo, ((C888303dZ) ((ATMCardAssem) ajS60S0100000_1.l0).LLJILJIL.getValue()).LLILZIL, null), 3);
            ATMCardAssem aTMCardAssem = (ATMCardAssem) ajS60S0100000_1.l0;
            View view2 = aTMCardAssem.LLJI;
            if (view2 == null) {
                View viewLJJIJL = aTMCardAssem.LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.fz3);
                }
                aTMCardAssem.LLJI = viewFindViewById;
                view2 = viewFindViewById;
            }
            view2.requestFocus();
        }
    }

    public static final void LIZ$52(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String strLJJIIZ;
        if (view != null) {
            if (((C03ZC) ajS60S0100000_1.l0).getSwitchChecked()) {
                C03ZC c03zc = (C03ZC) ajS60S0100000_1.l0;
                if (c03zc.getSwitchButtonFromXml().getVisibility() == 0 || c03zc.getSwitchButtonTokoFromXml().getVisibility() == 0) {
                    C03O0 c03o0 = C03O0.LIZ;
                    PaymentMethod paymentMethod = c03zc.LLLIIIIL;
                    if (paymentMethod != null) {
                        strLJJIIZ = paymentMethod.LJJIIZ();
                    } else {
                        strLJJIIZ = null;
                    }
                    PaymentMethod paymentMethod2 = c03zc.LLLIIIIL;
                    c03o0.getClass();
                    C03O0.LJLLJ(paymentMethod2, strLJJIIZ);
                }
            }
            ((C03ZC) ajS60S0100000_1.l0).getOnCheckedListener().invoke();
        }
    }

    public static final void LIZ$53(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            USPaymentInfoCell uSPaymentInfoCell = (USPaymentInfoCell) ajS60S0100000_1.l0;
            uSPaymentInfoCell.W5(uSPaymentInfoCell.itemView.getContext());
            C03O0.LJJJLZIJ(C03O0.LIZ, "add_new_payment", ((USPaymentInfoCell) ajS60S0100000_1.l0).T5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1047804);
        }
    }

    public static final void LIZ$54(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            USPaymentInfoCell uSPaymentInfoCell = (USPaymentInfoCell) ajS60S0100000_1.l0;
            uSPaymentInfoCell.W5(uSPaymentInfoCell.itemView.getContext());
            C03O0.LJJJLZIJ(C03O0.LIZ, "add_new_payment", ((USPaymentInfoCell) ajS60S0100000_1.l0).T5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1047804);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZ$55(AjS60S0100000_1 ajS60S0100000_1, View view) {
        FragmentManager supportFragmentManager;
        CreditInfo creditInfoLJIJJLI;
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData;
        BillInfoData billInfoData2;
        PaymentMethodsData paymentMethodsData2;
        if (view != null) {
            PaymentMethod paymentMethod = ((C03ZC) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod != null) {
                C03O0.LIZ.getClass();
                C03O0.LJJIIJ(paymentMethod);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03ZC) ajS60S0100000_1.l0).getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                BalanceDetailFragment balanceDetailFragment = new BalanceDetailFragment();
                OrderSubmitAssemViewModel ospAssemViewModel = ((C03ZC) ajS60S0100000_1.l0).getOspAssemViewModel();
                if (ospAssemViewModel == null || (billInfoData2 = ospAssemViewModel.LLJJI) == null || (paymentMethodsData2 = billInfoData2.paymentMethods) == null || (creditInfoLJIJJLI = paymentMethodsData2.creditInfo) == null) {
                    OrderSubmitAssemViewModel ospAssemViewModel2 = ((C03ZC) ajS60S0100000_1.l0).getOspAssemViewModel();
                    creditInfoLJIJJLI = null;
                    String str = null;
                    creditInfoLJIJJLI = null;
                    creditInfoLJIJJLI = null;
                    if (ospAssemViewModel2 != null && (billInfoData = ospAssemViewModel2.LLJJI) != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                        PaymentMethod paymentMethod2 = ((C03ZC) ajS60S0100000_1.l0).getPaymentMethod();
                        if (paymentMethod2 != null) {
                            str = paymentMethod2.id;
                        }
                        creditInfoLJIJJLI = paymentMethodsData.LJIJJLI(str);
                    }
                }
                balanceDetailFragment.LLIZLLLIL = creditInfoLJIJJLI;
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = balanceDetailFragment;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJIIIIZZ(1);
                int iLIZ = (int) (((double) C497820Jfg.LIZ(((C03ZC) ajS60S0100000_1.l0).getContext())) * 0.73d);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = iLIZ;
                tuxSheet2.show(supportFragmentManager, "BalanceDetailFragment");
            }
        }
    }

    public static final void LIZ$56(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C03ZC c03zc = (C03ZC) ajS60S0100000_1.l0;
            c03zc.LIZJ(c03zc.getBtnSaveFromXml().isChecked(), Boolean.TRUE);
        }
    }

    public static final void LIZ$57(AjS60S0100000_1 ajS60S0100000_1, View view) {
        PaymentMethod paymentMethod;
        C19EG c19egLIZIZ;
        OrderSubmitAssemViewModel ospAssemViewModel;
        PaymentInfoViewModel paymentInfoViewModel;
        String str;
        if (view != null && (paymentMethod = ((C03ZC) ajS60S0100000_1.l0).getPaymentMethod()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(((C03ZC) ajS60S0100000_1.l0).getContext())) != null && (ospAssemViewModel = ((C03ZC) ajS60S0100000_1.l0).getOspAssemViewModel()) != null && (paymentInfoViewModel = ((C03ZC) ajS60S0100000_1.l0).getPaymentInfoViewModel()) != null) {
            Context context = ((C03ZC) ajS60S0100000_1.l0).getContext();
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            PaymentMethod paymentMethod2 = ((C03ZC) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod2 != null) {
                str = paymentMethod2.halfScreenTitle;
            } else {
                str = null;
            }
            PaymentInfoViewModel.BQ2(paymentInfoViewModel, context, paymentMethod, supportFragmentManager, ospAssemViewModel, new C927003jo(new C927303jr(10, null, Integer.valueOf(R.raw.icon_x_mark_small), str), true, false, 8), EnumC865603Zu.HEIGHT_73, null, 128);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$58(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C04GO c04go = ((SeaPdpPromotionForUSHolder) ajS60S0100000_1.l0).d6().LLLLLJIL;
            Context context = ((SeaPdpPromotionForUSHolder) ajS60S0100000_1.l0).itemView.getContext();
            ITEM item = ((SeaPdpPromotionForUSHolder) ajS60S0100000_1.l0).LLILLJJLI;
            c04go.LIZLLL(context, ((C1056204Bc) item).LL.schema, new C04GW(((C1056204Bc) item).LL), "product");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$59(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C04GO c04go = ((SeaPdpPromotionForUSHolder) ajS60S0100000_1.l0).d6().LLLLLJIL;
            Context context = ((SeaPdpPromotionForUSHolder) ajS60S0100000_1.l0).itemView.getContext();
            ITEM item = ((SeaPdpPromotionForUSHolder) ajS60S0100000_1.l0).LLILLJJLI;
            c04go.LIZLLL(context, ((C1056204Bc) item).LL.schema, new C04GW(((C1056204Bc) item).LL), "product");
        }
    }

    public static final void LIZ$6(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            C03ZB c03zb = (C03ZB) ajS60S0100000_1.l0;
            c03zb.LJI(c03zb.getBtnSaveFromXml().isChecked(), Boolean.TRUE);
        }
    }

    public static final void LIZ$60(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0<Unit> function0;
        if (view != null && (function0 = ((C1006103wZ) ajS60S0100000_1.l0).LLILZIL) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$61(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$62(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$63(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$64(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            SeaSkuPanelFragment seaSkuPanelFragment = (SeaSkuPanelFragment) ajS60S0100000_1.l0;
            seaSkuPanelFragment.withState(seaSkuPanelFragment.dS(), new AwS580S0100000_1((SeaSkuPanelFragment) ajS60S0100000_1.l0, 512));
        }
    }

    public static final void LIZ$65(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SeaSkuPanelFragment) ajS60S0100000_1.l0).dS().pR2((SeaSkuPanelFragment) ajS60S0100000_1.l0);
        }
    }

    public static final void LIZ$66(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        BindInfo bindInfo;
        if (view != null) {
            PaymentMethod paymentMethod = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            String str2 = null;
            if (paymentMethod != null && (bindInfo = paymentMethod.bindInfo) != null) {
                str = bindInfo.buttonText;
            } else {
                str = null;
            }
            if (!C703302op.LIZ(str)) {
                Function1<String, Unit> onCheckedListener = ((C03Z4) ajS60S0100000_1.l0).getOnCheckedListener();
                PaymentMethod paymentMethod2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod2 != null) {
                    str2 = paymentMethod2.id;
                }
                onCheckedListener.invoke(str2);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZ$67(AjS60S0100000_1 ajS60S0100000_1, View view) {
        FragmentManager supportFragmentManager;
        CreditInfo creditInfoLJIJJLI;
        PaymentMethodsData paymentMethodsData;
        PaymentMethodsData paymentMethodsData2;
        C03WH paymentLogger;
        if (view != null) {
            PaymentMethod paymentMethod = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod != null && (paymentLogger = ((C03Z4) ajS60S0100000_1.l0).getPaymentLogger()) != null) {
                paymentLogger.LJI(paymentMethod);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03Z4) ajS60S0100000_1.l0).getContext());
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                BalanceDetailFragment balanceDetailFragment = new BalanceDetailFragment();
                PaymentViewModel paymentViewModel = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel();
                if (paymentViewModel == null || (paymentMethodsData2 = paymentViewModel.LLJJIJIL) == null || (creditInfoLJIJJLI = paymentMethodsData2.creditInfo) == null) {
                    PaymentViewModel paymentViewModel2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel();
                    creditInfoLJIJJLI = null;
                    String str = null;
                    creditInfoLJIJJLI = null;
                    if (paymentViewModel2 != null && (paymentMethodsData = paymentViewModel2.LLJJIJIL) != null) {
                        PaymentMethod paymentMethod2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                        if (paymentMethod2 != null) {
                            str = paymentMethod2.id;
                        }
                        creditInfoLJIJJLI = paymentMethodsData.LJIJJLI(str);
                    }
                }
                balanceDetailFragment.LLIZLLLIL = creditInfoLJIJJLI;
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = balanceDetailFragment;
                tuxSheet.LLJLL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJIIIIZZ(1);
                int iLIZ = (int) (((double) C497820Jfg.LIZ(((C03Z4) ajS60S0100000_1.l0).getContext())) * 0.73d);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = iLIZ;
                tuxSheet2.show(supportFragmentManager, "BalanceDetailFragment");
            }
        }
    }

    public static final void LIZ$68(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        String str2;
        CommuteType commuteType;
        String str3;
        String strLJJIIZ;
        String str4;
        String str5;
        BindInfo bindInfo;
        String strLIZ;
        String strLJ;
        String strLJJIIZ2;
        String str6;
        BindInfo bindInfo2;
        String str7;
        CommuteInfo commuteInfoLJII;
        BindInfo bindInfo3;
        if (view != null) {
            HashMap<String, Object> trackParams = ((C03Z4) ajS60S0100000_1.l0).getTrackParams();
            if (trackParams != null) {
                C1323720kYE.LIZ(((C03Z4) ajS60S0100000_1.l0).getContext()).LJIIIIZZ(C1741890vQh.LJIIIIZZ(trackParams), "payment_track_params");
            }
            PaymentMethod paymentMethod = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            InterfaceC1364105Vn interfaceC1364105Vn = null;
            str = null;
            String str8 = null;
            if (paymentMethod != null && (bindInfo3 = paymentMethod.bindInfo) != null) {
                str = bindInfo3.schema;
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.packageName;
            } else {
                str2 = null;
            }
            PaymentMethod paymentMethod3 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod3 != null && (commuteInfoLJII = paymentMethod3.LJII(false)) != null) {
                commuteType = commuteInfoLJII.commuteType;
            } else {
                commuteType = null;
            }
            PaymentMethod paymentMethod4 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod4 != null) {
                str3 = paymentMethod4.id;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, "pm_pi_ew_paypal_c_d")) {
                PaymentViewModel paymentViewModel = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel();
                if (paymentViewModel != null) {
                    ((C03Z4) ajS60S0100000_1.l0).LLJJIII.getContext();
                    PaymentMethod paymentMethod5 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                    paymentViewModel.setState(AFwS228S0000000_1.get$arr$(264));
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(paymentViewModel), C0PEM.LIZJ, null, new C876303bd(paymentViewModel, paymentMethod5, null), 2);
                    return;
                }
                return;
            }
            if (str != null && C703302op.LIZ(str)) {
                if (commuteType != null) {
                    strLIZ = C899503fN.LIZ(commuteType);
                } else {
                    strLIZ = null;
                }
                if (commuteType == CommuteType.INTERNAL_NATIVE) {
                    PaymentBindHelper paymentBindHelper = PaymentBindHelper.LIZ;
                    Context context = ((C03Z4) ajS60S0100000_1.l0).getContext();
                    String paySource = ((C03Z4) ajS60S0100000_1.l0).getPaySource();
                    PaymentMethod paymentMethod6 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                    if (paymentMethod6 != null) {
                        str7 = paymentMethod6.id;
                    } else {
                        str7 = null;
                    }
                    HashMap<String, Object> trackParams2 = ((C03Z4) ajS60S0100000_1.l0).getTrackParams();
                    paymentBindHelper.getClass();
                    PaymentBindHelper.LJ(context, paySource, str, trackParams2, null, str7, null, null, null);
                } else {
                    Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                    builderBuildUpon.appendQueryParameter("source", "payment_method");
                    if (strLIZ != null && strLIZ.length() != 0) {
                        builderBuildUpon.appendQueryParameter("commute_type", strLIZ);
                    }
                    PaymentMethod paymentMethod7 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                    if (paymentMethod7 != null) {
                        strLJ = paymentMethod7.LJ();
                        if (strLJ != null && strLJ.length() != 0) {
                            builderBuildUpon.appendQueryParameter("idempotency_key", strLJ);
                        }
                    } else {
                        strLJ = null;
                    }
                    PaymentViewModel paymentViewModel2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel();
                    if (paymentViewModel2 != null) {
                        C948503nH.LJFF(paymentViewModel2, C23271099x.INSTANCE, new C03Z5((C03Z4) ajS60S0100000_1.l0, strLJ, str2, builderBuildUpon, commuteType, null));
                    }
                }
                C03WH paymentLogger = ((C03Z4) ajS60S0100000_1.l0).getPaymentLogger();
                if (paymentLogger == null) {
                    return;
                }
                PaymentMethod paymentMethod8 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod8 != null) {
                    strLJJIIZ2 = paymentMethod8.LJJIIZ();
                } else {
                    strLJJIIZ2 = null;
                }
                PaymentMethod paymentMethod9 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod9 != null) {
                    str6 = paymentMethod9.extraInfo;
                } else {
                    str6 = null;
                }
                Boolean boolValueOf = Boolean.valueOf(C703302op.LIZ(str6));
                PaymentMethod paymentMethod10 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod10 != null && (bindInfo2 = paymentMethod10.bindInfo) != null) {
                    str8 = bindInfo2.bindStatus;
                }
                C03WH.LJ(paymentLogger, strLJJIIZ2, boolValueOf, str8, null, ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod(), null, 40);
                return;
            }
            C03WH paymentLogger2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentLogger();
            if (paymentLogger2 != null) {
                PaymentMethod paymentMethod11 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod11 != null) {
                    strLJJIIZ = paymentMethod11.LJJIIZ();
                } else {
                    strLJJIIZ = null;
                }
                PaymentMethod paymentMethod12 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod12 != null) {
                    str4 = paymentMethod12.extraInfo;
                } else {
                    str4 = null;
                }
                Boolean boolValueOf2 = Boolean.valueOf(C703302op.LIZ(str4));
                PaymentMethod paymentMethod13 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod13 != null && (bindInfo = paymentMethod13.bindInfo) != null) {
                    str5 = bindInfo.bindStatus;
                } else {
                    str5 = null;
                }
                interfaceC1364105Vn = null;
                C03WH.LJ(paymentLogger2, strLJJIIZ, boolValueOf2, str5, null, ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod(), null, 40);
            }
            PaymentViewModel paymentViewModel3 = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel();
            if (paymentViewModel3 == null) {
                return;
            }
            C948503nH.LJFF(paymentViewModel3, C23271099x.INSTANCE, new C03Z6((C03Z4) ajS60S0100000_1.l0, str2, commuteType, interfaceC1364105Vn));
        }
    }

    public static final void LIZ$69(AjS60S0100000_1 ajS60S0100000_1, View view) {
        PaymentViewModel paymentViewModel;
        FragmentManager supportFragmentManager;
        if (view != null) {
            PaymentViewModel paymentViewModel2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel();
            if (paymentViewModel2 != null) {
                PaymentViewModel.PR2(paymentViewModel2, ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod());
            }
            PaymentMethod paymentMethod = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
            if (paymentMethod != null && (paymentViewModel = ((C03Z4) ajS60S0100000_1.l0).getPaymentViewModel()) != null) {
                Context context = ((C03Z4) ajS60S0100000_1.l0).getContext();
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03Z4) ajS60S0100000_1.l0).getContext());
                String str = null;
                if (c19egLIZIZ != null) {
                    supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                } else {
                    supportFragmentManager = null;
                }
                PaymentMethod paymentMethod2 = ((C03Z4) ajS60S0100000_1.l0).getPaymentMethod();
                if (paymentMethod2 != null) {
                    str = paymentMethod2.halfScreenTitle;
                }
                paymentViewModel.KR2(context, paymentMethod, supportFragmentManager, new C927003jo(new C927303jr(8, Integer.valueOf(R.raw.icon_chevron_left_offset_ltr), Integer.valueOf(R.raw.icon_x_mark_small), str), true, false, 8), EnumC865603Zu.HEIGHT_73);
            }
        }
    }

    public static final void LIZ$7(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String strLJJIIZ;
        String str;
        String str2;
        if (view != null) {
            if (((C03ZB) ajS60S0100000_1.l0).getSwitchChecked()) {
                C03ZB c03zb = (C03ZB) ajS60S0100000_1.l0;
                boolean zLJFF = false;
                if (c03zb.getSwitchButtonFromXml().getVisibility() == 0 || c03zb.getSwitchButtonTokoFromXml().getVisibility() == 0) {
                    MiniOspViewModel miniOspViewModel = c03zb.LLLLLLLZIL;
                    String strLJJIIZ2 = null;
                    if (miniOspViewModel == null) {
                        C03O0 c03o0 = C03O0.LIZ;
                        PaymentMethod paymentMethod = c03zb.LLLLLLL;
                        if (paymentMethod != null) {
                            strLJJIIZ2 = paymentMethod.LJJIIZ();
                        }
                        PaymentMethod paymentMethod2 = c03zb.LLLLLLL;
                        c03o0.getClass();
                        C03O0.LJLLJ(paymentMethod2, strLJJIIZ2);
                    } else {
                        C03O1 c03o1 = miniOspViewModel.LLILZLL;
                        if (c03o1 != null) {
                            PaymentMethod paymentMethod3 = c03zb.LLLLLLL;
                            if (paymentMethod3 != null) {
                                strLJJIIZ = paymentMethod3.LJJIIZ();
                            } else {
                                strLJJIIZ = null;
                            }
                            PaymentMethod paymentMethod4 = c03zb.LLLLLLL;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(c03o1.LIZ);
                            linkedHashMap.put("page_name", "mini_order_submit");
                            if (strLJJIIZ == null) {
                                strLJJIIZ = "";
                            }
                            linkedHashMap.put("option_name", strLJJIIZ);
                            if (paymentMethod4 != null && (str2 = paymentMethod4.id) != null) {
                                linkedHashMap.put("payment_method_id", str2);
                            }
                            linkedHashMap.put("select_type", "close");
                            C03WI c03wi = c03o1.LJIILLIIL;
                            if (paymentMethod4 != null) {
                                str = paymentMethod4.id;
                                zLJFF = Intrinsics.LJFF(paymentMethod4.isChooseRecommend, Boolean.TRUE);
                            } else {
                                str = null;
                            }
                            c03wi.LIZ(linkedHashMap, new C03WJ(str, paymentMethod4, null, zLJFF), false, false, null, true);
                            C1018703yb.LIZIZ("tiktokec_select_option", linkedHashMap);
                        }
                    }
                }
            }
            ((C03ZB) ajS60S0100000_1.l0).getOnCheckedListener().invoke();
        }
    }

    public static final void LIZ$70(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0 function0;
        if (view != null && (function0 = (Function0) ajS60S0100000_1.l0) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$71(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Activity activity;
        if (view != null) {
            Context context = ((AddressAdapter$AddAddressBarHolder) ajS60S0100000_1.l0).itemView.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                ((InterfaceC975703rf) ((AddressAdapter$AddAddressBarHolder) ajS60S0100000_1.l0).LLJJ.getValue()).e81(activity, C1748730vbj.LIZ(view), "c7035.d1458", null);
            }
        }
    }

    public static final void LIZ$72(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C19EG activity;
        if (view != null) {
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
            if (!((AddressListPanelAssem) ajS60S0100000_1.l0).Lo().d41()) {
                Integer num = ((AddressListPanelAssem) ajS60S0100000_1.l0).Lo().LLJJIII;
                if (num != null && num.intValue() == 4) {
                    AddressListAssemViewModel addressListAssemViewModelLo = ((AddressListPanelAssem) ajS60S0100000_1.l0).Lo();
                    AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((AddressListPanelAssem) ajS60S0100000_1.l0, 1564);
                    Integer num2 = addressListAssemViewModelLo.LLJJIII;
                    if (num2 != null && num2.intValue() == 4) {
                        addressListAssemViewModelLo.ml(new AwS367S0200000_1(addressListAssemViewModelLo, awS545S0100000_1, 39));
                        return;
                    }
                    return;
                }
                AddressListPanelAssemFragment addressListPanelAssemFragmentHo = ((AddressListPanelAssem) ajS60S0100000_1.l0).Ho();
                if (addressListPanelAssemFragmentHo == null || (activity = addressListPanelAssemFragmentHo.getActivity()) == null) {
                    return;
                }
                ((AddressListPanelAssem) ajS60S0100000_1.l0).Lo().xQ2(activity, interfaceC1748810vbrLIZ, new AwS545S0100000_1((AddressListPanelAssem) ajS60S0100000_1.l0, 1566));
                return;
            }
            if (!((AddressListPanelAssem) ajS60S0100000_1.l0).Go().isEnabled()) {
                return;
            }
            AddressListPanelAssem addressListPanelAssem = (AddressListPanelAssem) ajS60S0100000_1.l0;
            addressListPanelAssem.withState(addressListPanelAssem.Lo(), new AwS580S0100000_1((AddressListPanelAssem) ajS60S0100000_1.l0, 531));
        }
    }

    public static final void LIZ$73(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$74(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((UserRightsCell) ajS60S0100000_1.l0).LLJIJIL.invoke();
        }
    }

    public static final void LIZ$75(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            USSaveElementViewHolder uSSaveElementViewHolder = (USSaveElementViewHolder) ajS60S0100000_1.l0;
            uSSaveElementViewHolder.W5(((CompoundButton) uSSaveElementViewHolder.itemView.findViewById(R.id.cme)).isChecked());
        }
    }

    public static final void LIZ$76(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((C10526049s) ajS60S0100000_1.l0).getClass();
        }
    }

    public static final void LIZ$77(AjS60S0100000_1 ajS60S0100000_1, View view) {
        InterfaceC1071504Gz interfaceC1071504Gz;
        if (view != null && (interfaceC1071504Gz = ((C1070804Gs) ajS60S0100000_1.l0).LLIZLLLIL) != null) {
            interfaceC1071504Gz.LIZ();
        }
    }

    public static final void LIZ$78(AjS60S0100000_1 ajS60S0100000_1, View view) {
        InterfaceC1071504Gz interfaceC1071504Gz;
        if (view != null && (interfaceC1071504Gz = ((C1070804Gs) ajS60S0100000_1.l0).LLIZLLLIL) != null) {
            interfaceC1071504Gz.LIZ();
        }
    }

    public static final void LIZ$79(AjS60S0100000_1 ajS60S0100000_1, View view) {
        InterfaceC1071504Gz interfaceC1071504Gz;
        if (view != null && (interfaceC1071504Gz = ((C1070804Gs) ajS60S0100000_1.l0).LLIZLLLIL) != null) {
            interfaceC1071504Gz.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$8(g1c.AjS60S0100000_1 r20, android.view.View r21) {
        /*
            r6 = r21
            if (r6 == 0) goto L86
            r1 = r20
            java.lang.Object r5 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r5
            android.view.View r4 = r5.itemView
            X.049Y r3 = new X.049Y
            r3.<init>()
            kotlin.jvm.internal.AwS580S0100000_1 r2 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 48
            r2.<init>(r5, r0)
            X.C1748720vbi.LIZLLL(r4, r3, r2)
            java.lang.Object r5 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r5
            android.view.View r0 = r5.itemView
            android.content.Context r4 = r0.getContext()
            X.03SE r0 = X.C03PI.LJIJI
            r0.getClass()
            boolean r0 = X.C037R.LIZ()
            r3 = 0
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r0.LLJJJ
            r2 = 1
            if (r0 == 0) goto L87
            boolean r0 = r0.LJI()
            if (r0 != r2) goto L87
        L44:
            r2 = 0
        L45:
            r0 = 4
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2.W5(r5, r4, r6, r2, r0)
            X.03O0 r4 = X.C03O0.LIZ
            java.lang.String r5 = "view_all_payment"
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            java.util.HashMap r6 = r0.hi1(r3)
            r7 = 0
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            java.lang.String r19 = r0.LR2()
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            java.lang.String r0 = r0.LLLILZLLLI
            r21 = 262140(0x3fffc, float:3.67336E-40)
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r20 = r0
            X.C03O0.LJJJLZIJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L86:
            return
        L87:
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2 r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            boolean r0 = r0.uS2()
            if (r0 == 0) goto L44
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "pipo_tts_osp_viewall_direct_pay"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)
            if (r0 == 0) goto L44
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS60S0100000_1.LIZ$8(g1c.AjS60S0100000_1, android.view.View):void");
    }

    public static final void LIZ$80(AjS60S0100000_1 ajS60S0100000_1, View view) {
        CommerceProductInfoView commerceProductInfoView;
        InterfaceC1071404Gy interfaceC1071404Gy;
        if (view != null && (interfaceC1071404Gy = (commerceProductInfoView = (CommerceProductInfoView) ajS60S0100000_1.l0).LLJJJ) != null) {
            interfaceC1071404Gy.LIZIZ(!commerceProductInfoView.LLJL);
        }
    }

    public static final void LIZ$81(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C04H1 c04h1;
        if (view != null && (c04h1 = ((CommerceProductInfoView) ajS60S0100000_1.l0).LLJJIJIL) != null) {
            c04h1.LIZ();
        }
    }

    public static final void LIZ$82(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((C10463047h) ajS60S0100000_1.l0).getClass();
        }
    }

    public static final void LIZ$83(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function0<Unit> function0;
        if (view != null && (function0 = ((C1007603wo) ajS60S0100000_1.l0).LLILZ) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$84(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            Function1<? super EnumC884003cs, Unit> function1 = ((CCDCSaveCardRetentionHalfFragment) ajS60S0100000_1.l0).LLILZLL;
            if (function1 != null) {
                function1.invoke(EnumC884003cs.CLICK_SAVE);
            }
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((CCDCSaveCardRetentionHalfFragment) ajS60S0100000_1.l0, C343970De7.LIZ);
        }
    }

    public static final void LIZ$85(AjS60S0100000_1 ajS60S0100000_1, View view) {
        int iIntValue;
        boolean z;
        PaymentMethodsData paymentMethodsData;
        EnumC865603Zu enumC865603Zu;
        PaymentMethodsData paymentMethodsData2;
        UserTrustItem userTrustItem;
        String str;
        if (view != null) {
            Bundle bundle = new Bundle();
            EnterParams enterParams = ((CCDCAddCardHalfFragment) ajS60S0100000_1.l0).LLJJIJIL;
            if (enterParams != null && (paymentMethodsData2 = enterParams.paymentData) != null && (userTrustItem = paymentMethodsData2.securePayment) != null && (str = userTrustItem.title) != null) {
                C786410Ut5.LJJJI("title", str, bundle);
            }
            C890103dr c890103dr = C890103dr.LIZ;
            c890103dr.getClass();
            Integer num = C890103dr.LJFF;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            bundle.putInt("with_delivery_info", iIntValue);
            String str2 = C890103dr.LJI;
            if (str2 == null) {
                str2 = "add";
            }
            C786410Ut5.LJJJI("fill_type", str2, bundle);
            HashMap<String, Object> map = null;
            C960603pE.LJFF(bundle, view, null);
            C19EG activity = ((CCDCAddCardHalfFragment) ajS60S0100000_1.l0).getActivity();
            if (activity != null) {
                EnterParams enterParams2 = ((CCDCAddCardHalfFragment) ajS60S0100000_1.l0).LLJJIJIL;
                if (enterParams2 != null && enterParams2.LJ) {
                    z = true;
                } else {
                    z = false;
                }
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                EnterParams enterParams3 = ((CCDCAddCardHalfFragment) ajS60S0100000_1.l0).LLJJIJIL;
                if (enterParams3 != null) {
                    paymentMethodsData = enterParams3.paymentData;
                    map = enterParams3.trackParams;
                } else {
                    paymentMethodsData = null;
                }
                if (z) {
                    enumC865603Zu = EnumC865603Zu.HEIGHT_73;
                } else {
                    enumC865603Zu = EnumC865603Zu.HEIGHT_90;
                }
                C882503cd.LIZ(supportFragmentManager, bundle, paymentMethodsData, map, enumC865603Zu, z, !z);
            }
            C890103dr.LJFF(c890103dr, "secure_payments", null, null, null, null, null, null, 126);
        }
    }

    public static final void LIZ$86(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            Function1<? super EnumC884003cs, Unit> function1 = ((CCDCSaveCardRetentionHalfFragment) ajS60S0100000_1.l0).LLILZLL;
            if (function1 != null) {
                function1.invoke(EnumC884003cs.CLICK_NO_THANKS);
            }
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((CCDCSaveCardRetentionHalfFragment) ajS60S0100000_1.l0, C343970De7.LIZ);
        }
    }

    public static final void LIZ$87(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            CCDCAddCardAssem cCDCAddCardAssem = (CCDCAddCardAssem) ajS60S0100000_1.l0;
            CCDCAddCardAssem.ap(cCDCAddCardAssem, cCDCAddCardAssem.Lo());
        }
    }

    public static final void LIZ$88(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            CCDCAddCardAssem.ap((CCDCAddCardAssem) ajS60S0100000_1.l0, "pay_now");
        }
    }

    public static final void LIZ$89(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SubPaymentListAssem) ajS60S0100000_1.l0).Ho().setText("");
            ((SubPaymentListAssem) ajS60S0100000_1.l0).Ho().clearFocus();
            C1744700vVE.LIZJ(((SubPaymentListAssem) ajS60S0100000_1.l0).Ho());
            SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) ajS60S0100000_1.l0;
            subPaymentListAssem.withState(subPaymentListAssem.So(), new AwS580S0100000_1((SubPaymentListAssem) ajS60S0100000_1.l0, 621));
        }
    }

    public static final void LIZ$9(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((Function0) ajS60S0100000_1.l0).invoke();
        }
    }

    public static final void LIZ$90(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            ((SubPaymentListAssem) ajS60S0100000_1.l0).Ho().setText("");
            ((SubPaymentListAssem) ajS60S0100000_1.l0).Ho().clearFocus();
            C1744700vVE.LIZJ(((SubPaymentListAssem) ajS60S0100000_1.l0).Ho());
        }
    }

    public static final void LIZ$91(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        ProductDetailReview productDetailReview;
        if (view != null && !((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL.LIZ()) {
            C1073204Hq c1073204Hq = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL;
            String strLJIIIZ = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ();
            ProductPackStruct productPackStruct = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLJIJIL;
            if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null) {
                str = productDetailReview.daInfo;
            } else {
                str = null;
            }
            C1073204Hq.LIZIZ(c1073204Hq, view, "review_entrance", "review_entrance", 1, null, strLJIIIZ, str, 80);
        }
    }

    public static final void LIZ$92(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        ProductDetailReview productDetailReview;
        if (view != null) {
            C1073204Hq c1073204Hq = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL;
            String strLJIIIZ = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ();
            ProductPackStruct productPackStruct = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLJIJIL;
            if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null) {
                str = productDetailReview.daInfo;
            } else {
                str = null;
            }
            C1073204Hq.LIZIZ(c1073204Hq, view, "size_fitness", "review_entrance", 1, null, strLJIIIZ, str, 80);
        }
    }

    public static final void LIZ$93(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        ProductDetailReview productDetailReview;
        if (view != null) {
            C1073204Hq c1073204Hq = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLLJLJLL;
            String strLJIIIZ = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ();
            ProductPackStruct productPackStruct = ((PdpReviewHeadViewHolder) ajS60S0100000_1.l0).c6().LLJIJIL;
            if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null) {
                str = productDetailReview.daInfo;
            } else {
                str = null;
            }
            C1073204Hq.LIZIZ(c1073204Hq, view, "review_entrance", "impression_tag", 1, null, strLJIIIZ, str, 80);
        }
    }

    public static final void LIZ$94(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        ProductDetailReview productDetailReview;
        if (view != null && !((SeaPdpReviewHeadViewHolderV2) ajS60S0100000_1.l0).c6().LLLLLJLJLL.LIZ()) {
            C1073204Hq c1073204Hq = ((SeaPdpReviewHeadViewHolderV2) ajS60S0100000_1.l0).c6().LLLLLJLJLL;
            String strLJIIIZ = ((SeaPdpReviewHeadViewHolderV2) ajS60S0100000_1.l0).c6().LLLLL.LJIIIZ();
            ProductPackStruct productPackStruct = ((SeaPdpReviewHeadViewHolderV2) ajS60S0100000_1.l0).c6().LLJIJIL;
            if (productPackStruct != null && (productDetailReview = productPackStruct.review) != null) {
                str = productDetailReview.daInfo;
            } else {
                str = null;
            }
            C1073204Hq.LIZIZ(c1073204Hq, view, "review_entrance", "review_entrance", 1, null, strLJIIIZ, str, 80);
        }
    }

    public static final void LIZ$95(AjS60S0100000_1 ajS60S0100000_1, View view) {
        C197039127h c197039127hGo;
        if (view != null && (c197039127hGo = ((BankInstallmentAssem) ajS60S0100000_1.l0).Go()) != null) {
            c197039127hGo.performClick();
        }
    }

    public static final void LIZ$96(AjS60S0100000_1 ajS60S0100000_1, View view) {
        if (view != null) {
            AwS545S0100000_1 awS545S0100000_1 = ((PaymentSummaryPanelDialog) ajS60S0100000_1.l0).LLJJIJIIJIL;
            if (awS545S0100000_1 != null) {
                awS545S0100000_1.invoke();
            }
            ((PaymentSummaryPanelDialog) ajS60S0100000_1.l0).closePanel();
        }
    }

    public static final void LIZ$97(AjS60S0100000_1 ajS60S0100000_1, View view) {
        String str;
        String str2;
        BillStarlingText billStarlingText;
        BillStarlingText billStarlingText2;
        if (view != null) {
            C19EG activity = ((MXAggregationOrderCell) ajS60S0100000_1.l0).getActivity();
            if (activity != null) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJIL(bundle, "seller_id", C09HN.LIZ(((MXAggregationOrderCell) ajS60S0100000_1.l0).LLJILJIL));
                C786410Ut5.LJJJI("message", ((MXAggregationOrderCell) ajS60S0100000_1.l0).R5().LLL.get(C13LP.LJJJJZI(((MXAggregationOrderCell) ajS60S0100000_1.l0).LLJILJIL)), bundle);
                ShopOrderStarling shopOrderStarling = ((MXAggregationOrderCell) ajS60S0100000_1.l0).LLJILLL;
                if (shopOrderStarling != null && (billStarlingText2 = shopOrderStarling.orderNotesHint) != null) {
                    str = billStarlingText2.text;
                } else {
                    str = null;
                }
                C786410Ut5.LJJJI("hint", str, bundle);
                ShopOrderStarling shopOrderStarling2 = ((MXAggregationOrderCell) ajS60S0100000_1.l0).LLJILLL;
                if (shopOrderStarling2 != null && (billStarlingText = shopOrderStarling2.oderNotesTitle) != null) {
                    str2 = billStarlingText.text;
                } else {
                    str2 = null;
                }
                C786410Ut5.LJJJI("title", str2, bundle);
                bundle.putInt("height", (int) (C958103op.LIZJ() * 0.46f));
                C960603pE.LJFF(bundle, view, null);
                AnonymousClass0411 anonymousClass0411 = ShopMessageEditFragment.LLJJI;
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                anonymousClass0411.getClass();
                AnonymousClass0411.LIZ(bundle, supportFragmentManager);
            }
            C03O0.LJJJLZIJ(C03O0.LIZ, "message", ((MXAggregationOrderCell) ajS60S0100000_1.l0).R5().hi1(false), null, null, null, null, null, null, null, null, null, null, ((MXAggregationOrderCell) ajS60S0100000_1.l0).R5().LLLZLZ.LIZ("c3646.d3872"), null, null, null, 983036);
        }
    }

    public static final void LIZ$98(AjS60S0100000_1 ajS60S0100000_1, View view) {
        Function1<C873003b6, Unit> onCheckedListener;
        if (view != null && (onCheckedListener = ((C903203fy) ajS60S0100000_1.l0).getOnCheckedListener()) != null) {
            onCheckedListener.invoke(((C903203fy) ajS60S0100000_1.l0).getBankInfo());
        }
    }

    public static final void LIZ$99(AjS60S0100000_1 ajS60S0100000_1, View view) {
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Map<String, Object> map;
        if (view != null) {
            USPdpSizeGuideViewHolder uSPdpSizeGuideViewHolder = (USPdpSizeGuideViewHolder) ajS60S0100000_1.l0;
            C999003vQ c999003vQX5 = uSPdpSizeGuideViewHolder.X5();
            String str = c999003vQX5.LLILLJJLI;
            if (str != null && str.length() != 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    C1054004Ag c1054004Ag = ((PdpViewModel) uSPdpSizeGuideViewHolder.LLJJLIIIJLLLLLLLZ.getValue()).LLJLILLLLZIIL;
                    if (c1054004Ag != null && (pdpEnterParam = c1054004Ag.LIZ) != null && (map = pdpEnterParam.trackParams) != null) {
                        linkedHashMap.putAll(map);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                linkedHashMap.put("previous_page", "product_detail");
                String str2 = c999003vQX5.LLILLJJLI;
                if (str2 != null) {
                    C919503ib.LIZIZ(uSPdpSizeGuideViewHolder.itemView.getContext(), str2, C2097908Jt.LIZJ(new Pair("track_params", linkedHashMap)), false).open();
                }
            } else {
                String strLJ = C960603pE.LJ(uSPdpSizeGuideViewHolder.LLJJIJIL);
                FragmentManager fragmentManager = uSPdpSizeGuideViewHolder.LLJJIJIL.getFragmentManager();
                if (fragmentManager != null) {
                    C814703Gf.LIZ(fragmentManager, strLJ, new SizeGuide(null, c999003vQX5.LLILZ, null, null, null, c999003vQX5.LLILLL, null, null, c999003vQX5.LLILLJJLI, null));
                }
            }
            C1748720vbi.LIZLLL(uSPdpSizeGuideViewHolder.itemView, new C10516049i(), new AwS52S1000000_1(38));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS60S0100000_1(X.C939603lq r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            int r5 = 35 - r5
            if (r5 == 0) goto Lf
            r2 = r3
            r2.l0 = r4
            r0 = 300(0x12c, double:1.48E-321)
        Lb:
            r2.<init>(r0)
            return
        Lf:
            r2 = r3
            r2.l0 = r4
            r0 = 700(0x2bc, double:3.46E-321)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS60S0100000_1.<init>(X.03lq, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS60S0100000_1(X.C939703lr r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            int r5 = 34 - r5
            if (r5 == 0) goto Lf
            r2 = r3
            r2.l0 = r4
            r0 = 300(0x12c, double:1.48E-321)
        Lb:
            r2.<init>(r0)
            return
        Lf:
            r2 = r3
            r2.l0 = r4
            r0 = 700(0x2bc, double:3.46E-321)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS60S0100000_1.<init>(X.03lr, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS60S0100000_1(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS60S0100000_1(AwS545S0100000_1 awS545S0100000_1, int i) {
        super(300L);
        this.$t = i;
        this.l0 = awS545S0100000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS60S0100000_1(AuctionTaxRouteCell auctionTaxRouteCell, C1026803zu c1026803zu, int i) {
        super(700L);
        this.$t = i;
        this.l0 = auctionTaxRouteCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS60S0100000_1(long j, UsSkuVH usSkuVH, int i) {
        super(j);
        this.$t = i;
        this.l0 = usSkuVH;
    }
}
