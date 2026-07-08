package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AudioSink extends NativeObject {
    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
    }

    public abstract void onData(Buffer buffer, int i, int i2, int i3, long j);

    public abstract void onNoData();
}
