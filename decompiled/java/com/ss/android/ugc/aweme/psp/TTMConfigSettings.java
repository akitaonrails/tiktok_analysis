package com.ss.android.ugc.aweme.psp;

import X.C01GW;
import X.C09CT;
import X.C21141617oM;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes33.dex */
public final class TTMConfigSettings {
    public static final TTMConfig LIZ;
    public static final C01GW LIZIZ;

    static {
        Boolean bool = Boolean.TRUE;
        LIZ = new TTMConfig(bool, bool, 0, bool, bool, null, null, null, bool, Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), 100, bool, bool, 262144L, 1048576L, 20L, 2L, bool, bool);
        LIZIZ = C452501pT.LIZIZ(new C21141617oM());
    }

    public static TTMConfig LIZ() {
        return (TTMConfig) LIZIZ.getValue();
    }

    /* JADX INFO: loaded from: classes35.dex */
    public static final class TTMConfig {

        @C09CT("ttm_core_buried_sampling_rate")
        public final Integer coreBuriedSamplingRate;

        @C09CT("ttm_crash_dump_enable")
        public final Boolean crashDumpEnable;

        @C09CT("ttm_general_buried_sampling_rate")
        public final Integer generalBuriedSamplingRate;

        @C09CT("global_enable")
        public final Boolean globalEnable;

        @C09CT("ttm_monitor_rule_run_exception")
        public final Boolean monitorRuleRunException;

        @C09CT("ttm_multi_inst_default_size")
        public final Integer multiInstCacheDefaultSize;

        @C09CT("ttm_multi_inst_enable")
        public final Boolean multiInstCacheEnable;

        @C09CT("ttm_multi_inst_max_size")
        public final Integer multiInstCacheMaxSize;

        @C09CT("ttm_open_check_state_mn_state")
        public final Boolean openCheckStateMnState;

        @C09CT("ttm_fix_mem_leak_free_open")
        public final Boolean openFixMemLeadFree;

        @C09CT("ttm_report_enable")
        public final Boolean reportEnable;

        @C09CT("ttm_time_static_config")
        public final Integer timeStaticConfig;

        @C09CT("ttm_enable")
        public final Boolean ttmEnable;

        @C09CT("ttm_open_ext_transform_ttm_obj")
        public final Boolean ttmExtTransformTTMObj;

        @C09CT("ttm_memory_big_pool_cache_size")
        public final long ttmMemoryBigPoolMaxCacheSize;

        @C09CT("ttm_memory_big_pool_size")
        public final long ttmMemoryBigPoolSize;

        @C09CT("ttm_memory_small_pool_cache_size")
        public final long ttmMemorySmallPoolMaxCacheSize;

        @C09CT("ttm_memory_small_pool_size")
        public final long ttmMemorySmallPoolSize;

        @C09CT("ttm_open_ttm_memory_pool")
        public final Boolean ttmOpenTTMMemoryPool;

        public TTMConfig() {
            this(null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, Boolean.TRUE, 262144L, 1048576L, 20L, 2L, Boolean.TRUE, Boolean.TRUE);
        }

        public TTMConfig(Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, Integer num3, Boolean bool6, Integer num4, Integer num5, Boolean bool7, Boolean bool8, long j, long j2, long j3, long j4, Boolean bool9, Boolean bool10) {
            this.globalEnable = bool;
            this.ttmEnable = bool2;
            this.timeStaticConfig = num;
            this.reportEnable = bool3;
            this.crashDumpEnable = bool4;
            this.multiInstCacheEnable = bool5;
            this.multiInstCacheMaxSize = num2;
            this.multiInstCacheDefaultSize = num3;
            this.monitorRuleRunException = bool6;
            this.generalBuriedSamplingRate = num4;
            this.coreBuriedSamplingRate = num5;
            this.openCheckStateMnState = bool7;
            this.openFixMemLeadFree = bool8;
            this.ttmMemorySmallPoolSize = j;
            this.ttmMemoryBigPoolSize = j2;
            this.ttmMemorySmallPoolMaxCacheSize = j3;
            this.ttmMemoryBigPoolMaxCacheSize = j4;
            this.ttmExtTransformTTMObj = bool9;
            this.ttmOpenTTMMemoryPool = bool10;
        }
    }
}
