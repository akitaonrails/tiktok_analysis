package com.ss.android.ugc.aweme.search.filter;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SubSwitchStruct implements Serializable {
    public boolean LL;
    public boolean LLILLJJLI;
    public ActivityOptionStruct LLILLL;

    @C09CT("description")
    public String description;

    @C09CT("log_info")
    public String logInfo;

    @C09CT("name")
    public String name;

    @C09CT("request_key")
    public String requestKey;

    public final ActivityOptionStruct getActivityOptionStruct() {
        return this.LLILLL;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequestKey() {
        return this.requestKey;
    }

    public final boolean isDefaultOption() {
        return this.LL;
    }

    public final boolean isSelected() {
        return this.LLILLJJLI;
    }

    public final void setActivityOptionStruct(ActivityOptionStruct activityOptionStruct) {
        this.LLILLL = activityOptionStruct;
    }

    public final void setDefaultOption(boolean z) {
        this.LL = z;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setLogInfo(String str) {
        this.logInfo = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestKey(String str) {
        this.requestKey = str;
    }

    public final void setSelected(boolean z) {
        this.LLILLJJLI = z;
    }
}
