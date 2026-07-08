package com.ss.bytertc.engine.utils;

import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioFrameType;
import com.ss.bytertc.engine.data.AudioSampleRate;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class AudioFrameImpl implements IAudioFrame {
    public ByteBuffer byteBuffer;
    public AudioChannel channel;
    public AudioFrameType frameType;
    public AudioSampleRate sampleRate;
    public int samplesPerChannel;
    public long timestamp;

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public void release() {
    }

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public int data_size() {
        return this.samplesPerChannel * this.channel.value() * 2;
    }

    public AudioFrameImpl() {
        this.frameType = AudioFrameType.FRAME_TYPE_PCM16;
    }

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public AudioChannel channel() {
        return this.channel;
    }

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public AudioFrameType frame_type() {
        return this.frameType;
    }

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public ByteBuffer getDataBuffer() {
        return this.byteBuffer;
    }

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public AudioSampleRate sample_rate() {
        return this.sampleRate;
    }

    @Override // com.ss.bytertc.engine.utils.IAudioFrame
    public long timestamp_us() {
        return this.timestamp;
    }

    public AudioFrameImpl(ByteBuffer byteBuffer, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this.frameType = AudioFrameType.FRAME_TYPE_PCM16;
        this.byteBuffer = byteBuffer;
        this.samplesPerChannel = i;
        this.sampleRate = audioSampleRate;
        this.channel = audioChannel;
    }

    public AudioFrameImpl(byte[] bArr, int i, AudioSampleRate audioSampleRate, AudioChannel audioChannel) {
        this(ByteBuffer.wrap(bArr), i, audioSampleRate, audioChannel);
    }
}
