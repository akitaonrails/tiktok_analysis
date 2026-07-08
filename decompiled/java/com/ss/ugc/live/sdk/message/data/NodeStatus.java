package com.ss.ugc.live.sdk.message.data;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
public final class NodeStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ NodeStatus[] $VALUES;
    public final int value;
    public static final NodeStatus SUCCESS = new NodeStatus("SUCCESS", 0, 0);
    public static final NodeStatus ERROR = new NodeStatus("ERROR", 1, 1);

    public static final /* synthetic */ NodeStatus[] $values() {
        return new NodeStatus[]{SUCCESS, ERROR};
    }

    public static InterfaceC2044707zh<NodeStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        NodeStatus[] nodeStatusArr$values = $values();
        $VALUES = nodeStatusArr$values;
        $ENTRIES = new C2254308sP(nodeStatusArr$values);
    }

    public static NodeStatus[] values() {
        return (NodeStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static NodeStatus valueOf(String str) {
        return (NodeStatus) C08FF.LIZ(NodeStatus.class, str);
    }

    public NodeStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
