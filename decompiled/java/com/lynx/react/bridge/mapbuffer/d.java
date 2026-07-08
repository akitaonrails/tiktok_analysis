package com.lynx.react.bridge.mapbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {
    public final ByteBuffer LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;

    public abstract int LIZJ(int i);

    public final int hashCode() {
        this.LL.rewind();
        return this.LL.hashCode();
    }

    public final int count() {
        return this.LLILLJJLI;
    }

    public final byte[] LJ(int i) {
        int i2 = this.LLILZ + this.LL.getInt(i);
        int i3 = this.LL.getInt(i2);
        byte[] bArr = new byte[i3];
        this.LL.position(i2 + 4);
        this.LL.get(bArr, 0, i3);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.LLILLJJLI == dVar.LLILLJJLI && Objects.equals(this.LL, dVar.LL)) {
            return true;
        }
        return false;
    }

    public d(int i, int i2, ByteBuffer byteBuffer) {
        this.LL = byteBuffer;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        if (byteBuffer != null) {
            byteBuffer.order(ByteOrder.nativeOrder());
            if (this.LLILLJJLI == -1) {
                byteBuffer.position(2);
                this.LLILLJJLI = byteBuffer.getShort(byteBuffer.position());
            }
            this.LLILZ = LIZJ(this.LLILLJJLI);
        }
    }
}
