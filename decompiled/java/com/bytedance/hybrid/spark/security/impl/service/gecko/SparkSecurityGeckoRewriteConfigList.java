package com.bytedance.hybrid.spark.security.impl.service.gecko;

import X.C09CT;
import X.C0C64;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityGeckoRewriteConfigList {
    public static final GeckoRewriteConfigModel LIZ;
    public static GeckoRewriteConfigModel LIZIZ;

    static {
        new SparkSecurityGeckoRewriteConfigList();
        LIZ = new GeckoRewriteConfigModel(null, null, null, null, null, null, null, 127, null);
    }

    public static final GeckoRewriteConfigModel LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (GeckoRewriteConfigModel) C0C64.LJIILLIIL().LJJII(GeckoRewriteConfigModel.class, LIZ, "sss_gecko_cdn_rewrite_config", true);
        }
        GeckoRewriteConfigModel geckoRewriteConfigModel = LIZIZ;
        return geckoRewriteConfigModel == null ? LIZ : geckoRewriteConfigModel;
    }

    public static final class GeckoRewriteConfigModel {

        @C09CT("channel_mapping")
        public final Map<String, String> channelMapping;

        @C09CT("idc_mapping")
        public final Map<String, Map<String, String>> idcMapping;

        @C09CT("internal_bucket_list")
        public final List<String> internalBucketList;

        @C09CT("internal_loose_bucket_list")
        public final List<String> internalLooseBucketList;

        @C09CT("multi_bucket_list")
        public final List<String> multiBucketList;

        @C09CT("online_bucket_list")
        public final List<String> onlineBucketList;

        @C09CT("prefix_mapping")
        public final Map<String, String> prefixMapping;

        public GeckoRewriteConfigModel() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GeckoRewriteConfigModel(List<String> list, List<String> list2, List<String> list3, List<String> list4, Map<String, String> map, Map<String, String> map2, Map<String, ? extends Map<String, String>> map3) {
            this.onlineBucketList = list;
            this.internalBucketList = list2;
            this.internalLooseBucketList = list3;
            this.multiBucketList = list4;
            this.prefixMapping = map;
            this.channelMapping = map2;
            this.idcMapping = map3;
        }

        public GeckoRewriteConfigModel(List list, List list2, List list3, List list4, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C2097608Jq.LJ() : map, (i & 32) != 0 ? C2097608Jq.LJ() : map2, (i & 64) != 0 ? C2097608Jq.LJ() : map3);
        }
    }
}
