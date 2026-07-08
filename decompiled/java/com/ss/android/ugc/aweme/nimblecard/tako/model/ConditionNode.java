package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ConditionNode {

    @C09CT("expression")
    public final String expression;

    @C09CT("node")
    public final TemplateData node;

    public ConditionNode() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConditionNode)) {
            return false;
        }
        ConditionNode conditionNode = (ConditionNode) obj;
        return Intrinsics.LJFF(this.expression, conditionNode.expression) && Intrinsics.LJFF(this.node, conditionNode.node);
    }

    public final int hashCode() {
        String str = this.expression;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TemplateData templateData = this.node;
        return iHashCode + (templateData != null ? templateData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConditionNode(expression=");
        sbLIZ.append(this.expression);
        sbLIZ.append(", node=");
        sbLIZ.append(this.node);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConditionNode(String str, TemplateData templateData) {
        this.expression = str;
        this.node = templateData;
    }
}
