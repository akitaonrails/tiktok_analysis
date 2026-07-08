package kotlin.jvm.internal;

import X.AnonymousClass0378;
import X.C02Y8;
import X.C033Y;
import X.C034C;
import X.C037O;
import X.C037U;
import X.C03EA;
import X.C03GU;
import X.C03J5;
import X.C03JD;
import X.C03JE;
import X.C03O0;
import X.C03O1;
import X.C03PI;
import X.C03SE;
import X.C03SY;
import X.C03WH;
import X.C03WK;
import X.C03Y1;
import X.C03Z4;
import X.C03ZB;
import X.C03ZC;
import X.C03ZD;
import X.C03ZM;
import X.C048H;
import X.C048W;
import X.C049Y;
import X.C04E1;
import X.C04E4;
import X.C04EC;
import X.C04FA;
import X.C04H5;
import X.C04HT;
import X.C04IE;
import X.C04JD;
import X.C09AY;
import X.C0HZQ;
import X.C0OM3;
import X.C0PEM;
import X.C1004203wG;
import X.C1008503wx;
import X.C1018703yb;
import X.C1025503zh;
import X.C10516049i;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C118300cf;
import X.C123100dR;
import X.C1235760iGM;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LP;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1745060vVo;
import X.C1748720vbi;
import X.C1748730vbj;
import X.C1755030vlt;
import X.C1854760yMk;
import X.C19EG;
import X.C1AF0;
import X.C1DFH;
import X.C20691715xz;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C2327809Ae;
import X.C259800zU;
import X.C343970De7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426160GnO;
import X.C426350Gnh;
import X.C426750GoL;
import X.C441730HTv;
import X.C703502or;
import X.C719302rP;
import X.C765002ym;
import X.C770702zh;
import X.C7731030f;
import X.C7768031q;
import X.C786410Ut5;
import X.C7911037d;
import X.C807203Di;
import X.C814420VxA;
import X.C817503Hh;
import X.C862603Yq;
import X.C867003a8;
import X.C873003b6;
import X.C873103b7;
import X.C876303bd;
import X.C877103bl;
import X.C877303bn;
import X.C890103dr;
import X.C897503f3;
import X.C897703f5;
import X.C898300ZLw;
import X.C903603g2;
import X.C904503gB;
import X.C926003je;
import X.C928203k0;
import X.C942503mJ;
import X.C948503nH;
import X.C958503ot;
import X.C960203pA;
import X.C960603pE;
import X.C961803pQ;
import X.C961903pR;
import X.C965403q0;
import X.C968703qX;
import X.C985403tE;
import X.C990503u3;
import X.EnumC805003Cm;
import X.InterfaceC1071204Gw;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC911103hF;
import X.InterfaceC954103oB;
import X.InterfaceC975703rf;
import X.ViewOnClickListenerC7909037b;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListActivity;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSubViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspSkuItemCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.OspAggregationOrderModuleViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.logistics.USHalfLogisticsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.sns.OneStepSnsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.viewholder.ATMSaveNewCardViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.CreditCardInstallmentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.SaveNewCardViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RecoveryMarketingInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfoContent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DonationModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LeadingElevatorBar;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsOptionButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier.USCashierPaymentMethodVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.SeaPdpBottomNavBarWidgetBff;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.logisticis.SeaShippingVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.onereview.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.RatingInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shop.SeaOfficialShopProfileVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuBottomAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuPanelBaseAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBottomWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.InlineLink;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import defpackage.h3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AwS402S0200000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        Address address = (Address) awS402S0200000_1.l0;
        HashMap<String, Object> mapLJIIJ = null;
        if (address != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C961803pQ(address, null), 3);
        }
        C03O0 c03o0 = C03O0.LIZ;
        DialogContent dialogContent = (DialogContent) awS402S0200000_1.l1;
        if (dialogContent != null && (str = dialogContent.daInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        }
        c03o0.getClass();
        C03O0.LJJJI("confirm", mapLJIIJ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        Address address = (Address) awS402S0200000_1.l0;
        HashMap<String, Object> mapLJIIJ = null;
        if (address != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C961903pR(address, null), 3);
        }
        C03O0 c03o0 = C03O0.LIZ;
        DialogContent dialogContent = (DialogContent) awS402S0200000_1.l1;
        if (dialogContent != null && (str = dialogContent.daInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        }
        c03o0.getClass();
        C03O0.LJJJI("confirm", mapLJIIJ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS402S0200000_1 awS402S0200000_1) {
        ((LogisticAdapter.LogisticViewHolder) awS402S0200000_1.l0).X5().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$100(AwS402S0200000_1 awS402S0200000_1) {
        OneStepSnsCell oneStepSnsCell = (OneStepSnsCell) awS402S0200000_1.l0;
        SnsOptionButton snsOptionButton = (SnsOptionButton) awS402S0200000_1.l1;
        oneStepSnsCell.getClass();
        String strLIZ = snsOptionButton.buttonName;
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (a0.LJJJIL(strLIZ)) {
            strLIZ = C7911037d.LIZ(snsOptionButton.buttonText);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("one_step_sns_option_");
        sbLIZ.append(strLIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$101(AwS402S0200000_1 awS402S0200000_1) {
        OneStepSnsCell oneStepSnsCell = (OneStepSnsCell) awS402S0200000_1.l0;
        SnsPeriodInfo snsPeriodInfo = (SnsPeriodInfo) awS402S0200000_1.l1;
        oneStepSnsCell.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("one_step_sns_period_");
        sbLIZ.append(oneStepSnsCell.LLJJI);
        sbLIZ.append(':');
        sbLIZ.append(snsPeriodInfo.periodUnit);
        sbLIZ.append(':');
        sbLIZ.append(snsPeriodInfo.period);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$102(AwS402S0200000_1 awS402S0200000_1) {
        ((USLogisticVH) awS402S0200000_1.l0).a6().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$103(AwS402S0200000_1 awS402S0200000_1) {
        ((USLogisticVH) awS402S0200000_1.l0).a6().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$104(AwS402S0200000_1 awS402S0200000_1) {
        ((LogisticSubViewHolder) awS402S0200000_1.l0).X5().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$105(AwS402S0200000_1 awS402S0200000_1) {
        ((LogisticSubViewHolder) awS402S0200000_1.l0).X5().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$106(AwS402S0200000_1 awS402S0200000_1) {
        ((LogisticSubViewHolder) awS402S0200000_1.l0).X5().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$107(AwS402S0200000_1 awS402S0200000_1) {
        String str = ((C037O) awS402S0200000_1.l0).LIZ.LLLFF;
        if (Intrinsics.LJFF(str, "query_bill_info")) {
            OrderSubmitAssemViewModel.OS2(((C037O) awS402S0200000_1.l0).LIZ, false, false, null, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388607);
        } else if (Intrinsics.LJFF(str, "create_order")) {
            OrderSubmitAssemViewModel.AQ2(((C037O) awS402S0200000_1.l0).LIZ, (Context) awS402S0200000_1.l1, null, null, null, 30);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$108(AwS402S0200000_1 awS402S0200000_1) {
        C037O c037o = (C037O) awS402S0200000_1.l0;
        OrderSubmitAssemViewModel.JS2(c037o.LIZ, (Context) awS402S0200000_1.l1, C960603pE.LJ(c037o.LIZIZ), null, null, false, null, false, 248);
        return Unit.LIZ;
    }

    public static final Object invoke$109(AwS402S0200000_1 awS402S0200000_1) {
        C1748720vbi.LIZLLL((h3) awS402S0200000_1.l0, new C049Y(), new AwS580S0100000_1((HashMap) awS402S0200000_1.l1, (HashMap<String, Object>) 1005));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS402S0200000_1 awS402S0200000_1) {
        ((LogisticAdapter.LogisticViewHolder) awS402S0200000_1.l0).X5().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$110(AwS402S0200000_1 awS402S0200000_1) {
        C1748720vbi.LIZLLL((h3) awS402S0200000_1.l0, new C049Y(), new AwS580S0100000_1((HashMap) awS402S0200000_1.l1, (HashMap<String, Object>) 1006));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$111(kotlin.jvm.internal.AwS402S0200000_1 r22) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.invoke$111(kotlin.jvm.internal.AwS402S0200000_1):java.lang.Object");
    }

    public static final Object invoke$112(AwS402S0200000_1 awS402S0200000_1) {
        RecyclerView.LayoutManager layoutManager;
        LeadingElevatorBar leadingElevatorBar = (LeadingElevatorBar) awS402S0200000_1.l0;
        int i = 0;
        if (leadingElevatorBar != null) {
            Integer num = leadingElevatorBar.type;
            int value = EnumC805003Cm.ONE_STEP_PAYMENT.getValue();
            if (num != null && num.intValue() == value) {
                Iterator<InterfaceC1891350zJl> it2 = ((SeaOneStepOrderSubmitFragment) awS402S0200000_1.l1).bS().getState().LLILLJJLI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next() instanceof C7768031q) {
                        if (i > 0) {
                            C04JD c04jd = new C04JD(((SeaOneStepOrderSubmitFragment) awS402S0200000_1.l1).getContext(), 1);
                            c04jd.LIZ = i;
                            C20691715xz c20691715xz = ((SeaOneStepOrderSubmitFragment) awS402S0200000_1.l1).LLJJIJIIJIL;
                            if (c20691715xz != null && (layoutManager = c20691715xz.getLayoutManager()) != null) {
                                layoutManager.startSmoothScroll(c04jd);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$113(AwS402S0200000_1 awS402S0200000_1) {
        PdpViewModel pdpViewModel = (PdpViewModel) awS402S0200000_1.l0;
        return pdpViewModel.nR2(pdpViewModel.Pv0(), (Integer) awS402S0200000_1.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$114(kotlin.jvm.internal.AwS402S0200000_1 r65) {
        /*
            Method dump skipped, instruction units count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.invoke$114(kotlin.jvm.internal.AwS402S0200000_1):java.lang.Object");
    }

    public static final Object invoke$115(AwS402S0200000_1 awS402S0200000_1) {
        View view = (View) awS402S0200000_1.l0;
        if (view != null) {
            SkuPanelBaseAssem skuPanelBaseAssem = (SkuPanelBaseAssem) ((InterfaceC954103oB) awS402S0200000_1.l1);
            skuPanelBaseAssem.getViewModel().wQ2(view.getContext(), C960603pE.LIZLLL(view), skuPanelBaseAssem.ip(), 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$116(AwS402S0200000_1 awS402S0200000_1) {
        ((SkuPanelBaseAssem) ((InterfaceC954103oB) awS402S0200000_1.l0)).getViewModel().OG(true);
        SkuPanelAssemVM skuPanelAssemVMKp = ((SkuPanelBaseAssem) ((InterfaceC954103oB) awS402S0200000_1.l0)).getViewModel();
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJI(skuPanelAssemVMKp, C2107308Nj.LIZ, new C03Y1((InterfaceC954103oB) awS402S0200000_1.l0, (C04E4) awS402S0200000_1.l1, null));
        return Unit.LIZ;
    }

    public static final Object invoke$117(AwS402S0200000_1 awS402S0200000_1) {
        View viewFindViewById = ((C0OM3) awS402S0200000_1.l0).findViewById(R.id.d1x);
        if (viewFindViewById != null) {
            Context context = (Context) awS402S0200000_1.l1;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1r);
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
            return viewFindViewById;
        }
        return null;
    }

    public static final Object invoke$118(AwS402S0200000_1 awS402S0200000_1) {
        boolean zOnBackPressed = ((DistrictFragment) awS402S0200000_1.l0).onBackPressed();
        if (!zOnBackPressed) {
            ((C965403q0) awS402S0200000_1.l1).LLJI.LLJ = AFwS185S0000000_1.get$arr$(543);
        }
        return Boolean.valueOf(zOnBackPressed);
    }

    public static final Object invoke$12(AwS402S0200000_1 awS402S0200000_1) {
        C877103bl.LIZLLL((C867003a8) awS402S0200000_1.l0, (C877303bn) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS402S0200000_1 awS402S0200000_1) {
        CciCashierDisplayType cciCashierDisplayType;
        String str;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData;
        C03ZC c03zc = (C03ZC) awS402S0200000_1.l0;
        PaymentMethod paymentMethod3 = c03zc.LLLIIIIL;
        if (paymentMethod3 != null) {
            paymentMethod3.LJJI = true;
        }
        if (paymentMethod3 != null) {
            paymentMethod3.LJJIFFI = false;
        }
        C03SY c03sy = C03SY.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = c03zc.LLLJIL;
        if (orderSubmitAssemViewModel != null && (billInfoData = orderSubmitAssemViewModel.LLJJI) != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            cciCashierDisplayType = paymentMethodsData.cciCashierDisplayType;
        } else {
            cciCashierDisplayType = null;
        }
        if (paymentMethod3 != null) {
            str = paymentMethod3.id;
        } else {
            str = null;
        }
        c03sy.getClass();
        boolean zLIZLLL = C03SY.LIZLLL(cciCashierDisplayType, str);
        PaymentMethod paymentMethod4 = c03zc.LLLIIIIL;
        if (((paymentMethod4 != null && paymentMethod4.LJJJLZIJ()) || zLIZLLL) && (paymentMethod2 = c03zc.LLLIIIIL) != null) {
            paymentMethod2.LJJI = false;
        }
        if (C03SY.LIZJ(c03zc.LLLIIIIL) || (((paymentMethod = c03zc.LLLIIIIL) != null && paymentMethod.LJJJJLI()) || zLIZLLL)) {
            c03zc.LLLIILIL.invoke();
        } else {
            c03zc.LJ(true);
        }
        C03O0 c03o0 = C03O0.LIZ;
        PaymentMethod paymentMethod5 = (PaymentMethod) awS402S0200000_1.l1;
        c03o0.getClass();
        C03O0.LJLLLL(paymentMethod5, null);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS402S0200000_1 awS402S0200000_1) {
        Function0 function0 = (Function0) awS402S0200000_1.l0;
        if (function0 != null) {
            function0.invoke();
        } else {
            C890103dr.LJFF(C890103dr.LIZ, "back", null, null, null, null, null, null, 126);
            ((CreditCardInstallmentFragment) awS402S0200000_1.l1).iS();
        }
        C890103dr.LJFF(C890103dr.LIZ, "back", null, null, null, null, null, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS402S0200000_1 awS402S0200000_1) {
        InterfaceC911103hF interfaceC911103hF;
        PaymentMethodsData paymentMethodsData = ((C897703f5) awS402S0200000_1.l0).LJJIIJZLJL;
        if ((paymentMethodsData == null || !paymentMethodsData.LJJ()) && (interfaceC911103hF = (InterfaceC911103hF) awS402S0200000_1.l1) != null) {
            interfaceC911103hF.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS402S0200000_1 awS402S0200000_1) {
        ((PaymentViewModel) awS402S0200000_1.l0).MR2((PaymentMethod) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS402S0200000_1 awS402S0200000_1) {
        Function1 function1 = (Function1) awS402S0200000_1.l0;
        if (function1 != null) {
            function1.invoke((C03ZM) awS402S0200000_1.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS402S0200000_1 awS402S0200000_1) {
        PaymentViewModel paymentViewModelYS = ((PaymentFragment) awS402S0200000_1.l0).yS();
        Context context = (Context) awS402S0200000_1.l1;
        paymentViewModelYS.getClass();
        paymentViewModelYS.withState(new AwS367S0200000_1(paymentViewModelYS, context, 94));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS402S0200000_1 awS402S0200000_1) {
        if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((PaymentViewModel) awS402S0200000_1.l1).LLJJJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        OrderSubmitAssemViewModel ospAssemViewModel = ((C03ZB) awS402S0200000_1.l0).getOspAssemViewModel();
        if (ospAssemViewModel != null) {
            RecoveryMarketingInfo recoveryMarketingInfo = ((PaymentMethod) awS402S0200000_1.l1).recoveryMarketingInfo;
            String str2 = null;
            if (recoveryMarketingInfo != null) {
                str = recoveryMarketingInfo.voucherId;
                str2 = recoveryMarketingInfo.channel;
            } else {
                str = null;
            }
            ospAssemViewModel.PS2(str, str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS402S0200000_1 awS402S0200000_1) {
        if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((PaymentViewModel) awS402S0200000_1.l1).LLJJJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS402S0200000_1 awS402S0200000_1) {
        if (((AtomicBoolean) awS402S0200000_1.l0).compareAndSet(false, true)) {
            ((Function0) awS402S0200000_1.l1).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS402S0200000_1 awS402S0200000_1) {
        if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((USCashierPaymentMethodVH) awS402S0200000_1.l1).W5().LLJJJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS402S0200000_1 awS402S0200000_1) {
        boolean z;
        EnterParams enterParams;
        EnterParams enterParams2;
        try {
            boolean z2 = true;
            if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((USCashierPaymentMethodVH) awS402S0200000_1.l1).W5().LLJJJ) && (((enterParams = ((USCashierPaymentMethodVH) awS402S0200000_1.l1).W5().LLJ) == null || !enterParams.LIZLLL()) && ((enterParams2 = ((USCashierPaymentMethodVH) awS402S0200000_1.l1).W5().LLJ) == null || !enterParams2.LJJIFFI))) {
                z = true;
            } else {
                z = false;
            }
            if (!(((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) || !C897503f3.LJI(((USCashierPaymentMethodVH) awS402S0200000_1.l1).W5().LLJ)) {
                z2 = false;
            }
            if (z || z2) {
                ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS402S0200000_1 awS402S0200000_1) {
        C04EC c04ec = ((SeaPdpBottomNavBarWidgetBff) awS402S0200000_1.l0).LLJJ;
        if (c04ec != null) {
            c04ec.LIZIZ(((SeaPdpMainState) awS402S0200000_1.l1).getBottomBarData().LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS402S0200000_1 awS402S0200000_1) {
        List<ReviewFilterStruct> list;
        SeaPdpViewModel seaPdpViewModelC6;
        C1054104Ah c1054104Ah;
        C04IE c04ie = (C04IE) awS402S0200000_1.l0;
        if (c04ie != null && (list = c04ie.LLILLL) != null) {
            PdpReviewHeadViewHolder pdpReviewHeadViewHolder = (PdpReviewHeadViewHolder) awS402S0200000_1.l1;
            int i = 0;
            for (ReviewFilterStruct reviewFilterStruct : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ReviewFilterStruct reviewFilterStruct2 = reviewFilterStruct;
                    Integer num = reviewFilterStruct2.type;
                    if (num != null && num.intValue() == 3 && (seaPdpViewModelC6 = pdpReviewHeadViewHolder.c6()) != null && (c1054104Ah = seaPdpViewModelC6.LLJLIL) != null) {
                        c1054104Ah.LJIJJLI(i2, reviewFilterStruct2, "review_entrance");
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS402S0200000_1 awS402S0200000_1) {
        SeaPdpViewModel seaPdpViewModelFS = ((SeaPdpFragment) awS402S0200000_1.l0).FS();
        View view = (View) awS402S0200000_1.l1;
        SeaPdpViewModel.kR2(seaPdpViewModelFS, view, view, null, 1, null, null, null, null, null, 4056);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS402S0200000_1 awS402S0200000_1) {
        return ((SeaPdpViewModel) awS402S0200000_1.l0).qR2((SkuPanelState) awS402S0200000_1.l1);
    }

    public static final Object invoke$28(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        String str2;
        C1054104Ah c1054104Ah = ((SeaPdpBodyWidget) awS402S0200000_1.l0).LJIIIZ().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJIII("showcase_detail", false, null, null, C2097608Jq.LJ(), null, null, null);
        }
        C703502or c703502or = (C703502or) awS402S0200000_1.l1;
        String str3 = c703502or.LLIZ;
        SeaPdpBodyWidget seaPdpBodyWidget = (SeaPdpBodyWidget) awS402S0200000_1.l0;
        if (str3 != null && !a0.LJJJIL(str3)) {
            SeaPdpViewModel seaPdpViewModelLJIIIZ = seaPdpBodyWidget.LJIIIZ();
            String str4 = c703502or.LL;
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(c703502or.LLILZIL);
            StoreOfficialLabel storeOfficialLabel = c703502or.LLIZLLLIL;
            if (storeOfficialLabel != null) {
                str = storeOfficialLabel.labelTypeStr;
            } else {
                str = null;
            }
            List<SellerDetailInfo> list = c703502or.LLJI;
            SellerSellingPoint sellerSellingPoint = c703502or.LLJJ;
            if (sellerSellingPoint != null) {
                str2 = sellerSellingPoint.sellingPoints;
            } else {
                str2 = null;
            }
            SeaPdpViewModel.pS2(seaPdpViewModelLJIIIZ, str4, fLJIIIIZZ, "showcase_detail", str, list, str2, "c2857.d0", null, 1408);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS402S0200000_1 awS402S0200000_1) {
        Float fLJIIIIZZ;
        String str;
        C1054104Ah c1054104Ah = ((SeaPdpBodyWidget) awS402S0200000_1.l0).LJIIIZ().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJIII("showcase_detail", false, null, null, C2097608Jq.LJ(), null, null, null);
        }
        SeaOfficialShopProfileVO seaOfficialShopProfileVO = (SeaOfficialShopProfileVO) awS402S0200000_1.l1;
        String str2 = seaOfficialShopProfileVO.shopLink;
        SeaPdpBodyWidget seaPdpBodyWidget = (SeaPdpBodyWidget) awS402S0200000_1.l0;
        if (str2 != null && !a0.LJJJIL(str2)) {
            SeaPdpViewModel seaPdpViewModelLJIIIZ = seaPdpBodyWidget.LJIIIZ();
            RatingInfo ratingInfo = seaOfficialShopProfileVO.ratingInfo;
            if (ratingInfo != null && (str = ratingInfo.rating) != null) {
                fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str);
            } else {
                fLJIIIIZZ = null;
            }
            SeaPdpViewModel.pS2(seaPdpViewModelLJIIIZ, null, fLJIIIIZZ, null, null, null, null, "c2857.d0", seaOfficialShopProfileVO.daInfo, 480);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS402S0200000_1 awS402S0200000_1) {
        PaymentInfoViewModel paymentInfoViewModel = ((C03ZB) awS402S0200000_1.l0).getPaymentInfoViewModel();
        if (paymentInfoViewModel != null) {
            paymentInfoViewModel.yQ2(((C03ZB) awS402S0200000_1.l0).getContext(), (PaymentMethod) awS402S0200000_1.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$30(kotlin.jvm.internal.AwS402S0200000_1 r10) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.invoke$30(kotlin.jvm.internal.AwS402S0200000_1):java.lang.Object");
    }

    public static final Object invoke$31(AwS402S0200000_1 awS402S0200000_1) {
        C1748720vbi.LIZIZ((UserRightFragment) awS402S0200000_1.l0, new C048H(), new AwS580S0100000_1((UserRightFragment) awS402S0200000_1.l0, 250));
        String str = ((ContactDetail) awS402S0200000_1.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((UserRightFragment) awS402S0200000_1.l0).getContext(), UriProtector.parse(str).toString()).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS402S0200000_1 awS402S0200000_1) {
        C1748720vbi.LIZIZ((UserRightFragment) awS402S0200000_1.l0, new C048H(), new AwS580S0100000_1((UserRightFragment) awS402S0200000_1.l0, 251));
        String str = ((ContactDetail) awS402S0200000_1.l1).link;
        if (str != null) {
            UserRightFragment userRightFragment = (UserRightFragment) awS402S0200000_1.l0;
            Context context = userRightFragment.getContext();
            C03GU c03gu = userRightFragment.LLJI;
            String string = UriProtector.parse(str).toString();
            String strLJ = c03gu.LIZ.LJ("c8914.d62909", string, null);
            if (strLJ != null) {
                string = strLJ;
            }
            SmartRouter.buildRoute(context, string).open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS402S0200000_1 awS402S0200000_1) {
        UserRightFragment userRightFragment = (UserRightFragment) awS402S0200000_1.l0;
        String str = ((PrivacyPolicy) awS402S0200000_1.l1).nameEn;
        if (str == null) {
            str = "terms_of_use_and_sale";
        }
        userRightFragment.aS(str);
        String str2 = ((PrivacyPolicy) awS402S0200000_1.l1).link;
        if (str2 != null) {
            SmartRouter.buildRoute(((UserRightFragment) awS402S0200000_1.l0).ZR().getContext(), UriProtector.parse(str2).toString()).open();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$34(kotlin.jvm.internal.AwS402S0200000_1 r10) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.invoke$34(kotlin.jvm.internal.AwS402S0200000_1):java.lang.Object");
    }

    public static final Object invoke$35(AwS402S0200000_1 awS402S0200000_1) {
        String instanceKey;
        InstanceInfo instanceInfo;
        C04H5 c04h5 = ((PdpViewModel) awS402S0200000_1.l0).LLLLL;
        String voucherTypeID = ((Voucher) awS402S0200000_1.l1).getVoucherTypeID();
        List<InstanceInfo> instanceInfoList = ((Voucher) awS402S0200000_1.l1).getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null) {
            instanceKey = instanceInfo.getInstanceKey();
        } else {
            instanceKey = null;
        }
        c04h5.LIZJ(voucherTypeID, instanceKey, true);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS402S0200000_1 awS402S0200000_1) {
        boolean z;
        ProductPackStruct productPackStruct = ((PdpViewModel) awS402S0200000_1.l0).LLJILLL;
        if (productPackStruct != null && productPackStruct.LIZJ((SkuPanelState) awS402S0200000_1.l1) != null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$37(AwS402S0200000_1 awS402S0200000_1) {
        boolean z;
        ProductPackStruct productPackStruct = ((PdpViewModel) awS402S0200000_1.l0).LLJILLL;
        if (productPackStruct != null && productPackStruct.LIZJ((SkuPanelState) awS402S0200000_1.l1) != null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$38(AwS402S0200000_1 awS402S0200000_1) {
        if (((SizeGuide) awS402S0200000_1.l0) != null) {
            C03EA c03ea = C03EA.LIZ;
            C04FA c04fa = (C04FA) awS402S0200000_1.l1;
            SizeGuide sizeGuide = (SizeGuide) awS402S0200000_1.l0;
            c03ea.getClass();
            return C03EA.LIZ(c04fa, sizeGuide, 51);
        }
        return null;
    }

    public static final Object invoke$39(AwS402S0200000_1 awS402S0200000_1) {
        SkuPanelBaseWidget skuPanelBaseWidget = (SkuPanelBaseWidget) awS402S0200000_1.l0;
        skuPanelBaseWidget.withState(skuPanelBaseWidget.LJII(), new AwS580S0100000_1((C426350Gnh) awS402S0200000_1.l1, 299));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS402S0200000_1 awS402S0200000_1) {
        C03O1 c03o1;
        String str;
        String str2;
        Boolean boolValueOf;
        HashMap<String, Object> map;
        boolean z;
        Availability availability;
        String str3;
        String str4;
        String strLJIJJ;
        BillInfoData billInfoData;
        HashMap<String, Object> map2;
        boolean z2;
        Availability availability2;
        ((C03ZB) awS402S0200000_1.l0).getOnActivateClickListener().invoke((PaymentMethod) awS402S0200000_1.l1);
        if (((C03ZB) awS402S0200000_1.l0).getOspMiniVM() == null) {
            C03O0 c03o0 = C03O0.LIZ;
            PaymentMethod paymentMethod = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
            if (paymentMethod != null) {
                str3 = paymentMethod.extraInfo;
            } else {
                str3 = null;
            }
            boolean zLIZIZ = C770702zh.LIZIZ(str3);
            PaymentMethod paymentMethod2 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
            if (paymentMethod2 != null && (availability2 = paymentMethod2.availability) != null) {
                str4 = availability2.statusCode;
            } else {
                str4 = null;
            }
            PaymentMethod paymentMethod3 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
            if (paymentMethod3 != null) {
                strLJIJJ = paymentMethod3.LJIJJ(false);
            } else {
                strLJIJJ = null;
            }
            Boolean boolValueOf2 = Boolean.valueOf(C770702zh.LIZIZ(strLJIJJ));
            PaymentMethod paymentMethod4 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
            PaymentMethod paymentMethod5 = (PaymentMethod) awS402S0200000_1.l1;
            C03SE c03se = C03PI.LJIJI;
            OrderSubmitAssemViewModel ospAssemViewModel = ((C03ZB) awS402S0200000_1.l0).getOspAssemViewModel();
            if (ospAssemViewModel != null) {
                billInfoData = ospAssemViewModel.LLJJI;
            } else {
                billInfoData = null;
            }
            PaymentMethod paymentMethod6 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
            c03se.getClass();
            String strLJIILLIIL = C03SE.LJIILLIIL(billInfoData, paymentMethod6);
            OrderSubmitAssemViewModel ospAssemViewModel2 = ((C03ZB) awS402S0200000_1.l0).getOspAssemViewModel();
            if (ospAssemViewModel2 != null) {
                map2 = ospAssemViewModel2.LLLIL;
            } else {
                map2 = null;
            }
            PaymentInfo paymentInfo = ((C03ZB) awS402S0200000_1.l0).getPaymentInfo();
            if (paymentInfo != null && paymentInfo.LIZJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C03O0.LJLL(c03o0, "GCASH", "bounded_GCASH", 1, zLIZIZ, str4, null, null, null, null, boolValueOf2, paymentMethod4, paymentMethod5, null, strLJIILLIIL, map2, false, z2, null, 3819456);
        } else {
            MiniOspViewModel ospMiniVM = ((C03ZB) awS402S0200000_1.l0).getOspMiniVM();
            if (ospMiniVM != null && (c03o1 = ospMiniVM.LLILZLL) != null) {
                PaymentMethod paymentMethod7 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
                if (paymentMethod7 != null) {
                    str = paymentMethod7.extraInfo;
                } else {
                    str = null;
                }
                boolean zLIZIZ2 = C770702zh.LIZIZ(str);
                PaymentMethod paymentMethod8 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
                if (paymentMethod8 != null && (availability = paymentMethod8.availability) != null) {
                    str2 = availability.statusCode;
                } else {
                    str2 = null;
                }
                PaymentMethod paymentMethod9 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
                if (paymentMethod9 != null) {
                    boolValueOf = Boolean.valueOf(paymentMethod9.LJJJJZI());
                } else {
                    boolValueOf = null;
                }
                PaymentMethod paymentMethod10 = ((C03ZB) awS402S0200000_1.l0).getPaymentMethod();
                PaymentMethod paymentMethod11 = (PaymentMethod) awS402S0200000_1.l1;
                MiniOspViewModel ospMiniVM2 = ((C03ZB) awS402S0200000_1.l0).getOspMiniVM();
                if (ospMiniVM2 != null) {
                    map = ospMiniVM2.LLJJJJ;
                } else {
                    map = null;
                }
                PaymentInfo paymentInfo2 = ((C03ZB) awS402S0200000_1.l0).getPaymentInfo();
                if (paymentInfo2 != null && paymentInfo2.LIZJ()) {
                    z = true;
                } else {
                    z = false;
                }
                C03O1.LJJIII(c03o1, "GCASH", "bounded_GCASH", 1, zLIZIZ2, str2, null, null, null, null, boolValueOf, paymentMethod10, paymentMethod11, map, false, z, null, 165824);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS402S0200000_1 awS402S0200000_1) {
        SeaSkuPanelViewModel seaSkuPanelViewModelLJII = ((SkuPanelBottomWidgetNew) awS402S0200000_1.l0).LJII();
        SkuPanelBottomWidgetNew skuPanelBottomWidgetNew = (SkuPanelBottomWidgetNew) awS402S0200000_1.l0;
        skuPanelBottomWidgetNew.getClass();
        C19EG c19egLIZ = C1745060vVo.LIZ(skuPanelBottomWidgetNew);
        seaSkuPanelViewModelLJII.getClass();
        seaSkuPanelViewModelLJII.withState(new AwS367S0200000_1(c19egLIZ, seaSkuPanelViewModelLJII, 129));
        ((Function0) awS402S0200000_1.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        PromotionLabelVO promotionLabelVO;
        ArrayList arrayList = new ArrayList();
        Set<Integer> setKeySet = ((CommerceProductInfoView) awS402S0200000_1.l0).LLJILJIL.getVisibleItems().keySet();
        List list = (List) awS402S0200000_1.l1;
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(((Number) it2.next()).intValue(), list);
            if (objLJJJLZIJ != null) {
                arrayList.add(objLJJJLZIJ);
            }
        }
        CommerceProductInfoView commerceProductInfoView = (CommerceProductInfoView) awS402S0200000_1.l0;
        InterfaceC1071204Gw interfaceC1071204Gw = commerceProductInfoView.LLJJIJIIJIL;
        if (interfaceC1071204Gw != null) {
            C426350Gnh c426350Gnh = commerceProductInfoView.LLJILJIL;
            C1008503wx c1008503wx = commerceProductInfoView.LLJJJJJIL;
            if (c1008503wx != null && (promotionLabelVO = c1008503wx.LJIIJJI) != null) {
                str = promotionLabelVO.daInfo;
            } else {
                str = null;
            }
            interfaceC1071204Gw.LIZIZ(c426350Gnh, arrayList, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS402S0200000_1 awS402S0200000_1) {
        ((Function1) awS402S0200000_1.l0).invoke((List) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS402S0200000_1 awS402S0200000_1) {
        PaymentViewModel paymentViewModel = (PaymentViewModel) awS402S0200000_1.l0;
        PaymentMethod paymentMethod = (PaymentMethod) awS402S0200000_1.l1;
        paymentViewModel.getClass();
        paymentViewModel.setState(AFwS228S0000000_1.get$arr$(264));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(paymentViewModel), C0PEM.LIZJ, null, new C876303bd(paymentViewModel, paymentMethod, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS402S0200000_1 awS402S0200000_1) {
        boolean zLJFF;
        ProductBase productBase;
        ProductPrice productPrice;
        SeaPdpViewModel.tS2(((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LJIIIIZZ(), ((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LLJ.getView(), null, (Map) awS402S0200000_1.l1, null, null, null, null, 1948);
        if (((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LJIIIIZZ().jS2()) {
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew = (SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0;
            iEventCenterLIZ.LIZ("ec_buy_now_click", C1741890vQh.LJIIIIZZ(seaPdpBottomNavBarWidgetNew.withState(seaPdpBottomNavBarWidgetNew.LJIIIIZZ(), new AwS4S0120000_1(true, seaPdpBottomNavBarWidgetNew, true, 1))));
        } else {
            C1054104Ah c1054104Ah = ((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah != null) {
                Boolean bool = Boolean.TRUE;
                ProductPackStruct productPackStruct = ((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LJIIIIZZ().LLJIJIL;
                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (productPrice = productBase.priceInfo) != null) {
                    zLJFF = Intrinsics.LJFF(productPrice.needIcon, bool);
                } else {
                    zLJFF = false;
                }
                C1054104Ah.LJJI(c1054104Ah, "buy_now", bool, Boolean.valueOf(zLJFF), null, null, 24);
            }
            C1054104Ah c1054104Ah2 = ((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LJIIIIZZ().LLJLIL;
            if (c1054104Ah2 != null) {
                String strLJII = ((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0).LJII();
                SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew2 = (SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0;
                C1054104Ah.LJIIJJI(c1054104Ah2, strLJII, (HashMap) seaPdpBottomNavBarWidgetNew2.withState(seaPdpBottomNavBarWidgetNew2.LJIIIIZZ(), new AwS4S0120000_1(true, seaPdpBottomNavBarWidgetNew2, true, 1)), (Map) awS402S0200000_1.l1, null, 44);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0), null, null, new C04E1((SeaPdpBottomNavBarWidgetNew) awS402S0200000_1.l0, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS402S0200000_1 awS402S0200000_1) {
        View viewFindViewById = ((C1854760yMk) awS402S0200000_1.l0).findViewById(R.id.xbl);
        Context context = (Context) awS402S0200000_1.l1;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
        return viewFindViewById;
    }

    public static final Object invoke$46(AwS402S0200000_1 awS402S0200000_1) {
        List<InterfaceC1891350zJl> listWA0;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS402S0200000_1.l0;
        C034C c034c = (C034C) C1025503zh.LIZ(C034C.class, orderSubmitAssemViewModel.o, orderSubmitAssemViewModel);
        if (c034c == null || (listWA0 = c034c.wA0((C7731030f) awS402S0200000_1.l1)) == null) {
            return new ArrayList();
        }
        return listWA0;
    }

    public static final Object invoke$47(AwS402S0200000_1 awS402S0200000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C03JE) awS402S0200000_1.l0).LLILLJJLI);
        sbLIZ.append('_');
        sbLIZ.append(((C03J5) awS402S0200000_1.l1).LJI);
        sbLIZ.append('_');
        sbLIZ.append(((C03J5) awS402S0200000_1.l1).LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$48(AwS402S0200000_1 awS402S0200000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("us_aggregate_logistics_panel_");
        sbLIZ.append(((C03J5) awS402S0200000_1.l0).LJI);
        sbLIZ.append('_');
        sbLIZ.append(((C03J5) awS402S0200000_1.l0).LJFF);
        sbLIZ.append('_');
        sbLIZ.append(((C118300cf) awS402S0200000_1.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$49(AwS402S0200000_1 awS402S0200000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C03JD) awS402S0200000_1.l0).LLILLJJLI);
        sbLIZ.append('_');
        sbLIZ.append(((C03J5) awS402S0200000_1.l1).LJI);
        sbLIZ.append('_');
        sbLIZ.append(((C03J5) awS402S0200000_1.l1).LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS402S0200000_1 awS402S0200000_1) {
        Boolean boolLJ;
        PaymentInfo paymentInfo;
        ((C03ZB) awS402S0200000_1.l0).LIZLLL();
        C03O0 c03o0 = C03O0.LIZ;
        PaymentMethod paymentMethod = (PaymentMethod) awS402S0200000_1.l1;
        OrderSubmitAssemViewModel ospAssemViewModel = ((C03ZB) awS402S0200000_1.l0).getOspAssemViewModel();
        if (ospAssemViewModel != null && (paymentInfo = ospAssemViewModel.LLJJJ) != null) {
            boolLJ = paymentInfo.LJ();
        } else {
            boolLJ = null;
        }
        c03o0.getClass();
        C03O0.LJLLLL(paymentMethod, boolLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS402S0200000_1 awS402S0200000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("us_aggregate_logistics_panel_");
        sbLIZ.append(((C03J5) awS402S0200000_1.l0).LJI);
        sbLIZ.append('_');
        sbLIZ.append(((C03J5) awS402S0200000_1.l0).LJFF);
        sbLIZ.append('_');
        sbLIZ.append(((C118300cf) awS402S0200000_1.l1).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$51(AwS402S0200000_1 awS402S0200000_1) {
        HashMap<String, Object> mapLJIIJ;
        String str;
        ((SeaShippingVH) awS402S0200000_1.l0).d6().LLLLLLIL.LIZIZ(((SeaShippingVH) awS402S0200000_1.l0).itemView.getContext(), C960603pE.LIZLLL(((SeaShippingVH) awS402S0200000_1.l0).itemView));
        SeaShippingVH seaShippingVH = (SeaShippingVH) awS402S0200000_1.l0;
        C765002ym c765002ym = ((C807203Di) awS402S0200000_1.l1).LL;
        if (c765002ym != null && (str = c765002ym.LJIIJJI) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        } else {
            mapLJIIJ = null;
        }
        seaShippingVH.e6("shipping_info", mapLJIIJ, (C807203Di) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS402S0200000_1 awS402S0200000_1) {
        Boolean boolLJIILJJIL;
        boolean zIsChecked = ((C0HZQ) awS402S0200000_1.l0).isChecked();
        C037U c037u = (C037U) awS402S0200000_1.l1;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = c037u.LIZIZ;
        if (orderSubmitAssemViewModel != null && c037u.LIZJ != null) {
            boolean z = !zIsChecked;
            C033Y c033y = (C033Y) orderSubmitAssemViewModel.vr2(C033Y.class);
            if (c033y != null && (boolLJIILJJIL = c033y.LJIILJJIL(z)) != null && boolLJIILJJIL.booleanValue()) {
                orderSubmitAssemViewModel.TS2();
            }
            orderSubmitAssemViewModel.setState(new AwS16S0010000_1(z, 37));
        }
        C1748720vbi.LIZLLL((C0HZQ) awS402S0200000_1.l0, new C10516049i(), new AwS580S0100000_1((C037U) awS402S0200000_1.l1, 469));
        return Boolean.TRUE;
    }

    public static final Object invoke$53(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel;
        C037U c037u = (C037U) awS402S0200000_1.l0;
        DonationModule donationModule = (DonationModule) awS402S0200000_1.l1;
        c037u.getClass();
        if (donationModule != null) {
            if (!C02Y8.LIZIZ(donationModule)) {
                str = donationModule.unableToast;
            } else {
                str = donationModule.paymentUnableToast;
            }
            if (C123100dR.LIZ(str) && (orderSubmitAssemViewModel = c037u.LIZIZ) != null) {
                orderSubmitAssemViewModel.setState(new AwS86S1200000_1(str, Integer.valueOf(R.raw.icon_exclamation_mark_circle), Integer.valueOf(R.attr.zi), 13));
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$54(AwS402S0200000_1 awS402S0200000_1) {
        PaymentInfoViewModel paymentInfoViewModel = ((C03ZC) awS402S0200000_1.l0).getPaymentInfoViewModel();
        if (paymentInfoViewModel != null) {
            paymentInfoViewModel.yQ2(((C03ZC) awS402S0200000_1.l0).getContext(), (PaymentMethod) awS402S0200000_1.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS402S0200000_1 awS402S0200000_1) {
        ((ReturnPoliciesFragment) awS402S0200000_1.l0).VR((BottomTip) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS402S0200000_1 awS402S0200000_1) {
        ((ReturnPoliciesFragment) awS402S0200000_1.l0).VR((BottomTip) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS402S0200000_1 awS402S0200000_1) {
        PaymentViewModel paymentViewModel = ((C03Z4) awS402S0200000_1.l0).getPaymentViewModel();
        if (paymentViewModel != null) {
            paymentViewModel.AR2(((C03Z4) awS402S0200000_1.l0).getContext(), (PaymentMethod) awS402S0200000_1.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS402S0200000_1 awS402S0200000_1) {
        C990503u3 c990503u3 = C990503u3.LIZ;
        C426160GnO c426160GnO = (C426160GnO) awS402S0200000_1.l0;
        List list = (List) awS402S0200000_1.l1;
        AwS580S0100000_1 awS580S0100000_1 = new AwS580S0100000_1(c426160GnO, 520);
        AFwS326S0000000_1 aFwS326S0000000_1 = AFwS326S0000000_1.get$arr$(9);
        c990503u3.getClass();
        C990503u3.LIZ(c426160GnO, list, awS580S0100000_1, aFwS326S0000000_1);
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS402S0200000_1 awS402S0200000_1) {
        ATMCardViewModel aTMCardViewModelR5 = ((ATMSaveNewCardViewHolder) awS402S0200000_1.l0).R5();
        SaveDisplayInfoContent saveDisplayInfoContent = (SaveDisplayInfoContent) awS402S0200000_1.l1;
        aTMCardViewModelR5.setState(new AwS11S2000000_1(saveDisplayInfoContent.title, saveDisplayInfoContent.desc, 6));
        C890103dr.LJFF(C890103dr.LIZ, "learn_more_save_card", null, null, null, null, null, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        RecoveryMarketingInfo recoveryMarketingInfo;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelV5 = ((PaymentInfoCell2) awS402S0200000_1.l0).V5();
        PaymentMethod paymentMethod = ((PaymentInfo) awS402S0200000_1.l1).paymentMethod;
        String str2 = null;
        if (paymentMethod != null && (recoveryMarketingInfo = paymentMethod.recoveryMarketingInfo) != null) {
            str = recoveryMarketingInfo.voucherId;
        } else {
            str = null;
            if (paymentMethod != null) {
            }
            orderSubmitAssemViewModelV5.PS2(str, str2);
            return Unit.LIZ;
        }
        RecoveryMarketingInfo recoveryMarketingInfo2 = paymentMethod.recoveryMarketingInfo;
        if (recoveryMarketingInfo2 != null) {
            str2 = recoveryMarketingInfo2.channel;
        }
        orderSubmitAssemViewModelV5.PS2(str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS402S0200000_1 awS402S0200000_1) {
        C877103bl.LIZLLL((C867003a8) awS402S0200000_1.l0, (C877303bn) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$61(AwS402S0200000_1 awS402S0200000_1) {
        if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((USCashierPaymentMethodVH) awS402S0200000_1.l1).W5().LLJJJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS402S0200000_1 awS402S0200000_1) {
        Function0 function0 = (Function0) awS402S0200000_1.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((CCDCAddCardViewModel) awS402S0200000_1.l1).setState(AFwS228S0000000_1.get$arr$(621));
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS402S0200000_1 awS402S0200000_1) {
        ((CCDCAddCardViewModel) awS402S0200000_1.l0).setStateImmediate(AFwS228S0000000_1.get$arr$(622));
        ((Function0) awS402S0200000_1.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$64(AwS402S0200000_1 awS402S0200000_1) {
        C1397580mTM c1397580mTM = new C1397580mTM((Context) awS402S0200000_1.l0);
        c1397580mTM.LJFF(2131833054);
        c1397580mTM.LIZ(2131833053);
        Context context = (Context) awS402S0200000_1.l0;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
        c419910GdJ.LIZLLL = Integer.valueOf(C960203pA.LIZ(R.attr.a0i, context));
        C1235760iGM.LIZIZ(c1397580mTM, c419910GdJ.LIZ((Context) awS402S0200000_1.l0));
        C985403tE.LIZ(c1397580mTM, new AwS580S0100000_1((Function0) awS402S0200000_1.l1, (Function0<Unit>) 627));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS402S0200000_1 awS402S0200000_1) {
        return ((SeaPdpViewModel) awS402S0200000_1.l0).qR2((SkuPanelState) awS402S0200000_1.l1);
    }

    public static final Object invoke$66(AwS402S0200000_1 awS402S0200000_1) {
        PdpViewModel pdpViewModel = ((C968703qX) awS402S0200000_1.l0).LIZ;
        return pdpViewModel.nR2(pdpViewModel.Pv0(), (Integer) awS402S0200000_1.l1);
    }

    public static final Object invoke$67(AwS402S0200000_1 awS402S0200000_1) {
        ((View.OnClickListener) awS402S0200000_1.l0).onClick((View) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$68(AwS402S0200000_1 awS402S0200000_1) {
        ((View.OnClickListener) awS402S0200000_1.l0).onClick((View) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$69(AwS402S0200000_1 awS402S0200000_1) {
        ((View.OnClickListener) awS402S0200000_1.l0).onClick((View) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        RecoveryMarketingInfo recoveryMarketingInfo;
        OrderSubmitAssemViewModel orderSubmitAssemViewModelV5 = ((PaymentInfoCell2) awS402S0200000_1.l0).V5();
        PaymentMethod paymentMethod = ((PaymentInfo) awS402S0200000_1.l1).paymentMethod;
        String str2 = null;
        if (paymentMethod != null && (recoveryMarketingInfo = paymentMethod.recoveryMarketingInfo) != null) {
            str = recoveryMarketingInfo.voucherId;
        } else {
            str = null;
            if (paymentMethod != null) {
            }
            orderSubmitAssemViewModelV5.PS2(str, str2);
            return Unit.LIZ;
        }
        RecoveryMarketingInfo recoveryMarketingInfo2 = paymentMethod.recoveryMarketingInfo;
        if (recoveryMarketingInfo2 != null) {
            str2 = recoveryMarketingInfo2.channel;
        }
        orderSubmitAssemViewModelV5.PS2(str, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$70(AwS402S0200000_1 awS402S0200000_1) {
        ((View.OnClickListener) awS402S0200000_1.l0).onClick((View) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$71(AwS402S0200000_1 awS402S0200000_1) {
        C1054104Ah c1054104Ah = ((PdpReviewViewHolder) awS402S0200000_1.l0).c6().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJIJLIJ((ReviewItemStruct) awS402S0200000_1.l1, "info_icon");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$72(AwS402S0200000_1 awS402S0200000_1) {
        View viewFindViewById = ((C441730HTv) awS402S0200000_1.l0).findViewById(R.id.zbf);
        Context context = (Context) awS402S0200000_1.l1;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
        return viewFindViewById;
    }

    public static final Object invoke$73(AwS402S0200000_1 awS402S0200000_1) {
        C1748720vbi.LIZIZ((AddressListActivity) awS402S0200000_1.l0, new C048W(), AFwS228S0000000_1.get$arr$(679));
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) awS402S0200000_1.l1, C343970De7.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$74(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        String currency;
        String priceStr;
        ((C03ZD) awS402S0200000_1.l0).LIZLLL(false);
        C890103dr c890103dr = C890103dr.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C873103b7 c873103b7 = (C873103b7) awS402S0200000_1.l1;
        C873003b6 c873003b6 = c873103b7.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c873003b6);
        sbLIZ.append("_INSTALLMENT");
        linkedHashMap.put("payment_option", C2188811AlT.LIZIZ(sbLIZ));
        Amount amount = c873103b7.LL.orderAmount;
        if (amount != null && (priceStr = amount.getPriceStr()) != null) {
            linkedHashMap.put("total_payment", priceStr);
        }
        Amount amount2 = c873103b7.LL.orderAmount;
        if (amount2 != null && (currency = amount2.getCurrency()) != null) {
            linkedHashMap.put("currency", currency);
        }
        Availability availability = c873103b7.LLILLJJLI.LJFF.availability;
        if (availability != null && (str = availability.statusCode) != null) {
            linkedHashMap.put("status_code", str);
        }
        C890103dr.LJFF(c890103dr, "view_installment_plan", linkedHashMap, null, null, null, null, null, 124);
        return Unit.LIZ;
    }

    public static final Object invoke$75(AwS402S0200000_1 awS402S0200000_1) {
        EnterParams enterParams;
        boolean z;
        EnterParams enterParams2;
        PaymentInfo paymentInfo;
        PaymentViewModel paymentViewModel = ((h) awS402S0200000_1.l0).getPaymentViewModel();
        if (paymentViewModel != null) {
            paymentViewModel.GR2((PaymentMethod) awS402S0200000_1.l1, ((h) awS402S0200000_1.l0).getContext(), ((h) awS402S0200000_1.l0).getPaymentLogger(), ((h) awS402S0200000_1.l0).getTrackParams(), null);
        }
        C03WH paymentLogger = ((h) awS402S0200000_1.l0).getPaymentLogger();
        if (paymentLogger != null) {
            PaymentMethod paymentMethod = ((h) awS402S0200000_1.l0).getPaymentMethod();
            PaymentMethod paymentMethod2 = (PaymentMethod) awS402S0200000_1.l1;
            PaymentViewModel paymentViewModel2 = ((h) awS402S0200000_1.l0).getPaymentViewModel();
            String strLJJIJ = null;
            if (paymentViewModel2 != null) {
                enterParams = paymentViewModel2.LLJ;
            } else {
                enterParams = null;
            }
            PaymentMethod paymentMethod3 = ((h) awS402S0200000_1.l0).getPaymentMethod();
            if (paymentMethod3 != null) {
                strLJJIJ = paymentMethod3.LJJIJ();
            }
            PaymentViewModel paymentViewModel3 = ((h) awS402S0200000_1.l0).getPaymentViewModel();
            if (paymentViewModel3 != null && (enterParams2 = paymentViewModel3.LLJ) != null && (paymentInfo = enterParams2.paymentInfo) != null && paymentInfo.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            C03WH.LJIJJ(paymentLogger, "GCASH", "bounded_GCASH", 1, false, null, null, null, null, paymentMethod, paymentMethod2, enterParams, null, strLJJIJ, z, null, 37344);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$76(AwS402S0200000_1 awS402S0200000_1) {
        PaymentViewModel paymentViewModel = ((h) awS402S0200000_1.l0).getPaymentViewModel();
        if (paymentViewModel != null) {
            paymentViewModel.AR2(((h) awS402S0200000_1.l0).getContext(), (PaymentMethod) awS402S0200000_1.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$77(AwS402S0200000_1 awS402S0200000_1) {
        C1054004Ag c1054004Ag = ((PdpViewModel) awS402S0200000_1.l0).LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            C1018703yb.LJII("tiktokec_module_show", new AwS367S0200000_1(c1054004Ag, (C1054004Ag) awS402S0200000_1.l1, (Map<String, ? extends Object>) 344));
            c1054004Ag.LJJIJ.add("logistics");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$78(AwS402S0200000_1 awS402S0200000_1) {
        C04HT c04ht = (C04HT) awS402S0200000_1.l0;
        c04ht.LLJJJ = Math.max(c04ht.LLJJJ, c04ht.e0());
        ((SeaSkuPanelViewModel) awS402S0200000_1.l1).LLLFZ = ((C04HT) awS402S0200000_1.l0).LLJJJ + 1;
        return Unit.LIZ;
    }

    public static final Object invoke$79(AwS402S0200000_1 awS402S0200000_1) {
        SmartRouter.buildRoute(((C958503ot) awS402S0200000_1.l0).getContext(), ((ElementDTO) awS402S0200000_1.l1).notificationUrl).open();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS402S0200000_1 awS402S0200000_1) {
        InterfaceC975703rf interfaceC975703rf = (InterfaceC975703rf) ((ViewModel) awS402S0200000_1.l0);
        C19EG c19eg = (C19EG) awS402S0200000_1.l1;
        interfaceC975703rf.e81(c19eg, C1748730vbj.LIZLLL(c19eg), "c48681.d0114", null);
        return Unit.LIZ;
    }

    public static final Object invoke$80(AwS402S0200000_1 awS402S0200000_1) {
        SmartRouter.buildRoute(((C958503ot) awS402S0200000_1.l0).getContext(), ((ElementDTO) awS402S0200000_1.l1).notificationUrl).open();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$81(AwS402S0200000_1 awS402S0200000_1) {
        TuxIconView tuxIconView = new TuxIconView((Context) awS402S0200000_1.l0, null, 0, 6, null);
        C942503mJ c942503mJ = (C942503mJ) awS402S0200000_1.l1;
        tuxIconView.setIconRes(R.raw.icon_info_circle);
        tuxIconView.setTintColorRes(R.attr.a1k);
        tuxIconView.setIconHeight(c942503mJ.LLILZ);
        tuxIconView.setIconWidth(c942503mJ.LLILZ);
        int i = c942503mJ.LLILZ;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParams);
        C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(c942503mJ.LLILZIL), null, null, null, false, 30);
        return tuxIconView;
    }

    public static final Object invoke$82(AwS402S0200000_1 awS402S0200000_1) {
        C904503gB c904503gB = new C904503gB((Context) awS402S0200000_1.l0);
        C903603g2 c903603g2 = (C903603g2) awS402S0200000_1.l1;
        c904503gB.getBalanceTextValue();
        c903603g2.addView(c904503gB);
        return c904503gB;
    }

    public static final Object invoke$83(AwS402S0200000_1 awS402S0200000_1) {
        C0HZQ c0hzq = new C0HZQ((Context) awS402S0200000_1.l0, null, 6);
        C926003je c926003je = (C926003je) awS402S0200000_1.l1;
        c0hzq.setSize(0);
        c0hzq.setShape(1);
        c0hzq.setClickable(false);
        c926003je.addView(c0hzq);
        return c0hzq;
    }

    public static /* bridge */ /* synthetic */ Object invoke$84(AwS402S0200000_1 awS402S0200000_1) {
        TuxIconView tuxIconView = new TuxIconView((Context) awS402S0200000_1.l0, null, 0, 6, null);
        C926003je c926003je = (C926003je) awS402S0200000_1.l1;
        tuxIconView.setIconRes(R.raw.icon_info_circle);
        tuxIconView.setTintColorRes(R.attr.a1k);
        tuxIconView.setIconHeight(c926003je.LLILLL);
        tuxIconView.setIconWidth(c926003je.LLILLL);
        int i = c926003je.LLILLL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParams);
        C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(c926003je.LLILZ), null, null, null, false, 30);
        c926003je.addView(tuxIconView);
        return tuxIconView;
    }

    public static /* bridge */ /* synthetic */ Object invoke$85(AwS402S0200000_1 awS402S0200000_1) {
        TuxTextView tuxTextView = new TuxTextView((Context) awS402S0200000_1.l0, null, 6, 0);
        Context context = (Context) awS402S0200000_1.l0;
        C926003je c926003je = (C926003je) awS402S0200000_1.l1;
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
        tuxTextView.setTuxFont(62);
        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(c926003je.LLILZIL), null, null, null, false, 30);
        c926003je.addView(tuxTextView);
        return tuxTextView;
    }

    public static final Object invoke$86(AwS402S0200000_1 awS402S0200000_1) {
        ((SaveNewCardViewHolder) awS402S0200000_1.l0).T5().gR2((SaveDisplayInfoContent) awS402S0200000_1.l1);
        C890103dr.LJFF(C890103dr.LIZ, "learn_more_save_card", null, null, null, null, null, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$87(AwS402S0200000_1 awS402S0200000_1) {
        EnterParams enterParams;
        EnterParams enterParams2;
        if (!C03WK.LIZ(((InstallmentPlanListElementViewHolder) awS402S0200000_1.l0).W5().LLJ) && (((Fragment) awS402S0200000_1.l1) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((InstallmentPlanListElementViewHolder) awS402S0200000_1.l0).W5().LLJJJ) && (((enterParams = ((InstallmentPlanListElementViewHolder) awS402S0200000_1.l0).W5().LLJ) == null || !enterParams.LIZLLL()) && ((enterParams2 = ((InstallmentPlanListElementViewHolder) awS402S0200000_1.l0).W5().LLJ) == null || !enterParams2.LJJIFFI))) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l1)).LLJLL.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$88(AwS402S0200000_1 awS402S0200000_1) {
        if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((PaymentMethodViewHolder) awS402S0200000_1.l1).W5().LLJJJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
        } else if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && C897503f3.LJI(((PaymentMethodViewHolder) awS402S0200000_1.l1).W5().LLJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJJLIIIJLLLLLLLZ.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$89(AwS402S0200000_1 awS402S0200000_1) {
        if ((((Fragment) awS402S0200000_1.l0) instanceof PaymentFragment) && Intrinsics.LJFF("ordersubmit", ((PaymentMethodViewHolder) awS402S0200000_1.l1).W5().LLJJJ)) {
            ((PaymentFragment) ((Fragment) awS402S0200000_1.l0)).LLJLL.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS402S0200000_1 awS402S0200000_1) {
        ((LogisticAdapter.LogisticViewHolder) awS402S0200000_1.l0).X5().DR2((LogisticDTO) awS402S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$90(AwS402S0200000_1 awS402S0200000_1) {
        PaymentMethodViewHolder paymentMethodViewHolder = (PaymentMethodViewHolder) awS402S0200000_1.l0;
        paymentMethodViewHolder.withState(paymentMethodViewHolder.W5(), new AwS367S0200000_1((PaymentMethod) awS402S0200000_1.l1, paymentMethodViewHolder, 311));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$91(kotlin.jvm.internal.AwS402S0200000_1 r76) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.invoke$91(kotlin.jvm.internal.AwS402S0200000_1):java.lang.Object");
    }

    public static final Object invoke$92(AwS402S0200000_1 awS402S0200000_1) {
        try {
            AwS402S0200000_1 awS402S0200000_12 = new AwS402S0200000_1((InstallmentPlanListElementViewHolder) awS402S0200000_1.l1, (C862603Yq) awS402S0200000_1.l0, 91);
            if (((C862603Yq) awS402S0200000_1.l0).LIZIZ.LJJJJI()) {
                PaymentViewModel paymentViewModelW5 = ((InstallmentPlanListElementViewHolder) awS402S0200000_1.l1).W5();
                C862603Yq c862603Yq = (C862603Yq) awS402S0200000_1.l0;
                paymentViewModelW5.NR2(c862603Yq.LIZIZ, new AwS210S0300000_1(c862603Yq, awS402S0200000_12, (InstallmentPlanListElementViewHolder) awS402S0200000_1.l1, 99));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InstallmentPlanListElementViewHolder fragmentFinder exception: ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$93(AwS402S0200000_1 awS402S0200000_1) {
        View viewFindViewById = ((C898300ZLw) awS402S0200000_1.l0).findViewById(R.id.h8d);
        Context context = (Context) awS402S0200000_1.l1;
        C898300ZLw c898300ZLw = (C898300ZLw) awS402S0200000_1.l0;
        SmartImageView smartImageView = (SmartImageView) viewFindViewById;
        C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(21));
        smartImageView.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.Q8(smartImageView, c898300ZLw);
        return smartImageView;
    }

    public static /* bridge */ /* synthetic */ Object invoke$94(AwS402S0200000_1 awS402S0200000_1) {
        View viewFindViewById = ((C898300ZLw) awS402S0200000_1.l0).findViewById(R.id.h8e);
        Context context = (Context) awS402S0200000_1.l1;
        C898300ZLw c898300ZLw = (C898300ZLw) awS402S0200000_1.l0;
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById;
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(21));
        tuxTextView.setBackground(c384050F3z.LIZ(context));
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(22);
        C786410Ut5.h9(tuxTextView, c898300ZLw);
        return tuxTextView;
    }

    public static final Object invoke$95(AwS402S0200000_1 awS402S0200000_1) {
        Function2 function2 = (Function2) awS402S0200000_1.l0;
        InlineLink inlineLink = (InlineLink) awS402S0200000_1.l1;
        Integer num = inlineLink.linkType;
        String str = inlineLink.url;
        if (str == null) {
            str = "";
        }
        function2.invoke(num, str);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Integer] */
    public static final Object invoke$96(AwS402S0200000_1 awS402S0200000_1) {
        String str;
        C03O0 c03o0 = C03O0.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = awS402S0200000_1.l0;
        C259800zU c259800zU = (C259800zU) awS402S0200000_1.l1;
        c03o0.getClass();
        linkedHashMap.putAll(C03O0.LIZIZ);
        linkedHashMap.put("page_name", "order_submit");
        if ((obj instanceof Long) && !Intrinsics.LJFF(obj, -1L)) {
            linkedHashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (C03O0.LJIIIZ > 0) {
            str = "yes";
        } else {
            str = "no";
        }
        linkedHashMap.put("is_retry", str);
        if (C03O0.LJIIIZ > 0) {
            c259800zU.element = 2;
        }
        linkedHashMap.put("request_type", String.valueOf(c259800zU.element));
        C03O0.LLF("rd_tiktokec_first_bill_info_request_send", linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$97(AwS402S0200000_1 awS402S0200000_1) {
        Map<String, String> map;
        USHalfLogisticsCell uSHalfLogisticsCell = (USHalfLogisticsCell) awS402S0200000_1.l0;
        LogisticPanelModule logisticPanelModule = ((C719302rP) awS402S0200000_1.l1).LLJILJILJ;
        if (logisticPanelModule != null) {
            map = logisticPanelModule.daInfo;
        } else {
            map = null;
        }
        C1748720vbi.LIZLLL(uSHalfLogisticsCell.itemView, new C10516049i(), new AwS6S2300000_1(uSHalfLogisticsCell, null, map, 2));
        AssemVMLazy assemVMLazy = ((USHalfLogisticsCell) awS402S0200000_1.l0).LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USHalfLogisticsCell.LLJJIII;
        OspAggregationOrderModuleViewModel ospAggregationOrderModuleViewModel = (OspAggregationOrderModuleViewModel) assemVMLazy.getValue();
        C719302rP c719302rP = (C719302rP) awS402S0200000_1.l1;
        OspAggregationOrderModuleViewModel.vQ2(ospAggregationOrderModuleViewModel, c719302rP.LLIZLLLIL, c719302rP.LLJI, ((USHalfLogisticsCell) awS402S0200000_1.l0).getFragment(), ((USHalfLogisticsCell) awS402S0200000_1.l0).N5(), ((C719302rP) awS402S0200000_1.l1).LLJJ, Integer.valueOf((int) C928203k0.LJIIJ()), true, 16);
        return Unit.LIZ;
    }

    public static final Object invoke$98(AwS402S0200000_1 awS402S0200000_1) {
        if (((C1004203wG) awS402S0200000_1.l0).LLIZ == null) {
            return null;
        }
        TuxTextView tuxTextView = new TuxTextView(((OspSkuItemCell) awS402S0200000_1.l1).itemView.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.bb);
        SizeGuide sizeGuide = ((C1004203wG) awS402S0200000_1.l0).LLIZ;
        String str = sizeGuide.skuSizeGuideButtonText;
        if (str == null) {
            str = sizeGuide.skuSizeGuideTitle;
        }
        tuxTextView.setText(str);
        return tuxTextView;
    }

    public static final Object invoke$99(AwS402S0200000_1 awS402S0200000_1) {
        InterfaceC975703rf interfaceC975703rf = (InterfaceC975703rf) ((ViewModel) awS402S0200000_1.l0);
        C19EG c19eg = (C19EG) awS402S0200000_1.l1;
        interfaceC975703rf.e81(c19eg, C1748730vbj.LIZLLL(c19eg), "c48681.d0114", null);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS402S0200000_1(android.view.View r3, com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuBottomAssem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 114 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.<init>(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.sku.assem.SkuBottomAssem, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS402S0200000_1(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder r3, X.C862603Yq r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 91 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS402S0200000_1.<init>(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder, X.03Yq, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C037O c037o, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c037o;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C037U c037u, DonationModule donationModule, int i) {
        super(0);
        this.$t = i;
        this.l0 = c037u;
        this.l1 = donationModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(ViewOnClickListenerC7909037b viewOnClickListenerC7909037b, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnClickListenerC7909037b;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03J5 c03j5, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03j5;
        this.l1 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03JD c03jd, C03J5 c03j5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03jd;
        this.l1 = c03j5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03JE c03je, C03J5 c03j5, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03je;
        this.l1 = c03j5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03Z4 c03z4, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03z4;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03ZB c03zb, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zb;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03ZC c03zc, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zc;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C03ZD c03zd, C873103b7 c873103b7, int i) {
        super(0);
        this.$t = i;
        this.l0 = c03zd;
        this.l1 = c873103b7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C867003a8 c867003a8, C877303bn c877303bn, int i) {
        super(0);
        this.$t = i;
        this.l0 = c867003a8;
        this.l1 = c877303bn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C897703f5 c897703f5, InterfaceC911103hF interfaceC911103hF, int i) {
        super(0);
        this.$t = i;
        this.l0 = c897703f5;
        this.l1 = interfaceC911103hF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C958503ot c958503ot, ElementDTO elementDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c958503ot;
        this.l1 = elementDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C968703qX c968703qX, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = c968703qX;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C1004203wG c1004203wG, OspSkuItemCell ospSkuItemCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1004203wG;
        this.l1 = ospSkuItemCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C04HT c04ht, SeaSkuPanelViewModel seaSkuPanelViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c04ht;
        this.l1 = seaSkuPanelViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(C426160GnO c426160GnO, C426160GnO c426160GnO2, List<Icon> list) {
        super(0);
        this.$t = list;
        this.l0 = c426160GnO;
        this.l1 = c426160GnO2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C441730HTv c441730HTv, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c441730HTv;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C0HZQ c0hzq, C037U c037u, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0hzq;
        this.l1 = c037u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C0OM3 c0om3, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0om3;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(C898300ZLw c898300ZLw, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = c898300ZLw;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Context context, C903603g2 c903603g2, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c903603g2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Context context, C926003je c926003je, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c926003je;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Context context, C942503mJ c942503mJ, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c942503mJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Context context, C1854760yMk c1854760yMk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1854760yMk;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Context context, AwS130S0400000_1 awS130S0400000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = awS130S0400000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(View view, SeaPdpFragment seaPdpFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Fragment fragment, PaymentViewModel paymentViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Fragment fragment, PaymentMethodViewHolder paymentMethodViewHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = paymentMethodViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Fragment fragment, USCashierPaymentMethodVH uSCashierPaymentMethodVH, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = uSCashierPaymentMethodVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(ViewModel viewModel, C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewModel;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(Address address, DialogContent dialogContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = address;
        this.l1 = dialogContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(AddressListActivity addressListActivity, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = addressListActivity;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(LogisticAdapter.LogisticViewHolder logisticViewHolder, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = logisticViewHolder;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(LogisticSubViewHolder logisticSubViewHolder, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = logisticSubViewHolder;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PaymentInfoCell2 paymentInfoCell2, PaymentInfo paymentInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentInfoCell2;
        this.l1 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(USHalfLogisticsCell uSHalfLogisticsCell, C719302rP c719302rP, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSHalfLogisticsCell;
        this.l1 = c719302rP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(OneStepSnsCell oneStepSnsCell, SnsOptionButton snsOptionButton, int i) {
        super(0);
        this.$t = i;
        this.l0 = oneStepSnsCell;
        this.l1 = snsOptionButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(OneStepSnsCell oneStepSnsCell, SnsPeriodInfo snsPeriodInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = oneStepSnsCell;
        this.l1 = snsPeriodInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(OrderSubmitFragment orderSubmitFragment, LeadingElevatorBar leadingElevatorBar, int i) {
        super(0);
        this.$t = i;
        this.l0 = orderSubmitFragment;
        this.l1 = leadingElevatorBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PaymentFragment paymentFragment, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentFragment;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(ATMSaveNewCardViewHolder aTMSaveNewCardViewHolder, SaveDisplayInfoContent saveDisplayInfoContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = aTMSaveNewCardViewHolder;
        this.l1 = saveDisplayInfoContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(CCDCAddCardViewModel cCDCAddCardViewModel, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = function0;
        this.l1 = cCDCAddCardViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(CCDCAddCardViewModel cCDCAddCardViewModel, AwS245S0300000_1 awS245S0300000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = cCDCAddCardViewModel;
        this.l1 = awS245S0300000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SaveNewCardViewHolder saveNewCardViewHolder, SaveDisplayInfoContent saveDisplayInfoContent, int i) {
        super(0);
        this.$t = i;
        this.l0 = saveNewCardViewHolder;
        this.l1 = saveDisplayInfoContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PaymentMethod paymentMethod, PaymentMethodViewHolder paymentMethodViewHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentMethodViewHolder;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PaymentMethod paymentMethod, h hVar, int i) {
        super(0);
        this.$t = i;
        this.l0 = hVar;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder, Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = installmentPlanListElementViewHolder;
        this.l1 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(LeadingElevatorBar leadingElevatorBar, SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = leadingElevatorBar;
        this.l1 = seaOneStepOrderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, C7731030f c7731030f, int i) {
        super(0);
        this.$t = i;
        this.l0 = orderSubmitAssemViewModel;
        this.l1 = c7731030f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SizeGuide sizeGuide, C04FA c04fa, int i) {
        super(0);
        this.$t = i;
        this.l0 = sizeGuide;
        this.l1 = c04fa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SeaPdpBottomNavBarWidgetBff seaPdpBottomNavBarWidgetBff, SeaPdpMainState seaPdpMainState, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpBottomNavBarWidgetBff;
        this.l1 = seaPdpMainState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SeaShippingVH seaShippingVH, C807203Di c807203Di, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaShippingVH;
        this.l1 = c807203Di;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PdpReviewHeadViewHolder pdpReviewHeadViewHolder, C04IE c04ie, int i) {
        super(0);
        this.$t = i;
        this.l0 = c04ie;
        this.l1 = pdpReviewHeadViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PdpReviewViewHolder pdpReviewViewHolder, ReviewItemStruct reviewItemStruct, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpReviewViewHolder;
        this.l1 = reviewItemStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SeaPdpViewModel seaPdpViewModel, SkuPanelState skuPanelState, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpViewModel;
        this.l1 = skuPanelState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SeaPdpBodyWidget seaPdpBodyWidget, C1755030vlt c1755030vlt, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpBodyWidget;
        this.l1 = c1755030vlt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SeaPdpBodyWidget seaPdpBodyWidget, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = seaPdpBodyWidget;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew, SeaPdpBottomNavBarWidgetNew seaPdpBottomNavBarWidgetNew2, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l0 = seaPdpBottomNavBarWidgetNew;
        this.l1 = seaPdpBottomNavBarWidgetNew2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(ReturnPoliciesFragment returnPoliciesFragment, BottomTip bottomTip, int i) {
        super(0);
        this.$t = i;
        this.l0 = returnPoliciesFragment;
        this.l1 = bottomTip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(UserRightFragment userRightFragment, ContactDetail contactDetail, int i) {
        super(0);
        this.$t = i;
        this.l0 = userRightFragment;
        this.l1 = contactDetail;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(UserRightFragment userRightFragment, PrivacyPolicy privacyPolicy, int i) {
        super(0);
        this.$t = i;
        this.l0 = userRightFragment;
        this.l1 = privacyPolicy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PdpViewModel pdpViewModel, C1755030vlt c1755030vlt, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = c1755030vlt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PdpViewModel pdpViewModel, Voucher voucher, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = voucher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PdpViewModel pdpViewModel, SkuPanelState skuPanelState, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = skuPanelState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PdpViewModel pdpViewModel, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(PdpViewModel pdpViewModel, PdpViewModel pdpViewModel2, Map<String, Object> map) {
        super(0);
        this.$t = map;
        this.l0 = pdpViewModel;
        this.l1 = pdpViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SkuBottomAssem skuBottomAssem, C04E4 c04e4, int i) {
        super(0);
        this.$t = i;
        this.l0 = skuBottomAssem;
        this.l1 = c04e4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SkuPanelBaseWidget skuPanelBaseWidget, C426350Gnh c426350Gnh, int i) {
        super(0);
        this.$t = i;
        this.l0 = skuPanelBaseWidget;
        this.l1 = c426350Gnh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(SkuPanelBottomWidgetNew skuPanelBottomWidgetNew, AwS545S0100000_1 awS545S0100000_1, int i) {
        super(0);
        this.$t = i;
        this.l0 = skuPanelBottomWidgetNew;
        this.l1 = awS545S0100000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(DistrictFragment districtFragment, C965403q0 c965403q0, int i) {
        super(0);
        this.$t = i;
        this.l0 = districtFragment;
        this.l1 = c965403q0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(CommerceProductInfoView commerceProductInfoView, CommerceProductInfoView commerceProductInfoView2, List<PromotionLabel> list) {
        super(0);
        this.$t = list;
        this.l0 = commerceProductInfoView;
        this.l1 = commerceProductInfoView2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(USLogisticVH uSLogisticVH, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSLogisticVH;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(h3 h3Var, h3 h3Var2, HashMap<String, Object> map) {
        super(0);
        this.$t = map;
        this.l0 = h3Var;
        this.l1 = h3Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(Object obj, Object obj2, C259800zU<Integer> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = atomicBoolean;
        this.l1 = atomicBoolean2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(Function0 function0, Function0<Unit> function02, CreditCardInstallmentFragment creditCardInstallmentFragment) {
        super(0);
        this.$t = creditCardInstallmentFragment;
        this.l0 = function0;
        this.l1 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(Function1 function1, Function1<? super C03ZM, Unit> function12, C03ZM c03zm) {
        super(0);
        this.$t = c03zm;
        this.l0 = function1;
        this.l1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS402S0200000_1(Function1 function1, Function1<? super List<PaymentMethod>, Unit> function12, List<PaymentMethod> list) {
        super(0);
        this.$t = list;
        this.l0 = function1;
        this.l1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(AFwS284S0000000_1 aFwS284S0000000_1, InlineLink inlineLink, int i) {
        super(0);
        this.$t = i;
        this.l0 = aFwS284S0000000_1;
        this.l1 = inlineLink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS402S0200000_1(PaymentViewModel paymentViewModel, Context context, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = paymentMethod;
    }
}
