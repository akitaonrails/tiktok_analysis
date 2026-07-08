package com.bytedance.ies.cutsame.source.model;

import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SpeedConfig {
    public final List<Point> points;
    public final int repeat_duration;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeedConfig(points=");
        sbLIZ.append(this.points);
        sbLIZ.append(", repeat_duration=");
        sbLIZ.append(this.repeat_duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpeedConfig() {
        this(new ArrayList(), 0);
    }

    public SpeedConfig(List<Point> list, int i) {
        this.points = list;
        this.repeat_duration = i;
    }
}
