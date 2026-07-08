package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.C09CT;
import X.C13BV;
import X.C700080Rd8;
import X.EnumC700630Re1;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.ComponentPreloadConfig;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedComponentPriorityData implements Serializable {
    public static final int $stable = 8;

    @C09CT("disable_components")
    public List<String> alreadyDisableComponents;
    public transient List<ComponentPreloadConfig> componentPreloadConfig;
    public EnumC700630Re1 configType;

    @C09CT("container_map")
    public Map<String, ComponentContainerData> containerMap;

    @C09CT("final_filter_components")
    public List<String> finalFilterComponents;

    @C09CT("global_component_list")
    public List<GlobalComponentData> globalComponentList;
    public transient Map<String, GlobalComponentData> globalComponentMap;

    @C09CT("global_show_limit")
    public int globalShowLimit;
    public List<String> priorityList;

    @C09CT("rank_component_ids")
    public List<String> rankComponentIds;

    @C09CT("rerank_component_ids")
    public List<String> reRankComponentIds;

    @C09CT("server_event_tracking_extra")
    public String serverTrackExtra;

    @C09CT("tree_structure")
    public FcpTreeData treeStructure;

    public FeedComponentPriorityData() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final FeedComponentPriorityData copy(FcpTreeData fcpTreeData, List<GlobalComponentData> list, int i, Map<String, ComponentContainerData> map, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, String str, EnumC700630Re1 enumC700630Re1, Map<String, GlobalComponentData> map2, List<ComponentPreloadConfig> list7) {
        return new FeedComponentPriorityData(fcpTreeData, list, i, map, list2, list3, list4, list5, list6, str, enumC700630Re1, map2, list7);
    }

    public final void flatten() {
        Map<String, GlobalComponentData> map = this.globalComponentMap;
        if (map == null || map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<GlobalComponentData> list = this.globalComponentList;
            if (list == null || (r2 = list.iterator()) == null) {
                return;
            }
            for (GlobalComponentData globalComponentData : list) {
                linkedHashMap.put(globalComponentData.getComponentKey(), globalComponentData);
            }
            this.globalComponentMap = linkedHashMap;
        }
    }

    public final void setAlreadyDisableComponents(List<String> list) {
        this.alreadyDisableComponents = list;
    }

    public final void setComponentPreloadConfig(List<ComponentPreloadConfig> list) {
        this.componentPreloadConfig = list;
    }

    public final void setConfigType(EnumC700630Re1 enumC700630Re1) {
        this.configType = enumC700630Re1;
    }

    public final void setContainerMap(Map<String, ComponentContainerData> map) {
        this.containerMap = map;
    }

    public final void setFinalFilterComponents(List<String> list) {
        this.finalFilterComponents = list;
    }

    public final void setGlobalComponentList(List<GlobalComponentData> list) {
        this.globalComponentList = list;
    }

    public final void setGlobalComponentMap(Map<String, GlobalComponentData> map) {
        this.globalComponentMap = map;
    }

    public final void setGlobalShowLimit(int i) {
        this.globalShowLimit = i;
    }

    public final void setPriorityList(List<String> list) {
        this.priorityList = list;
    }

    public final void setRankComponentIds(List<String> list) {
        this.rankComponentIds = list;
    }

    public final void setReRankComponentIds(List<String> list) {
        this.reRankComponentIds = list;
    }

    public final void setServerTrackExtra(String str) {
        this.serverTrackExtra = str;
    }

    public final void setTreeStructure(FcpTreeData fcpTreeData) {
        this.treeStructure = fcpTreeData;
    }

    public FeedComponentPriorityData(FcpTreeData fcpTreeData, List<GlobalComponentData> list, int i, Map<String, ComponentContainerData> map, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, String str, EnumC700630Re1 enumC700630Re1, Map<String, GlobalComponentData> map2, List<ComponentPreloadConfig> list7) {
        this.treeStructure = fcpTreeData;
        this.globalComponentList = list;
        this.globalShowLimit = i;
        this.containerMap = map;
        this.priorityList = list2;
        this.alreadyDisableComponents = list3;
        this.finalFilterComponents = list4;
        this.rankComponentIds = list5;
        this.reRankComponentIds = list6;
        this.serverTrackExtra = str;
        this.configType = enumC700630Re1;
        this.globalComponentMap = map2;
        this.componentPreloadConfig = list7;
    }

    public FeedComponentPriorityData(FcpTreeData fcpTreeData, List list, int i, Map map, List list2, List list3, List list4, List list5, List list6, String str, EnumC700630Re1 enumC700630Re1, Map map2, List list7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C700080Rd8.LJIIIIZZ : fcpTreeData, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? C13BV.INSTANCE : list3, (i2 & 64) != 0 ? C13BV.INSTANCE : list4, (i2 & 128) != 0 ? C13BV.INSTANCE : list5, (i2 & 256) != 0 ? C13BV.INSTANCE : list6, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : enumC700630Re1, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : map2, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? list7 : null);
    }
}
