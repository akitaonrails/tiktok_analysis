package com.ss.ugc.live.sdk.message.data;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class NodeType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ NodeType[] $VALUES;
    public final String key;
    public static final NodeType FRAME_RECEIVE = new NodeType("FRAME_RECEIVE", 0, "frame");
    public static final NodeType FRAME_UNCOMPRESS = new NodeType("FRAME_UNCOMPRESS", 1, "uncompress");
    public static final NodeType MESSAGE_DECODE = new NodeType("MESSAGE_DECODE", 2, "decode");
    public static final NodeType MESSAGE_ENQUEUE = new NodeType("MESSAGE_ENQUEUE", 3, "enqueue");
    public static final NodeType MESSAGE_DEQUEUE = new NodeType("MESSAGE_DEQUEUE", 4, "dequeue");
    public static final NodeType MESSAGE_DUPLICATE = new NodeType("MESSAGE_DUPLICATE", 5, "duplicate");
    public static final NodeType MESSAGE_CONSUME = new NodeType("MESSAGE_CONSUME", 6, "consume");
    public static final NodeType MESSAGE_TRACKER = new NodeType("MESSAGE_TRACKER", 7, "tracker");

    public static final /* synthetic */ NodeType[] $values() {
        return new NodeType[]{FRAME_RECEIVE, FRAME_UNCOMPRESS, MESSAGE_DECODE, MESSAGE_ENQUEUE, MESSAGE_DEQUEUE, MESSAGE_DUPLICATE, MESSAGE_CONSUME, MESSAGE_TRACKER};
    }

    public static InterfaceC2044707zh<NodeType> getEntries() {
        return $ENTRIES;
    }

    static {
        NodeType[] nodeTypeArr$values = $values();
        $VALUES = nodeTypeArr$values;
        $ENTRIES = new C2254308sP(nodeTypeArr$values);
    }

    public static NodeType[] values() {
        return (NodeType[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public static NodeType valueOf(String str) {
        return (NodeType) C08FF.LIZ(NodeType.class, str);
    }

    public NodeType(String str, int i, String str2) {
        this.key = str2;
    }
}
