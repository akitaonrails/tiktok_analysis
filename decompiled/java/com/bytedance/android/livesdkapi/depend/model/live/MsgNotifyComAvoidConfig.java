package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MsgNotifyComAvoidConfig {
    public static final TypeAdapter ADAPTER = new MsgNotifyComAvoidConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("component_rule_list_v2")
    public List<MsgNotifyComponentAvoidRuleV2> componentRuleListV2 = new ArrayList();
}
