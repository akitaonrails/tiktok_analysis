package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedMultiSceneComponentsData {
    public boolean LIZ;

    @C09CT("global_component_map")
    public Map<String, GlobalComponentData> globalComponentMap;

    @C09CT("global_container_map")
    public Map<String, ComponentContainerData> globalContainerMap;

    @C09CT("scenes")
    public Map<String, FeedMultiSceneComponentPriorityData> multiSceneComponentPriorityData;

    @C09CT("other_scene")
    public FeedMultiSceneComponentPriorityData otherSceneComponentPriorityData;

    public FeedMultiSceneComponentsData() {
        this(null, null, null, null, false);
    }

    public FeedMultiSceneComponentsData(Map<String, GlobalComponentData> map, Map<String, ComponentContainerData> map2, Map<String, FeedMultiSceneComponentPriorityData> map3, FeedMultiSceneComponentPriorityData feedMultiSceneComponentPriorityData, boolean z) {
        this.globalComponentMap = map;
        this.globalContainerMap = map2;
        this.multiSceneComponentPriorityData = map3;
        this.otherSceneComponentPriorityData = feedMultiSceneComponentPriorityData;
        this.LIZ = z;
    }
}
