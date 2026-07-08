package com.ss.android.ugc.aweme.search.filter.research;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ResearchFilterStruct implements Serializable {
    public boolean LL;
    public float LLILLJJLI;

    @C09CT("log_info")
    public String logInfo;

    @C09CT("name")
    public String name;

    @C09CT("request_content")
    public String requestContent;

    public final String getLogInfo() {
        return this.logInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRequestContent() {
        return this.requestContent;
    }

    public final float getWidth() {
        return this.LLILLJJLI;
    }

    public final boolean isSelected() {
        return this.LL;
    }

    public final void setLogInfo(String str) {
        this.logInfo = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRequestContent(String str) {
        this.requestContent = str;
    }

    public final void setSelected(boolean z) {
        this.LL = z;
    }

    public final void setWidth(float f) {
        this.LLILLJJLI = f;
    }
}
