package net.jpountz.lz4;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        if (r5 > r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if ((r2 + r6) != r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.safeArraycopy(r11, r2, r10, r14, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        return r5 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        r0 = X.C2188811AlT.LIZ();
        r0.append("Malformed input at ");
        r0.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception(X.C2188811AlT.LIZIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0108, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception();
     */
    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int decompress(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r6 > r12) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        if ((r2 + r8) != r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        net.jpountz.lz4.LZ4UnsafeUtils.safeArraycopy(r17, r2, r20, r14, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        return r6 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        r0 = X.C2188811AlT.LIZ();
        r0.append("Malformed input at ");
        r0.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception(X.C2188811AlT.LIZIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception();
     */
    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int decompress(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
    }
}
