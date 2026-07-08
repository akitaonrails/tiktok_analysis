package com.bytedance.librarian.elf;

import X.C0VSJ;
import X.C0VSP;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ElfParser implements Closeable {
    public final FileChannel LL;

    public final List<String> LIZ() throws IOException {
        Elf$Header elf64Header;
        Elf$DynamicStructure elf$DynamicStructureLIZ;
        this.LL.position(0L);
        ArrayList arrayList = new ArrayList();
        this.LL.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (LJFF(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        LIZIZ(1, byteBufferAllocate, 4L);
        short s = (short) (byteBufferAllocate.get() & 255);
        LIZIZ(1, byteBufferAllocate, 5L);
        int i = 0;
        boolean z = ((short) (byteBufferAllocate.get() & 255)) == 2;
        if (s == 1) {
            elf64Header = new Elf32Header(z, this);
        } else {
            if (s != 2) {
                throw new IllegalStateException("Invalid class type!");
            }
            elf64Header = new Elf64Header(z, this);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
        if (elf64Header.LIZ) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBufferAllocate2.order(byteOrder);
        long j = elf64Header.LJ;
        if (j == 65535) {
            j = elf64Header.LIZJ().LIZ;
        }
        long j2 = 0;
        while (true) {
            if (j2 >= j) {
                break;
            }
            Elf$ProgramHeader elf$ProgramHeaderLIZIZ = elf64Header.LIZIZ(j2);
            if (elf$ProgramHeaderLIZIZ.LIZ == 2) {
                long j3 = elf$ProgramHeaderLIZIZ.LIZIZ;
                if (j3 != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    long j4 = 0;
                    do {
                        elf$DynamicStructureLIZ = elf64Header.LIZ(i, j3);
                        long j5 = elf$DynamicStructureLIZ.LIZ;
                        if (j5 == 1) {
                            arrayList2.add(Long.valueOf(elf$DynamicStructureLIZ.LIZIZ));
                        } else if (j5 == 5) {
                            j4 = elf$DynamicStructureLIZ.LIZIZ;
                        }
                        i++;
                    } while (elf$DynamicStructureLIZ.LIZ != 0);
                    if (j4 == 0) {
                        throw new IllegalStateException("String table offset not found!");
                    }
                    for (long j6 = 0; j6 < j; j6++) {
                        Elf$ProgramHeader elf$ProgramHeaderLIZIZ2 = elf64Header.LIZIZ(j6);
                        if (elf$ProgramHeaderLIZIZ2.LIZ == 1) {
                            long j7 = elf$ProgramHeaderLIZIZ2.LIZJ;
                            if (j7 <= j4 && j4 <= elf$ProgramHeaderLIZIZ2.LIZLLL + j7) {
                                long j8 = (j4 - j7) + elf$ProgramHeaderLIZIZ2.LIZIZ;
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    long jLongValue = ((Long) it2.next()).longValue() + j8;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j9 = jLongValue + 1;
                                        LIZIZ(1, byteBufferAllocate2, jLongValue);
                                        short s2 = (short) (byteBufferAllocate2.get() & 255);
                                        if (s2 != 0) {
                                            sb.append((char) s2);
                                            jLongValue = j9;
                                        }
                                    }
                                    arrayList.add(sb.toString());
                                }
                                return arrayList;
                            }
                        }
                    }
                    throw new IllegalStateException("Could not map vma to file offset!");
                }
            } else {
                j2++;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.close();
    }

    public ElfParser(C0VSJ c0vsj) {
        if (c0vsj.exists()) {
            this.LL = new C0VSP(c0vsj).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    public final int LIZLLL(ByteBuffer byteBuffer, long j) {
        LIZIZ(2, byteBuffer, j);
        return byteBuffer.getShort() & 65535;
    }

    public final long LJFF(ByteBuffer byteBuffer, long j) {
        LIZIZ(4, byteBuffer, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public final void LIZIZ(int i, ByteBuffer byteBuffer, long j) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int i2 = this.LL.read(byteBuffer, j + j2);
            if (i2 != -1) {
                j2 += (long) i2;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
