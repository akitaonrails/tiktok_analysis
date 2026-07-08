package com.ss.android.ugc.aweme.notification;

import X.C098200Yq;
import X.C0OSB;
import X.C0P4M;
import X.C127A;
import X.C127K;
import X.C13BV;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C635780Owi;
import X.C635800Owk;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscribePanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1HELIOSISYtPSY8JmsfPC0gKzclKyoDKSspJQkhKSIhLCEn";
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public C197039127h LLILZIL;
    public TuxImageModel LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public List<C635800Owk> LLJ = C13BV.INSTANCE;
    public C635780Owi LLJI;

    public final Boolean MR() {
        if (this.LLJ.size() == 1 && ((C635800Owk) C13LP.LJJJJZI(this.LLJ)).LIZ == -1) {
            return Boolean.valueOf(((C635800Owk) C13LP.LJJJJZI(this.LLJ)).LIZJ);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        LinearLayout linearLayout;
        C197039127h c197039127h;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            tuxIconView = (TuxIconView) view2.findViewById(R.id.lkw);
        } else {
            tuxIconView = null;
        }
        this.LL = tuxIconView;
        View view3 = getView();
        if (view3 != null) {
            tuxTextView = (TuxTextView) view3.findViewById(R.id.tv_title);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        View view4 = getView();
        if (view4 != null) {
            tuxTextView2 = (TuxTextView) view4.findViewById(R.id.zhz);
        } else {
            tuxTextView2 = null;
        }
        this.LLILLL = tuxTextView2;
        View view5 = getView();
        if (view5 != null) {
            linearLayout = (LinearLayout) view5.findViewById(R.id.exp);
        } else {
            linearLayout = null;
        }
        this.LLILZ = linearLayout;
        View view6 = getView();
        if (view6 != null) {
            c197039127h = (C197039127h) view6.findViewById(R.id.cp0);
        } else {
            c197039127h = null;
        }
        this.LLILZIL = c197039127h;
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            C0OSB.LJFF(tuxIconView2, this.LLILZLL, null);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(this.LLIZ);
        }
        TuxTextView tuxTextView4 = this.LLILLL;
        if (tuxTextView4 != null) {
            String str = this.LLIZLLLIL;
            if (str == null) {
                str = "";
            }
            tuxTextView4.setText(str);
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            C786410Ut5.LJJJJJL(linearLayout2);
            if (!this.LLJ.isEmpty()) {
                for (C635800Owk c635800Owk : this.LLJ) {
                    C127K c127k = new C127K(linearLayout2.getContext(), null, 6);
                    c127k.setTitle(c635800Owk.LIZIZ);
                    C127A c127a = new C127A(linearLayout2.getContext());
                    c127a.LJIILJJIL(c635800Owk.LIZJ);
                    c127a.LJIILLIIL(new C0P4M(c635800Owk, 7));
                    c127k.setAccessory(c127a);
                    if (c635800Owk.LIZLLL != null) {
                        c127k.setIcon(new AwS588S0100000_9(c635800Owk, 685));
                    }
                    linearLayout2.addView(c127k);
                }
            }
        }
        C197039127h c197039127h2 = this.LLILZIL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(this, 142));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ab4, viewGroup, false);
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
