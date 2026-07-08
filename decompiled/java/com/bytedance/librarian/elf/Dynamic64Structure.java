package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Dynamic64Structure extends Elf$DynamicStructure {
    public Dynamic64Structure(ElfParser elfParser, Elf$Header elf$Header, long j, int i) {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        elfParser.LIZIZ(8, byteBufferAllocate, j2);
        this.LIZ = byteBufferAllocate.getLong();
        elfParser.LIZIZ(8, byteBufferAllocate, j2 + 8);
        this.LIZIZ = byteBufferAllocate.getLong();
    }
}
