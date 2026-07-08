package com.ss.ttlivestreamer.core.codec;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.AudioEncoder;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeAudioEncoder extends AudioEncoder {
    public NativeAudioEncoder(long j) {
        this.mNativeObj = j;
    }

    public static boolean isNativeAudioEncoderInstance(Object obj) {
        return obj instanceof NativeAudioEncoder;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public int SetBitrate(int i) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioEncoder
    public int Encode(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Native direct mode");
    }
}
