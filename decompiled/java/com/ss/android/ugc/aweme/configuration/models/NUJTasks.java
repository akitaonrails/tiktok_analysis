package com.ss.android.ugc.aweme.configuration.models;

import X.AbstractC1153390g7V;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NUJTasks extends AbstractC1153390g7V {

    @C09CT("tasks")
    public final List<NUAbilityNode> tasks;

    public NUJTasks() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NUJTasks) && Intrinsics.LJFF(this.tasks, ((NUJTasks) obj).tasks);
    }

    public final int hashCode() {
        return this.tasks.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NUJTasks(tasks=");
        sbLIZ.append(this.tasks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NUJTasks(List<NUAbilityNode> list) {
        this.tasks = list;
    }

    public NUJTasks(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
