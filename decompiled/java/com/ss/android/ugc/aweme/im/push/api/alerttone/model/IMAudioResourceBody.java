package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IMAudioResourceBody {

    @C09CT("entries")
    public final List<IMAudioResourceBodyEntry> entries;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMAudioResourceBody) && Intrinsics.LJFF(this.entries, ((IMAudioResourceBody) obj).entries);
    }

    public final int hashCode() {
        return this.entries.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAudioResourceBody(entries=");
        sbLIZ.append(this.entries);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMAudioResourceBody() {
        this(new ArrayList());
    }

    public IMAudioResourceBody(List<IMAudioResourceBodyEntry> list) {
        this.entries = list;
    }
}
