package com.ss.android.ugc.aweme.share;

import X.C098200Yq;
import X.C1372830lpR;
import X.C1373630lqj;
import X.C1374200lre;
import X.C1386360mBG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C786410Ut5;
import X.InterfaceC1371520lnK;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class LongPressShareListDialogForLiveHost extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZgkjHELIOSJygDOiA/Ohw7KTcpBSYgPAElKCM8LwMjOwM6PiAEJjwn";
    public final Function0<Unit> LL;
    public final C1373630lqj LLILLJJLI;
    public C21578619ce LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        DialogInterface.OnDismissListener onDismissListener;
        super.onDestroy();
        C1373630lqj c1373630lqj = this.LLILLJJLI;
        Dialog dialog = c1373630lqj.LJ;
        if (dialog != null && (onDismissListener = c1373630lqj.LJIJ) != null) {
            onDismissListener.onDismiss(dialog);
        }
        InterfaceC1371520lnK interfaceC1371520lnK = c1373630lqj.LJIIZILJ;
        if (interfaceC1371520lnK != null) {
            interfaceC1371520lnK.dismissDialog();
        }
        this.LLILLJJLI.getClass();
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIJI(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LLILLJJLI.LJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Resources.Theme theme;
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null && (theme = context.getTheme()) != null) {
            theme.applyStyle(R.style.ab7, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL = (C21578619ce) view.findViewById(R.id.u2m);
        C21578619ce c21578619ce = this.LLILLL;
        if (c21578619ce != null) {
            ViewGroup.LayoutParams layoutParams = c21578619ce.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.o6(c21578619ce, layoutParams);
        }
        View viewFindViewById = view.findViewById(R.id.q1v);
        this.LLILLJJLI.LIZIZ(viewFindViewById);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b91, viewGroup, false);
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

    public LongPressShareListDialogForLiveHost(Context context, C1372830lpR c1372830lpR, C1374200lre c1374200lre, float f, AwS565S0100000_21 awS565S0100000_21) {
        this.LL = awS565S0100000_21;
        this.LLILLJJLI = new C1373630lqj(context, c1372830lpR, c1374200lre, f, null, this);
    }
}
