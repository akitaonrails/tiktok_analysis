package com.ss.ugc.live.sdk.message.data;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public abstract class BaseNode {
    public final NodeType nodeType;
    public final NodeStatus status;

    public JSONObject json() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.nodeType.getKey());
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.status.getValue());
        return jSONObject;
    }

    public final NodeType getNodeType() {
        return this.nodeType;
    }

    public final NodeStatus getStatus() {
        return this.status;
    }

    public BaseNode(NodeType nodeType, NodeStatus nodeStatus) {
        this.nodeType = nodeType;
        this.status = nodeStatus;
    }
}
