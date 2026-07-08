package com.ss.android.ugc.aweme.account.setpwd;

import X.C01GW;
import X.C0DYO;
import X.C0HZQ;
import X.C0I7D;
import X.C0XGR;
import X.C0XQ5;
import X.C1232150iAX;
import X.C1233960iDS;
import X.C1236870iI9;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237890iJn;
import X.C197039127h;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851940XbU;
import X.C852500XcO;
import X.C852810Xct;
import X.C854000Xeo;
import X.C854460XfY;
import X.EnumC852660Xce;
import X.InterfaceC853790XeT;
import X.InterfaceC854030Xer;
import X.ViewOnClickListenerC854450XfX;
import Y.ACListenerS148S0100000_13;
import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import p5a.a;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyPasswordFragment extends BaseAccountBindingsFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiOionODIoZxk2OiwqMB8yOzY7Jj03DjctLiI2JjE=";
    public C1237890iJn LLLIL;
    public View LLLILZ;
    public C0HZQ LLLILZJ;
    public TuxTextView LLLILZLLLI;
    public ConstraintLayout LLLIZZ;
    public C0I7D LLLJ;
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 101));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 99));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 97));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS557S0100000_13(this, 102));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 103));
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 98));
    public boolean LLLLIILL = true;
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 100));
    public C197039127h LLLLIL;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0z;
    }

    public final C0HZQ ZS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dq1) : null;
            this.LLLILZJ = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final View eT() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpu) : null;
            this.LLLILZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C1237890iJn fT() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q3k) : null;
            this.LLLIL = (C1237890iJn) viewFindViewById;
        }
        return (C1237890iJn) viewFindViewById;
    }

    public final String gT() {
        return (String) this.LLLLII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C852810Xct.LIZ.getClass();
        boolean zLJIIL = C852810Xct.LJIIL(this);
        boolean z = SR() == EnumC852660Xce.MODIFY_PHONE || SR() == EnumC852660Xce.CHANGE_EMAIL || SR() == EnumC852660Xce.UNBIND_EMAIL || SR() == EnumC852660Xce.UNBIND_PHONE;
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIJ = new C1237030iIP(null, C1236870iI9.LIZ(zLJIIL), C1236870iI9.LIZIZ(zLJIIL), null, 9);
        c1237010iIN.LJIIIIZZ = getString(2131829313);
        c1237010iIN.LJIIIZ = " ";
        c1237010iIN.LJIIJJI = "verify_enter_password_page";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LIZ = getString(2131857404);
        if (!z) {
            if (!zLJIIL) {
                c1237010iIN.LJIIIIZZ = getString(2131857406);
                c1237010iIN.LJIIIZ = getString(2131857405);
                c1237010iIN.LJIILL = false;
                return c1237010iIN;
            }
            c1237010iIN.LIZ = getString(2131857339);
            c1237010iIN.LJIIIIZZ = getString(2131857340);
            c1237010iIN.LJIIL = true;
        }
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        C852810Xct.LIZ.getClass();
        if (!C852810Xct.LJIIL(this)) {
            C0XQ5.LJIIJJI(17, 2, new Bundle());
        }
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        nS().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLLIZZ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(VerifyPasswordFragment.class.getName());
        }
        super.onResume();
        C0I7D c0i7d = this.LLLJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        C1232150iAX.LIZ(c0i7d);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C0I7D c0i7d = this.LLLJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        c0i7d.setText("");
    }

    public static abstract class VerifyPasswordActions implements InterfaceC853790XeT<InterfaceC854030Xer> {
        public static final int $stable = 8;
        public final InterfaceC854030Xer params;

        public abstract BaseAccountFlowFragment getFragment();

        public static final class ClickNextAction extends VerifyPasswordActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C854000Xeo params;

            public final ClickNextAction copy(C854000Xeo c854000Xeo, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickNextAction(c854000Xeo, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickNextAction)) {
                    return false;
                }
                ClickNextAction clickNextAction = (ClickNextAction) obj;
                return Intrinsics.LJFF(this.params, clickNextAction.params) && Intrinsics.LJFF(this.fragment, clickNextAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickNextAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment.VerifyPasswordActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment.VerifyPasswordActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C854000Xeo mo158getParams() {
                return this.params;
            }

            public ClickNextAction(C854000Xeo c854000Xeo, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c854000Xeo);
                this.params = c854000Xeo;
                this.fragment = baseAccountFlowFragment;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC854030Xer mo158getParams() {
            return this.params;
        }

        public VerifyPasswordActions(InterfaceC854030Xer interfaceC854030Xer) {
            this.params = interfaceC854030Xer;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        C20684815ws.LJIILLIIL("verify_enter_password", c0xgr.LIZ);
        if (!OR().yQ2()) {
            VS();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        if (((Boolean) this.LLLLIILLL.getValue()).booleanValue()) {
            C1233960iDS.LJ(C1233960iDS.LIZ, getEnterFrom(), getEnterMethod(), "password");
        }
        C786410Ut5.I7(new ACListenerS148S0100000_13(view, 25), view);
        int i = 0;
        nS().setEnabled(false);
        this.LLLLIL = nS();
        C0I7D c0i7d = fT().getInputBox().LLJLILLLLZIIL;
        this.LLLJ = c0i7d;
        View viewFindViewById = null;
        if (c0i7d == null) {
            c0i7d = null;
        }
        c0i7d.setHint(getString(2131837675));
        c0i7d.addTextChangedListener(new C851940XbU() { // from class: X.0Xe1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int length;
                VerifyPasswordFragment verifyPasswordFragment = this.LL;
                C197039127h c197039127h = verifyPasswordFragment.LLLLIL;
                C0I7D c0i7d2 = null;
                if (c197039127h != null) {
                    C0I7D c0i7d3 = verifyPasswordFragment.LLLJ;
                    if (c0i7d3 == null) {
                        c0i7d3 = null;
                    }
                    c197039127h.setEnabled(!C1232150iAX.LIZJ(c0i7d3));
                }
                this.LL.fT().LIZ();
                VerifyPasswordFragment verifyPasswordFragment2 = this.LL;
                C197039127h c197039127h2 = verifyPasswordFragment2.LLLLIL;
                if (c197039127h2 != null) {
                    C0I7D c0i7d4 = verifyPasswordFragment2.LLLJ;
                    if (c0i7d4 != null) {
                        c0i7d2 = c0i7d4;
                    }
                    c197039127h2.setEnabled(!C1232150iAX.LIZJ(c0i7d2));
                }
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                VerifyPasswordFragment verifyPasswordFragment3 = this.LL;
                if (verifyPasswordFragment3.LLLLIILL && length > 0) {
                    verifyPasswordFragment3.LLLLIILL = false;
                    C852810Xct.LIZ.getClass();
                    if (C852810Xct.LJIIL(verifyPasswordFragment3)) {
                        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
                        String enterFrom = this.LL.getEnterFrom();
                        String enterMethod = this.LL.getEnterMethod();
                        String strGT = this.LL.gT();
                        c1233960iDS.getClass();
                        C1233960iDS.LJIIZILJ(enterFrom, enterMethod, strGT, "password");
                    }
                    if (C1697810uHb.LJIIJJI(EnumC852660Xce.MODIFY_PHONE, EnumC852660Xce.CHANGE_EMAIL, EnumC852660Xce.UNBIND_PHONE, EnumC852660Xce.UNBIND_EMAIL).contains(this.LL.SR())) {
                        this.LL.XS(EnumC854430XfV.PASSWORD);
                        return;
                    }
                    if (!((Boolean) this.LL.LLLLIILLL.getValue()).booleanValue()) {
                        return;
                    }
                    C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
                    String enterFrom2 = this.LL.getEnterFrom();
                    String enterMethod2 = this.LL.getEnterMethod();
                    c1233960iDS2.getClass();
                    C1233960iDS.LJFF(enterFrom2, enterMethod2, "password");
                }
            }
        });
        C1237010iIN c1237010iIN = this.LLJZ;
        if (c1237010iIN != null && (str = c1237010iIN.LJIIJJI) != null) {
            C852500XcO c852500XcO = C852500XcO.LIZ;
            View viewET = eT();
            C852810Xct.LIZ.getClass();
            boolean zLJIIL = C852810Xct.LJIIL(this);
            c852500XcO.getClass();
            viewET.setOnTouchListener(new a(0.5f, 150L));
            C786410Ut5.I7(new ViewOnClickListenerC854450XfX(this, str, false, zLJIIL), viewET);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dnx);
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LJIIL(this)) {
            C1236880iIA.LIZ(ZS(), getContext());
            ZS().setChecked(TwoStepAuthApi.LJI());
            C786410Ut5.D7(ZS(), new CompoundButton.OnCheckedChangeListener() { // from class: X.0Xcd
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", z);
                }
            });
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            C786410Ut5.LLLLLZ(ZS(), 0);
            View viewFindViewById2 = this.LLLILZLLLI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.dq5);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLILZLLLI = (TuxTextView) viewFindViewById2;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById2, 0);
            View view3 = this.LLLIZZ;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.dpv);
                }
                this.LLLIZZ = (ConstraintLayout) viewFindViewById;
                view3 = viewFindViewById;
            }
            C786410Ut5.Y7((ConstraintLayout) view3, new ACListenerS148S0100000_13(this, 26));
            if (!((List) this.LLLLIIIILLL.getValue()).isEmpty()) {
                C786410Ut5.LJLLLLLL(8, eT());
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    C786410Ut5.h9(tuxTextView, new ACListenerS148S0100000_13(this, 27));
                }
            } else {
                C786410Ut5.LJLLLLLL(0, eT());
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
            }
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            String strGT = gT();
            c1233960iDS.getClass();
            C1233960iDS.LJIJI(enterFrom, enterMethod, strGT, "password");
            GS(new ACListenerS148S0100000_13(this, 28), this.LLLLIL);
        } else {
            if (QS()) {
                if (tuxTextView != null) {
                    C854460XfY c854460XfY = C854460XfY.LIZ;
                    VerificationMethodType verificationMethodTypeNS = NS();
                    c854460XfY.getClass();
                    if (!(!((ArrayList) C854460XfY.LJFF(this, verificationMethodTypeNS)).isEmpty())) {
                        i = 8;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, i);
                    C786410Ut5.h9(tuxTextView, new ACListenerS148S0100000_13(this, 29));
                }
            } else if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            C786410Ut5.LLLLLZ(ZS(), 8);
            View view5 = this.LLLILZLLLI;
            if (view5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById = view6.findViewById(R.id.dq5);
                }
                this.LLLILZLLLI = (TuxTextView) viewFindViewById;
                view5 = viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) view5, 8);
            C786410Ut5.LJLLLLLL(8, eT());
            GS(new View.OnClickListener() { // from class: X.0Xe3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view7) {
                    if (this.LL.OR().yQ2()) {
                        AccountFlowSharedViewModel accountFlowSharedViewModelOR = this.LL.OR();
                        C0I7D c0i7d2 = this.LL.LLLJ;
                        if (c0i7d2 == null) {
                            c0i7d2 = null;
                        }
                        accountFlowSharedViewModelOR.wQ2(new VerifyPasswordFragment.VerifyPasswordActions.ClickNextAction(new C854000Xeo(C2204961BRm.LLJILLL(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFvtmuhJujJVilJYwCJezeKMxLp6UyLKDWlTWS64=", null)).toString()), this.LL));
                        return;
                    }
                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                    VerifyPasswordFragment verifyPasswordFragment = this.LL;
                    C0I7D c0i7d3 = verifyPasswordFragment.LLLJ;
                    if (c0i7d3 == null) {
                        c0i7d3 = null;
                    }
                    String string = C2204961BRm.LLJILLL(c0i7d3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFvtmuhJujJVilJYwCJezeKMxLp6UyLKDWlTWS64=", null)).toString();
                    C854460XfY c854460XfY2 = C854460XfY.LIZ;
                    VerifyPasswordFragment verifyPasswordFragment2 = this.LL;
                    c854460XfY2.getClass();
                    Map mapLJIIJJI = C854460XfY.LJIIJJI(verifyPasswordFragment2);
                    c0xz4.getClass();
                    C0XZ4.LJJIZ(verifyPasswordFragment, verifyPasswordFragment, string, mapLJIIJJI).LJIIIIZZ(new AfS149S0200000_13(view, this.LL, 12)).LJII(new AfS182S0100000_13(this.LL, 54)).LJIILL();
                }
            }, this.LLLLIL);
        }
        if (tuxTextView != null) {
            C0DYO.LIZ(tuxTextView);
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        fT().LIZIZ(str);
    }
}
