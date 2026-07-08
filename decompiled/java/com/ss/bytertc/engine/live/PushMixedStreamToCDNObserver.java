package com.ss.bytertc.engine.live;

import com.bytedance.realx.video.VideoFrame;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class PushMixedStreamToCDNObserver {
    public Map<String, IMixedStreamObserver> mLiveTransObserver = new HashMap();
    public Map<String, Boolean> mSupportClientPushStream = new HashMap();

    public void onCacheSyncVideoFrames(String str, String[] strArr, VideoFrame[] videoFrameArr, byte[][] bArr, int i) {
    }

    public void onMixingVideoFrame(String str, VideoFrame videoFrame) {
    }

    public boolean isSupportClientPushStream(String str) {
        Map<String, Boolean> map = this.mSupportClientPushStream;
        if (map != null && map.containsKey(str)) {
            return this.mSupportClientPushStream.get(str).booleanValue();
        }
        return false;
    }

    public void setUserObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        if (this.mLiveTransObserver == null) {
            this.mLiveTransObserver = new HashMap();
        }
        if (this.mSupportClientPushStream == null) {
            this.mSupportClientPushStream = new HashMap();
        }
        this.mLiveTransObserver.put(str, iMixedStreamObserver);
        if (iMixedStreamObserver != null) {
            this.mSupportClientPushStream.put(str, Boolean.valueOf(iMixedStreamObserver.isSupportClientPushStream()));
        } else {
            this.mSupportClientPushStream.put(str, Boolean.FALSE);
        }
    }

    public void onMixingDataFrame(String str, byte[] bArr, long j) {
        IMixedStreamObserver iMixedStreamObserver;
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str) && (iMixedStreamObserver = this.mLiveTransObserver.get(str)) != null) {
            iMixedStreamObserver.onMixingDataFrame(str, bArr, j);
        }
    }

    public void onMixingAudioFrame(String str, byte[] bArr, int i, long j) {
        IMixedStreamObserver iMixedStreamObserver;
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str) && (iMixedStreamObserver = this.mLiveTransObserver.get(str)) != null) {
            iMixedStreamObserver.onMixingAudioFrame(str, bArr, i, j);
        }
    }

    public void onMixingEvent(ByteRTCStreamMixingEvent byteRTCStreamMixingEvent, String str, ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode, int i, String str2, MixedStreamType mixedStreamType) {
        IMixedStreamObserver iMixedStreamObserver;
        Map<String, IMixedStreamObserver> map = this.mLiveTransObserver;
        if (map != null && map.containsKey(str) && (iMixedStreamObserver = this.mLiveTransObserver.get(str)) != null) {
            iMixedStreamObserver.onMixingEvent(byteRTCStreamMixingEvent, str, byteRTCTranscoderErrorCode, i, str2, mixedStreamType);
        }
    }
}
