package com.ss.ttlivestreamer.core.audiorecord;

import com.ss.ttlivestreamer.core.engine.NativeObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class AudioRecordProcessor extends NativeObject {
    private native int nativeAudioRecordInit(String str, int i, int i2, int i3);

    private native int nativeAudioRecordWritePcm(ByteBuffer byteBuffer);

    private native int nativeCreate();

    private native void nativeStopAudioRecord();

    public AudioRecordProcessor() {
        nativeCreate();
    }

    public void stopRecord() {
        nativeStopAudioRecord();
    }

    public void writePcm(ByteBuffer byteBuffer) {
        nativeAudioRecordWritePcm(byteBuffer);
    }

    public int init(String str, int i, int i2, int i3) {
        return nativeAudioRecordInit(str, i, i2, i3);
    }
}
