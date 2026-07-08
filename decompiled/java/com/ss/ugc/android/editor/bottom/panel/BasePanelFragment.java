package com.ss.ugc.android.editor.bottom.panel;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C362580EJk;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BasePanelFragment extends EditorContextFragment {
    public ViewGroup LLILZ;
    public final long LLILLL = System.currentTimeMillis();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 959));
    public final boolean LLILZLL = true;

    public abstract int OR();

    public abstract ViewGroup PR(View view);

    public abstract int RR();

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        return (Context) this.LLILZIL.getValue();
    }

    public void NR() {
        C362580EJk.LIZ(this);
    }

    public boolean SR() {
        return this.LLILZLL;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (SR()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0EIy
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext((Context) this.LLILZIL.getValue());
        View viewTd = C786410Ut5.Td(layoutInflaterCloneInContext, OR(), viewGroup, false);
        C786410Ut5.Td(layoutInflaterCloneInContext, RR(), PR(viewTd), true);
        this.LLILZ = viewGroup;
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
