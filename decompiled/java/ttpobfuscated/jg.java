package ttpobfuscated;

import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class jg {
    public static final a i = new a();
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public List<String> f;
    public xb g;
    public final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    public int hashCode() {
        int iHashCode = (this.f.hashCode() + m2.a(this.e, (C786410Ut5.Y2(this.d) + m2.a(this.c, m2.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31)) * 31;
        xb xbVar = this.g;
        int iHashCode2 = (iHashCode + (xbVar == null ? 0 : xbVar.hashCode())) * 31;
        boolean z = this.h;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode2 + r0;
    }

    public String toString() {
        return "TtpUser(userId=" + this.a + ", deviceId=" + this.b + ", region=" + this.c + ", lastUpdateTime=" + this.d + ", clientIdentifier=" + this.e + ", exRegions=" + this.f + ", regionStatus=" + this.g + ", activated=" + this.h + ')';
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final List<String> f() {
        return this.f;
    }

    public final xb g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.h;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.b;
    }

    public final List<String> l() {
        return this.f;
    }

    public final long m() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    public final xb o() {
        return this.g;
    }

    public final String p() {
        return this.a;
    }

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
        public final jg a(JSONObject jSONObject) {
            long jCurrentTimeMillis;
            boolean zBooleanValue;
            ?? arrayList;
            List<Object> listA;
            Long lA = o3.a(JSONObjectProtectorUtils.getString(jSONObject, "lastUpdateTime"));
            String strF = q4.f(jSONObject, "userId");
            if (strF == null) {
                strF = "";
            }
            String strF2 = q4.f(jSONObject, "deviceId");
            if (strF2 == null) {
                strF2 = "";
            }
            String strF3 = q4.f(jSONObject, "region");
            if (strF3 == null) {
                strF3 = "";
            }
            if (lA != null) {
                jCurrentTimeMillis = lA.longValue();
            } else {
                bg.a.getClass();
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            String strF4 = q4.f(jSONObject, "clientIdentifier");
            if (strF4 == null) {
                strF4 = "";
            }
            Boolean boolB = q4.b(jSONObject, "activated");
            if (boolB != null) {
                zBooleanValue = boolB.booleanValue();
            } else {
                zBooleanValue = false;
            }
            JSONArray jSONArrayD = q4.d(jSONObject, "exRegions");
            xb xbVarA = null;
            if (jSONArrayD != null && (listA = b8.a(jSONArrayD)) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
                for (Object obj : listA) {
                    if (!(obj instanceof String) || obj == null) {
                        obj = "";
                    }
                    arrayList.add(obj);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList((Collection) arrayList);
            String strF5 = q4.f(jSONObject, "regionStatus");
            if (strF5 != null) {
                xbVarA = xb.a.a(strF5);
            }
            return new jg(strF, strF2, strF3, jCurrentTimeMillis, strF4, arrayList2, xbVarA, zBooleanValue);
        }
    }

    public final JSONObject a(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", this.a);
        jSONObject.put("deviceId", this.b);
        jSONObject.put("region", this.c);
        jSONObject.put("lastUpdateTime", o3.a(this.d));
        jSONObject.put("clientIdentifier", this.e);
        if (!z) {
            List<String> list = this.f;
            if (!list.isEmpty()) {
                jSONObject.putOpt("previousRegion", C13LP.LJJLIIIJJI(list));
            }
            jSONObject.put("exRegions", this.f);
            xb xbVar = this.g;
            if (xbVar != null) {
                jSONObject.put("regionStatus", xbVar);
            }
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg)) {
            return false;
        }
        jg jgVar = (jg) obj;
        if (Intrinsics.LJFF(this.a, jgVar.a) && Intrinsics.LJFF(this.b, jgVar.b) && Intrinsics.LJFF(this.c, jgVar.c) && this.d == jgVar.d && Intrinsics.LJFF(this.e, jgVar.e) && Intrinsics.LJFF(this.f, jgVar.f) && this.g == jgVar.g && this.h == jgVar.h) {
            return true;
        }
        return false;
    }

    public final void a(String str) {
        this.f.add(str);
    }

    public final void a(List<String> list) {
        this.f = list;
    }

    public final void a(xb xbVar) {
        this.g = xbVar;
    }

    public static /* synthetic */ JSONObject a(jg jgVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return jgVar.a(z);
    }

    public jg(String str, String str2, String str3, long j, String str4, List<String> list, xb xbVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = list;
        this.g = xbVar;
        this.h = z;
    }

    public final jg a(String str, String str2, String str3, long j, String str4, List<String> list, xb xbVar, boolean z) {
        return new jg(str, str2, str3, j, str4, list, xbVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jg a(jg jgVar, String str, String str2, String str3, long j, String str4, List list, xb xbVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = jgVar.a;
        }
        if ((i2 & 2) != 0) {
            str2 = jgVar.b;
        }
        if ((i2 & 4) != 0) {
            str3 = jgVar.c;
        }
        if ((i2 & 8) != 0) {
            j = jgVar.d;
        }
        if ((i2 & 16) != 0) {
            str4 = jgVar.e;
        }
        if ((i2 & 32) != 0) {
            list = jgVar.f;
        }
        if ((i2 & 64) != 0) {
            xbVar = jgVar.g;
        }
        if ((i2 & 128) != 0) {
            z = jgVar.h;
        }
        return jgVar.a(str, str2, str3, j, str4, list, xbVar, z);
    }
}
