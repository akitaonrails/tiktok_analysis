package com.bytedance.helios.network.pipeline.recognize;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class DomainRecognizeConfig {

    @C09CT("cache_size")
    public final int cacheSize;

    @C09CT("defaultValue")
    public final String defaultValue;

    @C09CT("list")
    public final List<ConfigItem> list;

    public DomainRecognizeConfig() {
        this(C1697810uHb.LJIIJJI(new ConfigItem("tt_first_full_domain_list", "tt_1st"), new ConfigItem("bd_first_full_domain_list", "bd_1st"), new ConfigItem("tt_first_second_level_domain_list", "tt_1st"), new ConfigItem("bd_first_second_level_domain_list", "bd_1st"), new ConfigItem("tt_3_second_level_domain_list", "tt_3rd")), "bd_3rd", 100);
    }

    public DomainRecognizeConfig(List<ConfigItem> list, String str, int i) {
        this.list = list;
        this.defaultValue = str;
        this.cacheSize = i;
    }
}
