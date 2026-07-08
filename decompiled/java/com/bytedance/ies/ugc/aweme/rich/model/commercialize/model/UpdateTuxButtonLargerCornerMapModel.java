package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateTuxButtonLargerCornerMapModel implements Serializable {

    @C09CT("cta_button")
    public final boolean ctaButton;

    @C09CT("native_end_layer")
    public final boolean nativeEndLayer;

    public UpdateTuxButtonLargerCornerMapModel() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTuxButtonLargerCornerMapModel)) {
            return false;
        }
        UpdateTuxButtonLargerCornerMapModel updateTuxButtonLargerCornerMapModel = (UpdateTuxButtonLargerCornerMapModel) obj;
        return this.ctaButton == updateTuxButtonLargerCornerMapModel.ctaButton && this.nativeEndLayer == updateTuxButtonLargerCornerMapModel.nativeEndLayer;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.ctaButton) * 31) + C786410Ut5.Z2(this.nativeEndLayer);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateTuxButtonLargerCornerMapModel(ctaButton=");
        sbLIZ.append(this.ctaButton);
        sbLIZ.append(", nativeEndLayer=");
        sbLIZ.append(this.nativeEndLayer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpdateTuxButtonLargerCornerMapModel(boolean z, boolean z2) {
        this.ctaButton = z;
        this.nativeEndLayer = z2;
    }
}
