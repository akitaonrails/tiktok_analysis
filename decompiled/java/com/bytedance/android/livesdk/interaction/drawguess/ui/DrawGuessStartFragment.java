package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0JFG;
import X.C0JFO;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C474500IjA;
import X.C475510Ikn;
import X.C488910JFh;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessRoundDurationChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessStartFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElHELIOSJiF9LDctPigmLTY/Zzo6ZgE+KDgUPSA/OhwnKTc4Dz0yLygpJzs=";
    public LiveEditText LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C16FS LLILZ;
    public C16F5 LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public C16F5 LLIZLLLIL;
    public DrawGuessWord LLJ;
    public boolean LLJI;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJI;
    public boolean LLJJIII;
    public ValueAnimator LLJJIJI;
    public String LLJIJIL = "";
    public String LLJJ = "";
    public String LLJJIJIIJIL = "";

    public final View NR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b3w) : null;
            this.LLIZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C16F5 OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bb0) : null;
            this.LLILZIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LiveEditText PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gpw) : null;
            this.LL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final C16FS RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vyf) : null;
            this.LLILZ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ValueAnimator valueAnimator = this.LLJJIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    public final void UR(boolean z) {
        if (!this.mStatusViewValid) {
            return;
        }
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.fik);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (C16F5) viewFindViewById;
        }
        C500260Jjc.LJLJLJ(viewFindViewById, z);
        C500260Jjc.LJLJLJ(OR(), !z);
        RR().setEnabled(z);
        RR().LJIIL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean boolValueOf2 = null;
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("argument_is_custom_next_word"));
        } else {
            boolValueOf = null;
        }
        this.LLJILLL = C500260Jjc.LJJJI(boolValueOf);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            boolValueOf2 = Boolean.valueOf(arguments2.getBoolean("argument_is_from_round_summary"));
        }
        if (C500260Jjc.LJJJI(boolValueOf2)) {
            str = "next_word";
        } else if (this.LLJILLL) {
            str = "custom";
        } else {
            str = "words";
        }
        this.LLJJ = str;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.EQ2(this, DrawGuessRoundDurationChannel.class, new C0JFG(this));
        }
    }

    public final void SR(String str, String str2, boolean z) {
        if (!this.mStatusViewValid) {
            return;
        }
        UR(z);
        if (z) {
            C01GW c01gw = C488910JFh.LIZ;
            C488910JFh.LJ = new DrawGuessWord(0L, str);
        } else {
            C16F5 c16f5OR = OR();
            if (str2 == null || str2.length() <= 0) {
                str2 = getString(2131841367);
            }
            c16f5OR.setText(str2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_word_audit");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        C0JFO.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_approved");
        c474500IjALIZ.LJJII(this.LLJJ, "enter_from");
        c474500IjALIZ.LJJII(this.LLJIJIL, "original_word");
        c474500IjALIZ.LJJII(str, "content");
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ghb, viewGroup, false);
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
