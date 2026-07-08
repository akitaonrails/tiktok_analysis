package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomCheckoutFingerprintUserAgentCollectionModel {

    @C09CT("enable_collection")
    public final boolean enableCollection;

    @C09CT("enable_track")
    public final boolean enableTrack;

    public EcomCheckoutFingerprintUserAgentCollectionModel() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomCheckoutFingerprintUserAgentCollectionModel)) {
            return false;
        }
        EcomCheckoutFingerprintUserAgentCollectionModel ecomCheckoutFingerprintUserAgentCollectionModel = (EcomCheckoutFingerprintUserAgentCollectionModel) obj;
        return this.enableCollection == ecomCheckoutFingerprintUserAgentCollectionModel.enableCollection && this.enableTrack == ecomCheckoutFingerprintUserAgentCollectionModel.enableTrack;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableCollection) * 31) + C786410Ut5.Z2(this.enableTrack);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomCheckoutFingerprintUserAgentCollectionModel(enableCollection=");
        sbLIZ.append(this.enableCollection);
        sbLIZ.append(", enableTrack=");
        sbLIZ.append(this.enableTrack);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomCheckoutFingerprintUserAgentCollectionModel(boolean z, boolean z2) {
        this.enableCollection = z;
        this.enableTrack = z2;
    }
}
