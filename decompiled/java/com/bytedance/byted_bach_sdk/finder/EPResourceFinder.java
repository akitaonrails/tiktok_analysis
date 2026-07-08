package com.bytedance.byted_bach_sdk.finder;

import com.bef.effectsdk.ResourceFinder;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class EPResourceFinder extends BachResourceFinder {
    private native long nativeCreate(long j);

    private native void nativeDestroy(long j);

    @Override // com.bytedance.byted_bach_sdk.finder.BachResourceFinder
    public void destroy() {
        if (this.isDestroyed) {
            return;
        }
        this.isDestroyed = true;
        nativeDestroy(this.m_nativePtr);
    }

    public static long generateLongKey() {
        byte[] bArr = new byte[8];
        System.arraycopy(toBytes(UUID.randomUUID()), 0, bArr, 0, 8);
        return ByteBuffer.wrap(bArr).getLong();
    }

    public void finalize() throws Throwable {
        super.finalize();
        destroy();
    }

    public EPResourceFinder(ResourceFinder resourceFinder) {
        this.m_nativePtr = nativeCreate(resourceFinder.createNativeResourceFinder(generateLongKey()));
    }

    public static byte[] toBytes(UUID uuid) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        return byteBufferAllocate.array();
    }
}
