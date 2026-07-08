package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditLocationSetting {
    public static final AddressEditLocationConfig LIZ = new AddressEditLocationConfig(Boolean.FALSE);

    public static final class AddressEditLocationConfig {

        @C09CT("need_precise_location")
        public final Boolean needPreciseLocation;

        public AddressEditLocationConfig() {
            this(Boolean.FALSE);
        }

        public AddressEditLocationConfig(Boolean bool) {
            this.needPreciseLocation = bool;
        }
    }
}
