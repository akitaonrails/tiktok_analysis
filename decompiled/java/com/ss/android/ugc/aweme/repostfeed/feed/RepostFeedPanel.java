package com.ss.android.ugc.aweme.repostfeed.feed;

import X.C0HTT;
import X.C0R9L;
import X.C0SR4;
import X.C0SZ8;
import X.C14EU;
import X.C1576740r8K;
import X.C1576770r8N;
import X.C1583220rIm;
import X.C690440R6k;
import X.C713370RyZ;
import X.C714460S0u;
import X.C823050WQl;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedPanel extends FullFeedFragmentPanel {
    public RepostFeedPanel() {
        super("repost_feed", 195);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        Aweme awemeLJIIIIZZ;
        super.LLJJJJLIIL();
        Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
        if (awemeLJIIIIZZ2 == null || awemeLJIIIIZZ2.getAwemeType() != 150 || (awemeLJIIIIZZ = LJIIIIZZ()) == null) {
            return;
        }
        try {
            C823050WQl.LIZLLL().execute(new ARunnableS93S0200000_24(this, awemeLJIIIIZZ, 59));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void g() {
        super.g();
        if (this.LLLILZ) {
            this.LLLILZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        super.LJJIJIIJI(str);
        C1583220rIm.LIZ(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJLLI(String str) {
        C1583220rIm.LIZ(4);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void h(boolean z) {
        super.h(z);
        this.LLLILZ = !this.LLZLLIL;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCleanModeChangedEvent(C1576770r8N c1576770r8N) {
        boolean z;
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            z = c1576740r8KLIZ.LJII;
        } else {
            z = false;
        }
        int childCount = this.LLJJIJI.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0SZ8 c0sz8LJLJJI = LJLJJI(i);
            if (c0sz8LJLJJI != null) {
                c0sz8LJLJJI.LJIIZILJ(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void onPreparePlay(String str) {
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && !TextUtils.isEmpty(awemeLJIIIIZZ.getAid()) && awemeLJIIIIZZ.getAwemeType() != 150) {
            try {
                C823050WQl.LIZLLL().execute(new ARunnableS93S0200000_24(this, awemeLJIIIIZZ, 59));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<? extends Aweme> list, boolean z) {
        super.LLJJJIL(list, z);
        if (z) {
            ILoadMoreAbility iLoadMoreAbility = this.LLILZLL;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.resetLoadMoreState();
                return;
            }
            return;
        }
        ILoadMoreAbility iLoadMoreAbility2 = this.LLILZLL;
        if (iLoadMoreAbility2 == null) {
            return;
        }
        iLoadMoreAbility2.showLoadMoreEmpty();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<? extends Aweme> list, boolean z) {
        super.Pj(list, z);
        if (z) {
            ILoadMoreAbility iLoadMoreAbility = this.LLILZLL;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.resetLoadMoreState();
                return;
            }
            return;
        }
        ILoadMoreAbility iLoadMoreAbility2 = this.LLILZLL;
        if (iLoadMoreAbility2 == null) {
            return;
        }
        iLoadMoreAbility2.showLoadMoreEmpty();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus.LIZLLL().LJIJJ(this);
        IScreenComponentAbility iScreenComponentAbility = this.LLJJJ;
        if (iScreenComponentAbility != null) {
            iScreenComponentAbility.CG();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0RwB
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "repost_feed";
            }
        };
    }
}
