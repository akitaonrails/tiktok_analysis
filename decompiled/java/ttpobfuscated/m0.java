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
public final class m0 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "cleanup";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a d = new a();
        public final String a;
        public final int b;
        public final String c;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reasonCode", this.a);
            jSONObject.put("returnCode", this.b);
            jSONObject.put("clientIdentifier", this.c);
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            return this.c.hashCode() + ((this.b + (this.a.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Metadata(reasonCode=");
            sb.append(this.a);
            sb.append(", resultCode=");
            sb.append(this.b);
            sb.append(", clientIdentifier=");
            return n0.a(sb, this.c, ')');
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final String c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.c;
        }

        public final String g() {
            return this.a;
        }

        public final int h() {
            return this.b;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(JSONObjectProtectorUtils.getString(jSONObject, "reasonCode"), JSONObjectProtectorUtils.getInt(jSONObject, "returnCode"), JSONObjectProtectorUtils.getString(jSONObject, "clientIdentifier"));
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
            if (Intrinsics.LJFF(this.a, bVar.a) && this.b == bVar.b && Intrinsics.LJFF(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public b(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public final b a(String str, int i, String str2) {
            return new b(str, i, str2);
        }

        public static /* synthetic */ b a(b bVar, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.b;
            }
            if ((i2 & 4) != 0) {
                str2 = bVar.c;
            }
            return bVar.a(str, i, str2);
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

    public static final class a implements c4<m0> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m0 a(DBEvent dBEvent) {
            return new m0(dBEvent.a, dBEvent.b, b.d.a(dBEvent.d));
        }
    }

    public m0(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
