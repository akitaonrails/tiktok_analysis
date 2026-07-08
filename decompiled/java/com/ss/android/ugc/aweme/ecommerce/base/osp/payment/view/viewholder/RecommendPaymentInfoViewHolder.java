package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C01GW;
import X.C03S8;
import X.C03WH;
import X.C03YM;
import X.C03Z8;
import X.C0H9H;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.C924703jR;
import X.InterfaceC869803aa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendPaymentInfoViewHolder extends ECJediViewHolder<C03YM> implements InterfaceC869803aa {
    public final C924703jR LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel f6() {
        return (PaymentViewModel) this.LLJILJILJ.getValue();
    }

    public final View d6(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.itemView.getContext()), R.layout.amp, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        InstallmentPlan installmentPlan;
        String str;
        InstallmentPlan installmentPlan2;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        InstallmentPlan next;
        Object obj2;
        Object obj3;
        LinearLayout linearLayout;
        String strB6;
        PaymentPromotion paymentPromotionLJIILLIIL;
        InstallmentPlan installmentPlanLJIILL;
        PaymentMethodInfo paymentMethodInfoCopy;
        String str2;
        String str3;
        String str4;
        String priceStr;
        PaymentPromotion paymentPromotionLJIILLIIL2;
        String priceStr2;
        String strB62;
        PaymentPromotion paymentPromotionLJIILLIIL3;
        InstallmentPlan installmentPlanLJIILL2;
        PaymentMethodInfo paymentMethodInfoCopy2;
        String str5;
        String str6;
        String str7;
        C03YM c03ym = (C03YM) obj;
        PaymentInfo paymentInfoLIZ = c03ym.LIZ;
        View view = this.itemView;
        if ((view instanceof LinearLayout) && (linearLayout = (LinearLayout) view) != null) {
            linearLayout.setPadding(C0H9H.LIZIZ(16), 0, C0H9H.LIZIZ(16), 0);
            linearLayout.setOrientation(1);
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            C786410Ut5.LJJJJJL(linearLayout);
            if (paymentInfoLIZ.LJI()) {
                View viewD6 = d6(linearLayout);
                PaymentMethod paymentMethod = paymentInfoLIZ.LIZ;
                Amount amountLJII = C03S8.LJII(paymentMethod);
                if (amountLJII != null) {
                    priceStr = amountLJII.getPriceStr();
                } else {
                    priceStr = null;
                }
                PaymentPromotion paymentPromotionE6 = e6(paymentInfoLIZ, paymentInfoLIZ.LIZ);
                PaymentMethod paymentMethod2 = paymentInfoLIZ.LIZ;
                if (paymentMethod2 != null) {
                    paymentPromotionLJIILLIIL2 = paymentMethod2.LJIILLIIL();
                } else {
                    paymentPromotionLJIILLIIL2 = null;
                }
                h6(viewD6, paymentMethod, priceStr, true, null, null, null, null, null, paymentPromotionE6, paymentPromotionLJIILLIIL2);
                PaymentMethod paymentMethod3 = paymentInfoLIZ.paymentMethod;
                if (paymentMethod3 != null && paymentMethod3.LJJJLZIJ()) {
                    PaymentMethod paymentMethod4 = paymentInfoLIZ.paymentMethod;
                    if (paymentMethod4 != null) {
                        installmentPlanLJIILL2 = paymentMethod4.LJIILL();
                    } else {
                        installmentPlanLJIILL2 = null;
                    }
                    PaymentMethodInfo paymentMethodInfo = paymentInfoLIZ.paymentMethodInfo;
                    if (paymentMethodInfo != null) {
                        if (installmentPlanLJIILL2 != null) {
                            str5 = installmentPlanLJIILL2.tenure;
                            str6 = installmentPlanLJIILL2.id;
                            str7 = installmentPlanLJIILL2.installmentOptionId;
                        } else {
                            str5 = null;
                            str6 = null;
                            str7 = null;
                        }
                        paymentMethodInfoCopy2 = paymentMethodInfo.copy(paymentMethodInfo.id, paymentMethodInfo.token, paymentMethodInfo.paymentElements, paymentMethodInfo.isChooseSave, str5, str6, str7, paymentMethodInfo.consultationId, paymentMethodInfo.isOneClickPay, paymentMethodInfo.isOneClickPayReselect, paymentMethodInfo.bankCode, paymentMethodInfo.bankName, paymentMethodInfo.installmentPlan, paymentMethodInfo.hideMarketingAmount, paymentMethodInfo.tenureCycle, paymentMethodInfo.paymentPriceParam, paymentMethodInfo.isAnchored);
                    } else {
                        paymentMethodInfoCopy2 = null;
                    }
                    paymentInfoLIZ = PaymentInfo.LIZ(paymentInfoLIZ, paymentMethodInfoCopy2, null, null, null, null, null, null, 2046);
                }
                View viewD62 = d6(linearLayout);
                PaymentMethod paymentMethod5 = paymentInfoLIZ.paymentMethod;
                Amount amountLJIIIIZZ = C03S8.LJIIIIZZ(C03S8.LJIIJ(paymentInfoLIZ), paymentInfoLIZ.LIZ, paymentMethod5);
                if (amountLJIIIIZZ != null) {
                    priceStr2 = amountLJIIIIZZ.getPriceStr();
                } else {
                    priceStr2 = null;
                }
                String strA6 = a6(null, paymentInfoLIZ);
                String strW5 = W5(null, paymentInfoLIZ);
                String strC6 = c6(null, paymentInfoLIZ);
                PaymentMethod paymentMethod6 = paymentInfoLIZ.paymentMethod;
                if (paymentMethod6 != null && paymentMethod6.LJJJLZIJ()) {
                    strB62 = null;
                } else {
                    strB62 = b6(null, paymentInfoLIZ);
                }
                String strX5 = X5(null, paymentInfoLIZ);
                PaymentPromotion paymentPromotionE62 = e6(paymentInfoLIZ, paymentInfoLIZ.paymentMethod);
                PaymentMethod paymentMethod7 = paymentInfoLIZ.paymentMethod;
                if (paymentMethod7 != null) {
                    paymentPromotionLJIILLIIL3 = paymentMethod7.LJIILLIIL();
                } else {
                    paymentPromotionLJIILLIIL3 = null;
                }
                h6(viewD62, paymentMethod5, priceStr2, false, strA6, strW5, strC6, strB62, strX5, paymentPromotionE62, paymentPromotionLJIILLIIL3);
                linearLayout.addView(viewD6);
                linearLayout.addView(viewD62);
                installmentPlan = null;
            } else {
                PaymentMethod paymentMethod8 = paymentInfoLIZ.paymentMethod;
                if (paymentMethod8 != null && paymentMethod8.LJJJLZIJ()) {
                    PaymentMethod paymentMethod9 = paymentInfoLIZ.paymentMethod;
                    if (paymentMethod9 != null) {
                        installmentPlanLJIILL = paymentMethod9.LJIILL();
                    } else {
                        installmentPlanLJIILL = null;
                    }
                    PaymentMethodInfo paymentMethodInfo2 = paymentInfoLIZ.paymentMethodInfo;
                    if (paymentMethodInfo2 != null) {
                        if (installmentPlanLJIILL != null) {
                            str2 = installmentPlanLJIILL.tenure;
                            str3 = installmentPlanLJIILL.id;
                            str4 = installmentPlanLJIILL.installmentOptionId;
                        } else {
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        paymentMethodInfoCopy = paymentMethodInfo2.copy(paymentMethodInfo2.id, paymentMethodInfo2.token, paymentMethodInfo2.paymentElements, paymentMethodInfo2.isChooseSave, str2, str3, str4, paymentMethodInfo2.consultationId, paymentMethodInfo2.isOneClickPay, paymentMethodInfo2.isOneClickPayReselect, paymentMethodInfo2.bankCode, paymentMethodInfo2.bankName, paymentMethodInfo2.installmentPlan, paymentMethodInfo2.hideMarketingAmount, paymentMethodInfo2.tenureCycle, paymentMethodInfo2.paymentPriceParam, paymentMethodInfo2.isAnchored);
                    } else {
                        paymentMethodInfoCopy = null;
                    }
                    paymentInfoLIZ = PaymentInfo.LIZ(paymentInfoLIZ, paymentMethodInfoCopy, null, null, null, null, null, null, 2046);
                }
                View viewD63 = d6(linearLayout);
                PaymentMethod paymentMethod10 = paymentInfoLIZ.paymentMethod;
                String strA62 = a6(null, paymentInfoLIZ);
                String strW52 = W5(null, paymentInfoLIZ);
                String strC62 = c6(null, paymentInfoLIZ);
                PaymentMethod paymentMethod11 = paymentInfoLIZ.paymentMethod;
                if (paymentMethod11 != null && paymentMethod11.LJJJLZIJ()) {
                    strB6 = null;
                    installmentPlan = null;
                } else {
                    installmentPlan = null;
                    strB6 = b6(null, paymentInfoLIZ);
                }
                String strX52 = X5(installmentPlan, paymentInfoLIZ);
                PaymentPromotion paymentPromotionE63 = e6(paymentInfoLIZ, paymentInfoLIZ.paymentMethod);
                PaymentMethod paymentMethod12 = paymentInfoLIZ.paymentMethod;
                if (paymentMethod12 != null) {
                    paymentPromotionLJIILLIIL = paymentMethod12.LJIILLIIL();
                } else {
                    paymentPromotionLJIILLIIL = installmentPlan;
                }
                h6(viewD63, paymentMethod10, null, true, strA62, strW52, strC62, strB6, strX52, paymentPromotionE63, paymentPromotionLJIILLIIL);
                linearLayout.addView(viewD63);
            }
            C786410Ut5.I7(new AjS60S0100000_1(this, 123), linearLayout);
        } else {
            installmentPlan = null;
        }
        PaymentMethodInfo paymentMethodInfo3 = c03ym.LIZ.paymentMethodInfo;
        if (paymentMethodInfo3 != null) {
            str = paymentMethodInfo3.tenure;
        } else {
            str = installmentPlan;
        }
        if (C703302op.LIZ(str)) {
            PaymentMethod paymentMethod13 = c03ym.LIZ.paymentMethod;
            if (paymentMethod13 != null && (installmentInfo = paymentMethod13.installmentInfo) != null && (list = installmentInfo.installmentPlans) != null) {
                Iterator<InstallmentPlan> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        InstallmentPlan installmentPlan3 = next;
                        String str8 = installmentPlan3.tenure;
                        PaymentMethodInfo paymentMethodInfo4 = c03ym.LIZ.paymentMethodInfo;
                        if (paymentMethodInfo4 != null) {
                            obj2 = paymentMethodInfo4.tenure;
                        } else {
                            obj2 = installmentPlan;
                        }
                        if (Intrinsics.LJFF(str8, obj2)) {
                            String str9 = installmentPlan3.id;
                            PaymentMethodInfo paymentMethodInfo5 = c03ym.LIZ.paymentMethodInfo;
                            if (paymentMethodInfo5 != null) {
                                obj3 = paymentMethodInfo5.installmentPlanId;
                            } else {
                                obj3 = installmentPlan;
                            }
                            if (Intrinsics.LJFF(str9, obj3)) {
                                break;
                            }
                        }
                    } else {
                        next = installmentPlan;
                        break;
                    }
                }
                installmentPlan2 = next;
            } else {
                installmentPlan2 = installmentPlan;
            }
            PaymentMethod paymentMethod14 = c03ym.LIZ.paymentMethod;
            if (paymentMethod14 != null) {
                PaymentViewModel paymentViewModelF6 = f6();
                List<? extends Object> list2 = PaymentViewModel.LLLI;
                paymentViewModelF6.VR2(paymentMethod14, installmentPlan2, false);
            }
        }
        C03WH c03wh = f6().LLJI;
        if (c03wh != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c03wh.LIZ);
            linkedHashMap.put("module_name", "payment_method");
            C03WH.LJJII("tiktokec_module_show", linkedHashMap);
        }
    }

    @Override // X.InterfaceC869803aa
    public final InstallmentPlan xe(PaymentInfo paymentInfo) {
        return C03Z8.LIZ(paymentInfo);
    }

    public RecommendPaymentInfoViewHolder(ViewGroup viewGroup, C924703jR c924703jR) {
        super(new LinearLayout(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 50));
    }

    public static PaymentPromotion e6(PaymentInfo paymentInfo, PaymentMethod paymentMethod) {
        List<InstallmentPlan> list;
        InstallmentPlan next;
        PaymentServiceFeeInfo paymentServiceFeeInfo;
        PaymentPromotion paymentPromotion;
        String str;
        if (paymentMethod != null) {
            InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
            if (installmentInfo != null && (list = installmentInfo.installmentPlans) != null) {
                Iterator<InstallmentPlan> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String str2 = next.tenure;
                        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
                        if (paymentMethodInfo != null) {
                            str = paymentMethodInfo.tenure;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InstallmentPlan installmentPlan = next;
                if (installmentPlan != null && (paymentServiceFeeInfo = installmentPlan.paymentServiceFeeInfo) != null && (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) != null) {
                    return paymentPromotion;
                }
            }
            PaymentServiceFeeInfo paymentServiceFeeInfo2 = paymentMethod.paymentServiceFeeInfo;
            if (paymentServiceFeeInfo2 != null) {
                return paymentServiceFeeInfo2.paymentPromotionInfo;
            }
        }
        return null;
    }

    public final String W5(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZIZ(this, paymentInfo, installmentPlan);
    }

    public final String X5(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZJ(this, paymentInfo, installmentPlan);
    }

    public final String a6(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZLLL(this, paymentInfo, installmentPlan);
    }

    public final String b6(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LJ(this, paymentInfo, installmentPlan);
    }

    public final String c6(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LJFF(this, paymentInfo, installmentPlan);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b5 A[PHI: r4
      0x02b5: PHI (r4v14 java.lang.String) = (r4v12 java.lang.String), (r4v11 java.lang.String) binds: [B:152:0x03c8, B:105:0x02b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0266  */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v134 */
    /* JADX WARN: Type inference failed for: r2v135 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.graphics.drawable.Drawable, android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h6(android.view.View r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r26, java.lang.String r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion r34, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion r35) {
        /*
            Method dump skipped, instruction units count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.RecommendPaymentInfoViewHolder.h6(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion):void");
    }
}
