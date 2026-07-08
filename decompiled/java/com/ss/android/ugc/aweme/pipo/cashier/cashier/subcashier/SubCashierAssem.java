package com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier;

import X.C019F;
import X.C0I7D;
import X.C1155270gAX;
import X.C1157320gDq;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1708610uZ1;
import X.C1709040uZi;
import X.C1709260ua4;
import X.C1709570uaZ;
import X.C1710000ubG;
import X.C1710740ucS;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C413040GHm;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1155630gB7;
import X.EnumC1709020uZg;
import X.EnumC1709240ua2;
import X.InterfaceC1709310ua9;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POStatusAttr;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS699S0100000_18;
import wh6.AbS705S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SubCashierAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public C0I7D LLIZLLLIL;
    public TuxIconView LLJ;
    public C197039127h LLJI;
    public LinearLayout LLJIJIL;
    public AppCompatImageView LLJILJIL;
    public RecyclerView LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C1559260qg8 LLJJ;
    public C1710000ubG LLJJI;
    public long LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubCashierAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/subcashier/SubCashierViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubCashierAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubCashierViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 749), AFwS268S0000000_26.get$arr$(428), null, true);
        this.LLJJ = new C1559260qg8(new C723590SZx(this, C1155270gAX.class, null), checkSupervisorPrepared());
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cal) : null;
            this.LLJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C0I7D Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hch) : null;
            this.LLIZLLLIL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final TuxIconView Jo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jxq) : null;
            this.LLJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final SubCashierViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SubCashierViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final String str;
        String string;
        int i;
        String str2;
        EnumC1709020uZg enumC1709020uZg;
        PipoCashierBaseFragment pipoCashierBaseFragment;
        PaymentOption paymentOption;
        PODaInfo pODaInfo;
        SubCashierFragment subCashierFragment;
        C1709570uaZ c1709570uaZ;
        C1157320gDq c1157320gDq;
        EnumC1709240ua2 enumC1709240ua2;
        C1709570uaZ c1709570uaZ2;
        C1157320gDq c1157320gDq2;
        EnumC1709240ua2 enumC1709240ua22;
        PaymentOption paymentOption2;
        SubCashierFragment subCashierFragment2;
        PaymentOption paymentOption3;
        boolean z;
        C1709570uaZ c1709570uaZ3;
        EnumC1155630gB7 enumC1155630gB7;
        PaymentOption next;
        PaymentOption paymentOption4;
        POStatusAttr pOStatusAttr;
        String str3;
        C1709570uaZ c1709570uaZ4;
        SubCashierEnterParams subCashierEnterParams = ((C1155270gAX) this.LLJJ.getValue()).LL;
        Boolean boolValueOf = null;
        if (subCashierEnterParams != null && (paymentOption2 = subCashierEnterParams.parentPaymentOption) != null) {
            SubCashierViewModel subCashierViewModelLo = Lo();
            SubCashierEnterParams subCashierEnterParams2 = ((C1155270gAX) this.LLJJ.getValue()).LL;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI instanceof SubCashierFragment) {
                subCashierFragment2 = (SubCashierFragment) fragmentLJI;
            } else {
                subCashierFragment2 = null;
            }
            subCashierViewModelLo.LL = subCashierEnterParams2;
            subCashierViewModelLo.LLILLJJLI = subCashierFragment2;
            if (subCashierEnterParams2 != null && (c1709570uaZ4 = subCashierEnterParams2.paymentData) != null) {
                c1709570uaZ4.LJJJJJ(subCashierViewModelLo);
            }
            List<PaymentOption> list = paymentOption2.LIZLLL;
            if (list != null) {
                Iterator<PaymentOption> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String str4 = next.LIZ;
                        if (subCashierEnterParams2 != null) {
                            str3 = subCashierEnterParams2.defaultCheckedSubPaymentOptionKey;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.LJFF(str4, str3)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                paymentOption3 = next;
                if (paymentOption3 == null && list != null && (paymentOption4 = (PaymentOption) C13LP.LJJJLL(list)) != null && (pOStatusAttr = paymentOption4.statusAttr) != null && pOStatusAttr.available) {
                    paymentOption3 = paymentOption4;
                }
            } else {
                paymentOption3 = null;
            }
            if (subCashierEnterParams2 != null && (enumC1155630gB7 = subCashierEnterParams2.LIZ) != null && enumC1155630gB7.getShowSearchBar() && list != null && list.size() > 8) {
                z = true;
            } else {
                z = false;
            }
            subCashierViewModelLo.setStateImmediate(new AwS112S0110000_26(subCashierViewModelLo, z, 7));
            if (paymentOption3 != null) {
                String str5 = paymentOption3.LIZ;
                SubCashierEnterParams subCashierEnterParams3 = subCashierViewModelLo.LL;
                if (subCashierEnterParams3 != null && (c1709570uaZ3 = subCashierEnterParams3.paymentData) != null) {
                    c1709570uaZ3.LJIILJJIL(str5, false, false);
                }
                subCashierViewModelLo.setStateImmediate(AFwS268S0000000_26.get$arr$(430));
            }
        }
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ucL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710230ubd) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 161), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ucD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1710230ubd) obj).LLILLL);
            }
        }, null, AFwS285S0000000_2.get$arr$(64), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ucF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710230ubd) obj).LLILZ;
            }
        }, null, AFwS313S0000000_26.get$arr$(17), 6);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0ucO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1710230ubd) obj).LLILZLL;
            }
        }, null, new AwS632S0100000_18(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 6);
        C786410Ut5.d9(Ho(), new ACListenerS160S0100000_26(this, 75));
        SubCashierEnterParams subCashierEnterParams4 = ((C1155270gAX) this.LLJJ.getValue()).LL;
        if (subCashierEnterParams4 != null) {
            str = subCashierEnterParams4.payRequestId;
        } else {
            str = null;
        }
        Ho().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0ubf
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z2) {
                String str6;
                String strLIZ;
                String str7;
                EnumC1709020uZg enumC1709020uZg2;
                PaymentOption paymentOption5;
                PODaInfo pODaInfo2;
                EnumC1709020uZg enumC1709020uZg3;
                PaymentOption paymentOption6;
                PODaInfo pODaInfo3;
                String str8;
                EnumC1709020uZg enumC1709020uZg4;
                PaymentOption paymentOption7;
                PODaInfo pODaInfo4;
                SubCashierFragment subCashierFragment3;
                String strLIZ2 = "";
                if (z2) {
                    if (C724240Sb0.LJI(this.LL) instanceof SubCashierFragment) {
                        Fragment fragmentLJI2 = C724240Sb0.LJI(this.LL);
                        if ((fragmentLJI2 instanceof SubCashierFragment) && (subCashierFragment3 = (SubCashierFragment) fragmentLJI2) != null && !subCashierFragment3.bS()) {
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(subCashierFragment3, 117));
                        }
                    }
                    this.LL.LLJJIII = System.currentTimeMillis();
                    InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
                    SubCashierEnterParams subCashierEnterParams5 = this.LL.Lo().LL;
                    if (subCashierEnterParams5 == null || (paymentOption7 = subCashierEnterParams5.parentPaymentOption) == null || (pODaInfo4 = paymentOption7.trackInfo) == null || (str8 = pODaInfo4.optionName) == null) {
                        str8 = "";
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    SubCashierEnterParams subCashierEnterParams6 = this.LL.Lo().LL;
                    if (subCashierEnterParams6 != null && (enumC1709020uZg4 = subCashierEnterParams6.LIZJ) != null) {
                        strLIZ2 = C1709040uZi.LIZ(enumC1709020uZg4);
                    }
                    linkedHashMap.put("enter_from", strLIZ2);
                    interfaceC1709310ua9LIZIZ.LJI(str8, "search", linkedHashMap);
                    return;
                }
                long jCurrentTimeMillis = 0;
                if (this.LL.LLJJIII > 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - this.LL.LLJJIII;
                }
                InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ2 = C1708610uZ1.LIZIZ(str);
                SubCashierEnterParams subCashierEnterParams7 = this.LL.Lo().LL;
                if (subCashierEnterParams7 == null || (paymentOption6 = subCashierEnterParams7.parentPaymentOption) == null || (pODaInfo3 = paymentOption6.trackInfo) == null || (str6 = pODaInfo3.optionName) == null) {
                    str6 = "";
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("input_method", "normal");
                SubCashierEnterParams subCashierEnterParams8 = this.LL.Lo().LL;
                if (subCashierEnterParams8 == null || (enumC1709020uZg3 = subCashierEnterParams8.LIZJ) == null) {
                    strLIZ = "";
                } else {
                    strLIZ = C1709040uZi.LIZ(enumC1709020uZg3);
                }
                pairArr[1] = new Pair("enter_from", strLIZ);
                interfaceC1709310ua9LIZIZ2.LJIIJ(jCurrentTimeMillis, str6, C2097608Jq.LJIIIIZZ(pairArr), "search");
                InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ3 = C1708610uZ1.LIZIZ(str);
                SubCashierEnterParams subCashierEnterParams9 = this.LL.Lo().LL;
                if (subCashierEnterParams9 == null || (paymentOption5 = subCashierEnterParams9.parentPaymentOption) == null || (pODaInfo2 = paymentOption5.trackInfo) == null || (str7 = pODaInfo2.optionName) == null) {
                    str7 = "";
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                SubCashierEnterParams subCashierEnterParams10 = this.LL.Lo().LL;
                if (subCashierEnterParams10 != null && (enumC1709020uZg2 = subCashierEnterParams10.LIZJ) != null) {
                    strLIZ2 = C1709040uZi.LIZ(enumC1709020uZg2);
                }
                linkedHashMap2.put("enter_from", strLIZ2);
                interfaceC1709310ua9LIZIZ3.LIZLLL(str7, "search", linkedHashMap2);
            }
        });
        Ho().addTextChangedListener(new C1710740ucS() { // from class: X.0uc9
            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence != null) {
                    SubCashierAssem subCashierAssem = this.LL;
                    SubCashierViewModel subCashierViewModelLo2 = subCashierAssem.Lo();
                    subCashierViewModelLo2.withState(new AwS140S1100000_26(charSequence.toString(), subCashierViewModelLo2, 52));
                    if (charSequence.length() == 0) {
                        C337180DJs.LIZ(subCashierAssem.Jo());
                    } else {
                        C337180DJs.LIZJ(subCashierAssem.Jo());
                    }
                }
            }
        });
        C337180DJs.LIZ(Jo());
        C786410Ut5.I7(new AbS699S0100000_18(this, 60), Jo());
        SubCashierEnterParams subCashierEnterParams5 = ((C1155270gAX) this.LLJJ.getValue()).LL;
        C197039127h c197039127hGo = Go();
        C337180DJs.LIZ(c197039127hGo);
        if (subCashierEnterParams5 != null && (c1709570uaZ2 = subCashierEnterParams5.paymentData) != null && (c1157320gDq2 = c1709570uaZ2.LJIJ) != null && (enumC1709240ua22 = c1157320gDq2.LIZIZ) != null) {
            if (C1709260ua4.LIZ[enumC1709240ua22.ordinal()] == 1) {
                Context context = getContext();
                if (context != null) {
                    Go().LJJJJL(new AwS580S0100000_1(context, 868));
                }
            } else {
                Go().setButtonVariant(0);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            string = context2.getString(2131857120);
        } else {
            string = null;
        }
        c197039127hGo.setText(string);
        C786410Ut5.I7(new AbS705S0100000_26(this, 13), c197039127hGo);
        if (subCashierEnterParams5 != null && (c1709570uaZ = subCashierEnterParams5.paymentData) != null && (c1157320gDq = c1709570uaZ.LJIJ) != null && (enumC1709240ua2 = c1157320gDq.LIZIZ) != null) {
            i = C1709260ua4.LIZ[enumC1709240ua2.ordinal()];
        } else {
            i = -1;
        }
        if (i == 1) {
            View viewFindViewById = this.LLJIJIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.y5l);
                } else {
                    viewFindViewById = null;
                }
                this.LLJIJIL = (LinearLayout) viewFindViewById;
            }
            C337180DJs.LIZJ(viewFindViewById);
            View viewFindViewById2 = this.LLJILJIL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.y5n);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJIL = (AppCompatImageView) viewFindViewById2;
            }
            ((AppCompatImageView) viewFindViewById2).setImageDrawable(new C413040GHm());
        } else {
            View viewFindViewById3 = this.LLJIJIL;
            if (viewFindViewById3 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById3 = viewLJJIJL3.findViewById(R.id.y5l);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJIJIL = (LinearLayout) viewFindViewById3;
            }
            C337180DJs.LIZ(viewFindViewById3);
        }
        if (subCashierEnterParams5 != null) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if ((fragmentLJI2 instanceof SubCashierFragment) && (subCashierFragment = (SubCashierFragment) fragmentLJI2) != null) {
                this.LLJJI = new C1710000ubG(subCashierEnterParams5, subCashierFragment, Lo());
            }
        }
        View viewFindViewById4 = this.LLJILJILJ;
        if (viewFindViewById4 == null) {
            View viewLJJIJL4 = LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById4 = viewLJJIJL4.findViewById(R.id.qjx);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJILJILJ = (RecyclerView) viewFindViewById4;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.LLJJI);
        recyclerView.setItemAnimator(null);
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        SubCashierEnterParams subCashierEnterParams6 = Lo().LL;
        String strLIZ = "";
        if (subCashierEnterParams6 == null || (paymentOption = subCashierEnterParams6.parentPaymentOption) == null || (pODaInfo = paymentOption.trackInfo) == null || (str2 = pODaInfo.optionName) == null) {
            str2 = "";
        }
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if ((fragmentLJI3 instanceof PipoCashierBaseFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI3) != null) {
            boolValueOf = Boolean.valueOf(pipoCashierBaseFragment.bS());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SubCashierEnterParams subCashierEnterParams7 = ((C1155270gAX) this.LLJJ.getValue()).LL;
        if (subCashierEnterParams7 != null && (enumC1709020uZg = subCashierEnterParams7.LIZJ) != null) {
            strLIZ = C1709040uZi.LIZ(enumC1709020uZg);
        }
        linkedHashMap.put("enter_from", strLIZ);
        interfaceC1709310ua9LIZIZ.LJ(str2, "continue", boolValueOf, linkedHashMap);
    }
}
