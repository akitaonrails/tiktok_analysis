package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class EcSearchPassThroughInterventionModel {

    @C09CT("enable")
    public final int enable;

    @C09CT("white_list")
    public final List<String> whiteList;

    public EcSearchPassThroughInterventionModel() {
        this(1, C1697810uHb.LJIIJJI("intervention_type", "task_id_list", "active_strategy_id_list", "strategy_id_list", "resource_id_list"));
    }

    public EcSearchPassThroughInterventionModel(int i, List<String> list) {
        this.enable = i;
        this.whiteList = list;
    }
}
