package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C1232150iAX;
import X.C1237010iIN;
import X.C1239720iMk;
import X.C1239740iMm;
import X.C21405318pn;
import X.C424320GkQ;
import X.C853720XeM;
import X.InterfaceC1239770iMp;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ChildrenChangePasswordFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ChildrenChangePasswordFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiP319PSHELIOSxiLz0yLygpJzsgZgYkICM3OiAiCicyJiIpGS4gOzIjOysVOiQrJCo9PA==";
    public C21405318pn LLLIILIL;
    public C21405318pn LLLIL;
    public C21405318pn LLLILZ;
    public C1239720iMk LLLILZJ;
    public C424320GkQ LLLILZLLLI;
    public final C1239740iMm LLLIZZ = new InterfaceC1239770iMp() { // from class: X.0iMm
        @Override // X.InterfaceC1239770iMp
        public final void LIZ(int i, Editable editable) {
            C424320GkQ c424320GkQPS;
            String text;
            String text2;
            String text3;
            int length;
            String string;
            String string2;
            if (!this.LIZ.isViewValid()) {
                return;
            }
            if (i == R.id.hci) {
                if (editable != null && (length = editable.length()) >= 8) {
                    if (length > 20) {
                        ChildrenChangePasswordFragment childrenChangePasswordFragment = this.LIZ;
                        childrenChangePasswordFragment.pn(0, childrenChangePasswordFragment.getString(2131837662));
                        C1239720iMk c1239720iMkRS = this.LIZ.RS();
                        if (c1239720iMkRS != null) {
                            c1239720iMkRS.setEnabled(false);
                        }
                    } else {
                        String str = "";
                        if (editable == null || (string = editable.toString()) == null) {
                            string = "";
                        }
                        if (C852330Xc7.LIZ.matcher(string).matches() && C852330Xc7.LIZIZ.matcher(string).matches() && C852330Xc7.LIZJ.matcher(string).matches()) {
                            C1239760iMo c1239760iMo = new C1239760iMo();
                            if (editable != null && (string2 = editable.toString()) != null) {
                                str = string2;
                            }
                            if (!c1239760iMo.LIZ.matcher(str).matches()) {
                                ChildrenChangePasswordFragment childrenChangePasswordFragment2 = this.LIZ;
                                childrenChangePasswordFragment2.pn(0, childrenChangePasswordFragment2.getString(2131829652));
                                C1239720iMk c1239720iMkRS2 = this.LIZ.RS();
                                if (c1239720iMkRS2 != null) {
                                    c1239720iMkRS2.setEnabled(false);
                                }
                            } else {
                                C1239720iMk c1239720iMkRS3 = this.LIZ.RS();
                                if (c1239720iMkRS3 != null) {
                                    c1239720iMkRS3.setEnabled(true);
                                }
                                C424320GkQ c424320GkQPS2 = this.LIZ.PS();
                                if (c424320GkQPS2 != null) {
                                    c424320GkQPS2.LIZ();
                                }
                            }
                        } else {
                            ChildrenChangePasswordFragment childrenChangePasswordFragment3 = this.LIZ;
                            childrenChangePasswordFragment3.pn(0, childrenChangePasswordFragment3.getString(2131829651));
                            C1239720iMk c1239720iMkRS4 = this.LIZ.RS();
                            if (c1239720iMkRS4 != null) {
                                c1239720iMkRS4.setEnabled(false);
                            }
                        }
                    }
                } else {
                    C1239720iMk c1239720iMkRS5 = this.LIZ.RS();
                    if (c1239720iMkRS5 != null) {
                        c1239720iMkRS5.setEnabled(false);
                    }
                }
            }
            C21405318pn c21405318pnUS = this.LIZ.US();
            if (c21405318pnUS == null || (text3 = c21405318pnUS.getText()) == null || text3.length() == 0) {
                C21405318pn c21405318pnQS = this.LIZ.QS();
                if (c21405318pnQS == null || (text2 = c21405318pnQS.getText()) == null || text2.length() == 0) {
                    C21405318pn c21405318pnNS = this.LIZ.NS();
                    if ((c21405318pnNS == null || (text = c21405318pnNS.getText()) == null || text.length() == 0) && (c424320GkQPS = this.LIZ.PS()) != null) {
                        c424320GkQPS.LIZ();
                    }
                }
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.y0;
    }

    public final C21405318pn NS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.drk) : null;
            this.LLLILZ = (C21405318pn) viewFindViewById;
        }
        return (C21405318pn) viewFindViewById;
    }

    public final C424320GkQ PS() {
        View viewFindViewById = this.LLLILZLLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.drl) : null;
            this.LLLILZLLLI = (C424320GkQ) viewFindViewById;
        }
        return (C424320GkQ) viewFindViewById;
    }

    public final C21405318pn QS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.drm) : null;
            this.LLLIL = (C21405318pn) viewFindViewById;
        }
        return (C21405318pn) viewFindViewById;
    }

    public final C1239720iMk RS() {
        View viewFindViewById = this.LLLILZJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.drn) : null;
            this.LLLILZJ = (C1239720iMk) viewFindViewById;
        }
        return (C1239720iMk) viewFindViewById;
    }

    public final C21405318pn US() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dro) : null;
            this.LLLIILIL = (C21405318pn) viewFindViewById;
        }
        return (C21405318pn) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        RS().LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        RS().LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(" ", null, true, getString(2131837634), getString(2131837636), true, null, false, false, null, false, null, null, null, null, 67097822);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        KeyboardUtils.LIZIZ(US().getEditText());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1232150iAX.LIZ(US().getEditText());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final EditText editText = US().getEditText();
        final C1239740iMm c1239740iMm = this.LLLIZZ;
        editText.addTextChangedListener(new C853720XeM() { // from class: X.0iMn
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                c1239740iMm.LIZ(editText.getId(), editable);
            }
        });
        final EditText editText2 = QS().getEditText();
        final C1239740iMm c1239740iMm2 = this.LLLIZZ;
        editText2.addTextChangedListener(new C853720XeM() { // from class: X.0iMn
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                c1239740iMm2.LIZ(editText2.getId(), editable);
            }
        });
        final EditText editText3 = NS().getEditText();
        final C1239740iMm c1239740iMm3 = this.LLLIZZ;
        editText3.addTextChangedListener(new C853720XeM() { // from class: X.0iMn
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                c1239740iMm3.LIZ(editText3.getId(), editable);
            }
        });
        GS(new ACListenerS154S0100000_19(this, 57), RS());
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        C424320GkQ c424320GkQPS = PS();
        if (c424320GkQPS != null) {
            c424320GkQPS.LIZIZ(str);
        }
    }
}
