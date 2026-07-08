package com.ss.android.ugc.aweme.feed.landscape.cell.assem;

import X.C01GW;
import X.C0RT2;
import X.C10EU;
import X.C1383760m74;
import X.C13LE;
import X.C1558520qew;
import X.C161N;
import X.C300940Bqu;
import X.C452501pT;
import X.C723830SaL;
import X.C724270Sb3;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeAdapterInfoAbility;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeDanmakuLazyLoadAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedVideoViewCellIdentityAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.autoplay.LandScapeAutoPlayHintAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.bottom.LandscapeCellSeekBarAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.caption.LandscapeCellCaptionSwitchAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeCellAssem extends FeedVideoAssem implements LandscapeDanmakuLazyLoadAbility, LandscapeFeedVideoViewCellIdentityAbility, LandscapeAdapterInfoAbility {
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -817140355 || iHashCode == 629544237 || iHashCode == 1029489929) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeDanmakuLazyLoadAbility
    public final void OA1() {
        C723830SaL.LIZJ(this, C1383760m74.LIZIZ.LJIILL(), true);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeAdapterInfoAbility
    public final void tryResumePlay() {
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) this.LLJZ.getValue();
        if (landscapeFeedPlayerAbility != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            landscapeFeedPlayerAbility.ui(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.LandscapeAdapterInfoAbility
    public final void LJIILL(float f) {
        LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) this.LLJZ.getValue();
        if (landscapeFeedPlayerAbility != null) {
            landscapeFeedPlayerAbility.LJIILL(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem
    /* JADX INFO: renamed from: hp */
    public final void tp(VideoItemParams videoItemParams) {
        if (((ICLACaptionService) ServiceManager.get().getService(ICLACaptionService.class)).LIZJ(videoItemParams.getAweme())) {
            if (C300940Bqu.LIZ() && !C10EU.LJIILLIIL(videoItemParams.getAweme().getAuthor())) {
                return;
            } else {
                C723830SaL.LJ(this, C0RT2.LIZ().LJII(), true, null);
            }
        }
        C723830SaL.LJ(this, C13LE.LIZ(RightAreaContainerAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LandscapeMenuContainerAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(TopAreaContainerAssem.class), true, null);
        C723830SaL.LJ(this, C161N.LIZIZ.LJLIL(), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LandScapeAutoPlayHintAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LandscapeCellSpeedAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LandscapeCellSeekBarAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LandscapeCellCaptionSwitchAssem.class), true, null);
        C723830SaL.LJ(this, C1383760m74.LIZIZ.LJIIJ(), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(LandscapePanelStateNotificationAssem.class), true, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 140));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    public LandscapeCellAssem(BaseFeedPageParams baseFeedPageParams, AFwS198S0000000_11 aFwS198S0000000_11, int i, ConcurrentHashSet concurrentHashSet) {
        super(baseFeedPageParams, aFwS198S0000000_11, i, concurrentHashSet);
        this.LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(436));
        this.LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1525));
        this.LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1526));
    }
}
