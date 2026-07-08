package net.jpountz.xxhash;

import X.C08FF;
import java.nio.ByteBuffer;
import net.jpountz.util.Native;

/* JADX INFO: loaded from: classes36.dex */
public enum XXHashJNI {
    ;

    static {
        Native.load();
        init();
    }

    public static native int XXH32(byte[] bArr, int i, int i2, int i3);

    public static native int XXH32BB(ByteBuffer byteBuffer, int i, int i2, int i3);

    public static native int XXH32_digest(long j);

    public static native void XXH32_free(long j);

    public static native long XXH32_init(int i);

    public static native void XXH32_update(long j, byte[] bArr, int i, int i2);

    public static native long XXH64(byte[] bArr, int i, int i2, long j);

    public static native long XXH64BB(ByteBuffer byteBuffer, int i, int i2, long j);

    public static native long XXH64_digest(long j);

    public static native void XXH64_free(long j);

    public static native long XXH64_init(long j);

    public static native void XXH64_update(long j, byte[] bArr, int i, int i2);

    public static native void init();

    public static XXHashJNI valueOf(String str) {
        return (XXHashJNI) C08FF.LIZ(XXHashJNI.class, str);
    }
}
