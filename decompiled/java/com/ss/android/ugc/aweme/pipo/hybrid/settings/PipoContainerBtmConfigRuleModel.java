package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerBtmConfigRuleModel {

    @C09CT("btm")
    public final String btm;

    @C09CT("patterns")
    public final List<String> patterns;

    public PipoContainerBtmConfigRuleModel() {
        this(null, null);
    }

    public PipoContainerBtmConfigRuleModel(String str, List<String> list) {
        this.btm = str;
        this.patterns = list;
    }
}
