package com.ss.bytertc.engine.avclient;

import X.C09C1;
import X.C09CU;
import X.C09D1;
import X.C09D6;
import X.C09DL;
import X.C1274040jG6;
import X.C1277610jLr;
import X.C1277670jLx;
import X.C1279480jOs;
import X.C1279550jOz;
import X.C1279570jP1;
import X.C13LQ;
import X.C2188811AlT;
import X.C2335109Cz;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.e;
import com.google.gson.s;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.avclient.LyraxAVAudioRoute;
import com.ss.bytertc.engine.avclient.sdkparams.LyraxAVClientSdkParams;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.lyrax.ILyraxAudio;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.ILyraxAudioListener;
import com.ss.lyrax.audio.LyraxAudioAACCodecProfile;
import com.ss.lyrax.audio.LyraxAudioChannel;
import com.ss.lyrax.audio.LyraxAudioCodecType;
import com.ss.lyrax.audio.LyraxAudioContentConfig;
import com.ss.lyrax.audio.LyraxAudioDeviceEventInfo;
import com.ss.lyrax.audio.LyraxAudioDeviceEventType;
import com.ss.lyrax.audio.LyraxAudioDeviceType;
import com.ss.lyrax.audio.LyraxAudioEncoderConfig;
import com.ss.lyrax.audio.LyraxAudioPropertiesConfig;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.audio.LyraxAudioRoute;
import com.ss.lyrax.audio.LyraxAudioSampleRate;
import com.ss.lyrax.engine.ILyraxEngineListener;
import com.ss.lyrax.engine.LyraxConnectionState;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.engine.LyraxNativeLibraryLoadStatus;
import com.ss.lyrax.engine.LyraxNetworkType;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.engine.LyraxSysStats;
import com.ss.lyrax.net.LyraxNetworkQuality;
import com.ss.lyrax.publisher.ILyraxPublisherListener;
import com.ss.lyrax.publisher.LyraxPublisherOption;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.room.ILyraxRoomListener;
import com.ss.lyrax.room.LyraxForwardStreamEventInfo;
import com.ss.lyrax.room.LyraxForwardStreamStateInfo;
import com.ss.lyrax.room.LyraxMessageType;
import com.ss.lyrax.room.LyraxPostProcessParameter;
import com.ss.lyrax.room.LyraxRoomConfig;
import com.ss.lyrax.room.LyraxRoomOption;
import com.ss.lyrax.room.LyraxRoomProfileType;
import com.ss.lyrax.room.LyraxRoomStats;
import com.ss.lyrax.room.LyraxStream;
import com.ss.lyrax.room.LyraxStreamRemoveReason;
import com.ss.lyrax.room.LyraxUserInfo;
import com.ss.lyrax.room.LyraxUserVisibilityChangeError;
import com.ss.lyrax.stream.LyraxAudioLocalState;
import com.ss.lyrax.stream.LyraxFirstFramePlayState;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxPublisherConfig;
import com.ss.lyrax.stream.LyraxPublisherStats;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.stream.LyraxVideoLocalState;
import com.ss.lyrax.subscriber.ILyraxSubscriberListener;
import com.ss.lyrax.subscriber.ILyraxSubscriberListenerFactory;
import com.ss.lyrax.subscriber.LyraxSubscriberState;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderFeaturesConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingErrorCode;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingType;
import com.ss.lyrax.transcoder.LyraxTranscoderParam;
import com.ss.lyrax.video.LyraxVideoCPUBufferFrameBuilder;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import com.ss.lyrax.video.LyraxVideoEncoderMode;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoExtraData;
import com.ss.lyrax.video.LyraxVideoFrameInfo;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmMode;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoRotation;
import com.ss.lyrax.video.LyraxVideoSEIStreamEvent;
import com.ss.lyrax.video.LyraxVideoSeiParamV2;
import com.ss.lyrax.video.LyraxVideoSimulcastSubscribeFallbackInfo;
import com.ss.lyrax.video.LyraxVideoSourceConfig;
import com.ss.lyrax.video.LyraxVideoSourceWantedData;
import com.ss.lyrax.video.LyraxVideoSuperResolutionMode;
import com.ss.lyrax.video.LyraxVideoSuperResolutionModeChangedReason;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientImpl implements ILyraxAVClient {
    public static final Companion Companion = new Companion();
    public static final String TAG = "LyraxAVClientImpl";
    public LyraxAVAudioPlayer mCreatedAudioPlayer;
    public LyraxAVClientOption mEngineOption;
    public ILyraxAVListener mListener;
    public LyraxAVClientLog mLyraxAVClientLog;
    public ILyraxAudio mLyraxAudio;
    public ILyraxEngine mLyraxEngine;
    public ILyraxPublisher mLyraxPublisher;
    public ILyraxRoom mLyraxRoom;
    public ILyraxSubscriber mLyraxSubscriber;
    public boolean mVoiceCallStarted;
    public String mRoomId = "";
    public LyraxAVAudioRoute mAudioRoute = LyraxAVAudioRoute.ROUTE_DEFAULT;
    public final HashMap<String, LyraxTranscoderFeature> mFeaturesConfig = new HashMap<>();
    public LyraxAVClientSdkParams mSdkParams = new LyraxAVClientSdkParams();

    public static final class Companion {
        public final boolean isLyraxNativeReady() {
            return LyraxSoLoadState.isLyraxNativeReady();
        }

        public final String getTAG() {
            return LyraxAVClientImpl.TAG;
        }
    }

    private final void createLyraxAudio() {
        ILyraxEngine iLyraxEngine = this.mLyraxEngine;
        ILyraxAudio audioModule = iLyraxEngine != null ? iLyraxEngine.getAudioModule() : null;
        this.mLyraxAudio = audioModule;
        if (audioModule != null) {
            audioModule.setDefaultAudioRoute(LyraxAudioRoute.ROUTE_EARPIECE);
        }
        ILyraxAudio iLyraxAudio = this.mLyraxAudio;
        if (iLyraxAudio != null) {
            iLyraxAudio.setListener(new ILyraxAudioListener() { // from class: com.ss.bytertc.engine.avclient.LyraxAVClientImpl.createLyraxAudio.1
                @Override // com.ss.lyrax.audio.ILyraxAudioListener
                public final /* synthetic */ void onApiCall(String str, LyraxErrorCode lyraxErrorCode, String str2) {
                    C1279480jOs.LIZ(this, str, lyraxErrorCode, str2);
                }

                @Override // com.ss.lyrax.audio.ILyraxAudioListener
                public final /* synthetic */ void onEngineInfo(String str) {
                    C1279480jOs.LIZJ(this, str);
                }

                @Override // com.ss.lyrax.audio.ILyraxAudioListener
                public void onDeviceEventInfo(LyraxAudioDeviceEventInfo lyraxAudioDeviceEventInfo) throws JSONException {
                    LyraxAudioDeviceEventType lyraxAudioDeviceEventType;
                    LyraxAudioDeviceEventType lyraxAudioDeviceEventType2;
                    ILyraxAVListener iLyraxAVListener;
                    LyraxAudioRoute audioRoute;
                    String string;
                    LyraxAudioRoute audioRoute2;
                    LyraxAudioDeviceEventType lyraxAudioDeviceEventType3;
                    LyraxAudioDeviceType lyraxAudioDeviceType;
                    LyraxErrorCode lyraxErrorCode;
                    String str;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    String str2 = null;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (lyraxAudioDeviceEventInfo != null) {
                            lyraxAudioDeviceEventType3 = lyraxAudioDeviceEventInfo.eventType;
                        } else {
                            lyraxAudioDeviceEventType3 = null;
                        }
                        jSONObject.put("event_type", lyraxAudioDeviceEventType3);
                        if (lyraxAudioDeviceEventInfo != null) {
                            lyraxAudioDeviceType = lyraxAudioDeviceEventInfo.deviceType;
                        } else {
                            lyraxAudioDeviceType = null;
                        }
                        jSONObject.put("device_type", lyraxAudioDeviceType);
                        if (lyraxAudioDeviceEventInfo != null) {
                            lyraxErrorCode = lyraxAudioDeviceEventInfo.errorCode;
                        } else {
                            lyraxErrorCode = null;
                        }
                        jSONObject.put("error_code", lyraxErrorCode);
                        if (lyraxAudioDeviceEventInfo != null) {
                            str = lyraxAudioDeviceEventInfo.message;
                        } else {
                            str = null;
                        }
                        jSONObject.put("message", str);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxAudio_onDeviceEventInfo", jSONObject);
                    }
                    if (lyraxAudioDeviceEventInfo != null) {
                        lyraxAudioDeviceEventType = lyraxAudioDeviceEventInfo.eventType;
                    } else {
                        lyraxAudioDeviceEventType = null;
                    }
                    if (lyraxAudioDeviceEventType == LyraxAudioDeviceEventType.ROUTE_CHANGED) {
                        LyraxAVClientImpl.Companion.getTAG();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDeviceEventInfo callback: audioRoute=");
                        ILyraxAudio iLyraxAudio2 = LyraxAVClientImpl.this.mLyraxAudio;
                        if (iLyraxAudio2 != null) {
                            audioRoute = iLyraxAudio2.getAudioRoute();
                        } else {
                            audioRoute = null;
                        }
                        sbLIZ.append(audioRoute);
                        sbLIZ.append(", info=");
                        if (lyraxAudioDeviceEventInfo != null) {
                            string = lyraxAudioDeviceEventInfo.toString();
                        } else {
                            string = null;
                        }
                        sbLIZ.append(string);
                        C2188811AlT.LIZIZ(sbLIZ);
                        LyraxAVAudioRoute.Companion companion = LyraxAVAudioRoute.Companion;
                        ILyraxAudio iLyraxAudio3 = LyraxAVClientImpl.this.mLyraxAudio;
                        if (iLyraxAudio3 == null || (audioRoute2 = iLyraxAudio3.getAudioRoute()) == null) {
                            audioRoute2 = LyraxAudioRoute.ROUTE_DEFAULT;
                        }
                        LyraxAVAudioRoute lyraxAVAudioRouteFromId = companion.fromId(audioRoute2.value());
                        LyraxAVClientImpl lyraxAVClientImpl = LyraxAVClientImpl.this;
                        if (lyraxAVAudioRouteFromId != lyraxAVClientImpl.mAudioRoute) {
                            LyraxAVClientLog lyraxAVClientLog2 = lyraxAVClientImpl.mLyraxAVClientLog;
                            if (lyraxAVClientLog2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("current_route", lyraxAVClientImpl.mAudioRoute);
                                jSONObject2.put("new_route", lyraxAVAudioRouteFromId);
                                lyraxAVClientLog2.traceSDKCallback("solution_lyraxAudio_audioRouteDidChanged", jSONObject2);
                            }
                            LyraxAVClientImpl lyraxAVClientImpl2 = LyraxAVClientImpl.this;
                            ILyraxAVListener iLyraxAVListener2 = lyraxAVClientImpl2.mListener;
                            if (iLyraxAVListener2 != null) {
                                iLyraxAVListener2.onAudioRouteChanged(lyraxAVClientImpl2.mAudioRoute, lyraxAVAudioRouteFromId);
                            }
                            LyraxAVClientImpl.this.mAudioRoute = lyraxAVAudioRouteFromId;
                        }
                    }
                    if (lyraxAudioDeviceEventInfo != null) {
                        lyraxAudioDeviceEventType2 = lyraxAudioDeviceEventInfo.eventType;
                    } else {
                        lyraxAudioDeviceEventType2 = null;
                    }
                    if (lyraxAudioDeviceEventType2 == LyraxAudioDeviceEventType.ANDROID_RECORD_CALLBACK && (iLyraxAVListener = LyraxAVClientImpl.this.mListener) != null) {
                        if (lyraxAudioDeviceEventInfo != null) {
                            str2 = lyraxAudioDeviceEventInfo.message;
                        }
                        iLyraxAVListener.onRecordCallback(str2);
                    }
                }
            });
        }
    }

    private final ILyraxPublisher getOrCreatePublisher() {
        String rtcStreamId;
        String rtcUserID;
        String rtcStreamToken;
        String idc;
        String rtcStreamId2;
        ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
        if (iLyraxPublisher != null) {
            return iLyraxPublisher;
        }
        LyraxPublisherOption lyraxPublisherOption = new LyraxPublisherOption();
        lyraxPublisherOption.streamIndex = LyraxStreamIndex.kMain;
        String str = "";
        if (this.mSdkParams.getEnableNoRoom()) {
            lyraxPublisherOption.enableMixing = true;
            LyraxAVClientOption lyraxAVClientOption = this.mEngineOption;
            if (lyraxAVClientOption == null || (rtcStreamId2 = lyraxAVClientOption.getRtcStreamId()) == null) {
                rtcStreamId2 = "";
            }
            lyraxPublisherOption.streamId = rtcStreamId2;
        }
        ILyraxEngine iLyraxEngine = this.mLyraxEngine;
        this.mLyraxPublisher = iLyraxEngine != null ? iLyraxEngine.createPublisher(lyraxPublisherOption) : null;
        LyraxAudioContentConfig lyraxAudioContentConfig = new LyraxAudioContentConfig();
        lyraxAudioContentConfig.hasMic = true;
        lyraxAudioContentConfig.hasMediaPlayer = true;
        lyraxAudioContentConfig.hasScreenAudio = false;
        lyraxAudioContentConfig.hasSpecialAudio = false;
        ILyraxPublisher iLyraxPublisher2 = this.mLyraxPublisher;
        if (iLyraxPublisher2 != null) {
            iLyraxPublisher2.setAudioContentConfig(lyraxAudioContentConfig);
        }
        if (this.mSdkParams.getEnableNoRoom()) {
            LyraxAudioEncoderConfig lyraxAudioEncoderConfig = new LyraxAudioEncoderConfig();
            lyraxAudioEncoderConfig.sampleRate = LyraxAudioSampleRate.fromId(48000);
            lyraxAudioEncoderConfig.channelNum = LyraxAudioChannel.STEREO;
            lyraxAudioEncoderConfig.bitrateKbps = 64;
            lyraxAudioEncoderConfig.codecType = LyraxAudioCodecType.AAC;
            lyraxAudioEncoderConfig.aacCodecProfile = LyraxAudioAACCodecProfile.AACHEV1;
            lyraxAudioEncoderConfig.userCodecPriority = true;
            ILyraxPublisher iLyraxPublisher3 = this.mLyraxPublisher;
            if (iLyraxPublisher3 != null) {
                iLyraxPublisher3.setAudioEncoderConfig(lyraxAudioEncoderConfig);
            }
            LyraxPublisherConfig lyraxPublisherConfig = new LyraxPublisherConfig();
            lyraxPublisherConfig.rtc_room_id = this.mRoomId;
            LyraxAVClientOption lyraxAVClientOption2 = this.mEngineOption;
            if (lyraxAVClientOption2 == null || (rtcStreamId = lyraxAVClientOption2.getRtcStreamId()) == null) {
                rtcStreamId = "";
            }
            lyraxPublisherConfig.rtc_stream_id = rtcStreamId;
            LyraxAVClientOption lyraxAVClientOption3 = this.mEngineOption;
            if (lyraxAVClientOption3 == null || (rtcUserID = lyraxAVClientOption3.getRtcUserID()) == null) {
                rtcUserID = "";
            }
            lyraxPublisherConfig.rtc_user_id = rtcUserID;
            LyraxAVClientOption lyraxAVClientOption4 = this.mEngineOption;
            if (lyraxAVClientOption4 == null || (rtcStreamToken = lyraxAVClientOption4.getRtcStreamToken()) == null) {
                rtcStreamToken = "";
            }
            lyraxPublisherConfig.rtc_stream_token = rtcStreamToken;
            lyraxPublisherConfig.enablePassthrough = true;
            lyraxPublisherConfig.disableTranscodeTask = true;
            LyraxAVClientOption lyraxAVClientOption5 = this.mEngineOption;
            if (lyraxAVClientOption5 != null && (idc = lyraxAVClientOption5.getIdc()) != null) {
                str = idc;
            }
            lyraxPublisherConfig.anchor_idc = str;
            ILyraxPublisher iLyraxPublisher4 = this.mLyraxPublisher;
            if (iLyraxPublisher4 != null) {
                iLyraxPublisher4.setPublisherConfig(lyraxPublisherConfig);
            }
        } else {
            ILyraxRoom iLyraxRoom = this.mLyraxRoom;
            if (iLyraxRoom != null) {
                iLyraxRoom.addPublisher(this.mLyraxPublisher);
            }
        }
        ILyraxPublisher iLyraxPublisher5 = this.mLyraxPublisher;
        if (iLyraxPublisher5 != null) {
            iLyraxPublisher5.setListener(new ILyraxPublisherListener() { // from class: com.ss.bytertc.engine.avclient.LyraxAVClientImpl.getOrCreatePublisher.1
                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onAudioLocalStateChanged(LyraxAudioLocalState lyraxAudioLocalState) {
                    C1277610jLr.LIZ(this, lyraxAudioLocalState);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onAudioProfanityDetectedCallback(String str2) {
                    C1277610jLr.LIZIZ(this, str2);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo) {
                    C1277610jLr.LIZJ(this, lyraxAudioPropertiesInfo);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
                    C1277610jLr.LIZLLL(this, lyraxTranscoderFeatureEvent);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onHardwareROISupportStateUpdated(boolean z) {
                    C1277610jLr.LJFF(this, z);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onLogMonitor(String str2) {
                    C1277610jLr.LJI(this, str2);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats) {
                    C1277610jLr.LJII(this, lyraxNetworkQualityStats);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onStreamProtocolChanged(LyraxStreamProtocol lyraxStreamProtocol) {
                    C1277610jLr.LJIIIZ(this, lyraxStreamProtocol);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                    C1277610jLr.LJIIJ(this, lyraxVideoFrameInfo);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onVideoLocalStateChanged(LyraxVideoLocalState lyraxVideoLocalState) {
                    C1277610jLr.LJIIJJI(this, lyraxVideoLocalState);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onVideoPerformanceAlarms(LyraxVideoPerformanceAlarmMode lyraxVideoPerformanceAlarmMode, LyraxVideoPerformanceAlarmReason lyraxVideoPerformanceAlarmReason, LyraxVideoSourceWantedData lyraxVideoSourceWantedData) {
                    C1277610jLr.LJIIL(this, lyraxVideoPerformanceAlarmMode, lyraxVideoPerformanceAlarmReason, lyraxVideoSourceWantedData);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public final /* synthetic */ void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                    C1277610jLr.LJIILIIL(this, lyraxVideoFrameInfo);
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public void onFirstAudioFrameCaptured() throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("message", "onFirstAudioFrameCaptured");
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxPublisher_onFirstAudioFrameCaptured", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
                public void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState, LyraxErrorCode lyraxErrorCode, int i) throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("state", lyraxPublisherState);
                        jSONObject.put("error_code", lyraxErrorCode);
                        jSONObject.put("sub_code", i);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxPublisher_onPublisherStateChanged", jSONObject);
                    }
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        if (lyraxPublisherState == null) {
                            lyraxPublisherState = LyraxPublisherState.UNKONWN;
                        }
                        iLyraxAVListener.onPublisherStateChanged(lyraxPublisherState);
                    }
                }
            });
        }
        return this.mLyraxPublisher;
    }

    private final void setEngineListener() {
        ILyraxEngine iLyraxEngine = this.mLyraxEngine;
        if (iLyraxEngine != null) {
            iLyraxEngine.setListener(new ILyraxEngineListener() { // from class: com.ss.bytertc.engine.avclient.LyraxAVClientImpl$setEngineListener$1$1
                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public final /* synthetic */ void onDisposed() {
                    C1277670jLx.LIZJ(this);
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public final /* synthetic */ void onExtensionAccessError(String str, String str2) {
                    C1277670jLx.LIZLLL(this, str, str2);
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public final /* synthetic */ void onInitializedEngineEGL(GLESVersion gLESVersion) {
                    C1277670jLx.LJ(this, gLESVersion);
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public void onLogReport(String str, String str2) {
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public final /* synthetic */ void onNativeLibraryLoadInfo(LyraxNativeLibraryLoadStatus lyraxNativeLibraryLoadStatus, String str) {
                    C1277670jLx.LJI(this, lyraxNativeLibraryLoadStatus, str);
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public final /* synthetic */ void onSysStats(LyraxSysStats lyraxSysStats) {
                    C1277670jLx.LJIIIIZZ(this, lyraxSysStats);
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public void onConnectionStateChanged(LyraxConnectionState lyraxConnectionState) throws JSONException {
                    ILyraxAVListener iLyraxAVListener;
                    LyraxAVClientLog lyraxAVClientLog = this.this$0.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("connection_state", lyraxConnectionState);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxEngine_onConnectionStateChanged", jSONObject);
                    }
                    if (lyraxConnectionState == LyraxConnectionState.FAILED && (iLyraxAVListener = this.this$0.mListener) != null) {
                        iLyraxAVListener.onError(lyraxConnectionState.value());
                    }
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public void onNetworkTypeChanged(LyraxNetworkType lyraxNetworkType) throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = this.this$0.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("network_type", lyraxNetworkType);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxEngine_onNetworkTypeChanged", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.engine.ILyraxEngineListener
                public void onCreateRoomStateChanged(String str, LyraxErrorCode lyraxErrorCode) throws JSONException {
                    ILyraxAVListener iLyraxAVListener;
                    LyraxAVClientLog lyraxAVClientLog = this.this$0.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("room_id", str);
                        jSONObject.put("error_code", lyraxErrorCode);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxEngine_onCreateRoomStateChanged", jSONObject);
                    }
                    if (lyraxErrorCode != LyraxErrorCode.SUCCESS && (iLyraxAVListener = this.this$0.mListener) != null) {
                        if (lyraxErrorCode == null) {
                            lyraxErrorCode = LyraxErrorCode.INVALID_STATE;
                        }
                        iLyraxAVListener.onError(lyraxErrorCode.value());
                    }
                }
            });
        }
    }

    private final void setLyraxRoomListener() {
        ILyraxRoom iLyraxRoom = this.mLyraxRoom;
        if (iLyraxRoom != null) {
            iLyraxRoom.setListener(new ILyraxRoomListener() { // from class: com.ss.bytertc.engine.avclient.LyraxAVClientImpl.setLyraxRoomListener.1
                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onAudioStreamBanned(String str, boolean z) {
                    C1279570jP1.LIZIZ(this, str, z);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onForwardStreamEvent(LyraxForwardStreamEventInfo[] lyraxForwardStreamEventInfoArr) {
                    C1279570jP1.LJ(this, lyraxForwardStreamEventInfoArr);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onForwardStreamStateChanged(LyraxForwardStreamStateInfo[] lyraxForwardStreamStateInfoArr) {
                    C1279570jP1.LJFF(this, lyraxForwardStreamStateInfoArr);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onJoinRoom() {
                    C1279570jP1.LJI(this);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onLeaveRoom() {
                    C1279570jP1.LJII(this);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onLocalStreamStats(LyraxStreamIndex lyraxStreamIndex, LyraxPublisherStats lyraxPublisherStats) {
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onRemoteStreamStats(LyraxStreamKey lyraxStreamKey, LyraxSubscriberStats lyraxSubscriberStats) {
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onRemoteVideoInfoChanged(LyraxStream lyraxStream) {
                    C1279570jP1.LJIILIIL(this, lyraxStream);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onRoomMessageReceived(String str, String str2) {
                    C1279570jP1.LJIILL(this, str, str2);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onRoomMessageSendResult(long j, int i) {
                    C1279570jP1.LJIILLIIL(this, j, i);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onRoomStats(LyraxRoomStats lyraxRoomStats) {
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onStreamAdd(LyraxStream lyraxStream) {
                    C1279570jP1.LJIJI(this, lyraxStream);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onStreamMixingEvent(LyraxTranscoderMixingEvent lyraxTranscoderMixingEvent, String str, LyraxTranscoderMixingErrorCode lyraxTranscoderMixingErrorCode, int i, String str2, LyraxTranscoderMixingType lyraxTranscoderMixingType) {
                    C1279570jP1.LJIJJ(this, lyraxTranscoderMixingEvent, str, lyraxTranscoderMixingErrorCode, i, str2, lyraxTranscoderMixingType);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onStreamRemove(LyraxStream lyraxStream, LyraxStreamRemoveReason lyraxStreamRemoveReason) {
                    C1279570jP1.LJIJJLI(this, lyraxStream, lyraxStreamRemoveReason);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onUserBizSessionId(String str, String str2) {
                    C1279570jP1.LJJ(this, str, str2);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onUserVisibilityChanged(boolean z, LyraxUserVisibilityChangeError lyraxUserVisibilityChangeError) {
                    C1279570jP1.LJJIJ(this, z, lyraxUserVisibilityChangeError);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public final /* synthetic */ void onVideoStreamBanned(String str, boolean z) {
                    C1279570jP1.LJJIJIIJI(this, str, z);
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onTokenWillExpire() throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("message", "token will expire");
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onTokenWillExpire", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) throws JSONException {
                    String string;
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        iLyraxAVListener.onFeatureEvent(lyraxTranscoderFeatureEvent);
                    }
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (lyraxTranscoderFeatureEvent == null || (string = lyraxTranscoderFeatureEvent.toString()) == null) {
                            string = "null";
                        }
                        jSONObject.put("message", string);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onFeatureEvent", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onLocalAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr) {
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        iLyraxAVListener.onLocalAudioProperties(lyraxAudioPropertiesInfoArr);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserStartAudioCapture(String str) throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_id", str);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserStartAudioCapture", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserStopAudioCapture(String str) throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_id", str);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserStopAudioCapture", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onCreateLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) throws JSONException {
                    String str;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str2 = null;
                        if (lyraxStreamKey != null) {
                            str = lyraxStreamKey.userID;
                        } else {
                            str = null;
                        }
                        jSONObject.put("user_id", str);
                        if (lyraxStreamKey != null) {
                            str2 = lyraxStreamKey.streamID;
                        }
                        jSONObject.put("stream_id", str2);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onCreateLyraxSubscriber", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats, LyraxNetworkQualityStats[] lyraxNetworkQualityStatsArr) {
                    LyraxNetworkQualityStats lyraxNetworkQualityStats2;
                    LyraxNetworkQuality lyraxNetworkQuality;
                    C1279570jP1.LJIIJ(this, lyraxNetworkQualityStats, lyraxNetworkQualityStatsArr);
                    LyraxNetworkQuality lyraxNetworkQuality2 = null;
                    if (lyraxNetworkQualityStatsArr != null) {
                        lyraxNetworkQualityStats2 = (LyraxNetworkQualityStats) C13LQ.LJJIIZ(0, lyraxNetworkQualityStatsArr);
                    } else {
                        lyraxNetworkQualityStats2 = null;
                    }
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        if (lyraxNetworkQualityStats != null) {
                            lyraxNetworkQuality = lyraxNetworkQualityStats.txQuality;
                        } else {
                            lyraxNetworkQuality = null;
                        }
                        if (lyraxNetworkQualityStats2 != null) {
                            lyraxNetworkQuality2 = lyraxNetworkQualityStats2.txQuality;
                        }
                        iLyraxAVListener.onNetworkQuality(lyraxNetworkQuality, lyraxNetworkQuality2);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onRemoteAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr, int i) {
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        iLyraxAVListener.onRemoteAudioProperties(lyraxAudioPropertiesInfoArr);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onRemoveLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) throws JSONException {
                    String str;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str2 = null;
                        if (lyraxStreamKey != null) {
                            str = lyraxStreamKey.userID;
                        } else {
                            str = null;
                        }
                        jSONObject.put("user_id", str);
                        if (lyraxStreamKey != null) {
                            str2 = lyraxStreamKey.streamID;
                        }
                        jSONObject.put("stream_id", str2);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onRemoveLyraxSubscriber", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserJoined(LyraxUserInfo lyraxUserInfo, int i) throws JSONException {
                    String str;
                    String str2;
                    C1279570jP1.LJJI(this, lyraxUserInfo, i);
                    if (lyraxUserInfo == null || (str = lyraxUserInfo.userId) == null) {
                        str = "";
                    }
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        iLyraxAVListener.onUserJoined(str);
                    }
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str3 = null;
                        if (lyraxUserInfo != null) {
                            str2 = lyraxUserInfo.userId;
                        } else {
                            str2 = null;
                        }
                        jSONObject.put("user_id", str2);
                        if (lyraxUserInfo != null) {
                            str3 = lyraxUserInfo.extraInfo;
                        }
                        jSONObject.put("extra_info", str3);
                        jSONObject.put("elapsed", i);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserJoined", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserLeave(String str, int i) throws JSONException {
                    String str2;
                    C1279570jP1.LJJIFFI(this, str, i);
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        iLyraxAVListener.onUserLeft(str2);
                    }
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_id", str);
                        jSONObject.put("reason", i);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserLeave", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserMessageReceived(String str, String str2) throws JSONException {
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    ILyraxAVListener iLyraxAVListener = LyraxAVClientImpl.this.mListener;
                    if (iLyraxAVListener != null) {
                        iLyraxAVListener.onUserMessageReceived(str, str2);
                    }
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_id", str);
                        jSONObject.put("message", str2);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserMessageReceived", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserMessageSendResult(long j, int i) throws JSONException {
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("msg_id", j);
                        jSONObject.put("error_code", i);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserMessageSendResult", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onAddPublisherStateChanged(LyraxStreamKey lyraxStreamKey, int i, String str) throws JSONException {
                    String str2;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str3 = null;
                        if (lyraxStreamKey != null) {
                            str2 = lyraxStreamKey.userID;
                        } else {
                            str2 = null;
                        }
                        jSONObject.put("user_id", str2);
                        if (lyraxStreamKey != null) {
                            str3 = lyraxStreamKey.streamID;
                        }
                        jSONObject.put("stream_id", str3);
                        jSONObject.put("error_code", i);
                        jSONObject.put("extra_info", str);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onAddPublisherStateChanged", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onRoomStateChanged(String str, int i, String str2) throws JSONException {
                    ILyraxAVListener iLyraxAVListener;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("user_id", str);
                        jSONObject.put("state", i);
                        jSONObject.put("extra_info", str2);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onRoomStateChanged", jSONObject);
                    }
                    if (i != 0 && (iLyraxAVListener = LyraxAVClientImpl.this.mListener) != null) {
                        iLyraxAVListener.onError(i);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserPublishStream(LyraxStreamKey lyraxStreamKey, boolean z, LyraxStreamMediaType lyraxStreamMediaType) throws JSONException {
                    String str;
                    int iValue;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str2 = null;
                        if (lyraxStreamKey != null) {
                            str = lyraxStreamKey.userID;
                        } else {
                            str = null;
                        }
                        jSONObject.put("user_id", str);
                        if (lyraxStreamKey != null) {
                            str2 = lyraxStreamKey.streamID;
                        }
                        jSONObject.put("stream_id", str2);
                        jSONObject.put("is_screen", z);
                        if (lyraxStreamMediaType != null) {
                            iValue = lyraxStreamMediaType.value();
                        } else {
                            iValue = 0;
                        }
                        jSONObject.put("stream_media_type", iValue);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserPublishStream", jSONObject);
                    }
                }

                @Override // com.ss.lyrax.room.ILyraxRoomListener
                public void onUserUnpublishStream(LyraxStreamKey lyraxStreamKey, LyraxStreamMediaType lyraxStreamMediaType, LyraxStreamRemoveReason lyraxStreamRemoveReason) throws JSONException {
                    String str;
                    int iValue;
                    LyraxAVClientLog lyraxAVClientLog = LyraxAVClientImpl.this.mLyraxAVClientLog;
                    if (lyraxAVClientLog != null) {
                        JSONObject jSONObject = new JSONObject();
                        String str2 = null;
                        if (lyraxStreamKey != null) {
                            str = lyraxStreamKey.userID;
                        } else {
                            str = null;
                        }
                        jSONObject.put("user_id", str);
                        if (lyraxStreamKey != null) {
                            str2 = lyraxStreamKey.streamID;
                        }
                        jSONObject.put("stream_id", str2);
                        if (lyraxStreamMediaType != null) {
                            iValue = lyraxStreamMediaType.value();
                        } else {
                            iValue = 0;
                        }
                        jSONObject.put("stream_media_type", iValue);
                        jSONObject.put("reason", lyraxStreamRemoveReason);
                        lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onUserUnPublishStream", jSONObject);
                    }
                }
            });
        }
    }

    private final void setVideoConfig() {
        LyraxVideoEncoderMode lyraxVideoEncoderMode = LyraxVideoEncoderMode.SINGLE;
        LyraxVideoEncoderProfile lyraxVideoEncoderProfile = new LyraxVideoEncoderProfile();
        lyraxVideoEncoderProfile.width = this.mSdkParams.getVideoParams().getWidth();
        lyraxVideoEncoderProfile.height = this.mSdkParams.getVideoParams().getHeight();
        lyraxVideoEncoderProfile.frameRate = this.mSdkParams.getVideoParams().getFps();
        lyraxVideoEncoderProfile.minBitrate = this.mSdkParams.getVideoParams().getMinBitrate() / LSPassThroughRecordSizeConfig.DEFAULT;
        lyraxVideoEncoderProfile.maxBitrate = this.mSdkParams.getVideoParams().getMaxBitrate() / LSPassThroughRecordSizeConfig.DEFAULT;
        ArrayList arrayList = new ArrayList();
        arrayList.add(lyraxVideoEncoderProfile);
        ILyraxPublisher orCreatePublisher = getOrCreatePublisher();
        if (orCreatePublisher != null) {
            orCreatePublisher.setVideoEncoderConfig(new LyraxVideoEncoderConfig(lyraxVideoEncoderMode, arrayList));
        }
        ILyraxPublisher orCreatePublisher2 = getOrCreatePublisher();
        if (orCreatePublisher2 != null) {
            orCreatePublisher2.setVideoSourceConfig(new LyraxVideoSourceConfig());
        }
    }

    private final void updateFeatureTask() {
        if (this.mVoiceCallStarted) {
            LyraxTranscoderParam lyraxTranscoderParam = new LyraxTranscoderParam();
            lyraxTranscoderParam.setRoomId(this.mRoomId);
            LyraxAVClientOption lyraxAVClientOption = this.mEngineOption;
            lyraxTranscoderParam.setUserId(lyraxAVClientOption != null ? lyraxAVClientOption.getRtcUserID() : null);
            lyraxTranscoderParam.setDisableTranscodeTask(true);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, LyraxTranscoderFeature> entry : this.mFeaturesConfig.entrySet()) {
                entry.getKey();
                arrayList.add(entry.getValue());
            }
            lyraxTranscoderParam.setFeatureConfigs(new LyraxTranscoderFeaturesConfig(arrayList));
            ILyraxRoom iLyraxRoom = this.mLyraxRoom;
            if (iLyraxRoom != null) {
                LyraxAVClientOption lyraxAVClientOption2 = this.mEngineOption;
                iLyraxRoom.startPushMixedStreamToCDN(lyraxAVClientOption2 != null ? lyraxAVClientOption2.getRtcStreamId() : null, lyraxTranscoderParam);
            }
        }
    }

    private final void updateFeatureTaskNoRoom() {
        if (this.mVoiceCallStarted && this.mSdkParams.getEnableNoRoom()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, LyraxTranscoderFeature> entry : this.mFeaturesConfig.entrySet()) {
                entry.getKey();
                arrayList.add(entry.getValue());
            }
            ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
            if (iLyraxPublisher != null) {
                iLyraxPublisher.setFeaturesConfig(new LyraxTranscoderFeaturesConfig(arrayList));
            }
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void destroyClient() {
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "destroyClient");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", 0);
            lyraxAVClientLog.traceAPICall("solution_destroy", jSONObject);
        }
        ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
        if (iLyraxPublisher != null) {
            iLyraxPublisher.dispose();
        }
        this.mLyraxPublisher = null;
        ILyraxSubscriber iLyraxSubscriber = this.mLyraxSubscriber;
        if (iLyraxSubscriber != null) {
            iLyraxSubscriber.dispose();
        }
        this.mLyraxSubscriber = null;
        ILyraxAudio iLyraxAudio = this.mLyraxAudio;
        if (iLyraxAudio != null) {
            iLyraxAudio.dispose();
        }
        this.mLyraxAudio = null;
        ILyraxEngine iLyraxEngine = this.mLyraxEngine;
        if (iLyraxEngine != null) {
            iLyraxEngine.dispose();
        }
        this.mLyraxEngine = null;
        LyraxAVClientLog lyraxAVClientLog2 = this.mLyraxAVClientLog;
        if (lyraxAVClientLog2 != null) {
            lyraxAVClientLog2.release();
        }
        this.mLyraxAVClientLog = null;
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void muteAllRemoteUsers() {
        LyraxErrorCode lyraxErrorCodeMuteAllRemoteStream;
        ILyraxRoom iLyraxRoom = this.mLyraxRoom;
        int iValue = (iLyraxRoom == null || (lyraxErrorCodeMuteAllRemoteStream = iLyraxRoom.muteAllRemoteStream(LyraxStreamIndex.kMain, LyraxStreamMediaType.AUDIO)) == null) ? 0 : lyraxErrorCodeMuteAllRemoteStream.value();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "muteAllRemoteUsers");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", iValue);
            lyraxAVClientLog.traceAPICall("solution_muteAllRemoteUsers", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void muteLocalAudio() throws JSONException {
        LyraxErrorCode lyraxErrorCodeMute;
        ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
        int iValue = (iLyraxPublisher == null || (lyraxErrorCodeMute = iLyraxPublisher.mute(LyraxStreamMediaType.AUDIO)) == null) ? 0 : lyraxErrorCodeMute.value();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "muteLocalAudio");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", iValue);
            lyraxAVClientLog.traceAPICall("solution_muteLocalAudio", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void startAudioCapture() throws JSONException {
        LyraxErrorCode lyraxErrorCodeStartAudioCapture;
        ILyraxAudio iLyraxAudio = this.mLyraxAudio;
        int iValue = (iLyraxAudio == null || (lyraxErrorCodeStartAudioCapture = iLyraxAudio.startAudioCapture()) == null) ? 0 : lyraxErrorCodeStartAudioCapture.value();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "startAudioCapture");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", iValue);
            lyraxAVClientLog.traceAPICall("solution_startAudioCapture", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void startVoiceCall() {
        LyraxAVClientOption lyraxAVClientOption = this.mEngineOption;
        if (lyraxAVClientOption != null) {
            this.mVoiceCallStarted = true;
            joinRoom(lyraxAVClientOption);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void stopAudioCapture() {
        LyraxErrorCode lyraxErrorCodeStopAudioCapture;
        ILyraxAudio iLyraxAudio = this.mLyraxAudio;
        int iValue = (iLyraxAudio == null || (lyraxErrorCodeStopAudioCapture = iLyraxAudio.stopAudioCapture()) == null) ? 0 : lyraxErrorCodeStopAudioCapture.value();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "stopAudioCapture");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", iValue);
            lyraxAVClientLog.traceAPICall("solution_stopAudioCapture", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void stopVoiceCall() {
        LyraxErrorCode lyraxErrorCodeUnsubscribe;
        LyraxErrorCode lyraxErrorCodeUnpublish;
        LyraxErrorCode lyraxErrorCodeLeaveRoom;
        if (!this.mVoiceCallStarted) {
            LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
            if (lyraxAVClientLog != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", "stopVoiceCall skipped");
                jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
                jSONObject.put("code", LyraxErrorCode.SUCCESS.value());
                lyraxAVClientLog.traceAPICall("solution_stopVoiceCall", jSONObject);
                return;
            }
            return;
        }
        int iValue = 0;
        this.mVoiceCallStarted = false;
        ILyraxRoom iLyraxRoom = this.mLyraxRoom;
        int iValue2 = (iLyraxRoom == null || (lyraxErrorCodeLeaveRoom = iLyraxRoom.leaveRoom()) == null) ? 0 : lyraxErrorCodeLeaveRoom.value();
        LyraxErrorCode lyraxErrorCode = LyraxErrorCode.SUCCESS;
        if (iValue2 != lyraxErrorCode.value()) {
            LyraxAVClientLog lyraxAVClientLog2 = this.mLyraxAVClientLog;
            if (lyraxAVClientLog2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "leave room error");
                jSONObject2.put("rtc_room_id", lyraxAVClientLog2.getMRoomId());
                jSONObject2.put("code", iValue2);
                lyraxAVClientLog2.traceAPICall("solution_stopVoiceCall", jSONObject2);
                return;
            }
            return;
        }
        ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
        int iValue3 = (iLyraxPublisher == null || (lyraxErrorCodeUnpublish = iLyraxPublisher.unpublish()) == null) ? 0 : lyraxErrorCodeUnpublish.value();
        if (iValue3 != lyraxErrorCode.value()) {
            LyraxAVClientLog lyraxAVClientLog3 = this.mLyraxAVClientLog;
            if (lyraxAVClientLog3 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("message", "unpublish error");
                jSONObject3.put("rtc_room_id", lyraxAVClientLog3.getMRoomId());
                jSONObject3.put("code", iValue3);
                lyraxAVClientLog3.traceAPICall("solution_stopVoiceCall", jSONObject3);
                return;
            }
            return;
        }
        ILyraxSubscriber iLyraxSubscriber = this.mLyraxSubscriber;
        if (iLyraxSubscriber != null && (lyraxErrorCodeUnsubscribe = iLyraxSubscriber.unsubscribe()) != null) {
            iValue = lyraxErrorCodeUnsubscribe.value();
        }
        LyraxAVClientLog lyraxAVClientLog4 = this.mLyraxAVClientLog;
        if (lyraxAVClientLog4 != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("message", "unsubscribe");
            jSONObject4.put("rtc_room_id", lyraxAVClientLog4.getMRoomId());
            jSONObject4.put("code", iValue);
            lyraxAVClientLog4.traceAPICall("solution_stopVoiceCall", jSONObject4);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void unmuteAllRemoteUsers() {
        LyraxErrorCode lyraxErrorCodeUnmuteAllRemoteStream;
        ILyraxRoom iLyraxRoom = this.mLyraxRoom;
        int iValue = (iLyraxRoom == null || (lyraxErrorCodeUnmuteAllRemoteStream = iLyraxRoom.unmuteAllRemoteStream(LyraxStreamIndex.kMain, LyraxStreamMediaType.AUDIO)) == null) ? 0 : lyraxErrorCodeUnmuteAllRemoteStream.value();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "unmuteAllRemoteUsers");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", iValue);
            lyraxAVClientLog.traceAPICall("solution_unmuteAllRemoteUsers", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void unmuteLocalAudio() throws JSONException {
        LyraxErrorCode lyraxErrorCodeUnmute;
        ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
        int iValue = (iLyraxPublisher == null || (lyraxErrorCodeUnmute = iLyraxPublisher.unmute(LyraxStreamMediaType.AUDIO)) == null) ? 0 : lyraxErrorCodeUnmute.value();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", "unmuteLocalAudio");
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            jSONObject.put("code", iValue);
            lyraxAVClientLog.traceAPICall("solution_unmuteLocalAudio", jSONObject);
        }
    }

    public static final class LyraxAVClientBuilder {
        public static final Companion Companion = new Companion();

        public static final class Companion {
            public final LyraxAVClientImpl create(LyraxAVClientOption lyraxAVClientOption) {
                return new LyraxAVClientImpl(lyraxAVClientOption);
            }
        }
    }

    public LyraxAVClientImpl(LyraxAVClientOption lyraxAVClientOption) throws JSONException {
        if (!Companion.isLyraxNativeReady()) {
            return;
        }
        parseSdkParams(lyraxAVClientOption.getSdkParams());
        createLyraxEngine(lyraxAVClientOption);
        setEngineListener();
        createLyraxAudio();
        createLyraxRoom(lyraxAVClientOption.getRtcRoomID());
        setLyraxRoomListener();
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", lyraxAVClientOption.toString());
            lyraxAVClientLog.traceAPICall("solution_create", jSONObject);
        }
    }

    private final void createLyraxEngine(LyraxAVClientOption lyraxAVClientOption) {
        this.mEngineOption = lyraxAVClientOption;
        this.mRoomId = lyraxAVClientOption.getRtcRoomID();
        this.mListener = lyraxAVClientOption.getLyraxAVListener();
        LyraxEngineOption lyraxEngineOption = new LyraxEngineOption();
        lyraxEngineOption.forceInitEnv = lyraxAVClientOption.getInitGLEnv();
        lyraxEngineOption.appOption.appVersion = lyraxAVClientOption.getAppVersion();
        lyraxEngineOption.appOption.appChannel = lyraxAVClientOption.getAppChannel();
        lyraxEngineOption.businessOption.appId = lyraxAVClientOption.getRtcAppID();
        lyraxEngineOption.businessOption.aid = lyraxAVClientOption.getAppID();
        lyraxEngineOption.businessOption.liveRoomId = lyraxAVClientOption.getRtcRoomID();
        lyraxEngineOption.businessOption.deviceId = lyraxAVClientOption.getDeviceID();
        lyraxEngineOption.androidOption.context = lyraxAVClientOption.getAndroidContext();
        lyraxEngineOption.scene = LyraxScene.LINKMIC;
        lyraxEngineOption.inAnchorNet = true;
        lyraxEngineOption.businessOption.liveType = LyraxLiveType.VIDEO;
        String websocketUrl = lyraxAVClientOption.getWebsocketUrl();
        if (websocketUrl != null && websocketUrl.length() != 0) {
            lyraxEngineOption.logSdkWebsocketUrl = lyraxAVClientOption.getWebsocketUrl();
        } else {
            lyraxEngineOption.logSdkWebsocketUrl = LyraxAVClientUtil.Companion.buildLogSdkWebsocketUrl();
        }
        ArrayList<String> accessHost = lyraxAVClientOption.getAccessHost();
        if (accessHost != null && !accessHost.isEmpty()) {
            lyraxEngineOption.networkOption.accessHosts = lyraxAVClientOption.getAccessHost();
        } else {
            lyraxEngineOption.networkOption.accessHosts = LyraxAVClientUtil.Companion.buildAccessHosts();
        }
        lyraxEngineOption.resourceDownloadUrl = LyraxAVClientUtil.Companion.buildResourceDownloadUrl();
        String autotestParameters = lyraxAVClientOption.getAutotestParameters();
        if (autotestParameters != null && autotestParameters.length() != 0) {
            lyraxEngineOption.autotestParameters = lyraxAVClientOption.getAutotestParameters();
        }
        if (this.mSdkParams.getCustomMediaServerIp().length() > 0) {
            lyraxEngineOption.networkOption.customMediaServerIp = this.mSdkParams.getCustomMediaServerIp();
        }
        lyraxEngineOption.networkOption.accessGroupId = lyraxAVClientOption.getRtcRoomID();
        lyraxEngineOption.audioOption.disablePhoneStateListener = true;
        this.mLyraxEngine = ILyraxEngine.create(lyraxEngineOption);
        this.mLyraxAVClientLog = new LyraxAVClientLog(this.mLyraxEngine, lyraxAVClientOption.getRtcRoomID());
    }

    private final void createLyraxRoom(String str) {
        ILyraxRoom iLyraxRoomCreateRoom;
        LyraxRoomOption lyraxRoomOption = new LyraxRoomOption();
        lyraxRoomOption.roomId = str;
        ILyraxEngine iLyraxEngine = this.mLyraxEngine;
        if (iLyraxEngine != null) {
            iLyraxRoomCreateRoom = iLyraxEngine.createRoom(lyraxRoomOption);
        } else {
            iLyraxRoomCreateRoom = null;
        }
        this.mLyraxRoom = iLyraxRoomCreateRoom;
    }

    private final void joinRoom(LyraxAVClientOption lyraxAVClientOption) throws JSONException {
        ILyraxRoom iLyraxRoom;
        String idc;
        ILyraxRoom iLyraxRoom2;
        LyraxUserInfo lyraxUserInfoCreate = LyraxUserInfo.create(lyraxAVClientOption.getRtcUserID(), "");
        LyraxErrorCode lyraxErrorCodeJoinRoom = null;
        LyraxRoomConfig lyraxRoomConfig = new LyraxRoomConfig(LyraxRoomProfileType.CHANNEL_PROFILE_COMMUNICATION, true, true, false, new ILyraxSubscriberListenerFactory() { // from class: com.ss.bytertc.engine.avclient.LyraxAVClientImpl$joinRoom$roomConfig$1
            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListenerFactory
            public ILyraxSubscriberListener createLyraxSubscriberListener(final LyraxStreamKey lyraxStreamKey) {
                final LyraxAVClientImpl lyraxAVClientImpl = this.this$0;
                return new ILyraxSubscriberListener() { // from class: com.ss.bytertc.engine.avclient.LyraxAVClientImpl$joinRoom$roomConfig$1$createLyraxSubscriberListener$1
                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onAudioFramePlayStateChanged(String str, LyraxFirstFramePlayState lyraxFirstFramePlayState) {
                        C1279550jOz.LIZ(this, str, lyraxFirstFramePlayState);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo) {
                        C1279550jOz.LIZIZ(this, lyraxAudioPropertiesInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onAudioRenderStallEnd(long j) {
                        C1279550jOz.LIZJ(this, j);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onAudioRenderStallStart(long j) {
                        C1279550jOz.LIZLLL(this, j);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats) {
                        C1279550jOz.LJFF(this, lyraxNetworkQualityStats);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onStatsReport(LyraxSubscriberStats lyraxSubscriberStats) {
                        C1279550jOz.LJI(this, lyraxSubscriberStats);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onSubscribeSignalingSent(long j) {
                        C1279550jOz.LJII(this, j);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoDecodeStallHappened(long j) {
                        C1279550jOz.LJIIIZ(this, j);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoDecoderError(int i, String str) {
                        C1279550jOz.LJIIJ(this, i, str);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFirstFrameDecoded(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJIIJJI(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFirstFrameDemuxed(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJIIL(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFirstFrameRealRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJIILIIL(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJIILJJIL(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFirstFrameRenderedEnd(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJIILL(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFirstPacketReceived(long j) {
                        C1279550jOz.LJIILLIIL(this, j);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFramePlayStateChanged(LyraxFirstFramePlayState lyraxFirstFramePlayState) {
                        C1279550jOz.LJIIZILJ(this, lyraxFirstFramePlayState);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJIJ(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoPreDecodeStallHappened(long j) {
                        C1279550jOz.LJIJI(this, j);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoSEIReceived(LyraxVideoExtraData lyraxVideoExtraData) {
                        C1279550jOz.LJIJJ(this, lyraxVideoExtraData);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoSEIStreamChanged(LyraxVideoSEIStreamEvent lyraxVideoSEIStreamEvent) {
                        C1279550jOz.LJIJJLI(this, lyraxVideoSEIStreamEvent);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoSimulcastFallback(LyraxVideoSimulcastSubscribeFallbackInfo lyraxVideoSimulcastSubscribeFallbackInfo) {
                        C1279550jOz.LJIL(this, lyraxVideoSimulcastSubscribeFallbackInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                        C1279550jOz.LJJ(this, lyraxVideoFrameInfo);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public final /* synthetic */ void onVideoSuperResolutionModeChanged(LyraxVideoSuperResolutionMode lyraxVideoSuperResolutionMode, LyraxVideoSuperResolutionModeChangedReason lyraxVideoSuperResolutionModeChangedReason) {
                        C1279550jOz.LJJI(this, lyraxVideoSuperResolutionMode, lyraxVideoSuperResolutionModeChangedReason);
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public void onFirstAudioFrameDecoded() throws JSONException {
                        String str;
                        LyraxStreamKey lyraxStreamKey2 = lyraxStreamKey;
                        if (lyraxStreamKey2 == null || (str = lyraxStreamKey2.userID) == null) {
                            str = "";
                        }
                        ILyraxAVListener iLyraxAVListener = lyraxAVClientImpl.mListener;
                        if (iLyraxAVListener != null) {
                            iLyraxAVListener.onFirstAudioFrameDecoded(str);
                        }
                        LyraxAVClientLog lyraxAVClientLog = lyraxAVClientImpl.mLyraxAVClientLog;
                        if (lyraxAVClientLog != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("user_id", str);
                            lyraxAVClientLog.traceSDKCallback("solution_lyraxSubscriber_onFirstAudioFrameDecoded", jSONObject);
                        }
                    }

                    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
                    public void onSubscriberStateChanged(LyraxSubscriberState lyraxSubscriberState, String str, LyraxErrorCode lyraxErrorCode) throws JSONException {
                        LyraxAVClientLog lyraxAVClientLog = lyraxAVClientImpl.mLyraxAVClientLog;
                        if (lyraxAVClientLog != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("state", lyraxSubscriberState);
                            jSONObject.put("error_code", lyraxErrorCode);
                            jSONObject.put("extra_info", str);
                            lyraxAVClientLog.traceSDKCallback("solution_lyraxRoom_onSubscriberStateChanged", jSONObject);
                        }
                    }
                };
            }
        }, null);
        LyraxAVClientOption lyraxAVClientOption2 = this.mEngineOption;
        int iValue = 0;
        if (lyraxAVClientOption2 != null && (idc = lyraxAVClientOption2.getIdc()) != null && idc.length() > 0 && (iLyraxRoom2 = this.mLyraxRoom) != null) {
            iLyraxRoom2.setPostProcessParameter(new LyraxPostProcessParameter("", idc));
        }
        ILyraxRoom iLyraxRoom3 = this.mLyraxRoom;
        LyraxErrorCode lyraxErrorCodePublish = null;
        if (iLyraxRoom3 != null) {
            lyraxErrorCodeJoinRoom = iLyraxRoom3.joinRoom(lyraxAVClientOption.getRtcToken(), lyraxUserInfoCreate, lyraxRoomConfig);
        }
        LyraxErrorCode lyraxErrorCode = LyraxErrorCode.SUCCESS;
        if (lyraxErrorCodeJoinRoom != lyraxErrorCode) {
            this.mVoiceCallStarted = false;
            LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
            if (lyraxAVClientLog != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", "join room error");
                jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
                if (lyraxErrorCodeJoinRoom != null) {
                    iValue = lyraxErrorCodeJoinRoom.value();
                }
                jSONObject.put("code", iValue);
                lyraxAVClientLog.traceAPICall("solution_startVoiceCall", jSONObject);
                return;
            }
            return;
        }
        setVideoConfig();
        if (!this.mFeaturesConfig.isEmpty() && this.mSdkParams.getEnableNoRoom()) {
            updateFeatureTaskNoRoom();
        }
        ILyraxPublisher orCreatePublisher = getOrCreatePublisher();
        if (orCreatePublisher != null) {
            lyraxErrorCodePublish = orCreatePublisher.publish();
        }
        if (lyraxErrorCodePublish != lyraxErrorCode) {
            this.mVoiceCallStarted = false;
        }
        if (this.mSdkParams.getEnableNoRoom() && (iLyraxRoom = this.mLyraxRoom) != null) {
            iLyraxRoom.addPublisher(this.mLyraxPublisher);
        }
        if (!this.mFeaturesConfig.isEmpty()) {
            updateFeatureTask();
        }
        LyraxAVClientLog lyraxAVClientLog2 = this.mLyraxAVClientLog;
        if (lyraxAVClientLog2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", "publish");
            jSONObject2.put("rtc_room_id", lyraxAVClientLog2.getMRoomId());
            if (lyraxErrorCodePublish != null) {
                iValue = lyraxErrorCodePublish.value();
            }
            jSONObject2.put("code", iValue);
            lyraxAVClientLog2.traceAPICall("solution_startVoiceCall", jSONObject2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.09D0] */
    private final void parseSdkParams(String str) {
        LyraxAVClientSdkParams lyraxAVClientSdkParams = (LyraxAVClientSdkParams) new C09D1() { // from class: X.09D0
            public final Gson LIZ;

            {
                e eVarLIZ = C09D3.LIZ();
                TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.ss.ttlivestreamer.livestreamv2.tinyjson.GsonParser$registerBooleanTypeAdapter$booleanTypeAdapter$1
                    @Override // com.google.gson.TypeAdapter
                    public final Boolean read(C09CU c09cu) {
                        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                        if (c09d6LJJLIIIJ != null) {
                            int i = C09C1.LIZ[c09d6LJJLIIIJ.ordinal()];
                            boolean z = true;
                            if (i != 1) {
                                boolean z2 = false;
                                if (i != 2) {
                                    if (i == 3) {
                                        String strLJJJZ = c09cu.LJJJZ();
                                        if (!Intrinsics.LJFF("1", strLJJJZ) && !u.LJIJI("true", strLJJJZ, true)) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                } else {
                                    if (c09cu.LJJIL() == 0.0d) {
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(!z2);
                                }
                            } else {
                                return Boolean.valueOf(c09cu.LJJ());
                            }
                        }
                        return Boolean.FALSE;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(C09DL c09dl, Boolean bool) {
                        c09dl.LJJJ(bool);
                    }
                };
                Class cls = Boolean.TYPE;
                eVarLIZ.LIZJ(typeAdapter, cls);
                eVarLIZ.LIZJ(typeAdapter, cls);
                TypeAdapter<Integer> typeAdapter2 = new TypeAdapter<Integer>() { // from class: com.ss.ttlivestreamer.livestreamv2.tinyjson.GsonParser$registerIntegerTypeAdapter$boolAsIntAdapter$1
                    @Override // com.google.gson.TypeAdapter
                    public final Integer read(C09CU c09cu) {
                        C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                        int i = C2335109Cz.LIZ[c09d6LJJLIIIJ.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (C1274040jG6.LIZ()) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Expected BOOLEAN or NUMBER but was ");
                                            sbLIZ.append(c09d6LJJLIIIJ);
                                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    } else {
                                        return Integer.valueOf(Boolean.parseBoolean(c09cu.LJJJZ()) ? 1 : 0);
                                    }
                                } else {
                                    try {
                                        try {
                                            return Integer.valueOf(c09cu.LJJIZ());
                                        } catch (NumberFormatException e) {
                                            e = e;
                                            TryCatchGuardChecker.doCheck(e);
                                            if (C1274040jG6.LIZ()) {
                                                throw new s(e);
                                            }
                                            return 0;
                                        }
                                    } catch (NumberFormatException e2) {
                                        e = e2;
                                    }
                                }
                                return 0;
                            }
                            c09cu.LJJJJJL();
                            return 0;
                        }
                        return Integer.valueOf(c09cu.LJJ() ? 1 : 0);
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void write(C09DL c09dl, Integer num) {
                        Integer num2 = num;
                        if (num2 == null) {
                            c09dl.LJIJJ();
                        } else {
                            c09dl.LJJJJ(num2);
                        }
                    }
                };
                Class cls2 = Integer.TYPE;
                eVarLIZ.LIZJ(typeAdapter2, cls2);
                eVarLIZ.LIZJ(typeAdapter2, cls2);
                this.LIZ = eVarLIZ.LIZ();
            }

            public final <T> T LIZ(String str2, Class<T> cls) {
                if (str2 == null) {
                    return null;
                }
                return (T) GsonProtectorUtils.fromJson(this.LIZ, str2, (Class) cls);
            }
        }.LIZ(str, LyraxAVClientSdkParams.class);
        if (lyraxAVClientSdkParams != null) {
            this.mSdkParams = lyraxAVClientSdkParams;
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public LyraxAVAudioPlayer createAudioPlayer(LyraxAVAudioSource lyraxAVAudioSource) throws JSONException {
        LyraxAVAudioPlayerImpl lyraxAVAudioPlayerImpl = new LyraxAVAudioPlayerImpl(lyraxAVAudioSource, this.mLyraxEngine, this.mSdkParams, this.mLyraxAVClientLog);
        this.mCreatedAudioPlayer = lyraxAVAudioPlayerImpl;
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", LyraxErrorCode.SUCCESS.value());
            jSONObject.put("message", lyraxAVAudioSource.toString());
            lyraxAVClientLog.traceAPICall("solution_createAudioPlayer", jSONObject);
        }
        return lyraxAVAudioPlayerImpl;
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void enableAudioPropertiesMonitor(LyraxAudioPropertiesConfig lyraxAudioPropertiesConfig) {
        ILyraxEngine iLyraxEngine = this.mLyraxEngine;
        if (iLyraxEngine != null) {
            iLyraxEngine.enableAudioPropertiesReport(lyraxAudioPropertiesConfig);
        }
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", LyraxErrorCode.SUCCESS.value());
            jSONObject.put("message", "enableAudioPropertiesMonitor");
            lyraxAVClientLog.traceAPICall("solution_enableAudioPropertiesMonitor", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public int muteLocalVideoStream(boolean z) throws JSONException {
        LyraxErrorCode lyraxErrorCodeUnmute;
        ILyraxPublisher orCreatePublisher = getOrCreatePublisher();
        if (orCreatePublisher == null) {
            LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
            if (lyraxAVClientLog != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", "publishVideo publisher unavailable");
                jSONObject.put("code", LyraxErrorCode.INVALID_STATE.value());
                lyraxAVClientLog.traceAPICall("solution_muteLocalVideoStream", jSONObject);
            }
            return LyraxErrorCode.INVALID_STATE.value();
        }
        if (z) {
            lyraxErrorCodeUnmute = orCreatePublisher.mute(LyraxStreamMediaType.VIDEO);
        } else {
            lyraxErrorCodeUnmute = orCreatePublisher.unmute(LyraxStreamMediaType.VIDEO);
        }
        LyraxAVClientLog lyraxAVClientLog2 = this.mLyraxAVClientLog;
        if (lyraxAVClientLog2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message", "publishVideo");
            jSONObject2.put("code", lyraxErrorCodeUnmute.value());
            jSONObject2.put("state", z);
            lyraxAVClientLog2.traceAPICall("solution_muteLocalVideoStream", jSONObject2);
        }
        return lyraxErrorCodeUnmute.value();
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public int pushExternalVideo(LyraxVideoFrame lyraxVideoFrame) {
        ILyraxPublisher orCreatePublisher = getOrCreatePublisher();
        if (orCreatePublisher == null) {
            return LyraxErrorCode.INVALID_STATE.value();
        }
        LyraxVideoCPUBufferFrameBuilder lyraxVideoCPUBufferFrameBuilder = new LyraxVideoCPUBufferFrameBuilder(LyraxVideoPixelFormat.RGBA);
        lyraxVideoCPUBufferFrameBuilder.setWidth(lyraxVideoFrame.width);
        lyraxVideoCPUBufferFrameBuilder.setHeight(lyraxVideoFrame.height);
        lyraxVideoCPUBufferFrameBuilder.setRotation(LyraxVideoRotation.fromId(lyraxVideoFrame.rotation));
        lyraxVideoCPUBufferFrameBuilder.setTimeStampUs(lyraxVideoFrame.timestamp_us);
        lyraxVideoCPUBufferFrameBuilder.setPlaneData(0, lyraxVideoFrame.buffer);
        lyraxVideoCPUBufferFrameBuilder.setPlaneStride(0, lyraxVideoFrame.width * 4);
        lyraxVideoCPUBufferFrameBuilder.setExtraDataInfo(lyraxVideoFrame.seiData);
        com.ss.lyrax.video.LyraxVideoFrame lyraxVideoFrameBuild = lyraxVideoCPUBufferFrameBuilder.build();
        LyraxErrorCode lyraxErrorCodePushVideoFrame = orCreatePublisher.pushVideoFrame(lyraxVideoFrameBuild);
        lyraxVideoFrameBuild.release();
        return lyraxErrorCodePushVideoFrame.value();
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void setAudioRoute(LyraxAVAudioRoute lyraxAVAudioRoute) throws JSONException {
        int iValue;
        LyraxErrorCode audioRoute;
        ILyraxAudio iLyraxAudio = this.mLyraxAudio;
        if (iLyraxAudio != null && (audioRoute = iLyraxAudio.setAudioRoute(LyraxAudioRoute.fromId(lyraxAVAudioRoute.getValue()))) != null) {
            iValue = audioRoute.value();
        } else {
            iValue = 0;
        }
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", iValue);
            jSONObject.put("route", lyraxAVAudioRoute.getValue());
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            lyraxAVClientLog.traceAPICall("solution_setAudioRoute", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void setDefaultAudioRoute(LyraxAVAudioRoute lyraxAVAudioRoute) {
        int iValue;
        LyraxErrorCode defaultAudioRoute;
        ILyraxAudio iLyraxAudio = this.mLyraxAudio;
        if (iLyraxAudio != null && (defaultAudioRoute = iLyraxAudio.setDefaultAudioRoute(LyraxAudioRoute.fromId(lyraxAVAudioRoute.getValue()))) != null) {
            iValue = defaultAudioRoute.value();
        } else {
            iValue = 0;
        }
        LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
        if (lyraxAVClientLog != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", iValue);
            jSONObject.put("route", lyraxAVAudioRoute.getValue());
            jSONObject.put("rtc_room_id", lyraxAVClientLog.getMRoomId());
            lyraxAVClientLog.traceAPICall("solution_setDefaultAudioRoute", jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public long sendUserMessage(String str, String str2) {
        LyraxErrorCode lyraxErrorCode;
        long jSendUserMessage = -1;
        if (this.mVoiceCallStarted && !a0.LJJJIL(str)) {
            ILyraxRoom iLyraxRoom = this.mLyraxRoom;
            if (iLyraxRoom != null) {
                jSendUserMessage = iLyraxRoom.sendUserMessage(str, str2, LyraxMessageType.RELIABLE_ORDERED);
            }
            LyraxAVClientLog lyraxAVClientLog = this.mLyraxAVClientLog;
            if (lyraxAVClientLog != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("user_id", str);
                jSONObject.put("content", str2);
                jSONObject.put("msg_id", jSendUserMessage);
                if (jSendUserMessage >= 0) {
                    lyraxErrorCode = LyraxErrorCode.SUCCESS;
                } else {
                    lyraxErrorCode = LyraxErrorCode.INVALID_STATE;
                }
                jSONObject.put("code", lyraxErrorCode.value());
                lyraxAVClientLog.traceAPICall("solution_sendUserMessage", jSONObject);
            }
            return jSendUserMessage;
        }
        LyraxAVClientLog lyraxAVClientLog2 = this.mLyraxAVClientLog;
        if (lyraxAVClientLog2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("user_id", str);
            jSONObject2.put("code", LyraxErrorCode.INVALID_STATE.value());
            jSONObject2.put("message", "sendUserMessage invalid state");
            lyraxAVClientLog2.traceAPICall("solution_sendUserMessage", jSONObject2);
        }
        return -1L;
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void setFeature(String str, LyraxTranscoderFeature lyraxTranscoderFeature) {
        if (lyraxTranscoderFeature == null) {
            this.mFeaturesConfig.remove(str);
        } else {
            this.mFeaturesConfig.put(str, lyraxTranscoderFeature);
        }
    }

    @Override // com.ss.bytertc.engine.avclient.ILyraxAVClient
    public void sendSEI(String str, Object obj, int i, boolean z, boolean z2) throws JSONException {
        if (this.mVoiceCallStarted && !a0.LJJJIL(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            LyraxVideoSeiParamV2 lyraxVideoSeiParamV2 = new LyraxVideoSeiParamV2();
            lyraxVideoSeiParamV2.seiData = C786410Ut5.J3(jSONObject).getBytes(Charsets.UTF_8);
            lyraxVideoSeiParamV2.repeatCount = i;
            lyraxVideoSeiParamV2.isKeyFrameOnly = z;
            lyraxVideoSeiParamV2.allowOverwrite = z2;
            ILyraxPublisher iLyraxPublisher = this.mLyraxPublisher;
            if (iLyraxPublisher != null) {
                iLyraxPublisher.sendSEIV2(lyraxVideoSeiParamV2);
            }
        }
    }
}
