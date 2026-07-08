package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveSubscriptionQueueUrlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("anchor_queue_global_management")
    public String anchorQueueGlobalManagement;

    @C09CT("anchor_queue_preview_panel")
    public String anchorQueuePreviewPanel;

    @C09CT("anchor_queue_start")
    public String anchorQueueStart;

    @C09CT("anchor_queue_start_panel")
    public String anchorQueueStartPanel;

    @C09CT("host_live_manage_queue")
    public String hostLiveManageQueue;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveSubscriptionQueueUrlConfig_OptTypeAdapter();
    }

    public LiveSubscriptionQueueUrlConfig() {
        this("", "", "", "", "");
    }

    public final String getAnchorQueueGlobalManagement() {
        return this.anchorQueueGlobalManagement;
    }

    public final String getAnchorQueuePreviewPanel() {
        return this.anchorQueuePreviewPanel;
    }

    public final String getAnchorQueueStart() {
        return this.anchorQueueStart;
    }

    public final String getAnchorQueueStartPanel() {
        return this.anchorQueueStartPanel;
    }

    public final String getHostLiveManageQueue() {
        return this.hostLiveManageQueue;
    }

    public final void setAnchorQueueGlobalManagement(String str) {
        this.anchorQueueGlobalManagement = str;
    }

    public final void setAnchorQueuePreviewPanel(String str) {
        this.anchorQueuePreviewPanel = str;
    }

    public final void setAnchorQueueStart(String str) {
        this.anchorQueueStart = str;
    }

    public final void setAnchorQueueStartPanel(String str) {
        this.anchorQueueStartPanel = str;
    }

    public final void setHostLiveManageQueue(String str) {
        this.hostLiveManageQueue = str;
    }

    public LiveSubscriptionQueueUrlConfig(String str, String str2, String str3, String str4, String str5) {
        this.anchorQueueStart = str;
        this.anchorQueueStartPanel = str2;
        this.anchorQueuePreviewPanel = str3;
        this.anchorQueueGlobalManagement = str4;
        this.hostLiveManageQueue = str5;
    }
}
