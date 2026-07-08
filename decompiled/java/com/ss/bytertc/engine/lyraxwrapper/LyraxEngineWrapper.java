package com.ss.bytertc.engine.lyraxwrapper;

import X.C1277610jLr;
import X.C1277670jLx;
import X.C1279550jOz;
import X.C2188811AlT;
import android.os.Build;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.lyrax.ILyraxAudio;
import com.ss.lyrax.ILyraxEngine;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.ILyraxVideo;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioAlignmentMode;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.engine.ILyraxEngineListener;
import com.ss.lyrax.engine.LyraxConnectionState;
import com.ss.lyrax.engine.LyraxEngineImpl;
import com.ss.lyrax.engine.LyraxEngineOption;
import com.ss.lyrax.engine.LyraxNativeLibraryLoadStatus;
import com.ss.lyrax.engine.LyraxNetworkType;
import com.ss.lyrax.engine.LyraxSysStats;
import com.ss.lyrax.publisher.ILyraxPublisherListener;
import com.ss.lyrax.publisher.LyraxPublisherOption;
import com.ss.lyrax.publisher.LyraxPublisherState;
import com.ss.lyrax.room.LyraxRoomOption;
import com.ss.lyrax.stream.LyraxAudioLocalState;
import com.ss.lyrax.stream.LyraxFirstFramePlayState;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.stream.LyraxStreamProtocol;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.stream.LyraxVideoLocalState;
import com.ss.lyrax.subscriber.ILyraxSubscriberListener;
import com.ss.lyrax.subscriber.ILyraxSubscriberListenerFactory;
import com.ss.lyrax.subscriber.ILyraxSubscriberVideoSinkFactory;
import com.ss.lyrax.subscriber.LyraxSubscriberState;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.video.ILyraxVideoFrameSink;
import com.ss.lyrax.video.LyraxVideoCodecConfig;
import com.ss.lyrax.video.LyraxVideoDecoderConfig;
import com.ss.lyrax.video.LyraxVideoExtraData;
import com.ss.lyrax.video.LyraxVideoFrameInfo;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmMode;
import com.ss.lyrax.video.LyraxVideoPerformanceAlarmReason;
import com.ss.lyrax.video.LyraxVideoPixelFormat;
import com.ss.lyrax.video.LyraxVideoRendererManager;
import com.ss.lyrax.video.LyraxVideoSEIStreamEvent;
import com.ss.lyrax.video.LyraxVideoSimulcastSubscribeFallbackInfo;
import com.ss.lyrax.video.LyraxVideoSourceConfig;
import com.ss.lyrax.video.LyraxVideoSourceWantedData;
import com.ss.lyrax.video.LyraxVideoSuperResolutionMode;
import com.ss.lyrax.video.LyraxVideoSuperResolutionModeChangedReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxEngineWrapper implements ILyraxSubscriberListenerFactory, ILyraxSubscriberVideoSinkFactory {
    public final ConcurrentHashMap<LyraxStreamKey, LyraxAudioAlignmentMode> audioAlignmentModeMap;
    public final ConcurrentHashMap<LyraxStreamKey, Integer> audioVolumeMap;
    public List<LyraxVideoCodecConfig> codecConfigs;
    public final ConcurrentHashMap<LyraxStreamKey, LyraxVideoDecoderConfig> decoderConfigMap;
    public final ConcurrentHashMap<LyraxStreamIndex, LyraxVideoSinkWrapper> localVideoSinkMap;
    public ILyraxAudio lyraxAudio;
    public final ILyraxEngine lyraxEngine;
    public final ConcurrentHashMap<StreamIndex, ILyraxPublisher> lyraxPublishers;
    public final ConcurrentHashMap<String, Set<StreamIndex>> lyraxRoomPublisherSet;
    public final ConcurrentHashMap<String, ILyraxRoom> lyraxRooms;
    public final ConcurrentHashMap<LyraxStreamKey, ILyraxSubscriber> lyraxSubscribers;
    public ILyraxVideo lyraxVideo;
    public final ConcurrentHashMap<LyraxStreamIndex, LyraxVideoPerfDegradeLimit> perfLimitationMap;
    public final ConcurrentHashMap<LyraxStreamKey, LyraxVideoSinkWrapper> remoteVideoSinkMap;
    public final ConcurrentHashMap<String, Boolean> roomHasLeavedFlags;
    public final ConcurrentHashMap<LyraxStreamIndex, LyraxVideoSourceConfig> sourceConfigMap;
    public final Object subscriberAddSinkLock;
    public final ConcurrentHashMap<String, IRTCRoomEventHandler> userRoomEventHandlers;
    public final AtomicReference<IRTCVideoEventHandler> userVideoEventHandler;

    public static /* synthetic */ Set LIZ(StreamIndex streamIndex, String str, Set set) {
        lambda$removeRoomPublisher$1(streamIndex, str, set);
        return set;
    }

    public synchronized ILyraxAudio getAudioModule() {
        return this.lyraxAudio;
    }

    public synchronized ILyraxAudio getOrCreateAudioModule() {
        if (this.lyraxAudio == null) {
            this.lyraxAudio = createAudioModule();
        }
        return this.lyraxAudio;
    }

    public synchronized ILyraxVideo getVideoModule() {
        if (this.lyraxVideo == null) {
            this.lyraxVideo = createVideoModule();
        }
        return this.lyraxVideo;
    }

    public synchronized LyraxVideoRendererManager getVideoRendererManager() {
        ILyraxVideo videoModule;
        videoModule = getVideoModule();
        return videoModule == null ? null : videoModule.getVideoRendererManager();
    }

    /* JADX INFO: renamed from: com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason;

        static {
            int[] iArr = new int[LyraxVideoPerformanceAlarmReason.values().length];
            $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason = iArr;
            try {
                iArr[LyraxVideoPerformanceAlarmReason.BANDWIDTH_FALLBACKED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[LyraxVideoPerformanceAlarmReason.BANDWIDTH_RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[LyraxVideoPerformanceAlarmReason.PERFORMANCE_FALLBACKED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[LyraxVideoPerformanceAlarmReason.PERFORMANCE_RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    private ILyraxAudio createAudioModule() {
        return this.lyraxEngine.getAudioModule();
    }

    private ILyraxVideo createVideoModule() {
        return this.lyraxEngine.getVideoModule();
    }

    public void dispose() {
        for (ILyraxPublisher iLyraxPublisher : this.lyraxPublishers.values()) {
            if (iLyraxPublisher != null) {
                iLyraxPublisher.dispose();
            }
        }
        this.lyraxPublishers.clear();
        for (ILyraxSubscriber iLyraxSubscriber : this.lyraxSubscribers.values()) {
            if (iLyraxSubscriber != null) {
                iLyraxSubscriber.dispose();
            }
        }
        this.lyraxSubscribers.clear();
        for (ILyraxRoom iLyraxRoom : this.lyraxRooms.values()) {
            if (iLyraxRoom != null) {
                iLyraxRoom.dispose();
            }
        }
        this.lyraxRooms.clear();
        ILyraxAudio iLyraxAudio = this.lyraxAudio;
        if (iLyraxAudio != null) {
            iLyraxAudio.dispose();
            this.lyraxAudio = null;
        }
        ILyraxEngine iLyraxEngine = this.lyraxEngine;
        if (iLyraxEngine != null) {
            iLyraxEngine.dispose();
        }
    }

    public List<ILyraxPublisher> getAllPublishers() {
        return new ArrayList(this.lyraxPublishers.values());
    }

    public List<ILyraxSubscriber> getAllSubscribers() {
        return new ArrayList(this.lyraxSubscribers.values());
    }

    public IRTCVideoEventHandler getUserVideoEventHandler() {
        return this.userVideoEventHandler.get();
    }

    public ILyraxEngine getEngine() {
        return this.lyraxEngine;
    }

    public Object getSubscriberAddSinkLock() {
        return this.subscriberAddSinkLock;
    }

    public List<LyraxVideoCodecConfig> getVideoCodecConfig() {
        return this.codecConfigs;
    }

    private ILyraxEngine createEngine(LyraxEngineOption lyraxEngineOption) {
        ILyraxEngine iLyraxEngineCreate = ILyraxEngine.create(lyraxEngineOption);
        iLyraxEngineCreate.setListener(new ILyraxEngineListener() { // from class: com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper.1
            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public final /* synthetic */ void onNativeLibraryLoadInfo(LyraxNativeLibraryLoadStatus lyraxNativeLibraryLoadStatus, String str) {
                C1277670jLx.LJI(this, lyraxNativeLibraryLoadStatus, str);
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onDisposed() {
                C1277670jLx.LIZJ(this);
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onConnectionStateChanged(LyraxConnectionState lyraxConnectionState) {
                C1277670jLx.LIZ(this, lyraxConnectionState);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onConnectionStateChanged(lyraxConnectionState.value(), -1);
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onInitializedEngineEGL(GLESVersion gLESVersion) {
                C1277670jLx.LJ(this, gLESVersion);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onInitializedEngineEGL(gLESVersion);
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onNetworkTypeChanged(LyraxNetworkType lyraxNetworkType) {
                C1277670jLx.LJII(this, lyraxNetworkType);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onNetworkTypeChanged(lyraxNetworkType.value());
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onSysStats(LyraxSysStats lyraxSysStats) {
                C1277670jLx.LJIIIIZZ(this, lyraxSysStats);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onSysStats(LyraxEngineWrapper.this.convertLyraxStatsToSysStats(lyraxSysStats));
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onCreateRoomStateChanged(String str, LyraxErrorCode lyraxErrorCode) {
                C1277670jLx.LIZIZ(this, str, lyraxErrorCode);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null && lyraxErrorCode == LyraxErrorCode.SIGNALING_ROOM_ID_ILLEGAL) {
                    iRTCVideoEventHandler.onCreateRoomStateChanged(str, -1007);
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onExtensionAccessError(String str, String str2) {
                C1277670jLx.LIZLLL(this, str, str2);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onExtensionAccessError(str, str2);
                }
            }

            @Override // com.ss.lyrax.engine.ILyraxEngineListener
            public void onLogReport(String str, String str2) {
                C1277670jLx.LJFF(this, str, str2);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_key", "local_debug_log");
                        jSONObject.put("log_level", str);
                        jSONObject.put("log_content", str2);
                        iRTCVideoEventHandler.onLogReport(str, jSONObject);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLogReport callback catch exception.\n");
                        sbLIZ.append(e.getMessage());
                        LogUtil.e("LyraxEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        });
        return iLyraxEngineCreate;
    }

    private ILyraxPublisher createPublisher(final StreamIndex streamIndex) {
        LyraxPublisherOption lyraxPublisherOption = new LyraxPublisherOption();
        lyraxPublisherOption.streamIndex = LyraxStreamIndex.fromId(streamIndex.value());
        lyraxPublisherOption.enableMixing = false;
        final ILyraxPublisher iLyraxPublisherCreatePublisher = this.lyraxEngine.createPublisher(lyraxPublisherOption);
        if (iLyraxPublisherCreatePublisher == null) {
            LogUtil.e("LyraxEngineWrapper", "createPublisher return null.\n");
            return null;
        }
        LyraxVideoSourceConfig videoSourceConfig = getVideoSourceConfig(LyraxStreamIndex.fromId(streamIndex.value()));
        if (videoSourceConfig != null) {
            iLyraxPublisherCreatePublisher.setVideoSourceConfig(videoSourceConfig);
        }
        LyraxVideoSinkWrapper localVideoSinkAdapter = getLocalVideoSinkAdapter(LyraxStreamIndex.fromId(streamIndex.value()));
        if (localVideoSinkAdapter != null) {
            iLyraxPublisherCreatePublisher.addVideoFrameSink(localVideoSinkAdapter, localVideoSinkAdapter.getRequiredFormat());
        }
        LyraxVideoPerfDegradeLimit videoPerfLimitation = getVideoPerfLimitation(LyraxStreamIndex.fromId(streamIndex.value()));
        if (videoPerfLimitation != null) {
            iLyraxPublisherCreatePublisher.setVideoPerfDegradeLimit(videoPerfLimitation);
            this.perfLimitationMap.remove(LyraxStreamIndex.fromId(streamIndex.value()));
        }
        iLyraxPublisherCreatePublisher.setListenerInternal(new ILyraxPublisherListener() { // from class: com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper.2
            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public final /* synthetic */ void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
                C1277610jLr.LIZLLL(this, lyraxTranscoderFeatureEvent);
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public final /* synthetic */ void onStreamProtocolChanged(LyraxStreamProtocol lyraxStreamProtocol) {
                C1277610jLr.LJIIIZ(this, lyraxStreamProtocol);
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onFirstAudioFrameCaptured() {
                C1277610jLr.LJ(this);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onFirstLocalAudioFrame(streamIndex);
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onAudioLocalStateChanged(LyraxAudioLocalState lyraxAudioLocalState) {
                FirstFrameSendState firstFrameSendState;
                C1277610jLr.LIZ(this, lyraxAudioLocalState);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                String str = new String();
                String str2 = new String();
                Iterator<ILyraxRoom> it2 = LyraxEngineWrapper.this.lyraxRooms.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ILyraxRoom next = it2.next();
                    if (next != null && next.findPublisher(iLyraxPublisherCreatePublisher)) {
                        str = next.getRoomId();
                        str2 = next.getLocalUserId();
                        break;
                    }
                }
                if (iRTCVideoEventHandler != null) {
                    if (lyraxAudioLocalState == LyraxAudioLocalState.BEGIN_SEND) {
                        firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
                    } else if (lyraxAudioLocalState != LyraxAudioLocalState.FIRST_FRAME_SENT) {
                        return;
                    } else {
                        firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
                    }
                    RtcUser rtcUser = new RtcUser();
                    rtcUser.userId = str2;
                    rtcUser.metaData = "";
                    iRTCVideoEventHandler.onAudioFrameSendStateChanged(str, rtcUser, firstFrameSendState);
                    iRTCVideoEventHandler.onAudioFrameSendStateChanged(new StreamKey(str, str2, streamIndex), "", firstFrameSendState);
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onAudioProfanityDetectedCallback(String str) {
                C1277610jLr.LIZIZ(this, str);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onAudioProfanityDetectedCallback(str);
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo) {
                C1277610jLr.LIZJ(this, lyraxAudioPropertiesInfo);
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onHardwareROISupportStateUpdated(boolean z) {
                C1277610jLr.LJFF(this, z);
                LogUtil.d("LyraxEngineWrapper", "onHardwareROISupportStateUpdated");
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onHardwareROISupportStateUpdated(z);
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onLogMonitor(String str) {
                C1277610jLr.LJI(this, str);
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats) {
                C1277610jLr.LJII(this, lyraxNetworkQualityStats);
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1277610jLr.LJIIJ(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onFirstLocalVideoFrameCaptured(streamIndex, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onVideoLocalStateChanged(LyraxVideoLocalState lyraxVideoLocalState) {
                FirstFrameSendState firstFrameSendState;
                C1277610jLr.LJIIJJI(this, lyraxVideoLocalState);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    if (lyraxVideoLocalState == LyraxVideoLocalState.BEGIN_SEND) {
                        firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
                    } else if (lyraxVideoLocalState != LyraxVideoLocalState.FIRST_FRAME_SENT) {
                        return;
                    } else {
                        firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
                    }
                    String str = new String();
                    String str2 = new String();
                    Iterator<ILyraxRoom> it2 = LyraxEngineWrapper.this.lyraxRooms.values().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ILyraxRoom next = it2.next();
                        if (next != null && next.findPublisher(iLyraxPublisherCreatePublisher)) {
                            str = next.getRoomId();
                            str2 = next.getLocalUserId();
                            break;
                        }
                    }
                    RtcUser rtcUser = new RtcUser();
                    rtcUser.userId = str2;
                    rtcUser.metaData = "";
                    StreamKey streamKey = new StreamKey(str, str2, streamIndex);
                    iRTCVideoEventHandler.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
                    if (streamIndex == StreamIndex.STREAM_INDEX_MAIN) {
                        iRTCVideoEventHandler.onVideoFrameSendStateChanged(streamKey, new String(""), firstFrameSendState);
                    }
                    if (streamIndex == StreamIndex.STREAM_INDEX_2ND) {
                        iRTCVideoEventHandler.onScreenVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
                    }
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1277610jLr.LJIILIIL(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onLocalVideoSizeChanged(streamIndex, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onPublisherStateChanged(LyraxPublisherState lyraxPublisherState, LyraxErrorCode lyraxErrorCode, int i) {
                C1277610jLr.LJIIIIZZ(this, lyraxPublisherState, lyraxErrorCode, i);
            }

            @Override // com.ss.lyrax.publisher.ILyraxPublisherListener
            public void onVideoPerformanceAlarms(LyraxVideoPerformanceAlarmMode lyraxVideoPerformanceAlarmMode, LyraxVideoPerformanceAlarmReason lyraxVideoPerformanceAlarmReason, LyraxVideoSourceWantedData lyraxVideoSourceWantedData) {
                PerformanceAlarmMode performanceAlarmMode;
                C1277610jLr.LJIIL(this, lyraxVideoPerformanceAlarmMode, lyraxVideoPerformanceAlarmReason, lyraxVideoSourceWantedData);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    if (lyraxVideoPerformanceAlarmMode == LyraxVideoPerformanceAlarmMode.NORMAL) {
                        performanceAlarmMode = PerformanceAlarmMode.NORMAL;
                    } else {
                        performanceAlarmMode = PerformanceAlarmMode.SIMULCAST;
                    }
                    PerformanceAlarmReason performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_FALLBACKED;
                    int i = AnonymousClass4.$SwitchMap$com$ss$lyrax$video$LyraxVideoPerformanceAlarmReason[lyraxVideoPerformanceAlarmReason.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i == 4) {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            }
                        } else {
                            performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_RESUMED;
                        }
                    } else {
                        performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
                    }
                    SourceWantedData sourceWantedData = new SourceWantedData();
                    sourceWantedData.width = lyraxVideoSourceWantedData.width;
                    sourceWantedData.height = lyraxVideoSourceWantedData.height;
                    sourceWantedData.frameRate = lyraxVideoSourceWantedData.frameRate;
                    String str = new String();
                    Iterator<ILyraxRoom> it2 = LyraxEngineWrapper.this.lyraxRooms.values().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ILyraxRoom next = it2.next();
                        if (next != null && next.findPublisher(iLyraxPublisherCreatePublisher)) {
                            str = next.getRoomId();
                            break;
                        }
                    }
                    if (streamIndex == StreamIndex.STREAM_INDEX_MAIN) {
                        iRTCVideoEventHandler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, sourceWantedData);
                    }
                }
            }
        });
        return iLyraxPublisherCreatePublisher;
    }

    private ILyraxRoom createRoom(String str) {
        LyraxRoomOption lyraxRoomOption = new LyraxRoomOption();
        lyraxRoomOption.roomId = str;
        return this.lyraxEngine.createRoom(lyraxRoomOption);
    }

    public String buildRenderId(LyraxStreamKey lyraxStreamKey) {
        if (lyraxStreamKey == null) {
            return null;
        }
        return LyraxEngineImpl.buildRemoteVideoRenderId(lyraxStreamKey.userID, lyraxStreamKey.streamIndex);
    }

    public SysStats convertLyraxStatsToSysStats(LyraxSysStats lyraxSysStats) {
        SysStats sysStats = new SysStats();
        sysStats.cpuAppUsage = lyraxSysStats.cpuAppUsage;
        sysStats.cpuTotalUsage = lyraxSysStats.cpuTotalUsage;
        sysStats.cpuCores = lyraxSysStats.cpuCores;
        sysStats.memoryUsage = lyraxSysStats.memoryUsage;
        sysStats.memoryRatio = lyraxSysStats.memoryRatio;
        sysStats.freeMemory = lyraxSysStats.freeMemory;
        sysStats.fullMemory = lyraxSysStats.fullMemory;
        sysStats.totalMemoryRatio = lyraxSysStats.totalMemoryRatio;
        sysStats.totalMemoryUsage = lyraxSysStats.totalMemoryUsage;
        return sysStats;
    }

    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListenerFactory
    public ILyraxSubscriberListener createLyraxSubscriberListener(final LyraxStreamKey lyraxStreamKey) {
        final StreamKey streamKey = new StreamKey(lyraxStreamKey.roomID, lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value()));
        return new ILyraxSubscriberListener() { // from class: com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper.3
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
            public final /* synthetic */ void onVideoFirstFrameDemuxed(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJIIL(this, lyraxVideoFrameInfo);
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public final /* synthetic */ void onVideoFirstFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJIILJJIL(this, lyraxVideoFrameInfo);
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public final /* synthetic */ void onVideoFirstPacketReceived(long j) {
                C1279550jOz.LJIILLIIL(this, j);
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public final /* synthetic */ void onVideoPreDecodeStallHappened(long j) {
                C1279550jOz.LJIJI(this, j);
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onFirstAudioFrameDecoded() {
                C1279550jOz.LJ(this);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onFirstRemoteAudioFrame(streamKey);
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onAudioPropertiesReport(LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo) {
                C1279550jOz.LIZIZ(this, lyraxAudioPropertiesInfo);
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoFirstFrameDecoded(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJIIJJI(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onFirstRemoteVideoFrameDecoded(streamKey, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoFirstFrameRealRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJIILIIL(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onRemoteVideoFrameRelRendered(streamKey, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoFirstFrameRenderedEnd(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJIILL(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onFirstRemoteVideoFrameRendered(streamKey, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoFramePlayStateChanged(LyraxFirstFramePlayState lyraxFirstFramePlayState) {
                C1279550jOz.LJIIZILJ(this, lyraxFirstFramePlayState);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    FirstFramePlayState firstFramePlayStateFromId = FirstFramePlayState.fromId(lyraxFirstFramePlayState.value());
                    RtcUser rtcUser = new RtcUser();
                    rtcUser.userId = streamKey.getUserId();
                    if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
                        iRTCVideoEventHandler.onVideoFramePlayStateChanged(streamKey.getRoomId(), rtcUser, firstFramePlayStateFromId);
                    }
                    if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_2ND) {
                        iRTCVideoEventHandler.onScreenVideoFramePlayStateChanged(streamKey.getRoomId(), rtcUser, firstFramePlayStateFromId);
                    }
                    iRTCVideoEventHandler.onVideoFramePlayStateChanged(streamKey, "", firstFramePlayStateFromId);
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoFrameRendered(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJIJ(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onRemoteVideoFrameRendered(streamKey, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoSEIReceived(LyraxVideoExtraData lyraxVideoExtraData) {
                C1279550jOz.LJIJJ(this, lyraxVideoExtraData);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onSEIMessageReceived(streamKey, lyraxVideoExtraData.getSeiData());
                    VideoExternalData videoExternalData = new VideoExternalData();
                    videoExternalData.setDataId(lyraxVideoExtraData.getChannelId());
                    videoExternalData.setData(lyraxVideoExtraData.getSeiData());
                    iRTCVideoEventHandler.onSEIMessageReceived(streamKey, videoExternalData);
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoSEIStreamChanged(LyraxVideoSEIStreamEvent lyraxVideoSEIStreamEvent) {
                SEIStreamUpdateEvent sEIStreamUpdateEvent;
                C1279550jOz.LJIJJLI(this, lyraxVideoSEIStreamEvent);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    if (lyraxVideoSEIStreamEvent == LyraxVideoSEIStreamEvent.STREAM_ADD) {
                        sEIStreamUpdateEvent = SEIStreamUpdateEvent.STREAM_ADD;
                    } else {
                        sEIStreamUpdateEvent = SEIStreamUpdateEvent.STREAM_REMOVE;
                    }
                    iRTCVideoEventHandler.onSEIStreamUpdate(streamKey, sEIStreamUpdateEvent);
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoSimulcastFallback(LyraxVideoSimulcastSubscribeFallbackInfo lyraxVideoSimulcastSubscribeFallbackInfo) {
                C1279550jOz.LJIL(this, lyraxVideoSimulcastSubscribeFallbackInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    InternalRemoteStreamSwitch internalRemoteStreamSwitch = new InternalRemoteStreamSwitch();
                    internalRemoteStreamSwitch.uid = streamKey.getUserId();
                    internalRemoteStreamSwitch.isScreen = lyraxVideoSimulcastSubscribeFallbackInfo.isScreen;
                    internalRemoteStreamSwitch.beforeVideoIndex = lyraxVideoSimulcastSubscribeFallbackInfo.beforeSimulcastLayerIndex;
                    internalRemoteStreamSwitch.afterVideoIndex = lyraxVideoSimulcastSubscribeFallbackInfo.afterSimulcastLayerIndex;
                    internalRemoteStreamSwitch.beforeEnable = lyraxVideoSimulcastSubscribeFallbackInfo.beforeEnable;
                    internalRemoteStreamSwitch.afterEnable = lyraxVideoSimulcastSubscribeFallbackInfo.afterEnable;
                    internalRemoteStreamSwitch.reason = lyraxVideoSimulcastSubscribeFallbackInfo.reason.value();
                    RemoteStreamSwitch remoteStreamSwitch = new RemoteStreamSwitch(internalRemoteStreamSwitch);
                    if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
                        iRTCVideoEventHandler.onSimulcastSubscribeFallback(remoteStreamSwitch);
                    }
                    iRTCVideoEventHandler.onSimulcastSubscribeFallback(streamKey, remoteStreamSwitch);
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoSizeChanged(LyraxVideoFrameInfo lyraxVideoFrameInfo) {
                C1279550jOz.LJJ(this, lyraxVideoFrameInfo);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onRemoteVideoSizeChanged(streamKey, new VideoFrameInfo(lyraxVideoFrameInfo.width, lyraxVideoFrameInfo.height, lyraxVideoFrameInfo.rotation.value()));
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onAudioFramePlayStateChanged(String str, LyraxFirstFramePlayState lyraxFirstFramePlayState) {
                C1279550jOz.LIZ(this, str, lyraxFirstFramePlayState);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                FirstFramePlayState firstFramePlayStateFromId = FirstFramePlayState.fromId(lyraxFirstFramePlayState.value());
                RtcUser rtcUser = new RtcUser();
                rtcUser.userId = streamKey.getUserId();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onAudioFramePlayStateChanged(streamKey.getRoomId(), rtcUser, firstFramePlayStateFromId);
                    iRTCVideoEventHandler.onAudioFramePlayStateChanged(streamKey, str, firstFramePlayStateFromId);
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onVideoSuperResolutionModeChanged(LyraxVideoSuperResolutionMode lyraxVideoSuperResolutionMode, LyraxVideoSuperResolutionModeChangedReason lyraxVideoSuperResolutionModeChangedReason) {
                C1279550jOz.LJJI(this, lyraxVideoSuperResolutionMode, lyraxVideoSuperResolutionModeChangedReason);
                IRTCVideoEventHandler iRTCVideoEventHandler = LyraxEngineWrapper.this.userVideoEventHandler.get();
                if (iRTCVideoEventHandler != null) {
                    iRTCVideoEventHandler.onRemoteVideoSuperResolutionModeChanged(streamKey, VideoSuperResolutionMode.fromId(lyraxVideoSuperResolutionMode.value()), VideoSuperResolutionModeChangedReason.fromId(lyraxVideoSuperResolutionModeChangedReason.value()));
                }
            }

            @Override // com.ss.lyrax.subscriber.ILyraxSubscriberListener
            public void onSubscriberStateChanged(LyraxSubscriberState lyraxSubscriberState, String str, LyraxErrorCode lyraxErrorCode) {
                C1279550jOz.LJIIIIZZ(this, lyraxSubscriberState, str, lyraxErrorCode);
                IRTCRoomEventHandler iRTCRoomEventHandler = LyraxEngineWrapper.this.userRoomEventHandlers.get(lyraxStreamKey.roomID);
                if (iRTCRoomEventHandler != null) {
                    if (lyraxErrorCode != LyraxErrorCode.SUCCESS) {
                        iRTCRoomEventHandler.onRoomError(lyraxErrorCode.value());
                    }
                    iRTCRoomEventHandler.onStreamStateChanged(streamKey.getRoomId(), streamKey.getUserId(), lyraxErrorCode.value(), str);
                }
            }
        };
    }

    public LyraxAudioAlignmentMode getAudioAlignmentProperty(LyraxStreamKey lyraxStreamKey) {
        return this.audioAlignmentModeMap.get(lyraxStreamKey);
    }

    public LyraxVideoSinkWrapper getLocalVideoSinkAdapter(LyraxStreamIndex lyraxStreamIndex) {
        return this.localVideoSinkMap.get(lyraxStreamIndex);
    }

    public ILyraxPublisher getOrCreatePublisher(StreamIndex streamIndex) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getOrCreatePublisher, streamIndex:");
        sbLIZ.append(streamIndex.value());
        Logging.e("LyraxEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher iLyraxPublisherCreatePublisher = this.lyraxPublishers.get(streamIndex);
        if (iLyraxPublisherCreatePublisher == null && (iLyraxPublisherCreatePublisher = createPublisher(streamIndex)) != null) {
            this.lyraxPublishers.put(streamIndex, iLyraxPublisherCreatePublisher);
        }
        return iLyraxPublisherCreatePublisher;
    }

    public ILyraxRoom getOrCreateRoom(String str) {
        ILyraxRoom iLyraxRoomCreateRoom = this.lyraxRooms.get(str);
        if (iLyraxRoomCreateRoom != null || (iLyraxRoomCreateRoom = createRoom(str)) != null) {
            this.lyraxRooms.put(str, iLyraxRoomCreateRoom);
        }
        return iLyraxRoomCreateRoom;
    }

    public ILyraxPublisher getPublisher(StreamIndex streamIndex) {
        return this.lyraxPublishers.get(streamIndex);
    }

    public Integer getRemoteAudioPlaybackVolume(LyraxStreamKey lyraxStreamKey) {
        return this.audioVolumeMap.get(lyraxStreamKey);
    }

    public LyraxVideoRenderConfig getRemoteVideoRenderConfig(LyraxStreamKey lyraxStreamKey) {
        LyraxVideoRendererManager videoRendererManager;
        String strBuildRenderId = buildRenderId(lyraxStreamKey);
        if (strBuildRenderId == null || strBuildRenderId.isEmpty() || (videoRendererManager = getVideoRendererManager()) == null) {
            return null;
        }
        return videoRendererManager.getVideoRenderConfig(strBuildRenderId);
    }

    public LyraxVideoSinkWrapper getRemoteVideoSinkAdapter(LyraxStreamKey lyraxStreamKey) {
        return this.remoteVideoSinkMap.get(lyraxStreamKey);
    }

    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberVideoSinkFactory
    public LyraxVideoPixelFormat getRequiredPixelFormat(LyraxStreamKey lyraxStreamKey) {
        LyraxVideoSinkWrapper remoteVideoSinkAdapter = getRemoteVideoSinkAdapter(lyraxStreamKey);
        if (remoteVideoSinkAdapter != null) {
            return remoteVideoSinkAdapter.getRequiredFormat();
        }
        return LyraxVideoPixelFormat.I420;
    }

    public ILyraxRoom getRoom(String str) {
        return this.lyraxRooms.get(str);
    }

    public Map<StreamIndex, ILyraxPublisher> getSpecialRoomPublishers(String str) {
        final HashMap map = new HashMap();
        if (Build.VERSION.SDK_INT >= 24) {
            Set<StreamIndex> orDefault = this.lyraxRoomPublisherSet.getOrDefault(str, Collections.emptySet());
            if (orDefault == null) {
                return map;
            }
            orDefault.forEach(new Consumer() { // from class: X.0jMv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.LL.lambda$getSpecialRoomPublishers$2(map, (StreamIndex) obj);
                }
            });
        } else {
            Set<StreamIndex> set = this.lyraxRoomPublisherSet.get(str);
            if (set == null) {
                return map;
            }
            for (StreamIndex streamIndex : set) {
                ILyraxPublisher iLyraxPublisher = this.lyraxPublishers.get(streamIndex);
                if (iLyraxPublisher != null) {
                    map.put(streamIndex, iLyraxPublisher);
                }
            }
        }
        return map;
    }

    public Map<LyraxStreamKey, ILyraxSubscriber> getSpecialRoomSubscribers(String str) {
        HashMap map = new HashMap();
        for (Map.Entry<LyraxStreamKey, ILyraxSubscriber> entry : this.lyraxSubscribers.entrySet()) {
            if (entry.getKey().roomID.equals(str)) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    public ILyraxSubscriber getSubscriber(StreamKey streamKey) {
        if (streamKey != null && streamKey.getStreamIndex() != null) {
            return this.lyraxSubscribers.get(new LyraxStreamKey("", streamKey.getRoomId(), streamKey.getUserId(), LyraxStreamIndex.fromId(streamKey.getStreamIndex().value())));
        }
        return null;
    }

    public LyraxVideoDecoderConfig getVideoDecoderConfig(LyraxStreamKey lyraxStreamKey) {
        return this.decoderConfigMap.get(lyraxStreamKey);
    }

    @Override // com.ss.lyrax.subscriber.ILyraxSubscriberVideoSinkFactory
    public ILyraxVideoFrameSink getVideoFrameSink(LyraxStreamKey lyraxStreamKey) {
        LyraxVideoSinkWrapper remoteVideoSinkAdapter = getRemoteVideoSinkAdapter(lyraxStreamKey);
        if (remoteVideoSinkAdapter != null) {
            return remoteVideoSinkAdapter;
        }
        return null;
    }

    public LyraxVideoPerfDegradeLimit getVideoPerfLimitation(LyraxStreamIndex lyraxStreamIndex) {
        return this.perfLimitationMap.get(lyraxStreamIndex);
    }

    public LyraxVideoSourceConfig getVideoSourceConfig(LyraxStreamIndex lyraxStreamIndex) {
        return this.sourceConfigMap.get(lyraxStreamIndex);
    }

    public LyraxVideoSinkWrapper removeLocalVideoSinkAdapter(LyraxStreamIndex lyraxStreamIndex) {
        return this.localVideoSinkMap.remove(lyraxStreamIndex);
    }

    public void removePublisher(StreamIndex streamIndex) {
        ILyraxPublisher iLyraxPublisher = this.lyraxPublishers.get(streamIndex);
        if (iLyraxPublisher != null) {
            iLyraxPublisher.dispose();
        }
        this.lyraxPublishers.remove(streamIndex);
    }

    public LyraxVideoSinkWrapper removeRemoteVideoSinkAdapter(LyraxStreamKey lyraxStreamKey) {
        return this.remoteVideoSinkMap.remove(lyraxStreamKey);
    }

    public void removeRemoteVideoSinkAdaptersForRoom(String str) {
        String str2;
        Iterator<Map.Entry<LyraxStreamKey, LyraxVideoSinkWrapper>> it2 = this.remoteVideoSinkMap.entrySet().iterator();
        while (it2.hasNext()) {
            LyraxStreamKey key = it2.next().getKey();
            if (key != null && (str2 = key.roomID) != null && str2.equals(str)) {
                this.remoteVideoSinkMap.remove(key);
            }
        }
    }

    public void removeRoom(String str) {
        if (this.lyraxRooms.containsKey(str)) {
            this.lyraxRooms.remove(str);
        }
    }

    public void removeRoomSubscribers(String str) {
        for (Map.Entry<LyraxStreamKey, ILyraxSubscriber> entry : getSpecialRoomSubscribers(str).entrySet()) {
            ILyraxSubscriber iLyraxSubscriber = this.lyraxSubscribers.get(entry.getKey());
            if (iLyraxSubscriber == entry.getValue()) {
                if (iLyraxSubscriber != null) {
                    iLyraxSubscriber.dispose();
                }
                this.lyraxSubscribers.remove(entry.getKey());
            }
        }
    }

    public void removeSubscriber(LyraxStreamKey lyraxStreamKey) {
        if (lyraxStreamKey == null) {
            return;
        }
        ILyraxSubscriber iLyraxSubscriber = this.lyraxSubscribers.get(lyraxStreamKey);
        if (iLyraxSubscriber != null) {
            iLyraxSubscriber.dispose();
        }
        this.lyraxSubscribers.remove(lyraxStreamKey);
    }

    public void removeUserRoomEventHandler(String str) {
        this.userRoomEventHandlers.remove(str);
    }

    public void setUserVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        this.userVideoEventHandler.set(iRTCVideoEventHandler);
    }

    public void setVideoCodecConfig(List<LyraxVideoCodecConfig> list) {
        this.codecConfigs = list;
    }

    public LyraxEngineWrapper(LyraxEngineOption lyraxEngineOption, IRTCVideoEventHandler iRTCVideoEventHandler) {
        AtomicReference<IRTCVideoEventHandler> atomicReference = new AtomicReference<>();
        this.userVideoEventHandler = atomicReference;
        this.userRoomEventHandlers = new ConcurrentHashMap<>();
        this.lyraxRooms = new ConcurrentHashMap<>();
        this.lyraxRoomPublisherSet = new ConcurrentHashMap<>();
        this.roomHasLeavedFlags = new ConcurrentHashMap<>();
        this.lyraxPublishers = new ConcurrentHashMap<>();
        this.lyraxSubscribers = new ConcurrentHashMap<>();
        this.sourceConfigMap = new ConcurrentHashMap<>();
        this.perfLimitationMap = new ConcurrentHashMap<>();
        this.remoteVideoSinkMap = new ConcurrentHashMap<>();
        this.localVideoSinkMap = new ConcurrentHashMap<>();
        this.decoderConfigMap = new ConcurrentHashMap<>();
        this.codecConfigs = null;
        this.audioAlignmentModeMap = new ConcurrentHashMap<>();
        this.audioVolumeMap = new ConcurrentHashMap<>();
        this.subscriberAddSinkLock = new Object();
        atomicReference.set(iRTCVideoEventHandler);
        this.lyraxEngine = createEngine(lyraxEngineOption);
        createAudioModule();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSpecialRoomPublishers$2(Map map, StreamIndex streamIndex) {
        ILyraxPublisher iLyraxPublisher = this.lyraxPublishers.get(streamIndex);
        if (iLyraxPublisher != null) {
            map.put(streamIndex, iLyraxPublisher);
        }
    }

    public int addPublisher(StreamIndex streamIndex, ILyraxPublisher iLyraxPublisher) {
        if (this.lyraxPublishers.get(streamIndex) == null) {
            this.lyraxPublishers.put(streamIndex, iLyraxPublisher);
            return 0;
        }
        return -1;
    }

    public void addRoomPublisher(String str, StreamIndex streamIndex) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.lyraxRoomPublisherSet.computeIfAbsent(str, new Function() { // from class: X.0jNE
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ConcurrentHashMap.newKeySet();
                }
            }).add(streamIndex);
            return;
        }
        Set<StreamIndex> hashSet = this.lyraxRoomPublisherSet.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>(LyraxStreamIndex.kMax.value());
        }
        hashSet.add(streamIndex);
        this.lyraxRoomPublisherSet.put(str, hashSet);
    }

    public void addSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) {
        if (iLyraxSubscriber != null && lyraxStreamKey != null) {
            this.lyraxSubscribers.put(lyraxStreamKey, iLyraxSubscriber);
        }
    }

    public void removeRoomPublisher(String str, final StreamIndex streamIndex) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.lyraxRoomPublisherSet.computeIfPresent(str, new BiFunction() { // from class: X.0jMw
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Set set = (Set) obj2;
                    LyraxEngineWrapper.lambda$removeRoomPublisher$1(streamIndex, (String) obj, set);
                    return set;
                }
            });
            return;
        }
        Set<StreamIndex> set = this.lyraxRoomPublisherSet.get(str);
        if (set == null) {
            return;
        }
        set.remove(streamIndex);
        this.lyraxRoomPublisherSet.put(str, set);
    }

    public void setAudioAlignmentProperty(LyraxStreamKey lyraxStreamKey, LyraxAudioAlignmentMode lyraxAudioAlignmentMode) {
        this.audioAlignmentModeMap.put(lyraxStreamKey, lyraxAudioAlignmentMode);
    }

    public void setLocalVideoSinkAdapter(LyraxStreamIndex lyraxStreamIndex, LyraxVideoSinkWrapper lyraxVideoSinkWrapper) {
        this.localVideoSinkMap.put(lyraxStreamIndex, lyraxVideoSinkWrapper);
    }

    public void setRemoteAudioPlaybackVolume(LyraxStreamKey lyraxStreamKey, int i) {
        this.audioVolumeMap.put(lyraxStreamKey, Integer.valueOf(i));
    }

    public void setRemoteVideoSinkAdapater(LyraxStreamKey lyraxStreamKey, LyraxVideoSinkWrapper lyraxVideoSinkWrapper) {
        this.remoteVideoSinkMap.put(lyraxStreamKey, lyraxVideoSinkWrapper);
    }

    public void setRoomLeavedState(String str, boolean z) {
        this.roomHasLeavedFlags.put(str, Boolean.valueOf(z));
    }

    public void setUserRoomEventHandler(String str, IRTCRoomEventHandler iRTCRoomEventHandler) {
        if (str != null && !str.isEmpty() && iRTCRoomEventHandler != null) {
            this.userRoomEventHandlers.put(str, iRTCRoomEventHandler);
        }
    }

    public void setVideoDecoderConfig(LyraxStreamKey lyraxStreamKey, LyraxVideoDecoderConfig lyraxVideoDecoderConfig) {
        this.decoderConfigMap.put(lyraxStreamKey, lyraxVideoDecoderConfig);
    }

    public void setVideoPerfLimitation(LyraxStreamIndex lyraxStreamIndex, LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit) {
        this.perfLimitationMap.put(lyraxStreamIndex, lyraxVideoPerfDegradeLimit);
    }

    public void setVideoSouceConfig(LyraxStreamIndex lyraxStreamIndex, LyraxVideoSourceConfig lyraxVideoSourceConfig) {
        this.sourceConfigMap.put(lyraxStreamIndex, lyraxVideoSourceConfig);
    }

    public static /* synthetic */ Set lambda$removeRoomPublisher$1(StreamIndex streamIndex, String str, Set set) {
        set.remove(streamIndex);
        return set;
    }
}
