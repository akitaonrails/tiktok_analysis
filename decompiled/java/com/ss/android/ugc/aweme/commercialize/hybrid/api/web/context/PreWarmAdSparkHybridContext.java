package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context;

import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class PreWarmAdSparkHybridContext extends AdSparkHybridContext {
    public boolean hasPreWarmLoadUrl;
    public String lastPreconnectWebUrl = "";
    public Function1<? super Boolean, Unit> realKitInitParamHandler;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreWarmAdSparkHybridContext[containerId :");
        sbLIZ.append(this.containerId);
        sbLIZ.append(" idHash:");
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJLJLI(AwS595S0100000_16 awS595S0100000_16) {
        this.realKitInitParamHandler = awS595S0100000_16;
    }

    public final void LJJLL(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.realKitInitParamHandler;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.realKitInitParamHandler = null;
    }
}
