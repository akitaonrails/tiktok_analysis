package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAvoidConfig {
    public static final TypeAdapter ADAPTER = new NotifyAvoidConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("rules")
    public List<NotifyAvoidRule> rules = new ArrayList();

    @C09CT("avoid_pair")
    public List<NotifyAvoidPair> avoidPair = new ArrayList();

    @C09CT("anim_conflict_pair")
    public List<NotifyAnimConflictPair> animConflictPair = new ArrayList();

    @C09CT("range_id_map")
    public Map<String, NotifyRangeInfo> rangeIdMap = new LinkedHashMap();

    @C09CT("com_rules")
    public List<ComNotifyAvoidRule> comRules = new ArrayList();
}
