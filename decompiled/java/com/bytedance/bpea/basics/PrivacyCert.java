package com.bytedance.bpea.basics;

import X.AbstractC1202400hOY;
import X.C20146413sE;
import X.C20146513sF;
import X.C20146613sG;
import X.C2188811AlT;
import X.C825940Wae;
import X.C838130WuJ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class PrivacyCert extends AbstractC1202400hOY {
    public static final C20146513sF Companion = new Object() { // from class: X.13sF
    };
    public final C20146413sE LL;
    public final String LLILLJJLI;
    public final C20146613sG[] LLILLL;

    public static final class Builder {
        public static final Companion Companion = new Companion();
        public String privacyCertId;
        public C20146613sG[] privacyPolicies;
        public String tag;
        public String usage;

        public static final Builder with(String str) {
            return Companion.with(str);
        }

        public final PrivacyCert build() {
            C20146413sE c20146413sE = new C20146413sE(this.privacyCertId);
            c20146413sE.setTag(this.tag);
            return new PrivacyCert(c20146413sE, this.usage, this.privacyPolicies);
        }

        public final String getPrivacyCertId() {
            return this.privacyCertId;
        }

        public final C20146613sG[] getPrivacyPolicies() {
            return this.privacyPolicies;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getUsage() {
            return this.usage;
        }

        public static final class Companion {
            public final Builder with(String str) {
                Builder builder = new Builder();
                builder.privacyCertId = str;
                return builder;
            }
        }

        public final Builder policies(C20146613sG... c20146613sGArr) {
            int length = c20146613sGArr.length;
            C20146613sG[] c20146613sGArr2 = new C20146613sG[length];
            for (int i = 0; i < length; i++) {
                c20146613sGArr2[i] = c20146613sGArr[i];
            }
            this.privacyPolicies = c20146613sGArr2;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder usage(String str) {
            this.usage = str;
            return this;
        }
    }

    public final PrivacyCert copy(C20146413sE c20146413sE, String str, C20146613sG[] c20146613sGArr) {
        return new PrivacyCert(c20146413sE, str, c20146613sGArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyCert)) {
            return false;
        }
        PrivacyCert privacyCert = (PrivacyCert) obj;
        return Intrinsics.LJFF(this.LL, privacyCert.LL) && Intrinsics.LJFF(this.LLILLJJLI, privacyCert.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, privacyCert.LLILLL);
    }

    public int hashCode() {
        C20146413sE c20146413sE = this.LL;
        int iHashCode = (c20146413sE == null ? 0 : c20146413sE.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C20146613sG[] c20146613sGArr = this.LLILLL;
        return iHashCode2 + (c20146613sGArr != null ? Arrays.hashCode(c20146613sGArr) : 0);
    }

    @Override // X.AbstractC1202400hOY
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyCert(privacyPoint=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", usage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", privacyPolicies=");
        sbLIZ.append(Arrays.toString(this.LLILLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1202400hOY, com.bytedance.bpea.basics.Cert
    public JSONObject toJSON() {
        JSONObject json = super.toJSON();
        try {
            json.put("usage", this.LLILLJJLI);
            C20146413sE c20146413sE = this.LL;
            json.put("tag", c20146413sE != null ? c20146413sE.tag : null);
            JSONArray jSONArray = new JSONArray();
            C20146613sG[] c20146613sGArr = this.LLILLL;
            if (c20146613sGArr != null) {
                for (C20146613sG c20146613sG : c20146613sGArr) {
                    jSONArray.put(c20146613sG.dataType);
                }
            }
            json.put("dataType", jSONArray.toString());
            return json;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return json;
        }
    }

    public final C20146413sE getPrivacyPoint() {
        return this.LL;
    }

    public final C20146613sG[] getPrivacyPolicies() {
        return this.LLILLL;
    }

    public final String getUsage() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1202400hOY, com.bytedance.bpea.basics.Cert
    public void validate(C825940Wae c825940Wae) throws C838130WuJ {
        String str;
        super.validate(c825940Wae);
        C20146413sE c20146413sE = this.LL;
        if (c20146413sE != null && (str = c20146413sE.id) != null && !a0.LJJJIL(str)) {
            C20146613sG[] c20146613sGArr = this.LLILLL;
            if (c20146613sGArr != null && c20146613sGArr.length != 0) {
                String[] strArr = c825940Wae.LIZJ;
                if (strArr != null && strArr.length != 0) {
                    for (String str2 : strArr) {
                        boolean z = false;
                        for (C20146613sG c20146613sG : this.LLILLL) {
                            String str3 = c20146613sG.dataType;
                            if (str3 != null && str3.equals(str2)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            throw new C838130WuJ(-1, "dataType do not match");
                        }
                    }
                    return;
                }
                throw new C838130WuJ(-1, "check dataType is empty");
            }
            throw new C838130WuJ(-1, "policy is empty");
        }
        throw new C838130WuJ(-1, "certId is empty");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrivacyCert(C20146413sE c20146413sE, String str, C20146613sG[] c20146613sGArr) {
        String str2;
        if (c20146413sE != null) {
            str2 = c20146413sE.id;
        } else {
            str2 = null;
        }
        super(str2, "PrivacyCert");
        this.LL = c20146413sE;
        this.LLILLJJLI = str;
        this.LLILLL = c20146613sGArr;
    }
}
