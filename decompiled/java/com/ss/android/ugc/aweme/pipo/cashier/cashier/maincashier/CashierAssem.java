package com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier;

import X.C019F;
import X.C01GW;
import X.C1157320gDq;
import X.C1193050h9T;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1708610uZ1;
import X.C1709070uZl;
import X.C1709220ua0;
import X.C1709230ua1;
import X.C1709570uaZ;
import X.C1709820uay;
import X.C1710390ubt;
import X.C1710540uc8;
import X.C1711340udQ;
import X.C197039127h;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C337180DJs;
import X.C413040GHm;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1709020uZg;
import X.EnumC1709200uZy;
import X.EnumC1709240ua2;
import X.EnumC995340c0a;
import X.InterfaceC1331910klR;
import X.InterfaceC1709310ua9;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS167S1200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public View LLIZLLLIL;
    public ConstraintLayout LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public LinearLayout LLJILJILJ;
    public AppCompatImageView LLJILLL;
    public C197039127h LLJJ;
    public RecyclerView LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public C1709820uay LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C01GW LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CashierAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/maincashier/CashierViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CashierAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CashierViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 837), AFwS268S0000000_26.get$arr$(417), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, C1710540uc8.class, null), checkSupervisorPrepared());
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 836));
    }

    public final void No() {
        C1709570uaZ c1709570uaZ;
        C1157320gDq c1157320gDq;
        EnumC1709240ua2 enumC1709240ua2;
        C1709570uaZ c1709570uaZ2;
        C1193050h9T c1193050h9T;
        final Context context;
        C1709070uZl c1709070uZl;
        C1709070uZl c1709070uZl2;
        CashierEnterParams cashierEnterParams = Ho().LL;
        EnumC1709200uZy enumC1709200uZy = (cashierEnterParams == null || (c1709070uZl2 = cashierEnterParams.LIZIZ) == null) ? null : c1709070uZl2.LIZIZ;
        int i = enumC1709200uZy == null ? -1 : C1709230ua1.LIZIZ[enumC1709200uZy.ordinal()];
        final int i2 = (i == 1 || i != 2) ? 2131857120 : 2131857117;
        if (((cashierEnterParams == null || (c1709070uZl = cashierEnterParams.LIZIZ) == null) ? null : c1709070uZl.LIZIZ) == EnumC1709200uZy.PAY_NOW && (((c1709570uaZ2 = Jo().LLILLJJLI) != null || (c1709570uaZ2 = cashierEnterParams.paymentData) != null) && (c1193050h9T = c1709570uaZ2.LIZIZ(null, null, false).LIZLLL) != null && (context = getContext()) != null)) {
            Context context2 = getContext();
            String str = (context2 == null || !C960203pA.LIZIZ(context2)) ? c1193050h9T.LIZJ : c1193050h9T.LIZLLL;
            if (str != null) {
                final C197039127h c197039127hGo = Go();
                c197039127hGo.LJJJJL(new AwS76S1000000_26(str, 44));
                C1711340udQ c1711340udQ = C1711340udQ.LIZ;
                String str2 = c1193050h9T.LIZ;
                String str3 = c1193050h9T.LIZIZ;
                c1711340udQ.getClass();
                final String strLIZ = C1711340udQ.LIZ(context, str2, str3);
                if (strLIZ == null || strLIZ.length() == 0) {
                    this.LLJJIJIL = null;
                    c197039127hGo.setButtonStartIconDrawable(null);
                    c197039127hGo.setText(i2);
                    return;
                } else {
                    this.LLJJIJIL = strLIZ;
                    c197039127hGo.setText("");
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
                    c1331670kl3LJIIIZ.LJJLIIJ = true;
                    c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0hOp
                        @Override // X.InterfaceC1331910klR
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onCanceled() {
                            this.LL.Lo(i2, strLIZ);
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (!Intrinsics.LJFF(this.LL.LLJJIJIL, strLIZ)) {
                                return;
                            }
                            if (bitmap != null) {
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                                C197039127h c197039127h = c197039127hGo;
                                c197039127h.setButtonStartIconDrawable(bitmapDrawable);
                                c197039127h.setIconHeight(bitmapDrawable.getIntrinsicHeight());
                                c197039127h.setIconWidth(bitmapDrawable.getIntrinsicWidth());
                                return;
                            }
                            this.LL.Lo(i2, strLIZ);
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            this.LL.Lo(i2, strLIZ);
                        }
                    });
                    return;
                }
            }
        }
        this.LLJJIJIL = null;
        C197039127h c197039127hGo2 = Go();
        c197039127hGo2.setButtonStartIconDrawable(null);
        c197039127hGo2.setText(i2);
        CashierEnterParams cashierEnterParams2 = Ho().LL;
        if (cashierEnterParams2 == null || (c1709570uaZ = cashierEnterParams2.paymentData) == null || (c1157320gDq = c1709570uaZ.LJIJ) == null || (enumC1709240ua2 = c1157320gDq.LIZIZ) == null || C1709230ua1.LIZ[enumC1709240ua2.ordinal()] != 1) {
            c197039127hGo2.LJJJJL(null);
            c197039127hGo2.setButtonVariant(0);
        } else {
            Context context3 = getContext();
            if (context3 != null) {
                c197039127hGo2.LJJJJL(new AwS580S0100000_1(context3, 769));
            }
        }
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cal) : null;
            this.LLJJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1710540uc8 Ho() {
        return (C1710540uc8) this.LLJJIJI.getValue();
    }

    public final CashierViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (CashierViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112 A[PHI: r4
      0x0112: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String), (r4v5 java.lang.String) binds: [B:91:0x010e, B:86:0x0101, B:88:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117 A[PHI: r3 r4
      0x0117: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String), (r3v3 java.lang.String) binds: [B:94:0x0113, B:81:0x00f3, B:83:0x00f9] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String), (r4v4 java.lang.String) binds: [B:94:0x0113, B:81:0x00f3, B:83:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo() {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierAssem.Oo():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        EnumC1709240ua2 enumC1709240ua2;
        int i;
        String str;
        String str2;
        Boolean boolValueOf;
        CashierFragment cashierFragment;
        EnumC1709020uZg enumC1709020uZg;
        String str3;
        C1709220ua0 c1709220ua0;
        PipoCashierBaseFragment pipoCashierBaseFragment;
        C1709070uZl c1709070uZl;
        EnumC1709200uZy enumC1709200uZy;
        int i2;
        C1709570uaZ c1709570uaZ;
        C1157320gDq c1157320gDq;
        CashierFragment cashierFragment2;
        Context context = getContext();
        String str4 = null;
        if (context != null) {
            CashierViewModel cashierViewModelJo = Jo();
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI instanceof CashierFragment) {
                cashierFragment2 = (CashierFragment) fragmentLJI;
            } else {
                cashierFragment2 = null;
            }
            this.LLJJIJIIJIL = new C1709820uay(cashierViewModelJo, cashierFragment2);
            View viewFindViewById = this.LLJJI;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.t0h);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJI = (RecyclerView) viewFindViewById;
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
                recyclerView.setAdapter(this.LLJJIJIIJIL);
                recyclerView.setItemAnimator(null);
            }
        }
        Oo();
        CashierEnterParams cashierEnterParams = Ho().LL;
        if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null && (c1157320gDq = c1709570uaZ.LJIJ) != null) {
            enumC1709240ua2 = c1157320gDq.LIZIZ;
        } else {
            enumC1709240ua2 = null;
        }
        if (enumC1709240ua2 == null) {
            i = -1;
        } else {
            i = C1709230ua1.LIZ[enumC1709240ua2.ordinal()];
        }
        if (i == 1) {
            View viewFindViewById2 = this.LLJILJILJ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.y5l);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJILJ = (LinearLayout) viewFindViewById2;
            }
            C337180DJs.LIZJ(viewFindViewById2);
            View viewFindViewById3 = this.LLJILLL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById3 = viewLJJIJL3.findViewById(R.id.y5n);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILLL = (AppCompatImageView) viewFindViewById3;
            }
            ((AppCompatImageView) viewFindViewById3).setImageDrawable(new C413040GHm());
        } else {
            View viewFindViewById4 = this.LLJILJILJ;
            if (viewFindViewById4 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById4 = viewLJJIJL4.findViewById(R.id.y5l);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJILJILJ = (LinearLayout) viewFindViewById4;
            }
            C337180DJs.LIZ(viewFindViewById4);
        }
        No();
        String str5 = Ho().LLILLJJLI;
        C786410Ut5.I7(new AbS167S1200000_26(this, cashierEnterParams, str5, 1), Go());
        if (cashierEnterParams != null) {
            str = cashierEnterParams.payRequestId;
        } else {
            str = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        if (cashierEnterParams != null && (c1709070uZl = cashierEnterParams.LIZIZ) != null && (enumC1709200uZy = c1709070uZl.LIZIZ) != null && (i2 = C1709230ua1.LIZIZ[enumC1709200uZy.ordinal()]) != 1 && i2 == 2) {
            str2 = "pay";
        } else {
            str2 = "continue";
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if ((fragmentLJI2 instanceof PipoCashierBaseFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI2) != null) {
            boolValueOf = Boolean.valueOf(pipoCashierBaseFragment.bS());
        } else {
            boolValueOf = null;
        }
        interfaceC1709310ua9LIZIZ.LJ(str5, str2, boolValueOf, C2097608Jq.LJ());
        Function0 function0 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1710290ubj) obj).LLILLJJLI);
            }
        }, null, AFwS285S0000000_2.get$arr$(56), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 118), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 119), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLILZIL;
            }
        }, null, AFwS313S0000000_26.get$arr$(39), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLILZLL;
            }
        }, null, new AwS640S0100000_26(this, 114), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLIZ;
            }
        }, null, new AwS640S0100000_26(this, 115), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLIZLLLIL;
            }
        }, null, new AwS640S0100000_26(this, 116), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1710290ubj) obj).LLILLL);
            }
        }, null, new AwS618S0100000_4(this, 72), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLJ;
            }
        }, null, AFwS313S0000000_26.get$arr$(16), 6);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ucJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710290ubj) obj).LLJI;
            }
        }, null, new AwS640S0100000_26(this, 117), 6);
        CashierEnterParams cashierEnterParamsLIZ = Ho().LL;
        if (cashierEnterParamsLIZ != null) {
            CashierViewModel cashierViewModelJo2 = Jo();
            Fragment fragmentLJI3 = C724240Sb0.LJI(this);
            if (fragmentLJI3 instanceof CashierFragment) {
                cashierFragment = (CashierFragment) fragmentLJI3;
            } else {
                cashierFragment = null;
            }
            cashierViewModelJo2.LLILLL = cashierFragment;
            C1709070uZl c1709070uZl2 = cashierEnterParamsLIZ.LIZIZ;
            if (c1709070uZl2 != null) {
                enumC1709020uZg = c1709070uZl2.LIZJ;
            } else {
                enumC1709020uZg = null;
            }
            if (enumC1709020uZg == EnumC1709020uZg.SECOND_PAY && c1709070uZl2.LIZIZ == EnumC1709200uZy.PAY_NOW && ((c1709220ua0 = cashierEnterParamsLIZ.LJ) == null || c1709220ua0.LIZJ == null)) {
                C1709220ua0 c1709220ua02 = cashierEnterParamsLIZ.LJ;
                if (c1709220ua02 == null) {
                    c1709220ua02 = new C1709220ua0(function0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 63);
                }
                cashierEnterParamsLIZ = CashierEnterParams.LIZ(cashierEnterParamsLIZ, null, new C1709220ua0(c1709220ua02.LIZ, new AwS570S0100000_26(cashierViewModelJo2, 1416), c1709220ua02.LIZIZ, c1709220ua02.LIZLLL, c1709220ua02.LJ, c1709220ua02.LJFF), 127);
            }
            cashierViewModelJo2.LL = cashierEnterParamsLIZ;
            C1709570uaZ c1709570uaZ2 = cashierEnterParamsLIZ.paymentData;
            cashierViewModelJo2.LLILLJJLI = c1709570uaZ2;
            C1709070uZl c1709070uZl3 = cashierEnterParamsLIZ.LIZIZ;
            if (c1709070uZl3 != null) {
                str3 = c1709070uZl3.LIZLLL;
            } else {
                str3 = null;
            }
            cashierViewModelJo2.LLIZ = str3;
            if (c1709070uZl3 != null) {
                str4 = c1709070uZl3.LJ;
            }
            cashierViewModelJo2.LLIZLLLIL = str4;
            cashierViewModelJo2.LLJ = false;
            if (c1709570uaZ2 != null) {
                c1709570uaZ2.LJJJJJ(cashierViewModelJo2);
                cashierViewModelJo2.LLILZ = new C1710390ubt(c1709570uaZ2, EnumC995340c0a.NEEDED_ELEMENT);
                cashierViewModelJo2.setStateImmediate(new AwS392S0200000_26(cashierViewModelJo2, c1709570uaZ2, 167));
                cashierViewModelJo2.BQ2();
            }
        }
    }

    public final void Lo(int i, String str) {
        if (str != null && !Intrinsics.LJFF(this.LLJJIJIL, str)) {
            return;
        }
        this.LLJJIJIL = null;
        C197039127h c197039127hGo = Go();
        c197039127hGo.setButtonStartIconDrawable(null);
        c197039127hGo.setText(i);
    }
}
