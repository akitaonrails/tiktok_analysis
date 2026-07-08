package com.ss.android.ugc.aweme.poi.detail.container.newarchi.cache;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailDataCacheExp {
    public static final CacheKey LIZ = new CacheKey(0, null, 0, 0, null, null, 0, 127, null);

    public static CacheKey LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CacheKey cacheKey = LIZ;
        CacheKey cacheKey2 = (CacheKey) c0c64LJIILLIIL.LJJII(CacheKey.class, cacheKey, "poi_detail_page_data_cache_exp", false);
        return cacheKey2 != null ? cacheKey2 : cacheKey;
    }

    public static final class CacheKey {

        @C09CT("cache_capacity")
        public final int cacheCapacity;

        @C09CT("cache_instance_ids")
        public final List<String> cacheInstanceIds;

        @C09CT("cache_type")
        public final List<String> cacheType;

        @C09CT("enable")
        public final int enable;

        @C09CT("expire_time")
        public final int expireTime;

        @C09CT("industry")
        public final List<String> industries;

        @C09CT("rm_redundant_component")
        public final int rmRedundantComponent;

        public CacheKey() {
            this(0, null, 0, 0, null, null, 0, 127, null);
        }

        public CacheKey(int i, List<String> list, int i2, int i3, List<String> list2, List<String> list3, int i4) {
            this.enable = i;
            this.cacheInstanceIds = list;
            this.expireTime = i2;
            this.cacheCapacity = i3;
            this.cacheType = list2;
            this.industries = list3;
            this.rmRedundantComponent = i4;
        }

        public CacheKey(int i, List list, int i2, int i3, List list2, List list3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? C13BV.INSTANCE : list, (i5 & 4) != 0 ? 300000 : i2, (i5 & 8) != 0 ? 4 : i3, (i5 & 16) != 0 ? C13BV.INSTANCE : list2, (i5 & 32) != 0 ? C13BV.INSTANCE : list3, (i5 & 64) != 0 ? 0 : i4);
        }
    }
}
