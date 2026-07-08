package com.ss.android.ugc.aweme.topic.trendingtopic;

import X.AbstractC2173821A5s;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C1388190mED;
import X.C13LE;
import X.C1575810r6p;
import X.C1575820r6q;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicFragment;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class VideoTrendingTopicFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwZjE+LCE3HELIOSISsrPSAjISZiHyY3LSoYOyo9LCwiLhs8OCwvDz0yLygpJzs=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS264S0000000_24.get$arr$(468), "init_config", C1575820r6q.class);
    public final AssemVMLazy LLIZLLLIL;
    public final C1575810r6p LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTrendingTopicFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0r6p] */
    public VideoTrendingTopicFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTrendingTopicListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1378);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(470);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1379), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1380), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1381), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        this.LLJ = new AbstractC2173821A5s() { // from class: X.0r6p
            @Override // X.AbstractC2173821A5s
            public final void LIZIZ() throws Throwable {
                Intent intent;
                C19EG activity = this.LIZLLL.getActivity();
                if (activity != null) {
                    AssemVMLazy assemVMLazy2 = this.LIZLLL.LLIZLLLIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VideoTrendingTopicFragment.LLJI;
                    VideoTrendingTopicListViewModel videoTrendingTopicListViewModel = (VideoTrendingTopicListViewModel) assemVMLazy2.getValue();
                    if (videoTrendingTopicListViewModel.LLIZLLLIL != null) {
                        intent = new Intent();
                        VideoTrendingTopic videoTrendingTopic = videoTrendingTopicListViewModel.LLIZLLLIL;
                        if (videoTrendingTopic != null) {
                            intent.putExtra("video_trending_topic", videoTrendingTopic);
                        }
                    } else {
                        intent = null;
                    }
                    C2204961BRm.LLJJIJIL(-1, intent, activity, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nc5bNkia4dy4PADxCQQaxGqBbbjKfkEsK49Ch65aR/ZNk2Wfu4fROX0SG2FI=", null));
                }
                C19EG activity2 = this.LIZLLL.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            }

            {
                super(true);
            }
        };
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        NR(AFwS264S0000000_24.get$arr$(469));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 331), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19EG c19egLIZIZ;
        OnBackPressedDispatcher onBackPressedDispatcher;
        C19EG activity = getActivity();
        if (activity != null && (c19egLIZIZ = C1388190mED.LIZIZ(activity)) != null && (onBackPressedDispatcher = c19egLIZIZ.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZ(getViewLifecycleOwner(), this.LLJ);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i9l, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
