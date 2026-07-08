package com.ss.android.ugc.aweme.configuration.models;

import X.AbstractC1153390g7V;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NUJConfig extends AbstractC1153390g7V {

    @C09CT("config")
    public final List<NUAbilityNode> config;

    public NUJConfig() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NUJConfig) && Intrinsics.LJFF(this.config, ((NUJConfig) obj).config);
    }

    public final int hashCode() {
        return this.config.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NUJConfig(config=");
        sbLIZ.append(this.config);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NUJConfig(List<NUAbilityNode> list) {
        this.config = list;
    }

    public NUJConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
