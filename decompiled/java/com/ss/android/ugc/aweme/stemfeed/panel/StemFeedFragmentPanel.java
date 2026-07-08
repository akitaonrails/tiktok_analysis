package com.ss.android.ugc.aweme.stemfeed.panel;

import X.C0HTT;
import X.C0R9L;
import X.C0SR4;
import X.C0SZ8;
import X.C0W93;
import X.C14EU;
import X.C1564680qos;
import X.C1576700r8G;
import X.C1576740r8K;
import X.C2097608Jq;
import X.C690440R6k;
import X.C713370RyZ;
import X.C714460S0u;
import X.C818480W8w;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedFragmentPanel extends FullFeedFragmentPanel {
    public int a0;
    public boolean b0;

    public StemFeedFragmentPanel(String str) {
        super(str, 36);
        this.a0 = -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        super.LJJIJIIJI(str);
        if (!this.b0) {
            this.b0 = true;
            C818480W8w.LIZJ(getEventType(), C0W93.SUCCESS, null, C2097608Jq.LJ());
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCleanModeChangedEvent(C1576700r8G c1576700r8G) {
        Boolean boolValueOf;
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            boolValueOf = Boolean.valueOf(c1576740r8KLIZ.LJFF);
        } else {
            boolValueOf = null;
        }
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            int childCount = verticalViewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0SZ8 c0sz8LJLJJI = LJLJJI(i);
                if (c0sz8LJLJJI != null) {
                    c0sz8LJLJJI.LJIIZILJ(boolValueOf.booleanValue());
                }
            }
        }
    }

    @C14EU
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        int i;
        if (c1564680qos != null) {
            i = c1564680qos.LIZ;
        } else {
            i = -1;
        }
        this.a0 = i;
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
        if (iLoadMoreAbility2 != null) {
            iLoadMoreAbility2.showLoadMoreEmpty();
        }
        ILoadMoreAbility iLoadMoreAbility3 = this.LLILZLL;
        if (iLoadMoreAbility3 == null) {
            return;
        }
        iLoadMoreAbility3.oE1();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<? extends Aweme> list, boolean z) {
        super.Pj(list, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0S0l
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "stem_feed";
            }
        };
    }
}
