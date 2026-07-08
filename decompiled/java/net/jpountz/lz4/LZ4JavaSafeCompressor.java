package net.jpountz.lz4;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r17, r5, r7, r15, r6);
        r7 = r7 - r0;
        r5 = r5 - r0;
        r4 = r7 - r6;
        r3 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if ((((r3 + r4) + 8) + (r4 >>> 8)) > r22) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r4 < 15) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, 240);
        r3 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r17, r6, r20, r3, r4);
        r3 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeShortLE(r20, r3, (short) (r7 - r5));
        r3 = r3 + 2;
        r7 = r7 + 4;
        r4 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r17, r5 + 4, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (((r3 + 6) + (r4 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r7 = r7 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r4 < 15) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, net.jpountz.util.ByteBufferUtils.readByte(r20, r1) | 15);
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r7 <= r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r3 = r7 - 2;
        net.jpountz.util.SafeUtils.writeShort(r8, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r3)), r3 - r15);
        r3 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.ByteBufferUtils.readInt(r17, r7));
        r5 = r15 + net.jpountz.util.SafeUtils.readShort(r8, r3);
        net.jpountz.util.SafeUtils.writeShort(r8, r3, r7 - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r17, r7, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        r3 = r1 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, r4 | net.jpountz.util.ByteBufferUtils.readByte(r20, r1));
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r20, r1, r4 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r3 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r14, r7, r9, r24, r2);
        r9 = r9 - r3;
        r7 = r7 - r3;
        r6 = r9 - r2;
        r5 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        if ((((r5 + r6) + 8) + (r6 >>> 8)) > r15) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        if (r6 < 15) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, 240);
        r5 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r6 - 15, r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r14, r2, r13, r5, r6);
        r5 = r5 + r6;
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeShortLE(r13, r5, r0);
        r4 = r5 + 2;
        r2 = r2 + 4;
        r5 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r14, r7 + 4, r2, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (((r4 + 6) + (r5 >>> 8)) > r15) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        r2 = r2 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (r5 < 15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, net.jpountz.util.ByteBufferUtils.readByte(r13, r1) | 15);
        r1 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r5 - 15, r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        if (r2 > r10) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        r4 = r2 - 2;
        net.jpountz.util.SafeUtils.writeInt(r8, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r14, r4)), r4);
        r0 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.ByteBufferUtils.readInt(r14, r2));
        r7 = net.jpountz.util.SafeUtils.readInt(r8, r0);
        net.jpountz.util.SafeUtils.writeInt(r8, r0, r2);
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0101, code lost:
    
        if (r0 >= 65536) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r14, r7, r2) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        r5 = r1 + 1;
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, r5 | net.jpountz.util.ByteBufferUtils.readByte(r13, r1));
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        net.jpountz.util.ByteBufferUtils.writeByte(r13, r1, r6 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012f, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r23, int r24, int r25, java.nio.ByteBuffer r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        r0 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r17, r5, r7, r15, r6);
        r7 = r7 - r0;
        r5 = r5 - r0;
        r4 = r7 - r6;
        r3 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if ((((r3 + r4) + 8) + (r4 >>> 8)) > r22) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r4 < 15) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, 240);
        r3 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r17, r6, r20, r3, r4);
        r3 = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        net.jpountz.util.SafeUtils.writeShortLE(r20, r3, (short) (r7 - r5));
        r3 = r3 + 2;
        r7 = r7 + 4;
        r4 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r17, r5 + 4, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (((r3 + 6) + (r4 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r7 = r7 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (r4 < 15) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, net.jpountz.util.SafeUtils.readByte(r20, r1) | 15);
        r1 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r4 - 15, r20, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r7 <= r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r3 = r7 - 2;
        net.jpountz.util.SafeUtils.writeShort(r8, net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.SafeUtils.readInt(r17, r3)), r3 - r15);
        r3 = net.jpountz.lz4.LZ4Utils.hash64k(net.jpountz.util.SafeUtils.readInt(r17, r7));
        r5 = r15 + net.jpountz.util.SafeUtils.readShort(r8, r3);
        net.jpountz.util.SafeUtils.writeShort(r8, r3, r7 - r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r17, r7, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        r3 = r1 + 1;
        net.jpountz.util.SafeUtils.writeByte(r20, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, r4 | net.jpountz.util.SafeUtils.readByte(r20, r1));
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r20, r1, r4 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        r0 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r19, r12, r4, r20, r14);
        r4 = r4 - r0;
        r12 = r12 - r0;
        r15 = r4 - r14;
        r13 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if ((((r13 + r15) + 8) + (r15 >>> 8)) > r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r15 < 15) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, 240);
        r13 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r15 - 15, r22, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r19, r14, r22, r13, r15);
        r13 = r13 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        net.jpountz.util.SafeUtils.writeShortLE(r22, r13, r11);
        r11 = r13 + 2;
        r4 = r4 + 4;
        r12 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r19, r12 + 4, r4, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (((r11 + 6) + (r12 >>> 8)) > r10) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r4 = r4 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r12 < 15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, net.jpountz.util.SafeUtils.readByte(r22, r1) | 15);
        r1 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r12 - 15, r22, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r4 <= r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        r11 = r4 - 2;
        net.jpountz.util.SafeUtils.writeInt(r3, net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.SafeUtils.readInt(r19, r11)), r11);
        r0 = net.jpountz.lz4.LZ4Utils.hash(net.jpountz.util.SafeUtils.readInt(r19, r4));
        r12 = net.jpountz.util.SafeUtils.readInt(r3, r0);
        net.jpountz.util.SafeUtils.writeInt(r3, r0, r4);
        r11 = r4 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        if (r11 >= 65536) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r19, r12, r4) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        r13 = r1 + 1;
        net.jpountz.util.SafeUtils.writeByte(r22, r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, r12 | net.jpountz.util.SafeUtils.readByte(r22, r1));
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0103, code lost:
    
        net.jpountz.util.SafeUtils.writeByte(r22, r1, r15 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0114, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011a, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }
}
