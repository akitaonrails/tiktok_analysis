package com.bytedance.pumbaa.hybrid.governance.api;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class BaseGovernanceModel {

    @C09CT("__audit_meta__")
    public final Map<String, String> auditMeta;

    @C09CT("block_enable")
    public boolean blockEnable;

    @C09CT("enable")
    public boolean enable;

    @C09CT("hint_enable")
    public boolean hintEnable;

    @C09CT("report_enable")
    public boolean reportEnable;

    public BaseGovernanceModel() {
        this(null, false, false, false, false);
    }

    public BaseGovernanceModel(Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4) {
        this.auditMeta = map;
        this.enable = z;
        this.blockEnable = z2;
        this.reportEnable = z3;
        this.hintEnable = z4;
    }
}
