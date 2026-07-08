package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Elf32Header extends Elf$Header {
    public final ElfParser LJI;

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$SectionHeader LIZJ() {
        return new Section32Header(this.LJI, this);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$ProgramHeader LIZIZ(long j) {
        return new Program32Header(this.LJI, this, j);
    }

    public Elf32Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.LIZ = z;
        this.LJI = elfParser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        elfParser.LIZLLL(byteBufferAllocate, 16L);
        this.LIZIZ = elfParser.LJFF(byteBufferAllocate, 28L);
        this.LIZJ = elfParser.LJFF(byteBufferAllocate, 32L);
        this.LIZLLL = elfParser.LIZLLL(byteBufferAllocate, 42L);
        this.LJ = elfParser.LIZLLL(byteBufferAllocate, 44L);
        this.LJFF = elfParser.LIZLLL(byteBufferAllocate, 46L);
        elfParser.LIZLLL(byteBufferAllocate, 48L);
        elfParser.LIZLLL(byteBufferAllocate, 50L);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$DynamicStructure LIZ(int i, long j) {
        return new Dynamic32Structure(this.LJI, this, j, i);
    }
}
