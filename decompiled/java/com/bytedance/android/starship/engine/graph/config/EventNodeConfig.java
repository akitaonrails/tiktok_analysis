package com.bytedance.android.starship.engine.graph.config;

import X.C09CS;
import X.C09CT;
import X.EnumC1308000k8s;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class EventNodeConfig {

    @C09CT("events")
    public final List<EventSpec> events;

    @C09CT("expression_filter")
    public final ExpressionEventFilterConfig expressionFilter;

    @C09CT("pitaya_cep_filter")
    public final PitayaEventFilterConfig pitayaCepFilter;

    @C09CT("ttm_cep_filter")
    public final TTMCEPEventFilterConfig ttmCepFilter;

    @C09CT("type")
    @C09CS(FilterTypeAdapter.class)
    public final EnumC1308000k8s type;

    public EventNodeConfig() {
        this(null, EnumC1308000k8s.NONE, null, null, null);
    }

    public EventNodeConfig(List<EventSpec> list, EnumC1308000k8s enumC1308000k8s, ExpressionEventFilterConfig expressionEventFilterConfig, PitayaEventFilterConfig pitayaEventFilterConfig, TTMCEPEventFilterConfig tTMCEPEventFilterConfig) {
        this.events = list;
        this.type = enumC1308000k8s;
        this.expressionFilter = expressionEventFilterConfig;
        this.pitayaCepFilter = pitayaEventFilterConfig;
        this.ttmCepFilter = tTMCEPEventFilterConfig;
    }
}
