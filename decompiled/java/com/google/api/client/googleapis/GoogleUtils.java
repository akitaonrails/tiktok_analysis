package com.google.api.client.googleapis;

import X.C786410Ut5;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes4.dex */
public final class GoogleUtils {
    public static final String LIZ;
    public static final Integer LIZIZ;
    public static final Integer LIZJ;

    static {
        InputStream inputStreamLJLLI;
        String property = null;
        try {
            inputStreamLJLLI = C786410Ut5.LJLLI(GoogleUtils.class, "google-api-client.properties");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (inputStreamLJLLI != null) {
            try {
                Properties properties = new Properties();
                properties.load(inputStreamLJLLI);
                property = properties.getProperty("google-api-client.version");
                inputStreamLJLLI.close();
                if (property == null) {
                }
                LIZ = property;
                Matcher matcher = PatternProtector.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?").matcher(property);
                matcher.find();
                LIZIZ = Integer.valueOf(CastIntegerProtector.parseInt(matcher.group(1)));
                LIZJ = Integer.valueOf(CastIntegerProtector.parseInt(matcher.group(2)));
                CastIntegerProtector.parseInt(matcher.group(3));
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        if (th != null) {
                            try {
                                inputStreamLJLLI.close();
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                th.addSuppressed(th3);
                            }
                        } else {
                            inputStreamLJLLI.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        property = "unknown-version";
        LIZ = property;
        Matcher matcher2 = PatternProtector.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?").matcher(property);
        matcher2.find();
        LIZIZ = Integer.valueOf(CastIntegerProtector.parseInt(matcher2.group(1)));
        LIZJ = Integer.valueOf(CastIntegerProtector.parseInt(matcher2.group(2)));
        CastIntegerProtector.parseInt(matcher2.group(3));
    }
}
