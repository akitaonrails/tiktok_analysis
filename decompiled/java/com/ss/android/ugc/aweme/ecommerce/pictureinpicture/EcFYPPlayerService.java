package com.ss.android.ugc.aweme.ecommerce.pictureinpicture;

import X.C0SR4;
import X.C0T1R;
import X.C1388190mED;
import X.C13LP;
import X.C1483410ohn;
import X.C19EG;
import X.C583730Mux;
import X.InterfaceC1058480deQ;
import X.InterfaceC214902198i;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class EcFYPPlayerService implements IECommerceFYPPlayerService {
    public WeakReference<IPlayerComponentAbility> LIZ = new WeakReference<>(null);
    public final Map<Integer, C583730Mux> LIZIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService
    public final void LJ() {
        IPlayerComponentAbility iPlayerComponentAbility = this.LIZ.get();
        if (iPlayerComponentAbility != null) {
            iPlayerComponentAbility.tryResumePlay();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService
    public final void LIZ(final EcPiPViewModel ecPiPViewModel) {
        OnUIPlayListener onUIPlayListener = new OnUIPlayListener(ecPiPViewModel) { // from class: X.0Mux
            public final InterfaceC583740Muy LL;

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
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
            public final /* synthetic */ void onDecoderBuffering(boolean z) {
                C583620Mum.LJIIL(this, z);
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
            public final /* synthetic */ void onPlayCompleted(String str) {
                C583620Mum.LJIJI(this, str);
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
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepared(String str) {
                C583620Mum.LJJIIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str) {
                C583620Mum.LJJIJ(this, str);
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
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                C583620Mum.LJJIZ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str) {
                C583620Mum.LJJJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJI(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C583620Mum.LJJJJ(this, c1480420ocy);
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

            {
                this.LL = ecPiPViewModel;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                this.LL.LLLLLLJ();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPause(String str) {
                this.LL.LLLLLLJ();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlaying(String str) {
                this.LL.q3();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                this.LL.q3();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(String str, boolean z) {
                this.LL.AH();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(String str, boolean z) {
                this.LL.AH();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
                this.LL.LLLLLLJ();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str, int i) {
                C583620Mum.LJIJJ(this, str, i);
                this.LL.PX0();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                this.LL.ap();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                this.LL.q3();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
                this.LL.q3();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                this.LL.AH();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                this.LL.AH();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                this.LL.ap();
            }
        };
        this.LIZIZ.put(Integer.valueOf(ecPiPViewModel.hashCode()), (C583730Mux) onUIPlayListener);
        C1483410ohn.LJLJJI().LJIILL().LJJIJIIJIL(onUIPlayListener);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService
    public final void LIZIZ(Fragment fragment) {
        C0SR4 c0sr4Zv0;
        List<Aweme> listFg;
        IECommerceAnchorService iECommerceAnchorService;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment);
        if (iFeedPanelPlatformAbilityLIZJ != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ.x32()) != null) {
            this.LIZ = new WeakReference<>(iPlayerComponentAbilityX32);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(fragment);
        if (iFeedPanelPlatformAbilityLIZJ2 != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityLIZJ2.Zv0()) != null && (listFg = c0sr4Zv0.Fg()) != null && (iECommerceAnchorService = (IECommerceAnchorService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceAnchorService.class))) != null) {
            iECommerceAnchorService.LJJIJIL(listFg);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService
    public final void LIZJ(EcPiPViewModel ecPiPViewModel) {
        C583730Mux c583730Mux = (C583730Mux) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(ecPiPViewModel.hashCode()));
        if (c583730Mux != null) {
            C1483410ohn.LJLJJI().LJIILL().LJIIL(c583730Mux);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService
    public final Fragment LIZLLL(LivePlayFragment livePlayFragment) {
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            return iDetailFeedSafService.LIZLLL(livePlayFragment);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService
    public final Fragment getDetailSafRootFragment(View view) {
        Fragment fragmentLIZ;
        InterfaceC214902198i interfaceC214902198iLJIILLIIL;
        Context context;
        C19EG c19egLIZIZ;
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            fragmentLIZ = iDetailFeedSafService.LIZ(view);
            if (fragmentLIZ == null) {
            }
            return fragmentLIZ;
        }
        fragmentLIZ = null;
        if (view != null && (context = view.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19egLIZIZ);
        } else {
            interfaceC214902198iLJIILLIIL = null;
        }
        if (interfaceC214902198iLJIILLIIL instanceof InterfaceC1058480deQ) {
            if (!(interfaceC214902198iLJIILLIIL instanceof Fragment)) {
                return null;
            }
            return (Fragment) interfaceC214902198iLJIILLIIL;
        }
        return fragmentLIZ;
    }
}
