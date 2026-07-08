package com.ss.android.ugc.aweme.legoImp.task.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TrackerUploadRate {
    public static final int $stable = 0;

    @C09CT("assemble_container_init_event_rate")
    public final float assemAssembleContainerInitEventRate;

    @C09CT("assem_init_event_rate")
    public final float assemInitEventRate;

    @C09CT("assem_init_host_event")
    public final float assemInitializeHostEvent;

    @C09CT("assem_preload_success_rate")
    public final float assemPreloadSuccessRate;

    @C09CT("bind_proxy_event_rate")
    public final float bindProxyEventRate;

    @C09CT("cold_start_rate_event")
    public final float coldStartTrackRate;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("first_feed_performance_event_rate")
    public final float firstFeedPerformanceEventRate;

    @C09CT("hierarchy_data_performance_rate")
    public final float hierarchyDataPerformanceRate;

    @C09CT("on_host_bind_event_rate")
    public final float onHostBindEventRate;

    @C09CT("vprovider_bind_event")
    public final float providerBindEvent;

    @C09CT("vprovider_provide_event")
    public final float providerProvideEvent;

    @C09CT("assem_create_instance_event_rate")
    public final float subscribeAssemCreateEvent;

    @C09CT("assem_dsl_event_rate")
    public final float subscribeAssemDslEvent;

    @C09CT("assem_lifecycle_event_rate")
    public final float subscribeAssemLifecycleEvent;

    @C09CT("assemble_event_rate")
    public final float subscribeAssembleEvent;

    @C09CT("bind_ability_event_rate")
    public final float subscribeBindAbilityEvent;

    @C09CT("get_ability_event_rate")
    public final float subscribeGetAbilityEvent;

    @C09CT("vscope_event")
    public final float vScopePerformanceEvent;

    @C09CT("view_model_create_instance_event_rate")
    public final float viewModelCreateEvent;

    @C09CT("view_model_subscribe_performance_rate")
    public final float viewModelSubscribePerformanceEvent;

    public TrackerUploadRate() {
        this(true, 1.0E-6f, 5.0E-4f, 5.0E-4f, 5.0E-5f, 1.0E-5f, 1.0E-6f, 1.0E-8f, 1.0E-6f, 1.0E-5f, 1.0E-6f, 1.0E-6f, 1.0E-4f, 5.0E-5f, 0.001f, 0.01f, 1.0E-4f, 0.001f, 1.0E-4f, 0.01f, 1.0E-4f);
    }

    public TrackerUploadRate(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f18, float f19, float f20, float f21) {
        this.enable = z;
        this.assemInitEventRate = f;
        this.onHostBindEventRate = f2;
        this.bindProxyEventRate = f3;
        this.assemAssembleContainerInitEventRate = f4;
        this.hierarchyDataPerformanceRate = f5;
        this.viewModelSubscribePerformanceEvent = f6;
        this.viewModelCreateEvent = f7;
        this.subscribeAssemCreateEvent = f8;
        this.subscribeBindAbilityEvent = f9;
        this.subscribeGetAbilityEvent = f10;
        this.subscribeAssemDslEvent = f11;
        this.subscribeAssemLifecycleEvent = f12;
        this.subscribeAssembleEvent = f13;
        this.coldStartTrackRate = f14;
        this.assemInitializeHostEvent = f15;
        this.vScopePerformanceEvent = f16;
        this.providerBindEvent = f18;
        this.providerProvideEvent = f19;
        this.firstFeedPerformanceEventRate = f20;
        this.assemPreloadSuccessRate = f21;
    }
}
