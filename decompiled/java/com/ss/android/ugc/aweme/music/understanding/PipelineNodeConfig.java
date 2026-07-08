package com.ss.android.ugc.aweme.music.understanding;

import X.C13BV;
import X.C1D82;
import X.C1D8B;
import X.C2188811AlT;
import X.C556270Lrl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PipelineNodeConfig {
    public final Function1<C556270Lrl, Unit> builderBlock;
    public final List<NodeTag> dependsOn;
    public final Function1<C1D82, Unit> nodeBlock;
    public final String nodeTag;
    public final Function0<C1D8B> taskFactory;

    public int hashCode() {
        int iM286hashCodeimpl = ((((NodeTag.m286hashCodeimpl(this.nodeTag) * 31) + this.taskFactory.hashCode()) * 31) + this.dependsOn.hashCode()) * 31;
        Function1<C556270Lrl, Unit> function1 = this.builderBlock;
        int iHashCode = (iM286hashCodeimpl + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C1D82, Unit> function12 = this.nodeBlock;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipelineNodeConfig(nodeTag=");
        sbLIZ.append((Object) NodeTag.m287toStringimpl(this.nodeTag));
        sbLIZ.append(", taskFactory=");
        sbLIZ.append(this.taskFactory);
        sbLIZ.append(", dependsOn=");
        sbLIZ.append(this.dependsOn);
        sbLIZ.append(", builderBlock=");
        sbLIZ.append(this.builderBlock);
        sbLIZ.append(", nodeBlock=");
        sbLIZ.append(this.nodeBlock);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Function1<C556270Lrl, Unit> getBuilderBlock() {
        return this.builderBlock;
    }

    public final List<NodeTag> getDependsOn() {
        return this.dependsOn;
    }

    public final Function1<C1D82, Unit> getNodeBlock() {
        return this.nodeBlock;
    }

    /* JADX INFO: renamed from: getNodeTag-q0GeycQ, reason: not valid java name */
    public final String m290getNodeTagq0GeycQ() {
        return this.nodeTag;
    }

    public final Function0<C1D8B> getTaskFactory() {
        return this.taskFactory;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipelineNodeConfig)) {
            return false;
        }
        PipelineNodeConfig pipelineNodeConfig = (PipelineNodeConfig) obj;
        if (Intrinsics.LJFF(this.nodeTag, pipelineNodeConfig.nodeTag) && Intrinsics.LJFF(this.taskFactory, pipelineNodeConfig.taskFactory) && Intrinsics.LJFF(this.dependsOn, pipelineNodeConfig.dependsOn) && Intrinsics.LJFF(this.builderBlock, pipelineNodeConfig.builderBlock) && Intrinsics.LJFF(this.nodeBlock, pipelineNodeConfig.nodeBlock)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PipelineNodeConfig(String str, Function0<? extends C1D8B> function0, List<NodeTag> list, Function1<? super C556270Lrl, Unit> function1, Function1<? super C1D82, Unit> function12) {
        this.nodeTag = str;
        this.taskFactory = function0;
        this.dependsOn = list;
        this.builderBlock = function1;
        this.nodeBlock = function12;
    }

    /* JADX INFO: renamed from: copy-uni_rFM, reason: not valid java name */
    public final PipelineNodeConfig m289copyuni_rFM(String str, Function0<? extends C1D8B> function0, List<NodeTag> list, Function1<? super C556270Lrl, Unit> function1, Function1<? super C1D82, Unit> function12) {
        return new PipelineNodeConfig(str, function0, list, function1, function12);
    }

    public PipelineNodeConfig(String str, Function0 function0, List list, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? null : function1, (i & 16) == 0 ? function12 : null);
    }
}
