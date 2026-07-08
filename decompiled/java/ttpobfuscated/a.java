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
public final class a implements fg<b> {
    public static final C0041a p = new C0041a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "activation";
    public final zb.e o = new zb.e(100);

    public static final class b implements b2 {
        public static final C0042a f = new C0042a();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final ttpobfuscated.b e;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String str = this.a;
            if (str != null) {
                jSONObject.put("region", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("userId", str2);
            }
            String str3 = this.c;
            if (str3 != null) {
                jSONObject.put("deviceId", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("userAction", str4);
            }
            jSONObject.put("activationType", this.e.name());
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Metadata(region=" + this.a + ", userId=" + this.b + ", deviceId=" + this.c + ", userAction=" + this.d + ", activationType=" + this.e + ')';
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public final String f() {
            return this.d;
        }

        public final ttpobfuscated.b g() {
            return this.e;
        }

        public final ttpobfuscated.b h() {
            return this.e;
        }

        public final String i() {
            return this.c;
        }

        public final String j() {
            return this.a;
        }

        public final String k() {
            return this.d;
        }

        public final String l() {
            return this.b;
        }

        /* JADX INFO: renamed from: ttpobfuscated.a$b$a, reason: collision with other inner class name */
        public static final class C0042a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                JSONObject jSONObject = new JSONObject(str);
                return new b(q4.f(jSONObject, "region"), q4.f(jSONObject, "userId"), q4.f(jSONObject, "deviceId"), q4.f(jSONObject, "userAction"), ttpobfuscated.b.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "activationType")));
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
            if (Intrinsics.LJFF(this.a, bVar.a) && Intrinsics.LJFF(this.b, bVar.b) && Intrinsics.LJFF(this.c, bVar.c) && Intrinsics.LJFF(this.d, bVar.d) && this.e == bVar.e) {
                return true;
            }
            return false;
        }

        public b(String str, String str2, String str3, String str4, ttpobfuscated.b bVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bVar;
        }

        public final b a(String str, String str2, String str3, String str4, ttpobfuscated.b bVar) {
            return new b(str, str2, str3, str4, bVar);
        }

        public static b a(b bVar, String str, String str2, String str3, String str4, ttpobfuscated.b bVar2, int i, Object obj) {
            ttpobfuscated.b bVar3 = bVar2;
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            String str8 = str;
            if ((i & 1) != 0) {
                str8 = bVar.a;
            }
            if ((i & 2) != 0) {
                str7 = bVar.b;
            }
            if ((i & 4) != 0) {
                str6 = bVar.c;
            }
            if ((i & 8) != 0) {
                str5 = bVar.d;
            }
            if ((i & 16) != 0) {
                bVar3 = bVar.e;
            }
            bVar.getClass();
            return new b(str8, str7, str6, str5, bVar3);
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

    public zb.e i() {
        return this.o;
    }

    public b j() {
        return this.m;
    }

    /* JADX INFO: renamed from: ttpobfuscated.a$a, reason: collision with other inner class name */
    public static final class C0041a implements c4<a> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(DBEvent dBEvent) {
            return new a(dBEvent.a, dBEvent.b, b.f.a(dBEvent.d));
        }
    }

    public a(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
