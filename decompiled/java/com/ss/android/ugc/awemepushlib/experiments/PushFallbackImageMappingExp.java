package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PushFallbackImageMappingExp {
    public static final Config LIZ = new Config(null, null, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(582));

    public static final class Config {

        @C09CT("disable_avatar_fallback")
        public final boolean disableAvatarFallback;

        @C09CT("left_avatar_res")
        public final String leftAvatarRes;

        @C09CT("right_fallback_by_item_type")
        public final Map<String, String> rightFallbackByItemType;

        public Config() {
            this(null, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Intrinsics.LJFF(this.rightFallbackByItemType, config.rightFallbackByItemType) && Intrinsics.LJFF(this.leftAvatarRes, config.leftAvatarRes) && this.disableAvatarFallback == config.disableAvatarFallback;
        }

        public final int hashCode() {
            Map<String, String> map = this.rightFallbackByItemType;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            String str = this.leftAvatarRes;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.disableAvatarFallback);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(rightFallbackByItemType=");
            sbLIZ.append(this.rightFallbackByItemType);
            sbLIZ.append(", leftAvatarRes=");
            sbLIZ.append(this.leftAvatarRes);
            sbLIZ.append(", disableAvatarFallback=");
            sbLIZ.append(this.disableAvatarFallback);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(Map<String, String> map, String str, boolean z) {
            this.rightFallbackByItemType = map;
            this.leftAvatarRes = str;
            this.disableAvatarFallback = z;
        }
    }
}
