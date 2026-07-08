package com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment;

import X.C03MT;
import X.C03OT;
import X.C03SY;
import X.C1388190mED;
import X.C14EU;
import X.C1713070ugD;
import X.C19EG;
import X.C761202yA;
import X.C873003b6;
import X.EnumC865103Zp;
import X.InterfaceC0148002o;
import X.InterfaceC1164530gPT;
import X.InterfaceC497601wk;
import X.InterfaceC866403a2;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoEcomRiskAppealV3ConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class PaymentInfoViewModel extends AssemViewModel<C761202yA> implements InterfaceC1164530gPT {
    public final Map<String, String> LL = new LinkedHashMap();
    public final Map<String, String> LLILLJJLI = new LinkedHashMap();
    public InterfaceC866403a2 LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C761202yA(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1713070ugD.LIZIZ(this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_payment_refresh_cashier", this);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C1713070ugD.LIZ(this);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_payment_refresh_cashier", this);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentSelectedEvent$ecommerce_transaction_release(C03OT c03ot) {
        String str;
        String str2;
        String str3;
        String str4;
        PaymentMethod paymentMethod = c03ot.LIZ;
        PaymentMethod paymentMethod2 = c03ot.LIZLLL;
        String str5 = "";
        if (c03ot.LIZJ) {
            Map<String, String> map = this.LLILLJJLI;
            if (paymentMethod2 == null || (str3 = paymentMethod2.id) == null) {
                str3 = "";
            }
            if (paymentMethod != null && (str4 = paymentMethod.id) != null) {
                str5 = str4;
            }
            map.put(str3, str5);
            return;
        }
        Map<String, String> map2 = this.LL;
        if (paymentMethod2 == null || (str = paymentMethod2.id) == null) {
            str = "";
        }
        if (paymentMethod != null && (str2 = paymentMethod.id) != null) {
            str5 = str2;
        }
        map2.put(str, str5);
    }

    public static PaymentInfo CQ2(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        String str;
        String str2;
        String str3;
        String str4;
        C03SY c03sy = C03SY.LIZ;
        String str5 = null;
        if (paymentInfo != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        c03sy.getClass();
        C873003b6 c873003b6LJI = C03SY.LJI(installmentPlan, paymentMethod);
        if (paymentInfo == null) {
            return null;
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            if (installmentPlan != null) {
                str4 = installmentPlan.tenure;
            } else {
                str4 = null;
            }
            paymentMethodInfo.setTenure(str4);
        }
        PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo2 != null) {
            if (installmentPlan != null) {
                str3 = installmentPlan.tenureCycle;
            } else {
                str3 = null;
            }
            paymentMethodInfo2.setTenureCycle(str3);
        }
        PaymentMethodInfo paymentMethodInfo3 = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo3 != null) {
            if (installmentPlan != null) {
                str2 = installmentPlan.id;
            } else {
                str2 = null;
            }
            paymentMethodInfo3.setInstallmentPlanId(str2);
        }
        PaymentMethodInfo paymentMethodInfo4 = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo4 != null) {
            if (c873003b6LJI != null) {
                str = c873003b6LJI.LIZJ;
            } else {
                str = null;
            }
            paymentMethodInfo4.setBankCode(str);
        }
        PaymentMethodInfo paymentMethodInfo5 = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo5 != null) {
            if (c873003b6LJI != null) {
                str5 = c873003b6LJI.LIZLLL;
            }
            paymentMethodInfo5.setBankName(str5);
        }
        return paymentInfo;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_payment_refresh_cashier")) {
            this.LLILZ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean xQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r9, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r10) {
        /*
            r8 = this;
            r7 = 0
            if (r10 != 0) goto L4
            return r7
        L4:
            java.lang.String r4 = r10.id
            java.lang.String r5 = ""
            if (r4 != 0) goto Lb
            r4 = r5
        Lb:
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel> r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel.class
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel r1 = X.C846203Si.LIZ
            java.lang.String r0 = "pipo_ecom_store_payment_methods"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel) r0
            if (r0 == 0) goto L1e
            r1 = r0
        L1e:
            java.util.List<java.lang.String> r0 = r1.paymentMethodId
            boolean r6 = r0.contains(r4)
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r10.subPaymentMethods
            r4 = 1
            if (r0 == 0) goto L7b
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L7b
            r3 = 1
        L32:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy r1 = r10.unfoldStrategy
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE
            if (r1 != r0) goto L79
            r2 = 1
        L39:
            if (r9 == 0) goto L5b
            boolean r0 = r9.LJI()
            if (r0 != r4) goto L5b
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.LLILLJJLI
            java.lang.String r0 = r10.id
            if (r0 == 0) goto L48
            r5 = r0
        L48:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L6b
        L50:
            r0 = 1
        L51:
            if (r6 == 0) goto L5a
            if (r3 == 0) goto L5a
            if (r2 == 0) goto L5a
            if (r0 != 0) goto L5a
            r7 = 1
        L5a:
            return r7
        L5b:
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.LL
            java.lang.String r0 = r10.id
            if (r0 == 0) goto L62
            r5 = r0
        L62:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L6b
            goto L50
        L6b:
            if (r9 == 0) goto L77
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r9.paymentMethod
        L6f:
            boolean r0 = r10.LJJJJZ(r0)
            if (r0 != 0) goto L50
            r0 = 0
            goto L51
        L77:
            r0 = 0
            goto L6f
        L79:
            r2 = 0
            goto L39
        L7b:
            r3 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel.xQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):boolean");
    }

    public final void yQ2(Context context, PaymentMethod paymentMethod) {
        String str;
        boolean zLIZJ = EcPipoEcomRiskAppealV3ConfigSettings.LIZJ();
        PaymentAppealHelper paymentAppealHelper = PaymentAppealHelper.LIZ;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        if (zLIZJ) {
            str = "Pay_Option";
        } else {
            str = null;
        }
        paymentAppealHelper.getClass();
        PaymentAppealHelper.LIZLLL(paymentMethod, null, "payment_method", "checkout_page_pi_list", context, viewModelScope, null, null, str);
    }

    public final boolean vQ2(Context context, PaymentMethod paymentMethod, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        String str;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        CciCashierDisplayType cciCashierDisplayType;
        PaymentMethodsData paymentMethodsData;
        if (paymentMethod == null || (str = paymentMethod.id) == null || context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || !C03MT.LIZIZ(str)) {
            return false;
        }
        if (Intrinsics.LJFF(str, "pm_pi_ccdc_all")) {
            AQ2(this, supportFragmentManager, paymentMethod, orderSubmitAssemViewModel, null, null, null, context, true, false, 312);
        } else {
            C03SY c03sy = C03SY.LIZ;
            BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                cciCashierDisplayType = paymentMethodsData.cciCashierDisplayType;
            } else {
                cciCashierDisplayType = null;
            }
            c03sy.getClass();
            EnumC865103Zp enumC865103ZpLJIIIIZZ = C03SY.LJIIIIZZ(cciCashierDisplayType);
            if (enumC865103ZpLJIIIIZZ == null) {
                return false;
            }
            zQ2(this, supportFragmentManager, paymentMethod, null, orderSubmitAssemViewModel, enumC865103ZpLJIIIIZZ, null, null, context, true, 100);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void wQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel r23, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r24, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r26, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r27, boolean r28, kotlin.jvm.functions.Function1 r29, int r30) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel.wQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, boolean, kotlin.jvm.functions.Function1, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136 A[PHI: r18
      0x0136: PHI (r18v1 java.lang.String) = (r18v0 java.lang.String), (r18v3 java.lang.String), (r18v3 java.lang.String) binds: [B:80:0x0132, B:51:0x0086, B:53:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void BQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel r61, android.content.Context r62, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r63, androidx.fragment.app.FragmentManager r64, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r65, X.C927003jo r66, X.EnumC865603Zu r67, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r68, int r69) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel.BQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel, android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, androidx.fragment.app.FragmentManager, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, X.03jo, X.03Zu, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea A[PHI: r29
      0x01ea: PHI (r29v1 java.lang.String) = (r29v0 java.lang.String), (r29v6 java.lang.String), (r29v6 java.lang.String) binds: [B:126:0x01e6, B:73:0x00de, B:75:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f0 A[PHI: r29 r30
      0x01f0: PHI (r29v2 java.lang.String) = (r29v1 java.lang.String), (r29v5 java.lang.String) binds: [B:129:0x01ec, B:78:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r30v1 java.lang.String) = (r30v0 java.lang.String), (r30v4 java.lang.String) binds: [B:129:0x01ec, B:78:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8 A[PHI: r29 r30
      0x00e8: PHI (r29v5 java.lang.String) = (r29v1 java.lang.String), (r29v6 java.lang.String) binds: [B:129:0x01ec, B:76:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r30v4 java.lang.String) = (r30v0 java.lang.String), (r30v5 java.lang.String) binds: [B:129:0x01ec, B:76:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void AQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel r67, androidx.fragment.app.FragmentManager r68, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r69, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r70, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r71, java.lang.String r72, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r73, android.content.Context r74, boolean r75, boolean r76, int r77) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel.AQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel, androidx.fragment.app.FragmentManager, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel, android.content.Context, boolean, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab A[PHI: r27
      0x01ab: PHI (r27v1 java.lang.String) = (r27v0 java.lang.String), (r27v4 java.lang.String), (r27v4 java.lang.String) binds: [B:102:0x01a7, B:74:0x00d9, B:76:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3 A[PHI: r27 r28
      0x00e3: PHI (r27v3 java.lang.String) = (r27v1 java.lang.String), (r27v4 java.lang.String) binds: [B:105:0x01ad, B:77:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r28v2 java.lang.String) = (r28v0 java.lang.String), (r28v3 java.lang.String) binds: [B:105:0x01ad, B:77:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel r76, androidx.fragment.app.FragmentManager r77, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r78, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r79, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r80, X.EnumC865103Zp r81, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r82, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r83, android.content.Context r84, boolean r85, int r86) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel.zQ2(com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel, androidx.fragment.app.FragmentManager, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, X.03Zp, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, android.content.Context, boolean, int):void");
    }
}
