package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class AdvancedContainerData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("is_components_truncated")
    public boolean isCutData;

    public final boolean isCutData() {
        return this.isCutData;
    }

    public final void setCutData(boolean z) {
        this.isCutData = z;
    }
}
