package com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CommonDispatchConfigModel {

    @C09CT("custom_cpu_state")
    public final CustomCpuConfig customCpuState;

    @C09CT("custom_net_state")
    public final CustomNetConfig customNetState;

    @C09CT("enable_check_cold_launch")
    public final Boolean enableCheckColdLaunch;

    @C09CT("enable_check_main_thread")
    public final Boolean enableCheckMainThread;

    @C09CT("enable_check_sliding")
    public final Boolean enableCheckSliding;

    @C09CT("enable_download_resume")
    public final Boolean enableDownloadResume;

    @C09CT("enable_squash_request")
    public final Boolean enableSquashRequest;

    @C09CT("task_dispatch_interval")
    public final Long taskDispatchInterval;

    public CommonDispatchConfigModel() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, 3000L, null, null);
    }

    public CommonDispatchConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l, CustomCpuConfig customCpuConfig, CustomNetConfig customNetConfig) {
        this.enableDownloadResume = bool;
        this.enableSquashRequest = bool2;
        this.enableCheckSliding = bool3;
        this.enableCheckColdLaunch = bool4;
        this.enableCheckMainThread = bool5;
        this.taskDispatchInterval = l;
        this.customCpuState = customCpuConfig;
        this.customNetState = customNetConfig;
    }
}
