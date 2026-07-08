package com.ss.android.ugc.aweme.services.mvtemplate;

import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C583620Mum;
import X.EnumC2281141EQm;
import X.InterfaceC1425020nBc;
import X.InterfaceC1425250nBz;
import X.InterfaceC1425330nC7;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class AVVideoViewComponentFactoryImplKt {
    public static final InterfaceC1425330nC7 toIAVMediaError(final C1481290oeN c1481290oeN) {
        return new InterfaceC1425330nC7() { // from class: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImplKt.toIAVMediaError.1
            @Override // X.InterfaceC1425330nC7
            public int getErrorCode() {
                return c1481290oeN.LJ;
            }

            public int getErrorExtra() {
                return c1481290oeN.LJFF;
            }

            @Override // X.InterfaceC1425330nC7
            public Object getExtraInfo() {
                return c1481290oeN.LJI;
            }

            public String getPlayUrl() {
                c1481290oeN.getClass();
                return null;
            }

            public String getSourceId() {
                return c1481290oeN.LIZ;
            }

            public boolean isDash() {
                return c1481290oeN.LIZLLL;
            }
        };
    }

    public static final InterfaceC1425020nBc toIAVPlayerFirstFrameEvent(final C1480420ocy c1480420ocy) {
        return new InterfaceC1425020nBc() { // from class: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImplKt.toIAVPlayerFirstFrameEvent.1
            @Override // X.InterfaceC1425020nBc
            public String getId() {
                return c1480420ocy.getSourceId();
            }
        };
    }

    public static final OnUIPlayListener toOnUIPlayListener(final InterfaceC1425250nBz interfaceC1425250nBz) {
        return new OnUIPlayListener() { // from class: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImplKt.toOnUIPlayListener.1
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
            public final /* synthetic */ void onBuffering(String str, boolean z) {
                C583620Mum.LJ(this, str, z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onBuffering(boolean z) {
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
            public void onDecoderBuffering(boolean z) {
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
            public void onPausePlay(String str) {
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
            public void onPlayCompletedFirstTime(String str) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
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
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepared(String str) {
                C583620Mum.LJJIIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onPlayProgressChange(float f) {
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
            public void onPreparePlay(String str) {
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
            public void onRetryOnError(C1481290oeN c1481290oeN) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
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
            public void onPlayCompleted(String str) {
                interfaceC1425250nBz.onPlayCompleted(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onPlayFailed(C1481290oeN c1481290oeN) {
                InterfaceC1425330nC7 iAVMediaError;
                InterfaceC1425250nBz interfaceC1425250nBz2 = interfaceC1425250nBz;
                if (c1481290oeN != null) {
                    iAVMediaError = AVVideoViewComponentFactoryImplKt.toIAVMediaError(c1481290oeN);
                } else {
                    iAVMediaError = null;
                }
                interfaceC1425250nBz2.LIZJ(iAVMediaError);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onPlayPause(String str) {
                interfaceC1425250nBz.onPlayPause(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onPlayStop(String str) {
                interfaceC1425250nBz.onPlayStop(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                InterfaceC1425020nBc iAVPlayerFirstFrameEvent;
                InterfaceC1425250nBz interfaceC1425250nBz2 = interfaceC1425250nBz;
                if (c1480420ocy != null) {
                    iAVPlayerFirstFrameEvent = AVVideoViewComponentFactoryImplKt.toIAVPlayerFirstFrameEvent(c1480420ocy);
                } else {
                    iAVPlayerFirstFrameEvent = null;
                }
                interfaceC1425250nBz2.LIZIZ(iAVPlayerFirstFrameEvent);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onResumePlay(String str) {
                interfaceC1425250nBz.onResumePlay(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onResumePlay(String str, C1480430ocz c1480430ocz) {
                interfaceC1425250nBz.onResumePlay(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onSeekEnd(String str, boolean z) {
                interfaceC1425250nBz.LJL(z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public void onVideoSizeChanged(String str, int i, int i2) {
                interfaceC1425250nBz.onVideoSizeChanged(i, i2);
            }
        };
    }
}
