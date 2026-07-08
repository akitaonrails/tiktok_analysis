package kotlin.jvm.internal;

import X.C03BW;
import X.C03BY;
import X.C03JV;
import X.C044V;
import X.C09AY;
import X.C1018303yX;
import X.C10306041g;
import X.C118300cf;
import X.C1390920mIc;
import X.C1397580mTM;
import X.C1397630mTR;
import X.C13LP;
import X.C1741890vQh;
import X.C259800zU;
import X.C719202rO;
import X.C752702wn;
import X.C752802wo;
import X.C815203Gk;
import X.C887503dR;
import X.C888603dc;
import X.C978303s5;
import X.C979503sH;
import X.EnumC805703Ct;
import X.InterfaceC1891350zJl;
import X.InterfaceC975703rf;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bnpl.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy.UsReturnPolicyVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS36S0301000_1 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS36S0301000_1 r33, java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS36S0301000_1.invoke$0(kotlin.jvm.internal.AwS36S0301000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        AddressListState addressListState = (AddressListState) obj;
        List<InterfaceC1891350zJl> listRL0 = ((InterfaceC975703rf) awS36S0301000_1.l0).RL0((AddressListData) awS36S0301000_1.l1);
        C978303s5 c978303s5 = new C978303s5(((AddressListData) awS36S0301000_1.l1).privacyPolicyStatement, ((InterfaceC975703rf) awS36S0301000_1.l0).d41());
        C979503sH c979503sH = new C979503sH(awS36S0301000_1.i3, ((C118300cf) awS36S0301000_1.l2).element);
        String strGT1 = ((InterfaceC975703rf) awS36S0301000_1.l0).gT1(((AddressListData) awS36S0301000_1.l1).addressList);
        if (strGT1 == null) {
            strGT1 = addressListState.getSelectAddressId();
        }
        return addressListState.copy(addressListState.status, listRL0, strGT1, c978303s5, c979503sH, addressListState.changeOnOrderToast);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        boolean zLJFF;
        String priceStr;
        List<InstallmentPlan> list;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("module_name", "tiktok_paylater");
        BnplInfo bnplInfo = ((C10306041g) ((PdpPaymentModuleViewHolder) awS36S0301000_1.l0).LLILLJJLI).LIZ;
        if (bnplInfo != null) {
            zLJFF = Intrinsics.LJFF(bnplInfo.isAuth, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (!zLJFF) {
            laneParams.put("module_type", "register");
        } else {
            laneParams.put("module_type", "select");
            BnplInfo bnplInfo2 = ((C10306041g) ((PdpPaymentModuleViewHolder) awS36S0301000_1.l0).LLILLJJLI).LIZ;
            if (bnplInfo2 != null && (list = bnplInfo2.installmentPlans) != null) {
                laneParams.put("module_option_cnt", Integer.valueOf(list.size()));
            }
            laneParams.put("rank", Integer.valueOf(awS36S0301000_1.i3));
            laneParams.put("installment_cnt", ((InstallmentPlan) awS36S0301000_1.l1).tenure);
            laneParams.put("total_payment", ((InstallmentPlan) awS36S0301000_1.l1).extraDescription);
            Amount amount = ((InstallmentPlan) awS36S0301000_1.l1).totalRepayment;
            String currency = null;
            if (amount != null) {
                priceStr = amount.getPriceStr();
            } else {
                priceStr = null;
            }
            laneParams.put("service_fee", priceStr);
            Amount amount2 = ((InstallmentPlan) awS36S0301000_1.l1).totalRepayment;
            if (amount2 != null) {
                currency = amount2.getCurrency();
            }
            laneParams.put("currency", currency);
            laneParams.put("click_type", ((C259800zU) awS36S0301000_1.l2).element);
        }
        String str = ((C10306041g) ((PdpPaymentModuleViewHolder) awS36S0301000_1.l0).LLILLJJLI).LIZIZ;
        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
            laneParams.withNotCheckParams(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        boolean z;
        C03JV c03jv = (C03JV) obj;
        C03BW c03bw = ((USAddonOrderCell) awS36S0301000_1.l0).LLJLLIL;
        if (c03bw != null) {
            C752702wn c752702wn = ((C752802wo) awS36S0301000_1.l1).LLILZLL;
            List<C03BY> list = (List) awS36S0301000_1.l2;
            int i = awS36S0301000_1.i3;
            if (c03jv.LLLLLIL != EnumC805703Ct.ORDER_HAVE_CREATED) {
                z = true;
            } else {
                z = false;
            }
            c03bw.LL = c752702wn;
            c03bw.LLILLJJLI = list;
            c03bw.LLILLL = i;
            c03bw.LLILZ = z;
            c03bw.notifyDataSetChanged();
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$3(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        String str;
        String str2;
        PaymentState paymentState = (PaymentState) obj;
        EnterParams enterParams = ((PaymentViewModel) awS36S0301000_1.l0).LLJ;
        if (paymentState.getCheckedPaymentMethod() != null && enterParams != null) {
            CCDCFillCVVHalfFragment cCDCFillCVVHalfFragment = new CCDCFillCVVHalfFragment();
            Function0<Unit> function0 = (Function0) awS36S0301000_1.l2;
            cCDCFillCVVHalfFragment.LLIZLLLIL = paymentState.getCheckedPaymentMethod();
            cCDCFillCVVHalfFragment.LLJ = enterParams;
            cCDCFillCVVHalfFragment.LLJI = function0;
            C888603dc c888603dc = C888603dc.LIZ;
            C887503dR c887503dR = enterParams.LJJIJL;
            c888603dc.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("step", "jump_cvv");
            String str3 = "";
            if (c887503dR == null || (str = c887503dR.LJFF) == null) {
                str = "";
            }
            linkedHashMap.put("entrance", str);
            if (c887503dR != null && (str2 = c887503dR.LJ) != null) {
                str3 = str2;
            }
            linkedHashMap.put("agreement_id", str3);
            C888603dc.LJIIJ(linkedHashMap);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = cCDCFillCVVHalfFragment;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LLILLL = false;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            c1390920mIc.LIZ.LLJJL = awS36S0301000_1.i3;
            c1390920mIc.LJ(1);
            c1390920mIc.LJI(16);
            c1390920mIc.LIZ.show((FragmentManager) awS36S0301000_1.l1, "ccdc_card_fill_cvv");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        String str;
        Map<String, ? extends Object> map;
        String str2;
        HashMap<String, Object> mapLJIIJ;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("module_name", "promotions");
        laneParams.plusAssign("promotion_tag_order", Integer.valueOf(awS36S0301000_1.i3 + 1));
        laneParams.plusAssign("product_id", ((SkuPanelBaseWidget) awS36S0301000_1.l0).LJII().getProductId());
        SkuPanelState skuPanelStateDw = ((SkuPanelBaseWidget) awS36S0301000_1.l0).LJII().dw();
        if (skuPanelStateDw == null || (str = skuPanelStateDw.skuId) == null) {
            str = "";
        }
        laneParams.plusAssign("sku_id", str);
        PromotionLabelVO promotionDealVO = ((SkuState) awS36S0301000_1.l1).getPromotionDealVO();
        if (promotionDealVO != null && (str2 = promotionDealVO.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.withParamsGroup(mapLJIIJ);
        }
        PromotionLabel promotionLabel = (PromotionLabel) awS36S0301000_1.l2;
        if (promotionLabel != null && (map = promotionLabel.daInfo) != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("button_name", "add_num");
        laneParams.put("button_type", ((C259800zU) awS36S0301000_1.l0).element);
        SkuItem skuItem = ((SkuPanelCounterWidget) awS36S0301000_1.l1).LJII().LLJJJJ;
        if (skuItem != null) {
            laneParams.put("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelCounterWidget) awS36S0301000_1.l1).LJII().LLJILJIL;
        if (skuEnterParams != null && (str = skuEnterParams.productId) != null) {
            laneParams.put("product_id", str);
        }
        laneParams.put("num_before", Integer.valueOf(awS36S0301000_1.i3));
        laneParams.put("num_after", Integer.valueOf(((C118300cf) awS36S0301000_1.l2).element));
        C044V.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C044V.LIZIZ.get("is_low_stock"));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.put("button_name", "minus_num");
        laneParams.put("button_type", ((C259800zU) awS36S0301000_1.l0).element);
        SkuItem skuItem = ((SkuPanelCounterWidget) awS36S0301000_1.l1).LJII().LLJJJJ;
        if (skuItem != null) {
            laneParams.put("sku_id", skuItem.skuId);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelCounterWidget) awS36S0301000_1.l1).LJII().LLJILJIL;
        if (skuEnterParams != null && (str = skuEnterParams.productId) != null) {
            laneParams.put("product_id", str);
        }
        laneParams.put("num_before", Integer.valueOf(awS36S0301000_1.i3));
        laneParams.put("num_after", Integer.valueOf(((C118300cf) awS36S0301000_1.l2).element));
        C044V.LIZ.getClass();
        laneParams.plusAssign("is_low_stock", C044V.LIZIZ.get("is_low_stock"));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        String priceStr;
        HashMap map = (HashMap) obj;
        map.put("module_name", "tiktok_paylater");
        if (!Intrinsics.LJFF(((BnplInfo) awS36S0301000_1.l0).isAuth, Boolean.TRUE)) {
            map.put("module_type", "register");
        } else {
            map.put("module_type", "select");
            map.put("module_option_cnt", Integer.valueOf(((BnplInfo) awS36S0301000_1.l0).installmentPlans.size()));
            map.put("rank", Integer.valueOf(awS36S0301000_1.i3));
            map.put("installment_cnt", ((InstallmentPlan) awS36S0301000_1.l1).tenure);
            map.put("total_payment", ((InstallmentPlan) awS36S0301000_1.l1).extraDescription);
            Amount amount = ((InstallmentPlan) awS36S0301000_1.l1).totalRepayment;
            String currency = null;
            if (amount != null) {
                priceStr = amount.getPriceStr();
            } else {
                priceStr = null;
            }
            map.put("service_fee", priceStr);
            Amount amount2 = ((InstallmentPlan) awS36S0301000_1.l1).totalRepayment;
            if (amount2 != null) {
                currency = amount2.getCurrency();
            }
            map.put("currency", currency);
            map.put("click_type", ((C259800zU) awS36S0301000_1.l2).element);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        String str;
        String str2;
        ButtonAction buttonAction;
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        ButtonAction buttonAction2 = null;
        String str3 = "";
        if (C13LP.LJJJLL((List) awS36S0301000_1.l0) != null) {
            DialogButton dialogButton = (DialogButton) C13LP.LJJJLL((List) awS36S0301000_1.l0);
            if (dialogButton == null || (str2 = dialogButton.text) == null) {
                str2 = "";
            }
            Context context = ((C1397580mTM) awS36S0301000_1.l1).LIZ;
            DialogButton dialogButton2 = (DialogButton) C13LP.LJJJLL((List) awS36S0301000_1.l0);
            if (dialogButton2 != null) {
                buttonAction = dialogButton2.buttonAction;
            } else {
                buttonAction = null;
            }
            c1397630mTR.LIZJ(0, str2, new C1018303yX(context, buttonAction, awS36S0301000_1.i3, (Map) awS36S0301000_1.l2));
        }
        if (C13LP.LJJJLZIJ(1, (List) awS36S0301000_1.l0) != null) {
            DialogButton dialogButton3 = (DialogButton) C13LP.LJJJLZIJ(1, (List) awS36S0301000_1.l0);
            if (dialogButton3 != null && (str = dialogButton3.text) != null) {
                str3 = str;
            }
            Context context2 = ((C1397580mTM) awS36S0301000_1.l1).LIZ;
            DialogButton dialogButton4 = (DialogButton) C13LP.LJJJLZIJ(1, (List) awS36S0301000_1.l0);
            if (dialogButton4 != null) {
                buttonAction2 = dialogButton4.buttonAction;
            }
            c1397630mTR.LIZJ(1, str3, new C1018303yX(context2, buttonAction2, awS36S0301000_1.i3, (Map) awS36S0301000_1.l2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS36S0301000_1 awS36S0301000_1, Object obj) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        tuxTextView.setTuxFont(awS36S0301000_1.i3);
        tuxTextView.setText((SpannableStringBuilder) awS36S0301000_1.l0);
        tuxTextView.setTextColor(((LinkRichText) awS36S0301000_1.l1).LIZIZ(((UsReturnPolicyVH) awS36S0301000_1.l2).itemView.getContext()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0301000_1(int i, SpannableStringBuilder spannableStringBuilder, LinkRichText linkRichText, UsReturnPolicyVH usReturnPolicyVH, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = spannableStringBuilder;
        this.l1 = linkRichText;
        this.l2 = usReturnPolicyVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0301000_1(int i, SkuPanelBaseWidget skuPanelBaseWidget, SkuState skuState, PromotionLabel promotionLabel, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = skuPanelBaseWidget;
        this.l1 = skuState;
        this.l2 = promotionLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0301000_1(C259800zU c259800zU, C259800zU<String> c259800zU2, SkuPanelCounterWidget skuPanelCounterWidget, int i, C118300cf c118300cf) {
        super(1);
        this.$t = c118300cf;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.i3 = skuPanelCounterWidget;
        this.l2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0301000_1(C815203Gk c815203Gk, View view, C719202rO c719202rO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c815203Gk;
        this.l1 = view;
        this.l2 = c719202rO;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0301000_1(InterfaceC975703rf interfaceC975703rf, AddressListData addressListData, int i, C118300cf c118300cf, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = interfaceC975703rf;
        this.l1 = addressListData;
        this.i3 = i;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0301000_1(USAddonOrderCell uSAddonOrderCell, USAddonOrderCell uSAddonOrderCell2, C752802wo c752802wo, List<C03BY> list, int i) {
        super(1);
        this.$t = i;
        this.l0 = uSAddonOrderCell;
        this.l1 = uSAddonOrderCell2;
        this.l2 = c752802wo;
        this.i3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0301000_1(PaymentViewModel paymentViewModel, int i, FragmentManager fragmentManager, AwS545S0100000_1 awS545S0100000_1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = paymentViewModel;
        this.i3 = i;
        this.l1 = fragmentManager;
        this.l2 = awS545S0100000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0301000_1(BnplInfo bnplInfo, BnplInfo bnplInfo2, int i, InstallmentPlan installmentPlan, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = bnplInfo;
        this.i3 = bnplInfo2;
        this.l1 = i;
        this.l2 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0301000_1(PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder, PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder2, int i, InstallmentPlan installmentPlan, C259800zU<String> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.l0 = pdpPaymentModuleViewHolder;
        this.i3 = pdpPaymentModuleViewHolder2;
        this.l1 = i;
        this.l2 = installmentPlan;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS36S0301000_1(List list, List<DialogButton> list2, C1397580mTM c1397580mTM, int i, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = list;
        this.l1 = list2;
        this.i3 = c1397580mTM;
        this.l2 = i;
    }
}
