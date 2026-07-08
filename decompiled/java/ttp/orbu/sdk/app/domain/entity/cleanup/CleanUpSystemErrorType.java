package ttp.orbu.sdk.app.domain.entity.cleanup;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum CleanUpSystemErrorType {
    DeleteDatabase(1),
    ClearConfigPreferences(2),
    CancelActiveCoroutines(3),
    ResetGeneralConfig(4),
    ResetOrbucodeConfig(5),
    ClearRuntime(6),
    CleanOldComponentInstance(6),
    CleanNewComponentInstance(7),
    ClearCrashLogPreferences(8),
    Unknown(153);

    public final short value;

    public static CleanUpSystemErrorType valueOf(String str) {
        return (CleanUpSystemErrorType) C08FF.LIZ(CleanUpSystemErrorType.class, str);
    }

    public final short getValue() {
        return this.value;
    }

    CleanUpSystemErrorType(short s) {
        this.value = s;
    }
}
