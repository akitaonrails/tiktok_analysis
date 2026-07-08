package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinTaskData {

    @C09CT("extra_params")
    public final Map<String, Object> extraParams;

    @C09CT("task_from_scene")
    public final TaskFromScene taskFromScene;

    @C09CT("task_lowest_version")
    public final LimitVersion taskLowestVersion;

    @C09CT("task_name")
    public final String taskName;

    public BulletinTaskData(String str, LimitVersion limitVersion, Map<String, ? extends Object> map, TaskFromScene taskFromScene) {
        this.taskName = str;
        this.taskLowestVersion = limitVersion;
        this.extraParams = map;
        this.taskFromScene = taskFromScene;
    }
}
