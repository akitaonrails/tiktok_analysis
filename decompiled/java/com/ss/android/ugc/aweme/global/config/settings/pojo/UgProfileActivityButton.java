package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes25.dex */
public class UgProfileActivityButton {

    @C09CT("h5_link")
    public String h5Link;

    @C09CT("activity_id")
    public String id;

    @C09CT("name")
    public String name;

    @C09CT("resource_url")
    public UrlModel resourceUrl;

    @C09CT("show_scenery")
    public Integer showScenery;

    @C09CT("tab_bubble_text")
    public String tabBubbleText;

    @C09CT("time_limit")
    public Integer timeLimit;

    public String getId() throws C316660CbA {
        String str = this.id;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getName() throws C316660CbA {
        String str = this.name;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getShowScenery() throws C316660CbA {
        Integer num = this.showScenery;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getTabBubbleText() {
        String str = this.tabBubbleText;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getTimeLimit() throws C316660CbA {
        Integer num = this.timeLimit;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getH5Link() {
        return this.h5Link;
    }

    public UrlModel getResourceUrl() {
        return this.resourceUrl;
    }

    public void setId(String str) {
        this.id = str;
    }
}
