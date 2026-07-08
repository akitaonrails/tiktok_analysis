package com.ss.android.ugc.aweme.ad.comment.reviewtab.ui;

import X.C01GW;
import X.C06Z8;
import X.C098200Yq;
import X.C0I7D;
import X.C0WZX;
import X.C1022620cia;
import X.C14K9;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1864790ycv;
import X.C1864920yd8;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.IKeyboardAbility;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class KeyboardAttachedDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQoZyw8JSgpJzt9OiA6ICHELIOSokPCQuZzo6Zg4pMC08KTcoCDsnKSYkLCsXISQgJigVOiQrJCo9PA==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 206));
    public C06Z8 LLILLJJLI;
    public boolean LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1022620cia.LIZ("KeyboardDialogFragment", "onDestroy");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
        C0I7D editText;
        C1022620cia.LIZ("KeyboardDialogFragment", "onDismiss");
        super.onDismiss(dialogInterface);
        IKeyboardAbility iKeyboardAbility = (IKeyboardAbility) this.LL.getValue();
        if (iKeyboardAbility != null) {
            C06Z8 c06z8 = this.LLILLJJLI;
            Editable editableLLLLJI = null;
            if (c06z8 != null && (editText = c06z8.getEditText()) != null) {
                editableLLLLJI = C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLZzB0T/gsVH8tkjK4TuMx1wqBEwgX7lw5tpctHw/1gmqfnsmRFZ4VHtD7H+ZZG1fyNbFpg==", null));
            }
            iKeyboardAbility.YH1(editableLLLLJI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        C0I7D editText;
        Editable editableGy1;
        C06Z8 c06z8;
        TuxIconView sendButton;
        Window window;
        C1022620cia.LIZ("KeyboardDialogFragment", "onViewCreated");
        super.onViewCreated(view, bundle);
        C06Z8 c06z82 = (C06Z8) view.findViewById(R.id.ksl);
        this.LLILLJJLI = c06z82;
        if (c06z82 != null) {
            C786410Ut5.a9(c06z82.getSendButton(), new ACListenerS129S0200000_27(this, c06z82, 18));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(16);
            window.setLayout(-1, -1);
        }
        C14K9.LJIJJ(view, new C1864920yd8(this, 0));
        C06Z8 c06z83 = this.LLILLJJLI;
        if (c06z83 != null && (editText = c06z83.getEditText()) != null) {
            IKeyboardAbility iKeyboardAbility = (IKeyboardAbility) this.LL.getValue();
            if (iKeyboardAbility != null) {
                editableGy1 = iKeyboardAbility.gy1();
            } else {
                editableGy1 = null;
            }
            editText.requestFocus();
            editText.setText(editableGy1);
            if (a0.LJLIIIL(String.valueOf(editableGy1)).toString().length() > 0 && (c06z8 = this.LLILLJJLI) != null && (sendButton = c06z8.getSendButton()) != null) {
                C786410Ut5.LJLLLLLL(0, sendButton);
            }
            editText.setMaxLines(5);
            Editable editableLLLLJI = C2204961BRm.LLLLJI(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLZzB0T/gsVH8tkjK4TuMx1wqBEwgX7lw5tpctHw/1gmqfnsmRFZ4VHtD7H+ZZG1fyNbFpg==", null));
            if (editableLLLLJI != null) {
                editText.setSelection(editableLLLLJI.length());
            }
            editText.addTextChangedListener(new C1864790ycv(this, 1));
            ((InputMethodManager) C786410Ut5.H2(editText.getContext(), "input_method")).showSoftInput(editText, 1);
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LIZ(true);
        tuxImmersionBarLIZJ.LJ(R.attr.a1b);
        tuxImmersionBarLIZJ.LIZLLL();
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 31), view.findViewById(R.id.ye8));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d00, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
