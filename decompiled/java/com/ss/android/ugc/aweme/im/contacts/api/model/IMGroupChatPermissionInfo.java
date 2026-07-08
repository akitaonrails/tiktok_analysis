package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class IMGroupChatPermissionInfo implements Serializable {

    @C09CT("feature_result")
    public final FeatureResult featureResult;

    @C09CT("group_permission_condition_check_result")
    public final Map<String, Boolean> groupPermissionConditionCheckResult;

    public IMGroupChatPermissionInfo() {
        this(null, null);
    }

    public final IMGroupChatPermissionInfo copy(FeatureResult featureResult, Map<String, Boolean> map) {
        return new IMGroupChatPermissionInfo(featureResult, map);
    }

    public IMGroupChatPermissionInfo(FeatureResult featureResult, Map<String, Boolean> map) {
        this.featureResult = featureResult;
        this.groupPermissionConditionCheckResult = map;
    }
}
