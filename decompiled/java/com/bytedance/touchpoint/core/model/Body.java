package com.bytedance.touchpoint.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Body {

    @C09CT("finished")
    public final Boolean finished;

    @C09CT("height")
    public final Integer height;

    @C09CT("last_time")
    public final String lastTime;

    @C09CT("next_time")
    public final String nextTime;

    @C09CT("num")
    public final Integer num;

    @C09CT("points")
    public final Integer points;

    @C09CT("pointsBonus")
    public final Integer pointsBonus;

    @C09CT("width")
    public final Integer width;

    public Body(Boolean bool, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.finished = bool;
        this.height = num;
        this.lastTime = str;
        this.nextTime = str2;
        this.num = num2;
        this.points = num3;
        this.pointsBonus = num4;
        this.width = num5;
    }
}
