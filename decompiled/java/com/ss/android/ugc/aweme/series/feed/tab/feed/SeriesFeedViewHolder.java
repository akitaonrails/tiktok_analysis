package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.C0B0A;
import X.C0C0V;
import X.C0HTT;
import X.C0N0Y;
import X.C0R9L;
import X.C0SR4;
import X.C1160110gIL;
import X.C11S5;
import X.C1483410ohn;
import X.C1567900qu4;
import X.C1567990quD;
import X.C1568060quK;
import X.C1574100r44;
import X.C1574290r4N;
import X.C1576780r8O;
import X.C21370218k8;
import X.C2189821An6;
import X.C297590BlV;
import X.C309530CBj;
import X.C713370RyZ;
import X.C714460S0u;
import X.EnumC1573550r3B;
import X.EnumC1576680r8E;
import Y.ARunnableS15S1000000_24;
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
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedExService;
import com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabFragment;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedViewHolder extends FullFeedFragmentPanel {
    public final String a0;
    public final int b0;
    public C1567990quD c0;
    public SeriesHomeTabFragment d0;

    public SeriesFeedViewHolder() {
        super("homepage_series", 45);
        this.a0 = "homepage_series";
        this.b0 = 45;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean LJLJI() {
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
        if (iHomeSidebarService == null || !iHomeSidebarService.LJ(this.activity)) {
            return super.LJLJI();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Zr() {
        C1567990quD c1567990quD = this.c0;
        if (c1567990quD != null) {
            return true ^ Intrinsics.LJFF(((C1567900qu4) c1567990quD.LIZ.Ho().getState()).LLILZIL, Boolean.TRUE);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void checkLoadMore() {
        C1574100r44 c1574100r44 = C1574100r44.LIZ;
        getAwemeList();
        c1574100r44.getClass();
        ISeriesFeedExService.LIZ.getClass();
        C1574290r4N.LIZ().LIZJ();
        super.checkLoadMore();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        super.LLJJJJLIIL();
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            C1576780r8O c1576780r8O = C1576780r8O.LIZ;
            String aid = awemeLJIIIIZZ.getAid();
            c1576780r8O.getClass();
            if (!C297590BlV.LIZIZ() || aid == null || aid.length() == 0) {
                return;
            }
            C11S5.LIZ().LIZIZ(new ARunnableS15S1000000_24(aid, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Ng1() {
        super.Ng1();
        SeriesHomeTabFragment seriesHomeTabFragment = this.d0;
        if (seriesHomeTabFragment != null) {
            seriesHomeTabFragment.N8();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        super.showLoadMoreLoading();
        this.l = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void tryResumePlay() {
        if (Zr()) {
            super.tryResumePlay();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        long paidContentResumeTimestamp;
        super.LJJIJIIJI(str);
        C1567990quD c1567990quD = this.c0;
        if (c1567990quD != null) {
            c1567990quD.LIZ.Ho().AQ2(C1568060quK.LIZ);
            if (C0C0V.LIZ()) {
                C1483410ohn.LJLJJI().LIZ();
            }
        }
        if (!Zr()) {
            LLLLLLLLLL();
        }
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILL();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.VIDEO_FIRST_FRAME, null);
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && Intrinsics.LJFF(awemeLJIIIIZZ.getAid(), str)) {
            HashMap<String, String> mobParams = awemeLJIIIIZZ.getMobParams();
            int duration = 0;
            if (mobParams != null && mobParams.containsKey("series_seek_progress")) {
                return;
            }
            PaidContentInfo paidContentInfo = awemeLJIIIIZZ.mPaidContentInfo;
            if (paidContentInfo != null) {
                paidContentResumeTimestamp = paidContentInfo.getPaidContentResumeTimestamp();
            } else {
                paidContentResumeTimestamp = 0;
            }
            Video video = awemeLJIIIIZZ.getVideo();
            if (video != null) {
                duration = video.getDuration();
            }
            if (paidContentResumeTimestamp <= 0 || duration <= 0) {
                return;
            }
            long j = paidContentResumeTimestamp * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (j >= duration) {
                return;
            }
            float f = (j * 100.0f) / duration;
            C0N0Y playerManager = getPlayerManager();
            if (playerManager != null) {
                playerManager.seek(f);
            }
            AwemeExtKt.appendMobParam(awemeLJIIIIZZ, "series_seek_progress", "1");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJLLI(String str) {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent pagePerformanceEventLIZJ = MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB);
        pagePerformanceEventLIZJ.LJIILL();
        pagePerformanceEventLIZJ.LIZ(EnumC1576680r8E.VIDEO_FIRST_FRAME_FAIL, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final boolean s(Exception exc) {
        Throwable cause;
        if (super.s(exc) && !(exc instanceof C1160110gIL)) {
            if (exc != null) {
                cause = exc.getCause();
            } else {
                cause = null;
            }
            if (!(cause instanceof C1160110gIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJIL(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r13, boolean r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedViewHolder.LLJJJIL(java.util.List, boolean):void");
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
        if (C0B0A.LIZ()) {
            C21370218k8.LJIILL = ((Boolean) C309530CBj.LIZ.getValue()).booleanValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0S0i
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "series_feed";
            }
        };
    }
}
