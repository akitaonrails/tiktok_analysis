package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class RTCMetadataObserver {
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCMetadataObserver(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public byte[] onReadyToSendMetadata(long j) {
        RTCVideoImpl rTCVideoImpl;
        IMetadataObserver metadataObserver;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference == null || (rTCVideoImpl = weakReference.get()) == null || (metadataObserver = rTCVideoImpl.getMetadataObserver()) == null) {
            return null;
        }
        return metadataObserver.onReadyToSendMetadata(j);
    }

    public void onMetadataReceived(byte[] bArr, String str, long j) {
        RTCVideoImpl rTCVideoImpl;
        IMetadataObserver metadataObserver;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (metadataObserver = rTCVideoImpl.getMetadataObserver()) != null) {
            metadataObserver.onMetadataReceived(bArr, str, j);
        }
    }
}
