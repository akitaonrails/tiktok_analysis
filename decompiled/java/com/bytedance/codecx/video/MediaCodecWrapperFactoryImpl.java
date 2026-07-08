package com.bytedance.codecx.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        public final MediaCodec mediaCodec;

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public List<String> getSupportedVendorParameters() {
            if (Build.VERSION.SDK_INT >= 31) {
                return this.mediaCodec.getSupportedVendorParameters();
            }
            return null;
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void reset() {
            this.mediaCodec.reset();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public Surface createPersistentInputSurface() {
            return MediaCodec.createPersistentInputSurface();
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public MediaCodec getRealCodec() {
            return this.mediaCodec;
        }

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public ByteBuffer getInputBuffer(int i) {
            return this.mediaCodec.getInputBuffer(i);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public ByteBuffer getOutputBuffer(int i) {
            return this.mediaCodec.getOutputBuffer(i);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public MediaFormat getOutputFormat(int i) {
            return this.mediaCodec.getOutputFormat(i);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void setInputSurface(Surface surface) {
            this.mediaCodec.setInputSurface(surface);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void setOutputSurface(Surface surface) {
            this.mediaCodec.setOutputSurface(surface);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i, long j) {
            this.mediaCodec.releaseOutputBuffer(i, j);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void setCallback(MediaCodec.Callback callback, Handler handler) {
            if (handler == null) {
                this.mediaCodec.setCallback(callback);
            } else {
                this.mediaCodec.setCallback(callback, handler);
            }
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        @Override // com.bytedance.codecx.video.MediaCodecWrapper
        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }
    }

    @Override // com.bytedance.codecx.video.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
