package com.ss.android.ugc.aweme.tako.ccl.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ActionEntryDoc {

    @C09CT("no_history_items")
    public final List<ActionNoHistoryItem> noHistoryItems;

    public ActionEntryDoc() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionEntryDoc) && Intrinsics.LJFF(this.noHistoryItems, ((ActionEntryDoc) obj).noHistoryItems);
    }

    public final int hashCode() {
        return this.noHistoryItems.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionEntryDoc(noHistoryItems=");
        sbLIZ.append(this.noHistoryItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActionEntryDoc(List<ActionNoHistoryItem> list) {
        this.noHistoryItems = list;
    }

    public ActionEntryDoc(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
