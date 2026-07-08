package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import X.C2097608Jq;
import X.C786410Ut5;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import ttpobfuscated.pb;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class w8 implements pb {
    public final Map<String, String> a;

    public w8() {
        re reVar = re.CONFIG;
        Pair pair = new Pair(a(0, reVar), "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQAIx2jDZnNxKV3gU3yjK1E5MW/iYiNaDq98ocJLZMuqa0Z6XJoxNYcCbHdWqfG2kqaUi79gpA3s5QHLormhW3DNcYBsNUvYCIjukKowLlUUbYF4WQ+dqBoGHPT0Tc8KhEAnlEhl5Zbw0FWJhFtH5kdvJDkrr4fB02uHMkgZyLcCE6ytxs=");
        Pair pair2 = new Pair(a(2, reVar), "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQBapF4Sgw712CiNCMyI03qyb6riJ5Redfr+zsSNTUA8Xj8tBAcK5ul74S7Pv/rMQJwFMl5uvSbIyqYZsbCEUd3Fy0AuG683oSe5Dj1EL/MO2T+iNuxy7xtmrUBtWMrDec6BqfMQWzsyJNLzOroyvUFKWDQuYl9yXcXNusaqhAFBkuXukE=");
        re reVar2 = re.GECKO;
        this.a = C2097608Jq.LJIIIIZZ(pair, pair2, new Pair(a(1, reVar2), "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQATO+2xEkp2dMaIVqUBGuhQ7wahmt/M3rFicARpiMqkBnjbWk6rju1qnv94SylUBpdrRt2mXpyMmLrOEhazmgG5k4BZoBrelWOGADr77LGAq8zibOsRIANrYHI6WAI9FTy1h7N2xYM8eqgt2mdMt+xg1L5MU1mqkMaxMqOHDLlcLTcUIs="), new Pair(a(0, reVar2), "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQAIx2jDZnNxKV3gU3yjK1E5MW/iYiNaDq98ocJLZMuqa0Z6XJoxNYcCbHdWqfG2kqaUi79gpA3s5QHLormhW3DNcYBsNUvYCIjukKowLlUUbYF4WQ+dqBoGHPT0Tc8KhEAnlEhl5Zbw0FWJhFtH5kdvJDkrr4fB02uHMkgZyLcCE6ytxs="), new Pair(a(-1, reVar2), "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQAnW0mVeCch3oUttRp0wzuKjfDlluBQmyXgUIiCIK1VViHBT384Hd8/DPsnywnZ/7+CKOo8zWc0utS7e64BdpXB6kA8d55YZHJTCKNAxjX2AhTU3/pNlFQtCsAxe4rEYJo55kWPExR0IXzERYwYahxb3LbdFJFsBcv4NuYG8Hh+EaLq30="));
    }

    @Override // ttpobfuscated.pb
    public PublicKey a(re reVar, int i) throws Throwable {
        Object c098200Yq;
        try {
            String str = this.a.get(a(i, reVar));
            if (str != null) {
                c098200Yq = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
            } else {
                c098200Yq = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (c098200Yq != null) {
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return (PublicKey) c098200Yq;
            }
            q3.a aVar = q3.a;
            String str2 = x8.a;
            aVar.getClass();
            q3.a.c.b("Get public key failure ", str2, thM5exceptionOrNullimpl);
            if (!(thM5exceptionOrNullimpl instanceof pb.a.C0066a)) {
                throw new pb.a.C0066a(thM5exceptionOrNullimpl);
            }
            throw thM5exceptionOrNullimpl;
        }
        throw new pb.a.C0066a(new NullPointerException());
    }

    public final String a(int i, re reVar) {
        return C786410Ut5.j4("%s-%s", Arrays.copyOf(new Object[]{reVar.b().toLowerCase(Locale.ROOT), String.valueOf(i)}, 2));
    }
}
