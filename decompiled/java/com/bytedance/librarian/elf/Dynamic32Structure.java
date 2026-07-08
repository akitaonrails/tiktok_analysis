package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Dynamic32Structure extends Elf$DynamicStructure {
    public Dynamic32Structure(ElfParser elfParser, Elf$Header elf$Header, long j, int i) {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j2 = j + ((long) (i * 8));
        this.LIZ = elfParser.LJFF(byteBufferAllocate, j2);
        this.LIZIZ = elfParser.LJFF(byteBufferAllocate, j2 + 4);
    }
}
