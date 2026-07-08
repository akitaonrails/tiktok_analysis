package com.mammon.audiosdk.structures;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.enums.SAMICoreAbConfigType;

/* JADX INFO: loaded from: classes5.dex */
public class SAMICoreAbContext {
    public static volatile SAMICoreAbContext samiCoreABContext;
    public SAMICoreAbCallback callback;

    public static SAMICoreAbContext getInstance() {
        if (samiCoreABContext == null) {
            synchronized (SAMICoreAbContext.class) {
                try {
                    if (samiCoreABContext == null) {
                        samiCoreABContext = new SAMICoreAbContext();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return samiCoreABContext;
    }

    public static Boolean abConfigGettingBool(String str) {
        System.out.println("[mammon] SAMI AB Config, abConfigGettingBool()");
        return getInstance().callback.getSAMICoreAbBoolConfig(str);
    }

    public static Float abConfigGettingFloat(String str) {
        System.out.println("[mammon] SAMI AB Config, abConfigGettingFloat()");
        return getInstance().callback.getSAMICoreAbFloatConfig(str);
    }

    public static Integer abConfigGettingInt(String str) {
        System.out.println("[mammon] SAMI AB Config, abConfigGettingInt()");
        return getInstance().callback.getSAMICoreAbIntConfig(str);
    }

    public static String abConfigGettingString(String str) {
        System.out.println("[mammon] SAMI AB Config, abConfigGettingString()");
        return getInstance().callback.getSAMICoreAbStringConfig(str);
    }

    public void init(SAMICoreAbCallback sAMICoreAbCallback) {
        this.callback = sAMICoreAbCallback;
    }

    public static Object abConfigGetting(String str, int i) {
        System.out.println("[mammon] SAMI AB Config, abConfigGetting()");
        return getInstance().callback.getSAMICoreAbConfig(str, SAMICoreAbConfigType.fromInt(i));
    }
}
