package ttpobfuscated;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 {
    public final SessionIdHeaderFrequency a;
    public final Map<String, String> b;

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map<String, String> map = this.b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "HeaderSessionData(sessionIdHeaderFrequency=" + this.a + ", sessionIdEntry=" + this.b + ')';
    }

    public final SessionIdHeaderFrequency a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.b;
    }

    public final SessionIdHeaderFrequency d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        if (this.a == d7Var.a && Intrinsics.LJFF(this.b, d7Var.b)) {
            return true;
        }
        return false;
    }

    public d7(SessionIdHeaderFrequency sessionIdHeaderFrequency, Map<String, String> map) {
        this.a = sessionIdHeaderFrequency;
        this.b = map;
    }

    public final d7 a(SessionIdHeaderFrequency sessionIdHeaderFrequency, Map<String, String> map) {
        return new d7(sessionIdHeaderFrequency, map);
    }

    public static d7 a(d7 d7Var, SessionIdHeaderFrequency sessionIdHeaderFrequency, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionIdHeaderFrequency = d7Var.a;
        }
        if ((i & 2) != 0) {
            map = d7Var.b;
        }
        d7Var.getClass();
        return new d7(sessionIdHeaderFrequency, map);
    }
}
