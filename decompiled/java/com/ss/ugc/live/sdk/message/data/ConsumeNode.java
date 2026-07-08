package com.ss.ugc.live.sdk.message.data;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class ConsumeNode extends BaseNode {
    public String isDirect;

    @Override // com.ss.ugc.live.sdk.message.data.BaseNode
    public JSONObject json() throws JSONException {
        JSONObject jSONObjectJson = super.json();
        jSONObjectJson.put("isDirect", this.isDirect);
        return jSONObjectJson;
    }

    public final String isDirect() {
        return this.isDirect;
    }

    public ConsumeNode(NodeStatus nodeStatus) {
        super(NodeType.MESSAGE_CONSUME, nodeStatus);
        this.isDirect = "";
    }

    public final void setDirect(String str) {
        this.isDirect = str;
    }
}
