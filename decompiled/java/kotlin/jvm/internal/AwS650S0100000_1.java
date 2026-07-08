package kotlin.jvm.internal;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass0376;
import X.C03DZ;
import X.C03IF;
import X.C03IT;
import X.C03JM;
import X.C03NI;
import X.C03O0;
import X.C03QJ;
import X.C03QL;
import X.C041G;
import X.C049G;
import X.C049Y;
import X.C04EM;
import X.C09AY;
import X.C0H1U;
import X.C0PEM;
import X.C0WZX;
import X.C10508049a;
import X.C10511049d;
import X.C10512049e;
import X.C10515049h;
import X.C1054004Ag;
import X.C1054104Ah;
import X.C1057450dcl;
import X.C11E9;
import X.C123100dR;
import X.C12ES;
import X.C1389880mGw;
import X.C1390130mHL;
import X.C13LZ;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1745060vVo;
import X.C1748720vbi;
import X.C1841350y17;
import X.C197039127h;
import X.C19719612Di;
import X.C19EG;
import X.C1AF0;
import X.C1DFH;
import X.C20515215Pi;
import X.C20600815jK;
import X.C20691715xz;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C736680Sv4;
import X.C770702zh;
import X.C7735030j;
import X.C7806033c;
import X.C785410UrT;
import X.C786410Ut5;
import X.C802703Bp;
import X.C814420VxA;
import X.C816490W1f;
import X.C818303Hp;
import X.C867003a8;
import X.C875203bS;
import X.C875903bZ;
import X.C876403be;
import X.C877303bn;
import X.C879803cC;
import X.C890103dr;
import X.C908703gr;
import X.C948003nC;
import X.C948503nH;
import X.C965403q0;
import X.DialogC989903tx;
import X.EnumC1011903xV;
import X.EnumC10383044f;
import X.InterfaceC1631620sYq;
import X.InterfaceC1748810vbr;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS13S0101000_1;
import Y.ARunnableS70S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionInfoPageData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.UserAuctionInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.body.OspPageListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.base.BaseOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.OspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.address.USHalfAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanBriefElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.bottom.UsPdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECLatamOspFlowOpt;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectdescription.USLogisticDiscriptionVH;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS650S0100000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            case 23:
                return invoke$23(this, obj, obj2, obj3);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2, obj3);
            case 25:
                return invoke$25(this, obj, obj2, obj3);
            case 26:
                return invoke$26(this, obj, obj2, obj3);
            case 27:
                return invoke$27(this, obj, obj2, obj3);
            case 28:
                return invoke$28(this, obj, obj2, obj3);
            case 29:
                return invoke$29(this, obj, obj2, obj3);
            case 30:
                return invoke$30(this, obj, obj2, obj3);
            case 31:
                return invoke$31(this, obj, obj2, obj3);
            case 32:
                return invoke$32(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2, obj3);
            case 35:
                return invoke$35(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2, obj3);
            case 37:
                return invoke$37(this, obj, obj2, obj3);
            case 38:
                return invoke$38(this, obj, obj2, obj3);
            case 39:
                return invoke$39(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(C875903bZ c875903bZ, int i) {
        super(3);
        this.$t = i;
        this.l0 = c875903bZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(C965403q0 c965403q0, int i) {
        super(3);
        this.$t = i;
        this.l0 = c965403q0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(TuxIconView tuxIconView, int i) {
        super(3);
        this.$t = i;
        this.l0 = tuxIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(Address address, int i) {
        super(3);
        this.$t = i;
        this.l0 = address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(LogisticSelectFragment logisticSelectFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = logisticSelectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(AuctionAddressPayFragment auctionAddressPayFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = auctionAddressPayFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(OspPageListAssem ospPageListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = ospPageListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(BaseOspBottomWidget baseOspBottomWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = baseOspBottomWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(OspAddressCell ospAddressCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = ospAddressCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(USHalfAddressCell uSHalfAddressCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSHalfAddressCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = combinedSkuOrderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(MiniOspFragment miniOspFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = miniOspFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(OrderSubmitFragment orderSubmitFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = orderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaOneStepOrderSubmitFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(PaymentFragment paymentFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(PaymentHalfFragment paymentHalfFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(PaymentViewModel paymentViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(CCDCAddCardAssem cCDCAddCardAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = cCDCAddCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(BankInstallmentAssem bankInstallmentAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bankInstallmentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(SubPaymentListAssem subPaymentListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = subPaymentListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(InstallmentPlanBriefElementViewHolder installmentPlanBriefElementViewHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = installmentPlanBriefElementViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = installmentPlanListElementViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(SeaPdpInfoViewHolder seaPdpInfoViewHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaPdpInfoViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(UsPdpBottomNavBarWidget usPdpBottomNavBarWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = usPdpBottomNavBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(SkuWidget skuWidget, int i) {
        super(3);
        this.$t = i;
        this.l0 = skuWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(SeaSkuCounterCell seaSkuCounterCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaSkuCounterCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(SkuPanelAssem skuPanelAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = skuPanelAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS650S0100000_1(USLogisticDiscriptionVH uSLogisticDiscriptionVH, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSLogisticDiscriptionVH;
    }

    public static final Object invoke$0(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj3;
        Object obj4 = null;
        if (eCRichTextExtraInfo != null) {
            str = eCRichTextExtraInfo.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            obj4 = mapLJIIJ.get("button_name");
        }
        if ((obj4 instanceof String) && (str2 = (String) obj4) != null) {
            USLogisticDiscriptionVH uSLogisticDiscriptionVH = (USLogisticDiscriptionVH) awS650S0100000_1.l0;
            C1748720vbi.LIZLLL(uSLogisticDiscriptionVH.itemView, new C049Y(), new AwS115S1100000_1(uSLogisticDiscriptionVH, str2, 1));
        }
        if (Intrinsics.LJFF(obj2, "ec_action://logistics/change_location")) {
            JediViewModel jediViewModel = (JediViewModel) ((USLogisticDiscriptionVH) awS650S0100000_1.l0).LLJILLL.getValue();
            jediViewModel.getClass();
            jediViewModel.setState(AFwS228S0000000_1.get$arr$(860));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        if (!((BaseOspBottomWidget) awS650S0100000_1.l0).hp().LLILZIL) {
            ((BaseOspBottomWidget) awS650S0100000_1.l0).hp().xQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) throws Throwable {
        EditText editText;
        if (Intrinsics.LJFF(obj2, Boolean.FALSE)) {
            SeaSkuCounterCell seaSkuCounterCell = (SeaSkuCounterCell) awS650S0100000_1.l0;
            if (!seaSkuCounterCell.LLJJIII && (editText = seaSkuCounterCell.LLJILJIL) != null && editText.hasFocus()) {
                seaSkuCounterCell.LLJJIII = true;
                int iIntValue = 0;
                seaSkuCounterCell.N5().LLJILJIL = false;
                C7735030j c7735030jL5 = seaSkuCounterCell.L5();
                if (c7735030jL5 == null) {
                    seaSkuCounterCell.LLJJIII = false;
                } else {
                    String string = null;
                    Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LATlr0v2KgsoZVe3BNsdmL048/41rHcPJpfvFAuDOqfhKm6iw==", null));
                    if (editableLLJILLL != null) {
                        string = editableLLJILLL.toString();
                    }
                    String strValueOf = "";
                    if (string == null) {
                        string = "";
                    }
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(string);
                    if (numLJIIJJI != null) {
                        iIntValue = numLJIIJJI.intValue();
                    }
                    if (iIntValue > c7735030jL5.LIZIZ) {
                        seaSkuCounterCell.P5(c7735030jL5);
                        iIntValue = c7735030jL5.LIZIZ;
                    } else if (iIntValue < c7735030jL5.LIZ) {
                        seaSkuCounterCell.R5(c7735030jL5);
                        iIntValue = c7735030jL5.LIZ;
                    }
                    seaSkuCounterCell.LLJJIJIIJIL = iIntValue;
                    if (iIntValue != 0) {
                        strValueOf = String.valueOf(iIntValue);
                    }
                    seaSkuCounterCell.U5(strValueOf);
                    seaSkuCounterCell.T5(C13LZ.LJ(seaSkuCounterCell.LLJJIJIIJIL, c7735030jL5.LIZ, c7735030jL5.LIZIZ), c7735030jL5);
                    SeaSkuSpecViewModel.DQ2(seaSkuCounterCell.N5(), iIntValue, 6);
                    KeyboardUtils.LIZIZ(editText);
                    HandlerHook.viewPost(editText, new ARunnableS70S0200000_1(editText, seaSkuCounterCell, 1));
                    C908703gr c908703gr = seaSkuCounterCell.N5().LLJILJILJ;
                    if (c908703gr != null) {
                        c908703gr.LIZLLL("tiktokec_input_staytime", new C10511049d(), new AwS545S0100000_1(seaSkuCounterCell, 0), EnumC1011903xV.LOG_VIEW, seaSkuCounterCell.itemView, null);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        C875203bS c875203bS = C875203bS.LIZ;
        C875903bZ c875903bZ = (C875903bZ) awS650S0100000_1.l0;
        Context context = c875903bZ.LIZ;
        C876403be c876403be = c875903bZ.LIZJ;
        C877303bn c877303bn = c875903bZ.LIZLLL;
        c875203bS.getClass();
        C875203bS.LJII(context, (C867003a8) obj, c876403be, c877303bn, ((Boolean) obj2).booleanValue(), (Function0) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        C875203bS c875203bS = C875203bS.LIZ;
        C875903bZ c875903bZ = (C875903bZ) awS650S0100000_1.l0;
        Context context = c875903bZ.LIZ;
        C876403be c876403be = c875903bZ.LIZJ;
        C877303bn c877303bn = c875903bZ.LIZLLL;
        c875203bS.getClass();
        C875203bS.LJII(context, (C867003a8) obj, c876403be, c877303bn, ((Boolean) obj2).booleanValue(), (Function0) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        AuctionInfoPageData auctionInfoPageData;
        StarlingKeyValue starlingKeyValue;
        AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) obj2;
        if (anonymousClass0376 != null && anonymousClass0376.LLJILJIL && obj3 != null) {
            ConstraintLayout constraintLayout = ((AuctionAddressPayFragment) awS650S0100000_1.l0).LLILZIL;
            if (constraintLayout != null) {
                C12ES.LJIILL(0, constraintLayout);
            }
            View view = ((AuctionAddressPayFragment) awS650S0100000_1.l0).LLILZLL;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
            AuctionAddressPayFragment auctionAddressPayFragment = (AuctionAddressPayFragment) awS650S0100000_1.l0;
            C197039127h c197039127h = auctionAddressPayFragment.LLILZ;
            if (c197039127h != null) {
                UserAuctionInfoData userAuctionInfoData = auctionAddressPayFragment.VR().LLILLL;
                if (userAuctionInfoData != null && (auctionInfoPageData = userAuctionInfoData.pageData) != null && (starlingKeyValue = auctionInfoPageData.doneButton) != null) {
                    str = starlingKeyValue.value;
                } else {
                    str = null;
                }
                C0H1U.LJIIL(c197039127h, str, true);
            }
            C03O0 c03o0 = C03O0.LIZ;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", "done"));
            c03o0.getClass();
            C03O0.LJJIII("livesdk_tiktokec_button_show", mapLJI);
        } else {
            ConstraintLayout constraintLayout2 = ((AuctionAddressPayFragment) awS650S0100000_1.l0).LLILZIL;
            if (constraintLayout2 != null) {
                C0H1U.LIZIZ(constraintLayout2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        if (!((Boolean) obj2).booleanValue() && obj3 == EnumC10383044f.SUCCESS) {
            View view = (View) ((SkuPanelAssem) awS650S0100000_1.l0).LLJILLL.getValue();
            if (view != null) {
                C0H1U.LIZIZ(view);
            }
            View view2 = (View) ((SkuPanelAssem) awS650S0100000_1.l0).LLJILJILJ.getValue();
            if (view2 != null) {
                C12ES.LJIILL(0, view2);
            }
        } else {
            View view3 = (View) ((SkuPanelAssem) awS650S0100000_1.l0).LLJILLL.getValue();
            if (view3 != null) {
                C12ES.LJIILL(0, view3);
            }
            View view4 = (View) ((SkuPanelAssem) awS650S0100000_1.l0).LLJILJILJ.getValue();
            if (view4 != null) {
                C0H1U.LIZIZ(view4);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        UIAssem uIAssem = (UIAssem) obj;
        Pair pair = (Pair) obj3;
        if (Intrinsics.LJFF(obj2, Boolean.TRUE) && ((Number) pair.getFirst()).intValue() > 0) {
            SkuPanelAssemVM skuPanelAssemVMLo = ((SkuPanelAssem) awS650S0100000_1.l0).Lo();
            View viewLJJIJL = uIAssem.LJJIJL();
            C03QL c03ql = skuPanelAssemVMLo.LLJJJJ;
            if (c03ql != null && !c03ql.LLJJJ) {
                skuPanelAssemVMLo.OG(true);
                C1DFH c1dfh = C0PEM.LIZ;
                C948503nH.LJI(skuPanelAssemVMLo, C2107308Nj.LIZ, new C03QJ(c03ql, skuPanelAssemVMLo, viewLJJIJL, null));
            }
        } else if (Intrinsics.LJFF(obj2, Boolean.FALSE)) {
            if (((SkuPanelAssem) awS650S0100000_1.l0).Lo().LLJJJJJIL != null) {
                ((SkuPanelAssem) awS650S0100000_1.l0).Lo().LLJJJJJIL = null;
                ((SkuPanelAssem) awS650S0100000_1.l0).Lo().Oy();
            }
            C03QL c03ql2 = ((SkuPanelAssem) awS650S0100000_1.l0).Lo().LLJJJJ;
            if (c03ql2 != null && c03ql2.LJIIL()) {
                ((SkuPanelAssem) awS650S0100000_1.l0).Lo().setStateImmediate(AFwS228S0000000_1.get$arr$(375));
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        CardView cardViewJo;
        int iIntValue = ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        CardView cardViewJo2 = ((SkuPanelAssem) awS650S0100000_1.l0).Jo();
        if (cardViewJo2 != null && cardViewJo2.getVisibility() == 4 && iIntValue > ((Number) ((SkuPanelAssem) awS650S0100000_1.l0).LLJJJ.getValue()).intValue()) {
            CardView cardViewJo3 = ((SkuPanelAssem) awS650S0100000_1.l0).Jo();
            if (cardViewJo3 != null) {
                C786410Ut5.LLILLL(cardViewJo3, 0);
            }
        } else {
            CardView cardViewJo4 = ((SkuPanelAssem) awS650S0100000_1.l0).Jo();
            if (cardViewJo4 != null && cardViewJo4.getVisibility() == 0 && iIntValue < ((Number) ((SkuPanelAssem) awS650S0100000_1.l0).LLJJJ.getValue()).intValue() && (cardViewJo = ((SkuPanelAssem) awS650S0100000_1.l0).Jo()) != null) {
                C786410Ut5.LLILLL(cardViewJo, 4);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        C1054104Ah c1054104Ah = ((SeaPdpInfoViewHolder) awS650S0100000_1.l0).d6().LLJLIL;
        if (c1054104Ah != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((SeaPdpInfoViewHolder) awS650S0100000_1.l0).LLJJJJ;
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10512049e(), new AwS20S0000100_1(jElapsedRealtime, 4));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        View viewFindViewById;
        Activity activity;
        UIAssem uIAssem = (UIAssem) obj;
        C948003nC c948003nC = (C948003nC) obj2;
        String str = (String) obj3;
        if (c948003nC != null) {
            View viewLJJIJL = uIAssem.LJJIJL();
            RecyclerView recyclerView = null;
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.rn0);
            } else {
                viewFindViewById = null;
            }
            C03NI c03ni = new C03NI(viewFindViewById.getContext(), false, false, null, 14);
            c03ni.LIZ = ((Number) c948003nC.LIZ).intValue();
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                recyclerView = (RecyclerView) viewLJJIJL2.findViewById(R.id.rn0);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                layoutManager.startSmoothScroll(c03ni);
            }
            if (C123100dR.LIZ(str) && (activity = (Activity) ((OspPageListAssem) awS650S0100000_1.l0).LLJI.getValue()) != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(activity);
                c1389880mGw.LJIIIZ(str);
                c1389880mGw.LJIIJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        TextView textView;
        TextView textView2;
        String str = (String) obj2;
        String str2 = (String) obj3;
        View view = ((OspAddressCell) awS650S0100000_1.l0).itemView;
        if (str2 != null && (textView2 = (TextView) view.findViewById(R.id.k5z)) != null) {
            textView2.setText(str2);
        }
        if (str != null && (textView = (TextView) view.findViewById(R.id.k5y)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(':');
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).longValue();
        C1748720vbi.LIZLLL((View) awS650S0100000_1.l0, new C10512049e(), AFwS228S0000000_1.get$arr$(65));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        C1748720vbi.LIZLLL((TuxIconView) awS650S0100000_1.l0, new C10508049a(), new AwS4S1000100_1((String) obj3, ((Number) obj2).longValue(), 1));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.LJFF(obj2, bool)) {
            ((CCDCAddCardAssem) awS650S0100000_1.l0).Zo().LLJLL = null;
            C890103dr c890103dr = C890103dr.LIZ;
            String strLo = ((CCDCAddCardAssem) awS650S0100000_1.l0).Lo();
            c890103dr.getClass();
            C890103dr.LJIIIZ = strLo;
            C197039127h c197039127hGo = ((CCDCAddCardAssem) awS650S0100000_1.l0).Go();
            if (c197039127hGo != null) {
                C12ES.LJIILL(0, c197039127hGo);
            }
            DirectCheckoutBottomWidget directCheckoutBottomWidgetNo = ((CCDCAddCardAssem) awS650S0100000_1.l0).No();
            if (directCheckoutBottomWidgetNo != null) {
                C03DZ.LIZ(directCheckoutBottomWidgetNo);
            }
        } else if (Intrinsics.LJFF(obj2, Boolean.TRUE) && Intrinsics.LJFF(obj3, bool)) {
            CCDCAddCardViewModel cCDCAddCardViewModelZo = ((CCDCAddCardAssem) awS650S0100000_1.l0).Zo();
            cCDCAddCardViewModelZo.withState(new AwS10S1210000_1(cCDCAddCardViewModelZo, (CCDCAddCardViewModel) false, (boolean) "", (String) new AwS367S0200000_1(cCDCAddCardViewModelZo, new AwS615S0100000_1((CCDCAddCardAssem) awS650S0100000_1.l0, 179), 87), (Function1<? super PaymentInfo, Unit>) 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        UIAssem uIAssem = (UIAssem) obj;
        List list = (List) obj2;
        PaymentMethod paymentMethod = (PaymentMethod) obj3;
        if (paymentMethod != null && list != null) {
            uIAssem.withState(((SubPaymentListAssem) awS650S0100000_1.l0).So(), new AwS100S0400000_1((SubPaymentListAssem) awS650S0100000_1.l0, (SubPaymentListAssem) list, (List<PaymentMethod>) uIAssem, (UIAssem) paymentMethod, (PaymentMethod) 23));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj2;
        Integer num = (Integer) obj3;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        View viewFindViewById = null;
        if (viewLJJIJL != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.gxx)) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
        if (num != null) {
            BankInstallmentAssem bankInstallmentAssem = (BankInstallmentAssem) awS650S0100000_1.l0;
            int iIntValue = num.intValue();
            if (bankInstallmentAssem.LJJIJL() != null) {
                View view = bankInstallmentAssem.LLIZLLLIL;
                if (view == null) {
                    View viewLJJIJL2 = bankInstallmentAssem.LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById = viewLJJIJL2.findViewById(R.id.gxx);
                    }
                    bankInstallmentAssem.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
                    view = viewFindViewById;
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) view;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv2, new ARunnableS13S0101000_1(iIntValue, viewOnAttachStateChangeListenerC20604515jv2, 1), 200L);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        String str2 = (String) obj2;
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj3;
        String str3 = null;
        if (eCRichTextExtraInfo != null) {
            str = eCRichTextExtraInfo.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            Object obj4 = mapLJIIJ.get("button_name");
            if (obj4 instanceof String) {
                str3 = (String) obj4;
            }
            if (C770702zh.LIZIZ(str3)) {
                C1748720vbi.LIZLLL(((USHalfAddressCell) awS650S0100000_1.l0).itemView, new C049Y(), new AwS580S0100000_1((HashMap) mapLJIIJ, (HashMap<String, Object>) 817));
            }
        }
        if (str2 != null && str2.length() != 0) {
            AssemVMLazy assemVMLazy = ((USHalfAddressCell) awS650S0100000_1.l0).LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = USHalfAddressCell.LLJILLL;
            assemVMLazy.getValue();
            OspAddressViewModel.vQ2(((USHalfAddressCell) awS650S0100000_1.l0).itemView.getContext(), str2, ((USHalfAddressCell) awS650S0100000_1.l0).N5());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PaymentViewModel.wR2(((InstallmentPlanListElementViewHolder) awS650S0100000_1.l0).W5(), (PaymentMethod) obj, null, (InstallmentPlan) obj2, zBooleanValue, new AwS580S0100000_1((InstallmentPlanListElementViewHolder) awS650S0100000_1.l0, 834), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PaymentViewModel.wR2((PaymentViewModel) ((InstallmentPlanBriefElementViewHolder) awS650S0100000_1.l0).LLJILJILJ.getValue(), (PaymentMethod) obj, null, (InstallmentPlan) obj2, zBooleanValue, new AwS580S0100000_1((InstallmentPlanBriefElementViewHolder) awS650S0100000_1.l0, 836), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        int i;
        List<StaticSellingPoint> list;
        C03IT imageUrlModel;
        String color;
        Image iconDark;
        Image icon;
        PdpBottomAreaElem pdpBottomAreaElem = (PdpBottomAreaElem) obj;
        LinkRichText linkRichText = (LinkRichText) obj2;
        final UsPdpBottomNavBarWidget usPdpBottomNavBarWidget = (UsPdpBottomNavBarWidget) awS650S0100000_1.l0;
        int i2 = 8;
        if (pdpBottomAreaElem == null) {
            C786410Ut5.LJLLLLLL(0, usPdpBottomNavBarWidget.LJIIIZ());
            C786410Ut5.LJLLLLLL(8, usPdpBottomNavBarWidget.LJII());
        } else {
            usPdpBottomNavBarWidget.getClass();
            if (pdpBottomAreaElem.buttons == null) {
                C786410Ut5.LJLLLLLL(8, usPdpBottomNavBarWidget.LJIIIZ());
                C786410Ut5.LJLLLLLL(8, usPdpBottomNavBarWidget.LJII());
            } else {
                C786410Ut5.LJLLLLLL(8, usPdpBottomNavBarWidget.LJIIIZ());
                C786410Ut5.LJLLLLLL(0, usPdpBottomNavBarWidget.LJII());
                List<PdpButton> list2 = pdpBottomAreaElem.buttons;
                usPdpBottomNavBarWidget.LJII().setEnableButtonVibration(true);
                usPdpBottomNavBarWidget.LJII().LIZ(null, list2);
                if (pdpBottomAreaElem.statusNotice == null && pdpBottomAreaElem.statusSubNotice == null) {
                    C786410Ut5.LJLLLLLL(8, usPdpBottomNavBarWidget.LJIIIIZZ());
                } else {
                    C786410Ut5.LJLLLLLL(0, usPdpBottomNavBarWidget.LJIIIIZZ());
                    View viewFindViewById = usPdpBottomNavBarWidget.LLJJI;
                    if (viewFindViewById == null) {
                        View view = usPdpBottomNavBarWidget.LLILZ;
                        if (view != null) {
                            viewFindViewById = view.findViewById(R.id.tv_tips);
                        } else {
                            viewFindViewById = null;
                        }
                        usPdpBottomNavBarWidget.LLJJI = (TuxTextView) viewFindViewById;
                    }
                    usPdpBottomNavBarWidget.LJIILJJIL((TuxTextView) viewFindViewById, pdpBottomAreaElem.statusNotice);
                    View viewFindViewById2 = usPdpBottomNavBarWidget.LLJJIII;
                    if (viewFindViewById2 == null) {
                        View view2 = usPdpBottomNavBarWidget.LLILZ;
                        if (view2 != null) {
                            viewFindViewById2 = view2.findViewById(R.id.tv_sub_tips);
                        } else {
                            viewFindViewById2 = null;
                        }
                        usPdpBottomNavBarWidget.LLJJIII = (TuxTextView) viewFindViewById2;
                    }
                    usPdpBottomNavBarWidget.LJIILJJIL((TuxTextView) viewFindViewById2, pdpBottomAreaElem.statusSubNotice);
                }
                ProductPackStruct productPackStruct = usPdpBottomNavBarWidget.LJIILIIL().LLJILLL;
                if (productPackStruct != null && (list = productPackStruct.staticSellingPoints) != null) {
                    int size = list.size();
                    C786410Ut5.LJLLLLLL(8, usPdpBottomNavBarWidget.LJIIJ());
                    for (int childCount = usPdpBottomNavBarWidget.LJIIJ().getChildCount() - 1; -1 < childCount; childCount--) {
                        View childAt = usPdpBottomNavBarWidget.LJIIJ().getChildAt(childCount);
                        if (childAt instanceof C802703Bp) {
                            C786410Ut5.LJJLIIIJ(usPdpBottomNavBarWidget.LJIIJ(), childAt);
                            usPdpBottomNavBarWidget.LLJJJIL.add((C802703Bp) childAt);
                        }
                    }
                    int i3 = 0;
                    for (StaticSellingPoint staticSellingPoint : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            StaticSellingPoint staticSellingPoint2 = staticSellingPoint;
                            Integer num = staticSellingPoint2.position;
                            if ((num != null && num.intValue() == 0) || staticSellingPoint2.position == null) {
                                break;
                            }
                            C786410Ut5.LJLLLLLL(0, usPdpBottomNavBarWidget.LJIIJ());
                            String str = staticSellingPoint2.title;
                            if (str != null) {
                                final C802703Bp c802703Bp = (C802703Bp) C19719612Di.LJJIIZI(usPdpBottomNavBarWidget.LLJJJIL);
                                if (c802703Bp == null) {
                                    c802703Bp = new C802703Bp(C1745060vVo.LIZ(usPdpBottomNavBarWidget));
                                }
                                Icon icon2 = staticSellingPoint2.icon;
                                if (icon2 != null && (icon = icon2.getIcon()) != null) {
                                    imageUrlModel = icon.toImageUrlModel();
                                } else {
                                    imageUrlModel = null;
                                }
                                C802703Bp.LIZ(c802703Bp, imageUrlModel, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 50);
                                new AwS19S1101000_1(str, size, staticSellingPoint2, 0).invoke(c802703Bp.getComTextFromXml());
                                Icon icon3 = staticSellingPoint2.icon;
                                if (icon3 != null && (iconDark = icon3.getIconDark()) != null && C1744700vVE.LJ(c802703Bp.getContext(), null)) {
                                    C802703Bp.LIZ(c802703Bp, iconDark.toImageUrlModel(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 50);
                                }
                                CommonColor commonColor = staticSellingPoint2.backgroundColor;
                                if (commonColor != null) {
                                    try {
                                        if (C1744700vVE.LJ(C1745060vVo.LIZ(usPdpBottomNavBarWidget), null)) {
                                            color = commonColor.getDarkColor();
                                        } else {
                                            color = commonColor.getColor();
                                        }
                                        c802703Bp.setBackgroundColor(Color.parseColor(color));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                if (size == 1) {
                                    layoutParams.addRule(13);
                                } else {
                                    C786410Ut5.LJLLLLLL(0, usPdpBottomNavBarWidget.LJIIJ().findViewById(R.id.fzj));
                                    if (i3 != 0) {
                                        if (i3 != 1) {
                                            break;
                                        }
                                        layoutParams.addRule(1, usPdpBottomNavBarWidget.LJIIJ().findViewById(R.id.fzj).getId());
                                    } else {
                                        layoutParams.addRule(0, usPdpBottomNavBarWidget.LJIIJ().findViewById(R.id.fzj).getId());
                                    }
                                }
                                String str2 = staticSellingPoint2.buttonType;
                                if (str2 != null) {
                                    usPdpBottomNavBarWidget.LJIILIIL().LLLJ.add(str2);
                                }
                                usPdpBottomNavBarWidget.LJIIJ().addView(c802703Bp, layoutParams);
                                C1054004Ag c1054004Ag = usPdpBottomNavBarWidget.LJIILIIL().LLJLILLLLZIIL;
                                if (c1054004Ag != null) {
                                    HashMap map = new HashMap();
                                    String str3 = staticSellingPoint2.buttonType;
                                    if (str3 != null) {
                                        map.put("button_type", str3);
                                    }
                                    map.put("button_area", "bottom_bar");
                                    C1054004Ag.LJIILJJIL(c1054004Ag, "selling_point", map, null, null, 12);
                                }
                                String str4 = staticSellingPoint2.description;
                                if (str4 != null && str4.length() != 0) {
                                    final String str5 = staticSellingPoint2.description;
                                    final String str6 = staticSellingPoint2.buttonType;
                                    C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.03zV
                                        @Override // X.AbstractViewOnClickListenerC420730Ged
                                        public final void LIZ(View view3) {
                                            if (view3 != null) {
                                                C1054004Ag c1054004Ag2 = usPdpBottomNavBarWidget.LJIILIIL().LLJLILLLLZIIL;
                                                if (c1054004Ag2 != null) {
                                                    HashMap map2 = new HashMap();
                                                    String str7 = str6;
                                                    if (str7 != null) {
                                                        map2.put("button_type", str7);
                                                    }
                                                    map2.put("button_area", "bottom_bar");
                                                    C1054004Ag.LJIILIIL(c1054004Ag2, "selling_point", map2, null, null, 28);
                                                }
                                                C1397580mTM c1397580mTM = new C1397580mTM(c802703Bp.getContext());
                                                c1397580mTM.LIZIZ(str5);
                                                C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(833));
                                                c1397580mTM.LJII = false;
                                                new C1397510mTF(c1397580mTM).LIZLLL();
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(700L);
                                        }
                                    }, c802703Bp);
                                }
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                ConstraintLayout constraintLayoutLJIIJJI = usPdpBottomNavBarWidget.LJIIJJI();
                if (usPdpBottomNavBarWidget.LJIIIIZZ().getVisibility() != 0 && usPdpBottomNavBarWidget.LJIIJ().getVisibility() != 0) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, constraintLayoutLJIIJJI);
            }
        }
        UsPdpBottomNavBarWidget usPdpBottomNavBarWidget2 = (UsPdpBottomNavBarWidget) awS650S0100000_1.l0;
        TuxTextView tuxTextViewLJIIL = usPdpBottomNavBarWidget2.LJIIL();
        if (linkRichText != null) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextViewLJIIL);
        if (linkRichText != null) {
            if (!usPdpBottomNavBarWidget2.LLJJIJIL) {
                usPdpBottomNavBarWidget2.LLJJIJIL = true;
                C1748720vbi.LIZIZ(usPdpBottomNavBarWidget2.LLJ, new C10515049h(), AFwS228S0000000_1.get$arr$(834));
            }
            usPdpBottomNavBarWidget2.LJIIL().setText(RichTextUtil.LJ(RichTextUtil.LIZ, C1745060vVo.LIZ(usPdpBottomNavBarWidget2), linkRichText, null, 0, false, null, null, null, null, false, false, null, null, null, 16380));
            usPdpBottomNavBarWidget2.LJIIL().setTextColor(linkRichText.LIZIZ(C1745060vVo.LIZ(usPdpBottomNavBarWidget2)));
            C786410Ut5.I7(new AjS40S0200000_1(linkRichText, usPdpBottomNavBarWidget2, 93), usPdpBottomNavBarWidget2.LJIIL());
        }
        ((UsPdpBottomNavBarWidget) awS650S0100000_1.l0).LJI();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        C1748720vbi.LIZLLL((TuxIconView) awS650S0100000_1.l0, new C10508049a(), new AwS4S1000100_1((String) obj3, ((Number) obj2).longValue(), 3));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r1
      0x002d: PHI (r1v9 android.view.View) = (r1v8 android.view.View), (r1v10 android.view.View) binds: [B:5:0x0019, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$29(kotlin.jvm.internal.AwS650S0100000_1 r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            java.lang.Number r9 = (java.lang.Number) r9
            int r4 = r9.intValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            r0 = 2
            r6 = 2131392099(0x7f0a7663, float:1.8404816E38)
            r5 = 0
            if (r1 != r0) goto L35
            java.lang.Object r2 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment r2 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment) r2
            X.0vcc r1 = r2.LLIZLLLIL
            if (r1 != 0) goto L2d
            android.view.View r0 = r2.getView()
            if (r0 == 0) goto L25
            android.view.View r5 = r0.findViewById(r6)
        L25:
            r0 = r5
            X.0vcc r0 = (X.C1749280vcc) r0
            r2.LLIZLLLIL = r0
            r1 = r5
            if (r5 == 0) goto L32
        L2d:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L32:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            java.lang.Object r1 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment r1 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment) r1
            X.0vcc r3 = r1.LLIZLLLIL
            if (r3 != 0) goto L4c
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto Lb1
            android.view.View r3 = r0.findViewById(r6)
        L47:
            r0 = r3
            X.0vcc r0 = (X.C1749280vcc) r0
            r1.LLIZLLLIL = r0
        L4c:
            X.0vcc r3 = (X.C1749280vcc) r3
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment) r0
            android.content.Context r2 = r0.getContext()
            if (r2 == 0) goto La2
            X.0uv6 r5 = new X.0uv6
            r5.<init>()
            X.0HTI r1 = new X.0HTI
            r1.<init>()
            r0 = 2130968594(0x7f040012, float:1.7545846E38)
            r1.LIZ = r0
            android.graphics.drawable.Drawable r1 = r1.LIZ(r2)
            r0 = 0
            r5.LIZJ = r0
            r5.LIZ = r1
            r0 = 120(0x78, float:1.68E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            r0 = 80
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r5.LIZLLL = r1
            r5.LJ = r0
            r0 = 2131832986(0x7f11309a, float:1.9299041E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LJFF = r0
            r0 = 2131832987(0x7f11309b, float:1.9299043E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.LJII = r0
        La2:
            kotlin.jvm.internal.AwS545S0100000_1 r2 = new kotlin.jvm.internal.AwS545S0100000_1
            java.lang.Object r1 = r7.l0
            com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment r1 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment) r1
            r0 = 1745(0x6d1, float:2.445E-42)
            r2.<init>(r1, r0)
            X.C1206020hUO.LIZJ(r3, r4, r5, r2)
            goto L32
        Lb1:
            r3 = r5
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS650S0100000_1.invoke$29(kotlin.jvm.internal.AwS650S0100000_1, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        C1748720vbi.LIZLLL((TuxIconView) awS650S0100000_1.l0, new C10508049a(), new AwS4S1000100_1((String) obj3, ((Number) obj2).longValue(), 0));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String string = (String) obj3;
        try {
            if (((Boolean) obj2).booleanValue()) {
                OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) awS650S0100000_1.l0;
                if (orderSubmitFragment.LLJJJIL == null) {
                    orderSubmitFragment.LLJJJIL = new C20515215Pi(orderSubmitFragment);
                }
                C20515215Pi c20515215Pi = orderSubmitFragment.LLJJJIL;
                if (c20515215Pi != null) {
                    if (string == null) {
                        string = ((OrderSubmitFragment) awS650S0100000_1.l0).requireContext().getString(2131832905);
                    }
                    c20515215Pi.LIZ.LJFF = string;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bell;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c20515215Pi.LJFF(c419910GdJ);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                    C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                    c1057450dcl.LJIIIZ = iLIZIZ;
                    c1057450dcl.LIZJ = false;
                    c20515215Pi.LIZLLL();
                }
                C1748720vbi.LIZIZ((OrderSubmitFragment) awS650S0100000_1.l0, new C049G(), new AwS580S0100000_1((OrderSubmitFragment) awS650S0100000_1.l0, 1021));
            } else {
                C20515215Pi c20515215Pi2 = ((OrderSubmitFragment) awS650S0100000_1.l0).LLJJJIL;
                if (c20515215Pi2 != null) {
                    c20515215Pi2.LIZIZ();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$31(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String string = (String) obj3;
        try {
            if (((Boolean) obj2).booleanValue()) {
                DialogC989903tx dialogC989903tx = (DialogC989903tx) ((CombinedSkuOrderSubmitFragment) awS650S0100000_1.l0).LLJI.getValue();
                if (dialogC989903tx != null) {
                    CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment = (CombinedSkuOrderSubmitFragment) awS650S0100000_1.l0;
                    C20515215Pi c20515215Pi = new C20515215Pi(dialogC989903tx);
                    if (string == null) {
                        string = combinedSkuOrderSubmitFragment.requireContext().getString(2131832905);
                    }
                    c20515215Pi.LIZ.LJFF = string;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bell;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c20515215Pi.LJFF(c419910GdJ);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                    C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                    c1057450dcl.LJIIIZ = iLIZIZ;
                    c1057450dcl.LIZJ = false;
                    c20515215Pi.LJ();
                    dialogC989903tx.show();
                    C785410UrT.LIZIZ(dialogC989903tx);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC989903tx);
                    C816490W1f.LIZ(dialogC989903tx);
                }
                C1748720vbi.LIZIZ((CombinedSkuOrderSubmitFragment) awS650S0100000_1.l0, new C049G(), new AwS580S0100000_1((CombinedSkuOrderSubmitFragment) awS650S0100000_1.l0, 1026));
            } else {
                DialogC989903tx dialogC989903tx2 = (DialogC989903tx) ((CombinedSkuOrderSubmitFragment) awS650S0100000_1.l0).LLJI.getValue();
                if (dialogC989903tx2 != null) {
                    dialogC989903tx2.dismiss();
                    C785410UrT.LIZ(dialogC989903tx2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$32(kotlin.jvm.internal.AwS650S0100000_1 r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS650S0100000_1.invoke$32(kotlin.jvm.internal.AwS650S0100000_1, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$33(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        List<ShopOrderNew> list;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        if (zBooleanValue && zBooleanValue2) {
            OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) awS650S0100000_1.l0;
            orderSubmitFragment.getClass();
            if (C818303Hp.LIZ() && orderSubmitFragment.LLJJJJJIL && !orderSubmitFragment.ZR().iS2()) {
                BillInfoData billInfoData = orderSubmitFragment.ZR().LLJJI;
                if (billInfoData != null) {
                    list = billInfoData.newShopOrders;
                } else {
                    list = null;
                }
                if (!C7806033c.LIZ(list) && !C03IF.LIZ() && !ECLatamOspFlowOpt.LIZ()) {
                    orderSubmitFragment.LLJJJJJIL = false;
                    C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, "add_a_new_address", null, null, null, "shipping_address", true, 14);
                    C03JM c03jm = C03JM.LIZ;
                    C19EG activity = orderSubmitFragment.getActivity();
                    orderSubmitFragment.getView();
                    AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(orderSubmitFragment, 1786);
                    c03jm.getClass();
                    C03JM.LIZ(activity, awS545S0100000_1);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        long jLongValue = ((Number) obj3).longValue();
        if (zBooleanValue) {
            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0;
            if (seaOneStepOrderSubmitFragment.LLLF) {
                seaOneStepOrderSubmitFragment.VR();
            } else {
                View view = seaOneStepOrderSubmitFragment.LLJL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                C1390130mHL c1390130mHL = seaOneStepOrderSubmitFragment.LLJLIL;
                if (c1390130mHL != null) {
                    c1390130mHL.setMessage(2131835638);
                    C786410Ut5.LLZ(c1390130mHL, 0);
                }
            }
        } else {
            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment2 = (SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0;
            if (seaOneStepOrderSubmitFragment2.LLLF) {
                if (jLongValue > seaOneStepOrderSubmitFragment2.LLLIIII) {
                    seaOneStepOrderSubmitFragment2.LLLIIII = jLongValue;
                } else {
                    Long l = seaOneStepOrderSubmitFragment2.LLLFFI;
                    if (l != null) {
                        long jLongValue2 = l.longValue();
                        String str2 = seaOneStepOrderSubmitFragment2.LLLFZ;
                        if (jLongValue2 == seaOneStepOrderSubmitFragment2.LLLFF) {
                            BillInfoData billInfoData = seaOneStepOrderSubmitFragment2.bS().LLJJI;
                            if (billInfoData != null && (str = billInfoData.requestId) != null && str.length() != 0 && !Intrinsics.LJFF(str, str2)) {
                                C736680Sv4.LJIJJ(seaOneStepOrderSubmitFragment2.aS(), new AwS580S0100000_1(seaOneStepOrderSubmitFragment2, 1068));
                                seaOneStepOrderSubmitFragment2.LLLF = false;
                                seaOneStepOrderSubmitFragment2.LLLFFI = null;
                                seaOneStepOrderSubmitFragment2.LLLFZ = null;
                                AssemVMLazy assemVMLazy = seaOneStepOrderSubmitFragment2.LLIZ;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SeaOneStepOrderSubmitFragment.LLLILZJ;
                                ((OspBottomViewModel) assemVMLazy.getValue()).xQ2();
                            } else {
                                seaOneStepOrderSubmitFragment2.WR();
                            }
                        }
                    }
                    ((SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0).VR();
                }
            } else {
                try {
                    ((SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0).VR();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SeaOneStepOrderSubmitFragment showDialogState exception: ");
                    sbLIZ.append(e);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        C20691715xz c20691715xz;
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil;
        View viewFindViewById;
        if (Intrinsics.LJFF(obj2, Boolean.FALSE) && (((c20691715xz = ((SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0).LLJJIJIIJIL) == null || (viewFindViewById = c20691715xz.findViewById(R.id.vh_)) == null || !viewFindViewById.hasFocus()) && (keyBoardVisibilityUtil = (seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0).LLLIILIL) != null)) {
            keyBoardVisibilityUtil.LIZIZ(seaOneStepOrderSubmitFragment.LLJJIJIIJIL);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$36(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment;
        C20691715xz c20691715xz;
        C948003nC c948003nC = (C948003nC) obj2;
        String str = (String) obj3;
        if (c948003nC != null && (c20691715xz = (seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) awS650S0100000_1.l0).LLJJIJIIJIL) != null) {
            C03NI c03ni = new C03NI(c20691715xz.getContext(), false, false, null, 14);
            c03ni.LIZ = ((Number) c948003nC.LIZ).intValue();
            RecyclerView.LayoutManager layoutManager = c20691715xz.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                layoutManager.startSmoothScroll(c03ni);
            }
            if (C123100dR.LIZ(str)) {
                seaOneStepOrderSubmitFragment.bu(str);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$37(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String string = (String) obj3;
        try {
            if (((Boolean) obj2).booleanValue()) {
                DialogC989903tx dialogC989903tx = (DialogC989903tx) ((MiniOspFragment) awS650S0100000_1.l0).LLJILJIL.getValue();
                if (dialogC989903tx != null) {
                    MiniOspFragment miniOspFragment = (MiniOspFragment) awS650S0100000_1.l0;
                    C20515215Pi c20515215Pi = new C20515215Pi(dialogC989903tx);
                    if (string == null) {
                        string = miniOspFragment.requireContext().getString(2131832905);
                    }
                    c20515215Pi.LIZ.LJFF = string;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bell;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c20515215Pi.LJFF(c419910GdJ);
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
                    C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                    c1057450dcl.LJIIIZ = iLIZIZ;
                    c1057450dcl.LIZJ = false;
                    c20515215Pi.LJ();
                    dialogC989903tx.show();
                    C785410UrT.LIZIZ(dialogC989903tx);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC989903tx);
                    C816490W1f.LIZ(dialogC989903tx);
                }
                C1748720vbi.LIZIZ((MiniOspFragment) awS650S0100000_1.l0, new C049G(), new AwS580S0100000_1((MiniOspFragment) awS650S0100000_1.l0, 1089));
            } else {
                DialogC989903tx dialogC989903tx2 = (DialogC989903tx) ((MiniOspFragment) awS650S0100000_1.l0).LLJILJIL.getValue();
                if (dialogC989903tx2 != null) {
                    dialogC989903tx2.dismiss();
                    C785410UrT.LIZ(dialogC989903tx2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        String str;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        ReachableAddress reachableAddress = (ReachableAddress) obj2;
        int iIntValue = ((Number) obj3).intValue();
        boolean z = false;
        if (reachableAddress != null && iIntValue == 3) {
            C1841350y17 c1841350y17 = (C1841350y17) viewHolder.itemView.findViewById(R.id.sp_);
            Address address = reachableAddress.address;
            if (address != null) {
                str = address.id;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, ((Address) awS650S0100000_1.l0).id) && Intrinsics.LJFF(reachableAddress.reachable, Boolean.TRUE)) {
                z = true;
            }
            c1841350y17.setChecked(z);
        } else {
            ((C1841350y17) viewHolder.itemView.findViewById(R.id.sp_)).setChecked(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        C11E9 c11e9 = (C11E9) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        if (iIntValue == -1 || iIntValue2 == -1) {
            C965403q0 c965403q0 = (C965403q0) awS650S0100000_1.l0;
            if (!c965403q0.LLJIJIL) {
                c11e9.withState(c965403q0.LLJI, new AwS580S0100000_1(c965403q0, 1130));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        HashMap<String, Object> map;
        String str;
        String strLIZLLL;
        String strLIZJ;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        PaymentMethodsData paymentMethodsData = ((PaymentFragment) awS650S0100000_1.l0).yS().LLJJIJIL;
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        activateHelper.getClass();
        if (!ActivateHelper.LJFF(paymentMethod, paymentMethodsData) && !((PaymentFragment) awS650S0100000_1.l0).WR(paymentInfo.paymentMethod)) {
            ((PaymentFragment) awS650S0100000_1.l0).LLJJL.invoke(paymentInfo, obj2, obj3);
        } else {
            Context context = ((PaymentFragment) awS650S0100000_1.l0).getContext();
            if (context != null) {
                PaymentFragment paymentFragment = (PaymentFragment) awS650S0100000_1.l0;
                InstallmentPlan installmentPlanRR2 = paymentFragment.yS().rR2(paymentInfo.paymentMethod, "activate bnpl from payment fragment second pay");
                PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
                String str2 = paymentFragment.yS().LLJJJ;
                EnterParams enterParams = paymentFragment.yS().LLJ;
                if (enterParams != null) {
                    map = enterParams.trackParams;
                } else {
                    map = null;
                }
                if (installmentPlanRR2 != null) {
                    str = installmentPlanRR2.tenure;
                    strLIZLLL = installmentPlanRR2.LIZLLL(true);
                    strLIZJ = installmentPlanRR2.LIZJ();
                } else {
                    str = null;
                    strLIZLLL = null;
                    strLIZJ = null;
                }
                activateHelper.getClass();
                ActivateHelper.LIZ(context, paymentMethod2, str2, map, null, str, strLIZLLL, strLIZJ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((PaymentHalfFragment) awS650S0100000_1.l0).LLJILJIL.invoke(obj, obj2, obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        PaymentInfo paymentInfo = (PaymentInfo) obj2;
        if (!((Boolean) obj).booleanValue()) {
            if (Intrinsics.LJFF(obj3, Boolean.TRUE)) {
                ((PaymentViewModel) awS650S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(220));
            } else {
                ((PaymentViewModel) awS650S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(223));
            }
        } else {
            PaymentViewModel paymentViewModel = (PaymentViewModel) awS650S0100000_1.l0;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(paymentViewModel), C0PEM.LIZJ, null, new C879803cC(paymentViewModel.LLJ, paymentInfo, paymentViewModel, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        SkcInfo skcInfo;
        List<SaleProp> list;
        if (obj2 == EnumC10383044f.SUCCESS) {
            SkuInfo skuInfo = ((SkuWidget) awS650S0100000_1.l0).LJII().LLJIJIL;
            if (skuInfo != null && (list = skuInfo.salePropList) != null) {
                C041G.LIZIZ(list);
            }
            SkuWidget skuWidget = (SkuWidget) awS650S0100000_1.l0;
            C04EM c04em = skuWidget.LLJILJILJ;
            String[] strArr = null;
            if (c04em == null) {
                c04em = null;
            }
            SkuInfo skuInfo2 = skuWidget.LJII().LLJIJIL;
            ProductPackStruct productPackStruct = ((SkuWidget) awS650S0100000_1.l0).LJII().LLJILJILJ;
            if (productPackStruct != null) {
                skcInfo = productPackStruct.skcInfo;
            } else {
                skcInfo = null;
            }
            SkuPanelState skuPanelState = ((SkuWidget) awS650S0100000_1.l0).LJII().LLJI;
            if (skuPanelState != null) {
                strArr = skuPanelState.checkedSkuIds;
            }
            c04em.LJIIIIZZ(skuInfo2, skcInfo, strArr, ((SkuWidget) awS650S0100000_1.l0).LJII(), new AwS650S0100000_1((SkuWidget) awS650S0100000_1.l0, 9), ((SkuWidget) awS650S0100000_1.l0).LLJI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        String str = (String) obj3;
        return ((SkuWidget) awS650S0100000_1.l0).LJIIJ(str, (ViewGroup) obj2);
    }

    public static final Object invoke$9(AwS650S0100000_1 awS650S0100000_1, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        String str = (String) obj3;
        return ((SkuWidget) awS650S0100000_1.l0).LJIIJ(str, (ViewGroup) obj2);
    }
}
