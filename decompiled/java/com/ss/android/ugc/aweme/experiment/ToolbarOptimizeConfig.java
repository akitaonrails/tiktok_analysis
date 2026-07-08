package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class ToolbarOptimizeConfig {

    @C09CT("edit_page_fix_cnt")
    public final int editFixCnt;

    @C09CT("use_new_icon")
    public final boolean ifNewIcon;

    @C09CT("record_page_fix_cnt")
    public final int recordFixCnt;

    public ToolbarOptimizeConfig() {
        this(-1, -1, false);
    }

    public ToolbarOptimizeConfig(int i, int i2, boolean z) {
        this.recordFixCnt = i;
        this.editFixCnt = i2;
        this.ifNewIcon = z;
    }
}
