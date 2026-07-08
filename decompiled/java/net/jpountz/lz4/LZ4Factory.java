package net.jpountz.lz4;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

/* JADX INFO: loaded from: classes36.dex */
public final class LZ4Factory {
    public static LZ4Factory JAVA_SAFE_INSTANCE;
    public static LZ4Factory JAVA_UNSAFE_INSTANCE;
    public static LZ4Factory NATIVE_INSTANCE;
    public final LZ4Compressor fastCompressor;
    public final LZ4FastDecompressor fastDecompressor;
    public final LZ4Compressor highCompressor;
    public final LZ4Compressor[] highCompressors;
    public final String impl;
    public final LZ4SafeDecompressor safeDecompressor;

    public static synchronized LZ4Factory nativeInstance() {
        if (NATIVE_INSTANCE == null) {
            NATIVE_INSTANCE = instance("JNI");
        }
        return NATIVE_INSTANCE;
    }

    public static synchronized LZ4Factory safeInstance() {
        if (JAVA_SAFE_INSTANCE == null) {
            JAVA_SAFE_INSTANCE = instance("JavaSafe");
        }
        return JAVA_SAFE_INSTANCE;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        if (JAVA_UNSAFE_INSTANCE == null) {
            JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
        }
        return JAVA_UNSAFE_INSTANCE;
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return safeInstance();
        }
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LZ4Factory");
        sbLIZ.append(":");
        sbLIZ.append(this.impl);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LZ4Factory(String str) throws NoSuchMethodException {
        LZ4Compressor[] lZ4CompressorArr = new LZ4Compressor[18];
        this.highCompressors = lZ4CompressorArr;
        this.impl = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("net.jpountz.lz4.LZ4");
        sbLIZ.append(str);
        sbLIZ.append("Compressor");
        this.fastCompressor = (LZ4Compressor) classInstance(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("net.jpountz.lz4.LZ4HC");
        sbLIZ2.append(str);
        sbLIZ2.append("Compressor");
        LZ4Compressor lZ4Compressor = (LZ4Compressor) classInstance(C2188811AlT.LIZIZ(sbLIZ2));
        this.highCompressor = lZ4Compressor;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("net.jpountz.lz4.LZ4");
        sbLIZ3.append(str);
        sbLIZ3.append("FastDecompressor");
        this.fastDecompressor = (LZ4FastDecompressor) classInstance(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("net.jpountz.lz4.LZ4");
        sbLIZ4.append(str);
        sbLIZ4.append("SafeDecompressor");
        this.safeDecompressor = (LZ4SafeDecompressor) classInstance(C2188811AlT.LIZIZ(sbLIZ4));
        Constructor<?> declaredConstructor = lZ4Compressor.getClass().getDeclaredConstructor(Integer.TYPE);
        lZ4CompressorArr[9] = lZ4Compressor;
        int i = 1;
        loop0: while (true) {
            this.highCompressors[i] = declaredConstructor.newInstance(Integer.valueOf(i));
            do {
                i++;
                if (i > 17) {
                    break loop0;
                }
            } while (i == 9);
        }
        byte[] bArr = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        for (LZ4Compressor lZ4Compressor2 : Arrays.asList(this.fastCompressor, this.highCompressor)) {
            int iMaxCompressedLength = lZ4Compressor2.maxCompressedLength(20);
            byte[] bArr2 = new byte[iMaxCompressedLength];
            int iCompress = lZ4Compressor2.compress(bArr, 0, 20, bArr2, 0, iMaxCompressedLength);
            byte[] bArr3 = new byte[20];
            this.fastDecompressor.decompress(bArr2, 0, bArr3, 0, 20);
            if (Arrays.equals(bArr, bArr3)) {
                Arrays.fill(bArr3, (byte) 0);
                if (this.safeDecompressor.decompress(bArr2, 0, iCompress, bArr3, 0) != 20 || !Arrays.equals(bArr, bArr3)) {
                    throw new AssertionError();
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    public static <T> T classInstance(String str) {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fastest instance is ");
        sbLIZ.append(fastestInstance());
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        PrintStream printStream2 = System.out;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Fastest Java instance is ");
        sbLIZ2.append(fastestJavaInstance());
        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public LZ4Compressor highCompressor(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.highCompressors[i];
    }
}
