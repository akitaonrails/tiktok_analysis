package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSubBotData implements Serializable {
    public static final int $stable = 8;

    @C09CT("show_loading")
    public Boolean showLoading;

    @C09CT("sub_enter_method")
    public String subEnterMethod;

    @C09CT("sub_process_id")
    public String subProcessId;

    public final void setShowLoading(Boolean bool) {
        this.showLoading = bool;
    }

    public final void setSubEnterMethod(String str) {
        this.subEnterMethod = str;
    }

    public final void setSubProcessId(String str) {
        this.subProcessId = str;
    }

    public TakoSubBotData(String str, String str2, Boolean bool) {
        this.subEnterMethod = str;
        this.subProcessId = str2;
        this.showLoading = bool;
    }
}
