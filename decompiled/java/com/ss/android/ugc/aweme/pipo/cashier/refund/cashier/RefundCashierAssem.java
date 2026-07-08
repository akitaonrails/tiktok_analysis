package com.ss.android.ugc.aweme.pipo.cashier.refund.cashier;

import X.AbstractC1711120ud4;
import X.C019F;
import X.C098200Yq;
import X.C0PEM;
import X.C1155650gB9;
import X.C1165570gR9;
import X.C1227904rF;
import X.C13LE;
import X.C1533950q1J;
import X.C1548870qPN;
import X.C1559260qg8;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1708030uY5;
import X.C1708080uYA;
import X.C1708610uZ1;
import X.C1709100uZo;
import X.C1709110uZp;
import X.C1710910ucj;
import X.C1711230udF;
import X.C1711250udH;
import X.C1749280vcc;
import X.C1776200wK2;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C413040GHm;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC1709240ua2;
import X.EnumC1710920uck;
import X.EnumC1711310udN;
import X.InterfaceC1548890qPP;
import X.InterfaceC1708000uY2;
import X.InterfaceC1709310ua9;
import X.InterfaceC1711270udJ;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS13S2100000_26;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundMethodData;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import wh6.AbS705S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierAssem extends UIContentAssem implements InterfaceC1548890qPP, InterfaceC1711270udJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C1711250udH LLIZLLLIL;
    public C1749280vcc LLJ;
    public ConstraintLayout LLJI;
    public LinearLayout LLJIJIL;
    public AppCompatImageView LLJILJIL;
    public C197039127h LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C1559260qg8 LLJJ;
    public RefundCashierBasicInfo LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public AbstractC1711120ud4 LLJJIJIL;
    public EnumC1710920uck LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RefundCashierAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/refund/cashier/RefundCashierViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RefundCashierAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RefundCashierViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 751), AFwS268S0000000_26.get$arr$(440), null, true);
        this.LLJJ = new C1559260qg8(new C723590SZx(this, C1155650gB9.class, null), checkSupervisorPrepared());
        this.LLJJIJIL = C1711230udF.LIZ;
        this.LLJJJ = EnumC1710920uck.LL;
    }

    public final ConstraintLayout Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cb4) : null;
            this.LLJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C197039127h Jo() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cal) : null;
            this.LLJILJILJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1155650gB9 Lo() {
        return (C1155650gB9) this.LLJJ.getValue();
    }

    public final C1711250udH No() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f804t28) : null;
            this.LLIZLLLIL = (C1711250udH) viewFindViewById;
        }
        return (C1711250udH) viewFindViewById;
    }

    public final C1749280vcc So() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
            this.LLJ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final RefundCashierViewModel Vo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (RefundCashierViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        new C1548870qPN().LJI("pipo_user_register_result", this);
        super.onDestroy();
    }

    public final void LLJJJJJIL() {
        C786410Ut5.LLLZLZ(So(), 0);
        So().LJ();
        C1711250udH c1711250udHNo = No();
        int visibility = c1711250udHNo.getVisibility();
        c1711250udHNo.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1711250udHNo);
        C786410Ut5.LL(8, Ho());
    }

    public final String Oo() {
        String str;
        C1709110uZp c1709110uZp = Lo().LL;
        return (c1709110uZp == null || (str = c1709110uZp.LJIIJ) == null) ? "" : str;
    }

    public final void ap() {
        if (So().getVisibility() == 0 && So().LLJIJIL) {
            return;
        }
        LLJJJJJIL();
        Vo().vQ2();
    }

    public final void cp() {
        C197039127h c197039127hJo = Jo();
        Context context = getContext();
        c197039127hJo.setText(context != null ? context.getString(2131857127) : null);
        Jo().setButtonStartIcon(0);
        Jo().setEnabled(C1533950q1J.LJ(this.LLJJIJIIJIL));
        C786410Ut5.I7(new AbS705S0100000_26(this, 3), Jo());
    }

    public final void bp(boolean z) {
        String str;
        PipoCashierBaseFragment pipoCashierBaseFragment;
        String str2;
        C1709110uZp c1709110uZp;
        C1155650gB9 c1155650gB9Lo = Lo();
        PipoCashierBaseFragment pipoCashierBaseFragment2 = null;
        if (c1155650gB9Lo != null && (c1709110uZp = c1155650gB9Lo.LL) != null) {
            str = c1709110uZp.LJIIJ;
        } else {
            str = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        HashMap map = new HashMap();
        map.put("page_name", "select_refund_method");
        map.put("button_name", "continue");
        Go("payment_option", map);
        interfaceC1709310ua9LIZIZ.LIZ("tiktokls_button_click", map);
        if (C1533950q1J.LJ(this.LLJJIJI) && !z) {
            this.LLJJJ = EnumC1710920uck.LLILLJJLI;
            C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
            C1709110uZp c1709110uZp2 = Lo().LL;
            if (c1709110uZp2 == null || (str2 = c1709110uZp2.LJIIJ) == null) {
                str2 = "";
            }
            c1708030uY5.LIZ(new C1708080uYA(str2)).LIZJ("set_pin", null);
            SmartRouter.buildRoute(getContext(), this.LLJJIJI).open();
            new C1548870qPN().LJFF("pipo_user_register_result", this);
            return;
        }
        Jo().setLoading(true);
        String str3 = this.LLJJIJIIJIL;
        if (str3 != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if ((fragmentLJI instanceof RefundCashierFragment) && (pipoCashierBaseFragment = (PipoCashierBaseFragment) fragmentLJI) != null) {
                pipoCashierBaseFragment.UR(true);
            }
            try {
                C1227904rF.LIZ.getClass();
                RefundMethodData refundMethodData = (RefundMethodData) C1227904rF.LIZIZ(str3, RefundMethodData.class);
                if (refundMethodData != null) {
                    RefundCashierViewModel refundCashierViewModelVo = Vo();
                    C1709110uZp c1709110uZp3 = refundCashierViewModelVo.LL;
                    if (c1709110uZp3 == null) {
                        refundCashierViewModelVo.setState(AFwS268S0000000_26.get$arr$(498));
                        return;
                    }
                    C1708030uY5.LIZ.LIZ(new C1708080uYA(c1709110uZp3.LJIIJ)).LIZJ("refund_api", null);
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1165570gR9(refundCashierViewModelVo, null), 2);
                    C23250099c.LIZLLL(c817503Hh, C0PEM.LIZJ, null, new C1709100uZo(refundCashierViewModelVo, c1709110uZp3, refundMethodData, null), 2);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 instanceof RefundCashierFragment) {
                pipoCashierBaseFragment2 = (PipoCashierBaseFragment) fragmentLJI2;
            }
            if (pipoCashierBaseFragment2 != null) {
                pipoCashierBaseFragment2.UR(false);
            }
            Jo().setLoading(false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        EnumC1709240ua2 enumC1709240ua2;
        EnumC1709240ua2 enumC1709240ua22;
        int i;
        EnumC1709240ua2 enumC1709240ua23;
        String str2;
        C1711250udH c1711250udHNo = No();
        int visibility = c1711250udHNo.getVisibility();
        c1711250udHNo.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1711250udHNo);
        No().setUIMode(EnumC1711310udN.MAIN);
        C1711250udH c1711250udHNo2 = No();
        C1709110uZp c1709110uZp = Lo().LL;
        String str3 = "";
        if (c1709110uZp == null || (str = c1709110uZp.LJIIJ) == null) {
            str = "";
        }
        C1709110uZp c1709110uZp2 = Lo().LL;
        if (c1709110uZp2 != null && (str2 = c1709110uZp2.LJIIJJI) != null) {
            str3 = str2;
        }
        c1711250udHNo2.LIZIZ(str, str3);
        C1711250udH c1711250udHNo3 = No();
        C1709110uZp c1709110uZp3 = Lo().LL;
        if (c1709110uZp3 == null || (enumC1709240ua2 = c1709110uZp3.LJIIIZ) == null) {
            enumC1709240ua2 = EnumC1709240ua2.DEFAULT;
        }
        c1711250udHNo3.setTheme(enumC1709240ua2.ordinal());
        No().setRefundOptionChangeCallback(this);
        No().setRefundActionStateCallback$cashier_release(new AwS605S0100000_26(this, 465));
        No().setRefundLinkActionCallback$cashier_release(new AwS605S0100000_26(this, 382));
        C786410Ut5.LLLZLZ(So(), 8);
        C786410Ut5.LL(8, Ho());
        C1709110uZp c1709110uZp4 = Lo().LL;
        String string = null;
        if (c1709110uZp4 != null) {
            enumC1709240ua22 = c1709110uZp4.LJIIIZ;
        } else {
            enumC1709240ua22 = null;
        }
        int i2 = -1;
        if (enumC1709240ua22 == null) {
            i = -1;
        } else {
            i = C1710910ucj.LIZ[enumC1709240ua22.ordinal()];
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
        C1709110uZp c1709110uZp5 = Lo().LL;
        if (c1709110uZp5 != null && (enumC1709240ua23 = c1709110uZp5.LJIIIZ) != null) {
            i2 = C1710910ucj.LIZ[enumC1709240ua23.ordinal()];
        }
        if (i2 == 1) {
            Context context = getContext();
            if (context != null) {
                Jo().LJJJJL(new AwS580S0100000_1(context, 367));
            }
            RefundCashierViewModel refundCashierViewModelVo = Vo();
            selectSubscribe(refundCashierViewModelVo, new C2217381BqS() { // from class: X.0ud5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0ud6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLILLJJLI;
                }
            }, new C2217381BqS() { // from class: X.0udA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLILZ;
                }
            }, new C2217381BqS() { // from class: X.0udB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLILLL;
                }
            }, C736820SvI.LIZIZ(refundCashierViewModelVo.usedInReusedScene), null, new C1776200wK2(this, 6));
            RefundCashierViewModel refundCashierViewModelVo2 = Vo();
            selectSubscribe(refundCashierViewModelVo2, new C2217381BqS() { // from class: X.0ud8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLILZIL;
                }
            }, new C2217381BqS() { // from class: X.0ud9
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLILZLL;
                }
            }, new C2217381BqS() { // from class: X.0udC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLIZ;
                }
            }, new C2217381BqS() { // from class: X.0udD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1711150ud7) obj).LLIZLLLIL;
                }
            }, C736820SvI.LIZIZ(refundCashierViewModelVo2.usedInReusedScene), null, new C1776200wK2(this, 5));
            Vo().LL = Lo().LL;
            ap();
        }
        Jo().setButtonVariant(0);
        C197039127h c197039127hJo = Jo();
        Context context2 = getContext();
        if (context2 != null) {
            string = context2.getString(2131857127);
        }
        c197039127hJo.setText(string);
        Jo().setEnabled(false);
        cp();
        RefundCashierViewModel refundCashierViewModelVo3 = Vo();
        selectSubscribe(refundCashierViewModelVo3, new C2217381BqS() { // from class: X.0ud5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0ud6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0udA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0udB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(refundCashierViewModelVo3.usedInReusedScene), null, new C1776200wK2(this, 6));
        RefundCashierViewModel refundCashierViewModelVo22 = Vo();
        selectSubscribe(refundCashierViewModelVo22, new C2217381BqS() { // from class: X.0ud8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0ud9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0udC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0udD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1711150ud7) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZIZ(refundCashierViewModelVo22.usedInReusedScene), null, new C1776200wK2(this, 5));
        Vo().LL = Lo().LL;
        ap();
    }

    public final void Go(String str, Map map) {
        Object c098200Yq;
        String str2;
        String str3 = this.LLJJIJIIJIL;
        if (str3 != null) {
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(str3), "refund_method_details");
                if (jSONArray.length() > 1) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                HashMap map2 = (HashMap) map;
                map2.put("is_combined_method", str2);
                if (jSONArray.length() > 0) {
                    map2.put(str, JSONArrayProtectorUtils.getJSONObject(jSONArray, 0).optString("option_name"));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    public final void Zo(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        C1709110uZp c1709110uZp;
        String str6;
        C1709110uZp c1709110uZp2;
        C1709110uZp c1709110uZp3;
        C1709110uZp c1709110uZp4;
        C1155650gB9 c1155650gB9Lo = Lo();
        if (c1155650gB9Lo != null && (c1709110uZp4 = c1155650gB9Lo.LL) != null) {
            str2 = c1709110uZp4.LJIIJ;
        } else {
            str2 = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str2);
        HashMap map = new HashMap();
        map.put("page_name", "select_refund_method");
        C1155650gB9 c1155650gB9Lo2 = Lo();
        String str7 = "";
        if (c1155650gB9Lo2 == null || (c1709110uZp3 = c1155650gB9Lo2.LL) == null || (str3 = c1709110uZp3.LJFF) == null) {
            str3 = "";
        }
        map.put("total_payment", str3);
        C1155650gB9 c1155650gB9Lo3 = Lo();
        if (c1155650gB9Lo3 == null || (c1709110uZp2 = c1155650gB9Lo3.LL) == null || (str4 = c1709110uZp2.LJI) == null) {
            str4 = "";
        }
        map.put("currency", str4);
        C1155650gB9 c1155650gB9Lo4 = Lo();
        if (c1155650gB9Lo4 != null && (c1709110uZp = c1155650gB9Lo4.LL) != null && (str6 = c1709110uZp.LJII) != null) {
            str7 = str6;
        }
        map.put("merchant_refund_id", str7);
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_success", str5);
        map.put("fail_reason", str);
        Go("payment_method", map);
        interfaceC1709310ua9LIZIZ.LIZ("tiktokls_submit_refund_result", map);
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        Object c098200Yq;
        String str3;
        if (Intrinsics.LJFF(str, "pipo_user_register_result")) {
            try {
                boolean zEquals = TextUtils.equals(new JSONObject(str2).optString("result"), "success");
                EnumC1710920uck enumC1710920uck = this.LLJJJ;
                this.LLJJJ = EnumC1710920uck.LL;
                int iOrdinal = enumC1710920uck.ordinal();
                if (iOrdinal != 0) {
                    int i = 1;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            if (zEquals) {
                                ap();
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        if (zEquals) {
                            bp(true);
                        }
                        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
                        C1709110uZp c1709110uZp = Lo().LL;
                        if (c1709110uZp == null || (str3 = c1709110uZp.LJIIJ) == null) {
                            str3 = "";
                        }
                        InterfaceC1708000uY2 interfaceC1708000uY2LIZ = c1708030uY5.LIZ(new C1708080uYA(str3));
                        if (!zEquals) {
                            i = 0;
                        }
                        interfaceC1708000uY2LIZ.LIZIZ("set_pin", null, null, i);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }

    @Override // X.InterfaceC1711270udJ
    public final void Pb(String str, String str2, String str3) {
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS13S2100000_26(this, str3, str, 1));
    }
}
