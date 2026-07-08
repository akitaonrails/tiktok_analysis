package net.jpountz.xxhash;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.StreamingXXHash64;

/* JADX INFO: loaded from: classes36.dex */
public final class XXHashFactory {
    public static XXHashFactory JAVA_SAFE_INSTANCE;
    public static XXHashFactory JAVA_UNSAFE_INSTANCE;
    public static XXHashFactory NATIVE_INSTANCE;
    public final XXHash32 hash32;
    public final XXHash64 hash64;
    public final String impl;
    public final StreamingXXHash32.Factory streamingHash32Factory;
    public final StreamingXXHash64.Factory streamingHash64Factory;

    public static synchronized XXHashFactory nativeInstance() {
        if (NATIVE_INSTANCE == null) {
            NATIVE_INSTANCE = instance("JNI");
        }
        return NATIVE_INSTANCE;
    }

    public static synchronized XXHashFactory safeInstance() {
        if (JAVA_SAFE_INSTANCE == null) {
            JAVA_SAFE_INSTANCE = instance("JavaSafe");
        }
        return JAVA_SAFE_INSTANCE;
    }

    public static synchronized XXHashFactory unsafeInstance() {
        if (JAVA_UNSAFE_INSTANCE == null) {
            JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
        }
        return JAVA_UNSAFE_INSTANCE;
    }

    public static XXHashFactory fastestInstance() {
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

    public static XXHashFactory fastestJavaInstance() {
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

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XXHashFactory");
        sbLIZ.append(":");
        sbLIZ.append(this.impl);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public XXHash32 hash32() {
        return this.hash32;
    }

    public XXHash64 hash64() {
        return this.hash64;
    }

    public XXHashFactory(String str) {
        this.impl = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("net.jpountz.xxhash.XXHash32");
        sbLIZ.append(str);
        XXHash32 xXHash32 = (XXHash32) classInstance(C2188811AlT.LIZIZ(sbLIZ));
        this.hash32 = xXHash32;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("net.jpountz.xxhash.StreamingXXHash32");
        sbLIZ2.append(str);
        sbLIZ2.append("$Factory");
        this.streamingHash32Factory = (StreamingXXHash32.Factory) classInstance(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("net.jpountz.xxhash.XXHash64");
        sbLIZ3.append(str);
        XXHash64 xXHash64 = (XXHash64) classInstance(C2188811AlT.LIZIZ(sbLIZ3));
        this.hash64 = xXHash64;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("net.jpountz.xxhash.StreamingXXHash64");
        sbLIZ4.append(str);
        sbLIZ4.append("$Factory");
        this.streamingHash64Factory = (StreamingXXHash64.Factory) classInstance(C2188811AlT.LIZIZ(sbLIZ4));
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int iNextInt = random.nextInt();
        int iHash = xXHash32.hash(bArr, 0, 100, iNextInt);
        StreamingXXHash32 streamingXXHash32NewStreamingHash32 = newStreamingHash32(iNextInt);
        streamingXXHash32NewStreamingHash32.update(bArr, 0, 100);
        int value = streamingXXHash32NewStreamingHash32.getValue();
        long j = iNextInt;
        long jHash = xXHash64.hash(bArr, 0, 100, j);
        StreamingXXHash64 streamingXXHash64NewStreamingHash64 = newStreamingHash64(j);
        streamingXXHash64NewStreamingHash64.update(bArr, 0, 100);
        long value2 = streamingXXHash64NewStreamingHash64.getValue();
        if (iHash == value) {
            if (jHash == value2) {
                return;
            } else {
                throw new AssertionError();
            }
        }
        throw new AssertionError();
    }

    public static <T> T classInstance(String str) {
        ClassLoader classLoader = XXHashFactory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static XXHashFactory instance(String str) {
        try {
            return new XXHashFactory(str);
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

    public StreamingXXHash32 newStreamingHash32(int i) {
        return this.streamingHash32Factory.newStreamingHash(i);
    }

    public StreamingXXHash64 newStreamingHash64(long j) {
        return this.streamingHash64Factory.newStreamingHash(j);
    }
}
