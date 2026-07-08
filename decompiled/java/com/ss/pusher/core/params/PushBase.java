package com.ss.pusher.core.params;

import X.C09CT;
import X.C1278100jMe;
import X.C13BV;
import X.C173600la;
import X.EnumC1278010jMV;
import X.EnumC1278020jMW;
import X.EnumC1278030jMX;
import X.EnumC1278040jMY;
import X.EnumC1278060jMa;
import X.EnumC1278080jMc;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.pusher.core.base.TEBundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class PushBase {
    public static final /* synthetic */ int LJJJLZIJ = 0;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJIIJJI;
    public final C13BV LJJJJI;
    public final n LJJJJIZL;
    public final boolean LJJJJJ;
    public final int LJJJJJL;
    public final int LJJJJL;
    public final int LJJJJLI;
    public final boolean LJJJJLL;
    public final boolean LJJJJZ;
    public final boolean LJJJJZI;
    public final boolean LJJJLIIL;
    public final RoiMap LJJJLL;

    @C09CT("aacBitrateMode")
    public int aacBitrateMode;

    @C09CT("aacEncType")
    public int aacEncType;

    @C09CT("aacPerfOptLevel")
    public int aacPerfOptLevel;

    @C09CT("anchorNetFallbackTimeout")
    public int anchorNetFallbackTimeout;

    @C09CT("asr_words_muting")
    public ASRWordMuting asrWordMuting;

    @C09CT("disableAnetFallback")
    public boolean disableAnetFallback;

    @C09CT("disableAnetFallbackCodeList")
    public List<Integer> disableAnetFallbackCodeList;

    @C09CT("enable_set_gear_table")
    public final boolean enableGearTable;

    @C09CT("enableHardEncBFrame")
    public int enableHardEncBFrame;

    @C09CT("enableLyraxNetworkQualityOptV3")
    public boolean enableLyraxNetworkQualityOptV3;

    @C09CT("enable_override_degrade_paths")
    public boolean enableOverrideDegradePaths;

    @C09CT("enable_preset_resolution_base")
    public boolean enablePresetResolutionBase;

    @C09CT("fallback_rtmp_by_rtc")
    public boolean fallback_rtmp_by_rtc;

    @C09CT("force_rtmp_by_rtc")
    public boolean force_rtmp_by_rtc;

    @C09CT("join_room_once")
    public final boolean isNoRoomJoinRoomOnce;

    @C09CT("live_gl_version")
    public int liveGlVersion;

    @C09CT("NetDegradePaths")
    public n netDegradePaths;

    @C09CT("PerfDegradePaths")
    public n perfDegradePaths;

    @C09CT("rtc_test_env")
    public RTCTestEnv rtcTestEnv;

    @C09CT("rtp_token_map")
    public n rtpTokenMap;

    @C09CT("support_low_latency")
    public boolean supportLowLatency;

    @C09CT("videoEncodePerfPrior")
    public boolean videoEncodePerfPrior;

    @C09CT("videoEncoderStrategy")
    public VideoEncoderStrategy videoEncoderStrategy;

    @C09CT("width")
    public int width = 720;

    @C09CT("height")
    public int height = 1280;
    public int LIZ = 16;
    public final int LIZIZ = 100;
    public final int LIZJ = 3;
    public final boolean LIZLLL = true;

    @C09CT("defaultBitrate")
    public int defaultBitrate = 1400000;

    @C09CT("minBitrate")
    public int minBitrate = 800000;

    @C09CT("maxBitrate")
    public int maxBitrate = 2500000;

    @C09CT("fps")
    public int fps = 15;

    @C09CT("simChannelNumber")
    public final int simChannelNumber = 1;

    @C09CT("enableBFrame")
    public boolean enableBFrame = true;

    @C09CT("gopSec")
    public final float gopSec = 2.0f;
    public final int LJII = 1;
    public final int LJIIIIZZ = 500;
    public final int LJIIIZ = LivePreCreateNextRoomPlayer.ENABLE;
    public final boolean LJIIJ = true;
    public final boolean LJIIL = true;
    public final int LJIILIIL = 3;
    public final EncStrategyConfig LJIILJJIL = new EncStrategyConfig();
    public final SitiConfig LJIILL = new SitiConfig();
    public final int LJIILLIIL = 2;
    public final double LJIIZILJ = 0.2d;
    public final double LJIJ = 1.0d;
    public final double LJIJI = 1.0d;
    public final int LJIJJ = 3;
    public final boolean LJIJJLI = true;
    public final boolean LJIL = true;
    public final boolean LJJ = true;

    @C09CT("vCodec")
    public final String vCodec = "";
    public EnumC1278030jMX LJJI = EnumC1278030jMX.VeLiveVideoCodecH264;

    @C09CT("useHardware")
    public boolean useHardwareEncode = true;
    public final int LJJIFFI = 1;
    public final boolean LJJII = true;
    public final boolean LJJIII = true;
    public final String LJJIIJ = "";
    public int LJJIIJZLJL = 1;

    @C09CT("videoProfile")
    public final String videoProfileStr = "";
    public EnumC1278020jMW LJJIIZ = EnumC1278020jMW.H264High;

    @C09CT("aCodec")
    public final String aCodec = "fdk-aac";
    public EnumC1278040jMY LJJIIZI = EnumC1278040jMY.VeLiveAudioCodecFdkAAC;

    @C09CT("audioProfile")
    public final String audioProfileStr = "";
    public EnumC1278010jMV LJJIJ = EnumC1278010jMV.HEv1;

    @C09CT("audioSample")
    public final int audioSamplePrivate = 44100;
    public EnumC1278080jMc LJJIJIIJI = EnumC1278080jMc.VeLiveAudioSampleRate44100;

    @C09CT("anchorNetAudioEncSr")
    public final int anchorNetAudioEncSr = 44100;
    public final int LJJIJIIJIL = 3;
    public final boolean LJJIJIL = true;
    public final int LJJIJL = 2;
    public EnumC1278060jMa LJJIJLIJ = EnumC1278060jMa.Stereo;

    @C09CT("audioBitrate")
    public int audioBitrate = 64000;
    public final n LJJIL = new n();
    public final int LJJIZ = 5000;
    public final boolean LJJJ = true;
    public final boolean LJJJI = true;
    public final boolean LJJJIL = true;
    public final int LJJJJ = 5;

    public static final class Roi {

        @C09CT("roi_asset_dir")
        public String roiAssetDir;

        @C09CT("roi_on")
        public int roiOn;

        @C09CT("roi_qp")
        public int roiQp = -100;

        @C09CT("roi_bitrate_ratio")
        public double roiBitrateRatio = Double.MAX_VALUE;
    }

    public static final class VideoEncoderStrategy {

        @C09CT("bytevc0")
        public n bytevc0Strategy;

        @C09CT("bytevc1")
        public n bytevc1Strategy;

        @C09CT("hardBytevc1")
        public n hardBytevc1Strategy;

        @C09CT("hardH264")
        public n hardH264Strategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.pusher.core.params.PushBase.LIZ():void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final n LIZIZ() {
        VideoEncoderStrategy videoEncoderStrategy = this.videoEncoderStrategy;
        EnumC1278030jMX enumC1278030jMX = this.LJJI;
        boolean z = this.useHardwareEncode;
        videoEncoderStrategy.getClass();
        String strLIZ = C1278100jMe.LIZ(enumC1278030jMX, z);
        switch (strLIZ.hashCode()) {
            case 115462291:
                if (strLIZ.equals("hardH264")) {
                    return videoEncoderStrategy.hardH264Strategy;
                }
                return null;
            case 355428635:
                if (strLIZ.equals("bytevc0")) {
                    return videoEncoderStrategy.bytevc0Strategy;
                }
                return null;
            case 355428636:
                if (strLIZ.equals("bytevc1")) {
                    return videoEncoderStrategy.bytevc1Strategy;
                }
                return null;
            case 529756593:
                if (strLIZ.equals("hardBytevc1")) {
                    return videoEncoderStrategy.hardBytevc1Strategy;
                }
                return null;
            default:
                return null;
        }
    }

    public final int LIZJ() {
        EnumC1278030jMX enumC1278030jMX = this.LJJI;
        boolean z = this.useHardwareEncode;
        synchronized (this.LJJJLL) {
            try {
                Roi roiLIZ = this.LJJJLL.LIZ(enumC1278030jMX, z);
                if (roiLIZ == null) {
                    return 0;
                }
                return roiLIZ.roiOn;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final TEBundle LIZLLL() {
        EnumC1278030jMX enumC1278030jMX = this.LJJI;
        boolean z = this.useHardwareEncode;
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("roi_on", 0);
        synchronized (this.LJJJLL) {
            try {
                Roi roiLIZ = this.LJJJLL.LIZ(enumC1278030jMX, z);
                if (roiLIZ != null) {
                    tEBundle.setInt("roi_on", roiLIZ.roiOn);
                    tEBundle.setInt("roi_qp", roiLIZ.roiQp);
                    String str = roiLIZ.roiAssetDir;
                    if (str != null) {
                        tEBundle.setString("roi_asset_dir", str);
                    }
                    if (C173600la.LIZ(Double.valueOf(roiLIZ.roiBitrateRatio))) {
                        tEBundle.setDouble("roi_bitrate_ratio", roiLIZ.roiBitrateRatio);
                    }
                    tEBundle.setBool("roi_stretch", this.LJJJLL.roiStretch);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tEBundle;
    }

    public PushBase() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LJJJJI = c13bv;
        this.LJJJJIZL = new n();
        this.liveGlVersion = 2;
        this.LJJJJJ = true;
        this.LJJJJJL = 10;
        this.LJJJJL = 5;
        this.LJJJJLI = 3;
        this.LJJJJLL = true;
        this.LJJJJZ = true;
        this.disableAnetFallbackCodeList = c13bv;
        this.anchorNetFallbackTimeout = 30;
        this.LJJJJZI = true;
        this.LJJJLIIL = true;
        this.videoEncoderStrategy = new VideoEncoderStrategy();
        this.LJJJLL = new RoiMap();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJ(n nVar) {
        VideoEncoderStrategy videoEncoderStrategy = this.videoEncoderStrategy;
        EnumC1278030jMX enumC1278030jMX = this.LJJI;
        boolean z = this.useHardwareEncode;
        videoEncoderStrategy.getClass();
        String strLIZ = C1278100jMe.LIZ(enumC1278030jMX, z);
        switch (strLIZ.hashCode()) {
            case 115462291:
                if (strLIZ.equals("hardH264")) {
                    videoEncoderStrategy.hardH264Strategy = nVar;
                }
                break;
            case 355428635:
                if (strLIZ.equals("bytevc0")) {
                    videoEncoderStrategy.bytevc0Strategy = nVar;
                }
                break;
            case 355428636:
                if (strLIZ.equals("bytevc1")) {
                    videoEncoderStrategy.bytevc1Strategy = nVar;
                }
                break;
            case 529756593:
                if (strLIZ.equals("hardBytevc1")) {
                    videoEncoderStrategy.hardBytevc1Strategy = nVar;
                }
                break;
        }
    }

    public static final class RoiMap {

        @C09CT("bytevc0")
        public Roi bytevc0Roi;

        @C09CT("bytevc1")
        public Roi bytevc1Roi;

        @C09CT("hardBytevc1")
        public Roi hardBytevc1Roi;

        @C09CT("hardH264")
        public Roi hardH264Roi;

        @C09CT("roi_stretch")
        public boolean roiStretch;

        public final Roi LIZ(EnumC1278030jMX enumC1278030jMX, boolean z) {
            String strLIZ = C1278100jMe.LIZ(enumC1278030jMX, z);
            if (Intrinsics.LJFF(strLIZ, "hardH264")) {
                return this.hardH264Roi;
            }
            if (Intrinsics.LJFF(strLIZ, "bytevc0")) {
                return this.bytevc0Roi;
            }
            if (Intrinsics.LJFF(strLIZ, "hardBytevc1")) {
                return this.hardBytevc1Roi;
            }
            if (Intrinsics.LJFF(strLIZ, "bytevc1")) {
                return this.bytevc1Roi;
            }
            return null;
        }

        public final void LIZIZ(EnumC1278030jMX enumC1278030jMX, boolean z, Roi roi) {
            String strLIZ = C1278100jMe.LIZ(enumC1278030jMX, z);
            if (Intrinsics.LJFF(strLIZ, "hardH264")) {
                this.hardH264Roi = roi;
            }
            if (Intrinsics.LJFF(strLIZ, "bytevc0")) {
                this.bytevc0Roi = roi;
            }
            if (Intrinsics.LJFF(strLIZ, "hardBytevc1")) {
                this.hardBytevc1Roi = roi;
            }
            if (Intrinsics.LJFF(strLIZ, "bytevc1")) {
                this.bytevc1Roi = roi;
            }
        }
    }
}
