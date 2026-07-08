package com.ss.ttlivestreamer.livestreamv2.videoquality.controler;

import X.C1101240elO;
import X.C1267200j54;
import X.C1282670jU1;
import X.C1282710jU5;
import X.C1283050jUd;
import X.C13BV;
import X.C15438062q;
import X.C1D41;
import X.C1D45;
import X.C1D46;
import X.C1D47;
import X.C1D4C;
import X.C1D51;
import X.C2249981D4q;
import X.C776580UdE;
import X.C783730Uol;
import X.C786410Ut5;
import X.EnumC1283150jUn;
import X.EnumC2178851APb;
import X.EnumC2239251Ckd;
import X.EnumC2249761D3u;
import X.EnumC2249781D3w;
import X.EnumC2249951D4n;
import X.EnumC783720Uok;
import X.InterfaceC783690Uoh;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.solution.gear_center.LyraxGearCenterConfig;
import com.ss.solution.gear_center.LyraxGearCenterImpl;
import com.ss.solution.gear_center.LyraxGearLiveType;
import com.ss.solution.gear_center.LyraxGearMetaData;
import com.ss.solution.gear_center.LyraxGearModel;
import com.ss.solution.gear_center.LyraxGearScheduleData;
import com.ss.solution.gear_center.LyraxGearStrategyResult;
import com.ss.solution.gear_center.LyraxGearStrategyScene;
import com.ss.solution.gear_center.LyraxProbeNetworkGrade;
import com.ss.solution.gear_center.LyraxProbeNetworkType;
import com.ss.solution.gear_center.LyraxProbeOriginType;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2;
import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS152S0201000_35;
import kotlin.jvm.internal.AwS172S0101000_35;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class VideoQualityStrategyManagerV2 implements C1D4C {
    public static final Companion LJIILL = new Companion();
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile LyraxGearLiveType LIZLLL;
    public volatile LyraxGearCenterImpl LJ;
    public volatile LyraxGearScheduleData LJFF;
    public volatile C1D41 LJI;
    public volatile LyraxProbeNetworkType LJII;
    public volatile C783730Uol LJIIIIZZ;
    public volatile C1D45 LJIIIZ;
    public volatile boolean LJIIJ;
    public volatile LyraxGearStrategyResult LJIIJJI;
    public volatile BPEAThread LJIIL;
    public volatile ExecutorService LJIILIIL;
    public volatile long LIZ = 200;
    public final VideoQualityStrategyManagerV2$gearCenterListener$1 LJIILJJIL = new VideoQualityStrategyManagerV2$gearCenterListener$1(this);

    public static final class Companion {
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] LIZ;
        public static final /* synthetic */ int[] LIZIZ;
        public static final /* synthetic */ int[] LIZJ;
        public static final /* synthetic */ int[] LIZLLL;
        public static final /* synthetic */ int[] LJ;
        public static final /* synthetic */ int[] LJFF;

        static {
            int[] iArr = new int[EnumC1283150jUn.values().length];
            try {
                try {
                } catch (NoSuchFieldError e) {
                    e = e;
                }
                try {
                    iArr[EnumC1283150jUn.STAGE.ordinal()] = 1;
                } catch (NoSuchFieldError e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e3) {
                e = e3;
            }
            LIZ = iArr;
            int[] iArr2 = new int[EnumC783720Uok.values().length];
            try {
                try {
                } catch (NoSuchFieldError e4) {
                    e = e4;
                }
            } catch (NoSuchFieldError e5) {
                e = e5;
            }
            try {
                iArr2[EnumC783720Uok.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
                e = e6;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                    try {
                        iArr2[EnumC783720Uok.MANUAL.ordinal()] = 2;
                    } catch (NoSuchFieldError e7) {
                        e = e7;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e8) {
                    e = e8;
                }
            } catch (NoSuchFieldError e9) {
                e = e9;
            }
            LIZIZ = iArr2;
            int[] iArr3 = new int[LyraxProbeOriginType.values().length];
            try {
                try {
                    try {
                        iArr3[LyraxProbeOriginType.Auto.ordinal()] = 1;
                    } catch (NoSuchFieldError e10) {
                        e = e10;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e11) {
                    e = e11;
                }
            } catch (NoSuchFieldError e12) {
                e = e12;
            }
            try {
                try {
                } catch (NoSuchFieldError e13) {
                    e = e13;
                }
                try {
                    iArr3[LyraxProbeOriginType.Manual.ordinal()] = 2;
                } catch (NoSuchFieldError e14) {
                    e = e14;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e15) {
                e = e15;
            }
            LIZJ = iArr3;
            int[] iArr4 = new int[EnumC2249781D3w.values().length];
            try {
                try {
                } catch (NoSuchFieldError e16) {
                    e = e16;
                }
            } catch (NoSuchFieldError e17) {
                e = e17;
            }
            try {
                iArr4[EnumC2249781D3w.USER_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError e18) {
                e = e18;
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                try {
                } catch (NoSuchFieldError e19) {
                    e = e19;
                }
            } catch (NoSuchFieldError e20) {
                e = e20;
            }
            try {
                iArr4[EnumC2249781D3w.MANUAL_PROBE_APPLY.ordinal()] = 2;
            } catch (NoSuchFieldError e21) {
                e = e21;
                TryCatchGuardChecker.doCheck(e);
            }
            LIZLLL = iArr4;
            int[] iArr5 = new int[LyraxProbeNetworkGrade.values().length];
            try {
                try {
                    try {
                        iArr5[LyraxProbeNetworkGrade.Poor.ordinal()] = 1;
                    } catch (NoSuchFieldError e22) {
                        e = e22;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e23) {
                    e = e23;
                }
            } catch (NoSuchFieldError e24) {
                e = e24;
            }
            try {
                try {
                    try {
                        iArr5[LyraxProbeNetworkGrade.Normal.ordinal()] = 2;
                    } catch (NoSuchFieldError e25) {
                        e = e25;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (NoSuchFieldError e26) {
                    e = e26;
                }
            } catch (NoSuchFieldError e27) {
                e = e27;
            }
            try {
                try {
                } catch (NoSuchFieldError e28) {
                    e = e28;
                }
                try {
                    iArr5[LyraxProbeNetworkGrade.Good.ordinal()] = 3;
                } catch (NoSuchFieldError e29) {
                    e = e29;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (NoSuchFieldError e30) {
                e = e30;
            }
            LJ = iArr5;
            int[] iArr6 = new int[LyraxGearStrategyScene.values().length];
            try {
                try {
                } catch (NoSuchFieldError e31) {
                    e = e31;
                }
            } catch (NoSuchFieldError e32) {
                e = e32;
            }
            try {
                iArr6[LyraxGearStrategyScene.Final.ordinal()] = 1;
            } catch (NoSuchFieldError e33) {
                e = e33;
                TryCatchGuardChecker.doCheck(e);
            }
            LJFF = iArr6;
        }
    }

    @Override // X.C1D4C
    public final InterfaceC783690Uoh LIZ() {
        return null;
    }

    @Override // X.C1D4C
    public final void LIZIZ(C1282710jU5 c1282710jU5) {
    }

    @Override // X.C1D4C
    public final void LIZJ(EnumC2239251Ckd enumC2239251Ckd) {
    }

    @Override // X.C1D4C
    public final void LJI(C1D51 c1d51) {
    }

    @Override // X.C1D4C
    public final void LJIILJJIL(C1282670jU1 c1282670jU1) {
    }

    @Override // X.C1D4C
    public final void LJIILLIIL(C2249981D4q c2249981D4q) {
    }

    @Override // X.C1D4C
    public final JSONObject LJIIJJI() throws JSONException {
        if (!this.LIZJ) {
            try {
                return (JSONObject) LJJI(new AwS579S0100000_35(this, 181));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return new JSONObject();
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_type", this.LIZLLL == LyraxGearLiveType.Game ? "screen_share" : "video_live");
        jSONObject.put("definition_type", "default");
        jSONObject.put("definition_type_source", "default");
        jSONObject.put("ttlh_video_quality_strategy_version", 201);
        return jSONObject;
    }

    @Override // X.C1D4C
    public final List<C1283050jUd> LJIIZILJ() {
        try {
            return (List) LJJI(new AwS579S0100000_35(this, 180));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1D47 LJIJJLI() {
        /*
            r7 = this;
            com.ss.solution.gear_center.LyraxGearLiveType r1 = r7.LIZLLL
            com.ss.solution.gear_center.LyraxGearLiveType r0 = com.ss.solution.gear_center.LyraxGearLiveType.Game
            if (r1 != r0) goto L74
            X.0jUn r4 = X.EnumC1283150jUn.GAME
        L8:
            int[] r1 = com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2.WhenMappings.LIZ
            int r0 = r4.ordinal()
            r0 = r1[r0]
            r6 = 1
            r5 = -1
            if (r0 != r6) goto L6b
            com.ss.solution.gear_center.LyraxGearScheduleData r0 = r7.LJFF
            if (r0 == 0) goto L69
            org.json.JSONObject r1 = r0.sdkParams
            if (r1 == 0) goto L69
            java.lang.String r0 = "PushBase"
            org.json.JSONObject r3 = r1.optJSONObject(r0)
        L22:
            r2 = 0
            if (r3 == 0) goto L67
            java.lang.String r0 = "width"
            int r1 = r3.optInt(r0, r2)
            java.lang.String r0 = "height"
            int r2 = r3.optInt(r0, r2)
        L32:
            int r1 = java.lang.Math.min(r1, r2)
            r0 = 896(0x380, float:1.256E-42)
            if (r1 <= r0) goto L5b
            r3 = 4
        L3b:
            X.1D47 r2 = new X.1D47
            r2.<init>(r3, r4)
            r2.LJIILL = r6
            r2.LJIIZILJ = r5
            X.1D46 r1 = r2.LJJ
            X.0jUn r0 = X.EnumC1283150jUn.STAGE
            if (r4 != r0) goto L5a
            if (r1 == 0) goto L5a
            X.1D4n r0 = X.EnumC2249951D4n.levelIntToStageLevel(r3)
            r1.LIZIZ = r0
            X.1D4n r0 = X.EnumC2249951D4n.levelIntToStageLevel(r3)
            r1.LIZJ = r0
            r2.LJJ = r1
        L5a:
            return r2
        L5b:
            r0 = 640(0x280, float:8.97E-43)
            if (r1 <= r0) goto L61
            r3 = 3
            goto L3b
        L61:
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 <= r0) goto L72
            r3 = 1
            goto L3b
        L67:
            r1 = 0
            goto L32
        L69:
            r3 = 0
            goto L22
        L6b:
            com.ss.solution.gear_center.LyraxGearScheduleData r0 = r7.LJFF
            if (r0 == 0) goto L72
            int r3 = r0.recommendLevel
            goto L3b
        L72:
            r3 = -1
            goto L3b
        L74:
            X.0jUn r4 = X.EnumC1283150jUn.STAGE
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2.LJIJJLI():X.1D47");
    }

    public final ExecutorService LJJ() {
        ExecutorService executorService = this.LJIILIIL;
        if (executorService != null) {
            return executorService;
        }
        synchronized (this) {
            try {
                ExecutorService executorService2 = this.LJIILIIL;
                if (executorService2 != null) {
                    return executorService2;
                }
                ExecutorService executorServiceI4 = C786410Ut5.i4(new ThreadFactory() { // from class: X.1Cmo
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        final VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2 = this.LL;
                        BPEAThread bPEAThread = new BPEAThread(runnable, "VideoQualityStrategyManagerV2");
                        videoQualityStrategyManagerV2.LJIIL = bPEAThread;
                        bPEAThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(videoQualityStrategyManagerV2) { // from class: X.1Cmp
                            @Override // java.lang.Thread.UncaughtExceptionHandler
                            public final void uncaughtException(Thread thread, Throwable th) {
                            }
                        });
                        return bPEAThread;
                    }
                });
                this.LJIILIIL = executorServiceI4;
                executorServiceI4.execute(new Runnable() { // from class: X.0btj
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("VideoQualityStrategyManagerV2@9f05.ensureWorkerExecutor$1L");
                        C1C7U.LIZIZ("VideoQualityStrategyManagerV2@9f05.ensureWorkerExecutor$1L");
                    }
                });
                return executorServiceI4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIFFI() throws JSONException {
        JSONObject monitorMetrics;
        LyraxGearStrategyResult lyraxGearStrategyResult;
        LyraxGearModel lyraxGearModel;
        C1D45 c1d45;
        int i;
        int i2;
        JSONObject jSONObjectOptJSONObject;
        if (this.LJIIJ) {
            LyraxGearCenterImpl lyraxGearCenterImpl = this.LJ;
            if (lyraxGearCenterImpl == null || (monitorMetrics = lyraxGearCenterImpl.getMonitorMetrics()) == null || monitorMetrics.length() <= 0) {
                return;
            }
            C1D45 c1d452 = this.LJIIIZ;
            if (c1d452 != null) {
                if (!Intrinsics.LJFF(c1d452.LIZLLL, "active_exit")) {
                    monitorMetrics.put("room_id", c1d452.LJ);
                }
                monitorMetrics.put("tS_enter_golive_preview", c1d452.LJFF);
                monitorMetrics.put("tF_leave_golive_preview", System.currentTimeMillis());
                monitorMetrics.put("leave_golive_preview_status", c1d452.LIZLLL);
                if (this.LIZLLL != LyraxGearLiveType.Game && (lyraxGearStrategyResult = this.LJIIJJI) != null && (lyraxGearModel = lyraxGearStrategyResult.gearModel) != null && (c1d45 = this.LJIIIZ) != null) {
                    long j = lyraxGearModel.maxBitrate;
                    boolean z = c1d45.LJIIIIZZ;
                    float f = c1d45.LJIIIZ;
                    LyraxGearMetaData lyraxGearMetaData = lyraxGearStrategyResult.metaData;
                    JSONArray jSONArray = lyraxGearMetaData != null ? lyraxGearMetaData.resolutionBase : null;
                    if (z && f > 0.0f && lyraxGearModel.width > 0 && (i = lyraxGearModel.height) > 0 && (i2 = lyraxGearModel.fps) > 0) {
                        int i3 = ((i + 15) / 16) * 16;
                        int i4 = (int) (i3 * f);
                        if (jSONArray != null) {
                            int length = jSONArray.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                if (jSONArray != null && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i5)) != null) {
                                    int iOptInt = jSONObjectOptJSONObject.optInt("width", -1);
                                    int iOptInt2 = jSONObjectOptJSONObject.optInt("height", -1);
                                    int iOptInt3 = jSONObjectOptJSONObject.optInt("fps", -1);
                                    if (iOptInt == i4 && iOptInt2 == i3 && iOptInt3 == i2) {
                                        long jOptLong = jSONObjectOptJSONObject.optLong("maxBitrate", -1L);
                                        if (jOptLong > 0) {
                                            j = jOptLong;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Long lValueOf = Long.valueOf(j);
                    if (lValueOf != null) {
                        monitorMetrics.put("initial_max_video_bitrate", lValueOf.longValue());
                    }
                }
            }
            this.LJIILJJIL.onReportEvent("livesdk_golive_speedtest_monitor", monitorMetrics);
        }
    }

    @Override // X.C1D4C
    public final void LIZLLL(LyraxGearCenterConfig lyraxGearCenterConfig) {
        this.LIZLLL = lyraxGearCenterConfig.liveType;
        this.LIZ = lyraxGearCenterConfig.syncTimeoutMs;
        LJIJJ(new AwS436S0200000_35(this, lyraxGearCenterConfig, 45));
    }

    @Override // X.C1D4C
    public final C1D47 LJ(C776580UdE c776580UdE) {
        try {
            LyraxGearStrategyResult lyraxGearStrategyResult = (LyraxGearStrategyResult) LJJI(new AwS436S0200000_35(c776580UdE, this, 43));
            if (lyraxGearStrategyResult == null) {
                return null;
            }
            this.LIZJ = false;
            this.LJIIJJI = lyraxGearStrategyResult;
            return LJIL(lyraxGearStrategyResult);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ = true;
            C1D47 c1d47LJIJJLI = LJIJJLI();
            c1d47LJIJJLI.LJII = EnumC2249761D3u.SCENE_FINAL_RESULT;
            return c1d47LJIJJLI;
        }
    }

    @Override // X.C1D4C
    public final void LJFF(C1267200j54 c1267200j54) {
        Map<String, ? extends Object> map = c1267200j54.LIZIZ;
        if (map == null) {
            return;
        }
        LJIJJ(new AwS436S0200000_35(this, map, 46));
    }

    @Override // X.C1D4C
    public final void LJII(C1D45 c1d45) {
        try {
            LJJI(new AwS436S0200000_35(this, c1d45, 51));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LJIJJ(new AwS579S0100000_35(this, 182));
    }

    @Override // X.C1D4C
    public final void LJIIIIZZ(C783730Uol c783730Uol) {
        LJIJJ(new AwS436S0200000_35(this, c783730Uol, 50));
    }

    @Override // X.C1D4C
    public final void LJIIIZ(C1D41 c1d41) {
        LJIJJ(new AwS436S0200000_35(this, c1d41, 49));
    }

    @Override // X.C1D4C
    public final void LJIIJ(LyraxGearScheduleData lyraxGearScheduleData) {
        this.LJFF = lyraxGearScheduleData;
        LJIJJ(new AwS436S0200000_35(this, lyraxGearScheduleData, 48));
    }

    @Override // X.C1D4C
    public final void LJIIL(C1101240elO c1101240elO) {
        LJIJJ(new AwS436S0200000_35(this, c1101240elO, 47));
    }

    @Override // X.C1D4C
    public final void LJIILL(C1D45 c1d45) {
        try {
            LJJI(new AwS436S0200000_35(this, c1d45, 42));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LJIJJ(new AwS579S0100000_35(this, 179));
    }

    @Override // X.C1D4C
    public final void LJIJ(int i) {
        LJIJJ(new AwS172S0101000_35(this, i, 1));
    }

    @Override // X.C1D4C
    public final C1D47 LJIJI(C776580UdE c776580UdE) {
        try {
            return (C1D47) LJJI(new AwS436S0200000_35(c776580UdE, this, 44));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1D47 c1d47LJIJJLI = LJIJJLI();
            c1d47LJIJJLI.LJII = EnumC2249761D3u.SCENE_RECOMMEND;
            return c1d47LJIJJLI;
        }
    }

    public final void LJIJJ(final Function0<Unit> function0) {
        if (this.LIZIZ) {
            return;
        }
        BPEAThread bPEAThread = this.LJIIL;
        if (bPEAThread != null && Intrinsics.LJFF(C786410Ut5.u3(), bPEAThread)) {
            function0.invoke();
        } else {
            LJJ().execute(new Runnable() { // from class: X.1D43
                @Override // java.lang.Runnable
                public final void run() {
                    VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2 = this.LL;
                    Function0 function02 = function0;
                    C1C7U.LIZ("VideoQualityStrategyManagerV2@9f05.asyncOnWorker$1L");
                    if (!videoQualityStrategyManagerV2.LIZIZ) {
                        function02.invoke();
                    }
                    C1C7U.LIZIZ("VideoQualityStrategyManagerV2@9f05.asyncOnWorker$1L");
                }
            });
        }
    }

    public final C1D47 LJIL(LyraxGearStrategyResult lyraxGearStrategyResult) {
        EnumC1283150jUn enumC1283150jUn;
        EnumC2249761D3u enumC2249761D3u;
        if (this.LIZLLL == LyraxGearLiveType.Game) {
            enumC1283150jUn = EnumC1283150jUn.GAME;
        } else {
            enumC1283150jUn = EnumC1283150jUn.STAGE;
        }
        C1D47 c1d47 = new C1D47(lyraxGearStrategyResult.gearLevel, enumC1283150jUn);
        c1d47.LJIILL = true;
        c1d47.LJIILLIIL = lyraxGearStrategyResult.isProbeRunning();
        c1d47.LJIIZILJ = lyraxGearStrategyResult.probeBandwidth;
        C1D46 c1d46 = c1d47.LJJ;
        if (enumC1283150jUn == EnumC1283150jUn.STAGE && c1d46 != null) {
            c1d46.LIZIZ = EnumC2249951D4n.levelIntToStageLevel(lyraxGearStrategyResult.effectLevel);
            c1d46.LIZJ = EnumC2249951D4n.levelIntToStageLevel(lyraxGearStrategyResult.captureLevel);
            c1d47.LJJ = c1d46;
        }
        LyraxGearModel lyraxGearModel = lyraxGearStrategyResult.gearModel;
        if (lyraxGearModel != null) {
            c1d47.LIZ = lyraxGearModel.maxBitrate;
            c1d47.LIZIZ = lyraxGearModel.minBitrate;
            c1d47.LIZJ = lyraxGearModel.defaultBitrate;
            int i = lyraxGearModel.width;
            int i2 = lyraxGearModel.height;
            c1d47.LJIJ = i;
            c1d47.LJIJI = i2;
            c1d47.LJIJJ = lyraxGearModel.fps;
            c1d47.LJIJJLI = lyraxGearModel.desc;
            c1d47.LJIL = lyraxGearModel.name;
            c1d47.LIZLLL();
        }
        LyraxGearMetaData lyraxGearMetaData = lyraxGearStrategyResult.metaData;
        if (lyraxGearMetaData != null) {
            List<LyraxGearModel> list = lyraxGearMetaData.validGearList;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (LyraxGearModel lyraxGearModel2 : list) {
                    BitrateConfig bitrateConfig = new BitrateConfig();
                    bitrateConfig.defaultBitrate = lyraxGearModel2.defaultBitrate;
                    bitrateConfig.maxBitrate = lyraxGearModel2.maxBitrate;
                    bitrateConfig.minBitrate = lyraxGearModel2.minBitrate;
                    bitrateConfig.width = lyraxGearModel2.width;
                    bitrateConfig.height = lyraxGearModel2.height;
                    bitrateConfig.fps = lyraxGearModel2.fps;
                    bitrateConfig.name = lyraxGearModel2.name;
                    bitrateConfig.desc = lyraxGearModel2.desc;
                    bitrateConfig.level = String.valueOf(lyraxGearModel2.level);
                    String str = lyraxGearModel2.title;
                    bitrateConfig.LIZIZ = str;
                    if (enumC1283150jUn == EnumC1283150jUn.GAME) {
                        bitrateConfig.sdkKey = str;
                        bitrateConfig.LIZ = EnumC2178851APb.sdkKeyToGameLevel(str);
                    }
                    arrayList.add(bitrateConfig);
                }
                if (!arrayList.isEmpty()) {
                    c1d47.LJJIII = arrayList;
                }
            }
            c1d47.LJJIIJ = lyraxGearMetaData.probeMaxLevel;
            c1d47.LJJIIJZLJL = lyraxGearMetaData.probeMinLevel;
        }
        if (WhenMappings.LJFF[lyraxGearStrategyResult.strategyScene.ordinal()] == 1) {
            enumC2249761D3u = EnumC2249761D3u.SCENE_FINAL_RESULT;
        } else {
            enumC2249761D3u = EnumC2249761D3u.SCENE_RECOMMEND;
        }
        c1d47.LJII = enumC2249761D3u;
        return c1d47;
    }

    public final <T> T LJJI(final Function0<? extends T> function0) throws Throwable {
        boolean zLJFF;
        if (!this.LIZIZ) {
            BPEAThread bPEAThread = this.LJIIL;
            if (bPEAThread == null) {
                zLJFF = false;
            } else {
                zLJFF = Intrinsics.LJFF(C786410Ut5.u3(), bPEAThread);
            }
            if (zLJFF) {
                return function0.invoke();
            }
            Future<T> futureSubmit = LJJ().submit(new Callable() { // from class: X.1D42
                @Override // java.util.concurrent.Callable
                public final Object call() throws TimeoutException {
                    VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2 = this.LL;
                    Function0 function02 = function0;
                    C1C7U.LIZ("VideoQualityStrategyManagerV2@9f05.syncOnWorker$1L");
                    if (videoQualityStrategyManagerV2.LIZIZ) {
                        throw new TimeoutException("syncOnWorker ignored because already destroyed");
                    }
                    Object objInvoke = function02.invoke();
                    C1C7U.LIZIZ("VideoQualityStrategyManagerV2@9f05.syncOnWorker$1L");
                    return objInvoke;
                }
            });
            try {
                return futureSubmit.get(this.LIZ, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
                throw new RuntimeException(e);
            } catch (ExecutionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw new RuntimeException(cause);
            } catch (TimeoutException e3) {
                TryCatchGuardChecker.doCheck(e3);
                futureSubmit.cancel(true);
                throw e3;
            }
        }
        throw new TimeoutException("syncOnWorker ignored because already destroyed");
    }

    @Override // X.C1D4C
    public final void LJIILIIL(int i, EnumC2249781D3w enumC2249781D3w) {
        LJIJJ(new AwS152S0201000_35(this, i, enumC2249781D3w, 2));
    }
}
