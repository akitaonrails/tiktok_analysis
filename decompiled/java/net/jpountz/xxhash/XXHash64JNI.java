package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class XXHash64JNI extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JNI();
    public static XXHash64 SAFE_INSTANCE;

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(ByteBuffer byteBuffer, int i, int i2, long j) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i, i2);
            return XXHashJNI.XXH64BB(byteBuffer, i, i2, j);
        }
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i + byteBuffer.arrayOffset(), i2, j);
        }
        XXHash64 xXHash64Hash64 = SAFE_INSTANCE;
        if (xXHash64Hash64 == null) {
            xXHash64Hash64 = XXHashFactory.safeInstance().hash64();
            SAFE_INSTANCE = xXHash64Hash64;
        }
        return xXHash64Hash64.hash(byteBuffer, i, i2, j);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(byte[] bArr, int i, int i2, long j) {
        SafeUtils.checkRange(bArr, i, i2);
        return XXHashJNI.XXH64(bArr, i, i2, j);
    }
}
