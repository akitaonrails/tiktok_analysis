package com.ss.android.ugc.aweme.lifeguard;

import X.C2188811AlT;
import X.C805380Via;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class LifeguardTester {
    public static String REPORT_LOG_TYPE = "LaunchProtectException";
    public static byte defaultByteValue = 97;
    public static char defaultCharValue = 'a';
    public static double defaultDoubleValue = 1.0d;
    public static float defaultFloatValue = 1.0f;
    public static int defaultIntValue = 1;
    public static long defaultLongValue = 1;
    public static short defaultShortValue = 1;
    public static String defaultStringValue = "string";
    public static String testMultiArgs = "testMultiArgs";

    public static void testConditionalJudgment() {
        if (!testMultiArgs.equals(testMultiArgs(100, 100L, 100.0f, 100.0d, null))) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard judges null, and successfully modified the return value"));
        }
        if (testMultiArgs.equals(testMultiArgs(100, 100L, 100.0f, 100.0d, "test_multi_args_fun"))) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException(" lifeguard judges non-null, no need for guard, no need to modify return value."));
        }
        try {
            testCrash(null);
            String str = REPORT_LOG_TYPE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("test crash return value");
            sbLIZ.append((String) null);
            C805380Via.LJFF(str, "LifeguardProtect", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("testCrash exception", th));
        }
        try {
            testCrashProtectByModifyArgs(null);
            String str2 = REPORT_LOG_TYPE;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("testCrashProtectByModifyArgs return value");
            sbLIZ2.append((String) null);
            C805380Via.LJFF(str2, "LifeguardProtect", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2)));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("testCrashProtectByModifyArgs exception", th2));
        }
    }

    public static boolean testReturnBool() {
        System.err.println("this is a return bool fun");
        return false;
    }

    public static byte testReturnByte() {
        System.err.println("this is a return byte fun");
        return defaultByteValue;
    }

    public static char testReturnChar() {
        System.err.println("this is a return char fun");
        return defaultCharValue;
    }

    public static double testReturnDouble() {
        System.err.println("this is return double fun");
        return defaultDoubleValue;
    }

    public static float testReturnFloat() {
        System.err.println("this is return float fun");
        return defaultFloatValue;
    }

    public static int testReturnInt() {
        System.err.println("this is a return int fun");
        return defaultIntValue;
    }

    public static long testReturnLong() {
        System.err.println("this is return long fun");
        return defaultLongValue;
    }

    public static short testReturnShort() {
        System.err.println("this is a return short fun");
        return defaultShortValue;
    }

    public static String testReturnString() {
        System.err.println("this is return string fun");
        return defaultStringValue;
    }

    public static void testReturnVoid() {
        System.err.println("this is a return void fun");
    }

    public static void testUnconditional() {
        testReturnVoid();
        if (testReturnBool()) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change bool type return to true success"));
        }
        if (testReturnChar() != defaultCharValue) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change char type return value success"));
        }
        if (testReturnByte() != defaultByteValue) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change byte type default return value success"));
        }
        if (testReturnShort() != defaultShortValue) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change short type default return value success"));
        }
        if (testReturnInt() != defaultIntValue) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change int type default return value success"));
        }
        if (!areEqual(testReturnFloat(), defaultFloatValue)) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change float type default return value success"));
        }
        if (testReturnLong() != defaultLongValue) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change long type default return value success"));
        }
        if (!areEqual(testReturnDouble(), defaultDoubleValue)) {
            C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change double type default return value success"));
        }
        if (defaultStringValue.equals(testReturnString())) {
            return;
        }
        C805380Via.LJFF(REPORT_LOG_TYPE, "LifeguardProtect", new RuntimeException("lifeguard change string type default return value success"));
    }

    public static void doTest() {
        testConditionalJudgment();
    }

    public static String testCrash(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("param is empty or null");
    }

    public static String testCrashProtectByModifyArgs(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("param is empty or null");
    }

    public static boolean areEqual(double d, double d2) {
        if (Math.abs(d - d2) < 1.0E-6d) {
            return true;
        }
        return false;
    }

    public static boolean areEqual(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-6f) {
            return true;
        }
        return false;
    }

    public static String testMultiArgs(int i, long j, float f, double d, String str) {
        return testMultiArgs;
    }
}
