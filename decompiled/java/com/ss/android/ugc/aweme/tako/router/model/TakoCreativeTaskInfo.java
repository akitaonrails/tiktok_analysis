package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C1854570yMR;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCreativeTaskInfo implements Serializable {

    @C09CT("creative_task_type")
    public String creativeTaskType;
    public static final C1854570yMR Companion = new Object() { // from class: X.0yMR
    };
    public static final int $stable = 8;

    public TakoCreativeTaskInfo() {
        this(null);
    }

    public final TakoCreativeTaskInfo copy(String str) {
        return new TakoCreativeTaskInfo(str);
    }

    public TakoCreativeTaskInfo(String str) {
        this.creativeTaskType = str;
    }

    public final void setCreativeTaskType(String str) {
        this.creativeTaskType = str;
    }
}
