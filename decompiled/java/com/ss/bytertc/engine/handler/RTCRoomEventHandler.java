package com.ss.bytertc.engine.handler;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.UserVisibilityChangeError;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRoomEventHandler {
    public RTCRoomImpl mRtcRoom;

    public void onPublishPrivilegeTokenWillExpire() {
        LogUtil.d("RtcRoomEventHandler", "onPublishPrivilegeTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onPublishPrivilegeTokenWillExpire();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPublishPrivilegeTokenWillExpire callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onSubscribePrivilegeTokenWillExpire() {
        LogUtil.d("RtcRoomEventHandler", "onSubscribePrivilegeTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubscribePrivilegeTokenWillExpire();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSubscribePrivilegeTokenWillExpire callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onTokenWillExpire() {
        LogUtil.d("RtcRoomEventHandler", "onTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onTokenWillExpire();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTokenWillExpire callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public RTCRoomEventHandler(RTCRoomImpl rTCRoomImpl) {
        this.mRtcRoom = rTCRoomImpl;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFeatureEvent event: ");
        sbLIZ.append(lyraxTranscoderFeatureEvent);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            IRTCRoomEventHandler rtcRoomHandler = this.mRtcRoom.getRtcRoomHandler();
            if (rtcRoomHandler != null) {
                rtcRoomHandler.onFeatureEvent(lyraxTranscoderFeatureEvent);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onFeatureEvent callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        LogUtil.d("RtcRoomEventHandler", "onForwardStreamEvent");
        try {
            this.mRtcRoom.getRtcRoomHandler().onForwardStreamEvent(forwardStreamEventInfoArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onForwardStreamEvent callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        LogUtil.d("RtcRoomEventHandler", "OnForwardStreamStateChanged");
        try {
            this.mRtcRoom.getRtcRoomHandler().onForwardStreamStateChanged(forwardStreamStateInfoArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onForwardStreamStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcRoomEventHandler", "onLeaveRoom...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLeaveRoom(new RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLeaveRoom callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LogUtil.d("RtcRoomEventHandler", "onLocalStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalStreamStats(new LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLocalStreamStats callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        LogUtil.d("RtcRoomEventHandler", "onRemoteStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteStreamStats(new RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoteStreamStats callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRoomError(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomError...errorNum: ");
        sbLIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomError(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRoomError callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcRoomEventHandler", "onRtcStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomStats(new RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRtcStats callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onRoomWarning(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomWarning, warnNum: ");
        sbLIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomWarning(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRoomWarning callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        LogUtil.d("RtcRoomEventHandler", "onStreamAdd...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamAdd(rTCStream);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStreamAdd callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onAudioStreamBanned(String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioStreamBanned, user: ");
        sbLIZ.append(str);
        sbLIZ.append(", banned: ");
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        sbLIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioStreamBanned(str, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAudioStreamBanned callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onNetworkQuality(InternalNetworkQualityInfo internalNetworkQualityInfo, InternalNetworkQualityInfo[] internalNetworkQualityInfoArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Local onNetworkQuality, uid: ");
        sbLIZ.append(internalNetworkQualityInfo.uid);
        sbLIZ.append(", info: ");
        sbLIZ.append(internalNetworkQualityInfo.toString());
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            IRTCRoomEventHandler rtcRoomHandler = this.mRtcRoom.getRtcRoomHandler();
            if (rtcRoomHandler != null) {
                NetworkQualityStats[] networkQualityStatsArr = new NetworkQualityStats[internalNetworkQualityInfoArr.length];
                for (int i = 0; i < internalNetworkQualityInfoArr.length; i++) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Remote onNetworkQuality, uid: ");
                    sbLIZ2.append(internalNetworkQualityInfoArr[i].uid);
                    sbLIZ2.append(", info: ");
                    sbLIZ2.append(internalNetworkQualityInfoArr[i].toString());
                    LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
                    networkQualityStatsArr[i] = new NetworkQualityStats(internalNetworkQualityInfoArr[i]);
                }
                rtcRoomHandler.onNetworkQuality(new NetworkQualityStats(internalNetworkQualityInfo), networkQualityStatsArr);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onNetworkQuality callback catch exception.\n");
            sbLIZ3.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomBinaryMessageReceived, length: ");
        sbLIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRoomBinaryMessageReceived callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoomMessageReceived: ");
        sbLIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onRoomMessageReceived callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        LogUtil.d("RtcRoomEventHandler", "onRoomMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageSendResult(j, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRoomMessageSendResult callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        LogUtil.d("RtcRoomEventHandler", "onStreamPublishSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublishSuccess(str, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStreamPublishSuccess callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamRemove...uid: ");
        sbLIZ.append(rTCStream.userId);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamRemove(rTCStream, StreamRemoveReason.values()[i]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStreamRemove callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserBinaryMessageReceived: uid:");
        sbLIZ.append(str);
        sbLIZ.append("binary message length");
        sbLIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserBinaryMessageReceived callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserBizSessionId(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserBizSessionId... uid: ");
        sbLIZ.append(str);
        sbLIZ.append(", biz_session_id: ");
        sbLIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBizSessionId(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserBizSessionId callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserJoined(UserInfo userInfo, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserJoined... uid: ");
        sbLIZ.append(userInfo.getUid());
        sbLIZ.append(", extraInfo: ");
        sbLIZ.append(userInfo.getExtraInfo());
        sbLIZ.append(", elapsed: ");
        sbLIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserJoined(userInfo, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserJoined callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserLeave(String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserLeave... uid: ");
        sbLIZ.append(str);
        sbLIZ.append(", reason: ");
        sbLIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserLeave(str, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserLeave callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserMessageReceived: uid:");
        sbLIZ.append(str);
        sbLIZ.append("message");
        sbLIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserMessageReceived callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        LogUtil.d("RtcRoomEventHandler", "onUserMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageSendResult(j, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserMessageSendResult callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onUserPublishScreen(String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserPublishScreen... uid: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserPublishScreen(str, MediaStreamType.valueOf(i));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserPublishScreen callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserPublishStream(String str, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserPublishStream... uid: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserPublishStream(str, MediaStreamType.valueOf(i));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserPublishStream callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserVisibilityChanged(boolean z, UserVisibilityChangeError userVisibilityChangeError) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserVisibilityChanged, currentUserVisibility:");
        sbLIZ.append(z);
        sbLIZ.append(", errorCode:");
        sbLIZ.append(userVisibilityChangeError);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserVisibilityChanged(z, userVisibilityChangeError);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserVisibilityChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.e("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onVideoStreamBanned(String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoStreamBanned, user: ");
        sbLIZ.append(str);
        sbLIZ.append(", banned: ");
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        sbLIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoStreamBanned(str, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onVideoStreamBanned callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onStreamStateChanged(StreamKey streamKey, int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamStateChanged streamIndex: ");
        sbLIZ.append(streamKey.getStreamIndex());
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            IRTCRoomEventHandler rtcRoomHandler = this.mRtcRoom.getRtcRoomHandler();
            if (rtcRoomHandler != null) {
                rtcRoomHandler.onStreamStateChanged(streamKey, i, str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStreamStateChanged callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        LogUtil.d("RtcRoomEventHandler", "onStreamSubscribed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamSubscribed(i, str, subscribeConfig);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStreamSubscribed callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onUserPublishStream(StreamKey streamKey, boolean z, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserPublishStream streamIndex: ");
        sbLIZ.append(streamKey.getStreamIndex());
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            IRTCRoomEventHandler rtcRoomHandler = this.mRtcRoom.getRtcRoomHandler();
            if (rtcRoomHandler != null) {
                rtcRoomHandler.onUserPublishStream(streamKey, z, MediaStreamType.valueOf(i));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserPublishStream callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onUserUnpublishScreen(String str, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserUnPublishScreen... uid: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(i);
        sbLIZ.append(", reasen:");
        sbLIZ.append(i2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserUnpublishScreen(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserUnPublishScreen callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:4:0x001b, B:7:0x0029, B:9:0x0031, B:6:0x0023), top: B:14:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUserUnpublishStream(com.ss.bytertc.engine.data.StreamKey r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onUserUnpublishStream streamIndex: "
            r1.append(r0)
            com.ss.bytertc.engine.data.StreamIndex r0 = r5.getStreamIndex()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r3 = "RtcRoomEventHandler"
            com.ss.bytertc.engine.utils.LogUtil.d(r3, r0)
            if (r7 < 0) goto L23
            com.ss.bytertc.engine.type.StreamRemoveReason r0 = com.ss.bytertc.engine.type.StreamRemoveReason.STREAM_REMOVE_REASON_PUBLISH_PRIVILEGE_TOKEN_EXPIRED     // Catch: java.lang.Exception -> L3f
            int r0 = r0.value()     // Catch: java.lang.Exception -> L3f
            if (r7 <= r0) goto L29
        L23:
            java.lang.String r0 = "onUserUnpublishStream callback reason invalid.\n"
            com.ss.bytertc.engine.utils.LogUtil.d(r3, r0)     // Catch: java.lang.Exception -> L3f
            r7 = 0
        L29:
            com.ss.bytertc.engine.RTCRoomImpl r0 = r4.mRtcRoom     // Catch: java.lang.Exception -> L3f
            com.ss.bytertc.engine.handler.IRTCRoomEventHandler r2 = r0.getRtcRoomHandler()     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L5a
            com.ss.bytertc.engine.type.MediaStreamType r1 = com.ss.bytertc.engine.type.MediaStreamType.valueOf(r6)     // Catch: java.lang.Exception -> L3f
            com.ss.bytertc.engine.type.StreamRemoveReason[] r0 = com.ss.bytertc.engine.type.StreamRemoveReason.values()     // Catch: java.lang.Exception -> L3f
            r0 = r0[r7]     // Catch: java.lang.Exception -> L3f
            r2.onUserUnpublishStream(r5, r1, r0)     // Catch: java.lang.Exception -> L3f
            return
        L3f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onUserUnpublishStream callback catch exception.\n"
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.bytertc.engine.utils.LogUtil.d(r3, r0)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.handler.RTCRoomEventHandler.onUserUnpublishStream(com.ss.bytertc.engine.data.StreamKey, int, int):void");
    }

    public void onUserUnpublishStream(String str, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserUnPublishStream... uid: ");
        sbLIZ.append(str);
        sbLIZ.append(", type: ");
        sbLIZ.append(i);
        sbLIZ.append(", reasen:");
        sbLIZ.append(i2);
        LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserUnpublishStream(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onUserUnPublishStream callback catch exception.\n");
            sbLIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
        LogUtil.d("RtcRoomEventHandler", "onRoomStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomStateChanged(str, str2, i, str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRoomStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void onStreamStateChanged(String str, String str2, int i, String str3) {
        LogUtil.d("RtcRoomEventHandler", "onStreamStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamStateChanged(str, str2, i, str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStreamStateChanged callback catch exception.\n");
            sbLIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
