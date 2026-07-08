package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Program32Header extends Elf$ProgramHeader {
    public Program32Header(ElfParser elfParser, Elf$Header elf$Header, long j) {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j2 = elf$Header.LIZIZ + (j * ((long) elf$Header.LIZLLL));
        this.LIZ = elfParser.LJFF(byteBufferAllocate, j2);
        this.LIZIZ = elfParser.LJFF(byteBufferAllocate, 4 + j2);
        this.LIZJ = elfParser.LJFF(byteBufferAllocate, 8 + j2);
        this.LIZLLL = elfParser.LJFF(byteBufferAllocate, j2 + 20);
    }
}
