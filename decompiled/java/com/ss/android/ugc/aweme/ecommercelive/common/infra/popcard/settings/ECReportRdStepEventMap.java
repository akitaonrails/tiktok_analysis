package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ECReportRdStepEventMap {

    @C09CT("enable")
    public Boolean enable;

    @C09CT("step_list")
    public List<String> stepList;

    public ECReportRdStepEventMap() {
        this(Boolean.FALSE, null);
    }

    public ECReportRdStepEventMap(Boolean bool, List<String> list) {
        this.enable = bool;
        this.stepList = list;
    }
}
