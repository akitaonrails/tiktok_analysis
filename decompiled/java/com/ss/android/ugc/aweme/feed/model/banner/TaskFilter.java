package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskFilter implements Serializable {

    @C09CT("conditions")
    public final List<ActionCondition> conditions;

    @C09CT("operator")
    public final String operator;

    public TaskFilter() {
        this(null, null);
    }

    public final void prepare() {
        List<ActionCondition> list = this.conditions;
        if (list != null) {
            Iterator<ActionCondition> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().prepare();
            }
        }
    }

    public TaskFilter(String str, List<ActionCondition> list) {
        this.operator = str;
        this.conditions = list;
    }
}
