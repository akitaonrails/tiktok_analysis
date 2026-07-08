package com.ss.bytertc.engine.lyraxwrapper;

import X.C1279570jP1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.data.AudioPropertiesInfo;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.roomimpl.IRTCRoomImplV2EventHandler;
import com.ss.bytertc.engine.type.LocalAudioStats;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.UserVisibilityChangeError;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.audio.LyraxAudioLocalStats;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.audio.LyraxAudioRemoteStats;
import com.ss.lyrax.room.ILyraxRoomListener;
import com.ss.lyrax.room.LyraxForwardStreamEventInfo;
import com.ss.lyrax.room.LyraxForwardStreamStateInfo;
import com.ss.lyrax.room.LyraxRoomStats;
import com.ss.lyrax.room.LyraxStream;
import com.ss.lyrax.room.LyraxStreamRemoveReason;
import com.ss.lyrax.room.LyraxUserInfo;
import com.ss.lyrax.room.LyraxUserVisibilityChangeError;
import com.ss.lyrax.room.LyraxVideoStreamDescription;
import com.ss.lyrax.stream.LyraxNetworkQualityStats;
import com.ss.lyrax.stream.LyraxPublisherStats;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.stream.LyraxSubscriberStats;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingErrorCode;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderMixingType;
import com.ss.lyrax.video.LyraxVideoLocalStats;
import com.ss.lyrax.video.LyraxVideoRemoteStats;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRoomListenerWrapper implements ILyraxRoomListener {
    public LyraxEngineWrapper engineWrapper;
    public IRTCRoomImplV2EventHandler implHandler;
    public IRTCRoomEventHandler roomEventHandler;
    public String roomId;
    public Map<String, IMixedStreamObserver> mixStreamObserver = new ConcurrentHashMap();
    public final ReadWriteLock roomEventHandlerLock = new ReentrantReadWriteLock();

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public final /* synthetic */ void onJoinRoom() {
        C1279570jP1.LJI(this);
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public final /* synthetic */ void onUserBizSessionId(String str, String str2) {
        C1279570jP1.LJJ(this, str, str2);
    }

    private IRTCRoomEventHandler getRoomEventHandlerSafely() {
        this.roomEventHandlerLock.readLock().lock();
        try {
            IRTCRoomEventHandler iRTCRoomEventHandler = this.roomEventHandler;
            this.roomEventHandlerLock.readLock().unlock();
            return iRTCRoomEventHandler;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.roomEventHandlerLock.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onLeaveRoom() {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onLeaveRoom(null);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onTokenWillExpire() {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onTokenWillExpire();
        }
    }

    private LocalStreamStats covertPublisherStatsToLocalStreamStats(LyraxPublisherStats lyraxPublisherStats) {
        LocalStreamStats localStreamStats = new LocalStreamStats();
        LocalAudioStats localAudioStats = new LocalAudioStats();
        LyraxAudioLocalStats lyraxAudioLocalStats = lyraxPublisherStats.audioStats;
        localAudioStats.sendKBitrate = lyraxAudioLocalStats.sendKBitrate;
        localAudioStats.rtt = lyraxAudioLocalStats.rtt;
        localAudioStats.audioLossRate = lyraxAudioLocalStats.audioLossRate;
        localAudioStats.numChannels = lyraxAudioLocalStats.numChannels;
        localAudioStats.sentSampleRate = lyraxAudioLocalStats.sentSampleRate;
        localAudioStats.recordSampleRate = lyraxAudioLocalStats.recordSampleRate;
        localAudioStats.jitter = lyraxAudioLocalStats.jitter;
        localAudioStats.statsInterval = lyraxPublisherStats.statsInterval;
        localStreamStats.audioStats = localAudioStats;
        LocalVideoStats localVideoStats = new LocalVideoStats();
        LyraxVideoLocalStats lyraxVideoLocalStats = lyraxPublisherStats.videoStats;
        localVideoStats.sentKBitrate = lyraxVideoLocalStats.sentKBitrate;
        localVideoStats.rtt = lyraxVideoLocalStats.rtt;
        localVideoStats.videoLossRate = lyraxVideoLocalStats.videoLossRate;
        localVideoStats.inputFrameRate = lyraxVideoLocalStats.inputFrameRate;
        localVideoStats.sentFrameRate = lyraxVideoLocalStats.sentFrameRate;
        localVideoStats.encoderOutputFrameRate = lyraxVideoLocalStats.encoderOutputFrameRate;
        localVideoStats.rendererOutputFrameRate = lyraxVideoLocalStats.rendererOutputFrameRate;
        localVideoStats.encodedBitrate = lyraxVideoLocalStats.encodedBitrate;
        localVideoStats.encodedFrameWidth = lyraxVideoLocalStats.encodedFrameWidth;
        localVideoStats.encodedFrameHeight = lyraxVideoLocalStats.encodedFrameHeight;
        localVideoStats.encodedFrameCount = lyraxVideoLocalStats.encodedFrameCount;
        localVideoStats.jitter = lyraxVideoLocalStats.jitter;
        localVideoStats.isHardwareCodec = lyraxVideoLocalStats.isHardwareCodec;
        localVideoStats.codecEventCode = lyraxVideoLocalStats.codecEventCode;
        localVideoStats.codecType = lyraxVideoLocalStats.codecType;
        localVideoStats.videoDenoiseMode = lyraxVideoLocalStats.videoDenoiseMode;
        String str = lyraxVideoLocalStats.simEncInfo;
        localVideoStats.simEncInfo = str;
        if (str != null) {
            for (String str2 : str.split("\\+")) {
                if (!str2.isEmpty()) {
                    String[] strArrSplit = str2.split("x");
                    if (strArrSplit.length == 4) {
                        localVideoStats.simEncWidth.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[0])));
                        localVideoStats.simEncHeight.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[1])));
                        localVideoStats.simEncFramerate.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[2])));
                        localVideoStats.simEncBps.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[3])));
                    }
                }
            }
        }
        localVideoStats.statsInterval = lyraxPublisherStats.statsInterval;
        boolean z = lyraxPublisherStats.isScreen;
        localVideoStats.isScreen = z;
        localStreamStats.videoStats = localVideoStats;
        localStreamStats.isScreen = z;
        localStreamStats.txQuality = lyraxPublisherStats.networkStats.uplinkQuality.value();
        localStreamStats.rxQuality = lyraxPublisherStats.networkStats.downlinkQuality.value();
        return localStreamStats;
    }

    private RemoteStreamStats covertSubscriberStatsToRemoteStreamStats(LyraxSubscriberStats lyraxSubscriberStats) {
        RemoteStreamStats remoteStreamStats = new RemoteStreamStats();
        RemoteAudioStats remoteAudioStats = new RemoteAudioStats();
        LyraxAudioRemoteStats lyraxAudioRemoteStats = lyraxSubscriberStats.audioStats;
        remoteAudioStats.receivedKBitrate = lyraxAudioRemoteStats.receivedKBitrate;
        remoteAudioStats.rtt = lyraxAudioRemoteStats.rtt;
        remoteAudioStats.audioLossRate = lyraxAudioRemoteStats.audioLossRate;
        remoteAudioStats.e2eDelay = lyraxAudioRemoteStats.e2eDelay;
        remoteAudioStats.stallCount = lyraxAudioRemoteStats.stallCount;
        remoteAudioStats.stallDuration = lyraxAudioRemoteStats.stallDuration;
        remoteAudioStats.playoutSampleRate = lyraxAudioRemoteStats.playoutSampleRate;
        remoteAudioStats.quality = lyraxAudioRemoteStats.networkQuality;
        remoteAudioStats.jitterBufferDelay = lyraxAudioRemoteStats.jitterBufferDelay;
        remoteAudioStats.numChannels = lyraxAudioRemoteStats.numChannels;
        remoteAudioStats.receivedSampleRate = lyraxAudioRemoteStats.receivedSampleRate;
        remoteAudioStats.frozenRate = lyraxAudioRemoteStats.frozenRate;
        remoteAudioStats.concealedSamples = lyraxAudioRemoteStats.concealedSamples;
        remoteAudioStats.concealmentEvent = lyraxAudioRemoteStats.concealmentEvent;
        remoteAudioStats.decSampleRate = lyraxAudioRemoteStats.decSampleRate;
        remoteAudioStats.decDuration = lyraxAudioRemoteStats.decDuration;
        remoteAudioStats.totalRtt = lyraxAudioRemoteStats.totalRtt;
        remoteAudioStats.jitter = lyraxAudioRemoteStats.jitter;
        remoteAudioStats.statsInterval = lyraxSubscriberStats.statsInterval;
        remoteStreamStats.audioStats = remoteAudioStats;
        RemoteVideoStats remoteVideoStats = new RemoteVideoStats();
        LyraxVideoRemoteStats lyraxVideoRemoteStats = lyraxSubscriberStats.videoStats;
        remoteVideoStats.receivedKBitrate = lyraxVideoRemoteStats.receivedKBitrate;
        remoteVideoStats.rtt = lyraxVideoRemoteStats.rtt;
        remoteVideoStats.videoLossRate = lyraxVideoRemoteStats.videoLossRate;
        remoteVideoStats.width = lyraxVideoRemoteStats.width;
        remoteVideoStats.height = lyraxVideoRemoteStats.height;
        remoteVideoStats.decoderOutputFrameRate = lyraxVideoRemoteStats.decoderOutputFrameRate;
        remoteVideoStats.rendererOutputFrameRate = lyraxVideoRemoteStats.rendererOutputFrameRate;
        remoteVideoStats.e2eDelay = lyraxVideoRemoteStats.e2eDelay;
        remoteVideoStats.stallCount = lyraxVideoRemoteStats.stallCount;
        remoteVideoStats.stallDuration = lyraxVideoRemoteStats.stallDuration;
        remoteVideoStats.videoIndex = lyraxVideoRemoteStats.videoIndex;
        remoteVideoStats.frozenRate = lyraxVideoRemoteStats.frozenRate;
        remoteVideoStats.jitter = lyraxVideoRemoteStats.jitter;
        remoteVideoStats.codecType = lyraxVideoRemoteStats.codecType;
        remoteVideoStats.isHardwareCodec = lyraxVideoRemoteStats.isHardwareCodec;
        remoteVideoStats.codecEventCode = lyraxVideoRemoteStats.codecEventCode;
        remoteVideoStats.superResolutionMode = lyraxVideoRemoteStats.superResolutionMode;
        boolean z = lyraxSubscriberStats.isScreen;
        remoteVideoStats.isScreen = z;
        remoteVideoStats.statsInterval = lyraxSubscriberStats.statsInterval;
        remoteVideoStats.maxqp = lyraxVideoRemoteStats.maxqp;
        remoteStreamStats.videoStats = remoteVideoStats;
        remoteStreamStats.isScreen = z;
        remoteStreamStats.txQuality = lyraxSubscriberStats.networkStats.uplinkQuality.value();
        remoteStreamStats.rxQuality = lyraxSubscriberStats.networkStats.downlinkQuality.value();
        remoteStreamStats.uid = lyraxSubscriberStats.userId;
        return remoteStreamStats;
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onFeatureEvent(lyraxTranscoderFeatureEvent);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onForwardStreamEvent(LyraxForwardStreamEventInfo[] lyraxForwardStreamEventInfoArr) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            ForwardStreamEventInfo[] forwardStreamEventInfoArr = new ForwardStreamEventInfo[lyraxForwardStreamEventInfoArr.length];
            for (int i = 0; i < lyraxForwardStreamEventInfoArr.length; i++) {
                LyraxForwardStreamEventInfo lyraxForwardStreamEventInfo = lyraxForwardStreamEventInfoArr[i];
                forwardStreamEventInfoArr[i] = new ForwardStreamEventInfo(lyraxForwardStreamEventInfo.roomId, ForwardStreamEventInfo.ForwardStreamEvent.fromId(lyraxForwardStreamEventInfo.event.value()));
            }
            roomEventHandlerSafely.onForwardStreamEvent(forwardStreamEventInfoArr);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onForwardStreamStateChanged(LyraxForwardStreamStateInfo[] lyraxForwardStreamStateInfoArr) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            ForwardStreamStateInfo[] forwardStreamStateInfoArr = new ForwardStreamStateInfo[lyraxForwardStreamStateInfoArr.length];
            for (int i = 0; i < lyraxForwardStreamStateInfoArr.length; i++) {
                LyraxForwardStreamStateInfo lyraxForwardStreamStateInfo = lyraxForwardStreamStateInfoArr[i];
                forwardStreamStateInfoArr[i] = new ForwardStreamStateInfo(lyraxForwardStreamStateInfo.roomId, ForwardStreamStateInfo.ForwardStreamState.fromId(lyraxForwardStreamStateInfo.state.value()), ForwardStreamStateInfo.ForwardStreamError.fromId(lyraxForwardStreamStateInfo.error.value()));
            }
            roomEventHandlerSafely.onForwardStreamStateChanged(forwardStreamStateInfoArr);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onLocalAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr) {
        IRTCVideoEventHandler userVideoEventHandler = this.engineWrapper.getUserVideoEventHandler();
        LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr = new LocalAudioPropertiesInfo[lyraxAudioPropertiesInfoArr.length];
        for (int i = 0; i < lyraxAudioPropertiesInfoArr.length; i++) {
            LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo = lyraxAudioPropertiesInfoArr[i];
            AudioPropertiesInfo audioPropertiesInfo = new AudioPropertiesInfo(lyraxAudioPropertiesInfo.linearVolume, lyraxAudioPropertiesInfo.nonlinearVolume, lyraxAudioPropertiesInfo.spectrum, lyraxAudioPropertiesInfo.vad);
            audioPropertiesInfo.voicePitch = lyraxAudioPropertiesInfo.voicePitch;
            localAudioPropertiesInfoArr[i] = new LocalAudioPropertiesInfo(StreamIndex.fromId(lyraxAudioPropertiesInfo.index.value()), audioPropertiesInfo);
        }
        if (userVideoEventHandler != null) {
            userVideoEventHandler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRemoteVideoInfoChanged(LyraxStream lyraxStream) {
        IRTCVideoEventHandler userVideoEventHandler = this.engineWrapper.getUserVideoEventHandler();
        if (userVideoEventHandler != null) {
            ArrayList arrayList = new ArrayList();
            for (LyraxVideoStreamDescription lyraxVideoStreamDescription : lyraxStream.videoStreamDescriptions) {
                arrayList.add(new VideoStreamDescription(((Integer) lyraxVideoStreamDescription.videoSize.first).intValue(), ((Integer) lyraxVideoStreamDescription.videoSize.second).intValue(), lyraxVideoStreamDescription.frameRate, lyraxVideoStreamDescription.maxKbps, lyraxVideoStreamDescription.minKbps));
            }
            userVideoEventHandler.onRemoteVideoInfoChanged(new StreamKey(lyraxStream.userId, this.roomId, StreamIndex.fromId(lyraxStream.streamIndex.value())), new RTCStream(lyraxStream.userId, lyraxStream.isScreen, lyraxStream.hasVideo, lyraxStream.hasAudio, arrayList));
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRoomStats(LyraxRoomStats lyraxRoomStats) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            RTCRoomStats rTCRoomStats = new RTCRoomStats();
            rTCRoomStats.totalDuration = lyraxRoomStats.duration;
            rTCRoomStats.txBytes = lyraxRoomStats.txBytes;
            rTCRoomStats.rxBytes = lyraxRoomStats.rxBytes;
            rTCRoomStats.txKBitRate = lyraxRoomStats.txKbitrate;
            rTCRoomStats.rxKBitRate = lyraxRoomStats.rxKbitrate;
            rTCRoomStats.txAudioKBitRate = lyraxRoomStats.txAudioKbitrate;
            rTCRoomStats.rxAudioKBitRate = lyraxRoomStats.rxAudioKbitrate;
            rTCRoomStats.txVideoKBitRate = lyraxRoomStats.txVideoKbitrate;
            rTCRoomStats.rxVideoKBitRate = lyraxRoomStats.rxVideoKbitrate;
            rTCRoomStats.txScreenKBitRate = lyraxRoomStats.txScreenKbitrate;
            rTCRoomStats.rxScreenKBitRate = lyraxRoomStats.rxScreenKbitrate;
            rTCRoomStats.users = lyraxRoomStats.userCount;
            rTCRoomStats.cpuTotalUsage = lyraxRoomStats.cpuTotalUsage;
            rTCRoomStats.cpuAppUsage = lyraxRoomStats.cpuAppUsage;
            rTCRoomStats.txLostrate = lyraxRoomStats.txLostrate;
            rTCRoomStats.rxLostrate = lyraxRoomStats.rxLostrate;
            rTCRoomStats.rtt = lyraxRoomStats.rtt;
            rTCRoomStats.txJitter = lyraxRoomStats.txJitter;
            rTCRoomStats.rxJitter = lyraxRoomStats.rxJitter;
            rTCRoomStats.txCellularKBitrate = lyraxRoomStats.txCellularKbitrate;
            rTCRoomStats.rxCellularKBitrate = lyraxRoomStats.rxCellularKbitrate;
            roomEventHandlerSafely.onRoomStats(rTCRoomStats);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onStreamAdd(LyraxStream lyraxStream) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < lyraxStream.videoStreamDescriptions.size(); i++) {
                arrayList.add(new VideoStreamDescription(((Integer) ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).videoSize.first).intValue(), ((Integer) ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).videoSize.second).intValue(), ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).frameRate, ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).maxKbps, ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).minKbps, 0, 0, ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).encodePreference.getValue()));
            }
            roomEventHandlerSafely.onStreamAdd(new RTCStream(lyraxStream.userId, lyraxStream.isScreen, lyraxStream.hasVideo, lyraxStream.hasAudio, arrayList));
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserStartAudioCapture(String str) {
        IRTCVideoEventHandler userVideoEventHandler = this.engineWrapper.getUserVideoEventHandler();
        if (userVideoEventHandler != null) {
            userVideoEventHandler.onUserStartAudioCapture(this.roomId, str);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserStopAudioCapture(String str) {
        IRTCVideoEventHandler userVideoEventHandler = this.engineWrapper.getUserVideoEventHandler();
        if (userVideoEventHandler != null) {
            userVideoEventHandler.onUserStopAudioCapture(this.roomId, str);
        }
    }

    public void setRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.roomEventHandlerLock.writeLock().lock();
        try {
            this.roomEventHandler = iRTCRoomEventHandler;
            this.roomEventHandlerLock.writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.roomEventHandlerLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onAudioStreamBanned(String str, boolean z) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onAudioStreamBanned(str, z);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onCreateLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) {
        IRTCRoomImplV2EventHandler iRTCRoomImplV2EventHandler = this.implHandler;
        if (iRTCRoomImplV2EventHandler != null) {
            iRTCRoomImplV2EventHandler.onCreateLyraxSubscriber(lyraxStreamKey, iLyraxSubscriber);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onLocalStreamStats(LyraxStreamIndex lyraxStreamIndex, LyraxPublisherStats lyraxPublisherStats) {
        IRTCRoomEventHandler roomEventHandlerSafely;
        IRTCVideoEventHandler userVideoEventHandler;
        StreamIndex streamIndexFromId = StreamIndex.fromId(lyraxStreamIndex.value());
        LocalStreamStats localStreamStatsCovertPublisherStatsToLocalStreamStats = covertPublisherStatsToLocalStreamStats(lyraxPublisherStats);
        if ((streamIndexFromId == StreamIndex.STREAM_INDEX_MAIN || streamIndexFromId == StreamIndex.STREAM_INDEX_2ND) && (roomEventHandlerSafely = getRoomEventHandlerSafely()) != null) {
            roomEventHandlerSafely.onLocalStreamStats(localStreamStatsCovertPublisherStatsToLocalStreamStats);
        }
        LyraxEngineWrapper lyraxEngineWrapper = this.engineWrapper;
        if (lyraxEngineWrapper != null && (userVideoEventHandler = lyraxEngineWrapper.getUserVideoEventHandler()) != null) {
            userVideoEventHandler.onLocalStreamStats(streamIndexFromId, localStreamStatsCovertPublisherStatsToLocalStreamStats);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onNetworkQuality(LyraxNetworkQualityStats lyraxNetworkQualityStats, LyraxNetworkQualityStats[] lyraxNetworkQualityStatsArr) {
        NetworkQualityStats networkQualityStats = new NetworkQualityStats(lyraxNetworkQualityStats.userId, lyraxNetworkQualityStats.fractionLost, lyraxNetworkQualityStats.rtt, lyraxNetworkQualityStats.totalBandwidth, lyraxNetworkQualityStats.txQuality.value(), lyraxNetworkQualityStats.rxQuality.value());
        NetworkQualityStats[] networkQualityStatsArr = new NetworkQualityStats[lyraxNetworkQualityStatsArr.length];
        for (int i = 0; i < lyraxNetworkQualityStatsArr.length; i++) {
            LyraxNetworkQualityStats lyraxNetworkQualityStats2 = lyraxNetworkQualityStatsArr[i];
            networkQualityStatsArr[i] = new NetworkQualityStats(lyraxNetworkQualityStats2.userId, lyraxNetworkQualityStats2.fractionLost, lyraxNetworkQualityStats2.rtt, lyraxNetworkQualityStats2.totalBandwidth, lyraxNetworkQualityStats2.txQuality.value(), lyraxNetworkQualityStatsArr[i].rxQuality.value());
        }
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRemoteAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr, int i) {
        IRTCVideoEventHandler userVideoEventHandler = this.engineWrapper.getUserVideoEventHandler();
        RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr = new RemoteAudioPropertiesInfo[lyraxAudioPropertiesInfoArr.length];
        for (int i2 = 0; i2 < lyraxAudioPropertiesInfoArr.length; i2++) {
            LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo = lyraxAudioPropertiesInfoArr[i2];
            AudioPropertiesInfo audioPropertiesInfo = new AudioPropertiesInfo(lyraxAudioPropertiesInfo.linearVolume, lyraxAudioPropertiesInfo.nonlinearVolume, lyraxAudioPropertiesInfo.spectrum, lyraxAudioPropertiesInfo.vad);
            audioPropertiesInfo.voicePitch = lyraxAudioPropertiesInfo.voicePitch;
            remoteAudioPropertiesInfoArr[i2] = new RemoteAudioPropertiesInfo(new StreamKey(this.roomId, lyraxAudioPropertiesInfo.userId, StreamIndex.fromId(lyraxAudioPropertiesInfo.index.value())), audioPropertiesInfo);
        }
        if (userVideoEventHandler != null) {
            userVideoEventHandler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRemoteStreamStats(LyraxStreamKey lyraxStreamKey, LyraxSubscriberStats lyraxSubscriberStats) {
        IRTCRoomEventHandler roomEventHandlerSafely;
        IRTCVideoEventHandler userVideoEventHandler;
        StreamKey streamKey = new StreamKey(lyraxStreamKey.roomID, lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value()));
        RemoteStreamStats remoteStreamStatsCovertSubscriberStatsToRemoteStreamStats = covertSubscriberStatsToRemoteStreamStats(lyraxSubscriberStats);
        if ((streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN || streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_2ND) && (roomEventHandlerSafely = getRoomEventHandlerSafely()) != null) {
            roomEventHandlerSafely.onRemoteStreamStats(remoteStreamStatsCovertSubscriberStatsToRemoteStreamStats);
        }
        LyraxEngineWrapper lyraxEngineWrapper = this.engineWrapper;
        if (lyraxEngineWrapper != null && (userVideoEventHandler = lyraxEngineWrapper.getUserVideoEventHandler()) != null) {
            userVideoEventHandler.onRemoteStreamStats(streamKey, remoteStreamStatsCovertSubscriberStatsToRemoteStreamStats);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRemoveLyraxSubscriber(LyraxStreamKey lyraxStreamKey, ILyraxSubscriber iLyraxSubscriber) {
        IRTCRoomImplV2EventHandler iRTCRoomImplV2EventHandler = this.implHandler;
        if (iRTCRoomImplV2EventHandler != null) {
            iRTCRoomImplV2EventHandler.onRemoveLyraxSubscriber(lyraxStreamKey, iLyraxSubscriber);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRoomMessageReceived(String str, String str2) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onRoomMessageReceived(str, str2);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRoomMessageSendResult(long j, int i) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onRoomMessageSendResult(j, i);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onStreamRemove(LyraxStream lyraxStream, LyraxStreamRemoveReason lyraxStreamRemoveReason) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < lyraxStream.videoStreamDescriptions.size(); i++) {
                arrayList.add(new VideoStreamDescription(((Integer) ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).videoSize.first).intValue(), ((Integer) ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).videoSize.second).intValue(), ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).frameRate, ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).maxKbps, ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).minKbps, 0, 0, ((LyraxVideoStreamDescription) ListProtector.get(lyraxStream.videoStreamDescriptions, i)).encodePreference.getValue()));
            }
            roomEventHandlerSafely.onStreamRemove(new RTCStream(lyraxStream.userId, lyraxStream.isScreen, lyraxStream.hasVideo, lyraxStream.hasAudio, arrayList), StreamRemoveReason.fromId(lyraxStreamRemoveReason.value()));
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserJoined(LyraxUserInfo lyraxUserInfo, int i) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserJoined(new UserInfo(lyraxUserInfo.userId, lyraxUserInfo.extraInfo), i);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserLeave(String str, int i) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserLeave(str, i);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserMessageReceived(String str, String str2) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserMessageReceived(str, str2);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserMessageSendResult(long j, int i) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserMessageSendResult(j, i);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserVisibilityChanged(boolean z, LyraxUserVisibilityChangeError lyraxUserVisibilityChangeError) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserVisibilityChanged(z, UserVisibilityChangeError.fromId(lyraxUserVisibilityChangeError.value()));
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onVideoStreamBanned(String str, boolean z) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onVideoStreamBanned(str, z);
        }
    }

    public void setMixStreamObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        this.mixStreamObserver.put(str, iMixedStreamObserver);
    }

    public LyraxRoomListenerWrapper(String str, IRTCRoomImplV2EventHandler iRTCRoomImplV2EventHandler, LyraxEngineWrapper lyraxEngineWrapper) {
        this.roomId = str;
        this.implHandler = iRTCRoomImplV2EventHandler;
        this.engineWrapper = lyraxEngineWrapper;
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onAddPublisherStateChanged(LyraxStreamKey lyraxStreamKey, int i, String str) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            if (i != 0) {
                roomEventHandlerSafely.onRoomError(i);
            }
            roomEventHandlerSafely.onStreamStateChanged(new StreamKey(lyraxStreamKey.roomID, lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value())), i, str);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onRoomStateChanged(String str, int i, String str2) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onRoomStateChanged(this.roomId, str, i, str2);
        }
        IRTCRoomImplV2EventHandler iRTCRoomImplV2EventHandler = this.implHandler;
        if (iRTCRoomImplV2EventHandler != null && i > -2000 && i <= -999) {
            iRTCRoomImplV2EventHandler.onRoomError(i);
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserPublishStream(LyraxStreamKey lyraxStreamKey, boolean z, LyraxStreamMediaType lyraxStreamMediaType) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserPublishStream(new StreamKey(lyraxStreamKey.roomID, lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value())), z, MediaStreamType.valueOf(lyraxStreamMediaType.value()));
            LyraxStreamIndex lyraxStreamIndex = lyraxStreamKey.streamIndex;
            if (lyraxStreamIndex == LyraxStreamIndex.kMain) {
                roomEventHandlerSafely.onUserPublishStream(lyraxStreamKey.userID, MediaStreamType.valueOf(lyraxStreamMediaType.value()));
            } else {
                if (lyraxStreamIndex != LyraxStreamIndex.k2nd || !z) {
                    return;
                }
                roomEventHandlerSafely.onUserPublishScreen(lyraxStreamKey.userID, MediaStreamType.valueOf(lyraxStreamMediaType.value()));
            }
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onUserUnpublishStream(LyraxStreamKey lyraxStreamKey, LyraxStreamMediaType lyraxStreamMediaType, LyraxStreamRemoveReason lyraxStreamRemoveReason) {
        IRTCRoomEventHandler roomEventHandlerSafely = getRoomEventHandlerSafely();
        if (roomEventHandlerSafely != null) {
            roomEventHandlerSafely.onUserUnpublishStream(new StreamKey(lyraxStreamKey.roomID, lyraxStreamKey.userID, StreamIndex.fromId(lyraxStreamKey.streamIndex.value())), MediaStreamType.valueOf(lyraxStreamMediaType.value()), StreamRemoveReason.fromId(lyraxStreamRemoveReason.value()));
            LyraxStreamIndex lyraxStreamIndex = lyraxStreamKey.streamIndex;
            if (lyraxStreamIndex == LyraxStreamIndex.kMain) {
                roomEventHandlerSafely.onUserUnpublishStream(lyraxStreamKey.userID, MediaStreamType.valueOf(lyraxStreamMediaType.value()), StreamRemoveReason.fromId(lyraxStreamRemoveReason.value()));
            } else {
                if (lyraxStreamIndex != LyraxStreamIndex.k2nd) {
                    return;
                }
                roomEventHandlerSafely.onUserUnpublishScreen(lyraxStreamKey.userID, MediaStreamType.valueOf(lyraxStreamMediaType.value()), StreamRemoveReason.fromId(lyraxStreamRemoveReason.value()));
            }
        }
    }

    @Override // com.ss.lyrax.room.ILyraxRoomListener
    public void onStreamMixingEvent(LyraxTranscoderMixingEvent lyraxTranscoderMixingEvent, String str, LyraxTranscoderMixingErrorCode lyraxTranscoderMixingErrorCode, int i, String str2, LyraxTranscoderMixingType lyraxTranscoderMixingType) {
        IMixedStreamObserver iMixedStreamObserver = this.mixStreamObserver.get(str);
        if (iMixedStreamObserver != null) {
            iMixedStreamObserver.onMixingEvent(LyraxUtils.convertLyraxTranscoderMixingEvent(lyraxTranscoderMixingEvent), str, LyraxUtils.convertLyraxTranscoderMixingErrorCode(lyraxTranscoderMixingErrorCode), i, str2, LyraxUtils.convertLyraxTranscoderMixingType(lyraxTranscoderMixingType));
        }
    }
}
