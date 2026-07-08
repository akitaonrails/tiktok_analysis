package com.ss.android.ugc.aweme.ml.feature.events;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EventWithPortraitsOneItem {

    @C09CT("name")
    public String name;

    @C09CT("names")
    public List<String> names;

    @C09CT("portraits")
    public List<String> portraits;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", names=");
        sbLIZ.append(this.names);
        sbLIZ.append(", portraits=");
        sbLIZ.append(this.portraits);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getNames() {
        return this.names;
    }

    public final List<String> getPortraits() {
        return this.portraits;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNames(List<String> list) {
        this.names = list;
    }

    public final void setPortraits(List<String> list) {
        this.portraits = list;
    }
}
