package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class LynxTemplate implements Serializable {

    @C09CT("biz_channel")
    public String bizChannel;

    @C09CT("biz_data")
    public String bizData;

    @C09CT("biz_dynamic_url")
    public String bizDynamicUrl;

    @C09CT("biz_info")
    public String bizInfo;

    @C09CT("load_entrance_type")
    public int loadEntranceType;

    @C09CT("lynx_card_config")
    public LynxCardConfig lynxCardConfig;

    @C09CT("main_entrance_channel")
    public String mainEntranceChannel;

    @C09CT("main_entrance_lynx_url")
    public String mainEntranceLynxUrl;

    public LynxTemplate() {
        this("", "", null, 0, "", "", "", "");
    }

    public final String getBizChannel() {
        return this.bizChannel;
    }

    public final String getBizData() {
        return this.bizData;
    }

    public final String getBizDynamicUrl() {
        return this.bizDynamicUrl;
    }

    public final String getBizInfo() {
        return this.bizInfo;
    }

    public final int getLoadEntranceType() {
        return this.loadEntranceType;
    }

    public final LynxCardConfig getLynxCardConfig() {
        return this.lynxCardConfig;
    }

    public final String getMainEntranceChannel() {
        return this.mainEntranceChannel;
    }

    public final String getMainEntranceLynxUrl() {
        return this.mainEntranceLynxUrl;
    }

    public final void setBizChannel(String str) {
        this.bizChannel = str;
    }

    public final void setBizData(String str) {
        this.bizData = str;
    }

    public final void setBizDynamicUrl(String str) {
        this.bizDynamicUrl = str;
    }

    public final void setBizInfo(String str) {
        this.bizInfo = str;
    }

    public final void setLoadEntranceType(int i) {
        this.loadEntranceType = i;
    }

    public final void setLynxCardConfig(LynxCardConfig lynxCardConfig) {
        this.lynxCardConfig = lynxCardConfig;
    }

    public final void setMainEntranceChannel(String str) {
        this.mainEntranceChannel = str;
    }

    public final void setMainEntranceLynxUrl(String str) {
        this.mainEntranceLynxUrl = str;
    }

    public LynxTemplate(String str, String str2, LynxCardConfig lynxCardConfig, int i, String str3, String str4, String str5, String str6) {
        this.mainEntranceLynxUrl = str;
        this.mainEntranceChannel = str2;
        this.lynxCardConfig = lynxCardConfig;
        this.loadEntranceType = i;
        this.bizData = str3;
        this.bizInfo = str4;
        this.bizDynamicUrl = str5;
        this.bizChannel = str6;
    }
}
