package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallFpsOptModelV1 {

    @C09CT("active_predecode_exclude_type")
    public final List<String> activePredecodeExcludeTypeList;

    @C09CT("async_report_live_player_applog")
    public final Integer asyncReportLivePlayerApplog;

    @C09CT("disable_blank_card_detect_threshold")
    public final Double disableBlankCardDetectThreshold;

    @C09CT("enable_spark_active_predecode")
    public final Integer enableSparkActivePredecode;

    @C09CT("opt_init_data_format")
    public final Integer optInitDataFormat;

    public EcMixMallFpsOptModelV1() {
        this(null, null, null, null, null);
    }

    public EcMixMallFpsOptModelV1(Integer num, List<String> list, Integer num2, Double d, Integer num3) {
        this.enableSparkActivePredecode = num;
        this.activePredecodeExcludeTypeList = list;
        this.optInitDataFormat = num2;
        this.disableBlankCardDetectThreshold = d;
        this.asyncReportLivePlayerApplog = num3;
    }
}
