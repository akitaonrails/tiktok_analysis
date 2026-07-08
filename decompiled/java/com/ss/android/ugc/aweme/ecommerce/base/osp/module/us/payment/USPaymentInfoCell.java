package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment;

import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C031A;
import X.C03DZ;
import X.C03G7;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03SP;
import X.C03XA;
import X.C03YY;
import X.C03ZC;
import X.C03ZE;
import X.C098200Yq;
import X.C09R3;
import X.C0H9H;
import X.C1076804Ja;
import X.C1077804Jk;
import X.C12ES;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1388190mED;
import X.C13LE;
import X.C1744700vVE;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C846403Sk;
import X.C867003a8;
import X.C875603bW;
import X.C877303bn;
import X.C960603pE;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS162S0400000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class USPaymentInfoCell extends ECPowerCell<C031A> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public PaymentInfo LLJIJIL;
    public Boolean LLJILJIL;
    public C03ZC LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C1331730kl9 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USPaymentInfoCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USPaymentInfoCell.class, "paymentInfoVM", "getPaymentInfoVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/payment/PaymentInfoViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final void R5() {
        BillStarlingText billStarlingText;
        String str;
        BillStarlingText billStarlingText2;
        String str2;
        if (this.LL) {
            return;
        }
        this.LL = true;
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.03aD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 139), 6);
        OrderSubmitAssemViewModel orderSubmitAssemViewModelT5 = T5();
        selectSubscribe(orderSubmitAssemViewModelT5, new C2217381BqS() { // from class: X.03aA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLLLLLZ);
            }
        }, new C2217381BqS() { // from class: X.03aB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLILZ);
            }
        }, new C2217371BqR() { // from class: X.03aw
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, new C2217381BqS() { // from class: X.03Ug
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(orderSubmitAssemViewModelT5.usedInReusedScene), null, new C1077804Jk(this, 3));
        U5();
        AnonymousClass0378.LIZ().LIZLLL("ec_osp_payment_module_shake", this);
        BillInfoData billInfoData = T5().LLJJI;
        BillStarling billStarling = billInfoData != null ? billInfoData.starlingTexts : null;
        if (billStarling != null && (billStarlingText2 = billStarling.paymentMethodTitle) != null && (str2 = billStarlingText2.text) != null) {
            ((TextView) this.itemView.findViewById(R.id.put)).setText(str2);
        }
        if (V5()) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.put);
            tuxTextView.setTuxFont(71);
            tuxTextView.setTextColorRes(R.attr.a1k);
        }
        if (billStarling != null && (billStarlingText = billStarling.paymentMethodViewAll) != null && (str = billStarlingText.text) != null) {
            ((TextView) this.itemView.findViewById(R.id.view_all)).setText(str);
        }
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.03a1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJZIJLIL);
            }
        }, null, new AwS615S0100000_1(this, 33), 6);
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217371BqR() { // from class: X.03au
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, null, new AwS615S0100000_1(this, 34), 6);
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.03aC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLZLLLI;
            }
        }, null, new AwS615S0100000_1(this, 35), 6);
        C736680Sv4.LJIIIIZZ(this, T5(), new C2217381BqS() { // from class: X.03aE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLZILL;
            }
        }, null, new AwS615S0100000_1(this, 36), 6);
    }

    public USPaymentInfoCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 601);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(108);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 631), awS545S0100000_1, AFwS207S0000000_19.get$arr$(163), new AwS545S0100000_1((C03K6) this, 624), new AwS545S0100000_1((C03K6) this, 632), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 634), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1220), null, new AwS545S0100000_1((C03K6) this, 637));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 620);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 622);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 625);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 64));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1215);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1217);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1218);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1219);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1221);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 638), awS545S0100000_1, AFwS207S0000000_19.get$arr$(162), new AwS545S0100000_1((C03K6) this, 603), new AwS545S0100000_1((C03K6) this, 604), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 605), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1211), null, new AwS545S0100000_1((C03K6) this, 606));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 607), awS545S0100000_1, AFwS207S0000000_19.get$arr$(164), new AwS545S0100000_1((C03K6) this, 609), new AwS545S0100000_1((C03K6) this, 610), new AwS545S0100000_1((C03K6) this, 613), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 615));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PaymentInfoViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 616);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(109);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 619), awS545S0100000_15, AFwS207S0000000_19.get$arr$(167), new AwS545S0100000_1((C03K6) this, 623), new AwS545S0100000_1((C03K6) this, 626), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 628), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1216), null, new AwS545S0100000_1((C03K6) this, 633));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 635);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 636);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 602);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 63));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1208);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1209);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1210);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1212);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1213);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 608), awS545S0100000_15, AFwS207S0000000_19.get$arr$(165), new AwS545S0100000_1((C03K6) this, 611), new AwS545S0100000_1((C03K6) this, 612), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 614), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1214), null, new AwS545S0100000_1((C03K6) this, 617));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 618), awS545S0100000_15, AFwS207S0000000_19.get$arr$(166), new AwS545S0100000_1((C03K6) this, 621), new AwS545S0100000_1((C03K6) this, 627), new AwS545S0100000_1((C03K6) this, 629), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 630));
        }
        this.LLJI = assemVMLazy2;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C679280Qkg.LIZ(2);
        this.LLJJI = new C1331730kl9(c1331750klB);
    }

    public final void L5() {
        BillInfoData billInfoData = T5().LLJJI;
        PaymentMethodsData paymentMethodsData = billInfoData != null ? billInfoData.paymentMethods : null;
        C03SP c03sp = T5().LLJJJJ;
        C867003a8 c867003a8LIZ = C03YY.LIZ(paymentMethodsData, c03sp != null ? c03sp.LIZ : null);
        HashMap<String, Object> map = T5().LLLIL;
        Object obj = map != null ? map.get("entrance_info") : null;
        String str = obj instanceof String ? (String) obj : null;
        Map mapLJ = T5().LLLIL;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C03SP c03sp2 = T5().LLJJJJ;
        C877303bn c877303bn = new C877303bn("order_submit", str, mapLJ, 0, c03sp2 != null ? c03sp2.LIZ : null, 4);
        C875603bW c875603bW = (C875603bW) this.itemView.findViewById(R.id.bpc);
        if (c875603bW != null) {
            if (c867003a8LIZ == null) {
                C03DZ.LIZ(c875603bW);
                return;
            }
            C12ES.LJIILL(0, c875603bW);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c877303bn.LIZ);
            sbLIZ.append(':');
            sbLIZ.append(c867003a8LIZ.LJ);
            sbLIZ.append(':');
            sbLIZ.append(c867003a8LIZ.LIZLLL);
            sbLIZ.append(':');
            sbLIZ.append(c867003a8LIZ.LIZ);
            c875603bW.LIZ(c867003a8LIZ, C2188811AlT.LIZIZ(sbLIZ), new AwS402S0200000_1(c867003a8LIZ, c877303bn, 12), new AwS130S0400000_1(c19egLIZIZ, c867003a8LIZ, c877303bn, this, 6), new AwS162S0400000_1(c19egLIZIZ, c867003a8LIZ, c877303bn, this, 2));
        }
    }

    public final void N5() {
        PaymentMethod paymentMethod;
        C1076804Ja<View> c1076804Ja = new C1076804Ja((ViewGroup) this.itemView.findViewById(R.id.q5x), 7);
        ArrayList<C03ZC> arrayList = new ArrayList();
        for (View view : c1076804Ja) {
            if ((view instanceof C03ZC) && view != null) {
                arrayList.add(view);
            }
        }
        for (C03ZC c03zc : arrayList) {
            if (c03zc.LIZLLL() && ((paymentMethod = c03zc.getPaymentMethod()) == null || !paymentMethod.LJJLI())) {
                c03zc.setChecked(false);
                c03zc.LIZ();
            }
        }
    }

    public final PaymentInfoViewModel S5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (PaymentInfoViewModel) assemVMLazy.getValue();
    }

    public final OrderSubmitAssemViewModel T5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void U5() {
        View view = this.itemView;
        if (((RecyclerView) view.findViewById(R.id.q5x)).getAdapter() == null) {
            C03ZE c03ze = new C03ZE(this);
            ((RecyclerView) view.findViewById(R.id.q5x)).setItemAnimator(null);
            ((RecyclerView) view.findViewById(R.id.q5x)).setLayoutManager(new LinearLayoutManager(view.getContext()));
            ((RecyclerView) view.findViewById(R.id.q5x)).setAdapter(c03ze);
            if (V5()) {
                C0H9H.LJI(0, view.findViewById(R.id.q5x));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USPaymentInfoCell ");
        sbLIZ.append(getPosition());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        super.onCreate();
        R5();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = T5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("payment_methods", this.itemView);
        }
        ModuleManager moduleManager2 = T5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "payment_methods");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean V5() {
        C031A c031a = (C031A) getItem();
        return c031a != null && c031a.LLIZ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_osp_payment_module_shake", this);
    }

    public final void W5(Context context) {
        OrderSubmitAssemViewModel.JS2(T5(), context, C960603pE.LIZLLL(this.itemView), null, new C846403Sk(this), false, null, false, 232);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03af A[PHI: r5
      0x03af: PHI (r5v10 java.util.List) = (r5v9 java.util.List), (r5v12 java.util.List) binds: [B:163:0x03a3, B:165:0x03a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r25) {
        /*
            Method dump skipped, instruction units count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b2m, viewGroup, false);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Object obj;
        if (Intrinsics.LJFF(str, "ec_osp_payment_module_shake")) {
            try {
                View view = this.itemView;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.be);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.us_order_submit_payment_title_zone);
                if (linearLayout != null) {
                    linearLayout.startAnimation(animationLoadAnimation);
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
            }
        }
    }

    public final void P5(Integer num, List<String> list, Integer num2, Boolean bool, Boolean bool2, PaymentMethodsData paymentMethodsData) {
        PaymentSettings paymentSettings;
        String str;
        PaymentSettings paymentSettings2;
        C12ES.LJIILL(0, this.itemView.findViewById(R.id.chw));
        C786410Ut5.I7(new AjS60S0100000_1(this, 21), this.itemView.findViewById(R.id.chw));
        Boolean bool3 = Boolean.FALSE;
        String strReplace = null;
        if (Intrinsics.LJFF(bool, bool3)) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.z7r);
            if (paymentMethodsData != null && (paymentSettings2 = paymentMethodsData.settings) != null) {
                strReplace = paymentSettings2.viewAllBottomKey;
            }
            textView.setText(strReplace);
        } else if (num != null) {
            int iIntValue = num.intValue();
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.z7r);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_ecom_view_all_copywriting_fix", false)) {
                strReplace = new Regex("\\{.*?\\}").replace(this.itemView.getContext().getResources().getQuantityString(2131755484, iIntValue), String.valueOf(iIntValue));
            } else if (paymentMethodsData != null && (paymentSettings = paymentMethodsData.settings) != null && (str = paymentSettings.viewAllBottomKey) != null) {
                strReplace = new Regex("\\{.*?\\}").replace(str, String.valueOf(iIntValue));
            }
            textView2.setText(strReplace);
        }
        if (V5()) {
            View viewFindViewById = this.itemView.findViewById(R.id.chw);
            if (viewFindViewById != null) {
                viewFindViewById.getLayoutParams().height = -2;
                viewFindViewById.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.chx);
            if (viewFindViewById2 != null) {
                C03DZ.LIZ(viewFindViewById2);
            }
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.z7r);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(72);
                tuxTextView.setTextColorRes(R.attr.a1j);
            }
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.jy9);
            if (tuxIconView != null) {
                C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), tuxIconView);
                C1744700vVE.LJIIL(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                tuxIconView.setIconRes(R.raw.icon_chevron_right_slim_thin_ltr);
                tuxIconView.setTintColorRes(R.attr.a1k);
            }
        }
        if (Intrinsics.LJFF(bool2, bool3)) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.viewAllIcons));
        } else {
            C03G7.LIZIZ(C03G7.LIZ, (ViewGroup) this.itemView.findViewById(R.id.viewAllIcons), list, num2, C679280Qkg.LIZ(6), this.LLJJI, false, true, 32);
        }
        if (!this.LLJJ) {
            this.LLJJ = true;
            C03O0.LJJJZ(C03O0.LIZ, "view_all_payment", T5().hi1(false), null, null, null, null, null, null, null, null, null, null, null, 1048572);
        }
        C03DZ.LIZ(this.itemView.findViewById(R.id.view_all));
        C03DZ.LIZ(this.itemView.findViewById(R.id.view_all_arrow));
    }
}
