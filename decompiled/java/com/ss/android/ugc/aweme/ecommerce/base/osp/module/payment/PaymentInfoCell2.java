package com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment;

import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C03QF;
import X.C03XA;
import X.C03ZB;
import X.C08CX;
import X.C098200Yq;
import X.C09R3;
import X.C0PEM;
import X.C1076804Ja;
import X.C1077804Jk;
import X.C123100dR;
import X.C12ES;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C13LP;
import X.C189200o6;
import X.C19719912Dl;
import X.C19MB;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C23250099c;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C7768031q;
import X.C786410Ut5;
import X.C813103Fp;
import X.C817503Hh;
import X.C834203Ns;
import X.C871103an;
import X.C883303cl;
import X.C928203k0;
import X.C960603pE;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.AComparatorS20S0000000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MethodPhotoWithId;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RetainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentInfoCell2 extends ECPowerCell<C7768031q> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public PaymentInfo LLJIJIL;
    public Boolean LLJILJIL;
    public C03ZB LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C1331730kl9 LLJJI;
    public final C19MB LLJJIII;
    public final LinkedList<C03ZB> LLJJIJI;
    public C03ZB LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PaymentInfoCell2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PaymentInfoCell2.class, "paymentInfoVM", "getPaymentInfoVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/payment/PaymentInfoViewModel;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final void R5() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        AnonymousClass0378.LIZ().LIZLLL("ec_osp_payment_module_shake", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_osp_fill_cvv_event", this);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.n_t);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        C736680Sv4.LJIIIIZZ(this, V5(), new C2217381BqS() { // from class: X.03Zy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJZIJLIL);
            }
        }, null, new AwS615S0100000_1(this, 27), 6);
        C736680Sv4.LJIIIIZZ(this, V5(), new C2217371BqR() { // from class: X.03as
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, null, new AwS615S0100000_1(this, 28), 6);
        OrderSubmitAssemViewModel orderSubmitAssemViewModelV5 = V5();
        selectSubscribe(orderSubmitAssemViewModelV5, new C2217371BqR() { // from class: X.03at
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, new C2217381BqS() { // from class: X.03Zz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.03a0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLLLLZ);
            }
        }, new C2217381BqS() { // from class: X.03SX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLLLZIL);
            }
        }, C736820SvI.LIZIZ(orderSubmitAssemViewModelV5.usedInReusedScene), null, new C1077804Jk(this, 0));
        OrderSubmitAssemViewModel orderSubmitAssemViewModelV52 = V5();
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = orderSubmitAssemViewModelV52.n;
        c928203k0.getClass();
        if (!C928203k0.LJIILJJIL(str)) {
            PaymentInfoViewModel paymentInfoViewModelT5 = T5();
            C883303cl.LIZIZ = false;
            C883303cl c883303cl = new C883303cl();
            if (paymentInfoViewModelT5.LLILLL == null) {
                paymentInfoViewModelT5.LLILLL = c883303cl;
            }
        }
    }

    public PaymentInfoCell2() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 342);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(82);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 333), awS545S0100000_1, AFwS207S0000000_19.get$arr$(126), new AwS545S0100000_1((C03K6) this, 326), new AwS545S0100000_1((C03K6) this, 334), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 336), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1136), null, new AwS545S0100000_1((C03K6) this, 339));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 322);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 324);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 327);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 51));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1131);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1133);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1134);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1135);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1137);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 340), awS545S0100000_1, AFwS207S0000000_19.get$arr$(131), new AwS545S0100000_1((C03K6) this, 305), new AwS545S0100000_1((C03K6) this, 306), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 307), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1127), null, new AwS545S0100000_1((C03K6) this, 308));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 309), awS545S0100000_1, AFwS207S0000000_19.get$arr$(127), new AwS545S0100000_1((C03K6) this, 311), new AwS545S0100000_1((C03K6) this, 312), new AwS545S0100000_1((C03K6) this, 315), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 317));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PaymentInfoViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 318);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(83);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 321), awS545S0100000_15, AFwS207S0000000_19.get$arr$(130), new AwS545S0100000_1((C03K6) this, 325), new AwS545S0100000_1((C03K6) this, 328), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 330), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1132), null, new AwS545S0100000_1((C03K6) this, 335));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 337);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 338);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 341);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 52));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1124);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1125);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1126);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1128);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1129);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 310), awS545S0100000_15, AFwS207S0000000_19.get$arr$(128), new AwS545S0100000_1((C03K6) this, 313), new AwS545S0100000_1((C03K6) this, 314), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 316), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1130), null, new AwS545S0100000_1((C03K6) this, 319));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 320), awS545S0100000_15, AFwS207S0000000_19.get$arr$(129), new AwS545S0100000_1((C03K6) this, 323), new AwS545S0100000_1((C03K6) this, 329), new AwS545S0100000_1((C03K6) this, 331), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 332));
        }
        this.LLJI = assemVMLazy2;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C679280Qkg.LIZ(2);
        this.LLJJI = new C1331730kl9(c1331750klB);
        this.LLJJIII = new C19MB();
        this.LLJJIJI = new LinkedList<>();
    }

    public final void L5() {
        PaymentMethod paymentMethod;
        C1076804Ja<View> c1076804Ja = new C1076804Ja((ViewGroup) this.itemView.findViewById(R.id.n_t), 6);
        ArrayList<C03ZB> arrayList = new ArrayList();
        for (View view : c1076804Ja) {
            if ((view instanceof C03ZB) && view != null) {
                arrayList.add(view);
            }
        }
        for (C03ZB c03zb : arrayList) {
            if (c03zb.LJII() && ((paymentMethod = c03zb.getPaymentMethod()) == null || !paymentMethod.LJJLI())) {
                c03zb.setChecked(false);
                c03zb.LIZ();
                c03zb.LIZJ();
            }
        }
    }

    public final PaymentInfoViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PaymentInfoViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentMethod U5() {
        PaymentInfo paymentInfo;
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData;
        List<RetainInfo> list;
        String str;
        C7768031q c7768031q;
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList;
        PaymentMethod next;
        String str2;
        PaymentInfo paymentInfo2 = this.LLJIJIL;
        if (!(paymentInfo2 != null && paymentInfo2.LJI()) && (((paymentInfo = this.LLJIJIL) == null || !paymentInfo.LIZIZ()) && (billInfoData = V5().LLJJI) != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (list = paymentMethodsData.retainInfos) != null)) {
            ArrayList arrayList = new ArrayList();
            for (RetainInfo retainInfo : list) {
                RetainInfo retainInfo2 = retainInfo;
                if (Intrinsics.LJFF(retainInfo2.scene, "switch_payment_method") && Intrinsics.LJFF(retainInfo2.type, "reverse_retain_with_discount")) {
                    arrayList.add(retainInfo);
                }
            }
            List<RetainInfo> listLJLLLL = C13LP.LJLLLL(new AComparatorS20S0000000_1(0), arrayList);
            if (listLJLLLL != null) {
                for (RetainInfo retainInfo3 : listLJLLLL) {
                    Map<String, String> map = retainInfo3.params;
                    if (map != null && (str = map.get("payment_method_id")) != null && (c7768031q = (C7768031q) getItem()) != null && (copyOnWriteArrayList = c7768031q.LLIZLLLIL) != null) {
                        Iterator<PaymentMethod> it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            PaymentMethod paymentMethod = next;
                            if (Intrinsics.LJFF(paymentMethod.id, str)) {
                                String str3 = paymentMethod.token;
                                String str4 = "";
                                if (str3 == null) {
                                    str3 = "";
                                }
                                Map<String, String> map2 = retainInfo3.params;
                                if (map2 != null && (str2 = map2.get("payment_method_token")) != null) {
                                    str4 = str2;
                                }
                                if (Intrinsics.LJFF(str3, str4)) {
                                    break;
                                }
                            }
                        }
                        PaymentMethod paymentMethod2 = next;
                        if (paymentMethod2 != null) {
                            return paymentMethod2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final OrderSubmitAssemViewModel V5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = V5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("payment_methods", this.itemView);
        }
        ModuleManager moduleManager2 = V5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "payment_methods");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b2 A[PHI: r0
      0x01b2: PHI (r0v14 java.lang.Integer) = (r0v13 java.lang.Integer), (r0v64 java.lang.Integer) binds: [B:9:0x0068, B:14:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5() {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2.P5():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        R5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_osp_payment_module_shake", this);
        AnonymousClass0378.LIZ().LIZJ("ec_osp_fill_cvv_event", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.03Fp] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public final void N5(List<PaymentMethod> list) {
        List<MethodPhotoWithId> list2;
        ?? arrayList;
        Object next;
        C03DZ.LIZ(this.itemView.findViewById(R.id.chw));
        T5();
        C7768031q c7768031q = (C7768031q) getItem();
        if (c7768031q != null) {
            list2 = c7768031q.LLJILJIL;
        } else {
            list2 = null;
        }
        C7768031q c7768031q2 = (C7768031q) getItem();
        if (c7768031q2 != null) {
            arrayList = c7768031q2.LLJIJIL;
        } else {
            arrayList = 0;
        }
        C08CX c08cx = C08CX.INSTANCE;
        if (!((ArrayList) list).isEmpty() && list2 != null && !list2.isEmpty()) {
            List listLIZ = C03QF.LIZ(list);
            ArrayList arrayList2 = new ArrayList();
            for (MethodPhotoWithId methodPhotoWithId : list2) {
                MethodPhotoWithId methodPhotoWithId2 = methodPhotoWithId;
                if (!C13LP.LJJJJ(methodPhotoWithId2.paymentMethodId, c08cx) && listLIZ != null) {
                    Iterator it2 = listLIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((PaymentMethod) next).id, methodPhotoWithId2.paymentMethodId)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    PaymentMethod paymentMethod = (PaymentMethod) next;
                    if (paymentMethod != null && paymentMethod.LIZ()) {
                        arrayList2.add(methodPhotoWithId);
                    }
                }
            }
            arrayList = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = ((MethodPhotoWithId) it3.next()).lightPhotos;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        C12ES.LJIILL(0, this.itemView.findViewById(R.id.h1r));
        ((C813103Fp) this.itemView.findViewById(R.id.h1r)).setIcons(arrayList);
        C786410Ut5.I7(new AjS60S0100000_1(this, 16), this.itemView.findViewById(R.id.h1r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int S5(Integer num) {
        C7768031q c7768031q = (C7768031q) getItem();
        if (c7768031q != null && Intrinsics.LJFF(c7768031q.LLJJIJIL, Boolean.TRUE)) {
            return 1;
        }
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final void X5(PaymentMethod paymentMethod) {
        String str;
        String str2;
        BindInfo bindInfo;
        BindInfo bindInfo2 = paymentMethod.bindInfo;
        if (bindInfo2 != null) {
            str = bindInfo2.buttonText;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            BindInfo bindInfo3 = paymentMethod.bindInfo;
            if (bindInfo3 != null) {
                str2 = bindInfo3.schema;
            } else {
                str2 = null;
            }
            if ((str2 == null || str2.length() == 0) && (bindInfo = paymentMethod.bindInfo) != null && Intrinsics.LJFF(bindInfo.needPrefetchActivateUrl, Boolean.TRUE)) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModelV5 = V5();
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C834203Ns(paymentMethod, orderSubmitAssemViewModelV5, true, null, null), 2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0915 A[EDGE_INSN: B:443:0x0915->B:370:0x0915 BREAK  A[LOOP:6: B:347:0x0850->B:445:?]] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0187  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r42) {
        /*
            Method dump skipped, instruction units count: 2557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoCell2.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.b41, viewGroup, false);
        viewLIZJ.setTag("payment_info_cell_view");
        return viewLIZJ;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "ec_osp_payment_module_shake")) {
            try {
                View view = this.itemView;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.be);
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.q5t);
                if (constraintLayout != null) {
                    constraintLayout.startAnimation(animationLoadAnimation);
                }
                C189200o6.m2constructorimpl(view);
                obj = view;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LIZJ(thM5exceptionOrNullimpl.toString());
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "ec_osp_fill_cvv_event") && C871103an.LIZ()) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.ul_));
        }
    }

    public static void W5(PaymentInfoCell2 paymentInfoCell2, Context context, View view, boolean z, int i) {
        boolean z2 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        OrderSubmitAssemViewModel.JS2(paymentInfoCell2.V5(), context, C960603pE.LIZLLL(view), null, null, z2, null, false, 208);
    }
}
