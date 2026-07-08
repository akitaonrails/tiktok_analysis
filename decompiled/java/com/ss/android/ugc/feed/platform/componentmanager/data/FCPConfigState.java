package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.RealtimeFcpConfig;
import com.ss.android.ugc.aweme.feed.model.ServerBaseFcpConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class FCPConfigState implements Serializable {
    public static final int $stable = 8;

    @C09CT("active_config")
    public FeedComponentPriorityData activeConfig;

    @C09CT("active_config")
    public FeedComponentPriorityData coldStartConfig;

    @C09CT("genre_type")
    public String genreType;

    @C09CT("panel_scene")
    public String panelScene;

    @C09CT("realtime_config")
    public RealtimeFcpConfig realtimeConfig;

    @C09CT("server_base_config")
    public ServerBaseFcpConfig serverBaseConfig;

    public FCPConfigState() {
        this(null, null, null, null, null, null);
    }

    public final FCPConfigState copy(FeedComponentPriorityData feedComponentPriorityData, FeedComponentPriorityData feedComponentPriorityData2, ServerBaseFcpConfig serverBaseFcpConfig, RealtimeFcpConfig realtimeFcpConfig, String str, String str2) {
        return new FCPConfigState(feedComponentPriorityData, feedComponentPriorityData2, serverBaseFcpConfig, realtimeFcpConfig, str, str2);
    }

    public final void setActiveConfig(FeedComponentPriorityData feedComponentPriorityData) {
        this.activeConfig = feedComponentPriorityData;
    }

    public final void setColdStartConfig(FeedComponentPriorityData feedComponentPriorityData) {
        this.coldStartConfig = feedComponentPriorityData;
    }

    public final void setGenreType(String str) {
        this.genreType = str;
    }

    public final void setPanelScene(String str) {
        this.panelScene = str;
    }

    public final void setRealtimeConfig(RealtimeFcpConfig realtimeFcpConfig) {
        this.realtimeConfig = realtimeFcpConfig;
    }

    public final void setServerBaseConfig(ServerBaseFcpConfig serverBaseFcpConfig) {
        this.serverBaseConfig = serverBaseFcpConfig;
    }

    public FCPConfigState(FeedComponentPriorityData feedComponentPriorityData, FeedComponentPriorityData feedComponentPriorityData2, ServerBaseFcpConfig serverBaseFcpConfig, RealtimeFcpConfig realtimeFcpConfig, String str, String str2) {
        this.coldStartConfig = feedComponentPriorityData;
        this.activeConfig = feedComponentPriorityData2;
        this.serverBaseConfig = serverBaseFcpConfig;
        this.realtimeConfig = realtimeFcpConfig;
        this.panelScene = str;
        this.genreType = str2;
    }
}
