package com.ss.android.ugc.playerkit.videoview;

import X.C12861051n;
import X.C1473870oSP;
import X.C1475150oUT;
import X.C1475650oVH;
import X.C1477160oXi;
import X.C1477400oY6;
import X.C1479490obT;
import X.C1479510obV;
import X.C1480090ocR;
import X.C1480360ocs;
import X.C1480390ocv;
import X.C1480820odc;
import X.C1480850odf;
import X.C1480890odj;
import X.C1480920odm;
import X.C1480940odo;
import X.C1481110oe5;
import X.C1481240oeI;
import X.C1482640ogY;
import X.C1493400oxu;
import X.C1946807ju;
import X.C1AF0;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C582130MsN;
import X.C585560Mxu;
import X.C585570Mxv;
import X.C844470XAv;
import X.EnumC1479760obu;
import X.EnumC1480880odi;
import X.InterfaceC1472490oQB;
import X.InterfaceC1479880oc6;
import X.InterfaceC1480320oco;
import X.InterfaceC1480930odn;
import X.InterfaceC690050R4x;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class VideoViewComponent implements InterfaceC690050R4x, LifecycleObserver, GenericLifecycleObserver {
    public static final C1480820odc LLJJ = new InterfaceC1472490oQB() { // from class: X.0odc
        @Override // X.InterfaceC1472490oQB
        public void onEvent(JSONArray jSONArray) {
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        C844470XAv.LIZ.getClass();
                        AppLog.recordMiscLog(C844470XAv.LIZ(), "video_playq", JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }

        @Override // X.InterfaceC1472490oQB
        public final void LIZ(String str, JSONArray jSONArray) {
            if (!TextUtils.isEmpty(str) && C1480850odf.LIZJ.isEnablePlayerLogV2()) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        C20684815ws.LJIJ(str, JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    };
    public final boolean LL;
    public SimplifyAsyncPlayer LLILLJJLI;
    public C1482640ogY LLILLL;
    public final Set<OnUIPlayListener> LLILZ;
    public Video LLILZIL;
    public Session LLILZLL;
    public volatile boolean LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public final InterfaceC1480320oco LLJI;
    public final C585560Mxu LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    public final void LJI() {
        this.LLJILJIL = true;
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJIILLIIL(0.0f, 0.0f);
        }
    }

    public final void LJIILIIL() {
        this.LLJILJIL = false;
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJIILLIIL(1.0f, 1.0f);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onPageResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPagePause();
        }
    }

    public final long LIZLLL() {
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            return simplifyAsyncPlayer.getCurrentPosition();
        }
        return 0L;
    }

    public final long LJ() {
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            return simplifyAsyncPlayer.getDuration();
        }
        return 0L;
    }

    public final boolean LJFF() {
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            return simplifyAsyncPlayer.isPlaying();
        }
        return false;
    }

    public final void LJIIJ() {
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJJIIZ();
        }
    }

    public final void LJIIJJI() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop() called ");
            sbLIZ.append(this.LLILLJJLI);
            C1481110oe5.LIZIZ("VideoViewComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            if (C1480940odo.LIZ && C1475150oUT.LIZ(simplifyAsyncPlayer.getPlayerType()) && C1480850odf.LIZJ.isEnableBytevc1BlackList()) {
                C1480940odo.LIZ = this.LLILLJJLI.LJLJLLL();
            }
            this.LLILLJJLI.stop();
        }
        C1482640ogY c1482640ogY = this.LLILLL;
        if (c1482640ogY != null) {
            c1482640ogY.LJFF();
        }
    }

    public final void pause() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause() called ");
            sbLIZ.append(this.LLILLJJLI);
            C1481110oe5.LIZIZ("VideoViewComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.pause();
        }
        C1482640ogY c1482640ogY = this.LLILLL;
        if (c1482640ogY != null) {
            c1482640ogY.LIZ();
            SimplifyAsyncPlayer simplifyAsyncPlayer2 = this.LLILLJJLI;
            if (simplifyAsyncPlayer2 == null || simplifyAsyncPlayer2.getPlayerType() != EnumC1479760obu.IjkHardware) {
                return;
            }
            this.LLILLL.getClass();
        }
    }

    @Override // X.InterfaceC690050R4x
    public final void release() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release() called ");
            sbLIZ.append(this.LLILLJJLI);
            C1481110oe5.LIZIZ("VideoViewComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.release();
        }
        C1482640ogY c1482640ogY = this.LLILLL;
        if (c1482640ogY != null) {
            c1482640ogY.LJFF();
        }
    }

    public final void resume() {
        SimVideoUrlModel simVideoUrlModel;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume() called ");
            sbLIZ.append(this.LLILLJJLI);
            C1481110oe5.LIZIZ("VideoViewComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        Session session = this.LLILZLL;
        if (session == null || (simVideoUrlModel = session.urlModel) == null) {
            return;
        }
        this.LLILLJJLI.LJJLIIIIJ(simVideoUrlModel.getSourceId());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Mxu] */
    public VideoViewComponent() {
        this.LLILZ = Collections.newSetFromMap(new WeakHashMap());
        this.LLJ = 0;
        this.LLJI = new C1480090ocR();
        this.LLJIJIL = new OnUIPlayListener(this) { // from class: X.0Mxu
            public final WeakReference<VideoViewComponent> LL;

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
            public final void onDecoderBuffering(boolean z) {
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
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str, c1480430ocz);
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

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(boolean z) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onBuffering(z);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPausePlay(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayCompleted(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayCompletedFirstTime(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                Video video;
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null) {
                    videoViewComponent.LLIZ = false;
                    if (!videoViewComponent.LLILZ.isEmpty()) {
                        Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onPlayFailed(c1481290oeN);
                        }
                    }
                    if (c1481290oeN.LIZIZ && (video = videoViewComponent.LLILZIL) != null) {
                        videoViewComponent.LJIIIIZZ(video.getPlayAddrH264(), true, videoViewComponent.LLJ, videoViewComponent.LLILZIL.isNeedSetCookie());
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPause(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayPause(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayProgressChange(f);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayStop(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayStop(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPreparePlay(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null) {
                    videoViewComponent.LLIZ = false;
                    videoViewComponent.LLIZLLLIL = false;
                    C585570Mxv.LIZ.LIZ(videoViewComponent);
                    if (!videoViewComponent.LLILZ.isEmpty()) {
                        Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onRenderFirstFrame(c1480420ocy);
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderReady(C1480430ocz c1480430ocz) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onRenderReady(c1480430ocz);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onResumePlay(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null) {
                    videoViewComponent.LLIZ = false;
                    if (!videoViewComponent.LLILZ.isEmpty()) {
                        Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onRetryOnError(c1481290oeN);
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onResumePlay(str, c1480430ocz);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onSeekEnd(String str, boolean z) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSeekEnd(str, z);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onVideoSizeChanged(String str, int i, int i2) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onVideoSizeChanged(str, i, i2);
                    }
                }
            }
        };
        this.LLJILJILJ = true;
        this.LLJILLL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPagePause() {
        pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onPageResume() {
        resume();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Mxu] */
    public VideoViewComponent(int i) {
        this.LLILZ = Collections.newSetFromMap(new WeakHashMap());
        this.LLJ = 0;
        this.LLJI = new C1480090ocR();
        this.LLJIJIL = new OnUIPlayListener(this) { // from class: X.0Mxu
            public final WeakReference<VideoViewComponent> LL;

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i2) {
                C583620Mum.LIZJ(this, str, j, i2);
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
            public final void onDecoderBuffering(boolean z) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onFrameAboutToBeRendered(int i2, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i2, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLoopPlay(String str, int i2) {
                C583620Mum.LJIILL(this, str, i2);
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
            public final /* synthetic */ void onPlayCompleted(String str, int i2) {
                C583620Mum.LJIJJ(this, str, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str, c1480430ocz);
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
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
                C583620Mum.LJJIJL(this, str, i2, jSONObject);
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
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekStart(String str, int i2, float f) {
                C583620Mum.LJJJJZ(this, str, i2, f);
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
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i2) {
                C583620Mum.LJJJLL(this, str, enumC2281141EQm, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSecondFrame(String str) {
                C583620Mum.LJJJLZIJ(this, str);
            }

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(boolean z) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onBuffering(z);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPausePlay(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayCompleted(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayCompletedFirstTime(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                Video video;
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null) {
                    videoViewComponent.LLIZ = false;
                    if (!videoViewComponent.LLILZ.isEmpty()) {
                        Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onPlayFailed(c1481290oeN);
                        }
                    }
                    if (c1481290oeN.LIZIZ && (video = videoViewComponent.LLILZIL) != null) {
                        videoViewComponent.LJIIIIZZ(video.getPlayAddrH264(), true, videoViewComponent.LLJ, videoViewComponent.LLILZIL.isNeedSetCookie());
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPause(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayPause(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayProgressChange(f);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayStop(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayStop(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPreparePlay(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null) {
                    videoViewComponent.LLIZ = false;
                    videoViewComponent.LLIZLLLIL = false;
                    C585570Mxv.LIZ.LIZ(videoViewComponent);
                    if (!videoViewComponent.LLILZ.isEmpty()) {
                        Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onRenderFirstFrame(c1480420ocy);
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderReady(C1480430ocz c1480430ocz) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onRenderReady(c1480430ocz);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onResumePlay(str);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null) {
                    videoViewComponent.LLIZ = false;
                    if (!videoViewComponent.LLILZ.isEmpty()) {
                        Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().onRetryOnError(c1481290oeN);
                        }
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onResumePlay(str, c1480430ocz);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onSeekEnd(String str, boolean z) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSeekEnd(str, z);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onVideoSizeChanged(String str, int i2, int i22) {
                VideoViewComponent videoViewComponent = this.LL.get();
                if (videoViewComponent != null && !videoViewComponent.LLILZ.isEmpty()) {
                    Iterator<OnUIPlayListener> it2 = videoViewComponent.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onVideoSizeChanged(str, i2, i22);
                    }
                }
            }
        };
        this.LLJILJILJ = true;
        this.LLJILLL = false;
        this.LL = true;
    }

    @Override // X.InterfaceC690050R4x
    public final void H1(OnUIPlayListener onUIPlayListener) {
        SimplifyAsyncPlayer simplifyAsyncPlayer;
        this.LLILZ.remove(onUIPlayListener);
        if (this.LLILZ.isEmpty() && (simplifyAsyncPlayer = this.LLILLJJLI) != null) {
            simplifyAsyncPlayer.LJJIJ(null);
        }
    }

    public final void LIZ(OnUIPlayListener onUIPlayListener) {
        this.LLILZ.add(onUIPlayListener);
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJJIJ(this.LLJIJIL);
        }
    }

    public final void LIZIZ(ViewGroup viewGroup) {
        this.LLILLL = C1482640ogY.LIZIZ(viewGroup, false);
        viewGroup.getContext();
        this.LLILLL.Dn(new C1480890odj(this));
    }

    public final boolean LIZJ(VideoUrlModel videoUrlModel) {
        Session session;
        if (videoUrlModel == null || (session = this.LLILZLL) == null || session.urlModel == null || !C2093608Ic.LIZJ(videoUrlModel.getUri(), this.LLILZLL.urlModel.getUri()) || !C2093608Ic.LIZJ(videoUrlModel.getRatio(), this.LLILZLL.urlModel.getRatio()) || TextUtils.isEmpty(videoUrlModel.getSourceId()) || !this.LLILLJJLI.LJLZ(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(float f) {
        SimplifyAsyncPlayer simplifyAsyncPlayer = this.LLILLJJLI;
        if (simplifyAsyncPlayer != null) {
            simplifyAsyncPlayer.LJIILL(f);
        }
    }

    public final void LJIIL(Video video) {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryResume() called ");
            sbLIZ.append(this.LLILLJJLI);
            C1481110oe5.LIZIZ("VideoViewComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null) {
            return;
        }
        if ((LIZJ(playAddrBytevc1) || LIZJ(playAddrH264)) && !this.LLJILLL) {
            resume();
        } else {
            this.LLJILLL = false;
            LJII(video, this.LLJ);
        }
    }

    public final void LJIILJJIL(C1473870oSP c1473870oSP) {
        this.LLILLL = C1482640ogY.LJIIIIZZ(c1473870oSP);
        c1473870oSP.getContext();
        this.LLILLL.Dn(new C1480890odj(this));
    }

    public final void LJII(Video video, int i) {
        if (video != null) {
            this.LLILZIL = video;
            if (!this.LLILLL.Da()) {
                this.LLIZLLLIL = true;
                return;
            }
            if (this.LLIZ) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("render() called ");
                    sbLIZ.append(this.LLILLJJLI);
                    C1481110oe5.LIZIZ("VideoViewComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (this.LLILLJJLI != null) {
                    C585570Mxv.LIZ.LIZ(this);
                    this.LLIZ = false;
                    this.LLILLJJLI.LJJLJLI();
                    return;
                }
                return;
            }
            EnumC1479760obu playerType = C1480850odf.LIZJ.getPlayerType();
            if (C1480940odo.LIZ && C1475150oUT.LIZIZ(C1481240oeI.LJ(video.getPlayAddrBytevc1())) && C1475150oUT.LIZ(playerType)) {
                LJIIIIZZ(video.getPlayAddrBytevc1(), false, i, video.isNeedSetCookie());
            } else {
                LJIIIIZZ(video.getPlayAddrH264(), false, i, video.isNeedSetCookie());
            }
        }
    }

    public final void LJIIIIZZ(final VideoUrlModel videoUrlModel, final boolean z, int i, boolean z2) {
        SimplifyAsyncPlayer simplifyAsyncPlayer;
        List<String> urlList;
        EnumC1480880odi enumC1480880odi = EnumC1480880odi.INSTANCE;
        enumC1480880odi.setBitrateManager(C582130MsN.LIZ().LJ().LIZIZ());
        enumC1480880odi.setCacheChecker(new InterfaceC1480930odn() { // from class: X.0odl
            @Override // X.InterfaceC1480930odn
            public final boolean LIZ(VideoUrlModel videoUrlModel2) {
                return C1478160oZK.LIZ().isCache(C1481240oeI.LJ(videoUrlModel2));
            }
        });
        enumC1480880odi.setPlayInfoCallback(C1475650oVH.LIZ().LIZJ());
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("VideoViewComponent", "play() called " + this.LLILLJJLI);
        }
        if (videoUrlModel == null || !C1475150oUT.LIZIZ(C1481240oeI.LJ(videoUrlModel))) {
            return;
        }
        String uri = videoUrlModel.getUri();
        if (TextUtils.isEmpty(uri)) {
            C1AF0.LJ(new RuntimeException("VideoUrlModel url_key is null. vid=" + videoUrlModel.getSourceId()));
        }
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        this.LLILZLL = c1477400oY6.LJ(uri);
        this.LLJ = i;
        if (this.LL) {
            this.LLILLJJLI = new SimplifyAsyncPlayer(new C1479490obT(C1480850odf.LIZJ.getPlayerType(), -1));
        } else {
            C1480360ocs c1480360ocs = C1480360ocs.LIZJ;
            C1480390ocv c1480390ocv = c1480360ocs.LIZIZ;
            c1480360ocs.LIZ(uri);
            c1480390ocv.getClass();
            C1480850odf c1480850odf = C1480850odf.LIZJ;
            if (c1480850odf.isMultiPlayer()) {
                simplifyAsyncPlayer = new SimplifyAsyncPlayer(new C1479490obT(c1480850odf.getPlayerType(), -1));
            } else {
                C1480920odm c1480920odm = C1480920odm.LIZJ;
                EnumC1479760obu playerType = c1480850odf.getPlayerType();
                synchronized (c1480920odm) {
                    if (c1480920odm.LIZ == null) {
                        c1480920odm.LIZIZ = playerType;
                        c1480920odm.LIZ = new SimplifyAsyncPlayer(new C1479490obT(playerType, -1));
                    } else {
                        EnumC1479760obu enumC1479760obu = c1480920odm.LIZIZ;
                        if (enumC1479760obu != null && !enumC1479760obu.equals(playerType)) {
                            c1480920odm.LIZ.release();
                            c1480920odm.LIZIZ = playerType;
                            c1480920odm.LIZ = new SimplifyAsyncPlayer(new C1479490obT(playerType, -1));
                        }
                    }
                    simplifyAsyncPlayer = c1480920odm.LIZ;
                }
            }
            this.LLILLJJLI = simplifyAsyncPlayer;
        }
        Session session = this.LLILZLL;
        session.uri = uri;
        session.urlModel = C1481240oeI.LJ(videoUrlModel);
        this.LLILZLL.playerType = this.LLILLJJLI.getPlayerType();
        boolean z3 = this.LLJILJILJ;
        if (!z3) {
            this.LLILLJJLI.setLoop(z3);
        }
        this.LLILLJJLI.LJJIJ(this.LLJIJIL);
        this.LLILLJJLI.LJLJJL(LLJJ);
        this.LLILLJJLI.LJLI(this.LLJI);
        this.LLILLJJLI.LJLIIL(enumC1480880odi.playInfoCallback());
        C12861051n.LIZIZ.LIZ(this.LLILZLL.uri);
        C1946807ju.LIZ(uri);
        final Session session2 = this.LLILZLL;
        InterfaceC1479880oc6<C1477160oXi> interfaceC1479880oc6 = new InterfaceC1479880oc6<C1477160oXi>(videoUrlModel, session2, z) { // from class: X.0ocr
            public final VideoUrlModel LIZ;
            public final Session LIZIZ;
            public final boolean LIZJ;

            @Override // X.InterfaceC1479880oc6
            public final /* synthetic */ C1477160oXi LIZ() {
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [X.0ocu] */
            @Override // X.InterfaceC1479880oc6
            public final C1477160oXi get() {
                C1480360ocs c1480360ocs2 = C1480360ocs.LIZJ;
                String urlKey = this.LIZ.getUrlKey();
                if (c1480360ocs2.LIZ == null) {
                    C582130MsN.LIZ().LJ().LIZ.getClass();
                    c1480360ocs2.LIZ = new Object() { // from class: X.0ocu
                    };
                }
                C1480380ocu c1480380ocu = c1480360ocs2.LIZ;
                c1480360ocs2.LIZ(urlKey);
                c1480380ocu.getClass();
                return C1477740oYe.LIZ().LIZJ(C1481240oeI.LJ(this.LIZ), this.LIZIZ.playerType, this.LIZJ);
            }

            {
                this.LIZ = videoUrlModel;
                this.LIZIZ = session2;
                this.LIZJ = z;
            }
        };
        InterfaceC1479880oc6<Boolean> interfaceC1479880oc62 = new InterfaceC1479880oc6<Boolean>(videoUrlModel) { // from class: X.0odk
            public final VideoUrlModel LIZ;

            @Override // X.InterfaceC1479880oc6
            public final /* synthetic */ Boolean LIZ() {
                return null;
            }

            @Override // X.InterfaceC1479880oc6
            public final Boolean get() {
                EnumC1480880odi enumC1480880odi2 = EnumC1480880odi.INSTANCE;
                return enumC1480880odi2.cacheChecker() == null ? Boolean.FALSE : Boolean.valueOf(enumC1480880odi2.cacheChecker().LIZ(this.LIZ));
            }

            {
                this.LIZ = videoUrlModel;
            }
        };
        C1480850odf c1480850odf2 = C1480850odf.LIZJ;
        C1479510obV c1479510obV = new C1479510obV(interfaceC1479880oc6, interfaceC1479880oc62, c1480850odf2.context(), videoUrlModel.getSourceId(), true, c1480850odf2.prepareConfig(), false, videoUrlModel.isBytevc1() ? 1 : 0, 0, new InterfaceC1479880oc6<Integer>(videoUrlModel) { // from class: X.0oct
            public final VideoUrlModel LIZ;

            @Override // X.InterfaceC1479880oc6
            public final /* synthetic */ Integer LIZ() {
                return null;
            }

            @Override // X.InterfaceC1479880oc6
            public final Integer get() {
                Integer numValueOf;
                SimVideoUrlModel simVideoUrlModelLJ = C1481240oeI.LJ(this.LIZ);
                int iIntValue = -1;
                if (simVideoUrlModelLJ != null) {
                    InterfaceC1477220oXo hitBitrate = simVideoUrlModelLJ.getHitBitrate();
                    if (hitBitrate == null || (numValueOf = Integer.valueOf(hitBitrate.getQualityType())) == null) {
                        numValueOf = -1;
                    }
                    iIntValue = numValueOf.intValue();
                }
                return Integer.valueOf(iIntValue);
            }

            {
                this.LIZ = videoUrlModel;
            }
        }, uri, true, c1480850odf2.isAsyncInit(), this.LLJ);
        c1479510obV.LJJIII = c1480850odf2.getPlayerFramesWait();
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        c1479510obV.LJJIIZ = bitRatedRatioUri;
        c1477400oY6.LJJIII(bitRatedRatioUri, videoUrlModel.getFileCheckSum());
        c1479510obV.LJJJI = c1480850odf2.isUseVideoTextureRenderer();
        if (z2 && (urlList = videoUrlModel.getUrlList()) != null && urlList.size() > 0) {
            boolean z4 = true;
            for (String str : urlList) {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                if (!TextUtils.isEmpty(str) && str.startsWith("https://")) {
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C1493400oxu.LJIIJ(contextLIZ).LJ(URI.create(str).getHost()) != null) {
                    }
                }
                z4 = false;
            }
            if (z4) {
                c1479510obV.LJJJIL = true;
            }
        }
        this.LLILLJJLI.setSurface(this.LLILLL.getSurface());
        this.LLILLJJLI.LJLIL(c1479510obV);
        if (this.LLJILJIL) {
            this.LLILLJJLI.LJIILLIIL(0.0f, 0.0f);
        } else {
            this.LLILLJJLI.LJIILLIIL(1.0f, 1.0f);
        }
        C1482640ogY c1482640ogY = this.LLILLL;
        if (c1482640ogY != null) {
            c1482640ogY.LJFF();
        }
    }
}
