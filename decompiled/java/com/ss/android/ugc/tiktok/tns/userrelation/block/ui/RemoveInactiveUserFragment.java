package com.ss.android.ugc.tiktok.tns.userrelation.block.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS139S0100000_4;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class RemoveInactiveUserFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s4Jzx9PTYpOz02JCQ4HELIOSICA9ZicgJiw4ZjAlZx02JSo6LAY9KSY4IDk2HTYpOwkhKSIhLCEn";
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C197039127h LLJI;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 412));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("remove_status");
            arguments.getInt("remove_number");
        }
        this.LLIZ = (TuxIconView) view.findViewById(R.id.t63);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.t64);
        this.LLJ = (TuxTextView) view.findViewById(R.id.t62);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.t61);
        this.LLJI = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS139S0100000_4(this, 62));
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("remove_status")) == null) {
            string = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            i = arguments3.getInt("remove_number");
        } else {
            i = 0;
        }
        if (TextUtils.equals("failed", string)) {
            C197039127h c197039127h2 = this.LLJI;
            if (c197039127h2 != null) {
                c197039127h2.setText(getString(2131827589));
            }
            TuxTextView tuxTextView = this.LLIZLLLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(getString(2131827602));
            }
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(getString(2131827601));
            }
            TuxIconView tuxIconView = this.LLIZ;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            }
            TuxIconView tuxIconView2 = this.LLIZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a01);
                return;
            }
            return;
        }
        if (TextUtils.equals("success", string)) {
            if (i == 0) {
                C197039127h c197039127h3 = this.LLJI;
                if (c197039127h3 != null) {
                    c197039127h3.setText(getString(2131827590));
                }
                TuxTextView tuxTextView3 = this.LLIZLLLIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(getString(2131827599));
                }
                TuxTextView tuxTextView4 = this.LLJ;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(getString(2131827600));
                }
                C197039127h c197039127h4 = this.LLJI;
                if (c197039127h4 != null) {
                    C786410Ut5.U8(c197039127h4, new ACListenerS139S0100000_4(this, 63));
                }
            } else {
                C197039127h c197039127h5 = this.LLJI;
                if (c197039127h5 != null) {
                    c197039127h5.setText(getString(2131827589));
                }
                TuxTextView tuxTextView5 = this.LLIZLLLIL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(getString(2131827606));
                }
                TuxTextView tuxTextView6 = this.LLJ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(getResources().getQuantityString(2131755114, i, Integer.valueOf(i)));
                }
            }
            TuxIconView tuxIconView3 = this.LLIZ;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_tick_circle_fill);
            }
            TuxIconView tuxIconView4 = this.LLIZ;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setTintColorRes(R.attr.a1v);
            return;
        }
        C197039127h c197039127h6 = this.LLJI;
        if (c197039127h6 != null) {
            c197039127h6.setText(getString(2131827589));
        }
        TuxTextView tuxTextView7 = this.LLIZLLLIL;
        if (tuxTextView7 != null) {
            tuxTextView7.setText(getString(2131827608));
        }
        TuxTextView tuxTextView8 = this.LLJ;
        if (tuxTextView8 != null) {
            tuxTextView8.setText(getString(2131827607));
        }
        TuxIconView tuxIconView5 = this.LLIZ;
        if (tuxIconView5 != null) {
            tuxIconView5.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
        }
        TuxIconView tuxIconView6 = this.LLIZ;
        if (tuxIconView6 == null) {
            return;
        }
        tuxIconView6.setTintColorRes(R.attr.a01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c86, viewGroup, false);
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
