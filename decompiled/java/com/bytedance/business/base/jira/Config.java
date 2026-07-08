package com.bytedance.business.base.jira;

/* JADX INFO: loaded from: classes36.dex */
public class Config {
    public int aid;
    public String appName;
    public String appVersionName;
    public String channel;
    public String defaultDes;
    public String defaultTilte;
    public String host;
    public boolean isI18n;
    public String jiraUrl;
    public String password;
    public String project;
    public String userName;

    public int getAid() {
        return this.aid;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getDefaultDes() {
        return this.defaultDes;
    }

    public String getDefaultTilte() {
        return this.defaultTilte;
    }

    public String getHost() {
        return this.host;
    }

    public String getJiraUrl() {
        return this.jiraUrl;
    }

    public String getPassword() {
        return this.password;
    }

    public String getProject() {
        return this.project;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean isI18n() {
        return this.isI18n;
    }

    public void setAid(int i) {
        this.aid = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setDefaultDes(String str) {
        this.defaultDes = str;
    }

    public void setDefaultTilte(String str) {
        this.defaultTilte = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setI18n(boolean z) {
        this.isI18n = z;
    }

    public void setJiraUrl(String str) {
        this.jiraUrl = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProject(String str) {
        this.project = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public Config(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.jiraUrl = str;
        this.project = str2;
        this.userName = str3;
        this.password = str4;
        this.aid = i;
        this.appName = str5;
        this.appVersionName = str6;
        this.defaultTilte = str7;
        this.defaultDes = str8;
        this.channel = str9;
        this.isI18n = z;
        this.host = str10;
    }
}
