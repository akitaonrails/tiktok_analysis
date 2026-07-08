package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class RTCExternalVideoEncoderEventHandler {
    public WeakReference<RTCVideoImpl> mRtcVideoImpl;

    public RTCExternalVideoEncoderEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRtcVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public void OnStart(int i) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onStart(StreamIndex.fromId(i));
        }
    }

    public void OnStop(int i) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onStop(StreamIndex.fromId(i));
        }
    }

    public void OnRequestKeyFrame(int i, int i2) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onRequestKeyFrame(StreamIndex.fromId(i), i2);
        }
    }

    public void OnActiveVideoLayer(int i, int i2, boolean z) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onActiveVideoLayer(StreamIndex.fromId(i), i2, z);
        }
    }

    public void OnRateUpdate(int i, int i2, int i3, int i4) {
        RTCVideoImpl rTCVideoImpl;
        IExternalVideoEncoderEventHandler externalVideoEncoderEventHandler;
        WeakReference<RTCVideoImpl> weakReference = this.mRtcVideoImpl;
        if (weakReference != null && (rTCVideoImpl = weakReference.get()) != null && (externalVideoEncoderEventHandler = rTCVideoImpl.getExternalVideoEncoderEventHandler()) != null) {
            externalVideoEncoderEventHandler.onRateUpdate(StreamIndex.fromId(i), i2, i3, i4);
        }
    }
}
