package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ActionEntryDoc {

    @C09CT("no_history_items")
    public final List<Object> noHistoryItems;

    public ActionEntryDoc() {
        this(null, 1, null);
    }

    public final int hashCode() {
        return this.noHistoryItems.hashCode();
    }

    public ActionEntryDoc(List<Object> list) {
        this.noHistoryItems = list;
    }

    public ActionEntryDoc(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
