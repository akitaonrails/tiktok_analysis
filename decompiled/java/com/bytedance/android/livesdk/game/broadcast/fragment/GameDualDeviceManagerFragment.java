package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C0TDF;
import X.C11RD;
import X.C1685300txQ;
import X.C16FS;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceManagerFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyABKCEyLyA+Dz0yLygpJzs=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 244));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 245));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(116));

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.yvp);
        if (textView != null && (str = C0TDF.LIZLLL().LJIIIIZZ) != null) {
            textView.setText(C497740JfY.LJIJJ(2131853794, str));
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.yqy);
        if (c16fs != null) {
            c16fs.setMaxWidth(Integer.MAX_VALUE);
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 16));
        }
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.yqx);
        if (c16fs2 != null) {
            c16fs2.setMaxWidth(Integer.MAX_VALUE);
            C786410Ut5.h8(c16fs2, new ACListenerS147S0100000_12(this, 17));
        }
        View viewFindViewById = view.findViewById(R.id.ypl);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 18), viewFindViewById);
        }
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 84), new C09JN() { // from class: X.0T6p
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceManagerFragment@4404.onViewCreated$2");
                C20441214yg.LJ("GameDualDeviceManagerFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceManagerFragment@4404.onViewCreated$2");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi6, viewGroup, false);
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
