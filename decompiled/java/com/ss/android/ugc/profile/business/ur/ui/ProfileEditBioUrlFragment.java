package com.ss.android.ugc.profile.business.ur.ui;

import X.AbstractC1250290idn;
import X.C098200Yq;
import X.C0OM1;
import X.C0WZX;
import X.C0XIR;
import X.C1232410iAx;
import X.C1233040iBy;
import X.C1245180iVY;
import X.C1250250idj;
import X.C1250300ido;
import X.C1266020j3A;
import X.C1323040kX8;
import X.C1389890mGx;
import X.C1436405jm;
import X.C1440005kM;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21566519ah;
import X.C21566919al;
import X.C2204961BRm;
import X.C446980Hfs;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1231800i9y;
import X.InterfaceC1232420iAy;
import X.InterfaceC197023126r;
import Y.ACListenerS154S0100000_19;
import android.app.Dialog;
import android.os.Bundle;
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
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditBioUrlFragment extends ProfileEditInputFragment implements InterfaceC1232420iAy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiPCZ9GDcjLyY/LQAoIDsRISoZOyMVOiQrJCo9PA==";
    public boolean LLIZ;
    public int LLJ;
    public boolean LLJI;
    public InterfaceC1231800i9y LLJIJIL;
    public C1232410iAx LLJILJIL;
    public C1245180iVY LLJILJILJ;
    public C1749280vcc LLJILLL;
    public TextView LLJJ;
    public EditText LLJJI;
    public TuxIconView LLJJIII;
    public TextView LLJJIJI;
    public View LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLILZLL = "";
    public String LLIZLLLIL = "";

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() {
        InterfaceC1231800i9y interfaceC1231800i9y = this.LLJIJIL;
        if (interfaceC1231800i9y != null) {
            interfaceC1231800i9y.LIZ(C2204961BRm.LLJILLL(kS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpewKBp/qExRQl6HA==", null)).toString());
        }
    }

    public final EditText kS() {
        EditText editText = this.LLJJI;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final C1749280vcc mS() {
        C1749280vcc c1749280vcc = this.LLJILLL;
        if (c1749280vcc != null) {
            return c1749280vcc;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(kS());
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            getActivity().finish();
        } else if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return true;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1232410iAx c1232410iAx = this.LLJILJIL;
        if (c1232410iAx != null) {
            c1232410iAx.LLJ = null;
        }
        C786410Ut5.LLLZLZ(mS(), 8);
    }

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
        if (z) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131824545);
            c1233040iBy.LIZLLL();
            C1440005kM.LIZ(new C1436405jm(false));
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LLILZLL = getArguments().getString("content_value");
            this.LLIZ = getArguments().getBoolean("is_edit_enabled");
            this.LLIZLLLIL = getArguments().getString("edit_hint");
            this.LLJ = getArguments().getInt("content_max_length");
            this.LLJI = getArguments().getBoolean("is_enable_null");
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        C786410Ut5.LLLZLZ(mS(), 8);
        if (exc instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) exc;
            int errorCode = c0xir.getErrorCode();
            if (errorCode != 2097) {
                if (errorCode != 2123) {
                    if (TextUtils.isEmpty(c0xir.getErrorMsg())) {
                        String string = getString(2131848597);
                        C1389890mGx c1389890mGx = new C1389890mGx(this);
                        c1389890mGx.LJIIJ(string);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    String errorMsg = c0xir.getErrorMsg();
                    C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                    c1389890mGx2.LJIIJ(errorMsg);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                if (TextUtils.isEmpty(c0xir.getErrorMsg())) {
                    String string2 = getString(2131848597);
                    C1389890mGx c1389890mGx3 = new C1389890mGx(this);
                    c1389890mGx3.LJIIJ(string2);
                    c1389890mGx3.LJIIJJI();
                }
                nS(1, c0xir.getErrorMsg());
                return;
            }
            C19EG activity = getActivity();
            if (activity == null) {
                return;
            }
            C21566919al c21566919al = new C21566919al(activity);
            c21566919al.LJFF(2131836495);
            c21566919al.LIZ(2131836493);
            c21566919al.LJIIJ(2131836494, null, false);
            new C21566519ah(c21566919al).LIZLLL();
            return;
        }
        String string3 = getString(2131848597);
        C1389890mGx c1389890mGx4 = new C1389890mGx(this);
        c1389890mGx4.LJIIJ(string3);
        c1389890mGx4.LJIIJJI();
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        C786410Ut5.LLLZLZ(mS(), 8);
        if (getActivity() instanceof ProfileEditBioUrlActivity) {
            getActivity().finish();
        } else {
            gS();
            dismiss();
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
        C786410Ut5.LLLZLZ(mS(), 8);
        if (str != null && !TextUtils.isEmpty(str)) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZJ(str);
            c1233040iBy.LIZLLL();
            if (z && getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    public final void nS(int i, String str) {
        if (this.LLJJIJIL == i) {
            return;
        }
        View view = null;
        if (i == 0) {
            TextView textView = this.LLJJIJI;
            if (textView == null) {
                textView = null;
            }
            textView.setTextColor(C446980Hfs.LIZ(textView.getContext(), R.color.di));
            C786410Ut5.LLIL(textView, 8);
            View view2 = this.LLJJIJIIJIL;
            if (view2 != null) {
                view = view2;
            }
            view.setBackgroundColor(C446980Hfs.LIZ(textView.getContext(), R.color.c4));
        } else {
            TextView textView2 = this.LLJJIJI;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(str);
            textView2.setTextColor(C446980Hfs.LIZ(textView2.getContext(), R.color.mk));
            C786410Ut5.LLIL(textView2, 0);
            View view3 = this.LLJJIJIIJIL;
            if (view3 != null) {
                view = view3;
            }
            view.setBackgroundColor(C446980Hfs.LIZ(textView2.getContext(), R.color.mk));
        }
        this.LLJJIJIL = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Integer numValueOf;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.edh, viewGroup, false);
        this.LLJILLL = (C1749280vcc) viewTd.findViewById(R.id.w28);
        this.LLJJ = (TextView) viewTd.findViewById(R.id.zfb);
        this.LLJJI = (EditText) viewTd.findViewById(R.id.hd7);
        this.LLJJIII = (TuxIconView) viewTd.findViewById(R.id.lbx);
        this.LLILLL = (TextView) viewTd.findViewById(R.id.zjm);
        this.LLJJIJI = (TextView) viewTd.findViewById(R.id.zjj);
        this.LLJJIJIIJIL = viewTd.findViewById(R.id.view2);
        View viewFindViewById = viewTd.findViewById(R.id.lbx);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 182), viewFindViewById);
        }
        C19EG activity = getActivity();
        Dialog dialog = getDialog();
        C19GS c19gs = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C1323040kX8.LIZIZ(activity, window, true);
        C1232410iAx c1232410iAx = new C1232410iAx();
        this.LLJILJIL = c1232410iAx;
        c1232410iAx.LLJ = this;
        this.LLJILJILJ = new C1245180iVY();
        TextView textView = this.LLJJ;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getString(2131833268));
        kS().addTextChangedListener(new C1266020j3A(this, 10));
        kS().setText(this.LLILZLL);
        kS().setSelection(C2204961BRm.LLJILLL(kS(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpewKBp/qExRQl6HA==", null)).length());
        kS().setFocusable(true);
        kS().setFocusableInTouchMode(true);
        kS().requestFocus();
        this.LLILLJJLI = (TuxNavBar) viewTd.findViewById(R.id.p15);
        AbstractC1250290idn abstractC1250290idnDS = dS();
        C1250250idj c1250250idjCS = cS(getString(2131833268));
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZIZ = "save";
        c1250300ido.LIZJ = getString(2131833263);
        c1250300ido.LIZ = new InterfaceC197023126r() { // from class: X.0iAH
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                if (this.LIZ.bS()) {
                    EditText editTextKS = this.LIZ.kS();
                    String strValueOf = String.valueOf(editTextKS != null ? C2204961BRm.LLJILLL(editTextKS, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi+Rt8fUMQbCMogfSIFzY9KpewKBp/qExRQl6HA==", null)) : null);
                    while (a0.LJJIIZI(strValueOf, "\n\n", false)) {
                        strValueOf = new Regex("\n\n").replace(strValueOf, "\n");
                    }
                    int length = strValueOf.length() - 1;
                    if (length >= 0 && strValueOf.charAt(length) == '\n') {
                        strValueOf = strValueOf.substring(0, length);
                    }
                    boolean z = !TextUtils.equals(strValueOf, this.LIZ.LLILZLL);
                    C1232140iAW c1232140iAW = C1232140iAW.LIZ;
                    C1232050iAN c1232050iAN = new C1232050iAN("click_save", EnumC1216940hm0.WEBSITE);
                    c1232050iAN.LJI = Boolean.valueOf(z);
                    C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
                    c1232140iAW.getClass();
                    C1232140iAW.LJ(c1232060iAO);
                    if (!z) {
                        this.LIZ.onBackPressed();
                        return;
                    }
                    KeyboardUtils.LIZIZ(this.LIZ.kS());
                    this.LIZ.kS().setText(strValueOf);
                    ProfileEditBioUrlFragment profileEditBioUrlFragment = this.LIZ;
                    C1245180iVY c1245180iVY = profileEditBioUrlFragment.LLJILJILJ;
                    if (c1245180iVY != null) {
                        c1245180iVY.LJFF = strValueOf;
                    }
                    C1232410iAx c1232410iAx2 = profileEditBioUrlFragment.LLJILJIL;
                    if (c1232410iAx2 != null) {
                        c1232410iAx2.LIZIZ(c1245180iVY != null ? c1245180iVY.LIZ() : null);
                    }
                    C786410Ut5.LLLZLZ(this.LIZ.mS(), 0);
                    this.LIZ.mS().LJ();
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
        if (!this.LLIZ) {
            kS().setEnabled(false);
            kS().setFocusable(false);
            kS().setFocusableInTouchMode(false);
            TuxIconView tuxIconView = this.LLJJIII;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        LLIZLLLIL();
        if (TextUtils.isEmpty(this.LLIZLLLIL)) {
            TextView textView2 = this.LLJJIJI;
            if (textView2 == null) {
                textView2 = null;
            }
            C786410Ut5.LLIL(textView2, 8);
        } else {
            TextView textView3 = this.LLJJIJI;
            if (textView3 == null) {
                textView3 = null;
            }
            C786410Ut5.LLIL(textView3, 0);
            TextView textView4 = this.LLJJIJI;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setText(this.LLIZLLLIL);
        }
        if (this.LLJ > 0) {
            TextView textView5 = this.LLILLL;
            if (textView5 != null) {
                C786410Ut5.LLIL(textView5, 0);
            }
            TextView textView6 = this.LLILLL;
            if (textView6 != null) {
                Object[] objArr = new Object[2];
                if (TextUtils.isEmpty(this.LLILZLL)) {
                    numValueOf = 0;
                } else {
                    String str = this.LLILZLL;
                    if (str != null) {
                        numValueOf = Integer.valueOf(str.length());
                    } else {
                        numValueOf = null;
                    }
                }
                objArr[0] = numValueOf;
                objArr[1] = Integer.valueOf(this.LLJ);
                textView6.setText(getString(2131828517, objArr));
            }
        }
        kS().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0iAI
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView7, int i, KeyEvent keyEvent) {
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
