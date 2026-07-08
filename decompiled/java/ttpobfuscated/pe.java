package ttpobfuscated;

import X.C786410Ut5;
import android.util.Base64;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.ByteArrayInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.b2;

/* JADX INFO: loaded from: classes14.dex */
public final class pe implements b2 {
    public static final a e = new a();
    public final re a;
    public final int b;
    public final qe c;
    public final String d;

    @Override // ttpobfuscated.b2
    public String b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", this.d);
        jSONObject.put("datatype", this.c);
        jSONObject.put("type", this.a);
        jSONObject.put("version", this.b);
        return C786410Ut5.J3(jSONObject);
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31)) * 31);
    }

    public final byte[] i() {
        return Base64.decode(this.d, 2);
    }

    public final Certificate j() {
        return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(i()));
    }

    public final PublicKey k() {
        return KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(i()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignatureData(type=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", dataType=");
        sb.append(this.c);
        sb.append(", data=");
        return n0.a(sb, this.d, ')');
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

    public final qe e() {
        return this.c;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.d;
    }

    public final qe h() {
        return this.c;
    }

    public final re l() {
        return this.a;
    }

    public final int m() {
        return this.b;
    }

    public static final class a implements b2.a<pe> {
        @Override // ttpobfuscated.b2.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public pe a(String str) {
            JSONObject jSONObject = new JSONObject(str);
            String string = JSONObjectProtectorUtils.getString(jSONObject, "data");
            return new pe(re.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "type")), JSONObjectProtectorUtils.getInt(jSONObject, "version"), qe.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "datatype")), string);
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(pe.class, cls)) {
            return false;
        }
        pe peVar = (pe) obj;
        if (this.a == peVar.a && this.b == peVar.b && this.c == peVar.c && this.d.contentEquals(peVar.d)) {
            return true;
        }
        return false;
    }

    public pe(re reVar, int i, qe qeVar, String str) {
        this.a = reVar;
        this.b = i;
        this.c = qeVar;
        this.d = str;
    }

    public final pe a(re reVar, int i, qe qeVar, String str) {
        return new pe(reVar, i, qeVar, str);
    }

    public static /* synthetic */ pe a(pe peVar, re reVar, int i, qe qeVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            reVar = peVar.a;
        }
        if ((i2 & 2) != 0) {
            i = peVar.b;
        }
        if ((i2 & 4) != 0) {
            qeVar = peVar.c;
        }
        if ((i2 & 8) != 0) {
            str = peVar.d;
        }
        return peVar.a(reVar, i, qeVar, str);
    }
}
