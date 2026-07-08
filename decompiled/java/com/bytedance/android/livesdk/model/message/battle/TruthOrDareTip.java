package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class TruthOrDareTip {

    @C09CT("tip_content")
    public String tipContent;

    @C09CT("tip_type")
    public String tipType;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TruthOrDareTip(tipType=");
        sbLIZ.append(this.tipType);
        sbLIZ.append(", tipContent=");
        sbLIZ.append(this.tipContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
