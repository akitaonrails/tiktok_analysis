package com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet;

import X.AbstractC1561390qjZ;
import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TextNode extends AbstractC1561390qjZ {

    @C09CT("className")
    public final String className;

    @C09CT("interpolations")
    public final Map<String, TextNode> interpolations;

    @C09CT("style")
    public final CSSProperties style;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final ItemType type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextNode)) {
            return false;
        }
        TextNode textNode = (TextNode) obj;
        return Intrinsics.LJFF(this.text, textNode.text) && this.type == textNode.type && Intrinsics.LJFF(this.className, textNode.className) && Intrinsics.LJFF(this.style, textNode.style) && Intrinsics.LJFF(this.interpolations, textNode.interpolations);
    }

    public final int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.className;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CSSProperties cSSProperties = this.style;
        int iHashCode3 = (iHashCode2 + (cSSProperties == null ? 0 : cSSProperties.hashCode())) * 31;
        Map<String, TextNode> map = this.interpolations;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextNode(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", className=");
        sbLIZ.append(this.className);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", interpolations=");
        sbLIZ.append(this.interpolations);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextNode(String str, ItemType itemType, String str2, CSSProperties cSSProperties, Map<String, TextNode> map) {
        this.text = str;
        this.type = itemType;
        this.className = str2;
        this.style = cSSProperties;
        this.interpolations = map;
    }
}
