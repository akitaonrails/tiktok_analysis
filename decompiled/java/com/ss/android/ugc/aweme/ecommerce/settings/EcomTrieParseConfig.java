package com.ss.android.ugc.aweme.ecommerce.settings;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomTrieParseConfig {
    public static final Config LIZ;
    public static final Set<String> LIZIZ;

    static {
        Config config = new Config(false, null, 3, null);
        Config config2 = (Config) SettingsManager.LIZLLL().LJIIIIZZ("ecom_resource_trie_parse_config", Config.class, config);
        if (config2 != null) {
            config = config2;
        }
        LIZ = config;
        LIZIZ = C13LP.LLIIJI(config.apiPathAllowList);
    }

    public static final class Config {

        @C09CT("ecom_resource_trie_parse_api_path_allow_list")
        public final List<String> apiPathAllowList;

        @C09CT("ecom_resource_trie_parse_enable")
        public final boolean enable;

        public Config() {
            this(false, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && Intrinsics.LJFF(this.apiPathAllowList, config.apiPathAllowList);
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + this.apiPathAllowList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", apiPathAllowList=");
            sbLIZ.append(this.apiPathAllowList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, List<String> list) {
            this.enable = z;
            this.apiPathAllowList = list;
        }

        public Config(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
