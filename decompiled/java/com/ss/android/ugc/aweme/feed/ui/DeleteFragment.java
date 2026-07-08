package com.ss.android.ugc.aweme.feed.ui;

import X.C098200Yq;
import X.C0HTT;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C737030Svd;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class DeleteFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZiMpLCt9PSxiDSo/LTEpDz0yLygpJzs=";
    public Aweme LL;
    public C0HTT<C737030Svd> LLILLJJLI;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.unfavourite_iv);
        if (imageView != null) {
            Context context = imageView.getContext();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_trash_bin_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(48));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            imageView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        }
        ((TextView) view.findViewById(R.id.unfavourite_tv)).setText(R.string.gm7);
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 23), view.findViewById(R.id.unfavourite_view));
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 24), view.findViewById(R.id.unfavourite_cancel));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b62, viewGroup, false);
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
