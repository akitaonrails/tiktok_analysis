package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import X.InterfaceC1294060jmO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class SlashComponentBaseModel implements Serializable {

    @C09CT("events")
    public final Events events;

    @C09CT("page_info")
    public DeprecatedPageInfo pageInfo;

    public SlashComponentBaseModel() {
        this(null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getEvents$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getPageInfo$annotations() {
    }

    public final Events getEvents() {
        return this.events;
    }

    public final DeprecatedPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public final void setPageInfo(DeprecatedPageInfo deprecatedPageInfo) {
        this.pageInfo = deprecatedPageInfo;
    }

    public SlashComponentBaseModel(Events events, DeprecatedPageInfo deprecatedPageInfo) {
        this.events = events;
        this.pageInfo = deprecatedPageInfo;
    }
}
