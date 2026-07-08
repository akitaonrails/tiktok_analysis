package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PublisherPointsDetail {

    @C09CT("point_details")
    public List<IndicatorPointDetail> pointDetails = new ArrayList();

    @C09CT("threshold_points")
    public long thresholdPoints;

    @C09CT("total_points")
    public long totalPoints;
}
