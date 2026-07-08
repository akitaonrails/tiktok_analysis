package com.ss.android.ugc.aweme.creative.compileconfig;

import X.C2188811AlT;
import X.InterfaceC2217461Bqa;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public class BaseCompileConfigParams {
    public static final int $stable = 8;
    public int curPriority;
    public String curStrategyName = "default";
    public String curStage = "common";

    public final int getCurPriority() {
        return this.curPriority;
    }

    public final String getCurStage() {
        return this.curStage;
    }

    public final String getCurStrategyName() {
        return this.curStrategyName;
    }

    public final void setCurPriority(int i) {
        this.curPriority = i;
    }

    public final void setCurStage(String str) {
        this.curStage = str;
    }

    public final void setCurStrategyName(String str) {
        this.curStrategyName = str;
    }

    public final <T> void logInfo(InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t, T t2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\nStrategyName : ");
        sbLIZ.append(getCurStage());
        sbLIZ.append('-');
        sbLIZ.append(getCurStrategyName());
        sbLIZ.append('-');
        sbLIZ.append(getCurPriority());
        sbLIZ.append(" ; \n--- property : ");
        sbLIZ.append(interfaceC2217461Bqa.getName());
        sbLIZ.append(" ; \n------ oldValue : ");
        Intrinsics.LJIILIIL();
        throw null;
    }
}
