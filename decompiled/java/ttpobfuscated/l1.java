package ttpobfuscated;

import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttpobfuscated.b2;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class l1 implements fg<b> {
    public static final a p = new a();
    public final UUID k;
    public final Date l;
    public final b m;
    public final String n = "configuration";
    public final zb.a o = zb.a.h;

    public static final class b implements b2 {
        public static final a d = new a();
        public final m1 a;
        public final String b;
        public final ConfigType c;

        @Override // ttpobfuscated.b2
        public String b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("configEventType", this.a.name());
            jSONObject.put("message", this.b);
            ConfigType configType = this.c;
            if (configType != null) {
                jSONObject.put("configType", configType.getType());
                jSONObject.put("fileName", configType.getFileName());
            }
            return C786410Ut5.J3(jSONObject);
        }

        public int hashCode() {
            int iA = m2.a(this.b, this.a.hashCode() * 31, 31);
            ConfigType configType = this.c;
            return iA + (configType == null ? 0 : configType.hashCode());
        }

        public String toString() {
            return "Metadata(configEventType=" + this.a + ", message=" + this.b + ", configType=" + this.c + ')';
        }

        @Override // ttpobfuscated.b2
        public String a() {
            return b();
        }

        public final m1 c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final ConfigType e() {
            return this.c;
        }

        public final m1 f() {
            return this.a;
        }

        public final ConfigType g() {
            return this.c;
        }

        public final String h() {
            return this.b;
        }

        public static final class a implements b2.a<b> {
            @Override // ttpobfuscated.b2.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(String str) {
                ConfigType configTypeFromType;
                JSONObject jSONObject = new JSONObject(str);
                m1 m1VarValueOf = m1.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "configEventType"));
                String strOptString = jSONObject.optString("message");
                String strF = q4.f(jSONObject, "configType");
                if (strF != null) {
                    configTypeFromType = ConfigType.Companion.fromType(strF);
                } else {
                    configTypeFromType = null;
                }
                return new b(m1VarValueOf, strOptString, configTypeFromType);
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
            if (this.a == bVar.a && Intrinsics.LJFF(this.b, bVar.b) && Intrinsics.LJFF(this.c, bVar.c)) {
                return true;
            }
            return false;
        }

        public b(m1 m1Var, String str, ConfigType configType) {
            this.a = m1Var;
            this.b = str;
            this.c = configType;
        }

        public final b a(m1 m1Var, String str, ConfigType configType) {
            return new b(m1Var, str, configType);
        }

        public static /* synthetic */ b a(b bVar, m1 m1Var, String str, ConfigType configType, int i, Object obj) {
            if ((i & 1) != 0) {
                m1Var = bVar.a;
            }
            if ((i & 2) != 0) {
                str = bVar.b;
            }
            if ((i & 4) != 0) {
                configType = bVar.c;
            }
            return bVar.a(m1Var, str, configType);
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

    public static final class a implements c4<l1> {
        @Override // ttpobfuscated.c4
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l1 a(DBEvent dBEvent) {
            return new l1(dBEvent.a, dBEvent.b, b.d.a(dBEvent.d));
        }
    }

    public l1(UUID uuid, Date date, b bVar) {
        this.k = uuid;
        this.l = date;
        this.m = bVar;
    }
}
