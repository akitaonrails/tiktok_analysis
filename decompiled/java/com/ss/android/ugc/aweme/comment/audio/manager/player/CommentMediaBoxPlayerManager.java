package com.ss.android.ugc.aweme.comment.audio.manager.player;

import X.C01GW;
import X.C123100dR;
import X.C1341500l0u;
import X.C1341710l1F;
import X.C1478410oZj;
import X.C1C7U;
import X.C2188811AlT;
import X.C452501pT;
import X.C582130MsN;
import X.InterfaceC1482530ogN;
import X.InterfaceC1484530ojb;
import X.InterfaceC1484830ok5;
import X.InterfaceC787410Uuh;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.audio.manager.player.CommentMediaBoxPlayerManager;
import com.ss.android.ugc.aweme.comment.audio.util.CommentAudioVolumeListener;
import defpackage.d2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentMediaBoxPlayerManager implements d2 {
    public static long LJ;
    public static long LJFF;
    public static boolean LJII;
    public static final InterfaceC1484830ok5 LJIIIIZZ;
    public static final MutableLiveData<d2.a> LJIIIZ;
    public static final MutableLiveData LJIIJ;
    public static final MainHandler LJIIJJI;
    public static final MutableLiveData<C1341500l0u> LJIIL;
    public static final MutableLiveData LJIILIIL;
    public static final C1341710l1F LJIILJJIL;
    public static final CommentMediaBoxPlayerManager LIZ = new CommentMediaBoxPlayerManager();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(104));

    /* JADX INFO: loaded from: classes13.dex */
    public static final class MainHandler extends BPEAHandler {
        public MainHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            C1C7U.LIZ("CommentMediaBoxPlayerManager$MainHandler@566b.handleMessage");
            super.handleMessage(message);
            if (message.what == 1001) {
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                if (!(messageObj instanceof String) || (str = (String) messageObj) == null) {
                    str = "";
                }
                if (Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str) && str.length() > 0) {
                    CommentMediaBoxPlayerManager.LJIIIZ.setValue(new d2.a.b(CommentMediaBoxPlayerManager.LIZIZ));
                }
            }
            C1C7U.LIZIZ("CommentMediaBoxPlayerManager$MainHandler@566b.handleMessage");
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0l1F] */
    static {
        InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        final InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
        interfaceC1484830ok5LIZJ.LJIIZILJ(new InterfaceC1482530ogN() { // from class: X.0lHa
            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Au(Surface surface) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void VK() {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void W1(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPause(String str) {
                String str2 = str;
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayPause playId = ");
                sbLIZ.append(str2);
                sbLIZ.append(" sourceId = ");
                sbLIZ.append(CommentMediaBoxPlayerManager.LIZIZ);
                sbLIZ.append(" isEqual = ");
                sbLIZ.append(Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str2));
                C2188811AlT.LIZIZ(sbLIZ);
                if (!Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str2)) {
                    return;
                }
                CommentMediaBoxPlayerManager.LJIIJJI.removeMessages(1001);
                MutableLiveData<d2.a> mutableLiveData = CommentMediaBoxPlayerManager.LJIIIZ;
                if (str2 == null) {
                    str2 = "";
                }
                mutableLiveData.setValue(new d2.a.f((int) interfaceC1484830ok5LIZJ.LJIIIZ().getCurrentPosition(), (int) interfaceC1484830ok5LIZJ.LJIIIZ().getDuration(), Long.valueOf(System.currentTimeMillis() - CommentMediaBoxPlayerManager.LJ), str2, CommentMediaBoxPlayerManager.LIZJ, CommentMediaBoxPlayerManager.LIZLLL));
                CommentMediaBoxPlayerManager.LIZJ = "";
                CommentMediaBoxPlayerManager.LJFF = 0L;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPrepare(String str) {
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayPrepare playId = ");
                sbLIZ.append(CommentMediaBoxPlayerManager.LIZIZ);
                sbLIZ.append(" sourceId = ");
                sbLIZ.append(str);
                sbLIZ.append(" isEqual = ");
                sbLIZ.append(Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str));
                C2188811AlT.LIZIZ(sbLIZ);
                if (str == null) {
                    str = "";
                }
                CommentMediaBoxPlayerManager.LIZIZ = str;
                CommentMediaBoxPlayerManager.LJII = true;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayCompleted playId = ");
                sbLIZ.append(CommentMediaBoxPlayerManager.LIZIZ);
                sbLIZ.append(" sourceId = ");
                sbLIZ.append(str);
                sbLIZ.append(" isEqual = ");
                sbLIZ.append(Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str));
                C2188811AlT.LIZIZ(sbLIZ);
                if (!Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str)) {
                    return;
                }
                CommentMediaBoxPlayerManager.LJIIJJI.removeMessages(1001);
                MutableLiveData<d2.a> mutableLiveData = CommentMediaBoxPlayerManager.LJIIIZ;
                if (str == null) {
                    str = "";
                }
                mutableLiveData.setValue(new d2.a.c(str, CommentMediaBoxPlayerManager.LIZLLL, Long.valueOf(System.currentTimeMillis() - CommentMediaBoxPlayerManager.LJ)));
                CommentMediaBoxPlayerManager.LIZIZ = "";
                CommentMediaBoxPlayerManager.LIZJ = "";
                CommentMediaBoxPlayerManager.LJFF = 0L;
                CommentMediaBoxPlayerManager.LJII = false;
                CommentMediaBoxPlayerManager.LIZ.LJIIL().LIZIZ();
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                long jCurrentTimeMillis;
                String str2 = str;
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlaying playId = ");
                sbLIZ.append(CommentMediaBoxPlayerManager.LIZIZ);
                sbLIZ.append(" sourceId = ");
                sbLIZ.append(str2);
                sbLIZ.append(" isEqual = ");
                sbLIZ.append(Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str2));
                C2188811AlT.LIZIZ(sbLIZ);
                if (!Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str2)) {
                    return;
                }
                CommentMediaBoxPlayerManager.LJIIJJI.removeMessages(1001);
                CommentMediaBoxPlayerManager.LJ = System.currentTimeMillis();
                if (CommentMediaBoxPlayerManager.LJFF != 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - CommentMediaBoxPlayerManager.LJFF;
                } else {
                    jCurrentTimeMillis = 0;
                }
                MutableLiveData<d2.a> mutableLiveData = CommentMediaBoxPlayerManager.LJIIIZ;
                if (str2 == null) {
                    str2 = "";
                }
                mutableLiveData.setValue(new d2.a.g((int) interfaceC1484830ok5LIZJ.LJIIIZ().getDuration(), CommentMediaBoxPlayerManager.LJ, jCurrentTimeMillis, str2));
                CommentMediaBoxPlayerManager.LIZJ = "";
                CommentMediaBoxPlayerManager.LJFF = 0L;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBuffering, start= ");
                sbLIZ.append(z);
                sbLIZ.append(" playId = ");
                sbLIZ.append(CommentMediaBoxPlayerManager.LIZIZ);
                sbLIZ.append(" sourceId = ");
                sbLIZ.append(str);
                sbLIZ.append(" isEqual = ");
                sbLIZ.append(Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str));
                C2188811AlT.LIZIZ(sbLIZ);
                if (!Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str)) {
                    return;
                }
                CommentMediaBoxPlayerManager.LJIIJJI.removeMessages(1001);
                if (z) {
                    CommentMediaBoxPlayerManager.LJIIIZ.setValue(new d2.a.b(CommentMediaBoxPlayerManager.LIZIZ));
                } else {
                    CommentMediaBoxPlayerManager.LJIIIZ.setValue(new d2.a.C0035a(CommentMediaBoxPlayerManager.LIZIZ));
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                int i;
                Fragment fragmentLIZLLL;
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayFailed, error= ");
                sbLIZ.append(c1481290oeN);
                sbLIZ.append(" playId = ");
                sbLIZ.append(CommentMediaBoxPlayerManager.LIZIZ);
                sbLIZ.append(" sourceId = ");
                sbLIZ.append(str);
                sbLIZ.append(" isEqual = ");
                sbLIZ.append(Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str));
                C1344030l4z.LIZ("CommentMediaBoxPlayerManger", C2188811AlT.LIZIZ(sbLIZ));
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(fragmentLIZLLL);
                    c1389880mGw.LJIIIIZZ(2131826736);
                    c1389880mGw.LJIIJ();
                }
                if (!Intrinsics.LJFF(CommentMediaBoxPlayerManager.LIZIZ, str)) {
                    return;
                }
                MutableLiveData<d2.a> mutableLiveData = CommentMediaBoxPlayerManager.LJIIIZ;
                if (str == null) {
                    str = "";
                }
                if (c1481290oeN != null) {
                    i = c1481290oeN.LJ;
                } else {
                    i = 0;
                }
                mutableLiveData.setValue(new d2.a.d(str, i));
                CommentMediaBoxPlayerManager.LIZIZ = "";
                CommentMediaBoxPlayerManager.LJII = false;
                CommentMediaBoxPlayerManager.LIZJ = "";
                CommentMediaBoxPlayerManager.LJFF = 0L;
                CommentMediaBoxPlayerManager.LJIIJJI.removeMessages(1001);
                CommentMediaBoxPlayerManager.LIZ.LJIIL().LIZIZ();
            }
        });
        LJIIIIZZ = interfaceC1484830ok5LIZJ;
        MutableLiveData<d2.a> mutableLiveData = new MutableLiveData<>(d2.a.e.LIZ);
        LJIIIZ = mutableLiveData;
        LJIIJ = mutableLiveData;
        LJIIJJI = new MainHandler();
        MutableLiveData<C1341500l0u> mutableLiveData2 = new MutableLiveData<>();
        LJIIL = mutableLiveData2;
        LJIILIIL = mutableLiveData2;
        LJIILJJIL = new InterfaceC787410Uuh() { // from class: X.0l1F
            @Override // X.InterfaceC787410Uuh
            public final void LIZ(int i, boolean z) {
                CommentMediaBoxPlayerManager commentMediaBoxPlayerManager = CommentMediaBoxPlayerManager.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isTurnUp = ");
                sbLIZ.append(z);
                sbLIZ.append(", currentVolume = ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                CommentMediaBoxPlayerManager.LJIIL.setValue(new C1341500l0u(z, i, CommentMediaBoxPlayerManager.LIZIZ));
            }
        };
    }

    @Override // defpackage.d2
    public final boolean LIZJ() {
        d2.a value = LJIIIZ.getValue();
        return (value instanceof d2.a.g) || (value instanceof d2.a.h) || (value instanceof d2.a.b) || (value instanceof d2.a.C0035a);
    }

    @Override // defpackage.d2
    public final int LJFF() {
        if (LJII) {
            return (int) LJIIIIZZ.LJIIIZ().getCurrentPosition();
        }
        return 0;
    }

    public final CommentAudioVolumeListener LJIIL() {
        return (CommentAudioVolumeListener) LJI.getValue();
    }

    @Override // defpackage.d2
    public final LiveData<d2.a> LIZLLL() {
        return LJIIJ;
    }

    @Override // defpackage.d2
    public final float LIZ(String str) {
        if (!LJII) {
            return 0.0f;
        }
        if (!Intrinsics.LJFF(str, LIZIZ)) {
            return 1.0f;
        }
        return LJFF() / LJIIIIZZ.LJIIIZ().getDuration();
    }

    @Override // defpackage.d2
    public final void LIZIZ(String str) {
        LIZJ = str;
        LJIIIIZZ.pause();
        LJIIL().LIZIZ();
    }

    @Override // defpackage.d2
    public final void LJ(String str) {
        if (!Intrinsics.LJFF(str, LIZIZ)) {
            return;
        }
        LIZLLL = "resume";
        CommentAudioVolumeListener.LIZ(LJIIL(), LJIILJJIL);
        LJIIIIZZ.resume();
    }

    @Override // defpackage.d2
    public final void LJII(String str) {
        long jCurrentTimeMillis;
        if (C123100dR.LIZ(LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopAudio but isNot prepared playId = ");
            sbLIZ.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIJJI.removeMessages(1001);
            if (LIZJ()) {
                jCurrentTimeMillis = System.currentTimeMillis() - LJ;
            } else {
                jCurrentTimeMillis = 0;
            }
            MutableLiveData<d2.a> mutableLiveData = LJIIIZ;
            mutableLiveData.setValue(new d2.a.i(LIZIZ, str, LIZLLL, Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(mutableLiveData.getValue() instanceof d2.a.f)));
            LIZIZ = "";
        }
        LJIIIIZZ.stop();
        LJII = false;
        LJIIL().LIZIZ();
    }

    @Override // defpackage.d2
    public final boolean LJIIJ(String str) {
        return Intrinsics.LJFF(LIZIZ, str);
    }

    @Override // defpackage.d2
    public final int LJIIJJI(String str) {
        if (!LJII || !Intrinsics.LJFF(str, LIZIZ)) {
            return -1;
        }
        return (int) LJIIIIZZ.LJIIIZ().getDuration();
    }

    @Override // defpackage.d2
    public final void LJI(String str, String str2) {
        if (!Intrinsics.LJFF(str, LIZIZ)) {
            return;
        }
        LIZJ = str2;
        LJIIIIZZ.pause();
        LJIIL().LIZIZ();
    }

    @Override // defpackage.d2
    public final void LJIIIIZZ(String str, String str2) {
        long jCurrentTimeMillis;
        if (Intrinsics.LJFF(str, LIZIZ) && LIZIZ.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopAudio but isNot prepared playId = ");
            sbLIZ.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIJJI.removeMessages(1001);
            if (LIZJ()) {
                jCurrentTimeMillis = System.currentTimeMillis() - LJ;
            } else {
                jCurrentTimeMillis = 0;
            }
            MutableLiveData<d2.a> mutableLiveData = LJIIIZ;
            mutableLiveData.setValue(new d2.a.i(LIZIZ, str2, LIZLLL, Long.valueOf(jCurrentTimeMillis), Boolean.valueOf(mutableLiveData.getValue() instanceof d2.a.f)));
            LIZIZ = "";
            LJII = false;
            LJIIIIZZ.stop();
            LJIIL().LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    @Override // defpackage.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r11, com.ss.android.ugc.aweme.comment.model.AudioCommentModel r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.audio.manager.player.CommentMediaBoxPlayerManager.LJIIIZ(java.lang.String, com.ss.android.ugc.aweme.comment.model.AudioCommentModel):void");
    }
}
