package com.bytedance.android.livesdk.usermanage.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes.dex */
public class AdminListExtra extends Extra {

    @C09CT("admin_max_count")
    public int maxCount;

    public int getMaxCount() {
        return this.maxCount;
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }
}
