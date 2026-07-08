package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SceneConfig {

    @C09CT("allow_list")
    public final Set<String> allowList;

    @C09CT("block_list")
    public final Set<String> blockList;

    @C09CT("is_collect_stack")
    public final boolean isCollectStack;

    @C09CT("name")
    public final String name;

    @C09CT("sample_rate")
    public final double sampleRate;

    @C09CT("targets")
    public final Set<Integer> targets;

    public SceneConfig() {
        this(null, 0.0d, null, null, null, false, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneConfig)) {
            return false;
        }
        SceneConfig sceneConfig = (SceneConfig) obj;
        return Intrinsics.LJFF(this.name, sceneConfig.name) && Double.compare(this.sampleRate, sceneConfig.sampleRate) == 0 && Intrinsics.LJFF(this.targets, sceneConfig.targets) && Intrinsics.LJFF(this.blockList, sceneConfig.blockList) && Intrinsics.LJFF(this.allowList, sceneConfig.allowList) && this.isCollectStack == sceneConfig.isCollectStack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public final int hashCode() {
        int iHashCode = ((((((((this.name.hashCode() * 31) + C786410Ut5.X2(this.sampleRate)) * 31) + this.targets.hashCode()) * 31) + this.blockList.hashCode()) * 31) + this.allowList.hashCode()) * 31;
        boolean z = this.isCollectStack;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", sampleRate=");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append(", targets=");
        sbLIZ.append(this.targets);
        sbLIZ.append(", blockList=");
        sbLIZ.append(this.blockList);
        sbLIZ.append(", allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(", isCollectStack=");
        sbLIZ.append(this.isCollectStack);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SceneConfig(String str, double d, Set<Integer> set, Set<String> set2, Set<String> set3, boolean z) {
        this.name = str;
        this.sampleRate = d;
        this.targets = set;
        this.blockList = set2;
        this.allowList = set3;
        this.isCollectStack = z;
    }

    public SceneConfig(String str, double d, Set set, Set set2, Set set3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.001d : d, (i & 4) != 0 ? C08CX.INSTANCE : set, (i & 8) != 0 ? C08CX.INSTANCE : set2, (i & 16) != 0 ? C08CX.INSTANCE : set3, (i & 32) != 0 ? false : z);
    }
}
