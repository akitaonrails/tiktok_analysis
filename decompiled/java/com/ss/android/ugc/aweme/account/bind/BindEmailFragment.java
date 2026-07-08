package com.ss.android.ugc.aweme.account.bind;

import X.C01GW;
import X.C0DYO;
import X.C0I7D;
import X.C1233960iDS;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237220iIi;
import X.C19293810e0;
import X.C19ME;
import X.C418440Gaw;
import X.C452501pT;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851430Xaf;
import X.C852810Xct;
import X.C852890Xd1;
import X.C853170XdT;
import X.C960203pA;
import X.EnumC638250P1r;
import X.EnumC852910Xd3;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS113S0100000_13;
import Y.AfS182S0100000_13;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.CloseEmailBindingShowEvent;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class BindEmailFragment extends CommonInputEmailFragment {
    public static final C852890Xd1 LLLLLILLIL = new C852890Xd1();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiHELIOSAmJjFiKyY9LGsOICE3DSgtICMVOiQrJCo9PA==";
    public TuxTextView LLLLIL;
    public boolean LLLLILI;
    public final C01GW LLLLJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 34));
    public final C01GW LLLLJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(67));
    public final C01GW LLLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(66));
    public final C01GW LLLLLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(68));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        Bundle arguments;
        Bundle arguments2 = getArguments();
        boolean z = arguments2 != null && arguments2.getBoolean("show_skip");
        boolean z2 = Intrinsics.LJFF(getEnterMethod(), "3p_bind_login") || Intrinsics.LJFF(getEnterMethod(), "3p_bind_signup");
        Bundle arguments3 = getArguments();
        boolean z3 = arguments3 != null ? arguments3.getBoolean("is_changing") : false;
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString((z3 || ((Boolean) this.LLLLJ.getValue()).booleanValue()) ? 2131823028 : 2131823026);
        c1237010iIN.LJIIIZ = zS() ? getString(2131848283) : null;
        c1237010iIN.LIZ = kT() ? getString(2131857337) : " ";
        if (zS()) {
            c1237010iIN.LJIIL = true;
            c1237010iIN.LJIIJJI = "optional_signup_add_email";
            c1237010iIN.LJIILIIL = "aweme://roma_redirect/?spark_page=TT_CSP_Common_TopicList&entrance=PII_email_entry&enter_from=PII_email_entry";
        } else {
            c1237010iIN.LJIIL = false;
        }
        c1237010iIN.LJIIJ = true;
        if (z2 || !((arguments = getArguments()) == null || arguments.getBoolean("is_skippable", true))) {
            c1237010iIN.LIZIZ = "";
            c1237010iIN.LJFF = false;
        } else if (z) {
            if (kT()) {
                String string = getString(2131857334);
                c1237010iIN.LIZLLL = string != null ? string : "";
                c1237010iIN.LJFF = false;
            } else {
                c1237010iIN.LIZIZ = getString(2131857423);
                if (zS()) {
                    c1237010iIN.LIZJ = EnumC638250P1r.SECONDARY;
                }
            }
        } else if (kT()) {
            c1237010iIN.LJI = true;
        }
        c1237010iIN.LJIJ = new C1237030iIP(null, C1236870iI9.LIZ(zS()), C1236870iI9.LIZIZ(zS()), null, 9);
        return c1237010iIN;
    }

    public final TuxTextView jT() {
        View viewFindViewById = this.LLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dnx) : null;
            this.LLLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void ES() {
        String string;
        if (!zS()) {
            super.ES();
            return;
        }
        CloseEmailBindingShowEvent closeEmailBindingShowEvent = new CloseEmailBindingShowEvent();
        closeEmailBindingShowEvent.LJI(getEnterFrom(), "enter_from");
        closeEmailBindingShowEvent.LJI(getEnterMethod(), "enter_method");
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("page")) == null) {
            string = "";
        }
        closeEmailBindingShowEvent.LJI(string, "page");
        closeEmailBindingShowEvent.LJI("click_skip", "exit_method");
        closeEmailBindingShowEvent.LJI("binding_page", "exit_page");
        closeEmailBindingShowEvent.LJIIIIZZ();
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        arguments2.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
        arguments2.putInt("previous_page", VR().getValue());
        fo(arguments2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        TuxTextView tuxTextViewMS;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.LLIIIZ();
        if (zS() && (tuxTextViewMS = mS()) != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextViewMS.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.topMargin = ((Number) this.LLLLJI.getValue()).intValue();
            C786410Ut5.R6(tuxTextViewMS, marginLayoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLIL = null;
    }

    public final boolean kT() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getInt("progress", -1) >= 0;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
        View view;
        super.ln();
        if (zS() && (view = getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS113S0100000_13(this, 83));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        boolean z;
        String string;
        if (zS()) {
            return true;
        }
        C0I7D c0i7d = this.LLLJIL;
        if (c0i7d != null) {
            KeyboardUtils.LIZIZ(c0i7d);
        }
        C851430Xaf.LIZJ(getEnterFrom(), null, getEnterMethod(), "email");
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("show_skip", false);
            if (z) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string = arguments2.getString("page")) == null) {
                    string = "";
                }
                if (Intrinsics.LJFF(string, "twosv_setup")) {
                    C1233960iDS c1233960iDS = C1233960iDS.LIZ;
                    String enterFrom = getEnterFrom();
                    String enterMethod = getEnterMethod();
                    c1233960iDS.getClass();
                    C1233960iDS.LJIILL(enterFrom, enterMethod, "email");
                }
            }
        } else {
            z = false;
        }
        if (!kT() || z) {
            super.onBackPressed();
            return false;
        }
        if (C784500Uq0.LIZJ(getActivity())) {
            return true;
        }
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C0XYD
    public final void dk(int i) {
        if (zS() && !this.LLLLILI) {
            return;
        }
        super.dk(i);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void iT(String str) {
        C1237220iIi c1237220iIi;
        this.LLLLILI = true;
        if (OR().yQ2()) {
            OR().wQ2(new CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction(new C853170XdT(str), this));
            return;
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        c852810Xct.getClass();
        C852810Xct.LJIIZILJ(this, str);
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(getActivity(), str, SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            c852810Xct.getClass();
            C852810Xct.LJIILJJIL(this, false);
            Bundle arguments = getArguments();
            arguments.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_BIND.getValue());
            fo(arguments);
            return;
        }
        LLLLLILLIL.invoke(this, str, "user_click").LJIIIIZZ(new AfS182S0100000_13(this, 10)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        String enterFrom = getEnterFrom();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("page")) == null) {
            string = "";
        }
        String enterMethod = getEnterMethod();
        C852810Xct.LIZ.getClass();
        C851430Xaf.LIZLLL(enterFrom, string, enterMethod, C852810Xct.LIZ(this), C852810Xct.LIZJ(this));
        C851430Xaf.LJ(getEnterFrom(), "email", null, getEnterMethod());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String string;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("show_skip")) {
            z = true;
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("page")) == null) {
            string = "";
        }
        if (Intrinsics.LJFF(string, "twosv_setup")) {
            TuxTextView tuxTextViewJT = jT();
            if (!z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextViewJT, i);
            jT().setText(getString(2131847694));
            Context context = getContext();
            if (context != null && context.getResources() != null) {
                jT().setTextColorRes(R.attr.a1k);
                jT().setTuxFont(51);
            }
        } else {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && arguments3.getBoolean("use_phone")) {
                C786410Ut5.LLLLZLL(jT(), 0);
                jT().setTextColor(C960203pA.LIZ(R.attr.a1h, view.getContext()));
                jT().setTuxFont(42);
                TuxTextView tuxTextViewJT2 = jT();
                ACListenerS148S0100000_13 aCListenerS148S0100000_13 = new ACListenerS148S0100000_13(this, 40);
                tuxTextViewJT2.setText(getString(2131836809));
                tuxTextViewJT2.setTextColorRes(R.attr.a1n);
                C0DYO.LIZ(tuxTextViewJT2);
                GS(aCListenerS148S0100000_13, tuxTextViewJT2);
            }
        }
        if (zS()) {
            TuxTextView tuxTextViewFT = fT();
            if (tuxTextViewFT != null) {
                C786410Ut5.LLLLZLL(tuxTextViewFT, 0);
                C19293810e0.LIZJ(tuxTextViewFT.getContext(), tuxTextViewFT, 12, new View.OnClickListener() { // from class: X.0Xda
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                });
                ViewGroup.LayoutParams layoutParams3 = tuxTextViewFT.getLayoutParams();
                if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                    layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
            }
            TuxTextView tuxTextViewJT3 = jT();
            if (tuxTextViewJT3 != null) {
                tuxTextViewJT3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                ViewGroup.LayoutParams layoutParams4 = tuxTextViewJT3.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
            }
        }
    }
}
