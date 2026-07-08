package com.ss.android.ugc.aweme.shortvideo.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SpeedConfig {
    public static final int $stable = 8;
    public final List<Point> points;
    public final int repeat_duration;

    public SpeedConfig() {
        this(new ArrayList(), 0);
    }

    public SpeedConfig(List<Point> list, int i) {
        this.points = list;
        this.repeat_duration = i;
    }
}
