package com.ss.android.ugc.aweme.ml.feature.pitaya.group;

import X.C13BV;
import com.bytedance.pitaya.api.feature.store.PTYFeatureDescription;
import com.bytedance.pitaya.api.feature.store.PTYFeatureGroup;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AWEFeaturePTYGroup extends PTYFeatureGroup {
    public static final AWEFeaturePTYGroup INSTANCE = new AWEFeaturePTYGroup();

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public String getGroupName() {
        return "ies_pty";
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public void traceEvent(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public List<PTYFeatureDescription> getDescription() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PTYFeatureDescription("sliding_velocity", null, null, null, 3, 1, false, 0, 999, new ArrayList(), null, null));
        arrayList.add(new PTYFeatureDescription("sliding_velocity_x", null, null, null, 3, 1, false, 0, 999, new ArrayList(), null, null));
        arrayList.add(new PTYFeatureDescription("sliding_velocity_y", null, null, null, 3, 1, false, 0, 999, new ArrayList(), null, null));
        return arrayList;
    }

    @Override // com.bytedance.pitaya.api.feature.store.PTYFeatureGroup
    public List<String> getTrackEvents() {
        return C13BV.INSTANCE;
    }
}
