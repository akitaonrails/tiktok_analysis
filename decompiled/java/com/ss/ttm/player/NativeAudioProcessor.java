package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class NativeAudioProcessor extends AudioProcessor {
    public long LIZIZ;

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioClose() {
        throw new AndroidRuntimeException("Should not be here");
    }

    private long getNativeWrapper() {
        return this.LIZIZ;
    }

    public static boolean isNativeAudioProcessor(AudioProcessor audioProcessor) {
        return audioProcessor instanceof NativeAudioProcessor;
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioRelease(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    public void setNativeWrapper(long j) {
        this.LIZIZ = j;
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioProcess(ByteBuffer[] byteBufferArr, int i, long j) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioOpen(int i, int i2, int i3, int i4) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
