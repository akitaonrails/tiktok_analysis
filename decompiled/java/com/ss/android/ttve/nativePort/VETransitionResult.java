package com.ss.android.ttve.nativePort;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class VETransitionResult {
    public int duration;
    public int transitionsType;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransitionResult{transitionsType=");
        sbLIZ.append(this.transitionsType);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
