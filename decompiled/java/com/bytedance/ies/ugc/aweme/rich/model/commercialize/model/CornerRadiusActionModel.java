package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CornerRadiusActionModel implements Serializable {

    @C09CT("update_tux_button_larger_corner_map")
    public final UpdateTuxButtonLargerCornerMapModel updateTuxButtonLargerCornerMap;

    public CornerRadiusActionModel() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CornerRadiusActionModel) && Intrinsics.LJFF(this.updateTuxButtonLargerCornerMap, ((CornerRadiusActionModel) obj).updateTuxButtonLargerCornerMap);
    }

    public int hashCode() {
        UpdateTuxButtonLargerCornerMapModel updateTuxButtonLargerCornerMapModel = this.updateTuxButtonLargerCornerMap;
        if (updateTuxButtonLargerCornerMapModel == null) {
            return 0;
        }
        return updateTuxButtonLargerCornerMapModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CornerRadiusActionModel(updateTuxButtonLargerCornerMap=");
        sbLIZ.append(this.updateTuxButtonLargerCornerMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CornerRadiusActionModel(UpdateTuxButtonLargerCornerMapModel updateTuxButtonLargerCornerMapModel) {
        this.updateTuxButtonLargerCornerMap = updateTuxButtonLargerCornerMapModel;
    }
}
