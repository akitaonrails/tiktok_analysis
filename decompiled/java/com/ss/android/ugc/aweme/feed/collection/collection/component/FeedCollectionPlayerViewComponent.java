package com.ss.android.ugc.aweme.feed.collection.collection.component;

import X.C0SZ8;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1558520qew;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC2281141EQm;
import X.InterfaceC1473950oSX;
import X.InterfaceC1482650ogZ;
import X.InterfaceC665370Q7z;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionPlayerViewAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedCollectionPlayerViewComponent extends BaseCellContentComponent<FeedCollectionPlayerViewComponent> implements BaseFeedPlayerView, FeedCollectionPlayerViewAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 299));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 298));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 297));

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void C80() {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void Dh1(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionPlayerViewAbility
    public final BaseFeedPlayerView E() {
        return this;
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ View Hk() {
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
    }

    @Override // X.InterfaceC583650Mup
    public final void Z1() {
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void ce1(String str, String str2) {
    }

    @Override // X.InterfaceC583650Mup
    public final int getContentType() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // X.InterfaceC583650Mup
    public final /* synthetic */ void o6(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLoopPlay(String str, int i) {
        C583620Mum.LJIILL(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC690050R4x
    public final void release() {
    }

    @Override // X.InterfaceC583650Mup
    public final void sc() {
    }

    @Override // X.InterfaceC583650Mup
    public final void ys(int i) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FeedCollectionPlayerViewAbility.class, null);
        }
    }

    public final BaseFeedPlayerView ep() {
        C0SZ8 c0sz8LJLIL;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJJJJLIIL.getValue();
        if (feedCollectionViewPagerAbility == null || (c0sz8LJLIL = feedCollectionViewPagerAbility.LJLIL()) == null) {
            return null;
        }
        return c0sz8LJLIL.E();
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Da() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            return baseFeedPlayerViewEp.Da();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void Fe0() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.Fe0();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void L41() {
        BaseFeedPlayerView baseFeedPlayerViewEp;
        BaseFeedPlayerView baseFeedPlayerViewEp2 = ep();
        if (baseFeedPlayerViewEp2 == null || !baseFeedPlayerViewEp2.Mg() || (baseFeedPlayerViewEp = ep()) == null) {
            return;
        }
        baseFeedPlayerViewEp.L41();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void LJIJJ() {
        BaseFeedPlayerView baseFeedPlayerViewEp;
        BaseFeedPlayerView baseFeedPlayerViewEp2 = ep();
        if (baseFeedPlayerViewEp2 == null || !baseFeedPlayerViewEp2.Mg() || (baseFeedPlayerViewEp = ep()) == null) {
            return;
        }
        baseFeedPlayerViewEp.LJIJJ();
    }

    @Override // X.InterfaceC583650Mup
    public final boolean Mg() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            return baseFeedPlayerViewEp.Mg();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void VJ2() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.VJ2();
        }
    }

    @Override // X.InterfaceC583650Mup
    public final Surface getSurface() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            return baseFeedPlayerViewEp.getSurface();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final InterfaceC1482650ogZ getSurfaceHolder() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            return baseFeedPlayerViewEp.getSurfaceHolder();
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final View getVideoView() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            return baseFeedPlayerViewEp.getVideoView();
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final boolean go1() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            return baseFeedPlayerViewEp.go1();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void onPagePause() {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onPagePause();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FeedCollectionPlayerViewAbility.class, null, null);
        }
        FeedPlayerViewInitAbility feedPlayerViewInitAbility = (FeedPlayerViewInitAbility) this.LLJJL.getValue();
        if (feedPlayerViewInitAbility != null) {
            feedPlayerViewInitAbility.Wo0(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void onScrollEnd() {
        BaseFeedPlayerView baseFeedPlayerViewEp;
        BaseFeedPlayerView baseFeedPlayerViewEp2 = ep();
        if (baseFeedPlayerViewEp2 == null || !baseFeedPlayerViewEp2.Mg() || (baseFeedPlayerViewEp = ep()) == null) {
            return;
        }
        baseFeedPlayerViewEp.onScrollEnd();
    }

    @Override // X.InterfaceC583650Mup
    public final ViewGroup zt1() {
        View videoView = getVideoView();
        ViewParent parent = videoView != null ? videoView.getParent() : null;
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // X.InterfaceC583650Mup
    public final void Ai1(boolean z) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.Ai1(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void Dn(InterfaceC1473950oSX interfaceC1473950oSX) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.Dn(interfaceC1473950oSX);
        }
    }

    @Override // X.InterfaceC690050R4x
    public final void H1(OnUIPlayListener onUIPlayListener) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.H1(onUIPlayListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void jj(boolean z) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.jj(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.playerview.FeedSurfaceViewHolderAbility
    public final void mZ0(Function0<Boolean> function0) {
        BaseFeedPlayerView baseFeedPlayerViewEp;
        BaseFeedPlayerView baseFeedPlayerViewEp2 = ep();
        if (baseFeedPlayerViewEp2 != null && baseFeedPlayerViewEp2.Mg() && (baseFeedPlayerViewEp = ep()) != null) {
            baseFeedPlayerViewEp.mZ0(function0);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        C0SZ8 c0sz8LJJIJIL;
        BaseFeedPlayerView baseFeedPlayerViewE;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJJJJLIIL.getValue();
        if (feedCollectionViewPagerAbility != null && (c0sz8LJJIJIL = feedCollectionViewPagerAbility.LJJIJIL(str)) != null && (baseFeedPlayerViewE = c0sz8LJJIJIL.E()) != null) {
            baseFeedPlayerViewE.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C0SZ8 c0sz8LJJIJIL;
        BaseFeedPlayerView baseFeedPlayerViewE;
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJJJJLIIL.getValue();
        if (feedCollectionViewPagerAbility != null && (c0sz8LJJIJIL = feedCollectionViewPagerAbility.LJJIJIL(str)) != null && (baseFeedPlayerViewE = c0sz8LJJIJIL.E()) != null) {
            baseFeedPlayerViewE.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onRenderFirstFrame(c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void s5(InterfaceC1473950oSX interfaceC1473950oSX) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.s5(interfaceC1473950oSX);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void wa(boolean z) {
        BaseFeedPlayerView baseFeedPlayerViewEp;
        BaseFeedPlayerView baseFeedPlayerViewEp2 = ep();
        if (baseFeedPlayerViewEp2 != null && baseFeedPlayerViewEp2.Mg() && (baseFeedPlayerViewEp = ep()) != null) {
            baseFeedPlayerViewEp.wa(z);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        BaseFeedPlayerView baseFeedPlayerViewEp = ep();
        if (baseFeedPlayerViewEp != null) {
            baseFeedPlayerViewEp.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView
    public final void q7(float f, int i, int i2, int i3) {
        BaseFeedPlayerView baseFeedPlayerViewEp;
        BaseFeedPlayerView baseFeedPlayerViewEp2 = ep();
        if (baseFeedPlayerViewEp2 != null && baseFeedPlayerViewEp2.Mg() && (baseFeedPlayerViewEp = ep()) != null) {
            baseFeedPlayerViewEp.q7(f, i, i2, i3);
        }
    }
}
