package com.bytedance.pitaya.cep_engine;

import X.C2188811AlT;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes21.dex */
public final class CepResult implements CepKeeper {
    public final String bizName;
    public final String error;
    public JSONArray eventsSequences;
    public final String ruleName;
    public final boolean success;
    public final String warnings;

    public final CepResult copy(boolean z, String str, String str2, String str3, String str4, JSONArray jSONArray) {
        return new CepResult(z, str, str2, str3, str4, jSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CepResult)) {
            return false;
        }
        CepResult cepResult = (CepResult) obj;
        return this.success == cepResult.success && Intrinsics.LJFF(this.bizName, cepResult.bizName) && Intrinsics.LJFF(this.ruleName, cepResult.ruleName) && Intrinsics.LJFF(this.error, cepResult.error) && Intrinsics.LJFF(this.warnings, cepResult.warnings) && Intrinsics.LJFF(this.eventsSequences, cepResult.eventsSequences);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((((((r0 * 31) + this.bizName.hashCode()) * 31) + this.ruleName.hashCode()) * 31) + this.error.hashCode()) * 31) + this.warnings.hashCode()) * 31;
        JSONArray jSONArray = this.eventsSequences;
        return iHashCode + (jSONArray == null ? 0 : jSONArray.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CepResult(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", bizName=");
        sbLIZ.append(this.bizName);
        sbLIZ.append(", ruleName=");
        sbLIZ.append(this.ruleName);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", warnings=");
        sbLIZ.append(this.warnings);
        sbLIZ.append(", eventsSequences=");
        sbLIZ.append(this.eventsSequences);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final String getError() {
        return this.error;
    }

    public final JSONArray getEventsSequences() {
        return this.eventsSequences;
    }

    public final String getRuleName() {
        return this.ruleName;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getWarnings() {
        return this.warnings;
    }

    public final void setEventsSequences(JSONArray jSONArray) {
        this.eventsSequences = jSONArray;
    }

    public CepResult(boolean z, String str, String str2, String str3, String str4, JSONArray jSONArray) {
        this.success = z;
        this.bizName = str;
        this.ruleName = str2;
        this.error = str3;
        this.warnings = str4;
        this.eventsSequences = jSONArray;
    }
}
