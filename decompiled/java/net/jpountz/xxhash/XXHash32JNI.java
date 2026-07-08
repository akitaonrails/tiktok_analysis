package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class XXHash32JNI extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JNI();
    public static XXHash32 SAFE_INSTANCE;

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i, i2);
            return XXHashJNI.XXH32BB(byteBuffer, i, i2, i3);
        }
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i + byteBuffer.arrayOffset(), i2, i3);
        }
        XXHash32 xXHash32Hash32 = SAFE_INSTANCE;
        if (xXHash32Hash32 == null) {
            xXHash32Hash32 = XXHashFactory.safeInstance().hash32();
            SAFE_INSTANCE = xXHash32Hash32;
        }
        return xXHash32Hash32.hash(byteBuffer, i, i2, i3);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(byte[] bArr, int i, int i2, int i3) {
        SafeUtils.checkRange(bArr, i, i2);
        return XXHashJNI.XXH32(bArr, i, i2, i3);
    }
}
