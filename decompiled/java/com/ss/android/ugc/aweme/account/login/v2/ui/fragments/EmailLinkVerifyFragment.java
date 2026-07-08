package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0HTI;
import X.C0HZQ;
import X.C0XGR;
import X.C0XUD;
import X.C0XZ4;
import X.C0XZL;
import X.C1234920iF0;
import X.C1236880iIA;
import X.C1236950iIH;
import X.C1236990iIL;
import X.C1237010iIN;
import X.C1237220iIi;
import X.C1247510iZJ;
import X.C1389890mGx;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851620Xay;
import X.C851660Xb2;
import X.C851910XbR;
import X.C852810Xct;
import X.EnumC850750XYz;
import X.EnumC852910Xd3;
import X.InterfaceC1234930iF1;
import X.InterfaceC851650Xb1;
import Y.ACListenerS154S0100000_19;
import Y.ACListenerS85S0300000_19;
import Y.ARunnableS119S0100000_19;
import Y.AfS85S0101000_19;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailLinkVerifyFragment extends BaseAccountBindingsFlowFragment implements InterfaceC1234930iF1, InterfaceC851650Xb1 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZgAhKCY/BCwiIhk2OiwqMAkhKSIhLCEn";
    public C197039127h LLLIL;
    public TuxTextView LLLILZ;
    public TuxTextView LLLILZJ;
    public ImageView LLLILZLLLI;
    public C197039127h LLLIZZ;
    public C1237220iIi LLLLIILL;
    public boolean LLLLIL;
    public final String LLLJ = "email/username";
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 256));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 255));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 257));
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 258));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 259));
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 67));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 260));
    public boolean LLLLILI = true;
    public final C1236950iIH LLLLJ = new C1236950iIH(this);

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.xw;
    }

    @Override // X.InterfaceC1234930iF1
    public final void ND() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        C1234920iF0.LJ(this);
        if (iT()) {
            C786410Ut5.LJJJI("passport_ticket", eT(), bundle);
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_HL_LOGIN_SWITCH_TO_PASSWORD.getValue());
        } else {
            C786410Ut5.LJJJI("passport_ticket", null, bundle);
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue());
            bundle.putInt("current_scene", SR().getValue());
        }
        fo(bundle);
    }

    public final boolean ZS() {
        return ((Boolean) this.LLLL.getValue()).booleanValue();
    }

    public final String eT() {
        return (String) this.LLLLIIIILLL.getValue();
    }

    public final C197039127h fT() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tbn) : null;
            this.LLLIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C197039127h gT() {
        View viewFindViewById = this.LLLIZZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ui2) : null;
            this.LLLIZZ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final String getEmail() {
        return (String) this.LLLJIL.getValue();
    }

    public final boolean hT() {
        return ((Boolean) this.LLLLIIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(" ", null, false, null, null, false, "email_login_homepage", !rS(), false, null, false, null, null, null, null, 67096574);
    }

    public final boolean iT() {
        return ((Boolean) this.LLLLII.getValue()).booleanValue();
    }

    public final void jT() {
        Map<String, String> mapLJIIIIZZ;
        if (ZS() || iT()) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("passport_ticket", eT()), new Pair("email_theme", "2"));
        } else if (Intrinsics.LJFF(RR(), "popup_change_1p_email")) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("passport_ticket", eT()), new Pair("email_source", String.valueOf(C0XZL.LIZ(this))));
        } else {
            mapLJIIIIZZ = NR();
            mapLJIIIIZZ.put("use_passport_ticket", "1");
        }
        int i = (Intrinsics.LJFF(RR(), "popup_verify_1p_email") || (Intrinsics.LJFF(RR(), "popup_change_1p_email") && hT())) ? 6 : (!Intrinsics.LJFF(RR(), "popup_change_1p_email") || hT()) ? ZS() ? 23 : 13 : 7;
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String email = getEmail();
        String str = this.LLLLIL ? "resend" : "click_continue";
        String strRR = RR();
        C0XZ4.LJJIII(c0xz4, this, this, email, i, str, mapLJIIIIZZ, null, null, (Intrinsics.LJFF(strRR, "popup_verify_1p_email") || Intrinsics.LJFF(strRR, "popup_change_1p_email")) ? EnumC850750XYz.LINK_LONG_EXPIRATION : null, null, 704).LJIIIIZZ(new AfS85S0101000_19(i, this, 0)).LJIILL();
    }

    public final void kT() {
        C1237220iIi c1237220iIi = new C1237220iIi(60000L, 1000L, this.LLLLJ);
        if (((Boolean) this.LLLLIILLL.getValue()).booleanValue()) {
            C1236990iIL.LIZIZ(getEmail(), new C851370XaZ(c1237220iIi), SR());
        } else {
            C851360XaY.LIZIZ(getActivity(), getEmail(), new C851370XaZ(c1237220iIi), SR());
        }
        c1237220iIi.LIZJ();
        C851370XaZ c851370XaZLIZ = ((Boolean) this.LLLLIILLL.getValue()).booleanValue() ? C1236990iIL.LIZ(getEmail(), SR()) : C851360XaY.LIZ(getActivity(), getEmail(), SR());
        this.LLLLIILL = c851370XaZLIZ != null ? c851370XaZLIZ.LIZ : null;
    }

    @Override // X.InterfaceC1234930iF1
    public final C1247510iZJ lo() {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131839758);
        c1247510iZJ.LIZ(new AwS598S0100000_19((InterfaceC1234930iF1) this, 94));
        return c1247510iZJ;
    }

    @Override // X.InterfaceC1234930iF1
    public final void Dr() {
        C197039127h c197039127hGT = gT();
        if (c197039127hGT != null) {
            C786410Ut5.LLLLLLJ(c197039127hGT, 0);
            c197039127hGT.setText(getString(2131835945));
            C786410Ut5.U8(c197039127hGT, new ACListenerS154S0100000_19(this, 62));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        fT().setLoading(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        fT().setLoading(false);
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

    @Override // X.InterfaceC1234930iF1
    public final void mp() {
        C197039127h c197039127hGT = gT();
        if (c197039127hGT != null) {
            C786410Ut5.LLLLLLJ(c197039127hGT, 8);
        }
    }

    @Override // X.InterfaceC1234930iF1
    public final C0XGR nP() {
        return C1234920iF0.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0HZQ c0hzq;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EmailLinkVerifyFragment.class.getName());
        }
        super.onResume();
        if (ZS() && (c0hzq = this.LLLF) != null) {
            HandlerHook.viewPostDelay(c0hzq, new ARunnableS119S0100000_19(this, 21), 100L);
        }
        if (this.LLLLILI) {
            this.LLLLILI = false;
        } else {
            C20684815ws.LJIILLIIL("switch_to_verify_login", nP().LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLJ;
    }

    @Override // X.InterfaceC1234930iF1
    public final C1247510iZJ HL(Context context) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131835945);
        c1247510iZJ.LIZ(new AwS385S0200000_19(this, context, 16));
        return c1247510iZJ;
    }

    @Override // X.InterfaceC1234930iF1
    public final void e4(String str) {
        PhoneNumberUtil.PhoneNumber phoneNumberLIZLLL = PhoneNumberUtil.LIZLLL(str);
        if (phoneNumberLIZLLL != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIJ(this, phoneNumberLIZLLL);
        }
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIJI(getArguments(), str);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
        arguments.putInt("current_scene", SR().getValue());
        arguments.putBoolean("code_sent", false);
        C20684815ws.LJIILLIIL("email_login_enter_phone", nP().LIZ);
        fo(arguments);
    }

    @Override // X.InterfaceC1234930iF1
    public final void e9(Context context) {
        C1234920iF0.LJFF(this, context);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILL(arguments, "email_verification");
        }
        AvailableWaysViewModel.GetAvailableWayType getAvailableWayTypeLIZIZ = C1234920iF0.LIZIZ(this);
        if (getAvailableWayTypeLIZIZ.shouldGetAvailableWays) {
            if (getAvailableWayTypeLIZIZ.shouldFetchAvailableWaysOnCreate) {
                C19EG activity = getActivity();
                if (activity != null) {
                    ((AvailableWaysViewModel) ViewModelProviders.of(activity).get(AvailableWaysViewModel.class)).wQ2(getEmail(), eT(), getEnterFrom(), getEnterMethod(), PR(), RR());
                }
            } else {
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    ((AvailableWaysViewModel) ViewModelProviders.of(activity2).get(AvailableWaysViewModel.class)).vQ2(getEmail());
                }
            }
        }
        C20684815ws.LJIILLIIL("magic_link_page_show", C1234920iF0.LIZJ(this).LIZ);
    }

    @Override // X.InterfaceC1234930iF1
    public final C1247510iZJ ve(String str) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131839757);
        c1247510iZJ.LIZ(new AwS133S1100000_19(this, str, 2));
        return c1247510iZJ;
    }

    @Override // X.InterfaceC1234930iF1
    public final void Us(BaseI18nLoginFragment baseI18nLoginFragment, AvailableWaysViewModel.AvailableWays availableWays) {
        C197039127h c197039127hGT = gT();
        if (c197039127hGT != null) {
            C786410Ut5.LLLLLLJ(c197039127hGT, 0);
            c197039127hGT.setText(getString(2131824501));
            C786410Ut5.U8(c197039127hGT, new ACListenerS85S0300000_19(this, baseI18nLoginFragment, availableWays, 4));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C851370XaZ c851370XaZLIZ;
        C1237220iIi c1237220iIi;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        View viewFindViewById;
        View currentFocus;
        Object objJ2;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        View viewFindViewById2 = null;
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            IBinder windowToken = currentFocus.getWindowToken();
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                objJ2 = C786410Ut5.J2(activity2, "input_method");
            } else {
                objJ2 = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) objJ2;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        if (((Boolean) this.LLLLIILLL.getValue()).booleanValue()) {
            c851370XaZLIZ = C1236990iIL.LIZ(getEmail(), SR());
        } else {
            c851370XaZLIZ = C851360XaY.LIZ(getActivity(), getEmail(), SR());
        }
        if (c851370XaZLIZ != null) {
            c1237220iIi = c851370XaZLIZ.LIZ;
        } else {
            c1237220iIi = null;
        }
        this.LLLLIILL = c1237220iIi;
        if (((Boolean) this.LLLJL.getValue()).booleanValue()) {
            kT();
        } else {
            C1237220iIi c1237220iIi2 = this.LLLLIILL;
            if (c1237220iIi2 != null && c1237220iIi2.LIZIZ()) {
                C1237220iIi c1237220iIi3 = this.LLLLIILL;
                if (c1237220iIi3 != null) {
                    C1236950iIH c1236950iIH = this.LLLLJ;
                    c1237220iIi3.LLIZLLLIL = c1236950iIH;
                    if (c1237220iIi3.LLILZIL && c1236950iIH != null) {
                        c1236950iIH.LIZLLL();
                    }
                }
            } else {
                jT();
            }
        }
        C1237220iIi c1237220iIi4 = this.LLLLIILL;
        if (c1237220iIi4 != null && !c1237220iIi4.LIZIZ()) {
            C197039127h c197039127hFT = fT();
            if (c197039127hFT != null) {
                c197039127hFT.setEnabled(true);
            }
            C197039127h c197039127hFT2 = fT();
            if (c197039127hFT2 != null) {
                c197039127hFT2.setText(getString(2131829385));
            }
        }
        if (rS()) {
            View viewFindViewById3 = this.LLLILZ;
            if (viewFindViewById3 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.dq0);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLLILZ = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(getString(2131833845));
        }
        View viewFindViewById4 = this.LLLILZJ;
        if (viewFindViewById4 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById4 = view3.findViewById(R.id.dpy);
            } else {
                viewFindViewById4 = null;
            }
            this.LLLILZJ = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        if (rS()) {
            spannableStringBuilderLIZLLL = C1236880iIA.LIZLLL(getString(2131858058, getEmail()), new String[]{getEmail()}, 102);
        } else if (Intrinsics.LJFF(RR(), "signup")) {
            spannableStringBuilderLIZLLL = C1236880iIA.LIZLLL(getString(2131833846, getEmail()), new String[]{getEmail()}, 102);
        } else {
            spannableStringBuilderLIZLLL = C1236880iIA.LIZLLL(getString(2131858059, getEmail()), new String[]{getEmail()}, 102);
        }
        textView.setText(spannableStringBuilderLIZLLL);
        Context context = getContext();
        if (context != null) {
            View view4 = this.LLLILZLLLI;
            if (view4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById2 = view5.findViewById(R.id.kfu);
                }
                this.LLLILZLLLI = (ImageView) viewFindViewById2;
                view4 = viewFindViewById2;
            }
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.pc;
            ((ImageView) view4).setImageDrawable(c0hti.LIZ(context));
        }
        ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(this, 61);
        C197039127h c197039127hFT3 = fT();
        if (c197039127hFT3 != null) {
            C786410Ut5.U8(c197039127hFT3, aCListenerS154S0100000_19);
        }
        if (Intrinsics.LJFF(RR(), "login")) {
            C1234920iF0.LJI(this, this, getEmail());
            C197039127h c197039127hGT = gT();
            if (c197039127hGT != null) {
                c197039127hGT.LJJJJL(new AwS598S0100000_19(this, 87));
            }
        } else if (Intrinsics.LJFF(RR(), "popup_verify_1p_email")) {
            C197039127h c197039127hGT2 = gT();
            C786410Ut5.LLLLLLJ(c197039127hGT2, 0);
            c197039127hGT2.setText(getString(2131850227));
            C786410Ut5.U8(c197039127hGT2, new View.OnClickListener() { // from class: X.0iIK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    Bundle bundle2;
                    CommonFlowActivity commonFlowActivity;
                    IBindService iBindServiceLJII = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJII();
                    C19EG activity3 = this.LL.getActivity();
                    if (!(activity3 instanceof CommonFlowActivity) || (commonFlowActivity = (CommonFlowActivity) activity3) == null || (bundle2 = commonFlowActivity.LLLZZIL()) == null) {
                        bundle2 = new Bundle();
                    }
                    Bundle bundle3 = new Bundle(bundle2);
                    bundle3.remove("show_skip");
                    C852810Xct.LIZ.getClass();
                    C852810Xct.LJIILL(bundle3, "email_verification");
                    iBindServiceLJII.bindMobile(this.LL.getActivity(), this.LL.getEnterFrom(), "click_try_phone", bundle3, true, new C1266140j3M(this.LL, 1));
                }
            });
        }
        if (ZS() && (viewFindViewById = view.findViewById(R.id.phl)) != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z = !C0XUD.LJIIJJI;
            String str = this.LLLJ;
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(57);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str, aFwS257S0000000_19, true);
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851620Xay.LIZ(this, enumC852910Xd3, bundle, c851660Xb2);
    }

    @Override // X.InterfaceC1234930iF1
    public final void hB(String str, String str2, boolean z, boolean z2) {
        C1234920iF0.LIZLLL(this, str, str2, z, z2);
    }
}
