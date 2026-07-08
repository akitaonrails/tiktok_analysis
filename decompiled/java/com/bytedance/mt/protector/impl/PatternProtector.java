package com.bytedance.mt.protector.impl;

import X.C08FE;
import X.C08FG;
import X.C09EU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class PatternProtector extends C08FE<String> {
    public static C08FG protectorType = C08FG.PATTERN;

    public static Pattern compile(String str) {
        if (C09EU.LIZIZ()) {
            try {
                return Pattern.compile(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str2 = (String) C08FE.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return Pattern.compile(str2);
                }
                throw th;
            }
        }
        return Pattern.compile(str);
    }

    public static Pattern compile(String str, int i) {
        if (C09EU.LIZIZ()) {
            try {
                return Pattern.compile(str, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String str2 = (String) C08FE.tryProtect(protectorType, th, String.class);
                if (str2 != null) {
                    return Pattern.compile(str2, i);
                }
                throw th;
            }
        }
        return Pattern.compile(str, i);
    }

    public static boolean matches(String str, CharSequence charSequence) {
        if (C09EU.LIZIZ()) {
            try {
                return Pattern.matches(str, charSequence);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Boolean bool = (Boolean) C08FE.tryProtect(protectorType, th, Boolean.class);
                if (bool != null) {
                    return bool.booleanValue();
                }
                throw th;
            }
        }
        return Pattern.matches(str, charSequence);
    }
}
