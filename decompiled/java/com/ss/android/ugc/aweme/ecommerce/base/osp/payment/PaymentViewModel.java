package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AnonymousClass0369;
import X.C004I;
import X.C00DJ;
import X.C01GW;
import X.C03OC;
import X.C03OD;
import X.C03OI;
import X.C03OW;
import X.C03PI;
import X.C03Q4;
import X.C03S8;
import X.C03SE;
import X.C03SM;
import X.C03SN;
import X.C03SO;
import X.C03SP;
import X.C03SY;
import X.C03WD;
import X.C03WH;
import X.C03WK;
import X.C03XU;
import X.C03YI;
import X.C03YJ;
import X.C03Z0;
import X.C03ZA;
import X.C03ZN;
import X.C0PEM;
import X.C1077704Jj;
import X.C1120604Zw;
import X.C1121904a9;
import X.C11S5;
import X.C1388190mED;
import X.C13BV;
import X.C13E8;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1713070ugD;
import X.C1741890vQh;
import X.C178200mK;
import X.C19EG;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C259800zU;
import X.C452501pT;
import X.C756302xN;
import X.C770702zh;
import X.C817503Hh;
import X.C817603Hi;
import X.C836603Oq;
import X.C842503Qx;
import X.C862203Ym;
import X.C862303Yn;
import X.C862703Yr;
import X.C862803Ys;
import X.C863203Yw;
import X.C864503Zj;
import X.C877403bo;
import X.C883303cl;
import X.C888803de;
import X.C899503fN;
import X.C904203g8;
import X.C922003j0;
import X.C924503jP;
import X.C926203jg;
import X.C927003jo;
import X.C932203ke;
import X.C948503nH;
import X.EnumC837803Pc;
import X.EnumC863903Zd;
import X.EnumC865603Zu;
import X.EnumC880203cG;
import X.EnumC882203ca;
import X.InterfaceC1164530gPT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC21660519pr;
import X.InterfaceC497601wk;
import Y.AfS170S0100000_1;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentCreditAddCciConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoEcomRiskAppealV3ConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container.PaymentCheckoutFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnbindPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.event.PaymentResultReceivedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.FinancingDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummaryType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RetentionDialogInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import defpackage.w1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS26S0310000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS471S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS56S0210000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PaymentViewModel extends JediViewModel<PaymentState> implements InterfaceC1164530gPT, InterfaceC21660519pr {
    public static List<? extends Object> LLLI;
    public static boolean LLLII;
    public static Integer LLLIIII;
    public static EnterParams LLLIIIIL;
    public static final C13E8<String> LLLIIIL;
    public Address LLILZLL;
    public List<PaymentPrice> LLIZ;
    public Summary LLIZLLLIL;
    public EnterParams LLJ;
    public C03WH LLJI;
    public boolean LLJILJIL;
    public String LLJJI;
    public List<? extends Object> LLJJIII;
    public HashMap<String, Object> LLJJIJIIJIL;
    public PaymentMethodsData LLJJIJIL;
    public Function2<? super ChangeInfo, ? super InterfaceC1364105Vn<? super C842503Qx>, ? extends Object> LLJJJJ;
    public Map<String, String> LLJJJJJIL;
    public n LLJJJJLIIL;
    public C03SP LLJJL;
    public String LLJL;
    public String LLJLIL;
    public PaymentMethod LLJLILLLLZIIL;
    public C00DJ LLJLL;
    public RetentionDialogInfo LLJLLIL;
    public PaymentMethod LLLF;
    public C883303cl LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public Function1<? super EnumC863903Zd, Unit> LLILZIL = AFwS228S0000000_1.get$arr$(173);
    public String LLJIJIL = "";
    public boolean LLJILJILJ = true;
    public final Map<String, Map<String, List<PaymentElement>>> LLJILLL = new LinkedHashMap();
    public final Map<String, InstallmentPlan> LLJJ = new LinkedHashMap();
    public final Map<String, BindInfoItem> LLJJIJI = new LinkedHashMap();
    public String LLJJJ = "";
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(54));
    public final C817603Hi LLJJLIIIJLLLLLLLZ = new C817603Hi();
    public final Map<String, String> LLJLLL = new LinkedHashMap();
    public final Map<String, String> LLJZ = new LinkedHashMap();
    public final Map<String, String> LLJZIJLIL = new LinkedHashMap();
    public final C01GW LLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(53));

    static {
        new C03YI();
        LLLI = C13BV.INSTANCE;
        w1.LIZ.getClass();
        LLLII = w1.LIZ().LIZ();
        LLLIIIL = new C13E8<>();
    }

    @Override // X.InterfaceC21660519pr
    public final void Nc0() {
        setState(AFwS228S0000000_1.get$arr$(172));
    }

    public final void SR2() {
        setState(new AwS580S0100000_1(this, 150));
    }

    public final boolean WR2() {
        EnterParams enterParams = this.LLJ;
        return enterParams != null && enterParams.LJJIIZI;
    }

    public final C904203g8 oR2() {
        return (C904203g8) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new PaymentState(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public final String nR2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(getClass()).LJI());
        sbLIZ.append('_');
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1713070ugD.LIZIZ(this);
        EnterParams enterParams = this.LLJ;
        if (enterParams != null) {
            Integer num = enterParams.buttonType;
            int iOrdinal = EnumC882203ca.PAY_NOW.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                EventBus.LIZLLL().LJIJJLI(C03ZN.class);
            }
        }
        LLLIIIL.LJIIZILJ();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        C1713070ugD.LIZ(this);
        LLLIIIL.addLast(nR2());
    }

    public static boolean DR2(PaymentMethod paymentMethod) {
        String str;
        Object next;
        C03ZA c03za;
        PaymentMethod paymentMethod2;
        List<? extends Object> list = LLLI;
        if (list == null || list.isEmpty() || paymentMethod == null) {
            return false;
        }
        Iterator<? extends Object> it2 = LLLI.iterator();
        do {
            str = null;
            if (it2.hasNext()) {
                next = it2.next();
                if ((next instanceof C03ZA) && (c03za = (C03ZA) next) != null && (paymentMethod2 = c03za.LIZ) != null) {
                    str = paymentMethod2.id;
                }
            } else {
                return false;
            }
        } while (!Intrinsics.LJFF(str, paymentMethod.id));
        if (next != null) {
            return true;
        }
        return false;
    }

    public static boolean ER2(PaymentViewModel paymentViewModel) {
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(83);
        paymentViewModel.getClass();
        if (C03XU.LIZIZ().enableIdentifier) {
            if (Intrinsics.LJFF(LLLIIIL.LJIIIIZZ(), paymentViewModel.nR2())) {
                aFwS185S0000000_1.getClass();
                if (Boolean.TRUE.booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void LR2(PaymentViewModel paymentViewModel) {
        paymentViewModel.getClass();
        paymentViewModel.setState(AFwS228S0000000_1.get$arr$(254));
        C948503nH.LJFF(paymentViewModel, C0PEM.LIZJ, new C863203Yw(paymentViewModel, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[PHI: r4
      0x0088: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v3 java.lang.String) binds: [B:19:0x0085, B:9:0x001b, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019 A[PHI: r4
      0x0019: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:19:0x0085, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CR2(android.content.Context r37) {
        /*
            r36 = this;
            r0 = 165(0xa5, float:2.31E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r5 = r36
            r5.setState(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r2 = r5.LLJ
            java.lang.String r1 = ""
            if (r2 == 0) goto L84
            X.03dR r0 = r2.LJJIJL
            if (r0 == 0) goto L84
            java.lang.String r4 = r0.LIZLLL
            if (r4 == 0) goto L84
        L19:
            X.03dR r0 = r2.LJJIJL
            if (r0 == 0) goto L88
            java.lang.String r3 = r0.LIZJ
            if (r3 == 0) goto L88
        L21:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r24 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo r6 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r5.LLJLILLLLZIIL
            if (r0 == 0) goto L82
            java.lang.String r7 = r0.id
        L2b:
            r8 = 0
            r27 = 0
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r5.LLJLILLLLZIIL
            java.util.LinkedHashMap r34 = new java.util.LinkedHashMap
            r34.<init>()
            r25 = r6
            r28 = r27
            r29 = r27
            r30 = r27
            r31 = r27
            r32 = r27
            r33 = r27
            r35 = r27
            r26 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess.LIZ
            r9 = 1
            r0 = 167(0xa7, float:2.34E-43)
            kotlin.jvm.internal.AFwS228S0000000_1 r10 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            kotlin.jvm.internal.AwS650S0100000_1 r1 = new kotlin.jvm.internal.AwS650S0100000_1
            r0 = 6
            r1.<init>(r5, r0)
            r2.getClass()
            r5 = r37
            r8 = r24
            r11 = r1
            r6 = r4
            r7 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess.LIZIZ(r5, r6, r7, r8, r9, r10, r11)
            return
        L82:
            r7 = 0
            goto L2b
        L84:
            r4 = r1
            if (r2 == 0) goto L88
            goto L19
        L88:
            r3 = r1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.CR2(android.content.Context):void");
    }

    public final boolean FR2(PaymentInfo paymentInfo) {
        if (C03WK.LIZ(this.LLJ)) {
            C864503Zj.LIZ.getClass();
            return !C864503Zj.LIZJ(paymentInfo);
        }
        return false;
    }

    public final void MR2(PaymentMethod paymentMethod) {
        String str;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("call remove bind method");
        if (paymentMethod != null && (str = paymentMethod.token) != null) {
            setState(AFwS228S0000000_1.get$arr$(174));
            C877403bo c877403bo = PaymentApi.LIZ;
            UnbindPaymentMethodRequest unbindPaymentMethodRequest = new UnbindPaymentMethodRequest(str, null);
            c877403bo.getClass();
            ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LJIIJJI(unbindPaymentMethodRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS170S0100000_1(this, 6), new AfS170S0100000_1(this, 7));
        }
    }

    public final boolean QR2(PaymentInfo paymentInfo) {
        CciCashierDisplayType cciCashierDisplayType;
        PaymentMethodsData paymentMethodsData;
        if (paymentInfo == null || !EcPaymentCreditAddCciConfigSettings.LIZ().enableAddCardStrategy) {
            return false;
        }
        C03SY c03sy = C03SY.LIZ;
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        c03sy.getClass();
        if (!C03SY.LJIJJ(paymentMethod) || !paymentInfo.LJI() || paymentInfo.LJ == null) {
            return false;
        }
        EnterParams enterParams = this.LLJ;
        if (enterParams != null && (paymentMethodsData = enterParams.paymentData) != null) {
            cciCashierDisplayType = paymentMethodsData.cciCashierDisplayType;
        } else {
            cciCashierDisplayType = null;
        }
        if (cciCashierDisplayType != CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE) {
            return false;
        }
        return true;
    }

    public final PaymentInfo jR2(PaymentMethod paymentMethod) {
        boolean z;
        String str;
        String str2;
        String str3;
        PaymentInstallmentPlan paymentInstallmentPlanLJFF;
        InstallmentPlan installmentPlanRR2 = rR2(paymentMethod, "get installment plan for anchor payment method");
        List<ElementDTO> listLJJIII = paymentMethod.LJJIII();
        String str4 = null;
        if (listLJJIII != null && C13LP.LJJJLL(listLJJIII) != null) {
            z = false;
        } else {
            z = true;
        }
        String str5 = paymentMethod.id;
        String str6 = paymentMethod.token;
        if (installmentPlanRR2 != null) {
            str = installmentPlanRR2.tenure;
            str2 = installmentPlanRR2.id;
            str3 = installmentPlanRR2.installmentOptionId;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (installmentPlanRR2 != null) {
            paymentInstallmentPlanLJFF = installmentPlanRR2.LJFF();
        } else {
            paymentInstallmentPlanLJFF = null;
        }
        if (installmentPlanRR2 != null) {
            str4 = installmentPlanRR2.tenureCycle;
        }
        return new PaymentInfo(null, null, null, Boolean.valueOf(z), null, null, null, paymentMethod, new PaymentMethodInfo(str5, str6, null, null, str, str2, str3, null, null, null, null, null, paymentInstallmentPlanLJFF, null, str4, null, null), new LinkedHashMap(), null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEcUSRetryCashierUpdatePaymentInfoEvent(C836603Oq c836603Oq) {
        EnterParams enterParams = this.LLJ;
        if (enterParams != null && enterParams.LIZLLL()) {
            setState(new AwS367S0200000_1(this, c836603Oq, 82));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPaymentPricingDataUpdateEvent(C03OC c03oc) throws JSONException {
        String strLJJI;
        PaymentMethodsData paymentMethodsData = this.LLJJIJIL;
        if (paymentMethodsData == null || c03oc.LIZ == paymentMethodsData) {
            return;
        }
        C03Q4 c03q4 = C03Q4.LIZ;
        List<PaymentMethod> list = c03oc.LIZIZ;
        PaymentMethod paymentMethod = c03oc.LIZJ;
        boolean z = c03oc.LIZLLL;
        PaymentMethodsData paymentMethodsData2 = c03oc.LJFF;
        c03q4.getClass();
        C03Q4.LJJII(paymentMethodsData, list, paymentMethod, z, "payment_vm_onPaymentPricingDataUpdateEvent", paymentMethodsData2);
        C03OI c03oi = C03OI.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "PaymentPricingResultEvent");
        jSONObject.put("second_pay", c03oc.LJ);
        jSONObject.put("newCardScene", c03oc.LIZLLL);
        PaymentMethod paymentMethod2 = c03oc.LIZJ;
        if (paymentMethod2 != null) {
            strLJJI = paymentMethod2.LJJI();
        } else {
            strLJJI = null;
        }
        jSONObject.put("current_pm_id_token", strLJJI);
        c03oi.getClass();
        C03OI.LJI("payment_vm_onPaymentPricingDataUpdateEvent", jSONObject);
        C1440005kM.LIZ(new C03OD(true, c03oc.LJ, c03oc.LIZJ, c03oc.LIZLLL, null, null, 48));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPaymentPricingResultEvent(C03OD c03od) {
        if (c03od.LIZLLL) {
            return;
        }
        withState(new AwS367S0200000_1(c03od, this, 83));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPaymentPricingSecondPayEvent(C862203Ym c862203Ym) {
        List<String> list;
        String str;
        String value;
        EnterParams enterParams = this.LLJ;
        if (enterParams != null && enterParams.LJJIFFI) {
            return;
        }
        C03Q4 c03q4 = C03Q4.LIZ;
        PaymentMethod paymentMethod = c862203Ym.LIZ;
        PaymentMethodsData paymentMethodsData = this.LLJJIJIL;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        EnterParams enterParams2 = this.LLJ;
        String str2 = null;
        if (enterParams2 != null) {
            str2 = enterParams2.LJIJJLI;
            list = enterParams2.LJIL;
            str = enterParams2.LJJ;
        } else {
            list = null;
            str = null;
        }
        boolean z = c862203Ym.LIZIZ;
        boolean z2 = c862203Ym.LIZJ;
        if (z2) {
            value = C03OW.SECOND_PAY_ADD_NEW_CARD.getValue();
        } else {
            value = C03OW.SECOND_PAY_CHECKED_PAYMENT.getValue();
        }
        C03Q4.LIZJ(c03q4, paymentMethod, paymentMethodsData, viewModelScope, str2, list, str, z, z2, value, 64);
    }

    public final PaymentInfo qR2(String str) {
        new C259800zU();
        PaymentState paymentStateFQ2 = FQ2();
        PaymentCacheHelper.LIZ.getClass();
        PaymentInfo paymentInfoLJII = PaymentCacheHelper.LJII(str);
        if (paymentInfoLJII != null) {
            paymentInfoLJII.LIZ = paymentStateFQ2.getCheckedCreditMethod();
            return paymentInfoLJII;
        }
        return new PaymentInfo(null, null, null, null, null, null, paymentStateFQ2.getCheckedCreditMethod(), null, null, new LinkedHashMap(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (X.C03SY.LJIJI(r1) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip vR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.vR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean xR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r9) {
        /*
            r8 = this;
            X.004I r0 = r8.FQ2()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r0.getCheckedCreditMethod()
            r4 = 1
            r0 = 0
            if (r1 == 0) goto L12
            r7 = 1
        Lf:
            if (r9 != 0) goto L14
            return r0
        L12:
            r7 = 0
            goto Lf
        L14:
            java.lang.String r5 = r9.id
            java.lang.String r6 = ""
            if (r5 != 0) goto L1b
            r5 = r6
        L1b:
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel> r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel.class
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel r1 = X.C846203Si.LIZ
            java.lang.String r0 = "pipo_ecom_store_payment_methods"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomStorePaymentMethodsModel) r0
            if (r0 == 0) goto L2e
            r1 = r0
        L2e:
            java.util.List<java.lang.String> r0 = r1.paymentMethodId
            boolean r5 = r0.contains(r5)
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r9.subPaymentMethods
            if (r0 == 0) goto L77
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L77
            r3 = 1
        L41:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy r1 = r9.unfoldStrategy
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE
            if (r1 != r0) goto L75
            r2 = 1
        L48:
            if (r7 == 0) goto L63
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.LLJZ
            java.lang.String r0 = r9.id
            if (r0 == 0) goto L51
            r6 = r0
        L51:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r6)
            if (r0 == 0) goto L73
        L59:
            r0 = 1
        L5a:
            if (r5 == 0) goto L79
            if (r3 == 0) goto L79
            if (r2 == 0) goto L79
            if (r0 != 0) goto L79
            return r4
        L63:
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.LLJLLL
            java.lang.String r0 = r9.id
            if (r0 == 0) goto L6a
            r6 = r0
        L6a:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r6)
            if (r0 == 0) goto L73
            goto L59
        L73:
            r0 = 0
            goto L5a
        L75:
            r2 = 0
            goto L48
        L77:
            r3 = 0
            goto L41
        L79:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.xR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):boolean");
    }

    public final String yR2(String str) {
        if (FQ2().getCheckedCreditMethod() != null) {
            return (String) ((LinkedHashMap) this.LLJZ).get(str);
        }
        return (String) ((LinkedHashMap) this.LLJLLL).get(str);
    }

    public static void PR2(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod) {
        paymentViewModel.getClass();
        paymentViewModel.setState(new AwS56S0210000_1(paymentMethod, paymentViewModel, false, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List kR2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.kR2(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, java.util.List):java.util.List");
    }

    public static int sR2(PaymentMethod paymentMethod, List list) {
        Object next;
        C03ZA c03za;
        Iterator it2 = list.iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            if ((next instanceof C03ZA) && C899503fN.LIZIZ(((C03ZA) next).LIZ, paymentMethod)) {
                break;
            }
        }
        if (!(next instanceof C03ZA) || (c03za = (C03ZA) next) == null) {
            return 0;
        }
        return c03za.LIZJ;
    }

    public final void AR2(Context context, PaymentMethod paymentMethod) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo] */
    public final void NR2(PaymentMethod paymentMethod, Function1<? super PaymentMethod, Unit> function1) {
        String str;
        String str2;
        String str3;
        boolean z;
        PaymentListRequest paymentListRequest;
        setState(AFwS228S0000000_1.get$arr$(160));
        C259800zU c259800zU = new C259800zU();
        PaymentState paymentStateFQ2 = FQ2();
        InstallmentPlan installmentPlanRR2 = rR2(paymentMethod, "updateInstallmentPlan");
        PaymentMethod checkedCreditMethod = paymentStateFQ2.getCheckedCreditMethod();
        PaymentMethod checkedPaymentMethod = paymentStateFQ2.getCheckedPaymentMethod();
        PaymentMethodsData paymentMethodsData = null;
        if (installmentPlanRR2 != null) {
            str = installmentPlanRR2.tenure;
            str2 = installmentPlanRR2.installmentOptionId;
            str3 = installmentPlanRR2.id;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        ?? paymentInfo = new PaymentInfo(new PaymentMethodInfo(paymentMethod.id, paymentMethod.LJIIJ(), null, null, str, str3, str2, null, null, null, null, null, null, null, null, null, null), checkedPaymentMethod, null, Boolean.TRUE, null, null, checkedCreditMethod, null, null, new LinkedHashMap(), null);
        c259800zU.element = paymentInfo;
        AnonymousClass0369 anonymousClass0369 = FinancingDetails.Companion;
        EnterParams enterParams = this.LLJ;
        if (enterParams != null) {
            paymentMethodsData = enterParams.paymentData;
        }
        anonymousClass0369.getClass();
        FinancingDetails financingDetailsLIZ = AnonymousClass0369.LIZ(paymentMethod, paymentInfo, paymentMethodsData);
        PaymentInfo paymentInfo2 = (PaymentInfo) c259800zU.element;
        if (paymentInfo2 != null && paymentInfo2.LJI()) {
            z = true;
        } else {
            z = false;
        }
        EnterParams enterParams2 = this.LLJ;
        if (enterParams2 != null) {
            BillInfoRequest billInfoRequest = enterParams2.LJIIZILJ;
            if (billInfoRequest != null) {
                billInfoRequest.setFinancingDetails(financingDetailsLIZ);
                C948503nH.LJFF(this, C23271099x.INSTANCE, new C03SO(this, billInfoRequest, function1, paymentMethod, c259800zU, z, null));
            } else {
                if (enterParams2 == null || (paymentListRequest = enterParams2.LJIJ) == null) {
                    return;
                }
                C948503nH.LJFF(this, C23271099x.INSTANCE, new C03SN(paymentListRequest, financingDetailsLIZ, this, function1, z, paymentMethod, null));
            }
        }
    }

    public final boolean hR2(Context context, PaymentState paymentState) {
        String string;
        String string2;
        String string3;
        PaymentMethod checkedAnchorPaymentMethod = paymentState.getCheckedAnchorPaymentMethod();
        String str = "";
        if (checkedAnchorPaymentMethod != null && checkedAnchorPaymentMethod.installmentInfo != null && rR2(checkedAnchorPaymentMethod, "get installment plan for anchor payment method") == null) {
            if (context != null && (string3 = context.getString(2131840158)) != null) {
                str = string3;
            }
            setState(new AwS52S1000000_1(str, 6));
            return false;
        }
        if (paymentState.getCheckedPaymentMethod() == null) {
            if (context != null && (string2 = context.getString(2131840157)) != null) {
                str = string2;
            }
            setState(new AwS52S1000000_1(str, 7));
            C03WD.LJ("second_payment_method_not_selected", null, null, null, null, "split_payment", null, 94);
            return false;
        }
        if (paymentState.getCheckedPaymentMethod().installmentInfo != null && rR2(paymentState.getCheckedPaymentMethod(), "get installment plan for second payment method") == null) {
            ActivateHelper activateHelper = ActivateHelper.LIZ;
            PaymentMethodsData paymentMethodsData = this.LLJJIJIL;
            PaymentMethod checkedPaymentMethod = paymentState.getCheckedPaymentMethod();
            activateHelper.getClass();
            if (ActivateHelper.LJFF(checkedPaymentMethod, paymentMethodsData)) {
                if (context != null) {
                    PaymentMethod checkedPaymentMethod2 = paymentState.getCheckedPaymentMethod();
                    String str2 = this.LLJJJ;
                    HashMap<String, Object> map = this.LLJJIJIIJIL;
                    activateHelper.getClass();
                    ActivateHelper.LIZ(context, checkedPaymentMethod2, str2, map, null, null, null, null);
                }
                return false;
            }
            if (context != null && (string = context.getString(2131840158)) != null) {
                str = string;
            }
            setState(new AwS52S1000000_1(str, 8));
            return false;
        }
        return true;
    }

    public final void iR2(PaymentInfo paymentInfo, PaymentMethod paymentMethod) {
        String str;
        String str2;
        List<PaymentElement> list;
        List<ElementDTO> listLJFF;
        PaymentElement next;
        PaymentElement next2;
        PaymentElement next3;
        PaymentElement paymentElementCopy;
        if (paymentMethod == null) {
            return;
        }
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null && (list = paymentMethodInfo.paymentElements) != null && !list.isEmpty()) {
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            if (paymentMethod2 != null) {
                listLJFF = paymentMethod2.LJFF();
            } else {
                listLJFF = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (listLJFF != null) {
                for (ElementDTO elementDTO : listLJFF) {
                    String str3 = elementDTO.id;
                    if (str3 != null) {
                        List<ElementDTO> listLIZJ = elementDTO.LIZJ();
                        ArrayList arrayList = new ArrayList();
                        for (ElementDTO elementDTO2 : listLIZJ) {
                            List<PaymentElement> list2 = paymentMethodInfo.paymentElements;
                            if (list2 != null) {
                                Iterator<PaymentElement> it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next3 = it2.next();
                                        if (Intrinsics.LJFF(elementDTO2.id, next3.element)) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                PaymentElement paymentElement = next3;
                                if (paymentElement != null && (paymentElementCopy = paymentElement.copy(paymentElement.element, paymentElement.paramName, paymentElement.paramValue, paymentElement.needEncryption, paymentElement.isEncrypted)) != null) {
                                    arrayList.add(paymentElementCopy);
                                }
                            }
                        }
                        linkedHashMap.put(str3, arrayList);
                    }
                }
            }
            linkedHashMap.put("save_element", Collections.singletonList(new PaymentElement("save_element", "save_element", String.valueOf(Intrinsics.LJFF(paymentMethodInfo.isChooseSave(), Boolean.TRUE)), null, Boolean.FALSE)));
            List<PaymentElement> list3 = paymentMethodInfo.paymentElements;
            if (list3 != null) {
                Iterator<PaymentElement> it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF("sub_payment_id_element", next.element)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
            } else {
                next = null;
            }
            List<PaymentElement> list4 = paymentMethodInfo.paymentElements;
            if (list4 != null) {
                Iterator<PaymentElement> it4 = list4.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (Intrinsics.LJFF("sub_payment_token_element", next2.element)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
            } else {
                next2 = null;
            }
            if (next != null && next2 != null) {
                linkedHashMap.put("sub_payment_type_element", C1697810uHb.LJIIJJI(next, next2));
            }
            this.LLJILLL.put(paymentMethod.LJIIJ(), linkedHashMap);
        }
        if (paymentMethod.LJJJJZ(paymentInfo.paymentMethod) && paymentMethod.unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_SEPARATE) {
            PaymentElement[] paymentElementArr = new PaymentElement[2];
            PaymentMethod paymentMethod3 = paymentInfo.paymentMethod;
            String str4 = "";
            if (paymentMethod3 == null || (str = paymentMethod3.id) == null) {
                str = "";
            }
            paymentElementArr[0] = new PaymentElement("sub_payment_id_element", "sub_payment_id_element", str, null, Boolean.FALSE);
            PaymentMethod paymentMethod4 = paymentInfo.paymentMethod;
            if (paymentMethod4 != null && (str2 = paymentMethod4.token) != null) {
                str4 = str2;
            }
            paymentElementArr[1] = new PaymentElement("sub_payment_token_element", "sub_payment_token_element", str4, null, Boolean.FALSE);
            UR2(paymentMethod, "sub_payment_type_element", C1697810uHb.LJIIJJI(paymentElementArr));
        }
    }

    public final void lR2(PaymentMethod paymentMethod, Function1<? super String, Unit> function1) {
        String str;
        if (paymentMethod == null) {
            return;
        }
        BindInfoItem bindInfoItem = (BindInfoItem) ((LinkedHashMap) this.LLJJIJI).get(paymentMethod.id);
        if (bindInfoItem != null) {
            str = bindInfoItem.paymentMethodBindUrl;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            if (function1 != null) {
                function1.invoke(str);
            }
        } else {
            setState(AFwS228S0000000_1.get$arr$(164));
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C03SM(paymentMethod, this, false, function1, null), 2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        PaymentMethodsData paymentMethodsData;
        EnumC880203cG enumC880203cG;
        Type type;
        PaymentBindHelper.VenmoBindResult venmoBindResult;
        Type type2;
        PaymentMethodsData paymentMethodsData2 = null;
        switch (str.hashCode()) {
            case -1413704395:
                if (str.equals("ec_resend_pay_request")) {
                    setState(AFwS228S0000000_1.get$arr$(169));
                }
                break;
            case -1342066716:
                if (str.equals("ec_payment_page_refresh_data") && !C03WK.LIZ(this.LLJ)) {
                    ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str2);
                    if (concurrentHashMapLIZ != null && (obj = concurrentHashMapLIZ.get("payment_change_reason")) != null && (obj instanceof Integer)) {
                        ChangeInfo changeInfo = new ChangeInfo(((Number) obj).intValue(), null, null, null);
                        setState(AFwS228S0000000_1.get$arr$(254));
                        C948503nH.LJFF(this, C0PEM.LIZJ, new C863203Yw(this, changeInfo, null));
                    } else {
                        LR2(this);
                    }
                    break;
                }
                break;
            case -1149798335:
                if (str.equals("ec_payment_continue") && C03WK.LIZ(this.LLJ)) {
                    setState(AFwS228S0000000_1.get$arr$(171));
                    break;
                }
                break;
            case 224216956:
                if (str.equals("ec_payment_update_cached_card_info") && (C03XU.LIZIZ().updateCacheInfo & 2) != 0) {
                    PaymentState paymentStateFQ2 = FQ2();
                    PaymentInfo paymentInfo = new PaymentInfo(null, paymentStateFQ2.getCheckedPaymentMethod(), null, null, null, null, paymentStateFQ2.getCheckedCreditMethod(), paymentStateFQ2.getCheckedAnchorPaymentMethod(), null, new LinkedHashMap(), null);
                    PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
                    EnterParams enterParams = this.LLJ;
                    if (enterParams != null) {
                        paymentMethodsData = enterParams.paymentData;
                    } else {
                        paymentMethodsData = null;
                    }
                    boolean zLIZ = C03WK.LIZ(enterParams);
                    paymentCacheHelper.getClass();
                    PaymentCacheHelper.LJIILJJIL(paymentInfo, paymentMethodsData, false, zLIZ);
                    EnterParams enterParams2 = this.LLJ;
                    if (enterParams2 != null) {
                        paymentMethodsData2 = enterParams2.paymentData;
                    }
                    PaymentCacheHelper.LJIILIIL(paymentMethodsData2, paymentInfo, C03WK.LIZ(enterParams2));
                    setState(AFwS228S0000000_1.get$arr$(243));
                    break;
                }
                break;
            case 308294106:
                if (str.equals("ec_payment_sns_bind_refresh")) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EC_PAYMENT_SNS_BIND_REFRESH, result ");
                    sbLIZ.append(str2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LJ(strLIZIZ);
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(PaymentBindHelper.VenmoBindResult.class));
                        } else {
                            type = new TypeToken<PaymentBindHelper.VenmoBindResult>() { // from class: X.03Yp
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                        if (!(objFromJson instanceof PaymentBindHelper.VenmoBindResult)) {
                            objFromJson = null;
                        }
                        venmoBindResult = (PaymentBindHelper.VenmoBindResult) objFromJson;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (venmoBindResult == null || !venmoBindResult.bindResult) {
                        enumC880203cG = EnumC880203cG.SYSTEM_ERROR;
                    } else {
                        enumC880203cG = EnumC880203cG.SUCCESS;
                    }
                    setState(new AwS580S0100000_1(enumC880203cG, 132));
                }
                break;
            case 935586949:
                if (str.equals("ec_payment_refresh_cashier")) {
                    this.LLLFFI = true;
                }
                break;
            case 1256753137:
                if (str.equals("ec_order_result_received")) {
                    try {
                        Gson gsonLJFF2 = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                            type2 = C2371409Qy.LIZJ(C13LE.LJII(PaymentResultReceivedEvent.class));
                        } else {
                            type2 = new TypeToken<PaymentResultReceivedEvent>() { // from class: X.03Yo
                            }.getType();
                        }
                        Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                        if (!(objFromJson2 instanceof PaymentResultReceivedEvent)) {
                            objFromJson2 = null;
                        }
                        PaymentResultReceivedEvent paymentResultReceivedEvent = (PaymentResultReceivedEvent) objFromJson2;
                        if (paymentResultReceivedEvent != null && paymentResultReceivedEvent.hideLoading) {
                            setState(AFwS228S0000000_1.get$arr$(170));
                            break;
                        }
                    } catch (s e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                }
                break;
        }
    }

    public final List<PaymentElement> pR2(PaymentMethod paymentMethod, String str) {
        Map linkedHashMap = (Map) ((LinkedHashMap) this.LLJILLL).get(paymentMethod.LJIIJ());
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        List<PaymentElement> list = (List) linkedHashMap.get(str);
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public final InstallmentPlan rR2(PaymentMethod paymentMethod, String str) {
        EnterParams enterParams;
        PaymentMethodsData paymentMethodsData;
        CciCashierDisplayType cciCashierDisplayType;
        PaymentMethodsData paymentMethodsData2;
        if (paymentMethod == null) {
            return null;
        }
        if (EcPaymentCreditAddCciConfigSettings.LIZ().disableUseCciInstallmentInCombinationState) {
            C03SY.LIZ.getClass();
            if (C03SY.LJIJJ(paymentMethod) && (enterParams = this.LLJ) != null && (paymentMethodsData = enterParams.paymentData) != null && paymentMethodsData.creditInfo != null) {
                if (enterParams != null && (paymentMethodsData2 = enterParams.paymentData) != null) {
                    cciCashierDisplayType = paymentMethodsData2.cciCashierDisplayType;
                } else {
                    cciCashierDisplayType = null;
                }
                if (cciCashierDisplayType == CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE && FQ2().getCheckedCreditMethod() != null) {
                    C03SE c03se = C03PI.LJIJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("disable installment at credit state ");
                    sbLIZ.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c03se.getClass();
                    C03SE.LJJII(paymentMethod, null, strLIZIZ);
                    return null;
                }
            }
        }
        InstallmentPlan installmentPlan = (InstallmentPlan) ((LinkedHashMap) this.LLJJ).get(paymentMethod.LJIIJ());
        C03SE c03se2 = C03PI.LJIJI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("read at ");
        sbLIZ2.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c03se2.getClass();
        C03SE.LJJII(paymentMethod, installmentPlan, strLIZIZ2);
        return installmentPlan;
    }

    public static void TR2(PaymentViewModel paymentViewModel, String str, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        paymentViewModel.LLJLIL = null;
        paymentViewModel.LLJLL = null;
        paymentViewModel.setState(new AwS11S2000000_1(str, null, 1));
    }

    public final void BR2(PaymentMethod paymentMethod, String str, boolean z) {
        if (!pR2(paymentMethod, str).isEmpty()) {
            return;
        }
        UR2(paymentMethod, str, Collections.singletonList(new PaymentElement("need_save", null, String.valueOf(z), null, Boolean.FALSE)));
    }

    public final void JR2(Context context, PaymentMethod paymentMethod, InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit> interfaceC1631620sYq) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        PaymentMethodsData paymentMethodsData;
        PaymentInfo paymentInfoJR2 = jR2(paymentMethod);
        if (C862803Ys.LIZ().anchorXDefault) {
            EnterParams enterParams = this.LLJ;
            if (enterParams != null) {
                paymentMethodsData = enterParams.paymentData;
            } else {
                paymentMethodsData = null;
            }
            paymentInfoJR2 = C03S8.LJ(paymentInfoJR2, paymentMethodsData);
        }
        EnterParams enterParams2 = this.LLJ;
        if (enterParams2 != null) {
            EnterParams enterParams3 = new EnterParams(enterParams2.currentProgress, enterParams2.totalProgress, enterParams2.buttonType, enterParams2.paymentData, enterParams2.price, enterParams2.LIZ, paymentInfoJR2, enterParams2.trackParams, enterParams2.paymentPrice, enterParams2.defaultSummary, enterParams2.shippingAddress, enterParams2.totalPriceVal, enterParams2.currency, enterParams2.paySource, enterParams2.apiDuration, enterParams2.bizType, enterParams2.retentionDialogInfo, enterParams2.LIZIZ, enterParams2.LIZJ, enterParams2.LIZLLL, enterParams2.LJ, enterParams2.LJFF, enterParams2.LJI, enterParams2.LJII, enterParams2.LJIIIIZZ, enterParams2.LJIIIZ, enterParams2.LJIIJ, enterParams2.LJIIJJI, enterParams2.LJIIL, enterParams2.LJIILIIL, enterParams2.LJIILJJIL, enterParams2.LJIILL, enterParams2.LJIILLIIL, enterParams2.LJIIZILJ, enterParams2.LJIJ, enterParams2.LJIJI, enterParams2.LJIJJ, enterParams2.LJIJJLI, enterParams2.LJIL, enterParams2.LJJ, enterParams2.LJJI, enterParams2.LJJIFFI, enterParams2.LJJII, C03YJ.LIZIZ(paymentInfoJR2), enterParams2.LJJIIJ, enterParams2.LJJIIJZLJL, enterParams2.LJJIIZ, enterParams2.LJJIIZI, enterParams2.LJJIJ, enterParams2.isInBiddingProcess);
            enterParams3.LJJIJIIJI = EnumC837803Pc.ANCHOR_COMBINE_PAYMENT;
            if (C03XU.LIZIZ().enableNewContainer) {
                if (context != null) {
                    String str = PaymentCheckoutFragment._pnsPageId;
                    C924503jP.LIZ(context, enterParams3, null, new C1077704Jj(interfaceC1631620sYq, (InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit>) 0), null, 236);
                    return;
                }
                return;
            }
            PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
            paymentHalfFragment.LLJIJIL = enterParams3;
            paymentHalfFragment.LLJILJIL = new AwS471S0200000_1((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit>) paymentHalfFragment, (PaymentHalfFragment) 8);
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                paymentHalfFragment.show(supportFragmentManager, "combine_payment_fragment");
            }
        }
    }

    public final void UR2(PaymentMethod paymentMethod, String str, List<PaymentElement> list) {
        Map<String, List<PaymentElement>> linkedHashMap = (Map) ((LinkedHashMap) this.LLJILLL).get(paymentMethod.LJIIJ());
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.LLJILLL.put(paymentMethod.LJIIJ(), linkedHashMap);
        linkedHashMap.put(str, list);
    }

    public final void VR2(PaymentMethod paymentMethod, InstallmentPlan installmentPlan, boolean z) {
        boolean z2;
        C03PI.LJIJI.getClass();
        C03SE.LJJII(paymentMethod, installmentPlan, "update");
        if (C03YI.LJIIJ() && paymentMethod.LJJJI() && C03Q4.LJJ(C03Q4.LIZ, paymentMethod)) {
            z2 = true;
            paymentMethod.LJIJJ = installmentPlan;
        } else {
            z2 = false;
        }
        this.LLJJ.put(paymentMethod.LJIIJ(), installmentPlan);
        SR2();
        if (!z) {
            setState(AFwS228S0000000_1.get$arr$(163));
        } else {
            setState(new AwS16S0010000_1(z2, 1));
        }
    }

    public final Map<String, String> XR2(C03Z0 c03z0, PaymentMethod paymentMethod, List<PaymentElement> list) {
        PaymentElement next;
        PaymentElement next2;
        String str;
        ElementDTO elementDTO = c03z0.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ElementDTO> list2 = elementDTO.subElementDTOList;
        if (list2 != null) {
            for (ElementDTO elementDTO2 : list2) {
                String str2 = elementDTO2.id;
                if (str2 != null) {
                    String strLJJLIIIJ = null;
                    if (Intrinsics.LJFF(str2, "eg_ccdc_global_billing_address")) {
                        List<ElementDTO> listLIZJ = elementDTO2.LIZJ();
                        ArrayList arrayList = new ArrayList();
                        for (ElementDTO elementDTO3 : listLIZJ) {
                            Iterator<PaymentElement> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    if (Intrinsics.LJFF(next2.element, elementDTO3.id)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            PaymentElement paymentElement = next2;
                            if (paymentElement != null) {
                                str = paymentElement.paramValue;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, AFwS228S0000000_1.get$arr$(248), 30);
                    } else {
                        Iterator<PaymentElement> it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(next.element, elementDTO2.id)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        PaymentElement paymentElement2 = next;
                        if (paymentElement2 != null) {
                            strLJJLIIIJ = paymentElement2.paramValue;
                        }
                    }
                    try {
                        C922003j0 c922003j0LJI = C932203ke.LIZ.LJI(Boolean.valueOf(C03S8.LIZJ(paymentMethod.id)), paymentMethod.id, elementDTO2.id, strLJJLIIIJ);
                        if (!c922003j0LJI.LIZ) {
                            String str3 = elementDTO2.id;
                            if (str3 == null) {
                                str3 = "";
                            }
                            String strLIZ = c922003j0LJI.LIZ();
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                            linkedHashMap.put(str3, strLIZ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                        String str4 = elementDTO2.id;
                        if (str4 == null) {
                            str4 = "";
                        }
                        linkedHashMap.put(str4, "system_error");
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        boolean z = false;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), "system_error")) {
                linkedHashMap2.put(entry.getKey(), "");
                z = true;
            }
        }
        if (z) {
            setState(AFwS228S0000000_1.get$arr$(166));
        }
        return linkedHashMap2;
    }

    public final String YR2(C862703Yr c862703Yr, PaymentMethod paymentMethod, List<PaymentElement> list) {
        String strLIZIZ = C888803de.LIZIZ(c862703Yr.LIZ, paymentMethod, list, this.LLJJIJIL);
        if (Intrinsics.LJFF(strLIZIZ, "system_error")) {
            setState(AFwS228S0000000_1.get$arr$(168));
            return "";
        }
        return strLIZIZ;
    }

    public final boolean mR2(PaymentMethod paymentMethod, PaymentInfo paymentInfo, String str) {
        PaymentMethodInfo paymentMethodInfo;
        Boolean boolIsChooseSave;
        String str2;
        PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLZIJ(0, pR2(paymentMethod, str));
        if (paymentElement != null && (str2 = paymentElement.paramValue) != null) {
            return Boolean.parseBoolean(str2);
        }
        Boolean bool = paymentMethod.LJIIJJI;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (paymentInfo != null && C899503fN.LIZIZ(paymentMethod, paymentInfo.paymentMethod) && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && (boolIsChooseSave = paymentMethodInfo.isChooseSave()) != null) {
            return boolIsChooseSave.booleanValue();
        }
        Boolean bool2 = paymentMethod.defaultSave;
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }

    public final String uR2(String str, boolean z, List<String> list) {
        Summary summary;
        String str2;
        Summary summaryZR2 = zR2(str, z, list);
        if (summaryZR2 == null || (str2 = summaryZR2.desc) == null) {
            EnterParams enterParams = this.LLJ;
            if (enterParams != null && enterParams.LIZLLL() && (summary = this.LLIZLLLIL) != null) {
                return summary.desc;
            }
            return null;
        }
        return str2;
    }

    public final Summary zR2(String str, boolean z, List<String> list) {
        PaymentPrice next;
        List<PaymentPrice> list2;
        PaymentPrice next2;
        PaymentPrice next3;
        List<PaymentPrice> list3;
        PaymentPrice next4;
        Summary summary;
        boolean zLJFF;
        PaymentPrice next5;
        Set setLLIIJI;
        if (!z) {
            return null;
        }
        if (list != null && (!list.isEmpty())) {
            List<PaymentPrice> list4 = this.LLIZ;
            if (list4 == null) {
                return null;
            }
            Iterator<PaymentPrice> it2 = list4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next5 = it2.next();
                    PaymentPrice paymentPrice = next5;
                    if (paymentPrice.paymentBillSummaryType == PaymentBillSummaryType.COMBINATION) {
                        Set setLLIIJI2 = C13LP.LLIIJI(list);
                        List<String> list5 = paymentPrice.combinationPaymentMethodsCodes;
                        if (list5 != null) {
                            setLLIIJI = C13LP.LLIIJI(list5);
                        } else {
                            setLLIIJI = null;
                        }
                        if (Intrinsics.LJFF(setLLIIJI2, setLLIIJI)) {
                            break;
                        }
                    }
                } else {
                    next5 = null;
                    break;
                }
            }
            PaymentPrice paymentPrice2 = next5;
            if (paymentPrice2 == null) {
                return null;
            }
            return paymentPrice2.paymentSummary;
        }
        if (EcPaymentIndependentPriceConfigSettings.LIZIZ()) {
            PaymentMethodsData paymentMethodsData = this.LLJJIJIL;
            if (paymentMethodsData != null) {
                list2 = paymentMethodsData.LJ;
            } else {
                list2 = null;
            }
            if (C756302xN.LIZ(list2) && C770702zh.LIZ(str)) {
                if (a0.LJJIIZI(str, EcPaymentIndependentPriceDefaultConfig.LIZLLL(), false)) {
                    C03Q4 c03q4 = C03Q4.LIZ;
                    PaymentMethodsData paymentMethodsData2 = this.LLJJIJIL;
                    c03q4.getClass();
                    boolean zLJIIIZ = C03Q4.LJIIIZ(paymentMethodsData2);
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{EcPaymentIndependentPriceDefaultConfig.LIZLLL()}, 0, 6);
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                    C03OI c03oi = C03OI.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parts: ");
                    sbLIZ.append(listLJJLIIIJILLIZJL);
                    sbLIZ.append(", new flow: ");
                    sbLIZ.append(zLJIIIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c03oi.getClass();
                    C03OI.LJFF("payment_vm_getSummaryByPaymentMethod_v1", strLIZIZ);
                    PaymentMethodsData paymentMethodsData3 = this.LLJJIJIL;
                    if (paymentMethodsData3 != null && (list3 = paymentMethodsData3.LJ) != null) {
                        Iterator<PaymentPrice> it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next4 = it3.next();
                                PaymentPrice paymentPrice3 = next4;
                                if (zLJIIIZ) {
                                    zLJFF = Intrinsics.LJFF(objLJJJLZIJ, paymentPrice3.paymentPriceVersionId);
                                } else {
                                    zLJFF = Intrinsics.LJFF(objLJJJLZIJ, paymentPrice3.paymentUnitId);
                                }
                                if (zLJFF) {
                                    break;
                                }
                            } else {
                                next4 = null;
                                break;
                            }
                        }
                        PaymentPrice paymentPrice4 = next4;
                        if (paymentPrice4 != null && (summary = paymentPrice4.paymentSummary) != null) {
                            return summary;
                        }
                    }
                    if (EcPaymentIndependentPriceConfigSettings.LIZ()) {
                        C03OI.LIZ.getClass();
                        C03OI.LJFF("payment_vm_getSummaryByPaymentMethod_v2", "fallback payment summary");
                        List<PaymentPrice> list6 = this.LLIZ;
                        if (list6 == null) {
                            return null;
                        }
                        Iterator<PaymentPrice> it4 = list6.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next3 = it4.next();
                                if (Intrinsics.LJFF(next3.paymentMethodId, objLJJJLZIJ2)) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        PaymentPrice paymentPrice5 = next3;
                        if (paymentPrice5 == null) {
                            return null;
                        }
                        return paymentPrice5.paymentSummary;
                    }
                    C03OI.LIZ.getClass();
                    C03OI.LJFF("payment_vm_getSummaryByPaymentMethod_v3", "fallback default summary");
                    return null;
                }
                C03OI.LIZ.getClass();
                C03OI.LJFF("payment_vm_getSummaryByPaymentMethod_v4", "use old matching logic");
                List<PaymentPrice> list7 = this.LLIZ;
                if (list7 == null) {
                    return null;
                }
                Iterator<PaymentPrice> it5 = list7.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        if (Intrinsics.LJFF(next2.paymentMethodId, str)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                PaymentPrice paymentPrice6 = next2;
                if (paymentPrice6 == null) {
                    return null;
                }
                return paymentPrice6.paymentSummary;
            }
        }
        List<PaymentPrice> list8 = this.LLIZ;
        if (list8 == null) {
            return null;
        }
        Iterator<PaymentPrice> it6 = list8.iterator();
        while (true) {
            if (it6.hasNext()) {
                next = it6.next();
                if (Intrinsics.LJFF(next.paymentMethodId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentPrice paymentPrice7 = next;
        if (paymentPrice7 == null) {
            return null;
        }
        return paymentPrice7.paymentSummary;
    }

    public static final void OR2(boolean z, Function1<? super PaymentMethod, Unit> function1, PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        PaymentMethod next;
        List<PaymentMethod> list;
        List<PaymentMethod> list2 = paymentMethodsData.storedMethods;
        PaymentMethod paymentMethod2 = null;
        if (list2 != null) {
            Iterator<PaymentMethod> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.id, paymentMethod.id)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
        } else {
            next = null;
        }
        CreditInfo creditInfo = paymentMethodsData.creditInfo;
        if (creditInfo != null && (list = creditInfo.storedMethods) != null) {
            Iterator<PaymentMethod> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                PaymentMethod next2 = it3.next();
                if (Intrinsics.LJFF(next2.id, paymentMethod.id)) {
                    paymentMethod2 = next2;
                    break;
                }
            }
        }
        if (z) {
            function1.invoke(paymentMethod2);
        } else {
            function1.invoke(next);
        }
    }

    public static void RR2(PaymentViewModel paymentViewModel, Context context, AwS650S0100000_1 awS650S0100000_1, int i) {
        boolean z;
        AwS650S0100000_1 awS650S0100000_12 = awS650S0100000_1;
        Context context2 = context;
        if ((i & 1) != 0) {
            context2 = null;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            awS650S0100000_12 = null;
        }
        paymentViewModel.getClass();
        paymentViewModel.setState(new AwS26S0310000_1(paymentViewModel, (PaymentViewModel) context2, (Context) awS650S0100000_12, (InterfaceC1631620sYq<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, Unit>) z, true));
    }

    public final void GR2(PaymentMethod paymentMethod, Context context, C03WH c03wh, HashMap<String, Object> map, String str) {
        String str2;
        PaymentMethodsData paymentMethodsData;
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        String str3 = this.LLJJJ;
        EnterParams enterParams = this.LLJ;
        if (enterParams != null && (paymentMethodsData = enterParams.paymentData) != null) {
            str2 = paymentMethodsData.saleRegion;
        } else {
            str2 = null;
        }
        C862303Yn c862303Yn = new C862303Yn(this);
        AwS100S0400000_1 awS100S0400000_1 = new AwS100S0400000_1(this, (PaymentViewModel) paymentMethod, (PaymentMethod) map, (HashMap<String, Object>) c03wh, (C03WH) 0);
        activateHelper.getClass();
        ActivateHelper.LJIIJJI(paymentMethod, map, str, context, str3, str2, "payment_method", c03wh, true, c862303Yn, awS100S0400000_1);
    }

    public final void KR2(Context context, PaymentMethod paymentMethod, FragmentManager fragmentManager, C927003jo c927003jo, EnumC865603Zu enumC865603Zu) {
        PaymentMethodsData paymentMethodsData;
        boolean z;
        n nVar;
        EnterParams enterParams = this.LLJ;
        if (enterParams != null) {
            paymentMethodsData = enterParams.paymentData;
        } else {
            paymentMethodsData = null;
        }
        if (FQ2().getCheckedCreditMethod() != null) {
            z = true;
        } else {
            z = false;
        }
        String str = paymentMethod.id;
        if (str == null) {
            str = "";
        }
        String strYR2 = yR2(str);
        Integer numValueOf = Integer.valueOf(EnumC882203ca.CONTINUE.ordinal());
        HashMap map = new HashMap();
        HashMap<String, Object> map2 = this.LLJJIJIIJIL;
        if (map2 != null) {
            map.putAll(map2);
        }
        Address address = this.LLILZLL;
        String str2 = this.LLJJJ;
        EnterParams enterParams2 = this.LLJ;
        if (enterParams2 != null) {
            nVar = enterParams2.LJFF;
        } else {
            nVar = null;
        }
        C926203jg.LIZ(C926203jg.LIZ, context, strYR2, false, paymentMethod, new EnterParams(null, null, numValueOf, paymentMethodsData, null, true, null, map, null, null, address, null, null, str2, null, null, null, null, null, null, false, nVar, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false), fragmentManager, c927003jo, enumC865603Zu, z, null, 512);
    }

    public final String tR2(String str, Summary summary, String str2, boolean z, List<String> list) {
        Price price;
        String priceStr;
        Price price2;
        String priceStr2;
        if (summary != null && (price2 = summary.total) != null && (priceStr2 = price2.getPriceStr()) != null) {
            str2 = priceStr2;
        }
        Summary summaryZR2 = zR2(str, z, list);
        if (summaryZR2 != null && (price = summaryZR2.total) != null && (priceStr = price.getPriceStr()) != null) {
            return priceStr;
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0021, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void IR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r61, java.lang.String r62, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r63, androidx.lifecycle.LifecycleOwner r64, boolean r65, boolean r66, int r67) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.IR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, androidx.lifecycle.LifecycleOwner, boolean, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void wR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r23, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r24, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r26, boolean r27, kotlin.jvm.functions.Function1 r28, int r29) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.wR2(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InterestFeePromotion, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, boolean, kotlin.jvm.functions.Function1, int):void");
    }
}
