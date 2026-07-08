package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class GeckoConfig {

    @C09CT("dyc_channel")
    public List<String> dycChannel;

    @C09CT("initial_channel")
    public List<String> initialChannel;

    @C09CT("initial_high_priority_channel")
    public List<String> initialHighPriorityChannel;

    @C09CT("use_new_package_now")
    public boolean useNewPackageNow;

    public List<String> getDynamicChannel() {
        return this.dycChannel;
    }

    public List<String> getInitialChannel() {
        return this.initialChannel;
    }

    public List<String> getInitialHighPriorityChannel() {
        return this.initialHighPriorityChannel;
    }

    public boolean getUseNewPackageNow() {
        return this.useNewPackageNow;
    }
}
