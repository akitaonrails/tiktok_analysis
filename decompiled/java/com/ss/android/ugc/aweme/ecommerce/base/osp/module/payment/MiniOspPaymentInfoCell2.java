package com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment;

import X.AnonymousClass0378;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03O1;
import X.C03QF;
import X.C03XA;
import X.C03ZB;
import X.C09R3;
import X.C1076804Ja;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7768031q;
import X.C786410Ut5;
import X.C871103an;
import X.InterfaceC1164530gPT;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.payment.MiniOspPaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniOspPaymentInfoCell2 extends ECPowerCell<C7768031q> implements InterfaceC1164530gPT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public PaymentInfo LLJIJIL;
    public Boolean LLJILJIL;
    public C03ZB LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final LinkedList<C03ZB> LLJJI;
    public C03ZB LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MiniOspPaymentInfoCell2.class, "miniOspVM", "getMiniOspVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/MiniOspViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MiniOspPaymentInfoCell2.class, "paymentInfoVM", "getPaymentInfoVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/sea/payment/MiniOspPaymentInfoViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final void N5() {
        if (this.LL) {
            return;
        }
        this.LL = true;
        AnonymousClass0378.LIZ().LIZLLL("ec_osp_fill_cvv_event", this);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.n_t);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        C736680Sv4.LJIIIIZZ(this, P5(), new C2217381BqS() { // from class: X.03Zx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLJZIJLIL);
            }
        }, null, new AwS615S0100000_1(this, 25), 6);
        C736680Sv4.LJIIIIZZ(this, P5(), new C2217371BqR() { // from class: X.03ar
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLIZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C03JV) obj).LLIZ = (PaymentInfo) obj2;
            }
        }, null, new AwS615S0100000_1(this, 26), 6);
    }

    public MiniOspPaymentInfoCell2() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MiniOspViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 275);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(80);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 267), awS545S0100000_1, AFwS207S0000000_19.get$arr$(121), new AwS545S0100000_1((C03K6) this, 298), new AwS545S0100000_1((C03K6) this, 268), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 270), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1113), null, new AwS545S0100000_1((C03K6) this, 274));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 294);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 296);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 299);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 50));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1121);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1123);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1110);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1111);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1112);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 272), awS545S0100000_1, AFwS207S0000000_19.get$arr$(120), new AwS545S0100000_1((C03K6) this, 277), new AwS545S0100000_1((C03K6) this, 278), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 279), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1117), null, new AwS545S0100000_1((C03K6) this, 280));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 281), awS545S0100000_1, AFwS207S0000000_19.get$arr$(122), new AwS545S0100000_1((C03K6) this, 283), new AwS545S0100000_1((C03K6) this, 284), new AwS545S0100000_1((C03K6) this, 287), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 289));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MiniOspPaymentInfoViewModel.class);
        AwS545S0100000_1 awS545S0100000_15 = new AwS545S0100000_1(c19719912DlLIZ2, 290);
        AFwS228S0000000_1 aFwS228S0000000_12 = AFwS228S0000000_1.get$arr$(81);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 293), awS545S0100000_15, AFwS207S0000000_19.get$arr$(125), new AwS545S0100000_1((C03K6) this, 297), new AwS545S0100000_1((C03K6) this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 302), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1122), null, new AwS545S0100000_1((C03K6) this, 269));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_16 = new AwS545S0100000_1((C03K6) this, 271);
            AwS545S0100000_1 awS545S0100000_17 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 273);
            AwS545S0100000_1 awS545S0100000_18 = new AwS545S0100000_1(c19719912DlLIZ2, 276);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_16, 49));
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ2, 1114);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ2, 1115);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ2, 1116);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ2, 1118);
            AwS563S0100000_19 awS563S0100000_1910 = new AwS563S0100000_19(c01gwLIZIZ2, 1119);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS545S0100000_18, awS545S0100000_15, new C452080Ho6(), awS563S0100000_196, awS563S0100000_197, awS545S0100000_17, aFwS228S0000000_12, awS563S0100000_198, awS563S0100000_199, awS563S0100000_1910);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 282), awS545S0100000_15, AFwS207S0000000_19.get$arr$(123), new AwS545S0100000_1((C03K6) this, 285), new AwS545S0100000_1((C03K6) this, 286), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 288), aFwS228S0000000_12, new AwS563S0100000_19((C03K6) this, 1120), null, new AwS545S0100000_1((C03K6) this, 291));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ2, 292), awS545S0100000_15, AFwS207S0000000_19.get$arr$(124), new AwS545S0100000_1((C03K6) this, 295), new AwS545S0100000_1((C03K6) this, 301), new AwS545S0100000_1((C03K6) this, 303), aFwS228S0000000_12, null, null, new AwS545S0100000_1((C03K6) this, 304));
        }
        this.LLJI = assemVMLazy2;
        this.LLJJI = new LinkedList<>();
    }

    public final void L5() {
        PaymentMethod paymentMethod;
        C1076804Ja<View> c1076804Ja = new C1076804Ja((ViewGroup) this.itemView.findViewById(R.id.n_t), 5);
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

    public final MiniOspViewModel P5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (MiniOspViewModel) assemVMLazy.getValue();
    }

    public final MiniOspPaymentInfoViewModel R5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (MiniOspPaymentInfoViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = P5().LLLFFI;
        if (moduleManager != null) {
            moduleManager.LIZ("payment_methods", this.itemView);
        }
        ModuleManager moduleManager2 = P5().LLLFFI;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "payment_methods");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        N5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0378.LIZ().LIZJ("ec_osp_fill_cvv_event", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(X.C7768031q r19) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2.S5(X.031q):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(X.C7768031q r24) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.MiniOspPaymentInfoCell2.T5(X.031q):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        PaymentMethodsData paymentMethodsData;
        boolean zBooleanValue;
        int i;
        int i2;
        int i3;
        Availability availability;
        C7768031q c7768031q = (C7768031q) interfaceC1891350zJl;
        this.LLIZLLLIL = System.currentTimeMillis();
        C03DZ.LIZ(this.itemView.findViewById(R.id.q5t));
        if (P5().LLLFZ) {
            if (Intrinsics.LJFF(c7768031q.LLJJIII, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                return;
            }
            C786410Ut5.LJLLLLLL(0, this.itemView);
        }
        HashMap<String, Object> mapHi1 = P5().hi1(false);
        N5();
        C03J8.LIZ(this.itemView, true);
        this.LLJIJIL = c7768031q.LLIZ;
        BillInfoData billInfoData = P5().LLIZ;
        PaymentInfo paymentInfo = this.LLJIJIL;
        if (billInfoData != null) {
            paymentMethodsData = billInfoData.paymentMethods;
        } else {
            paymentMethodsData = null;
        }
        C03QF.LJFF(paymentInfo, paymentMethodsData);
        Boolean bool = c7768031q.LLJJI;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        View view = this.itemView;
        View viewFindViewById = view.findViewById(R.id.pro);
        int i4 = 8;
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.prp);
        if (zBooleanValue) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.prq);
        if (zBooleanValue) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.prr);
        if (zBooleanValue) {
            i4 = 0;
        }
        C786410Ut5.LJLLLLLL(i4, viewFindViewById4);
        if (zBooleanValue) {
            C03DZ.LIZ(view.findViewById(R.id.n_q));
            C03DZ.LIZ(view.findViewById(R.id.z59));
            C03DZ.LIZ(view.findViewById(R.id.m6r));
            C03DZ.LIZ(this.itemView.findViewById(R.id.chw));
        }
        Boolean bool2 = c7768031q.LLJJI;
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool2, bool3)) {
            return;
        }
        this.LLILLJJLI = true;
        this.LLJILJIL = c7768031q.LLILZLL;
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            P5();
            C03O1.LJIILIIL(P5().LLILZLL, "payment_method", mapHi1, 8188);
        }
        C03DZ.LIZ(this.itemView.findViewById(R.id.m6r));
        C03DZ.LIZ(this.itemView.findViewById(R.id.h1r));
        this.LLJJI.clear();
        C786410Ut5.LJJJJJL((LinearLayout) this.itemView.findViewById(R.id.n_t));
        PaymentMethod paymentMethod = c7768031q.LLJJIJI;
        if (paymentMethod != null && (availability = paymentMethod.availability) != null && Intrinsics.LJFF(availability.isAvailable(), bool3)) {
            S5(c7768031q);
            T5(c7768031q);
        } else {
            T5(c7768031q);
            S5(c7768031q);
        }
        ModuleManager moduleManager = P5().LLLFFI;
        if (moduleManager == null) {
            return;
        }
        moduleManager.LJIIJ(System.currentTimeMillis() - this.LLIZLLLIL, "payment_methods");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b41, viewGroup, false);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_osp_fill_cvv_event") && C871103an.LIZ()) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.ul_));
        }
    }
}
