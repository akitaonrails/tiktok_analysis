package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPdpPreloadCartInfoSettingModel {

    @C09CT("cache_expired_min")
    public final Integer cacheExpiredMin;

    @C09CT("cache_size")
    public final Integer cacheSize;

    @C09CT("enable_switch")
    public final Boolean enableSwitch;

    @C09CT("multi_sku_delay_sec")
    public final Integer multiSkuDelaySec;

    @C09CT("single_sku_delay_sec")
    public final Integer singleSkuDelaySec;

    public EcPdpPreloadCartInfoSettingModel() {
        this(Boolean.FALSE, 10, 50, 3, 0);
    }

    public EcPdpPreloadCartInfoSettingModel(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.enableSwitch = bool;
        this.cacheExpiredMin = num;
        this.cacheSize = num2;
        this.singleSkuDelaySec = num3;
        this.multiSkuDelaySec = num4;
    }
}
