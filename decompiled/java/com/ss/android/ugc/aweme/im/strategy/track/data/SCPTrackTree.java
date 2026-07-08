package com.ss.android.ugc.aweme.im.strategy.track.data;

import X.AbstractC909800Zmc;
import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SCPTrackTree extends AbstractC909800Zmc {

    @C09CT("result")
    public List<? extends IBusinessConfig> result;

    @C09CT("root")
    public SCPTrackNode root;

    @C09CT("type")
    public Integer type;

    public SCPTrackTree() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SCPTrackTree)) {
            return false;
        }
        SCPTrackTree sCPTrackTree = (SCPTrackTree) obj;
        return Intrinsics.LJFF(this.root, sCPTrackTree.root) && Intrinsics.LJFF(this.result, sCPTrackTree.result) && Intrinsics.LJFF(this.type, sCPTrackTree.type);
    }

    public final int hashCode() {
        SCPTrackNode sCPTrackNode = this.root;
        int iHashCode = (sCPTrackNode == null ? 0 : sCPTrackNode.hashCode()) * 31;
        List<? extends IBusinessConfig> list = this.result;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SCPTrackTree(root=");
        sbLIZ.append(this.root);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SCPTrackTree(SCPTrackNode sCPTrackNode, List<? extends IBusinessConfig> list, Integer num) {
        this.root = sCPTrackNode;
        this.result = list;
        this.type = num;
    }
}
