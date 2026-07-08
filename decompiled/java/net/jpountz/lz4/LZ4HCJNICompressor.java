package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4HCJNICompressor extends LZ4Compressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    public static LZ4Compressor SAFE_INSTANCE;
    public final int compressionLevel;

    public LZ4HCJNICompressor() {
        this(9);
    }

    public LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int iArrayOffset;
        byte[] bArrArray;
        byte[] bArrArray2;
        ByteBuffer byteBuffer3 = byteBuffer2;
        int iArrayOffset2 = i3;
        ByteBuffer byteBuffer4 = byteBuffer;
        ByteBufferUtils.checkNotReadOnly(byteBuffer3);
        ByteBufferUtils.checkRange(byteBuffer4, i, i2);
        ByteBufferUtils.checkRange(byteBuffer3, iArrayOffset2, i4);
        if ((byteBuffer4.hasArray() || byteBuffer4.isDirect()) && (byteBuffer3.hasArray() || byteBuffer3.isDirect())) {
            if (byteBuffer4.hasArray()) {
                bArrArray = byteBuffer4.array();
                iArrayOffset = byteBuffer4.arrayOffset() + i;
                byteBuffer4 = null;
            } else {
                iArrayOffset = i;
                bArrArray = null;
            }
            if (byteBuffer3.hasArray()) {
                bArrArray2 = byteBuffer3.array();
                iArrayOffset2 += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArrArray2 = null;
            }
            int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArrArray, byteBuffer4, iArrayOffset, i2, bArrArray2, byteBuffer3, iArrayOffset2, i4, this.compressionLevel);
            if (iLZ4_compressHC > 0) {
                return iLZ4_compressHC;
            }
            throw new LZ4Exception();
        }
        LZ4Compressor lZ4CompressorHighCompressor = SAFE_INSTANCE;
        if (lZ4CompressorHighCompressor == null) {
            lZ4CompressorHighCompressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
            SAFE_INSTANCE = lZ4CompressorHighCompressor;
        }
        return lZ4CompressorHighCompressor.compress(byteBuffer4, i, i2, byteBuffer3, iArrayOffset2, i4);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int iLZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i, i2, bArr2, null, i3, i4, this.compressionLevel);
        if (iLZ4_compressHC > 0) {
            return iLZ4_compressHC;
        }
        throw new LZ4Exception();
    }
}
