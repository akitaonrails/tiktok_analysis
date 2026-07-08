package com.ss.android.ugc.aweme.pitaya.experiment;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PitayaAbSettingsPsmConfig {

    @C09CT("content")
    public final n pitayaAbSettings;

    public PitayaAbSettingsPsmConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PitayaAbSettingsPsmConfig) && Intrinsics.LJFF(this.pitayaAbSettings, ((PitayaAbSettingsPsmConfig) obj).pitayaAbSettings);
    }

    public int hashCode() {
        n nVar = this.pitayaAbSettings;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PitayaAbSettingsPsmConfig(pitayaAbSettings=");
        sbLIZ.append(this.pitayaAbSettings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PitayaAbSettingsPsmConfig(n nVar) {
        this.pitayaAbSettings = nVar;
    }
}
