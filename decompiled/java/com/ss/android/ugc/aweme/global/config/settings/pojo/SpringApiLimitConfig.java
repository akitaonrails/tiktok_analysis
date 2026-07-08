package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SpringApiLimitConfig {

    @C09CT("batch_event_interval")
    public Long batchEventInterval;

    @C09CT("config_list")
    public List<ApiConfigEntity> configList = new ArrayList();

    @C09CT("disable_fetch_setting")
    public Boolean disableFetchSetting;

    @C09CT("enable_delay_applog")
    public Boolean enableDelayApplog;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("limit_end_time")
    public Long limitEndTime;

    @C09CT("limit_start_time")
    public Long limitStartTime;

    @C09CT("send_launch_timely")
    public Integer sendLaunchTimely;

    @C09CT("start_time")
    public Long startTime;

    public Long getBatchEventInterval() throws C316660CbA {
        Long l = this.batchEventInterval;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Boolean getDisableFetchSetting() throws C316660CbA {
        Boolean bool = this.disableFetchSetting;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getEnableDelayApplog() throws C316660CbA {
        Boolean bool = this.enableDelayApplog;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Long getEndTime() throws C316660CbA {
        Long l = this.endTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Long getLimitEndTime() throws C316660CbA {
        Long l = this.limitEndTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Long getLimitStartTime() throws C316660CbA {
        Long l = this.limitStartTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public Integer getSendLaunchTimely() throws C316660CbA {
        Integer num = this.sendLaunchTimely;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Long getStartTime() throws C316660CbA {
        Long l = this.startTime;
        if (l != null) {
            return l;
        }
        throw new C316660CbA();
    }

    public List<ApiConfigEntity> getConfigList() {
        return this.configList;
    }
}
