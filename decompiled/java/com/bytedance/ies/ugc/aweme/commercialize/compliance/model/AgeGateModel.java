package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class AgeGateModel implements Serializable {

    @C09CT("display_age_gate")
    public Boolean displayAgeGate;

    public AgeGateModel() {
        this(Boolean.FALSE);
    }

    public final Boolean getDisplayAgeGate() {
        return this.displayAgeGate;
    }

    public AgeGateModel(Boolean bool) {
        this.displayAgeGate = bool;
    }

    public final void setDisplayAgeGate(Boolean bool) {
        this.displayAgeGate = bool;
    }
}
