package com.lynx.react.bridge.mapbuffer;

import X.InterfaceC1311710kEr;
import X.InterfaceC1312860kGi;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class ReadableCompactArrayBuffer extends d implements InterfaceC1312860kGi {
    @Override // com.lynx.react.bridge.mapbuffer.d
    public final int LIZJ(int i) {
        return (i * 8) + 8;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1311710kEr> iterator() {
        return new Iterator<InterfaceC1311710kEr>(this) { // from class: X.0kGc
            public final C1312820kGe LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.0kEr, java.lang.Object] */
            @Override // java.util.Iterator
            public final InterfaceC1311710kEr next() {
                return this.LL.next();
            }

            {
                this.getClass();
                this.LL = new C1312820kGe(this);
            }
        };
    }

    public ReadableCompactArrayBuffer(int i, ByteBuffer byteBuffer) {
        super(i, 0, byteBuffer);
    }

    public static ReadableCompactArrayBuffer fromByteBufferWithCount(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        return new ReadableCompactArrayBuffer(i, ByteBuffer.wrap(bArr));
    }
}
