package com.bytedance.pumbaa.common.business.pl;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PageStackConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_page_map")
    public boolean enablePageMap;

    @C09CT("page_type")
    public int pageType;

    @C09CT("sample_rate")
    public double sampleRate;

    @C09CT("sample_time_type")
    public int sampleTimeType;

    public PageStackConfig() {
        this(false, 0.0d, 0, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageStackConfig)) {
            return false;
        }
        PageStackConfig pageStackConfig = (PageStackConfig) obj;
        return this.enable == pageStackConfig.enable && Double.compare(this.sampleRate, pageStackConfig.sampleRate) == 0 && this.sampleTimeType == pageStackConfig.sampleTimeType && this.pageType == pageStackConfig.pageType && this.enablePageMap == pageStackConfig.enablePageMap;
    }

    public PageStackConfig(boolean z, double d, int i, int i2, boolean z2) {
        this.enable = z;
        this.sampleRate = d;
        this.sampleTimeType = i;
        this.pageType = i2;
        this.enablePageMap = z2;
    }
}
