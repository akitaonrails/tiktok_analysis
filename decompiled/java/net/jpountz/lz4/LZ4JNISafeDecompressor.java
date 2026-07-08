package net.jpountz.lz4;

import X.C2188811AlT;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    public static LZ4SafeDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
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
            int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArrArray, byteBuffer4, iArrayOffset, i2, bArrArray2, byteBuffer3, iArrayOffset2, i4);
            if (iLZ4_decompress_safe >= 0) {
                return iLZ4_decompress_safe;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error decoding offset ");
            sbLIZ.append(iArrayOffset - iLZ4_decompress_safe);
            sbLIZ.append(" of input buffer");
            throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        LZ4SafeDecompressor lZ4SafeDecompressorSafeDecompressor = SAFE_INSTANCE;
        if (lZ4SafeDecompressorSafeDecompressor == null) {
            lZ4SafeDecompressorSafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
            SAFE_INSTANCE = lZ4SafeDecompressorSafeDecompressor;
        }
        return lZ4SafeDecompressorSafeDecompressor.decompress(byteBuffer4, i, i2, byteBuffer3, iArrayOffset2, i4);
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error decoding offset ");
        sbLIZ.append(i - iLZ4_decompress_safe);
        sbLIZ.append(" of input buffer");
        throw new LZ4Exception(C2188811AlT.LIZIZ(sbLIZ));
    }
}
