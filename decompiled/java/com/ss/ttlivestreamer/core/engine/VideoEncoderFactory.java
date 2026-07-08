package com.ss.ttlivestreamer.core.engine;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VideoEncoderFactory extends NativeObject {
    public abstract VideoEncoder CreateVideoEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }
}
