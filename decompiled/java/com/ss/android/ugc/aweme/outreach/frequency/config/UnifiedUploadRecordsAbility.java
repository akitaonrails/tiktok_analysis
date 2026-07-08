package com.ss.android.ugc.aweme.outreach.frequency.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class UnifiedUploadRecordsAbility {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("upload_keys")
    public final List<String> uploadKeys;

    public UnifiedUploadRecordsAbility() {
        this(false, null);
    }

    public UnifiedUploadRecordsAbility(boolean z, List<String> list) {
        this.enable = z;
        this.uploadKeys = list;
    }
}
