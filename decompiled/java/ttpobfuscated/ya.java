package ttpobfuscated;

import X.C786410Ut5;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class ya implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "pki";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a b = new a();
        public final String a;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", this.a);
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return n0.a(new StringBuilder("Metadata(message="), this.a, ')');
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.a;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                new JSONObject(str);
                return new b("message");
            }
        }

        public b(String str) {
            this.a = str;
        }

        public final b a(String str) {
            return new b(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Intrinsics.LJFF(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public static b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            bVar.getClass();
            return new b(str);
        }
    }

    @Override // ttpobfuscated.fg
    public String f() {
        return "android";
    }

    @Override // ttpobfuscated.fg
    public String b() {
        return e().a();
    }

    @Override // ttpobfuscated.fg
    public String g() {
        return e().b();
    }

    @Override // ttpobfuscated.fg
    public UUID a() {
        return this.k;
    }

    @Override // ttpobfuscated.fg
    public zb c() {
        return this.o;
    }

    @Override // ttpobfuscated.fg
    public String d() {
        return this.n;
    }

    @Override // ttpobfuscated.fg
    public b2 e() {
        return this.m;
    }

    @Override // ttpobfuscated.fg
    public Date h() {
        return this.l;
    }

    public zb.a i() {
        return this.o;
    }

    public b j() {
        return this.m;
    }

    public static final class a implements c4<ya> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ya a(DBEvent dBEvent) {
            return new ya(dBEvent.a, dBEvent.b, b.b.a(dBEvent.d));
        }
    }

    public ya(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
