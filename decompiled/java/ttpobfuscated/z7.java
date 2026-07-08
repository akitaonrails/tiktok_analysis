package ttpobfuscated;

import X.C098200Yq;
import X.C0WZX;
import X.C189200o6;
import X.C2197108jB;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.List;
import ttpobfuscated.y7;

/* JADX INFO: loaded from: classes24.dex */
public final class z7 implements y7 {
    public final String a(String str) throws na {
        if (str.length() != 0) {
            if (kotlin.text.u.LJJIIJZLJL(str, "::ffff:", false)) {
                return str;
            }
            return "::ffff:".concat(str);
        }
        throw new na("Wrong IpAddress format");
    }

    public final BigInteger b(String str) throws na {
        if (str.length() != 0) {
            return new BigInteger(1, C2204961BRm.b0(InetAddress.getByName(str), new C0WZX("YCtuUwA8StnfVEMkQVyeMQ==", null)));
        }
        throw new na("Empty IpAddress for ".concat(str));
    }

    @Override // ttpobfuscated.y7
    public boolean a(String str, String str2) throws y7.a.C0078a {
        BigInteger bigIntegerNot;
        try {
            if (InetAddress.getByName(str) instanceof Inet4Address) {
                str = a(str);
            }
            BigInteger bigIntegerB = b(str);
            List listLJJLIIIJILLIZJL = kotlin.text.a0.LJJLIIIJILLIZJL(str2, new String[]{"/"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() == 2) {
                String strA = (String) listLJJLIIIJILLIZJL.get(0);
                int i = Integer.parseInt((String) listLJJLIIIJILLIZJL.get(1));
                if (i >= 0 && i <= 128) {
                    if (InetAddress.getByName(strA) instanceof Inet4Address) {
                        if (!kotlin.text.u.LJJIIJZLJL(strA, "::ffff:", false)) {
                            if (i <= 32) {
                                i += 96;
                            } else {
                                throw new na("Wrong cidr format");
                            }
                        }
                        strA = a(strA);
                    }
                    BigInteger bigIntegerB2 = b(strA);
                    if (i == 0) {
                        bigIntegerNot = BigInteger.ZERO;
                    } else {
                        BigInteger bigInteger = BigInteger.ONE;
                        bigIntegerNot = bigInteger.shiftLeft(128 - i).subtract(bigInteger).not();
                    }
                    BigInteger bigIntegerAnd = bigIntegerB2.and(bigIntegerNot);
                    BigInteger bigInteger2 = BigInteger.ONE;
                    BigInteger bigIntegerAdd = bigIntegerAnd.add(bigInteger2.shiftLeft(128 - i).subtract(bigInteger2));
                    if (bigIntegerB.compareTo(bigIntegerAnd) < 0 || bigIntegerB.compareTo(bigIntegerAdd) > 0) {
                        return false;
                    }
                    return true;
                }
                throw new na("Wrong cidr format");
            }
            throw new na("Wrong cidr format");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                throw new C2197108jB();
            }
            throw new y7.a.C0078a(thM5exceptionOrNullimpl);
        }
    }
}
