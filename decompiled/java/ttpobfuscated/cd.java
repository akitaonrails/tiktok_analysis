package ttpobfuscated;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class cd {
    public final String a;
    public final dd b;
    public final Map<String, String> c;

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SampleData(id=" + this.a + ", data=" + this.b + ", headers=" + this.c + ')';
    }

    public final String a() {
        return this.a;
    }

    public final dd b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.c;
    }

    public final dd d() {
        return this.b;
    }

    public final Map<String, String> e() {
        return this.c;
    }

    public final String f() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        if (Intrinsics.LJFF(this.a, cdVar.a) && Intrinsics.LJFF(this.b, cdVar.b) && Intrinsics.LJFF(this.c, cdVar.c)) {
            return true;
        }
        return false;
    }

    public cd(String str, dd ddVar, Map<String, String> map) {
        this.a = str;
        this.b = ddVar;
        this.c = map;
    }

    public final cd a(String str, dd ddVar, Map<String, String> map) {
        return new cd(str, ddVar, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cd a(cd cdVar, String str, dd ddVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cdVar.a;
        }
        if ((i & 2) != 0) {
            ddVar = cdVar.b;
        }
        if ((i & 4) != 0) {
            map = cdVar.c;
        }
        return cdVar.a(str, ddVar, map);
    }
}
