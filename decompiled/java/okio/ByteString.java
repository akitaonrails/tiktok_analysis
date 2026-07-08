package okio;

import X.C1496690p3D;
import X.C1496820p3Q;
import X.C1496910p3Z;
import X.C1496920p3a;
import X.C1496930p3b;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes24.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final C1496910p3Z Companion = new C1496910p3Z();
    public static final ByteString EMPTY = C1496920p3a.LIZIZ;
    public static final long serialVersionUID = 1;
    public final byte[] data;
    public transient int hashCode;
    public transient String utf8;

    public static final ByteString encodeUtf8(String str) {
        Companion.getClass();
        return C1496910p3Z.LIZ(str);
    }

    public static final ByteString of(byte... bArr) {
        Companion.getClass();
        return C1496910p3Z.LIZIZ(bArr);
    }

    public static final ByteString read(InputStream inputStream, int i) {
        Companion.getClass();
        return C1496910p3Z.LIZLLL(inputStream, i);
    }

    public final int indexOf(ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public int indexOf(byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public int lastIndexOf(byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public String base64() {
        char[] cArr = C1496920p3a.LIZ;
        return C1496930p3b.LIZ(getData$jvm(), C1496930p3b.LIZ);
    }

    public String base64Url() {
        char[] cArr = C1496920p3a.LIZ;
        return C1496930p3b.LIZ(getData$jvm(), C1496930p3b.LIZIZ);
    }

    public int getSize$jvm() {
        char[] cArr = C1496920p3a.LIZ;
        return getData$jvm().length;
    }

    public int hashCode() {
        char[] cArr = C1496920p3a.LIZ;
        int hashCode$jvm = getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        setHashCode$jvm(Arrays.hashCode(getData$jvm()));
        return getHashCode$jvm();
    }

    public String hex() {
        char[] cArr = C1496920p3a.LIZ;
        char[] cArr2 = new char[getData$jvm().length * 2];
        int i = 0;
        for (byte b : getData$jvm()) {
            int i2 = i + 1;
            char[] cArr3 = C1496920p3a.LIZ;
            cArr2[i] = cArr3[(b >> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr3[b & 15];
        }
        return new String(cArr2);
    }

    public byte[] internalArray$jvm() {
        char[] cArr = C1496920p3a.LIZ;
        return getData$jvm();
    }

    public ByteString md5() {
        return digest("MD5");
    }

    public ByteString sha1() {
        return digest("SHA-1");
    }

    public ByteString sha256() {
        return digest("SHA-256");
    }

    public ByteString sha512() {
        return digest("SHA-512");
    }

    public ByteString toAsciiLowercase() {
        byte b;
        char[] cArr = C1496920p3a.LIZ;
        for (int i = 0; i < getData$jvm().length; i++) {
            byte b2 = getData$jvm()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$jvm = getData$jvm();
                byte[] bArrCopyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        byte b;
        char[] cArr = C1496920p3a.LIZ;
        for (int i = 0; i < getData$jvm().length; i++) {
            byte b2 = getData$jvm()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$jvm = getData$jvm();
                byte[] bArrCopyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                bArrCopyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        char[] cArr = C1496920p3a.LIZ;
        byte[] data$jvm = getData$jvm();
        return Arrays.copyOf(data$jvm, data$jvm.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0165, code lost:
    
        if (r9 != 64) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }

    public String utf8() {
        char[] cArr = C1496920p3a.LIZ;
        String utf8$jvm = getUtf8$jvm();
        if (utf8$jvm != null) {
            return utf8$jvm;
        }
        String str = new String(getData$jvm(), Charsets.UTF_8);
        setUtf8$jvm(str);
        return str;
    }

    @InterfaceC1294060jmO
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m366deprecated_size() {
        return size();
    }

    public final int size() {
        return getSize$jvm();
    }

    public final byte[] getData$jvm() {
        return this.data;
    }

    public final int getHashCode$jvm() {
        return this.hashCode;
    }

    public final String getUtf8$jvm() {
        return this.utf8;
    }

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.ByteString decodeBase64(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.decodeBase64(java.lang.String):okio.ByteString");
    }

    public static final ByteString decodeHex(String str) {
        Companion.getClass();
        char[] cArr = C1496920p3a.LIZ;
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((C1496920p3a.LIZIZ(str.charAt(i2)) << 4) + C1496920p3a.LIZIZ(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected hex string: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    private final ByteString digest(String str) {
        return new ByteString(MessageDigest.getInstance(str).digest(this.data));
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        Companion.getClass();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new ByteString(bArr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        Companion.getClass();
        ByteString byteStringLIZLLL = C1496910p3Z.LIZLLL(objectInputStream, i);
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteStringLIZLLL.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @InterfaceC1294060jmO
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m365deprecated_getByte(int i) {
        return getByte(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return -1;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(okio.ByteString r8) {
        /*
            r7 = this;
            char[] r0 = X.C1496920p3a.LIZ
            int r6 = r7.size()
            int r5 = r8.size()
            int r4 = java.lang.Math.min(r6, r5)
            r3 = 0
            r2 = 0
        L10:
            if (r2 >= r4) goto L23
            byte r0 = r7.getByte(r2)
            r1 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r8.getByte(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L28
            int r2 = r2 + 1
            goto L10
        L23:
            if (r6 == r5) goto L2b
            if (r6 >= r5) goto L2c
            goto L2a
        L28:
            if (r1 >= r0) goto L2c
        L2a:
            r3 = -1
        L2b:
            return r3
        L2c:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(ByteString byteString) {
        char[] cArr = C1496920p3a.LIZ;
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        char[] cArr = C1496920p3a.LIZ;
        if (obj != this) {
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            if (byteString.size() != getData$jvm().length || !byteString.rangeEquals(0, getData$jvm(), 0, getData$jvm().length)) {
                return false;
            }
        }
        return true;
    }

    public final byte getByte(int i) {
        return internalGet$jvm(i);
    }

    public ByteString hmacSha1(ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    public byte internalGet$jvm(int i) {
        char[] cArr = C1496920p3a.LIZ;
        return getData$jvm()[i];
    }

    public final void setHashCode$jvm(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$jvm(String str) {
        this.utf8 = str;
    }

    public final boolean startsWith(ByteString byteString) {
        char[] cArr = C1496920p3a.LIZ;
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        return new String(this.data, charset);
    }

    public void write(OutputStream outputStream) throws IOException {
        outputStream.write(this.data);
    }

    public void write$jvm(C1496690p3D c1496690p3D) {
        byte[] bArr = this.data;
        c1496690p3D.LJJJLL(0, bArr, bArr.length);
    }

    public final boolean endsWith(byte[] bArr) {
        char[] cArr = C1496920p3a.LIZ;
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final boolean startsWith(byte[] bArr) {
        char[] cArr = C1496920p3a.LIZ;
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        Companion.getClass();
        return new ByteString(str.getBytes(charset));
    }

    private final ByteString hmac(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            return new ByteString(mac.doFinal(this.data));
        } catch (InvalidKeyException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        char[] cArr = C1496920p3a.LIZ;
        int length = getData$jvm().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax <= length) {
            while (!C1496820p3Q.LIZ(getData$jvm(), iMax, 0, bArr, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        for (int iMin = Math.min(i, this.data.length - bArr.length); iMin >= 0; iMin--) {
            if (C1496820p3Q.LIZ(this.data, iMin, 0, bArr, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public ByteString substring(int i, int i2) {
        return C1496920p3a.LIZ(this, i, i2);
    }

    public final int indexOf(ByteString byteString, int i) {
        return indexOf(byteString.internalArray$jvm(), i);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        return lastIndexOf(byteString.internalArray$jvm(), i);
    }

    public static final ByteString of(byte[] bArr, int i, int i2) {
        Companion.getClass();
        C1496820p3Q.LIZIZ(bArr.length, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ByteString(bArr2);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        char[] cArr = C1496920p3a.LIZ;
        if (i >= 0 && i <= getData$jvm().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C1496820p3Q.LIZ(getData$jvm(), i, i2, bArr, i3)) {
            return true;
        }
        return false;
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        char[] cArr = C1496920p3a.LIZ;
        return byteString.rangeEquals(i2, getData$jvm(), i, i3);
    }

    public static /* bridge */ /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* bridge */ /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* bridge */ /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* bridge */ /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* bridge */ /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }
}
