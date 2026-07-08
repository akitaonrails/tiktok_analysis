package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalServiceInfo implements Serializable {

    @C09CT("extra")
    public List<LocalServiceConfig> extra;

    @C09CT("is_ls_content")
    public Boolean isLSContent;

    public LocalServiceInfo() {
        this(null, null);
    }

    public final Boolean isLSContent() {
        return this.isLSContent;
    }

    public LocalServiceInfo(Boolean bool, List<LocalServiceConfig> list) {
        this.isLSContent = bool;
        this.extra = list;
    }
}
