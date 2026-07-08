package com.ss.android.ugc.aweme.df;

import X.C06LO;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GroupChatDFLoadingFragment extends BaseFragment {
    public static final /* synthetic */ int LLJ = 0;
    public C1749280vcc LLIZ;
    public final int LLIZLLLIL = -1;

    public int getHeight() {
        return this.LLIZLLLIL;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayoutLIZ = C06LO.LIZ(getHeight(), requireContext(), new AwS581S0100000_2(this, 129));
        try {
            ViewTreeLifecycleOwner.set(frameLayoutLIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayoutLIZ, this);
            frameLayoutLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayoutLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayoutLIZ;
        }
    }
}
