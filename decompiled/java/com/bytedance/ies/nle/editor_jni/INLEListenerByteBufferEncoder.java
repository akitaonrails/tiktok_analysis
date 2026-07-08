package com.bytedance.ies.nle.editor_jni;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public interface INLEListenerByteBufferEncoder {
    void onEncoderDataAvailable(ByteBuffer byteBuffer, long j, int i, boolean z);
}
