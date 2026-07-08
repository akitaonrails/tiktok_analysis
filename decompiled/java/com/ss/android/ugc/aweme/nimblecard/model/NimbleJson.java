package com.ss.android.ugc.aweme.nimblecard.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class NimbleJson {

    @C09CT("description")
    public final String description;

    @C09CT("templates")
    public final List<Template> templates;

    @C09CT("version")
    public final String version;

    public NimbleJson() {
        this(null, null, null, 7, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleJson(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", templates=");
        sbLIZ.append(this.templates);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NimbleJson(String str, String str2, List<Template> list) {
        this.version = str;
        this.description = str2;
        this.templates = list;
    }

    public NimbleJson(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
