package com.ss.android.ugc.aweme.im.strategy.scene;

import X.C09CT;
import X.EnumC909380Zlw;
import com.ss.android.ugc.aweme.im.strategy.decisiontree.DecisionTree;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class StrategyPlatformData {

    @C09CT("decision_trees")
    public Map<String, DecisionTree> decisionTree;

    @C09CT("err_scenes")
    public final List<String> errScenes;

    @C09CT("resource_scenes")
    public List<String> resourceScenes;

    @C09CT("scene_map")
    public final Map<EnumC909380Zlw, SceneConfigData> sceneMap;

    public StrategyPlatformData(Map<String, DecisionTree> map, List<String> list, List<String> list2, Map<EnumC909380Zlw, SceneConfigData> map2) {
        this.decisionTree = map;
        this.resourceScenes = list;
        this.errScenes = list2;
        this.sceneMap = map2;
    }
}
