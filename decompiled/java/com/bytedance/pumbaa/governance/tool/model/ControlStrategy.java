package com.bytedance.pumbaa.governance.tool.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pumbaa.governance.tool.api.IControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes14.dex */
public final class ControlStrategy {

    @C09CT("available")
    public boolean available;

    @C09CT("blockEnable")
    public boolean blockEnable;

    @C09CT("hintEnable")
    public boolean hintEnable;

    @C09CT("reportEnable")
    public boolean reportEnable;

    public ControlStrategy() {
        this(true, false, true, true);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ControlStrategy(available=");
        sbLIZ.append(this.available);
        sbLIZ.append(", blockEnable=");
        sbLIZ.append(this.blockEnable);
        sbLIZ.append(", hintEnable=");
        sbLIZ.append(this.hintEnable);
        sbLIZ.append(", reportEnable=");
        sbLIZ.append(this.reportEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(boolean z) {
        ((IControlService) ServiceManager.get().getService(IControlService.class)).LJ();
        return z;
    }

    public ControlStrategy(boolean z, boolean z2, boolean z3, boolean z4) {
        this.available = z;
        this.blockEnable = z2;
        this.hintEnable = z3;
        this.reportEnable = z4;
    }
}
