package com.ss.android.ugc.aweme.series.innerfeed.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1389910mGz;
import X.C13LP;
import X.C14EU;
import X.C1613210s59;
import X.C1613690s5v;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1BWL;
import X.C418440Gaw;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS124S0200000_21;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayListService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class MiniDramaVideoPlaylistFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2slJyE2OiMpLCHELIOSt9LjctLiI2JjFiBCY9IQE+KCIyHiwoLCADJCQ1JSYgPAM+KCg+LSs4";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 789));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MiniDramaPlayListService.LIZ.getClass();
        MiniDramaPlayListService miniDramaPlayListServiceLIZ = C1613210s59.LIZ();
        if (miniDramaPlayListServiceLIZ != null) {
            miniDramaPlayListServiceLIZ.Vn(this, (C1613690s5v) this.LLIZ.getValue());
        }
        C723850SaN.LIZ(this, false, null, new AwS600S0100000_21(this, 168), 3);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        List<IMContact> list;
        String displayName;
        String strLJJIFFI;
        if (TextUtils.equals(c1365870leD.LIZLLL, "paid_series") && (list = c1365870leD.LIZIZ) != null) {
            BaseContact baseContact = (BaseContact) C13LP.LJJJLL(list);
            View rootView = null;
            if (baseContact == null || (displayName = baseContact.getDisplayName()) == null) {
                displayName = "";
            }
            int size = list.size() - 1;
            C1389910mGz c1389910mGz = new C1389910mGz(this);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LIZ.LIZIZ = 0;
            if (c1365870leD.LJII) {
                strLJJIFFI = C1BWL.LIZJ().getString(2131835378);
            } else if (size > 0) {
                strLJJIFFI = C1BWL.LIZJ().getQuantityString(2131755699, size, displayName, Integer.valueOf(size));
            } else {
                strLJJIFFI = u.LJJIFFI(C1BWL.LIZJ().getString(2131847452), "{UserName}", displayName, false);
            }
            c1389910mGz.LJIIJ(strLJJIFFI);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZLLL = 0;
            c1360890lWB.LJIIIIZZ = new ACListenerS124S0200000_21(c1365870leD, this, 24);
            c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
            View view = getView();
            if (view != null) {
                rootView = view.getRootView();
            }
            c1389910mGz.LIZ.LJIIIZ = rootView;
            c1389910mGz.LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bc1, viewGroup, false);
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
