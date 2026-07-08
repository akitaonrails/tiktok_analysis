package com.ss.android.ugc.aweme.compliance.privacy.phl.feed;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C1483410ohn;
import X.C1507750pL3;
import X.C1685300txQ;
import X.C1735610vGZ;
import X.C1765720w38;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C610310Nwj;
import X.C610320Nwk;
import X.C786410Ut5;
import X.EnumC1508940pMy;
import X.InterfaceC836760Ws6;
import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.views.PagerLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PhlFeedFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKiHELIOSp9ODclPy4wMWs8ISN9LiApLWEDICkKLCo3DjctLiI2JjE=";
    public RecyclerView LLJI;
    public ARunnableS126S0100000_26 LLJJ;
    public long LLJJI;
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS215S0000000_26.get$arr$(41), "enter_from", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS268S0000000_26.get$arr$(103), "init_position", Integer.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS215S0000000_26.get$arr$(43), "video_list", List.class);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 120));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 121));
    public int LLJILJILJ = -1;
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(42));

    public final List<Video> getVideoList() {
        return (List) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1483410ohn c1483410ohn = C610320Nwk.LIZ;
        if (c1483410ohn != null) {
            c1483410ohn.LJJL();
            c1483410ohn.LJJIIZI();
            c1483410ohn.LJJIIJZLJL();
            c1483410ohn.LJJIJ(null);
            c1483410ohn.release();
        }
        C610320Nwk.LIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        UR(this.LLJILJILJ, "click_back");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C1765720w38 c1765720w38;
        super.onPause();
        C610310Nwj c610310NwjSR = SR(this.LLJILJILJ);
        if (c610310NwjSR != null && (c1765720w38 = c610310NwjSR.LLILLJJLI) != null) {
            c1765720w38.LIZJ();
        }
        ((Handler) this.LLJILLL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C1765720w38 c1765720w38;
        super.onResume();
        C610310Nwj c610310NwjSR = SR(this.LLJILJILJ);
        if (c610310NwjSR != null && (c1765720w38 = c610310NwjSR.LLILLJJLI) != null) {
            c1765720w38.LIZLLL();
        }
        WR(false);
    }

    public final C610310Nwj SR(int i) {
        View viewFindViewByPosition;
        if (i == -1 || (viewFindViewByPosition = ((RecyclerView.LayoutManager) this.LLJILJIL.getValue()).findViewByPosition(this.LLJILJILJ)) == null) {
            return null;
        }
        Object tag = viewFindViewByPosition.getTag();
        if (!(tag instanceof C610310Nwj)) {
            return null;
        }
        return (C610310Nwj) tag;
    }

    public final void WR(boolean z) {
        ((Handler) this.LLJILLL.getValue()).removeCallbacksAndMessages(null);
        if (z) {
            this.LLJJI = 0L;
        }
        ARunnableS126S0100000_26 aRunnableS126S0100000_26 = new ARunnableS126S0100000_26(this, 17);
        this.LLJJ = aRunnableS126S0100000_26;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LLJILLL.getValue(), aRunnableS126S0100000_26);
    }

    public final void ZR(int i) {
        C1765720w38 c1765720w38;
        if (this.LLJILJILJ == i) {
            return;
        }
        this.LLJILJILJ = i;
        C1507750pL3.LIZ = EnumC1508940pMy.PLAYER_IDLE;
        C610310Nwj c610310NwjSR = SR(i);
        if (c610310NwjSR != null && (c1765720w38 = c610310NwjSR.LLILLJJLI) != null) {
            c1765720w38.LJIIJ(0.0f);
        }
        WR(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void UR(int i, String str) {
        if (i >= 0 && i < getVideoList().size()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLIZ.getValue());
            c2344009Gk.LIZJ(i, "position");
            c2344009Gk.LIZLLL(this.LLJJI, "playtime");
            c2344009Gk.LJIIIIZZ("exit_method", str);
            C20684815ws.LJIILLIIL("end_privacy_highlights_video", c2344009Gk.LIZ);
        }
    }

    public final void VR(int i, String str) {
        if (i >= 0 && i < getVideoList().size()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLIZ.getValue());
            c2344009Gk.LJIIIIZZ("video_id", ((Video) ListProtector.get(getVideoList(), i)).getPlayAddr().getSourceId());
            c2344009Gk.LJIIIIZZ("enter_method", str);
            C20684815ws.LJIILLIIL("play_privacy_highlights_video", c2344009Gk.LIZ);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getVideoList().isEmpty()) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.q_x);
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS160S0100000_26(this, 43));
        this.LLJI = (RecyclerView) view.findViewById(R.id.qa0);
        ((PagerLayoutManager) this.LLJILJIL.getValue()).LLILLJJLI = new C1735610vGZ(this);
        this.LLJI.setLayoutManager((RecyclerView.LayoutManager) this.LLJILJIL.getValue());
        this.LLJI.setAdapter((AbstractC21673619ry) this.LLJIJIL.getValue());
        if (((Number) this.LLIZLLLIL.getValue()).intValue() > 0 && ((Number) this.LLIZLLLIL.getValue()).intValue() < getVideoList().size()) {
            this.LLJI.scrollToPosition(((Number) this.LLIZLLLIL.getValue()).intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bcv, viewGroup, false);
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
