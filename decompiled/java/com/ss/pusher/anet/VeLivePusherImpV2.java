package com.ss.pusher.anet;

import X.AbstractC1277570jLn;
import X.AbstractC1278120jMg;
import X.C098200Yq;
import X.C1215200hjC;
import X.C1268990j7x;
import X.C1269290j8R;
import X.C1270090j9j;
import X.C1277560jLm;
import X.C1277590jLp;
import X.C1277620jLs;
import X.C1277630jLt;
import X.C1277910jML;
import X.C1278000jMU;
import X.C1278180jMm;
import X.C1278210jMp;
import X.C1278430jNB;
import X.C1278510jNJ;
import X.C1278540jNM;
import X.C1278550jNN;
import X.C1278650jNX;
import X.C1278690jNb;
import X.C1278700jNc;
import X.C1279020jO8;
import X.C1279200jOQ;
import X.C1279350jOf;
import X.C13LQ;
import X.C15438062q;
import X.C189200o6;
import X.C1954807lC;
import X.C1C7U;
import X.C2118308Rp;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1152920g6k;
import X.EnumC1270040j9e;
import X.EnumC1277710jM1;
import X.EnumC1277870jMH;
import X.EnumC1277890jMJ;
import X.EnumC1277900jMK;
import X.EnumC1277920jMM;
import X.EnumC1277950jMP;
import X.EnumC1278980jO4;
import X.InterfaceC1277660jLw;
import X.InterfaceC1277930jMN;
import X.InterfaceC1278600jNS;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.opengl.EGLContext;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.PreProcessVideoNodeStats;
import com.ss.bytertc.engine.data.RtcScene;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.livepusher.ILivePusherEventHandler;
import com.ss.bytertc.engine.livepusher.IStatisticsEventHandler;
import com.ss.bytertc.engine.livepusher.LivePusher;
import com.ss.bytertc.engine.livepusher.LivePusherAudioConfig;
import com.ss.bytertc.engine.livepusher.LivePusherConfig;
import com.ss.bytertc.engine.livepusher.LivePusherErrorCode;
import com.ss.bytertc.engine.livepusher.LivePusherLocalAudioState;
import com.ss.bytertc.engine.livepusher.LivePusherLocalVideoState;
import com.ss.bytertc.engine.livepusher.LivePusherOption;
import com.ss.bytertc.engine.livepusher.LivePusherStatus;
import com.ss.bytertc.engine.livepusher.LivePusherVideoConfig;
import com.ss.bytertc.engine.livepusher.MixedStreamType;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.DirectBufferVideoFrame;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import com.ss.bytertc.engine.video.impl.VideoFramePool;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.pusher.anet.VeLivePusherImpV2;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.ProbeSpeedGear;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SeiEncryptUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS304S0000000_20;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class VeLivePusherImpV2 extends AbstractC1277570jLn implements ILivePusherEventHandler, IStatisticsEventHandler {
    public static final C1278690jNb Companion = new Object() { // from class: X.0jNb
    };
    public final C1215200hjC<SourceWantedData> distinctChecker;
    public final LiveSdkSetting liveSdkSetting;
    public JSONObject loadSoLog;
    public final boolean mEnableDebugSei;
    public int mInitHeight;
    public int mInitWidth;
    public final C1277910jML mLevelChangeNotifier;
    public EnumC1278980jO4 mNetworkQuality;
    public InterfaceC1277660jLw mObserver;
    public LivePusher mPusher;
    public C1278430jNB mResolutionLinkCache;
    public final LivePusherConfig mRtcConfig;
    public final C1279020jO8 mStatistics;
    public final C1277630jLt mTextureMatrixCache;
    public String mUrl;
    public JSONObject mUserMetadata;
    public C1278650jNX mVideoFramePoolWrapper;
    public final String tag;

    public static /* synthetic */ void lambda$semisugar$pPushExternalVideoFrameOld$lambda$12$lambda$11$0(C1277560jLm c1277560jLm) {
        C1C7U.LIZ("VeLivePusherImpV2@934d.pPushExternalVideoFrameOld$1L");
        c1277560jLm.LIZJ();
        C1C7U.LIZIZ("VeLivePusherImpV2@934d.pPushExternalVideoFrameOld$1L");
    }

    @Override // X.AbstractC1277570jLn
    public int doPushExternalAudioFrame(C1278180jMm c1278180jMm) {
        return 0;
    }

    @Override // X.AbstractC1277570jLn
    public int enableCalculateAudioLoudness(boolean z) {
        return -1;
    }

    @Override // X.AbstractC1277570jLn
    public boolean isAnchorNet() {
        return true;
    }

    @Override // X.AbstractC1277570jLn
    public void startAudioCapture() {
    }

    @Override // X.AbstractC1277570jLn
    public void startVideoCapture() {
    }

    private final void addInternalSei() {
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            livePusher.sendSEIMessage("{\"source\": \"TTLiveSDK_Android\"}", -1, true, false);
        }
    }

    private final void destroyGLManager() {
        AVLog.iow(this.tag, "GLThreadManager dispose. The singleton shall be destroyed if this is the last VeLivePusher instance.");
        GLThreadManager.LIZJ();
        AVLog.iow(this.tag, "GLThreadManager dispose done");
    }

    private final void setLivePusherConfig() {
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            livePusher.setLivePusherConfig(this.mRtcConfig);
        }
    }

    private final void updateBitrateWithRatio() {
        this.config.LJI.mPushBase.getClass();
    }

    @Override // X.AbstractC1277570jLn
    public void doStopPush() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "LivePusherAPI").put("api", "doStopPushV2").put("pusherIsNull", this.mPusher == null).put("pusher", this.mPusher).put("veLivePusher", this);
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut);
        }
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            livePusher.stopPush();
        }
    }

    @Override // X.AbstractC1277570jLn
    public RTCVideo getRTCVideo() {
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            return livePusher.getRTCVideo();
        }
        return null;
    }

    @Override // X.AbstractC1277570jLn
    public String getRtcRoomId() {
        RTCVideo rTCVideo;
        RTCRoom livePusherRoom;
        LivePusher livePusher = this.mPusher;
        if (livePusher == null || (rTCVideo = livePusher.getRTCVideo()) == null || (livePusherRoom = rTCVideo.getLivePusherRoom()) == null) {
            return null;
        }
        return livePusherRoom.getRoomId();
    }

    @Override // X.AbstractC1277570jLn
    public boolean isPushing() {
        return this.mPusher != null;
    }

    @Override // X.AbstractC1277570jLn
    public EnumC1277950jMP resetLiveVideoPerformanceConfig() {
        int i = this.mInitWidth;
        LivePusherVideoConfig livePusherVideoConfig = this.mRtcConfig.videoConfig;
        if (i == livePusherVideoConfig.width && this.mInitHeight == livePusherVideoConfig.height) {
            return EnumC1277950jMP.Success;
        }
        livePusherVideoConfig.width = i;
        int i2 = this.mInitHeight;
        livePusherVideoConfig.height = i2;
        ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.liveSdkSetting, i, i2, livePusherVideoConfig.fps);
        if (probeSpeedGearLIZ != null) {
            LivePusherVideoConfig livePusherVideoConfig2 = this.mRtcConfig.videoConfig;
            livePusherVideoConfig2.minBitrateKbps = probeSpeedGearLIZ.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            livePusherVideoConfig2.maxBitrateKbps = probeSpeedGearLIZ.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            livePusherVideoConfig2.startBitrateKbps = probeSpeedGearLIZ.defaultBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            updateBitrateWithRatio();
            updatePerformanceMaxVideoBitrate(probeSpeedGearLIZ.maxBitrate);
        }
        setLivePusherConfig();
        return EnumC1277950jMP.Success;
    }

    @Override // X.AbstractC1277570jLn
    public void stopAudioCapture() {
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            livePusher.stopAudioCapture();
        }
    }

    @Override // X.AbstractC1277570jLn
    public void stopVideoCapture() {
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            livePusher.stopVideoCapture();
        }
    }

    @Override // X.AbstractC1277570jLn
    public void release() throws JSONException {
        super.release();
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "LivePusherAPI").put("api", "releaseInternal").put("pusherIsNull", this.mPusher == null).put("pusher", this.mPusher).put("veLivePusher", this);
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut);
        }
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            if (this.liveSdkSetting.mPushBase.LJIIL) {
                livePusher.stopPush();
            }
            LivePusher.destroyLivePusher(livePusher);
        }
        this.mPusher = null;
        C1278650jNX c1278650jNX = this.mVideoFramePoolWrapper;
        VideoFramePool videoFramePool = c1278650jNX.LIZIZ;
        if (videoFramePool != null) {
            videoFramePool.release();
        }
        c1278650jNX.LIZIZ = null;
        destroyGLManager();
    }

    public final LivePusherConfig getMRtcConfig$RtcEngine_release() {
        return this.mRtcConfig;
    }

    @Override // X.AbstractC1277570jLn
    public EnumC1277890jMJ getSessionVersion() {
        return EnumC1277890jMJ.LiveStreamSession_V2;
    }

    public VeLivePusherImpV2(C1277590jLp c1277590jLp) {
        MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType mixedStreamVideoCodecType;
        MixedStreamConfig.MixedStreamAudioProfile mixedStreamAudioProfile;
        super(c1277590jLp);
        this.tag = "VeLivePusherImpV2";
        this.mUserMetadata = new JSONObject();
        c1277590jLp.LJI.switchParams.getClass();
        this.mTextureMatrixCache = new C1277630jLt();
        LiveSdkSetting liveSdkSetting = c1277590jLp.LJI;
        this.mVideoFramePoolWrapper = new C1278650jNX(liveSdkSetting.mPushBase.LJIILIIL);
        this.mUrl = "";
        this.mStatistics = new C1279020jO8();
        this.liveSdkSetting = liveSdkSetting;
        this.distinctChecker = new C1215200hjC<>(AFwS304S0000000_20.get$arr$(2));
        this.mRtcConfig = new LivePusherConfig();
        this.mNetworkQuality = EnumC1278980jO4.Unknown;
        this.mEnableDebugSei = c1277590jLp.LJI.mPushBase.LJJJJZI;
        this.mLevelChangeNotifier = new C1277910jML();
        this.statsObserver = c1277590jLp.LJ;
        initLogFile(c1277590jLp.LIZ);
        try {
            C189200o6.m2constructorimpl(this.mUserMetadata.put("Encoder", c1277590jLp.LJIIJ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        RTCVideo.setRtcNativeLibraryLoader(new RTCNativeLibraryLoader() { // from class: X.0jNT
            @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader
            public final boolean load(String str) {
                return VeLivePusherImpV2._init_$lambda$22(this.LIZ, str);
            }
        });
        PushBase pushBase = c1277590jLp.LJI.mPushBase;
        this.mRtcConfig.reconnectDuration = pushBase.anchorNetFallbackTimeout;
        LivePusherVideoConfig livePusherVideoConfig = new LivePusherVideoConfig();
        String str = c1277590jLp.LIZJ;
        if (str != null && str.length() != 0) {
            livePusherVideoConfig.width = pushBase.width;
            livePusherVideoConfig.height = pushBase.height;
            livePusherVideoConfig.fps = pushBase.fps;
            livePusherVideoConfig.startBitrateKbps = pushBase.defaultBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            livePusherVideoConfig.minBitrateKbps = pushBase.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            livePusherVideoConfig.maxBitrateKbps = pushBase.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            livePusherVideoConfig.enableBFrame = pushBase.enableBFrame;
        } else {
            livePusherVideoConfig.width = 720;
            livePusherVideoConfig.height = 1280;
            livePusherVideoConfig.fps = 15;
            livePusherVideoConfig.startBitrateKbps = 1400;
            livePusherVideoConfig.minBitrateKbps = 800;
            livePusherVideoConfig.maxBitrateKbps = 2500;
            livePusherVideoConfig.enableBFrame = false;
        }
        this.mInitWidth = livePusherVideoConfig.width;
        this.mInitHeight = livePusherVideoConfig.height;
        livePusherVideoConfig.simChannelNumber = pushBase.simChannelNumber;
        livePusherVideoConfig.gopSize = (int) pushBase.gopSec;
        boolean z = pushBase.useHardwareEncode;
        livePusherVideoConfig.isHardware = z;
        if (z) {
            livePusherVideoConfig.enableBFrame = pushBase.enableHardEncBFrame > 0;
        }
        int i = C1278000jMU.LIZIZ[pushBase.LJJI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mixedStreamVideoCodecType = MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1;
            } else {
                throw new C1954807lC();
            }
        } else {
            mixedStreamVideoCodecType = MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_H264;
        }
        livePusherVideoConfig.videoCodecType = mixedStreamVideoCodecType;
        this.mRtcConfig.videoConfig = livePusherVideoConfig;
        updateBitrateWithRatio();
        LivePusherAudioConfig livePusherAudioConfig = new LivePusherAudioConfig();
        livePusherAudioConfig.sampleRate = pushBase.anchorNetAudioEncSr;
        livePusherAudioConfig.channelNum = pushBase.LJJIJLIJ.getChannel();
        livePusherAudioConfig.bitrateKbps = pushBase.audioBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
        int i2 = C1278000jMU.LIZJ[pushBase.LJJIIZI.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new C1954807lC();
        }
        livePusherAudioConfig.audioCodecType = MixedStreamConfig.MixedStreamAudioConfig.MixedStreamAudioCodecType.MIXED_STREAM_AUDIO_CODEC_TYPE_AAC;
        int i3 = C1278000jMU.LIZLLL[pushBase.LJJIJ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
                } else {
                    throw new C1954807lC();
                }
            } else {
                mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV2;
            }
        } else {
            mixedStreamAudioProfile = MixedStreamConfig.MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_HEV1;
        }
        livePusherAudioConfig.aacCodecProfile = mixedStreamAudioProfile;
        livePusherAudioConfig.aacEncType = pushBase.aacEncType;
        livePusherAudioConfig.aacBitrateMode = pushBase.aacBitrateMode;
        LivePusherConfig livePusherConfig = this.mRtcConfig;
        livePusherConfig.audioConfig = livePusherAudioConfig;
        livePusherConfig.mixType = MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER;
        livePusherConfig.enableLiveAB = true;
        livePusherConfig.anchorIDCName = c1277590jLp.LJIIIZ;
    }

    private final void initLogFile(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDK7.22.0.93900/releasenative:");
        AbstractC1277570jLn.Companion.getClass();
        sbLIZ.append("7.22.0.93900");
        AVLog.ioi("VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Android OS:");
        sbLIZ2.append(Build.VERSION.SDK_INT);
        sbLIZ2.append('(');
        sbLIZ2.append(Build.VERSION.RELEASE);
        sbLIZ2.append(')');
        AVLog.ioi("VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("DevicesName: ");
        sbLIZ3.append(Build.MODEL);
        AVLog.ioi("VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ3));
        AVLog.disableLogFile(true);
    }

    private final int pPushExternalVideoFrameNew(final C1277560jLm c1277560jLm) {
        VideoPixelFormat videoPixelFormat;
        LyraxVideoFrame lyraxVideoFrameAcquireFrame;
        if (c1277560jLm.LIZ != EnumC1277900jMK.Texture) {
            return -3;
        }
        if (c1277560jLm.LIZIZ == EnumC1277710jM1.TextureOes) {
            videoPixelFormat = VideoPixelFormat.TEXTURE_OES;
        } else {
            videoPixelFormat = VideoPixelFormat.TEXTURE_2D;
        }
        C1278650jNX c1278650jNX = this.mVideoFramePoolWrapper;
        int iLIZIZ = c1277560jLm.LIZIZ();
        int iLIZ = c1277560jLm.LIZ();
        VideoFramePool videoFramePool = c1278650jNX.LIZIZ;
        if (videoFramePool == null || !videoFramePool.isFramePoolEligible(videoPixelFormat, iLIZIZ, iLIZ, 0, VideoRotation.VIDEO_ROTATION_0, ColorSpace.BT601_FULL_RANGE)) {
            VideoFramePool videoFramePool2 = c1278650jNX.LIZIZ;
            if (videoFramePool2 != null) {
                videoFramePool2.release();
            }
            c1278650jNX.LIZIZ = new VideoFramePool(1, c1278650jNX.LIZ, videoPixelFormat, iLIZIZ, iLIZ, 0, VideoRotation.VIDEO_ROTATION_0, ColorSpace.BT601_FULL_RANGE);
        }
        VideoFramePool videoFramePool3 = c1278650jNX.LIZIZ;
        if (videoFramePool3 != null && (lyraxVideoFrameAcquireFrame = videoFramePool3.acquireFrame()) != null) {
            AbstractC1277570jLn.Companion.getClass();
            lyraxVideoFrameAcquireFrame.setEGLContext(GLThreadManager.LJFF());
            lyraxVideoFrameAcquireFrame.setTextureID(c1277560jLm.LJIIIIZZ);
            lyraxVideoFrameAcquireFrame.setTextureMatrix(this.mTextureMatrixCache.LIZ(c1277560jLm));
            lyraxVideoFrameAcquireFrame.setTimeStampUs(c1277560jLm.LJFF);
            lyraxVideoFrameAcquireFrame.setGLSync(c1277560jLm.LJIIIZ);
            lyraxVideoFrameAcquireFrame.setOriginalCaptureTimestampMs(c1277560jLm.LJI);
            lyraxVideoFrameAcquireFrame.setOriginalEffectTimestampMs(c1277560jLm.LJII);
            boolean z = this.liveSdkSetting.switchParams.LIZIZ;
            if (z) {
                c1277560jLm.LIZLLL();
                lyraxVideoFrameAcquireFrame.setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jN6
                    @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
                    public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                        c1277560jLm.LIZJ();
                    }
                });
            } else {
                lyraxVideoFrameAcquireFrame.setFrameDestroyedListener(new VideoFrame.OnFrameDestroyedListener() { // from class: X.0jN7
                    @Override // com.ss.bytertc.engine.video.VideoFrame.OnFrameDestroyedListener
                    public final void OnFrameDestroyed(EGLContext eGLContext, int i, long j) {
                        VeLivePusherImpV2.pPushExternalVideoFrameNew$lambda$10(c1277560jLm, eGLContext, i, j);
                    }
                });
            }
            LivePusher livePusher = this.mPusher;
            if (livePusher != null) {
                livePusher.pushExternalVideoFrame(lyraxVideoFrameAcquireFrame);
            }
            if (z) {
                lyraxVideoFrameAcquireFrame.release();
            }
            return 0;
        }
        return -4;
    }

    private final int pPushExternalVideoFrameOld(C1277560jLm c1277560jLm) {
        DirectBufferVideoFrame directBufferVideoFrame;
        VideoPixelFormat videoPixelFormat;
        EnumC1277900jMK enumC1277900jMK = c1277560jLm.LIZ;
        boolean z = true;
        if (enumC1277900jMK == EnumC1277900jMK.Texture) {
            if (c1277560jLm.LIZIZ != EnumC1277710jM1.TextureOes) {
                z = false;
            }
            if (z) {
                videoPixelFormat = VideoPixelFormat.TEXTURE_OES;
            } else {
                videoPixelFormat = VideoPixelFormat.TEXTURE_2D;
            }
            directBufferVideoFrame = new DirectBufferVideoFrame(videoPixelFormat);
            AbstractC1277570jLn.Companion.getClass();
            directBufferVideoFrame.setEGLContext(GLThreadManager.LJFF());
            directBufferVideoFrame.setTextureID(c1277560jLm.LJIIIIZZ);
            directBufferVideoFrame.setTextureMatrix(this.mTextureMatrixCache.LIZ(c1277560jLm));
            directBufferVideoFrame.setRotation(VideoRotation.VIDEO_ROTATION_0);
        } else if (enumC1277900jMK != EnumC1277900jMK.ByteBuffer && enumC1277900jMK != EnumC1277900jMK.ByteArray) {
            directBufferVideoFrame = null;
        } else {
            directBufferVideoFrame = new DirectBufferVideoFrame(VideoPixelFormat.I420);
            AbstractC1278120jMg abstractC1278120jMg = (AbstractC1278120jMg) c1277560jLm;
            directBufferVideoFrame.setPlaneData(0, abstractC1278120jMg.LJI());
            directBufferVideoFrame.setPlaneStride(0, abstractC1278120jMg.LIZLLL);
            directBufferVideoFrame.setPlaneData(1, abstractC1278120jMg.LJ());
            directBufferVideoFrame.setPlaneStride(1, abstractC1278120jMg.LIZLLL / 2);
            directBufferVideoFrame.setPlaneData(2, abstractC1278120jMg.LJFF());
            directBufferVideoFrame.setPlaneStride(2, abstractC1278120jMg.LIZLLL / 2);
            directBufferVideoFrame.setRotation(VideoRotation.fromId(abstractC1278120jMg.LIZJ.getDegree()));
        }
        boolean z2 = this.liveSdkSetting.switchParams.LIZIZ;
        if (directBufferVideoFrame != null) {
            directBufferVideoFrame.setTimeStampUs(c1277560jLm.LJFF);
            directBufferVideoFrame.setWidth(c1277560jLm.LIZIZ());
            directBufferVideoFrame.setHeight(c1277560jLm.LIZ());
            directBufferVideoFrame.setGLSync(c1277560jLm.LJIIIZ);
            directBufferVideoFrame.setOriginalCaptureTimestampMs(c1277560jLm.LJI);
            directBufferVideoFrame.setOriginalEffectTimestampMs(c1277560jLm.LJII);
            if (z2) {
                c1277560jLm.LIZLLL();
                directBufferVideoFrame.setReleaseCallback(new ARunnableS120S0100000_20(c1277560jLm, 340));
            } else {
                directBufferVideoFrame.setReleaseCallback(c1277560jLm.LJIILIIL);
            }
        }
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            livePusher.pushExternalVideoFrame(directBufferVideoFrame);
        }
        if (z2 && directBufferVideoFrame != null) {
            directBufferVideoFrame.release();
        }
        return 0;
    }

    private final void reportLog(JSONObject jSONObject) {
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObject);
        }
    }

    @Override // X.AbstractC1277570jLn
    public int doPushExternalVideoFrame(C1277560jLm c1277560jLm) {
        if (this.mPusher == null) {
            return -1;
        }
        if (c1277560jLm.LIZ == EnumC1277900jMK.Texture) {
            AbstractC1277570jLn.Companion.getClass();
            if (GLThreadManager.LJFF() == null) {
                return -2;
            }
        }
        this.liveSdkSetting.mPushBase.getClass();
        return pPushExternalVideoFrameOld(c1277560jLm);
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onInitializedEngineEGL(GLESVersion gLESVersion) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInitializedEngineEGL:");
        sbLIZ.append(gLESVersion);
        AVLog.logKibana(5, "VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onLocalAudioStateChanged(LivePusherLocalAudioState livePusherLocalAudioState) {
        C1278510jNJ c1278510jNJ;
        if (livePusherLocalAudioState != null) {
            int i = C1278700jNc.LIZIZ[livePusherLocalAudioState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    EnumC1277870jMH enumC1277870jMH = EnumC1277870jMH.Send;
                    System.currentTimeMillis();
                    c1278510jNJ = new C1278510jNJ(false, enumC1277870jMH);
                } else {
                    return;
                }
            } else {
                EnumC1277870jMH enumC1277870jMH2 = EnumC1277870jMH.Encoded;
                System.currentTimeMillis();
                c1278510jNJ = new C1278510jNJ(false, enumC1277870jMH2);
            }
            if (livePusherLocalAudioState == LivePusherLocalAudioState.LIVE_PUSHER_LOCAL_AUDIO_STATE_FIRST_FRAME_ENCODED) {
                reportAudioFirstFramePreEncode();
            }
            InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
            if (interfaceC1277660jLw != null) {
                interfaceC1277660jLw.LIZIZ(c1278510jNJ);
            }
            reportFirstFrameEvents(c1278510jNJ);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onLocalVideoStateChanged(LivePusherLocalVideoState livePusherLocalVideoState) {
        C1278510jNJ c1278510jNJ;
        if (livePusherLocalVideoState != null) {
            int i = C1278700jNc.LIZJ[livePusherLocalVideoState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    EnumC1277870jMH enumC1277870jMH = EnumC1277870jMH.Send;
                    System.currentTimeMillis();
                    c1278510jNJ = new C1278510jNJ(true, enumC1277870jMH);
                } else {
                    return;
                }
            } else {
                EnumC1277870jMH enumC1277870jMH2 = EnumC1277870jMH.Encoded;
                System.currentTimeMillis();
                c1278510jNJ = new C1278510jNJ(true, enumC1277870jMH2);
            }
            InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
            if (interfaceC1277660jLw != null) {
                interfaceC1277660jLw.LIZIZ(c1278510jNJ);
            }
            reportFirstFrameEvents(c1278510jNJ);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.IStatisticsEventHandler
    public void onLogMonitor(String str) {
        Object c098200Yq;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.equals("push_stream", jSONObject.optString("event_key"))) {
                C1278550jNN.LIZ(jSONObject, "network_quality", Integer.valueOf(this.mNetworkQuality.ordinal()));
                this.mStatistics.LIZ = jSONObject.optDouble("encode_fps", 0.0d);
                this.mStatistics.LIZJ = jSONObject.optDouble("real_video_framerate", 0.0d);
                this.mStatistics.LJI = jSONObject.optDouble("real_bitrate", 0.0d);
                InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
                if (interfaceC1278600jNS != null) {
                    interfaceC1278600jNS.LIZJ(this.mStatistics);
                }
                if (this.mEnableDebugSei) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("real_bitrate", this.mStatistics.LJI);
                    jSONObject2.put("real_video_framerate", this.mStatistics.LIZJ);
                    LivePusher livePusher = this.mPusher;
                    if (livePusher != null) {
                        livePusher.sendSEIMessage(C786410Ut5.J3(jSONObject2), 1, true, false);
                    }
                }
            }
            reportLog(jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLogMonitor error ");
            sbLIZ.append(str);
            AVLog.logToIODevice(6, "VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onNetworkQuality(NetworkQualityStats networkQualityStats) {
        EnumC1278980jO4 enumC1278980jO4;
        switch (networkQualityStats.txQuality) {
            case 1:
            case 2:
                enumC1278980jO4 = EnumC1278980jO4.Good;
                break;
            case 3:
            case 4:
                enumC1278980jO4 = EnumC1278980jO4.Poor;
                break;
            case 5:
            case 6:
                enumC1278980jO4 = EnumC1278980jO4.Bad;
                break;
            default:
                enumC1278980jO4 = EnumC1278980jO4.Unknown;
                break;
        }
        if (enumC1278980jO4 != this.mNetworkQuality) {
            this.mNetworkQuality = enumC1278980jO4;
            InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
            if (interfaceC1277660jLw != null) {
                interfaceC1277660jLw.LIZLLL(enumC1278980jO4);
            }
        }
    }

    @Override // X.AbstractC1277570jLn
    public void setObserver(InterfaceC1277660jLw interfaceC1277660jLw) {
        this.mObserver = interfaceC1277660jLw;
    }

    @Override // X.AbstractC1277570jLn
    public int setProperty(InterfaceC1277930jMN interfaceC1277930jMN) {
        if (!interfaceC1277930jMN.isValid()) {
            return -100;
        }
        Integer numValueOf = null;
        if (interfaceC1277930jMN instanceof C1278210jMp) {
            handleUserMetadata((C1278210jMp) interfaceC1277930jMN);
            try {
                this.mUserMetadata.put(((C1278210jMp) interfaceC1277930jMN).LIZ, ((C1278210jMp) interfaceC1277930jMN).LIZIZ);
                LivePusher livePusher = this.mPusher;
                if (livePusher != null) {
                    numValueOf = Integer.valueOf(livePusher.setMetaData(C786410Ut5.J3(this.mUserMetadata)));
                }
                C189200o6.m2constructorimpl(numValueOf);
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return 0;
            }
        }
        if (interfaceC1277930jMN instanceof C1268990j7x) {
            LivePusher livePusher2 = this.mPusher;
            if (livePusher2 != null) {
                livePusher2.setSEICurrentShiftDiffTime(((C1268990j7x) interfaceC1277930jMN).LIZ);
            }
            this.enableNTPTiming = true;
        } else {
            if (interfaceC1277930jMN instanceof C1278540jNM) {
                if (isPushing()) {
                    AVLog.w("VeLivePusherImpV2", "Cannot set output image size when pushing");
                    return -1;
                }
                LivePusherVideoConfig livePusherVideoConfig = this.mRtcConfig.videoConfig;
                C1278540jNM c1278540jNM = (C1278540jNM) interfaceC1277930jMN;
                int i = c1278540jNM.LIZ;
                livePusherVideoConfig.width = i;
                int i2 = c1278540jNM.LIZIZ;
                livePusherVideoConfig.height = i2;
                this.mInitWidth = i;
                this.mInitHeight = i2;
                ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.liveSdkSetting, i, i2, livePusherVideoConfig.fps);
                if (probeSpeedGearLIZ != null) {
                    LivePusherVideoConfig livePusherVideoConfig2 = this.mRtcConfig.videoConfig;
                    livePusherVideoConfig2.minBitrateKbps = probeSpeedGearLIZ.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
                    int i3 = probeSpeedGearLIZ.maxBitrate;
                    livePusherVideoConfig2.maxBitrateKbps = i3 / LSPassThroughRecordSizeConfig.DEFAULT;
                    livePusherVideoConfig2.startBitrateKbps = probeSpeedGearLIZ.defaultBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
                    updatePerformanceMaxVideoBitrate(i3);
                    updateBitrateWithRatio();
                }
                String str = this.tag;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set output image size: ");
                sbLIZ.append(c1278540jNM.LIZ);
                sbLIZ.append('x');
                sbLIZ.append(c1278540jNM.LIZIZ);
                sbLIZ.append(" and LivePusher find the bitrate range:");
                sbLIZ.append(this.mRtcConfig.videoConfig.maxBitrateKbps);
                sbLIZ.append('x');
                sbLIZ.append(this.mRtcConfig.videoConfig.minBitrateKbps);
                AVLog.logKibana(4, str, C2188811AlT.LIZIZ(sbLIZ), null);
                setLivePusherConfig();
                LivePusherVideoConfig livePusherVideoConfig3 = this.mRtcConfig.videoConfig;
                updatePushBaseResolution(livePusherVideoConfig3.width, livePusherVideoConfig3.height);
                return 0;
            }
            if (interfaceC1277930jMN instanceof C1279350jOf) {
                this.liveSdkSetting.mPushBase.LIZ = 0;
                return 0;
            }
            if (interfaceC1277930jMN instanceof C1270090j9j) {
                if (isPushing()) {
                    return -1;
                }
                PushBase pushBase = this.liveSdkSetting.mPushBase;
                C1270090j9j c1270090j9j = (C1270090j9j) interfaceC1277930jMN;
                pushBase.minBitrate = c1270090j9j.LIZ;
                pushBase.maxBitrate = c1270090j9j.LIZJ;
                pushBase.defaultBitrate = c1270090j9j.LIZIZ;
                String str2 = this.tag;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set ");
                sbLIZ2.append(interfaceC1277930jMN);
                AVLog.logKibana(4, str2, C2188811AlT.LIZIZ(sbLIZ2), null);
                return 0;
            }
            if (interfaceC1277930jMN instanceof C1269290j8R) {
                if (isPushing()) {
                    return -1;
                }
                this.liveSdkSetting.mPushBase.fps = ((C1269290j8R) interfaceC1277930jMN).LIZ;
                String str3 = this.tag;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("set ");
                sbLIZ3.append(interfaceC1277930jMN);
                AVLog.logKibana(4, str3, C2188811AlT.LIZIZ(sbLIZ3), null);
                return 0;
            }
        }
        return 0;
    }

    @Override // X.AbstractC1277570jLn
    public void setVideoStrategyRunner(Object obj) {
        IVideoStrategyRunner iVideoStrategyRunner;
        RTCVideo rTCVideo;
        if ((obj instanceof IVideoStrategyRunner) && (iVideoStrategyRunner = (IVideoStrategyRunner) obj) != null && getRTCVideo() != null && (rTCVideo = getRTCVideo()) != null) {
            rTCVideo.setVideoStrategyRunner(iVideoStrategyRunner);
        }
    }

    @Override // X.AbstractC1277570jLn
    public int updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        PreProcessVideoNodeStats preProcessVideoNodeStats = new PreProcessVideoNodeStats(lyraxPreProcessVideoNodeStats.frame_rate_camera_output, lyraxPreProcessVideoNodeStats.frame_rate_render_input, lyraxPreProcessVideoNodeStats.frame_rate_render_output, lyraxPreProcessVideoNodeStats.up_render_stall_100, lyraxPreProcessVideoNodeStats.up_render_stall_200, lyraxPreProcessVideoNodeStats.up_render_stall_500, lyraxPreProcessVideoNodeStats.average_bmf_process_time, lyraxPreProcessVideoNodeStats.average_effect_process_time, lyraxPreProcessVideoNodeStats.average_render_process_time, lyraxPreProcessVideoNodeStats.average_frame_interval_time, lyraxPreProcessVideoNodeStats.render_stall_details, lyraxPreProcessVideoNodeStats.effect_process_details, lyraxPreProcessVideoNodeStats.original_capture_width, lyraxPreProcessVideoNodeStats.original_capture_height, lyraxPreProcessVideoNodeStats.adapted_resolution_width, lyraxPreProcessVideoNodeStats.adapted_resolution_height);
        LivePusher livePusher = this.mPusher;
        if (livePusher != null) {
            return livePusher.updateExternalStats(preProcessVideoNodeStats);
        }
        return -1;
    }

    public static final boolean _init_$lambda$22(VeLivePusherImpV2 veLivePusherImpV2, String str) {
        try {
            C2118308Rp.LIZ(str);
            String str2 = veLivePusherImpV2.tag;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RtcNativeLibraryLoader load ");
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(true);
            AVLog.ioi(str2, C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_key", "load_rtc_library");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("loadLibraryPath", str);
            jSONObject2.put("LibraryLoaderName", "LibraryLoader");
            jSONObject.put("message", C786410Ut5.J3(jSONObject2));
            jSONObject.put("error_code", 0);
            if (veLivePusherImpV2.statsObserver != null) {
                veLivePusherImpV2.reportLog(jSONObject);
                return true;
            }
            veLivePusherImpV2.loadSoLog = jSONObject;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str3 = veLivePusherImpV2.tag;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("RtcNativeLibraryLoader load ");
            sbLIZ2.append(str);
            sbLIZ2.append(" error");
            AVLog.logToIODevice(6, str3, C2188811AlT.LIZIZ(sbLIZ2), e);
            return false;
        }
    }

    private final void doStart(String[] strArr, boolean z) {
        RTCVideo rTCVideo;
        RTCVideo rTCVideo2;
        int i;
        VeLivePusherImpV2 veLivePusherImpV2 = this;
        if (veLivePusherImpV2.mPusher == null) {
            C1277590jLp c1277590jLp = veLivePusherImpV2.config;
            if (c1277590jLp.LJIILIIL) {
                try {
                    JSONObject jSONObject = c1277590jLp.LJFF;
                    if (jSONObject != null) {
                        jSONObject.put("rtc.enable_log_callback", true);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.logToIODevice(6, veLivePusherImpV2.tag, "buildRtcParameters enable_log_callback error", e);
                }
            }
            veLivePusherImpV2.liveSdkSetting.mPushBase.getClass();
            if (veLivePusherImpV2.config.LJIILJJIL == EnumC1152920g6k.VeLivePusherLiveType_Stage) {
                i = 1;
            } else {
                i = 0;
            }
            LivePusherOption livePusherOption = new LivePusherOption();
            livePusherOption.rtcLiveType = i ^ 1;
            if (veLivePusherImpV2.liveSdkSetting.mPushBase.LJJJJJ) {
                int iLJIJJLI = C13LQ.LJIJJLI(GLThreadManager.LJI());
                C1277590jLp c1277590jLp2 = veLivePusherImpV2.config;
                Context context = c1277590jLp2.LIZ;
                String str = c1277590jLp2.LJIIIIZZ;
                AbstractC1277570jLn.Companion.getClass();
                veLivePusherImpV2.mPusher = LivePusher.createLivePusher(context, strArr, str, veLivePusherImpV2, GLThreadManager.LJFF(), GLESVersion.fromId(iLJIJJLI), veLivePusherImpV2.config.LJFF, livePusherOption);
            } else {
                C1277590jLp c1277590jLp3 = veLivePusherImpV2.config;
                Context context2 = c1277590jLp3.LIZ;
                String str2 = c1277590jLp3.LJIIIIZZ;
                AbstractC1277570jLn.Companion.getClass();
                EGLContext eGLContextLJFF = GLThreadManager.LJFF();
                JSONObject jSONObject2 = veLivePusherImpV2.config.LJFF;
                veLivePusherImpV2 = veLivePusherImpV2;
                veLivePusherImpV2.mPusher = LivePusher.createLivePusher(context2, strArr, str2, veLivePusherImpV2, eGLContextLJFF, jSONObject2, livePusherOption);
            }
        }
        LivePusher livePusher = veLivePusherImpV2.mPusher;
        if (livePusher != null) {
            livePusher.setStatisticsEventHandler(veLivePusherImpV2);
            C1278430jNB c1278430jNB = veLivePusherImpV2.mResolutionLinkCache;
            if (c1278430jNB != null && (rTCVideo2 = livePusher.getRTCVideo()) != null) {
                StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
                C1279200jOQ c1279200jOQ = c1278430jNB.LIZ;
                int i2 = c1279200jOQ.LIZ;
                int i3 = c1279200jOQ.LIZIZ;
                C1279200jOQ c1279200jOQ2 = c1278430jNB.LIZIZ;
                rTCVideo2.bindToStandardDowngradeTier(streamIndex, i2, i3, c1279200jOQ2.LIZ, c1279200jOQ2.LIZIZ);
            }
            veLivePusherImpV2.setLivePusherConfig();
            PushBase pushBase = veLivePusherImpV2.config.LJI.mPushBase;
            boolean z2 = pushBase.LJJIII;
            int i4 = (int) pushBase.gopSec;
            RTCVideo rTCVideo3 = livePusher.getRTCVideo();
            if (rTCVideo3 != null) {
                rTCVideo3.enableSEISendE2EInfo(z2, i4);
            }
            if (pushBase.LJIL) {
                livePusher.startAudioCapture();
            }
            livePusher.startVideoCapture();
            livePusher.setMetaData(C786410Ut5.J3(veLivePusherImpV2.mUserMetadata));
            veLivePusherImpV2.addInternalSei();
            if (veLivePusherImpV2.liveSdkSetting.mPushBase.enableGearTable) {
                List<ProbeSpeedGear> list = veLivePusherImpV2.config.LJI.probeSpeedResolutions;
                ArrayList<ProbeSpeedGear> arrayList = new ArrayList();
                for (ProbeSpeedGear probeSpeedGear : list) {
                    if (probeSpeedGear.LIZ()) {
                        arrayList.add(probeSpeedGear);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (ProbeSpeedGear probeSpeedGear2 : arrayList) {
                    arrayList2.add(new VideoEncoderConfig(probeSpeedGear2.width, probeSpeedGear2.height, probeSpeedGear2.fps, probeSpeedGear2.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT, probeSpeedGear2.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT));
                }
                VideoEncoderConfig[] videoEncoderConfigArr = (VideoEncoderConfig[]) arrayList2.toArray(new VideoEncoderConfig[0]);
                if (videoEncoderConfigArr.length != 0 && (rTCVideo = livePusher.getRTCVideo()) != null) {
                    rTCVideo.setLiveBitrateGearTable(videoEncoderConfigArr, videoEncoderConfigArr.length);
                }
            }
            RTCVideo rTCVideo4 = livePusher.getRTCVideo();
            if (rTCVideo4 != null) {
                rTCVideo4.setRtcScene(RtcScene.RTC_SCENE_LIVE);
            }
            livePusher.startPush(!z);
        }
    }

    private final void updatePushBaseResolution(int i, int i2) {
        PushBase pushBase = this.config.LJI.mPushBase;
        pushBase.width = i;
        pushBase.height = i2;
    }

    @Override // X.AbstractC1277570jLn
    public void doStartPush(String[] strArr, boolean z) {
        String str = (String) C13LQ.LJJIFFI(strArr);
        if (str != null) {
            this.mUrl = str;
            doStart(strArr, z);
            return;
        }
        throw new IllegalArgumentException("urls must not be null");
    }

    @Override // X.AbstractC1277570jLn
    public void doSwitchScene(EnumC1277920jMM enumC1277920jMM, long j) {
        RtcScene rtcScene;
        C1277910jML c1277910jML = this.mLevelChangeNotifier;
        c1277910jML.LIZ = 0;
        c1277910jML.LIZIZ = 0;
        c1277910jML.LIZJ = 0;
        c1277910jML.LIZLLL = 0;
        c1277910jML.LJ = 0;
        c1277910jML.LJFF = 0;
        c1277910jML.LJI = 0;
        c1277910jML.LJII = 0;
        c1277910jML.LJIIIIZZ = 0;
        RTCVideo rTCVideo = getRTCVideo();
        if (rTCVideo != null) {
            int i = C1278000jMU.LIZ[enumC1277920jMM.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    rtcScene = RtcScene.RTC_SCENE_LINK_MIC;
                } else {
                    throw new C1954807lC();
                }
            } else {
                rtcScene = RtcScene.RTC_SCENE_LIVE;
            }
            rTCVideo.setRtcScene(rtcScene);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onLogCallback(String str, String str2) throws JSONException {
        if (!this.config.LJIILIIL) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_content", str2);
        jSONObject.put("log_level", str);
        jSONObject.put("event_key", "local_debug_log");
        reportLog(jSONObject);
    }

    @Override // X.AbstractC1277570jLn
    public void setStatisticsObserver(InterfaceC1278600jNS interfaceC1278600jNS, int i) {
        super.setStatisticsObserver(interfaceC1278600jNS, i);
        JSONObject jSONObject = this.loadSoLog;
        if (jSONObject != null) {
            reportLog(jSONObject);
        }
        this.loadSoLog = null;
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onError(LivePusherErrorCode livePusherErrorCode, int i, String str) {
        InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
        if (interfaceC1277660jLw != null) {
            interfaceC1277660jLw.onError(livePusherErrorCode.value(), i, str);
        }
    }

    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    public void onStatusChanged(LivePusherStatus livePusherStatus, int i, String str) {
        if (this.mObserver == null) {
            return;
        }
        int i2 = C1278700jNc.LIZ[livePusherStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStatusChanged,UnDefined Error:");
                    sbLIZ.append(livePusherStatus);
                    sbLIZ.append(' ');
                    sbLIZ.append(i);
                    sbLIZ.append(' ');
                    sbLIZ.append(str);
                    AVLog.ioe("VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
                    if (interfaceC1277660jLw != null) {
                        interfaceC1277660jLw.LIZLLL(EnumC1278980jO4.Bad);
                        return;
                    }
                    return;
                }
                return;
            }
            InterfaceC1277660jLw interfaceC1277660jLw2 = this.mObserver;
            if (interfaceC1277660jLw2 == null) {
                return;
            }
            interfaceC1277660jLw2.LIZJ(EnumC1270040j9e.ConnectSuccess);
            return;
        }
        InterfaceC1277660jLw interfaceC1277660jLw3 = this.mObserver;
        if (interfaceC1277660jLw3 == null) {
            return;
        }
        interfaceC1277660jLw3.LIZJ(EnumC1270040j9e.Connecting);
    }

    @Override // X.AbstractC1277570jLn
    public EnumC1277950jMP setVideoPerformanceConfig(int i, int i2, int i3) {
        RTCVideo rTCVideo;
        Integer numValueOf;
        ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.liveSdkSetting, i, i2, i3);
        if (probeSpeedGearLIZ != null) {
            updatePerformanceMaxVideoBitrate(probeSpeedGearLIZ.maxBitrate);
        }
        LivePusherVideoConfig livePusherVideoConfig = this.mRtcConfig.videoConfig;
        int iMin = Math.min(livePusherVideoConfig.width, livePusherVideoConfig.height);
        LivePusherVideoConfig livePusherVideoConfig2 = this.mRtcConfig.videoConfig;
        int iMax = Math.max(livePusherVideoConfig2.width, livePusherVideoConfig2.height);
        C1278430jNB c1278430jNB = this.mResolutionLinkCache;
        if (c1278430jNB != null) {
            int i4 = c1278430jNB.LIZ.LIZ;
            LivePusherVideoConfig livePusherVideoConfig3 = this.mRtcConfig.videoConfig;
            if (i4 == livePusherVideoConfig3.width || i4 == livePusherVideoConfig3.height) {
                C1279200jOQ c1279200jOQ = c1278430jNB.LIZIZ;
                iMin = c1279200jOQ.LIZ;
                iMax = c1279200jOQ.LIZIZ;
            }
        }
        if (i > iMin || i2 > iMax) {
            LivePusherVideoConfig livePusherVideoConfig4 = this.mRtcConfig.videoConfig;
            livePusherVideoConfig4.width = i;
            livePusherVideoConfig4.height = i2;
            livePusherVideoConfig4.fps = i3;
            if (probeSpeedGearLIZ != null) {
                livePusherVideoConfig4.minBitrateKbps = probeSpeedGearLIZ.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
                livePusherVideoConfig4.maxBitrateKbps = probeSpeedGearLIZ.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
                livePusherVideoConfig4.startBitrateKbps = probeSpeedGearLIZ.defaultBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
                updateBitrateWithRatio();
            }
            setLivePusherConfig();
            LivePusherVideoConfig livePusherVideoConfig5 = this.mRtcConfig.videoConfig;
            updatePushBaseResolution(livePusherVideoConfig5.width, livePusherVideoConfig5.height);
        }
        LivePusher livePusher = this.mPusher;
        if (livePusher != null && (rTCVideo = livePusher.getRTCVideo()) != null && (numValueOf = Integer.valueOf(rTCVideo.setVideoPerformanceConfig(StreamIndex.STREAM_INDEX_MAIN, i, i2, i3))) != null && numValueOf.intValue() == 0) {
            return EnumC1277950jMP.Success;
        }
        return EnumC1277950jMP.OtherError;
    }

    public static final void pPushExternalVideoFrameNew$lambda$10(C1277560jLm c1277560jLm, EGLContext eGLContext, int i, long j) {
        Runnable runnable = c1277560jLm.LJIILIIL;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // X.AbstractC1277570jLn
    public void insertStandardLevel(int i, int i2, int i3, int i4) {
        RTCVideo rTCVideo;
        this.mResolutionLinkCache = new C1278430jNB(i, i2, i3, i4);
        LivePusher livePusher = this.mPusher;
        if (livePusher != null && (rTCVideo = livePusher.getRTCVideo()) != null) {
            rTCVideo.bindToStandardDowngradeTier(StreamIndex.STREAM_INDEX_MAIN, i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // com.ss.bytertc.engine.livepusher.ILivePusherEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPerformanceAlarms(com.ss.bytertc.engine.type.PerformanceAlarmMode r9, java.lang.String r10, com.ss.bytertc.engine.type.PerformanceAlarmReason r11, com.ss.bytertc.engine.type.SourceWantedData r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L3
            return
        L3:
            com.ss.bytertc.engine.type.PerformanceAlarmReason r0 = com.ss.bytertc.engine.type.PerformanceAlarmReason.BANDWIDTH_FALLBACKED
            if (r11 == r0) goto L87
            com.ss.bytertc.engine.type.PerformanceAlarmReason r0 = com.ss.bytertc.engine.type.PerformanceAlarmReason.BANDWIDTH_RESUMED
            if (r11 == r0) goto L87
            X.0byu r5 = X.EnumC994300byu.ByteRTCLevelChangeFromPerformance
        Ld:
            X.0jML r4 = r8.mLevelChangeNotifier
            int r3 = r12.width
            int r2 = r12.height
            int r1 = r12.frameRate
            r4.getClass()
            X.0byu r0 = X.EnumC994300byu.ByteRTCLevelChangeFromPerformance
            if (r0 != r5) goto L80
            r4.LIZJ = r1
            r4.LIZ = r3
            r4.LIZIZ = r2
        L22:
            X.0jML r0 = r8.mLevelChangeNotifier
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L6a
            int r1 = r12.width
            int r0 = r12.height
            r8.updatePushBaseResolution(r1, r0)
            X.0jLw r6 = r8.mObserver
            if (r6 == 0) goto L6a
            if (r11 != 0) goto L77
            r0 = -1
        L38:
            r7 = 4
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == r2) goto L74
            if (r0 == r3) goto L74
            if (r0 == r4) goto L71
            if (r0 == r7) goto L71
            X.0j9h r5 = X.EnumC1270070j9h.None
        L46:
            if (r11 == 0) goto L58
            int[] r1 = X.C1278000jMU.LJFF
            int r0 = r11.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L6e
            if (r0 == r3) goto L6b
            if (r0 == r4) goto L6e
            if (r0 == r7) goto L6b
        L58:
            X.0j9x r4 = X.EnumC1270230j9x.Keep
        L5a:
            X.0jML r0 = r8.mLevelChangeNotifier
            int r3 = r0.LJI
            int r2 = r0.LJII
            int r1 = r0.LJIIIIZZ
            X.0j6P r0 = new X.0j6P
            r0.<init>(r1, r3, r2)
            r6.LJFF(r5, r4, r0)
        L6a:
            return
        L6b:
            X.0j9x r4 = X.EnumC1270230j9x.Up
            goto L5a
        L6e:
            X.0j9x r4 = X.EnumC1270230j9x.Down
            goto L5a
        L71:
            X.0j9h r5 = X.EnumC1270070j9h.Net
            goto L46
        L74:
            X.0j9h r5 = X.EnumC1270070j9h.Performance
            goto L46
        L77:
            int[] r1 = X.C1278000jMU.LJFF
            int r0 = r11.ordinal()
            r0 = r1[r0]
            goto L38
        L80:
            r4.LJFF = r1
            r4.LIZLLL = r3
            r4.LJ = r2
            goto L22
        L87:
            X.0byu r5 = X.EnumC994300byu.ByteRTCLevelChangeFromNetwork
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.pusher.anet.VeLivePusherImpV2.onPerformanceAlarms(com.ss.bytertc.engine.type.PerformanceAlarmMode, java.lang.String, com.ss.bytertc.engine.type.PerformanceAlarmReason, com.ss.bytertc.engine.type.SourceWantedData):void");
    }

    @Override // X.AbstractC1277570jLn
    public int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2) {
        LivePusher livePusher = this.mPusher;
        if (livePusher != null && str != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                livePusher.sendSEIMessage(C786410Ut5.J3(jSONObject), i, z, z2);
                return 0;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        return -1;
    }

    @Override // X.AbstractC1277570jLn
    public int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        if (this.mPusher != null) {
            if ((i2 & 1) > 0) {
                if (obj instanceof JSONObject) {
                    String strNativeSeiEncrypt = SeiEncryptUtil.nativeSeiEncrypt(str, obj, this.mUrl);
                    if (!TextUtils.isEmpty(strNativeSeiEncrypt)) {
                        LivePusher livePusher = this.mPusher;
                        if (livePusher != null) {
                            livePusher.sendSEIMessage(strNativeSeiEncrypt, i, z, z2);
                            return 0;
                        }
                        return 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sendSeiMessage with encrypt:");
                    sbLIZ.append(str);
                    sbLIZ.append(" => ");
                    sbLIZ.append(obj);
                    AVLog.logToIODevice(6, "VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ), new Exception("SeiMessageEncrypt Error Result"));
                    return 0;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendSeiMessage with encrypt:");
                sbLIZ2.append(str);
                sbLIZ2.append(" => ");
                sbLIZ2.append(obj);
                AVLog.logToIODevice(6, "VeLivePusherImpV2", C2188811AlT.LIZIZ(sbLIZ2), new Exception("SeiMessageEncrypt Invalid Param"));
                return 0;
            }
            sendSeiMessage(str, obj, i, z, z2);
            return 0;
        }
        return 0;
    }
}
