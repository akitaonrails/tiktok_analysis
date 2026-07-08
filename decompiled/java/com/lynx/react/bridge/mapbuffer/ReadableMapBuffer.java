package com.lynx.react.bridge.mapbuffer;

import X.C2188811AlT;
import X.EnumC1312840kGg;
import X.InterfaceC1312510kG9;
import X.InterfaceC1312870kGj;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class ReadableMapBuffer extends d implements InterfaceC1312870kGj {
    @Override // com.lynx.react.bridge.mapbuffer.d
    public final int LIZJ(int i) {
        return (i * 12) + 8;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1312510kG9> iterator() {
        return new Iterator<InterfaceC1312510kG9>(this) { // from class: X.0kGd
            public final C1312820kGe LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL.hasNext();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.0kG9, java.lang.Object] */
            @Override // java.util.Iterator
            public final InterfaceC1312510kG9 next() {
                return this.LL.next();
            }

            {
                this.getClass();
                this.LL = new C1312820kGe(this);
            }
        };
    }

    public final int LJFF(int i) {
        int i2 = this.LLILLJJLI - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >> 1;
            short s = this.LL.getShort((i4 * 12) + 8);
            if (s < i) {
                i3 = i4 + 1;
            } else if (s > i) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1312870kGj
    public final ReadableMapBuffer LJJJZ(int i) {
        return new ReadableMapBuffer(-1, ByteBuffer.wrap(LJ(LJIIIIZZ(i, EnumC1312840kGg.ARRAY))));
    }

    @Override // X.InterfaceC1312870kGj
    public final boolean LJLJL(int i) {
        if (LJFF(i) != -1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1312870kGj
    public final boolean getBoolean(int i) {
        if (this.LL.getInt(LJIIIIZZ(i, EnumC1312840kGg.BOOL)) == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1312870kGj
    public final double getDouble(int i) {
        return this.LL.getDouble(LJIIIIZZ(i, EnumC1312840kGg.DOUBLE));
    }

    @Override // X.InterfaceC1312870kGj
    public final int getInt(int i) {
        return this.LL.getInt(LJIIIIZZ(i, EnumC1312840kGg.INT));
    }

    @Override // X.InterfaceC1312870kGj
    public final long getLong(int i) {
        return this.LL.getLong(LJIIIIZZ(i, EnumC1312840kGg.LONG));
    }

    @Override // X.InterfaceC1312870kGj
    public final String getString(int i) {
        return new String(LJ(LJIIIIZZ(i, EnumC1312840kGg.STRING)), Charset.defaultCharset());
    }

    @Override // X.InterfaceC1312870kGj
    public final EnumC1312840kGg getType(int i) {
        return EnumC1312840kGg.values()[this.LL.getShort((LJFF(i) * 12) + 8 + 2)];
    }

    public ReadableMapBuffer(int i, ByteBuffer byteBuffer) {
        super(i, 4, byteBuffer);
    }

    public static ReadableMapBuffer fromByteBufferWithCount(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        return new ReadableMapBuffer(i, ByteBuffer.wrap(bArr));
    }

    public final int LJIIIIZZ(int i, EnumC1312840kGg enumC1312840kGg) {
        int iLJFF = LJFF(i);
        if (iLJFF == -1) {
            return -1;
        }
        int i2 = (iLJFF * 12) + 8;
        EnumC1312840kGg enumC1312840kGg2 = EnumC1312840kGg.values()[this.LL.getShort(i2 + 2)];
        if (enumC1312840kGg2 == enumC1312840kGg) {
            return i2 + 4;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(enumC1312840kGg);
        sbLIZ.append(" for key: ");
        sbLIZ.append(i);
        sbLIZ.append(", found ");
        sbLIZ.append(enumC1312840kGg2);
        sbLIZ.append(" instead.");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
