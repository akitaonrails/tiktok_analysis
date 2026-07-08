package com.ss.android.ugc.aweme.pitaya.experiment;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PitayaBusinessSettingsPsmConfig {

    @C09CT("content")
    public final n content;

    public PitayaBusinessSettingsPsmConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PitayaBusinessSettingsPsmConfig) && Intrinsics.LJFF(this.content, ((PitayaBusinessSettingsPsmConfig) obj).content);
    }

    public int hashCode() {
        n nVar = this.content;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PitayaBusinessSettingsPsmConfig(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PitayaBusinessSettingsPsmConfig(n nVar) {
        this.content = nVar;
    }
}
