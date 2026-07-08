package com.bytedance.hybrid.spark.raven.data;

import X.AbstractC1258404wA;
import X.C09CT;
import X.C1258304w9;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RavenEvent extends AbstractC1258404wA implements Serializable {
    public static final C1258304w9 Companion = new Object() { // from class: X.04w9
    };

    @C09CT("actions")
    public final List<RavenEventAction> actions;

    @C09CT("name")
    public final String name;

    public RavenEvent() {
        this(null, null);
    }

    public final RavenEvent copy(String str, List<RavenEventAction> list) {
        return new RavenEvent(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RavenEvent)) {
            return false;
        }
        RavenEvent ravenEvent = (RavenEvent) obj;
        return Intrinsics.LJFF(this.name, ravenEvent.name) && Intrinsics.LJFF(this.actions, ravenEvent.actions);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RavenEventAction> list = this.actions;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenEvent(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.actions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1258404wA
    public String getEventName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public final List<RavenEventAction> getActions() {
        return this.actions;
    }

    public final String getName() {
        return this.name;
    }

    public RavenEvent(String str, List<RavenEventAction> list) {
        this.name = str;
        this.actions = list;
    }
}
