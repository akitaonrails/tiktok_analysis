package com.bytedance.ttminisnative;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public final class PackageDecoderKt {
    public static final native long CreateHandle(String str);

    public static final native void DestroyHandle(long j);

    public static final native int GetFormat(long j, byte[] bArr);

    public static final native int ProcessBytes(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static final native int Read(long j, ByteBuffer byteBuffer);

    public static final native int ReadBytes(long j, byte[] bArr, int i, int i2);

    public static final native void Write(long j, ByteBuffer byteBuffer);

    public static final native void WriteBytes(long j, byte[] bArr, int i, int i2);
}
