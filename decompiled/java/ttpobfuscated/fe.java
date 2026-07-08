package ttpobfuscated;

import X.C13LE;
import X.C1954807lC;
import X.C2097908Jt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency;
import ttp.orbu.sdk.requestvalidator.Request;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class fe {
    public static final String e = "sessionid";
    public static final int f = 671088640;
    public final String a = C13LE.LIZ(fe.class).LJI();
    public SessionIdHeaderFrequency b = SessionIdHeaderFrequency.Never;
    public Map<String, String> c;
    public static final a d = new a();
    public static final Regex g = new Regex("[0-9a-fA-F]+");

    public static final class a {
    }

    public final void a() {
        this.c = null;
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SessionIdHeaderFrequency.values().length];
            try {
                iArr[SessionIdHeaderFrequency.Never.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[SessionIdHeaderFrequency.HeartbeatOnly.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[SessionIdHeaderFrequency.Always.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            a = iArr;
        }
    }

    public final void a(Request request) {
        Integer numC;
        if (this.c == null && this.b != SessionIdHeaderFrequency.Never && (request instanceof Request.Http) && (numC = request.c()) != null && numC.intValue() == 671088640) {
            String strB = ((ng) ((Request.Http) request).h.getValue()).b(e);
            if (strB != null) {
                if (g.matches(strB)) {
                    q3.b.a(q3.a, "sessionId is extracted from request: " + request, this.a, (Throwable) null, 4, (Object) null);
                    this.c = C2097908Jt.LIZJ(new Pair(e, strB));
                }
                q3.b.a(q3.a, "sessionId is not extracted from request", this.a, (Throwable) null, 4, (Object) null);
            }
            q3.b.a(q3.a, "sessionId is null, hence not get extracted from request", this.a, (Throwable) null, 4, (Object) null);
        }
    }

    public final Map<String, String> a(String str) {
        Map<String, String> map = this.c;
        if (map != null) {
            int i = b.a[this.b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    return map;
                }
                if (Intrinsics.LJFF(str, "heartbeat")) {
                    return map;
                }
            }
        }
        return null;
    }

    public final void a(SessionIdHeaderFrequency sessionIdHeaderFrequency) {
        this.b = sessionIdHeaderFrequency;
    }
}
