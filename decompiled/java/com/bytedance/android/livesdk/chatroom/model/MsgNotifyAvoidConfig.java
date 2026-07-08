package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MsgNotifyAvoidConfig {

    @C09CT("component_rule_list")
    public List<MsgNotifyComponentAvoidRule> componentRuleList = new ArrayList();

    @C09CT("component_rule_list_v2")
    public List<MsgNotifyComponentAvoidRuleV2> componentRuleListV2 = new ArrayList();
}
