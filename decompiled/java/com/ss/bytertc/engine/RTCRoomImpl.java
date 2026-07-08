package com.ss.bytertc.engine;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.ss.bytertc.engine.type.DownLinkAudioSelectionPriority;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRoomImpl extends RTCRoom {
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public long mNativeRtcRoom;
    public long mNativeRtcRoomEventHandler;
    public final ReentrantReadWriteLock mReadWriteLock;
    public String mRoom;
    public RTCRoomEventHandler mRtcRoomEventHandler;
    public IRTCRoomEventHandler mRtcRoomHandler;
    public String mUser;

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public void destroy() {
        LogUtil.d("RtcRoom", "Destroy ");
        this.mJniWriteLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, Destroy failed.");
                this.mJniWriteLock.unlock();
                return;
            }
            this.mNativeRtcRoom = 0L;
            this.mJniWriteLock.unlock();
            NativeRTCRoomFunctions.nativeDestory(j);
            long j2 = this.mNativeRtcRoomEventHandler;
            if (j2 != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j2);
                this.mNativeRtcRoomEventHandler = 0L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public String getRoomId() {
        String strNativeGetRoomId;
        LogUtil.d("RtcRoom", "getRoomId");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, getRoomId failed.");
                strNativeGetRoomId = "";
            } else {
                strNativeGetRoomId = NativeRTCRoomFunctions.nativeGetRoomId(j);
            }
            this.mJniReadLock.unlock();
            return strNativeGetRoomId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public void invalidRoomWithoutDestroy() {
        LogUtil.d("RtcRoom", "invalidRoomWithoutDestroy");
        this.mJniWriteLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, invalid failed.");
                this.mJniWriteLock.unlock();
            } else {
                this.mNativeRtcRoom = 0L;
                this.mJniWriteLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int leaveRoom() {
        int iNativeLeaveRoom;
        LogUtil.d("RtcRoom", "leaveChannel");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, leaveChannel failed.");
                iNativeLeaveRoom = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRoom = "";
                this.mUser = "";
                iNativeLeaveRoom = NativeRTCRoomFunctions.nativeLeaveRoom(j);
            }
            this.mJniReadLock.unlock();
            return iNativeLeaveRoom;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int pauseForwardStreamToAllRooms() {
        int iNativePauseForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, pauseForwardStreamToAllRooms failed.");
                iNativePauseForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseForwardStreamToAllRooms = NativeRTCRoomFunctions.nativePauseForwardStreamToAllRooms(j);
            }
            this.mJniReadLock.unlock();
            return iNativePauseForwardStreamToAllRooms;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int replayLivePusherNeedEvent() {
        int iNativeReplayLivePusherNeedEvent;
        LogUtil.d("RtcRoom", "replayLivePusherNeedEvent");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, leaveChannel failed.");
                iNativeReplayLivePusherNeedEvent = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeReplayLivePusherNeedEvent = NativeRTCRoomFunctions.nativeReplayLivePusherNeedEvent(j);
            }
            this.mJniReadLock.unlock();
            return iNativeReplayLivePusherNeedEvent;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int resumeForwardStreamToAllRooms() {
        int iNativeResumeForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, resumeForwardStreamToAllRooms failed.");
                iNativeResumeForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeForwardStreamToAllRooms = NativeRTCRoomFunctions.nativeResumeForwardStreamToAllRooms(j);
            }
            this.mJniReadLock.unlock();
            return iNativeResumeForwardStreamToAllRooms;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int stopForwardStreamToRooms() {
        int iNativeStopForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, stopForwardStreamToRooms failed.");
                iNativeStopForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopForwardStreamToRooms = NativeRTCRoomFunctions.nativeStopForwardStreamToRooms(j);
            }
            this.mJniReadLock.unlock();
            return iNativeStopForwardStreamToRooms;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public long getNativeHandle() {
        return this.mNativeRtcRoom;
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        int iNativePauseAllSubscribedStream;
        LogUtil.d("RtcRoom", "pauseAllSubscribedStream...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, pauseAllSubscribedStream failed.");
                iNativePauseAllSubscribedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePauseAllSubscribedStream = NativeRTCRoomFunctions.nativePauseAllSubscribedStream(j, pauseResumeControlMediaType.value());
            }
            this.mJniReadLock.unlock();
            return iNativePauseAllSubscribedStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int publishScreen(MediaStreamType mediaStreamType) {
        int iNativePublishScreenWithMediaStreamType;
        LogUtil.d("RtcRoom", "publishScreen");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, publishScreen failed.");
                iNativePublishScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishScreenWithMediaStreamType = NativeRTCRoomFunctions.nativePublishScreenWithMediaStreamType(j, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativePublishScreenWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int publishStream(MediaStreamType mediaStreamType) {
        int iNativePublishStream;
        LogUtil.d("RtcRoom", "publishStream");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, publishStream failed.\"");
                iNativePublishStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStream = NativeRTCRoomFunctions.nativePublishStream(j, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativePublishStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        int iNativeResumeAllSubscribedStream;
        LogUtil.d("RtcRoom", "resumeAllSubscribedStream...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, resumeAllSubscribedStream failed.");
                iNativeResumeAllSubscribedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeResumeAllSubscribedStream = NativeRTCRoomFunctions.nativeResumeAllSubscribedStream(j, pauseResumeControlMediaType.value());
            }
            this.mJniReadLock.unlock();
            return iNativeResumeAllSubscribedStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendRoomBinaryMessage(byte[] bArr) {
        LogUtil.d("RtcRoom", "SendRoomBinaryMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendRoomBinaryMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            long jNativeSendRoomBinaryMessage = NativeRTCRoomFunctions.nativeSendRoomBinaryMessage(j, bArr);
            this.mJniReadLock.unlock();
            return jNativeSendRoomBinaryMessage;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendRoomMessage(String str) {
        LogUtil.d("RtcRoom", "SendRoomMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendRoomMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            long jNativeSendRoomMessage = NativeRTCRoomFunctions.nativeSendRoomMessage(j, str);
            this.mJniReadLock.unlock();
            return jNativeSendRoomMessage;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setBizSessionId(String str) {
        int iNativeSetBizSessionId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetBizSessionId. bizSessionId : ");
        sbLIZ.append(str);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native room is invalid, SetBizSessionId failed");
                iNativeSetBizSessionId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetBizSessionId = NativeRTCRoomFunctions.nativeSetBizSessionId(j, str);
            }
            this.mJniReadLock.unlock();
            return iNativeSetBizSessionId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setBusinessLabel(String str) {
        int iNativeSetBusinessLabel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBusinessLabel. businessLabel : ");
        sbLIZ.append(str);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtc room is invalid, setBusinessLabel failed");
                iNativeSetBusinessLabel = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetBusinessLabel = NativeRTCRoomFunctions.nativeSetBusinessLabel(j, str);
            }
            this.mJniReadLock.unlock();
            return iNativeSetBusinessLabel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setDefaultRemoteVideoConfig(RemoteVideoConfig remoteVideoConfig) {
        int iNativeSetDefaultRemoteVideoConfig;
        LogUtil.d("RtcRoom", "setDefaultRemoteVideoConfig");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid,setDefaultRemoteVideoConfig failed.\"");
                iNativeSetDefaultRemoteVideoConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetDefaultRemoteVideoConfig = NativeRTCRoomFunctions.nativeSetDefaultRemoteVideoConfig(j, remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            this.mJniReadLock.unlock();
            return iNativeSetDefaultRemoteVideoConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setGroupChannelId(String str) {
        int iNativeSetGroupChannelId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setGroupChannelId. groupChannelId : ");
        sbLIZ.append(str);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtc room is invalid, setGroupChannelId failed");
                iNativeSetGroupChannelId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetGroupChannelId = NativeRTCRoomFunctions.nativeSetGroupChannelId(j, str);
            }
            this.mJniReadLock.unlock();
            return iNativeSetGroupChannelId;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setLinkMicType(LinkMicType linkMicType) {
        int iNativeSetLinkMicType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLinkMicType. linkMicType : ");
        sbLIZ.append(linkMicType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native room is invalid, setLinkMicType failed");
                iNativeSetLinkMicType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLinkMicType = NativeRTCRoomFunctions.nativeSetLinkMicType(j, linkMicType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeSetLinkMicType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setPostProcessParameter(PostProcessParameter postProcessParameter) {
        int iNativeSetPostProcessParameter;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                iNativeSetPostProcessParameter = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPostProcessParameter = NativeRTCRoomFunctions.nativeSetPostProcessParameter(j, postProcessParameter);
            }
            this.mJniReadLock.unlock();
            return iNativeSetPostProcessParameter;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native room is invalid, setRTCRoomEventHandler failed.");
                int iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                this.mJniReadLock.unlock();
                return iValue;
            }
            this.mRtcRoomHandler = iRTCRoomEventHandler;
            RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(this);
            this.mRtcRoomEventHandler = rTCRoomEventHandler;
            long j = this.mNativeRtcRoomEventHandler;
            this.mNativeRtcRoomEventHandler = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, rTCRoomEventHandler);
            if (j != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j);
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteRoomAudioPlaybackVolume(int i) {
        int iNativeSetRemoteRoomAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, setRemoteRoomAudioPlaybackVolume failed.");
                iNativeSetRemoteRoomAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteRoomAudioPlaybackVolume = NativeRTCRoomFunctions.nativeSetRemoteRoomAudioPlaybackVolume(j, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteRoomAudioPlaybackVolume;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setUserVisibility(boolean z) {
        int iNativeSetUserVisibility;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUserVisibility. enable : ");
        sbLIZ.append(z);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, setUserVisibility failed.");
                iNativeSetUserVisibility = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetUserVisibility = NativeRTCRoomFunctions.nativeSetUserVisibility(j, z);
            }
            this.mJniReadLock.unlock();
            return iNativeSetUserVisibility;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int iNativeStartForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, startForwardStreamToRooms failed.");
                iNativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iNativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it2.next()));
                }
                iNativeStartForwardStreamToRooms = NativeRTCRoomFunctions.nativeStartForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            this.mJniReadLock.unlock();
            return iNativeStartForwardStreamToRooms;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unpublishScreen(MediaStreamType mediaStreamType) {
        int iNativeUnpublishScreenWithMediaStreamType;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, unpublishScreen failed.");
                iNativeUnpublishScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeUnpublishScreenWithMediaStreamType(j, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnpublishScreenWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unpublishStream(MediaStreamType mediaStreamType) {
        int iNativeUnpublishStream;
        LogUtil.d("RtcRoom", "unpublishStream");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native unpublishStream is invalid");
                iNativeUnpublishStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishStream = NativeRTCRoomFunctions.nativeUnpublishStream(j, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnpublishStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int iNativeUpdateForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, updateForwardStreamToRooms failed.");
                iNativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iNativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it2.next()));
                }
                iNativeUpdateForwardStreamToRooms = NativeRTCRoomFunctions.nativeUpdateForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            this.mJniReadLock.unlock();
            return iNativeUpdateForwardStreamToRooms;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int updateToken(String str) {
        int iNativeUpdateToken;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateToken. token : ");
        sbLIZ.append(str);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, updateToken failed.");
                iNativeUpdateToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateToken = NativeRTCRoomFunctions.nativeUpdateToken(j, str);
            }
            this.mJniReadLock.unlock();
            return iNativeUpdateToken;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    public RTCRoomImpl(String str, long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRtcRoom = j;
        this.mRoom = str;
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("externalService", "render");
            jSONObject.put("renderMeta", str2);
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCloudRenderingInfo catch exception , e : ");
            sbLIZ.append(e.getMessage());
            LogUtil.e("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativePublishStreamEx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishStream: ");
        sbLIZ.append(streamIndex);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, publishStream failed.\"");
                iNativePublishStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePublishStreamEx = NativeRTCRoomFunctions.nativePublishStreamEx(j, streamIndex.value(), mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativePublishStreamEx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setDownLinkAudioSelectionPriority(StreamIndex streamIndex, DownLinkAudioSelectionPriority downLinkAudioSelectionPriority) {
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, setDownLinkAudioSelectionPriority failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeRTCRoomFunctions.nativeSetDownLinkAudioSelectionPriority(j, streamIndex.value(), downLinkAudioSelectionPriority.value());
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig) {
        return setRemoteVideoConfig(str, StreamIndex.STREAM_INDEX_MAIN, remoteVideoConfig);
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeSubscribeAllStreamsWithMediaStreamType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeStream, MediaStreamType:");
        sbLIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeAllStreams failed.");
                iNativeSubscribeAllStreamsWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeAllStreamsWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeAllStreamsWithMediaStreamType(j, streamIndex.value(), mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeSubscribeAllStreamsWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeScreen(String str, MediaStreamType mediaStreamType) {
        int iNativeSubscribeScreenWithMediaStreamType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeScreen: ");
        sbLIZ.append(str);
        sbLIZ.append(", MediaStreamType:");
        sbLIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeScreen failed.");
                iNativeSubscribeScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeScreenWithMediaStreamType(j, str, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeSubscribeScreenWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeStream(String str, MediaStreamType mediaStreamType) {
        int iNativeSubscribeStreamWithMediaStreamType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeStream: ");
        sbLIZ.append(str);
        sbLIZ.append(", MediaStreamType:");
        sbLIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                iNativeSubscribeStreamWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeStreamWithMediaStreamType(j, str, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeSubscribeStreamWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnpublishStreamEx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unpublishStream: ");
        sbLIZ.append(streamIndex);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, unpublishStream failed.\"");
                iNativeUnpublishStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnpublishStreamEx = NativeRTCRoomFunctions.nativeUnpublishStreamEx(j, streamIndex.value(), mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnpublishStreamEx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeAllStreamsWithMediaStreamType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeAllStreams MediaStreamType:");
        sbLIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                iNativeUnsubscribeAllStreamsWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeAllStreamsWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeAllStreamsWithMediaStreamType(j, streamIndex.value(), mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnsubscribeAllStreamsWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeScreen(String str, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeScreenWithMediaStreamType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeScreen: ");
        sbLIZ.append(str);
        sbLIZ.append(", MediaStreamType:");
        sbLIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                iNativeUnsubscribeScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeScreenWithMediaStreamType(j, str, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnsubscribeScreenWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeStream(String str, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeStreamWithMediaStreamType;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeStream: ");
        sbLIZ.append(str);
        sbLIZ.append(", MediaStreamType:");
        sbLIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                iNativeUnsubscribeStreamWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeStreamWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeStreamWithMediaStreamType(j, str, mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnsubscribeStreamWithMediaStreamType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        String uid;
        int iNativeJoinRoomWithRoomConfig;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("joinRoom with token: ");
        sbLIZ.append(str);
        sbLIZ.append(",room");
        sbLIZ.append(this.mRoom);
        sbLIZ.append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        sbLIZ.append(uid);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native room is invalid, joinRoom failed.");
                iNativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (userInfo == null || str == null) {
                iNativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                this.mUser = userInfo.getUid();
                iNativeJoinRoomWithRoomConfig = NativeRTCRoomFunctions.nativeJoinRoomWithRoomConfig(this.mNativeRtcRoom, str, userInfo, rTCRoomConfig);
            }
            this.mJniReadLock.unlock();
            return iNativeJoinRoomWithRoomConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendUserBinaryMessage. uid : ");
        sbLIZ.append(str);
        sbLIZ.append(", message length:");
        sbLIZ.append(bArr.length);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendUserBinaryMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            long jNativeSendUserBinaryMessage = NativeRTCRoomFunctions.nativeSendUserBinaryMessage(j, str, bArr, messageConfig.value());
            this.mJniReadLock.unlock();
            return jNativeSendUserBinaryMessage;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendUserMessage. uid : ");
        sbLIZ.append(str);
        sbLIZ.append(", message");
        sbLIZ.append(str2);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendUserMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            long jNativeSendUserMessage = NativeRTCRoomFunctions.nativeSendUserMessage(j, str, str2, messageConfig.value());
            this.mJniReadLock.unlock();
            return jNativeSendUserMessage;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        int iNativeSetRemoteVideoConfig;
        LogUtil.d("RtcRoom", "setRemoteVideoConfig");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid,setRemoteVideoConfig failed.\"");
                iNativeSetRemoteVideoConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoConfig = NativeRTCRoomFunctions.nativeSetRemoteVideoConfig(j, str, streamIndex.value(), remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int setRemoteVideoPerformanceConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        int iNativeSetRemoteVideoPerformanceConfig;
        LogUtil.d("RtcRoom", "setRemoteVideoPerformanceConfig");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid,setRemoteVideoPerformanceConfig failed.\"");
                iNativeSetRemoteVideoPerformanceConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoPerformanceConfig = NativeRTCRoomFunctions.nativeSetRemoteVideoPerformanceConfig(j, str, streamIndex.value(), remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoPerformanceConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeSubscribeStreamEx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeStream: userId: ");
        sbLIZ.append(str);
        sbLIZ.append(", streamIndex: ");
        sbLIZ.append(streamIndex);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, subscribeStream failed.\"");
                iNativeSubscribeStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSubscribeStreamEx = NativeRTCRoomFunctions.nativeSubscribeStreamEx(j, str, streamIndex.value(), mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeSubscribeStreamEx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        int iNativeUnsubscribeStreamEx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeStream: userId: ");
        sbLIZ.append(str);
        sbLIZ.append(", streamIndex: ");
        sbLIZ.append(streamIndex);
        LogUtil.d("RtcRoom", C2188811AlT.LIZIZ(sbLIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, unsubscribeStream failed.\"");
                iNativeUnsubscribeStreamEx = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUnsubscribeStreamEx = NativeRTCRoomFunctions.nativeUnsubscribeStreamEx(j, str, streamIndex.value(), mediaStreamType.value);
            }
            this.mJniReadLock.unlock();
            return iNativeUnsubscribeStreamEx;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom, com.ss.bytertc.engine.RTCRoomInterface
    public int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        boolean z;
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == StreamIndex.STREAM_INDEX_2ND) {
                z = true;
            } else {
                z = false;
            }
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (subscribeVideoConfig != null) {
                iValue = NativeRTCRoomFunctions.nativeSubscribeUserStream(j, str, z, subscribeMediaType.value(), subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
            } else {
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            this.mJniReadLock.unlock();
            return iValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }
}
