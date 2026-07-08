package com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes28.dex */
public final class TaskEvent {

    @C09CT("content_id")
    public final String contentId;

    @C09CT("event_info")
    public final String eventInfo;

    @C09CT("event_type")
    public final Integer eventType;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public TaskEvent() {
        this(null, null, null, null);
    }

    public TaskEvent(String str, Integer num, Integer num2, String str2) {
        this.contentId = str;
        this.eventType = num;
        this.scene = num2;
        this.eventInfo = str2;
    }
}
