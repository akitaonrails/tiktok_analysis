package com.ss.android.ugc.aweme.miniapp_api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class MicroAppInfo implements Serializable {

    @C09CT("app_id")
    public String appId;

    @C09CT("description")
    public String desc;

    @C09CT("icon")
    public String icon;

    @C09CT("card")
    public MiniAppCard miniAppCard;

    @C09CT("app_name")
    public String name;

    @C09CT("orientation")
    public int orientation;

    @C09CT("schema")
    public String schema;

    @C09CT("state")
    public int state;

    @C09CT("summary")
    public String summary;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public int type;

    @C09CT("web_url")
    public String webUrl;

    public boolean isApp() {
        int i = this.type;
        return i == 1 || i == 3;
    }

    public boolean isGame() {
        return this.type == 2;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getSchema() {
        return this.schema;
    }

    public int getState() {
        return this.state;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
