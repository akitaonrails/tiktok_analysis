package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC1250290idn;
import X.C098200Yq;
import X.C09JN;
import X.C0OM1;
import X.C0WZX;
import X.C11NJ;
import X.C11PQ;
import X.C11S5;
import X.C1250250idj;
import X.C1250300ido;
import X.C1266020j3A;
import X.C1323040kX8;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1232040iAM;
import X.InterfaceC197023126r;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditContentFragment extends ProfileEditInputFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiPCZ9GDcjLyY/LQAoIDsQJys4LCEnDjctLiI2JjE=";
    public boolean LLIZLLLIL;
    public int LLJI;
    public boolean LLJIJIL;
    public Function1<? super Editable, Boolean> LLJILJILJ;
    public InterfaceC1232040iAM LLJJIJI;
    public TextView LLJJIJIIJIL;
    public EditText LLJJIJIL;
    public TuxIconView LLJJJ;
    public TextView LLJJJIL;
    public String LLILZLL = "";
    public String LLIZ = "";
    public String LLJ = "";
    public boolean LLJILJIL = true;
    public final C11PQ<Object> LLJILLL = new C11PQ<>();
    public final C11NJ LLJJ = new C11NJ();
    public String LLJJI = "";
    public String LLJJIII = "";

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() {
        InterfaceC1232040iAM interfaceC1232040iAM = this.LLJJIJI;
        if (interfaceC1232040iAM != null) {
            interfaceC1232040iAM.LIZ(C2204961BRm.LLJILLL(kS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzZ8qt/16JbyrI3T95XPcA=", null)).toString());
        }
    }

    public final EditText kS() {
        EditText editText = this.LLJJIJIL;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final TextView mS() {
        TextView textView = this.LLJJJIL;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(kS());
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJ.LJ();
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LLILZLL = getArguments().getString("content_name");
            this.LLIZ = getArguments().getString("content_value");
            this.LLIZLLLIL = getArguments().getBoolean("is_edit_enabled");
            this.LLJ = getArguments().getString("edit_hint");
            this.LLJI = getArguments().getInt("content_max_length");
            this.LLJIJIL = getArguments().getBoolean("is_enable_null");
            Bundle arguments = getArguments();
            String string2 = null;
            if (arguments != null) {
                string = arguments.getString("enter_method");
            } else {
                string = null;
            }
            this.LLJJI = string;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                string2 = arguments2.getString("btn_name");
            }
            this.LLJJIII = string2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        TextView textView;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.edh, viewGroup, false);
        C19EG activity = getActivity();
        Dialog dialog = getDialog();
        C19GS c19gs = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C1323040kX8.LIZIZ(activity, window, true);
        this.LLJJIJIIJIL = (TextView) viewTd.findViewById(R.id.zfb);
        this.LLJJIJIL = (EditText) viewTd.findViewById(R.id.hd7);
        this.LLJJJ = (TuxIconView) viewTd.findViewById(R.id.lbx);
        this.LLILLL = (TextView) viewTd.findViewById(R.id.zjm);
        this.LLJJJIL = (TextView) viewTd.findViewById(R.id.zjj);
        View viewFindViewById = viewTd.findViewById(R.id.lbx);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 280), viewFindViewById);
        }
        TextView textView2 = this.LLJJIJIIJIL;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(this.LLILZLL);
        TuxIconView tuxIconView = this.LLJJJ;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setIconRes(R.raw.icon_x_mark_circle_fill);
        this.LLJJ.LIZ(this.LLJILLL.LJLIL(3000L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(viewTd, 143), new C09JN() { // from class: X.0TIC
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ProfileEditContentFragment@2263.onCreateView$4");
                C1C7U.LIZIZ("ProfileEditContentFragment@2263.onCreateView$4");
            }
        }));
        kS().addTextChangedListener(new C1266020j3A(this, 11));
        kS().setText(this.LLIZ);
        kS().setSelection(C2204961BRm.LLJILLL(kS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzZ8qt/16JbyrI3T95XPcA=", null)).length());
        kS().setFocusable(true);
        kS().setFocusableInTouchMode(true);
        kS().requestFocus();
        this.LLILLJJLI = (TuxNavBar) viewTd.findViewById(R.id.p15);
        AbstractC1250290idn abstractC1250290idnDS = dS();
        C1250250idj c1250250idjCS = cS(this.LLILZLL);
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "save";
        c1250300ido.LIZJ = getString(2131833263);
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iAJ
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                if (this.LIZ.bS()) {
                    KeyboardUtils.LIZIZ(this.LIZ.kS());
                    String str = this.LIZ.LLJJI;
                    if (str == null || str.length() <= 0) {
                        str = "click_save";
                    }
                    C1232140iAW c1232140iAW = C1232140iAW.LIZ;
                    C1232050iAN c1232050iAN = new C1232050iAN(str, EnumC1216940hm0.NICKNAME);
                    c1232050iAN.LJ = this.LIZ.LLJJIII;
                    C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
                    c1232140iAW.getClass();
                    C1232140iAW.LJ(c1232060iAO);
                    this.LIZ.gS();
                    this.LIZ.dismiss();
                }
            }
        };
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            c0om1.LJ(abstractC1250290idnDS);
            c0om1.LIZJ = c1250250idjCS;
            c0om1.LIZIZ(c1250300ido);
            c0om1.LIZLLL = true;
            tuxNavBar.setNavActions(c0om1);
        }
        if (!this.LLIZLLLIL) {
            kS().setEnabled(false);
            kS().setFocusable(false);
            kS().setFocusableInTouchMode(false);
            TuxIconView tuxIconView2 = this.LLJJJ;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        LLIZLLLIL();
        if (this.LLJILJIL && !TextUtils.isEmpty(this.LLJ)) {
            C786410Ut5.LLIL(mS(), 0);
            mS().setText(this.LLJ);
        } else {
            C786410Ut5.LLIL(mS(), 8);
        }
        if (this.LLJI > 0 && (textView = this.LLILLL) != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        kS().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0iAL
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    return true;
                }
                return false;
            }
        });
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity2 = getActivity();
            if (activity2 instanceof C19GS) {
                c19gs = (C19GS) activity2;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
