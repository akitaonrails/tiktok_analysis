package com.bytedance.android.livesdk.livesetting.subscription;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSubscriptionAnchorSubathonUrlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("subathon_detail")
    public String subathonDetail;

    @C09CT("subathon_detail_live")
    public String subathonDetailLive;

    @C09CT("subathon_faq")
    public String subathonFaq;

    @C09CT("subathon_faq_live")
    public String subathonFaqLive;

    @C09CT("subathon_management")
    public String subathonManagement;

    @C09CT("subathon_management_live")
    public String subathonManagementLive;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveSubscriptionAnchorSubathonUrlConfig_OptTypeAdapter();
    }

    public LiveSubscriptionAnchorSubathonUrlConfig() {
        this("", "", "", "", "", "");
    }

    public final String getSubathonDetail() {
        return this.subathonDetail;
    }

    public final String getSubathonDetailLive() {
        return this.subathonDetailLive;
    }

    public final String getSubathonFaq() {
        return this.subathonFaq;
    }

    public final String getSubathonFaqLive() {
        return this.subathonFaqLive;
    }

    public final String getSubathonManagement() {
        return this.subathonManagement;
    }

    public final String getSubathonManagementLive() {
        return this.subathonManagementLive;
    }

    public final void setSubathonDetail(String str) {
        this.subathonDetail = str;
    }

    public final void setSubathonDetailLive(String str) {
        this.subathonDetailLive = str;
    }

    public final void setSubathonFaq(String str) {
        this.subathonFaq = str;
    }

    public final void setSubathonFaqLive(String str) {
        this.subathonFaqLive = str;
    }

    public final void setSubathonManagement(String str) {
        this.subathonManagement = str;
    }

    public final void setSubathonManagementLive(String str) {
        this.subathonManagementLive = str;
    }

    public LiveSubscriptionAnchorSubathonUrlConfig(String str, String str2, String str3, String str4, String str5, String str6) {
        this.subathonManagement = str;
        this.subathonDetail = str2;
        this.subathonManagementLive = str3;
        this.subathonDetailLive = str4;
        this.subathonFaq = str5;
        this.subathonFaqLive = str6;
    }
}
