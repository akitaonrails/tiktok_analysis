package com.ss.android.ugc.aweme.settings;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import X.C850170XWt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ClearLoginCredentialsSettings {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C850170XWt());
    public static final ClearLoginCredentialsDefaultConfig LIZIZ = new ClearLoginCredentialsDefaultConfig(null, null, 0, false, 15, null);

    public static final class ClearLoginCredentialsDefaultConfig {

        @C09CT("always_clear")
        public final boolean alwaysClear;

        @C09CT("config_version")
        public final int configVersion;

        @C09CT("login_type")
        public final List<String> loginType;

        @C09CT("platforms")
        public final List<String> platforms;

        public ClearLoginCredentialsDefaultConfig() {
            this(null, null, 0, false, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClearLoginCredentialsDefaultConfig)) {
                return false;
            }
            ClearLoginCredentialsDefaultConfig clearLoginCredentialsDefaultConfig = (ClearLoginCredentialsDefaultConfig) obj;
            return Intrinsics.LJFF(this.loginType, clearLoginCredentialsDefaultConfig.loginType) && Intrinsics.LJFF(this.platforms, clearLoginCredentialsDefaultConfig.platforms) && this.configVersion == clearLoginCredentialsDefaultConfig.configVersion && this.alwaysClear == clearLoginCredentialsDefaultConfig.alwaysClear;
        }

        public ClearLoginCredentialsDefaultConfig(List<String> list, List<String> list2, int i, boolean z) {
            this.loginType = list;
            this.platforms = list2;
            this.configVersion = i;
            this.alwaysClear = z;
        }

        public ClearLoginCredentialsDefaultConfig(List list, List list2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z);
        }
    }
}
