package com.bytedance.bpea.entry.auth;

import X.C2188811AlT;
import X.C825940Wae;
import X.C837830Wtp;
import X.C837980Wu4;
import X.C838040WuA;
import X.C838080WuE;
import X.C838100WuG;
import X.EnumC746240TPa;
import X.InterfaceC1294060jmO;
import X.InterfaceC838120WuI;
import X.InterfaceC838160WuM;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class CertAuthEntry {
    public static final Companion Companion = new Companion();

    public static final C838040WuA checkCert(Cert cert, String[] strArr, String str, String str2, String str3) {
        return Companion.checkCert(cert, strArr, str, str2, str3);
    }

    public static final <T> T checkCertAndCall(Cert cert, String[] strArr, String str, String str2, String str3, Function1<? super C838040WuA, ? extends T> function1) {
        return (T) Companion.checkCertAndCall(cert, strArr, str, str2, str3, function1);
    }

    @InterfaceC1294060jmO
    public static final C838040WuA checkSDKCert(Cert cert, String[] strArr, String str, String str2) {
        return Companion.checkSDKCert(cert, strArr, str, str2);
    }

    public static final JSONObject getTranslateResult(C838040WuA c838040WuA) {
        return Companion.getTranslateResult(c838040WuA);
    }

    public static final class Companion {
        public final JSONObject getTranslateResult(C838040WuA c838040WuA) {
            return C837830Wtp.LIZIZ(c838040WuA);
        }

        @InterfaceC1294060jmO
        public final C838040WuA checkSDKCert(Cert cert, String[] strArr, String str, String str2) {
            return checkCert(cert, strArr, str, str2, "Collect");
        }

        public final C838040WuA checkCert(Cert cert, String[] strArr, String str, String str2, String str3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            C825940Wae c825940Wae = new C825940Wae(cert, C2188811AlT.LIZIZ(sbLIZ), strArr, Integer.valueOf(EnumC746240TPa.DIRECT_AUTH.getType()), str3);
            c825940Wae.LIZ(str, "sdkName");
            c825940Wae.LIZ(str2, "methodName");
            InterfaceC838120WuI interfaceC838120WuI = C838100WuG.LIZ;
            InterfaceC838160WuM interfaceC838160WuM = C837980Wu4.LIZ;
            if (interfaceC838160WuM != null) {
                interfaceC838160WuM.LIZ(c825940Wae);
            }
            InterfaceC838120WuI interfaceC838120WuI2 = C838100WuG.LIZ;
            if (interfaceC838120WuI2 == null) {
                return null;
            }
            return interfaceC838120WuI2.check(c825940Wae, null);
        }

        public final <T> T checkCertAndCall(Cert cert, String[] strArr, String str, String str2, String str3, Function1<? super C838040WuA, ? extends T> function1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            C825940Wae c825940Wae = new C825940Wae(cert, C2188811AlT.LIZIZ(sbLIZ), strArr, Integer.valueOf(EnumC746240TPa.DIRECT_AUTH.getType()), str3);
            c825940Wae.LIZ(str, "sdkName");
            c825940Wae.LIZ(str2, "methodName");
            return (T) C838080WuE.LIZ(c825940Wae, function1);
        }
    }
}
