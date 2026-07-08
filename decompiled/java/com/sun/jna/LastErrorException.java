package com.sun.jna;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class LastErrorException extends RuntimeException {
    public static final long serialVersionUID = 1;
    public int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    public LastErrorException(String str) {
        super(parseMessage(str.trim()));
        try {
            this.errorCode = CastIntegerProtector.parseInt(str.startsWith(e3.e) ? str.substring(1, str.indexOf(e3.f)) : str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            this.errorCode = -1;
        }
    }

    public static String formatMessage(int i) {
        StringBuilder sbLIZ;
        String str;
        if (Platform.isWindows()) {
            sbLIZ = C2188811AlT.LIZ();
            str = "GetLastError() returned ";
        } else {
            sbLIZ = C2188811AlT.LIZ();
            str = "errno was ";
        }
        sbLIZ.append(str);
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String parseMessage(String str) {
        try {
            return formatMessage(CastIntegerProtector.parseInt(str));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public LastErrorException(int i) {
        this(i, formatMessage(i));
    }

    public LastErrorException(int i, String str) {
        super(str);
        this.errorCode = i;
    }
}
