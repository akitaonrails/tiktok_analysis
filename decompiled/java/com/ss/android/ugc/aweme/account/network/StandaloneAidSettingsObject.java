package com.ss.android.ugc.aweme.account.network;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class StandaloneAidSettingsObject {

    @C09CT("disabled")
    public final boolean disabled;

    @C09CT("paths")
    public final List<String> paths;

    public StandaloneAidSettingsObject(boolean z, List<String> list) {
        this.disabled = z;
        this.paths = list;
    }
}
