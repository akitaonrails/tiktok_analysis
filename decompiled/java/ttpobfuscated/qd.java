package ttpobfuscated;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class qd {
    public final String a;
    public final Date b;

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        return "SentEvent(kind=" + this.a + ", lastSentDate=" + this.b + ')';
    }

    public final String a() {
        return this.a;
    }

    public final Date b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final Date d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        if (Intrinsics.LJFF(this.a, qdVar.a) && Intrinsics.LJFF(this.b, qdVar.b)) {
            return true;
        }
        return false;
    }

    public qd(String str, Date date) {
        this.a = str;
        this.b = date;
    }

    public final qd a(String str, Date date) {
        return new qd(str, date);
    }

    public static /* synthetic */ qd a(qd qdVar, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qdVar.a;
        }
        if ((i & 2) != 0) {
            date = qdVar.b;
        }
        return qdVar.a(str, date);
    }
}
