package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ECShowProductCardDirectlySettingConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("preview_list")
    public List<String> previewList;

    public ECShowProductCardDirectlySettingConfig() {
        this(false, new ArrayList());
    }

    public ECShowProductCardDirectlySettingConfig(boolean z, List<String> list) {
        this.enable = z;
        this.previewList = list;
    }
}
