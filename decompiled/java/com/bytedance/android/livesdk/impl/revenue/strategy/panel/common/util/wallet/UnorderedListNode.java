package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet;

import X.AbstractC1561390qjZ;
import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class UnorderedListNode extends AbstractC1561390qjZ {

    @C09CT("items")
    public final List<TextNode> items;

    @C09CT("type")
    public final ItemType type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnorderedListNode)) {
            return false;
        }
        UnorderedListNode unorderedListNode = (UnorderedListNode) obj;
        return Intrinsics.LJFF(this.items, unorderedListNode.items) && this.type == unorderedListNode.type;
    }

    public final int hashCode() {
        return (this.items.hashCode() * 31) + this.type.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnorderedListNode(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UnorderedListNode(List<TextNode> list, ItemType itemType) {
        this.items = list;
        this.type = itemType;
    }
}
