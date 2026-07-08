package com.ss.android.ugc.aweme.ecommerce.core.engine.module;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes2.dex */
public final class ModuleId {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public ModuleId() {
        this("");
    }

    public ModuleId(String str) {
        this.id = str;
    }
}
