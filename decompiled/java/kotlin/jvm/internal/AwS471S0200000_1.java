package kotlin.jvm.internal;

import X.AnonymousClass0376;
import X.C03AZ;
import X.C03LU;
import X.C03O0;
import X.C03O1;
import X.C03PI;
import X.C03XU;
import X.C03ZB;
import X.C03ZC;
import X.C03ZD;
import X.C049Y;
import X.C09AY;
import X.C10508049a;
import X.C1537480q70;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1547280qMo;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C770702zh;
import X.C922703j7;
import X.C972903rD;
import X.C983603sw;
import X.EnumC922503j5;
import X.InterfaceC1631620sYq;
import X.InterfaceC838503Pj;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.RadioButton;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.mainorder.USCombinedSkuMainOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.USOspAddressCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.viewholder.InstallmentInfosViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container.PaymentCheckoutFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance.InsuranceDisplay;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance.InsuranceDisplayVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS12S0401000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS280S0300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AwS471S0200000_1 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS471S0200000_1(C03AZ c03az, C03AZ c03az2, HashMap<String, Object> map) {
        super(3);
        this.$t = map;
        this.l0 = c03az;
        this.l1 = c03az2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(C03PI c03pi, PaymentHalfFragment paymentHalfFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = c03pi;
        this.l1 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(C03ZB c03zb, PaymentInfoCell2 paymentInfoCell2, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentInfoCell2;
        this.l1 = c03zb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(C03ZC c03zc, USPaymentInfoCell uSPaymentInfoCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSPaymentInfoCell;
        this.l1 = c03zc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(EnumC922503j5 enumC922503j5, PaymentInfo paymentInfo, int i) {
        super(3);
        this.$t = i;
        this.l0 = enumC922503j5;
        this.l1 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(C972903rD c972903rD, Address address, int i) {
        super(3);
        this.$t = i;
        this.l0 = c972903rD;
        this.l1 = address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS471S0200000_1(C983603sw c983603sw, C983603sw c983603sw2, Map<String, Object> map) {
        super(3);
        this.$t = map;
        this.l0 = c983603sw;
        this.l1 = c983603sw2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS471S0200000_1(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> interfaceC1631620sYq2, PaymentHalfFragment paymentHalfFragment) {
        super(3);
        this.$t = paymentHalfFragment;
        this.l0 = interfaceC1631620sYq;
        this.l1 = interfaceC1631620sYq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS471S0200000_1(USCombinedSkuMainOrderCell uSCombinedSkuMainOrderCell, USCombinedSkuMainOrderCell uSCombinedSkuMainOrderCell2, HashMap<String, Object> map) {
        super(3);
        this.$t = map;
        this.l0 = uSCombinedSkuMainOrderCell;
        this.l1 = uSCombinedSkuMainOrderCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(MiniOspPaymentInfoCell2 miniOspPaymentInfoCell2, C03ZB c03zb, int i) {
        super(3);
        this.$t = i;
        this.l0 = miniOspPaymentInfoCell2;
        this.l1 = c03zb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(USOspAddressCell uSOspAddressCell, AnonymousClass0376 anonymousClass0376, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSOspAddressCell;
        this.l1 = anonymousClass0376;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(PaymentHalfFragment paymentHalfFragment, PaymentViewModel paymentViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentHalfFragment;
        this.l1 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(PaymentHalfFragment paymentHalfFragment, MiniOspViewModel miniOspViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentHalfFragment;
        this.l1 = miniOspViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(PaymentHalfFragment paymentHalfFragment, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentHalfFragment;
        this.l1 = orderSubmitAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(InstallmentInfosViewHolder installmentInfosViewHolder, C03ZD c03zd, int i) {
        super(3);
        this.$t = i;
        this.l0 = installmentInfosViewHolder;
        this.l1 = c03zd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(PaymentCheckoutFragment paymentCheckoutFragment, PaymentFragment paymentFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentCheckoutFragment;
        this.l1 = paymentFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(SeaPdpViewModel seaPdpViewModel, FlashSale flashSale, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaPdpViewModel;
        this.l1 = flashSale;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(InsuranceDisplay insuranceDisplay, InsuranceDisplayVH insuranceDisplayVH, int i) {
        super(3);
        this.$t = i;
        this.l0 = insuranceDisplay;
        this.l1 = insuranceDisplayVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS471S0200000_1(PdpViewModel pdpViewModel, FlashSale flashSale, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = flashSale;
    }

    public static final Object invoke$0(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        String str;
        ReachableAddress reachableAddress = (ReachableAddress) obj2;
        int iIntValue = ((Number) obj3).intValue();
        boolean z = false;
        if (reachableAddress != null && iIntValue == 3) {
            RadioButton radioFromXml = ((C972903rD) awS471S0200000_1.l0).getRadioFromXml();
            Address address = reachableAddress.address;
            if (address != null) {
                str = address.id;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, ((Address) awS471S0200000_1.l1).id) && Intrinsics.LJFF(reachableAddress.reachable, Boolean.TRUE)) {
                z = true;
            }
            radioFromXml.setChecked(z);
        } else {
            ((C972903rD) awS471S0200000_1.l0).getRadioFromXml().setChecked(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        String str;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer numLJIIJJI;
        Integer num;
        String str2 = (String) obj2;
        ECRichTextExtraInfo eCRichTextExtraInfo = (ECRichTextExtraInfo) obj3;
        if (str2 != null) {
            Uri uri = UriProtector.parse(str2);
            int iIntValue = 0;
            if (Intrinsics.LJFF(uri.getScheme(), "ec_action") && Intrinsics.LJFF(uri.getHost(), "ec") && Intrinsics.LJFF(uri.getPath(), "/popup") && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type"), "ec_delivery_instruction")) {
                C03O0 c03o0 = C03O0.LIZ;
                HashMap<String, Object> mapHi1 = ((USOspAddressCell) awS471S0200000_1.l0).N5().hi1(false);
                DeliveryInstructionInfo deliveryInstructionInfo = ((AnonymousClass0376) awS471S0200000_1.l1).LLJJLIIIJLLLLLLLZ;
                if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
                    iIntValue = num.intValue();
                }
                mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
                AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) awS471S0200000_1.l1;
                C03O0.LJJJLZIJ(c03o0, "edit_shipping", mapHi1, null, null, null, null, null, null, anonymousClass0376.LLJZIJLIL, String.valueOf(anonymousClass0376.LLJJJIL), "delivery_instructions", null, null, null, null, null, 1019900);
                ((USOspAddressCell) awS471S0200000_1.l0).N5().setState(new AwS580S0100000_1(AFwS228S0000000_1.get$arr$(15), (Function1<? super String, Unit>) 416));
            } else if (Intrinsics.LJFF(uri.getPath(), "/address/edit") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "address_entrance_scene")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && numLJIIJJI.intValue() == 10) {
                String str3 = ((USOspAddressCell) awS471S0200000_1.l0).LLJJI;
                if (str3 != null) {
                    C03O0.LJJJJLL(C03O0.LIZ, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388607);
                }
                ((USOspAddressCell) awS471S0200000_1.l0).L5();
                OspAddressViewModel.yQ2(((USOspAddressCell) awS471S0200000_1.l0).itemView.getContext(), str2, ((USOspAddressCell) awS471S0200000_1.l0).N5());
            } else {
                String str4 = null;
                if (eCRichTextExtraInfo != null) {
                    str = eCRichTextExtraInfo.daInfo;
                } else {
                    str = null;
                }
                HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
                if (mapLJIIJ != null) {
                    Object obj4 = mapLJIIJ.get("button_name");
                    if (obj4 instanceof String) {
                        str4 = (String) obj4;
                    }
                    if (C770702zh.LIZIZ(str4)) {
                        C1748720vbi.LIZLLL(((USOspAddressCell) awS471S0200000_1.l0).itemView, new C049Y(), new AwS580S0100000_1((HashMap) mapLJIIJ, (HashMap<String, Object>) 27));
                    }
                }
                ((USOspAddressCell) awS471S0200000_1.l0).L5();
                OspAddressViewModel.vQ2(((USOspAddressCell) awS471S0200000_1.l0).itemView.getContext(), str2, ((USOspAddressCell) awS471S0200000_1.l0).N5());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        PaymentMethodInfo paymentMethodInfo;
        Map map = (Map) obj2;
        if (((Boolean) obj).booleanValue()) {
            String str3 = (String) map.get("client_token");
            String str4 = (String) map.get("client_meta_data_id");
            if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0) {
                EnumC922503j5 enumC922503j5 = (EnumC922503j5) awS471S0200000_1.l0;
                int[] iArr = C922703j7.LIZ;
                if (iArr[enumC922503j5.ordinal()] == 1) {
                    str = "pm_pi_ins_paypalpaylater_c_r_7626677791346049032";
                } else {
                    str = "eg_pi_ew_paypal_c_d_global_paypal_payin_paypal_access_token";
                }
                Boolean bool = Boolean.FALSE;
                PaymentElement paymentElement = new PaymentElement(str, "access_token", str3, bool, bool);
                if (iArr[((EnumC922503j5) awS471S0200000_1.l0).ordinal()] == 1) {
                    str2 = "pm_pi_ins_paypalpaylater_c_r_7639658840643886343";
                } else {
                    str2 = "eg_pi_ew_paypal_c_d_global_paypal_payin_paypal_client_metadata_id";
                }
                PaymentElement paymentElement2 = new PaymentElement(str2, "client_metadata_id", str4, bool, bool);
                PaymentInfo paymentInfo = (PaymentInfo) awS471S0200000_1.l1;
                if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
                    paymentMethodInfo.setPaymentElements(C1697810uHb.LJIIJJI(paymentElement, paymentElement2));
                }
                InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq = PayPalProcess.LIZIZ;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(Boolean.TRUE, (PaymentInfo) awS471S0200000_1.l1, null);
                }
            } else {
                InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq2 = PayPalProcess.LIZIZ;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Boolean.FALSE, null, null);
                }
                return Unit.LIZ;
            }
        } else {
            InterfaceC1631620sYq<? super Boolean, ? super PaymentInfo, ? super Boolean, Unit> interfaceC1631620sYq3 = PayPalProcess.LIZIZ;
            if (interfaceC1631620sYq3 != null) {
                interfaceC1631620sYq3.invoke(Boolean.FALSE, null, obj3);
            }
        }
        PayPalProcess.LIZIZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        List<PaymentElement> list;
        String str;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        ((PaymentHalfFragment) awS471S0200000_1.l0).dismissAllowingStateLoss();
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null && (list = paymentMethodInfo.paymentElements) != null) {
            PaymentViewModel paymentViewModel = (PaymentViewModel) awS471S0200000_1.l1;
            if (!list.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<PaymentElement> it2 = list.iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    PaymentElement next = it2.next();
                    String str2 = next.element;
                    if (str2 != null) {
                        str = str2;
                    }
                    Object arrayList = linkedHashMap.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(str, arrayList);
                    }
                    ((List) arrayList).add(next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                if (paymentMethod != null) {
                    Map<String, Map<String, List<PaymentElement>>> map = paymentViewModel.LLJILLL;
                    String strLJIIJ = paymentMethod.LJIIJ();
                    if (strLJIIJ != null) {
                        str = strLJIIJ;
                    }
                    map.put(str, linkedHashMap2);
                }
            }
        }
        PaymentViewModel paymentViewModel2 = (PaymentViewModel) awS471S0200000_1.l1;
        paymentViewModel2.setState(new AwS367S0200000_1(paymentViewModel2, paymentInfo, 107));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS471S0200000_1 r35, java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS471S0200000_1.invoke$12(kotlin.jvm.internal.AwS471S0200000_1, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS471S0200000_1 r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS471S0200000_1.invoke$13(kotlin.jvm.internal.AwS471S0200000_1, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$14(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        String str;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        if (C03XU.LIZIZ().enableCloseCombinePage) {
            ((PaymentHalfFragment) awS471S0200000_1.l0).dismissAllowingStateLoss();
            C03O0.LIZ.getClass();
            C03O0.LJZ();
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = (OrderSubmitAssemViewModel) awS471S0200000_1.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected combine payment method: anchor method - ");
        PaymentMethod paymentMethod = paymentInfo.LIZIZ;
        String str2 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", other method: ");
        PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
        if (paymentMethod2 != null) {
            str2 = paymentMethod2.id;
        }
        sbLIZ.append(str2);
        orderSubmitAssemViewModel.kT2(paymentInfo, true, false, C2188811AlT.LIZIZ(sbLIZ), false, false, false);
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = (OrderSubmitAssemViewModel) awS471S0200000_1.l1;
        C03LU c03lu = orderSubmitAssemViewModel2.LLLL;
        if (c03lu != null) {
            orderSubmitAssemViewModel2.withState(new AwS580S0100000_1(c03lu, 425));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        String str;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        ((PaymentHalfFragment) awS471S0200000_1.l0).dismissAllowingStateLoss();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selected from PaymentHalfFragment, paymentInfo: ");
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        String str2 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", ");
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            str2 = paymentMethodInfo.id;
        }
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        MiniOspViewModel.yQ2((MiniOspViewModel) awS471S0200000_1.l1, paymentInfo, false, null, null, 12);
        ((MiniOspViewModel) awS471S0200000_1.l1).hR2(paymentInfo);
        C03O1 c03o1 = ((MiniOspViewModel) awS471S0200000_1.l1).LLILZLL;
        c03o1.getClass();
        c03o1.LIZIZ = SystemClock.elapsedRealtime();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        BasicPopUp basicPopUp = ((InsuranceDisplay) awS471S0200000_1.l0).insurancePopup;
        if (basicPopUp != null) {
            ((InsuranceDisplayVH) awS471S0200000_1.l1).c6().LLLLJ.LJIIL(basicPopUp, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        String str = (String) obj3;
        if (zBooleanValue) {
            C1748720vbi.LIZLLL((C03AZ) awS471S0200000_1.l0, new C049Y(), new AwS580S0100000_1((HashMap) awS471S0200000_1.l1, (HashMap<String, Object>) 580));
        }
        C1748720vbi.LIZLLL((C03AZ) awS471S0200000_1.l0, new C10508049a(), new AwS18S1100100_1(jLongValue, str, (HashMap) awS471S0200000_1.l1, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        String str = (String) obj3;
        if (zBooleanValue) {
            C1748720vbi.LIZLLL(((USCombinedSkuMainOrderCell) awS471S0200000_1.l0).itemView, new C049Y(), new AwS580S0100000_1((HashMap) awS471S0200000_1.l1, (HashMap<String, Object>) 634));
        }
        C1748720vbi.LIZLLL(((USCombinedSkuMainOrderCell) awS471S0200000_1.l0).itemView, new C10508049a(), new AwS18S1100100_1(jLongValue, str, (HashMap) awS471S0200000_1.l1, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        BankInstallmentViewModel.yQ2(((InstallmentInfosViewHolder) awS471S0200000_1.l0).I5(), (PaymentMethod) obj, null, (InstallmentPlan) obj2, zBooleanValue, new AwS367S0200000_1((InstallmentInfosViewHolder) awS471S0200000_1.l0, (C03ZD) awS471S0200000_1.l1, 286), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            C1547280qMo.LJFF(sparkContext, new Pair("dialog_data", ((C983603sw) awS471S0200000_1.l0).LJFF), new Pair("client_data", (Map) awS471S0200000_1.l1));
            c1537900q7g.getClass();
            return new C1541950qED(context, sparkContext).LIZ(false);
        }
        C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJLIIJ(str);
        sparkContext2.usePreload = true;
        C1547280qMo.LJFF(sparkContext2, new Pair("dialog_data", ((C983603sw) awS471S0200000_1.l0).LJFF), new Pair("client_data", (Map) awS471S0200000_1.l1));
        c1537900q7g2.getClass();
        return new C1541950qED(context, sparkContext2).LIZ(false);
    }

    public static final Object invoke$20(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        ((PaymentCheckoutFragment) awS471S0200000_1.l0).LLJ.invoke(obj, obj2, obj3, (PaymentFragment) awS471S0200000_1.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PaymentInfoViewModel.wQ2(((PaymentInfoCell2) awS471S0200000_1.l0).T5(), (PaymentMethod) obj, ((PaymentInfoCell2) awS471S0200000_1.l0).V5().LLJJI, null, (InstallmentPlan) obj2, zBooleanValue, new AwS367S0200000_1((C03ZB) awS471S0200000_1.l1, (PaymentInfoCell2) awS471S0200000_1.l0, 24), 4);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PaymentInfoViewModel.wQ2(((PaymentInfoCell2) awS471S0200000_1.l0).T5(), (PaymentMethod) obj, ((PaymentInfoCell2) awS471S0200000_1.l0).V5().LLJJI, null, (InstallmentPlan) obj2, zBooleanValue, new AwS367S0200000_1((C03ZB) awS471S0200000_1.l1, (PaymentInfoCell2) awS471S0200000_1.l0, 25), 4);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PaymentInfoViewModel.wQ2(((MiniOspPaymentInfoCell2) awS471S0200000_1.l0).R5(), (PaymentMethod) obj, ((MiniOspPaymentInfoCell2) awS471S0200000_1.l0).P5().LLIZ, null, (InstallmentPlan) obj2, zBooleanValue, new AwS367S0200000_1((MiniOspPaymentInfoCell2) awS471S0200000_1.l0, (C03ZB) awS471S0200000_1.l1, 58), 4);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        PaymentInfoViewModel.wQ2(((MiniOspPaymentInfoCell2) awS471S0200000_1.l0).R5(), (PaymentMethod) obj, ((MiniOspPaymentInfoCell2) awS471S0200000_1.l0).P5().LLIZ, null, (InstallmentPlan) obj2, zBooleanValue, new AwS367S0200000_1((MiniOspPaymentInfoCell2) awS471S0200000_1.l0, (C03ZB) awS471S0200000_1.l1, 61), 4);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj3).booleanValue();
        PaymentInfoViewModel.wQ2(((USPaymentInfoCell) awS471S0200000_1.l0).S5(), (PaymentMethod) obj, ((USPaymentInfoCell) awS471S0200000_1.l0).T5().LLJJI, null, null, false, new AwS367S0200000_1((C03ZC) awS471S0200000_1.l1, (USPaymentInfoCell) awS471S0200000_1.l0, 67), 28);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) awS471S0200000_1.l0;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(obj, obj2, obj3);
        }
        if (C03XU.LIZIZ().enableCloseCombinePage) {
            ((PaymentHalfFragment) awS471S0200000_1.l1).dismiss();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS471S0200000_1 awS471S0200000_1, Object obj, Object obj2, Object obj3) {
        PaymentMethodsData paymentMethodsData;
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        Boolean bool = (Boolean) obj2;
        Map map = (Map) obj3;
        final C03PI c03pi = (C03PI) awS471S0200000_1.l0;
        PaymentListResponseData paymentListResponseData = c03pi.LJIILIIL;
        if (paymentListResponseData != null) {
            paymentMethodsData = paymentListResponseData.paymentMethodsData;
        } else {
            paymentMethodsData = null;
        }
        AwS100S0400000_1 awS100S0400000_1 = new AwS100S0400000_1(c03pi, (C03PI) awS471S0200000_1.l1, (PaymentHalfFragment) bool, (Boolean) map, (Map<String, ? extends Object>) 1);
        ArrayList arrayList = new ArrayList();
        if (paymentMethodsData != null && paymentMethodsData.LJJII()) {
            arrayList.add(new InterfaceC838503Pj() { // from class: X.03PM
                @Override // X.InterfaceC838503Pj
                public final boolean LIZ(PaymentInfo paymentInfo2, PaymentMethodsData paymentMethodsData2, AwS12S0401000_1 awS12S0401000_1) {
                    PaymentMethodInfo paymentMethodInfo;
                    PaymentMethodInfo paymentMethodInfo2;
                    String str;
                    PaymentMethod paymentMethod;
                    String str2;
                    PaymentMethodInfo paymentMethodInfo3;
                    PaymentMethod paymentMethod2;
                    PaymentMethod paymentMethod3;
                    String str3;
                    PaymentMethod paymentMethod4;
                    if (paymentInfo2 != null && (paymentMethod4 = paymentInfo2.paymentMethod) != null && paymentMethod4.LIZJ) {
                        C921103ir c921103ir = C921103ir.LIZ;
                        c921103ir.getClass();
                        if (C921103ir.LJIIIIZZ()) {
                            Context context = c03pi.LIZ;
                            c921103ir.getClass();
                            C921103ir.LIZLLL(context, "9900508", "order_submit", "prepaidcard", null);
                            return false;
                        }
                        Context context2 = c03pi.LIZ;
                        C1397580mTM c1397580mTM = new C1397580mTM(context2);
                        c1397580mTM.LIZIZ(context2.getResources().getString(2131833102));
                        C985403tE.LIZ(c1397580mTM, new AwS580S0100000_1(c03pi, 162));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return false;
                    }
                    SettingsManager.LIZLLL().getClass();
                    String str4 = null;
                    if (SettingsManager.LIZ("pipo_tts_intercept_create_order_verify_choose_save", true) && (paymentInfo2 == null || (paymentMethod3 = paymentInfo2.paymentMethod) == null || (str3 = paymentMethod3.token) == null || str3.length() == 0)) {
                        if (paymentInfo2 != null && (paymentMethod2 = paymentInfo2.paymentMethod) != null) {
                            str2 = paymentMethod2.id;
                        } else {
                            str2 = null;
                        }
                        if (C03S8.LJIJJ(str2) && paymentMethodsData2 != null && Intrinsics.LJFF(paymentMethodsData2.forceSave, Boolean.TRUE) && paymentInfo2 != null && (paymentMethodInfo3 = paymentInfo2.paymentMethodInfo) != null && Intrinsics.LJFF(paymentMethodInfo3.isChooseSave(), Boolean.FALSE)) {
                            C921103ir.LIZ.getClass();
                            if (C921103ir.LJIIIIZZ()) {
                                C03PI c03pi2 = c03pi;
                                C921103ir.LIZLLL(c03pi2.LIZ, "9900506", "order_submit", "ccdc", new AwS280S0300000_1(c03pi2, awS12S0401000_1, paymentInfo2, 4));
                                return false;
                            }
                            Context context3 = c03pi.LIZ;
                            C1397580mTM c1397580mTM2 = new C1397580mTM(context3);
                            c1397580mTM2.LIZIZ(context3.getResources().getString(2131833169));
                            C985403tE.LIZ(c1397580mTM2, new AwS210S0300000_1(c03pi, awS12S0401000_1, paymentInfo2, 32));
                            c1397580mTM2.LJII = false;
                            new C1397510mTF(c1397580mTM2).LIZLLL();
                            return false;
                        }
                    }
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("pipo_tts_intercept_paypal_not_save_when_sns_order", true)) {
                        if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
                            str4 = paymentMethod.id;
                        }
                        if (Intrinsics.LJFF(str4, "pm_pi_ew_paypal_c_r") && (((paymentMethodInfo = paymentInfo2.paymentMethodInfo) == null || (str = paymentMethodInfo.token) == null || str.length() == 0) && paymentMethodsData2 != null && Intrinsics.LJFF(paymentMethodsData2.forceSave, Boolean.TRUE) && ((paymentMethodInfo2 = paymentInfo2.paymentMethodInfo) == null || !Intrinsics.LJFF(paymentMethodInfo2.isChooseSave(), Boolean.TRUE)))) {
                            C921103ir.LIZ.getClass();
                            if (C921103ir.LJIIIIZZ()) {
                                C03PI c03pi3 = c03pi;
                                C921103ir.LIZLLL(c03pi3.LIZ, "9900507", "order_submit", "paypal", new AwS280S0300000_1(c03pi3, awS12S0401000_1, paymentInfo2, 5));
                                return false;
                            }
                            Context context4 = c03pi.LIZ;
                            C1397580mTM c1397580mTM3 = new C1397580mTM(context4);
                            c1397580mTM3.LJI(context4.getResources().getString(2131833101));
                            c1397580mTM3.LIZIZ(c03pi.LIZ.getResources().getString(2131833100));
                            C985403tE.LIZ(c1397580mTM3, new AwS210S0300000_1(c03pi, awS12S0401000_1, paymentInfo2, 36));
                            c1397580mTM3.LJII = false;
                            new C1397510mTF(c1397580mTM3).LIZLLL();
                            return false;
                        }
                    }
                    return true;
                }
            });
        }
        if (arrayList.isEmpty()) {
            awS100S0400000_1.invoke(paymentInfo);
        } else {
            c03pi.LJIIIIZZ(arrayList, 0, paymentInfo, paymentMethodsData, awS100S0400000_1);
        }
        return Unit.LIZ;
    }
}
