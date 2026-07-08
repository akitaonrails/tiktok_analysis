package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C1200504mp;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SkylightFoldConfig implements Serializable {
    public static final C1200504mp Companion = new Object() { // from class: X.04mp
    };

    @C09CT("fold_strategy")
    public final int foldStrategy;

    @C09CT("fold_strategy_event_tracking_fields")
    public final Map<String, String> foldStrategyEventTrackingFields;

    public SkylightFoldConfig() {
        this(0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightFoldConfig)) {
            return false;
        }
        SkylightFoldConfig skylightFoldConfig = (SkylightFoldConfig) obj;
        return this.foldStrategy == skylightFoldConfig.foldStrategy && Intrinsics.LJFF(this.foldStrategyEventTrackingFields, skylightFoldConfig.foldStrategyEventTrackingFields);
    }

    public int hashCode() {
        int i = this.foldStrategy * 31;
        Map<String, String> map = this.foldStrategyEventTrackingFields;
        return i + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightFoldConfig(foldStrategy=");
        sbLIZ.append(this.foldStrategy);
        sbLIZ.append(", foldStrategyEventTrackingFields=");
        sbLIZ.append(this.foldStrategyEventTrackingFields);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SkylightFoldConfig(int i, Map<String, String> map) {
        this.foldStrategy = i;
        this.foldStrategyEventTrackingFields = map;
    }
}
