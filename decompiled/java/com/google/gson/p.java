package com.google.gson;

import X.C09CU;
import X.C09D6;
import X.C2188811AlT;
import X.C2329809Ay;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.w;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public static k LIZ(C09CU c09cu) {
        boolean z = c09cu.LLILLJJLI;
        c09cu.LLILLJJLI = true;
        try {
            try {
                try {
                    k kVarLIZ = w.LIZ(c09cu);
                    c09cu.LLILLJJLI = z;
                    return kVarLIZ;
                } catch (StackOverflowError e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed parsing JSON source: ");
                    sbLIZ.append(c09cu);
                    sbLIZ.append(" to Json");
                    throw new o(C2188811AlT.LIZIZ(sbLIZ), e);
                }
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed parsing JSON source: ");
                sbLIZ2.append(c09cu);
                sbLIZ2.append(" to Json");
                throw new o(C2188811AlT.LIZIZ(sbLIZ2), e2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c09cu.LLILLJJLI = z;
            throw th;
        }
    }

    public static k LIZIZ(Reader reader) {
        try {
            C09CU c09cu = new C09CU(reader);
            k kVarLIZ = LIZ(c09cu);
            kVarLIZ.getClass();
            if (!(kVarLIZ instanceof m) && c09cu.LJJLIIIJ() != C09D6.END_DOCUMENT) {
                throw new s("Did not consume the entire document.");
            }
            return kVarLIZ;
        } catch (C2329809Ay e) {
            TryCatchGuardChecker.doCheck(e);
            throw new s(e);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new l(e2);
        } catch (NumberFormatException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new s(e3);
        }
    }

    public static k LIZJ(String str) {
        return LIZIZ(new StringReader(str));
    }
}
