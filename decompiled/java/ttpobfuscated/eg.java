package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eg {
    public final String a;
    public final wf b;
    public final String c;
    public final String d;

    public int hashCode() {
        return this.d.hashCode() + m2.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TraceLog(timestamp=");
        sb.append(this.a);
        sb.append(", telemetryID=");
        sb.append(this.b);
        sb.append(", outputType=");
        sb.append(this.c);
        sb.append(", outputIdentifier=");
        return n0.a(sb, this.d, ')');
    }

    public final String a() {
        return this.a;
    }

    public final wf b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.c;
    }

    public final wf g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        if (Intrinsics.LJFF(this.a, egVar.a) && this.b == egVar.b && Intrinsics.LJFF(this.c, egVar.c) && Intrinsics.LJFF(this.d, egVar.d)) {
            return true;
        }
        return false;
    }

    public eg(String str, wf wfVar, String str2, String str3) {
        this.a = str;
        this.b = wfVar;
        this.c = str2;
        this.d = str3;
    }

    public final eg a(String str, wf wfVar, String str2, String str3) {
        return new eg(str, wfVar, str2, str3);
    }

    public static /* synthetic */ eg a(eg egVar, String str, wf wfVar, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = egVar.a;
        }
        if ((i & 2) != 0) {
            wfVar = egVar.b;
        }
        if ((i & 4) != 0) {
            str2 = egVar.c;
        }
        if ((i & 8) != 0) {
            str3 = egVar.d;
        }
        return egVar.a(str, wfVar, str2, str3);
    }
}
