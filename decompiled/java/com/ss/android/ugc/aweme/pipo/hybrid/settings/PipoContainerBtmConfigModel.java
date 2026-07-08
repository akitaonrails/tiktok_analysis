package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoContainerBtmConfigModel {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("rules")
    public final List<PipoContainerBtmConfigRuleModel> rules;

    public PipoContainerBtmConfigModel() {
        this(Boolean.FALSE, null);
    }

    public PipoContainerBtmConfigModel(Boolean bool, List<PipoContainerBtmConfigRuleModel> list) {
        this.enable = bool;
        this.rules = list;
    }
}
