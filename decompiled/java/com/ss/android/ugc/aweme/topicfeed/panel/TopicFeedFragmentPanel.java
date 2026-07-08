package com.ss.android.ugc.aweme.topicfeed.panel;

import X.C0HTT;
import X.C0R9L;
import X.C0SR4;
import X.C0W93;
import X.C14EU;
import X.C1564680qos;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C713370RyZ;
import X.C714460S0u;
import X.C818480W8w;
import X.InterfaceC1576730r8J;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedFragmentPanel extends FullFeedFragmentPanel implements InterfaceC1576730r8J {
    public final TopicFeedListViewModel a0;
    public int b0;
    public boolean c0;

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void g() {
        super.g();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        super.LJJIJIIJI(str);
        if (!this.c0) {
            this.c0 = true;
            C818480W8w.LIZJ(getEventType(), C0W93.SUCCESS, null, C2097608Jq.LJ());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() - this.a0.LLILLL, "first_frame_duration");
            c2344009Gk.LIZJ(this.a0.LLILLJJLI, "is_cold_start");
            C20684815ws.LJIILLIIL("topic_tab_ready", c2344009Gk.LIZ);
            this.a0.LLILLJJLI = 2;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void h(boolean z) {
        super.h(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @X.C14EU(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleanModeChangedEvent(X.C1576720r8I r5) {
        /*
            r4 = this;
            int r1 = r5.LIZ
            int r0 = r4.getPageType()
            if (r1 == r0) goto L9
            return
        L9:
            X.0r8K r1 = X.C690440R6k.LIZ()
            r3 = 0
            if (r1 == 0) goto L31
            int r0 = r4.getPageType()
            boolean r0 = r1.LIZIZ(r0)
            r2 = 1
            if (r0 != r2) goto L31
        L1b:
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r4.LLJJIJI
            if (r0 == 0) goto L33
            int r1 = r0.getChildCount()
        L23:
            if (r3 >= r1) goto L33
            X.0SZ8 r0 = r4.LJLJJI(r3)
            if (r0 == 0) goto L2e
            r0.LJIIZILJ(r2)
        L2e:
            int r3 = r3 + 1
            goto L23
        L31:
            r2 = 0
            goto L1b
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel.onCleanModeChangedEvent(X.0r8I):void");
    }

    @C14EU
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        int i;
        if (c1564680qos != null) {
            i = c1564680qos.LIZ;
        } else {
            i = -1;
        }
        this.b0 = i;
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

    public TopicFeedFragmentPanel(String str, int i, TopicFeedListViewModel topicFeedListViewModel) {
        super(str, i);
        this.a0 = topicFeedListViewModel;
        this.b0 = -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0S0k
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "topic_feed";
            }
        };
    }
}
