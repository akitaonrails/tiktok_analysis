package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C012U;
import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EffectModelStrategy extends C012U {
    public final void LIZJ() {
        throw null;
    }

    public static class StrategyConfig {

        @C09CT("enable")
        public boolean enable;

        @C09CT("levels")
        public List<Object> levelList = new ArrayList();

        @C09CT("priority")
        public int priority;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StrategyConfig{enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", priority=");
            sbLIZ.append(this.priority);
            sbLIZ.append(", levels=");
            sbLIZ.append(this.levelList);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public StrategyConfig(String str, String str2) {
        }
    }
}
