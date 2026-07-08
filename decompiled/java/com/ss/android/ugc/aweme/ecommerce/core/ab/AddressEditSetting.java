package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditSetting {
    public static final AddressEditLocationConfig LIZ = new AddressEditLocationConfig(Boolean.FALSE, Boolean.FALSE);

    public static final class AddressEditLocationConfig {

        @C09CT("location_authorized")
        public final Boolean locationAuthorized;

        @C09CT("request_add_location")
        public final Boolean requestAddLocation;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressEditLocationConfig)) {
                return false;
            }
            AddressEditLocationConfig addressEditLocationConfig = (AddressEditLocationConfig) obj;
            return Intrinsics.LJFF(this.locationAuthorized, addressEditLocationConfig.locationAuthorized) && Intrinsics.LJFF(this.requestAddLocation, addressEditLocationConfig.requestAddLocation);
        }

        public final int hashCode() {
            Boolean bool = this.locationAuthorized;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.requestAddLocation;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AddressEditLocationConfig(locationAuthorized=");
            sbLIZ.append(this.locationAuthorized);
            sbLIZ.append(", requestAddLocation=");
            sbLIZ.append(this.requestAddLocation);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public AddressEditLocationConfig() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public AddressEditLocationConfig(Boolean bool, Boolean bool2) {
            this.locationAuthorized = bool;
            this.requestAddLocation = bool2;
        }
    }

    public static AddressEditLocationConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AddressEditLocationConfig addressEditLocationConfig = LIZ;
        AddressEditLocationConfig addressEditLocationConfig2 = (AddressEditLocationConfig) c0c64LJIILLIIL.LJJII(AddressEditLocationConfig.class, addressEditLocationConfig, "ec_address_edit", true);
        return addressEditLocationConfig2 != null ? addressEditLocationConfig2 : addressEditLocationConfig;
    }
}
