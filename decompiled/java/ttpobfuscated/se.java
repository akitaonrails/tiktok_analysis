package ttpobfuscated;

import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.b2;

/* JADX INFO: loaded from: classes24.dex */
public final class se implements b2 {
    public static final a g = new a();
    public final String a;
    public final String b;
    public final re c;
    public final int d;
    public final String e;
    public final String f;

    @Override // ttpobfuscated.b2
    public String b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("payload", this.a);
        jSONObject.put("signature", this.b);
        jSONObject.put("type", this.c.name());
        jSONObject.put("version", this.d);
        jSONObject.put("keyId", this.e);
        String str = this.f;
        if (str != null) {
            jSONObject.put("keyVersionId", str);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public int hashCode() {
        int iA = m2.a(this.e, (this.d + ((this.c.hashCode() + m2.a(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31, 31);
        String str = this.f;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignedArtefact(payload=");
        sb.append(this.a);
        sb.append(", signature=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", version=");
        sb.append(this.d);
        sb.append(", keyId=");
        sb.append(this.e);
        sb.append(", keyVersionId=");
        return n0.a(sb, this.f, ')');
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

    public final re e() {
        return this.c;
    }

    public final int f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.a;
    }

    public final String l() {
        return this.b;
    }

    public final re m() {
        return this.c;
    }

    public final int n() {
        return this.d;
    }

    public static final class a implements b2.a<se> {
        /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
        @Override // ttpobfuscated.b2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ttpobfuscated.se a(java.lang.String r10) {
            /*
                r9 = this;
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>(r10)
                java.lang.String r0 = "payload"
                java.lang.String r3 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)
                java.lang.String r0 = "signature"
                java.lang.String r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)
                ttpobfuscated.re$a r1 = ttpobfuscated.re.b
                java.lang.String r0 = "type"
                java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)
                ttpobfuscated.re r5 = r1.a(r0)
                java.lang.String r0 = "version"
                int r6 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getInt(r2, r0)
                java.lang.String r0 = "keyId"
                java.lang.String r7 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r2, r0)
                java.lang.String r1 = "keyVersionId"
                boolean r0 = r2.isNull(r1)
                if (r0 != 0) goto L41
                java.lang.String r8 = r2.optString(r1)
                boolean r0 = kotlin.text.a0.LJJJIL(r8)
                if (r0 != 0) goto L41
            L3b:
                ttpobfuscated.se r2 = new ttpobfuscated.se
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r2
            L41:
                r8 = 0
                goto L3b
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.se.a.a(java.lang.String):ttpobfuscated.se");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        if (Intrinsics.LJFF(this.a, seVar.a) && Intrinsics.LJFF(this.b, seVar.b) && this.c == seVar.c && this.d == seVar.d && Intrinsics.LJFF(this.e, seVar.e) && Intrinsics.LJFF(this.f, seVar.f)) {
            return true;
        }
        return false;
    }

    public se(String str, String str2, re reVar, int i, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = reVar;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final se a(String str, String str2, re reVar, int i, String str3, String str4) {
        return new se(str, str2, reVar, i, str3, str4);
    }

    public static /* synthetic */ se a(se seVar, String str, String str2, re reVar, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = seVar.a;
        }
        if ((i2 & 2) != 0) {
            str2 = seVar.b;
        }
        if ((i2 & 4) != 0) {
            reVar = seVar.c;
        }
        if ((i2 & 8) != 0) {
            i = seVar.d;
        }
        if ((i2 & 16) != 0) {
            str3 = seVar.e;
        }
        if ((i2 & 32) != 0) {
            str4 = seVar.f;
        }
        return seVar.a(str, str2, reVar, i, str3, str4);
    }
}
