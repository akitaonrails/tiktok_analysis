package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.C0HTT;
import X.C0N0Y;
import X.C0R9L;
import X.C0SR4;
import X.C2189821An6;
import X.C713370RyZ;
import X.C714460S0u;
import X.EnumC1573550r3B;
import X.EnumC1576680r8E;
import X.InterfaceC1577740r9w;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaPicksPanel extends FullFeedFragmentPanel {
    public final String a0;
    public final int b0;
    public final InterfaceC1577740r9w c0;
    public DramaPicksFragment d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f404e0;

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean LJLJI() {
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
        if (iHomeSidebarService == null || !iHomeSidebarService.LJ(this.activity)) {
            return super.LJLJI();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Ng1() {
        super.Ng1();
        DramaPicksFragment dramaPicksFragment = this.d0;
        if (dramaPicksFragment != null) {
            dramaPicksFragment.N8();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        super.showLoadMoreLoading();
        this.l = true;
    }

    public DramaPicksPanel(InterfaceC1577740r9w interfaceC1577740r9w) {
        super("homepage_series", 45);
        this.a0 = "homepage_series";
        this.b0 = 45;
        this.c0 = interfaceC1577740r9w;
        this.f404e0 = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        HashMap<String, String> mobParams;
        long paidContentResumeTimestamp;
        int duration;
        super.LJJIJIIJI(str);
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILL();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.VIDEO_FIRST_FRAME, null);
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && Intrinsics.LJFF(awemeLJIIIIZZ.getAid(), str) && ((mobParams = awemeLJIIIIZZ.getMobParams()) == null || !mobParams.containsKey("series_seek_progress"))) {
            PaidContentInfo paidContentInfo = awemeLJIIIIZZ.mPaidContentInfo;
            if (paidContentInfo != null) {
                paidContentResumeTimestamp = paidContentInfo.getPaidContentResumeTimestamp();
            } else {
                paidContentResumeTimestamp = 0;
            }
            Video video = awemeLJIIIIZZ.getVideo();
            if (video != null) {
                duration = video.getDuration();
            } else {
                duration = 0;
            }
            if (paidContentResumeTimestamp > 0 && duration > 0) {
                long j = paidContentResumeTimestamp * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (j < duration) {
                    float f = (j * 100.0f) / duration;
                    C0N0Y playerManager = getPlayerManager();
                    if (playerManager != null) {
                        playerManager.seek(f);
                    }
                    AwemeExtKt.appendMobParam(awemeLJIIIIZZ, "series_seek_progress", "1");
                }
            }
        }
        if (this.f404e0) {
            this.f404e0 = false;
            InterfaceC1577740r9w interfaceC1577740r9w = this.c0;
            if (interfaceC1577740r9w != null) {
                interfaceC1577740r9w.LIZJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJLLI(String str) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILL();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.VIDEO_FIRST_FRAME_FAIL, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<? extends Aweme> list, boolean z) {
        super.LLJJJIL(list, z);
        if (z) {
            ILoadMoreAbility iLoadMoreAbility = this.LLILZLL;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.resetLoadMoreState();
            }
        } else {
            ILoadMoreAbility iLoadMoreAbility2 = this.LLILZLL;
            if (iLoadMoreAbility2 != null) {
                iLoadMoreAbility2.showLoadMoreEmpty();
                iLoadMoreAbility2.oE1();
            }
            this.l = false;
        }
        MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB).LJIILLIIL();
        DramaPicksFragment dramaPicksFragment = this.d0;
        if (dramaPicksFragment != null) {
            dramaPicksFragment.N8();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<? extends Aweme> list, boolean z) {
        super.Pj(list, z);
        this.l = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2189821An6 c2189821An6 = this.LLLLIIIILLL;
        HashMap<String, String> map = new HashMap<>();
        map.put("vod_tag", "pgc_drama_tab");
        c2189821An6.setExtra(map);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0S0j
            @Override // X.AbstractC714000Rza
            public final boolean LJJIJIL() {
                return true;
            }

            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "series_feed";
            }
        };
    }
}
