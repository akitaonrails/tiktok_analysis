package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAttachedLandingPage implements Serializable {
    public static final int $stable = 8;

    @C09CT("landing_page")
    public String landingPage;

    @C09CT("tab_id")
    public String tabId;

    @C09CT("template_id")
    public String templateId;

    public TakoAttachedLandingPage() {
        this("", null, null);
    }

    public final void setLandingPage(String str) {
        this.landingPage = str;
    }

    public final void setTabId(String str) {
        this.tabId = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public TakoAttachedLandingPage(String str, String str2, String str3) {
        this.landingPage = str;
        this.templateId = str2;
        this.tabId = str3;
    }
}
