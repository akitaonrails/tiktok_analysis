package com.ss.android.ugc.aweme.commercialize.router.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterWebModel implements Serializable {

    @C09CT("open_system_browser")
    public boolean isBOC;

    @C09CT("should_web_url_jump_third_app")
    public boolean isUniversal;

    @C09CT("quick_action_model")
    public CRouterQuickActionModel quickActionModel;

    @C09CT("web_title")
    public String title;

    @C09CT("web_url")
    public String url;

    @C09CT("web_show_style")
    public int webShowStyle;

    public CRouterWebModel() {
        this(null, null, false, false, 0, null);
    }

    public final CRouterQuickActionModel getQuickActionModel() {
        return this.quickActionModel;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWebShowStyle() {
        return this.webShowStyle;
    }

    public final boolean isBOC() {
        return this.isBOC;
    }

    public final boolean isUniversal() {
        return this.isUniversal;
    }

    public final void setBOC(boolean z) {
        this.isBOC = z;
    }

    public final void setQuickActionModel(CRouterQuickActionModel cRouterQuickActionModel) {
        this.quickActionModel = cRouterQuickActionModel;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUniversal(boolean z) {
        this.isUniversal = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setWebShowStyle(int i) {
        this.webShowStyle = i;
    }

    public CRouterWebModel(String str, String str2, boolean z, boolean z2, int i, CRouterQuickActionModel cRouterQuickActionModel) {
        this.url = str;
        this.title = str2;
        this.isUniversal = z;
        this.isBOC = z2;
        this.webShowStyle = i;
        this.quickActionModel = cRouterQuickActionModel;
    }
}
