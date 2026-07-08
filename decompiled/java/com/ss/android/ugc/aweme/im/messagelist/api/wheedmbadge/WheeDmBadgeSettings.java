package com.ss.android.ugc.aweme.im.messagelist.api.wheedmbadge;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class WheeDmBadgeSettings {
    public static final Config LIZ = new Config(10, 5, 50, "aweme://im/standalone_app_ug2?app_schema_url=snssdk364225%3A%2F%2F%3Fug_launch_category%3Ddiversion%26media_source%3Ddiversion_from_tt_special_tag_dm%26enter_from%3Dchat%26enter_method%3Dclick_whee_dm_message_hint&one_link_url=https%3A%2F%2Fsnssdk364225.onelink.me%2Ftzwf%2Fg0bku1wo&package_name=com.bytedance.snail&enter_from=chat&enter_method=click_whee_dm_message_hint", "com.bytedance.snail", "snssdk364225://");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1704));

    public static final class Config {

        @C09CT("distinct_pair_cap")
        public final int distinctPairCap;

        @C09CT("global_cap")
        public final int globalCap;

        @C09CT("per_pair_cap")
        public final int perPairCap;

        @C09CT("whee_app_scheme")
        public final String wheeAppScheme;

        @C09CT("whee_deep_link")
        public final String wheeDeepLink;

        @C09CT("whee_package_name")
        public final String wheePackageName;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.perPairCap == config.perPairCap && this.distinctPairCap == config.distinctPairCap && this.globalCap == config.globalCap && Intrinsics.LJFF(this.wheeDeepLink, config.wheeDeepLink) && Intrinsics.LJFF(this.wheePackageName, config.wheePackageName) && Intrinsics.LJFF(this.wheeAppScheme, config.wheeAppScheme);
        }

        public final int hashCode() {
            return (((((((((this.perPairCap * 31) + this.distinctPairCap) * 31) + this.globalCap) * 31) + this.wheeDeepLink.hashCode()) * 31) + this.wheePackageName.hashCode()) * 31) + this.wheeAppScheme.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(perPairCap=");
            sbLIZ.append(this.perPairCap);
            sbLIZ.append(", distinctPairCap=");
            sbLIZ.append(this.distinctPairCap);
            sbLIZ.append(", globalCap=");
            sbLIZ.append(this.globalCap);
            sbLIZ.append(", wheeDeepLink=");
            sbLIZ.append(this.wheeDeepLink);
            sbLIZ.append(", wheePackageName=");
            sbLIZ.append(this.wheePackageName);
            sbLIZ.append(", wheeAppScheme=");
            sbLIZ.append(this.wheeAppScheme);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config() {
            this(10, 5, 50, "aweme://im/standalone_app_ug2?app_schema_url=snssdk364225%3A%2F%2F%3Fug_launch_category%3Ddiversion%26media_source%3Ddiversion_from_tt_special_tag_dm%26enter_from%3Dchat%26enter_method%3Dclick_whee_dm_message_hint&one_link_url=https%3A%2F%2Fsnssdk364225.onelink.me%2Ftzwf%2Fg0bku1wo&package_name=com.bytedance.snail&enter_from=chat&enter_method=click_whee_dm_message_hint", "com.bytedance.snail", "snssdk364225://");
        }

        public Config(int i, int i2, int i3, String str, String str2, String str3) {
            this.perPairCap = i;
            this.distinctPairCap = i2;
            this.globalCap = i3;
            this.wheeDeepLink = str;
            this.wheePackageName = str2;
            this.wheeAppScheme = str3;
        }
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }
}
