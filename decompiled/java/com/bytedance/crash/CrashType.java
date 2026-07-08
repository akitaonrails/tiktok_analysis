package com.bytedance.crash;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    NATIVE_CUSTOMIZE("ensure_zip"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    GAME("game"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    CJAVA("cjava"),
    COREDUMP("coredump"),
    EVENT("event"),
    ALL("all"),
    UNKNOWN("unknown");

    public final String mName;

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }

    public String getName() {
        return this.mName;
    }

    public static CrashType getType(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return UNKNOWN;
        }
    }

    public static CrashType valueOf(String str) {
        return (CrashType) C08FF.LIZ(CrashType.class, str);
    }

    CrashType(String str) {
        this.mName = str;
    }
}
