package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4HCJavaSafeCompressor extends LZ4Compressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaSafeCompressor();
    public final int compressionLevel;
    public final int maxAttempts;

    public LZ4HCJavaSafeCompressor() {
        this(9);
    }

    public class HashTable {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final int base;
        public final short[] chainTable;
        public final int[] hashTable;
        public int nextToUpdate;

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        private int next(int i) {
            return i - (this.chainTable[i & 65535] & 65535);
        }

        public HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
            this.chainTable = new short[65536];
        }

        private void addHash(int i, int i2) {
            int iHashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i3 = i2 - iArr[iHashHC];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.chainTable[65535 & i2] = (short) i3;
            iArr[iHashHC] = i2;
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i));
        }

        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(byteBuffer, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i), i);
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(SafeUtils.readInt(bArr, i));
        }

        public void insert(int i, byte[] bArr) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(bArr, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private void addHash(byte[] bArr, int i) {
            addHash(SafeUtils.readInt(bArr, i), i);
        }

        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i);
            if (iHashPointer >= i - 4 && iHashPointer <= i && iHashPointer >= this.base) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i)) {
                    i3 = i - iHashPointer;
                    iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i2) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i3 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            } else {
                i3 = 0;
                iCommonBytes = 0;
            }
            for (int i4 = 0; i4 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, (i - 65536) + 1) && iHashPointer <= i; i4++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i) && (iCommonBytes2 = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i5 = (iCommonBytes + i) - 3;
                while (i < i5 - i3) {
                    this.chainTable[65535 & i] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i))] = i;
                    i++;
                } while (i < i5);
                this.nextToUpdate = i5;
            }
            if (match.len == 0) {
                return false;
            }
            return true;
        }

        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int iHashPointer = hashPointer(bArr, i);
            if (iHashPointer >= i - 4 && iHashPointer <= i && iHashPointer >= this.base) {
                if (LZ4SafeUtils.readIntEquals(bArr, iHashPointer, i)) {
                    i3 = i - iHashPointer;
                    iCommonBytes = LZ4SafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i2) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i3 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            } else {
                i3 = 0;
                iCommonBytes = 0;
            }
            for (int i4 = 0; i4 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, (i - 65536) + 1) && iHashPointer <= i; i4++) {
                if (LZ4SafeUtils.readIntEquals(bArr, iHashPointer, i) && (iCommonBytes2 = LZ4SafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i5 = (iCommonBytes + i) - 3;
                while (i < i5 - i3) {
                    this.chainTable[65535 & i] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(SafeUtils.readInt(bArr, i))] = i;
                    i++;
                } while (i < i5);
                this.nextToUpdate = i5;
            }
            if (match.len == 0) {
                return false;
            }
            return true;
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, (i - 65536) + 1) && iHashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i)) {
                    int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i3) + 4;
                    int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, iHashPointer, i, this.base, i2);
                    int i6 = iCommonBytes + iCommonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            if (match.len <= i4) {
                return false;
            }
            return true;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, bArr);
            int iHashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, (i - 65536) + 1) && iHashPointer <= i; i5++) {
                if (LZ4SafeUtils.readIntEquals(bArr, iHashPointer, i)) {
                    int iCommonBytes = LZ4SafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i3) + 4;
                    int iCommonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, iHashPointer, i, this.base, i2);
                    int i6 = iCommonBytes + iCommonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            if (match.len <= i4) {
                return false;
            }
            return true;
        }
    }

    public LZ4HCJavaSafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        if (r1.start >= r0.end()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011e, code lost:
    
        r0.len = r1.start - r0.start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0125, code lost:
    
        r19 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r13, r0.end(), r1.start, r1.ref, r1.len, r11, net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r13, r14, r0.start, r0.ref, r0.len, r11, r19, r20), r20);
        r14 = r1.end();
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r33, int r34, int r35, java.nio.ByteBuffer r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0181, code lost:
    
        if (r1.start >= r0.end()) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0183, code lost:
    
        r0.len = r1.start - r0.start;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018a, code lost:
    
        r19 = net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r33, r0.end(), r1.start, r1.ref, r1.len, r36, net.jpountz.lz4.LZ4SafeUtils.encodeSequence(r33, r14, r0.start, r0.ref, r0.len, r36, r19, r20), r20);
        r14 = r1.end();
        r8 = r14;
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r33, int r34, int r35, byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
