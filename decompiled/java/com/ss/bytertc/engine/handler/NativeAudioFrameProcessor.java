package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.utils.AudioFrameImpl;
import com.ss.bytertc.engine.utils.IAudioFrame;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes21.dex */
public class NativeAudioFrameProcessor {
    public static StreamKey createStreamKey(String str, String str2, int i) {
        return new StreamKey(str, str2, StreamIndex.fromId(i));
    }

    public static IAudioFrame createAudioFrameImpl(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byteBuffer.order(ByteOrder.nativeOrder());
        return new AudioFrameImpl(byteBuffer, i, AudioSampleRate.fromId(i2), AudioChannel.fromId(i3));
    }
}
