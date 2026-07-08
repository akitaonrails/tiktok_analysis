package com.bytedance.librarian.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes31.dex */
public class Elf64Header extends Elf$Header {
    public final ElfParser LJI;

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$SectionHeader LIZJ() {
        return new Section64Header(this.LJI, this);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$ProgramHeader LIZIZ(long j) {
        return new Program64Header(this.LJI, this, j);
    }

    public Elf64Header(boolean z, ElfParser elfParser) {
        ByteOrder byteOrder;
        this.LIZ = z;
        this.LJI = elfParser;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBufferAllocate.order(byteOrder);
        elfParser.LIZLLL(byteBufferAllocate, 16L);
        elfParser.LIZIZ(8, byteBufferAllocate, 32L);
        this.LIZIZ = byteBufferAllocate.getLong();
        elfParser.LIZIZ(8, byteBufferAllocate, 40L);
        this.LIZJ = byteBufferAllocate.getLong();
        this.LIZLLL = elfParser.LIZLLL(byteBufferAllocate, 54L);
        this.LJ = elfParser.LIZLLL(byteBufferAllocate, 56L);
        this.LJFF = elfParser.LIZLLL(byteBufferAllocate, 58L);
        elfParser.LIZLLL(byteBufferAllocate, 60L);
        elfParser.LIZLLL(byteBufferAllocate, 62L);
    }

    @Override // com.bytedance.librarian.elf.Elf$Header
    public final Elf$DynamicStructure LIZ(int i, long j) {
        return new Dynamic64Structure(this.LJI, this, j, i);
    }
}
