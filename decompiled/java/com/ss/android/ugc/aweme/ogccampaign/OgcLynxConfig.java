package com.ss.android.ugc.aweme.ogccampaign;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OgcLynxConfig {

    @C09CT("ogc_lynx_initial_data_load")
    public final List<OgcLynxActivityItem> lynxActivities;

    @C09CT("scene_key")
    public final String sceneKey;

    public OgcLynxConfig() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgcLynxConfig)) {
            return false;
        }
        OgcLynxConfig ogcLynxConfig = (OgcLynxConfig) obj;
        return Intrinsics.LJFF(this.sceneKey, ogcLynxConfig.sceneKey) && Intrinsics.LJFF(this.lynxActivities, ogcLynxConfig.lynxActivities);
    }

    public final int hashCode() {
        return (this.sceneKey.hashCode() * 31) + this.lynxActivities.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OgcLynxConfig(sceneKey=");
        sbLIZ.append(this.sceneKey);
        sbLIZ.append(", lynxActivities=");
        sbLIZ.append(this.lynxActivities);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OgcLynxConfig(String str, List<OgcLynxActivityItem> list) {
        this.sceneKey = str;
        this.lynxActivities = list;
    }

    public OgcLynxConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
