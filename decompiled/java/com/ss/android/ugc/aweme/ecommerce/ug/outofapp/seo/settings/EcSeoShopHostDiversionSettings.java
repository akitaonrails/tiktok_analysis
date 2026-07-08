package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.settings;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcSeoShopHostDiversionSettings {
    public static final CommonPathConfig LIZ = new CommonPathConfig(null, 1, null);

    public static final class CommonPathConfig {

        @C09CT("map_pattern")
        public Map<String, String> map;

        public CommonPathConfig() {
            this(null, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommonPathConfig) && Intrinsics.LJFF(this.map, ((CommonPathConfig) obj).map);
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CommonPathConfig(map=");
            sbLIZ.append(this.map);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CommonPathConfig(Map<String, String> map) {
            this.map = map;
        }

        public final void setMap(Map<String, String> map) {
            this.map = map;
        }

        public CommonPathConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("/us", "/shop"), new Pair("/sg", "/shop"), new Pair("/my", "/shop"), new Pair("/jp", "/shop"), new Pair("/vn", "/shop"), new Pair("/th", "/shop"), new Pair("/ph", "/shop"), new Pair("/mx", "/shop"), new Pair("/sa", "/shop"), new Pair("/br", "/shop"), new Pair("/gb", "/shop"), new Pair("/ie", "/shop"), new Pair("/es", "/shop"), new Pair("/de", "/shop"), new Pair("/it", "/shop"), new Pair("/fr", "/shop")) : map);
        }
    }
}
