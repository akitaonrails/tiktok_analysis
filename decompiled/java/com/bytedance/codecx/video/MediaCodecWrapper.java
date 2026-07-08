package com.bytedance.codecx.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i);

    Surface createInputSurface();

    Surface createPersistentInputSurface();

    int dequeueInputBuffer(long j);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer[] getInputBuffers();

    ByteBuffer getOutputBuffer(int i);

    ByteBuffer[] getOutputBuffers();

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i);

    MediaCodec getRealCodec();

    List<String> getSupportedVendorParameters();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, long j);

    void releaseOutputBuffer(int i, boolean z);

    void reset();

    void setCallback(MediaCodec.Callback callback, Handler handler);

    void setInputSurface(Surface surface);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
