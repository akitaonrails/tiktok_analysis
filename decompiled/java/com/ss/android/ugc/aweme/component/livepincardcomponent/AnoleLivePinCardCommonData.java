package com.ss.android.ugc.aweme.component.livepincardcomponent;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class AnoleLivePinCardCommonData implements Serializable {
    public static final int $stable = 0;

    @C09CT("label")
    public final SponsoredLabel label;

    public AnoleLivePinCardCommonData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnoleLivePinCardCommonData) && Intrinsics.LJFF(this.label, ((AnoleLivePinCardCommonData) obj).label);
    }

    public int hashCode() {
        SponsoredLabel sponsoredLabel = this.label;
        if (sponsoredLabel == null) {
            return 0;
        }
        return sponsoredLabel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleLivePinCardCommonData(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnoleLivePinCardCommonData(SponsoredLabel sponsoredLabel) {
        this.label = sponsoredLabel;
    }
}
