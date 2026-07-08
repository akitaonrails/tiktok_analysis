package com.ss.ugc.live.sdk.message.data;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class UncompressNode extends BaseNode {
    public String decodeType;
    public String detail;

    @Override // com.ss.ugc.live.sdk.message.data.BaseNode
    public JSONObject json() throws JSONException {
        JSONObject jSONObjectJson = super.json();
        jSONObjectJson.put("decodeType", this.decodeType);
        jSONObjectJson.put("detail", this.detail);
        return jSONObjectJson;
    }

    public final String getDecodeType() {
        return this.decodeType;
    }

    public final String getDetail() {
        return this.detail;
    }

    public UncompressNode(NodeStatus nodeStatus) {
        super(NodeType.FRAME_UNCOMPRESS, nodeStatus);
        this.decodeType = "";
        this.detail = "";
    }

    public final void setDecodeType(String str) {
        this.decodeType = str;
    }

    public final void setDetail(String str) {
        this.detail = str;
    }
}
