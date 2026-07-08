package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C1160020gIC;
import X.C2097908Jt;
import X.C452501pT;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class IMImageCacheSizeSetting {
    public static final IMImageCacheSizeSetting LIZ = new IMImageCacheSizeSetting();
    public static final IMImageCacheSizeConfig LIZIZ = new IMImageCacheSizeConfig(null, 1, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1160020gIC());

    public static final class IMImageCacheSizeConfig implements Serializable {

        @C09CT("cache_size_map")
        public final Map<String, Long> cacheSizeMap;

        public IMImageCacheSizeConfig() {
            this(null, 1, null);
        }

        public IMImageCacheSizeConfig(Map<String, Long> map) {
            this.cacheSizeMap = map;
        }

        public IMImageCacheSizeConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C2097908Jt.LIZJ(new Pair("dm_camera", 536870912L)) : map);
        }
    }
}
