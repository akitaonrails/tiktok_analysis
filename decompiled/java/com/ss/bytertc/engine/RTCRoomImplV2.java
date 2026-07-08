package com.ss.bytertc.engine;

import X.C2188811AlT;
import com.bytedance.realx.base.Logging;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.lyraxwrapper.LyraxEngineWrapper;
import com.ss.bytertc.engine.lyraxwrapper.LyraxRoomListenerWrapper;
import com.ss.bytertc.engine.lyraxwrapper.LyraxVideoSinkWrapper;
import com.ss.bytertc.engine.roomimpl.IRTCRoomImplV2EventHandler;
import com.ss.bytertc.engine.roomimpl.RTCPublishConfig;
import com.ss.bytertc.engine.roomimpl.RTCRoomConfigManager;
import com.ss.bytertc.engine.roomimpl.RTCSubscribeConfig;
import com.ss.bytertc.engine.type.DownLinkAudioSelectionPriority;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.audio.LyraxAudioAlignmentMode;
import com.ss.lyrax.audio.LyraxAudioDownLinkSelectionPriority;
import com.ss.lyrax.room.ILyraxRoomAutoSubscribeStrategy;
import com.ss.lyrax.room.LyraxLinkMicType;
import com.ss.lyrax.room.LyraxMessageType;
import com.ss.lyrax.room.LyraxPostProcessParameter;
import com.ss.lyrax.room.LyraxRoomAttribute;
import com.ss.lyrax.room.LyraxRoomConfig;
import com.ss.lyrax.room.LyraxRoomDefaultSubscribeMediaConfig;
import com.ss.lyrax.room.LyraxRoomProfileType;
import com.ss.lyrax.room.LyraxUserInfo;
import com.ss.lyrax.room.LyraxVideoRemoteConfig;
import com.ss.lyrax.stream.LyraxForwardStreamInfo;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.lyrax.video.LyraxVideoCodecConfig;
import com.ss.lyrax.video.LyraxVideoDecoderConfig;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRoomImplV2 extends RTCRoom implements IRTCRoomImplV2EventHandler, ILyraxRoomAutoSubscribeStrategy {
    public LyraxEngineWrapper engineWrapper;
    public LyraxRoomListenerWrapper listenerWrapper;
    public final ILyraxRoom room;
    public RTCRoomConfigManager configManager = new RTCRoomConfigManager();
    public ConcurrentHashMap<StreamIndex, Boolean> publishMap = new ConcurrentHashMap<>(LyraxStreamIndex.kMax.value());
    public volatile boolean user_visiable = true;
    public volatile boolean already_leaved = false;

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int leaveRoom() {
        this.already_leaved = true;
        RTCRoomConfigManager rTCRoomConfigManager = this.configManager;
        if (rTCRoomConfigManager != null) {
            rTCRoomConfigManager.clearConfig();
        }
        clearPublishersAndSubscribers();
        return lyraxErrorToReturnStatus(this.room.leaveRoom()).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        return 0;
    }

    /* JADX INFO: renamed from: com.ss.bytertc.engine.RTCRoomImplV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$lyrax$LyraxErrorCode;

        static {
            int[] iArr = new int[LyraxErrorCode.values().length];
            $SwitchMap$com$ss$lyrax$LyraxErrorCode = iArr;
            try {
                iArr[LyraxErrorCode.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.INVALID_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.INVALID_PARAMS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.NOT_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.HAS_IN_ROOM.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$lyrax$LyraxErrorCode[LyraxErrorCode.FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    private void clearPublishersAndSubscribers() {
        Logging.e("RTCRoomImplV2", "clearPublishersAndSubscribers");
        LyraxEngineWrapper lyraxEngineWrapper = this.engineWrapper;
        if (lyraxEngineWrapper != null) {
            lyraxEngineWrapper.removeRoomSubscribers(getRoomId());
            this.engineWrapper.removeRemoteVideoSinkAdaptersForRoom(getRoomId());
            Iterator<Map.Entry<StreamIndex, Boolean>> it2 = this.publishMap.entrySet().iterator();
            while (it2.hasNext()) {
                StreamIndex key = it2.next().getKey();
                ILyraxPublisher publisher = this.engineWrapper.getPublisher(key);
                if (publisher != null) {
                    this.room.removePublisher(publisher);
                }
                this.engineWrapper.removeRoomPublisher(getRoomId(), key);
                this.engineWrapper.removePublisher(key);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removePublisher + index: ");
                sbLIZ.append(key.value());
                Logging.e("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ));
                it2.remove();
            }
        }
    }

    private void publish() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publish: _already_leave: ");
        sbLIZ.append(this.already_leaved);
        sbLIZ.append(", _user_visiable: ");
        sbLIZ.append(this.user_visiable);
        this.engineWrapper.getEngine().reportAPICall("java_publish", new String(C2188811AlT.LIZIZ(sbLIZ)));
        ConcurrentHashMap<StreamIndex, Boolean> concurrentHashMap = this.publishMap;
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        concurrentHashMap.put(streamIndex, Boolean.TRUE);
        if (!this.already_leaved && this.user_visiable) {
            Logging.e("RTCRoomImplV2", "publish, streamIndex: 0");
            ILyraxPublisher orCreatePublisher = this.engineWrapper.getOrCreatePublisher(streamIndex);
            if (orCreatePublisher == null) {
                return;
            }
            RTCPublishConfig publishConfig = this.configManager.getPublishConfig(streamIndex);
            if (publishConfig.videoStream) {
                orCreatePublisher.unmute(LyraxStreamMediaType.VIDEO);
            } else {
                orCreatePublisher.mute(LyraxStreamMediaType.VIDEO);
            }
            if (publishConfig.audioStream) {
                orCreatePublisher.unmute(LyraxStreamMediaType.AUDIO);
            } else {
                orCreatePublisher.mute(LyraxStreamMediaType.AUDIO);
            }
            updateRoomPublisher(streamIndex);
            this.room.addPublisher(orCreatePublisher);
            this.engineWrapper.addRoomPublisher(getRoomId(), streamIndex);
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public void destroy() {
        LyraxEngineWrapper lyraxEngineWrapper = this.engineWrapper;
        if (lyraxEngineWrapper != null) {
            lyraxEngineWrapper.removeUserRoomEventHandler(getRoomId());
            this.engineWrapper.setRoomLeavedState(getRoomId(), true);
            this.engineWrapper.removeRoom(getRoomId());
        }
        ILyraxRoom iLyraxRoom = this.room;
        if (iLyraxRoom != null) {
            iLyraxRoom.setLyraxRoomAutoSubscribeStrategy(null);
            this.room.dispose();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public String getRoomId() {
        return this.room.getRoomId();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int pauseForwardStreamToAllRooms() {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int replayLivePusherNeedEvent() {
        return lyraxErrorToReturnStatus(this.room.replayUserInfoNotification()).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int resumeForwardStreamToAllRooms() {
        return ReturnStatus.RETURN_STATUS_NOT_SUPPORT.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int stopForwardStreamToRooms() {
        return lyraxErrorToReturnStatus(this.room.stopForwardStreamToRooms()).value();
    }

    private List<LyraxForwardStreamInfo> convertToLyraxForwardStreamInfo(List<ForwardStreamInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ForwardStreamInfo forwardStreamInfo : list) {
            LyraxForwardStreamInfo lyraxForwardStreamInfo = new LyraxForwardStreamInfo();
            lyraxForwardStreamInfo.roomId = forwardStreamInfo.roomId;
            lyraxForwardStreamInfo.token = forwardStreamInfo.token;
            arrayList.add(lyraxForwardStreamInfo);
        }
        return arrayList;
    }

    private LyraxVideoRemoteConfig covertToVideoRemoteConfig(RemoteVideoConfig remoteVideoConfig) {
        return new LyraxVideoRemoteConfig(remoteVideoConfig.width, remoteVideoConfig.height, remoteVideoConfig.framerate);
    }

    private void updateRoomPublisher(StreamIndex streamIndex) {
        if (this.room.getPublisher(LyraxStreamIndex.fromId(streamIndex.value())) != null) {
            this.publishMap.put(streamIndex, Boolean.TRUE);
            this.engineWrapper.addRoomPublisher(getRoomId(), StreamIndex.fromId(streamIndex.value()));
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomAutoSubscribeStrategy
    public LyraxRoomDefaultSubscribeMediaConfig getDefaultSubscribeMediaConfig(LyraxStreamKey lyraxStreamKey) {
        RTCSubscribeConfig subscribeConfig = this.configManager.getSubscribeConfig(lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value()));
        if (subscribeConfig != null) {
            return new LyraxRoomDefaultSubscribeMediaConfig(subscribeConfig.subAudio, subscribeConfig.subVideo);
        }
        return null;
    }

    public ReturnStatus lyraxErrorToReturnStatus(LyraxErrorCode lyraxErrorCode) {
        ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_NOT_SUPPORT;
        switch (AnonymousClass1.$SwitchMap$com$ss$lyrax$LyraxErrorCode[lyraxErrorCode.ordinal()]) {
            case 1:
                return ReturnStatus.RETURN_STATUS_SUCCESS;
            case 2:
                return ReturnStatus.RETURN_STATUS_WRONG_STATE;
            case 3:
                return ReturnStatus.RETURN_STATUS_PARAMETER_ERR;
            case 4:
            default:
                return returnStatus;
            case 5:
                return ReturnStatus.RETURN_STATUS_HAS_IN_ROOM;
            case 6:
                return ReturnStatus.RETURN_STATUS_FAILURE;
        }
    }

    @Override // com.ss.bytertc.engine.roomimpl.IRTCRoomImplV2EventHandler
    public void onRoomError(int i) {
        clearPublishersAndSubscribers();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        LyraxStreamMediaType lyraxStreamMediaType;
        if (pauseResumeControlMediaType == PauseResumeControlMediaType.AUDIO) {
            lyraxStreamMediaType = LyraxStreamMediaType.AUDIO;
        } else if (pauseResumeControlMediaType == PauseResumeControlMediaType.VIDEO) {
            lyraxStreamMediaType = LyraxStreamMediaType.VIDEO;
        } else {
            lyraxStreamMediaType = LyraxStreamMediaType.BOTH;
        }
        return lyraxErrorToReturnStatus(this.room.pauseAllSubscribedStream(lyraxStreamMediaType)).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int publishScreen(MediaStreamType mediaStreamType) {
        return publishStream(StreamIndex.STREAM_INDEX_2ND, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int publishStream(MediaStreamType mediaStreamType) {
        return publishStream(StreamIndex.STREAM_INDEX_MAIN, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        LyraxStreamMediaType lyraxStreamMediaType;
        if (pauseResumeControlMediaType == PauseResumeControlMediaType.AUDIO) {
            lyraxStreamMediaType = LyraxStreamMediaType.AUDIO;
        } else if (pauseResumeControlMediaType == PauseResumeControlMediaType.VIDEO) {
            lyraxStreamMediaType = LyraxStreamMediaType.VIDEO;
        } else {
            lyraxStreamMediaType = LyraxStreamMediaType.BOTH;
        }
        return lyraxErrorToReturnStatus(this.room.resumeAllSubscribedStream(lyraxStreamMediaType)).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendRoomBinaryMessage(byte[] bArr) {
        return this.room.sendRoomMessage(new String(bArr));
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendRoomMessage(String str) {
        return this.room.sendRoomMessage(str);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setBizSessionId(String str) {
        return lyraxErrorToReturnStatus(this.room.setRoomAttribute(LyraxRoomAttribute.BUSINESS_SESSION_ID, new LyraxValue(str))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setBusinessLabel(String str) {
        return lyraxErrorToReturnStatus(this.room.setRoomAttribute(LyraxRoomAttribute.BUSINESS_LABEL, new LyraxValue(str))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setDefaultRemoteVideoConfig(RemoteVideoConfig remoteVideoConfig) {
        return lyraxErrorToReturnStatus(this.room.setDefaultRemoteVideoConfig(covertToVideoRemoteConfig(remoteVideoConfig))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setGroupChannelId(String str) {
        return lyraxErrorToReturnStatus(this.room.setRoomAttribute(LyraxRoomAttribute.GROUP_CHANNEL_ID, new LyraxValue(str))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setLinkMicType(LinkMicType linkMicType) {
        return lyraxErrorToReturnStatus(this.room.setLinkMicType(LyraxLinkMicType.fromId(linkMicType.value))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setPostProcessParameter(PostProcessParameter postProcessParameter) {
        return lyraxErrorToReturnStatus(this.room.setPostProcessParameter(new LyraxPostProcessParameter(postProcessParameter.getStreamName(), postProcessParameter.getAnchorIDCName()))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.listenerWrapper.setRoomEventHandler(iRTCRoomEventHandler);
        if (this.engineWrapper != null) {
            String roomId = this.room.getRoomId();
            if (iRTCRoomEventHandler != null) {
                this.engineWrapper.setUserRoomEventHandler(roomId, iRTCRoomEventHandler);
                return 0;
            }
            this.engineWrapper.removeUserRoomEventHandler(roomId);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteRoomAudioPlaybackVolume(int i) {
        return lyraxErrorToReturnStatus(this.room.setRemoteAudioPlaybackVolume(i)).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setUserVisibility(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUserVisibility, enable:");
        sbLIZ.append(z);
        Logging.e("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ));
        int iValue = lyraxErrorToReturnStatus(this.room.setUserVisibility(z)).value();
        this.user_visiable = z;
        if (!z) {
            Iterator<Map.Entry<StreamIndex, Boolean>> it2 = this.publishMap.entrySet().iterator();
            while (it2.hasNext()) {
                StreamIndex key = it2.next().getKey();
                this.room.removePublisher(this.engineWrapper.getOrCreatePublisher(key));
                this.engineWrapper.removePublisher(key);
                this.engineWrapper.removeRoomPublisher(getRoomId(), key);
                if (key != StreamIndex.STREAM_INDEX_MAIN) {
                    it2.remove();
                }
            }
            this.engineWrapper.setRoomLeavedState(getRoomId(), true);
        } else {
            ConcurrentHashMap<StreamIndex, Boolean> concurrentHashMap = this.publishMap;
            StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
            if (concurrentHashMap.containsKey(streamIndex)) {
                ILyraxPublisher orCreatePublisher = this.engineWrapper.getOrCreatePublisher(streamIndex);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setUserVisibility, enable:");
                sbLIZ2.append(z);
                Logging.e("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ2));
                if (orCreatePublisher != null) {
                    this.room.addPublisher(orCreatePublisher);
                    return iValue;
                }
            }
        }
        return iValue;
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        if (list != null && list.size() != 0) {
            return lyraxErrorToReturnStatus(this.room.startForwardStreamToRooms(convertToLyraxForwardStreamInfo(list))).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unpublishScreen(MediaStreamType mediaStreamType) {
        return unpublishStream(StreamIndex.STREAM_INDEX_2ND, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unpublishStream(MediaStreamType mediaStreamType) {
        return unpublishStream(StreamIndex.STREAM_INDEX_MAIN, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        if (list != null && list.size() != 0) {
            return lyraxErrorToReturnStatus(this.room.updateForwardStreamToRooms(convertToLyraxForwardStreamInfo(list))).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int updateToken(String str) {
        return lyraxErrorToReturnStatus(this.room.updateToken(str)).value();
    }

    public RTCRoomImplV2(ILyraxRoom iLyraxRoom, LyraxEngineWrapper lyraxEngineWrapper) {
        this.room = iLyraxRoom;
        this.engineWrapper = lyraxEngineWrapper;
        LyraxRoomListenerWrapper lyraxRoomListenerWrapper = new LyraxRoomListenerWrapper(getRoomId(), this, lyraxEngineWrapper);
        this.listenerWrapper = lyraxRoomListenerWrapper;
        iLyraxRoom.setListener(lyraxRoomListenerWrapper);
        if (lyraxEngineWrapper != null) {
            lyraxEngineWrapper.setRoomLeavedState(getRoomId(), false);
        }
        iLyraxRoom.setLyraxRoomAutoSubscribeStrategy(this);
    }

    @Override // com.ss.bytertc.engine.roomimpl.IRTCRoomImplV2EventHandler
    public void onCreateLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) {
        long timestamp;
        ILyraxRoom iLyraxRoom;
        ILyraxRoom iLyraxRoom2;
        RTCRoomConfigManager.LyraxVideoRemoteConfigWrapper videoConfig = this.configManager.getVideoConfig(lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value()));
        RTCRoomConfigManager.LyraxVideoPerfDegradeLimitWrapper videoPerfLimit = this.configManager.getVideoPerfLimit(lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value()));
        long timestamp2 = 0;
        if (videoConfig != null) {
            timestamp = videoConfig.getTimestamp();
        } else {
            timestamp = 0;
        }
        if (videoPerfLimit != null) {
            timestamp2 = videoPerfLimit.getTimestamp();
        }
        if (timestamp > timestamp2) {
            if (videoConfig != null) {
                iLyraxSubscriber.setVideoRemoteConfig(videoConfig.getConfig());
            }
            if (videoPerfLimit != null && (iLyraxRoom2 = this.room) != null) {
                iLyraxRoom2.setVideoPerfDegradeLimit(lyraxStreamKey.userID, lyraxStreamKey.streamIndex, videoPerfLimit.getLimit());
            }
        } else {
            if (videoPerfLimit != null && (iLyraxRoom = this.room) != null) {
                iLyraxRoom.setVideoPerfDegradeLimit(lyraxStreamKey.userID, lyraxStreamKey.streamIndex, videoPerfLimit.getLimit());
            }
            if (videoConfig != null) {
                iLyraxSubscriber.setVideoRemoteConfig(videoConfig.getConfig());
            }
        }
        LyraxAudioAlignmentMode audioAlignmentProperty = this.engineWrapper.getAudioAlignmentProperty(lyraxStreamKey);
        if (audioAlignmentProperty != null) {
            iLyraxSubscriber.setAudioAlignmentProperty(audioAlignmentProperty);
        }
        Integer remoteAudioPlaybackVolume = this.engineWrapper.getRemoteAudioPlaybackVolume(lyraxStreamKey);
        if (remoteAudioPlaybackVolume != null) {
            iLyraxSubscriber.setAudioPlaybackVolume(remoteAudioPlaybackVolume.intValue());
        }
        LyraxVideoDecoderConfig videoDecoderConfig = this.engineWrapper.getVideoDecoderConfig(lyraxStreamKey);
        if (videoDecoderConfig != null) {
            iLyraxSubscriber.setVideoDecoderConfig(videoDecoderConfig);
        } else {
            List<LyraxVideoCodecConfig> videoCodecConfig = this.engineWrapper.getVideoCodecConfig();
            if (videoCodecConfig != null && !videoCodecConfig.isEmpty()) {
                iLyraxSubscriber.setVideoDecoderConfig(new LyraxVideoDecoderConfig(null, videoCodecConfig));
            }
        }
        synchronized (this.engineWrapper.getSubscriberAddSinkLock()) {
            try {
                LyraxVideoSinkWrapper remoteVideoSinkAdapter = this.engineWrapper.getRemoteVideoSinkAdapter(lyraxStreamKey);
                if (remoteVideoSinkAdapter != null) {
                    iLyraxSubscriber.addVideoFrameSink(remoteVideoSinkAdapter, remoteVideoSinkAdapter.getRequiredFormat());
                }
                LyraxVideoRenderConfig remoteVideoRenderConfig = this.engineWrapper.getRemoteVideoRenderConfig(lyraxStreamKey);
                if (remoteVideoRenderConfig != null) {
                    iLyraxSubscriber.setVideoRenderConfig(remoteVideoRenderConfig);
                }
                LyraxRoomDefaultSubscribeMediaConfig defaultSubscribeMediaConfig = getDefaultSubscribeMediaConfig(lyraxStreamKey);
                if (defaultSubscribeMediaConfig != null) {
                    if (defaultSubscribeMediaConfig.isSubscribeVideo() && defaultSubscribeMediaConfig.isSubscribeAudio()) {
                        iLyraxSubscriber.unmute(LyraxStreamMediaType.BOTH);
                    } else {
                        if (defaultSubscribeMediaConfig.isSubscribeVideo()) {
                            iLyraxSubscriber.unmute(LyraxStreamMediaType.VIDEO);
                        } else {
                            iLyraxSubscriber.mute(LyraxStreamMediaType.VIDEO);
                        }
                        if (defaultSubscribeMediaConfig.isSubscribeAudio()) {
                            iLyraxSubscriber.unmute(LyraxStreamMediaType.AUDIO);
                        } else {
                            iLyraxSubscriber.mute(LyraxStreamMediaType.AUDIO);
                        }
                    }
                }
                this.engineWrapper.addSubscriber(lyraxStreamKey, iLyraxSubscriber);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.bytertc.engine.roomimpl.IRTCRoomImplV2EventHandler
    public void onRemoveLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoveLyraxSubscriber, room_id:");
        sbLIZ.append(lyraxStreamKey.roomID);
        sbLIZ.append(", user_id:");
        sbLIZ.append(lyraxStreamKey.userID);
        Logging.i("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ));
        this.engineWrapper.removeSubscriber(lyraxStreamKey);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishStream: streamIndex: ");
        sbLIZ.append(streamIndex);
        sbLIZ.append(", mediaStreamType: ");
        sbLIZ.append(mediaStreamType);
        sbLIZ.append(", _already_leave: ");
        sbLIZ.append(this.already_leaved);
        sbLIZ.append(", _user_visiable: ");
        sbLIZ.append(this.user_visiable);
        this.engineWrapper.getEngine().reportAPICall("java_publishStream", new String(C2188811AlT.LIZIZ(sbLIZ)));
        if (this.already_leaved) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        if (!this.user_visiable) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("publishStream, streamIndex: ");
        sbLIZ2.append(streamIndex);
        Logging.e("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ2));
        ILyraxPublisher orCreatePublisher = this.engineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher == null) {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        this.configManager.muteLocalStream(streamIndex, mediaStreamType, MuteState.MUTE_STATE_OFF);
        orCreatePublisher.unmute(LyraxStreamMediaType.fromId(mediaStreamType.value));
        updateRoomPublisher(streamIndex);
        if (!this.publishMap.containsKey(streamIndex)) {
            MediaStreamType mediaStreamType2 = MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH;
            if (mediaStreamType != mediaStreamType2) {
                this.configManager.muteLocalStream(streamIndex, MediaStreamType.valueOf(mediaStreamType.value ^ mediaStreamType2.value), MuteState.MUTE_STATE_ON);
                orCreatePublisher.mute(LyraxStreamMediaType.fromId(mediaStreamType.value ^ mediaStreamType2.value));
            }
            this.room.addPublisher(orCreatePublisher);
            this.publishMap.put(streamIndex, Boolean.TRUE);
            LyraxEngineWrapper lyraxEngineWrapper = this.engineWrapper;
            if (lyraxEngineWrapper != null) {
                lyraxEngineWrapper.addRoomPublisher(getRoomId(), streamIndex);
            }
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setDownLinkAudioSelectionPriority(StreamIndex streamIndex, DownLinkAudioSelectionPriority downLinkAudioSelectionPriority) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDownLinkAudioSelectionPriority, streamIndex: ");
        sbLIZ.append(streamIndex);
        sbLIZ.append(", downLinkAudioSelectionPriority: ");
        sbLIZ.append(downLinkAudioSelectionPriority);
        Logging.e("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ));
        ILyraxPublisher orCreatePublisher = this.engineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher != null) {
            return lyraxErrorToReturnStatus(orCreatePublisher.setAudioDownLinkSelectionPriority(LyraxAudioDownLinkSelectionPriority.fromId(downLinkAudioSelectionPriority.value()))).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    public void setMixStreamObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        LyraxRoomListenerWrapper lyraxRoomListenerWrapper = this.listenerWrapper;
        if (lyraxRoomListenerWrapper != null) {
            lyraxRoomListenerWrapper.setMixStreamObserver(str, iMixedStreamObserver);
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig) {
        return setRemoteVideoConfig(str, StreamIndex.STREAM_INDEX_MAIN, remoteVideoConfig);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        this.configManager.muteAllRemoteStreams(streamIndex, mediaStreamType, MuteState.MUTE_STATE_OFF);
        return lyraxErrorToReturnStatus(this.room.unmuteAllRemoteStream(LyraxStreamIndex.fromId(streamIndex.value()), LyraxStreamMediaType.valueOf(mediaStreamType.value))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeScreen(String str, MediaStreamType mediaStreamType) {
        return subscribeStream(str, StreamIndex.STREAM_INDEX_2ND, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeStream(String str, MediaStreamType mediaStreamType) {
        return subscribeStream(str, StreamIndex.STREAM_INDEX_MAIN, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unpublishStream: streamIndex: ");
        sbLIZ.append(streamIndex);
        sbLIZ.append(", mediaStreamType: ");
        sbLIZ.append(mediaStreamType);
        sbLIZ.append(", _already_leave: ");
        sbLIZ.append(this.already_leaved);
        sbLIZ.append(", _user_visiable: ");
        sbLIZ.append(this.user_visiable);
        this.engineWrapper.getEngine().reportAPICall("java_unpublishStream", new String(C2188811AlT.LIZIZ(sbLIZ)));
        if (this.already_leaved) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        this.configManager.muteLocalStream(streamIndex, mediaStreamType, MuteState.MUTE_STATE_ON);
        updateRoomPublisher(streamIndex);
        if (!this.publishMap.containsKey(streamIndex)) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("unpublishStream, streamIndex: ");
        sbLIZ2.append(streamIndex);
        Logging.e("RTCRoomImplV2", C2188811AlT.LIZIZ(sbLIZ2));
        ILyraxPublisher orCreatePublisher = this.engineWrapper.getOrCreatePublisher(streamIndex);
        if (orCreatePublisher == null) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        RTCPublishConfig publishConfig = this.configManager.getPublishConfig(streamIndex);
        if (streamIndex != StreamIndex.STREAM_INDEX_MAIN && !publishConfig.audioStream && !publishConfig.videoStream) {
            this.room.removePublisher(orCreatePublisher);
            this.engineWrapper.removePublisher(streamIndex);
            this.engineWrapper.removeRoomPublisher(getRoomId(), streamIndex);
            this.publishMap.remove(streamIndex);
        } else {
            orCreatePublisher.mute(LyraxStreamMediaType.fromId(mediaStreamType.value));
        }
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        this.configManager.muteAllRemoteStreams(streamIndex, mediaStreamType, MuteState.MUTE_STATE_ON);
        return lyraxErrorToReturnStatus(this.room.muteAllRemoteStream(LyraxStreamIndex.fromId(streamIndex.value()), LyraxStreamMediaType.valueOf(mediaStreamType.value))).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeScreen(String str, MediaStreamType mediaStreamType) {
        return unsubscribeStream(str, StreamIndex.STREAM_INDEX_2ND, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeStream(String str, MediaStreamType mediaStreamType) {
        return unsubscribeStream(str, StreamIndex.STREAM_INDEX_MAIN, mediaStreamType);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        LyraxUserInfo lyraxUserInfoCreate = LyraxUserInfo.create(userInfo.uid, userInfo.extraInfo);
        LyraxRoomProfileType lyraxRoomProfileTypeFromId = LyraxRoomProfileType.fromId(rTCRoomConfig.profile.value());
        boolean z = rTCRoomConfig.isAutoPublish;
        boolean z2 = rTCRoomConfig.isAutoSubscribeAudio;
        boolean z3 = rTCRoomConfig.isAutoSubscribeVideo;
        LyraxEngineWrapper lyraxEngineWrapper = this.engineWrapper;
        LyraxErrorCode lyraxErrorCodeJoinRoom = this.room.joinRoom(str, lyraxUserInfoCreate, new LyraxRoomConfig(lyraxRoomProfileTypeFromId, z, z2, z3, lyraxEngineWrapper, lyraxEngineWrapper));
        this.already_leaved = false;
        if (lyraxErrorCodeJoinRoom == LyraxErrorCode.SUCCESS && rTCRoomConfig.isAutoPublish) {
            publish();
        }
        LyraxEngineWrapper lyraxEngineWrapper2 = this.engineWrapper;
        if (lyraxEngineWrapper2 != null) {
            lyraxEngineWrapper2.setRoomLeavedState(getRoomId(), false);
        }
        return lyraxErrorToReturnStatus(lyraxErrorCodeJoinRoom).value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        return this.room.sendUserMessage(str, new String(bArr), LyraxMessageType.fromId(messageConfig.value()));
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        return this.room.sendUserMessage(str, str2, LyraxMessageType.fromId(messageConfig.value()));
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        ILyraxSubscriber subscriber = this.engineWrapper.getSubscriber(new StreamKey(this.room.getRoomId(), str, streamIndex));
        LyraxVideoRemoteConfig lyraxVideoRemoteConfigCovertToVideoRemoteConfig = covertToVideoRemoteConfig(remoteVideoConfig);
        this.configManager.setVideoConfig(str, streamIndex, new RTCRoomConfigManager.LyraxVideoRemoteConfigWrapper(lyraxVideoRemoteConfigCovertToVideoRemoteConfig));
        if (subscriber != null) {
            return lyraxErrorToReturnStatus(subscriber.setVideoRemoteConfig(lyraxVideoRemoteConfigCovertToVideoRemoteConfig)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteVideoPerformanceConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit = new LyraxVideoPerfDegradeLimit(remoteVideoConfig.width, remoteVideoConfig.height, remoteVideoConfig.framerate);
        LyraxStreamIndex lyraxStreamIndexFromId = LyraxStreamIndex.fromId(streamIndex.value());
        RTCRoomConfigManager.LyraxVideoPerfDegradeLimitWrapper lyraxVideoPerfDegradeLimitWrapper = new RTCRoomConfigManager.LyraxVideoPerfDegradeLimitWrapper(lyraxVideoPerfDegradeLimit);
        RTCRoomConfigManager rTCRoomConfigManager = this.configManager;
        if (rTCRoomConfigManager != null) {
            rTCRoomConfigManager.setVideoPerfLimit(str, streamIndex, lyraxVideoPerfDegradeLimitWrapper);
        }
        ILyraxRoom iLyraxRoom = this.room;
        if (iLyraxRoom != null) {
            return lyraxErrorToReturnStatus(iLyraxRoom.setVideoPerfDegradeLimit(str, lyraxStreamIndexFromId, lyraxVideoPerfDegradeLimit)).value();
        }
        return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeStream: userId: ");
        sbLIZ.append(str);
        sbLIZ.append(", streamIndex: ");
        sbLIZ.append(streamIndex);
        sbLIZ.append(", mediaStreamType: ");
        sbLIZ.append(mediaStreamType);
        sbLIZ.append(", _already_leave: ");
        sbLIZ.append(this.already_leaved);
        sbLIZ.append(", _user_visiable: ");
        sbLIZ.append(this.user_visiable);
        this.engineWrapper.getEngine().reportAPICall("java_subscribeStream", new String(C2188811AlT.LIZIZ(sbLIZ)));
        if (this.already_leaved) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        this.configManager.muteRemoteStream(str, streamIndex, mediaStreamType, MuteState.MUTE_STATE_OFF);
        ILyraxSubscriber subscriber = this.engineWrapper.getSubscriber(new StreamKey(this.room.getRoomId(), str, streamIndex));
        if (subscriber == null) {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        subscriber.unmute(LyraxStreamMediaType.fromId(mediaStreamType.value));
        return ReturnStatus.RETURN_STATUS_SUCCESS.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeStream: userId: ");
        sbLIZ.append(str);
        sbLIZ.append(", streamIndex: ");
        sbLIZ.append(streamIndex);
        sbLIZ.append(", mediaStreamType: ");
        sbLIZ.append(mediaStreamType);
        sbLIZ.append(", _already_leave: ");
        sbLIZ.append(this.already_leaved);
        sbLIZ.append(", _user_visiable: ");
        sbLIZ.append(this.user_visiable);
        this.engineWrapper.getEngine().reportAPICall("java_unsubscribeStream", new String(C2188811AlT.LIZIZ(sbLIZ)));
        if (this.already_leaved) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        this.configManager.muteRemoteStream(str, streamIndex, mediaStreamType, MuteState.MUTE_STATE_ON);
        ILyraxSubscriber subscriber = this.engineWrapper.getSubscriber(new StreamKey(this.room.getRoomId(), str, streamIndex));
        if (subscriber == null) {
            return ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        return lyraxErrorToReturnStatus(subscriber.mute(LyraxStreamMediaType.fromId(mediaStreamType.value))).value();
    }
}
