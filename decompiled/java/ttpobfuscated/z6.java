package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C13LN;
import X.C13LP;
import X.C189200o6;
import X.C2197108jB;
import X.InterfaceC1364105Vn;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import ttpobfuscated.j0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class z6 implements j0 {
    public final SecureRandom e;
    public final String f = C13LE.LIZ(z6.class).LJI();

    public final int a(byte b) {
        int i = b & 255;
        if (i == 0) {
            return 8;
        }
        if (1 > i) {
            return 0;
        }
        if (i < 2) {
            return 7;
        }
        if (2 > i) {
            return 0;
        }
        if (i < 4) {
            return 6;
        }
        if (i < 8) {
            return 5;
        }
        if (8 > i) {
            return 0;
        }
        if (i < 16) {
            return 4;
        }
        if (16 > i) {
            return 0;
        }
        if (i < 32) {
            return 3;
        }
        if (32 > i) {
            return 0;
        }
        if (i < 64) {
            return 2;
        }
        return i < 128 ? 1 : 0;
    }

    public final String a() {
        byte[] bArr = new byte[4];
        this.e.nextBytes(bArr);
        return Base64.encodeToString(bArr, 2).substring(0, 4);
    }

    public z6(SecureRandom secureRandom) {
        this.e = secureRandom;
    }

    public final String a(Map<String, ? extends List<String>> map) throws j0.a.C0059a {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (!kotlin.text.a0.LJJIJ(key, ':') && !kotlin.text.a0.LJJIJ(key, ';') && !kotlin.text.a0.LJJIJ(key, '=')) {
                sb.append(key);
                if (!value.isEmpty()) {
                    sb.append('=');
                    sb.append(C13LP.LJJLIIIJ(value, ",", null, null, 0, null, null, 62));
                }
                sb.append(';');
            } else {
                throw new j0.a.C0059a(i0.MalformedExtension, null);
            }
        }
        if (sb.length() > 0) {
            return C13LN.LJLJLLL(sb).toString();
        }
        return sb.toString();
    }

    public final void a(Date date) throws j0.a.C0059a {
        bg.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        long time = (jCurrentTimeMillis / j) - (date.getTime() / j);
        if (time <= 172800) {
            return;
        }
        throw new j0.a.C0059a(i0.InvalidServerDate, "Invalid used time interval   " + time + " > 172800");
    }

    public final int a(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            int iA = a(b);
            i += iA;
            if (iA != 8) {
                break;
            }
        }
        return i;
    }

    @Override // ttpobfuscated.j0
    public Object a(h0 h0Var, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) throws Throwable {
        try {
            lb.j.getClass();
            Long lC = lb.k.c();
            Integer num = h0Var.e;
            if (num != null) {
                int iIntValue = num.intValue();
                String str = h0Var.c;
                if (str != null) {
                    Map<String, List<String>> map = h0Var.f;
                    if (map != null) {
                        Date date = h0Var.d;
                        if (date != null) {
                            a(date);
                            String strA = o3.a(date, null, null, 3, null);
                            if (iIntValue >= 0 && iIntValue <= 40) {
                                if (str.length() != 0 && !kotlin.text.a0.LJJIJ(str, ':') && str.length() == 64) {
                                    String str2 = "1:" + iIntValue + ':' + strA + ':' + str + ':' + a(map) + ':' + a() + ':';
                                    String strA2 = a(iIntValue, str2);
                                    lb.k.a(this.f + ".resolve " + str2, lC, true, this.f);
                                    return str2 + strA2;
                                }
                                throw new j0.a.C0059a(i0.MalformedResource, null);
                            }
                            throw new j0.a.C0059a(i0.UnsupportedHashLength, null);
                        }
                        throw new j0.a.C0059a(i0.ChallengeDataCannotBeNull, "Server date cannot be null");
                    }
                    throw new j0.a.C0059a(i0.ChallengeDataCannotBeNull, "Extension can be empty but not null");
                }
                throw new j0.a.C0059a(i0.ChallengeDataCannotBeNull, "Token cannot be null");
            }
            throw new j0.a.C0059a(i0.ChallengeDataCannotBeNull, "Bits cannot be null");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                q3.a aVar = q3.a;
                String str3 = this.f;
                aVar.getClass();
                q3.a.c.b("Generating HashCash headers string failed", str3, thM5exceptionOrNullimpl);
                if (!(thM5exceptionOrNullimpl instanceof j0.a)) {
                    throw new j0.a.C0059a(i0.UnknownError, thM5exceptionOrNullimpl.getMessage());
                }
                throw thM5exceptionOrNullimpl;
            }
            throw new C2197108jB();
        }
    }

    public final String a(int i, String str) {
        String string;
        byte[] bArr = new byte[4];
        this.e.nextBytes(bArr);
        long j = 0;
        int i2 = 0;
        do {
            j = (j << 8) + (((long) bArr[i2]) & 255);
            i2++;
        } while (i2 < 4);
        "".getBytes(Charsets.UTF_8);
        do {
            j++;
            CharsKt__CharJVMKt.checkRadix(16);
            string = Long.toString(j, 16);
        } while (Integer.compare(a(b7.a((str + string).getBytes(Charsets.UTF_8))) ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i) < 0);
        return string;
    }

    public static /* synthetic */ String a(z6 z6Var, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return z6Var.a(i, str);
    }
}
