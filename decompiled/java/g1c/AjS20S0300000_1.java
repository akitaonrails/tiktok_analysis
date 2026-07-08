package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0317;
import X.AnonymousClass0376;
import X.AnonymousClass0434;
import X.AnonymousClass0445;
import X.C034S;
import X.C037J;
import X.C038K;
import X.C03AI;
import X.C03AJ;
import X.C03C0;
import X.C03CN;
import X.C03CT;
import X.C03CZ;
import X.C03DI;
import X.C03DY;
import X.C03GF;
import X.C03GG;
import X.C03H4;
import X.C03I0;
import X.C03L8;
import X.C03O0;
import X.C03O6;
import X.C03QL;
import X.C03U4;
import X.C048J;
import X.C049Y;
import X.C04C9;
import X.C04E4;
import X.C04EC;
import X.C04GW;
import X.C0H1U;
import X.C0HZQ;
import X.C1008503wx;
import X.C1013103xh;
import X.C10516049i;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1056204Bc;
import X.C1063004Ds;
import X.C1120604Zw;
import X.C1212720hfC;
import X.C123100dR;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1351210lGZ;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C1751470vg9;
import X.C197039127h;
import X.C19EG;
import X.C1AQS;
import X.C2097608Jq;
import X.C21717319z1;
import X.C23250099c;
import X.C2327809Ae;
import X.C418440Gaw;
import X.C426750GoL;
import X.C426770GoN;
import X.C714302qb;
import X.C719202rO;
import X.C719302rP;
import X.C720002rW;
import X.C722302rt;
import X.C755502xF;
import X.C770702zh;
import X.C7806033c;
import X.C786410Ut5;
import X.C7879035x;
import X.C7928037u;
import X.C800503At;
import X.C802303Bl;
import X.C803503Bx;
import X.C807503Dl;
import X.C808003Dq;
import X.C808103Dr;
import X.C808203Ds;
import X.C814420VxA;
import X.C815203Gk;
import X.C817503Hh;
import X.C817603Hi;
import X.C824703Kb;
import X.C824803Kc;
import X.C825203Kg;
import X.C882003cY;
import X.C919503ib;
import X.C928203k0;
import X.C948503nH;
import X.C958103op;
import X.C959603p4;
import X.C960203pA;
import X.C960603pE;
import X.C985203tC;
import X.C993603uY;
import X.EnumC804103Cd;
import X.EnumC818803Hu;
import X.InterfaceC1012803xe;
import X.InterfaceC10322041w;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC7914037g;
import X.InterfaceC7980039u;
import X.InterfaceC885103d3;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SwitchRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHorizonBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.OspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.productinfo.SeaOneStepProductInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.OspAggregationOrderModuleViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.USAggregationOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount.USPlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfoToolTips;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.RecommendPaymentInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PurchaseRewardInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BNPLTopWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubbleExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShopPromotionData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.promotion.SeaPdpPromotionForUSHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS1S2201000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS43S1300000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public class AjS20S0300000_1 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS20S0300000_1 ajS20S0300000_1, View view) {
        int iIntValue;
        String string;
        Integer num;
        DynamicSchema dynamicSchema;
        Object obj;
        Integer num2;
        if (view != null) {
            if (((AnonymousClass0376) ajS20S0300000_1.l0).LLJJIJIIJIL) {
                C03O0.LIZ.getClass();
                C03O0.LJLZ();
            }
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = ((USOspAddressCell) ajS20S0300000_1.l1).N5().hi1(false);
            DeliveryInstructionInfo deliveryInstructionInfo = ((AnonymousClass0376) ajS20S0300000_1.l0).LLJJLIIIJLLLLLLLZ;
            if (deliveryInstructionInfo != null && (num2 = deliveryInstructionInfo.instructionType) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
            AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) ajS20S0300000_1.l0;
            Integer num3 = anonymousClass0376.LLJZIJLIL;
            Map<String, Object> map = anonymousClass0376.LLJLLL;
            String pudoSchema = null;
            if (map != null && (obj = map.get("invalid_reason_code")) != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            C03O0.LJJJLZIJ(c03o0, "edit_shipping", mapHi1, null, null, null, null, null, null, num3, null, "address", string, ((USOspAddressCell) ajS20S0300000_1.l1).N5().LLLZLZ.LIZ("c48002.d1226"), null, null, null, 929788);
            String strLIZLLL = C960603pE.LIZLLL(view);
            C993603uY.LIZJ(strLIZLLL, new AwS580S0100000_1((AnonymousClass0376) ajS20S0300000_1.l0, 28));
            SwitchRichInfo switchRichInfo = ((AnonymousClass0376) ajS20S0300000_1.l0).LLJL;
            if (switchRichInfo != null && (num = switchRichInfo.addressSwitchType) != null && num.intValue() == 0) {
                ((USOspAddressCell) ajS20S0300000_1.l1).L5();
                Context context = ((View) ajS20S0300000_1.l2).getContext();
                BillInfoData billInfoData = ((USOspAddressCell) ajS20S0300000_1.l1).N5().LLJJI;
                if (billInfoData != null && (dynamicSchema = billInfoData.schemaInfo) != null) {
                    pudoSchema = dynamicSchema.getPudoSchema();
                }
                OspAddressViewModel.yQ2(context, pudoSchema, ((USOspAddressCell) ajS20S0300000_1.l1).N5());
            } else {
                OspAddressViewModel.xQ2(((USOspAddressCell) ajS20S0300000_1.l1).L5(), ((View) ajS20S0300000_1.l2).getContext(), strLIZLLL, null, "c48002.d1226", ((USOspAddressCell) ajS20S0300000_1.l1).N5(), null, null, 100);
            }
            List<String> list = ((USOspAddressCell) ajS20S0300000_1.l1).N5().LLLIIL;
            if (list != null) {
                ((ArrayList) list).add("edit_address");
            }
            C786410Ut5.LLLLLLIL(((C803503Bx) ((View) ajS20S0300000_1.l2).findViewById(R.id.us_order_submit_address_exist)).getUsOrderSubmitAddressBadgeFromXml(), 8);
        }
    }

    public static final void LIZ$1(AjS20S0300000_1 ajS20S0300000_1, View view) {
        Integer num;
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            int iIntValue = 0;
            HashMap<String, Object> mapHi1 = ((USOspAddressCell) ajS20S0300000_1.l0).N5().hi1(false);
            DeliveryInstructionInfo deliveryInstructionInfo = ((AnonymousClass0376) ajS20S0300000_1.l2).LLJJLIIIJLLLLLLLZ;
            if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
                iIntValue = num.intValue();
            }
            mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
            mapHi1.put("action_type", "add");
            C03O0.LJJJLZIJ(c03o0, "add_new_shipping", mapHi1, null, null, null, null, null, null, null, null, "address", null, ((USOspAddressCell) ajS20S0300000_1.l0).N5().LLLZLZ.LIZ("c48002.d38919"), null, null, null, 966652);
            OspAddressViewModel ospAddressViewModelL5 = ((USOspAddressCell) ajS20S0300000_1.l0).L5();
            USOspAddressCell uSOspAddressCell = (USOspAddressCell) ajS20S0300000_1.l0;
            OspAddressViewModel.wQ2(ospAddressViewModelL5, uSOspAddressCell.itemView, null, "c48002.d38919", uSOspAddressCell.N5(), null, null, null, 114);
            C786410Ut5.LLLLLLIL((C426770GoN) ((View) ajS20S0300000_1.l1).findViewById(R.id.us_cta_badge), 8);
            List<String> list = ((USOspAddressCell) ajS20S0300000_1.l0).N5().LLLIIL;
            if (list != null) {
                ((ArrayList) list).add("edit_address");
            }
        }
    }

    public static final void LIZ$10(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            PaymentViewModel.wR2(((RecommendPaymentInfoViewHolder) ajS20S0300000_1.l0).f6(), (PaymentMethod) ajS20S0300000_1.l1, null, (InstallmentPlan) ajS20S0300000_1.l2, true, new AwS580S0100000_1((RecommendPaymentInfoViewHolder) ajS20S0300000_1.l0, 197), 2);
        }
    }

    public static final void LIZ$11(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            PaymentViewModel.wR2(((RecommendPaymentInfoViewHolder) ajS20S0300000_1.l0).f6(), (PaymentMethod) ajS20S0300000_1.l1, null, (InstallmentPlan) ajS20S0300000_1.l2, false, new AwS580S0100000_1((RecommendPaymentInfoViewHolder) ajS20S0300000_1.l0, 199), 10);
        }
    }

    public static final void LIZ$12(AjS20S0300000_1 ajS20S0300000_1, View view) {
        Function2<? super View, ? super C1063004Ds, Unit> function2;
        if (view != null && (function2 = ((C04EC) ajS20S0300000_1.l0).LLILZIL) != null) {
            function2.invoke(ajS20S0300000_1.l1, (C1063004Ds) ajS20S0300000_1.l2);
        }
    }

    public static final void LIZ$13(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, ((C807503Dl) ajS20S0300000_1.l0).LLILLJJLI);
            SeaPdpFragment seaPdpFragment = (SeaPdpFragment) ajS20S0300000_1.l1;
            if ((seaPdpFragment instanceof InterfaceC1748810vbr) && seaPdpFragment != null) {
                C807503Dl c807503Dl = (C807503Dl) ajS20S0300000_1.l0;
                HashMap map = (HashMap) ajS20S0300000_1.l2;
                c807503Dl.getClass();
                C1748720vbi.LIZIZ(seaPdpFragment, new C10516049i(), new AwS115S1100000_1(map, 26));
            }
        }
    }

    public static final void LIZ$14(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, ((C807503Dl) ajS20S0300000_1.l0).LLJI);
            SeaPdpFragment seaPdpFragment = (SeaPdpFragment) ajS20S0300000_1.l1;
            if ((seaPdpFragment instanceof InterfaceC1748810vbr) && seaPdpFragment != null) {
                C807503Dl c807503Dl = (C807503Dl) ajS20S0300000_1.l0;
                HashMap map = (HashMap) ajS20S0300000_1.l2;
                c807503Dl.getClass();
                C1748720vbi.LIZIZ(seaPdpFragment, new C10516049i(), new AwS115S1100000_1(map, 26));
            }
        }
    }

    public static final void LIZ$15(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C807503Dl c807503Dl = (C807503Dl) ajS20S0300000_1.l0;
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) ajS20S0300000_1.l1;
            ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) ajS20S0300000_1.l2;
            c807503Dl.getClass();
            C807503Dl.LIZ(seaPdpViewModel, view, productUnavailableInfo);
        }
    }

    public static final void LIZ$16(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C807503Dl c807503Dl = (C807503Dl) ajS20S0300000_1.l0;
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) ajS20S0300000_1.l1;
            ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) ajS20S0300000_1.l2;
            c807503Dl.getClass();
            C807503Dl.LIZ(seaPdpViewModel, view, productUnavailableInfo);
        }
    }

    public static final void LIZ$17(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            SeaPdpFragment seaPdpFragment = (SeaPdpFragment) ajS20S0300000_1.l0;
            if ((seaPdpFragment instanceof InterfaceC1748810vbr) && seaPdpFragment != null) {
                C1748720vbi.LIZIZ(seaPdpFragment, new C048J(), new AwS580S0100000_1((Announcement) ajS20S0300000_1.l1, 365));
            }
            FragmentManager fragmentManager = ((SeaPdpFragment) ajS20S0300000_1.l0).getFragmentManager();
            if (fragmentManager != null) {
                C03L8.LIZ(fragmentManager, ((Announcement) ajS20S0300000_1.l1).text, ((C807503Dl) ajS20S0300000_1.l2).getResources().getString(2131832739));
            }
        }
    }

    public static final void LIZ$18(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "arrow"), new Pair("button_type", "shipping_address"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
            String strLIZLLL = C960603pE.LIZLLL(view);
            C993603uY.LIZJ(strLIZLLL, new AwS580S0100000_1((AnonymousClass0376) ajS20S0300000_1.l2, 381));
            AuctionAddressPayVM.yQ2(((AuctionAddressCell) ajS20S0300000_1.l0).N5(), ((View) ajS20S0300000_1.l1).getContext(), strLIZLLL);
            C0H1U.LIZIZ(((C985203tC) ((AuctionAddressCell) ajS20S0300000_1.l0).LLJIJIL.getValue()).getBadge());
        }
    }

    public static final void LIZ$19(AjS20S0300000_1 ajS20S0300000_1, View view) {
        Object obj;
        String str;
        if (view != null) {
            ((USPlatformDiscountsCell) ajS20S0300000_1.l0).L5().LLLJL.LJ = ((C720002rW) ajS20S0300000_1.l1).LLIZ;
            Float fValueOf = null;
            String strLJ = ((USPlatformDiscountsCell) ajS20S0300000_1.l0).L5().LLLZLZ.LJ("c1196.d26958", ((C720002rW) ajS20S0300000_1.l1).LLJ, null);
            C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
            Context context = ((View) ajS20S0300000_1.l2).getContext();
            if (strLJ == null) {
                strLJ = "";
            }
            HashMap<String, Object> map = ((USPlatformDiscountsCell) ajS20S0300000_1.l0).L5().LLLIL;
            if (map != null) {
                obj = map.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> map2 = ((USPlatformDiscountsCell) ajS20S0300000_1.l0).L5().LLLIL;
            C720002rW c720002rW = (C720002rW) ajS20S0300000_1.l1;
            String str2 = c720002rW.LLIZ;
            if (c720002rW.LLJLLIL) {
                fValueOf = Float.valueOf(C928203k0.LJIIJ());
            }
            C1013103xh.LIZJ(c1013103xh, context, strLJ, str2, 3, str, map2, null, fValueOf, null, null, 6912);
        }
    }

    public static final void LIZ$2(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            ((USAggregationOrderCell) ajS20S0300000_1.l0).L5().v = ((C719302rP) ajS20S0300000_1.l1).LLJJIII;
            C03O6 c03o6 = ((USAggregationOrderCell) ajS20S0300000_1.l0).L5().B;
            if (c03o6 != null) {
                c03o6.LJ(view.getContext(), ((USAggregationOrderCell) ajS20S0300000_1.l0).L5());
            }
            USAggregationOrderCell.N5((USAggregationOrderCell) ajS20S0300000_1.l0, "tiktokec_module_click", (HashMap) ajS20S0300000_1.l2);
        }
    }

    public static final void LIZ$20(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C03U4 c03u4 = C03U4.LIZ;
            TuxTextView tuxTextView = (TuxTextView) ajS20S0300000_1.l0;
            ExceptionUX exceptionUX = (ExceptionUX) ajS20S0300000_1.l1;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(169);
            AFwS185S0000000_1 aFwS185S0000000_12 = AFwS185S0000000_1.get$arr$(170);
            c03u4.getClass();
            C03U4.LIZ(tuxTextView, exceptionUX, aFwS185S0000000_1, aFwS185S0000000_12, null, null);
            Function0 function0 = (Function0) ajS20S0300000_1.l2;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$21(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C03I0 c03i0 = C03I0.LIZ;
            OspAddressViewModel ospAddressViewModelL5 = ((OspAddressCell) ajS20S0300000_1.l0).L5();
            IdentityInfo identityInfo = (IdentityInfo) ajS20S0300000_1.l1;
            OspAddressCell ospAddressCell = (OspAddressCell) ajS20S0300000_1.l0;
            View view2 = ospAddressCell.itemView;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = ospAddressCell.N5();
            String value = EnumC818803Hu.IDENTITY_MODULE_CLICK.getValue();
            c03i0.getClass();
            C03I0.LIZLLL(ospAddressViewModelL5, identityInfo, view2, view, orderSubmitAssemViewModelN5, value, null);
            C1748720vbi.LIZLLL((C197039127h) ajS20S0300000_1.l2, new C10516049i(), AFwS228S0000000_1.get$arr$(525));
        }
    }

    public static final void LIZ$22(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C03I0 c03i0 = C03I0.LIZ;
            OspAddressViewModel ospAddressViewModelL5 = ((OspAddressCell) ajS20S0300000_1.l0).L5();
            IdentityInfo identityInfo = (IdentityInfo) ajS20S0300000_1.l1;
            OspAddressCell ospAddressCell = (OspAddressCell) ajS20S0300000_1.l0;
            View view2 = ospAddressCell.itemView;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelN5 = ospAddressCell.N5();
            String value = EnumC818803Hu.IDENTITY_MODULE_CLICK.getValue();
            c03i0.getClass();
            C03I0.LIZLLL(ospAddressViewModelL5, identityInfo, view2, view, orderSubmitAssemViewModelN5, value, null);
            C1748720vbi.LIZLLL((C1212720hfC) ajS20S0300000_1.l2, new C10516049i(), AFwS228S0000000_1.get$arr$(530));
        }
    }

    public static final void LIZ$23(AjS20S0300000_1 ajS20S0300000_1, View view) {
        String string;
        Object obj;
        Integer num;
        if (view != null) {
            if (((AnonymousClass0376) ajS20S0300000_1.l0).LLJJIJIIJIL) {
                C03O0.LIZ.getClass();
                C03O0.LJLZ();
            }
            C03O0 c03o0 = C03O0.LIZ;
            int iIntValue = 0;
            HashMap<String, Object> mapHi1 = ((OspAddressCell) ajS20S0300000_1.l1).N5().hi1(false);
            DeliveryInstructionInfo deliveryInstructionInfo = ((AnonymousClass0376) ajS20S0300000_1.l0).LLJJLIIIJLLLLLLLZ;
            if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
                iIntValue = num.intValue();
            }
            mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
            AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) ajS20S0300000_1.l0;
            Integer num2 = anonymousClass0376.LLJZIJLIL;
            String strValueOf = String.valueOf(anonymousClass0376.LLJJJIL);
            Map<String, Object> map = ((AnonymousClass0376) ajS20S0300000_1.l0).LLJLLL;
            if (map != null && (obj = map.get("invalid_reason_code")) != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            C03O0.LJJJLZIJ(c03o0, "edit_shipping", mapHi1, null, null, null, null, null, null, num2, strValueOf, "address", string, ((OspAddressCell) ajS20S0300000_1.l1).N5().LLLZLZ.LIZ("c48002.d1226"), null, null, null, 921596);
            String strLIZLLL = C960603pE.LIZLLL(view);
            C993603uY.LIZJ(strLIZLLL, new AwS580S0100000_1((AnonymousClass0376) ajS20S0300000_1.l0, 467));
            OspAddressViewModel.xQ2(((OspAddressCell) ajS20S0300000_1.l1).L5(), ((View) ajS20S0300000_1.l2).getContext(), strLIZLLL, null, "c48002.d1226", ((OspAddressCell) ajS20S0300000_1.l1).N5(), null, null, 100);
        }
    }

    public static final void LIZ$24(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            ((SeaPdpPromotionForUSHolder) ajS20S0300000_1.l0).d6().LLLLLJIL.LIZLLL(((SeaPdpPromotionForUSHolder) ajS20S0300000_1.l0).itemView.getContext(), ((C1056204Bc) ajS20S0300000_1.l1).LL.schema, (C04GW) ajS20S0300000_1.l2, "promotions");
        }
    }

    public static final void LIZ$25(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            AnonymousClass0445 anonymousClass0445 = ((AnonymousClass0434) ajS20S0300000_1.l0).LLILLJJLI;
            if (anonymousClass0445 != null) {
                anonymousClass0445.LIZ((C04E4) ajS20S0300000_1.l1, (PdpButton) ajS20S0300000_1.l2);
            }
            if (((AnonymousClass0434) ajS20S0300000_1.l0).getEnableButtonVibration()) {
                new C1351210lGZ(((C04E4) ajS20S0300000_1.l1).getContext()).LIZIZ(50, 120);
            }
        }
    }

    public static final void LIZ$26(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            TuxTextView tuxTextView = ((C03CN) ajS20S0300000_1.l0).LLILLL;
            if (tuxTextView != null) {
                C1748720vbi.LIZLLL(tuxTextView, new C049Y(), AFwS228S0000000_1.get$arr$(572));
            }
            EnumC804103Cd enumC804103CdLJJI = C7806033c.LJJI((C03CT) ajS20S0300000_1.l1, (Integer) ajS20S0300000_1.l2);
            InterfaceC7914037g interfaceC7914037g = ((C03CN) ajS20S0300000_1.l0).LLILLJJLI;
            if (interfaceC7914037g != null) {
                interfaceC7914037g.LIZ(enumC804103CdLJJI, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$27(g1c.AjS20S0300000_1 r25, android.view.View r26) {
        /*
            if (r26 == 0) goto L95
            X.03O0 r3 = X.C03O0.LIZ
            java.lang.String r4 = "payment_method"
            r2 = r25
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r1 = r0.V5()
            r0 = 0
            java.util.HashMap r5 = r1.hi1(r0)
            java.lang.String r1 = "is_clickable"
            java.lang.String r0 = "1"
            r5.put(r1, r0)
            r6 = 0
            r21 = 0
            java.lang.Object r1 = r2.l0
            com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell r1 = (com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell) r1
            java.lang.Object r0 = r2.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            r1.getClass()
            java.lang.String r11 = com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell.S5(r0)
            r20 = 1048316(0xffefc, float:1.469004E-39)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            X.C03O0.LJJJLZIJ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r18 = r0.V5()
            java.lang.Object r0 = r2.l2
            android.view.View r0 = (android.view.View) r0
            android.content.Context r19 = r0.getContext()
            java.lang.Object r0 = r2.l2
            android.view.View r0 = (android.view.View) r0
            java.lang.String r20 = X.C960603pE.LIZLLL(r0)
            com.bytedance.ies.abmock.SettingsManager r4 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcExpressCheckoutWithDirectPayModel> r3 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcExpressCheckoutWithDirectPayModel.class
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcExpressCheckoutWithDirectPayModel r1 = X.C874303bJ.LIZ
            java.lang.String r0 = "pipo_ec_express_checkout_with_direct_pay"
            java.lang.Object r0 = r4.LJIIIIZZ(r0, r3, r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcExpressCheckoutWithDirectPayModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcExpressCheckoutWithDirectPayModel) r0
            if (r0 == 0) goto L6f
            r1 = r0
        L6f:
            boolean r0 = r1.viewAllEnable
            if (r0 == 0) goto L96
            X.03k0 r1 = X.C928203k0.LIZ
            java.lang.Object r0 = r2.l0
            com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r0.V5()
            java.lang.String r0 = r0.n
            r1.getClass()
            boolean r0 = X.C928203k0.LJIILL(r0)
            if (r0 != 0) goto L96
            r23 = 1
        L8a:
            r25 = 0
            r26 = 216(0xd8, float:3.03E-43)
            r22 = r21
            r24 = r21
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel.JS2(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L95:
            return
        L96:
            r23 = 0
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS20S0300000_1.LIZ$27(g1c.AjS20S0300000_1, android.view.View):void");
    }

    public static final void LIZ$28(AjS20S0300000_1 ajS20S0300000_1, View view) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        String name;
        if (view != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IBusinessDependencyService.class.getName();
                if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
            }
            ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(((LinearLayout) ajS20S0300000_1.l0).getContext(), C919503ib.LIZJ(((LinkText) ajS20S0300000_1.l1).getLink(), C2097608Jq.LJ()).build().toString(), null, null);
            C1748720vbi.LIZLLL((View) ajS20S0300000_1.l2, new C049Y(), new AwS580S0100000_1((LinkText) ajS20S0300000_1.l1, 524));
        }
    }

    public static final void LIZ$29(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            ((AddressAdapter$AddressViewHolder) ajS20S0300000_1.l0).b6(((Address) ajS20S0300000_1.l1).LJII(), "other", (ReachableAddress) ajS20S0300000_1.l2);
            ((AddressAdapter$AddressViewHolder) ajS20S0300000_1.l0).W5().Pg1((Address) ajS20S0300000_1.l1);
        }
    }

    public static final void LIZ$3(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            List<String> list = ((C815203Gk) ajS20S0300000_1.l0).LLILLJJLI.LLLIIL;
            if (list != null) {
                ((ArrayList) list).add("click_message");
            }
            boolean zLIZ = C770702zh.LIZ(((C815203Gk) ajS20S0300000_1.l0).LLILLJJLI.LLL.get(((C719202rO) ajS20S0300000_1.l1).LLILZLL));
            C1748720vbi.LIZLLL((TuxTextView) ajS20S0300000_1.l2, new C049Y(), new AwS89S0110000_1(zLIZ, (C815203Gk) ajS20S0300000_1.l0, 2));
            C815203Gk c815203Gk = (C815203Gk) ajS20S0300000_1.l0;
            C948503nH.LJIIIIZZ(c815203Gk.LLILLL, new C824803Kc((TuxTextView) ajS20S0300000_1.l2, c815203Gk, zLIZ, (C719202rO) ajS20S0300000_1.l1, view, null));
        }
    }

    public static final void LIZ$30(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            ((AddressAdapter$AddressViewHolder) ajS20S0300000_1.l0).b6(((Address) ajS20S0300000_1.l1).LJII(), "other", (ReachableAddress) ajS20S0300000_1.l2);
            ((AddressAdapter$AddressViewHolder) ajS20S0300000_1.l0).W5().Fk1((Address) ajS20S0300000_1.l1);
        }
    }

    public static final void LIZ$31(AjS20S0300000_1 ajS20S0300000_1, View view) {
        String str;
        Object obj;
        String str2;
        Map<String, Object> map;
        Map<String, Object> map2;
        String str3;
        if (view != null) {
            C03QL c03ql = ((SkuPanelBaseReusedAssem) ((InterfaceC7980039u) ajS20S0300000_1.l0)).getViewModel().LLJJJJ;
            String str4 = null;
            if (c03ql != null) {
                C720002rW c720002rW = ((C755502xF) ajS20S0300000_1.l1).LLIZ;
                if (c720002rW != null) {
                    str3 = c720002rW.LLIZ;
                } else {
                    str3 = null;
                }
                c03ql.LLJ = str3;
            }
            C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
            Context contextSp = ((SkuPanelBaseReusedAssem) ((InterfaceC7980039u) ajS20S0300000_1.l0)).sp();
            C720002rW c720002rW2 = ((C755502xF) ajS20S0300000_1.l1).LLIZ;
            if (c720002rW2 == null || (str = c720002rW2.LLJ) == null) {
                str = "";
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelBaseReusedAssem) ((InterfaceC7980039u) ajS20S0300000_1.l0)).getViewModel().LLJI;
            if (skuEnterParams != null && (map2 = skuEnterParams.trackParams) != null) {
                obj = map2.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = ((SkuPanelBaseReusedAssem) ((InterfaceC7980039u) ajS20S0300000_1.l0)).getViewModel().LLJI;
            if (skuEnterParams2 != null) {
                map = skuEnterParams2.trackParams;
            } else {
                map = null;
            }
            C720002rW c720002rW3 = ((C755502xF) ajS20S0300000_1.l1).LLIZ;
            if (c720002rW3 != null) {
                str4 = c720002rW3.LLIZ;
            }
            C1013103xh.LIZJ(c1013103xh, contextSp, str, str4, 3, str2, map, "sku", null, null, null, 7424);
            C1748720vbi.LIZLLL((View) ajS20S0300000_1.l2, new C10516049i(), new AwS580S0100000_1((C755502xF) ajS20S0300000_1.l1, (InterfaceC7980039u) ajS20S0300000_1.l0, 566));
        }
    }

    public static final void LIZ$32(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            ((InterfaceC885103d3) ajS20S0300000_1.l0).LLLIIL().LIZ((LinearLayout) ajS20S0300000_1.l1, (PaymentInfo) ajS20S0300000_1.l2);
        }
    }

    public static final void LIZ$33(AjS20S0300000_1 ajS20S0300000_1, View view) {
        CommerceProductInfoView commerceProductInfoView;
        InterfaceC10322041w interfaceC10322041w;
        if (view != null && (interfaceC10322041w = (commerceProductInfoView = (CommerceProductInfoView) ajS20S0300000_1.l0).LLJJIII) != null) {
            interfaceC10322041w.LIZIZ(commerceProductInfoView, ((BNPLTopWidget) ajS20S0300000_1.l1).schema, ((C1008503wx) ajS20S0300000_1.l2).LJIIIZ);
        }
    }

    public static final void LIZ$34(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0).L5().v = ((C719302rP) ajS20S0300000_1.l1).LLJJIII;
            C03O6 c03o6 = ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0).L5().B;
            if (c03o6 != null) {
                c03o6.LJ(view.getContext(), ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0).L5());
            }
            USAggregationOrderSingleSkuCell.N5((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0, "tiktokec_module_click", (HashMap) ajS20S0300000_1.l2);
        }
    }

    public static final void LIZ$35(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C7928037u c7928037u = C7928037u.LIZ;
            TuxIconView tuxIconView = (TuxIconView) ajS20S0300000_1.l0;
            C719202rO c719202rO = (C719202rO) ajS20S0300000_1.l1;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelL5 = ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l2).L5();
            c7928037u.getClass();
            C7928037u.LIZIZ(tuxIconView, c719202rO, 0, orderSubmitAssemViewModelL5, "order_submit");
        }
    }

    public static final void LIZ$36(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C7928037u c7928037u = C7928037u.LIZ;
            TuxTextView tuxTextView = (TuxTextView) ajS20S0300000_1.l0;
            C719202rO c719202rO = (C719202rO) ajS20S0300000_1.l1;
            OrderSubmitAssemViewModel orderSubmitAssemViewModelL5 = ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l2).L5();
            c7928037u.getClass();
            C7928037u.LIZIZ(tuxTextView, c719202rO, 0, orderSubmitAssemViewModelL5, "order_submit");
        }
    }

    public static final void LIZ$37(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            List<String> list = ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0).L5().LLLIIL;
            if (list != null) {
                ((ArrayList) list).add("click_message");
            }
            boolean zLIZ = C123100dR.LIZ(((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0).L5().LLL.get(((C719202rO) ajS20S0300000_1.l1).LLILZLL));
            C1748720vbi.LIZLLL((TuxTextView) ajS20S0300000_1.l2, new C049Y(), new AwS89S0110000_1(zLIZ, (USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0, 24));
            Fragment fragment = ((USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0).getFragment();
            if (fragment != null) {
                C948503nH.LJIIIIZZ(fragment, new C824703Kb((TuxTextView) ajS20S0300000_1.l2, (USAggregationOrderSingleSkuCell) ajS20S0300000_1.l0, view, (C719202rO) ajS20S0300000_1.l1, zLIZ, null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$38(g1c.AjS20S0300000_1 r12, android.view.View r13) {
        /*
            r2 = r13
            if (r2 == 0) goto L53
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.SeaPdpReviewGalleryViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.SeaPdpReviewGalleryViewHolder) r0
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel) r0
            X.04Hq r1 = r0.LLLLLJLJLL
            java.lang.String r3 = "review_entrance"
            java.lang.String r4 = "photo_entrance"
            java.lang.Object r0 = r12.l1
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem) r0
            java.lang.String r5 = r0.reviewId
            java.lang.Object r0 = r12.l2
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview r0 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview) r0
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r0 = r0.reviewFilter
            r9 = 0
            if (r0 == 0) goto L54
            java.lang.String r6 = r0.filterId
            java.lang.String r7 = r0.nameEng
            java.lang.Integer r0 = r0.type
            if (r0 == 0) goto L56
            java.lang.String r8 = r0.toString()
        L30:
            java.lang.Object r0 = r12.l2
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview r0 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview) r0
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r0 = r0.reviewFilter
            if (r0 == 0) goto L3a
            java.lang.Integer r9 = r0.count
        L3a:
            r10 = 1
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.SeaPdpReviewGalleryViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.SeaPdpReviewGalleryViewHolder) r0
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel) r0
            X.04Ae r0 = r0.LLLLL
            java.lang.String r11 = r0.LJIIIZ()
            r12 = 0
            r13 = 7168(0x1c00, float:1.0045E-41)
            X.C1073204Hq.LIZJ(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L53:
            return
        L54:
            r6 = r9
            r7 = r9
        L56:
            r8 = r9
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS20S0300000_1.LIZ$38(g1c.AjS20S0300000_1, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    public static final void LIZ$39(AjS20S0300000_1 ajS20S0300000_1, View view) {
        HashMap<String, Object> map;
        String strLJIIIIZZ;
        ?? HasDefaultSelected;
        String str;
        long jLongValue;
        Long l;
        String str2;
        List<InsuranceInfo> list;
        String str3;
        ?? HasDefaultSelected2;
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C038K) ajS20S0300000_1.l0).LLJJI;
            if (orderSubmitAssemViewModel != null) {
                map = orderSubmitAssemViewModel.hi1(false);
                InsuranceInfo insuranceInfo = ((C038K) ajS20S0300000_1.l0).LLJILLL;
                if (insuranceInfo != null) {
                    str3 = insuranceInfo.insuranceProductNameEn;
                } else {
                    str3 = null;
                }
                map.put("insurance_name", String.valueOf(str3));
                InsuranceInfo insuranceInfo2 = ((C038K) ajS20S0300000_1.l0).LLJILLL;
                if (insuranceInfo2 != null) {
                    HasDefaultSelected2 = insuranceInfo2.hasDefaultSelected();
                } else {
                    HasDefaultSelected2 = 0;
                }
                map.put("is_default", Integer.valueOf((int) HasDefaultSelected2));
            } else {
                map = new HashMap<>();
            }
            HashMap<String, Object> mapHi1 = null;
            C03O0.LJJJLZIJ(c03o0, "insurance", map, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048572);
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = ((C038K) ajS20S0300000_1.l0).LLJJI;
            if (orderSubmitAssemViewModel2 != null) {
                mapHi1 = orderSubmitAssemViewModel2.hi1(false);
            }
            C03O0.LJJJJLL(c03o0, "change_plan", "click", mapHi1, "order_submit", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -16, 8388607);
            C038K c038k = (C038K) ajS20S0300000_1.l0;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = c038k.LLJJI;
            if (orderSubmitAssemViewModel3 != null) {
                orderSubmitAssemViewModel3.M = c038k.LLJJ;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InsuranceModule insuranceModule = ((C038K) ajS20S0300000_1.l0).LLJILJILJ;
            String str4 = "";
            if (insuranceModule == null || (list = insuranceModule.insuranceInfoList) == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(list)) == null) {
                strLJIIIIZZ = "";
            }
            linkedHashMap.put("protection_data", strLJIIIIZZ);
            InsuranceInfo insuranceInfo3 = ((C038K) ajS20S0300000_1.l0).LLJILLL;
            if (insuranceInfo3 != null && insuranceInfo3.checkInsurance()) {
                InsuranceInfo insuranceInfo4 = ((C038K) ajS20S0300000_1.l0).LLJILLL;
                if (insuranceInfo4 != null && (str2 = insuranceInfo4.insuranceProtectionCode) != null) {
                    str4 = str2;
                }
                linkedHashMap.put("insurance_protection_code", str4);
                InsuranceInfo insuranceInfo5 = ((C038K) ajS20S0300000_1.l0).LLJILLL;
                if (insuranceInfo5 != null && (l = insuranceInfo5.insuranceProductId) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                linkedHashMap.put("insurance_product_id", Long.valueOf(jLongValue));
            }
            InsuranceInfo insuranceInfo6 = ((C038K) ajS20S0300000_1.l0).LLJILLL;
            if (insuranceInfo6 != null) {
                HasDefaultSelected = insuranceInfo6.hasDefaultSelected();
            } else {
                HasDefaultSelected = 0;
            }
            linkedHashMap.put("is_default", Integer.valueOf((int) HasDefaultSelected));
            InsuranceModule insuranceModule2 = ((C038K) ajS20S0300000_1.l0).LLJILJILJ;
            if (insuranceModule2 != null && (str = insuranceModule2.changePlanUrl) != null) {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
                sparkContext.LJJLIIIJ(linkedHashMap, "initData");
                try {
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    Context context = (C19EG) ajS20S0300000_1.l1;
                    if (context == null) {
                        context = ((ConstraintLayout) ajS20S0300000_1.l2).getContext();
                    }
                    c1537900q7g.getClass();
                    new C1541950qED(context, sparkContext).LIZIZ();
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static final void LIZ$4(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            if (((USAggregationOrderCell) ajS20S0300000_1.l0).L5().iS2()) {
                C1748720vbi.LIZLLL((View) ajS20S0300000_1.l1, new C10516049i(), new AwS367S0200000_1((C719302rP) ajS20S0300000_1.l2, (USAggregationOrderCell) ajS20S0300000_1.l0, 32));
            }
            AssemVMLazy assemVMLazy = ((USAggregationOrderCell) ajS20S0300000_1.l0).LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USAggregationOrderCell.LLJJI;
            OspAggregationOrderModuleViewModel ospAggregationOrderModuleViewModel = (OspAggregationOrderModuleViewModel) assemVMLazy.getValue();
            C719302rP c719302rP = (C719302rP) ajS20S0300000_1.l2;
            OspAggregationOrderModuleViewModel.vQ2(ospAggregationOrderModuleViewModel, c719302rP.LLIZLLLIL, c719302rP.LLJI, ((USAggregationOrderCell) ajS20S0300000_1.l0).getFragment(), ((USAggregationOrderCell) ajS20S0300000_1.l0).L5(), ((C719302rP) ajS20S0300000_1.l2).LLJJ, null, false, 208);
        }
    }

    public static final void LIZ$40(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL(((C802303Bl) ajS20S0300000_1.l0).LLILLJJLI, new C10516049i(), new AwS580S0100000_1((HashMap) ajS20S0300000_1.l1, (HashMap<String, Object>) 755));
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C825203Kg((C802303Bl) ajS20S0300000_1.l0, (UserRightDetail) ajS20S0300000_1.l2, (HashMap) ajS20S0300000_1.l1, null), 3);
        }
    }

    public static final void LIZ$41(AjS20S0300000_1 ajS20S0300000_1, View view) {
        Fragment fragment;
        FragmentManager fragmentManager;
        int i;
        String priceStr;
        Integer priceTextColor;
        Integer priceTextFont;
        Image icon;
        if (view != null && (fragment = (Fragment) ajS20S0300000_1.l0) != null && (fragmentManager = fragment.getFragmentManager()) != null) {
            Context context = ((View) ajS20S0300000_1.l1).getContext();
            C714302qb c714302qb = (C714302qb) ajS20S0300000_1.l2;
            C808103Dr c808103Dr = new C808103Dr(context, null, 0, 0);
            List<Icon> list = c714302qb.LJIIZILJ;
            if (list != null) {
                for (Icon icon2 : list) {
                    SmartImageView smartImageView = new SmartImageView(c808103Dr.getContext());
                    C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50))));
                    C426750GoL.LJIIIZ(smartImageView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
                    if (C960203pA.LIZIZ(c808103Dr.getContext())) {
                        icon = icon2.getIconDark();
                    } else {
                        icon = icon2.getIcon();
                    }
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                    c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, c808103Dr.getContext()));
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                    smartImageView.setCircleOptions(c808103Dr.LLILZ);
                    c808103Dr.getBonusImageContainerFromXml().addView(smartImageView);
                }
            }
            List<BillItem> list2 = c714302qb.LJIIJ;
            if (list2 != null) {
                int i2 = 0;
                for (BillItem billItem : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        BillItem billItem2 = billItem;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        if (i2 == 0) {
                            C958103op.LIZ.getClass();
                            i = C958103op.LJIIIIZZ;
                        } else {
                            C958103op.LIZ.getClass();
                            i = C958103op.LJIILIIL;
                        }
                        layoutParams.topMargin = i;
                        LinearLayout bonusItemContainerFromXml = c808103Dr.getBonusItemContainerFromXml();
                        C808203Ds c808203Ds = new C808203Ds(c808103Dr.getContext());
                        c808203Ds.setTitleWithConfig(new C21717319z1(billItem2.itemName, billItem2.itemTextColor, billItem2.itemTextFont, null, null, 24));
                        Price price = billItem2.itemPrice;
                        if (price != null) {
                            priceStr = price.getPriceStr();
                        } else {
                            priceStr = null;
                        }
                        Price price2 = billItem2.itemPrice;
                        if (price2 != null) {
                            priceTextColor = price2.getPriceTextColor();
                        } else {
                            priceTextColor = null;
                        }
                        Price price3 = billItem2.itemPrice;
                        if (price3 != null) {
                            priceTextFont = price3.getPriceTextFont();
                        } else {
                            priceTextFont = null;
                        }
                        c808203Ds.setPriceWithConfig(new C21717319z1(priceStr, priceTextColor, priceTextFont, null, null, 24));
                        c808203Ds.setSeparatorWithConfig(true);
                        bonusItemContainerFromXml.addView(c808203Ds, layoutParams);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            C808003Dq.LJFF(C808003Dq.LIZLLL(c808103Dr, ((C714302qb) ajS20S0300000_1.l2).LIZ, false, null, 60), fragmentManager, null, null, 12);
        }
    }

    public static final void LIZ$42(AjS20S0300000_1 ajS20S0300000_1, View view) {
        List<String> list;
        if (view != null) {
            Function1<String, Unit> clickListener$ecommerce_transaction_release = ((C03DY) ajS20S0300000_1.l0).getClickListener$ecommerce_transaction_release();
            String str = ((ExposeUserRight) ajS20S0300000_1.l1).nameEn;
            if (str == null) {
                str = "";
            }
            clickListener$ecommerce_transaction_release.invoke(str);
            C1748720vbi.LIZLLL((C03C0) ajS20S0300000_1.l2, new C049Y(), new AwS580S0100000_1((ExposeUserRight) ajS20S0300000_1.l1, 803));
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C03DY) ajS20S0300000_1.l0).LLIZ;
            if (orderSubmitAssemViewModel != null && (list = orderSubmitAssemViewModel.LLLIIL) != null) {
                ((ArrayList) list).add("click_policy");
            }
        }
    }

    public static final void LIZ$43(AjS20S0300000_1 ajS20S0300000_1, View view) {
        List<String> list;
        if (view != null) {
            Function1<String, Unit> clickListener$ecommerce_transaction_release = ((C03AI) ajS20S0300000_1.l0).getClickListener$ecommerce_transaction_release();
            String str = ((ExposeUserRight) ajS20S0300000_1.l1).nameEn;
            if (str == null) {
                str = "";
            }
            clickListener$ecommerce_transaction_release.invoke(str);
            C1748720vbi.LIZLLL((C03AJ) ajS20S0300000_1.l2, new C049Y(), new AwS580S0100000_1((ExposeUserRight) ajS20S0300000_1.l1, 805));
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C03AI) ajS20S0300000_1.l0).LLILZLL;
            if (orderSubmitAssemViewModel != null && (list = orderSubmitAssemViewModel.LLLIIL) != null) {
                ((ArrayList) list).add("click_policy");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$44(g1c.AjS20S0300000_1 r21, android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS20S0300000_1.LIZ$44(g1c.AjS20S0300000_1, android.view.View):void");
    }

    public static final void LIZ$45(AjS20S0300000_1 ajS20S0300000_1, View view) {
        String str;
        if (view != null) {
            SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) ajS20S0300000_1.l0;
            C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
            if (c1054104Ah != null) {
                EntranceBubbleExtraInfo entranceBubbleExtraInfo = ((EntranceBubble) ajS20S0300000_1.l1).extraInfo;
                if (entranceBubbleExtraInfo != null) {
                    str = entranceBubbleExtraInfo.daInfo;
                } else {
                    str = null;
                }
                Map<String, Object> extraParams = ((C03GF) ajS20S0300000_1.l2).getExtraParams();
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                if (interfaceC1748810vbrLJJIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10516049i(), new AwS43S1300000_1(c1054104Ah, (C1054104Ah) seaPdpViewModel, (SeaPdpViewModel) str, (String) extraParams, (Map<String, ? extends Object>) 12));
                }
            }
            String str2 = ((EntranceBubble) ajS20S0300000_1.l1).schema;
            if (str2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from_merge", ((SeaPdpViewModel) ajS20S0300000_1.l0).OR2());
                C919503ib.LIZIZ(((C03GF) ajS20S0300000_1.l2).getContext(), str2, linkedHashMap, false).open();
            }
        }
    }

    public static final void LIZ$46(AjS20S0300000_1 ajS20S0300000_1, View view) {
        String strLJJIFFI;
        if (view != null && (strLJJIFFI = ((EntranceBubble) ajS20S0300000_1.l0).schema) != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJJIFFI), "source_btm_token");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "c55575.d52437";
            }
            new C10516049i().LJ((C959603p4) ajS20S0300000_1.l1, new AwS210S0300000_1((C959603p4) ajS20S0300000_1.l1, (SeaPdpViewModel) ajS20S0300000_1.l2, (EntranceBubble) ajS20S0300000_1.l0, 101), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, PageFinder.via((View) ajS20S0300000_1.l1));
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, PageFinder.via((View) ajS20S0300000_1.l1), null);
            if (strCreateJumpSourceBtmToken != null) {
                strLJJIFFI = u.LJJIFFI(strLJJIFFI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCreateJumpSourceBtmToken, false);
            } else {
                strCreateJumpSourceBtmToken = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from_merge", ((SeaPdpViewModel) ajS20S0300000_1.l2).OR2());
            if (strCreateJumpSourceBtmToken != null) {
                linkedHashMap.put("source_btm_token", strCreateJumpSourceBtmToken);
            }
            C919503ib.LIZIZ(((C959603p4) ajS20S0300000_1.l1).LLJIJIL, strLJJIFFI, linkedHashMap, false).open();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$47(g1c.AjS20S0300000_1 r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS20S0300000_1.LIZ$47(g1c.AjS20S0300000_1, android.view.View):void");
    }

    public static final void LIZ$48(AjS20S0300000_1 ajS20S0300000_1, View view) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str;
        if (view != null) {
            String str2 = ((EntranceBubble) ajS20S0300000_1.l0).schema;
            String str3 = null;
            if (str2 != null) {
                uri = UriProtector.parse(str2);
            } else {
                uri = null;
            }
            if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_btm_token")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "c55575.d52437";
            }
            PdpViewModel pdpViewModel = (PdpViewModel) ajS20S0300000_1.l1;
            C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                PageFinder pageFinderVia = PageFinder.via((View) ajS20S0300000_1.l2);
                EntranceBubbleExtraInfo entranceBubbleExtraInfo = ((EntranceBubble) ajS20S0300000_1.l0).extraInfo;
                if (entranceBubbleExtraInfo != null) {
                    str = entranceBubbleExtraInfo.daInfo;
                } else {
                    str = null;
                }
                Map<String, Object> extraParams = ((C03GG) ajS20S0300000_1.l2).getExtraParams();
                InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                if (interfaceC1748810vbrLJJIJLIJ != null) {
                    C1748720vbi.LIZ(interfaceC1748810vbrLJJIJLIJ, new C10516049i(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, pageFinderVia, new AwS43S1300000_1(c1054004Ag, (C1054004Ag) pdpViewModel, (PdpViewModel) str, (String) extraParams, (Map<String, ? extends Object>) 18));
                }
            }
            String strLJJIFFI = ((EntranceBubble) ajS20S0300000_1.l0).schema;
            if (strLJJIFFI != null) {
                String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, PageFinder.via((View) ajS20S0300000_1.l2), null);
                if (strCreateJumpSourceBtmToken != null) {
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCreateJumpSourceBtmToken, false);
                    str3 = strCreateJumpSourceBtmToken;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from_merge", ((PdpViewModel) ajS20S0300000_1.l1).IR2());
                if (str3 != null) {
                    linkedHashMap.put("source_btm_token", str3);
                }
                C919503ib.LIZIZ(((C03GG) ajS20S0300000_1.l2).getContext(), strLJJIFFI, linkedHashMap, false).open();
            }
        }
    }

    public static final void LIZ$49(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C1748720vbi.LIZLLL((TuxIconView) ajS20S0300000_1.l0, new C049Y(), AFwS228S0000000_1.get$arr$(842));
            FragmentManager fragmentManager = ((USHalfPageOrderSummaryFragment) ajS20S0300000_1.l1).getFragmentManager();
            if (fragmentManager != null) {
                C808003Dq.LJFF(C808003Dq.LIZLLL(C808003Dq.LJ(view.getContext(), R.attr.u_, 51, ((C722302rt) ajS20S0300000_1.l2).LLJJ), C7879035x.LIZ().getString(2131848100), false, new AwS650S0100000_1((TuxIconView) ajS20S0300000_1.l0, 28), 28), fragmentManager, null, new AwS545S0100000_1((TuxIconView) ajS20S0300000_1.l0, 1734), 4);
            }
        }
    }

    public static final void LIZ$5(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = ((USAggregationOrderCell) ajS20S0300000_1.l0).L5().hi1(false);
            mapHi1.put("rank", String.valueOf(((C719302rP) ajS20S0300000_1.l2).LLJJLIIIJLLLLLLLZ + 1));
            Map<String, String> map = ((C719302rP) ajS20S0300000_1.l2).LLJJIJIL;
            if (map != null) {
                mapHi1.putAll(map);
            }
            C03O0.LJJJLZIJ(c03o0, "perk_pack_shipping_saved", mapHi1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048572);
            String str = ((PurchaseRewardInfo) ajS20S0300000_1.l1).bannerSchema;
            if (str != null) {
                C919503ib.LIZIZ(((USAggregationOrderCell) ajS20S0300000_1.l0).itemView.getContext(), str, new LinkedHashMap(), false).open();
            }
        }
    }

    public static final void LIZ$50(AjS20S0300000_1 ajS20S0300000_1, View view) {
        FragmentManager supportFragmentManager;
        String string;
        Map mapLJIIZILJ;
        Object obj;
        if (view != null) {
            C19EG activity = ((USHalfPageOrderSummaryCell) ajS20S0300000_1.l0).getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                C03H4 c03h4 = USHalfPageOrderSummaryFragment.LLLII;
                String str = ((USHalfPageOrderSummaryCell) ajS20S0300000_1.l0).L5().n;
                ((USHalfPageOrderSummaryCell) ajS20S0300000_1.l0).L5();
                HashMap<String, Object> map = ((USHalfPageOrderSummaryCell) ajS20S0300000_1.l0).L5().LLLIL;
                if (map != null && (mapLJIIZILJ = C2097608Jq.LJIIZILJ(map)) != null && (obj = mapLJIIZILJ.get("source_page_type")) != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                c03h4.getClass();
                USHalfPageOrderSummaryFragment uSHalfPageOrderSummaryFragment = new USHalfPageOrderSummaryFragment();
                CommerceHorizonBottomSheetDialogFragment commerceHorizonBottomSheetDialogFragment = new CommerceHorizonBottomSheetDialogFragment();
                CommerceHorizonBottomSheetDialogFragment.dS(commerceHorizonBottomSheetDialogFragment, uSHalfPageOrderSummaryFragment);
                C928203k0.LIZ.getClass();
                commerceHorizonBottomSheetDialogFragment.cS(C928203k0.LJIIL(null, str, string));
                commerceHorizonBottomSheetDialogFragment.show(supportFragmentManager, "CommerceHorizonBottomSheetDialogFragment");
            }
            C1748720vbi.LIZLLL((View) ajS20S0300000_1.l1, new C10516049i(), new AwS367S0200000_1((C755502xF) ajS20S0300000_1.l2, (USHalfPageOrderSummaryCell) ajS20S0300000_1.l0, 335));
        }
    }

    public static final void LIZ$51(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            LogisticAdapter.LogisticViewHolder logisticViewHolder = (LogisticAdapter.LogisticViewHolder) ajS20S0300000_1.l0;
            logisticViewHolder.withState(logisticViewHolder.X5(), new AwS367S0200000_1((LogisticAdapter.LogisticViewHolder) ajS20S0300000_1.l0, (LogisticDTO) ajS20S0300000_1.l1, 44));
            String str = ((LogisticDTO) ajS20S0300000_1.l1).spendMoreForFree.schema;
            if (str != null) {
                ((LogisticAdapter.LogisticViewHolder) ajS20S0300000_1.l0).X5().AR2(((View) ajS20S0300000_1.l2).getContext(), str);
            }
        }
    }

    public static final void LIZ$52(AjS20S0300000_1 ajS20S0300000_1, View view) {
        SellerInfo sellerInfo;
        String str;
        Float fLJIIIIZZ;
        String str2;
        String str3;
        SellerInfo sellerInfo2;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null) {
            C1751470vg9 c1751470vg9 = (C1751470vg9) ajS20S0300000_1.l0;
            SeaPdpViewModel seaPdpViewModel = c1751470vg9.LL;
            if (!seaPdpViewModel.LLLLLLZ) {
                seaPdpViewModel.LLLLLLZ = true;
                c1751470vg9.L5((PDPShopPromotionData) ajS20S0300000_1.l1);
            }
            ProductPackStruct productPackStruct = ((C1751470vg9) ajS20S0300000_1.l0).LL.LLJIJIL;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (str = ((PDPShopPromotionData) ajS20S0300000_1.l1).shopPromotionSchema) != null) {
                String string = UriProtector.parse(str).buildUpon().appendQueryParameter(Scene.SCENE_SERVICE, "pdp_entry").build().toString();
                C1751470vg9 c1751470vg92 = (C1751470vg9) ajS20S0300000_1.l0;
                SeaPdpViewModel seaPdpViewModel2 = c1751470vg92.LL;
                Context context = c1751470vg92.itemView.getContext();
                String str4 = sellerInfo.sellerId;
                String str5 = sellerInfo.rating;
                List<SellerDetailInfo> list = null;
                if (str5 != null) {
                    fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str5);
                } else {
                    fLJIIIIZZ = null;
                }
                StoreLabel storeLabel = sellerInfo.storeLabel;
                if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                    str2 = storeOfficialLabel.labelTypeStr;
                } else {
                    str2 = null;
                }
                int iTg2 = ((C1751470vg9) ajS20S0300000_1.l0).LL.Tg2();
                SellerSellingPoint sellerSellingPoint = sellerInfo.sellerSellingPoint;
                if (sellerSellingPoint != null) {
                    str3 = sellerSellingPoint.sellingPoints;
                } else {
                    str3 = null;
                }
                ProductPackStruct productPackStruct2 = ((C1751470vg9) ajS20S0300000_1.l0).LL.LLJIJIL;
                if (productPackStruct2 != null && (sellerInfo2 = productPackStruct2.sellerInfo) != null) {
                    list = sellerInfo2.sellerDetailInfos;
                }
                SeaPdpViewModel.ZR2(seaPdpViewModel2, context, string, str4, fLJIIIIZZ, "pdp_shop_view_more_coupon", str2, iTg2, null, null, "pdp_shop_view_more_coupon", list, "view_more_product", str3, null, null, "c2857.d0", null, 975232);
            }
            C1054104Ah c1054104Ah = ((C1751470vg9) ajS20S0300000_1.l0).LL.LLJLIL;
            if (c1054104Ah != null) {
                Voucher voucher = (Voucher) ajS20S0300000_1.l2;
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                if (interfaceC1748810vbrLJJIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04C9(), new AwS1S2201000_1(1, voucher, c1054104Ah, "pdp_shop_view_more", "coupons", 2));
                }
            }
        }
    }

    public static final void LIZ$6(AjS20S0300000_1 ajS20S0300000_1, View view) {
        String str;
        String str2;
        Object obj;
        String str3;
        if (view != null) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = ((OrderSubmitAssemViewModel) ajS20S0300000_1.l0).hi1(false);
            mapHi1.put("click_area", "reminder");
            String str4 = null;
            C03O0.LJJJLZIJ(c03o0, "discount_reminder", mapHi1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048572);
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) ajS20S0300000_1.l0;
            C037J c037j = orderSubmitAssemViewModel.LLLJL;
            C720002rW c720002rW = (C720002rW) ajS20S0300000_1.l1;
            if (c720002rW != null) {
                str = c720002rW.LLIZ;
            } else {
                str = null;
            }
            c037j.LJ = str;
            C817603Hi c817603Hi = orderSubmitAssemViewModel.LLLZLZ;
            if (c720002rW != null) {
                str2 = c720002rW.LLJ;
            } else {
                str2 = null;
            }
            String strLJ = c817603Hi.LJ("c1196.d1198", str2, null);
            C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
            Context context = ((C800503At) ajS20S0300000_1.l2).getContext();
            if (strLJ == null) {
                strLJ = "";
            }
            HashMap<String, Object> map = ((OrderSubmitAssemViewModel) ajS20S0300000_1.l0).LLLIL;
            if (map != null) {
                obj = map.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            HashMap<String, Object> map2 = ((OrderSubmitAssemViewModel) ajS20S0300000_1.l0).LLLIL;
            C720002rW c720002rW2 = (C720002rW) ajS20S0300000_1.l1;
            if (c720002rW2 != null) {
                str4 = c720002rW2.LLIZ;
            }
            C1013103xh.LIZJ(c1013103xh, context, strLJ, str4, 3, str3, map2, null, null, null, null, 7936);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$7(AjS20S0300000_1 ajS20S0300000_1, View view) {
        boolean z;
        String str;
        C03CZ c03cz;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        if (view != null) {
            PlatformDiscountsCell platformDiscountsCell = (PlatformDiscountsCell) ajS20S0300000_1.l0;
            boolean zIsChecked = ((C0HZQ) ajS20S0300000_1.l1).isChecked();
            String str3 = ((PromotionCouponModule) ajS20S0300000_1.l2).bannerText;
            if (str3 != null && !a0.LJJJIL(str3)) {
                z = false;
            } else {
                z = true;
            }
            platformDiscountsCell.W5(zIsChecked, z);
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = ((PlatformDiscountsCell) ajS20S0300000_1.l0).T5().hi1(false);
            C720002rW c720002rW = (C720002rW) ((PlatformDiscountsCell) ajS20S0300000_1.l0).getItem();
            if (c720002rW != null && (str2 = c720002rW.LLJJIJIIJIL) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                mapHi1.putAll(mapLJIIJ);
            }
            if (((C0HZQ) ajS20S0300000_1.l1).isChecked()) {
                str = "select";
            } else {
                str = "cancel";
            }
            mapHi1.put("select_type", str);
            C03O0.LJJJLZIJ(c03o0, "plus_coupon_package", mapHi1, null, null, null, null, null, null, null, null, "open_card", null, ((PlatformDiscountsCell) ajS20S0300000_1.l0).T5().LLLZLZ.LIZ("c1196.d19683_w10405"), null, null, null, 966652);
            OrderSubmitAssemViewModel orderSubmitAssemViewModelT5 = ((PlatformDiscountsCell) ajS20S0300000_1.l0).T5();
            ChangeInfo changeInfo = new ChangeInfo(C03DI.PLUS_VOUCHER_CENTER.getValue(), null, null, null);
            if (((C0HZQ) ajS20S0300000_1.l1).isChecked()) {
                c03cz = C03CZ.USER_SELECTED;
            } else {
                c03cz = C03CZ.INVERTED_SELECTED;
            }
            OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModelT5, false, false, null, false, false, false, null, null, false, null, null, changeInfo, null, null, null, null, null, Integer.valueOf(c03cz.getValue()), null, null, null, 7856127);
        }
    }

    public static final void LIZ$8(AjS20S0300000_1 ajS20S0300000_1, View view) {
        if (view != null) {
            if (((SeaOneStepProductInfoAssem) ajS20S0300000_1.l0).hp().LLJILJIL) {
                ((SeaOneStepProductInfoAssem) ajS20S0300000_1.l0).hp().EQ2(false);
                return;
            }
            SeaOneStepProductInfoAssem seaOneStepProductInfoAssem = (SeaOneStepProductInfoAssem) ajS20S0300000_1.l0;
            seaOneStepProductInfoAssem.withState(seaOneStepProductInfoAssem.hp(), new AwS580S0100000_1((SeaOneStepProductInfoAssem) ajS20S0300000_1.l0, 100));
            C1748720vbi.LJ((SmartImageView) ajS20S0300000_1.l1, new C10516049i(), "c5555.d0", PageFinder.via((View) ajS20S0300000_1.l2), new AwS580S0100000_1((SeaOneStepProductInfoAssem) ajS20S0300000_1.l0, 101));
        }
    }

    public static final void LIZ$9(AjS20S0300000_1 ajS20S0300000_1, View view) {
        ButtonStyle buttonStyleLJIILLIIL;
        boolean z;
        if (view != null) {
            C882003cY c882003cY = new C882003cY((Context) ajS20S0300000_1.l0);
            String content = ((PaymentServiceFeeInfoToolTips) ajS20S0300000_1.l1).getContent();
            String str = "";
            if (content == null) {
                content = "";
            }
            String buttonText = ((PaymentServiceFeeInfoToolTips) ajS20S0300000_1.l1).getButtonText();
            if (buttonText == null) {
                buttonText = "";
            }
            EnterParams enterParams = ((PaymentFragment) ajS20S0300000_1.l2).LLJJJJLIIL;
            PaymentMethodsData paymentMethodsData = enterParams.paymentData;
            if (paymentMethodsData != null) {
                buttonStyleLJIILLIIL = paymentMethodsData.LJIILLIIL(enterParams.LJJIJIIJI);
            } else {
                buttonStyleLJIILLIIL = null;
            }
            if (buttonStyleLJIILLIIL == ButtonStyle.TOKO_STYLE) {
                z = true;
            } else {
                z = false;
            }
            c882003cY.e0(content, buttonText, z);
            String title = ((PaymentServiceFeeInfoToolTips) ajS20S0300000_1.l1).getTitle();
            if (title != null) {
                str = title;
            }
            TuxSheet tuxSheetLIZLLL = C808003Dq.LIZLLL(c882003cY, str, false, null, 60);
            C786410Ut5.I7(new AjS60S0100000_1((Function0) new AwS545S0100000_1(tuxSheetLIZLLL, 930), 9), c882003cY.getServiceFeeButtonFromXml());
            FragmentManager fragmentManager = ((PaymentFragment) ajS20S0300000_1.l2).getFragmentManager();
            if (fragmentManager != null) {
                C808003Dq.LJFF(tuxSheetLIZLLL, fragmentManager, null, null, 12);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS20S0300000_1(com.bytedance.tux.input.TuxTextView r4, X.C719202rO r5, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell r6, int r7) {
        /*
            r3 = this;
            r3.$t = r7
            int r7 = 36 - r7
            if (r7 == 0) goto L13
            r2 = r3
            r2.l0 = r6
            r2.l1 = r5
            r2.l2 = r4
            r0 = 700(0x2bc, double:3.46E-321)
        Lf:
            r2.<init>(r0)
            return
        L13:
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r2.l2 = r6
            r0 = 700(0x2bc, double:3.46E-321)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS20S0300000_1.<init>(com.bytedance.tux.input.TuxTextView, X.02rO, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AjS20S0300000_1(android.view.View r4, X.AnonymousClass0376 r5, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspAddressCell r6, int r7) {
        /*
            r3 = this;
            r3.$t = r7
            if (r7 == 0) goto L11
            r2 = r3
            r2.l0 = r6
            r2.l1 = r4
            r2.l2 = r5
            r0 = 700(0x2bc, double:3.46E-321)
        Ld:
            r2.<init>(r0)
            return
        L11:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r6
            r2.l2 = r4
            r0 = 700(0x2bc, double:3.46E-321)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS20S0300000_1.<init>(android.view.View, X.0376, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspAddressCell, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS20S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS20S0300000_1(AnonymousClass0434 anonymousClass0434, C04E4 c04e4, PdpButton pdpButton, int i, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = anonymousClass0434;
        this.l1 = c04e4;
        this.l2 = pdpButton;
    }
}
