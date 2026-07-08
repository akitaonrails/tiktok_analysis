package com.ss.android.ugc.aweme.ecommerce.performance;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class EcPerfSceneConfig {

    @C09CT("activity_name")
    public final String activityName;

    @C09CT("channel_name")
    public final String channelName;

    @C09CT("enter_page_running_time_list")
    public final List<Integer> enterPageRunningTimeList;

    @C09CT("scene_name")
    public final String sceneName;

    public EcPerfSceneConfig() {
        this("", null, null, null);
    }

    public EcPerfSceneConfig(String str, String str2, String str3, List<Integer> list) {
        this.sceneName = str;
        this.channelName = str2;
        this.activityName = str3;
        this.enterPageRunningTimeList = list;
    }
}
