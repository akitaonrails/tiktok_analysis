package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes15.dex */
public final class SessionScopeConfig {

    @C09CT("debug_delay_ms")
    public final long debugDelayMs;

    @C09CT("enable_auto_login_on_invalid_session")
    public final boolean enableAutoLoginOnInvalidSession;

    @C09CT("enable_response_uid_validation")
    public final boolean enableResponseUidValidation;

    @C09CT("enable_session_scope")
    public final boolean enableSessionScope;

    @C09CT("enable_session_uid_validation")
    public final boolean enableSessionUidValidation;

    @C09CT("skip_cursor_validation")
    public final boolean skipCursorValidation;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionScopeConfig)) {
            return false;
        }
        SessionScopeConfig sessionScopeConfig = (SessionScopeConfig) obj;
        return this.enableSessionScope == sessionScopeConfig.enableSessionScope && this.skipCursorValidation == sessionScopeConfig.skipCursorValidation && this.enableResponseUidValidation == sessionScopeConfig.enableResponseUidValidation && this.enableSessionUidValidation == sessionScopeConfig.enableSessionUidValidation && this.enableAutoLoginOnInvalidSession == sessionScopeConfig.enableAutoLoginOnInvalidSession && this.debugDelayMs == sessionScopeConfig.debugDelayMs;
    }

    public int hashCode() {
        return (((((((((C786410Ut5.Z2(this.enableSessionScope) * 31) + C786410Ut5.Z2(this.skipCursorValidation)) * 31) + C786410Ut5.Z2(this.enableResponseUidValidation)) * 31) + C786410Ut5.Z2(this.enableSessionUidValidation)) * 31) + C786410Ut5.Z2(this.enableAutoLoginOnInvalidSession)) * 31) + C786410Ut5.Y2(this.debugDelayMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionScopeConfig(enableSessionScope=");
        sbLIZ.append(this.enableSessionScope);
        sbLIZ.append(", skipCursorValidation=");
        sbLIZ.append(this.skipCursorValidation);
        sbLIZ.append(", enableResponseUidValidation=");
        sbLIZ.append(this.enableResponseUidValidation);
        sbLIZ.append(", enableSessionUidValidation=");
        sbLIZ.append(this.enableSessionUidValidation);
        sbLIZ.append(", enableAutoLoginOnInvalidSession=");
        sbLIZ.append(this.enableAutoLoginOnInvalidSession);
        sbLIZ.append(", debugDelayMs=");
        sbLIZ.append(this.debugDelayMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SessionScopeConfig() {
        this(false, false, false, false, false, 0L);
    }

    public SessionScopeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        this.enableSessionScope = z;
        this.skipCursorValidation = z2;
        this.enableResponseUidValidation = z3;
        this.enableSessionUidValidation = z4;
        this.enableAutoLoginOnInvalidSession = z5;
        this.debugDelayMs = j;
    }
}
