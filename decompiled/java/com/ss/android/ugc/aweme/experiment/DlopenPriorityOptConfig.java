package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class DlopenPriorityOptConfig {

    @C09CT("is_absolute")
    public boolean isAbsoluteValue;

    @C09CT("priority")
    public int priorityValue;

    public DlopenPriorityOptConfig() {
        this(0, false);
    }

    public final boolean isAbsoluteValue() {
        return this.isAbsoluteValue;
    }

    public final void setAbsoluteValue(boolean z) {
        this.isAbsoluteValue = z;
    }

    public final void setPriorityValue(int i) {
        this.priorityValue = i;
    }

    public DlopenPriorityOptConfig(int i, boolean z) {
        this.priorityValue = i;
        this.isAbsoluteValue = z;
    }
}
