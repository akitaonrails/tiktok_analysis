package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Section64Header extends Elf$SectionHeader {
    public Section64Header(ElfParser elfParser, Elf$Header elf$Header) {
        ByteOrder byteOrder;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (elf$Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        this.LIZ = elfParser.LJFF(byteBufferAllocate, elf$Header.LIZJ + ((long) (0 * elf$Header.LJFF)) + 44);
    }
}
