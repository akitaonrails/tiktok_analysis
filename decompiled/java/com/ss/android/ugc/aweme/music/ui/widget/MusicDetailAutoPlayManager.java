package com.ss.android.ugc.aweme.music.ui.widget;

import X.C1473870oSP;
import X.C1482640ogY;
import X.C1483410ohn;
import X.C2188811AlT;
import X.C581360Mr8;
import X.C582060MsG;
import X.C582980Mtk;
import X.C584150Mvd;
import X.C584690MwV;
import X.C721220SQu;
import X.InterfaceC584700MwW;
import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.ui.widget.MusicDetailAutoPlayManager;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDetailAutoPlayManager implements IMDPAutoPlayAbility {
    public C1482640ogY LLILLJJLI;
    public Aweme LLILLL;
    public boolean LLILZIL;
    public final C584690MwV LLILZLL;
    public C1483410ohn LL = new C1483410ohn();
    public final CopyOnWriteArrayList<InterfaceC584700MwW> LLILZ = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        synchronized (this) {
            Iterator<InterfaceC584700MwW> it2 = this.LLILZ.iterator();
            while (it2.hasNext()) {
                it2.next().onRelease();
            }
        }
        this.LLILZIL = false;
        C1483410ohn c1483410ohn = this.LL;
        if (c1483410ohn != null) {
            c1483410ohn.LJJIJ(null);
        }
        C1483410ohn c1483410ohn2 = this.LL;
        if (c1483410ohn2 != null) {
            c1483410ohn2.release();
        }
        this.LLILZ.clear();
        this.LL = null;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final float YK() {
        if (this.LL == null) {
            return 0.0f;
        }
        return r2.getCurrentPosition() / r2.getDuration();
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final long getCurrentPosition() {
        C1483410ohn c1483410ohn = this.LL;
        if (c1483410ohn != null) {
            return c1483410ohn.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0MwV] */
    public MusicDetailAutoPlayManager() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MDPSquare_Player_");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL = new OnUIPlayListener() { // from class: X.0MwV
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
            public final /* synthetic */ void onPausePlay(String str) {
                C583620Mum.LJIIZILJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIJ(this, str, c1480430ocz);
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
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
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
            public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
                C583620Mum.LJJJJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJIZL(this, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str) {
                C583620Mum.LJJJJJ(this, str);
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

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPause(String str) {
                C583620Mum.LJJII(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPrepared(String str) {
                String aid;
                boolean zIsMute;
                C583620Mum.LJJIIJ(this, str);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                Aweme aweme = musicDetailAutoPlayManager.LLILLL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C1483410ohn c1483410ohn = this.LL.LL;
                if (c1483410ohn != null) {
                    zIsMute = c1483410ohn.isMute();
                } else {
                    zIsMute = false;
                }
                synchronized (musicDetailAutoPlayManager) {
                    Iterator<InterfaceC584700MwW> it2 = musicDetailAutoPlayManager.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(aid, zIsMute);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayRelease(String str) {
                C583620Mum.LJJIIZI(this, str);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                synchronized (musicDetailAutoPlayManager) {
                    Iterator<InterfaceC584700MwW> it2 = musicDetailAutoPlayManager.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onRelease();
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str, int i) {
                String aid;
                C583620Mum.LJIJJ(this, str, i);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                Aweme aweme = musicDetailAutoPlayManager.LLILLL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                synchronized (musicDetailAutoPlayManager) {
                    Iterator<InterfaceC584700MwW> it2 = musicDetailAutoPlayManager.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onPlayCompleted(aid, i);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJ(this, str, c1481290oeN);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                synchronized (musicDetailAutoPlayManager) {
                    Iterator<InterfaceC584700MwW> it2 = musicDetailAutoPlayManager.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().onFailed();
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                String aid;
                C583620Mum.LJJJIL(this, str, c1480420ocy);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                musicDetailAutoPlayManager.LLILZIL = false;
                Aweme aweme = musicDetailAutoPlayManager.LLILLL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                synchronized (musicDetailAutoPlayManager) {
                    Iterator<InterfaceC584700MwW> it2 = musicDetailAutoPlayManager.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LJJIJIIJI(aid);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                Aweme aweme = musicDetailAutoPlayManager.LLILLL;
                if (aweme != null) {
                    musicDetailAutoPlayManager.LIZLLL(C584710MwX.LIZ(aweme.getAid(), "video"));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
                MusicDetailAutoPlayManager musicDetailAutoPlayManager = this.LL;
                synchronized (musicDetailAutoPlayManager) {
                    Iterator<InterfaceC584700MwW> it2 = musicDetailAutoPlayManager.LLILZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final Aweme SQ1() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final void CO1(String str) {
        C1483410ohn c1483410ohn = this.LL;
        if (c1483410ohn != null) {
            c1483410ohn.LJJLI(false);
        }
        if (str == null) {
            Aweme aweme = this.LLILLL;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
        }
        synchronized (this) {
            Iterator<InterfaceC584700MwW> it2 = this.LLILZ.iterator();
            while (it2.hasNext()) {
                it2.next().onPause(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final void Fq2(boolean z) {
        C1483410ohn c1483410ohn;
        if (this.LLILLL != null && (c1483410ohn = this.LL) != null) {
            if (z) {
                c1483410ohn.LJFF();
            } else {
                c1483410ohn.LJIJJ();
            }
            synchronized (this) {
                Iterator<InterfaceC584700MwW> it2 = this.LLILZ.iterator();
                while (it2.hasNext()) {
                    it2.next().m0(z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final synchronized void KK2(InterfaceC584700MwW interfaceC584700MwW) {
        if (this.LLILZ.contains(interfaceC584700MwW)) {
            this.LLILZ.remove(interfaceC584700MwW);
        }
    }

    public final void LIZLLL(int i) {
        C1483410ohn c1483410ohn = this.LL;
        if (c1483410ohn != null && i > 0 && c1483410ohn.getDuration() > 0) {
            c1483410ohn.seek(i / c1483410ohn.getDuration());
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final synchronized void p91(InterfaceC584700MwW interfaceC584700MwW) {
        if (!this.LLILZ.contains(interfaceC584700MwW)) {
            this.LLILZ.add(interfaceC584700MwW);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    public final void pu2(C1473870oSP c1473870oSP) {
        Surface surface;
        C1482640ogY c1482640ogYLJIIIIZZ = C1482640ogY.LJIIIIZZ(c1473870oSP);
        this.LLILLJJLI = c1482640ogYLJIIIIZZ;
        C1483410ohn c1483410ohn = this.LL;
        if (c1483410ohn != null) {
            if (c1482640ogYLJIIIIZZ != null) {
                surface = c1482640ogYLJIIIIZZ.getSurface();
            } else {
                surface = null;
            }
            c1483410ohn.setSurface(surface);
        }
    }

    public final boolean LIZIZ(Aweme aweme, int i, boolean z) {
        boolean z2;
        boolean z3;
        Surface surface;
        C1483410ohn c1483410ohn = this.LL;
        if (c1483410ohn == null || c1483410ohn.isPlaying() || aweme == null || !Intrinsics.LJFF(aweme, this.LLILLL)) {
            return false;
        }
        this.LLILZIL = true;
        C1483410ohn c1483410ohn2 = this.LL;
        if (c1483410ohn2 != null) {
            C1482640ogY c1482640ogY = this.LLILLJJLI;
            if (c1482640ogY != null) {
                surface = c1482640ogY.getSurface();
            } else {
                surface = null;
            }
            c1483410ohn2.setSurface(surface);
        }
        C1483410ohn c1483410ohn3 = this.LL;
        if (c1483410ohn3 != null) {
            Video video = aweme.getVideo();
            if (C582980Mtk.LIZIZ(aweme)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C721220SQu.LIZLLL(aweme)) {
                z3 = true;
            } else {
                z3 = false;
            }
            C581360Mr8 c581360Mr8LIZ = C582060MsG.LIZ();
            c581360Mr8LIZ.LJII = "music_detail_page_square";
            c581360Mr8LIZ.LJIIIZ = new LinkedHashMap();
            c1483410ohn3.LJJIFFI(new C584150Mvd(video, i, c581360Mr8LIZ, z2, z3, null, 523494), this.LLILZLL);
        }
        if (z) {
            C1483410ohn c1483410ohn4 = this.LL;
            if (c1483410ohn4 != null) {
                c1483410ohn4.LJFF();
            }
        } else {
            C1483410ohn c1483410ohn5 = this.LL;
            if (c1483410ohn5 != null) {
                c1483410ohn5.LJIJJ();
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[PHI: r6
      0x0087: PHI (r6v1 boolean) = (r6v0 boolean), (r6v3 boolean) binds: [B:33:0x0084, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZB1(com.ss.android.ugc.aweme.feed.model.Aweme r11, boolean r12, int r13) {
        /*
            r10 = this;
            X.0ohn r0 = r10.LL
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "playVideo-->aweme:"
            r1.append(r0)
            r3 = 0
            if (r11 == 0) goto L89
            java.lang.String r0 = r11.getAid()
        L15:
            r1.append(r0)
            java.lang.String r0 = " mute:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " initialStartTimeMs:"
            r1.append(r0)
            r4 = r13
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            r2 = 1
            r10.LLILZIL = r2
            r10.LLILLL = r11
            X.0ohn r1 = r10.LL
            if (r1 == 0) goto L3a
            X.0MwV r0 = r10.LLILZLL
            r1.LJJIJ(r0)
        L3a:
            X.0ohn r1 = r10.LL
            if (r1 == 0) goto L71
            if (r11 == 0) goto L44
            com.ss.android.ugc.aweme.feed.model.Video r3 = r11.getVideo()
        L44:
            if (r11 == 0) goto L83
            boolean r0 = X.C582980Mtk.LIZIZ(r11)
            if (r0 != r2) goto L83
            r6 = 1
        L4d:
            boolean r0 = X.C721220SQu.LIZLLL(r11)
            if (r0 != r2) goto L87
            r7 = 1
        L54:
            X.0Mr8 r5 = X.C582060MsG.LIZ()
            java.lang.String r0 = "music_detail_page_square"
            r5.LJII = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.LJIIIZ = r0
            X.0Mvd r2 = new X.0Mvd
            r8 = 0
            r9 = 523494(0x7fce6, float:7.33571E-40)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.0MwV r0 = r10.LLILZLL
            r1.LJJIFFI(r2, r0)
        L71:
            if (r12 == 0) goto L7b
            X.0ohn r0 = r10.LL
            if (r0 == 0) goto L7a
            r0.LJFF()
        L7a:
            return
        L7b:
            X.0ohn r0 = r10.LL
            if (r0 == 0) goto L7a
            r0.LJIJJ()
            return
        L83:
            r6 = 0
            if (r11 == 0) goto L87
            goto L4d
        L87:
            r7 = 0
            goto L54
        L89:
            r0 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.widget.MusicDetailAutoPlayManager.ZB1(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int):void");
    }
}
