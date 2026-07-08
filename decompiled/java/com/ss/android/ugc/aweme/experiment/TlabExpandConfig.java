package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class TlabExpandConfig {

    @C09CT("all_thread_expand_size")
    public int allThreadTlabSizeDiff;

    @C09CT("thread_name_arr")
    public String[] threadNameArr;

    @C09CT("thread_expand_size_arr")
    public int[] threadtlabSizeDiff;

    public TlabExpandConfig() {
        this(null, null, 0);
    }

    public final void setAllThreadTlabSizeDiff(int i) {
        this.allThreadTlabSizeDiff = i;
    }

    public final void setThreadNameArr(String[] strArr) {
        this.threadNameArr = strArr;
    }

    public final void setThreadtlabSizeDiff(int[] iArr) {
        this.threadtlabSizeDiff = iArr;
    }

    public TlabExpandConfig(String[] strArr, int[] iArr, int i) {
        this.threadNameArr = strArr;
        this.threadtlabSizeDiff = iArr;
        this.allThreadTlabSizeDiff = i;
    }
}
