package kotlin.jvm.internal;

import X.AnonymousClass0376;
import X.C036I;
import X.C03BW;
import X.C03BY;
import X.C03BZ;
import X.C03F3;
import X.C03JV;
import X.C03O0;
import X.C03WH;
import X.C03ZB;
import X.C03ZC;
import X.C03ZD;
import X.C043B;
import X.C044L;
import X.C044M;
import X.C04AG;
import X.C04HR;
import X.C09AY;
import X.C0H1U;
import X.C1025203ze;
import X.C123100dR;
import X.C12ES;
import X.C1308910kAL;
import X.C13LP;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1841350y17;
import X.C19EG;
import X.C21717219z0;
import X.C2217381BqS;
import X.C23271099x;
import X.C238400w2;
import X.C714302qb;
import X.C719102rN;
import X.C719202rO;
import X.C720002rW;
import X.C722202rs;
import X.C722302rt;
import X.C723002s0;
import X.C752702wn;
import X.C755502xF;
import X.C7735030j;
import X.C7806033c;
import X.C786410Ut5;
import X.C802303Bl;
import X.C815003Gi;
import X.C815603Go;
import X.C825903Kn;
import X.C842603Qy;
import X.C850603Ua;
import X.C890103dr;
import X.C894003eU;
import X.C904203g8;
import X.C939603lq;
import X.C939703lr;
import X.C948503nH;
import X.EnumC805703Ct;
import X.InterfaceC2217241BqE;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.sea.pudo.SeaPudoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.MiniOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder.USCombinedSkuMainOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.ShopInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.summary.SummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.address.SeaOneStepAddressAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.productinfo.SeaOneStepProductInfoAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.summary.USOrderSummaryCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USHalfPageOrderUnavailableFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.unreachable.USUnreachableSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.quantity.USHalfQuantityCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.viewholder.InstallmentInfosViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfoForBillSummary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuCounterReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AwS437S0200000_1 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C752702wn c752702wn, USAddonOrderCell uSAddonOrderCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSAddonOrderCell;
        this.l1 = c752702wn;
    }

    public static final Object invoke$0(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        int iIntValue;
        String string;
        if (C03BZ.LIZ[((EnumC805703Ct) obj2).ordinal()] == 1) {
            USAddonOrderCell uSAddonOrderCell = (USAddonOrderCell) awS437S0200000_1.l0;
            C752702wn c752702wn = (C752702wn) awS437S0200000_1.l1;
            TuxTextView tuxTextView = (TuxTextView) uSAddonOrderCell.itemView.findViewById(R.id.agh);
            if (tuxTextView != null) {
                CharSequence text = tuxTextView.getText();
                if (text != null) {
                    string = text.toString();
                } else {
                    string = null;
                }
                tuxTextView.setText(string);
                tuxTextView.setTextColorRes(R.attr.a1p);
            }
            C21717219z0.LIZIZ(uSAddonOrderCell.itemView.findViewById(R.id.agj));
            C21717219z0.LIZIZ(uSAddonOrderCell.itemView.findViewById(R.id.ag5));
            C21717219z0.LIZIZ(uSAddonOrderCell.itemView.findViewById(R.id.agc));
            C21717219z0.LIZIZ(uSAddonOrderCell.itemView.findViewById(R.id.eqx));
            Integer num = c752702wn.LLJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 8;
            }
            List<C03BY> listP5 = uSAddonOrderCell.P5(c752702wn, iIntValue);
            C03BW c03bw = uSAddonOrderCell.LLJLLIL;
            if (c03bw != null) {
                c03bw.LL = c752702wn;
                c03bw.LLILLJJLI = listP5;
                c03bw.LLILLL = iIntValue;
                c03bw.LLILZ = false;
                c03bw.notifyDataSetChanged();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        boolean z;
        Integer num = (Integer) obj2;
        SeaPudoViewHolder seaPudoViewHolder = (SeaPudoViewHolder) awS437S0200000_1.l0;
        View viewFindViewById = seaPudoViewHolder.LLJILLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = seaPudoViewHolder.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.sp_);
            } else {
                viewFindViewById = null;
            }
            seaPudoViewHolder.LLJILLL = (C1841350y17) viewFindViewById;
        }
        C1841350y17 c1841350y17 = (C1841350y17) viewFindViewById;
        if (c1841350y17 != null) {
            int i = ((C03F3) awS437S0200000_1.l1).LIZIZ;
            if (num != null && num.intValue() == i) {
                z = true;
            } else {
                z = false;
            }
            c1841350y17.setChecked(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        List<SalePropValue> list;
        String str;
        List list2 = (List) obj2;
        SeaOneStepProductInfoAssem seaOneStepProductInfoAssem = (SeaOneStepProductInfoAssem) awS437S0200000_1.l0;
        TuxTextView tuxTextView = (TuxTextView) awS437S0200000_1.l1;
        List<SaleProp> list3 = seaOneStepProductInfoAssem.hp().LLILZ;
        if (list3 != null && !list3.isEmpty() && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (SaleProp saleProp : list3) {
                int i2 = i + 1;
                SalePropValue salePropValue = null;
                if (i >= 0) {
                    SaleProp saleProp2 = saleProp;
                    String str2 = (String) C13LP.LJJJLZIJ(i, list2);
                    if (str2 != null && !a0.LJJJIL(str2) && (list = saleProp2.salePropValueList) != null) {
                        Iterator<SalePropValue> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            SalePropValue next = it2.next();
                            if (Intrinsics.LJFF(next.propValueId, str2)) {
                                salePropValue = next;
                                break;
                            }
                        }
                        SalePropValue salePropValue2 = salePropValue;
                        if (salePropValue2 != null && (str = salePropValue2.propValue) != null) {
                            arrayList.add(str);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            String strLIZIZ = C036I.LIZIZ(arrayList);
            if (a0.LJJJIL(strLIZIZ)) {
                C0H1U.LIZIZ(tuxTextView);
            } else {
                C12ES.LJIILL(0, tuxTextView);
                tuxTextView.setText(strLIZIZ);
            }
        } else {
            C0H1U.LIZIZ(tuxTextView);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PaymentInfoViewModel.wQ2(((USPaymentInfoCell) awS437S0200000_1.l0).S5(), (PaymentMethod) obj, ((USPaymentInfoCell) awS437S0200000_1.l0).T5().LLJJI, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((C03ZC) awS437S0200000_1.l1, (USPaymentInfoCell) awS437S0200000_1.l0, 70), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        List<String> listLIZLLL;
        Boolean bool;
        C752702wn c752702wnLIZIZ;
        Map<String, Boolean> map;
        Map<String, Boolean> map2;
        C752702wn c752702wn;
        List<C719102rN> list;
        List<C719102rN> list2;
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS437S0200000_1.l0;
        C719102rN c719102rN = (C719102rN) awS437S0200000_1.l1;
        C752702wn c752702wn2 = orderSubmitAssemViewModel.LLILZLL;
        if (c752702wn2 != null && (listLIZLLL = c752702wn2.LIZLLL()) != null && listLIZLLL.contains(str)) {
            ArrayList arrayList = new ArrayList();
            C752702wn c752702wn3 = orderSubmitAssemViewModel.LLILZLL;
            if (c752702wn3 != null && (list2 = c752702wn3.LLILZLL) != null) {
                for (C719102rN c719102rN2 : list2) {
                    String str2 = c719102rN2.LLLLIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ArrayList arrayList2 = new ArrayList();
                    String str3 = c719102rN2.LLILZLL;
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                    arrayList.add(new AddonProductInfo(str2, arrayList2));
                }
            }
            ArrayList arrayList3 = new ArrayList();
            C752702wn c752702wn4 = orderSubmitAssemViewModel.LLILZLL;
            if (c752702wn4 != null && (map2 = c752702wn4.LLIZ) != null) {
                for (Map.Entry<String, Boolean> entry : map2.entrySet()) {
                    if (entry.getValue().booleanValue() && Intrinsics.LJFF(str, entry.getKey()) && c719102rN.LLIZ != iIntValue && (c752702wn = orderSubmitAssemViewModel.LLILZLL) != null && (list = c752702wn.LLILZLL) != null) {
                        for (C719102rN c719102rN3 : list) {
                            if (Intrinsics.LJFF(c719102rN3.LLILZLL, str)) {
                                OrderShopDigest orderShopDigest = c719102rN3.LLLLIILL;
                                if (orderShopDigest != null) {
                                    ArrayList arrayList4 = new ArrayList();
                                    List<OrderSKUDTO> list3 = orderShopDigest.orderSKUs;
                                    if (list3 != null) {
                                        for (OrderSKUDTO orderSKUDTO : list3) {
                                            if (Intrinsics.LJFF(orderSKUDTO.skuId, str)) {
                                                arrayList4.add(OrderSKUDTO.LIZ(orderSKUDTO, c719102rN3.LLILZLL, Integer.valueOf(iIntValue), null, null, null, null, null, null, null, null, 134217721));
                                            } else {
                                                arrayList4.add(orderSKUDTO);
                                            }
                                        }
                                    }
                                    c719102rN3.LLLLIILL = orderShopDigest.copy(orderShopDigest.sellerId, arrayList4, orderShopDigest.deliveryOption);
                                }
                                C719102rN c719102rNLIZIZ = C719102rN.LIZIZ(c719102rN3, iIntValue, null, -3);
                                c719102rNLIZIZ.LLLLIL = c719102rN3.LLLLIL;
                                c719102rNLIZIZ.LLLLIILL = c719102rN3.LLLLIILL;
                                arrayList3.add(c719102rNLIZIZ);
                            } else {
                                arrayList3.add(c719102rN3);
                            }
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C752702wn c752702wn5 = orderSubmitAssemViewModel.LLILZLL;
            if (c752702wn5 != null && (map = c752702wn5.LLIZ) != null) {
                for (Object obj3 : map.keySet()) {
                    if (Intrinsics.LJFF(obj3, str)) {
                        linkedHashMap.put(obj3, Boolean.TRUE);
                    } else {
                        Boolean bool2 = map.get(obj3);
                        if (bool2 != null) {
                            linkedHashMap.put(obj3, Boolean.valueOf(bool2.booleanValue()));
                        }
                    }
                }
            }
            C752702wn c752702wn6 = orderSubmitAssemViewModel.LLILZLL;
            if (c752702wn6 != null) {
                bool = null;
                c752702wnLIZIZ = C752702wn.LIZIZ(c752702wn6, arrayList3, linkedHashMap, null, 32764);
            } else {
                bool = null;
                c752702wnLIZIZ = null;
            }
            orderSubmitAssemViewModel.LLILZLL = c752702wnLIZIZ;
            OrderSubmitAssemViewModel.sT2(orderSubmitAssemViewModel, c752702wnLIZIZ, true, arrayList, C719102rN.LIZIZ(c719102rN, iIntValue, bool, -3), null, Boolean.TRUE, null, 80);
        } else {
            orderSubmitAssemViewModel.KQ2(iIntValue, c719102rN.LLJJIJIL, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        C722302rt c722302rt = (C722302rt) obj2;
        if (c722302rt != null) {
            USOrderSummaryCell uSOrderSummaryCell = (USOrderSummaryCell) awS437S0200000_1.l0;
            uSOrderSummaryCell.R5(uSOrderSummaryCell.itemView, (C755502xF) awS437S0200000_1.l1, c722302rt);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        int i;
        C714302qb next;
        HashMap<String, Object> mapLJIIJ;
        String str;
        HashMap<String, Object> mapLJIIJ2;
        C722302rt c722302rt = (C722302rt) obj2;
        if (c722302rt != null) {
            USOrderSummaryCell uSOrderSummaryCell = (USOrderSummaryCell) awS437S0200000_1.l0;
            C755502xF c755502xF = (C755502xF) awS437S0200000_1.l1;
            Iterator<C714302qb> it2 = c722302rt.LLILZLL.iterator();
            while (true) {
                i = 1;
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = next.LJIIIIZZ;
                    if (num != null && num.intValue() == 10) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C714302qb c714302qb = next;
            if (!uSOrderSummaryCell.LLJILJIL && !uSOrderSummaryCell.N5().LLLZIL && c755502xF != null) {
                uSOrderSummaryCell.LLJILJIL = true;
                C03O0 c03o0 = C03O0.LIZ;
                HashMap<String, Object> mapHi1 = uSOrderSummaryCell.N5().hi1(false);
                if (c714302qb != null) {
                    mapHi1.put("small_order_fee", c714302qb.LIZIZ);
                }
                String strLIZ = C722202rs.LIZ(c722302rt);
                if (strLIZ != null) {
                    mapHi1.put("summary_info", strLIZ);
                }
                MemberShipModule memberShipModule = c755502xF.LLILZLL.LLJJJJLIIL;
                if (memberShipModule != null) {
                    String str2 = memberShipModule.buttonText;
                    if (str2 != null && str2.length() != 0) {
                        i = 0;
                    }
                    mapHi1.put("is_plus_effective", Integer.valueOf(i));
                }
                C720002rW c720002rW = c755502xF.LLIZ;
                if (c720002rW != null && (str = c720002rW.LLJJIJIIJIL) != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str)) != null) {
                    mapHi1.putAll(mapLJIIJ2);
                }
                mapHi1.put("is_clickable", "1");
                C03O0.LJJJZ(c03o0, "order_summary", mapHi1, null, null, null, null, null, null, null, null, null, null, null, 1048572);
                BonusInfoForBillSummary bonusInfoForBillSummary = c755502xF.LLILZLL.LLJJJJJIL;
                if (bonusInfoForBillSummary != null) {
                    HashMap<String, Object> mapHi12 = uSOrderSummaryCell.N5().hi1(false);
                    String str3 = bonusInfoForBillSummary.daInfo;
                    if (str3 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str3)) != null) {
                        mapHi12.putAll(mapLJIIJ);
                    }
                    C03O0.LJJJZ(c03o0, "earn_bonus", mapHi12, null, null, null, null, null, null, null, null, null, null, null, 1048572);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        if (zBooleanValue) {
            ((SeaOneStepOrderSubmitFragment) awS437S0200000_1.l0).aS().LLJILJIL = true;
            FrameLayout frameLayout = ((SeaOneStepOrderSubmitFragment) awS437S0200000_1.l0).LLJJJIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
        } else {
            ((SeaOneStepOrderSubmitFragment) awS437S0200000_1.l0).aS().LLJILJIL = false;
            ((SeaOneStepOrderSubmitFragment) awS437S0200000_1.l0).aS().EQ2(false);
            SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) awS437S0200000_1.l0;
            C850603Ua c850603Ua = seaOneStepOrderSubmitFragment.LLJJI;
            if (c850603Ua != null) {
                c850603Ua.LL = true;
            }
            HandlerHook.viewPost((View) awS437S0200000_1.l1, new ARunnableS101S0100000_1(seaOneStepOrderSubmitFragment, 11));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        if (zBooleanValue) {
            C786410Ut5.LL(8, ((PaymentFragment) awS437S0200000_1.l0).ZR());
        } else {
            PaymentViewModel paymentViewModelYS = ((PaymentFragment) awS437S0200000_1.l0).yS();
            paymentViewModelYS.getClass();
            paymentViewModelYS.setState(new AwS16S0010000_1(false, 4));
            HandlerHook.viewPost((View) awS437S0200000_1.l1, new ARunnableS101S0100000_1((PaymentFragment) awS437S0200000_1.l0, 12));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        C894003eU c894003eU = (C894003eU) obj;
        int iIntValue = ((Number) obj2).intValue();
        ((PaymentViewModel) awS437S0200000_1.l0).oR2().getClass();
        OcrStatus ocrStatusLIZIZ = C904203g8.LIZIZ(c894003eU);
        OcrStatus ocrStatusLIZ = ((PaymentViewModel) awS437S0200000_1.l0).oR2().LIZ(c894003eU);
        PaymentViewModel paymentViewModel = (PaymentViewModel) awS437S0200000_1.l0;
        paymentViewModel.withState(new AwS37S0500000_1(paymentViewModel, c894003eU, (PaymentMethod) awS437S0200000_1.l1, ocrStatusLIZIZ, ocrStatusLIZ, 2));
        ((PaymentViewModel) awS437S0200000_1.l0).oR2().LIZLLL = c894003eU;
        C03WH c03wh = ((PaymentViewModel) awS437S0200000_1.l0).LLJI;
        if (c03wh != null) {
            C890103dr.LIZ.getClass();
            long jLIZ = C890103dr.LIZ("ocr_scanning");
            c03wh.LJIIJJI("card_result", ocrStatusLIZIZ.toString(), jLIZ, Integer.valueOf(iIntValue), ocrStatusLIZ.toString());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        if (!Intrinsics.LJFF(((InterfaceC2217241BqE) awS437S0200000_1.l0).get(obj), ((InterfaceC2217241BqE) awS437S0200000_1.l0).get(obj2))) {
            ((Function1) awS437S0200000_1.l1).invoke(((InterfaceC2217241BqE) awS437S0200000_1.l0).get(obj2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        Integer num;
        String str;
        Context context;
        ButtonAction buttonAction = (ButtonAction) obj2;
        if (buttonAction != null && (num = buttonAction.buttonActionType) != null && num.intValue() == 3) {
            ButtonActionInfo buttonActionInfo = buttonAction.buttonActionInfo;
            String str2 = null;
            if (buttonActionInfo != null) {
                str = buttonActionInfo.schema;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                C1025203ze c1025203ze = C1025203ze.LIZ;
                View view = (View) awS437S0200000_1.l0;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = ((C04HR) awS437S0200000_1.l1).LIZ.LLJI;
                ButtonActionInfo buttonActionInfo2 = buttonAction.buttonActionInfo;
                if (buttonActionInfo2 != null) {
                    str2 = buttonActionInfo2.schema;
                }
                c1025203ze.getClass();
                C1025203ze.LIZIZ(context, pdpEnterParam, "product_detail", str2, false, null);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$2(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PaymentInfoViewModel.wQ2(((PaymentInfoCell2) awS437S0200000_1.l0).T5(), (PaymentMethod) obj, ((PaymentInfoCell2) awS437S0200000_1.l0).V5().LLJJI, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((C03ZB) awS437S0200000_1.l1, (PaymentInfoCell2) awS437S0200000_1.l0, 18), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        int iIntValue;
        int iIntValue2;
        String strValueOf;
        Pair pair = (Pair) obj;
        C7735030j c7735030j = (C7735030j) obj2;
        if (((C044L) pair.getSecond()).LIZIZ) {
            EditText editTextBp = ((SkuCounterReusedAssem) ((C044M) awS437S0200000_1.l0)).Bp();
            if (((Number) pair.getFirst()).intValue() == 0) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(Math.max(Math.min(((Number) pair.getFirst()).intValue(), c7735030j.LIZIZ), c7735030j.LIZ));
            }
            editTextBp.setText(strValueOf);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, ((SkuPanelBaseReusedAssem) ((C044M) awS437S0200000_1.l0)).sp());
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, ((SkuPanelBaseReusedAssem) ((C044M) awS437S0200000_1.l0)).sp());
        if (numLIZJ2 != null && numLIZJ != null) {
            TuxIconView tuxIconViewFp = ((SkuCounterReusedAssem) ((C044M) awS437S0200000_1.l0)).Fp();
            if (((Number) pair.getFirst()).intValue() >= c7735030j.LIZIZ) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = numLIZJ2.intValue();
            }
            tuxIconViewFp.setTintColor(iIntValue);
            TuxIconView tuxIconViewEp = ((SkuCounterReusedAssem) ((C044M) awS437S0200000_1.l0)).Ep();
            if (((Number) pair.getFirst()).intValue() <= c7735030j.LIZ) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = numLIZJ2.intValue();
            }
            tuxIconViewEp.setTintColor(iIntValue2);
        }
        ((C043B) awS437S0200000_1.l1).TE0(((SkuPanelBaseReusedAssem) ((C044M) awS437S0200000_1.l0)).getViewModel().JQ2(((ReusedUISlotAssem) ((C044M) awS437S0200000_1.l0)).getContentView()));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AwS437S0200000_1 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r3 = r17
            r0 = r16
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r3 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r3
            r1 = r15
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Hq r5 = r0.LLLLLJLJLL
            java.lang.Object r2 = r1.l1
            android.view.View r2 = (android.view.View) r2
            r0 = 2131388608(0x7f0a68c0, float:1.8397736E38)
            android.view.View r6 = r2.findViewById(r0)
            java.lang.String r7 = "review_entrance"
            java.lang.String r8 = "impression_tag"
            r9 = 0
            r13 = 0
            if (r3 == 0) goto L6e
            java.lang.String r10 = r3.filterId
            java.lang.String r11 = r3.nameEng
            java.lang.Integer r0 = r3.type
            if (r0 == 0) goto L70
            java.lang.String r12 = r0.toString()
        L36:
            java.lang.Integer r13 = r3.count
        L38:
            r14 = 1
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Ae r0 = r0.LLLLL
            java.lang.String r15 = r0.LJIIIZ()
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r0.LLJIJIL
            r17 = 5120(0x1400, float:7.175E-42)
            r16 = r9
            X.C1073204Hq.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.customerreview.PdpReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Ah r2 = r0.LLJLIL
            if (r2 == 0) goto L6b
            int r1 = r4 + 1
            java.lang.String r0 = "review_entrance"
            r2.LJIJJ(r1, r3, r0)
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6e:
            r10 = r9
            r11 = r9
        L70:
            r12 = r9
            if (r3 == 0) goto L38
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS437S0200000_1.invoke$21(kotlin.jvm.internal.AwS437S0200000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        C03JV state = ((USCombinedSkuMainOrderCell) awS437S0200000_1.l0).T5().getState();
        if (state != null && state.LLLZLL != null) {
            ((USCombinedSkuMainOrderCell) awS437S0200000_1.l0).T5().KQ2(iIntValue, ((C719102rN) awS437S0200000_1.l1).LLJJIJIL, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        View currentFocus;
        Window window;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        EditText input = ((C939603lq) awS437S0200000_1.l0).getInput();
        C19EG c19eg = ((C802303Bl) awS437S0200000_1.l1).LLILZ;
        if (c19eg != null && (window = c19eg.getWindow()) != null) {
            currentFocus = window.getCurrentFocus();
        } else {
            currentFocus = null;
        }
        if (Intrinsics.LJFF(input, currentFocus)) {
            int[] iArr = new int[2];
            ((C939603lq) awS437S0200000_1.l0).getLocationInWindow(iArr);
            if (zBooleanValue && iIntValue < iArr[1] + ((C939603lq) awS437S0200000_1.l0).getMeasuredHeight()) {
                ((C802303Bl) awS437S0200000_1.l1).LLILLL.dT2((iArr[1] + ((C939603lq) awS437S0200000_1.l0).getMeasuredHeight()) - iIntValue);
            } else {
                ((C802303Bl) awS437S0200000_1.l1).LLILLL.dT2(0);
            }
        }
        ((C802303Bl) awS437S0200000_1.l1).LLILLL.LLJZIJLIL = zBooleanValue;
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        C842603Qy c842603Qy = (C842603Qy) obj2;
        if (c842603Qy != null) {
            if (C13LP.LJJJJ(((C719202rO) awS437S0200000_1.l0).LLILZLL, c842603Qy.LIZ)) {
                TextView textView = (TextView) ((ShopInfoCell) awS437S0200000_1.l1).itemView.findViewById(R.id.o9o);
                String str = c842603Qy.LIZIZ;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                ((TextView) ((ShopInfoCell) awS437S0200000_1.l1).itemView.findViewById(R.id.fjo)).setText(ShopInfoCell.L5((ShopInfoCell) awS437S0200000_1.l1, (C719202rO) awS437S0200000_1.l0, null, c842603Qy.LIZIZ, 2));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        Function2<? super PhoneCredit, ? super Boolean, Unit> function2;
        if (((Boolean) obj2).booleanValue()) {
            C815603Go c815603Go = (C815603Go) ((View) awS437S0200000_1.l0).findViewById(R.id.qb6);
            if (c815603Go != null && (function2 = c815603Go.LLIZ) != null) {
                function2.invoke(c815603Go.LLILZLL, Boolean.FALSE);
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C815003Gi) awS437S0200000_1.l1).LLILLJJLI;
            orderSubmitAssemViewModel.getClass();
            orderSubmitAssemViewModel.setState(new AwS16S0010000_1(false, 26));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        ((C802303Bl) awS437S0200000_1.l0).LLILLL.KQ2(((Number) obj).intValue(), ((C719102rN) awS437S0200000_1.l1).LLJJIJIL, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PhoneCredit phoneCredit = (PhoneCredit) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = ((C815003Gi) awS437S0200000_1.l0).LLILLJJLI;
        orderSubmitAssemViewModel.LLLLIILL = phoneCredit;
        orderSubmitAssemViewModel.LLLLIILLL = 1;
        if (zBooleanValue) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = ((C815003Gi) awS437S0200000_1.l0).LLILLJJLI;
            orderSubmitAssemViewModel2.getClass();
            orderSubmitAssemViewModel2.setState(AFwS228S0000000_1.get$arr$(496));
            ((C238400w2) awS437S0200000_1.l1).element = System.currentTimeMillis();
            C03O0.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C03O0.LIZIZ);
            linkedHashMap.put("input_box_name", "phone");
            C03O0.LLF("tiktokec_input_click", linkedHashMap);
        } else {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = ((C815003Gi) awS437S0200000_1.l0).LLILLJJLI;
            orderSubmitAssemViewModel3.getClass();
            C948503nH.LJI(orderSubmitAssemViewModel3, C23271099x.INSTANCE, new C825903Kn(phoneCredit, orderSubmitAssemViewModel3, null));
            if (((C238400w2) awS437S0200000_1.l1).element != -1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C03O0 c03o0 = C03O0.LIZ;
                long j = jCurrentTimeMillis - ((C238400w2) awS437S0200000_1.l1).element;
                HashMap map = new HashMap();
                c03o0.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(C03O0.LIZIZ);
                linkedHashMap2.put("stay_time", Long.valueOf(j));
                linkedHashMap2.put("input_box_name", "phone");
                linkedHashMap2.put("input_method", "normal");
                linkedHashMap2.putAll(map);
                C03O0.LLF("tiktokec_input_staytime", linkedHashMap2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        C722302rt c722302rt = (C722302rt) obj2;
        if (c722302rt != null) {
            SummaryCell summaryCell = (SummaryCell) awS437S0200000_1.l0;
            View view = (View) awS437S0200000_1.l1;
            summaryCell.S5(view, c722302rt);
            SummaryCell.N5(view, c722302rt);
            summaryCell.L5(view, c722302rt);
            summaryCell.R5(c722302rt);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        ECBaseFragment eCBaseFragment;
        Function0<Unit> function0;
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        if (((USUnreachableSkuCell) awS437S0200000_1.l0).getFragment() instanceof USHalfPageOrderUnavailableFragment) {
            Fragment fragment = ((USUnreachableSkuCell) awS437S0200000_1.l0).getFragment();
            if ((fragment instanceof USHalfPageOrderUnavailableFragment) && (eCBaseFragment = (ECBaseFragment) fragment) != null && (function0 = eCBaseFragment.LLILLJJLI) != null) {
                function0.invoke();
            }
        }
        ((USUnreachableSkuCell) awS437S0200000_1.l0).L5().KQ2(iIntValue, ((PackedSku) awS437S0200000_1.l1).sellerId, str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PaymentInfoViewModel.wQ2(((PaymentInfoCell2) awS437S0200000_1.l0).T5(), (PaymentMethod) obj, ((PaymentInfoCell2) awS437S0200000_1.l0).V5().LLJJI, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((C03ZB) awS437S0200000_1.l1, (PaymentInfoCell2) awS437S0200000_1.l0, 27), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        BankInstallmentViewModel.yQ2(((InstallmentInfosViewHolder) awS437S0200000_1.l0).I5(), (PaymentMethod) obj, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((InstallmentInfosViewHolder) awS437S0200000_1.l0, (C03ZD) awS437S0200000_1.l1, 287), 12);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$31(kotlin.jvm.internal.AwS437S0200000_1 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r3 = r17
            r0 = r16
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r3 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r3
            r1 = r15
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Hq r5 = r0.LLLLLJLJLL
            java.lang.Object r2 = r1.l1
            android.view.View r2 = (android.view.View) r2
            r0 = 2131388608(0x7f0a68c0, float:1.8397736E38)
            android.view.View r6 = r2.findViewById(r0)
            java.lang.String r7 = "shop_review_entrance"
            java.lang.String r8 = "impression_tag"
            r9 = 0
            r13 = 0
            if (r3 == 0) goto L64
            java.lang.String r10 = r3.filterId
            java.lang.String r11 = r3.nameEng
            java.lang.Integer r0 = r3.type
            if (r0 == 0) goto L66
            java.lang.String r12 = r0.toString()
        L36:
            java.lang.Integer r13 = r3.count
        L38:
            r14 = 2
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Ae r0 = r0.LLLLL
            java.lang.String r15 = r0.LJIIIZ()
            r17 = 7168(0x1c00, float:1.0045E-41)
            r16 = r9
            X.C1073204Hq.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Ah r2 = r0.LLJLIL
            if (r2 == 0) goto L61
            int r1 = r4 + 1
            java.lang.String r0 = "shop_review_entrance"
            r2.LJIJJ(r1, r3, r0)
        L61:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L64:
            r10 = r9
            r11 = r9
        L66:
            r12 = r9
            if (r3 == 0) goto L38
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS437S0200000_1.invoke$31(kotlin.jvm.internal.AwS437S0200000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$32(kotlin.jvm.internal.AwS437S0200000_1 r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            r3 = r17
            r0 = r16
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r3 = (com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct) r3
            r1 = r15
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Hq r5 = r0.LLLLLJLJLL
            java.lang.Object r2 = r1.l1
            android.view.View r2 = (android.view.View) r2
            r0 = 2131391990(0x7f0a75f6, float:1.8404595E38)
            android.view.View r6 = r2.findViewById(r0)
            java.lang.String r7 = "shop_review_entrance"
            r13 = 0
            if (r3 == 0) goto L87
            java.lang.String r2 = r3.filterId
        L29:
            java.lang.String r0 = "102"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L84
            if (r3 == 0) goto L82
            java.lang.String r2 = r3.filterId
        L35:
            java.lang.String r0 = "101"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L84
            java.lang.String r8 = "rate"
        L3f:
            r9 = 0
            if (r3 == 0) goto L7c
            java.lang.String r10 = r3.filterId
            java.lang.String r11 = r3.nameEng
            java.lang.Integer r0 = r3.type
            if (r0 == 0) goto L7e
            java.lang.String r12 = r0.toString()
        L4e:
            java.lang.Integer r13 = r3.count
        L50:
            r14 = 2
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Ae r0 = r0.LLLLL
            java.lang.String r15 = r0.LJIIIZ()
            r17 = 7168(0x1c00, float:1.0045E-41)
            r16 = r9
            X.C1073204Hq.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.review.shopreview.PdpShopReviewHeadViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r0.c6()
            X.04Ah r2 = r0.LLJLIL
            if (r2 == 0) goto L79
            int r1 = r4 + 1
            java.lang.String r0 = "shop_review_entrance"
            r2.LJIJJ(r1, r3, r0)
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7c:
            r10 = r13
            r11 = r13
        L7e:
            r12 = r13
            if (r3 == 0) goto L50
            goto L4e
        L82:
            r2 = r13
            goto L35
        L84:
            java.lang.String r8 = "keyword"
            goto L3f
        L87:
            r2 = r13
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS437S0200000_1.invoke$32(kotlin.jvm.internal.AwS437S0200000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$33(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PaymentViewModel.wR2(((PaymentMethodViewHolder) awS437S0200000_1.l0).W5(), (PaymentMethod) obj, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((h) awS437S0200000_1.l1, (PaymentMethodViewHolder) awS437S0200000_1.l0, 306), 12);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        ((USHalfQuantityCell) awS437S0200000_1.l0).L5().KQ2(((Number) obj).intValue(), ((C719102rN) awS437S0200000_1.l1).LLJJIJIL, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        View currentFocus;
        Window window;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        EditText input = ((C939703lr) awS437S0200000_1.l0).getInput();
        C19EG activity = ((USHalfQuantityCell) awS437S0200000_1.l1).getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            currentFocus = window.getCurrentFocus();
        } else {
            currentFocus = null;
        }
        if (Intrinsics.LJFF(input, currentFocus)) {
            int[] iArr = new int[2];
            ((C939703lr) awS437S0200000_1.l0).getLocationInWindow(iArr);
            if (zBooleanValue && iIntValue < iArr[1] + ((C939703lr) awS437S0200000_1.l0).getMeasuredHeight()) {
                ((USHalfQuantityCell) awS437S0200000_1.l1).L5().dT2((iArr[1] + ((C939703lr) awS437S0200000_1.l0).getMeasuredHeight()) - iIntValue);
            } else {
                ((USHalfQuantityCell) awS437S0200000_1.l1).L5().dT2(0);
            }
        }
        ((USHalfQuantityCell) awS437S0200000_1.l1).L5().LLJZIJLIL = zBooleanValue;
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        Integer num;
        String str;
        Context context;
        ButtonAction buttonAction = (ButtonAction) obj2;
        if (buttonAction != null && (num = buttonAction.buttonActionType) != null && num.intValue() == 3) {
            ButtonActionInfo buttonActionInfo = buttonAction.buttonActionInfo;
            String str2 = null;
            if (buttonActionInfo != null) {
                str = buttonActionInfo.schema;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                C1025203ze c1025203ze = C1025203ze.LIZ;
                View view = (View) awS437S0200000_1.l0;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = ((C04AG) awS437S0200000_1.l1).LIZ.LLIZ;
                ButtonActionInfo buttonActionInfo2 = buttonAction.buttonActionInfo;
                if (buttonActionInfo2 != null) {
                    str2 = buttonActionInfo2.schema;
                }
                c1025203ze.getClass();
                C1025203ze.LIZIZ(context, pdpEnterParam, "product_detail", str2, false, null);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$37(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        String str;
        LogisticDTO logisticDTO = (LogisticDTO) obj2;
        C1841350y17 c1841350y17 = (C1841350y17) awS437S0200000_1.l0;
        if (logisticDTO != null) {
            str = logisticDTO.logisticsServiceId;
        } else {
            str = null;
        }
        c1841350y17.setChecked(Intrinsics.LJFF(str, ((LogisticDTO) awS437S0200000_1.l1).logisticsServiceId));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$38(kotlin.jvm.internal.AwS437S0200000_1 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS437S0200000_1.invoke$38(kotlin.jvm.internal.AwS437S0200000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$39(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((MiniOspFragment) awS437S0200000_1.l0).WR();
        if (zBooleanValue) {
            FrameLayout frameLayout = ((MiniOspFragment) awS437S0200000_1.l0).LLILZ;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
        } else {
            HandlerHook.viewPost((View) awS437S0200000_1.l1, new ARunnableS101S0100000_1((MiniOspFragment) awS437S0200000_1.l0, 87));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        String str;
        LogisticDTO logisticDTO = (LogisticDTO) obj2;
        C1841350y17 c1841350y17 = (C1841350y17) ((View) awS437S0200000_1.l0).findViewById(R.id.sp_);
        if (logisticDTO != null) {
            str = logisticDTO.logisticsServiceId;
        } else {
            str = null;
        }
        c1841350y17.setChecked(Intrinsics.LJFF(str, ((LogisticDTO) awS437S0200000_1.l1).logisticsServiceId));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$40(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((OrderSubmitFragment) awS437S0200000_1.l0).ZR().LLLIIIL = true;
        if (zBooleanValue) {
            FrameLayout frameLayoutAS = ((OrderSubmitFragment) awS437S0200000_1.l0).aS();
            if (frameLayoutAS != null) {
                C786410Ut5.LJZ(8, frameLayoutAS);
            }
        } else {
            HandlerHook.viewPost((View) awS437S0200000_1.l1, new ARunnableS101S0100000_1((OrderSubmitFragment) awS437S0200000_1.l0, 94));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$41(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ((CombinedSkuOrderSubmitFragment) awS437S0200000_1.l0).VR().LLLIIIL = true;
        if (zBooleanValue) {
            FrameLayout frameLayout = ((CombinedSkuOrderSubmitFragment) awS437S0200000_1.l0).LLJJJJJIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
        } else {
            HandlerHook.viewPost((View) awS437S0200000_1.l1, new ARunnableS101S0100000_1((CombinedSkuOrderSubmitFragment) awS437S0200000_1.l0, 101));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            MiniOspBottomWidget miniOspBottomWidget = (MiniOspBottomWidget) awS437S0200000_1.l0;
            miniOspBottomWidget.withState(miniOspBottomWidget.kp(), new AwS367S0200000_1(miniOspBottomWidget, (View) awS437S0200000_1.l1, 255));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PaymentInfoViewModel.wQ2(((MiniOspPaymentInfoCell2) awS437S0200000_1.l0).R5(), (PaymentMethod) obj, ((MiniOspPaymentInfoCell2) awS437S0200000_1.l0).P5().LLIZ, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((MiniOspPaymentInfoCell2) awS437S0200000_1.l0, (C03ZB) awS437S0200000_1.l1, 59), 24);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        PaymentInfoViewModel.wQ2(((MiniOspPaymentInfoCell2) awS437S0200000_1.l0).R5(), (PaymentMethod) obj, ((MiniOspPaymentInfoCell2) awS437S0200000_1.l0).P5().LLIZ, (InterestFeePromotion) obj2, null, false, new AwS367S0200000_1((MiniOspPaymentInfoCell2) awS437S0200000_1.l0, (C03ZB) awS437S0200000_1.l1, 63), 24);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS437S0200000_1 r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS437S0200000_1.invoke$8(kotlin.jvm.internal.AwS437S0200000_1, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$9(AwS437S0200000_1 awS437S0200000_1, Object obj, Object obj2) {
        LogisticExpressionArea logisticExpressionAreaIp;
        Integer num;
        Integer num2;
        String string;
        LogisticTextDTO logisticTextDTO;
        Map<String, Object> map;
        Object obj3;
        C723002s0 c723002s0 = (C723002s0) obj2;
        ((SeaOneStepAddressAssem) awS437S0200000_1.l0).LLJJIJIIJIL = c723002s0;
        String str = null;
        if (c723002s0 != null) {
            logisticExpressionAreaIp = SeaOneStepAddressAssem.ip(c723002s0);
        } else {
            logisticExpressionAreaIp = null;
        }
        SeaOneStepAddressAssem seaOneStepAddressAssem = (SeaOneStepAddressAssem) awS437S0200000_1.l0;
        AnonymousClass0376 anonymousClass0376 = seaOneStepAddressAssem.LLJJIJIL;
        if (anonymousClass0376 != null && anonymousClass0376.LLJILJIL && logisticExpressionAreaIp != null) {
            seaOneStepAddressAssem.tp((View) awS437S0200000_1.l1, logisticExpressionAreaIp);
        } else {
            TextView textView = (TextView) ((View) awS437S0200000_1.l1).findViewById(R.id.u47);
            C786410Ut5.LJLLLLLL(8, textView);
            textView.setText("");
            C786410Ut5.I7(new AjS10S0000000_1(15), textView);
        }
        if (c723002s0 != null) {
            SeaOneStepAddressAssem seaOneStepAddressAssem2 = (SeaOneStepAddressAssem) awS437S0200000_1.l0;
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapLp = seaOneStepAddressAssem2.lp(c723002s0);
            AnonymousClass0376 anonymousClass03762 = seaOneStepAddressAssem2.LLJJIJIL;
            if (anonymousClass03762 != null) {
                num = anonymousClass03762.LLJZIJLIL;
                num2 = anonymousClass03762.LLJJJIL;
            } else {
                num = null;
                num2 = null;
            }
            String strValueOf = String.valueOf(num2);
            AnonymousClass0376 anonymousClass03763 = seaOneStepAddressAssem2.LLJJIJIL;
            if (anonymousClass03763 != null && (map = anonymousClass03763.LLJLLL) != null && (obj3 = map.get("invalid_reason_code")) != null) {
                string = obj3.toString();
            } else {
                string = null;
            }
            LogisticDTO logisticDTO = c723002s0.LLILZIL;
            if (logisticDTO != null && (logisticTextDTO = logisticDTO.logisticText) != null) {
                str = logisticTextDTO.thresholdTextEn;
            }
            C03O0.LJJJZ(c03o0, "logistics_edit_shipping", mapLp, str, null, null, num, strValueOf, string, null, seaOneStepAddressAssem2.mp().LLLZLZ.LIZ("c50980.d0"), C7806033c.LJIIJ(seaOneStepAddressAssem2.mp()), null, null, 870364);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C802303Bl c802303Bl, C719102rN c719102rN, int i) {
        super(2);
        this.$t = i;
        this.l0 = c802303Bl;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C815003Gi c815003Gi, C238400w2 c238400w2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c815003Gi;
        this.l1 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C03ZB c03zb, PaymentInfoCell2 paymentInfoCell2, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentInfoCell2;
        this.l1 = c03zb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C03ZC c03zc, USPaymentInfoCell uSPaymentInfoCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSPaymentInfoCell;
        this.l1 = c03zc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C939603lq c939603lq, C802303Bl c802303Bl, int i) {
        super(2);
        this.$t = i;
        this.l0 = c939603lq;
        this.l1 = c802303Bl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C939703lr c939703lr, USHalfQuantityCell uSHalfQuantityCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = c939703lr;
        this.l1 = uSHalfQuantityCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C1841350y17 c1841350y17, LogisticDTO logisticDTO, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1841350y17;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(C2217381BqS c2217381BqS, Function1 function1, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2217381BqS;
        this.l1 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(View view, C815003Gi c815003Gi, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = c815003Gi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(View view, C04AG c04ag, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = c04ag;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(View view, C04HR c04hr, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = c04hr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(View view, LogisticDTO logisticDTO, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(View view, OrderSubmitFragment orderSubmitFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSubmitFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(View view, SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaOneStepOrderSubmitFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(SeaPudoViewHolder seaPudoViewHolder, C03F3 c03f3, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaPudoViewHolder;
        this.l1 = c03f3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(MiniOspBottomWidget miniOspBottomWidget, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = miniOspBottomWidget;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(USCombinedSkuMainOrderCell uSCombinedSkuMainOrderCell, C719102rN c719102rN, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSCombinedSkuMainOrderCell;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2, C03ZB c03zb, int i) {
        super(2);
        this.$t = i;
        this.l0 = miniOspPaymentInfoCell2;
        this.l1 = c03zb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(ShopInfoCell shopInfoCell, C719202rO c719202rO, int i) {
        super(2);
        this.$t = i;
        this.l0 = c719202rO;
        this.l1 = shopInfoCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(SummaryCell summaryCell, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = summaryCell;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(SeaOneStepAddressAssem seaOneStepAddressAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaOneStepAddressAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(SeaOneStepProductInfoAssem seaOneStepProductInfoAssem, TuxTextView tuxTextView, int i) {
        super(2);
        this.$t = i;
        this.l0 = seaOneStepProductInfoAssem;
        this.l1 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(USOrderSummaryCell uSOrderSummaryCell, C755502xF c755502xF, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSOrderSummaryCell;
        this.l1 = c755502xF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(USUnreachableSkuCell uSUnreachableSkuCell, PackedSku packedSku, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSUnreachableSkuCell;
        this.l1 = packedSku;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(USHalfQuantityCell uSHalfQuantityCell, C719102rN c719102rN, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSHalfQuantityCell;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = combinedSkuOrderSubmitFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(MiniOspFragment miniOspFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = miniOspFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(OrderSubmitFragment orderSubmitFragment, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSubmitFragment;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(PaymentFragment paymentFragment, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(InstallmentInfosViewHolder installmentInfosViewHolder, C03ZD c03zd, int i) {
        super(2);
        this.$t = i;
        this.l0 = installmentInfosViewHolder;
        this.l1 = c03zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, C719102rN c719102rN, int i) {
        super(2);
        this.$t = i;
        this.l0 = orderSubmitAssemViewModel;
        this.l1 = c719102rN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(PdpReviewHeadViewHolder pdpReviewHeadViewHolder, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpReviewHeadViewHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(PdpShopReviewHeadViewHolder pdpShopReviewHeadViewHolder, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = pdpShopReviewHeadViewHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(SkuPanelAssemVM skuPanelAssemVM, C044M c044m, int i) {
        super(2);
        this.$t = i;
        this.l0 = c044m;
        this.l1 = skuPanelAssemVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS437S0200000_1(h hVar, PaymentMethodViewHolder paymentMethodViewHolder, int i) {
        super(2);
        this.$t = i;
        this.l0 = paymentMethodViewHolder;
        this.l1 = hVar;
    }
}
