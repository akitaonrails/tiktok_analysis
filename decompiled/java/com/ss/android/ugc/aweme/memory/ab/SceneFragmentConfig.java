package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SceneFragmentConfig {
    public static final int $stable = 8;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fragmentList")
    public final List<String> fragmentList;

    public SceneFragmentConfig() {
        this(false, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneFragmentConfig)) {
            return false;
        }
        SceneFragmentConfig sceneFragmentConfig = (SceneFragmentConfig) obj;
        return this.enable == sceneFragmentConfig.enable && Intrinsics.LJFF(this.fragmentList, sceneFragmentConfig.fragmentList);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enable) * 31;
        List<String> list = this.fragmentList;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneFragmentConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", fragmentList=");
        sbLIZ.append(this.fragmentList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SceneFragmentConfig(boolean z, List<String> list) {
        this.enable = z;
        this.fragmentList = list;
    }
}
