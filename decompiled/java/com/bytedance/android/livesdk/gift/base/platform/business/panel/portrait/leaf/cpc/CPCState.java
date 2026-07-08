package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C1252530ihP;
import X.C2188811AlT;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CPCState implements C004I {
    public static final int $stable = 8;
    public final AbstractC1252750ihl<CpcPromptResponse> task;

    public final CPCState copy(AbstractC1252750ihl<CpcPromptResponse> abstractC1252750ihl) {
        return new CPCState(abstractC1252750ihl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CPCState) && Intrinsics.LJFF(this.task, ((CPCState) obj).task);
    }

    public int hashCode() {
        return this.task.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CPCState(task=");
        sbLIZ.append(this.task);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CPCState() {
        this(C1252530ihP.LIZ);
    }

    public final AbstractC1252750ihl<CpcPromptResponse> getTask() {
        return this.task;
    }

    public CPCState(AbstractC1252750ihl<CpcPromptResponse> abstractC1252750ihl) {
        this.task = abstractC1252750ihl;
    }
}
