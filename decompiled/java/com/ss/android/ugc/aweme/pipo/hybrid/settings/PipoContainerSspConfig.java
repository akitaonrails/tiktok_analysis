package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PipoContainerSspConfig {

    @C09CT("allow_list")
    public final List<PipoContainerSspAllowListItem> allowList;

    @C09CT("enable_multi_page_ssp")
    public final boolean enableMultiPageSsp;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("preconnect_enabled")
    public final boolean preconnectEnabled;

    @C09CT("preconnect_importance_threshold")
    public final int preconnectImportanceThreshold;

    @C09CT("prefetch_importance_threshold")
    public final int prefetchImportanceThreshold;

    @C09CT("prewarm_triggers_enabled")
    public final boolean prewarmTriggersEnabled;

    @C09CT("ssp_fetch_resource_extensions")
    public final List<String> sspFetchResourceExtensions;

    public PipoContainerSspConfig() {
        this(false, null, null, false, false, false, 90, 90);
    }

    public final List<PipoContainerSspAllowListItem> getAllowList() {
        return this.allowList;
    }

    public final boolean getEnableMultiPageSsp() {
        return this.enableMultiPageSsp;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getPreconnectEnabled() {
        return this.preconnectEnabled;
    }

    public final int getPreconnectImportanceThreshold() {
        return this.preconnectImportanceThreshold;
    }

    public final int getPrefetchImportanceThreshold() {
        return this.prefetchImportanceThreshold;
    }

    public final boolean getPrewarmTriggersEnabled() {
        return this.prewarmTriggersEnabled;
    }

    public final List<String> getSspFetchResourceExtensions() {
        return this.sspFetchResourceExtensions;
    }

    public PipoContainerSspConfig(boolean z, List<PipoContainerSspAllowListItem> list, List<String> list2, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.enabled = z;
        this.allowList = list;
        this.sspFetchResourceExtensions = list2;
        this.preconnectEnabled = z2;
        this.enableMultiPageSsp = z3;
        this.prewarmTriggersEnabled = z4;
        this.prefetchImportanceThreshold = i;
        this.preconnectImportanceThreshold = i2;
    }
}
