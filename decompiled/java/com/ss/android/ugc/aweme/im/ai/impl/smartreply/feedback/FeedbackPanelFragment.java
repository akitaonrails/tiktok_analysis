package com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback;

import X.AnonymousClass0606;
import X.AnonymousClass0608;
import X.C098200Yq;
import X.C1391190mJ3;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C23250099c;
import X.C343970De7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackPanelFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZy46ZiwhOSN9OygtHELIOSOzshLTUgMGE1LSAoKy4wI2sKLCo3KiQvIh8yJiAgDz0yLygpJzs=";
    public FeedbackPanelConfig LLIZ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FeedbackPanelConfig feedbackPanelConfig;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            feedbackPanelConfig = (FeedbackPanelConfig) arguments.getParcelable("im_feedback_panel_config");
        } else {
            feedbackPanelConfig = null;
        }
        this.LLIZ = feedbackPanelConfig;
        if (feedbackPanelConfig == null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FeedbackPanelConfig feedbackPanelConfig = this.LLIZ;
        if (feedbackPanelConfig == null) {
            return;
        }
        ((TextView) view.findViewById(R.id.hw5)).setText(getString(2131846312));
        ((TextView) view.findViewById(R.id.hw4)).setText(getString(2131846298));
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.hw0);
        C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 77));
        Context context = tuxIconView.getContext();
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        }
        AnonymousClass0608.LIZ.getClass();
        C23250099c.LIZLLL(AnonymousClass0608.LIZIZ, null, null, new AnonymousClass0606(feedbackPanelConfig, null), 3);
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, feedbackPanelConfig, 37), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.coh, viewGroup, false);
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
