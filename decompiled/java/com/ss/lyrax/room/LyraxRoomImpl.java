package com.ss.lyrax.room;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.ILyraxPublisher;
import com.ss.lyrax.ILyraxRoom;
import com.ss.lyrax.ILyraxSubscriber;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.publisher.LyraxPublisherImpl;
import com.ss.lyrax.stream.LyraxForwardStreamInfo;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamMediaType;
import com.ss.lyrax.transcoder.LyraxTranscoderParam;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import com.ss.lyrax.utils.LyraxValue;
import com.ss.lyrax.video.LyraxVideoPerfDegradeLimit;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRoomImpl implements ILyraxRoom {
    public final long handle;
    public Set<ILyraxPublisher> publishSet = Collections.synchronizedSet(new HashSet(LyraxStreamIndex.kMax.value()));

    public static native LyraxErrorCode nativeAddPublisher(long j, long j2);

    public static native LyraxErrorCode nativeAddSubscriber(long j, long j2);

    public static native void nativeDispose(long j);

    public static native boolean nativeEquals(long j, long j2);

    public static native long nativeGetDestroyRoom();

    public static native String nativeGetLocalUserId(long j);

    public static native long nativeGetPublisher(long j, LyraxStreamIndex lyraxStreamIndex);

    public static native String nativeGetRoomId(long j);

    public static native LyraxErrorCode nativeJoinRoom(long j, String str, LyraxUserInfo lyraxUserInfo, LyraxRoomConfig lyraxRoomConfig);

    public static native LyraxErrorCode nativeLeaveRoom(long j);

    public static native LyraxErrorCode nativeMuteAllRemoteStream(long j, LyraxStreamIndex lyraxStreamIndex, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativePauseAllSubscribedStream(long j, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativeRemovePublisher(long j, long j2);

    public static native LyraxErrorCode nativeRemoveSubscriber(long j, long j2);

    public static native LyraxErrorCode nativeReplayUserInfoNotification(long j);

    public static native LyraxErrorCode nativeResumeAllSubscribedStream(long j, LyraxStreamMediaType lyraxStreamMediaType);

    public static native long nativeSendRoomMessage(long j, String str);

    public static native long nativeSendUserMessage(long j, String str, String str2, LyraxMessageType lyraxMessageType);

    public static native LyraxErrorCode nativeSetDefaultRemoteVideoConfig(long j, LyraxVideoRemoteConfig lyraxVideoRemoteConfig);

    public static native LyraxErrorCode nativeSetLinkMicType(long j, LyraxLinkMicType lyraxLinkMicType);

    public static native LyraxErrorCode nativeSetListener(long j, ILyraxRoomListener iLyraxRoomListener);

    public static native LyraxErrorCode nativeSetLyraxRoomAutoSubscribeStrategy(long j, ILyraxRoomAutoSubscribeStrategy iLyraxRoomAutoSubscribeStrategy);

    public static native LyraxErrorCode nativeSetPostProcessParameter(long j, LyraxPostProcessParameter lyraxPostProcessParameter);

    public static native LyraxErrorCode nativeSetRemoteAudioPlaybackVolume(long j, int i);

    public static native LyraxErrorCode nativeSetRemoteUserAudioPlaybackVolume(long j, String str, int i);

    public static native LyraxErrorCode nativeSetRoomAttribute(long j, LyraxRoomAttribute lyraxRoomAttribute, LyraxValue lyraxValue);

    public static native LyraxErrorCode nativeSetRoomVisibility(long j, LyraxRoomVisibility lyraxRoomVisibility);

    public static native LyraxErrorCode nativeSetUserVisibility(long j, boolean z);

    public static native LyraxErrorCode nativeSetVideoPerfDegradeLimit(long j, String str, LyraxStreamIndex lyraxStreamIndex, LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit);

    public static native LyraxErrorCode nativeStartForwardStreamToRooms(long j, List<LyraxForwardStreamInfo> list);

    public static native LyraxErrorCode nativeStartPushMixedStreamToCDN(long j, String str, LyraxTranscoderParam lyraxTranscoderParam);

    public static native LyraxErrorCode nativeStopForwardStreamToRooms(long j);

    public static native LyraxErrorCode nativeStopPushMixedStreamToCDN(long j, String str);

    public static native LyraxErrorCode nativeUnmuteAllRemoteStream(long j, LyraxStreamIndex lyraxStreamIndex, LyraxStreamMediaType lyraxStreamMediaType);

    public static native LyraxErrorCode nativeUpdateForwardStreamToRooms(long j, List<LyraxForwardStreamInfo> list);

    public static native LyraxErrorCode nativeUpdatePushMixedStreamToCDN(long j, String str, LyraxTranscoderParam lyraxTranscoderParam);

    public static native LyraxErrorCode nativeUpdateToken(long j, String str);

    @Override // com.ss.lyrax.ILyraxRoom
    public synchronized void dispose() {
        Iterator<ILyraxPublisher> it2 = this.publishSet.iterator();
        while (it2.hasNext()) {
            ILyraxPublisher next = it2.next();
            if (next != null) {
                next.dispose();
                it2.remove();
            }
        }
        nativeDispose(this.handle);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyRoom(), this.handle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public String getLocalUserId() {
        return nativeGetLocalUserId(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public String getRoomId() {
        return nativeGetRoomId(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode leaveRoom() {
        return nativeLeaveRoom(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode replayUserInfoNotification() {
        return nativeReplayUserInfoNotification(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode stopForwardStreamToRooms() {
        return nativeStopForwardStreamToRooms(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxRoomImpl(long j) {
        if (j != 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                LyraxNativeCleaner.register(this, j, nativeGetDestroyRoom());
            }
            this.handle = j;
            return;
        }
        throw new IllegalStateException("native handle is invalid");
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public synchronized LyraxErrorCode addPublisher(ILyraxPublisher iLyraxPublisher) {
        if (iLyraxPublisher == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        this.publishSet.add(iLyraxPublisher);
        return nativeAddPublisher(this.handle, iLyraxPublisher.getNativePtr());
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode addSubscriber(ILyraxSubscriber iLyraxSubscriber) {
        return nativeAddSubscriber(this.handle, iLyraxSubscriber.getNativePtr());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LyraxRoomImpl)) {
            return nativeEquals(this.handle, ((LyraxRoomImpl) obj).handle);
        }
        return false;
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public synchronized boolean findPublisher(ILyraxPublisher iLyraxPublisher) {
        return this.publishSet.contains(iLyraxPublisher);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public synchronized ILyraxPublisher getPublisher(LyraxStreamIndex lyraxStreamIndex) {
        long jNativeGetPublisher = nativeGetPublisher(this.handle, lyraxStreamIndex);
        if (jNativeGetPublisher != 0) {
            LyraxPublisherImpl lyraxPublisherImpl = new LyraxPublisherImpl(jNativeGetPublisher);
            this.publishSet.add(lyraxPublisherImpl);
            return lyraxPublisherImpl;
        }
        return null;
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode pauseAllSubscribedStream(LyraxStreamMediaType lyraxStreamMediaType) {
        return nativePauseAllSubscribedStream(this.handle, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public synchronized LyraxErrorCode removePublisher(ILyraxPublisher iLyraxPublisher) {
        if (iLyraxPublisher == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        this.publishSet.remove(iLyraxPublisher);
        return nativeRemovePublisher(this.handle, iLyraxPublisher.getNativePtr());
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode removeSubscriber(ILyraxSubscriber iLyraxSubscriber) {
        return nativeRemoveSubscriber(this.handle, iLyraxSubscriber.getNativePtr());
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode resumeAllSubscribedStream(LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeResumeAllSubscribedStream(this.handle, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public long sendRoomMessage(String str) {
        return nativeSendRoomMessage(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setDefaultRemoteVideoConfig(LyraxVideoRemoteConfig lyraxVideoRemoteConfig) {
        return nativeSetDefaultRemoteVideoConfig(this.handle, lyraxVideoRemoteConfig);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setLinkMicType(LyraxLinkMicType lyraxLinkMicType) {
        return nativeSetLinkMicType(this.handle, lyraxLinkMicType);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setListener(ILyraxRoomListener iLyraxRoomListener) {
        return nativeSetListener(this.handle, iLyraxRoomListener);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setLyraxRoomAutoSubscribeStrategy(ILyraxRoomAutoSubscribeStrategy iLyraxRoomAutoSubscribeStrategy) {
        return nativeSetLyraxRoomAutoSubscribeStrategy(this.handle, iLyraxRoomAutoSubscribeStrategy);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setPostProcessParameter(LyraxPostProcessParameter lyraxPostProcessParameter) {
        return nativeSetPostProcessParameter(this.handle, lyraxPostProcessParameter);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setRemoteAudioPlaybackVolume(int i) {
        return nativeSetRemoteAudioPlaybackVolume(this.handle, i);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setRoomVisibility(LyraxRoomVisibility lyraxRoomVisibility) {
        return nativeSetRoomVisibility(this.handle, lyraxRoomVisibility);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setUserVisibility(boolean z) {
        return nativeSetUserVisibility(this.handle, z);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode startForwardStreamToRooms(List<LyraxForwardStreamInfo> list) {
        long j = this.handle;
        if (j != 0) {
            return nativeStartForwardStreamToRooms(j, list);
        }
        throw new IllegalStateException("native handle is invalid");
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode stopPushMixedStreamToCDN(String str) {
        return nativeStopPushMixedStreamToCDN(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode updateForwardStreamToRooms(List<LyraxForwardStreamInfo> list) {
        long j = this.handle;
        if (j != 0) {
            return nativeUpdateForwardStreamToRooms(j, list);
        }
        throw new IllegalStateException("native handle is invalid");
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode updateToken(String str) {
        return nativeUpdateToken(this.handle, str);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode muteAllRemoteStream(LyraxStreamIndex lyraxStreamIndex, LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeMuteAllRemoteStream(this.handle, lyraxStreamIndex, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setRemoteAudioPlaybackVolume(String str, int i) {
        return nativeSetRemoteUserAudioPlaybackVolume(this.handle, str, i);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setRoomAttribute(LyraxRoomAttribute lyraxRoomAttribute, LyraxValue lyraxValue) {
        return nativeSetRoomAttribute(this.handle, lyraxRoomAttribute, lyraxValue);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode startPushMixedStreamToCDN(String str, LyraxTranscoderParam lyraxTranscoderParam) {
        return nativeStartPushMixedStreamToCDN(this.handle, str, lyraxTranscoderParam);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode unmuteAllRemoteStream(LyraxStreamIndex lyraxStreamIndex, LyraxStreamMediaType lyraxStreamMediaType) {
        return nativeUnmuteAllRemoteStream(this.handle, lyraxStreamIndex, lyraxStreamMediaType);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode updatePushMixedStreamToCDN(String str, LyraxTranscoderParam lyraxTranscoderParam) {
        return nativeUpdatePushMixedStreamToCDN(this.handle, str, lyraxTranscoderParam);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode joinRoom(String str, LyraxUserInfo lyraxUserInfo, LyraxRoomConfig lyraxRoomConfig) {
        return nativeJoinRoom(this.handle, str, lyraxUserInfo, lyraxRoomConfig);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public long sendUserMessage(String str, String str2, LyraxMessageType lyraxMessageType) {
        return nativeSendUserMessage(this.handle, str, str2, lyraxMessageType);
    }

    @Override // com.ss.lyrax.ILyraxRoom
    public LyraxErrorCode setVideoPerfDegradeLimit(String str, LyraxStreamIndex lyraxStreamIndex, LyraxVideoPerfDegradeLimit lyraxVideoPerfDegradeLimit) {
        return nativeSetVideoPerfDegradeLimit(this.handle, str, lyraxStreamIndex, lyraxVideoPerfDegradeLimit);
    }
}
