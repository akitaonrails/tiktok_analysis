package com.ss.android.ugc.aweme.explore.assem;

import X.C0SZ8;
import X.C1558520qew;
import X.C724270Sb3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1616070s9l;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ExploreFeedAssem extends ReusedAssem<ExploreFeedAssem> implements InterfaceC712990Rxx<VideoItemParams>, InterfaceC1616070s9l {
    public IViewPagerComponentAbility LLJJ;

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedPanelPlatformAbility.class, null);
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility != null ? iFeedPanelPlatformAbility.Mb() : null;
        this.LLJJ = iViewPagerComponentAbilityMb;
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Bv0(this);
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        Object obj;
        if (i == 0) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            ExploreClientExtra exploreClientExtra = AwemeBizExtKt.getExploreClientExtra(((VideoItemParams) obj).getAweme());
            if (exploreClientExtra != null) {
                exploreClientExtra.cacheType = 2;
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
