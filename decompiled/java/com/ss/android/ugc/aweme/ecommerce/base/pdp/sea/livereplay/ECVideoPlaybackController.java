package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay;

import X.C0NCQ;
import X.C0NCR;
import X.C0NCS;
import X.C1058540deW;
import X.C1323750kYH;
import X.C1478410oZj;
import X.C1479570obb;
import X.C1482560ogQ;
import X.C1482570ogR;
import X.C1482580ogS;
import X.C1484680ojq;
import X.C1757310vpZ;
import X.C1766160w3q;
import X.C1766170w3r;
import X.C1AF0;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C356901a3;
import X.C582130MsN;
import X.InterfaceC1482530ogN;
import X.InterfaceC1483850oiV;
import X.InterfaceC1484830ok5;
import X.InterfaceC1488100opM;
import android.view.Surface;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.livereplay.ECVideoPlaybackController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ECVideoPlaybackController implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final FrameLayout LL;
    public final C0NCS LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public Long LLILZ;
    public InterfaceC1484830ok5 LLIZLLLIL;
    public Object LLJ;
    public VideoPlayConfig LLJI;
    public String LLILZIL = "";
    public String LLILZLL = "";
    public int LLIZ = 1;
    public final List<InterfaceC1482530ogN> LLJIJIL = new ArrayList();
    public final C1757310vpZ LLJILJIL = new C1757310vpZ(this);
    public final C1766160w3q LLJILJILJ = new InterfaceC1482530ogN() { // from class: X.0w3q
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
        public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
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
        public final /* synthetic */ void onPlayCompleted(String str, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPause(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepare(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepared(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
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

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
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
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            long jLongValue;
            C1766170w3r c1766170w3r = new C1766170w3r();
            Pair[] pairArr = new Pair[10];
            pairArr[0] = new Pair("stage", "play_success");
            pairArr[1] = new Pair("last_stage", this.LL.LLILZIL);
            pairArr[2] = new Pair("media_type", "video");
            pairArr[3] = new Pair("trigger_type", this.LL.LLILZLL);
            pairArr[4] = new Pair("network_type", C1323750kYH.LIZ());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.LL.LLILZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            pairArr[5] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - jLongValue));
            pairArr[6] = new Pair("content_id", ECVideoPlaybackController.LIZIZ(this.LL.LLJ));
            pairArr[7] = new Pair("vod_tag", this.LL.LLILLJJLI.LIZ);
            pairArr[8] = new Pair("vod_scenes", this.LL.LLILLJJLI.LIZIZ);
            pairArr[9] = new Pair("play_times", Integer.valueOf(this.LL.LLIZ));
            Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Pair pairLIZJ = ECVideoPlaybackController.LIZJ(this.LL.LLJ);
            if (pairLIZJ != null) {
                Integer num = (Integer) pairLIZJ.getFirst();
                if (num != null) {
                    mapLJIIJ.put("video_width", Integer.valueOf(num.intValue()));
                }
                Integer num2 = (Integer) pairLIZJ.getSecond();
                if (num2 != null) {
                    mapLJIIJ.put("video_height", Integer.valueOf(num2.intValue()));
                }
            }
            c1766170w3r.LIZ = mapLJIIJ;
            C1766170w3r.LIZ(c1766170w3r);
            this.LL.LLILZIL = "play_success";
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            long jLongValue;
            int i;
            String string;
            C1766170w3r c1766170w3r = new C1766170w3r();
            Pair[] pairArr = new Pair[12];
            pairArr[0] = new Pair("stage", "play_failure");
            pairArr[1] = new Pair("last_stage", this.LL.LLILZIL);
            pairArr[2] = new Pair("media_type", "video");
            pairArr[3] = new Pair("trigger_type", this.LL.LLILZLL);
            pairArr[4] = new Pair("network_type", C1323750kYH.LIZ());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.LL.LLILZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            pairArr[5] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - jLongValue));
            pairArr[6] = new Pair("content_id", ECVideoPlaybackController.LIZIZ(this.LL.LLJ));
            if (c1481290oeN != null) {
                i = c1481290oeN.LJ;
            } else {
                i = -1;
            }
            pairArr[7] = new Pair("error_code", Integer.valueOf(i));
            if (c1481290oeN == null || (string = c1481290oeN.toString()) == null) {
                string = "";
            }
            pairArr[8] = new Pair("error_msg", string);
            pairArr[9] = new Pair("vod_tag", this.LL.LLILLJJLI.LIZ);
            pairArr[10] = new Pair("vod_scenes", this.LL.LLILLJJLI.LIZIZ);
            pairArr[11] = new Pair("play_times", Integer.valueOf(this.LL.LLIZ));
            Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Pair pairLIZJ = ECVideoPlaybackController.LIZJ(this.LL.LLJ);
            if (pairLIZJ != null) {
                Integer num = (Integer) pairLIZJ.getFirst();
                if (num != null) {
                    mapLJIIJ.put("video_width", Integer.valueOf(num.intValue()));
                }
                Integer num2 = (Integer) pairLIZJ.getSecond();
                if (num2 != null) {
                    mapLJIIJ.put("video_height", Integer.valueOf(num2.intValue()));
                }
            }
            c1766170w3r.LIZ = mapLJIIJ;
            C1766170w3r.LIZ(c1766170w3r);
            this.LL.LLILZIL = "play_failure";
        }
    };

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final boolean LJ() {
        InterfaceC1483850oiV playState;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLIZLLLIL;
        return (interfaceC1484830ok5 == null || (playState = interfaceC1484830ok5.getPlayState()) == null || !playState.isPlaying()) ? false : true;
    }

    public final void LJFF() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLIZLLLIL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIZ(this.LLJILJILJ);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLIZLLLIL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.stop();
        }
        if (this.LLIZLLLIL != null) {
            C1766170w3r c1766170w3r = new C1766170w3r();
            Pair[] pairArr = new Pair[10];
            pairArr[0] = new Pair("stage", "stop_play");
            pairArr[1] = new Pair("last_stage", this.LLILZIL);
            pairArr[2] = new Pair("trigger_type", C0NCR.VIEW_INVISIBLE.getValue());
            pairArr[3] = new Pair("media_type", "video");
            pairArr[4] = new Pair("network_type", C1323750kYH.LIZ());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.LLILZ;
            pairArr[5] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - (l != null ? l.longValue() : 0L)));
            pairArr[6] = new Pair("content_id", LIZIZ(this.LLJ));
            pairArr[7] = new Pair("vod_tag", this.LLILLJJLI.LIZ);
            pairArr[8] = new Pair("vod_scenes", this.LLILLJJLI.LIZIZ);
            pairArr[9] = new Pair("play_times", Integer.valueOf(this.LLIZ));
            Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Pair pairLIZJ = LIZJ(this.LLJ);
            if (pairLIZJ != null) {
                Integer num = (Integer) pairLIZJ.getFirst();
                if (num != null) {
                    mapLJIIJ.put("video_width", Integer.valueOf(num.intValue()));
                }
                Integer num2 = (Integer) pairLIZJ.getSecond();
                if (num2 != null) {
                    mapLJIIJ.put("video_height", Integer.valueOf(num2.intValue()));
                }
            }
            c1766170w3r.LIZ = mapLJIIJ;
            C1766170w3r.LIZ(c1766170w3r);
            this.LLILZIL = "stop_play";
        }
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLIZLLLIL;
        if (interfaceC1484830ok53 != null) {
            interfaceC1484830ok53.release();
        }
        this.LLIZLLLIL = null;
    }

    public static String LIZIZ(Object obj) {
        String str;
        if (!(obj instanceof PlaybackVideoPreviewStreamData) || (str = ((PlaybackVideoPreviewStreamData) obj).vid) == null) {
            return "";
        }
        return str;
    }

    public static Pair LIZJ(Object obj) {
        if (obj instanceof PlaybackVideoPreviewStreamData) {
            PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = (PlaybackVideoPreviewStreamData) obj;
            return new Pair(playbackVideoPreviewStreamData.width, playbackVideoPreviewStreamData.height);
        }
        return null;
    }

    public final void LIZLLL(boolean z) {
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL;
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL2;
        if (z) {
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLIZLLLIL;
            if (interfaceC1484830ok5 != null && (interfaceC1488100opMLJIILIIL2 = interfaceC1484830ok5.LJIILIIL()) != null) {
                interfaceC1488100opMLJIILIIL2.mute();
                return;
            }
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLIZLLLIL;
        if (interfaceC1484830ok52 == null || (interfaceC1488100opMLJIILIIL = interfaceC1484830ok52.LJIILIIL()) == null) {
            return;
        }
        interfaceC1488100opMLJIILIIL.unmute();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        ((ArrayList) this.LLJIJIL).clear();
        this.LLJ = null;
        this.LLJI = null;
        LJFF();
        this.LLILLL.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        C356901a3.LIZJ(this, lifecycleOwner);
        if (this.LLILLJJLI.LIZJ && (interfaceC1484830ok5 = this.LLIZLLLIL) != null) {
            interfaceC1484830ok5.pause();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        InterfaceC1484830ok5 interfaceC1484830ok5;
        C356901a3.LIZLLL(this, lifecycleOwner);
        if (this.LLILLJJLI.LIZJ && (interfaceC1484830ok5 = this.LLIZLLLIL) != null) {
            interfaceC1484830ok5.resume();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        Object obj;
        if (this.LLILLJJLI.LIZJ && (obj = this.LLJ) != null) {
            LJI(obj, this.LLJI, false, C0NCQ.VIEW_VISIBLE);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        if (this.LLILLJJLI.LIZJ) {
            LJFF();
        }
    }

    public final C1482560ogQ LIZ(PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData, VideoPlayConfig videoPlayConfig) throws Exception {
        if (playbackVideoPreviewStreamData.mainUrl != null) {
            C1482580ogS c1482580ogS = new C1482580ogS();
            c1482580ogS.LIZ = playbackVideoPreviewStreamData.vid;
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZLLL = Collections.singletonList(playbackVideoPreviewStreamData.mainUrl);
            c1058540deW.LIZIZ = playbackVideoPreviewStreamData.fileHash;
            C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
            C1479570obb c1479570obb = new C1479570obb();
            C0NCS c0ncs = this.LLILLJJLI;
            c1479570obb.LJIILL = c0ncs.LIZ;
            c1479570obb.LJIIZILJ = C2097908Jt.LIZJ(new Pair("gec", c0ncs.LIZIZ));
            c1479570obb.LJJIIZ = playbackVideoPreviewStreamData.format;
            if (videoPlayConfig != null) {
                Boolean bool = videoPlayConfig.mute;
                if (bool != null) {
                    c1479570obb.LJJ = bool.booleanValue();
                }
                Boolean bool2 = videoPlayConfig.loop;
                if (bool2 != null) {
                    c1479570obb.LIZIZ = bool2.booleanValue();
                }
                if (videoPlayConfig.startLoopTime != null && videoPlayConfig.endLoopTime != null) {
                    c1479570obb.LJIIJ = (int) videoPlayConfig.startLoopTime.longValue();
                    c1479570obb.LJIIJJI = (int) videoPlayConfig.endLoopTime.longValue();
                }
            }
            c1482580ogSLIZ.LJ = new C1482570ogR(c1479570obb);
            return new C1484680ojq(c1482580ogSLIZ).LIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mainUrl is empty ");
        sbLIZ.append(playbackVideoPreviewStreamData);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0w3q] */
    public ECVideoPlaybackController(FrameLayout frameLayout, C0NCS c0ncs, LifecycleOwner lifecycleOwner) {
        this.LL = frameLayout;
        this.LLILLJJLI = c0ncs;
        this.LLILLL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final boolean LJI(Object obj, VideoPlayConfig videoPlayConfig, boolean z, C0NCQ c0ncq) {
        C1482560ogQ c1482560ogQLIZ;
        if (z && Intrinsics.LJFF(this.LLJ, obj) && Intrinsics.LJFF(this.LLJI, videoPlayConfig)) {
            return false;
        }
        if (this.LLIZLLLIL == null) {
            C1478410oZj c1478410oZj = new C1478410oZj();
            c1478410oZj.LIZIZ = true;
            InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
            this.LLIZLLLIL = interfaceC1484830ok5LIZJ;
            if (interfaceC1484830ok5LIZJ != null) {
                interfaceC1484830ok5LIZJ.LIZJ(this.LLJILJIL);
            }
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLIZLLLIL;
            if (interfaceC1484830ok5 != null) {
                interfaceC1484830ok5.LJIIZILJ(this.LLJILJILJ);
            }
            for (InterfaceC1482530ogN interfaceC1482530ogN : (ArrayList) this.LLJIJIL) {
                InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLIZLLLIL;
                if (interfaceC1484830ok52 != null) {
                    interfaceC1484830ok52.LJIIZILJ(interfaceC1482530ogN);
                }
            }
        }
        InterfaceC1484830ok5 interfaceC1484830ok53 = this.LLIZLLLIL;
        if (interfaceC1484830ok53 != null) {
            if (obj instanceof PlaybackVideoPreviewStreamData) {
                try {
                    c1482560ogQLIZ = LIZ((PlaybackVideoPreviewStreamData) obj, videoPlayConfig);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PdpLivePlaybackPlayer toIRequest exception: ");
                    sbLIZ.append(e);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    c1482560ogQLIZ = null;
                }
                interfaceC1484830ok53.LJ(c1482560ogQLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PdpLivePlaybackPlayer try play unknown data format ");
                sbLIZ2.append(obj);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            c1482560ogQLIZ = null;
            interfaceC1484830ok53.LJ(c1482560ogQLIZ);
        }
        if (z) {
            this.LLJ = obj;
            this.LLJI = videoPlayConfig;
        }
        if (Intrinsics.LJFF(this.LLILZIL, "stop_play")) {
            this.LLIZ++;
        }
        C1766170w3r c1766170w3r = new C1766170w3r();
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("stage", "start_play"), new Pair("last_stage", this.LLILZIL), new Pair("trigger_type", c0ncq.getValue()), new Pair("media_type", "video"), new Pair("network_type", C1323750kYH.LIZ()), new Pair("duration", 0), new Pair("content_id", LIZIZ(obj)), new Pair("vod_tag", this.LLILLJJLI.LIZ), new Pair("vod_scenes", this.LLILLJJLI.LIZIZ), new Pair("play_times", Integer.valueOf(this.LLIZ)));
        Pair pairLIZJ = LIZJ(obj);
        if (pairLIZJ != null) {
            Integer num = (Integer) pairLIZJ.getFirst();
            if (num != null) {
                mapLJIIJ.put("video_width", Integer.valueOf(num.intValue()));
            }
            Integer num2 = (Integer) pairLIZJ.getSecond();
            if (num2 != null) {
                mapLJIIJ.put("video_height", Integer.valueOf(num2.intValue()));
            }
        }
        c1766170w3r.LIZ = mapLJIIJ;
        C1766170w3r.LIZ(c1766170w3r);
        this.LLILZ = Long.valueOf(System.currentTimeMillis());
        this.LLILZIL = "start_play";
        this.LLILZLL = c0ncq.getValue();
        return true;
    }
}
