package ttpobfuscated;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C1507240pKE;
import X.C19994513Lb;
import X.C19994913Lf;
import X.C2097608Jq;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import ttp.orbu.sdk.TTPOrbuResponse;

/* JADX INFO: loaded from: classes24.dex */
public final class fc {
    public static final a e = new a();
    public final boolean a;
    public final String b;
    public cc c;
    public Map<String, String> d;

    public static final class a {
    }

    public final int a() {
        C19994913Lf c19994913Lf = AbstractC19994813Le.Default;
        if (Integer.compare(Integer.MAX_VALUE, -1147483648) > 0) {
            return c19994913Lf.nextInt(-1147483648, Integer.MAX_VALUE) ^ Integer.MIN_VALUE;
        }
        String strLIZJ = C19994513Lb.LIZJ(new C1507240pKE(1000000000), new C1507240pKE(-1));
        strLIZJ.toString();
        throw new IllegalArgumentException(strLIZJ);
    }

    public String toString() {
        if (!this.a) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|request=" + this.d.get("requestDebugId"));
        sb.append("|type=" + this.b);
        sb.append("|process=" + Process.myPid());
        sb.append("|thread=" + Process.myTid());
        String str = this.d.get("result");
        if (str != null) {
            sb.append("|result=".concat(str));
        }
        if (this.c != null) {
            sb.append("|payload=" + this.c);
        }
        String str2 = this.d.get("error");
        if (str2 != null) {
            sb.append("|error=".concat(str2));
        }
        return sb.toString();
    }

    public final void a(String str) {
        if (this.a) {
            if (this.d.get("error") != null) {
                Map<String, String> map = this.d;
                map.put("error", map.get("error") + ' ' + str);
                if (Unit.LIZ != null) {
                    return;
                }
            }
            this.d.put("error", str);
        }
    }

    public final void a(TTPOrbuResponse tTPOrbuResponse) {
        if (this.a) {
            this.d.put("result", String.valueOf(tTPOrbuResponse));
        }
    }

    public final void a(C01GW<cc> c01gw) {
        if (this.a) {
            this.c = c01gw.getValue();
        }
    }

    public fc(boolean z, String str) {
        this.a = z;
        this.b = str;
        this.d = new LinkedHashMap();
        if (z) {
            this.d = C2097608Jq.LJIIJ(new Pair("requestDebugId", Long.toString(((long) a()) & 4294967295L, 10)));
        }
    }
}
