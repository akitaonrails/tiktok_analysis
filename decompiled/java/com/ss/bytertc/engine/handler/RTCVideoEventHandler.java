package com.ss.bytertc.engine.handler;

import X.C08FF;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.InternalSourceWantedData;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalProxyError;
import com.ss.bytertc.engine.type.LocalProxyState;
import com.ss.bytertc.engine.type.LocalProxyType;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoExternalData;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class RTCVideoEventHandler {
    public long mJoinChannelTime;
    public WeakReference<RTCVideoImpl> mRTCVideoImpl;
    public String mRoom;
    public String mSession;
    public State mState = State.IDLE;
    public String mUser;

    public void onNetworkTimeSynchronized() {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onNetworkTimeSynchronized...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl == null || (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) == null) {
                return;
            }
            rtcEngineHandler.onNetworkTimeSynchronized();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onNetworkTimeSynchronized callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public enum State {
        IDLE,
        IN_ROOM;

        public static State valueOf(String str) {
            return (State) C08FF.LIZ(State.class, str);
        }
    }

    public RTCVideoEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRTCVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onAudioRouteChanged(AudioRoute audioRoute) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioRouteChanged...device: ");
        sbLIZ.append(audioRoute.value());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioRouteChanged(audioRoute);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAudioRouteChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onConnectionStateChanged(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConnectionStateChanged, state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionStateChanged(i, -1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onConnectionStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onError(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError...errorNum: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onError(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onError callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstLocalAudioFrame...streamIndex: ");
        sbLIZ.append(streamIndex.value());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFirstLocalAudioFrame callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onFirstRemoteAudioFrame(StreamKey streamKey) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteAudioFrame...uid: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(", roomid: ");
        sbLIZ.append(streamKey.getRoomId());
        sbLIZ.append(", streamIndex: ");
        sbLIZ.append(streamKey.getStreamIndex().value());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteAudioFrame(streamKey);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFirstRemoteAudioFrame callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onHardwareROISupportStateUpdated(boolean z) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onHardwareROISupportStateUpdated");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHardwareROISupportStateUpdated(z);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onHardwareROISupportStateUpdated callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLocalAudioPropertiesReport");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLocalAudioPropertiesReport callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onNetworkProbeStopped(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkProbeStopped: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkDetectionStopped(NetworkDetectionStopReason.values()[i]);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onNetworkDetectionStopped callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onNetworkTypeChanged(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkTypeChanged, type: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTypeChanged(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onNetworkTypeChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSimulcastSubscribeFallback, uid: ");
        sbLIZ.append(internalRemoteStreamSwitch.uid);
        sbLIZ.append(", before_video_index: ");
        sbLIZ.append(internalRemoteStreamSwitch.beforeVideoIndex);
        sbLIZ.append(", after_video_index: ");
        sbLIZ.append(internalRemoteStreamSwitch.afterVideoIndex);
        sbLIZ.append(", before_enable: ");
        sbLIZ.append(internalRemoteStreamSwitch.beforeEnable);
        sbLIZ.append(", after_enable: ");
        sbLIZ.append(internalRemoteStreamSwitch.afterEnable);
        sbLIZ.append(", reason: ");
        sbLIZ.append(internalRemoteStreamSwitch.reason);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSimulcastSubscribeFallback(new RemoteStreamSwitch(internalRemoteStreamSwitch));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onNetworkTypeChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onSysStats(SysStats sysStats) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onSysStats... ");
        if (sysStats != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSysStats... stats: ");
            sbLIZ.append(sysStats.toString());
            LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSysStats(sysStats);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSysStats callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onWarning(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWarning, warnNum: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onWarning(i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onWarning callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    public void onCreateRoomStateChanged(String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onCreateRoomStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onCreateRoomStateChanged(str, i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCreateRoomStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onExtensionAccessError(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onExtensionAccessError(str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onExtensionAccessError callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstLocalVideoFrame...width: ");
        sbLIZ.append(videoFrameInfo.getWidth());
        sbLIZ.append(", height: ");
        sbLIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFirstLocalVideoFrame callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onFirstRemoteVideoFrameDecoded(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteVideoFrameDecoded...uid: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(", StreamIndex:");
        sbLIZ.append(streamKey.getStreamIndex());
        sbLIZ.append(", width: ");
        sbLIZ.append(videoFrameInfo.getWidth());
        sbLIZ.append(", height: ");
        sbLIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameDecoded(streamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFirstRemoteVideoFrameDecoded callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onFirstRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstRemoteVideoFrameRendered...uid: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(", StreamIndex:");
        sbLIZ.append(streamKey.getStreamIndex());
        sbLIZ.append(", width: ");
        sbLIZ.append(videoFrameInfo.getWidth());
        sbLIZ.append(", height: ");
        sbLIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameRendered(streamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFirstRemoteVideoFrameRendered callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLocalAudioStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLocalAudioStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onLocalStreamStats(StreamIndex streamIndex, InternalLocalStreamStats internalLocalStreamStats) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLocalStreamStats, streamIndex: ");
        sbLIZ.append(streamIndex);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalStreamStats(streamIndex, new LocalStreamStats(internalLocalStreamStats));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLocalStreamStats callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLocalVideoSizeChanged... streamIndex: ");
        sbLIZ.append(streamIndex);
        sbLIZ.append(", frameInfo: ");
        sbLIZ.append(videoFrameInfo);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLocalVideoSizeChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onLogReport(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_key", "local_debug_log");
            jSONObject.put("log_level", str);
            jSONObject.put("log_content", str2);
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLogReport(str, jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLogReport callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteAudioPropertiesReport");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoteAudioPropertiesReport callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteStreamStats(StreamKey streamKey, InternalRemoteStreamStats internalRemoteStreamStats) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoteStreamStats, streamIndex: ");
        sbLIZ.append(streamKey.getStreamIndex());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteStreamStats(new StreamKey(streamKey.getRoomId(), streamKey.getUserId(), streamKey.getStreamIndex()), new RemoteStreamStats(internalRemoteStreamStats));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRemoteStreamStats callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onRemoteVideoInfoChanged(StreamKey streamKey, RTCStream rTCStream) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteVideoInfoChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoInfoChanged(streamKey, rTCStream);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoteVideoInfoChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteVideoSizeChanged(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoteVideoSizeChanged... StreamKey: ");
        sbLIZ.append(streamKey);
        sbLIZ.append(", frameInfo: ");
        sbLIZ.append(videoFrameInfo);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSizeChanged(streamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRemoteVideoSizeChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onSEIMessageReceived(StreamKey streamKey, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSEIMessageReceived");
        sbLIZ.append(streamKey.getRoomId());
        sbLIZ.append(streamKey.getUserId());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIMessageReceived(streamKey, byteBuffer);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSEIMessageReceived callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onSEIMessageReceivedWithExternalData(StreamKey streamKey, VideoExternalData videoExternalData) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSEIMessageReceived");
        sbLIZ.append(streamKey.getRoomId());
        sbLIZ.append(streamKey.getUserId());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIMessageReceived(streamKey, videoExternalData);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSEIMessageReceived callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onSEIStreamUpdate(StreamKey streamKey, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSEIStreamUpdate");
        sbLIZ.append(streamKey.getRoomId());
        sbLIZ.append(streamKey.getUserId());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIStreamUpdate(streamKey, SEIStreamUpdateEvent.values()[i]);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onSEIStreamUpdate callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserStartAudioCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserStartAudioCapture... uid: ");
        sbLIZ.append(str2);
        sbLIZ.append(", roomId: ");
        sbLIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartAudioCapture(str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserStartAudioCapture callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserStartVideoCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserStartVideoCapture... uid: ");
        sbLIZ.append(str2);
        sbLIZ.append(", roomId: ");
        sbLIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartVideoCapture(str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserStartVideoCapture callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserStopAudioCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserStopAudioCapture... uid: ");
        sbLIZ.append(str2);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopAudioCapture(str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserStopAudioCapture callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserStopVideoCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserStopVideoCapture... uid: ");
        sbLIZ.append(str2);
        sbLIZ.append(", roomId: ");
        sbLIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopVideoCapture(str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserStopVideoCapture callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onVideoDenoiseModeChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDenoiseModeChanged(videoDenoiseMode, videoDenoiseModeChangedReason);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onVideoDenoiseModeChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onAudioFramePlayStateChanged(StreamKey streamKey, String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioFramePlayStateChanged, user: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(", state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(streamKey, str, firstFramePlayState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(StreamKey streamKey, String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioFrameSendStateChanged,  state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
        if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
            rtcEngineHandler.onAudioFrameSendStateChanged(streamKey, str, firstFrameSendState);
        }
    }

    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLocalProxyStateChanged...: ");
        sbLIZ.append(localProxyType.value());
        sbLIZ.append(", state: ");
        sbLIZ.append(localProxyState.value());
        sbLIZ.append(", error: ");
        sbLIZ.append(localProxyError.value());
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalProxyStateChanged(localProxyType, localProxyState, localProxyError);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLocalProxyStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLocalVideoStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLocalVideoStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteAudioStateChanged(StreamKey streamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteAudioStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStateChanged(streamKey, remoteAudioState, remoteAudioStateChangeReason);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoteAudioStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteVideoStateChanged(StreamKey streamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteVideoStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStateChanged(streamKey, remoteVideoState, remoteVideoStateChangeReason);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoteVideoStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteVideoSuperResolutionModeChanged(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteVideoSuperResolutionModeChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSuperResolutionModeChanged(streamKey, videoSuperResolutionMode, videoSuperResolutionModeChangedReason);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoteVideoSuperResolutionModeChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onScreenVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScreenVideoFramePlayStateChanged, user: ");
        sbLIZ.append(internalRTCUser);
        sbLIZ.append(", state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScreenVideoFrameSendStateChanged, user: ");
        sbLIZ.append(internalRTCUser);
        sbLIZ.append(", state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onStreamSyncInfoReceived(StreamKey streamKey, ByteBuffer byteBuffer, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onStreamSyncInfoReceived");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSyncInfoReceived(streamKey, StreamSycnInfoConfig.SyncInfoStreamType.SYNC_INFO_STREAM_TYPE_AUDIO, byteBuffer);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStreamSyncInfoReceived callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoDeviceWarning, VideoDeviceType: ");
        sbLIZ.append(videoDeviceType);
        sbLIZ.append(", device_warning ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDeviceWarning(str, videoDeviceType, i);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onVideoDeviceWarning callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onVideoFramePlayStateChanged(StreamKey streamKey, String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoFramePlayStateChanged, user: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(", state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(streamKey, str, firstFramePlayState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(StreamKey streamKey, String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoFrameSendStateChanged, user: ");
        sbLIZ.append(streamKey.getUserId());
        sbLIZ.append(", state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(streamKey, str, firstFrameSendState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioDeviceStateChanged, AudioDeviceType: ");
        sbLIZ.append(audioDeviceType);
        sbLIZ.append(", device_state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAudioDeviceStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onAudioFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioFramePlayStateChanged, user: ");
        sbLIZ.append(internalRTCUser);
        sbLIZ.append(", state: ");
        sbLIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioFrameSendStateChanged,  state: ");
        sbLIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onPerformanceAlarms(int i, String str, int i2, InternalSourceWantedData internalSourceWantedData) {
        PerformanceAlarmReason performanceAlarmReason;
        PerformanceAlarmMode performanceAlarmMode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPerformanceAlarms, level: ");
        sbLIZ.append(i2);
        sbLIZ.append(", data: ");
        sbLIZ.append(internalSourceWantedData);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            } else {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            }
                        } else {
                            performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_FALLBACKED;
                        }
                    } else {
                        performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_RESUMED;
                    }
                } else {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
                }
                IRTCVideoEventHandler rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler();
                if (rtcEngineHandler != null) {
                    if (i == 0) {
                        performanceAlarmMode = PerformanceAlarmMode.NORMAL;
                    } else {
                        performanceAlarmMode = PerformanceAlarmMode.SIMULCAST;
                    }
                    rtcEngineHandler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, new SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPerformanceAlarms callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoDeviceStateChanged, VideoDeviceType: ");
        sbLIZ.append(videoDeviceType);
        sbLIZ.append(", device_state: ");
        sbLIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDeviceStateChanged(str, videoDeviceType, i, i2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onVideoDeviceStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoFramePlayStateChanged, user: ");
        sbLIZ.append(internalRTCUser);
        sbLIZ.append(", state: ");
        sbLIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoFrameSendStateChanged, user: ");
        sbLIZ.append(internalRTCUser);
        sbLIZ.append(", state: ");
        sbLIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RtcVideoEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onNetworkProbeResult(int i, int i2, int i3, double d, int i4, int i5) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkProbeResult: ");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(i2);
        sbLIZ.append(",");
        sbLIZ.append(i3);
        sbLIZ.append(",");
        sbLIZ.append(d);
        sbLIZ.append(",");
        sbLIZ.append(i4);
        sbLIZ.append(",");
        sbLIZ.append(i5);
        LogUtil.d("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkDetectionResult(NetworkDetectionLinkType.values()[i], i2, i3, d, i4, i5);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onNetworkDetectionResult callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
