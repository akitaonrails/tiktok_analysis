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
import X.C1277610jLr;
import X.C1277620jLs;
import X.C1277630jLt;
import X.C1277640jLu;
import X.C1277670jLx;
import X.C1277910jML;
import X.C1278000jMU;
import X.C1278180jMm;
import X.C1278210jMp;
import X.C1278430jNB;
import X.C1278510jNJ;
import X.C1278540jNM;
import X.C1278550jNN;
import X.C1278710jNd;
import X.C1278890jNv;
import X.C1279020jO8;
import X.C1279200jOQ;
import X.C1279350jOf;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1936807iI;
import X.C1954807lC;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1152920g6k;
import X.EnumC1270040j9e;
import X.EnumC1276060jJM;
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
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.ss.bytertc.engine.type.VideoStrategyChannelParams;
import com.ss.bytertc.engine.type.VideoStrategyChannelResult;
import com.ss.bytertc.engine.type.VideoStrategyParams;
import com.ss.bytertc.engine.video.IVideoStrategyResultListener;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioAACCodecProfile;
import com.ss.lyrax.audio.LyraxAudioChannel;
import com.ss.lyrax.audio.LyraxAudioCodecType;
import com.ss.lyrax.audio.LyraxAudioContentConfig;
import com.ss.lyrax.audio.LyraxAudioEncoderConfig;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.audio.LyraxAudioSampleRate;
import com.ss.lyrax.engine.ILyraxEngineListener;
import com.ss.lyrax.engine.ILyraxVideoStrategyRunner;
import com.ss.lyrax.engine.LyraxAndroidOption;
import com.ss.lyrax.engine.LyraxAppOption;
import com.ss.lyrax.engine.LyraxAttributeKey;
import com.ss.lyrax.engine.LyraxBusinessOption;
import com.ss.lyrax.engine.LyraxConnectionState;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxNativeLibraryLoadStatus;
import com.ss.lyrax.engine.LyraxNetworkOption;
import com.ss.lyrax.engine.LyraxNetworkType;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.engine.LyraxSysStats;
import com.ss.lyrax.engine.LyraxVideoStrategyChannelParams;
import com.ss.lyrax.engine.LyraxVideoStrategyChannelResult;
import com.ss.lyrax.engine.LyraxVideoStrategyParams;
import com.ss.lyrax.engine.LyraxVideoStrategyResultListener;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.publisher.ILyraxPublisherListener;
import com.ss.lyrax.publisher.LyraxPublisherOption;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.room.LyraxRoomOption;
import com.ss.lyrax.stream.LyraxAudioLocalState;
import com.ss.lyrax.stream.LyraxLayoutConfig;
import com.ss.lyrax.stream.LyraxLowLatencyParams;
import com.ss.lyrax.stream.LyraxPublisherConfig;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.stream.LyraxVideoLocalState;
import com.ss.lyrax.transcoder.LyraxTranscoderEffectDescription;
import com.ss.lyrax.transcoder.LyraxTranscoderEffectParam;
import com.ss.lyrax.transcoder.LyraxTranscoderEffectType;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoCPUBufferFrameBuilder;
import com.ss.lyrax.video.LyraxVideoCodecMode;
import com.ss.lyrax.video.LyraxVideoCodecType;
import com.ss.lyrax.video.LyraxVideoDegradeLevelsBuilder;
import com.ss.lyrax.video.LyraxVideoEnableBFrame;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import com.ss.lyrax.video.LyraxVideoEncoderMode;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.lyrax.video.LyraxVideoFrameInfo;
import com.ss.lyrax.video.LyraxVideoGLTextureFrameBuilder;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoResolutionConfig;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.lyrax.video.LyraxVideoSeiParamV2;
import com.ss.lyrax.video.LyraxVideoSourceConfig;
import com.ss.lyrax.video.LyraxVideoSourceType;
import com.ss.lyrax.video.LyraxVideoSourceWantedData;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.ProbeSpeedGear;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.PushStreamData;
import com.ss.pusher.core.params.RTCTestEnv;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SeiEncryptUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS304S0000000_20;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class VeLivePusherImpV3 extends AbstractC1277570jLn implements ILyraxEngineListener, ILyraxPublisherListener {
    public static final C1278710jNd Companion = new Object() { // from class: X.0jNd
    };
    public final C1215200hjC<LyraxVideoSourceWantedData> distinctChecker;
    public final LiveSdkSetting liveSdkSetting;
    public JSONObject loadSoLog;
    public List<? extends LyraxTranscoderFeature> mCachedFeatures;
    public LyraxVideoEncoderProfile.VideoDegradeLevels mDegradeLevels;
    public boolean mEnableAudioEncodeConfigMigration;
    public boolean mEnableCalculateLoudness;
    public ILyraxEngine mEngine;
    public List<? extends LyraxVideoBitrateGearTableItem> mGears;
    public boolean mHasCachedFeatures;
    public int mInitHeight;
    public int mInitWidth;
    public final C1277910jML mLevelChangeNotifier;
    public String mLowLatencyStreamId;
    public String mLowLatencyStreamToken;
    public EnumC1278980jO4 mNetworkQuality;
    public int mNetworkQualityV3Raw;
    public InterfaceC1277660jLw mObserver;
    public ILyraxVideoPlatformWrapper mPlatformVideoSourceWrapper;
    public ILyraxPublisher mPublisher;
    public C1278430jNB mResolutionLinkCache;
    public LyraxAudioEncoderConfig mRtcAudioConfig;
    public final LyraxPublisherConfig mRtcPublisherConfig;
    public RTCRoom mRtcRoom;
    public String mRtcRoomId;
    public String mRtcTaskId;
    public String mRtcTooken;
    public String mRtcUserId;
    public RTCVideo mRtcVideo;
    public LyraxVideoEncoderConfig mRtcVideoConfig;
    public final C1279020jO8 mStatistics;
    public boolean mSupportLowLatency;
    public final C1277630jLt mTextureMatrixCache;
    public String mUrl;
    public JSONObject mUserMetadata;
    public IVideoStrategyRunner mVideoStrategyRunner;
    public final String tag;

    public static /* synthetic */ void lambda$semisugar$pPushExternalVideoFrameOld$lambda$26$0(C1277560jLm c1277560jLm) {
        C1C7U.LIZ("VeLivePusherImpV3@934e.pPushExternalVideoFrameOld$1L");
        c1277560jLm.LIZJ();
        C1C7U.LIZIZ("VeLivePusherImpV3@934e.pPushExternalVideoFrameOld$1L");
    }

    public static /* synthetic */ void lambda$semisugar$pPushExternalVideoFrameOld$lambda$27$0(C1277560jLm c1277560jLm) {
        C1C7U.LIZ("VeLivePusherImpV3@934e.pPushExternalVideoFrameOld$2L");
        c1277560jLm.LIZJ();
        C1C7U.LIZIZ("VeLivePusherImpV3@934e.pPushExternalVideoFrameOld$2L");
    }

    @Override // X.AbstractC1277570jLn
    public int doPushExternalAudioFrame(C1278180jMm c1278180jMm) {
        return 0;
    }

    @Override // X.AbstractC1277570jLn
    public synchronized RTCVideo getRTCVideo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRTCVideo :");
        sbLIZ.append(this.liveSdkSetting.mPushBase.isNoRoomJoinRoomOnce);
        sbLIZ.append(')');
        AVLog.ioi("VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ));
        PushBase pushBase = this.liveSdkSetting.mPushBase;
        if (!pushBase.isNoRoomJoinRoomOnce) {
            return null;
        }
        RTCVideo rTCVideo = this.mRtcVideo;
        if (rTCVideo != null) {
            return rTCVideo;
        }
        if (pushBase.LJJJJJ) {
            int iLJIJJLI = C13LQ.LJIJJLI(GLThreadManager.LJI());
            C1277590jLp c1277590jLp = this.config;
            Context context = c1277590jLp.LIZ;
            String str = c1277590jLp.LJIIIIZZ;
            AbstractC1277570jLn.Companion.getClass();
            this.mRtcVideo = RTCVideo.createRTCVideoV2(context, str, null, GLThreadManager.LJFF(), GLESVersion.fromId(iLJIJJLI), this.config.LJFF);
        }
        if (this.mRtcRoom == null) {
            RTCVideo rTCVideo2 = this.mRtcVideo;
            RTCRoom rTCRoomCreateRTCRoom = rTCVideo2 != null ? rTCVideo2.createRTCRoom(this.mRtcRoomId) : null;
            this.mRtcRoom = rTCRoomCreateRTCRoom;
            if (rTCRoomCreateRTCRoom != null) {
                RTCRoomConfig rTCRoomConfig = new RTCRoomConfig(ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING, false, true, true);
                UserInfo userInfo = new UserInfo(this.mRtcUserId, "");
                RTCRoom rTCRoom = this.mRtcRoom;
                if (rTCRoom != null) {
                    rTCRoom.joinRoom(this.mRtcTooken, userInfo, rTCRoomConfig);
                }
            }
        }
        return this.mRtcVideo;
    }

    @Override // X.AbstractC1277570jLn
    public String getRtcRoomId() {
        return "";
    }

    @Override // X.AbstractC1277570jLn
    public boolean isAnchorNet() {
        return true;
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public final /* synthetic */ void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo) {
        C1277610jLr.LIZJ(this, lyraxAudioPropertiesInfo);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onConnectionStateChanged(LyraxConnectionState lyraxConnectionState) {
        C1277670jLx.LIZ(this, lyraxConnectionState);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onCreateRoomStateChanged(String str, LyraxErrorCode lyraxErrorCode) {
        C1277670jLx.LIZIZ(this, str, lyraxErrorCode);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onDisposed() {
        C1277670jLx.LIZJ(this);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onExtensionAccessError(String str, String str2) {
        C1277670jLx.LIZLLL(this, str, str2);
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public final /* synthetic */ void onFirstAudioFrameCaptured() {
        C1277610jLr.LJ(this);
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public final /* synthetic */ void onHardwareROISupportStateUpdated(boolean z) {
        C1277610jLr.LJFF(this, z);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onInitializedEngineEGL(GLESVersion gLESVersion) {
        C1277670jLx.LJ(this, gLESVersion);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onNativeLibraryLoadInfo(LyraxNativeLibraryLoadStatus lyraxNativeLibraryLoadStatus, String str) {
        C1277670jLx.LJI(this, lyraxNativeLibraryLoadStatus, str);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onNetworkTypeChanged(LyraxNetworkType lyraxNetworkType) {
        C1277670jLx.LJII(this, lyraxNetworkType);
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public final /* synthetic */ void onSysStats(LyraxSysStats lyraxSysStats) {
        C1277670jLx.LJIIIIZZ(this, lyraxSysStats);
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public final /* synthetic */ void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
        C1277610jLr.LJIIJ(this, lyraxVideoFrameInfo);
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public final /* synthetic */ void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
        C1277610jLr.LJIILIIL(this, lyraxVideoFrameInfo);
    }

    @Override // X.AbstractC1277570jLn
    public void startAudioCapture() {
    }

    @Override // X.AbstractC1277570jLn
    public void startVideoCapture() {
    }

    @Override // X.AbstractC1277570jLn
    public void stopAudioCapture() {
    }

    @Override // X.AbstractC1277570jLn
    public void stopVideoCapture() {
    }

    private final void addInternalSei() {
        sendSeiMessage("source", "TTLiveSDK_Android", -1, true, false);
    }

    private final void destroyGLManager() {
        AVLog.iow(this.tag, "GLThreadManager dispose. The singleton shall be destroyed if this is the last VeLivePusher instance.");
        GLThreadManager.LIZJ();
        AVLog.iow(this.tag, "GLThreadManager dispose done");
    }

    public final void destroyRTCRoomAndRTCVideo() {
        if (this.liveSdkSetting.mPushBase.isNoRoomJoinRoomOnce) {
            AVLog.ioi("VeLivePusherImpV3", "destroyRTCRoomAndRTCVideo");
            RTCRoom rTCRoom = this.mRtcRoom;
            if (rTCRoom != null) {
                rTCRoom.leaveRoom();
                rTCRoom.destroy();
            }
            if (this.mRtcVideo != null) {
                RTCVideo.destroyRTCVideoV2();
            }
            this.mRtcRoom = null;
            this.mRtcVideo = null;
        }
    }

    @Override // X.AbstractC1277570jLn
    public void doStopPush() throws JSONException {
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null) {
            iLyraxPublisher.unpublish();
        }
        destroyRTCRoomAndRTCVideo();
        reportPusherDebugLog("unpublish_in_stop_push");
    }

    @Override // X.AbstractC1277570jLn
    public ASRWordMuting getAsrWordsMuting() {
        return this.config.LJI.mPushBase.asrWordMuting;
    }

    @Override // X.AbstractC1277570jLn
    public EnumC1277890jMJ getSessionVersion() {
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        return (iLyraxPublisher != null ? iLyraxPublisher.getStreamProtocol() : null) == LyraxStreamProtocol.RTMP ? EnumC1277890jMJ.LiveStreamSession_V4 : EnumC1277890jMJ.LiveStreamSession_V3;
    }

    @Override // X.AbstractC1277570jLn
    public boolean isPushing() {
        return this.mPublisher != null;
    }

    @Override // X.AbstractC1277570jLn
    public EnumC1277950jMP resetLiveVideoPerformanceConfig() {
        List<LyraxVideoEncoderProfile> list;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile;
        int i;
        List<LyraxVideoEncoderProfile> list2;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile2;
        LyraxVideoEncoderConfig lyraxVideoEncoderConfig = this.mRtcVideoConfig;
        if (lyraxVideoEncoderConfig != null && (list = lyraxVideoEncoderConfig.encoderProfiles) != null && (lyraxVideoEncoderProfile = (LyraxVideoEncoderProfile) C13LP.LJJJJZI(list)) != null && ((i = this.mInitWidth) != lyraxVideoEncoderProfile.width || this.mInitHeight != lyraxVideoEncoderProfile.height)) {
            int i2 = this.mInitHeight;
            LyraxVideoEncoderConfig lyraxVideoEncoderConfig2 = this.mRtcVideoConfig;
            updateGearParams(i, i2, (lyraxVideoEncoderConfig2 == null || (list2 = lyraxVideoEncoderConfig2.encoderProfiles) == null || (lyraxVideoEncoderProfile2 = (LyraxVideoEncoderProfile) C13LP.LJJJJZI(list2)) == null) ? 0 : lyraxVideoEncoderProfile2.frameRate);
        }
        return EnumC1277950jMP.Success;
    }

    @Override // X.AbstractC1277570jLn
    public void release() throws JSONException {
        super.release();
        reportPusherDebugLog("pusher_v3_release");
        destroyRTCRoomAndRTCVideo();
        if (this.mPlatformVideoSourceWrapper != null) {
            ILyraxEngine iLyraxEngine = this.mEngine;
            if (iLyraxEngine != null) {
                iLyraxEngine.unbindVideoPlatformWrapper();
            }
            this.mPlatformVideoSourceWrapper = null;
        }
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null) {
            if (this.liveSdkSetting.mPushBase.LJIIL) {
                iLyraxPublisher.unpublish();
                reportPusherDebugLog("unpublish_in_release");
            }
            iLyraxPublisher.dispose();
            reportPusherDebugLog("dispose_in_release");
        }
        ILyraxEngine iLyraxEngine2 = this.mEngine;
        if (iLyraxEngine2 != null) {
            iLyraxEngine2.dispose();
        }
        this.mEngine = null;
        this.mPublisher = null;
        this.mCachedFeatures = null;
        this.mHasCachedFeatures = false;
        destroyGLManager();
    }

    @Override // X.AbstractC1277570jLn
    public LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels() {
        return this.mDegradeLevels;
    }

    @Override // X.AbstractC1277570jLn
    public String getRtcTaskId() {
        return this.mRtcTaskId;
    }

    @Override // X.AbstractC1277570jLn
    public List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable() {
        return this.mGears;
    }

    public VeLivePusherImpV3(C1277590jLp c1277590jLp) {
        LyraxVideoCodecType lyraxVideoCodecType;
        LyraxAudioAACCodecProfile lyraxAudioAACCodecProfile;
        super(c1277590jLp);
        this.tag = "VeLivePusherImpV3";
        this.mUserMetadata = new JSONObject();
        c1277590jLp.LJI.switchParams.getClass();
        this.mTextureMatrixCache = new C1277630jLt();
        this.mUrl = "";
        this.mStatistics = new C1279020jO8();
        this.liveSdkSetting = c1277590jLp.LJI;
        this.distinctChecker = new C1215200hjC<>(AFwS304S0000000_20.get$arr$(3));
        this.mRtcPublisherConfig = new LyraxPublisherConfig();
        this.mRtcAudioConfig = new LyraxAudioEncoderConfig();
        this.mNetworkQuality = EnumC1278980jO4.Unknown;
        this.mNetworkQualityV3Raw = LyraxNetworkQuality.UNKNOWN.value();
        this.mRtcTaskId = "";
        this.mLevelChangeNotifier = new C1277910jML();
        this.mLowLatencyStreamId = "";
        this.mLowLatencyStreamToken = "";
        this.mEnableAudioEncodeConfigMigration = c1277590jLp.LJIILL;
        this.mRtcRoomId = "";
        this.mRtcUserId = "";
        this.mRtcTooken = "";
        this.mGears = C13BV.INSTANCE;
        this.statsObserver = c1277590jLp.LJ;
        initLogFile(c1277590jLp.LIZ);
        try {
            C189200o6.m2constructorimpl(this.mUserMetadata.put("Encoder", c1277590jLp.LJIIJ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        PushBase pushBase = c1277590jLp.LJI.mPushBase;
        LyraxVideoEncoderMode lyraxVideoEncoderMode = pushBase.simChannelNumber > 1 ? LyraxVideoEncoderMode.SIMULCAST : LyraxVideoEncoderMode.SINGLE;
        initLowLatency(pushBase);
        ArrayList arrayList = new ArrayList();
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile = new LyraxVideoEncoderProfile();
        String str = c1277590jLp.LIZJ;
        if (str != null && str.length() != 0) {
            lyraxVideoEncoderProfile.width = pushBase.width;
            lyraxVideoEncoderProfile.height = pushBase.height;
            lyraxVideoEncoderProfile.frameRate = pushBase.fps;
            lyraxVideoEncoderProfile.minBitrate = pushBase.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            lyraxVideoEncoderProfile.maxBitrate = pushBase.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
            if (pushBase.enableBFrame) {
                lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.ENABLE;
            } else {
                lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.DISABLE;
            }
            if (pushBase.enableOverrideDegradePaths) {
                String str2 = this.liveSdkSetting.gearIdentifier;
                n nVar = pushBase.perfDegradePaths;
                n nVar2 = pushBase.netDegradePaths;
                LyraxVideoDegradeLevelsBuilder lyraxVideoDegradeLevelsBuilder = new LyraxVideoDegradeLevelsBuilder();
                lyraxVideoDegradeLevelsBuilder.setPerfDegradePaths(nVar);
                lyraxVideoDegradeLevelsBuilder.setNetDegradePaths(nVar2);
                lyraxVideoDegradeLevelsBuilder.setGearIdentifier(str2);
                lyraxVideoDegradeLevelsBuilder.setVideoParams(lyraxVideoEncoderProfile.width, lyraxVideoEncoderProfile.height, lyraxVideoEncoderProfile.frameRate);
                LyraxVideoEncoderProfile.VideoDegradeLevels videoDegradeLevelsBuild = lyraxVideoDegradeLevelsBuilder.build();
                lyraxVideoEncoderProfile.degradeLevels = videoDegradeLevelsBuild;
                this.mDegradeLevels = videoDegradeLevelsBuild;
            }
            if (pushBase.enablePresetResolutionBase) {
                List<ProbeSpeedGear> list = c1277590jLp.LJI.probeSpeedResolutions;
                ArrayList<ProbeSpeedGear> arrayList2 = new ArrayList();
                for (ProbeSpeedGear probeSpeedGear : list) {
                    if (probeSpeedGear.LIZ()) {
                        arrayList2.add(probeSpeedGear);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (ProbeSpeedGear probeSpeedGear2 : arrayList2) {
                    arrayList3.add(new LyraxVideoBitrateGearTableItem(probeSpeedGear2.width, probeSpeedGear2.height, probeSpeedGear2.fps, probeSpeedGear2.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT, probeSpeedGear2.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT));
                }
                if (!arrayList3.isEmpty()) {
                    lyraxVideoEncoderProfile.resolutionBase = convertToResolutionBase(arrayList3);
                    this.mGears = arrayList3;
                }
            }
        } else {
            lyraxVideoEncoderProfile.width = 720;
            lyraxVideoEncoderProfile.height = 1280;
            lyraxVideoEncoderProfile.frameRate = 15;
            lyraxVideoEncoderProfile.minBitrate = 800;
            lyraxVideoEncoderProfile.maxBitrate = 2500;
            lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.DISABLE;
        }
        this.mInitWidth = lyraxVideoEncoderProfile.width;
        this.mInitHeight = lyraxVideoEncoderProfile.height;
        lyraxVideoEncoderProfile.gopSize = Integer.valueOf((int) pushBase.gopSec);
        if (pushBase.useHardwareEncode) {
            lyraxVideoEncoderProfile.codecMode = LyraxVideoCodecMode.HARDWARE;
            if (pushBase.enableHardEncBFrame > 0) {
                lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.ENABLE;
            } else {
                lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.DISABLE;
            }
        } else {
            lyraxVideoEncoderProfile.codecMode = LyraxVideoCodecMode.SOFTWARE;
        }
        if (this.mSupportLowLatency) {
            lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.DISABLE;
        }
        int i = C1278000jMU.LIZIZ[pushBase.LJJI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                lyraxVideoCodecType = LyraxVideoCodecType.BYTEVC1;
            } else {
                throw new C1954807lC();
            }
        } else {
            lyraxVideoCodecType = LyraxVideoCodecType.H264;
        }
        lyraxVideoEncoderProfile.codecType = lyraxVideoCodecType;
        lyraxVideoEncoderProfile.forceUserCodec = Boolean.TRUE;
        arrayList.add(lyraxVideoEncoderProfile);
        for (int i2 = pushBase.simChannelNumber - 1; i2 > 0; i2--) {
            LyraxVideoEncoderProfile lyraxVideoEncoderProfile2 = new LyraxVideoEncoderProfile();
            lyraxVideoEncoderProfile2.width = 16;
            lyraxVideoEncoderProfile2.height = 16;
            lyraxVideoEncoderProfile2.frameRate = pushBase.fps;
            lyraxVideoEncoderProfile2.maxBitrate = 0;
            lyraxVideoEncoderProfile2.minBitrate = 0;
            arrayList.add(lyraxVideoEncoderProfile2);
        }
        this.mRtcVideoConfig = new LyraxVideoEncoderConfig(lyraxVideoEncoderMode, arrayList);
        if (this.mSupportLowLatency) {
            LyraxAudioEncoderConfig lyraxAudioEncoderConfig = this.mRtcAudioConfig;
            lyraxAudioEncoderConfig.sampleRate = LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_48000;
            lyraxAudioEncoderConfig.channelNum = LyraxAudioChannel.STEREO;
            lyraxAudioEncoderConfig.bitrateKbps = 64;
            lyraxAudioEncoderConfig.codecType = LyraxAudioCodecType.OPUS;
            lyraxAudioEncoderConfig.userCodecPriority = true;
            return;
        }
        this.mRtcAudioConfig.sampleRate = LyraxAudioSampleRate.fromId(pushBase.anchorNetAudioEncSr);
        this.mRtcAudioConfig.channelNum = LyraxAudioChannel.fromId(pushBase.LJJIJLIJ.getChannel());
        LyraxAudioEncoderConfig lyraxAudioEncoderConfig2 = this.mRtcAudioConfig;
        lyraxAudioEncoderConfig2.bitrateKbps = pushBase.audioBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = C1278000jMU.LIZJ[pushBase.LJJIIZI.ordinal()];
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            throw new C1954807lC();
        }
        lyraxAudioEncoderConfig2.codecType = LyraxAudioCodecType.AAC;
        LyraxAudioEncoderConfig lyraxAudioEncoderConfig3 = this.mRtcAudioConfig;
        int i4 = C1278000jMU.LIZLLL[pushBase.LJJIJ.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    lyraxAudioAACCodecProfile = LyraxAudioAACCodecProfile.AACLC;
                } else {
                    throw new C1954807lC();
                }
            } else {
                lyraxAudioAACCodecProfile = LyraxAudioAACCodecProfile.AACHEV2;
            }
        } else {
            lyraxAudioAACCodecProfile = LyraxAudioAACCodecProfile.AACHEV1;
        }
        lyraxAudioEncoderConfig3.aacCodecProfile = lyraxAudioAACCodecProfile;
        LyraxAudioEncoderConfig lyraxAudioEncoderConfig4 = this.mRtcAudioConfig;
        lyraxAudioEncoderConfig4.aacEncType = pushBase.aacEncType;
        lyraxAudioEncoderConfig4.aacBitrateMode = pushBase.aacBitrateMode;
        lyraxAudioEncoderConfig4.aacPerfOptLevel = pushBase.aacPerfOptLevel;
        lyraxAudioEncoderConfig4.userCodecPriority = true;
    }

    private final List<LyraxVideoResolutionConfig> convertToResolutionBase(List<? extends LyraxVideoBitrateGearTableItem> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (LyraxVideoBitrateGearTableItem lyraxVideoBitrateGearTableItem : list) {
                LyraxVideoResolutionConfig lyraxVideoResolutionConfig = new LyraxVideoResolutionConfig();
                lyraxVideoResolutionConfig.width = lyraxVideoBitrateGearTableItem.width;
                lyraxVideoResolutionConfig.height = lyraxVideoBitrateGearTableItem.height;
                lyraxVideoResolutionConfig.framerate = lyraxVideoBitrateGearTableItem.frameRate;
                lyraxVideoResolutionConfig.maxKbps = lyraxVideoBitrateGearTableItem.maxBitrate;
                lyraxVideoResolutionConfig.minKbps = lyraxVideoBitrateGearTableItem.minBitrate;
                arrayList.add(lyraxVideoResolutionConfig);
            }
            return arrayList;
        }
        return null;
    }

    private final String getNodeProbeIpWithUrl(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("host", C1278890jNv.LIZIZ(str));
            jSONObject.put("stream_session_vv_id", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Iterator<Map.Entry<String, List<PushStreamData.NodeInfo>>> it2 = this.config.LJII.nodeInfoMap.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                Map.Entry<String, List<PushStreamData.NodeInfo>> next = it2.next();
                String key = next.getKey();
                List<PushStreamData.NodeInfo> value = next.getValue();
                if (a0.LJJIIZI(str, key, false) && value != null && !value.isEmpty()) {
                    str2 = ((PushStreamData.NodeInfo) ListProtector.get(value, 0)).ip;
                    break;
                }
            } else {
                str2 = null;
                break;
            }
        }
        if (str2 != null && C1278890jNv.LIZLLL(str2)) {
            return C1278890jNv.LIZJ(str2);
        }
        return str2;
    }

    private final String getStreamIdFromUrl(String str) {
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcRoomId");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        this.mRtcRoomId = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcUserId");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        this.mRtcUserId = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcToken");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
        }
        this.mRtcTooken = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rtcStreamId");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
            return "";
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
    }

    private final void initLogFile(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDK7.22.0.93900/releasenative:");
        AbstractC1277570jLn.Companion.getClass();
        sbLIZ.append("7.22.0.93900");
        AVLog.ioi("VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Android OS:");
        sbLIZ2.append(Build.VERSION.SDK_INT);
        sbLIZ2.append('(');
        sbLIZ2.append(Build.VERSION.RELEASE);
        sbLIZ2.append(')');
        AVLog.ioi("VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("DevicesName: ");
        sbLIZ3.append(Build.MODEL);
        AVLog.ioi("VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ3));
        AVLog.disableLogFile(true);
    }

    private final void initLowLatency(PushBase pushBase) {
        n nVar;
        String str;
        if (pushBase.supportLowLatency && (nVar = pushBase.rtpTokenMap) != null) {
            Iterator<String> it2 = nVar.LJJIJIL().iterator();
            if (it2.hasNext()) {
                String next = it2.next();
                this.mLowLatencyStreamId = next;
                this.mLowLatencyStreamToken = nVar.LJJIIZ(next).LJIL();
            }
            String str2 = this.mLowLatencyStreamId;
            if (str2 != null && str2.length() != 0 && (str = this.mLowLatencyStreamToken) != null && str.length() != 0 && u.LJIIZILJ(this.mLowLatencyStreamId, "_vt", false)) {
                this.mSupportLowLatency = true;
            }
        }
    }

    private final int pPushExternalVideoFrameOld(C1277560jLm c1277560jLm) {
        LyraxVideoPixelFormat lyraxVideoPixelFormat;
        boolean z = this.liveSdkSetting.switchParams.LIZIZ;
        EnumC1277900jMK enumC1277900jMK = c1277560jLm.LIZ;
        boolean z2 = true;
        if (enumC1277900jMK == EnumC1277900jMK.Texture) {
            if (c1277560jLm.LIZIZ != EnumC1277710jM1.TextureOes) {
                z2 = false;
            }
            if (z2) {
                lyraxVideoPixelFormat = LyraxVideoPixelFormat.TEXTURE_OES;
            } else {
                lyraxVideoPixelFormat = LyraxVideoPixelFormat.TEXTURE_2D;
            }
            LyraxVideoGLTextureFrameBuilder lyraxVideoGLTextureFrameBuilder = new LyraxVideoGLTextureFrameBuilder(lyraxVideoPixelFormat);
            lyraxVideoGLTextureFrameBuilder.setRotation(LyraxVideoRotation.VIDEO_ROTATION_0);
            lyraxVideoGLTextureFrameBuilder.setTextureMatrix(this.mTextureMatrixCache.LIZ(c1277560jLm));
            lyraxVideoGLTextureFrameBuilder.setTextureID(c1277560jLm.LJIIIIZZ);
            AbstractC1277570jLn.Companion.getClass();
            lyraxVideoGLTextureFrameBuilder.setEGLContext(GLThreadManager.LJFF());
            lyraxVideoGLTextureFrameBuilder.setWidth(c1277560jLm.LIZLLL);
            lyraxVideoGLTextureFrameBuilder.setHeight(c1277560jLm.LJ);
            lyraxVideoGLTextureFrameBuilder.setTimeStampUs(c1277560jLm.LJFF);
            lyraxVideoGLTextureFrameBuilder.setGLSync(c1277560jLm.LJIIIZ);
            lyraxVideoGLTextureFrameBuilder.setOriginalCaptureTimestampMs(c1277560jLm.LJI);
            lyraxVideoGLTextureFrameBuilder.setOriginalEffectTimestampMs(c1277560jLm.LJII);
            if (z) {
                c1277560jLm.LIZLLL();
                lyraxVideoGLTextureFrameBuilder.setReleaseCallback(new ARunnableS120S0100000_20(c1277560jLm, 341));
            } else {
                lyraxVideoGLTextureFrameBuilder.setReleaseCallback(c1277560jLm.LJIILIIL);
            }
            LyraxVideoFrame lyraxVideoFrameBuild = lyraxVideoGLTextureFrameBuilder.build();
            ILyraxPublisher iLyraxPublisher = this.mPublisher;
            if (iLyraxPublisher != null) {
                iLyraxPublisher.pushVideoFrame(lyraxVideoFrameBuild);
            }
            lyraxVideoFrameBuild.release();
        } else if (enumC1277900jMK == EnumC1277900jMK.ByteBuffer || enumC1277900jMK == EnumC1277900jMK.ByteArray) {
            LyraxVideoCPUBufferFrameBuilder lyraxVideoCPUBufferFrameBuilder = new LyraxVideoCPUBufferFrameBuilder(LyraxVideoPixelFormat.I420);
            AbstractC1278120jMg abstractC1278120jMg = (AbstractC1278120jMg) c1277560jLm;
            lyraxVideoCPUBufferFrameBuilder.setRotation(LyraxVideoRotation.fromId(abstractC1278120jMg.LIZJ.getDegree()));
            lyraxVideoCPUBufferFrameBuilder.setPlaneData(0, abstractC1278120jMg.LJI());
            lyraxVideoCPUBufferFrameBuilder.setPlaneStride(0, abstractC1278120jMg.LIZLLL);
            lyraxVideoCPUBufferFrameBuilder.setPlaneData(1, abstractC1278120jMg.LJ());
            lyraxVideoCPUBufferFrameBuilder.setPlaneStride(1, abstractC1278120jMg.LIZLLL / 2);
            lyraxVideoCPUBufferFrameBuilder.setPlaneData(2, abstractC1278120jMg.LJFF());
            lyraxVideoCPUBufferFrameBuilder.setPlaneStride(2, abstractC1278120jMg.LIZLLL / 2);
            lyraxVideoCPUBufferFrameBuilder.setWidth(abstractC1278120jMg.LIZLLL);
            lyraxVideoCPUBufferFrameBuilder.setHeight(abstractC1278120jMg.LJ);
            lyraxVideoCPUBufferFrameBuilder.setTimeStampUs(abstractC1278120jMg.LJFF);
            lyraxVideoCPUBufferFrameBuilder.setOriginalCaptureTimestampMs(abstractC1278120jMg.LJI);
            lyraxVideoCPUBufferFrameBuilder.setOriginalEffectTimestampMs(abstractC1278120jMg.LJII);
            if (z) {
                c1277560jLm.LIZLLL();
                lyraxVideoCPUBufferFrameBuilder.setReleaseCallback(new ARunnableS120S0100000_20(c1277560jLm, 342));
            } else {
                lyraxVideoCPUBufferFrameBuilder.setReleaseCallback(abstractC1278120jMg.LJIILIIL);
            }
            LyraxVideoFrame lyraxVideoFrameBuild2 = lyraxVideoCPUBufferFrameBuilder.build();
            ILyraxPublisher iLyraxPublisher2 = this.mPublisher;
            if (iLyraxPublisher2 != null) {
                iLyraxPublisher2.pushVideoFrame(lyraxVideoFrameBuild2);
            }
            lyraxVideoFrameBuild2.release();
            return 0;
        }
        return 0;
    }

    private final void reportLog(JSONObject jSONObject) {
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObject);
        }
    }

    private final void reportPusherDebugLog(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "push_debug_log").put("api", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pusher -> ");
        sbLIZ.append(this);
        JSONObject jSONObjectPut2 = jSONObjectPut.put("pusher", C2188811AlT.LIZIZ(sbLIZ)).put("isNoRoomJoinRoomOnce", this.liveSdkSetting.mPushBase.isNoRoomJoinRoomOnce);
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut2);
        }
    }

    @Override // X.AbstractC1277570jLn
    public void bindToRoom(String str) {
        ILyraxRoom iLyraxRoomCreateRoom;
        LyraxRoomOption lyraxRoomOption = new LyraxRoomOption();
        lyraxRoomOption.roomId = str;
        ILyraxEngine iLyraxEngine = this.mEngine;
        if (iLyraxEngine != null && (iLyraxRoomCreateRoom = iLyraxEngine.createRoom(lyraxRoomOption)) != null) {
            iLyraxRoomCreateRoom.addPublisher(this.mPublisher);
        }
    }

    @Override // X.AbstractC1277570jLn
    public int doPushExternalVideoFrame(C1277560jLm c1277560jLm) {
        if (this.mEngine == null) {
            return -1;
        }
        if (c1277560jLm.LIZ == EnumC1277900jMK.Texture) {
            AbstractC1277570jLn.Companion.getClass();
            if (GLThreadManager.LJFF() == null) {
                return -1;
            }
        }
        return pPushExternalVideoFrameOld(c1277560jLm);
    }

    @Override // X.AbstractC1277570jLn
    public int enableCalculateAudioLoudness(boolean z) {
        this.mEnableCalculateLoudness = z;
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null) {
            iLyraxPublisher.enableCalculateAudioLoudness(z);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public void onAudioLocalStateChanged(LyraxAudioLocalState lyraxAudioLocalState) {
        C1278510jNJ c1278510jNJ;
        if (lyraxAudioLocalState != null) {
            int i = C1277640jLu.LIZIZ[lyraxAudioLocalState.ordinal()];
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
            if (LyraxAudioLocalState.FIRST_FRAME_ENCODED == lyraxAudioLocalState) {
                reportAudioFirstFramePreEncode();
            }
            InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
            if (interfaceC1277660jLw != null) {
                interfaceC1277660jLw.LIZIZ(c1278510jNJ);
            }
            reportFirstFrameEvents(c1278510jNJ);
        }
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public void onAudioProfanityDetectedCallback(String str) {
        C1277610jLr.LIZIZ(this, str);
        InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
        if (interfaceC1277660jLw != null) {
            interfaceC1277660jLw.onAudioProfanityDetectedCallback(str);
        }
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
        if (interfaceC1277660jLw != null) {
            interfaceC1277660jLw.onFeatureEvent(lyraxTranscoderFeatureEvent);
        }
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
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
                if (this.config.LJI.mPushBase.LJJJJZI) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("real_bitrate", this.mStatistics.LJI);
                    jSONObject2.put("real_video_framerate", this.mStatistics.LIZJ);
                    sendSeiMessageInternal(C786410Ut5.J3(jSONObject2), 1, true, false);
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
            AVLog.logToIODevice(6, "VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNetworkQuality(com.ss.lyrax.stream.LyraxNetworkQualityStats r3) {
        /*
            r2 = this;
            X.0jLp r0 = r2.config
            com.ss.pusher.core.params.LiveSdkSetting r0 = r0.LJI
            com.ss.pusher.core.params.PushBase r0 = r0.mPushBase
            boolean r0 = r0.enableLyraxNetworkQualityOptV3
            if (r0 == 0) goto L22
            com.ss.lyrax.net.LyraxNetworkQuality r0 = r3.txQuality
            if (r0 != 0) goto L10
            com.ss.lyrax.net.LyraxNetworkQuality r0 = com.ss.lyrax.net.LyraxNetworkQuality.UNKNOWN
        L10:
            int r1 = r0.value()
            int r0 = r2.mNetworkQualityV3Raw
            if (r1 == r0) goto L21
            r2.mNetworkQualityV3Raw = r1
            X.0jLw r0 = r2.mObserver
            if (r0 == 0) goto L21
            r0.LIZ(r1)
        L21:
            return
        L22:
            com.ss.lyrax.net.LyraxNetworkQuality r0 = r3.txQuality
            if (r0 == 0) goto L31
            int[] r1 = X.C1278000jMU.LJII
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L47;
                case 2: goto L47;
                case 3: goto L44;
                case 4: goto L44;
                case 5: goto L41;
                case 6: goto L41;
                default: goto L31;
            }
        L31:
            X.0jO4 r1 = X.EnumC1278980jO4.Unknown
        L33:
            X.0jO4 r0 = r2.mNetworkQuality
            if (r1 == r0) goto L21
            r2.mNetworkQuality = r1
            X.0jLw r0 = r2.mObserver
            if (r0 == 0) goto L21
            r0.LIZLLL(r1)
            return
        L41:
            X.0jO4 r1 = X.EnumC1278980jO4.Bad
            goto L33
        L44:
            X.0jO4 r1 = X.EnumC1278980jO4.Poor
            goto L33
        L47:
            X.0jO4 r1 = X.EnumC1278980jO4.Good
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.pusher.anet.VeLivePusherImpV3.onNetworkQuality(com.ss.lyrax.stream.LyraxNetworkQualityStats):void");
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public void onStreamProtocolChanged(LyraxStreamProtocol lyraxStreamProtocol) {
        EnumC1276060jJM enumC1276060jJM;
        InterfaceC1277660jLw interfaceC1277660jLw = this.mObserver;
        if (interfaceC1277660jLw != null) {
            int i = C1278000jMU.LJIIIIZZ[lyraxStreamProtocol.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    enumC1276060jJM = EnumC1276060jJM.Unknown;
                } else {
                    enumC1276060jJM = EnumC1276060jJM.RTP;
                }
            } else {
                enumC1276060jJM = EnumC1276060jJM.RTMP;
            }
            interfaceC1277660jLw.LJ(enumC1276060jJM);
        }
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public void onVideoLocalStateChanged(LyraxVideoLocalState lyraxVideoLocalState) {
        C1278510jNJ c1278510jNJ;
        if (lyraxVideoLocalState != null) {
            int i = C1277640jLu.LIZJ[lyraxVideoLocalState.ordinal()];
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

    @Override // X.AbstractC1277570jLn
    public void setFeaturesConfig(List<? extends LyraxTranscoderFeature> list) {
        ArrayList arrayList = null;
        if (this.mPublisher != null) {
            if (list != null) {
                arrayList = new ArrayList(list);
            }
            LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig = new LyraxTranscoderFeaturesConfig(arrayList);
            ILyraxPublisher iLyraxPublisher = this.mPublisher;
            if (iLyraxPublisher != null) {
                iLyraxPublisher.setFeaturesConfig(lyraxTranscoderFeaturesConfig);
                return;
            }
            return;
        }
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        this.mCachedFeatures = arrayList;
        this.mHasCachedFeatures = true;
    }

    @Override // X.AbstractC1277570jLn
    public void setObserver(InterfaceC1277660jLw interfaceC1277660jLw) {
        this.mObserver = interfaceC1277660jLw;
    }

    @Override // X.AbstractC1277570jLn
    public int setProperty(InterfaceC1277930jMN interfaceC1277930jMN) {
        List<LyraxVideoEncoderProfile> list;
        List<LyraxVideoEncoderProfile> list2;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile2;
        List<LyraxVideoEncoderProfile> list3;
        int i;
        List<LyraxVideoEncoderProfile> list4;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile3;
        if (!interfaceC1277930jMN.isValid()) {
            return -100;
        }
        Object objValueOf = null;
        if (interfaceC1277930jMN instanceof C1278210jMp) {
            handleUserMetadata((C1278210jMp) interfaceC1277930jMN);
            try {
                this.mUserMetadata.put(((C1278210jMp) interfaceC1277930jMN).LIZ, ((C1278210jMp) interfaceC1277930jMN).LIZIZ);
                this.mRtcPublisherConfig.metaData = C786410Ut5.J3(this.mUserMetadata);
                ILyraxPublisher iLyraxPublisher = this.mPublisher;
                if (iLyraxPublisher != null) {
                    objValueOf = iLyraxPublisher.setPublisherConfig(this.mRtcPublisherConfig);
                }
                C189200o6.m2constructorimpl(objValueOf);
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return 0;
            }
        }
        if (interfaceC1277930jMN instanceof C1268990j7x) {
            ILyraxPublisher iLyraxPublisher2 = this.mPublisher;
            if (iLyraxPublisher2 != null) {
                iLyraxPublisher2.setCurrentShiftDiffTimeSEIV2(((C1268990j7x) interfaceC1277930jMN).LIZ);
            }
            this.enableNTPTiming = true;
        } else {
            if (interfaceC1277930jMN instanceof C1278540jNM) {
                if (isPushing()) {
                    AVLog.w("VeLivePusherImpV3", "Cannot set output image size when pushing");
                    return -1;
                }
                C1278540jNM c1278540jNM = (C1278540jNM) interfaceC1277930jMN;
                int i2 = c1278540jNM.LIZ;
                this.mInitWidth = i2;
                int i3 = c1278540jNM.LIZIZ;
                this.mInitHeight = i3;
                LyraxVideoEncoderConfig lyraxVideoEncoderConfig = this.mRtcVideoConfig;
                if (lyraxVideoEncoderConfig != null && (list4 = lyraxVideoEncoderConfig.encoderProfiles) != null && (lyraxVideoEncoderProfile3 = (LyraxVideoEncoderProfile) C13LP.LJJJJZI(list4)) != null) {
                    i = lyraxVideoEncoderProfile3.frameRate;
                } else {
                    i = 0;
                }
                updateGearParams(i2, i3, i);
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
                LyraxVideoEncoderConfig lyraxVideoEncoderConfig2 = this.mRtcVideoConfig;
                if (lyraxVideoEncoderConfig2 != null && (list3 = lyraxVideoEncoderConfig2.encoderProfiles) != null) {
                    lyraxVideoEncoderProfile2 = (LyraxVideoEncoderProfile) C13LP.LJJJJZI(list3);
                } else {
                    lyraxVideoEncoderProfile2 = null;
                }
                if (lyraxVideoEncoderProfile2 != null) {
                    lyraxVideoEncoderProfile2.minBitrate = ((C1270090j9j) interfaceC1277930jMN).LIZ / LSPassThroughRecordSizeConfig.DEFAULT;
                    lyraxVideoEncoderProfile2.maxBitrate = ((C1270090j9j) interfaceC1277930jMN).LIZJ / LSPassThroughRecordSizeConfig.DEFAULT;
                }
                ILyraxPublisher iLyraxPublisher3 = this.mPublisher;
                if (iLyraxPublisher3 != null) {
                    iLyraxPublisher3.setVideoEncoderConfig(this.mRtcVideoConfig);
                }
                String str = this.tag;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set ");
                sbLIZ.append(interfaceC1277930jMN);
                AVLog.logKibana(4, str, C2188811AlT.LIZIZ(sbLIZ), null);
                return 0;
            }
            if (interfaceC1277930jMN instanceof C1269290j8R) {
                if (isPushing()) {
                    return -1;
                }
                this.liveSdkSetting.mPushBase.fps = ((C1269290j8R) interfaceC1277930jMN).LIZ;
                String str2 = this.tag;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set ");
                sbLIZ2.append(interfaceC1277930jMN);
                AVLog.logKibana(4, str2, C2188811AlT.LIZIZ(sbLIZ2), null);
                return 0;
            }
            if (interfaceC1277930jMN instanceof C1936807iI) {
                if (isPushing()) {
                    return -1;
                }
                PushBase pushBase = this.liveSdkSetting.mPushBase;
                C1936807iI c1936807iI = (C1936807iI) interfaceC1277930jMN;
                pushBase.supportLowLatency = c1936807iI.LIZ;
                pushBase.rtpTokenMap = c1936807iI.LIZIZ;
                initLowLatency(pushBase);
                if (this.mSupportLowLatency) {
                    LyraxVideoEncoderConfig lyraxVideoEncoderConfig3 = this.mRtcVideoConfig;
                    if (lyraxVideoEncoderConfig3 != null && (list2 = lyraxVideoEncoderConfig3.encoderProfiles) != null && (lyraxVideoEncoderProfile = (LyraxVideoEncoderProfile) C13LP.LJJJLL(list2)) != null) {
                        lyraxVideoEncoderProfile.enbleBframe = LyraxVideoEnableBFrame.DISABLE;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("setProperty mSupportLowLatency, mRtcVideoConfig?.encoderProfiles.size=");
                    LyraxVideoEncoderConfig lyraxVideoEncoderConfig4 = this.mRtcVideoConfig;
                    if (lyraxVideoEncoderConfig4 != null && (list = lyraxVideoEncoderConfig4.encoderProfiles) != null) {
                        objValueOf = Integer.valueOf(list.size());
                    }
                    sbLIZ3.append(objValueOf);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    LyraxAudioEncoderConfig lyraxAudioEncoderConfig = this.mRtcAudioConfig;
                    lyraxAudioEncoderConfig.sampleRate = LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_48000;
                    lyraxAudioEncoderConfig.channelNum = LyraxAudioChannel.STEREO;
                    lyraxAudioEncoderConfig.bitrateKbps = 64;
                    lyraxAudioEncoderConfig.codecType = LyraxAudioCodecType.OPUS;
                    lyraxAudioEncoderConfig.userCodecPriority = true;
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override // X.AbstractC1277570jLn
    public void setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        String str = "null";
        if (this.mPlatformVideoSourceWrapper == iLyraxVideoPlatformWrapper) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip duplicate setVideoSource wrapper=");
            sbLIZ.append(iLyraxVideoPlatformWrapper);
            sbLIZ.append(", publisher=");
            if (this.mPublisher != null) {
                str = "non-null";
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.mPlatformVideoSourceWrapper = iLyraxVideoPlatformWrapper;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setVideoSource wrapper=");
        sbLIZ2.append(iLyraxVideoPlatformWrapper);
        sbLIZ2.append(", publisher=");
        if (this.mPublisher != null) {
            str = "non-null";
        }
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (iLyraxVideoPlatformWrapper != null) {
            ILyraxEngine iLyraxEngine = this.mEngine;
            if (iLyraxEngine != null) {
                iLyraxEngine.bindVideoPlatformWrapper(iLyraxVideoPlatformWrapper);
                return;
            }
            return;
        }
        ILyraxEngine iLyraxEngine2 = this.mEngine;
        if (iLyraxEngine2 == null) {
            return;
        }
        iLyraxEngine2.unbindVideoPlatformWrapper();
    }

    @Override // X.AbstractC1277570jLn
    public void setVideoStrategyRunner(Object obj) {
        final IVideoStrategyRunner iVideoStrategyRunner;
        if ((obj instanceof IVideoStrategyRunner) && (iVideoStrategyRunner = (IVideoStrategyRunner) obj) != null) {
            ILyraxEngine iLyraxEngine = this.mEngine;
            if (iLyraxEngine == null) {
                this.mVideoStrategyRunner = iVideoStrategyRunner;
            } else {
                iLyraxEngine.setVideoStrategyRunner(new ILyraxVideoStrategyRunner(iVideoStrategyRunner) { // from class: X.0jVo
                    public final IVideoStrategyRunner LIZ;

                    @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
                    public final boolean isActive() {
                        IVideoStrategyRunner iVideoStrategyRunner2 = this.LIZ;
                        if (iVideoStrategyRunner2 == null) {
                            return false;
                        }
                        return iVideoStrategyRunner2.isActive();
                    }

                    {
                        this.LIZ = iVideoStrategyRunner;
                    }

                    @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
                    public final void setResultListener(final LyraxVideoStrategyResultListener lyraxVideoStrategyResultListener) {
                        IVideoStrategyRunner iVideoStrategyRunner2 = this.LIZ;
                        if (iVideoStrategyRunner2 != null) {
                            iVideoStrategyRunner2.setResultListener(new IVideoStrategyResultListener(lyraxVideoStrategyResultListener) { // from class: X.0jVp
                                public final LyraxVideoStrategyResultListener LIZ;

                                {
                                    this.LIZ = lyraxVideoStrategyResultListener;
                                }

                                @Override // com.ss.bytertc.engine.video.IVideoStrategyResultListener
                                public final void onVideoStrategyResult(VideoStrategyChannelResult[] videoStrategyChannelResultArr) {
                                    LyraxVideoStrategyChannelResult[] lyraxVideoStrategyChannelResultArr = new LyraxVideoStrategyChannelResult[videoStrategyChannelResultArr.length];
                                    int length = videoStrategyChannelResultArr.length;
                                    for (int i = 0; i < length; i++) {
                                        LyraxVideoStrategyChannelResult lyraxVideoStrategyChannelResult = new LyraxVideoStrategyChannelResult();
                                        VideoStrategyChannelResult videoStrategyChannelResult = videoStrategyChannelResultArr[i];
                                        lyraxVideoStrategyChannelResult.channelIndex = videoStrategyChannelResult.channelIndex;
                                        lyraxVideoStrategyChannelResult.perfWidth = videoStrategyChannelResult.perfWidth;
                                        lyraxVideoStrategyChannelResult.perfHeight = videoStrategyChannelResult.perfHeight;
                                        lyraxVideoStrategyChannelResult.perfFps = videoStrategyChannelResult.perfFps;
                                        lyraxVideoStrategyChannelResult.netWidth = videoStrategyChannelResult.netWidth;
                                        lyraxVideoStrategyChannelResult.netHeight = videoStrategyChannelResult.netHeight;
                                        lyraxVideoStrategyChannelResult.netFps = videoStrategyChannelResult.netFps;
                                        lyraxVideoStrategyChannelResult.finalWidth = videoStrategyChannelResult.finalWidth;
                                        lyraxVideoStrategyChannelResult.finalHeight = videoStrategyChannelResult.finalHeight;
                                        lyraxVideoStrategyChannelResult.finalFps = videoStrategyChannelResult.finalFps;
                                        lyraxVideoStrategyChannelResult.finalBps = videoStrategyChannelResult.finalBps;
                                        lyraxVideoStrategyChannelResult.maxBps = videoStrategyChannelResult.maxBps;
                                        lyraxVideoStrategyChannelResult.minBps = videoStrategyChannelResult.minBps;
                                        lyraxVideoStrategyChannelResult.minRequestBps = videoStrategyChannelResult.minRequestBps;
                                        lyraxVideoStrategyChannelResultArr[i] = lyraxVideoStrategyChannelResult;
                                    }
                                    this.LIZ.onVideoStrategyResult(lyraxVideoStrategyChannelResultArr);
                                }
                            });
                        }
                    }

                    @Override // com.ss.lyrax.engine.ILyraxVideoStrategyRunner
                    public final void updateFeatures(LyraxVideoStrategyParams lyraxVideoStrategyParams) {
                        VideoStrategyParams videoStrategyParams = new VideoStrategyParams();
                        videoStrategyParams.mediaTargetBps = lyraxVideoStrategyParams.getMediaTargetBps();
                        videoStrategyParams.sceneType = lyraxVideoStrategyParams.getSceneType();
                        videoStrategyParams.channelEncInfoTable = new VideoStrategyChannelParams[lyraxVideoStrategyParams.getChannelEncInfoTable().length];
                        int length = lyraxVideoStrategyParams.getChannelEncInfoTable().length;
                        for (int i = 0; i < length; i++) {
                            LyraxVideoStrategyChannelParams lyraxVideoStrategyChannelParams = lyraxVideoStrategyParams.getChannelEncInfoTable()[i];
                            VideoStrategyChannelParams videoStrategyChannelParams = new VideoStrategyChannelParams();
                            videoStrategyChannelParams.channelIndex = lyraxVideoStrategyChannelParams.channelIndex;
                            videoStrategyChannelParams.subscriberMaxDownlinkBps = lyraxVideoStrategyChannelParams.subscriberMaxDownlinkBps;
                            videoStrategyChannelParams.subscriberCount = lyraxVideoStrategyChannelParams.subscriberCount;
                            videoStrategyChannelParams.cfgMaxEncWidth = lyraxVideoStrategyChannelParams.cfgMaxEncWidth;
                            videoStrategyChannelParams.cfgMaxEncHeight = lyraxVideoStrategyChannelParams.cfgMaxEncHeight;
                            videoStrategyChannelParams.cfgMaxEncFps = lyraxVideoStrategyChannelParams.cfgMaxEncFps;
                            videoStrategyChannelParams.cfgMinEncBps = lyraxVideoStrategyChannelParams.cfgMinEncBps;
                            videoStrategyChannelParams.cfgMaxEncBps = lyraxVideoStrategyChannelParams.cfgMaxEncBps;
                            videoStrategyChannelParams.currentEncWidth = lyraxVideoStrategyChannelParams.currentEncWidth;
                            videoStrategyChannelParams.currentEncHeight = lyraxVideoStrategyChannelParams.currentEncHeight;
                            videoStrategyChannelParams.currentEncTargetFps = lyraxVideoStrategyChannelParams.currentEncTargetFps;
                            videoStrategyChannelParams.currentEncTargetBps = lyraxVideoStrategyChannelParams.currentEncTargetBps;
                            videoStrategyParams.channelEncInfoTable[i] = videoStrategyChannelParams;
                        }
                        IVideoStrategyRunner iVideoStrategyRunner2 = this.LIZ;
                        if (iVideoStrategyRunner2 != null) {
                            iVideoStrategyRunner2.updateFeatures(videoStrategyParams);
                        }
                    }
                });
            }
        }
    }

    @Override // X.AbstractC1277570jLn
    public void unbindFromRoom(String str) {
        ILyraxRoom iLyraxRoomCreateRoom;
        LyraxRoomOption lyraxRoomOption = new LyraxRoomOption();
        lyraxRoomOption.roomId = str;
        ILyraxEngine iLyraxEngine = this.mEngine;
        if (iLyraxEngine != null && (iLyraxRoomCreateRoom = iLyraxEngine.createRoom(lyraxRoomOption)) != null) {
            iLyraxRoomCreateRoom.removePublisher(this.mPublisher);
        }
    }

    @Override // X.AbstractC1277570jLn
    public int updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        LyraxErrorCode lyraxErrorCodeUpdateLyraxExternalStats;
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null) {
            lyraxErrorCodeUpdateLyraxExternalStats = iLyraxPublisher.updateLyraxExternalStats(lyraxPreProcessVideoNodeStats);
        } else {
            lyraxErrorCodeUpdateLyraxExternalStats = null;
        }
        if (lyraxErrorCodeUpdateLyraxExternalStats == LyraxErrorCode.SUCCESS) {
            return 0;
        }
        return -1;
    }

    private final void doStart(String[] strArr, boolean z) throws JSONException {
        boolean z2;
        String nodeProbeIpWithUrl;
        ILyraxEngine iLyraxEngine;
        ArrayList arrayList;
        ILyraxEngine iLyraxEngine2;
        boolean z3;
        LyraxLiveType lyraxLiveType;
        Object obj;
        String str;
        Object obj2;
        String str2;
        boolean zOptBoolean;
        boolean zOptBoolean2;
        int iOptInt;
        String strOptString;
        String strOptString2;
        String str3;
        String str4;
        String str5;
        JSONArray jSONArray;
        String string;
        String str6;
        String str7;
        if (this.mEngine == null) {
            C1277590jLp c1277590jLp = this.config;
            PushBase pushBase = c1277590jLp.LJI.mPushBase;
            if (c1277590jLp.LJIILJJIL == EnumC1152920g6k.VeLivePusherLiveType_Stage) {
                z3 = true;
            } else {
                z3 = false;
            }
            LyraxEngineOption lyraxEngineOption = new LyraxEngineOption();
            lyraxEngineOption.scene = LyraxScene.LIVE;
            lyraxEngineOption.inAnchorNet = true;
            C1277590jLp c1277590jLp2 = this.config;
            if (c1277590jLp2.LJIILIIL) {
                lyraxEngineOption.enableLocalLogCallback = true;
            }
            LyraxBusinessOption lyraxBusinessOption = lyraxEngineOption.businessOption;
            if (z3) {
                lyraxLiveType = LyraxLiveType.VIDEO;
            } else {
                lyraxLiveType = LyraxLiveType.GAME;
            }
            lyraxBusinessOption.liveType = lyraxLiveType;
            JSONObject jSONObject = c1277590jLp2.LJFF;
            if (jSONObject != null) {
                obj = jSONObject.get("rtc.ab_label");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            String str8 = "";
            if (str == null) {
                str = "";
            }
            lyraxBusinessOption.abLabel = str;
            LyraxBusinessOption lyraxBusinessOption2 = lyraxEngineOption.businessOption;
            C1277590jLp c1277590jLp3 = this.config;
            lyraxBusinessOption2.appId = c1277590jLp3.LJIIIIZZ;
            JSONObject jSONObject2 = c1277590jLp3.LJFF;
            if (jSONObject2 != null && (string = JSONObjectProtectorUtils.getString(jSONObject2, "rtc.common_extra_info")) != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject(string);
                    LyraxAppOption lyraxAppOption = lyraxEngineOption.appOption;
                    Object obj3 = jSONObject3.get("app_channel");
                    if (!(obj3 instanceof String) || (str6 = (String) obj3) == null) {
                        str6 = "";
                    }
                    lyraxAppOption.appChannel = str6;
                    LyraxAppOption lyraxAppOption2 = lyraxEngineOption.appOption;
                    Object obj4 = jSONObject3.get("app_version");
                    if (!(obj4 instanceof String) || (str7 = (String) obj4) == null) {
                        str7 = "";
                    }
                    lyraxAppOption2.appVersion = str7;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            JSONObject jSONObject4 = this.config.LJFF;
            if (jSONObject4 != null) {
                obj2 = jSONObject4.get("rtc.log_sdk_websocket_url");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                str2 = "";
            }
            lyraxEngineOption.logSdkWebsocketUrl = str2;
            JSONObject jSONObject5 = this.config.LJFF;
            if (jSONObject5 != null) {
                zOptBoolean = jSONObject5.optBoolean("rtc.enable_pre_get_config", false);
            } else {
                zOptBoolean = false;
            }
            lyraxEngineOption.enablePreGetConfig = zOptBoolean;
            JSONObject jSONObject6 = this.config.LJFF;
            if (jSONObject6 != null) {
                zOptBoolean2 = jSONObject6.optBoolean("rtc.enable_remove_scene_none", false);
            } else {
                zOptBoolean2 = false;
            }
            lyraxEngineOption.enableRemoveSceneNone = zOptBoolean2;
            JSONObject jSONObject7 = this.config.LJFF;
            if (jSONObject7 != null) {
                iOptInt = jSONObject7.optInt("rtc.video_strategy_active_scene", 0);
            } else {
                iOptInt = 0;
            }
            lyraxEngineOption.videoStrategyActiveScene = iOptInt;
            LyraxNetworkOption lyraxNetworkOption = lyraxEngineOption.networkOption;
            JSONObject jSONObject8 = this.config.LJFF;
            if (jSONObject8 == null || (strOptString = jSONObject8.optString("rtc.access_group_id", "")) == null) {
                strOptString = "";
            }
            lyraxNetworkOption.accessGroupId = strOptString;
            LyraxNetworkOption lyraxNetworkOption2 = lyraxEngineOption.networkOption;
            JSONObject jSONObject9 = this.config.LJFF;
            if (jSONObject9 == null || (strOptString2 = jSONObject9.optString("rtc.live_role", "")) == null) {
                strOptString2 = "";
            }
            lyraxNetworkOption2.liveRole = strOptString2;
            JSONObject jSONObject10 = this.config.LJFF;
            if (jSONObject10 != null && (jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject10, "access_hosts")) != null) {
                ArrayList<String> arrayList2 = new ArrayList<>();
                int length = jSONArray.length() - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        if (!jSONArray.isNull(i)) {
                            arrayList2.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                lyraxEngineOption.networkOption.accessHosts = arrayList2;
            }
            lyraxEngineOption.androidOption.context = this.config.LIZ;
            GLESVersion gLESVersionFromId = GLESVersion.GLES_VERSION_2;
            if (this.liveSdkSetting.mPushBase.LJJJJJ) {
                gLESVersionFromId = GLESVersion.fromId(C13LQ.LJIJJLI(GLThreadManager.LJI()));
            }
            LyraxAndroidOption lyraxAndroidOption = lyraxEngineOption.androidOption;
            lyraxAndroidOption.glesVersion = gLESVersionFromId;
            AbstractC1277570jLn.Companion.getClass();
            lyraxAndroidOption.eglContext = GLThreadManager.LJFF();
            if (pushBase.fallback_rtmp_by_rtc || pushBase.force_rtmp_by_rtc) {
                lyraxEngineOption.liveSettings = this.config.LIZJ;
            }
            LyraxSoLoadState.isLyraxNativeReady();
            RTCTestEnv rTCTestEnv = pushBase.rtcTestEnv;
            if (rTCTestEnv != null && rTCTestEnv.enable) {
                LyraxBusinessOption lyraxBusinessOption3 = lyraxEngineOption.businessOption;
                if (rTCTestEnv == null || (str3 = rTCTestEnv.rtcAppId) == null) {
                    str3 = "";
                }
                lyraxBusinessOption3.appId = str3;
                LyraxNetworkOption lyraxNetworkOption3 = lyraxEngineOption.networkOption;
                String[] strArr2 = new String[1];
                if (rTCTestEnv == null || (str4 = rTCTestEnv.accessHost) == null) {
                    str4 = "";
                }
                strArr2[0] = str4;
                lyraxNetworkOption3.accessHosts = C1697810uHb.LJ(strArr2);
                LyraxNetworkOption lyraxNetworkOption4 = lyraxEngineOption.networkOption;
                RTCTestEnv rTCTestEnv2 = pushBase.rtcTestEnv;
                if (rTCTestEnv2 != null && (str5 = rTCTestEnv2.mediaServerIp) != null) {
                    str8 = str5;
                }
                lyraxNetworkOption4.customMediaServerIp = str8;
            }
            ILyraxEngine iLyraxEngineCreate = ILyraxEngine.create(lyraxEngineOption);
            this.mEngine = iLyraxEngineCreate;
            if (iLyraxEngineCreate != null) {
                iLyraxEngineCreate.setListener(this);
                boolean z4 = pushBase.fallback_rtmp_by_rtc;
                if (z4 || pushBase.force_rtmp_by_rtc) {
                    iLyraxEngineCreate.setLyraxAttribute(LyraxAttributeKey.FALLBACK_RTMP_BY_RTC, new LyraxValue(z4));
                    iLyraxEngineCreate.setLyraxAttribute(LyraxAttributeKey.FORCE_RTMP_IN_LIVE, new LyraxValue(pushBase.force_rtmp_by_rtc));
                    iLyraxEngineCreate.setLyraxAttribute(LyraxAttributeKey.NOT_ALLOW_FALLBACK_RTMP, new LyraxValue(pushBase.disableAnetFallback));
                    JSONObject jSONObject11 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator<Integer> it2 = pushBase.disableAnetFallbackCodeList.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(it2.next().intValue());
                    }
                    jSONObject11.put("subcodes", jSONArray2);
                    iLyraxEngineCreate.setLyraxAttribute(LyraxAttributeKey.NOT_ALLOW_FALLBACK_RTMP_SUBCODES, new LyraxValue(C786410Ut5.J3(jSONObject11)));
                }
            }
            IVideoStrategyRunner iVideoStrategyRunner = this.mVideoStrategyRunner;
            if (iVideoStrategyRunner != null) {
                setVideoStrategyRunner(iVideoStrategyRunner);
            }
        }
        if (this.mPublisher == null && (iLyraxEngine2 = this.mEngine) != null) {
            LyraxPublisherOption lyraxPublisherOption = new LyraxPublisherOption();
            String streamIdFromUrl = getStreamIdFromUrl(strArr[0]);
            lyraxPublisherOption.streamId = streamIdFromUrl;
            this.mRtcTaskId = streamIdFromUrl;
            lyraxPublisherOption.streamIndex = LyraxStreamIndex.kMain;
            lyraxPublisherOption.enableMixing = true;
            this.mPublisher = iLyraxEngine2.createPublisher(lyraxPublisherOption);
        }
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null) {
            if (this.mHasCachedFeatures) {
                List<? extends LyraxTranscoderFeature> list = this.mCachedFeatures;
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                LyraxTranscoderFeaturesConfig lyraxTranscoderFeaturesConfig = new LyraxTranscoderFeaturesConfig(arrayList);
                ILyraxPublisher iLyraxPublisher2 = this.mPublisher;
                if (iLyraxPublisher2 != null) {
                    iLyraxPublisher2.setFeaturesConfig(lyraxTranscoderFeaturesConfig);
                }
                this.mCachedFeatures = null;
                this.mHasCachedFeatures = false;
            }
            PushBase pushBase2 = this.config.LJI.mPushBase;
            iLyraxPublisher.setListener(this);
            ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper = this.mPlatformVideoSourceWrapper;
            if (iLyraxVideoPlatformWrapper != null && (iLyraxEngine = this.mEngine) != null) {
                iLyraxEngine.bindVideoPlatformWrapper(iLyraxVideoPlatformWrapper);
            }
            C1278430jNB c1278430jNB = this.mResolutionLinkCache;
            if (c1278430jNB != null) {
                C1279200jOQ c1279200jOQ = c1278430jNB.LIZ;
                int i2 = c1279200jOQ.LIZ;
                int i3 = c1279200jOQ.LIZIZ;
                C1279200jOQ c1279200jOQ2 = c1278430jNB.LIZIZ;
                iLyraxPublisher.setVideoStandardDowngradeTier(i2, i3, c1279200jOQ2.LIZ, c1279200jOQ2.LIZIZ);
            }
            LyraxAudioContentConfig lyraxAudioContentConfig = new LyraxAudioContentConfig();
            lyraxAudioContentConfig.hasMic = true;
            lyraxAudioContentConfig.hasMediaPlayer = true;
            lyraxAudioContentConfig.hasScreenAudio = false;
            lyraxAudioContentConfig.hasSpecialAudio = true;
            iLyraxPublisher.setAudioContentConfig(lyraxAudioContentConfig);
            iLyraxPublisher.enableSendE2EInfoSEIV2(pushBase2.LJJIII, (int) pushBase2.gopSec);
            addInternalSei();
            iLyraxPublisher.enableCalculateAudioLoudness(this.mEnableCalculateLoudness);
            if (this.liveSdkSetting.mPushBase.enableGearTable) {
                List<ProbeSpeedGear> list2 = this.config.LJI.probeSpeedResolutions;
                ArrayList<ProbeSpeedGear> arrayList3 = new ArrayList();
                for (ProbeSpeedGear probeSpeedGear : list2) {
                    if (probeSpeedGear.LIZ()) {
                        arrayList3.add(probeSpeedGear);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                for (ProbeSpeedGear probeSpeedGear2 : arrayList3) {
                    arrayList4.add(new LyraxVideoBitrateGearTableItem(probeSpeedGear2.width, probeSpeedGear2.height, probeSpeedGear2.fps, probeSpeedGear2.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT, probeSpeedGear2.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT));
                }
                if (!arrayList4.isEmpty()) {
                    ILyraxEngine iLyraxEngine3 = this.mEngine;
                    if (iLyraxEngine3 != null) {
                        iLyraxEngine3.setVideoBitrateGearTable(arrayList4);
                    }
                    this.mGears = arrayList4;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publisher source path wrapper=");
            sbLIZ.append(this.mPlatformVideoSourceWrapper);
            sbLIZ.append(", useWrapperPath=");
            if (this.mPlatformVideoSourceWrapper != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.mPlatformVideoSourceWrapper == null) {
                LyraxVideoSourceConfig lyraxVideoSourceConfig = new LyraxVideoSourceConfig();
                lyraxVideoSourceConfig.sourceType = LyraxVideoSourceType.EXTERNAL_RAW_FRAME;
                iLyraxPublisher.setVideoSourceConfig(lyraxVideoSourceConfig);
            }
            iLyraxPublisher.setVideoEncoderConfig(this.mRtcVideoConfig);
            this.mRtcPublisherConfig.metaData = C786410Ut5.J3(this.mUserMetadata);
            this.mRtcPublisherConfig.urls = Arrays.asList(strArr);
            LyraxPublisherConfig lyraxPublisherConfig = this.mRtcPublisherConfig;
            lyraxPublisherConfig.pushResultTimeMs = pushBase2.LJJJJJL * LSPassThroughRecordSizeConfig.DEFAULT;
            lyraxPublisherConfig.fallbackTimeMs = pushBase2.anchorNetFallbackTimeout * LSPassThroughRecordSizeConfig.DEFAULT;
            lyraxPublisherConfig.delayPushing = !z;
            if ((pushBase2.force_rtmp_by_rtc || pushBase2.fallback_rtmp_by_rtc) && (nodeProbeIpWithUrl = getNodeProbeIpWithUrl(strArr[0])) != null && nodeProbeIpWithUrl.length() > 0) {
                this.mRtcPublisherConfig.ips = Collections.singletonList(nodeProbeIpWithUrl);
            }
            ASRWordMuting aSRWordMuting = pushBase2.asrWordMuting;
            if (aSRWordMuting != null && aSRWordMuting.enable) {
                this.mRtcPublisherConfig.disableCdnForwarding = true;
                LyraxTranscoderEffectDescription[] lyraxTranscoderEffectDescriptionArr = {new LyraxTranscoderEffectDescription(LyraxTranscoderEffectType.LYRAX_TRANSCODER_EFFECT_TYPE_ASR_WORD_MUTING, new LyraxTranscoderEffectParam(aSRWordMuting.enableWordMuting, aSRWordMuting.enableSegmentStore, aSRWordMuting.enableSdkCallback, aSRWordMuting.enable))};
                LyraxLayoutConfig lyraxLayoutConfig = new LyraxLayoutConfig();
                lyraxLayoutConfig.setEffectDescriptions(lyraxTranscoderEffectDescriptionArr);
                iLyraxPublisher.setLayoutConfig(lyraxLayoutConfig);
            }
            if (this.mSupportLowLatency) {
                LyraxLowLatencyParams lyraxLowLatencyParams = new LyraxLowLatencyParams();
                lyraxLowLatencyParams.enableLowLatencyPush = true;
                lyraxLowLatencyParams.llsStreamId = this.mLowLatencyStreamId;
                lyraxLowLatencyParams.llsStreamToken = this.mLowLatencyStreamToken;
                lyraxLowLatencyParams.isUsingInitialParams = false;
                LyraxAudioEncoderConfig lyraxAudioEncoderConfig = new LyraxAudioEncoderConfig();
                lyraxAudioEncoderConfig.sampleRate = LyraxAudioSampleRate.AUDIO_SAMPLE_RATE_48000;
                lyraxAudioEncoderConfig.channelNum = LyraxAudioChannel.STEREO;
                lyraxAudioEncoderConfig.bitrateKbps = 64;
                lyraxAudioEncoderConfig.codecType = LyraxAudioCodecType.AAC;
                lyraxAudioEncoderConfig.userCodecPriority = true;
                lyraxAudioEncoderConfig.aacCodecProfile = LyraxAudioAACCodecProfile.AACHEV1;
                lyraxLowLatencyParams.llsAacEncoderConfig = lyraxAudioEncoderConfig;
                this.mRtcPublisherConfig.lowLatencyParams = lyraxLowLatencyParams;
            }
            iLyraxPublisher.setPublisherConfig(this.mRtcPublisherConfig);
            if (!this.mEnableAudioEncodeConfigMigration) {
                iLyraxPublisher.setAudioEncoderConfig(this.mRtcAudioConfig);
            }
            iLyraxPublisher.publish();
        }
    }

    @Override // X.AbstractC1277570jLn
    public void doStartPush(String[] strArr, boolean z) throws JSONException {
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
        ILyraxPublisher iLyraxPublisher;
        ILyraxPublisher iLyraxPublisher2;
        ILyraxPublisher iLyraxPublisher3;
        if (enumC1277920jMM == EnumC1277920jMM.VeLivePushSceneLive) {
            ILyraxEngine iLyraxEngine = this.mEngine;
            if (iLyraxEngine != null) {
                iLyraxEngine.setLyraxScene(LyraxScene.LIVE);
            }
            ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper = this.mPlatformVideoSourceWrapper;
            if (iLyraxVideoPlatformWrapper != null && (iLyraxPublisher3 = this.mPublisher) != null) {
                iLyraxPublisher3.setVideoSource(iLyraxVideoPlatformWrapper);
            }
            ILyraxPublisher iLyraxPublisher4 = this.mPublisher;
            if (iLyraxPublisher4 != null) {
                iLyraxPublisher4.enableSendSEIV2(true);
            }
            ILyraxPublisher iLyraxPublisher5 = this.mPublisher;
            if (iLyraxPublisher5 != null) {
                iLyraxPublisher5.setVideoEncoderConfig(this.mRtcVideoConfig);
            }
            LyraxAudioEncoderConfig lyraxAudioEncoderConfig = this.mRtcAudioConfig;
            lyraxAudioEncoderConfig.resetPreEncoderConfig = false;
            if (!this.mEnableAudioEncodeConfigMigration && (iLyraxPublisher2 = this.mPublisher) != null) {
                iLyraxPublisher2.setAudioEncoderConfig(lyraxAudioEncoderConfig);
            }
        } else if (enumC1277920jMM == EnumC1277920jMM.VeLivePushSceneLinkMic) {
            ILyraxEngine iLyraxEngine2 = this.mEngine;
            if (iLyraxEngine2 != null) {
                iLyraxEngine2.setLyraxScene(LyraxScene.LINKMIC);
            }
            ILyraxPublisher iLyraxPublisher6 = this.mPublisher;
            if (iLyraxPublisher6 != null) {
                iLyraxPublisher6.enableSendSEIV2(false);
            }
            LyraxAudioEncoderConfig lyraxAudioEncoderConfig2 = this.mRtcAudioConfig;
            lyraxAudioEncoderConfig2.resetPreEncoderConfig = true;
            if (!this.mEnableAudioEncodeConfigMigration && (iLyraxPublisher = this.mPublisher) != null) {
                iLyraxPublisher.setAudioEncoderConfig(lyraxAudioEncoderConfig2);
            }
        }
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
    }

    @Override // com.ss.lyrax.engine.ILyraxEngineListener
    public void onLogReport(String str, String str2) throws JSONException {
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

    private final void updateGearParams(int i, int i2, int i3) {
        List<LyraxVideoEncoderProfile> list;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile;
        PushBase pushBase = this.config.LJI.mPushBase;
        pushBase.width = i;
        pushBase.height = i2;
        LyraxVideoEncoderConfig lyraxVideoEncoderConfig = this.mRtcVideoConfig;
        if (lyraxVideoEncoderConfig != null && (list = lyraxVideoEncoderConfig.encoderProfiles) != null && (lyraxVideoEncoderProfile = (LyraxVideoEncoderProfile) C13LP.LJJJJZI(list)) != null) {
            lyraxVideoEncoderProfile.width = i;
            lyraxVideoEncoderProfile.height = i2;
            lyraxVideoEncoderProfile.frameRate = i3;
            ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.liveSdkSetting, i, i2, i3);
            if (probeSpeedGearLIZ != null) {
                int i4 = probeSpeedGearLIZ.maxBitrate;
                lyraxVideoEncoderProfile.maxBitrate = i4 / LSPassThroughRecordSizeConfig.DEFAULT;
                lyraxVideoEncoderProfile.minBitrate = probeSpeedGearLIZ.minBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
                updatePerformanceMaxVideoBitrate(i4);
            }
            ILyraxPublisher iLyraxPublisher = this.mPublisher;
            if (iLyraxPublisher != null) {
                iLyraxPublisher.setVideoEncoderConfig(this.mRtcVideoConfig);
            }
            String str = this.tag;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update resolution: ");
            sbLIZ.append(lyraxVideoEncoderProfile.width);
            sbLIZ.append('x');
            sbLIZ.append(lyraxVideoEncoderProfile.height);
            sbLIZ.append('x');
            sbLIZ.append(lyraxVideoEncoderProfile.frameRate);
            sbLIZ.append(" and LivePusher find the bitrate range:");
            sbLIZ.append(lyraxVideoEncoderProfile.maxBitrate);
            sbLIZ.append('x');
            sbLIZ.append(lyraxVideoEncoderProfile.minBitrate);
            AVLog.logKibana(4, str, C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    public void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState, LyraxErrorCode lyraxErrorCode, int i) {
        InterfaceC1277660jLw interfaceC1277660jLw;
        int iValue;
        if (lyraxPublisherState == LyraxPublisherState.ERROR) {
            if (lyraxErrorCode == LyraxErrorCode.LIVE_STREAM_FALLBACK) {
                iValue = -100;
            } else {
                iValue = lyraxErrorCode.value();
            }
            InterfaceC1277660jLw interfaceC1277660jLw2 = this.mObserver;
            if (interfaceC1277660jLw2 != null) {
                interfaceC1277660jLw2.onError(iValue, i, "");
            }
            InterfaceC1277660jLw interfaceC1277660jLw3 = this.mObserver;
            if (interfaceC1277660jLw3 != null) {
                interfaceC1277660jLw3.LIZLLL(EnumC1278980jO4.Offline);
                return;
            }
            return;
        }
        int i2 = C1277640jLu.LIZ[lyraxPublisherState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 || (interfaceC1277660jLw = this.mObserver) == null) {
                return;
            }
            interfaceC1277660jLw.LIZJ(EnumC1270040j9e.ConnectSuccess);
            return;
        }
        InterfaceC1277660jLw interfaceC1277660jLw4 = this.mObserver;
        if (interfaceC1277660jLw4 == null) {
            return;
        }
        interfaceC1277660jLw4.LIZJ(EnumC1270040j9e.Connecting);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onVideoPerformanceAlarms(com.ss.lyrax.video.LyraxVideoPerformanceAlarmMode r9, com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason r10, com.ss.lyrax.video.LyraxVideoSourceWantedData r11) {
        /*
            r8 = this;
            com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason r0 = com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason.BANDWIDTH_FALLBACKED
            if (r10 == r0) goto L7d
            com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason r0 = com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason.BANDWIDTH_RESUMED
            if (r10 == r0) goto L7d
            X.0byu r5 = X.EnumC994300byu.ByteRTCLevelChangeFromPerformance
        La:
            X.0jML r4 = r8.mLevelChangeNotifier
            int r3 = r11.width
            int r2 = r11.height
            int r1 = r11.frameRate
            r4.getClass()
            X.0byu r0 = X.EnumC994300byu.ByteRTCLevelChangeFromPerformance
            if (r0 != r5) goto L76
            r4.LIZJ = r1
            r4.LIZ = r3
            r4.LIZIZ = r2
        L1f:
            X.0jML r0 = r8.mLevelChangeNotifier
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L60
            X.0jLw r6 = r8.mObserver
            if (r6 == 0) goto L60
            if (r10 != 0) goto L6d
            r0 = -1
        L2e:
            r7 = 4
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == r2) goto L6a
            if (r0 == r3) goto L6a
            if (r0 == r4) goto L67
            if (r0 == r7) goto L67
            X.0j9h r5 = X.EnumC1270070j9h.None
        L3c:
            if (r10 == 0) goto L4e
            int[] r1 = X.C1278000jMU.LJI
            int r0 = r10.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L64
            if (r0 == r3) goto L61
            if (r0 == r4) goto L64
            if (r0 == r7) goto L61
        L4e:
            X.0j9x r4 = X.EnumC1270230j9x.Keep
        L50:
            X.0jML r0 = r8.mLevelChangeNotifier
            int r3 = r0.LJI
            int r2 = r0.LJII
            int r1 = r0.LJIIIIZZ
            X.0j6P r0 = new X.0j6P
            r0.<init>(r1, r3, r2)
            r6.LJFF(r5, r4, r0)
        L60:
            return
        L61:
            X.0j9x r4 = X.EnumC1270230j9x.Up
            goto L50
        L64:
            X.0j9x r4 = X.EnumC1270230j9x.Down
            goto L50
        L67:
            X.0j9h r5 = X.EnumC1270070j9h.Net
            goto L3c
        L6a:
            X.0j9h r5 = X.EnumC1270070j9h.Performance
            goto L3c
        L6d:
            int[] r1 = X.C1278000jMU.LJI
            int r0 = r10.ordinal()
            r0 = r1[r0]
            goto L2e
        L76:
            r4.LJFF = r1
            r4.LIZLLL = r3
            r4.LJ = r2
            goto L1f
        L7d:
            X.0byu r5 = X.EnumC994300byu.ByteRTCLevelChangeFromNetwork
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.pusher.anet.VeLivePusherImpV3.onVideoPerformanceAlarms(com.ss.lyrax.video.LyraxVideoPerformanceAlarmMode, com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason, com.ss.lyrax.video.LyraxVideoSourceWantedData):void");
    }

    @Override // X.AbstractC1277570jLn
    public EnumC1277950jMP setVideoPerformanceConfig(int i, int i2, int i3) {
        List<LyraxVideoEncoderProfile> list;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile;
        int i4;
        ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.liveSdkSetting, i, i2, i3);
        if (probeSpeedGearLIZ != null) {
            updatePerformanceMaxVideoBitrate(probeSpeedGearLIZ.maxBitrate);
        }
        LyraxVideoEncoderConfig lyraxVideoEncoderConfig = this.mRtcVideoConfig;
        LyraxErrorCode videoPerfDegradeLimit = null;
        if (lyraxVideoEncoderConfig != null && (list = lyraxVideoEncoderConfig.encoderProfiles) != null && (lyraxVideoEncoderProfile = (LyraxVideoEncoderProfile) C13LP.LJJJJZI(list)) != null) {
            int iMin = Math.min(lyraxVideoEncoderProfile.width, lyraxVideoEncoderProfile.height);
            int iMax = Math.max(lyraxVideoEncoderProfile.width, lyraxVideoEncoderProfile.height);
            C1278430jNB c1278430jNB = this.mResolutionLinkCache;
            if (c1278430jNB != null && ((i4 = c1278430jNB.LIZ.LIZ) == lyraxVideoEncoderProfile.width || i4 == lyraxVideoEncoderProfile.height)) {
                C1279200jOQ c1279200jOQ = c1278430jNB.LIZIZ;
                iMin = c1279200jOQ.LIZ;
                iMax = c1279200jOQ.LIZIZ;
            }
            if (i > iMin || i2 > iMax) {
                updateGearParams(i, i2, i3);
            }
            LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit = new LyraxVideoPerfDegradeLimit(i, i2, i3);
            ILyraxPublisher iLyraxPublisher = this.mPublisher;
            if (iLyraxPublisher != null) {
                videoPerfDegradeLimit = iLyraxPublisher.setVideoPerfDegradeLimit(lyraxVideoPerfDegradeLimit);
            }
            if (videoPerfDegradeLimit == LyraxErrorCode.SUCCESS) {
                return EnumC1277950jMP.Success;
            }
            return EnumC1277950jMP.OtherError;
        }
        return EnumC1277950jMP.OtherError;
    }

    @Override // X.AbstractC1277570jLn
    public void insertStandardLevel(int i, int i2, int i3, int i4) {
        this.mResolutionLinkCache = new C1278430jNB(i, i2, i3, i4);
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null) {
            iLyraxPublisher.setVideoStandardDowngradeTier(i, i2, i3, i4);
        }
    }

    public final int sendSeiMessageInternal(String str, int i, boolean z, boolean z2) {
        ILyraxPublisher iLyraxPublisher = this.mPublisher;
        if (iLyraxPublisher != null && str != null) {
            try {
                LyraxVideoSeiParamV2 lyraxVideoSeiParamV2 = new LyraxVideoSeiParamV2();
                lyraxVideoSeiParamV2.seiData = str.getBytes(Charsets.UTF_8);
                lyraxVideoSeiParamV2.repeatCount = i;
                lyraxVideoSeiParamV2.isKeyFrameOnly = z;
                lyraxVideoSeiParamV2.allowOverwrite = z2;
                iLyraxPublisher.sendSEIV2(lyraxVideoSeiParamV2);
                return 0;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        return -1;
    }

    @Override // X.AbstractC1277570jLn
    public int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2) throws JSONException {
        if (str == null) {
            return -1;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        return sendSeiMessageInternal(C786410Ut5.J3(jSONObject), i, z, z2);
    }

    @Override // X.AbstractC1277570jLn
    public int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        if (this.mPublisher != null) {
            if ((i2 & 1) > 0) {
                if (obj instanceof JSONObject) {
                    String strNativeSeiEncrypt = SeiEncryptUtil.nativeSeiEncrypt(str, obj, this.mUrl);
                    if (!TextUtils.isEmpty(strNativeSeiEncrypt)) {
                        sendSeiMessageInternal(strNativeSeiEncrypt, i, z, z2);
                        return 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sendSeiMessage with encrypt:");
                    sbLIZ.append(str);
                    sbLIZ.append(" => ");
                    sbLIZ.append(obj);
                    AVLog.logToIODevice(6, "VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ), new Exception("SeiMessageEncrypt Error Result"));
                    return 0;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendSeiMessage with encrypt:");
                sbLIZ2.append(str);
                sbLIZ2.append(" => ");
                sbLIZ2.append(obj);
                AVLog.logToIODevice(6, "VeLivePusherImpV3", C2188811AlT.LIZIZ(sbLIZ2), new Exception("SeiMessageEncrypt Invalid Param"));
                return 0;
            }
            sendSeiMessage(str, obj, i, z, z2);
            return 0;
        }
        return 0;
    }
}
