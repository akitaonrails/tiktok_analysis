package com.squareup.wire;

import X.InterfaceC1496780p3M;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class ProtoWriter {
    public final InterfaceC1496780p3M LIZ;

    public static int LIZ(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int LIZIZ(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public ProtoWriter(InterfaceC1496780p3M interfaceC1496780p3M) {
        this.LIZ = interfaceC1496780p3M;
    }

    public void writeBytes(ByteString byteString) {
        this.LIZ.LJJJI(byteString);
    }

    public void writeFixed32(int i) {
        this.LIZ.LL(i);
    }

    public void writeFixed64(long j) {
        this.LIZ.LJLLLLLL(j);
    }

    public void writeString(String str) {
        this.LIZ.LJLLILLLL(str);
    }

    public void writeVarint32(int i) {
        while ((i & (-128)) != 0) {
            this.LIZ.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        this.LIZ.writeByte(i);
    }

    public void writeVarint64(long j) {
        while (((-128) & j) != 0) {
            this.LIZ.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.LIZ.writeByte((int) j);
    }

    public void writeTag(int i, FieldEncoding fieldEncoding) {
        writeVarint32((i << 3) | fieldEncoding.LL);
    }
}
