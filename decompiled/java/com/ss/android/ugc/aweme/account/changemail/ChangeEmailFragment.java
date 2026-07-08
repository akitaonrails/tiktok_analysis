package com.ss.android.ugc.aweme.account.changemail;

import X.C0DYO;
import X.C0I7D;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237220iIi;
import X.C1697810uHb;
import X.C786410Ut5;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851430Xaf;
import X.C852810Xct;
import X.C852870Xcz;
import X.C853170XdT;
import X.C960203pA;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ChangeEmailFragment extends CommonInputEmailFragment {
    public static final C852870Xcz LLLLJ = new C852870Xcz();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiKicyJiIpJC46JGsPIS49LyAJJC46JAM+KCg+LSs4";
    public C0I7D LLLLIL;
    public TuxTextView LLLLILI;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = SR() == EnumC852660Xce.CHANGE_EMAIL ? getString(2131823028) : getString(2131823026);
        c1237010iIN.LJIIIZ = null;
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = false;
        c1237010iIN.LJIIJ = true;
        c1237010iIN.LJIJ = new C1237030iIP(null, null, null, null, 15);
        return c1237010iIN;
    }

    public final TuxTextView jT() {
        View viewFindViewById = this.LLLLILI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dnx) : null;
            this.LLLLILI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLIL = null;
        this.LLLLILI = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void iT(String str) {
        C1237220iIi c1237220iIi;
        if (OR().yQ2()) {
            OR().wQ2(new CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction(new C853170XdT(str), this));
            return;
        }
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(getActivity(), str, SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            kT(false);
            return;
        }
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIIZILJ(this, str);
        LLLLJ.invoke(this, str, "user_click", null, 7).LJIIIIZZ(new AfS182S0100000_13(this, 13)).LJIILL();
    }

    public final void kT(boolean z) {
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILJJIL(this, z);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        if (rS()) {
            bundle.putBoolean("show_3p_change_email_success_toast", true);
        } else {
            bundle.putBoolean("show_modify_email_success_toast", true);
        }
        bundle.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_CHANGE.getValue());
        fo(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILL(arguments, "email_binding_show");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (rS()) {
            View viewFindViewById = this.LLLLIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.kq8);
                } else {
                    viewFindViewById = null;
                }
                this.LLLLIL = (C0I7D) viewFindViewById;
            }
            ((C0I7D) viewFindViewById).setTuxFont(41);
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("use_phone")) {
            C786410Ut5.LLLLZLL(jT(), 0);
            jT().setTextColor(C960203pA.LIZ(R.attr.a1h, jT().getContext()));
            jT().setTuxFont(42);
            TuxTextView tuxTextViewJT = jT();
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0XdE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Bundle bundle2;
                    CommonFlowActivity commonFlowActivity;
                    if (this.LL.getArguments().getInt("last_scene", -1) == EnumC852660Xce.BIND_PHONE.getValue()) {
                        this.LL.getActivity().finish();
                        return;
                    }
                    C19EG activity = this.LL.getActivity();
                    if (!(activity instanceof CommonFlowActivity) || (commonFlowActivity = (CommonFlowActivity) activity) == null || (bundle2 = commonFlowActivity.LLLZZIL()) == null) {
                        bundle2 = new Bundle();
                    }
                    Bundle bundle3 = new Bundle(bundle2);
                    C852810Xct.LIZ.getClass();
                    C852810Xct.LJIILL(bundle3, "email_binding_show");
                    if (Intrinsics.LJFF(C852810Xct.LJFF(this.LL), "popup_change_1p_email")) {
                        C786410Ut5.LJJJI("enter_method", "click_try_phone", bundle3);
                        bundle3.remove("passport_ticket");
                    }
                    C0XQ5.LIZIZ().bindMobile(this.LL.getActivity(), this.LL.getEnterFrom(), bundle3, this.LL.OR().yQ2(), new C854720Xfy(this.LL, 10));
                }
            };
            tuxTextViewJT.setText(getString(2131836809));
            tuxTextViewJT.setTextColorRes(R.attr.a1n);
            C0DYO.LIZ(tuxTextViewJT);
            GS(onClickListener, tuxTextViewJT);
        }
        if (C1697810uHb.LJIIJJI(EnumC852660Xce.CHANGE_EMAIL, EnumC852660Xce.BIND_EMAIL).contains(SR())) {
            String enterFrom = getEnterFrom();
            C852810Xct.LIZ.getClass();
            C851430Xaf.LIZLLL(enterFrom, C852810Xct.LJFF(this), getEnterMethod(), C852810Xct.LIZ(this), C852810Xct.LIZJ(this));
        }
    }
}
