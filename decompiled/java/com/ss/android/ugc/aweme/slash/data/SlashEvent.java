package com.ss.android.ugc.aweme.slash.data;

import X.AbstractC1186480gys;
import X.C09CT;
import X.C1180330gox;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashEvent extends AbstractC1186480gys implements Serializable {
    public static final C1180330gox Companion = new Object() { // from class: X.0gox
    };

    @C09CT("actions")
    public final List<SlashEventAction> actions;

    @C09CT("name")
    public final String name;

    public SlashEvent() {
        this(null, null);
    }

    public final SlashEvent copy(String str, List<SlashEventAction> list) {
        return new SlashEvent(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashEvent)) {
            return false;
        }
        SlashEvent slashEvent = (SlashEvent) obj;
        return Intrinsics.LJFF(this.name, slashEvent.name) && Intrinsics.LJFF(this.actions, slashEvent.actions);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SlashEventAction> list = this.actions;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashEvent(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.actions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1186480gys
    public String getEventName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public final List<SlashEventAction> getActions() {
        return this.actions;
    }

    public final String getName() {
        return this.name;
    }

    public SlashEvent(String str, List<SlashEventAction> list) {
        this.name = str;
        this.actions = list;
    }
}
