package ttpobfuscated;

import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Date;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class w7 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "invalidSignature";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a c = new a();
        public final re a;
        public final int b;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signatureType", this.a.b());
            jSONObject.put("version", this.b);
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            return this.b + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "Metadata(type=" + this.a + ", version=" + this.b + ')';
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final re c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        public final re e() {
            return this.a;
        }

        public final int f() {
            return this.b;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(re.b.a(JSONObjectProtectorUtils.getString(jSONObject, "signatureType")), JSONObjectProtectorUtils.getInt(jSONObject, "version"));
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
            if (this.a == bVar.a && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public b(re reVar, int i) {
            this.a = reVar;
            this.b = i;
        }

        public final b a(re reVar, int i) {
            return new b(reVar, i);
        }

        public static b a(b bVar, re reVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                reVar = bVar.a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.b;
            }
            bVar.getClass();
            return new b(reVar, i);
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

    public static final class a implements c4<w7> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w7 a(DBEvent dBEvent) {
            return new w7(dBEvent.a, dBEvent.b, b.c.a(dBEvent.d));
        }
    }

    public w7(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
