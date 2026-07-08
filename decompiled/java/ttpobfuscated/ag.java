package ttpobfuscated;

import X.C13LE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes4.dex */
public final class ag {
    public static final String a(Throwable th) {
        String localizedMessage;
        try {
            String localizedMessage2 = th.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "";
            }
            if (localizedMessage2.length() == 0) {
                if (th.getCause() != null) {
                    Throwable cause = th.getCause();
                    String localizedMessage3 = cause.getLocalizedMessage();
                    if (localizedMessage3 == null) {
                        localizedMessage3 = "";
                    }
                    if (localizedMessage3.length() == 0) {
                        String strLIZLLL = C13LE.LIZ(cause.getClass()).LIZLLL();
                        if (strLIZLLL == null) {
                            strLIZLLL = "";
                        }
                        if (strLIZLLL.length() != 0) {
                            localizedMessage = C13LE.LIZ(cause.getClass()).LIZLLL();
                            if (localizedMessage == null) {
                                return "";
                            }
                        } else {
                            return "Unknown reason";
                        }
                    } else {
                        localizedMessage = cause.getLocalizedMessage();
                        if (localizedMessage == null) {
                            return "";
                        }
                    }
                } else {
                    String strLIZLLL2 = C13LE.LIZ(th.getClass()).LIZLLL();
                    if (strLIZLLL2 == null) {
                        strLIZLLL2 = "";
                    }
                    if (strLIZLLL2.length() != 0) {
                        localizedMessage = C13LE.LIZ(th.getClass()).LIZLLL();
                        if (localizedMessage == null) {
                            return "";
                        }
                    } else {
                        return "Unknown reason";
                    }
                }
            } else {
                localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    return "";
                }
            }
            return localizedMessage;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            q3.a.getClass();
            q3.a.c.b("Exception while generating Throwable error message: ", "ThrowableUtils", th2);
            return "Unknown reason";
        }
    }
}
