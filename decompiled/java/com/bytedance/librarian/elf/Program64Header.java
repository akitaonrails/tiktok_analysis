package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Program64Header extends Elf$ProgramHeader {
    public Program64Header(ElfParser elfParser, Elf$Header elf$Header, long j) {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        long j2 = elf$Header.LIZIZ + (j * ((long) elf$Header.LIZLLL));
        this.LIZ = elfParser.LJFF(byteBufferAllocate, j2);
        elfParser.LIZIZ(8, byteBufferAllocate, 8 + j2);
        this.LIZIZ = byteBufferAllocate.getLong();
        elfParser.LIZIZ(8, byteBufferAllocate, 16 + j2);
        this.LIZJ = byteBufferAllocate.getLong();
        elfParser.LIZIZ(8, byteBufferAllocate, j2 + 40);
        this.LIZLLL = byteBufferAllocate.getLong();
    }
}
