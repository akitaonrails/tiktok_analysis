package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class SamiChorusRes {

    @C09CT("chorus_segments")
    public final List<Segment> chorusSegments;

    @C09CT("frame_sec")
    public final double frameSec;

    @C09CT("raw_segments")
    public final List<Segment> rawSegments;

    @C09CT("res_dur_min")
    public final int restDurationMinS;

    @C09CT("thumbnail")
    public final List<Segment> thumbnail;

    @C09CT("thumbnail_limits")
    public final List<List<Double>> thumbnailLimits;

    @C09CT("thumbnails")
    public final List<Segment> thumbnails;

    public SamiChorusRes() {
        this(null, null, null, 0.0d, null, null, 0, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SamiChorusRes(List<Segment> list, List<Segment> list2, List<Segment> list3, double d, List<Segment> list4, List<? extends List<Double>> list5, int i) {
        this.thumbnail = list;
        this.thumbnails = list2;
        this.rawSegments = list3;
        this.frameSec = d;
        this.chorusSegments = list4;
        this.thumbnailLimits = list5;
        this.restDurationMinS = i;
    }

    public SamiChorusRes(List list, List list2, List list3, double d, List list4, List list5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, (i2 & 4) != 0 ? C13BV.INSTANCE : list3, (i2 & 8) != 0 ? 0.0d : d, (i2 & 16) != 0 ? C13BV.INSTANCE : list4, (i2 & 32) != 0 ? C13BV.INSTANCE : list5, (i2 & 64) != 0 ? 0 : i);
    }
}
