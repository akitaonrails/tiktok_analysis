package com.ss.android.ugc.aweme.wavepublish.utils.mapper;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PublishProgressMapperConfig {

    @C09CT("fps")
    public final int fps;

    @C09CT("name")
    public final String name;

    @C09CT("range")
    public final List<Double> range;

    @C09CT("strategies")
    public final List<StrategyConfig> strategies;

    public PublishProgressMapperConfig() {
        this(null, null, 0, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishProgressMapperConfig)) {
            return false;
        }
        PublishProgressMapperConfig publishProgressMapperConfig = (PublishProgressMapperConfig) obj;
        return Intrinsics.LJFF(this.name, publishProgressMapperConfig.name) && Intrinsics.LJFF(this.range, publishProgressMapperConfig.range) && this.fps == publishProgressMapperConfig.fps && Intrinsics.LJFF(this.strategies, publishProgressMapperConfig.strategies);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.range.hashCode()) * 31) + this.fps) * 31) + this.strategies.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishProgressMapperConfig(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", range=");
        sbLIZ.append(this.range);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", strategies=");
        sbLIZ.append(this.strategies);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getEnabled() {
        return this.fps > 0 && (this.strategies.isEmpty() ^ true);
    }

    public final Map<String, Double> getParams() {
        Map<String, Double> map;
        StrategyConfig strategyConfig = (StrategyConfig) C13LP.LJJJLL(this.strategies);
        return (strategyConfig == null || (map = strategyConfig.params) == null) ? C2097608Jq.LJ() : map;
    }

    public final double getRangeEnd() {
        List<Double> list = this.range;
        return C13LZ.LIZJ(((Number) (1 < list.size() ? ListProtector.get(list, 1) : Double.valueOf(0.965d))).doubleValue(), getRangeStart(), 1.0d);
    }

    public final double getRangeStart() {
        List<Double> list = this.range;
        return C13LZ.LIZJ(((Number) (list.size() > 0 ? ListProtector.get(list, 0) : Double.valueOf(0.0d))).doubleValue(), 0.0d, 1.0d);
    }

    public PublishProgressMapperConfig(String str, List<Double> list, int i, List<StrategyConfig> list2) {
        this.name = str;
        this.range = list;
        this.fps = i;
        this.strategies = list2;
    }

    public PublishProgressMapperConfig(String str, List list, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C1697810uHb.LJIIJJI(Double.valueOf(0.0d), Double.valueOf(0.965d)) : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
