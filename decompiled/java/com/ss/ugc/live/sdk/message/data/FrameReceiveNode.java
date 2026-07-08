package com.ss.ugc.live.sdk.message.data;

/* JADX INFO: loaded from: classes35.dex */
public final class FrameReceiveNode extends BaseNode {
    public final PayloadItem raw;

    public final PayloadItem getRaw() {
        return this.raw;
    }

    public FrameReceiveNode(NodeStatus nodeStatus, PayloadItem payloadItem) {
        super(NodeType.FRAME_RECEIVE, nodeStatus);
        this.raw = payloadItem;
    }
}
