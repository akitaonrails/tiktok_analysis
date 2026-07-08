package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C1920907fj;
import X.C2097608Jq;
import X.C452501pT;
import X.EnumC1981007pQ;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class EcMobSpliceCheckNetworkInterceptConfigV2 {
    public static final Map<String, Object> LIZ = C2097608Jq.LJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1920907fj());

    public static InterceptConfig LIZ(String str) {
        Map map;
        if (str == null || (map = (Map) LIZIZ.getValue()) == null) {
            return null;
        }
        return (InterceptConfig) map.get(str);
    }

    public static final class CacheKeyEntity {

        @C09CT("source")
        public final int cacheKeySource;

        @C09CT("cache_key_paths")
        public final List<String> path;

        public CacheKeyEntity() {
            this(null, 0, 3, null);
        }

        public CacheKeyEntity(List<String> list, int i) {
            this.path = list;
            this.cacheKeySource = i;
        }

        public CacheKeyEntity(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? EnumC1981007pQ.BODY.getValue() : i);
        }
    }

    public static final class InterceptConfig {

        @C09CT("cache_key_entities")
        public final List<CacheKeyEntity> cacheKeyEntities;

        @C09CT("path")
        public String path;

        public InterceptConfig() {
            this(null, null, 3, null);
        }

        public InterceptConfig(String str, List<CacheKeyEntity> list) {
            this.path = str;
            this.cacheKeyEntities = list;
        }

        public InterceptConfig(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
