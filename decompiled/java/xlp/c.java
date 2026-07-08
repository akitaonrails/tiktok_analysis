package xlp;

import X.AbstractC1495490p1H;
import X.AbstractC842510X3h;
import X.AbstractC842530X3j;
import X.C0WZX;
import X.C0X0P;
import X.C0X1U;
import X.C0X1V;
import X.C0XLQ;
import X.C0XLU;
import X.C1495450p1D;
import X.C1495840p1q;
import X.C1496690p3D;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1496620p36;
import X.InterfaceC842570X3n;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okio.ByteString;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class c {
    public static final byte[] LIZ;
    public static final String[] LIZIZ = new String[0];
    public static final AbstractC842510X3h LIZJ;
    public static final ByteString LIZLLL;
    public static final ByteString LJ;
    public static final ByteString LJFF;
    public static final ByteString LJI;
    public static final ByteString LJII;
    public static final Charset LJIIIIZZ;
    public static final Charset LJIIIZ;
    public static final Charset LJIIJ;
    public static final Charset LJIIJJI;
    public static final Charset LJIIL;
    public static final TimeZone LJIILIIL;
    public static final C0XLU LJIILJJIL;
    public static final Method LJIILL;
    public static final Pattern LJIILLIIL;

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0XLU] */
    static {
        byte[] bArr = new byte[0];
        LIZ = bArr;
        Method declaredMethod = null;
        LIZJ = AbstractC842510X3h.create((C0X0P) null, bArr);
        AbstractC842530X3j.LIZLLL(null, bArr);
        LIZLLL = ByteString.decodeHex("efbbbf");
        LJ = ByteString.decodeHex("feff");
        LJFF = ByteString.decodeHex("fffe");
        LJI = ByteString.decodeHex("0000ffff");
        LJII = ByteString.decodeHex("ffff0000");
        LJIIIIZZ = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        LJIIIZ = Charset.forName("UTF-16BE");
        LJIIJ = Charset.forName("UTF-16LE");
        LJIIJJI = Charset.forName("UTF-32BE");
        LJIIL = Charset.forName("UTF-32LE");
        LJIILIIL = TimeZone.getTimeZone("GMT");
        LJIILJJIL = new Comparator<String>() { // from class: X.0XLU
            @Override // java.util.Comparator
            public final int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJIILL = declaredMethod;
        LJIILLIIL = PatternProtector.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int LJI(char c) {
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        } else if (c > 'f') {
            return -1;
        }
        return (c - c2) + 10;
    }

    public static String LIZJ(String str) {
        InetAddress inetAddressLJII;
        int i = -1;
        int i2 = 0;
        if (str.contains(":")) {
            if (str.startsWith(e3.e) && str.endsWith(e3.f)) {
                inetAddressLJII = LJII(1, str.length() - 1, str);
            } else {
                inetAddressLJII = LJII(0, str.length(), str);
            }
            if (inetAddressLJII == null) {
                return null;
            }
            byte[] bArrB0 = C2204961BRm.b0(inetAddressLJII, new C0WZX("ezR2SBYqDITVW0MkVxyFal/zgg34", null));
            if (bArrB0.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < bArrB0.length) {
                    int i5 = i3;
                    while (i5 < 16 && bArrB0[i5] == 0 && bArrB0[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C1496690p3D c1496690p3D = new C1496690p3D();
                while (i2 < bArrB0.length) {
                    if (i2 == i) {
                        c1496690p3D.LJJJZ(58);
                        i2 += i4;
                        if (i2 == 16) {
                            c1496690p3D.LJJJZ(58);
                        }
                    } else {
                        if (i2 > 0) {
                            c1496690p3D.LJJJZ(58);
                        }
                        c1496690p3D.LJJLIIJ(((bArrB0[i2] & 255) << 8) | (bArrB0[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                return c1496690p3D.LJJIZ();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            for (int i7 = 0; i7 < lowerCase.length(); i7++) {
                char cCharAt = lowerCase.charAt(i7);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    i2 = 1;
                    break;
                }
            }
            if (i2 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LJFF(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                TryCatchGuardChecker.doCheck(e);
                if (!LJIILLIIL(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                if ("bio == null".equals(e2.getMessage())) {
                } else {
                    throw e2;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public static <T> List<T> LJIILIIL(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> LJIILJJIL(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static boolean LJIILLIIL(AssertionError assertionError) {
        if (assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains("getsockname failed")) {
            return true;
        }
        return false;
    }

    public static C0X1V LJIJJLI(List<C1495840p1q> list) {
        C0X1U c0x1u = new C0X1U();
        for (C1495840p1q c1495840p1q : (ArrayList) list) {
            C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
            String strUtf8 = c1495840p1q.LIZ.utf8();
            String strUtf82 = c1495840p1q.LIZIZ.utf8();
            c1495450p1D.getClass();
            c0x1u.LIZIZ(strUtf8, strUtf82);
        }
        return new C0X1V(c0x1u);
    }

    public static AssertionError LIZ(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
            return assertionError;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return assertionError;
        }
    }

    public static Charset LIZIZ(InterfaceC1496620p36 interfaceC1496620p36, Charset charset) {
        if (interfaceC1496620p36.LLF(LIZLLL)) {
            interfaceC1496620p36.skip(r1.size());
            return LJIIIIZZ;
        }
        if (interfaceC1496620p36.LLF(LJ)) {
            interfaceC1496620p36.skip(r1.size());
            return LJIIIZ;
        }
        if (interfaceC1496620p36.LLF(LJFF)) {
            interfaceC1496620p36.skip(r1.size());
            return LJIIJ;
        }
        if (interfaceC1496620p36.LLF(LJI)) {
            interfaceC1496620p36.skip(r1.size());
            return LJIIJJI;
        }
        if (interfaceC1496620p36.LLF(LJII)) {
            interfaceC1496620p36.skip(r1.size());
            return LJIIL;
        }
        return charset;
    }

    public static int LIZLLL(TimeUnit timeUnit, long j) {
        if (j >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && j > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("timeout");
                        sbLIZ.append(" too small.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return (int) millis;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("timeout");
                sbLIZ2.append(" too large.");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            throw new NullPointerException("unit == null");
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("timeout");
        sbLIZ3.append(" < 0");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static boolean LJIIJ(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static String LJIIJJI(String str, Object... objArr) {
        return C786410Ut5.k4(Locale.US, str, objArr);
    }

    public static String LJIIL(C0XLQ c0xlq, boolean z) {
        String strLIZIZ;
        if (c0xlq.LIZLLL.contains(":")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(c0xlq.LIZLLL);
            sbLIZ.append(e3.f);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = c0xlq.LIZLLL;
        }
        if (z || c0xlq.LJ != C0XLQ.LIZLLL(c0xlq.LIZ)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(":");
            sbLIZ2.append(c0xlq.LJ);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e7, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress LJII(int r13, int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xlp.c.LJII(int, int, java.lang.String):java.net.InetAddress");
    }

    public static String[] LJIILL(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean LJIIZILJ(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJIJ(InterfaceC842570X3n interfaceC842570X3n, int i, TimeUnit timeUnit) {
        long jLIZJ;
        long jNanoTime = System.nanoTime();
        if (interfaceC842570X3n.timeout().LJ()) {
            jLIZJ = interfaceC842570X3n.timeout().LIZJ() - jNanoTime;
        } else {
            jLIZJ = Long.MAX_VALUE;
        }
        interfaceC842570X3n.timeout().LIZLLL(Math.min(jLIZJ, timeUnit.toNanos(i)) + jNanoTime);
        try {
            try {
                C1496690p3D c1496690p3D = new C1496690p3D();
                while (interfaceC842570X3n.read(c1496690p3D, 8192L) != -1) {
                    c1496690p3D.LIZ();
                }
                if (jLIZJ == Long.MAX_VALUE) {
                    interfaceC842570X3n.timeout().LIZ();
                    return true;
                }
                interfaceC842570X3n.timeout().LIZLLL(jNanoTime + jLIZJ);
                return true;
            } catch (InterruptedIOException e) {
                TryCatchGuardChecker.doCheck(e);
                if (jLIZJ == Long.MAX_VALUE) {
                    interfaceC842570X3n.timeout().LIZ();
                    return false;
                }
                interfaceC842570X3n.timeout().LIZLLL(jNanoTime + jLIZJ);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (jLIZJ == Long.MAX_VALUE) {
                interfaceC842570X3n.timeout().LIZ();
                throw th;
            }
            interfaceC842570X3n.timeout().LIZLLL(jNanoTime + jLIZJ);
            throw th;
        }
    }

    public static int LJIJI(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int LJIJJ(int i, int i2, String str) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static String LJIL(int i, int i2, String str) {
        int iLJIJI = LJIJI(i, i2, str);
        return str.substring(iLJIJI, LJIJJ(iLJIJI, i2, str));
    }

    public static int LJIIIIZZ(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int LJIIIZ(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
