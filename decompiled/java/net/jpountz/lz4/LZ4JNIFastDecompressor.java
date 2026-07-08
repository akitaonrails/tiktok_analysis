package net.jpountz.lz4;

import X.C2188811AlT;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    public static LZ4FastDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        byte[] bArrArray;
        byte[] bArrArray2;
        ByteBuffer byteBuffer3 = byteBuffer2;
        int iArrayOffset = i2;
        ByteBuffer byteBuffer4 = byteBuffer;
        int iArrayOffset2 = i;
        ByteBufferUtils.checkNotReadOnly(byteBuffer3);
        ByteBufferUtils.checkRange(byteBuffer4, iArrayOffset2);
        ByteBufferUtils.checkRange(byteBuffer3, iArrayOffset, i3);
        if ((byteBuffer4.hasArray() || byteBuffer4.isDirect()) && (byteBuffer3.hasArray() || byteBuffer3.isDirect())) {
            if (byteBuffer4.hasArray()) {
                bArrArray = byteBuffer4.array();
                iArrayOffset2 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArrArray = null;
            }
            if (byteBuffer3.hasArray()) {
                bArrArray2 = byteBuffer3.array();
                iArrayOffset += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArrArray2 = null;
            }
            int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArrArray, byteBuffer4, iArrayOffset2, bArrArray2, byteBuffer3, iArrayOffset, i3);
            if (iLZ4_decompress_fast >= 0) {
                return iLZ4_decompress_fast;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error decoding offset ");
            sbLIZ.append(iArrayOffset2 - iLZ4_decompress_fast);
            sbLIZ.append(" of input buffer");
            throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        LZ4FastDecompressor lZ4FastDecompressorFastDecompressor = SAFE_INSTANCE;
        if (lZ4FastDecompressorFastDecompressor == null) {
            lZ4FastDecompressorFastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
            SAFE_INSTANCE = lZ4FastDecompressorFastDecompressor;
        }
        return lZ4FastDecompressorFastDecompressor.decompress(byteBuffer4, iArrayOffset2, byteBuffer3, iArrayOffset, i3);
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error decoding offset ");
        sbLIZ.append(i - iLZ4_decompress_fast);
        sbLIZ.append(" of input buffer");
        throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ));
    }
}
