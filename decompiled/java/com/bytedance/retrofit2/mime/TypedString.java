package com.bytedance.retrofit2.mime;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class TypedString extends TypedByteArray {
    @Override // com.bytedance.retrofit2.mime.TypedByteArray
    public String toString() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TypedString[");
            sbLIZ.append(new String(getBytes(), "UTF-8"));
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError("Must be able to decode UTF-8");
        }
    }

    public TypedString(String str) {
        super("text/plain; charset=UTF-8", convertToBytes(str), new String[0]);
    }

    public static byte[] convertToBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
