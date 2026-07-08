package ttpobfuscated;

import X.C13LQ;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes24.dex */
public final class z {
    public static final List<Integer> a(ByteBuffer byteBuffer, int i, byte b) {
        int iA = f3.a(i);
        int[] iArr = new int[iA];
        a(byteBuffer, Integer.valueOf(f3.a(i, b)), iA * 4, false, 4, (Object) null).asIntBuffer().get(iArr);
        return C13LQ.LJJLJ(iArr);
    }

    public static final ByteBuffer a(ByteBuffer byteBuffer, Integer num, int i, boolean z) throws pa {
        int iPosition = byteBuffer.position();
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue <= byteBuffer.limit()) {
                byteBuffer.position(iIntValue);
            } else {
                throw new pa("Section position [" + iIntValue + "] is out of array bounds [limit: " + byteBuffer.limit() + ']');
            }
        }
        if (i <= byteBuffer.remaining()) {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.limit(i);
            ByteBuffer byteBufferOrder = byteBufferSlice.order(byteBuffer.order());
            if (z) {
                byteBuffer.position(iPosition);
                return byteBufferOrder;
            }
            byteBuffer.position(byteBuffer.position() + i);
            return byteBufferOrder;
        }
        throw new pa("Section length: " + i + " is out of array bounds [position: " + byteBuffer.position() + ", limit: " + byteBuffer.limit() + ']');
    }

    public static final String a(ByteBuffer byteBuffer, Integer num, int i, Charset charset) {
        return charset.decode(a(byteBuffer, num, i, false, 4, (Object) null)).toString();
    }

    public static final String a(ByteBuffer byteBuffer, int i, byte b, Charset charset) {
        return a(byteBuffer, Integer.valueOf(f3.a(i, b)), f3.a(i), charset);
    }

    public static /* synthetic */ String a(ByteBuffer byteBuffer, Integer num, int i, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(byteBuffer, num, i, charset);
    }

    public static /* synthetic */ ByteBuffer a(ByteBuffer byteBuffer, Integer num, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(byteBuffer, num, i, z);
    }

    public static /* synthetic */ String a(ByteBuffer byteBuffer, int i, byte b, Charset charset, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(byteBuffer, i, b, charset);
    }
}
