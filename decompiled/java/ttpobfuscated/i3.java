package ttpobfuscated;

import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class i3 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "compromisedDb";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a c = new a();
        public final j3 a;
        public final String b;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("databaseEventType", this.a.name());
            jSONObject.put("message", this.b);
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Metadata(databaseEventType=");
            sb.append(this.a);
            sb.append(", message=");
            return n0.a(sb, this.b, ')');
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final j3 c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final j3 e() {
            return this.a;
        }

        public final String f() {
            return this.b;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(j3.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "databaseEventType")), jSONObject.optString("message"));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && Intrinsics.LJFF(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public b(j3 j3Var, String str) {
            this.a = j3Var;
            this.b = str;
        }

        public final b a(j3 j3Var, String str) {
            return new b(j3Var, str);
        }

        public static /* synthetic */ b a(b bVar, j3 j3Var, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j3Var = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            return bVar.a(j3Var, str);
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

    public static final class a implements c4<i3> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i3 a(DBEvent dBEvent) {
            return new i3(dBEvent.a, dBEvent.b, b.c.a(dBEvent.d));
        }
    }

    public i3(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
