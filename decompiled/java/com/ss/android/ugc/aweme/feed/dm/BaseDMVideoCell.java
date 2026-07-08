package com.ss.android.ugc.aweme.feed.dm;

import X.C01GW;
import X.C0RAF;
import X.C0RF0;
import X.C0RF2;
import X.C0SUL;
import X.C1336205Ku;
import X.C13LE;
import X.C13LP;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558420qem;
import X.C1558520qew;
import X.C19719912Dl;
import X.C452501pT;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690610R7b;
import X.C690620R7c;
import X.C690630R7d;
import X.C690640R7e;
import X.C690650R7f;
import X.C690660R7g;
import X.C737910Sx3;
import X.EnumC452301pR;
import X.InterfaceC1294060jmO;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import X.InterfaceC713360RyY;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.experiment.FromGroupIdScenarios;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS0S1000001_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseDMVideoCell extends BaseMediaFeedViewHolder<BaseDMVideoCell, VideoItemParams> implements IVideoCellAbility, CommonCellAbility {
    public final C0RF0 LLJJL;
    public BaseFeedPlayerView LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public double LLJLIL;
    public final MutableLiveData<Integer> LLJLILLLLZIIL;
    public final C630740Ooa LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Es(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void Fm() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer Ia() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Q5(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void R() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Uc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Vu() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final InterfaceC690460R6m Wn0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer br() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View by1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final RootCellCommonAbility gI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ii(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Aweme im() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void nO1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0RGJ, X.InterfaceC739930T0t
    public final void no() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final C0SUL om() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void td(HashMap<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0RGJ, X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final boolean yE0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View yy0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0RGJ, X.C0SZ8
    public final void G() {
        VideoCoverAbility videoCoverAbility = (VideoCoverAbility) this.LLJLL.getValue();
        if (videoCoverAbility != null) {
            videoCoverAbility.qa1("hideCoverView");
        }
    }

    public final VideoPlayViewModel LLLIL() {
        return (VideoPlayViewModel) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final List<Aweme> VA1() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View Vy1() {
        VideoCoverAbility videoCoverAbility = (VideoCoverAbility) this.LLJLL.getValue();
        if (videoCoverAbility != null) {
            return videoCoverAbility.getVideoCover();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Fragment getFragment() {
        return this.LLJJL.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.InterfaceC583650Mup
    public final View getVideoView() {
        BaseFeedPlayerView baseFeedPlayerView = this.LLJJLIIIJLLLLLLLZ;
        if (baseFeedPlayerView != null) {
            return baseFeedPlayerView.getVideoView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final BaseFeedPageParams nJ2() {
        BaseFeedPageParams baseFeedPageParams = this.LLJJL.LJ;
        baseFeedPageParams.param.setCellType("cell_dm_media_video");
        return baseFeedPageParams;
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0RGJ, X.C0SZ8
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IVideoCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, CommonCellAbility.class, null);
        this.LLJLIL = -1.0d;
        ((Handler) this.LLJL.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0SZ8
    public final BaseFeedPlayerView E() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private final void LLLIZZ(String str) {
        FromGroupIdScenarios.FromGroupIdScenariosConfig fromGroupIdScenariosConfigLIZ = FromGroupIdScenarios.LIZ();
        List<String> list = fromGroupIdScenariosConfigLIZ.updateScenarioList;
        List<String> list2 = fromGroupIdScenariosConfigLIZ.keepScenarioList;
        if (list != null && C13LP.LJJJJ(this.LLJJL.LJ.eventType, list)) {
            C1336205Ku.LIZ(false).getImVideoService().LIZ(str);
        } else {
            if (list2 == null || C13LP.LJJJJ(this.LLJJL.LJ.eventType, list2)) {
                return;
            }
            C1336205Ku.LIZ(false).getImVideoService().LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0SZ8
    public void LJJIJIIJIL(int i) {
        Aweme aweme;
        String aid;
        super.LJJIJIIJIL(i);
        ((VideoViewModel) this.LLJLLL.getValue()).BQ2(i, null);
        Aweme aweme2 = this.LLJJIJIIJIL;
        if (aweme2 != null && aweme2.getAid() != null && (aweme = this.LLJJIJIIJIL) != null && (aid = aweme.getAid()) != null) {
            LLLIZZ(aid);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0SZ8
    public final void LLIIII(boolean z) {
        VideoCoverAbility videoCoverAbility;
        super.LLIIII(z);
        if (Mg() && (videoCoverAbility = (VideoCoverAbility) this.LLJLL.getValue()) != null) {
            videoCoverAbility.lD2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        String aid;
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        videoPlayViewModelLLLIL.getClass();
        videoPlayViewModelLLLIL.setState(new C690640R7e(aweme));
        if (aweme != null && aweme.getAid() != null && (aid = aweme.getAid()) != null) {
            LLLIZZ(aid);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
        LLLIL().onPausePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
        LLLIL().onPlayCompleted(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
        LLLIL().wQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Video video;
        C583620Mum.LJJIIJZLJL(this, f);
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            double duration = (video.getDuration() * (f / 100)) / LSPassThroughRecordSizeConfig.DEFAULT;
            if (this.LLJLIL < Math.floor(duration)) {
                VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
                videoPlayViewModelLLLIL.getClass();
                videoPlayViewModelLLLIL.setState(new C690610R7b(f));
                VideoPlayViewModel videoPlayViewModelLLLIL2 = LLLIL();
                videoPlayViewModelLLLIL2.getClass();
                videoPlayViewModelLLLIL2.setState(new C690630R7d(duration));
            }
            this.LLJLIL = duration;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        videoPlayViewModelLLLIL.getClass();
        videoPlayViewModelLLLIL.setState(new AwS62S1000000_11(str, 14));
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
        LLLIL().onPreparePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String sourceId;
        C583620Mum.LJJJJ(this, c1480420ocy);
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        if (c1480420ocy != null) {
            sourceId = c1480420ocy.getSourceId();
        } else {
            sourceId = null;
        }
        videoPlayViewModelLLLIL.LJJIJIIJI(sourceId);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        videoPlayViewModelLLLIL.getClass();
        videoPlayViewModelLLLIL.setState(new C690650R7f());
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
        LLLIL().onResumePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    public BaseDMVideoCell(C0RF0 c0rf0, C0RF2<BaseDMVideoCell, VideoItemParams> c0rf2) {
        super(c0rf0, c0rf2);
        this.LLJJL = c0rf0;
        this.LLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(106));
        this.LLJLIL = -1.0d;
        this.LLJLILLLLZIIL = new MutableLiveData<>(0);
        this.LLJLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 371));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoPlayViewModel.class);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(173);
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        this.LLJLLIL = C737910Sx3.LIZLLL(this, c19719912DlLIZ, aFwS243S0000000_11, enumC452301pR);
        this.LLJLLL = C737910Sx3.LIZLLL(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(174), enumC452301pR);
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IVideoCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, CommonCellAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, X.InterfaceC1473950oSX
    public final void LLILLIZIL(int i, int i2) {
        super.LLILLIZIL(i, i2);
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        videoPlayViewModelLLLIL.getClass();
        videoPlayViewModelLLLIL.setState(new C690660R7g());
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder
    /* JADX INFO: renamed from: LLLIILIL, reason: merged with bridge method [inline-methods] */
    public VideoItemParams LLJJLIIIJLLLLLLLZ(Aweme aweme, boolean z) {
        VideoItemParams videoItemParamsLIZ = C0RAF.LIZ(this.LLJJL);
        videoItemParamsLIZ.setAweme(aweme);
        videoItemParamsLIZ.currentPosition = this.LLJJIJIL;
        return videoItemParamsLIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
        if (z) {
            VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
            videoPlayViewModelLLLIL.getClass();
            videoPlayViewModelLLLIL.setState(new AwS62S1000000_11(str, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        videoPlayViewModelLLLIL.getClass();
        videoPlayViewModelLLLIL.setState(new AwS0S1000001_11(str, f, 1));
    }

    @Override // com.ss.android.ugc.aweme.feed.dm.BaseMediaFeedViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
        VideoPlayViewModel videoPlayViewModelLLLIL = LLLIL();
        videoPlayViewModelLLLIL.getClass();
        videoPlayViewModelLLLIL.setState(new C690620R7c(j));
        this.LLJLILLLLZIIL.setValue(Integer.valueOf((int) j));
    }
}
